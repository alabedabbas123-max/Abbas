package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import com.blankj.utilcode.constant.CacheConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CacheDoubleUtils implements CacheConstants {
    private static final Map<String, CacheDoubleUtils> CACHE_MAP = new HashMap();
    private final CacheDiskUtils mCacheDiskUtils;
    private final CacheMemoryUtils mCacheMemoryUtils;

    private CacheDoubleUtils(CacheMemoryUtils cacheMemoryUtils, CacheDiskUtils cacheDiskUtils) {
        this.mCacheMemoryUtils = cacheMemoryUtils;
        this.mCacheDiskUtils = cacheDiskUtils;
    }

    public static CacheDoubleUtils getInstance() {
        return getInstance(CacheMemoryUtils.getInstance(), CacheDiskUtils.getInstance());
    }

    public static CacheDoubleUtils getInstance(CacheMemoryUtils cacheMemoryUtils, CacheDiskUtils cacheDiskUtils) {
        String str = cacheDiskUtils.toString() + "_" + cacheMemoryUtils.toString();
        CacheDoubleUtils cacheDoubleUtils = CACHE_MAP.get(str);
        if (cacheDoubleUtils == null) {
            synchronized (CacheDoubleUtils.class) {
                cacheDoubleUtils = CACHE_MAP.get(str);
                if (cacheDoubleUtils == null) {
                    cacheDoubleUtils = new CacheDoubleUtils(cacheMemoryUtils, cacheDiskUtils);
                    CACHE_MAP.put(str, cacheDoubleUtils);
                }
            }
        }
        return cacheDoubleUtils;
    }

    public void clear() {
        this.mCacheMemoryUtils.clear();
        this.mCacheDiskUtils.clear();
    }

    public Bitmap getBitmap(String str) {
        return getBitmap(str, null);
    }

    public Bitmap getBitmap(String str, Bitmap bitmap) {
        Bitmap bitmap2 = (Bitmap) this.mCacheMemoryUtils.m6993get(str);
        return bitmap2 != null ? bitmap2 : this.mCacheDiskUtils.getBitmap(str, bitmap);
    }

    public byte[] getBytes(String str) {
        return getBytes(str, null);
    }

    public byte[] getBytes(String str, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.mCacheMemoryUtils.m6993get(str);
        return bArr2 != null ? bArr2 : this.mCacheDiskUtils.getBytes(str, bArr);
    }

    public int getCacheDiskCount() {
        return this.mCacheDiskUtils.getCacheCount();
    }

    public long getCacheDiskSize() {
        return this.mCacheDiskUtils.getCacheSize();
    }

    public int getCacheMemoryCount() {
        return this.mCacheMemoryUtils.getCacheCount();
    }

    public Drawable getDrawable(String str) {
        return getDrawable(str, null);
    }

    public Drawable getDrawable(String str, Drawable drawable) {
        Drawable drawable2 = (Drawable) this.mCacheMemoryUtils.m6993get(str);
        return drawable2 != null ? drawable2 : this.mCacheDiskUtils.getDrawable(str, drawable);
    }

    public JSONArray getJSONArray(String str) {
        return getJSONArray(str, null);
    }

    public JSONArray getJSONArray(String str, JSONArray jSONArray) {
        JSONArray jSONArray2 = (JSONArray) this.mCacheMemoryUtils.m6993get(str);
        return jSONArray2 != null ? jSONArray2 : this.mCacheDiskUtils.getJSONArray(str, jSONArray);
    }

    public JSONObject getJSONObject(String str) {
        return getJSONObject(str, null);
    }

    public JSONObject getJSONObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = (JSONObject) this.mCacheMemoryUtils.m6993get(str);
        return jSONObject2 != null ? jSONObject2 : this.mCacheDiskUtils.getJSONObject(str, jSONObject);
    }

    public <T> T getParcelable(String str, Parcelable.Creator<T> creator) {
        return (T) getParcelable(str, creator, null);
    }

    public <T> T getParcelable(String str, Parcelable.Creator<T> creator, T t) {
        T t2 = (T) this.mCacheMemoryUtils.m6993get(str);
        return t2 != null ? t2 : (T) this.mCacheDiskUtils.getParcelable(str, creator, t);
    }

    public Object getSerializable(String str) {
        return getSerializable(str, null);
    }

    public Object getSerializable(String str, Object obj) {
        Object objM6993get = this.mCacheMemoryUtils.m6993get(str);
        return objM6993get != null ? objM6993get : this.mCacheDiskUtils.getSerializable(str, obj);
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public String getString(String str, String str2) {
        String str3 = (String) this.mCacheMemoryUtils.m6993get(str);
        return str3 != null ? str3 : this.mCacheDiskUtils.getString(str, str2);
    }

    public void m6969put(String str, Bitmap bitmap) {
        m6970put(str, bitmap, -1);
    }

    public void m6970put(String str, Bitmap bitmap, int i) {
        this.mCacheMemoryUtils.m6996put(str, bitmap, i);
        this.mCacheDiskUtils.m6921put(str, bitmap, i);
    }

    public void m6971put(String str, Drawable drawable) {
        m6972put(str, drawable, -1);
    }

    public void m6972put(String str, Drawable drawable, int i) {
        this.mCacheMemoryUtils.m6996put(str, drawable, i);
        this.mCacheDiskUtils.m6923put(str, drawable, i);
    }

    public void m6973put(String str, Parcelable parcelable) {
        m6974put(str, parcelable, -1);
    }

    public void m6974put(String str, Parcelable parcelable, int i) {
        this.mCacheMemoryUtils.m6996put(str, parcelable, i);
        this.mCacheDiskUtils.m6925put(str, parcelable, i);
    }

    public void m6975put(String str, Serializable serializable) {
        m6976put(str, serializable, -1);
    }

    public void m6976put(String str, Serializable serializable, int i) {
        this.mCacheMemoryUtils.m6996put(str, serializable, i);
        this.mCacheDiskUtils.m6927put(str, serializable, i);
    }

    public void m6977put(String str, String str2) {
        m6978put(str, str2, -1);
    }

    public void m6978put(String str, String str2, int i) {
        this.mCacheMemoryUtils.m6996put(str, str2, i);
        this.mCacheDiskUtils.m6929put(str, str2, i);
    }

    public void m6979put(String str, JSONArray jSONArray) {
        m6980put(str, jSONArray, -1);
    }

    public void m6980put(String str, JSONArray jSONArray, int i) {
        this.mCacheMemoryUtils.m6996put(str, jSONArray, i);
        this.mCacheDiskUtils.m6931put(str, jSONArray, i);
    }

    public void m6981put(String str, JSONObject jSONObject) {
        m6982put(str, jSONObject, -1);
    }

    public void m6982put(String str, JSONObject jSONObject, int i) {
        this.mCacheMemoryUtils.m6996put(str, jSONObject, i);
        this.mCacheDiskUtils.m6933put(str, jSONObject, i);
    }

    public void m6983put(String str, byte[] bArr) {
        m6984put(str, bArr, -1);
    }

    public void m6984put(String str, byte[] bArr, int i) {
        this.mCacheMemoryUtils.m6996put(str, bArr, i);
        this.mCacheDiskUtils.m6935put(str, bArr, i);
    }

    public void remove(String str) {
        this.mCacheMemoryUtils.remove(str);
        this.mCacheDiskUtils.remove(str);
    }
}
