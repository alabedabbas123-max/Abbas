package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class be {

    private static volatile int f4298a = 0;

    private static final be f4299k = new be();

    private WeakReference<Activity> f4300b;

    private int f4301c;

    private boolean f4302d;

    private JSONObject f4303e;

    private boolean f4304f;

    private final Handler f4306h;

    private a f4307i;

    private final Handler f4305g = new Handler(Looper.getMainLooper());

    private bd f4308j = new bd();

    static int m6326c() {
        int i = f4298a + 1;
        f4298a = i;
        return i;
    }

    public static be m6319a() {
        return f4299k;
    }

    private be() {
        HandlerThread handlerThread = new HandlerThread("visitorThread");
        handlerThread.start();
        this.f4306h = new Handler(handlerThread.getLooper());
    }

    public static void m6323b() {
        f4298a = 0;
    }

    public void m6328a(Activity activity, boolean z, JSONObject jSONObject, boolean z2) {
        aq.m6107a(activity, !z);
        if (!this.f4302d) {
            this.f4302d = z2;
        }
        if (z) {
            this.f4304f = z;
            this.f4303e = jSONObject;
        }
        if (!m6322a(activity, 1)) {
            if (this.f4300b != null && this.f4307i != null) {
                this.f4307i.m6333a();
            }
            this.f4300b = new WeakReference<>(activity);
            this.f4301c = 1;
            this.f4307i = new a(activity, bi.m6354a(activity), new Abstractbj.a(1, this.f4300b, this.f4308j), this.f4305g, this.f4306h, this.f4303e, this.f4302d, true, this.f4304f);
        }
    }

    public void m6327a(Activity activity, boolean z) {
        aq.m6112b(activity, !z);
        if (!m6322a(activity, 2)) {
            this.f4300b = new WeakReference<>(activity);
            this.f4301c = 2;
            if (this.f4307i != null) {
                this.f4307i.m6333a();
            }
        }
    }

    private boolean m6322a(Activity activity, int i) {
        return this.f4300b != null && this.f4300b.get() == activity && this.f4301c == i;
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {

        private final WeakReference<View> f4311c;

        private final Abstractbj f4312d;

        private final Handler f4313e;

        private final Handler f4314f;

        private JSONObject f4315g;

        private WeakReference<Activity> f4316h;

        private boolean f4317i;

        private boolean f4318j;

        private boolean f4319k;

        private Runnable f4320l = null;

        private boolean f4310b = true;

        private volatile boolean f4309a = false;

        public a(Activity activity, View view, Abstractbj abstractC1446bj, Handler handler, Handler handler2, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
            this.f4316h = new WeakReference<>(activity);
            this.f4315g = jSONObject;
            this.f4312d = abstractC1446bj;
            this.f4311c = new WeakReference<>(view);
            this.f4313e = handler;
            this.f4314f = handler2;
            this.f4317i = z;
            this.f4318j = z2;
            this.f4319k = z3;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            run();
        }

        @Override
        public void onGlobalLayout() {
            run();
        }

        @Override
        public void run() {
            if (this.f4310b) {
                if (this.f4311c.get() == null || this.f4309a) {
                    m6332b();
                    return;
                }
                if (bc.m6315c().mo6306b() && this.f4319k) {
                    bc.m6315c().m6300a("onGlobalLayout");
                }
                if (bg.m6342c().mo6306b()) {
                    bg.m6342c().m6300a("onGlobalLayout");
                }
                if (ad.m5967b()) {
                    if (ay.m6284c()) {
                        Activity activity = this.f4316h.get();
                        if (activity != null) {
                            be.m6325b(activity, this.f4317i, this.f4319k);
                            m6330a(this.f4316h, this.f4315g, this.f4312d, this.f4314f, this.f4318j);
                        }
                    } else {
                        if (bc.m6315c().mo6306b() && this.f4319k) {
                            bc.m6315c().m6300a("no touch, skip onGlobalLayout");
                        }
                        if (bg.m6342c().mo6306b()) {
                            bg.m6342c().m6300a("no touch, skip onGlobalLayout");
                        }
                    }
                }
                this.f4313e.removeCallbacks(this);
            }
        }

        public void m6333a() {
            if (!this.f4309a) {
                this.f4309a = true;
                this.f4313e.post(this);
            }
        }

        @SuppressLint({"NewApi"})
        private void m6332b() {
            if (this.f4310b) {
                View view = this.f4311c.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        if (android.os.Build.VERSION.SDK_INT < 16) {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        } else {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                    }
                }
                m6329a(this.f4312d, this.f4314f);
            }
            this.f4310b = false;
        }

        private void m6330a(final WeakReference<Activity> weakReference, final JSONObject jSONObject, final Abstractbj abstractC1446bj, Handler handler, final boolean z) {
            if (abstractC1446bj != null && handler != null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        if (!ay.m6284c()) {
                            if (bc.m6315c().mo6306b() && a.this.f4319k) {
                                bc.m6315c().m6300a("no touch, skip doViewVisit");
                            }
                            if (bg.m6342c().mo6306b()) {
                                bg.m6342c().m6300a("no touch, skip doViewVisit");
                                return;
                            }
                            return;
                        }
                        if (be.m6326c() >= 3) {
                            ay.m6278a(false);
                        }
                        Activity activity = (Activity) weakReference.get();
                        if (activity != null) {
                            aq.m6113c(activity, z);
                            abstractC1446bj.m6420a(activity, jSONObject, z);
                        }
                    }
                };
                if (this.f4320l != null) {
                    handler.removeCallbacks(this.f4320l);
                }
                this.f4320l = runnable;
                handler.postDelayed(runnable, 500L);
            }
        }

        private void m6329a(final Abstractbj abstractC1446bj, Handler handler) {
            if (abstractC1446bj != null && handler != null) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        abstractC1446bj.mo6419a();
                    }
                }, 500L);
            }
        }
    }

    public static void m6325b(Activity activity, boolean z, boolean z2) {
        if (z) {
            m6324b(activity, z2);
        }
    }

    private static void m6324b(Activity activity, boolean z) {
        m6320a(activity, bi.m6354a(activity), z);
    }

    private static void m6320a(Activity activity, View view, boolean z) {
        if (view != null && !bi.m6389c(activity, view)) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (webView.getTag(-96001) == null) {
                    if (bc.m6315c().mo6306b() && z) {
                        bc.m6315c().m6300a("webview auto set " + activity.getClass().getName());
                    }
                    if (bg.m6342c().mo6306b()) {
                        bg.m6342c().m6300a("webview auto set " + activity.getClass().getName());
                    }
                    StatService.trackWebView(activity.getApplicationContext(), webView, null);
                    return;
                }
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m6320a(activity, viewGroup.getChildAt(i), z);
                }
            }
        }
    }
}
