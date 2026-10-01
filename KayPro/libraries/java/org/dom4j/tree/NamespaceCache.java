package org.dom4j.tree;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Map;
import org.dom4j.Namespace;

public class NamespaceCache {
    private static final String CONCURRENTREADERHASHMAP_CLASS = "EDU.oswego.cs.dl.util.concurrent.ConcurrentReaderHashMap";
    protected static Map cache;
    protected static Map noPrefixCache;

    static {
        try {
            Constructor<?> constructor = Class.forName("java.util.concurrent.ConcurrentHashMap").getConstructor(Integer.TYPE, Float.TYPE, Integer.TYPE);
            cache = (Map) constructor.newInstance(new Integer(11), new Float(0.75f), new Integer(1));
            noPrefixCache = (Map) constructor.newInstance(new Integer(11), new Float(0.75f), new Integer(1));
        } catch (Throwable th) {
            try {
                Class<?> cls = Class.forName(CONCURRENTREADERHASHMAP_CLASS);
                cache = (Map) cls.newInstance();
                noPrefixCache = (Map) cls.newInstance();
            } catch (Throwable th2) {
                cache = new ConcurrentReaderHashMap();
                noPrefixCache = new ConcurrentReaderHashMap();
            }
        }
    }

    protected Namespace createNamespace(String str, String str2) {
        return new Namespace(str, str2);
    }

    public Namespace m8881get(String str) {
        Namespace namespaceCreateNamespace;
        WeakReference weakReference = (WeakReference) noPrefixCache.get(str);
        Namespace namespace = weakReference != null ? (Namespace) weakReference.get() : null;
        if (namespace != null) {
            return namespace;
        }
        synchronized (noPrefixCache) {
            WeakReference weakReference2 = (WeakReference) noPrefixCache.get(str);
            namespaceCreateNamespace = weakReference2 != null ? (Namespace) weakReference2.get() : namespace;
            if (namespaceCreateNamespace == null) {
                namespaceCreateNamespace = createNamespace("", str);
                noPrefixCache.put(str, new WeakReference(namespaceCreateNamespace));
            }
        }
        return namespaceCreateNamespace;
    }

    public Namespace m8882get(String str, String str2) {
        Namespace namespaceCreateNamespace;
        Map uRICache = getURICache(str2);
        WeakReference weakReference = (WeakReference) uRICache.get(str);
        Namespace namespace = weakReference != null ? (Namespace) weakReference.get() : null;
        if (namespace != null) {
            return namespace;
        }
        synchronized (uRICache) {
            WeakReference weakReference2 = (WeakReference) uRICache.get(str);
            namespaceCreateNamespace = weakReference2 != null ? (Namespace) weakReference2.get() : namespace;
            if (namespaceCreateNamespace == null) {
                namespaceCreateNamespace = createNamespace(str, str2);
                uRICache.put(str, new WeakReference(namespaceCreateNamespace));
            }
        }
        return namespaceCreateNamespace;
    }

    protected Map getURICache(String str) {
        Map concurrentReaderHashMap = (Map) cache.get(str);
        if (concurrentReaderHashMap == null) {
            synchronized (cache) {
                concurrentReaderHashMap = (Map) cache.get(str);
                if (concurrentReaderHashMap == null) {
                    concurrentReaderHashMap = new ConcurrentReaderHashMap();
                    cache.put(str, concurrentReaderHashMap);
                }
            }
        }
        return concurrentReaderHashMap;
    }
}
