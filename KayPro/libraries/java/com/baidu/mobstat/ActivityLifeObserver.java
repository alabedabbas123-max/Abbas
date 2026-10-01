package com.baidu.mobstat;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ActivityLifeObserver {

    private static final ActivityLifeObserver f3729b = new ActivityLifeObserver();

    private boolean f3730a;

    private Set<IActivityLifeCallback> f3731c = new LinkedHashSet();

    public interface IActivityLifeCallback {
        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onActivitySaveInstanceState(Activity activity, Bundle bundle);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    public static ActivityLifeObserver instance() {
        return f3729b;
    }

    public void addObserver(IActivityLifeCallback iActivityLifeCallback) {
        synchronized (this.f3731c) {
            this.f3731c.add(iActivityLifeCallback);
        }
    }

    public void clearObservers() {
        synchronized (this.f3731c) {
            this.f3731c.clear();
        }
    }

    public void removeObserver(IActivityLifeCallback iActivityLifeCallback) {
        synchronized (this.f3731c) {
            this.f3731c.remove(iActivityLifeCallback);
        }
    }

    public void registerActivityLifeCallback(Context context) {
        if (!this.f3730a && android.os.Build.VERSION.SDK_INT >= 14) {
            doRegister(context);
            this.f3730a = true;
        }
    }

    @TargetApi(14)
    public void doRegister(Context context) {
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                @Override
                public void onActivityResumed(Activity activity) {
                    synchronized (ActivityLifeObserver.this.f3731c) {
                        Iterator it = ActivityLifeObserver.this.f3731c.iterator();
                        while (it.hasNext()) {
                            ((IActivityLifeCallback) it.next()).onActivityResumed(activity);
                        }
                    }
                }

                @Override
                public void onActivityPaused(Activity activity) {
                    synchronized (ActivityLifeObserver.this.f3731c) {
                        Iterator it = ActivityLifeObserver.this.f3731c.iterator();
                        while (it.hasNext()) {
                            ((IActivityLifeCallback) it.next()).onActivityPaused(activity);
                        }
                    }
                }

                @Override
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    synchronized (ActivityLifeObserver.this.f3731c) {
                        Iterator it = ActivityLifeObserver.this.f3731c.iterator();
                        while (it.hasNext()) {
                            ((IActivityLifeCallback) it.next()).onActivityCreated(activity, bundle);
                        }
                    }
                }

                @Override
                public void onActivityStarted(Activity activity) {
                    synchronized (ActivityLifeObserver.this.f3731c) {
                        Iterator it = ActivityLifeObserver.this.f3731c.iterator();
                        while (it.hasNext()) {
                            ((IActivityLifeCallback) it.next()).onActivityStarted(activity);
                        }
                    }
                }

                @Override
                public void onActivityStopped(Activity activity) {
                    synchronized (ActivityLifeObserver.this.f3731c) {
                        Iterator it = ActivityLifeObserver.this.f3731c.iterator();
                        while (it.hasNext()) {
                            ((IActivityLifeCallback) it.next()).onActivityStopped(activity);
                        }
                    }
                }

                @Override
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    synchronized (ActivityLifeObserver.this.f3731c) {
                        Iterator it = ActivityLifeObserver.this.f3731c.iterator();
                        while (it.hasNext()) {
                            ((IActivityLifeCallback) it.next()).onActivitySaveInstanceState(activity, bundle);
                        }
                    }
                }

                @Override
                public void onActivityDestroyed(Activity activity) {
                    synchronized (ActivityLifeObserver.this.f3731c) {
                        Iterator it = ActivityLifeObserver.this.f3731c.iterator();
                        while (it.hasNext()) {
                            ((IActivityLifeCallback) it.next()).onActivityDestroyed(activity);
                        }
                    }
                }
            });
        } catch (Exception e) {
            bb.m6313c().m6300a("registerActivityLifecycleCallbacks encounter exception");
        }
    }
}
