package sun.misc;

import com.spartacusrex.spartacuside.helper.ParseUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.SocketPermission;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.CodeSigner;
import java.security.Permission;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import sun.security.util.SecurityConstants;

public class URLClassPath {
    static final String USER_AGENT_JAVA_VERSION = "UA-Java-Version";
    private URLStreamHandler jarHandler;
    HashMap lmap;
    ArrayList loaders;
    private ArrayList path;
    Stack urls;
    static final String JAVA_VERSION = "1.6";
    private static final boolean DEBUG = false;

    public URLClassPath(URL[] urls, URLStreamHandlerFactory factory) {
        this.path = new ArrayList();
        this.urls = new Stack();
        this.loaders = new ArrayList();
        this.lmap = new HashMap();
        for (URL url : urls) {
            this.path.add(url);
        }
        push(urls);
        if (factory != null) {
            this.jarHandler = factory.createURLStreamHandler("jar");
        }
    }

    public URLClassPath(URL[] urls) {
        this(urls, null);
    }

    public void addURL(URL url) {
        synchronized (this.urls) {
            if (this.path.contains(url)) {
                return;
            }
            this.urls.add(0, url);
            this.path.add(url);
        }
    }

    public URL[] getURLs() {
        URL[] urlArr;
        synchronized (this.urls) {
            urlArr = (URL[]) this.path.toArray(new URL[this.path.size()]);
        }
        return urlArr;
    }

    public URL findResource(String name, boolean check) {
        int i = 0;
        while (true) {
            Loader loader = getLoader(i);
            if (loader != null) {
                URL url = loader.findResource(name, check);
                if (url == null) {
                    i++;
                } else {
                    return url;
                }
            } else {
                return null;
            }
        }
    }

    public Resource getResource(String name, boolean check) {
        if (DEBUG) {
            System.err.println("URLClassPath.getResource(\"" + name + "\")");
        }
        int i = 0;
        while (true) {
            Loader loader = getLoader(i);
            if (loader != null) {
                Resource res = loader.getResource(name, check);
                if (res == null) {
                    i++;
                } else {
                    return res;
                }
            } else {
                return null;
            }
        }
    }

    public Enumeration findResources(final String name, final boolean check) {
        return new Enumeration() {
            private int index = 0;

            private URL f610url = null;

            private boolean next() {
                URL urlFindResource;
                if (this.f610url != null) {
                    return true;
                }
                do {
                    URLClassPath uRLClassPath = URLClassPath.this;
                    int i = this.index;
                    this.index = i + 1;
                    Loader loader = uRLClassPath.getLoader(i);
                    if (loader != null) {
                        urlFindResource = loader.findResource(name, check);
                        this.f610url = urlFindResource;
                    } else {
                        return false;
                    }
                } while (urlFindResource == null);
                return true;
            }

            @Override
            public boolean hasMoreElements() {
                return next();
            }

            @Override
            public Object nextElement() {
                if (!next()) {
                    throw new NoSuchElementException();
                }
                URL u = this.f610url;
                this.f610url = null;
                return u;
            }
        };
    }

    public Resource getResource(String name) {
        return getResource(name, true);
    }

    public Enumeration getResources(final String name, final boolean check) {
        return new Enumeration() {
            private int index = 0;

            private Resource f611res = null;

            private boolean next() {
                Resource resource;
                if (this.f611res != null) {
                    return true;
                }
                do {
                    URLClassPath uRLClassPath = URLClassPath.this;
                    int i = this.index;
                    this.index = i + 1;
                    Loader loader = uRLClassPath.getLoader(i);
                    if (loader != null) {
                        resource = loader.getResource(name, check);
                        this.f611res = resource;
                    } else {
                        return false;
                    }
                } while (resource == null);
                return true;
            }

            @Override
            public boolean hasMoreElements() {
                return next();
            }

            @Override
            public Object nextElement() {
                if (!next()) {
                    throw new NoSuchElementException();
                }
                Resource r = this.f611res;
                this.f611res = null;
                return r;
            }
        };
    }

    public Enumeration getResources(String name) {
        return getResources(name, true);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004a */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004b, code lost:
    
        r1 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Loader getLoader(int index) {
        URL url;
        while (this.loaders.size() < index + 1) {
            synchronized (this.urls) {
                if (this.urls.empty()) {
                    try {
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            throw th;
                        }
                    }
                }
                url = (URL) this.urls.pop();
            }
            if (!this.lmap.containsKey(url)) {
                try {
                    Loader loader = getLoader(url);
                    URL[] urls = loader.getClassPath();
                    if (urls != null) {
                        push(urls);
                    }
                    this.loaders.add(loader);
                    this.lmap.put(url, loader);
                } catch (IOException e) {
                }
            }
        }
        return (Loader) this.loaders.get(index);
    }

    private Loader getLoader(final URL url) throws IOException {
        try {
            return (Loader) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                @Override
                public Object run() throws IOException {
                    String file = url.getFile();
                    if (file != null && file.endsWith("/")) {
                        if ("file".equals(url.getProtocol())) {
                            return new FileLoader(url);
                        }
                        return new Loader(url);
                    }
                    return new JarLoader(url, URLClassPath.this.jarHandler, URLClassPath.this.lmap);
                }
            });
        } catch (PrivilegedActionException pae) {
            throw ((IOException) pae.getException());
        }
    }

    private void push(URL[] us) {
        synchronized (this.urls) {
            for (int i = us.length - 1; i >= 0; i--) {
                this.urls.push(us[i]);
            }
        }
    }

    public static URL[] pathToURLs(String path) {
        StringTokenizer st = new StringTokenizer(path, File.pathSeparator);
        URL[] urls = new URL[st.countTokens()];
        int count = 0;
        while (st.hasMoreTokens()) {
            File f = new File(st.nextToken());
            try {
                f = new File(f.getCanonicalPath());
            } catch (IOException e) {
            }
            int count2 = count + 1;
            try {
                urls[count] = ParseUtil.fileToEncodedURL(f);
            } catch (IOException e2) {
            }
            count = count2;
        }
        if (urls.length != count) {
            URL[] tmp = new URL[count];
            System.arraycopy(urls, 0, tmp, 0, count);
            return tmp;
        }
        return urls;
    }

    public URL checkURL(URL url) {
        try {
            check(url);
            return url;
        } catch (Exception e) {
            return null;
        }
    }

    static void check(URL url) throws IOException {
        URLConnection urlConnection;
        Permission perm;
        SecurityManager security = System.getSecurityManager();
        if (security != null && (perm = (urlConnection = url.openConnection()).getPermission()) != null) {
            try {
                security.checkPermission(perm);
            } catch (SecurityException se) {
                if ((perm instanceof FilePermission) && perm.getActions().indexOf("read") != -1) {
                    security.checkRead(perm.getName());
                    return;
                }
                if ((perm instanceof SocketPermission) && perm.getActions().indexOf(SecurityConstants.SOCKET_CONNECT_ACTION) != -1) {
                    URL locUrl = url;
                    if (urlConnection instanceof JarURLConnection) {
                        locUrl = ((JarURLConnection) urlConnection).getJarFileURL();
                    }
                    security.checkConnect(locUrl.getHost(), locUrl.getPort());
                    return;
                }
                throw se;
            }
        }
    }

    private static class Loader {
        private final URL base;

        Loader(URL url) {
            this.base = url;
        }

        URL getBaseURL() {
            return this.base;
        }

        URL findResource(String name, boolean check) {
            try {
                URL url = new URL(this.base, ParseUtil.encodePath(name, false));
                if (check) {
                    try {
                        URLClassPath.check(url);
                    } catch (Exception e) {
                        return null;
                    }
                }
                URLConnection uc = url.openConnection();
                if (uc instanceof HttpURLConnection) {
                    HttpURLConnection hconn = (HttpURLConnection) uc;
                    hconn.setRequestMethod("HEAD");
                    if (hconn.getResponseCode() >= 400) {
                        return null;
                    }
                } else {
                    InputStream is = url.openStream();
                    is.close();
                }
                return url;
            } catch (MalformedURLException e2) {
                throw new IllegalArgumentException("name");
            }
        }

        Resource getResource(final String name, boolean check) {
            try {
                final URL url = new URL(this.base, ParseUtil.encodePath(name, false));
                if (check) {
                    try {
                        URLClassPath.check(url);
                    } catch (Exception e) {
                        return null;
                    }
                }
                final URLConnection uc = url.openConnection();
                uc.getInputStream();
                return new Resource() {
                    @Override
                    public String getName() {
                        return name;
                    }

                    @Override
                    public URL getURL() {
                        return url;
                    }

                    @Override
                    public URL getCodeSourceURL() {
                        return Loader.this.base;
                    }

                    @Override
                    public InputStream getInputStream() throws IOException {
                        return uc.getInputStream();
                    }

                    @Override
                    public int getContentLength() throws IOException {
                        return uc.getContentLength();
                    }
                };
            } catch (MalformedURLException e2) {
                throw new IllegalArgumentException("name");
            }
        }

        Resource getResource(String name) {
            return getResource(name, true);
        }

        URL[] getClassPath() throws IOException {
            return null;
        }
    }

    static class JarLoader extends Loader {

        private URL f613csu;
        private URLStreamHandler handler;
        private JarIndex index;

        private JarFile f614jar;
        private HashMap lmap;
        private MetaIndex metaIndex;

        JarLoader(URL url, URLStreamHandler jarHandler, HashMap loaderMap) throws IOException {
            super(new URL("jar", "", -1, url + "!/", jarHandler));
            this.f613csu = url;
            this.handler = jarHandler;
            this.lmap = loaderMap;
            if (!isOptimizable(url)) {
                ensureOpen();
                return;
            }
            String fileName = url.getFile();
            if (fileName != null) {
                File f = new File(ParseUtil.decode(fileName));
                MetaIndex metaIndexForJar = MetaIndex.forJar(f);
                this.metaIndex = metaIndexForJar;
                if (metaIndexForJar != null && !f.exists()) {
                    this.metaIndex = null;
                }
            }
            if (this.metaIndex == null) {
                ensureOpen();
            }
        }

        JarFile getJarFile() {
            return this.f614jar;
        }

        private boolean isOptimizable(URL url) {
            return "file".equals(url.getProtocol());
        }

        private void ensureOpen() throws IOException {
            if (this.f614jar == null) {
                try {
                    AccessController.doPrivileged(new PrivilegedExceptionAction() {
                        @Override
                        public Object run() throws IOException {
                            if (URLClassPath.DEBUG) {
                                System.err.println("Opening " + JarLoader.this.f613csu);
                                Thread.dumpStack();
                            }
                            JarLoader jarLoader = JarLoader.this;
                            jarLoader.f614jar = jarLoader.getJarFile(jarLoader.f613csu);
                            JarLoader jarLoader2 = JarLoader.this;
                            jarLoader2.index = JarIndex.getJarIndex(jarLoader2.f614jar, JarLoader.this.metaIndex);
                            if (JarLoader.this.index != null) {
                                String[] jarfiles = JarLoader.this.index.getJarFiles();
                                for (String str : jarfiles) {
                                    try {
                                        URL jarURL = new URL(JarLoader.this.f613csu, str);
                                        if (!JarLoader.this.lmap.containsKey(jarURL)) {
                                            JarLoader.this.lmap.put(jarURL, null);
                                        }
                                    } catch (MalformedURLException e) {
                                    }
                                }
                            }
                            return null;
                        }
                    });
                } catch (PrivilegedActionException pae) {
                    throw ((IOException) pae.getException());
                }
            }
        }

        public JarFile getJarFile(URL url) throws IOException {
            if (isOptimizable(url)) {
                File p = new File(url.getPath());
                if (!p.exists()) {
                    throw new FileNotFoundException(p.getPath());
                }
                return new JarFile(p.getPath());
            }
            URLConnection uc = getBaseURL().openConnection();
            uc.setRequestProperty(URLClassPath.USER_AGENT_JAVA_VERSION, URLClassPath.JAVA_VERSION);
            return ((JarURLConnection) uc).getJarFile();
        }

        JarIndex getIndex() {
            try {
                ensureOpen();
                return this.index;
            } catch (IOException e) {
                throw ((InternalError) new InternalError().initCause(e));
            }
        }

        Resource checkResource(final String name, boolean check, final JarEntry entry) {
            try {
                final URL url = new URL(getBaseURL(), ParseUtil.encodePath(name, false));
                if (check) {
                    URLClassPath.check(url);
                }
                return new Resource() {
                    @Override
                    public String getName() {
                        return name;
                    }

                    @Override
                    public URL getURL() {
                        return url;
                    }

                    @Override
                    public URL getCodeSourceURL() {
                        return JarLoader.this.f613csu;
                    }

                    @Override
                    public InputStream getInputStream() throws IOException {
                        return JarLoader.this.f614jar.getInputStream(entry);
                    }

                    @Override
                    public int getContentLength() {
                        return (int) entry.getSize();
                    }

                    @Override
                    public Manifest getManifest() throws IOException {
                        return JarLoader.this.f614jar.getManifest();
                    }

                    @Override
                    public Certificate[] getCertificates() {
                        return entry.getCertificates();
                    }

                    @Override
                    public CodeSigner[] getCodeSigners() {
                        return entry.getCodeSigners();
                    }
                };
            } catch (MalformedURLException e) {
                return null;
            } catch (IOException e2) {
                return null;
            } catch (AccessControlException e3) {
                return null;
            }
        }

        boolean validIndex(String name) {
            String packageName = name;
            int pos = name.lastIndexOf("/");
            if (pos != -1) {
                packageName = name.substring(0, pos);
            }
            Enumeration<JarEntry> enumerationEntries = this.f614jar.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry entry = enumerationEntries.nextElement();
                String entryName = entry.getName();
                int pos2 = entryName.lastIndexOf("/");
                if (pos2 != -1) {
                    entryName = entryName.substring(0, pos2);
                }
                if (entryName.equals(packageName)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        URL findResource(String name, boolean check) {
            Resource rsc = getResource(name, check);
            if (rsc != null) {
                return rsc.getURL();
            }
            return null;
        }

        @Override
        Resource getResource(String name, boolean check) {
            MetaIndex metaIndex = this.metaIndex;
            if (metaIndex != null && !metaIndex.mayContain(name)) {
                return null;
            }
            try {
                ensureOpen();
                JarEntry entry = this.f614jar.getJarEntry(name);
                if (entry != null) {
                    return checkResource(name, check, entry);
                }
                if (this.index == null) {
                    return null;
                }
                HashSet visited = new HashSet();
                return getResource(name, check, visited);
            } catch (IOException e) {
                throw ((InternalError) new InternalError().initCause(e));
            }
        }

        Resource getResource(String name, boolean check, Set visited) {
            Resource res;
            boolean done = false;
            int count = 0;
            LinkedList linkedListM533get = this.index.m533get(name);
            LinkedList jarFilesList = linkedListM533get;
            if (linkedListM533get == null) {
                return null;
            }
            while (true) {
                Object[] jarFiles = jarFilesList.toArray();
                int size = jarFilesList.size();
                while (count < size) {
                    int count2 = count + 1;
                    String jarName = (String) jarFiles[count];
                    try {
                        final URL url = new URL(this.f613csu, jarName);
                        JarLoader jarLoader = (JarLoader) this.lmap.get(url);
                        JarLoader newLoader = jarLoader;
                        if (jarLoader != null) {
                            done = done;
                        } else {
                            newLoader = (JarLoader) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                                @Override
                                public Object run() throws IOException {
                                    return new JarLoader(url, JarLoader.this.handler, JarLoader.this.lmap);
                                }
                            });
                            JarIndex newIndex = newLoader.getIndex();
                            if (newIndex == null) {
                                done = done;
                            } else {
                                int pos = jarName.lastIndexOf("/");
                                try {
                                    newIndex.merge(this.index, pos == -1 ? null : jarName.substring(0, pos + 1));
                                } catch (MalformedURLException e) {
                                } catch (PrivilegedActionException e2) {
                                }
                            }
                            this.lmap.put(url, newLoader);
                        }
                        boolean visitedURL = !visited.add(url);
                        if (!visitedURL) {
                            try {
                                newLoader.ensureOpen();
                                JarEntry entry = newLoader.f614jar.getJarEntry(name);
                                if (entry != null) {
                                    return newLoader.checkResource(name, check, entry);
                                }
                                if (!newLoader.validIndex(name)) {
                                    throw new InvalidJarIndexException("Invalid index");
                                }
                            } catch (IOException e3) {
                                throw ((InternalError) new InternalError().initCause(e3));
                            }
                        }
                        if (!visitedURL && newLoader != this && newLoader.getIndex() != null && (res = newLoader.getResource(name, check, visited)) != null) {
                            return res;
                        }
                        count = count2;
                        done = done;
                    } catch (MalformedURLException e4) {
                        done = done;
                    } catch (PrivilegedActionException e5) {
                        done = done;
                    }
                }
                boolean done2 = done;
                jarFilesList = this.index.m533get(name);
                if (count >= jarFilesList.size()) {
                    return null;
                }
                done = done2;
            }
        }

        @Override
        URL[] getClassPath() throws IOException {
            Manifest man;
            Attributes attr;
            String value;
            if (this.index != null || this.metaIndex != null) {
                return null;
            }
            ensureOpen();
            parseExtensionsDependencies();
            if (!SharedSecrets.javaUtilJarAccess().jarFileHasClassPathAttribute(this.f614jar) || (man = this.f614jar.getManifest()) == null || (attr = man.getMainAttributes()) == null || (value = attr.getValue(Attributes.Name.CLASS_PATH)) == null) {
                return null;
            }
            return parseClassPath(this.f613csu, value);
        }

        private void parseExtensionsDependencies() throws IOException {
            ExtensionDependency.checkExtensionsDependencies(this.f614jar);
        }

        private URL[] parseClassPath(URL base, String value) throws MalformedURLException {
            StringTokenizer st = new StringTokenizer(value);
            URL[] urls = new URL[st.countTokens()];
            int i = 0;
            while (st.hasMoreTokens()) {
                String path = st.nextToken();
                urls[i] = new URL(base, path);
                i++;
            }
            return urls;
        }
    }

    private static class FileLoader extends Loader {

        private File f612dir;

        FileLoader(URL url) throws IOException {
            super(url);
            if (!"file".equals(url.getProtocol())) {
                throw new IllegalArgumentException("url");
            }
            String path = url.getFile().replace('/', File.separatorChar);
            this.f612dir = new File(ParseUtil.decode(path));
        }

        @Override
        URL findResource(String name, boolean check) {
            Resource rsc = getResource(name, check);
            if (rsc != null) {
                return rsc.getURL();
            }
            return null;
        }

        @Override
        Resource getResource(final String name, boolean check) {
            try {
                URL normalizedBase = new URL(getBaseURL(), ".");
                final URL url = new URL(getBaseURL(), ParseUtil.encodePath(name, false));
                if (!url.getFile().startsWith(normalizedBase.getFile())) {
                    return null;
                }
                if (check) {
                    URLClassPath.check(url);
                }
                final File file = new File(this.f612dir, name.replace('/', File.separatorChar));
                if (!file.exists()) {
                    return null;
                }
                return new Resource() {
                    @Override
                    public String getName() {
                        return name;
                    }

                    @Override
                    public URL getURL() {
                        return url;
                    }

                    @Override
                    public URL getCodeSourceURL() {
                        return FileLoader.this.getBaseURL();
                    }

                    @Override
                    public InputStream getInputStream() throws IOException {
                        return new FileInputStream(file);
                    }

                    @Override
                    public int getContentLength() throws IOException {
                        return (int) file.length();
                    }
                };
            } catch (Exception e) {
                return null;
            }
        }
    }
}
