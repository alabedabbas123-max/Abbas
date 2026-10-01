package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class bk {

    private static String f4354a;

    private WeakReference<WebView> f4355b;

    private WeakReference<Activity> f4356c;

    private JSONObject f4357d;

    private boolean f4358e;

    private boolean f4359f;

    public void m6435a(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            webView.loadUrl("javascript:" + str);
        }
    }

    @JavascriptInterface
    public void setViewportTreeToNative(String str) {
        if (bc.m6315c().mo6306b()) {
            bc.m6315c().m6300a("setViewportTreeToNative " + str);
        }
        f4354a = str;
    }

    public static String m6429a(Activity activity, WebView webView, Rect rect) {
        f4354a = "";
        m6433b(activity, webView, rect);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i >= 15) {
                return "";
            }
            try {
                Thread.sleep(20L);
            } catch (Exception e) {
            }
            if (!TextUtils.isEmpty(f4354a)) {
                return f4354a;
            }
            i = i2;
        }
    }

    private static void m6433b(Activity activity, final WebView webView, Rect rect) {
        int iM5969a;
        int i;
        int iM5969a2;
        int iM5969a3;
        if (rect != null) {
            iM5969a3 = ag.m5969a(activity, rect.left);
            iM5969a2 = ag.m5969a(activity, rect.top);
            int iM5969a4 = ag.m5969a(activity, rect.width());
            iM5969a = ag.m5969a(activity, rect.height());
            i = iM5969a4;
        } else {
            iM5969a = 0;
            i = 0;
            iM5969a2 = 0;
            iM5969a3 = 0;
        }
        final String str = "javascript:window._automtj.getViewportTree('android', '" + ("{\"x\": " + iM5969a3 + ", \"y\": " + iM5969a2 + ", \"w\": " + i + ", \"h\": " + iM5969a + ", \"sw\": " + ag.m5969a(activity, bi.m6383c(activity)) + ", \"sh\": " + ag.m5969a(activity, bi.m6391d(activity)) + "}") + "', 'window.WebViewInterface.setViewportTreeToNative')";
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl(str);
            }
        });
    }

    public void m6434a(Activity activity, WebView webView, String str, JSONObject jSONObject, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                this.f4359f = z;
                this.f4357d = jSONObject;
            }
            if (z) {
                bc.m6315c().m6300a("injectTrackJs circleConfig: " + jSONObject);
            }
            if (m6431a(webView, z)) {
                if (z) {
                    bc.m6315c().m6300a("injectTrackJs, no need to entry");
                    return;
                } else {
                    bg.m6342c().m6300a("injectTrackJs, no need to entry");
                    return;
                }
            }
            if (activity != null) {
                this.f4356c = new WeakReference<>(activity);
            }
            if (webView != null) {
                this.f4355b = new WeakReference<>(webView);
            }
            this.f4358e = z;
            String strM6428a = m6428a();
            if (TextUtils.isEmpty(strM6428a)) {
                strM6428a = new JSONObject().toString();
            }
            if (bc.m6315c().mo6306b() && this.f4359f) {
                bc.m6315c().m6300a("injectTrackJs h5Config: " + strM6428a);
            }
            if (bg.m6342c().mo6306b()) {
                bg.m6342c().m6300a("injectTrackJs h5Config: " + strM6428a);
            }
            String str2 = "(function(){var h5conf = {\"sdkAPI\": \"window.WebViewInterface.setEventToNative\", \"sdkType\": \"android\", \"events\": " + strM6428a + "};" + str + "})()";
            if (webView != null) {
                webView.loadUrl("javascript:" + str2);
            }
        }
    }

    private boolean m6431a(WebView webView, boolean z) {
        return (this.f4355b == null || this.f4355b.get() != webView || this.f4358e == z) ? false : true;
    }

    private String m6428a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("matchAll", 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("meta", jSONObject);
            return jSONObject2.toString();
        } catch (Exception e) {
            return new JSONObject().toString();
        }
    }

    @JavascriptInterface
    public void setEventToNative(String str) {
        Activity activity;
        WebView webView;
        if (bc.m6315c().mo6306b() && this.f4359f) {
            bc.m6315c().m6300a("setEventToNative: " + str);
        }
        if (bg.m6342c().mo6306b()) {
            bg.m6342c().m6300a("setEventToNative: " + str);
        }
        if (this.f4356c != null && (activity = this.f4356c.get()) != null && this.f4355b != null && (webView = this.f4355b.get()) != null) {
            m6430a(str, activity, webView);
        }
    }

    private void m6430a(String str, Activity activity, WebView webView) {
        String str2;
        String str3;
        JSONArray jSONArray;
        boolean z = true;
        JSONArray jSONArrayOptJSONArray = null;
        String strOptString = null;
        String strOptString2 = null;
        JSONObject jSONObjectOptJSONObject = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONArrayOptJSONArray = jSONObject.optJSONArray(Config.EVENT_H5_VIEW_HIERARCHY);
            strOptString = jSONObject.optString(Config.EVENT_H5_PAGE);
            strOptString2 = jSONObject.optString("l");
            jSONObjectOptJSONObject = jSONObject.optJSONObject(Config.EVENT_HEAT_POINT);
            str2 = strOptString2;
            str3 = strOptString;
            jSONArray = jSONArrayOptJSONArray;
        } catch (Exception e) {
            z = false;
            str2 = strOptString2;
            str3 = strOptString;
            jSONArray = jSONArrayOptJSONArray;
        }
        if (z) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "/";
            }
            JSONArray jSONArrayM6366a = bi.m6366a(activity, webView);
            String name = activity.getClass().getName();
            String strM6365a = bi.m6365a(jSONArrayM6366a);
            String strM6379b = bi.m6379b(jSONArray);
            String strM6398f = bi.m6398f(webView);
            Map<String, String> mapM6400g = bi.m6400g(webView);
            Context applicationContext = activity.getApplicationContext();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (m6432a(this.f4357d, activity.getClass().getName(), str3, strM6365a, strM6379b)) {
                BDStatCore.instance().onEvent(applicationContext, "", str2, 1, System.currentTimeMillis(), jSONArrayM6366a, jSONArray, name, str3, strM6398f, mapM6400g, true);
            } else if (bc.m6315c().mo6306b() && this.f4359f) {
                bc.m6315c().m6300a("setEventToNative: not circle event, will not take effect");
            }
            av.m6217a().m6252a(applicationContext, "", str2, "", 1, jCurrentTimeMillis, name, jSONArrayM6366a, str3, jSONArray, strM6398f, mapM6400g, true, jSONObjectOptJSONObject, "", null);
        }
    }

    private boolean m6432a(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        boolean z;
        boolean z2 = false;
        if (jSONObject == null || jSONObject.toString().equals(new JSONObject().toString())) {
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        try {
            if (((JSONObject) jSONObject.get("meta")).getInt("matchAll") != 0) {
                return true;
            }
        } catch (Exception e) {
        }
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.get("data");
            int i = 0;
            while (true) {
                try {
                    z = z2;
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    z2 = (str.equals(jSONObject2.optString("page")) && str2.equals((String) jSONObject2.opt("url")) && str3.equals(jSONObject2.optString("layout")) && str4.equals((String) jSONObject2.opt("webLayout"))) ? true : z;
                    i++;
                } catch (Exception e2) {
                }
            }
        } catch (Exception e3) {
            z = false;
        }
        return z;
    }
}
