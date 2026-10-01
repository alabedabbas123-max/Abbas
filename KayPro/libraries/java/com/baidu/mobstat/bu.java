package com.baidu.mobstat;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class bu {

    private static volatile bu f4368b;

    private static final Pattern f4369c = Pattern.compile("\\s*|\t|\r|\n");

    private static boolean f4370i = true;

    private static boolean f4371j = false;

    private static OnAppBackgroundListener f4372k;

    private String f4376f;

    private String f4377g;

    private List<PermissionEnum> f4374d = new ArrayList();

    private String f4375e = "android.permission.APP_LIST";

    public final int f4373a = 100;

    private List<JSONObject> f4378h = new ArrayList();

    public static bu m6524a() {
        if (f4368b == null) {
            synchronized (bu.class) {
                if (f4368b == null) {
                    f4368b = new bu();
                }
            }
        }
        return f4368b;
    }

    public String m6529b() {
        return TextUtils.isEmpty(this.f4377g) ? "" : this.f4377g;
    }

    public void m6527a(String str) {
        this.f4377g = str;
    }

    public String m6531c() {
        if (TextUtils.isEmpty(this.f4376f)) {
            return "";
        }
        return bw.m6544a(f4369c.matcher(this.f4376f).replaceAll(""));
    }

    public boolean m6532d() {
        return m6528a(true);
    }

    public boolean m6528a(boolean z) {
        if (z) {
            return f4370i && !m6525e();
        }
        return f4370i;
    }

    public void m6530b(boolean z) {
        f4370i = z;
    }

    private boolean m6525e() {
        return f4372k != null ? f4372k.isBackground() : f4371j;
    }

    public void m6526a(OnAppBackgroundListener onAppBackgroundListener) {
        f4372k = onAppBackgroundListener;
    }
}
