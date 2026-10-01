package com.baidu.mobstat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.baidu.android.common.util.DeviceId;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ClassH {
    public static JSONObject m6757a(Context context) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", android.os.Build.VERSION.SDK_INT);
            jSONObject.put("sv", android.os.Build.VERSION.RELEASE);
            String strM6531c = bu.m6524a().m6531c();
            if (TextUtils.isEmpty(strM6531c)) {
                strM6531c = bw.m6540a(2, context);
            }
            jSONObject.put(Config.CUID_SEC, strM6531c);
            jSONObject.put(Config.DEVICE_WIDTH, bw.m6550c(context));
            jSONObject.put("h", bw.m6554d(context));
            jSONObject.put("ly", ClassZ.f4573c);
            jSONObject.put("pv", "35");
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                jSONObject.put(Config.PACKAGE_NAME, bw.m6575n(2, context));
                jSONObject.put(Config.APP_VERSION_CODE, packageInfo.versionCode);
                jSONObject.put("n", packageInfo.versionName);
            } catch (Exception e) {
                ba.m6312c().m6302a(e);
            }
            jSONObject.put(Config.DEVICE_MAC_ID, bw.m6563h(2, context));
            jSONObject.put(Config.DEVICE_BLUETOOTH_MAC, bw.m6571l(2, context));
            jSONObject.put(Config.MODEL, android.os.Build.MODEL);
            jSONObject.put(Config.DEVICE_NAME, bw.m6542a(context, 2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Config.TRACE_FAILED_CNT, 0);
            jSONObject2.put("send_index", 0);
            String strM6545b = bw.m6545b();
            if (strM6545b == null) {
                strM6545b = "";
            }
            jSONObject2.put(Config.f3882ROM, strM6545b);
            jSONObject.put(Config.TRACE_PART, jSONObject2);
            jSONObject.put(Config.DEVICE_IMEI, bw.m6587y(context));
            jSONObject.put(Config.OAID, bw.m6546b(2, context));
            jSONObject.put(Config.OUT_OAID, bw.m6552c(2, context));
            jSONObject.put(Config.FROM, DeviceId.CUIDInfo.I_EMPTY);
            jSONObject.put(Config.GAID, bw.m6558e(2, context));
            jSONObject.put(Config.f3880IID, bw.m6556d(2, context));
            jSONObject.put(Config.CUID3, bw.m6560f(2, context));
            jSONObject.put(Config.SSAID, bw.m6561g(2, context));
        } catch (JSONException e2) {
            ba.m6312c().m6305b(e2);
        }
        return jSONObject;
    }

    public static JSONObject m6758a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.get("payload");
            JSONObject jSONObject3 = (jSONArray == null || jSONArray.length() <= 0) ? null : (JSONObject) jSONArray.get(0);
            jSONObject2 = jSONObject3 != null ? jSONObject3.getJSONObject(Config.HEADER_PART) : null;
        } catch (Exception e) {
            jSONObject2 = null;
        }
        return jSONObject2;
    }

    public static void m6759b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Config.TRACE_PART);
            jSONObject2.put(Config.TRACE_FAILED_CNT, jSONObject2.getLong(Config.TRACE_FAILED_CNT) + 1);
        } catch (Exception e) {
        }
    }

    public static void m6760c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Config.TRACE_PART);
            jSONObject2.put("send_index", jSONObject2.getLong("send_index") + 1);
        } catch (Exception e) {
        }
    }
}
