package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

public class LaunchInfo {

    private String f3953a;

    private String f3954b;

    private String f3955c;

    public String getPushLandingPage() {
        if (TextUtils.isEmpty(this.f3953a)) {
            return "";
        }
        return this.f3953a;
    }

    public String getPushContent() {
        if (TextUtils.isEmpty(this.f3954b)) {
            return "";
        }
        return this.f3954b;
    }

    public String getRefererPkgName() {
        if (TextUtils.isEmpty(this.f3955c)) {
            return "";
        }
        return this.f3955c;
    }

    public void setPushInfo(String str, String str2) {
        this.f3953a = str;
        this.f3954b = bx.m6593a(str2, 1024);
    }

    public void setRefererPkgName(String str) {
        this.f3955c = str;
    }

    public int getLaunchType(Context context) {
        if (!TextUtils.isEmpty(this.f3953a)) {
            return 2;
        }
        String packageName = "";
        if (context != null) {
            packageName = context.getPackageName();
        }
        if (!TextUtils.isEmpty(this.f3955c) && !this.f3955c.equals(packageName)) {
            String strM6356a = bi.m6356a(context);
            if (!TextUtils.isEmpty(strM6356a)) {
                if (!this.f3955c.equals(strM6356a)) {
                    return 1;
                }
            } else if (!bi.m6368a(context, this.f3955c)) {
                return 1;
            }
        }
        return 0;
    }

    public static JSONObject getConvertedJson(int i, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", String.valueOf(i));
                if (str == null) {
                    str = "";
                }
                jSONObject.put(Config.LAUNCH_REFERER, str);
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put(Config.LAUNCH_INFO, str2);
                jSONObject.put("content", "");
                return jSONObject;
            } catch (Exception e) {
                return jSONObject;
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public static String getLauncherHomePkgName(Context context) {
        String strM6356a = bi.m6356a(context);
        if (TextUtils.isEmpty(strM6356a)) {
            return "";
        }
        return strM6356a;
    }
}
