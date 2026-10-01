package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import org.json.JSONObject;

public class au {
    public static void m6213a(String str) {
        if (ad.m5966a() && !aw.m6265a().m6267b()) {
            ay.m6276a().m6296b(str);
        }
    }

    public static void m6212a(MtjConfig.FeedTrackStrategy feedTrackStrategy) {
        if (!aw.m6265a().m6267b()) {
            aq.m6110a(feedTrackStrategy);
        }
    }

    public static void m6214a(JSONObject jSONObject) {
        if (ad.m5966a() && !aw.m6265a().m6267b()) {
            av.m6217a().m6256a(jSONObject);
        }
    }

    public static void m6210a(Context context) {
        if (ad.m5966a() && !aw.m6265a().m6267b()) {
            av.m6217a().m6248a(context);
        }
    }

    public static void m6211a(Context context, boolean z) {
        if (ad.m5966a() && !aw.m6265a().m6267b()) {
            av.m6217a().m6254a(context, z);
        }
    }

    public static class a implements ActivityLifeObserver.IActivityLifeCallback {
        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityStarted(Activity activity) {
        }

        @Override
        public void onActivityResumed(Activity activity) {
            if (ad.m5966a() && !aw.m6265a().m6267b()) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("onActivityResumed");
                }
                ay.m6276a().m6290a(activity);
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (ad.m5966a() && !aw.m6265a().m6267b()) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("onActivityPaused");
                }
                ay.m6276a().m6295b(activity);
            }
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
        }
    }

    public static class b implements BaiduStatJSInterface.IWebviewPageLoadCallback {
        @Override
        public void onPageStarted(WebView webView, String str, bk c1447bk) {
            if (ad.m5966a() && !aw.m6265a().m6267b()) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("WebView onPageStarted");
                }
                webView.addJavascriptInterface(c1447bk, "WebViewInterface");
            }
        }

        @Override
        public void onPageFinished(WebView webView, String str, bk c1447bk) {
            if (ad.m5966a() && !aw.m6265a().m6267b()) {
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("WebView onPageFinished");
                }
                webView.addJavascriptInterface(c1447bk, "WebViewInterface");
                ay.m6276a().m6292a(webView, str, c1447bk);
            }
        }
    }

    public static void m6215b(String str) {
        if (ad.m5966a()) {
            ay.m6276a().m6293a(str);
        }
    }
}
