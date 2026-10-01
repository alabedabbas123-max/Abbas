package com.almlkaide.kaypro.aide.application;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ListView;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;

public class AppTheme {
    public static final String THEME_DEFAULT = "默认";
    public static final String THEME_INDIGO = "靛蓝";

    public static void customList(ListView listView) {
        if (listView == null) {
            return;
        }
        listView.setDivider((Drawable) null);
    }

    public static String getThemeName() {
        return Utils.getSp().getString("theme_name", THEME_DEFAULT);
    }

    public static void setTheme(String str) {
        Utils.getSp().edit().putString("theme_name", str).commit();
    }

    public static void initTheme(Activity activity) {
        String themeName = AdvancedSetting.getThemeName();
        if (AIDEUtils.isTrainerMode()) {
            activity.setTheme(AideR.style.MyAppThemeLight);
            if (Build.VERSION.SDK_INT >= 23) {
                Utils.setSystemStatusBarLight(activity, true);
            }
            Toasty.enable = false;
            return;
        }
        if (AIDEUtils.isLightTheme()) {
            if (THEME_INDIGO.equals(themeName)) {
                activity.setTheme(AideR.style.MyAppThemeDark_Indigo);
            } else {
                activity.setTheme(AideR.style.MyAppThemeLight);
                Utils.setSystemStatusBarLight(activity, true);
            }
        } else if (THEME_INDIGO.equals(themeName)) {
            activity.setTheme(AideR.style.MyAppThemeDark_Indigo);
        } else {
            activity.setTheme(AideR.style.MyAppThemeDark);
        }
        if (THEME_INDIGO.equals(themeName)) {
            Toasty.enable = true;
        } else {
            Toasty.enable = false;
        }
    }
}
