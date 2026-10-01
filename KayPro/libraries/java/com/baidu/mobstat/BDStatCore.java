package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class BDStatCore {
    public static final int INVOKE_ACT = 1;
    public static final int INVOKE_API = 0;
    public static final int INVOKE_CUSTOME = 3;
    public static final int INVOKE_FRAG = 2;

    private static BDStatCore f3739a;

    private Handler f3740b;

    private SessionAnalysis f3742d;

    private EventAnalysis f3743e;

    private Runnable f3744f;

    private Handler f3747i;

    private volatile boolean f3741c = false;

    private long f3745g = 0;

    private volatile boolean f3746h = false;

    public static BDStatCore instance() {
        if (f3739a == null) {
            synchronized (BDStatCore.class) {
                if (f3739a == null) {
                    f3739a = new BDStatCore();
                }
            }
        }
        return f3739a;
    }

    private BDStatCore() {
        HandlerThread handlerThread = new HandlerThread("BDStatCore", 10);
        handlerThread.start();
        this.f3740b = new Handler(handlerThread.getLooper());
        this.f3742d = new SessionAnalysis();
        this.f3743e = new EventAnalysis();
        HandlerThread handlerThread2 = new HandlerThread("dataAnalyzeThread");
        handlerThread2.start();
        handlerThread2.setPriority(10);
        this.f3747i = new Handler(handlerThread2.getLooper());
    }

    private void m5837a(Context context) {
        String appKey = CooperService.instance().getAppKey(context);
        if (!TextUtils.isEmpty(appKey)) {
            au.m6213a(appKey);
        }
    }

    public void init(final Context context) {
        m5837a(context);
        if (!this.f3741c) {
            ActivityLifeTask.registerActivityLifeCallback(context);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    if (!BDStatCore.this.f3741c) {
                        PrefOperate.loadMetaDataConfig(context);
                        BDStatCore.this.f3741c = true;
                    }
                }
            });
        }
    }

    public void setAutoSendLog(Context context, boolean z) {
        if (context != null) {
            init(context);
            m5842b(context);
            this.f3742d.setAutoSend(z);
        }
    }

    public void setSessionTimeOut(int i) {
        this.f3742d.setSessionTimeOut(i);
    }

    public JSONObject getPageSessionHead() {
        return this.f3742d.getPageSessionHead();
    }

    public long getSessionStartTime() {
        return this.f3742d.getSessionStartTime();
    }

    public int getSessionSize() {
        return this.f3742d.getSessionSize();
    }

    public void onSessionStart(final Context context, final boolean z) {
        if (context != null) {
            init(context);
            m5842b(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    BDStatCore.this.f3742d.onSessionStart(context, jCurrentTimeMillis, z);
                }
            });
        }
    }

    public void autoTrackLaunchInfo(Context context, final LaunchInfo launchInfo, final boolean z) {
        if (launchInfo != null) {
            if (z) {
                this.f3742d.autoTrackLaunchInfo(launchInfo, z);
            } else {
                init(context);
                this.f3740b.post(new Runnable() {
                    @Override
                    public void run() {
                        BDStatCore.this.f3742d.autoTrackLaunchInfo(launchInfo, z);
                    }
                });
            }
        }
    }

    public void autoTrackSessionStartTime(final Context context) {
        if (context != null) {
            init(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    BDStatCore.this.f3742d.autoTrackSessionStartTime(context, jCurrentTimeMillis);
                }
            });
        }
    }

    public void autoTrackSessionEndTime(final Context context) {
        if (context != null) {
            init(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    BDStatCore.this.f3742d.autoTrackSessionEndTime(context, jCurrentTimeMillis);
                }
            });
        }
    }

    public void doSendLogCheck(final Context context) {
        if (context != null) {
            int sessionTimeOut = this.f3742d.getSessionTimeOut();
            this.f3744f = new Runnable() {
                @Override
                public void run() {
                    BDStatCore.this.f3742d.doSendLogCheck(context, System.currentTimeMillis());
                }
            };
            this.f3740b.postDelayed(this.f3744f, sessionTimeOut);
        }
    }

    public void doSendNewSessionLog(Context context) {
    }

    public void cancelSendLogCheck() {
        Runnable runnable = this.f3744f;
        if (runnable != null) {
            this.f3740b.removeCallbacks(runnable);
        }
        this.f3744f = null;
    }

    public void onPageStart(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            init(context);
            m5842b(context);
            final int iM5833a = m5833a();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    bb.m6313c().m6300a("Start page view " + str);
                    BDStatCore.this.f3742d.onPageStart(context, str, iM5833a, jCurrentTimeMillis);
                }
            });
        }
    }

    public void onPageEnd(Context context, String str, ExtraInfo extraInfo) {
        onPageEnd(context, str, extraInfo, false);
    }

    public void onPageEnd(final Context context, final String str, final ExtraInfo extraInfo, final boolean z) {
        if (context != null && !TextUtils.isEmpty(str)) {
            init(context);
            final String strM5841b = m5841b();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    bb.m6313c().m6300a("End page view " + str);
                    BDStatCore.this.f3742d.onPageEnd(context, str, str, strM5841b, jCurrentTimeMillis, extraInfo, z);
                }
            });
        }
    }

    public void onResume(Activity activity, final boolean z) {
        final Context applicationContext;
        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
            init(applicationContext);
            m5842b(applicationContext);
            final WeakReference weakReference = new WeakReference(activity);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    Class<?> cls;
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 != null && (cls = activity2.getClass()) != null) {
                        String name = activity2.getClass().getName();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (z) {
                            av.m6217a().m6250a(applicationContext, name);
                        }
                        if (!z) {
                            bb.m6313c().m6300a("Start page view " + cls.getSimpleName());
                        }
                        BDStatCore.this.f3742d.onPageStartAct(applicationContext, name, jCurrentTimeMillis, z);
                    }
                }
            });
        }
    }

    public void onResume(Fragment fragment) {
        FragmentActivity activity;
        final Context applicationContext;
        if (fragment != null && (activity = fragment.getActivity()) != null && (applicationContext = activity.getApplicationContext()) != null) {
            init(applicationContext);
            m5842b(applicationContext);
            final WeakReference weakReference = new WeakReference(fragment);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    Class<?> cls;
                    Fragment fragment2 = (Fragment) weakReference.get();
                    if (fragment2 != null && (cls = fragment2.getClass()) != null) {
                        String name = fragment2.getClass().getName();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        bb.m6313c().m6300a("Start page view " + cls.getSimpleName());
                        BDStatCore.this.f3742d.onPageStartFrag(applicationContext, name, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    @SuppressLint({"NewApi"})
    public void onResume(android.app.Fragment fragment) {
        Activity activity;
        final Context applicationContext;
        if (fragment != null && (activity = fragment.getActivity()) != null && (applicationContext = activity.getApplicationContext()) != null) {
            init(applicationContext);
            m5842b(applicationContext);
            final WeakReference weakReference = new WeakReference(fragment);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    Class<?> cls;
                    android.app.Fragment fragment2 = (android.app.Fragment) weakReference.get();
                    if (fragment2 != null && (cls = fragment2.getClass()) != null) {
                        String name = fragment2.getClass().getName();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        bb.m6313c().m6300a("Start page view " + cls.getSimpleName());
                        BDStatCore.this.f3742d.onPageStartFrag(applicationContext, name, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    public void onPause(Activity activity, final boolean z, final ExtraInfo extraInfo) {
        final Context applicationContext;
        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
            init(applicationContext);
            final WeakReference weakReference = new WeakReference(activity);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    Class<?> cls;
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 != null && (cls = activity2.getClass()) != null) {
                        String name = activity2.getClass().getName();
                        String simpleName = activity2.getClass().getSimpleName();
                        CharSequence title = activity2.getTitle();
                        String string = title == null ? "" : title.toString();
                        if (!z) {
                            bb.m6313c().m6300a("End page view " + cls.getSimpleName());
                        }
                        BDStatCore.this.f3742d.onPageEndAct(applicationContext, name, simpleName, string, System.currentTimeMillis(), z, extraInfo);
                    }
                }
            });
        }
    }

    public void onPause(final Fragment fragment) {
        final FragmentActivity activity;
        final Context applicationContext;
        if (fragment != null && (activity = fragment.getActivity()) != null && (applicationContext = activity.getApplicationContext()) != null) {
            init(applicationContext);
            final WeakReference weakReference = new WeakReference(fragment);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    Fragment fragment2 = (Fragment) weakReference.get();
                    if (fragment2 != null && fragment2.getClass() != null) {
                        String name = fragment.getClass().getName();
                        String simpleName = fragment.getClass().getSimpleName();
                        CharSequence title = activity.getTitle();
                        String string = title == null ? "" : title.toString();
                        bb.m6313c().m6300a("End page view " + simpleName);
                        BDStatCore.this.f3742d.onPageEndFrag(applicationContext, name, simpleName, string, System.currentTimeMillis());
                    }
                }
            });
        }
    }

    @SuppressLint({"NewApi"})
    public void onPause(final android.app.Fragment fragment) {
        final Activity activity;
        final Context applicationContext;
        if (fragment != null && (activity = fragment.getActivity()) != null && (applicationContext = activity.getApplicationContext()) != null) {
            init(applicationContext);
            final WeakReference weakReference = new WeakReference(fragment);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    android.app.Fragment fragment2 = (android.app.Fragment) weakReference.get();
                    if (fragment2 != null && fragment2.getClass() != null) {
                        String name = fragment.getClass().getName();
                        String simpleName = fragment.getClass().getSimpleName();
                        CharSequence title = activity.getTitle();
                        String string = title == null ? "" : title.toString();
                        bb.m6313c().m6300a("End page view " + simpleName);
                        BDStatCore.this.f3742d.onPageEndFrag(applicationContext, name, simpleName, string, System.currentTimeMillis());
                    }
                }
            });
        }
    }

    private int m5833a() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        try {
            cls = Class.forName("android.app.Fragment");
        } catch (ClassNotFoundException e) {
            cls = null;
        }
        try {
            cls2 = Class.forName("android.support.v4.app.Fragment");
        } catch (ClassNotFoundException e2) {
            cls2 = null;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; stackTrace != null && i < stackTrace.length; i++) {
            String className = stackTrace[i].getClassName();
            if (!TextUtils.isEmpty(className) && "onResume".equals(stackTrace[i].getMethodName())) {
                try {
                    cls3 = Class.forName(className);
                } catch (Throwable th) {
                    cls3 = null;
                }
                if (cls3 == null) {
                    continue;
                } else {
                    if (Activity.class.isAssignableFrom(cls3)) {
                        return 1;
                    }
                    if (cls != null && cls.isAssignableFrom(cls3)) {
                        return 2;
                    }
                    if (cls2 != null && cls2.isAssignableFrom(cls3)) {
                        return 2;
                    }
                }
            }
        }
        return 3;
    }

    private String m5841b() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (!TextUtils.isEmpty(className)) {
                Class<?> cls = null;
                try {
                    cls = Class.forName(className);
                } catch (Throwable th) {
                }
                if (cls != null && Activity.class.isAssignableFrom(cls)) {
                    return cls.getName();
                }
            }
        }
        return "";
    }

    public void onEvent(Context context, String str, String str2, int i, ExtraInfo extraInfo, Map<String, String> map, boolean z) {
        onEvent(context, str, str2, i, extraInfo, map, z, false);
    }

    public void onEvent(final Context context, final String str, final String str2, final int i, final ExtraInfo extraInfo, final Map<String, String> map, final boolean z, final boolean z2) {
        if (context != null) {
            init(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    String str3 = str2;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    BDStatCore.this.f3742d.onSessionStart(context, jCurrentTimeMillis, z);
                    bb.m6313c().m6300a("Put event" + BDStatCore.this.m5836a(str, str3, i, 0L, map, extraInfo));
                    BDStatCore.this.f3743e.onEvent(context, BDStatCore.this.f3742d.getSessionStartTime(), str, str3, i, jCurrentTimeMillis, extraInfo, map, z2);
                }
            });
        }
    }

    public void onEvent(final Context context, final String str, final String str2, final int i, final String str3, final String str4, final int i2, final boolean z) {
        if (context != null) {
            init(context);
            m5842b(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    String str5 = str2;
                    if (TextUtils.isEmpty(str5)) {
                        str5 = "";
                    }
                    BDStatCore.this.f3742d.onSessionStart(context, jCurrentTimeMillis, false);
                    bb.m6313c().m6300a("Put event" + BDStatCore.this.m5836a(str, str5, i, 0L, null, null));
                    BDStatCore.this.f3743e.onEvent(context, BDStatCore.this.f3742d.getSessionStartTime(), str, str5, i, jCurrentTimeMillis, str3, str4, i2, z);
                }
            });
        }
    }

    public void onEvent(Context context, String str, String str2, int i, long j, JSONArray jSONArray, JSONArray jSONArray2, String str3, String str4, String str5, Map<String, String> map) {
        onEvent(context, str, str2, i, j, jSONArray, jSONArray2, str3, str4, str5, map, false);
    }

    public void onEvent(final Context context, final String str, final String str2, final int i, final long j, final JSONArray jSONArray, final JSONArray jSONArray2, final String str3, final String str4, final String str5, final Map<String, String> map, final boolean z) {
        if (context != null) {
            init(context);
            m5842b(context);
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    String str6 = str2;
                    if (TextUtils.isEmpty(str6)) {
                        str6 = "";
                    }
                    BDStatCore.this.f3742d.onSessionStart(context, j, false);
                    bb.m6313c().m6300a("Put event" + BDStatCore.this.m5836a(str, str6, i, 0L, map, null));
                    BDStatCore.this.f3743e.onEvent(context, BDStatCore.this.f3742d.getSessionStartTime(), str, str6, i, j, jSONArray, jSONArray2, str3, str4, str5, map, z);
                }
            });
        }
    }

    public void onEventStart(final Context context, final String str, final String str2, final boolean z) {
        if (context != null) {
            init(context);
            m5842b(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    String str3 = str2;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    BDStatCore.this.f3742d.onSessionStart(context, jCurrentTimeMillis, z);
                    bb.m6313c().m6300a("Start event" + BDStatCore.this.m5836a(str, str3, 1, -1L, null, null));
                    BDStatCore.this.f3743e.onEventStart(context, str, str3, jCurrentTimeMillis);
                }
            });
        }
    }

    public void onEventEnd(Context context, String str, String str2, ExtraInfo extraInfo, Map<String, String> map) {
        onEventEnd(context, str, str2, extraInfo, map, false);
    }

    public void onEventEnd(final Context context, final String str, final String str2, final ExtraInfo extraInfo, final Map<String, String> map, final boolean z) {
        if (context != null) {
            init(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    String str3 = str2;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    long sessionStartTime = BDStatCore.this.f3742d.getSessionStartTime();
                    bb.m6313c().m6300a("End event" + BDStatCore.this.m5836a(str, str3, 1, -1L, map, extraInfo));
                    BDStatCore.this.f3743e.onEventEnd(context, sessionStartTime, str, str3, jCurrentTimeMillis, extraInfo, map, z);
                }
            });
        }
    }

    public void onEventDuration(Context context, String str, String str2, long j, ExtraInfo extraInfo, Map<String, String> map, boolean z) {
        onEventDuration(context, str, str2, j, extraInfo, map, z, false);
    }

    public void onEventDuration(final Context context, final String str, final String str2, final long j, final ExtraInfo extraInfo, final Map<String, String> map, final boolean z, final boolean z2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            init(context);
            m5842b(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    String str3 = str2;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    BDStatCore.this.f3742d.onSessionStart(context, jCurrentTimeMillis, z);
                    bb.m6313c().m6300a("Put event" + BDStatCore.this.m5836a(str, str3, 1, j, map, extraInfo));
                    BDStatCore.this.f3743e.onEventDuration(context, BDStatCore.this.f3742d.getSessionStartTime(), str, str3, jCurrentTimeMillis, j, extraInfo, map, z2);
                }
            });
        }
    }

    public String m5836a(String str, String str2, int i, long j, Map<String, String> map, ExtraInfo extraInfo) {
        JSONObject jSONObject;
        StringBuilder sb = new StringBuilder();
        if (map == null || map.size() == 0) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(map.toString());
            } catch (Exception e) {
                jSONObject = null;
            }
        }
        JSONObject jSONObjectDumpToJson = extraInfo != null ? extraInfo.dumpToJson() : null;
        sb.append(" eventId " + str + ", with eventLabel " + str2 + ", with acc " + i);
        if (j > 0) {
            sb.append(", with duration " + j);
        }
        if (jSONObject != null && jSONObject.length() != 0) {
            sb.append(", with attributes " + jSONObject);
        }
        if (jSONObjectDumpToJson != null && jSONObjectDumpToJson.length() != 0) {
            sb.append(", with extraInfo " + jSONObjectDumpToJson);
        }
        return sb.toString();
    }

    public void onStat(final Context context, final String str) {
        if (!this.f3742d.isSessionStart()) {
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    LogSender.instance().sendEmptyLogData(context, str);
                }
            });
        }
    }

    public void onErised(final Context context, String str, final String str2, final String str3) {
        if (!this.f3742d.isSessionStart()) {
            init(context);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f3740b.post(new Runnable() {
                @Override
                public void run() {
                    DataCore.instance().init(context);
                    BDStatCore.this.f3743e.onEvent(context, jCurrentTimeMillis, str2, str3, 1, jCurrentTimeMillis, null, null, false);
                    DataCore.instance().saveLogData(context, true, false, jCurrentTimeMillis, false);
                    if (jCurrentTimeMillis - BDStatCore.this.f3745g > 30000 && bw.m6579q(context)) {
                        LogSender.instance().onSend(context);
                        BDStatCore.this.f3745g = jCurrentTimeMillis;
                    }
                }
            });
        }
    }

    private void m5842b(final Context context) {
        if (bu.m6524a().m6532d() && !this.f3746h && context != null && this.f3747i != null) {
            this.f3747i.postDelayed(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (!Enums.m6806b(context)) {
                            Enums.m6805a(2).mo6807a(context);
                        }
                    } catch (Throwable th) {
                    }
                    BDStatCore.this.f3746h = false;
                }
            }, Config.BPLUS_DELAY_TIME);
            this.f3746h = true;
        }
    }
}
