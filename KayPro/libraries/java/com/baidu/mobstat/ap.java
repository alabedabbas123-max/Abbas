package com.baidu.mobstat;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class ap {

    private String f4134a;

    private String f4135b;

    private JSONArray f4136c;

    private String f4137d;

    private String f4138e;

    private String f4139f;

    private boolean f4140g;

    private long f4141h;

    private long f4142i;

    private long f4143j;

    private int f4144k;

    private String f4145l;

    private String f4146m;

    private String f4147n;

    private JSONArray f4148o;

    public ap(String str, String str2, JSONArray jSONArray, String str3, String str4, String str5, String str6, boolean z, int i, long j, long j2, long j3, String str7, String str8, JSONArray jSONArray2) {
        this.f4134a = str;
        this.f4135b = str2;
        this.f4136c = jSONArray;
        this.f4137d = str3;
        this.f4138e = str5;
        this.f4139f = str6;
        this.f4140g = z;
        this.f4144k = i;
        this.f4141h = j;
        this.f4142i = j2;
        this.f4143j = j3;
        this.f4145l = str7;
        this.f4146m = str8;
        this.f4147n = str4;
        this.f4148o = jSONArray2;
    }

    public String m6089a() {
        return this.f4134a;
    }

    public String m6094b() {
        return this.f4135b;
    }

    public JSONArray m6097c() {
        return this.f4136c;
    }

    public String m6098d() {
        return this.f4137d;
    }

    public String m6099e() {
        return this.f4138e;
    }

    public String m6100f() {
        return this.f4139f;
    }

    public boolean m6101g() {
        return this.f4140g;
    }

    public int m6102h() {
        return this.f4144k;
    }

    public long m6103i() {
        return this.f4141h;
    }

    public void m6091a(int i) {
        this.f4144k = i;
    }

    public long m6104j() {
        return this.f4142i;
    }

    public long m6105k() {
        return this.f4143j;
    }

    public void m6092a(long j) {
        this.f4142i = j;
    }

    public void m6095b(long j) {
        this.f4143j = j;
    }

    public String m6106l() {
        return this.f4145l;
    }

    public void m6093a(String str) {
        this.f4145l = str;
    }

    public void m6096b(String str) {
        this.f4146m = str;
    }

    public JSONObject m6090a(String str, String str2, String str3) {
        String strM6088a = m6088a(this.f4134a, this.f4135b, this.f4136c, this.f4137d, this.f4138e, this.f4139f, this.f4140g);
        if (TextUtils.isEmpty(strM6088a)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4134a);
            jSONObject.put("d", this.f4145l);
            jSONObject.put("p", str);
            jSONObject.put(Config.FEED_LIST_ITEM_PATH, str3);
            jSONObject.put("v5", (this.f4148o == null || this.f4148o.length() == 0) ? "" : this.f4148o);
            jSONObject.put(Config.FEED_LIST_ITEM_TITLE, this.f4137d);
            jSONObject.put("content", this.f4147n);
            jSONObject.put(Config.FEED_LIST_ITEM_INDEX, this.f4138e);
            jSONObject.put("n", str2);
            jSONObject.put("user", this.f4140g ? 1 : 0);
            jSONObject.put("c", this.f4144k);
            jSONObject.put("t", this.f4141h);
            jSONObject.put("ps", this.f4146m);
            jSONObject.put("sign", strM6088a);
        } catch (Exception e) {
            jSONObject = null;
        }
        return jSONObject;
    }

    public static String m6088a(String str, String str2, JSONArray jSONArray, String str3, String str4, String str5, boolean z) {
        String string = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", str);
            jSONObject.put("p", str2);
            jSONObject.put(Config.FEED_LIST_ITEM_PATH, jSONArray);
            jSONObject.put(Config.FEED_LIST_ITEM_TITLE, str3);
            jSONObject.put(Config.FEED_LIST_ITEM_INDEX, str4);
            jSONObject.put("n", str5);
            jSONObject.put("user", z ? 1 : 0);
            string = jSONObject.toString();
        } catch (Exception e) {
        }
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return bs.a.m6519a(string.getBytes());
    }
}
