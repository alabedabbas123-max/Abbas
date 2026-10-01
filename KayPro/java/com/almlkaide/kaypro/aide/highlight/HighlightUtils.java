package com.almlkaide.kaypro.aide.highlight;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.Keep;
import com.almlkaide.kaypro.aide.AdvancedSetting;
import com.almlkaide.kaypro.aide.application.AppTheme;
import com.almlkaide.kaypro.aide.highlight.color.ColorDefault;
import com.almlkaide.kaypro.aide.highlight.color.ColorImpl;
import com.almlkaide.kaypro.aide.highlight.color.Colors;
import com.almlkaide.kaypro.aide.highlight.color.style.ColorIndigo;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.Utils;
import java.util.Locale;

@Keep
public class HighlightUtils {
    public static ColorImpl getHighlightColor() {
        return AppTheme.THEME_INDIGO.equals(AdvancedSetting.getThemeName()) ? new ColorIndigo() : new ColorDefault();
    }

    public static void init() {
        initKey(new ColorDefault(), AppTheme.THEME_DEFAULT);
        initKey(new ColorIndigo(), AppTheme.THEME_INDIGO);
    }

    public static void initKey(ColorImpl colorImpl, String str) {
        SharedPreferences hSp = getHSp(str);
        SharedPreferences.Editor editorEdit = hSp.edit();
        for (Colors colors : colorImpl.values()) {
            String spKey = getSpKey(colors.name, true);
            String spKey2 = getSpKey(colors.name, false);
            if (!hSp.contains(spKey)) {
                editorEdit.putString(spKey, colors.lightColor);
            }
            if (!hSp.contains(spKey2)) {
                editorEdit.putString(spKey2, colors.darkColor);
            }
        }
        editorEdit.commit();
    }

    public static int getHighLightColor(String str, boolean z, int i, int i2) {
        try {
            return Color.parseColor(getHSp().getString(getSpKey(str, z), (String) null));
        } catch (Throwable th) {
            if (!z) {
                i = i2;
            }
            return Utils.getColorFromResources(i);
        }
    }

    public static String getColorByKey(String str) {
        return getHSp().getString(str, (String) null);
    }

    public static String getSpKey(String str, boolean z) {
        return new StringBuffer().append(str.replaceAll("[^a-z|A-Z]", "_").toLowerCase(Locale.ENGLISH)).append(z ? "_light" : "_dark").toString();
    }

    public static SharedPreferences getHSp() {
        return getHSp(AdvancedSetting.getThemeName());
    }

    public static SharedPreferences getHSp(String str) {
        if (AIDEUtils.isTrainerMode()) {
            str = AppTheme.THEME_DEFAULT;
        }
        return Utils.getApp().getSharedPreferences(new StringBuffer().append("CodeHighlight").append(Utils.toUpperCaseFirst(new StringBuffer().append("_").append(str).toString())).toString(), 0);
    }

    public static int getColorInt(Colors colors) {
        return getColorInt(colors, AIDEUtils.isLightTheme());
    }

    public static int getColorInt(Colors colors, boolean z) {
        try {
            return Color.parseColor(getColorByKey(getSpKey(colors.name, z)));
        } catch (Throwable th) {
            return Color.parseColor(z ? colors.lightColor : colors.darkColor);
        }
    }

    public static int getColorInt(Colors colors, int i, int i2) {
        if (AIDEUtils.isLightTheme()) {
            try {
                return getColorInt(colors, true);
            } catch (Exception e) {
                return Utils.getColorFromResources(i);
            }
        }
        try {
            return getColorInt(colors, false);
        } catch (Exception e2) {
            return Utils.getColorFromResources(i2);
        }
    }
}
