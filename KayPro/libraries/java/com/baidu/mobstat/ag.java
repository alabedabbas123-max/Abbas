package com.baidu.mobstat;

import android.content.Context;

public class ag {
    public static int m5969a(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float m5970b(Context context, float f) {
        if (context == null) {
            return 0.0f;
        }
        return (f / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int m5971c(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }
}
