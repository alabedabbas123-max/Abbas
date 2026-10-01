package com.almlkaide.kaypro.aide.util;

import android.content.res.AssetManager;
import com.aide.ui.MainActivity;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ObjectUtils;
import com.blankj.utilcode.util.StringUtils;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;

public class ResUtils {
    public static File getLocaleFile(File file) {
        if (file == null) {
            return (File) null;
        }
        File fileByPath = (File) null;
        String absolutePath = file.getAbsolutePath();
        String str = (String) ObjectUtils.getOrDefault(FileUtils.getFileExtension(absolutePath), "");
        String str2 = (String) ObjectUtils.getOrDefault(FileUtils.getFileNameNoExtension(absolutePath), "");
        Locale locale = getLocale();
        if (locale != null) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuffer stringBuffer = new StringBuffer(str2);
            StringBuffer stringBuffer2 = new StringBuffer(str2);
            if (!StringUtils.isEmpty(language)) {
                stringBuffer.append("-").append(language);
                stringBuffer2.append("-").append(language);
            }
            if (!StringUtils.isEmpty(country)) {
                stringBuffer2.append("-r").append(country);
            }
            stringBuffer.append(str);
            stringBuffer2.append(str);
            String string = stringBuffer2.toString();
            if (FileUtils.isFileExists(string)) {
                fileByPath = FileUtils.getFileByPath(string);
            }
            String string2 = stringBuffer.toString();
            if (FileUtils.isFileExists(string2)) {
                fileByPath = FileUtils.getFileByPath(string2);
            }
        }
        if (fileByPath != null && fileByPath.exists()) {
            file = fileByPath;
        }
        return file;
    }

    public static InputStream openAssetsLocaleFile(String str) {
        InputStream inputStreamOpen = (InputStream) null;
        AssetManager assets = Utils.getApp().getAssets();
        Locale locale = getLocale();
        if (locale != null) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuffer stringBuffer = new StringBuffer(str);
            StringBuffer stringBuffer2 = new StringBuffer(str);
            if (!StringUtils.isEmpty(language)) {
                stringBuffer.append("-").append(language);
                stringBuffer2.append("-").append(language);
            }
            if (!StringUtils.isEmpty(country)) {
                stringBuffer2.append("-r").append(country);
            }
            if (inputStreamOpen == null) {
                try {
                    inputStreamOpen = assets.open(stringBuffer2.toString());
                } catch (Throwable th) {
                }
            }
            if (inputStreamOpen == null) {
                try {
                    inputStreamOpen = assets.open(stringBuffer.toString());
                } catch (Throwable th2) {
                }
            }
        }
        if (inputStreamOpen == null) {
            try {
                return assets.open(str);
            } catch (Throwable th3) {
                return inputStreamOpen;
            }
        }
        return inputStreamOpen;
    }

    public static Locale getLocale() {
        MainActivity mainActivity = AIDEUtils.getMainActivity();
        if (mainActivity == null) {
            mainActivity = ActivityUtils.getTopActivity();
        }
        return mainActivity == null ? (Locale) null : mainActivity.getResources().getConfiguration().locale;
    }
}
