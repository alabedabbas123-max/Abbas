package com.baidu.mobstat;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class AutoTrack {
    public static final int JOB_TYPE_BGSEND = 2;
    public static final int JOB_TYPE_SESSIONTIME = 1;

    public static class MyActivityLifeCallback implements ActivityLifeObserver.IActivityLifeCallback {

        private int f3738a;

        public MyActivityLifeCallback(int i) {
            this.f3738a = i;
        }

        @Override
        public void onActivityResumed(Activity activity) {
            Context applicationContext = activity.getApplicationContext();
            if (this.f3738a == 1) {
                BDStatCore.instance().autoTrackSessionStartTime(applicationContext);
            } else if (this.f3738a == 2) {
                BDStatCore.instance().cancelSendLogCheck();
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Context applicationContext = activity.getApplicationContext();
            if (this.f3738a == 1) {
                BDStatCore.instance().autoTrackSessionEndTime(applicationContext);
            } else if (this.f3738a == 2) {
                BDStatCore.instance().doSendLogCheck(applicationContext);
            }
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityStarted(Activity activity) {
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
        }
    }
}
