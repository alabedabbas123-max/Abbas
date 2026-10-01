package com.almlkaide.kaypro.util;

import adrt.ADRTLogCatReader;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.SDCardUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.ThrowableUtils;
import com.tencent.mm.util.TypedValue;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class CrashUtils {
    private static final String FILE_SEP = System.getProperty("file.separator");
    public static final Thread.UncaughtExceptionHandler DEFAULT_UNCAUGHT_EXCEPTION_HANDLER = Thread.getDefaultUncaughtExceptionHandler();

    public interface OnCrashListener {
        void onCrash(String str, Throwable th);
    }

    CrashUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @SuppressLint("MissingPermission")
    public static void init() {
        init("");
    }

    public static void init(File file) {
        init(file.getAbsolutePath(), (OnCrashListener) null);
    }

    public static void init(String str) {
        init(str, (OnCrashListener) null);
    }

    public static void init(OnCrashListener onCrashListener) {
        init("", onCrashListener);
    }

    public static void init(File file, OnCrashListener onCrashListener) {
        init(file.getAbsolutePath(), onCrashListener);
    }

    public static void init(String str, OnCrashListener onCrashListener) {
        String string;
        if (StringUtils.isSpace(str)) {
            if (SDCardUtils.isSDCardEnableByEnvironment() && Utils.getApp().getExternalFilesDir((String) null) != null) {
                string = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Utils.getApp().getExternalFilesDir((String) null)).append(FILE_SEP).toString()).append("crash").toString()).append(FILE_SEP).toString();
            } else {
                string = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Utils.getApp().getFilesDir()).append(FILE_SEP).toString()).append("crash").toString()).append(FILE_SEP).toString();
            }
        } else {
            if (!str.endsWith(FILE_SEP)) {
                str = new StringBuffer().append(str).append(FILE_SEP).toString();
            }
            string = str;
        }
        Thread.setDefaultUncaughtExceptionHandler(getUncaughtExceptionHandler(string, onCrashListener));
    }

    private static Thread.UncaughtExceptionHandler getUncaughtExceptionHandler(String str, OnCrashListener onCrashListener) {
        return new Thread.UncaughtExceptionHandler(str, onCrashListener) {
            private final String val$dirPath;
            private final OnCrashListener val$onCrashListener;

            {
                this.val$dirPath = str;
                this.val$onCrashListener = onCrashListener;
            }

            @Override
            public void uncaughtException(Thread thread, Throwable th) {
                String str2 = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss").format(new Date());
                StringBuilder sb = new StringBuilder();
                sb.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("************* Log Head ****************").append("\nTime Of Crash      : ").toString()).append(str2).toString()).append("\nDevice Manufacturer: ").toString()).append(Build.MANUFACTURER).toString()).append("\nDevice Model       : ").toString()).append(Build.MODEL).toString()).append("\nAndroid Version    : ").toString()).append(Build.VERSION.RELEASE).toString()).append("\nAndroid SDK        : ").toString()).append(Build.VERSION.SDK_INT).toString()).append("\nApp VersionName    : ").toString()).append(AppUtils.getAppVersionName()).toString()).append("\nApp VersionCode    : ").toString()).append(AppUtils.getAppVersionCode()).toString()).append("\n************* Log Head ****************\n\n").toString()).append(ThrowableUtils.getFullStackTrace(th));
                String string = sb.toString();
                FileIOUtils.writeFileFromString(new StringBuffer().append(new StringBuffer().append(this.val$dirPath).append(str2).toString()).append(TypedValue.TXT_FILE).toString(), string, true);
                if (this.val$onCrashListener != null) {
                    this.val$onCrashListener.onCrash(string, th);
                }
            }
        };
    }

    public static class CrashActiviy extends Activity {

        private String f5092log;

        @Override
        protected void onCreate(Bundle bundle) {
            ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
            super.onCreate(bundle);
            setTheme(R.style.Theme.DeviceDefault);
            getActionBar().setTitle(Utils.isCN() ? "软件崩溃" : "App crash");
            ScrollView scrollView = new ScrollView(this);
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
            TextView textView = new TextView(this);
            horizontalScrollView.addView(textView);
            scrollView.addView(horizontalScrollView, -1, -1);
            setContentView(scrollView);
            this.f5092log = getIntent().getStringExtra("crashInfo");
            textView.setText(this.f5092log);
            textView.setTextIsSelectable(true);
            int iDp2px = Utils.dp2px(16);
            textView.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
            scrollView.setFillViewport(true);
        }

        @Override
        public void onBackPressed() {
            super.onBackPressed();
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            menu.add(R.string.copy).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
                private final CrashActiviy this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Utils.copyToClipboard(this.this$0.f5092log);
                    return false;
                }
            }).setShowAsAction(1);
            menu.add(Utils.isCN() ? "重启" : "Restart").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
                private final CrashActiviy this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    try {
                        Intent intent = new Intent(this.this$0, Class.forName("com.almlkaide.kaypro.aide.application.activity.NoDisplayActivity"));
                        intent.addFlags(268435456);
                        this.this$0.startActivity(intent);
                        this.this$0.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        return false;
                    } catch (ClassNotFoundException e) {
                        throw new NoClassDefFoundError(e.getMessage());
                    }
                }
            }).setShowAsAction(1);
            return super.onCreateOptionsMenu(menu);
        }
    }
}
