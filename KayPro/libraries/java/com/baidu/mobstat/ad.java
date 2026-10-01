package com.baidu.mobstat;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import org.json.JSONArray;

public class ad {

    private static volatile boolean f4034a = true;

    private static volatile boolean f4035b = false;

    public static boolean m5966a() {
        return f4035b;
    }

    public static void m5964a(String str) {
        f4035b = true;
        al.m6009a().m6055a(str);
    }

    public static void m5965a(boolean z) {
        al.m6009a().m6056a(z);
    }

    public static boolean m5967b() {
        return f4034a;
    }

    public static JSONArray m5968c() {
        return al.m6009a().m6063e();
    }

    public static class a implements ActivityLifeObserver.IActivityLifeCallback {
        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onActivityCreated");
            }
            al.m6009a().m6052a(activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {
        }

        @Override
        public void onActivityResumed(Activity activity) {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onActivityResumed");
            }
            al.m6009a().m6059b(activity);
        }

        @Override
        public void onActivityPaused(Activity activity) {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("onActivityPaused");
            }
            al.m6009a().m6061c(activity);
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
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("WebView onPageStarted");
            }
            webView.addJavascriptInterface(c1447bk, "WebViewInterface");
        }

        @Override
        public void onPageFinished(WebView webView, String str, bk c1447bk) {
            if (bc.m6315c().mo6306b()) {
                bc.m6315c().m6300a("WebView onPageFinished");
            }
            webView.addJavascriptInterface(c1447bk, "WebViewInterface");
            al.m6009a().m6054a(webView, str, c1447bk);
        }
    }
}
