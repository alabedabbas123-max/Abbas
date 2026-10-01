package com.baidu.mobstat;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

public class cc {

    private static Object f4389a;

    private static Class<?> f4390b;

    private static Method f4391c;

    static {
        f4391c = null;
        try {
            f4390b = Class.forName("com.android.id.impl.IdProviderImpl");
            f4389a = f4390b.newInstance();
            f4391c = f4390b.getMethod("getOAID", Context.class);
        } catch (Exception e) {
        }
    }

    public static String m6606a(Context context) {
        return m6607a(context, f4391c);
    }

    private static String m6607a(Context context, Method method) {
        if (f4389a != null && method != null) {
            try {
                Object objInvoke = method.invoke(f4389a, context);
                if (objInvoke != null) {
                    return (String) objInvoke;
                }
            } catch (Exception e) {
                Log.e("IdentifierManager", "invoke exception!", e);
            }
        }
        return null;
    }
}
