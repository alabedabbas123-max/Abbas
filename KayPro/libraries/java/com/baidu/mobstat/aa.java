package com.baidu.mobstat;

import org.json.JSONException;
import org.json.JSONObject;

public class aa {

    public boolean f4026a;

    public String f4027b;

    public boolean f4028c;

    public aa() {
        this.f4026a = false;
        this.f4027b = "";
        this.f4028c = false;
    }

    public aa(JSONObject jSONObject) {
        this.f4026a = false;
        this.f4027b = "";
        this.f4028c = false;
        try {
            this.f4026a = jSONObject.getBoolean("SDK_BPLUS_SERVICE");
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
        }
        try {
            this.f4027b = jSONObject.getString("SDK_PRODUCT_LY");
        } catch (Exception e2) {
            ba.m6312c().m6305b(e2);
        }
        try {
            this.f4028c = jSONObject.getBoolean("SDK_LOCAL_SERVER");
        } catch (Exception e3) {
            ba.m6312c().m6305b(e3);
        }
    }

    public JSONObject m5949a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SDK_BPLUS_SERVICE", this.f4026a);
        } catch (JSONException e) {
            ba.m6312c().m6305b(e);
        }
        try {
            jSONObject.put("SDK_PRODUCT_LY", this.f4027b);
        } catch (JSONException e2) {
            ba.m6312c().m6305b(e2);
        }
        try {
            jSONObject.put("SDK_LOCAL_SERVER", this.f4028c);
        } catch (JSONException e3) {
            ba.m6312c().m6305b(e3);
        }
        return jSONObject;
    }
}
