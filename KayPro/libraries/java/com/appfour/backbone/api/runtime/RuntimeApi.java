package com.appfour.backbone.api.runtime;

@android.support.annotation.Keep
public class RuntimeApi {
    public RuntimeApi() {
    }

    public static java.lang.Object accessField(java.lang.Object r6, long r7, long r9) {
        return com.appfour.backbone.api.runtime.b.j6().j6(r6, r7, r9);
    }

    public static java.lang.Class<?> getClass(long r1) {
        return com.appfour.backbone.api.runtime.b.j6().j6(r1);
    }

    public static java.lang.Object invokeMethod(java.lang.Object r7, java.lang.Object[] r8, long r9, long r11) {
        return com.appfour.backbone.api.runtime.b.j6().j6(r7, r8, r9, r11);
    }

    public static boolean isInstanceOf(java.lang.Object r1, long r2) {
        return com.appfour.backbone.api.runtime.b.j6().j6(r1, r2);
    }

    public static void onDefineEventError(java.lang.Throwable r1) {
        com.appfour.backbone.api.runtime.b.j6().onDefineEventError(r1);
    }
}
