package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

public class ViewUtil {
    public static <T extends View> T findViewByTag(Activity activity, Object obj) {
        return (T) findViewByTag(activity.findViewById(R.id.content), obj);
    }

    public static <T extends View> T findViewByTag(View view, Object obj) {
        if (obj.equals(view.getTag())) {
            return (T) view;
        }
        if (view instanceof ViewGroup) {
            return (T) findViewByTag((ViewGroup) view, obj);
        }
        return (T) null;
    }

    public static <T extends View> T findViewByTag(ViewGroup viewGroup, Object obj) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < viewGroup.getChildCount()) {
                View viewFindViewByTag = findViewByTag(viewGroup.getChildAt(i2), obj);
                if (viewFindViewByTag == null) {
                    i = i2 + 1;
                } else {
                    return (T) viewFindViewByTag;
                }
            } else {
                return (T) null;
            }
        }
    }

    public static <T extends View> T findViewByName(Activity activity, String str) {
        return (T) findViewByName(activity.findViewById(R.id.content), str);
    }

    public static <T extends View> T findViewByName(Activity activity, Class cls) {
        return (T) findViewByName(activity, cls.getCanonicalName());
    }

    public static <T extends View> T findViewByName(ViewGroup viewGroup, String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < viewGroup.getChildCount()) {
                View viewFindViewByName = findViewByName(viewGroup.getChildAt(i2), str);
                if (viewFindViewByName == null) {
                    i = i2 + 1;
                } else {
                    return (T) viewFindViewByName;
                }
            } else {
                return (T) null;
            }
        }
    }

    public static <T extends View> T findViewByName(ViewGroup viewGroup, Class cls) {
        return (T) findViewByName(viewGroup, cls.getCanonicalName());
    }

    public static <T extends View> T findViewByName(View view, String str) {
        if (str.equals(view.getClass().getCanonicalName())) {
            return (T) view;
        }
        if (view instanceof ViewGroup) {
            return (T) findViewByName((ViewGroup) view, str);
        }
        return (T) null;
    }

    public static <T extends View> T findViewByName(View view, Class cls) {
        return (T) findViewByName(view, cls.getCanonicalName());
    }
}
