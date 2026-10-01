package javax.tools;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ToolProvider {
    private static final String loggerName = "javax.tools";
    private static final String propertyName = "sun.tools.ToolProvider";

    private ToolProvider() {
    }

    static <T> T trace(Level level, Object reason) {
        try {
            if (System.getProperty(propertyName) != null) {
                StackTraceElement[] st = Thread.currentThread().getStackTrace();
                String method = "???";
                String cls = ToolProvider.class.getName();
                if (st.length > 2) {
                    StackTraceElement frame = st[2];
                    method = String.format((Locale) null, "%s(%s:%s)", frame.getMethodName(), frame.getFileName(), Integer.valueOf(frame.getLineNumber()));
                    cls = frame.getClassName();
                }
                Logger logger = Logger.getLogger(loggerName);
                if (reason instanceof Throwable) {
                    logger.logp(level, cls, method, reason.getClass().getName(), (Throwable) reason);
                } else {
                    try {
                        logger.logp(level, cls, method, String.valueOf(reason));
                    } catch (SecurityException e) {
                        ex = e;
                        System.err.format((Locale) null, "%s: %s; %s%n", ToolProvider.class.getName(), reason, ex.getLocalizedMessage());
                    }
                }
            }
        } catch (SecurityException e2) {
            ex = e2;
        }
        return null;
    }

    public static JavaCompiler getSystemJavaCompiler() {
        if (Lazy.compilerClass == null) {
            return (JavaCompiler) trace(Level.WARNING, "Lazy.compilerClass == null");
        }
        try {
            return Lazy.compilerClass.newInstance();
        } catch (Throwable e) {
            return (JavaCompiler) trace(Level.WARNING, e);
        }
    }

    public static ClassLoader getSystemToolClassLoader() {
        if (Lazy.compilerClass == null) {
            return (ClassLoader) trace(Level.WARNING, "Lazy.compilerClass == null");
        }
        return Lazy.compilerClass.getClassLoader();
    }

    static class Lazy {
        static final Class<? extends JavaCompiler> compilerClass;
        private static final String defaultJavaCompilerName = "com.sun.tools.javac.api.JavacTool";
        private static final String[] defaultToolsLocation = {"lib", "tools.jar"};

        Lazy() {
        }

        static {
            Class<? extends JavaCompiler> c = null;
            try {
                c = findClass().asSubclass(JavaCompiler.class);
            } catch (Throwable t) {
                ToolProvider.trace(Level.WARNING, t);
            }
            compilerClass = c;
        }

        private static Class<?> findClass() throws MalformedURLException, ClassNotFoundException {
            try {
                return enableAsserts(Class.forName(defaultJavaCompilerName, false, null));
            } catch (ClassNotFoundException e) {
                ToolProvider.trace(Level.FINE, e);
                File file = new File(System.getProperty("java.home"));
                if (file.getName().equalsIgnoreCase("jre")) {
                    file = file.getParentFile();
                }
                for (String name : defaultToolsLocation) {
                    file = new File(file, name);
                }
                URL[] urls = {file.toURI().toURL()};
                ToolProvider.trace(Level.FINE, urls[0].toString());
                ClassLoader cl = URLClassLoader.newInstance(urls);
                cl.setPackageAssertionStatus("com.sun.tools.javac", true);
                return Class.forName(defaultJavaCompilerName, false, cl);
            }
        }

        private static Class<?> enableAsserts(Class<?> cls) {
            try {
                ClassLoader loader = cls.getClassLoader();
                if (loader != null) {
                    loader.setPackageAssertionStatus("com.sun.tools.javac", true);
                } else {
                    ToolProvider.trace(Level.FINE, "loader == null");
                }
            } catch (SecurityException ex) {
                ToolProvider.trace(Level.FINE, ex);
            }
            return cls;
        }
    }
}
