package com.blankj.utilcode.util;

public final class CacheMemoryStaticUtils {
    private static CacheMemoryUtils sDefaultCacheMemoryUtils;

    public static void clear() {
        clear(getDefaultCacheMemoryUtils());
    }

    public static void clear(CacheMemoryUtils cacheMemoryUtils) {
        cacheMemoryUtils.clear();
    }

    public static <T> T m6985get(String str) {
        return (T) m6986get(str, getDefaultCacheMemoryUtils());
    }

    public static <T> T m6986get(String str, CacheMemoryUtils cacheMemoryUtils) {
        return (T) cacheMemoryUtils.m6993get(str);
    }

    public static <T> T m6987get(String str, T t) {
        return (T) m6988get(str, t, getDefaultCacheMemoryUtils());
    }

    public static <T> T m6988get(String str, T t, CacheMemoryUtils cacheMemoryUtils) {
        return (T) cacheMemoryUtils.m6994get(str, t);
    }

    public static int getCacheCount() {
        return getCacheCount(getDefaultCacheMemoryUtils());
    }

    public static int getCacheCount(CacheMemoryUtils cacheMemoryUtils) {
        return cacheMemoryUtils.getCacheCount();
    }

    private static CacheMemoryUtils getDefaultCacheMemoryUtils() {
        CacheMemoryUtils cacheMemoryUtils = sDefaultCacheMemoryUtils;
        return cacheMemoryUtils != null ? cacheMemoryUtils : CacheMemoryUtils.getInstance();
    }

    public static void m6989put(String str, Object obj) {
        m6992put(str, obj, getDefaultCacheMemoryUtils());
    }

    public static void m6990put(String str, Object obj, int i) {
        m6991put(str, obj, i, getDefaultCacheMemoryUtils());
    }

    public static void m6991put(String str, Object obj, int i, CacheMemoryUtils cacheMemoryUtils) {
        cacheMemoryUtils.m6996put(str, obj, i);
    }

    public static void m6992put(String str, Object obj, CacheMemoryUtils cacheMemoryUtils) {
        cacheMemoryUtils.m6995put(str, obj);
    }

    public static Object remove(String str) {
        return remove(str, getDefaultCacheMemoryUtils());
    }

    public static Object remove(String str, CacheMemoryUtils cacheMemoryUtils) {
        return cacheMemoryUtils.remove(str);
    }

    public static void setDefaultCacheMemoryUtils(CacheMemoryUtils cacheMemoryUtils) {
        sDefaultCacheMemoryUtils = cacheMemoryUtils;
    }
}
