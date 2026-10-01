package com.baidu.mobstat;

import android.content.Context;
import android.content.SharedPreferences;

class ac extends Abstractbm {

    private static final String f4032a = "baidu_mtj_sdk_record";

    private static ac f4033b = new ac();

    private ac() {
    }

    public static ac m5952a() {
        return f4033b;
    }

    @Override
    public SharedPreferences mo5953a(Context context) {
        return context.getSharedPreferences(f4032a, 0);
    }

    public void m5954a(Context context, long j) {
        m6450b(context, "session_first_visit_time", j);
    }

    public Long m5956b(Context context) {
        return Long.valueOf(m6446a(context, "session_first_visit_time", 0L));
    }

    public void m5957b(Context context, long j) {
        m6450b(context, "session_last_visit_time", j);
    }

    public Long m5959c(Context context) {
        return Long.valueOf(m6446a(context, "session_last_visit_time", 0L));
    }

    public void m5960c(Context context, long j) {
        m6450b(context, "session_visit_interval", j);
    }

    public Long m5961d(Context context) {
        return Long.valueOf(m6446a(context, "session_visit_interval", 0L));
    }

    public void m5955a(Context context, String str) {
        m6451b(context, "session_today_visit_count", str);
    }

    public String m5962e(Context context) {
        return m6447a(context, "session_today_visit_count", "");
    }

    public void m5958b(Context context, String str) {
        m6451b(context, "session_recent_visit", str);
    }

    public String m5963f(Context context) {
        return m6447a(context, "session_recent_visit", "");
    }
}
