package com.almlkaide.kaypro.app.base;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.application.AppTheme;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.Utils;

public class BaseActivity extends AbsActivity {
    @Override
    public boolean isApplyTheme() {
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        setStatusBar(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate(bundle);
    }

    public static void setStatusBar(Activity activity) {
        setStatusBar(activity.getWindow());
    }

    public static void setStatusBar(Window window) {
        String themeName = AdvancedSetting.getThemeName();
        boolean z = Utils.getSp().getBoolean("dark_statusbar", false);
        if (Build.VERSION.SDK_INT >= 23 && AppTheme.THEME_DEFAULT.equals(themeName) && AIDEUtils.isLightTheme()) {
            if (z) {
                window.setStatusBarColor(-2039584);
            } else {
                window.setStatusBarColor(-1);
            }
        }
    }
}
