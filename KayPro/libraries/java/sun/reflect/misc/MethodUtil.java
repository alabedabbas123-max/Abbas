package sun.reflect.misc;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.AccessController;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.PrivilegedExceptionAction;
import java.security.SecureClassLoader;
import java.security.cert.Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import sun.misc.IOUtils;

public final class MethodUtil extends SecureClassLoader {
    private static String MISC_PKG = "sun.reflect.misc.";
    private static String TRAMPOLINE = MISC_PKG + "Trampoline";
    private static Method bounce = getTrampoline();

    private MethodUtil() {
    }

    public static Method getMethod(Class cls, String name, Class[] args) throws NoSuchMethodException {
        ReflectUtil.checkPackageAccess(cls);
        return cls.getMethod(name, args);
    }

    public static Method[] getMethods(Class cls) {
        ReflectUtil.checkPackageAccess(cls);
        return cls.getMethods();
    }

    public static Method[] getPublicMethods(Class cls) {
        if (System.getSecurityManager() == null) {
            return cls.getMethods();
        }
        Map sigs = new HashMap();
        while (cls != null) {
            boolean done = getInternalPublicMethods(cls, sigs);
            if (done) {
                break;
            }
            getInterfaceMethods(cls, sigs);
            cls = cls.getSuperclass();
        }
        Collection c = sigs.values();
        return (Method[]) c.toArray(new Method[c.size()]);
    }

    private static void getInterfaceMethods(Class cls, Map sigs) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            boolean done = getInternalPublicMethods(cls2, sigs);
            if (!done) {
                getInterfaceMethods(cls2, sigs);
            }
        }
    }

    private static boolean getInternalPublicMethods(Class cls, Map sigs) {
        try {
            if (!Modifier.isPublic(cls.getModifiers()) || !ReflectUtil.isPackageAccessible(cls)) {
                return false;
            }
            Method[] methods = cls.getMethods();
            boolean done = true;
            for (Method method : methods) {
                if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                    done = false;
                    break;
                }
            }
            if (done) {
                for (Method method2 : methods) {
                    addMethod(sigs, method2);
                }
            } else {
                for (int i = 0; i < methods.length; i++) {
                    if (cls.equals(methods[i].getDeclaringClass())) {
                        addMethod(sigs, methods[i]);
                    }
                }
            }
            return done;
        } catch (SecurityException e) {
            return false;
        }
    }

    private static void addMethod(Map sigs, Method method) {
        Signature signature = new Signature(method);
        if (!sigs.containsKey(signature)) {
            sigs.put(signature, method);
        } else if (!method.getDeclaringClass().isInterface()) {
            Method old = (Method) sigs.get(signature);
            if (old.getDeclaringClass().isInterface()) {
                sigs.put(signature, method);
            }
        }
    }

    private static class Signature {
        private Class[] argClasses;
        private volatile int hashCode = 0;
        private String methodName;

        Signature(Method m) {
            this.methodName = m.getName();
            this.argClasses = m.getParameterTypes();
        }

        public boolean equals(Object o2) {
            if (this == o2) {
                return true;
            }
            Signature that = (Signature) o2;
            if (!this.methodName.equals(that.methodName) || this.argClasses.length != that.argClasses.length) {
                return false;
            }
            int i = 0;
            while (true) {
                Class[] clsArr = this.argClasses;
                if (i >= clsArr.length) {
                    return true;
                }
                if (clsArr[i] != that.argClasses[i]) {
                    return false;
                }
                i++;
            }
        }

        public int hashCode() {
            if (this.hashCode == 0) {
                int result = (17 * 37) + this.methodName.hashCode();
                if (this.argClasses != null) {
                    int i = 0;
                    while (true) {
                        Class[] clsArr = this.argClasses;
                        if (i >= clsArr.length) {
                            break;
                        }
                        result = (result * 37) + (clsArr[i] == null ? 0 : clsArr[i].hashCode());
                        i++;
                    }
                }
                this.hashCode = result;
            }
            return this.hashCode;
        }
    }

    public static Object invoke(Method m, Object obj, Object[] params) throws IllegalAccessException, InvocationTargetException {
        if (m.getDeclaringClass().equals(AccessController.class) || m.getDeclaringClass().equals(Method.class)) {
            throw new InvocationTargetException(new UnsupportedOperationException("invocation not supported"));
        }
        try {
            return bounce.invoke(null, m, obj, params);
        } catch (IllegalAccessException iae) {
            throw new Error("Unexpected invocation error", iae);
        } catch (InvocationTargetException ie) {
            Throwable t = ie.getCause();
            if (t instanceof InvocationTargetException) {
                throw ((InvocationTargetException) t);
            }
            if (t instanceof IllegalAccessException) {
                throw ((IllegalAccessException) t);
            }
            if (t instanceof RuntimeException) {
                throw ((RuntimeException) t);
            }
            if (t instanceof Error) {
                throw ((Error) t);
            }
            throw new Error("Unexpected invocation error", t);
        }
    }

    private static Method getTrampoline() {
        try {
            Method tramp = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction() {
                @Override
                public Object run() throws Exception {
                    Class t = MethodUtil.getTrampolineClass();
                    Method b = t.getDeclaredMethod("invoke", Method.class, Object.class, Object[].class);
                    b.setAccessible(true);
                    return b;
                }
            });
            return tramp;
        } catch (Exception e) {
            throw new InternalError("bouncer cannot be found");
        }
    }

    @Override
    protected synchronized Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<?> clsFindLoadedClass;
        ReflectUtil.checkPackageAccess(name);
        clsFindLoadedClass = findLoadedClass(name);
        if (clsFindLoadedClass == null) {
            try {
                clsFindLoadedClass = findClass(name);
            } catch (ClassNotFoundException e) {
            }
            if (clsFindLoadedClass == null) {
                clsFindLoadedClass = getParent().loadClass(name);
            }
        }
        if (resolve) {
            resolveClass(clsFindLoadedClass);
        }
        return clsFindLoadedClass;
    }

    @Override
    protected Class findClass(String name) throws ClassNotFoundException {
        if (!name.startsWith(MISC_PKG)) {
            throw new ClassNotFoundException(name);
        }
        String path = name.replace('.', '/').concat(".class");
        URL res = getResource(path);
        if (res != null) {
            try {
                return defineClass(name, res);
            } catch (IOException e) {
                throw new ClassNotFoundException(name, e);
            }
        }
        throw new ClassNotFoundException(name);
    }

    private Class defineClass(String name, URL url) throws IOException {
        byte[] b = getBytes(url);
        CodeSource cs = new CodeSource((URL) null, (Certificate[]) null);
        if (!name.equals(TRAMPOLINE)) {
            throw new IOException("MethodUtil: bad name " + name);
        }
        return defineClass(name, b, 0, b.length, cs);
    }

    private static byte[] getBytes(URL url) throws IOException {
        URLConnection uc = url.openConnection();
        if (uc instanceof HttpURLConnection) {
            HttpURLConnection huc = (HttpURLConnection) uc;
            int code = huc.getResponseCode();
            if (code >= 400) {
                throw new IOException("open HTTP connection failed.");
            }
        }
        int len = uc.getContentLength();
        InputStream in = new BufferedInputStream(uc.getInputStream());
        try {
            byte[] b = IOUtils.readFully(in, len, true);
            return b;
        } finally {
            in.close();
        }
    }

    @Override
    protected PermissionCollection getPermissions(CodeSource codesource) {
        PermissionCollection perms = super.getPermissions(codesource);
        perms.add(new AllPermission());
        return perms;
    }

    public static Class getTrampolineClass() {
        try {
            return Class.forName(TRAMPOLINE, true, new MethodUtil());
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
