package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import android.webkit.WebView;
import org.json.JSONObject;

public class ay {

    private static final ay f4277k = new ay();

    private static volatile boolean f4278l = true;

    private Context f4279a;

    private Activity f4280b;

    private volatile boolean f4281c;

    private volatile boolean f4282d;

    private volatile String f4283e;

    private long f4284f;

    private long f4285g;

    private String f4286h;

    private PointF f4287i;

    private be f4288j = be.m6319a();

    public static ay m6276a() {
        return f4277k;
    }

    private ay() {
    }

    public void m6293a(String str) {
        aw.m6265a().m6266a(str);
    }

    public void m6296b(String str) {
        this.f4286h = str;
    }

    public PointF m6294b() {
        return this.f4287i;
    }

    public static void m6278a(boolean z) {
        if (z) {
            be.m6323b();
        }
        f4278l = z;
    }

    public static boolean m6284c() {
        return f4278l;
    }

    private void m6283c(Activity activity) {
        Window window;
        Window.Callback callback;
        if (activity != null && (window = activity.getWindow()) != null && (callback = window.getCallback()) != null) {
            window.setCallback(new WindowCallbackak(callback, new WindowCallbackak.a() {
                @Override
                public void mo6006a(MotionEvent motionEvent) {
                    switch (motionEvent.getActionMasked()) {
                        case 1:
                            ay.m6278a(true);
                            if (ay.this.f4287i == null) {
                                ay.this.f4287i = new PointF();
                            }
                            ay.this.f4287i.set(motionEvent.getRawX(), motionEvent.getRawY());
                            break;
                    }
                }

                @Override
                public void mo6005a(KeyEvent keyEvent) {
                    aq.m6108a(keyEvent);
                }
            }));
        }
    }

    public void m6290a(Activity activity) {
        if (m6287d()) {
            m6278a(true);
            this.f4279a = activity.getApplicationContext();
            this.f4280b = activity;
            m6288e();
            m6283c(activity);
            m6291a(activity, true);
        }
    }

    public void m6291a(Activity activity, boolean z) {
        if (!(activity instanceof IIgnoreAutoEvent)) {
            if (z) {
                this.f4288j.m6328a(activity, false, null, false);
            } else {
                this.f4288j.m6327a(activity, false);
            }
        }
    }

    private void m6286d(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setCallback(m6275a(window.getCallback()));
        }
    }

    private Window.Callback m6275a(Window.Callback callback) {
        Window.Callback callbackM6008a = callback;
        while (callbackM6008a != null && (callbackM6008a instanceof WindowCallbackak)) {
            callbackM6008a = ((WindowCallbackak) callbackM6008a).m6008a();
        }
        return callbackM6008a;
    }

    public void m6295b(Activity activity) {
        if (m6287d()) {
            m6286d(this.f4280b);
            this.f4280b = null;
            m6291a(activity, false);
        }
    }

    public void m6292a(WebView webView, String str, bk c1447bk) {
        if (TextUtils.isEmpty(this.f4283e)) {
            this.f4283e = bn.m6454a(this.f4279a, af.f4039b);
        }
        m6280b(webView, this.f4283e, c1447bk);
    }

    private boolean m6287d() {
        return !TextUtils.isEmpty(this.f4286h);
    }

    private void m6288e() {
        if (bw.m6581s(this.f4279a) && !this.f4281c) {
            if (!this.f4282d) {
                this.f4283e = bn.m6454a(this.f4279a, af.f4039b);
                this.f4282d = true;
            }
            if (this.f4284f == 0) {
                this.f4284f = bp.m6466a().m6500n(this.f4279a);
                this.f4285g = bp.m6466a().m6502o(this.f4279a);
            }
            if ((this.f4282d && TextUtils.isEmpty(this.f4283e)) || System.currentTimeMillis() - this.f4284f > this.f4285g) {
                m6289f();
            }
        }
    }

    private void m6289f() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                if (!ay.this.f4281c) {
                    boolean zM6340a = bf.m6340a(ay.this.f4279a, ay.this.f4286h, 1, false);
                    ay.this.f4281c = true;
                    if (zM6340a) {
                        ay.this.f4283e = bn.m6454a(ay.this.f4279a, af.f4039b);
                    }
                }
            }
        });
        thread.setName("downloadThread");
        thread.start();
    }

    private void m6280b(WebView webView, String str, bk c1447bk) {
        if (c1447bk != null) {
            c1447bk.m6434a(this.f4280b, webView, str, (JSONObject) null, false);
        }
    }
}
