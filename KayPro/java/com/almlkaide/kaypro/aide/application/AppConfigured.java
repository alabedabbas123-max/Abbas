package com.almlkaide.kaypro.aide.application;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.util.Utils;

public class AppConfigured {

    public static class VERSION {
        public static final int BASE = 3;
        public static final int DARK_STATUSBAR = 4;
    }

    public static void init() {
        initWhatsNewDialog();
        initStatusbar();
        initBase();
    }

    private static void initStatusbar() {
        if (Utils.getSp().getInt("dark_statusbar_version", 0) < 4) {
            Utils.getSp().edit().putInt("dark_statusbar_version", 4).commit();
            Utils.getSp().edit().putBoolean("dark_statusbar", false).commit();
        }
    }

    private static void initBase() {
        SharedPreferences sp = Utils.getSp();
        if (sp.getInt("app_configured_version", -1) < 3) {
            SharedPreferences.Editor editorEdit = sp.edit();
            initDefaultTheme(editorEdit);
            initJavaNewLine(editorEdit);
            editorEdit.putString("editor_font_size", "10");
            editorEdit.putString("max_single_imports", "100");
            editorEdit.putInt("app_configured_version", 3);
            editorEdit.commit();
        }
    }

    private static void initWhatsNewDialog() {
        try {
            Application app = Utils.getApp();
            SharedPreferences sharedPreferences = app.getSharedPreferences("WhatsNew", 0);
            PackageInfo packageInfo = app.getPackageManager().getPackageInfo(app.getPackageName(), 0);
            if (sharedPreferences.getInt("ShownVersion", -1) < packageInfo.versionCode) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("ShownVersion", packageInfo.versionCode);
                editorEdit.commit();
            }
        } catch (Throwable th) {
        }
    }

    private static void initDefaultTheme(SharedPreferences.Editor editor) {
        AdvancedSetting.setTheme(AppTheme.THEME_DEFAULT);
        editor.putBoolean("light_theme", true);
    }

    private static void initJavaNewLine(SharedPreferences.Editor editor) {
        String[] strArr = {"ADJUST_NEWLINES", "TYPE_NEWLINE", "METHOD_NEWLINE", "BLOCK_NEWLINE", "ELSE_NEWLINE", "CATCH_NEWLINE", "FINALLY_NEWLINE"};
        int i = 0;
        while (i < strArr.length) {
            editor.putBoolean(new StringBuffer().append("java_").append(strArr[i]).toString(), i == 0);
            i++;
        }
    }
}
