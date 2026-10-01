package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class ClassW {

    private static ClassW f4547a;

    private Context f4548b;

    private JSONObject f4549c = new JSONObject();

    private long f4550d = 24;

    private long f4551e = 0;

    private long f4552f = 0;

    private long f4553g = 0;

    private long f4554h = 5;

    private long f4555i = 24;

    private long f4556j = 15;

    private long f4557k = 15;

    private long f4558l = 30;

    private long f4559m = 12;

    private long f4560n = 1;

    private long f4561o = 24;

    private String f4562p = "";

    private String f4563q = "";

    public static ClassW m6814a(Context context) {
        if (f4547a == null) {
            synchronized (ClassW.class) {
                if (f4547a == null) {
                    f4547a = new ClassW(context);
                }
            }
        }
        return f4547a;
    }

    private ClassW(Context context) throws Throwable {
        this.f4548b = context;
        m6816m();
        m6831j();
        m6832k();
    }

    private void m6816m() throws Throwable {
        String strM6454a = bn.m6454a(this.f4548b, ClassY.f4568d);
        try {
            if (!TextUtils.isEmpty(strM6454a)) {
                this.f4549c = new JSONObject(strM6454a);
            }
        } catch (Exception e) {
        }
    }

    public boolean m6820a() {
        return this.f4551e != 0;
    }

    public boolean m6823b() {
        return this.f4552f != 0;
    }

    public long m6824c() {
        return this.f4550d * 60 * 60 * 1000;
    }

    public long m6825d() {
        return this.f4561o * 60 * 60 * 1000;
    }

    public long m6826e() {
        return this.f4554h * 60 * 1000;
    }

    public long m6827f() {
        return this.f4555i * 60 * 60 * 1000;
    }

    public long m6828g() {
        return this.f4556j * 24 * 60 * 60 * 1000;
    }

    public long m6829h() {
        return this.f4557k * 24 * 60 * 60 * 1000;
    }

    public long m6830i() {
        return this.f4559m * 60 * 60 * 1000;
    }

    public void m6831j() throws Throwable {
        try {
            String str = new String(bv.m6537b(false, bq.m6512a(), bo.m6463a(bn.m6454a(this.f4548b, ".config2").getBytes())));
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    this.f4551e = jSONObject.getLong("c");
                } catch (JSONException e) {
                    ba.m6312c().m6305b(e);
                }
                try {
                    this.f4554h = jSONObject.getLong("d");
                } catch (JSONException e2) {
                    ba.m6312c().m6305b(e2);
                }
                try {
                    this.f4555i = jSONObject.getLong("e");
                } catch (JSONException e3) {
                    ba.m6312c().m6305b(e3);
                }
                try {
                    this.f4556j = jSONObject.getLong("i");
                } catch (JSONException e4) {
                    ba.m6312c().m6305b(e4);
                }
                try {
                    this.f4550d = jSONObject.getLong("f");
                } catch (JSONException e5) {
                    ba.m6312c().m6305b(e5);
                }
                try {
                    this.f4561o = jSONObject.getLong("s");
                } catch (JSONException e6) {
                    ba.m6312c().m6305b(e6);
                }
                try {
                    this.f4557k = jSONObject.getLong("pk");
                } catch (JSONException e7) {
                    ba.m6312c().m6305b(e7);
                }
                try {
                    this.f4558l = jSONObject.getLong("at");
                } catch (JSONException e8) {
                    ba.m6312c().m6305b(e8);
                }
                try {
                    this.f4559m = jSONObject.getLong("as");
                } catch (JSONException e9) {
                    ba.m6312c().m6305b(e9);
                }
                try {
                    this.f4560n = jSONObject.getLong("ac");
                } catch (JSONException e10) {
                    ba.m6312c().m6305b(e10);
                }
                try {
                    this.f4552f = jSONObject.getLong(Config.DEVICE_MAC_ID);
                } catch (JSONException e11) {
                    ba.m6312c().m6305b(e11);
                }
                try {
                    this.f4553g = jSONObject.getLong("lsc");
                } catch (JSONException e12) {
                    ba.m6312c().m6305b(e12);
                }
            }
        } catch (Exception e13) {
            ba.m6312c().m6305b(e13);
        }
    }

    public void m6832k() throws Throwable {
        try {
            String str = new String(bv.m6537b(false, bq.m6512a(), bo.m6463a(bn.m6454a(this.f4548b, ".sign").getBytes())));
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    this.f4563q = jSONObject.getString("sign");
                } catch (Exception e) {
                    ba.m6312c().m6305b(e);
                }
                try {
                    this.f4562p = jSONObject.getString("ver");
                } catch (Exception e2) {
                    ba.m6312c().m6305b(e2);
                }
            }
        } catch (Exception e3) {
            ba.m6312c().m6305b(e3);
        }
    }

    public void m6819a(String str) throws Throwable {
        bn.m6456a(this.f4548b, ".config2", str, false);
        m6831j();
    }

    public void m6822b(String str) throws Throwable {
        bn.m6456a(this.f4548b, ".sign", str, false);
        m6832k();
    }

    public long m6817a(Enumg enumC1502g) {
        long j = enumC1502g.f4514j;
        try {
            String string = enumC1502g.toString();
            if (this.f4549c.has(string)) {
                j = this.f4549c.getLong(string);
            }
        } catch (Exception e) {
            ba.m6312c().m6302a(e);
        }
        return m6815b(j);
    }

    public void m6818a(Enumg enumC1502g, long j) {
        enumC1502g.f4514j = j;
        try {
            this.f4549c.put(enumC1502g.toString(), j);
        } catch (Exception e) {
            ba.m6312c().m6302a(e);
        }
        try {
            bn.m6456a(this.f4548b, ClassY.f4568d, this.f4549c.toString(), false);
        } catch (Exception e2) {
            ba.m6312c().m6302a(e2);
        }
    }

    public boolean m6833l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM6817a = m6817a(Enumg.LAST_SEND);
        long jM6825d = m6825d();
        ba.m6312c().m6300a("canSend now=" + jCurrentTimeMillis + ";lastSendTime=" + jM6817a + ";sendLogTimeInterval=" + jM6825d);
        return jCurrentTimeMillis - jM6817a > jM6825d || !m6821a(jM6817a);
    }

    public boolean m6821a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(Long.valueOf(j)).equals(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
    }

    private long m6815b(long j) {
        if (j - System.currentTimeMillis() > 0) {
            return 0L;
        }
        return j;
    }
}
