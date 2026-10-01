package com.blankj.utilcode.util;

import java.util.Map;
import java.util.Set;

public final class SPStaticUtils {
    private static SPUtils sDefaultSPUtils;

    public static void clear() {
        clear(getDefaultSPUtils());
    }

    public static void clear(SPUtils sPUtils) {
        sPUtils.clear();
    }

    public static void clear(boolean z) {
        clear(z, getDefaultSPUtils());
    }

    public static void clear(boolean z, SPUtils sPUtils) {
        sPUtils.clear(z);
    }

    public static boolean contains(String str) {
        return contains(str, getDefaultSPUtils());
    }

    public static boolean contains(String str, SPUtils sPUtils) {
        return sPUtils.contains(str);
    }

    public static Map<String, ?> getAll() {
        return getAll(getDefaultSPUtils());
    }

    public static Map<String, ?> getAll(SPUtils sPUtils) {
        return sPUtils.getAll();
    }

    public static boolean getBoolean(String str) {
        return getBoolean(str, getDefaultSPUtils());
    }

    public static boolean getBoolean(String str, SPUtils sPUtils) {
        return sPUtils.getBoolean(str);
    }

    public static boolean getBoolean(String str, boolean z) {
        return getBoolean(str, z, getDefaultSPUtils());
    }

    public static boolean getBoolean(String str, boolean z, SPUtils sPUtils) {
        return sPUtils.getBoolean(str, z);
    }

    private static SPUtils getDefaultSPUtils() {
        SPUtils sPUtils = sDefaultSPUtils;
        return sPUtils != null ? sPUtils : SPUtils.getInstance();
    }

    public static float getFloat(String str) {
        return getFloat(str, getDefaultSPUtils());
    }

    public static float getFloat(String str, float f) {
        return getFloat(str, f, getDefaultSPUtils());
    }

    public static float getFloat(String str, float f, SPUtils sPUtils) {
        return sPUtils.getFloat(str, f);
    }

    public static float getFloat(String str, SPUtils sPUtils) {
        return sPUtils.getFloat(str);
    }

    public static int getInt(String str) {
        return getInt(str, getDefaultSPUtils());
    }

    public static int getInt(String str, int i) {
        return getInt(str, i, getDefaultSPUtils());
    }

    public static int getInt(String str, int i, SPUtils sPUtils) {
        return sPUtils.getInt(str, i);
    }

    public static int getInt(String str, SPUtils sPUtils) {
        return sPUtils.getInt(str);
    }

    public static long getLong(String str) {
        return getLong(str, getDefaultSPUtils());
    }

    public static long getLong(String str, long j) {
        return getLong(str, j, getDefaultSPUtils());
    }

    public static long getLong(String str, long j, SPUtils sPUtils) {
        return sPUtils.getLong(str, j);
    }

    public static long getLong(String str, SPUtils sPUtils) {
        return sPUtils.getLong(str);
    }

    public static String getString(String str) {
        return getString(str, getDefaultSPUtils());
    }

    public static String getString(String str, SPUtils sPUtils) {
        return sPUtils.getString(str);
    }

    public static String getString(String str, String str2) {
        return getString(str, str2, getDefaultSPUtils());
    }

    public static String getString(String str, String str2, SPUtils sPUtils) {
        return sPUtils.getString(str, str2);
    }

    public static Set<String> getStringSet(String str) {
        return getStringSet(str, getDefaultSPUtils());
    }

    public static Set<String> getStringSet(String str, SPUtils sPUtils) {
        return sPUtils.getStringSet(str);
    }

    public static Set<String> getStringSet(String str, Set<String> set) {
        return getStringSet(str, set, getDefaultSPUtils());
    }

    public static Set<String> getStringSet(String str, Set<String> set, SPUtils sPUtils) {
        return sPUtils.getStringSet(str, set);
    }

    public static void m37put(String str, float f) {
        m38put(str, f, getDefaultSPUtils());
    }

    public static void m38put(String str, float f, SPUtils sPUtils) {
        sPUtils.m61put(str, f);
    }

    public static void m39put(String str, float f, boolean z) {
        m40put(str, f, z, getDefaultSPUtils());
    }

    public static void m40put(String str, float f, boolean z, SPUtils sPUtils) {
        sPUtils.m62put(str, f, z);
    }

    public static void m41put(String str, int i) {
        m42put(str, i, getDefaultSPUtils());
    }

    public static void m42put(String str, int i, SPUtils sPUtils) {
        sPUtils.m63put(str, i);
    }

    public static void m43put(String str, int i, boolean z) {
        m44put(str, i, z, getDefaultSPUtils());
    }

    public static void m44put(String str, int i, boolean z, SPUtils sPUtils) {
        sPUtils.m64put(str, i, z);
    }

    public static void m45put(String str, long j) {
        m46put(str, j, getDefaultSPUtils());
    }

    public static void m46put(String str, long j, SPUtils sPUtils) {
        sPUtils.m65put(str, j);
    }

    public static void m47put(String str, long j, boolean z) {
        m48put(str, j, z, getDefaultSPUtils());
    }

    public static void m48put(String str, long j, boolean z, SPUtils sPUtils) {
        sPUtils.m66put(str, j, z);
    }

    public static void m49put(String str, String str2) {
        m50put(str, str2, getDefaultSPUtils());
    }

    public static void m50put(String str, String str2, SPUtils sPUtils) {
        sPUtils.m67put(str, str2);
    }

    public static void m51put(String str, String str2, boolean z) {
        m52put(str, str2, z, getDefaultSPUtils());
    }

    public static void m52put(String str, String str2, boolean z, SPUtils sPUtils) {
        sPUtils.m68put(str, str2, z);
    }

    public static void m53put(String str, Set<String> set) {
        m54put(str, set, getDefaultSPUtils());
    }

    public static void m54put(String str, Set<String> set, SPUtils sPUtils) {
        sPUtils.m69put(str, set);
    }

    public static void m55put(String str, Set<String> set, boolean z) {
        m56put(str, set, z, getDefaultSPUtils());
    }

    public static void m56put(String str, Set<String> set, boolean z, SPUtils sPUtils) {
        sPUtils.m70put(str, set, z);
    }

    public static void m57put(String str, boolean z) {
        m58put(str, z, getDefaultSPUtils());
    }

    public static void m58put(String str, boolean z, SPUtils sPUtils) {
        sPUtils.m71put(str, z);
    }

    public static void m59put(String str, boolean z, boolean z2) {
        m60put(str, z, z2, getDefaultSPUtils());
    }

    public static void m60put(String str, boolean z, boolean z2, SPUtils sPUtils) {
        sPUtils.m72put(str, z, z2);
    }

    public static void remove(String str) {
        remove(str, getDefaultSPUtils());
    }

    public static void remove(String str, SPUtils sPUtils) {
        sPUtils.remove(str);
    }

    public static void remove(String str, boolean z) {
        remove(str, z, getDefaultSPUtils());
    }

    public static void remove(String str, boolean z, SPUtils sPUtils) {
        sPUtils.remove(str, z);
    }

    public static void setDefaultSPUtils(SPUtils sPUtils) {
        sDefaultSPUtils = sPUtils;
    }
}
