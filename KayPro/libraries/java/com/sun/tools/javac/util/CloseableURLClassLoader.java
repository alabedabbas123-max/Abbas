package com.sun.tools.javac.util;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.jar.JarFile;

public class CloseableURLClassLoader extends URLClassLoader implements Closeable {
    public CloseableURLClassLoader(URL[] urls, ClassLoader parent) throws Error {
        super(urls, parent);
        try {
            getLoaders();
        } catch (Throwable t) {
            throw new Error("cannot create CloseableURLClassLoader", t);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            for (Object l : getLoaders()) {
                if (l.getClass().getName().equals("sun.misc.URLClassPath$JarLoader")) {
                    Field jarField = l.getClass().getDeclaredField("jar");
                    JarFile jar = (JarFile) getField(l, jarField);
                    if (jar != null) {
                        jar.close();
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable t) {
            IOException e = new IOException("cannot close class loader");
            e.initCause(t);
            throw e;
        }
    }

    private ArrayList<?> getLoaders() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field ucpField = URLClassLoader.class.getDeclaredField("ucp");
        Object urlClassPath = getField(this, ucpField);
        if (urlClassPath == null) {
            throw new AssertionError("urlClassPath not set in URLClassLoader");
        }
        Field loadersField = urlClassPath.getClass().getDeclaredField("loaders");
        return (ArrayList) getField(urlClassPath, loadersField);
    }

    private Object getField(Object o, Field f) throws IllegalAccessException, IllegalArgumentException {
        boolean prev = f.isAccessible();
        try {
            f.setAccessible(true);
            return f.get(o);
        } finally {
            f.setAccessible(prev);
        }
    }
}
