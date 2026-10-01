package org.dom4j.util;

import java.lang.ref.WeakReference;

public class PerThreadSingleton implements SingletonStrategy {
    private String singletonClassName = null;
    private ThreadLocal perThreadCache = new ThreadLocal();

    @Override
    public Object instance() {
        Object objNewInstance;
        WeakReference weakReference = (WeakReference) this.perThreadCache.get();
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        try {
            objNewInstance = Thread.currentThread().getContextClassLoader().loadClass(this.singletonClassName).newInstance();
        } catch (Exception e) {
            try {
                objNewInstance = Class.forName(this.singletonClassName).newInstance();
            } catch (Exception e2) {
                objNewInstance = null;
            }
        }
        this.perThreadCache.set(new WeakReference(objNewInstance));
        return objNewInstance;
    }

    @Override
    public void reset() {
        this.perThreadCache = new ThreadLocal();
    }

    @Override
    public void setSingletonClassName(String str) {
        this.singletonClassName = str;
    }
}
