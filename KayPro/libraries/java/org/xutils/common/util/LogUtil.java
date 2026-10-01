package org.xutils.common.util;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.mobstat.Config;
import java.util.Locale;
import org.xutils.x;

public class LogUtil {
    public static String customTagPrefix = "x_log";

    private LogUtil() {
    }

    private static String generateTag() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        String className = stackTraceElement.getClassName();
        String str = String.format(Locale.getDefault(), "%s.%s(L:%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        if (!TextUtils.isEmpty(customTagPrefix)) {
            return customTagPrefix + Config.TRACE_TODAY_VISIT_SPLIT + str;
        }
        return str;
    }

    public static void m9043d(String str) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.d(generateTag(), str);
        }
    }

    public static void m9044d(String str, Throwable th) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.d(generateTag(), str, th);
        }
    }

    public static void m9045e(String str) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.e(generateTag(), str);
        }
    }

    public static void m9046e(String str, Throwable th) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.e(generateTag(), str, th);
        }
    }

    public static void m9047i(String str) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.i(generateTag(), str);
        }
    }

    public static void m9048i(String str, Throwable th) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.i(generateTag(), str, th);
        }
    }

    public static void m9049v(String str) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.v(generateTag(), str);
        }
    }

    public static void m9050v(String str, Throwable th) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.v(generateTag(), str, th);
        }
    }

    public static void m9051w(String str) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.w(generateTag(), str);
        }
    }

    public static void m9052w(String str, Throwable th) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.w(generateTag(), str, th);
        }
    }

    public static void m9053w(Throwable th) {
        if (ClassX.isDebug()) {
            Log.w(generateTag(), th);
        }
    }

    public static void m9054wtf(String str) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.wtf(generateTag(), str);
        }
    }

    public static void m9055wtf(String str, Throwable th) {
        if (ClassX.isDebug() && !TextUtils.isEmpty(str)) {
            Log.wtf(generateTag(), str, th);
        }
    }

    public static void m9056wtf(Throwable th) {
        if (ClassX.isDebug()) {
            Log.wtf(generateTag(), th);
        }
    }
}
