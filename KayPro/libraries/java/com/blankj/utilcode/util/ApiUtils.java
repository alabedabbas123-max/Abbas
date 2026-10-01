package com.blankj.utilcode.util;

import android.util.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ApiUtils {

    private static final String f4586TAG = "ApiUtils";
    private Map<Class, BaseApi> mApiMap;
    private Map<Class, Class> mInjectApiImplMap;

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC1529Api {
        boolean isMock() default false;
    }

    public static class BaseApi {
    }

    private static class LazyHolder {
        private static final ApiUtils INSTANCE = new ApiUtils();

        private LazyHolder() {
        }
    }

    private ApiUtils() {
        this.mApiMap = new ConcurrentHashMap();
        this.mInjectApiImplMap = new HashMap();
        init();
    }

    public static <T extends BaseApi> T getApi(Class<T> cls) {
        return (T) getInstance().getApiInner(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <Result> Result getApiInner(Class cls) {
        Result result = (Result) ((BaseApi) this.mApiMap.get(cls));
        if (result != null) {
            return result;
        }
        synchronized (cls) {
            Result result2 = (Result) ((BaseApi) this.mApiMap.get(cls));
            if (result2 != null) {
                return result2;
            }
            Class cls2 = this.mInjectApiImplMap.get(cls);
            if (cls2 == null) {
                Log.e(f4586TAG, "The <" + cls + "> doesn't implement.");
                return null;
            }
            try {
                Result result3 = (Result) ((BaseApi) cls2.newInstance());
                this.mApiMap.put(cls, (BaseApi) result3);
                return result3;
            } catch (Exception unused) {
                Log.e(f4586TAG, "The <" + cls2 + "> has no parameterless constructor.");
                return null;
            }
        }
    }

    private static ApiUtils getInstance() {
        return LazyHolder.INSTANCE;
    }

    private void init() {
    }

    public static void register(Class<? extends BaseApi> cls) {
        getInstance().registerImpl(cls);
    }

    private void registerImpl(Class cls) {
        this.mInjectApiImplMap.put(cls.getSuperclass(), cls);
    }

    public static String toString_() {
        return getInstance().toString();
    }

    public String toString() {
        return "ApiUtils: " + this.mInjectApiImplMap;
    }
}
