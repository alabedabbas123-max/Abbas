package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CacheDoubleStaticUtils {
    private static CacheDoubleUtils sDefaultCacheDoubleUtils;

    public static void clear() {
        clear(getDefaultCacheDoubleUtils());
    }

    public static void clear(CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.clear();
    }

    public static Bitmap getBitmap(String str) {
        return getBitmap(str, getDefaultCacheDoubleUtils());
    }

    public static Bitmap getBitmap(String str, Bitmap bitmap) {
        return getBitmap(str, bitmap, getDefaultCacheDoubleUtils());
    }

    public static Bitmap getBitmap(String str, Bitmap bitmap, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getBitmap(str, bitmap);
    }

    public static Bitmap getBitmap(String str, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getBitmap(str);
    }

    public static byte[] getBytes(String str) {
        return getBytes(str, getDefaultCacheDoubleUtils());
    }

    public static byte[] getBytes(String str, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getBytes(str);
    }

    public static byte[] getBytes(String str, byte[] bArr) {
        return getBytes(str, bArr, getDefaultCacheDoubleUtils());
    }

    public static byte[] getBytes(String str, byte[] bArr, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getBytes(str, bArr);
    }

    public static int getCacheDiskCount() {
        return getCacheDiskCount(getDefaultCacheDoubleUtils());
    }

    public static int getCacheDiskCount(CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getCacheDiskCount();
    }

    public static long getCacheDiskSize() {
        return getCacheDiskSize(getDefaultCacheDoubleUtils());
    }

    public static long getCacheDiskSize(CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getCacheDiskSize();
    }

    public static int getCacheMemoryCount() {
        return getCacheMemoryCount(getDefaultCacheDoubleUtils());
    }

    public static int getCacheMemoryCount(CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getCacheMemoryCount();
    }

    private static CacheDoubleUtils getDefaultCacheDoubleUtils() {
        CacheDoubleUtils cacheDoubleUtils = sDefaultCacheDoubleUtils;
        return cacheDoubleUtils != null ? cacheDoubleUtils : CacheDoubleUtils.getInstance();
    }

    public static Drawable getDrawable(String str) {
        return getDrawable(str, getDefaultCacheDoubleUtils());
    }

    public static Drawable getDrawable(String str, Drawable drawable) {
        return getDrawable(str, drawable, getDefaultCacheDoubleUtils());
    }

    public static Drawable getDrawable(String str, Drawable drawable, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getDrawable(str, drawable);
    }

    public static Drawable getDrawable(String str, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getDrawable(str);
    }

    public static JSONArray getJSONArray(String str) {
        return getJSONArray(str, getDefaultCacheDoubleUtils());
    }

    public static JSONArray getJSONArray(String str, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getJSONArray(str);
    }

    public static JSONArray getJSONArray(String str, JSONArray jSONArray) {
        return getJSONArray(str, jSONArray, getDefaultCacheDoubleUtils());
    }

    public static JSONArray getJSONArray(String str, JSONArray jSONArray, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getJSONArray(str, jSONArray);
    }

    public static JSONObject getJSONObject(String str) {
        return getJSONObject(str, getDefaultCacheDoubleUtils());
    }

    public static JSONObject getJSONObject(String str, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getJSONObject(str);
    }

    public static JSONObject getJSONObject(String str, JSONObject jSONObject) {
        return getJSONObject(str, jSONObject, getDefaultCacheDoubleUtils());
    }

    public static JSONObject getJSONObject(String str, JSONObject jSONObject, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getJSONObject(str, jSONObject);
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator) {
        return (T) getParcelable(str, (Parcelable.Creator) creator, getDefaultCacheDoubleUtils());
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator, CacheDoubleUtils cacheDoubleUtils) {
        return (T) cacheDoubleUtils.getParcelable(str, creator);
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator, T t) {
        return (T) getParcelable(str, creator, t, getDefaultCacheDoubleUtils());
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator, T t, CacheDoubleUtils cacheDoubleUtils) {
        return (T) cacheDoubleUtils.getParcelable(str, creator, t);
    }

    public static Object getSerializable(String str) {
        return getSerializable(str, getDefaultCacheDoubleUtils());
    }

    public static Object getSerializable(String str, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getSerializable(str);
    }

    public static Object getSerializable(String str, Object obj) {
        return getSerializable(str, obj, getDefaultCacheDoubleUtils());
    }

    public static Object getSerializable(String str, Object obj, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getSerializable(str, obj);
    }

    public static String getString(String str) {
        return getString(str, getDefaultCacheDoubleUtils());
    }

    public static String getString(String str, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getString(str);
    }

    public static String getString(String str, String str2) {
        return getString(str, str2, getDefaultCacheDoubleUtils());
    }

    public static String getString(String str, String str2, CacheDoubleUtils cacheDoubleUtils) {
        return cacheDoubleUtils.getString(str, str2);
    }

    public static void m6937put(String str, Bitmap bitmap) {
        m6940put(str, bitmap, getDefaultCacheDoubleUtils());
    }

    public static void m6938put(String str, Bitmap bitmap, int i) {
        m6939put(str, bitmap, i, getDefaultCacheDoubleUtils());
    }

    public static void m6939put(String str, Bitmap bitmap, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6970put(str, bitmap, i);
    }

    public static void m6940put(String str, Bitmap bitmap, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6969put(str, bitmap);
    }

    public static void m6941put(String str, Drawable drawable) {
        m6944put(str, drawable, getDefaultCacheDoubleUtils());
    }

    public static void m6942put(String str, Drawable drawable, int i) {
        m6943put(str, drawable, i, getDefaultCacheDoubleUtils());
    }

    public static void m6943put(String str, Drawable drawable, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6972put(str, drawable, i);
    }

    public static void m6944put(String str, Drawable drawable, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6971put(str, drawable);
    }

    public static void m6945put(String str, Parcelable parcelable) {
        m6948put(str, parcelable, getDefaultCacheDoubleUtils());
    }

    public static void m6946put(String str, Parcelable parcelable, int i) {
        m6947put(str, parcelable, i, getDefaultCacheDoubleUtils());
    }

    public static void m6947put(String str, Parcelable parcelable, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6974put(str, parcelable, i);
    }

    public static void m6948put(String str, Parcelable parcelable, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6973put(str, parcelable);
    }

    public static void m6949put(String str, Serializable serializable) {
        m6952put(str, serializable, getDefaultCacheDoubleUtils());
    }

    public static void m6950put(String str, Serializable serializable, int i) {
        m6951put(str, serializable, i, getDefaultCacheDoubleUtils());
    }

    public static void m6951put(String str, Serializable serializable, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6976put(str, serializable, i);
    }

    public static void m6952put(String str, Serializable serializable, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6975put(str, serializable);
    }

    public static void m6953put(String str, String str2) {
        m6956put(str, str2, getDefaultCacheDoubleUtils());
    }

    public static void m6954put(String str, String str2, int i) {
        m6955put(str, str2, i, getDefaultCacheDoubleUtils());
    }

    public static void m6955put(String str, String str2, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6978put(str, str2, i);
    }

    public static void m6956put(String str, String str2, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6977put(str, str2);
    }

    public static void m6957put(String str, JSONArray jSONArray) {
        m6960put(str, jSONArray, getDefaultCacheDoubleUtils());
    }

    public static void m6958put(String str, JSONArray jSONArray, int i) {
        m6959put(str, jSONArray, i, getDefaultCacheDoubleUtils());
    }

    public static void m6959put(String str, JSONArray jSONArray, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6980put(str, jSONArray, i);
    }

    public static void m6960put(String str, JSONArray jSONArray, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6979put(str, jSONArray);
    }

    public static void m6961put(String str, JSONObject jSONObject) {
        m6964put(str, jSONObject, getDefaultCacheDoubleUtils());
    }

    public static void m6962put(String str, JSONObject jSONObject, int i) {
        m6963put(str, jSONObject, i, getDefaultCacheDoubleUtils());
    }

    public static void m6963put(String str, JSONObject jSONObject, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6982put(str, jSONObject, i);
    }

    public static void m6964put(String str, JSONObject jSONObject, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6981put(str, jSONObject);
    }

    public static void m6965put(String str, byte[] bArr) {
        m6968put(str, bArr, getDefaultCacheDoubleUtils());
    }

    public static void m6966put(String str, byte[] bArr, int i) {
        m6967put(str, bArr, i, getDefaultCacheDoubleUtils());
    }

    public static void m6967put(String str, byte[] bArr, int i, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6984put(str, bArr, i);
    }

    public static void m6968put(String str, byte[] bArr, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.m6983put(str, bArr);
    }

    public static void remove(String str) {
        remove(str, getDefaultCacheDoubleUtils());
    }

    public static void remove(String str, CacheDoubleUtils cacheDoubleUtils) {
        cacheDoubleUtils.remove(str);
    }

    public static void setDefaultCacheDoubleUtils(CacheDoubleUtils cacheDoubleUtils) {
        sDefaultCacheDoubleUtils = cacheDoubleUtils;
    }
}
