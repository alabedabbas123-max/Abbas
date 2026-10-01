package com.baidu.mobstat;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class bp extends Abstractbm {

    private static final String f4365a = "__Baidu_Stat_SDK_SendRem";

    private static bp f4366b = new bp();

    private bp() {
    }

    public static bp m6466a() {
        return f4366b;
    }

    @Override
    public SharedPreferences mo5953a(Context context) {
        return context.getSharedPreferences(f4365a, 0);
    }

    public void m6467a(Context context, int i) {
        m6449b(context, "sendLogtype", i);
    }

    public int m6471b(Context context) {
        return m6445a(context, "sendLogtype", 0);
    }

    public void m6472b(Context context, int i) {
        m6449b(context, "timeinterval", i);
    }

    public int m6476c(Context context) {
        return m6445a(context, "timeinterval", 1);
    }

    public void m6470a(Context context, boolean z) {
        m6452b(context, "onlywifi", z);
    }

    public boolean m6481d(Context context) {
        return m6448a(context, "onlywifi", false);
    }

    public void m6469a(Context context, String str) {
        m6451b(context, "device_id_1", str);
    }

    public String m6482e(Context context) {
        return m6447a(context, "device_id_1", (String) null);
    }

    public void m6474b(Context context, String str) {
        if (m6447a(context, "cuid", (String) null) != null) {
            m6453c(context, "cuid");
        }
        m6451b(context, "cuidsec_1", str);
        m6453c(context, "cuidsec_1");
        m6453c(context, "cuidsec_1");
        m6453c(context, "cuidsec_2");
    }

    public void m6479d(Context context, String str) {
        m6451b(context, "setchannelwithcodevalue", str);
    }

    public String m6484f(Context context) {
        return m6447a(context, "setchannelwithcodevalue", (String) null);
    }

    public void m6475b(Context context, boolean z) {
        m6452b(context, "setchannelwithcode", z);
    }

    public boolean m6487g(Context context) {
        return m6448a(context, "setchannelwithcode", false);
    }

    public void m6483e(Context context, String str) {
        m6451b(context, "mtjsdkmacss2_1", str);
    }

    public String m6488h(Context context) {
        return m6447a(context, "mtjsdkmacss2_1", (String) null);
    }

    public void m6478c(Context context, boolean z) {
        m6452b(context, "mtjtv", z);
    }

    public boolean m6491i(Context context) {
        return m6448a(context, "mtjtv", false);
    }

    public void m6485f(Context context, String str) {
        m6451b(context, "mtjsdkmacsstv_1", str);
    }

    public String m6492j(Context context) {
        return m6447a(context, "mtjsdkmacsstv_1", (String) null);
    }

    public void m6486g(Context context, String str) {
        m6451b(context, "he.ext", str);
    }

    public String m6494k(Context context) {
        return m6447a(context, "he.ext", (String) null);
    }

    public void m6489h(Context context, String str) {
        m6451b(context, "he.push", str);
    }

    public String m6496l(Context context) {
        return m6447a(context, "he.push", (String) null);
    }

    public void m6480d(Context context, boolean z) {
        m6452b(context, "mtjsdkmactrick", z);
    }

    public boolean m6499m(Context context) {
        return m6448a(context, "mtjsdkmactrick", true);
    }

    public void m6468a(Context context, long j) {
        m6450b(context, "autotrace_track_js_fetch_time", j);
    }

    public long m6500n(Context context) {
        return m6446a(context, "autotrace_track_js_fetch_time", 0L);
    }

    public void m6473b(Context context, long j) {
        m6450b(context, "autotrace_track_js_fetch_interval", j);
    }

    public long m6502o(Context context) {
        return m6446a(context, "autotrace_track_js_fetch_interval", 0L);
    }

    public void m6477c(Context context, long j) {
        m6450b(context, "autotrace_config_fetch_time", j);
    }

    public long m6504p(Context context) {
        return m6446a(context, "autotrace_config_fetch_time", 0L);
    }

    public void m6490i(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        m6451b(context, "custom_userid", str);
    }

    public String m6505q(Context context) {
        return m6447a(context, "custom_userid", "");
    }

    public void m6493j(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        m6451b(context, "last_custom_userid", str);
    }

    public String m6506r(Context context) {
        return m6447a(context, "last_custom_userid", "");
    }

    public void m6495k(Context context, String str) {
        m6451b(context, "scheme_time", str);
    }

    public String m6507s(Context context) {
        return m6447a(context, "scheme_time", "");
    }

    public void m6497l(Context context, String str) {
        m6451b(context, "encrypt_device_id", str);
    }

    public String m6508t(Context context) {
        return m6447a(context, "encrypt_device_id", "");
    }

    public void m6498m(Context context, String str) {
        m6451b(context, Config.USER_PROPERTY, str);
    }

    public String m6509u(Context context) {
        return m6447a(context, Config.USER_PROPERTY, "");
    }

    public void m6501n(Context context, String str) {
        m6451b(context, "out_oaid", str);
    }

    public String m6510v(Context context) {
        return m6447a(context, "out_oaid", "");
    }

    public void m6503o(Context context, String str) {
        m6451b(context, "api_oaid", str);
    }

    public String m6511w(Context context) {
        return m6447a(context, "api_oaid", "");
    }
}
