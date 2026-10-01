package com.baidu.mobstat;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;

public class aq {
    public static void m6110a(MtjConfig.FeedTrackStrategy feedTrackStrategy) {
        as.m6121a().m6190a(feedTrackStrategy);
    }

    public static void m6107a(Activity activity, boolean z) {
        if (z && !ar.m6114a().m6116b() && !as.m6121a().m6194b()) {
            as.m6121a().m6187a(activity);
        }
    }

    public static void m6112b(Activity activity, boolean z) {
        if (z && !ar.m6114a().m6116b() && !as.m6121a().m6194b()) {
            as.m6121a().m6193b(activity);
        }
    }

    public static void m6113c(Activity activity, boolean z) {
        if (z && !ar.m6114a().m6116b() && !as.m6121a().m6194b()) {
            as.m6121a().m6195c(activity);
        }
    }

    public static void m6109a(View view, Activity activity) {
        if (!ar.m6114a().m6116b() && !as.m6121a().m6194b()) {
            as.m6121a().m6189a(view, activity);
        }
    }

    public static void m6108a(KeyEvent keyEvent) {
        if (!ar.m6114a().m6116b() && !as.m6121a().m6194b()) {
            as.m6121a().m6188a(keyEvent);
        }
    }

    public static void m6111a(String str) {
        if (!as.m6121a().m6194b()) {
            as.m6121a().m6191a(str);
        }
    }
}
