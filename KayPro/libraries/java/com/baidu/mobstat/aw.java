package com.baidu.mobstat;

import android.text.TextUtils;
import org.json.JSONObject;

public class aw {

    private static final aw f4272c = new aw();

    private boolean f4273a = false;

    private volatile boolean f4274b;

    public static aw m6265a() {
        return f4272c;
    }

    public void m6266a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = (JSONObject) new JSONObject(str).opt("full");
                this.f4273a = (jSONObject != null ? jSONObject.optInt("close") : 0) != 0;
            } catch (Exception e) {
            }
            this.f4274b = true;
        }
    }

    public boolean m6267b() {
        return this.f4273a;
    }
}
