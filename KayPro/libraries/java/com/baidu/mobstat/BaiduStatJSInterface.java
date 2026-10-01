package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class BaiduStatJSInterface {

    public interface IWebviewPageLoadCallback {
        void onPageFinished(WebView webView, String str, bk c1447bk);

        void onPageStarted(WebView webView, String str, bk c1447bk);
    }

    public static class CustomWebViewClient extends WebViewClient {

        private WeakReference<Context> f3874a;

        private WebViewClient f3875b;

        private IWebviewPageLoadCallback f3876c;

        private bk f3877d;

        public CustomWebViewClient(Context context, WebViewClient webViewClient, IWebviewPageLoadCallback iWebviewPageLoadCallback, bk c1447bk) {
            this.f3874a = new WeakReference<>(context);
            this.f3875b = webViewClient;
            this.f3876c = iWebviewPageLoadCallback;
            this.f3877d = c1447bk;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String strDecode;
            try {
                strDecode = URLDecoder.decode(str, "UTF-8");
                try {
                    if (!TextUtils.isEmpty(strDecode) && strDecode.startsWith("bmtj:")) {
                        m5847a(strDecode.substring(5));
                        return true;
                    }
                } catch (UnsupportedEncodingException e) {
                } catch (JSONException e2) {
                }
            } catch (UnsupportedEncodingException e3) {
                strDecode = str;
            } catch (JSONException e4) {
                strDecode = str;
            }
            if (this.f3875b != null) {
                return this.f3875b.shouldOverrideUrlLoading(webView, strDecode);
            }
            return super.shouldOverrideUrlLoading(webView, strDecode);
        }

        @Override
        @SuppressLint({"NewApi"})
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return this.f3875b != null ? this.f3875b.shouldOverrideUrlLoading(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        private void m5847a(String str) throws JSONException {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4 = new JSONObject(str);
            String string = jSONObject4.getString("action");
            JSONObject jSONObject5 = jSONObject4.getJSONObject("obj");
            Context context = this.f3874a.get();
            if (context != null) {
                if ("onPageStart".equals(string)) {
                    String string2 = jSONObject5.getString("page");
                    if (!TextUtils.isEmpty(string2)) {
                        BDStatCore.instance().onPageStart(context, string2);
                        return;
                    }
                    return;
                }
                if ("onPageEnd".equals(string)) {
                    String string3 = jSONObject5.getString("page");
                    if (!TextUtils.isEmpty(string3)) {
                        BDStatCore.instance().onPageEnd(context, string3, null, true);
                        return;
                    }
                    return;
                }
                if ("onEvent".equals(string)) {
                    String string4 = jSONObject5.getString("event_id");
                    String string5 = jSONObject5.getString("label");
                    int i = jSONObject5.getInt("acc");
                    if (!TextUtils.isEmpty(string4)) {
                        try {
                            jSONObject3 = (JSONObject) jSONObject5.get("attributes");
                        } catch (Exception e) {
                            jSONObject3 = null;
                        }
                        BDStatCore.instance().onEvent(context, string4, string5, i, (ExtraInfo) null, (Map<String, String>) m5846a(jSONObject3), false, true);
                        return;
                    }
                    return;
                }
                if ("onEventStart".equals(string)) {
                    String string6 = jSONObject5.getString("event_id");
                    String string7 = jSONObject5.getString("label");
                    if (!TextUtils.isEmpty(string6)) {
                        BDStatCore.instance().onEventStart(context, string6, string7, false);
                        return;
                    }
                    return;
                }
                if ("onEventEnd".equals(string)) {
                    String string8 = jSONObject5.getString("event_id");
                    String string9 = jSONObject5.getString("label");
                    if (!TextUtils.isEmpty(string8)) {
                        try {
                            jSONObject2 = (JSONObject) jSONObject5.get("attributes");
                        } catch (Exception e2) {
                            jSONObject2 = null;
                        }
                        BDStatCore.instance().onEventEnd(context, string8, string9, null, m5846a(jSONObject2), true);
                        return;
                    }
                    return;
                }
                if ("onEventDuration".equals(string)) {
                    String string10 = jSONObject5.getString("event_id");
                    String string11 = jSONObject5.getString("label");
                    long j = jSONObject5.getLong("duration");
                    if (!TextUtils.isEmpty(string10)) {
                        try {
                            jSONObject = (JSONObject) jSONObject5.get("attributes");
                        } catch (Exception e3) {
                            jSONObject = null;
                        }
                        BDStatCore.instance().onEventDuration(context, string10, string11, j, null, m5846a(jSONObject), false, true);
                    }
                }
            }
        }

        private HashMap<String, String> m5846a(JSONObject jSONObject) {
            HashMap<String, String> map;
            if (jSONObject == null) {
                return null;
            }
            if (jSONObject.length() == 0) {
                map = null;
            } else {
                map = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    String string = jSONObject.getString(next);
                    if (map != null) {
                        map.put(next, string);
                    }
                } catch (Exception e) {
                }
            }
            return map;
        }

        @Override
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (this.f3875b != null) {
                this.f3875b.onPageStarted(webView, str, bitmap);
            }
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            if (this.f3875b != null) {
                this.f3875b.onPageFinished(webView, str);
            }
        }

        @Override
        public void onLoadResource(WebView webView, String str) {
            if (this.f3875b != null) {
                this.f3875b.onLoadResource(webView, str);
            }
        }

        @Override
        @Deprecated
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            if (this.f3875b != null) {
                this.f3875b.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            if (this.f3875b != null) {
                this.f3875b.onFormResubmission(webView, message, message2);
            }
        }

        @Override
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            if (this.f3875b != null) {
                this.f3875b.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (this.f3875b != null) {
                this.f3875b.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            if (this.f3875b != null) {
                this.f3875b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            return this.f3875b != null ? this.f3875b.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (this.f3875b != null) {
                this.f3875b.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override
        public void onScaleChanged(WebView webView, float f, float f2) {
            if (this.f3875b != null) {
                this.f3875b.onScaleChanged(webView, f, f2);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (this.f3875b != null) {
                this.f3875b.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            if (this.f3875b != null) {
                this.f3875b.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return this.f3875b != null ? this.f3875b.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
        }

        @Override
        @SuppressLint({"NewApi"})
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return this.f3875b != null ? this.f3875b.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override
        @SuppressLint({"NewApi"})
        public void onPageCommitVisible(WebView webView, String str) {
            if (this.f3875b != null) {
                this.f3875b.onPageCommitVisible(webView, str);
            }
        }

        @Override
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (this.f3875b != null) {
                this.f3875b.onReceivedError(webView, i, str, str2);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (this.f3875b != null) {
                this.f3875b.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (this.f3875b != null) {
                this.f3875b.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return this.f3875b != null ? this.f3875b.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    public static class CustomWebChromeViewClient extends WebChromeClient {

        private WeakReference<Context> f3869a;

        private WebChromeClient f3870b;

        private ArrayList<IWebviewPageLoadCallback> f3871c;

        private bk f3872d;

        private int f3873e = 0;

        public CustomWebChromeViewClient(Context context, WebChromeClient webChromeClient, ArrayList<IWebviewPageLoadCallback> arrayList, bk c1447bk) {
            this.f3869a = new WeakReference<>(context);
            this.f3870b = webChromeClient;
            this.f3871c = arrayList;
            this.f3872d = c1447bk;
        }

        @Override
        public void onProgressChanged(WebView webView, int i) {
            if (this.f3871c != null) {
                if (this.f3873e == 0) {
                    for (IWebviewPageLoadCallback iWebviewPageLoadCallback : this.f3871c) {
                        if (iWebviewPageLoadCallback != null) {
                            iWebviewPageLoadCallback.onPageStarted(webView, webView.getUrl(), this.f3872d);
                        }
                    }
                }
                this.f3873e = i;
                if (i == 100) {
                    for (IWebviewPageLoadCallback iWebviewPageLoadCallback2 : this.f3871c) {
                        if (iWebviewPageLoadCallback2 != null) {
                            iWebviewPageLoadCallback2.onPageFinished(webView, webView.getUrl(), this.f3872d);
                        }
                    }
                }
            }
            if (this.f3870b != null) {
                this.f3870b.onProgressChanged(webView, i);
            }
        }

        @Override
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            return this.f3870b != null ? this.f3870b.onCreateWindow(webView, z, z2, message) : super.onCreateWindow(webView, z, z2, message);
        }

        @Override
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return this.f3870b != null ? this.f3870b.onJsAlert(webView, str, str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return this.f3870b != null ? this.f3870b.onConsoleMessage(consoleMessage) : super.onConsoleMessage(consoleMessage);
        }

        @Override
        @Deprecated
        public void onConsoleMessage(String str, int i, String str2) {
            if (this.f3870b != null) {
                this.f3870b.onConsoleMessage(str, i, str2);
            }
        }

        @Override
        public void onCloseWindow(WebView webView) {
            if (this.f3870b != null) {
                this.f3870b.onCloseWindow(webView);
            }
        }

        @Override
        @Deprecated
        public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            if (this.f3870b != null) {
                this.f3870b.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            }
        }

        @Override
        public void onGeolocationPermissionsHidePrompt() {
            if (this.f3870b != null) {
                this.f3870b.onGeolocationPermissionsHidePrompt();
            }
        }

        @Override
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (this.f3870b != null) {
                this.f3870b.onGeolocationPermissionsShowPrompt(str, callback);
            }
        }

        @Override
        public void onHideCustomView() {
            if (this.f3870b != null) {
                this.f3870b.onHideCustomView();
            }
        }

        @Override
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            return this.f3870b != null ? this.f3870b.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        @Override
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return this.f3870b != null ? this.f3870b.onJsConfirm(webView, str, str2, jsResult) : super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return this.f3870b != null ? this.f3870b.onJsPrompt(webView, str, str2, str3, jsPromptResult) : super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override
        @Deprecated
        public boolean onJsTimeout() {
            return this.f3870b != null ? this.f3870b.onJsTimeout() : super.onJsTimeout();
        }

        @Override
        @SuppressLint({"NewApi"})
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (this.f3870b != null) {
                this.f3870b.onPermissionRequest(permissionRequest);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
            if (this.f3870b != null) {
                this.f3870b.onPermissionRequestCanceled(permissionRequest);
            }
        }

        @Deprecated
        public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
            if (this.f3870b != null) {
                this.f3870b.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
            }
        }

        @Override
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            if (this.f3870b != null) {
                this.f3870b.onReceivedIcon(webView, bitmap);
            }
        }

        @Override
        public void onReceivedTitle(WebView webView, String str) {
            if (this.f3870b != null) {
                this.f3870b.onReceivedTitle(webView, str);
            }
        }

        @Override
        public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            if (this.f3870b != null) {
                this.f3870b.onReceivedTouchIconUrl(webView, str, z);
            }
        }

        @Override
        public void onRequestFocus(WebView webView) {
            if (this.f3870b != null) {
                this.f3870b.onRequestFocus(webView);
            }
        }

        @Override
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f3870b != null) {
                this.f3870b.onShowCustomView(view, customViewCallback);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        @Deprecated
        public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f3870b != null) {
                this.f3870b.onShowCustomView(view, i, customViewCallback);
            }
        }

        @Override
        @SuppressLint({"NewApi"})
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return this.f3870b != null ? this.f3870b.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }
}
