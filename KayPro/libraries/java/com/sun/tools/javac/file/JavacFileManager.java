package com.sun.tools.javac.file;

import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.util.BaseFileManager;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipFile;
import javax.lang.model.SourceVersion;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;

public class JavacFileManager extends BaseFileManager implements StandardJavaFileManager {
    private static final boolean fileSystemIsCaseSensitive;
    private static final String[] symbolFileLocation;
    private static final RelativePath.RelativeDirectory symbolFilePrefix;
    Map<File, Archive> archives;
    private File classOutDir;
    private boolean contextUseOptimizedZip;
    private String defaultEncodingName;
    private FSInfo fsInfo;
    protected boolean ignoreSymbolFile;
    protected boolean mmappedIO;
    private Paths paths;
    protected SortFiles sortFiles;
    private final Set<JavaFileObject.Kind> sourceOrClass;
    private File sourceOutDir;
    private final File uninited;
    private ZipFileIndexCache zipFileIndexCache;

    public interface Archive {
        void close() throws IOException;

        boolean contains(RelativePath relativePath);

        JavaFileObject getFileObject(RelativePath.RelativeDirectory relativeDirectory, String str);

        List<String> getFiles(RelativePath.RelativeDirectory relativeDirectory);

        Set<RelativePath.RelativeDirectory> getSubdirectories();
    }

    protected enum SortFiles implements Comparator<File> {
        FORWARD {
            @Override
            public int compare(File f1, File f2) {
                return f1.getName().compareTo(f2.getName());
            }
        },
        REVERSE {
            @Override
            public int compare(File f1, File f2) {
                return -f1.getName().compareTo(f2.getName());
            }
        }
    }

    static {
        fileSystemIsCaseSensitive = File.separatorChar == '/';
        symbolFileLocation = new String[]{"lib", "ct.sym"};
        symbolFilePrefix = new RelativePath.RelativeDirectory("META-INF/sym/rt.jar/");
    }

    public JavacFileManager(Context context, boolean register, Charset charset) {
        super(charset);
        this.uninited = new File("U N I N I T E D");
        this.sourceOrClass = EnumSet.of(JavaFileObject.Kind.SOURCE, JavaFileObject.Kind.CLASS);
        this.archives = new HashMap();
        File file = this.uninited;
        this.classOutDir = file;
        this.sourceOutDir = file;
        if (register) {
            context.m506put((Class<JavacFileManager>) JavaFileManager.class, this);
        }
        setContext(context);
    }

    public static char[] toArray(CharBuffer buffer) {
        if (buffer.hasArray()) {
            return ((CharBuffer) buffer.compact().flip()).array();
        }
        return buffer.toString().toCharArray();
    }

    public static void preRegister(Context context) {
        context.m505put(JavaFileManager.class, (Context.Factory) new Context.Factory<JavaFileManager>() {
            @Override
            public JavaFileManager make(Context c) {
                return new JavacFileManager(c, true, null);
            }
        });
    }

    private static boolean isValidName(String name) {
        for (String s : name.split("\\.", -1)) {
            if (!SourceVersion.isIdentifier(s)) {
                return false;
            }
        }
        return true;
    }

    private static void validateClassName(String className) {
        if (!isValidName(className)) {
            throw new IllegalArgumentException("Invalid class name: " + className);
        }
    }

    private static void validatePackageName(String packageName) {
        if (packageName.length() > 0 && !isValidName(packageName)) {
            throw new IllegalArgumentException("Invalid packageName name: " + packageName);
        }
    }

    public static void testName(String name, boolean isValidPackageName, boolean isValidClassName) {
        try {
            validatePackageName(name);
            if (!isValidPackageName) {
                throw new AssertionError("Invalid package name accepted: " + name);
            }
            printAscii("Valid package name: \"%s\"", name);
            try {
                validateClassName(name);
                if (!isValidClassName) {
                    throw new AssertionError("Invalid class name accepted: " + name);
                }
                printAscii("Valid class name: \"%s\"", name);
            } catch (IllegalArgumentException e) {
                if (isValidClassName) {
                    throw new AssertionError("Valid class name rejected: " + name);
                }
                printAscii("Invalid class name: \"%s\"", name);
            }
        } catch (IllegalArgumentException e2) {
            if (isValidPackageName) {
                throw new AssertionError("Valid package name rejected: " + name);
            }
            printAscii("Invalid package name: \"%s\"", name);
        }
    }

    private static void printAscii(String format, Object... args) {
        try {
            String message = new String(String.format(null, format, args).getBytes("US-ASCII"), "US-ASCII");
            System.out.println(message);
        } catch (UnsupportedEncodingException ex) {
            throw new AssertionError(ex);
        }
    }

    protected static boolean isRelativeUri(URI uri) {
        if (uri.isAbsolute()) {
            return false;
        }
        String path = uri.normalize().getPath();
        return (path.length() == 0 || !path.equals(uri.getPath()) || path.startsWith("/") || path.startsWith("./") || path.startsWith("../")) ? false : true;
    }

    protected static boolean isRelativeUri(String u) {
        try {
            return isRelativeUri(new URI(u));
        } catch (URISyntaxException e) {
            return false;
        }
    }

    public static String getRelativeName(File file) {
        if (!file.isAbsolute()) {
            String result = file.getPath().replace(File.separatorChar, '/');
            if (isRelativeUri(result)) {
                return result;
            }
        }
        throw new IllegalArgumentException("Invalid relative path: " + file);
    }

    public static String getMessage(IOException e) {
        String s = e.getLocalizedMessage();
        if (s != null) {
            return s;
        }
        String s2 = e.getMessage();
        if (s2 != null) {
            return s2;
        }
        return e.toString();
    }

    @Override
    public void setContext(Context context) {
        super.setContext(context);
        Paths paths = this.paths;
        if (paths == null) {
            this.paths = Paths.instance(context);
        } else {
            paths.setContext(context);
        }
        this.fsInfo = FSInfo.instance(context);
        boolean z = this.options.getBoolean("useOptimizedZip", true);
        this.contextUseOptimizedZip = z;
        if (z) {
            this.zipFileIndexCache = ZipFileIndexCache.getSharedInstance();
        }
        this.mmappedIO = this.options.isSet("mmappedIO");
        this.ignoreSymbolFile = this.options.isSet("ignore.symbol.file");
        String sf = this.options.m515get("sortFiles");
        if (sf != null) {
            this.sortFiles = sf.equals("reverse") ? SortFiles.REVERSE : SortFiles.FORWARD;
        }
    }

    @Override
    public boolean isDefaultBootClassPath() {
        return this.paths.isDefaultBootClassPath();
    }

    public JavaFileObject getFileForInput(String name) {
        return getRegularFile(new File(name));
    }

    public JavaFileObject getRegularFile(File file) {
        return new RegularFileObject(this, file);
    }

    public JavaFileObject getFileForOutput(String classname, JavaFileObject.Kind kind, JavaFileObject sibling) throws IOException {
        return getJavaFileForOutput(StandardLocation.CLASS_OUTPUT, classname, kind, sibling);
    }

    @Override
    public Iterable<? extends JavaFileObject> getJavaFileObjectsFromStrings(Iterable<String> names) {
        ListBuffer<File> files = new ListBuffer<>();
        for (String name : names) {
            files.append(new File((String) nullCheck(name)));
        }
        return getJavaFileObjectsFromFiles(files.toList());
    }

    @Override
    public Iterable<? extends JavaFileObject> getJavaFileObjects(String... names) {
        return getJavaFileObjectsFromStrings(Arrays.asList((Object[]) nullCheck(names)));
    }

    private void listDirectory(File directory, RelativePath.RelativeDirectory subdirectory, Set<JavaFileObject.Kind> fileKinds, boolean recurse, ListBuffer<JavaFileObject> resultList) {
        File[] files;
        File d = subdirectory.getFile(directory);
        if (!caseMapCheck(d, subdirectory) || (files = d.listFiles()) == null) {
            return;
        }
        SortFiles sortFiles = this.sortFiles;
        if (sortFiles != null) {
            Arrays.sort(files, sortFiles);
        }
        for (File f : files) {
            String fname = f.getName();
            if (f.isDirectory()) {
                if (recurse && SourceVersion.isIdentifier(fname)) {
                    listDirectory(directory, new RelativePath.RelativeDirectory(subdirectory, fname), fileKinds, recurse, resultList);
                }
            } else if (isValidFile(fname, fileKinds)) {
                JavaFileObject fe = new RegularFileObject(this, fname, new File(d, fname));
                resultList.append(fe);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void listArchive(Archive archive, RelativePath.RelativeDirectory subdirectory, Set<JavaFileObject.Kind> fileKinds, boolean recurse, ListBuffer<JavaFileObject> resultList) {
        List files = archive.getFiles(subdirectory);
        if (files != null) {
            while (!files.isEmpty()) {
                String file = (String) files.head;
                if (isValidFile(file, fileKinds)) {
                    resultList.append(archive.getFileObject(subdirectory, file));
                }
                files = files.tail;
            }
        }
        if (recurse) {
            for (RelativePath.RelativeDirectory s : archive.getSubdirectories()) {
                if (subdirectory.contains(s)) {
                    listArchive(archive, s, fileKinds, false, resultList);
                }
            }
        }
    }

    private void listContainer(File container, RelativePath.RelativeDirectory subdirectory, Set<JavaFileObject.Kind> fileKinds, boolean recurse, ListBuffer<JavaFileObject> resultList) {
        Archive archive;
        Archive archive2 = this.archives.get(container);
        if (archive2 != null) {
            archive = archive2;
        } else {
            if (this.fsInfo.isDirectory(container)) {
                listDirectory(container, subdirectory, fileKinds, recurse, resultList);
                return;
            }
            try {
                archive = openArchive(container);
            } catch (IOException ex) {
                this.f553log.error("error.reading.file", container, getMessage(ex));
                return;
            }
        }
        listArchive(archive, subdirectory, fileKinds, recurse, resultList);
    }

    private boolean isValidFile(String s, Set<JavaFileObject.Kind> fileKinds) {
        JavaFileObject.Kind kind = getKind(s);
        return fileKinds.contains(kind);
    }

    private boolean caseMapCheck(File f, RelativePath name) {
        if (fileSystemIsCaseSensitive) {
            return true;
        }
        try {
            String path = f.getCanonicalPath();
            char[] pcs = path.toCharArray();
            char[] ncs = name.path.toCharArray();
            int i = pcs.length - 1;
            int j = ncs.length - 1;
            while (i >= 0 && j >= 0) {
                while (i >= 0 && pcs[i] == File.separatorChar) {
                    i--;
                }
                while (j >= 0 && ncs[j] == '/') {
                    j--;
                }
                if (i >= 0 && j >= 0) {
                    if (pcs[i] != ncs[j]) {
                        return false;
                    }
                    i--;
                    j--;
                }
            }
            return j < 0;
        } catch (IOException e) {
            return false;
        }
    }

    protected Archive openArchive(File zipFilename) throws IOException {
        try {
            return openArchive(zipFilename, this.contextUseOptimizedZip);
        } catch (IOException ioe) {
            if (ioe instanceof ZipFileIndex.ZipFormatException) {
                return openArchive(zipFilename, false);
            }
            throw ioe;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[PHI: r5
      0x00cf: PHI (r5v2 'preindexCacheLocation' java.lang.String) = 
      (r5v1 'preindexCacheLocation' java.lang.String)
      (r5v1 'preindexCacheLocation' java.lang.String)
      (r5v1 'preindexCacheLocation' java.lang.String)
      (r5v1 'preindexCacheLocation' java.lang.String)
      (r5v3 'preindexCacheLocation' java.lang.String)
      (r5v3 'preindexCacheLocation' java.lang.String)
     binds: [B:19:0x0074, B:21:0x007a, B:29:0x00a1, B:31:0x00a7, B:33:0x00b0, B:35:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    private Archive openArchive(File zipFileName, boolean useOptimizedZip) throws IOException {
        Archive archive;
        boolean usePreindexedCache;
        String preindexCacheLocation;
        if (!this.ignoreSymbolFile && this.paths.isDefaultBootClassPathRtJar(zipFileName)) {
            File file = zipFileName.getParentFile().getParentFile();
            if (new File(file.getName()).equals(new File("jre"))) {
                file = file.getParentFile();
            }
            for (String name : symbolFileLocation) {
                file = new File(file, name);
            }
            if (file.exists()) {
                zipFileName = file;
            }
        }
        ZipFile zdir = null;
        try {
            if (!useOptimizedZip) {
                zdir = new ZipFile(zipFileName);
                usePreindexedCache = false;
                preindexCacheLocation = null;
            } else {
                boolean usePreindexedCache2 = this.options.isSet("usezipindex");
                String preindexCacheLocation2 = this.options.m515get("java.io.tmpdir");
                String optCacheLoc = this.options.m515get("cachezipindexdir");
                if (optCacheLoc != null && optCacheLoc.length() != 0) {
                    if (optCacheLoc.startsWith("\"")) {
                        if (optCacheLoc.endsWith("\"")) {
                            optCacheLoc = optCacheLoc.substring(1, optCacheLoc.length() - 1);
                        } else {
                            optCacheLoc = optCacheLoc.substring(1);
                        }
                    }
                    File cacheDir = new File(optCacheLoc);
                    if (cacheDir.exists() && cacheDir.canWrite()) {
                        preindexCacheLocation2 = optCacheLoc;
                        if (preindexCacheLocation2.endsWith("/") || preindexCacheLocation2.endsWith(File.separator)) {
                            usePreindexedCache = usePreindexedCache2;
                            preindexCacheLocation = preindexCacheLocation2;
                        } else {
                            usePreindexedCache = usePreindexedCache2;
                            preindexCacheLocation = preindexCacheLocation2 + File.separator;
                        }
                    } else {
                        usePreindexedCache = usePreindexedCache2;
                        preindexCacheLocation = preindexCacheLocation2;
                    }
                } else {
                    usePreindexedCache = usePreindexedCache2;
                    preindexCacheLocation = preindexCacheLocation2;
                }
            }
            if (zipFileName == zipFileName) {
                if (!useOptimizedZip) {
                    archive = new ZipArchive(this, zdir);
                } else {
                    archive = new ZipFileIndexArchive(this, this.zipFileIndexCache.getZipFileIndex(zipFileName, null, usePreindexedCache, preindexCacheLocation, this.options.isSet("writezipindexfiles")));
                }
            } else if (!useOptimizedZip) {
                archive = new SymbolArchive(this, zipFileName, zdir, symbolFilePrefix);
            } else {
                archive = new ZipFileIndexArchive(this, this.zipFileIndexCache.getZipFileIndex(zipFileName, symbolFilePrefix, usePreindexedCache, preindexCacheLocation, this.options.isSet("writezipindexfiles")));
            }
        } catch (ZipFileIndex.ZipFormatException zfe) {
            throw zfe;
        } catch (FileNotFoundException e) {
            archive = new MissingArchive(zipFileName);
        } catch (IOException ex) {
            if (zipFileName.exists()) {
                this.f553log.error("error.reading.file", zipFileName, getMessage(ex));
            }
            archive = new MissingArchive(zipFileName);
        }
        this.archives.put(zipFileName, archive);
        return archive;
    }

    @Override
    public void flush() {
        this.contentCache.clear();
    }

    @Override
    public void close() {
        Iterator<Archive> i = this.archives.values().iterator();
        while (i.hasNext()) {
            Archive a = i.next();
            i.remove();
            try {
                a.close();
            } catch (IOException e) {
            }
        }
    }

    private String getDefaultEncodingName() {
        if (this.defaultEncodingName == null) {
            this.defaultEncodingName = new OutputStreamWriter(new ByteArrayOutputStream()).getEncoding();
        }
        return this.defaultEncodingName;
    }

    @Override
    public ClassLoader getClassLoader(JavaFileManager.Location location) {
        nullCheck(location);
        Iterable<? extends File> path = getLocation(location);
        if (path == null) {
            return null;
        }
        ListBuffer<URL> lb = new ListBuffer<>();
        for (File f : path) {
            try {
                lb.append(f.toURI().toURL());
            } catch (MalformedURLException e) {
                throw new AssertionError(e);
            }
        }
        return getClassLoader((URL[]) lb.toArray(new URL[lb.size()]));
    }

    @Override
    public Iterable<JavaFileObject> list(JavaFileManager.Location location, String packageName, Set<JavaFileObject.Kind> kinds, boolean recurse) throws IOException {
        nullCheck(packageName);
        nullCheck((Collection) kinds);
        Iterable<? extends File> path = getLocation(location);
        if (path == null) {
            return List.m507nil();
        }
        RelativePath.RelativeDirectory subdirectory = RelativePath.RelativeDirectory.forPackage(packageName);
        ListBuffer<JavaFileObject> results = new ListBuffer<>();
        for (File directory : path) {
            listContainer(directory, subdirectory, kinds, recurse, results);
        }
        return results.toList();
    }

    @Override
    public String inferBinaryName(JavaFileManager.Location location, JavaFileObject file) {
        file.getClass();
        location.getClass();
        Iterable<? extends File> path = getLocation(location);
        if (path == null) {
            return null;
        }
        if (file instanceof BaseFileObject) {
            return ((BaseFileObject) file).inferBinaryName(path);
        }
        throw new IllegalArgumentException(file.getClass().getName());
    }

    @Override
    public boolean isSameFile(FileObject a, FileObject b) {
        nullCheck(a);
        nullCheck(b);
        if (!(a instanceof BaseFileObject)) {
            throw new IllegalArgumentException("Not supported: " + a);
        }
        if (!(b instanceof BaseFileObject)) {
            throw new IllegalArgumentException("Not supported: " + b);
        }
        return a.equals(b);
    }

    @Override
    public boolean hasLocation(JavaFileManager.Location location) {
        return getLocation(location) != null;
    }

    @Override
    public JavaFileObject getJavaFileForInput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind) throws IOException {
        nullCheck(location);
        nullCheck(className);
        nullCheck(kind);
        if (!this.sourceOrClass.contains(kind)) {
            throw new IllegalArgumentException("Invalid kind: " + kind);
        }
        return getFileForInput(location, RelativePath.RelativeFile.forClass(className, kind));
    }

    @Override
    public FileObject getFileForInput(JavaFileManager.Location location, String packageName, String relativeName) throws IOException {
        RelativePath.RelativeFile name;
        nullCheck(location);
        nullCheck(packageName);
        if (!isRelativeUri(relativeName)) {
            throw new IllegalArgumentException("Invalid relative name: " + relativeName);
        }
        if (packageName.length() == 0) {
            name = new RelativePath.RelativeFile(relativeName);
        } else {
            name = new RelativePath.RelativeFile(RelativePath.RelativeDirectory.forPackage(packageName), relativeName);
        }
        return getFileForInput(location, name);
    }

    private JavaFileObject getFileForInput(JavaFileManager.Location location, RelativePath.RelativeFile name) throws IOException {
        Iterable<? extends File> path = getLocation(location);
        if (path == null) {
            return null;
        }
        for (File dir : path) {
            Archive a = this.archives.get(dir);
            if (a == null) {
                if (this.fsInfo.isDirectory(dir)) {
                    File f = name.getFile(dir);
                    if (f.exists()) {
                        return new RegularFileObject(this, f);
                    }
                } else {
                    a = openArchive(dir);
                }
            }
            if (a.contains(name)) {
                return a.getFileObject(name.dirname(), name.basename());
            }
        }
        return null;
    }

    @Override
    public JavaFileObject getJavaFileForOutput(JavaFileManager.Location location, String className, JavaFileObject.Kind kind, FileObject sibling) throws IOException {
        nullCheck(location);
        nullCheck(className);
        nullCheck(kind);
        if (!this.sourceOrClass.contains(kind)) {
            throw new IllegalArgumentException("Invalid kind: " + kind);
        }
        return getFileForOutput(location, RelativePath.RelativeFile.forClass(className, kind), sibling);
    }

    @Override
    public FileObject getFileForOutput(JavaFileManager.Location location, String packageName, String relativeName, FileObject sibling) throws IOException {
        RelativePath.RelativeFile name;
        nullCheck(location);
        nullCheck(packageName);
        if (!isRelativeUri(relativeName)) {
            throw new IllegalArgumentException("Invalid relative name: " + relativeName);
        }
        if (packageName.length() == 0) {
            name = new RelativePath.RelativeFile(relativeName);
        } else {
            name = new RelativePath.RelativeFile(RelativePath.RelativeDirectory.forPackage(packageName), relativeName);
        }
        return getFileForOutput(location, name, sibling);
    }

    private JavaFileObject getFileForOutput(JavaFileManager.Location location, RelativePath.RelativeFile fileName, FileObject sibling) throws IOException {
        File dir;
        if (location == StandardLocation.CLASS_OUTPUT) {
            if (getClassOutDir() != null) {
                dir = getClassOutDir();
            } else {
                File siblingDir = null;
                if (sibling != null && (sibling instanceof RegularFileObject)) {
                    siblingDir = ((RegularFileObject) sibling).file.getParentFile();
                }
                return new RegularFileObject(this, new File(siblingDir, fileName.basename()));
            }
        } else if (location == StandardLocation.SOURCE_OUTPUT) {
            dir = getSourceOutDir() != null ? getSourceOutDir() : getClassOutDir();
        } else {
            Iterable<? extends File> path = this.paths.getPathForLocation(location);
            Iterator<? extends File> it = path.iterator();
            if (!it.hasNext()) {
                dir = null;
            } else {
                File f = it.next();
                dir = f;
            }
        }
        File file = fileName.getFile(dir);
        return new RegularFileObject(this, file);
    }

    @Override
    public Iterable<? extends JavaFileObject> getJavaFileObjectsFromFiles(Iterable<? extends File> files) {
        ArrayList<RegularFileObject> result;
        if (files instanceof Collection) {
            result = new ArrayList<>(((Collection) files).size());
        } else {
            result = new ArrayList<>();
        }
        for (File f : files) {
            result.add(new RegularFileObject(this, (File) nullCheck(f)));
        }
        return result;
    }

    @Override
    public Iterable<? extends JavaFileObject> getJavaFileObjects(File... files) {
        return getJavaFileObjectsFromFiles(Arrays.asList((Object[]) nullCheck(files)));
    }

    @Override
    public void setLocation(JavaFileManager.Location location, Iterable<? extends File> path) throws IOException {
        nullCheck(location);
        this.paths.lazy();
        File dir = location.isOutputLocation() ? getOutputDirectory(path) : null;
        if (location == StandardLocation.CLASS_OUTPUT) {
            this.classOutDir = getOutputLocation(dir, OptionName.D);
        } else if (location == StandardLocation.SOURCE_OUTPUT) {
            this.sourceOutDir = getOutputLocation(dir, OptionName.S);
        } else {
            this.paths.setPathForLocation(location, path);
        }
    }

    private File getOutputDirectory(Iterable<? extends File> path) throws IOException {
        if (path == null) {
            return null;
        }
        Iterator<? extends File> pathIter = path.iterator();
        if (!pathIter.hasNext()) {
            throw new IllegalArgumentException("empty path for directory");
        }
        File dir = pathIter.next();
        if (pathIter.hasNext()) {
            throw new IllegalArgumentException("path too long for directory");
        }
        if (!dir.exists()) {
            throw new FileNotFoundException(dir + ": does not exist");
        }
        if (!dir.isDirectory()) {
            throw new IOException(dir + ": not a directory");
        }
        return dir;
    }

    private File getOutputLocation(File dir, OptionName defaultOptionName) {
        if (dir != null) {
            return dir;
        }
        String arg = this.options.m514get(defaultOptionName);
        if (arg == null) {
            return null;
        }
        return new File(arg);
    }

    @Override
    public Iterable<? extends File> getLocation(JavaFileManager.Location location) {
        nullCheck(location);
        this.paths.lazy();
        if (location == StandardLocation.CLASS_OUTPUT) {
            if (getClassOutDir() == null) {
                return null;
            }
            return List.m508of(getClassOutDir());
        }
        if (location == StandardLocation.SOURCE_OUTPUT) {
            if (getSourceOutDir() == null) {
                return null;
            }
            return List.m508of(getSourceOutDir());
        }
        return this.paths.getPathForLocation(location);
    }

    private File getClassOutDir() {
        if (this.classOutDir == this.uninited) {
            this.classOutDir = getOutputLocation(null, OptionName.D);
        }
        return this.classOutDir;
    }

    private File getSourceOutDir() {
        if (this.sourceOutDir == this.uninited) {
            this.sourceOutDir = getOutputLocation(null, OptionName.S);
        }
        return this.sourceOutDir;
    }

    public class MissingArchive implements Archive {
        final File zipFileName;

        public MissingArchive(File name) {
            this.zipFileName = name;
        }

        @Override
        public boolean contains(RelativePath name) {
            return false;
        }

        @Override
        public void close() {
        }

        @Override
        public JavaFileObject getFileObject(RelativePath.RelativeDirectory subdirectory, String file) {
            return null;
        }

        @Override
        public List<String> getFiles(RelativePath.RelativeDirectory subdirectory) {
            return List.m507nil();
        }

        @Override
        public Set<RelativePath.RelativeDirectory> getSubdirectories() {
            return Collections.emptySet();
        }

        public String toString() {
            return "MissingArchive[" + this.zipFileName + "]";
        }
    }
}
