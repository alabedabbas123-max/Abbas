package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CacheDiskStaticUtils {
    private static CacheDiskUtils sDefaultCacheDiskUtils;

    public static boolean clear() {
        return clear(getDefaultCacheDiskUtils());
    }

    public static boolean clear(CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.clear();
    }

    public static Bitmap getBitmap(String str) {
        return getBitmap(str, getDefaultCacheDiskUtils());
    }

    public static Bitmap getBitmap(String str, Bitmap bitmap) {
        return getBitmap(str, bitmap, getDefaultCacheDiskUtils());
    }

    public static Bitmap getBitmap(String str, Bitmap bitmap, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getBitmap(str, bitmap);
    }

    public static Bitmap getBitmap(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getBitmap(str);
    }

    public static byte[] getBytes(String str) {
        return getBytes(str, getDefaultCacheDiskUtils());
    }

    public static byte[] getBytes(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getBytes(str);
    }

    public static byte[] getBytes(String str, byte[] bArr) {
        return getBytes(str, bArr, getDefaultCacheDiskUtils());
    }

    public static byte[] getBytes(String str, byte[] bArr, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getBytes(str, bArr);
    }

    public static int getCacheCount() {
        return getCacheCount(getDefaultCacheDiskUtils());
    }

    public static int getCacheCount(CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getCacheCount();
    }

    public static long getCacheSize() {
        return getCacheSize(getDefaultCacheDiskUtils());
    }

    public static long getCacheSize(CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getCacheSize();
    }

    private static CacheDiskUtils getDefaultCacheDiskUtils() {
        CacheDiskUtils cacheDiskUtils = sDefaultCacheDiskUtils;
        return cacheDiskUtils != null ? cacheDiskUtils : CacheDiskUtils.getInstance();
    }

    public static Drawable getDrawable(String str) {
        return getDrawable(str, getDefaultCacheDiskUtils());
    }

    public static Drawable getDrawable(String str, Drawable drawable) {
        return getDrawable(str, drawable, getDefaultCacheDiskUtils());
    }

    public static Drawable getDrawable(String str, Drawable drawable, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getDrawable(str, drawable);
    }

    public static Drawable getDrawable(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getDrawable(str);
    }

    public static JSONArray getJSONArray(String str) {
        return getJSONArray(str, getDefaultCacheDiskUtils());
    }

    public static JSONArray getJSONArray(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getJSONArray(str);
    }

    public static JSONArray getJSONArray(String str, JSONArray jSONArray) {
        return getJSONArray(str, jSONArray, getDefaultCacheDiskUtils());
    }

    public static JSONArray getJSONArray(String str, JSONArray jSONArray, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getJSONArray(str, jSONArray);
    }

    public static JSONObject getJSONObject(String str) {
        return getJSONObject(str, getDefaultCacheDiskUtils());
    }

    public static JSONObject getJSONObject(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getJSONObject(str);
    }

    public static JSONObject getJSONObject(String str, JSONObject jSONObject) {
        return getJSONObject(str, jSONObject, getDefaultCacheDiskUtils());
    }

    public static JSONObject getJSONObject(String str, JSONObject jSONObject, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getJSONObject(str, jSONObject);
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator) {
        return (T) getParcelable(str, (Parcelable.Creator) creator, getDefaultCacheDiskUtils());
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator, CacheDiskUtils cacheDiskUtils) {
        return (T) cacheDiskUtils.getParcelable(str, creator);
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator, T t) {
        return (T) getParcelable(str, creator, t, getDefaultCacheDiskUtils());
    }

    public static <T> T getParcelable(String str, Parcelable.Creator<T> creator, T t, CacheDiskUtils cacheDiskUtils) {
        return (T) cacheDiskUtils.getParcelable(str, creator, t);
    }

    public static Object getSerializable(String str) {
        return getSerializable(str, getDefaultCacheDiskUtils());
    }

    public static Object getSerializable(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getSerializable(str);
    }

    public static Object getSerializable(String str, Object obj) {
        return getSerializable(str, obj, getDefaultCacheDiskUtils());
    }

    public static Object getSerializable(String str, Object obj, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getSerializable(str, obj);
    }

    public static String getString(String str) {
        return getString(str, getDefaultCacheDiskUtils());
    }

    public static String getString(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getString(str);
    }

    public static String getString(String str, String str2) {
        return getString(str, str2, getDefaultCacheDiskUtils());
    }

    public static String getString(String str, String str2, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.getString(str, str2);
    }

    public static void m6888put(String str, Bitmap bitmap) {
        m6891put(str, bitmap, getDefaultCacheDiskUtils());
    }

    public static void m6889put(String str, Bitmap bitmap, int i) {
        m6890put(str, bitmap, i, getDefaultCacheDiskUtils());
    }

    public static void m6890put(String str, Bitmap bitmap, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6921put(str, bitmap, i);
    }

    public static void m6891put(String str, Bitmap bitmap, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6920put(str, bitmap);
    }

    public static void m6892put(String str, Drawable drawable) {
        m6895put(str, drawable, getDefaultCacheDiskUtils());
    }

    public static void m6893put(String str, Drawable drawable, int i) {
        m6894put(str, drawable, i, getDefaultCacheDiskUtils());
    }

    public static void m6894put(String str, Drawable drawable, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6923put(str, drawable, i);
    }

    public static void m6895put(String str, Drawable drawable, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6922put(str, drawable);
    }

    public static void m6896put(String str, Parcelable parcelable) {
        m6899put(str, parcelable, getDefaultCacheDiskUtils());
    }

    public static void m6897put(String str, Parcelable parcelable, int i) {
        m6898put(str, parcelable, i, getDefaultCacheDiskUtils());
    }

    public static void m6898put(String str, Parcelable parcelable, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6925put(str, parcelable, i);
    }

    public static void m6899put(String str, Parcelable parcelable, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6924put(str, parcelable);
    }

    public static void m6900put(String str, Serializable serializable) {
        m6903put(str, serializable, getDefaultCacheDiskUtils());
    }

    public static void m6901put(String str, Serializable serializable, int i) {
        m6902put(str, serializable, i, getDefaultCacheDiskUtils());
    }

    public static void m6902put(String str, Serializable serializable, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6927put(str, serializable, i);
    }

    public static void m6903put(String str, Serializable serializable, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6926put(str, serializable);
    }

    public static void m6904put(String str, String str2) {
        m6907put(str, str2, getDefaultCacheDiskUtils());
    }

    public static void m6905put(String str, String str2, int i) {
        m6906put(str, str2, i, getDefaultCacheDiskUtils());
    }

    public static void m6906put(String str, String str2, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6929put(str, str2, i);
    }

    public static void m6907put(String str, String str2, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6928put(str, str2);
    }

    public static void m6908put(String str, JSONArray jSONArray) {
        m6911put(str, jSONArray, getDefaultCacheDiskUtils());
    }

    public static void m6909put(String str, JSONArray jSONArray, int i) {
        m6910put(str, jSONArray, i, getDefaultCacheDiskUtils());
    }

    public static void m6910put(String str, JSONArray jSONArray, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6931put(str, jSONArray, i);
    }

    public static void m6911put(String str, JSONArray jSONArray, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6930put(str, jSONArray);
    }

    public static void m6912put(String str, JSONObject jSONObject) {
        m6915put(str, jSONObject, getDefaultCacheDiskUtils());
    }

    public static void m6913put(String str, JSONObject jSONObject, int i) {
        m6914put(str, jSONObject, i, getDefaultCacheDiskUtils());
    }

    public static void m6914put(String str, JSONObject jSONObject, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6933put(str, jSONObject, i);
    }

    public static void m6915put(String str, JSONObject jSONObject, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6932put(str, jSONObject);
    }

    public static void m6916put(String str, byte[] bArr) {
        m6919put(str, bArr, getDefaultCacheDiskUtils());
    }

    public static void m6917put(String str, byte[] bArr, int i) {
        m6918put(str, bArr, i, getDefaultCacheDiskUtils());
    }

    public static void m6918put(String str, byte[] bArr, int i, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6935put(str, bArr, i);
    }

    public static void m6919put(String str, byte[] bArr, CacheDiskUtils cacheDiskUtils) {
        cacheDiskUtils.m6934put(str, bArr);
    }

    public static boolean remove(String str) {
        return remove(str, getDefaultCacheDiskUtils());
    }

    public static boolean remove(String str, CacheDiskUtils cacheDiskUtils) {
        return cacheDiskUtils.remove(str);
    }

    public static void setDefaultCacheDiskUtils(CacheDiskUtils cacheDiskUtils) {
        sDefaultCacheDiskUtils = cacheDiskUtils;
    }
}
