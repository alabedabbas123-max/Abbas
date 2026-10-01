package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AdaptScreenUtils {
    private static List<Field> sMetricsFields;

    private AdaptScreenUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Resources adaptHeight(Resources resources, int i) {
        return adaptHeight(resources, i, false);
    }

    public static Resources adaptHeight(Resources resources, int i, boolean z) {
        applyDisplayMetrics(resources, ((resources.getDisplayMetrics().heightPixels + (z ? getNavBarHeight(resources) : 0)) * 72.0f) / i);
        return resources;
    }

    public static Resources adaptWidth(Resources resources, int i) {
        applyDisplayMetrics(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i);
        return resources;
    }

    private static void applyDisplayMetrics(Resources resources, float f) {
        resources.getDisplayMetrics().xdpi = f;
        Utils.getApp().getResources().getDisplayMetrics().xdpi = f;
        applyOtherDisplayMetrics(resources, f);
    }

    private static void applyMetricsFields(Resources resources, float f) {
        Iterator<Field> it = sMetricsFields.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void applyOtherDisplayMetrics(Resources resources, float f) {
        if (sMetricsFields != null) {
            applyMetricsFields(resources, f);
            return;
        }
        sMetricsFields = new ArrayList();
        Class<?> superclass = resources.getClass();
        Field[] declaredFields = superclass.getDeclaredFields();
        while (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics metricsFromField = getMetricsFromField(resources, field);
                    if (metricsFromField != null) {
                        sMetricsFields.add(field);
                        metricsFromField.xdpi = f;
                    }
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            } else {
                declaredFields = superclass.getDeclaredFields();
            }
        }
    }

    public static Resources closeAdapt(Resources resources) {
        applyDisplayMetrics(resources, Resources.getSystem().getDisplayMetrics().density * 72.0f);
        return resources;
    }

    private static DisplayMetrics getMetricsFromField(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    private static int getNavBarHeight(Resources resources) {
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", Project.ANDROID);
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    static Runnable getPreLoadRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                AdaptScreenUtils.preLoad();
            }
        };
    }

    public static void preLoad() {
        applyDisplayMetrics(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }

    public static int pt2Px(float f) {
        double d = (f * Utils.getApp().getResources().getDisplayMetrics().xdpi) / 72.0f;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    public static int px2Pt(float f) {
        double d = (f * 72.0f) / Utils.getApp().getResources().getDisplayMetrics().xdpi;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }
}
