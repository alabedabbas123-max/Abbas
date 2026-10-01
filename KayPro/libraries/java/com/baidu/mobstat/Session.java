package com.baidu.mobstat;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Session {

    private volatile long f3992a = 0;

    private volatile long f3993b = 0;

    private volatile long f3994c = 0;

    private volatile long f3995d = 0;

    private volatile long f3996e = 0;

    private volatile int f3997f = 0;

    private List<C1407a> f3998g = new ArrayList();

    private volatile JSONObject f3999h = null;

    public void reset() {
        this.f3992a = 0L;
        this.f3993b = 0L;
        this.f3994c = 0L;
        this.f3995d = 0L;
        this.f3997f = 0;
        this.f3998g.clear();
    }

    public void setTrackStartTime(long j) {
        if (this.f3994c <= 0) {
            this.f3994c = j;
        }
    }

    public long getTrackStartTime() {
        return this.f3994c;
    }

    public long getTrackEndTime() {
        return this.f3995d;
    }

    public void setTrackEndTime(long j) {
        this.f3995d = j;
    }

    public void setInvokeType(int i) {
        this.f3997f = i;
    }

    public void addPageView(String str, String str2, String str3, long j, long j2, boolean z, ExtraInfo extraInfo, boolean z2) {
        m5915a(this.f3998g, new C1407a(str, str2, str3, j, j2, z, extraInfo, z2));
    }

    public void addPageView(C1407a c1407a) {
        m5915a(this.f3998g, c1407a);
    }

    private void m5915a(List<C1407a> list, C1407a c1407a) {
        if (list != null && c1407a != null) {
            try {
                int size = list.size();
                if (size == 0) {
                    list.add(c1407a);
                } else {
                    C1407a c1407a2 = list.get(size - 1);
                    if (TextUtils.isEmpty(c1407a2.f4000a) || TextUtils.isEmpty(c1407a.f4000a) || !c1407a2.f4000a.equals(c1407a.f4000a) || c1407a2.f4005f == c1407a.f4005f) {
                        list.add(c1407a);
                    } else if (c1407a2.f4005f) {
                        c1407a2.m5920a(c1407a);
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    public void setStartTime(long j) {
        if (this.f3992a <= 0) {
            this.f3992a = j;
            this.f3996e = j;
        }
    }

    public long getStartTime() {
        return this.f3992a;
    }

    public boolean hasStart() {
        return this.f3992a > 0;
    }

    public boolean hasEnd() {
        return this.f3993b > 0;
    }

    public void setEndTime(long j) {
        this.f3993b = j;
    }

    public void setLaunchInfo(JSONObject jSONObject) {
        this.f3999h = jSONObject;
    }

    public JSONObject constructJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", this.f3992a);
            jSONObject.put("e", this.f3993b);
            jSONObject.put("i", this.f3996e);
            jSONObject.put("c", 1);
            jSONObject.put(Config.SESSTION_TRACK_START_TIME, this.f3994c == 0 ? this.f3992a : this.f3994c);
            jSONObject.put(Config.SESSTION_TRACK_END_TIME, this.f3995d == 0 ? this.f3993b : this.f3995d);
            jSONObject.put(Config.SESSTION_TRIGGER_CATEGORY, this.f3997f);
            if (this.f3999h != null && this.f3999h.length() != 0) {
                jSONObject.put(Config.LAUNCH, this.f3999h);
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f3998g.size(); i++) {
                jSONArray.put(getPVJson(this.f3998g.get(i), this.f3992a));
            }
            jSONObject.put("p", jSONArray);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public JSONObject getPageSessionHead() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", this.f3992a);
            jSONObject.put("e", this.f3993b);
            jSONObject.put("i", this.f3996e);
            jSONObject.put("c", 1);
            jSONObject.put(Config.SESSTION_TRACK_START_TIME, this.f3994c == 0 ? this.f3992a : this.f3994c);
            jSONObject.put(Config.SESSTION_TRACK_END_TIME, this.f3995d == 0 ? this.f3993b : this.f3995d);
            jSONObject.put(Config.SESSTION_TRIGGER_CATEGORY, this.f3997f);
        } catch (Exception e) {
        }
        return jSONObject;
    }

    public String toString() {
        return constructJSONObject().toString();
    }

    public static JSONObject getPVJson(C1407a c1407a, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", c1407a.m5919a());
            jSONObject.put("d", c1407a.m5922c());
            long jM5923d = c1407a.m5923d() - j;
            jSONObject.put("ps", jM5923d >= 0 ? jM5923d : 0L);
            jSONObject.put("t", c1407a.m5921b());
            jSONObject.put("at", c1407a.m5925f() ? 1 : 0);
            JSONObject jSONObjectM5924e = c1407a.m5924e();
            if (jSONObjectM5924e != null && jSONObjectM5924e.length() != 0) {
                jSONObject.put("ext", jSONObjectM5924e);
            }
            jSONObject.put("h5", c1407a.f4007h ? 1 : 0);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    static class C1407a {

        private String f4000a;

        private String f4001b;

        private String f4002c;

        private long f4003d;

        private long f4004e;

        private boolean f4005f;

        private JSONObject f4006g;

        private boolean f4007h;

        public C1407a(String str, String str2, String str3, long j, long j2, boolean z, ExtraInfo extraInfo, boolean z2) {
            this.f4001b = str;
            this.f4002c = str2;
            this.f4000a = str3;
            this.f4003d = j;
            this.f4004e = j2;
            this.f4005f = z;
            this.f4006g = extraInfo != null ? extraInfo.dumpToJson() : new JSONObject();
            this.f4007h = z2;
        }

        public String m5919a() {
            return this.f4001b;
        }

        public String m5921b() {
            return this.f4002c;
        }

        public long m5922c() {
            return this.f4003d;
        }

        public long m5923d() {
            return this.f4004e;
        }

        public JSONObject m5924e() {
            return this.f4006g;
        }

        public boolean m5925f() {
            return this.f4005f;
        }

        public void m5920a(C1407a c1407a) {
            this.f4000a = c1407a.f4000a;
            this.f4001b = c1407a.f4001b;
            this.f4002c = c1407a.f4002c;
            this.f4003d = c1407a.f4003d;
            this.f4004e = c1407a.f4004e;
            this.f4005f = c1407a.f4005f;
            this.f4006g = c1407a.f4006g;
            this.f4007h = c1407a.f4007h;
        }
    }
}
