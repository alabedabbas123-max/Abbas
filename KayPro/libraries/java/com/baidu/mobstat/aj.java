package com.baidu.mobstat;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;

public class aj {

    private static volatile boolean f4056a = true;

    private a f4057b;

    private Activity f4058c;

    private Handler f4059d = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 100:
                    if (aj.this.f4057b != null) {
                        aj.this.f4057b.mo6007a();
                    }
                    break;
            }
        }
    };

    public interface a {
        void mo6007a();
    }

    public aj(a aVar) {
        this.f4057b = aVar;
    }

    public static void m5997a(boolean z) {
        if (z) {
            am.m6064a();
        }
        f4056a = z;
    }

    public static boolean m5998a() {
        return f4056a;
    }

    public void m6003a(Activity activity) {
        if (activity != null) {
            this.f4058c = activity;
            m6000b(activity);
        }
    }

    public void m6004b() {
        m6001c(this.f4058c);
        this.f4058c = null;
    }

    private void m6000b(Activity activity) {
        m6002d(activity);
    }

    private void m6001c(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setCallback(m5995a(window.getCallback()));
        }
    }

    private Window.Callback m5995a(Window.Callback callback) {
        Window.Callback callbackM6008a = callback;
        while (callbackM6008a != null && (callbackM6008a instanceof WindowCallbackak)) {
            callbackM6008a = ((WindowCallbackak) callbackM6008a).m6008a();
        }
        return callbackM6008a;
    }

    private void m6002d(Activity activity) {
        Window.Callback callback;
        Window window = activity.getWindow();
        if (window != null && (callback = window.getCallback()) != null) {
            window.setCallback(new WindowCallbackak(callback, new WindowCallbackak.a() {
                @Override
                public void mo6006a(MotionEvent motionEvent) {
                    aj.m5997a(true);
                    switch (motionEvent.getActionMasked()) {
                        case 5:
                            int pointerCount = motionEvent.getPointerCount();
                            if (pointerCount == 3 && motionEvent.getEventTime() - motionEvent.getDownTime() <= 50) {
                                aj.this.f4059d.sendEmptyMessageDelayed(100, 2500L);
                            } else if (pointerCount > 3) {
                                aj.this.f4059d.removeMessages(100);
                            }
                            break;
                        case 6:
                            if (motionEvent.getEventTime() - motionEvent.getDownTime() < 2500) {
                                aj.this.f4059d.removeMessages(100);
                            }
                            break;
                    }
                }

                @Override
                public void mo6005a(KeyEvent keyEvent) {
                }
            }));
        }
    }
}
