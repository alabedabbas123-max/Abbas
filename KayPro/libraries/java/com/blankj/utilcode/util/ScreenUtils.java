package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.jvm.ByteCodes;

public final class ScreenUtils {
    private ScreenUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getAppScreenHeight() {
        WindowManager windowManager = (WindowManager) Utils.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int getAppScreenWidth() {
        WindowManager windowManager = (WindowManager) Utils.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static float getScreenDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int getScreenDensityDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static int getScreenHeight() {
        WindowManager windowManager = (WindowManager) Utils.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealSize(point);
        } else {
            windowManager.getDefaultDisplay().getSize(point);
        }
        return point.y;
    }

    public static int getScreenRotation(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return ByteCodes.getfield;
        }
        if (rotation != 3) {
            return 0;
        }
        return ByteCodes.ishll;
    }

    public static int getScreenWidth() {
        WindowManager windowManager = (WindowManager) Utils.getApp().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealSize(point);
        } else {
            windowManager.getDefaultDisplay().getSize(point);
        }
        return point.x;
    }

    public static int getSleepDuration() {
        try {
            return Settings.System.getInt(Utils.getApp().getContentResolver(), "screen_off_timeout");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return -123;
        }
    }

    public static boolean isFullScreen(Activity activity) {
        return (activity.getWindow().getAttributes().flags & Flags.ABSTRACT) == 1024;
    }

    public static boolean isLandscape() {
        return Utils.getApp().getResources().getConfiguration().orientation == 2;
    }

    public static boolean isPortrait() {
        return Utils.getApp().getResources().getConfiguration().orientation == 1;
    }

    public static boolean isScreenLock() {
        KeyguardManager keyguardManager = (KeyguardManager) Utils.getApp().getSystemService("keyguard");
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static Bitmap screenShot(Activity activity) {
        return screenShot(activity, false);
    }

    public static Bitmap screenShot(Activity activity, boolean z) {
        Bitmap bitmapView2Bitmap = UtilsBridge.view2Bitmap(activity.getWindow().getDecorView());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (!z) {
            return Bitmap.createBitmap(bitmapView2Bitmap, 0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        int statusBarHeight = UtilsBridge.getStatusBarHeight();
        return Bitmap.createBitmap(bitmapView2Bitmap, 0, statusBarHeight, displayMetrics.widthPixels, displayMetrics.heightPixels - statusBarHeight);
    }

    public static void setFullScreen(Activity activity) {
        activity.getWindow().addFlags(Flags.ABSTRACT);
    }

    public static void setLandscape(Activity activity) {
        activity.setRequestedOrientation(0);
    }

    public static void setNonFullScreen(Activity activity) {
        activity.getWindow().clearFlags(Flags.ABSTRACT);
    }

    public static void setPortrait(Activity activity) {
        activity.setRequestedOrientation(1);
    }

    public static void setSleepDuration(int i) {
        Settings.System.putInt(Utils.getApp().getContentResolver(), "screen_off_timeout", i);
    }

    public static void toggleFullScreen(Activity activity) {
        boolean zIsFullScreen = isFullScreen(activity);
        Window window = activity.getWindow();
        if (zIsFullScreen) {
            window.clearFlags(Flags.ABSTRACT);
        } else {
            window.addFlags(Flags.ABSTRACT);
        }
    }
}
