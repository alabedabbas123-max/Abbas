package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ClassX {

    public static final ClassX f4564a = new ClassX();

    public void m6844a(Context context, JSONObject jSONObject) {
        ba.m6312c().m6300a("startDataAnynalyzed start");
        m6834a(jSONObject);
        ClassW c1523wM6814a = ClassW.m6814a(context);
        boolean zM6820a = c1523wM6814a.m6820a();
        ba.m6312c().m6300a("is data collect closed:" + zM6820a);
        if (!zM6820a) {
            if (!Enumk.f4519a.m6781b(context, 10000)) {
                m6836c(context);
            }
            String str = android.os.Build.MANUFACTURER;
            int i = android.os.Build.VERSION.SDK_INT;
            boolean z = false;
            if (!TextUtils.isEmpty(str) && "huawei".equals(str.trim().toLowerCase()) && i >= 28) {
                z = true;
            }
            if (!Enumk.f4520b.m6781b(context, 10000) && !z) {
                m6837d(context);
            }
            if (!Enumk.f4521c.m6781b(context, 10000) && !z) {
                m6838e(context);
            }
            if (ClassZ.f4575e && !Enumk.f4523e.m6781b(context, 10000) && !z) {
                m6839f(context);
            }
            boolean zM6579q = bw.m6579q(context);
            if (zM6579q && c1523wM6814a.m6833l()) {
                ba.m6312c().m6300a("sendLog");
                m6840g(context);
            } else if (!zM6579q) {
                ba.m6312c().m6300a("isWifiAvailable = false, will not sendLog");
            } else {
                ba.m6312c().m6300a("can not sendLog due to time stratergy");
            }
        }
        ba.m6312c().m6300a("startDataAnynalyzed finished");
    }

    private void m6834a(JSONObject jSONObject) {
        aa c1410aa = new aa(jSONObject);
        ClassZ.f4572b = c1410aa.f4026a;
        ClassZ.f4573c = c1410aa.f4027b;
        ClassZ.f4574d = c1410aa.f4028c;
    }

    private void m6836c(Context context) {
        ba.m6312c().m6300a("collectAPWithStretegy 1");
        ClassW c1523wM6814a = ClassW.m6814a(context);
        long jM6817a = c1523wM6814a.m6817a(Enumg.AP_LIST);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM6826e = c1523wM6814a.m6826e();
        ba.m6312c().m6300a("now time: " + jCurrentTimeMillis + ": last time: " + jM6817a + "; time interval: " + jM6826e);
        if (jM6817a == 0 || jCurrentTimeMillis - jM6817a > jM6826e) {
            ba.m6312c().m6300a("collectAPWithStretegy 2");
            ClassC.m6597a(context);
        }
    }

    private void m6837d(Context context) {
        ba.m6312c().m6300a("collectAPPListWithStretegy 1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ClassW c1523wM6814a = ClassW.m6814a(context);
        long jM6817a = c1523wM6814a.m6817a(Enumg.APP_USER_LIST);
        long jM6827f = c1523wM6814a.m6827f();
        ba.m6312c().m6300a("now time: " + jCurrentTimeMillis + ": last time: " + jM6817a + "; userInterval : " + jM6827f);
        if (jM6817a == 0 || jCurrentTimeMillis - jM6817a > jM6827f || !c1523wM6814a.m6821a(jM6817a)) {
            ba.m6312c().m6300a("collectUserAPPListWithStretegy 2");
            ClassC.m6598a(context, false);
        }
        long jM6817a2 = c1523wM6814a.m6817a(Enumg.APP_SYS_LIST);
        long jM6828g = c1523wM6814a.m6828g();
        ba.m6312c().m6300a("now time: " + jCurrentTimeMillis + ": last time: " + jM6817a2 + "; sysInterval : " + jM6828g);
        if (jM6817a2 == 0 || jCurrentTimeMillis - jM6817a2 > jM6828g) {
            ba.m6312c().m6300a("collectSysAPPListWithStretegy 2");
            ClassC.m6598a(context, true);
        }
    }

    private void m6838e(Context context) {
        ba.m6312c().m6300a("collectAPPTraceWithStretegy 1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ClassW c1523wM6814a = ClassW.m6814a(context);
        long jM6817a = c1523wM6814a.m6817a(Enumg.APP_TRACE_HIS);
        long jM6830i = c1523wM6814a.m6830i();
        ba.m6312c().m6300a("now time: " + jCurrentTimeMillis + ": last time: " + jM6817a + "; time interval: " + jM6830i);
        if (jM6817a == 0 || jCurrentTimeMillis - jM6817a > jM6830i) {
            ba.m6312c().m6300a("collectAPPTraceWithStretegy 2");
            ClassC.m6600b(context, false);
        }
    }

    private void m6839f(Context context) {
        ba.m6312c().m6300a("collectAPKWithStretegy 1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ClassW c1523wM6814a = ClassW.m6814a(context);
        long jM6817a = c1523wM6814a.m6817a(Enumg.APP_APK);
        long jM6829h = c1523wM6814a.m6829h();
        ba.m6312c().m6300a("now time: " + jCurrentTimeMillis + ": last time: " + jM6817a + "; interval : " + jM6829h);
        if (jM6817a == 0 || jCurrentTimeMillis - jM6817a > jM6829h) {
            ba.m6312c().m6300a("collectAPKWithStretegy 2");
            ClassC.m6599b(context);
        }
    }

    public void m6843a(Context context, String str) {
        ClassW.m6814a(context).m6819a(str);
    }

    public void m6846b(Context context, String str) {
        ClassW.m6814a(context).m6822b(str);
    }

    public void m6842a(Context context, long j) {
        ClassW.m6814a(context).m6818a(Enumg.LAST_UPDATE, j);
    }

    private void m6840g(Context context) throws Throwable {
        ClassW.m6814a(context).m6818a(Enumg.LAST_SEND, System.currentTimeMillis());
        JSONObject jSONObjectM6757a = ClassH.m6757a(context);
        ba.m6312c().m6300a("header: " + jSONObjectM6757a);
        int i = 0;
        while (m6841h(context)) {
            int i2 = i + 1;
            if (i > 0) {
                ClassH.m6760c(jSONObjectM6757a);
            }
            m6835b(context, jSONObjectM6757a);
            i = i2;
        }
    }

    private boolean m6841h(Context context) {
        return (Enumk.f4519a.m6780b(context) && Enumk.f4520b.m6780b(context) && Enumk.f4521c.m6780b(context) && Enumk.f4522d.m6780b(context) && Enumk.f4523e.m6780b(context)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    private void m6835b(Context context, JSONObject jSONObject) {
        int length;
        int length2 = 0;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Config.HEADER_PART, jSONObject);
            length2 = 0 + jSONObject.toString().length();
        } catch (JSONException e) {
            ba.m6312c().m6302a(e);
        }
        ba.m6312c().m6300a("APP_MEM");
        if (ClassW.m6814a(context).m6823b()) {
            length = length2;
        } else {
            String strM6586x = bw.m6586x(context);
            JSONArray jSONArray = new JSONArray();
            ba.m6312c().m6300a(strM6586x);
            jSONArray.put(strM6586x);
            if (jSONArray.length() > 0) {
                try {
                    jSONObject2.put("app_mem3", jSONArray);
                    length = length2 + jSONArray.toString().length();
                } catch (JSONException e2) {
                    ba.m6312c().m6302a(e2);
                    length = length2;
                }
            } else {
                length = length2;
            }
        }
        ba.m6312c().m6300a("APP_APK");
        List<String> listM6779a = Enumk.f4523e.m6779a(context, 20480);
        JSONArray jSONArray2 = new JSONArray();
        for (String str : listM6779a) {
            ba.m6312c().m6300a(str);
            jSONArray2.put(str);
        }
        if (jSONArray2.length() > 0) {
            try {
                jSONObject2.put("app_apk3", jSONArray2);
                length += jSONArray2.toString().length();
            } catch (JSONException e3) {
                ba.m6312c().m6302a(e3);
            }
        }
        ba.m6312c().m6300a("APP_CHANGE");
        List<String> listM6779a2 = Enumk.f4522d.m6779a(context, 10240);
        JSONArray jSONArray3 = new JSONArray();
        for (String str2 : listM6779a2) {
            ba.m6312c().m6300a(str2);
            jSONArray3.put(str2);
        }
        if (jSONArray3.length() > 0) {
            try {
                jSONObject2.put("app_change3", jSONArray3);
                length += jSONArray3.toString().length();
            } catch (JSONException e4) {
                ba.m6312c().m6302a(e4);
            }
        }
        ba.m6312c().m6300a("APP_TRACE");
        List<String> listM6779a3 = Enumk.f4521c.m6779a(context, 15360);
        JSONArray jSONArray4 = new JSONArray();
        for (String str3 : listM6779a3) {
            ba.m6312c().m6300a(str3);
            jSONArray4.put(str3);
        }
        if (jSONArray4.length() > 0) {
            try {
                jSONObject2.put("app_trace3", jSONArray4);
                length += jSONArray4.toString().length();
            } catch (JSONException e5) {
                ba.m6312c().m6302a(e5);
            }
        }
        ba.m6312c().m6300a("APP_LIST");
        List<String> listM6779a4 = Enumk.f4520b.m6779a(context, 46080);
        JSONArray jSONArray5 = new JSONArray();
        for (String str4 : listM6779a4) {
            ba.m6312c().m6300a(str4);
            jSONArray5.put(str4);
        }
        if (jSONArray5.length() > 0) {
            try {
                jSONObject2.put("app_list3", jSONArray5);
                length += jSONArray5.toString().length();
            } catch (JSONException e6) {
                ba.m6312c().m6302a(e6);
            }
        }
        ba.m6312c().m6300a("AP_LIST");
        List<String> listM6779a5 = Enumk.f4519a.m6779a(context, Config.MAX_CACHE_JSON_CAPACITY - length);
        JSONArray jSONArray6 = new JSONArray();
        for (String str5 : listM6779a5) {
            ba.m6312c().m6300a(str5);
            jSONArray6.put(str5);
        }
        if (jSONArray6.length() > 0) {
            try {
                jSONObject2.put("ap_list3", jSONArray6);
                length += jSONArray6.toString().length();
            } catch (JSONException e7) {
                ba.m6312c().m6302a(e7);
            }
        }
        ba.m6312c().m6300a("log in bytes is almost :" + length);
        JSONArray jSONArray7 = new JSONArray();
        jSONArray7.put(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("payload", jSONArray7);
            ClassR.m6793a().m6803a(context, jSONObject3.toString());
        } catch (Exception e8) {
            ba.m6312c().m6302a(e8);
        }
    }

    public boolean m6845a(Context context) {
        if (!bw.m6551c().booleanValue()) {
            return false;
        }
        ClassW c1523wM6814a = ClassW.m6814a(context);
        long jM6817a = c1523wM6814a.m6817a(Enumg.LAST_UPDATE);
        long jM6824c = c1523wM6814a.m6824c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jM6817a > jM6824c) {
            ba.m6312c().m6300a("need to update, checkWithLastUpdateTime lastUpdateTime =" + jM6817a + "nowTime=" + jCurrentTimeMillis + ";timeInteveral=" + jM6824c);
            return true;
        }
        ba.m6312c().m6300a("no need to update, checkWithLastUpdateTime lastUpdateTime =" + jM6817a + "nowTime=" + jCurrentTimeMillis + ";timeInteveral=" + jM6824c);
        return false;
    }

    public boolean m6847b(Context context) {
        return !ClassW.m6814a(context).m6820a() || m6845a(context);
    }
}
