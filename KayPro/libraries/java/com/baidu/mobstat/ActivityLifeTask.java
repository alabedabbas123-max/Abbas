package com.baidu.mobstat;

import android.content.Context;

public class ActivityLifeTask {

    private static boolean f3733a = false;

    private static ActivityLifeObserver.IActivityLifeCallback f3734b;

    private static ActivityLifeObserver.IActivityLifeCallback f3735c;

    private static ActivityLifeObserver.IActivityLifeCallback f3736d;

    private static ActivityLifeObserver.IActivityLifeCallback f3737e;

    public static synchronized void registerActivityLifeCallback(Context context) {
        if (!f3733a) {
            m5832a(context);
            ActivityLifeObserver.instance().clearObservers();
            ActivityLifeObserver.instance().addObserver(f3734b);
            ActivityLifeObserver.instance().addObserver(f3736d);
            ActivityLifeObserver.instance().addObserver(f3735c);
            ActivityLifeObserver.instance().addObserver(f3737e);
            ActivityLifeObserver.instance().registerActivityLifeCallback(context);
            f3733a = true;
        }
    }

    private static synchronized void m5832a(Context context) {
        f3734b = new AutoTrack.MyActivityLifeCallback(1);
        f3736d = new ad.a();
        f3735c = new au.a();
        f3737e = new AutoTrack.MyActivityLifeCallback(2);
    }
}
