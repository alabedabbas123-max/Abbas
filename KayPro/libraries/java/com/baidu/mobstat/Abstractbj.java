package com.baidu.mobstat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public abstract class Abstractbj implements bh.a {

    private bh f4346a;

    public interface b {
        void mo6318a(View view, boolean z, Activity activity);
    }

    public abstract void mo6419a();

    @TargetApi(14)
    public static class a extends Abstractbj {

        private WeakReference<Activity> f4347a;

        private b f4348b;

        private final WeakHashMap<View, C2295a> f4349c = new WeakHashMap<>();

        public a(int i, WeakReference<Activity> weakReference, b bVar) {
            this.f4347a = weakReference;
            this.f4348b = bVar;
        }

        class C2295a extends View.AccessibilityDelegate {

            private View.AccessibilityDelegate f4351b;

            private View f4352c;

            private volatile boolean f4353d;

            public void m6427a(boolean z) {
                this.f4353d = z;
            }

            public C2295a(WeakReference<Activity> weakReference, View view, String str, View.AccessibilityDelegate accessibilityDelegate, boolean z) {
                this.f4351b = accessibilityDelegate;
                a.this.f4347a = weakReference;
                this.f4352c = view;
                this.f4353d = z;
            }

            public View.AccessibilityDelegate m6426a() {
                return this.f4351b;
            }

            @Override
            public void sendAccessibilityEvent(View view, int i) {
                Activity activity;
                if (view == this.f4352c && i == 1) {
                    if (bc.m6315c().mo6306b() && this.f4353d) {
                        bc.m6315c().m6300a("watch view  OnEvent:" + view.getClass().getName());
                    }
                    if (bg.m6342c().mo6306b()) {
                        bg.m6342c().m6300a("watch view  OnEvent:" + view.getClass().getName());
                    }
                    if (a.this.f4347a != null && (activity = (Activity) a.this.f4347a.get()) != null) {
                        a.this.f4348b.mo6318a(view, this.f4353d, activity);
                    }
                }
                if (this.f4351b != null) {
                    this.f4351b.sendAccessibilityEvent(view, i);
                } else {
                    super.sendAccessibilityEvent(view, i);
                }
            }
        }

        public void m6425a(WeakReference<Activity> weakReference, View view, String str, boolean z) {
            View.AccessibilityDelegate accessibilityDelegateM6421a = m6421a(view);
            if (!(accessibilityDelegateM6421a instanceof C2295a)) {
                C2295a c2295a = new C2295a(weakReference, view, str, accessibilityDelegateM6421a, z);
                view.setAccessibilityDelegate(c2295a);
                this.f4349c.put(view, c2295a);
                return;
            }
            ((C2295a) accessibilityDelegateM6421a).m6427a(z);
        }

        private View.AccessibilityDelegate m6421a(View view) {
            try {
                return (View.AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        public void mo6347a(View view, boolean z) {
            m6425a(this.f4347a, view, bi.m6358a(view), z);
        }

        @Override
        public void mo6419a() {
            if (this.f4349c != null) {
                for (Map.Entry<View, C2295a> entry : this.f4349c.entrySet()) {
                    entry.getKey().setAccessibilityDelegate(entry.getValue().m6426a());
                }
                this.f4349c.clear();
            }
        }
    }

    public void m6420a(Activity activity, JSONObject jSONObject, boolean z) {
        if (this.f4346a == null) {
            this.f4346a = new bh(activity, this, z);
            this.f4346a.m6346a(jSONObject);
        }
        this.f4346a.m6345a(activity);
    }
}
