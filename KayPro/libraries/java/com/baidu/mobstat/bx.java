package com.baidu.mobstat;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.android.common.util.CommonParam;
import com.baidu.mobstat.util.CuidUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public final class bx {
    public static String m6592a(Context context) {
        if (!bu.m6524a().m6528a(false)) {
            return "";
        }
        String cuid = "";
        try {
            cuid = CommonParam.getCUID(context);
        } catch (Throwable th) {
        }
        if (TextUtils.isEmpty(cuid)) {
            return CuidUtil.getCuid3(context);
        }
        return cuid;
    }

    public static HashMap<String, String> m6594a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new HashMap<>(map);
    }

    public static String m6591a(long j) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
        return simpleDateFormat.format(date);
    }

    public static boolean m6595a(Class<?> cls, String str) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String methodName = stackTraceElement.getMethodName();
            if (!TextUtils.isEmpty(methodName) && cls != null && methodName.equals(str)) {
                String className = stackTraceElement.getClassName();
                Class<?> cls2 = null;
                try {
                    cls2 = Class.forName(className);
                } catch (Throwable th) {
                }
                if (cls2 != null && cls.isAssignableFrom(cls2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String m6593a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.length() > i) {
            return str.substring(0, i);
        }
        return str;
    }
}
