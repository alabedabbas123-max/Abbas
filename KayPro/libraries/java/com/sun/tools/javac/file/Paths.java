package com.sun.tools.javac.file;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Options;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;
import javax.tools.JavaFileManager;
import javax.tools.StandardLocation;

public class Paths {
    protected static final Context.C0723Key<Paths> pathsKey = new Context.C0723Key<>();
    private Path classSearchPath;
    private FSInfo fsInfo;
    private Lint lint;

    private Log f397log;
    private Options options;
    private Path otherSearchPath;
    private Map<JavaFileManager.Location, Path> pathsForLocation;
    private Path sourceSearchPath;
    private boolean warn;
    private boolean inited = false;
    private File bootClassPathRtJar = null;

    protected Paths(Context context) {
        context.m504put(pathsKey, this);
        this.pathsForLocation = new HashMap(16);
        setContext(context);
    }

    public static Paths instance(Context context) {
        Paths instance = (Paths) context.m501get(pathsKey);
        if (instance == null) {
            return new Paths(context);
        }
        return instance;
    }

    public static Iterable<File> getPathEntries(String path) {
        return getPathEntries(path, null);
    }

    public static Iterable<File> getPathEntries(String path, File emptyPathDefault) {
        ListBuffer<File> entries = new ListBuffer<>();
        int start = 0;
        while (start <= path.length()) {
            int sep = path.indexOf(File.pathSeparatorChar, start);
            if (sep == -1) {
                sep = path.length();
            }
            if (start < sep) {
                entries.add(new File(path.substring(start, sep)));
            } else if (emptyPathDefault != null) {
                entries.add(emptyPathDefault);
            }
            start = sep + 1;
        }
        return entries;
    }

    public static URL[] pathToURLs(String path) {
        StringTokenizer st = new StringTokenizer(path, File.pathSeparator);
        URL[] urls = new URL[st.countTokens()];
        int count = 0;
        while (st.hasMoreTokens()) {
            URL url = fileToURL(new File(st.nextToken()));
            if (url != null) {
                urls[count] = url;
                count++;
            }
        }
        if (urls.length != count) {
            URL[] tmp = new URL[count];
            System.arraycopy(urls, 0, tmp, 0, count);
            return tmp;
        }
        return urls;
    }

    private static URL fileToURL(File file) {
        String name;
        try {
            name = file.getCanonicalPath();
        } catch (IOException e) {
            name = file.getAbsolutePath();
        }
        String name2 = name.replace(File.separatorChar, '/');
        if (!name2.startsWith("/")) {
            name2 = "/" + name2;
        }
        if (!file.isFile()) {
            name2 = name2 + "/";
        }
        try {
            return new URL("file", "", name2);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(file.toString());
        }
    }

    void setContext(Context context) {
        this.f397log = Log.instance(context);
        this.options = Options.instance(context);
        this.lint = Lint.instance(context);
        this.fsInfo = FSInfo.instance(context);
    }

    Path getPathForLocation(JavaFileManager.Location location) {
        Path path = this.pathsForLocation.get(location);
        if (path == null) {
            setPathForLocation(location, null);
        }
        return this.pathsForLocation.get(location);
    }

    void setPathForLocation(JavaFileManager.Location location, Iterable<? extends File> path) {
        Path p;
        if (path == null) {
            if (location == StandardLocation.CLASS_PATH) {
                p = computeUserClassPath();
            } else if (location == StandardLocation.PLATFORM_CLASS_PATH) {
                p = computeBootClassPath();
            } else if (location == StandardLocation.ANNOTATION_PROCESSOR_PATH) {
                p = computeAnnotationProcessorPath();
            } else if (location == StandardLocation.SOURCE_PATH) {
                p = computeSourcePath();
            } else {
                p = null;
            }
        } else {
            p = new Path();
            for (File f : path) {
                p.addFile(f, this.warn);
            }
        }
        this.pathsForLocation.put(location, p);
    }

    protected void lazy() {
        if (!this.inited) {
            this.warn = this.lint.isEnabled(Lint.LintCategory.PATH);
            this.pathsForLocation.put(StandardLocation.PLATFORM_CLASS_PATH, computeBootClassPath());
            this.pathsForLocation.put(StandardLocation.CLASS_PATH, computeUserClassPath());
            this.pathsForLocation.put(StandardLocation.SOURCE_PATH, computeSourcePath());
            this.inited = true;
        }
    }

    private Path computeAndroidClasspath() {
        Map<String, String> envs = System.getenv();
        Path path = new Path();
        path.addFile(new File(envs.get("HOME") + "/system/android/android.jar"), true);
        path.addDirectory(new File(envs.get("HOME") + "/classes"), true);
        return path;
    }

    public Collection<File> bootClassPath() {
        lazy();
        return Collections.unmodifiableCollection(getPathForLocation(StandardLocation.PLATFORM_CLASS_PATH));
    }

    public Collection<File> userClassPath() {
        lazy();
        return Collections.unmodifiableCollection(getPathForLocation(StandardLocation.CLASS_PATH));
    }

    public Collection<File> sourcePath() {
        lazy();
        Path p = getPathForLocation(StandardLocation.SOURCE_PATH);
        if (p == null || p.size() == 0) {
            return null;
        }
        return Collections.unmodifiableCollection(p);
    }

    boolean isDefaultBootClassPathRtJar(File file) {
        return file.equals(this.bootClassPathRtJar);
    }

    private Path computeBootClassPath() {
        this.bootClassPathRtJar = null;
        Path path = new Path();
        Map<String, String> envs = System.getenv();
        String bootclasspath = envs.get("BOOTCLASSPATH");
        path.addFiles(bootclasspath);
        return path;
    }

    private Path computeUserClassPath() {
        Map<String, String> envs = System.getenv();
        String cp = this.options.m514get(OptionName.CLASSPATH);
        if (cp == null) {
            cp = envs.get("CLASSPATH");
        }
        if (cp == null) {
            cp = ".";
        }
        String vb = this.options.m514get(OptionName.VERBOSE);
        if (vb != null) {
            System.out.println("USER CLASS PATH : " + cp);
        }
        return new Path().expandJarClassPaths(true).emptyPathDefault(new File(".")).addFiles(cp);
    }

    private Path computeSourcePath() {
        String sourcePathArg = this.options.m514get(OptionName.SOURCEPATH);
        if (sourcePathArg == null) {
            sourcePathArg = ".";
        }
        String vb = this.options.m514get(OptionName.VERBOSE);
        if (vb != null) {
            System.out.println("SOURCE CLASS PATH : " + sourcePathArg);
        }
        if (sourcePathArg == null) {
            return null;
        }
        return new Path().addFiles(sourcePathArg);
    }

    private Path computeAnnotationProcessorPath() {
        String processorPathArg = this.options.m514get(OptionName.PROCESSORPATH);
        if (processorPathArg == null) {
            return null;
        }
        return new Path().addFiles(processorPathArg);
    }

    public Collection<File> sourceSearchPath() {
        if (this.sourceSearchPath == null) {
            lazy();
            Path sourcePath = getPathForLocation(StandardLocation.SOURCE_PATH);
            Path userClassPath = getPathForLocation(StandardLocation.CLASS_PATH);
            this.sourceSearchPath = sourcePath != null ? sourcePath : userClassPath;
        }
        return Collections.unmodifiableCollection(this.sourceSearchPath);
    }

    public Collection<File> classSearchPath() {
        if (this.classSearchPath == null) {
            lazy();
            Path bootClassPath = getPathForLocation(StandardLocation.PLATFORM_CLASS_PATH);
            Path userClassPath = getPathForLocation(StandardLocation.CLASS_PATH);
            Path path = new Path();
            this.classSearchPath = path;
            path.addAll(bootClassPath);
            this.classSearchPath.addAll(userClassPath);
        }
        Path bootClassPath2 = this.classSearchPath;
        return Collections.unmodifiableCollection(bootClassPath2);
    }

    Collection<File> otherSearchPath() {
        if (this.otherSearchPath == null) {
            lazy();
            Path userClassPath = getPathForLocation(StandardLocation.CLASS_PATH);
            Path sourcePath = getPathForLocation(StandardLocation.SOURCE_PATH);
            if (sourcePath == null) {
                this.otherSearchPath = userClassPath;
            } else {
                Path path = new Path();
                this.otherSearchPath = path;
                path.addAll(userClassPath);
                this.otherSearchPath.addAll(sourcePath);
            }
        }
        return Collections.unmodifiableCollection(this.otherSearchPath);
    }

    public boolean isArchive(File file) {
        String n = file.getName().toLowerCase();
        return this.fsInfo.isFile(file) && (n.endsWith(".jar") || n.endsWith(".zip"));
    }

    public boolean isDefaultBootClassPath() {
        return false;
    }

    class Path extends LinkedHashSet<File> {
        private static final long serialVersionUID = 0;
        private boolean expandJarClassPaths = false;
        private Set<File> canonicalValues = new HashSet();
        private File emptyPathDefault = null;

        public Path() {
        }

        public Path expandJarClassPaths(boolean x) {
            this.expandJarClassPaths = x;
            return this;
        }

        public Path emptyPathDefault(File x) {
            this.emptyPathDefault = x;
            return this;
        }

        public Path addDirectories(String dirs, boolean warn) {
            if (dirs != null) {
                for (File dir : Paths.getPathEntries(dirs)) {
                    addDirectory(dir, warn);
                }
            }
            return this;
        }

        public Path addDirectories(String dirs) {
            return addDirectories(dirs, Paths.this.warn);
        }

        public void addDirectory(File dir, boolean warn) {
            if (!dir.isDirectory()) {
                if (warn) {
                    Paths.this.f397log.warning("dir.path.element.not.found", dir);
                    return;
                }
                return;
            }
            File[] files = dir.listFiles();
            if (files == null) {
                return;
            }
            for (File direntry : files) {
                if (Paths.this.isArchive(direntry)) {
                    addFile(direntry, warn);
                }
            }
        }

        public Path addFiles(String files, boolean warn) {
            if (files != null) {
                for (File file : Paths.getPathEntries(files, this.emptyPathDefault)) {
                    addFile(file, warn);
                }
            }
            return this;
        }

        public Path addFiles(String files) {
            return addFiles(files, Paths.this.warn);
        }

        public void addFile(File file, boolean warn) {
            File canonFile = Paths.this.fsInfo.getCanonicalFile(file);
            if (!contains(file) && !this.canonicalValues.contains(canonFile)) {
                if (Paths.this.fsInfo.exists(file)) {
                    if (Paths.this.fsInfo.isFile(file) && !Paths.this.isArchive(file)) {
                        try {
                            ZipFile z = new ZipFile(file);
                            z.close();
                            if (warn) {
                                Paths.this.f397log.warning("unexpected.archive.file", file);
                            }
                        } catch (IOException e) {
                            if (warn) {
                                Paths.this.f397log.warning("invalid.archive.file", file);
                                return;
                            }
                            return;
                        }
                    }
                } else if (warn) {
                    Paths.this.f397log.warning("path.element.not.found", file);
                }
                super.add(file);
                this.canonicalValues.add(canonFile);
                if (this.expandJarClassPaths && Paths.this.fsInfo.exists(file) && Paths.this.fsInfo.isFile(file)) {
                    addJarClassPath(file, warn);
                }
            }
        }

        private void addJarClassPath(File jarFile, boolean warn) {
            try {
                for (File f : Paths.this.fsInfo.getJarClassPath(jarFile)) {
                    addFile(f, warn);
                }
            } catch (IOException e) {
                Paths.this.f397log.error("error.reading.file", jarFile, JavacFileManager.getMessage(e));
            }
        }
    }
}
