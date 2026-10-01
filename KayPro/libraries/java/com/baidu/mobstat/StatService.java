package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Map;

public class StatService {
    public static final int EXCEPTION_LOG = 1;
    public static final int JAVA_EXCEPTION_LOG = 16;

    private static boolean f4024a = false;

    private static boolean f4025b;

    public interface OnZidReceiveListener {
        String getZid();
    }

    public interface WearListener {
        boolean onSendLogData(String str);
    }

    private static boolean m5942a(Class<?> cls, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        boolean z = false;
        for (int i = 2; i < stackTrace.length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement.getMethodName().equals(str)) {
                try {
                    for (Class<?> cls2 = Class.forName(stackTraceElement.getClassName()); cls2.getSuperclass() != null && cls2.getSuperclass() != cls; cls2 = cls2.getSuperclass()) {
                    }
                    z = true;
                } catch (Exception e) {
                }
            }
        }
        return z;
    }

    private static boolean m5940a(Context context) {
        String strM6583u = bw.m6583u(context);
        if (TextUtils.isEmpty(strM6583u) || !strM6583u.contains("helios")) {
            return false;
        }
        return true;
    }

    public static void enableDeviceMac(Context context, boolean z) {
        if (context != null && !m5940a(context)) {
            CooperService.instance().enableDeviceMac(context, z);
            BDStatCore.instance().init(context);
        }
    }

    public static synchronized void setGlobalExtraInfo(Context context, ExtraInfo extraInfo) {
        if (context != null) {
            if (!m5940a(context)) {
                CooperService.instance().setHeaderExt(context, extraInfo);
                BDStatCore.instance().init(context);
            }
        }
    }

    public static synchronized void onResume(Activity activity) {
        if (m5941a(activity, "onResume(...)")) {
            if (!m5942a((Class<?>) Activity.class, "onResume")) {
                bb.m6313c().m6307c("[WARNING] onResume must be called in Activity.onResume()");
            } else if (!m5940a(activity)) {
                BDStatCore.instance().onResume(activity, false);
            }
        }
    }

    public static synchronized void onPause(Activity activity) {
        onPause(activity, null);
    }

    public static synchronized void onPause(Activity activity, ExtraInfo extraInfo) {
        if (m5941a(activity, "onPause(...)")) {
            if (!m5942a((Class<?>) Activity.class, "onPause")) {
                bb.m6313c().m6307c("[WARNING] onPause must be called in Activity.onPause");
            } else if (!m5940a(activity)) {
                BDStatCore.instance().onPause(activity, false, extraInfo);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:10:0x0016, B:12:0x001c, B:7:0x000b), top: B:17:0x0005 }] */
    public static synchronized void onPageStart(Context context, String str) {
        if (context == null) {
            bb.m6313c().m6307c("[WARNING] onPageStart parameter invalid");
        } else if (TextUtils.isEmpty(str)) {
            bb.m6313c().m6307c("[WARNING] onPageStart parameter invalid");
        } else if (!m5940a(context)) {
            BDStatCore.instance().onPageStart(context, str);
        }
        throw th;
    }

    public static synchronized void onPageEnd(Context context, String str) {
        m5933a(context, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:10:0x0016, B:12:0x001c, B:7:0x000b), top: B:17:0x0005 }] */
    private static synchronized void m5933a(Context context, String str, ExtraInfo extraInfo) {
        if (context == null) {
            bb.m6313c().m6307c("[WARNING] onPageEnd parameter invalid");
        } else if (TextUtils.isEmpty(str)) {
            bb.m6313c().m6307c("[WARNING] onPageEnd parameter invalid");
        } else if (!m5940a(context)) {
            BDStatCore.instance().onPageEnd(context, str, extraInfo);
        }
        throw th;
    }

    public static void setOn(Context context, int i) {
        if (m5941a(context, "setOn(...)") && !f4024a && !m5940a(context)) {
            f4024a = true;
            if ((i & 1) != 0) {
                m5938a(context, false);
            } else if ((i & 16) != 0) {
                m5938a(context, true);
            }
            BDStatCore.instance().init(context);
        }
    }

    public static void start(Context context) {
        if (m5941a(context, "start(...)")) {
            boolean zM6595a = bx.m6595a((Class<?>) Application.class, "onCreate");
            if (zM6595a) {
                bb.m6313c().m6307c("[WARNING] start 方法被 Application.onCreate()调用，not a good practice; 可能由于多进程反复重启等原因造成Application.onCreate() 方法多次被执行，导致启动次数高；建议埋点在统计路径触发的第一个页面中，比如APP主页面中");
            }
            if (!m5940a(context)) {
                BDStatCore.instance().onSessionStart(context, zM6595a);
            }
        }
    }

    @Deprecated
    public static void setSendLogStrategy(Context context, SendStrategyEnum sendStrategyEnum, int i, boolean z) {
        if (m5941a(context, "setSendLogStrategy(...)")) {
            boolean zM6595a = bx.m6595a((Class<?>) Application.class, "onCreate");
            if (zM6595a) {
                bb.m6313c().m6307c("[WARNING] setSendLogStrategy 方法被 Application.onCreate()调用，not a good practice; 可能由于多进程反复重启等原因造成Application.onCreate() 方法多次被执行，导致启动次数高；建议埋点在统计路径触发的第一个页面中，比如APP主页面中");
            }
            if (!m5940a(context)) {
                BDStatCore.instance().onSessionStart(context, zM6595a);
                LogSender.instance().setSendLogStrategy(context.getApplicationContext(), sendStrategyEnum, i, z);
            }
        }
    }

    @Deprecated
    public static void setSendLogStrategy(Context context, SendStrategyEnum sendStrategyEnum, int i) {
        setSendLogStrategy(context, sendStrategyEnum, i, false);
    }

    private static void m5938a(Context context, boolean z) {
        if (m5941a(context, "onError(...)") && !m5940a(context)) {
            BDStatCore.instance().init(context);
            ExceptionAnalysis.getInstance().openExceptionAnalysis(context.getApplicationContext(), z);
        }
    }

    private static void m5934a(Context context, String str, String str2, int i, ExtraInfo extraInfo, Map<String, String> map) {
        if (m5941a(context, "onEvent(...)") && !TextUtils.isEmpty(str)) {
            boolean zM6595a = bx.m6595a((Class<?>) Application.class, "onCreate");
            if (zM6595a) {
                bb.m6313c().m6307c("[WARNING] onEvent 方法被 Application.onCreate()调用，not a good practice; 可能由于多进程反复重启等原因造成Application.onCreate() 方法多次被执行，导致启动次数高；建议埋点在统计路径触发的第一个页面中，比如APP主页面中");
            }
            if (!m5940a(context)) {
                BDStatCore.instance().onEvent(context.getApplicationContext(), str, str2, i, extraInfo, bx.m6594a(map), zM6595a);
            }
        }
    }

    public static void onEvent(Context context, String str, String str2, int i, Map<String, String> map) {
        m5934a(context, str, str2, i, (ExtraInfo) null, map);
    }

    public static void onEvent(Context context, String str, String str2, int i) {
        m5934a(context, str, str2, i, (ExtraInfo) null, (Map<String, String>) null);
    }

    private static void m5936a(Context context, String str, String str2, ExtraInfo extraInfo) {
        m5934a(context, str, str2, 1, extraInfo, (Map<String, String>) null);
    }

    public static void onEvent(Context context, String str, String str2) {
        m5936a(context, str, str2, null);
    }

    public static void onEventStart(Context context, String str, String str2) {
        if (m5941a(context, "onEventStart(...)") && !TextUtils.isEmpty(str) && !m5940a(context)) {
            BDStatCore.instance().onEventStart(context.getApplicationContext(), str, str2, false);
        }
    }

    public static void onEventEnd(Context context, String str, String str2) {
        m5937a(context, str, str2, (ExtraInfo) null, (Map<String, String>) null);
    }

    public static void onEventEnd(Context context, String str, String str2, Map<String, String> map) {
        m5937a(context.getApplicationContext(), str, str2, (ExtraInfo) null, map);
    }

    private static void m5937a(Context context, String str, String str2, ExtraInfo extraInfo, Map<String, String> map) {
        if (m5941a(context, "onEventEnd(...)") && !TextUtils.isEmpty(str) && !m5940a(context)) {
            BDStatCore.instance().onEventEnd(context.getApplicationContext(), str, str2, extraInfo, bx.m6594a(map));
        }
    }

    private static void m5935a(Context context, String str, String str2, long j, ExtraInfo extraInfo, Map<String, String> map) {
        if (m5941a(context, "onEventDuration(...)") && !TextUtils.isEmpty(str)) {
            if (j <= 0) {
                bb.m6313c().m6303b("[WARNING] onEventDuration duration must be greater than zero");
                return;
            }
            boolean zM6595a = bx.m6595a((Class<?>) Application.class, "onCreate");
            if (zM6595a) {
                bb.m6313c().m6307c("[WARNING] onEventDuration 方法被 Application.onCreate()调用，not a good practice; 可能由于多进程反复重启等原因造成Application.onCreate() 方法多次被执行，导致启动次数高；建议埋点在统计路径触发的第一个页面中，比如APP主页面中");
            }
            if (!m5940a(context)) {
                BDStatCore.instance().onEventDuration(context.getApplicationContext(), str, str2, j, extraInfo, bx.m6594a(map), zM6595a);
            }
        }
    }

    public static void onEventDuration(Context context, String str, String str2, long j, Map<String, String> map) {
        m5935a(context, str, str2, j, (ExtraInfo) null, map);
    }

    public static void onEventDuration(Context context, String str, String str2, long j) {
        m5935a(context, str, str2, j, (ExtraInfo) null, (Map<String, String>) null);
    }

    private static boolean m5941a(Context context, String str) {
        if (context != null) {
            return true;
        }
        bb.m6313c().m6303b("[WARNING] " + str + ", context is null, invalid");
        return false;
    }

    public static void setAppKey(String str) {
        PrefOperate.setAppKey(str);
    }

    public static String getAppKey(Context context) {
        return PrefOperate.getAppKey(context);
    }

    @Deprecated
    public static void setAppChannel(String str) {
        PrefOperate.setAppChannel(str);
    }

    public static void setAppChannel(Context context, String str, boolean z) {
        if (context != null && !m5940a(context)) {
            PrefOperate.setAppChannel(context, str, z);
            BDStatCore.instance().init(context);
        }
    }

    public static void setLogSenderDelayed(int i) {
        LogSender.instance().setLogSenderDelayed(i);
    }

    public static void setSessionTimeOut(int i) {
        BDStatCore.instance().setSessionTimeOut(i);
    }

    public static void setDebugOn(boolean z) {
        bb.m6313c().m6314a(z);
    }

    public static void setForTv(Context context, boolean z) {
        if (context != null && !m5940a(context)) {
            bp.m6466a().m6478c(context, z);
            BDStatCore.instance().init(context);
        }
    }

    @SuppressLint({"NewApi"})
    private static void m5939a(WebView webView) {
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT <= 18) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
    }

    public static void bindJSInterface(Context context, WebView webView) {
        bindJSInterface(context, webView, (WebViewClient) null);
    }

    @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
    public static void bindJSInterface(Context context, WebView webView, WebViewClient webViewClient) {
        m5932a(context, webView, webViewClient, (WebChromeClient) null, false);
    }

    @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
    private static void m5932a(Context context, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, boolean z) {
        if (context == null) {
            bb.m6313c().m6307c("[WARNING] context is null, invalid");
            return;
        }
        if (webView == null) {
            bb.m6313c().m6307c("[WARNING] webview is null, invalid");
            return;
        }
        if (!m5940a(context)) {
            m5939a(webView);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDefaultTextEncodingName("UTF-8");
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            if (!z) {
                webView.setWebViewClient(new BaiduStatJSInterface.CustomWebViewClient(context, webViewClient, null, null));
            } else {
                bk c1447bk = new bk();
                webView.addJavascriptInterface(c1447bk, "WebViewInterface");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ad.b());
                arrayList.add(new au.b());
                WebChromeClient customWebChromeViewClient = new BaiduStatJSInterface.CustomWebChromeViewClient(context, webChromeClient, arrayList, c1447bk);
                webView.setWebChromeClient(customWebChromeViewClient);
                webView.setTag(-96001, customWebChromeViewClient);
            }
            BDStatCore.instance().init(context);
        }
    }

    public static String getTestDeviceId(Context context) {
        return bw.m6547b(context);
    }

    public static String getSdkVersion() {
        return CooperService.instance().getMTJSDKVersion();
    }

    public static void onErised(Context context, String str, String str2, String str3) {
        if (m5941a(context, "onErised(...)")) {
            if (str == null || "".equals(str)) {
                bb.m6313c().m6307c("[WARNING] AppKey is invalid");
            } else {
                BDStatCore.instance().onErised(context, str, str2, str3);
            }
        }
    }

    public static void autoTrace(Context context) {
        autoTrace(context, true, false);
    }

    public static void autoTrace(Context context, boolean z, boolean z2) {
        if (z && m5941a(context, "autoTrace(...)") && !m5940a(context)) {
            String appKey = CooperService.instance().getAppKey(context);
            if (TextUtils.isEmpty(appKey)) {
                bb.m6313c().m6307c("[WARNING] AppKey is invalid, auto trace will do not take effect");
                return;
            }
            ad.m5964a(appKey);
            ad.m5965a(z2);
            if (!f4025b) {
                setFeedTrack(MtjConfig.FeedTrackStrategy.TRACK_ALL);
            }
            BDStatCore.instance().init(context);
        }
    }

    public static void setAttributes(View view, Map<String, String> map) {
        if (view != null) {
            view.setTag(-96000, map);
        }
    }

    public static void trackWebView(Context context, WebView webView, WebChromeClient webChromeClient) {
        m5932a(context, webView, (WebViewClient) null, webChromeClient, true);
    }

    public static void setUserId(Context context, String str) {
        if (context != null && !m5940a(context)) {
            CooperService.instance().setUserId(context, str);
            BDStatCore.instance().init(context);
        }
    }

    public static void setUserProperty(Context context, Map<String, String> map) {
        if (context != null && !m5940a(context)) {
            CooperService.instance().setUserProperty(context, bx.m6594a(map));
            BDStatCore.instance().init(context);
        }
    }

    public static void recordException(Context context, Throwable th) {
        if (context != null && th != null) {
            ExceptionAnalysis.getInstance().saveCrashInfo(context, th, false);
        }
    }

    public static void setListName(View view, String str) {
        if (view != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            view.setTag(-97001, str);
        }
    }

    public static void setContentTitle(View view, String str) {
        if (view != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            view.setTag(-97003, str);
        }
    }

    public static void setContentId(View view, String str) {
        if (view != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            view.setTag(-97004, str);
        }
    }

    public static void setFeedTrack(MtjConfig.FeedTrackStrategy feedTrackStrategy) {
        au.m6212a(feedTrackStrategy);
        f4025b = true;
    }

    public static void enableListTrack(View view) {
        if (view != null) {
            view.setTag(-97002, true);
        }
    }

    public static void setAppVersionName(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            CooperService.instance().setAppVersionName(context, str);
        }
    }

    public static synchronized void setPushId(Context context, MtjConfig.PushPlatform pushPlatform, String str) {
        if (context != null && pushPlatform != null) {
            if (!m5940a(context)) {
                String strSubstring = TextUtils.isEmpty(str) ? "" : str;
                if (strSubstring.length() > 1024) {
                    strSubstring = strSubstring.substring(0, 1024);
                }
                CooperService.instance().setPushId(context, pushPlatform.value(), pushPlatform.showName(), strSubstring);
                BDStatCore.instance().init(context);
            }
        }
    }

    public static synchronized void setStartType(boolean z) {
        CooperService.instance().setStartType(z);
    }

    public static void setCrashExtraInfo(String str) {
        ExceptionAnalysis.getInstance().setCrashExtraInfo(str);
    }

    public static void setEnableBackgroundSendLog(Context context, boolean z) {
        BDStatCore.instance().setAutoSendLog(context, z);
    }

    public static void setAuthorizedState(Context context, boolean z) {
        bu.m6524a().m6530b(z);
    }

    public static void setOaid(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.length() > 256) {
            str = str.substring(0, 256);
        }
        bp.m6466a().m6501n(context, str);
    }

    public static void crashEnableSendLog(boolean z) {
        ExceptionAnalysis.getInstance().setEnableSend(z);
    }

    public static void setOnAppBackgroundListener(OnAppBackgroundListener onAppBackgroundListener) {
        if (onAppBackgroundListener != null) {
            bu.m6524a().m6526a(onAppBackgroundListener);
        }
    }
}
