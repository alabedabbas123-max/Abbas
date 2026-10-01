package org.xutils.http;

import android.os.Parcelable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.util.LogUtil;

final class RequestParamsHelper {
    private static final ClassLoader BOOT_CL = String.class.getClassLoader();

    interface ParseKVListener {
        void onParseKV(String str, Object obj);
    }

    private RequestParamsHelper() {
    }

    static void parseKV(Object obj, Class<?> cls, ParseKVListener parseKVListener) {
        ClassLoader classLoader;
        if (obj != null && cls != null && cls != RequestParams.class && cls != Object.class && (classLoader = cls.getClassLoader()) != null && classLoader != BOOT_CL) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    if (!Modifier.isTransient(field.getModifiers()) && !"serialVersionUID".equals(name) && field.getType() != Parcelable.Creator.class) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null) {
                                parseKVListener.onParseKV(name, obj2);
                            }
                        } catch (Throwable th) {
                            LogUtil.m9046e(th.getMessage(), th);
                        }
                    }
                }
            }
            parseKV(obj, cls.getSuperclass(), parseKVListener);
        }
    }

    static Object parseJSONObject(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            JSONArray jSONArray = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray.put(parseJSONObject(Array.get(obj, i)));
            }
            return jSONArray;
        }
        if (obj instanceof Iterable) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray2.put(parseJSONObject(it.next()));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && value != null) {
                    jSONObject.put(String.valueOf(key), parseJSONObject(value));
                }
            }
            return jSONObject;
        }
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null && classLoader != BOOT_CL) {
            final JSONObject jSONObject2 = new JSONObject();
            parseKV(obj, cls, new ParseKVListener() {
                @Override
                public void onParseKV(String str, Object obj2) {
                    try {
                        jSONObject2.put(str, RequestParamsHelper.parseJSONObject(obj2));
                    } catch (JSONException e) {
                        throw new IllegalArgumentException("parse RequestParams to json failed", e);
                    }
                }
            });
            return jSONObject2;
        }
        return obj;
    }
}
