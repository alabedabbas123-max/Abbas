package org.xutils.common.util;

import org.xutils.x;

public final class DensityUtil {
    private static float density = -1.0f;
    private static int widthPixels = -1;
    private static int heightPixels = -1;

    private DensityUtil() {
    }

    public static float getDensity() {
        if (density <= 0.0f) {
            density = ClassX.m9074app().getResources().getDisplayMetrics().density;
        }
        return density;
    }

    public static int dip2px(float f) {
        return (int) ((getDensity() * f) + 0.5f);
    }

    public static int px2dip(float f) {
        return (int) ((f / getDensity()) + 0.5f);
    }

    public static int getScreenWidth() {
        if (widthPixels <= 0) {
            widthPixels = ClassX.m9074app().getResources().getDisplayMetrics().widthPixels;
        }
        return widthPixels;
    }

    public static int getScreenHeight() {
        if (heightPixels <= 0) {
            heightPixels = ClassX.m9074app().getResources().getDisplayMetrics().heightPixels;
        }
        return heightPixels;
    }
}
