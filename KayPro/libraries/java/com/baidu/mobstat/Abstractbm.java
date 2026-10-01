package com.baidu.mobstat;

import android.content.Context;
import android.content.SharedPreferences;

public abstract class Abstractbm {
    public abstract SharedPreferences mo5953a(Context context);

    public boolean m6448a(Context context, String str, boolean z) {
        return mo5953a(context).getBoolean(str, z);
    }

    public void m6452b(Context context, String str, boolean z) {
        mo5953a(context).edit().putBoolean(str, z).commit();
    }

    public int m6445a(Context context, String str, int i) {
        return mo5953a(context).getInt(str, i);
    }

    public void m6449b(Context context, String str, int i) {
        mo5953a(context).edit().putInt(str, i).commit();
    }

    public long m6446a(Context context, String str, long j) {
        return mo5953a(context).getLong(str, j);
    }

    public void m6450b(Context context, String str, long j) {
        mo5953a(context).edit().putLong(str, j).commit();
    }

    public String m6447a(Context context, String str, String str2) {
        return mo5953a(context).getString(str, str2);
    }

    public void m6451b(Context context, String str, String str2) {
        mo5953a(context).edit().putString(str, str2).commit();
    }

    public void m6453c(Context context, String str) {
        mo5953a(context).edit().remove(str).commit();
    }
}
