package com;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.util.Arrays;

public class ClassB {
    public static void dark(Activity activity, int i) {
        activity.setTheme(i);
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
    }

    public static void light(Activity activity, int i) {
        activity.setTheme(i);
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public static void m5830log(String str, String str2, String str3) {
        Log.i("READER", Arrays.toString(new String[]{str, str2, str3}));
    }
}
