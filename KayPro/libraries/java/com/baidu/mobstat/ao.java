package com.baidu.mobstat;

import org.json.JSONObject;

public class ao {

    private String f4129a;

    private long f4130b;

    private long f4131c;

    private boolean f4132d;

    private long f4133e;

    public ao(String str, long j, long j2, long j3, boolean z) {
        this.f4129a = str;
        this.f4130b = j;
        this.f4131c = j2;
        this.f4133e = j3;
        this.f4132d = z;
    }

    public void m6082a(long j) {
        this.f4131c = j;
    }

    public String m6080a() {
        return this.f4129a;
    }

    public long m6083b() {
        return this.f4130b;
    }

    public long m6085c() {
        return this.f4131c;
    }

    public boolean m6086d() {
        return this.f4132d;
    }

    public long m6087e() {
        return this.f4133e;
    }

    public void m6084b(long j) {
        this.f4133e = j;
    }

    public JSONObject m6081a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("s", this.f4130b);
            jSONObject.put("e", this.f4131c);
            jSONObject.put("user", this.f4132d ? 1 : 0);
            return jSONObject;
        } catch (Exception e) {
            return null;
        }
    }
}
