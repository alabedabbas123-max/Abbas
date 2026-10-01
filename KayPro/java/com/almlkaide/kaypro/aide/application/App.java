package com.almlkaide.kaypro.aide.application;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.aide.ui.AIDEApplication;
import com.aide.uidesigner.XmlLayoutDesignActivity;
import com.baidu.mobstat.StatService;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.almlkaide.kaypro.app.base.BaseActivity;
import com.almlkaide.kaypro.util.CrashUtils;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.xutils.x;

public class App extends AIDEApplication {
    private static App sApp;

    public static App getApp() {
        return sApp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void attachBaseContext(Context context) {
        super/*android.support.multidex.MultiDexApplication*/.attachBaseContext(context);
        if (Build.VERSION.SDK_INT < 29 || PreferenceManager.getDefaultSharedPreferences(this).getBoolean("adjust_actionbar", false)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate();
        sApp = this;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void init() {
        try {
            Utils.setApp(this);
            AppConfigured.init();
            initUtils();
            initX();
            registerActivityLifecycleCallbacks(new MyActivityLifecycleCallbacks(this));
        } catch (Throwable th) {
            Toasty.toast(th.toString()).show();
        }
        try {
            if (!useMtj()) {
                LogUtils.i(new Object[]{"disable_mtj"});
            } else {
                initMtj();
            }
        } catch (Throwable th2) {
        }
    }

    private boolean useMtj() {
        return !FileUtils.isFileExists(new File(Utils.SDCARD_DATA_DIR, "disable_mtj"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initMtj() {
        StatService.setAppKey("550e1bf115");
        StatService.setDebugOn(false);
        StatService.autoTrace(this, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initUtils() {
        com.blankj.utilcode.util.Utils.init(this);
        File file = new File(getExternalCacheDir(), "log");
        LogUtils.Config config = LogUtils.getConfig();
        config.setLogSwitch(true);
        config.setLog2FileSwitch(true);
        config.setSaveDays(2);
        config.setDir(file);
        CrashUtils.init(new File(file, "crash"), new CrashUtils.OnCrashListener(this) {
            private final App this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onCrash(String str, Throwable th) {
                try {
                    Intent intent = new Intent((Context) App.getApp(), Class.forName("com.almlkaide.kaypro.util.CrashUtils$CrashActiviy"));
                    intent.addFlags(268435456);
                    intent.putExtra("crashInfo", str);
                    this.this$0.startActivity(intent);
                    AppUtils.exitApp();
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initX() {
        ClassX.Ext.init(this);
        ClassX.Ext.setDebug(false);
        ClassX.Ext.setDefaultHostnameVerifier(new HostnameVerifier(this) {
            private final App this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        });
    }

    private class MyActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final App this$0;

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
        }

        @Override
        public void onActivityPaused(Activity activity) {
        }

        @Override
        public void onActivityResumed(Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }

        @Override
        public void onActivityStarted(Activity activity) {
            if ((activity instanceof CrashUtils.CrashActiviy) || (activity instanceof XmlLayoutDesignActivity)) {
                return;
            }
            BaseActivity.setStatusBar(activity);
        }

        public MyActivityLifecycleCallbacks(App c1676App) {
            this.this$0 = c1676App;
        }
    }
}
