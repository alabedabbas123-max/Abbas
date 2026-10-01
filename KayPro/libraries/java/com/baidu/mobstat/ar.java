package com.baidu.mobstat;

import android.text.TextUtils;
import org.json.JSONObject;

public class ar {

    private static final ar f4149e = new ar();

    private boolean f4150a = false;

    private float f4151b = 50.0f;

    private long f4152c = 500;

    private volatile boolean f4153d;

    public static ar m6114a() {
        return f4149e;
    }

    public void m6115a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = (JSONObject) new JSONObject(str).opt("sv");
                if (jSONObject != null) {
                    int iOptInt = jSONObject.optInt("close");
                    String strOptString = jSONObject.optString("area");
                    String strOptString2 = jSONObject.optString("duration");
                    this.f4150a = iOptInt != 0;
                    if (!TextUtils.isEmpty(strOptString)) {
                        try {
                            this.f4151b = Float.valueOf(strOptString).floatValue();
                        } catch (Exception e) {
                        }
                    }
                    if (!TextUtils.isEmpty(strOptString2)) {
                        try {
                            this.f4152c = Long.valueOf(strOptString2).longValue();
                        } catch (Exception e2) {
                        }
                    }
                }
            } catch (Exception e3) {
            }
            this.f4153d = true;
        }
    }

    public boolean m6116b() {
        return this.f4150a;
    }

    public float m6117c() {
        float f = 0.0f;
        float f2 = this.f4151b;
        if (f2 >= 0.0f) {
            f = f2 > 100.0f ? 100.0f : f2;
        }
        return f / 100.0f;
    }

    public long m6118d() {
        return this.f4152c;
    }
}
