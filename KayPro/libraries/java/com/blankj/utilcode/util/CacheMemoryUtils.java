package com.blankj.utilcode.util;

import androidx.collection.LruCache;
import com.blankj.utilcode.constant.CacheConstants;
import java.util.HashMap;
import java.util.Map;

public final class CacheMemoryUtils implements CacheConstants {
    private static final Map<String, CacheMemoryUtils> CACHE_MAP = new HashMap();
    private static final int DEFAULT_MAX_COUNT = 256;
    private final String mCacheKey;
    private final LruCache<String, CacheValue> mMemoryCache;

    private static final class CacheValue {
        long dueTime;
        Object value;

        CacheValue(long j, Object obj) {
            this.dueTime = j;
            this.value = obj;
        }
    }

    private CacheMemoryUtils(String str, LruCache<String, CacheValue> lruCache) {
        this.mCacheKey = str;
        this.mMemoryCache = lruCache;
    }

    public static CacheMemoryUtils getInstance() {
        return getInstance(256);
    }

    public static CacheMemoryUtils getInstance(int i) {
        return getInstance(String.valueOf(i), i);
    }

    public static CacheMemoryUtils getInstance(String str, int i) {
        CacheMemoryUtils cacheMemoryUtils = CACHE_MAP.get(str);
        if (cacheMemoryUtils == null) {
            synchronized (CacheMemoryUtils.class) {
                cacheMemoryUtils = CACHE_MAP.get(str);
                if (cacheMemoryUtils == null) {
                    cacheMemoryUtils = new CacheMemoryUtils(str, new LruCache(i));
                    CACHE_MAP.put(str, cacheMemoryUtils);
                }
            }
        }
        return cacheMemoryUtils;
    }

    public void clear() {
        this.mMemoryCache.evictAll();
    }

    public <T> T m6993get(String str) {
        return (T) m6994get(str, null);
    }

    public <T> T m6994get(String str, T t) {
        CacheValue cacheValueM3697get = this.mMemoryCache.m3697get(str);
        if (cacheValueM3697get == null) {
            return t;
        }
        if (cacheValueM3697get.dueTime == -1 || cacheValueM3697get.dueTime >= System.currentTimeMillis()) {
            return (T) cacheValueM3697get.value;
        }
        this.mMemoryCache.remove(str);
        return t;
    }

    public int getCacheCount() {
        return this.mMemoryCache.size();
    }

    public void m6995put(String str, Object obj) {
        m6996put(str, obj, -1);
    }

    public void m6996put(String str, Object obj, int i) {
        if (obj == null) {
            return;
        }
        this.mMemoryCache.m3698put(str, new CacheValue(i < 0 ? -1L : System.currentTimeMillis() + ((long) (i * 1000)), obj));
    }

    public Object remove(String str) {
        CacheValue cacheValueRemove = this.mMemoryCache.remove(str);
        if (cacheValueRemove == null) {
            return null;
        }
        return cacheValueRemove.value;
    }

    public String toString() {
        return this.mCacheKey + "@" + Integer.toHexString(hashCode());
    }
}
