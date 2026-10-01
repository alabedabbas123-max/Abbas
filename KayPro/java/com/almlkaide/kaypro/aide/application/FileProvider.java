package com.almlkaide.kaypro.aide.application;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;

public class FileProvider {
    public static Uri file2Uri(File file) {
        return Build.VERSION.SDK_INT >= 24 ? getUriForFile(file) : Uri.fromFile(file);
    }

    public static String getAuthority() {
        return new StringBuffer().append(Utils.getApp().getPackageName()).append(".fileprovider").toString();
    }

    public static Uri getUriForFile(File file) {
        return getUriForFile(Utils.getApp().getApplicationContext(), getAuthority(), file);
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return (Uri) ReflectUtils.reflect("android.support.v4.content.FileProvider").method("j6", new Object[]{context, str, file}).get();
    }
}
