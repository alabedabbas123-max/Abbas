package com.almlkaide.kaypro.aide;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.blankj.utilcode.util.FileIOUtils;
import com.almlkaide.kaypro.aide.application.AppTheme;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.aide.util.QuickKey;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Keep
public class AdvancedSetting {
    public static String[] getGradleComple() {
        File gradleCompleFile = getGradleCompleFile();
        return (gradleCompleFile == null || !gradleCompleFile.exists()) ? (String[]) FileIOUtils.readFile2List(getDefGradleCompleFile().getAbsolutePath()).toArray(new String[0]) : (String[]) FileIOUtils.readFile2List(gradleCompleFile.getAbsolutePath()).toArray(new String[0]);
    }

    public static File getGradleCompleFile() {
        String string = Utils.getSp().getString("gradle_comple_file", (String) null);
        return (string == null || !string.startsWith("/")) ? (File) null : new File(string);
    }

    public static File getDefGradleCompleFile() {
        File file = new File(Utils.getApp().getFilesDir(), "gradle_comple_file.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
            }
        }
        return file;
    }

    public static boolean isEnableStringFog() {
        return Utils.getSp().getBoolean("advanced_setting_enable_stringfog", false);
    }

    public static boolean isEnableResGuard() {
        return Utils.getSp().getBoolean("advanced_setting_enable_resguard", false);
    }

    public static boolean isEnableTranslate() {
        return Utils.getSp().getBoolean("advanced_setting_enable_translate", false);
    }

    public static boolean isEnableAdrt() {
        return Utils.getSp().getBoolean("advanced_setting_enable_adrt", true);
    }

    public static boolean isEnableMenuCode() {
        return Utils.getSp().getBoolean("advanced_setting_enable_menu_code", true);
    }

    public static boolean isEnableDrawer() {
        return Utils.getSp().getBoolean("advanced_setting_enable_drawer", true);
    }

    public static boolean isEnableGradle() {
        return Utils.getSp().getBoolean("advanced_setting_enable_gradle", false);
    }

    public static String getThemeName() {
        return AppTheme.getThemeName();
    }

    public static void setTheme(String str) {
        AppTheme.setTheme(str);
    }

    public static void setFindResultTextView(TextView textView) {
        textView.setSingleLine(false);
        textView.setMaxLines(2);
        textView.setTextSize(14.0f);
    }

    public static String getBuildApkPath(String str) {
        String name = new File(str).getName();
        if (!name.endsWith(".apk")) {
            name = new StringBuffer().append(name).append(".apk").toString();
        }
        return Utils.getSp().getBoolean("advanced_setting_adjust_apk_build_path", false) ? new File(ProjectUtils.getBin(ProjectUtils.getCurrentProject()), name).getAbsolutePath() : new File(Utils.getApp().getExternalCacheDir(), String.format("apk/%s", name)).getAbsolutePath();
    }

    public static String getEditorQuickKey() {
        File currentEditorFile = AIDEUtils.getCurrentEditorFile();
        return QuickKey.getKey((currentEditorFile == null || currentEditorFile.getName().indexOf(".") < 0) ? ".java" : Utils.getFileNameSuffix(currentEditorFile.getName()));
    }

    public static Typeface getEditorTypeface() {
        try {
            return Typeface.createFromFile(Utils.getSp().getString("advanced_setting_editor_font", (String) null));
        } catch (Exception e) {
            return Typeface.MONOSPACE;
        }
    }

    public static String getPackagePrefix(String str) {
        String string = Utils.getSp().getString("advanced_setting_package_prefix", (String) null);
        if (TextUtils.isEmpty(string)) {
            string = "com.example.";
        }
        if (!string.endsWith(".")) {
            string = new StringBuffer().append(string).append(".").toString();
        }
        return new StringBuffer().append(string).append(str.toLowerCase(Locale.ENGLISH)).toString();
    }

    public static List<String> getDependencyList() {
        return new ArrayList();
    }
}
