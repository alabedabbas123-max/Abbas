package com.blankj.utilcode.util;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class SPUtils {
    private static final Map<String, SPUtils> SP_UTILS_MAP = new HashMap();

    private SharedPreferences f12sp;

    private SPUtils(String str) {
        this.f12sp = Utils.getApp().getSharedPreferences(str, 0);
    }

    private SPUtils(String str, int i) {
        this.f12sp = Utils.getApp().getSharedPreferences(str, i);
    }

    public static SPUtils getInstance() {
        return getInstance("", 0);
    }

    public static SPUtils getInstance(int i) {
        return getInstance("", i);
    }

    public static SPUtils getInstance(String str) {
        return getInstance(str, 0);
    }

    public static SPUtils getInstance(String str, int i) {
        if (isSpace(str)) {
            str = "spUtils";
        }
        SPUtils sPUtils = SP_UTILS_MAP.get(str);
        if (sPUtils == null) {
            synchronized (SPUtils.class) {
                sPUtils = SP_UTILS_MAP.get(str);
                if (sPUtils == null) {
                    sPUtils = new SPUtils(str, i);
                    SP_UTILS_MAP.put(str, sPUtils);
                }
            }
        }
        return sPUtils;
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public void clear(boolean z) {
        if (z) {
            this.f12sp.edit().clear().commit();
        } else {
            this.f12sp.edit().clear().apply();
        }
    }

    public boolean contains(String str) {
        return this.f12sp.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.f12sp.getAll();
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f12sp.getBoolean(str, z);
    }

    public float getFloat(String str) {
        return getFloat(str, -1.0f);
    }

    public float getFloat(String str, float f) {
        return this.f12sp.getFloat(str, f);
    }

    public int getInt(String str) {
        return getInt(str, -1);
    }

    public int getInt(String str, int i) {
        return this.f12sp.getInt(str, i);
    }

    public long getLong(String str) {
        return getLong(str, -1L);
    }

    public long getLong(String str, long j) {
        return this.f12sp.getLong(str, j);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public String getString(String str, String str2) {
        return this.f12sp.getString(str, str2);
    }

    public Set<String> getStringSet(String str) {
        return getStringSet(str, Collections.emptySet());
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return this.f12sp.getStringSet(str, set);
    }

    public void m61put(String str, float f) {
        m62put(str, f, false);
    }

    public void m62put(String str, float f, boolean z) {
        if (z) {
            this.f12sp.edit().putFloat(str, f).commit();
        } else {
            this.f12sp.edit().putFloat(str, f).apply();
        }
    }

    public void m63put(String str, int i) {
        m64put(str, i, false);
    }

    public void m64put(String str, int i, boolean z) {
        if (z) {
            this.f12sp.edit().putInt(str, i).commit();
        } else {
            this.f12sp.edit().putInt(str, i).apply();
        }
    }

    public void m65put(String str, long j) {
        m66put(str, j, false);
    }

    public void m66put(String str, long j, boolean z) {
        if (z) {
            this.f12sp.edit().putLong(str, j).commit();
        } else {
            this.f12sp.edit().putLong(str, j).apply();
        }
    }

    public void m67put(String str, String str2) {
        m68put(str, str2, false);
    }

    public void m68put(String str, String str2, boolean z) {
        if (z) {
            this.f12sp.edit().putString(str, str2).commit();
        } else {
            this.f12sp.edit().putString(str, str2).apply();
        }
    }

    public void m69put(String str, Set<String> set) {
        m70put(str, set, false);
    }

    public void m70put(String str, Set<String> set, boolean z) {
        if (z) {
            this.f12sp.edit().putStringSet(str, set).commit();
        } else {
            this.f12sp.edit().putStringSet(str, set).apply();
        }
    }

    public void m71put(String str, boolean z) {
        m72put(str, z, false);
    }

    public void m72put(String str, boolean z, boolean z2) {
        if (z2) {
            this.f12sp.edit().putBoolean(str, z).commit();
        } else {
            this.f12sp.edit().putBoolean(str, z).apply();
        }
    }

    public void remove(String str) {
        remove(str, false);
    }

    public void remove(String str, boolean z) {
        if (z) {
            this.f12sp.edit().remove(str).commit();
        } else {
            this.f12sp.edit().remove(str).apply();
        }
    }
}
