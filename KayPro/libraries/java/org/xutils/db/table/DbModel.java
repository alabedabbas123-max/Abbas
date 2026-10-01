package org.xutils.db.table;

import android.text.TextUtils;
import java.util.Date;
import java.util.HashMap;

public final class DbModel {
    private final HashMap<String, String> dataMap = new HashMap<>();

    public String getString(String str) {
        return this.dataMap.get(str);
    }

    public int getInt(String str, int i) {
        String str2 = this.dataMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Integer.valueOf(str2).intValue();
            } catch (Throwable th) {
                return i;
            }
        }
        return i;
    }

    public boolean getBoolean(String str) {
        String str2 = this.dataMap.get(str);
        if (str2 != null) {
            return str2.length() == 1 ? "1".equals(str2) : Boolean.valueOf(str2).booleanValue();
        }
        return false;
    }

    public double getDouble(String str, double d) {
        String str2 = this.dataMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Double.valueOf(str2).doubleValue();
            } catch (Throwable th) {
                return d;
            }
        }
        return d;
    }

    public float getFloat(String str, float f) {
        String str2 = this.dataMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Float.valueOf(str2).floatValue();
            } catch (Throwable th) {
                return f;
            }
        }
        return f;
    }

    public long getLong(String str, long j) {
        String str2 = this.dataMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            try {
                return Long.valueOf(str2).longValue();
            } catch (Throwable th) {
                return j;
            }
        }
        return j;
    }

    public Date getDate(String str, long j) {
        return new Date(getLong(str, j));
    }

    public java.sql.Date getSqlDate(String str, long j) {
        return new java.sql.Date(getLong(str, j));
    }

    public void m9073add(String str, String str2) {
        this.dataMap.put(str, str2);
    }

    public HashMap<String, String> getDataMap() {
        return this.dataMap;
    }

    public boolean isEmpty(String str) {
        return TextUtils.isEmpty(this.dataMap.get(str));
    }
}
