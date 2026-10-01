package com.baidu.mobstat;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class ExtraInfo {

    String f3910a = "";

    String f3911b = "";

    String f3912c = "";

    String f3913d = "";

    String f3914e = "";

    String f3915f = "";

    String f3916g = "";

    String f3917h = "";

    String f3918i = "";

    String f3919j = "";

    private static boolean m5888a(String str, int i) {
        int length;
        if (str == null) {
            return false;
        }
        try {
            length = str.getBytes().length;
        } catch (Exception e) {
            length = 0;
        }
        return length > i;
    }

    private static String m5887a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (m5888a(str, 1024)) {
            return "";
        }
        return str;
    }

    public String getV1() {
        return this.f3910a;
    }

    public void setV1(String str) {
        this.f3910a = m5887a(str);
    }

    public String getV2() {
        return this.f3911b;
    }

    public void setV2(String str) {
        this.f3911b = m5887a(str);
    }

    public String getV3() {
        return this.f3912c;
    }

    public void setV3(String str) {
        this.f3912c = m5887a(str);
    }

    public String getV4() {
        return this.f3913d;
    }

    public void setV4(String str) {
        this.f3913d = m5887a(str);
    }

    public String getV5() {
        return this.f3914e;
    }

    public void setV5(String str) {
        this.f3914e = m5887a(str);
    }

    public String getV6() {
        return this.f3915f;
    }

    public void setV6(String str) {
        this.f3915f = m5887a(str);
    }

    public String getV7() {
        return this.f3916g;
    }

    public void setV7(String str) {
        this.f3916g = m5887a(str);
    }

    public String getV8() {
        return this.f3917h;
    }

    public void setV8(String str) {
        this.f3917h = m5887a(str);
    }

    public String getV9() {
        return this.f3918i;
    }

    public void setV9(String str) {
        this.f3918i = m5887a(str);
    }

    public String getV10() {
        return this.f3919j;
    }

    public void setV10(String str) {
        this.f3919j = m5887a(str);
    }

    public JSONObject dumpToJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f3910a)) {
                jSONObject.put("v1", this.f3910a);
            }
            if (!TextUtils.isEmpty(this.f3911b)) {
                jSONObject.put("v2", this.f3911b);
            }
            if (!TextUtils.isEmpty(this.f3912c)) {
                jSONObject.put("v3", this.f3912c);
            }
            if (!TextUtils.isEmpty(this.f3913d)) {
                jSONObject.put("v4", this.f3913d);
            }
            if (!TextUtils.isEmpty(this.f3914e)) {
                jSONObject.put("v5", this.f3914e);
            }
            if (!TextUtils.isEmpty(this.f3915f)) {
                jSONObject.put("v6", this.f3915f);
            }
            if (!TextUtils.isEmpty(this.f3916g)) {
                jSONObject.put("v7", this.f3916g);
            }
            if (!TextUtils.isEmpty(this.f3917h)) {
                jSONObject.put("v8", this.f3917h);
            }
            if (!TextUtils.isEmpty(this.f3918i)) {
                jSONObject.put("v9", this.f3918i);
            }
            if (!TextUtils.isEmpty(this.f3919j)) {
                jSONObject.put("v10", this.f3919j);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
