package sun.misc;

import com.spartacusrex.spartacuside.helper.ParseUtil;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class Launcher {
    private static URLStreamHandler fileHandler;
    private ClassLoader loader;
    private static URLStreamHandlerFactory factory = new Factory();
    private static Launcher launcher = new Launcher();

    public static Launcher getLauncher() {
        return launcher;
    }

    public Launcher() {
        try {
            ClassLoader extcl = ExtClassLoader.getExtClassLoader();
            try {
                this.loader = AppClassLoader.getAppClassLoader(extcl);
                Thread.currentThread().setContextClassLoader(this.loader);
                String s = System.getProperty("java.security.manager");
                if (s != null) {
                    SecurityManager sm = null;
                    if ("".equals(s) || "default".equals(s)) {
                        sm = new SecurityManager();
                    } else {
                        try {
                            sm = (SecurityManager) this.loader.loadClass(s).newInstance();
                        } catch (ClassCastException e) {
                        } catch (ClassNotFoundException e2) {
                        } catch (IllegalAccessException e3) {
                        } catch (InstantiationException e4) {
                        }
                    }
                    if (sm != null) {
                        System.setSecurityManager(sm);
                        return;
                    }
                    throw new InternalError("Could not create SecurityManager: " + s);
                }
            } catch (IOException e5) {
                throw new InternalError("Could not create application class loader");
            }
        } catch (IOException e6) {
            throw new InternalError("Could not create extension class loader");
        }
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    static class ExtClassLoader extends URLClassLoader {
        private File[] dirs;

        public static ExtClassLoader getExtClassLoader() throws IOException {
            final File[] dirs = getExtDirs();
            try {
                return (ExtClassLoader) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                    @Override
                    public Object run() throws IOException {
                        int len = dirs.length;
                        for (int i = 0; i < len; i++) {
                            MetaIndex.registerDirectory(dirs[i]);
                        }
                        return new ExtClassLoader(dirs);
                    }
                });
            } catch (PrivilegedActionException e) {
                throw ((IOException) e.getException());
            }
        }

        void addExtURL(URL url) {
            super.addURL(url);
        }

        public ExtClassLoader(File[] dirs) throws IOException {
            super(getExtURLs(dirs), null, Launcher.factory);
            this.dirs = dirs;
        }

        private static File[] getExtDirs() {
            String s = System.getProperty("java.ext.dirs");
            if (s != null) {
                StringTokenizer st = new StringTokenizer(s, File.pathSeparator);
                int count = st.countTokens();
                File[] dirs = new File[count];
                for (int i = 0; i < count; i++) {
                    dirs[i] = new File(st.nextToken());
                }
                return dirs;
            }
            return new File[0];
        }

        private static URL[] getExtURLs(File[] dirs) throws IOException {
            Vector urls = new Vector();
            for (int i = 0; i < dirs.length; i++) {
                String[] files = dirs[i].list();
                if (files != null) {
                    for (int j = 0; j < files.length; j++) {
                        if (!files[j].equals("meta-index")) {
                            File f = new File(dirs[i], files[j]);
                            urls.add(Launcher.getFileURL(f));
                        }
                    }
                }
            }
            int i2 = urls.size();
            URL[] ua = new URL[i2];
            urls.copyInto(ua);
            return ua;
        }

        @Override
        public String findLibrary(String name) {
            String name2 = System.mapLibraryName(name);
            for (int i = 0; i < this.dirs.length; i++) {
                String arch = System.getProperty("os.arch");
                if (arch != null) {
                    File file = new File(new File(this.dirs[i], arch), name2);
                    if (file.exists()) {
                        return file.getAbsolutePath();
                    }
                }
                File file2 = new File(this.dirs[i], name2);
                if (file2.exists()) {
                    return file2.getAbsolutePath();
                }
            }
            return null;
        }

        private static AccessControlContext getContext(File[] dirs) throws IOException {
            Launcher2 perms = new Launcher2(dirs);
            ProtectionDomain domain = new ProtectionDomain(new CodeSource(perms.getCodeBase(), (Certificate[]) null), perms);
            AccessControlContext acc = new AccessControlContext(new ProtectionDomain[]{domain});
            return acc;
        }
    }

    static class AppClassLoader extends URLClassLoader {
        static final boolean $assertionsDisabled = false;

        public static ClassLoader getAppClassLoader(final ClassLoader extcl) throws IOException {
            final String s = System.getProperty("java.class.path");
            final File[] path = s == null ? new File[0] : Launcher.getClassPath(s);
            return (AppClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
                @Override
                public Object run() {
                    URL[] urls = s == null ? new URL[0] : Launcher.pathToURLs(path);
                    return new AppClassLoader(urls, extcl);
                }
            });
        }

        AppClassLoader(URL[] urls, ClassLoader parent) {
            super(urls, parent, Launcher.factory);
        }

        @Override
        public synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
            SecurityManager sm;
            int i = name.lastIndexOf(46);
            if (i != -1 && (sm = System.getSecurityManager()) != null) {
                sm.checkPackageAccess(name.substring(0, i));
            }
            return super.loadClass(name, resolve);
        }

        @Override
        protected PermissionCollection getPermissions(CodeSource codesource) {
            PermissionCollection perms = super.getPermissions(codesource);
            perms.add(new RuntimePermission("exitVM"));
            return perms;
        }

        private void appendToClassPathForInstrumentation(String path) {
            super.addURL(Launcher.getFileURL(new File(path)));
        }

        private static AccessControlContext getContext(File[] cp) throws MalformedURLException {
            Launcher2 perms = new Launcher2(cp);
            ProtectionDomain domain = new ProtectionDomain(new CodeSource(perms.getCodeBase(), (Certificate[]) null), perms);
            AccessControlContext acc = new AccessControlContext(new ProtectionDomain[]{domain});
            return acc;
        }
    }

    public static URLClassPath getBootstrapClassPath() {
        final String prop = "/";
        URL[] urls = (URL[]) AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                File[] classPath = Launcher.getClassPath(prop);
                Set seenDirs = new HashSet();
                for (File curEntry : classPath) {
                    if (!curEntry.isDirectory()) {
                        curEntry = curEntry.getParentFile();
                    }
                    if (curEntry != null && seenDirs.add(curEntry)) {
                        MetaIndex.registerDirectory(curEntry);
                    }
                }
                return Launcher.pathToURLs(classPath);
            }
        });
        return new URLClassPath(urls, factory);
    }

    public static URL[] pathToURLs(File[] path) {
        URL[] urls = new URL[path.length];
        for (int i = 0; i < path.length; i++) {
            urls[i] = getFileURL(path[i]);
        }
        return urls;
    }

    public static File[] getClassPath(String cp) {
        int count;
        int count2;
        if (cp != null) {
            int count3 = 0;
            int maxCount = 1;
            int lastPos = 0;
            while (true) {
                int pos = cp.indexOf(File.pathSeparator, lastPos);
                if (pos == -1) {
                    break;
                }
                maxCount++;
                lastPos = pos + 1;
            }
            File[] path = new File[maxCount];
            int lastPos2 = 0;
            while (true) {
                int pos2 = cp.indexOf(File.pathSeparator, lastPos2);
                if (pos2 == -1) {
                    break;
                }
                if (pos2 - lastPos2 > 0) {
                    count2 = count3 + 1;
                    path[count3] = new File(cp.substring(lastPos2, pos2));
                } else {
                    count2 = count3 + 1;
                    path[count3] = new File(".");
                }
                count3 = count2;
                lastPos2 = pos2 + 1;
            }
            if (lastPos2 < cp.length()) {
                count = count3 + 1;
                path[count3] = new File(cp.substring(lastPos2));
            } else {
                count = count3 + 1;
                path[count3] = new File(".");
            }
            if (count != maxCount) {
                File[] tmp = new File[count];
                System.arraycopy(path, 0, tmp, 0, count);
                return tmp;
            }
            return path;
        }
        return new File[0];
    }

    static URL getFileURL(File file) throws IOException {
        try {
            file = file.getCanonicalFile();
        } catch (IOException e) {
        }
        try {
            return ParseUtil.fileToEncodedURL(file);
        } catch (MalformedURLException e2) {
            throw new InternalError();
        }
    }

    private static class Factory implements URLStreamHandlerFactory {
        private static String PREFIX = "sun.net.www.protocol";

        private Factory() {
        }

        @Override
        public URLStreamHandler createURLStreamHandler(String protocol) {
            String name = PREFIX + "." + protocol + ".Handler";
            try {
                return (URLStreamHandler) Class.forName(name).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new InternalError("could not load " + protocol + "system protocol handler");
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                throw new InternalError("could not load " + protocol + "system protocol handler");
            } catch (InstantiationException e3) {
                e3.printStackTrace();
                throw new InternalError("could not load " + protocol + "system protocol handler");
            }
        }
    }
}
