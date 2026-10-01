package com.appfour.backbone.api;

@android.support.annotation.Keep
public class Api {
    public Api() {
    }

    public static java.lang.String anonymous(java.lang.CharSequence r1) {
        return com.appfour.backbone.api.runtime.b.j6().j6(r1);
    }

    public static <T> T catch_(com.appfour.backbone.api.objects.CatchExceptions<T> r0) {
        return r0.getValue();
    L4:
        return null;
    }

    public static com.appfour.backbone.api.define.DefineOccurrences defineEvent(java.lang.String r1) {
        return com.appfour.backbone.api.runtime.b.j6().defineEvent(r1);
    }

    public static com.appfour.backbone.api.objects.EventData event() {
        return com.appfour.backbone.api.runtime.b.j6().tp();
    }

    public static com.appfour.backbone.api.objects.EventData event(com.appfour.backbone.api.objects.CatchExceptions<?> r1) {
        return com.appfour.backbone.api.runtime.b.j6().tp().setValue(r1);
    }

    public static com.appfour.backbone.api.objects.EventData event(java.lang.Object r1) {
        return com.appfour.backbone.api.runtime.b.j6().tp().setValue(r1);
    }

    public static java.lang.String getAppAndVersionName() {
        return com.appfour.backbone.api.runtime.b.j6().Hw();
    }

    public static java.lang.String getAppId() {
        return com.appfour.backbone.api.runtime.b.j6().QX();
    }

    public static java.lang.String getAppName() {
        return com.appfour.backbone.api.runtime.b.j6().u7();
    }

    public static int getAppVersionCode() {
        return com.appfour.backbone.api.runtime.b.j6().FH();
    }

    public static java.lang.String getAppVersionName() {
        return com.appfour.backbone.api.runtime.b.j6().J8();
    }

    public static java.lang.String getBuildVariantName() {
        return com.appfour.backbone.api.runtime.b.j6().Ws();
    }

    public static java.lang.String getDeviceFeaturesText() {
        return com.appfour.backbone.api.runtime.b.j6().we();
    }

    public static java.lang.String getDisplayMetricsText() {
        return com.appfour.backbone.api.runtime.b.j6().v5();
    }

    public static long getInstallTime() {
        return com.appfour.backbone.api.runtime.b.j6().j6();
    }

    public static long getLastUpdateTime() {
        return com.appfour.backbone.api.runtime.b.j6().VH();
    }

    public static java.lang.String getProcessName() {
        return com.appfour.backbone.api.runtime.b.j6().J0();
    }

    public static long getTimeSinceInstall() {
        return com.appfour.backbone.api.runtime.b.j6().EQ();
    }

    public static boolean hasBeenUpdated() {
        if (getInstallTime() == getLastUpdateTime()) goto L5;
        return true;
    L5:
        return false;
    }

    public static java.lang.String identifier(java.lang.Object r1) {
        return com.appfour.backbone.api.runtime.b.j6().DW(r1);
    }

    public static <T> T if_(boolean r0, T r1) {
        if (r0 == true) goto L6;
        return null;
    L6:
        return r1;
    }

    public static boolean isMainProcess() {
        return com.appfour.backbone.api.runtime.b.j6().gn();
    }

    public static boolean isMainThread() {
        return com.appfour.backbone.api.runtime.b.j6().Zo();
    }

    public static com.appfour.backbone.api.objects.EventData property() {
        return com.appfour.backbone.api.runtime.b.j6().tp().setIsProperty(true);
    }

    public static com.appfour.backbone.api.objects.EventData property(com.appfour.backbone.api.objects.CatchExceptions<?> r2) {
        return com.appfour.backbone.api.runtime.b.j6().tp().setIsProperty(true).setValue(r2);
    }

    public static com.appfour.backbone.api.objects.EventData property(java.lang.Object r2) {
        return com.appfour.backbone.api.runtime.b.j6().tp().setIsProperty(true).setValue(r2);
    }

    public static <T> T this_(java.lang.Class<T> r1) {
        return (T) com.appfour.backbone.api.runtime.b.j6().j6(r1);
    }

    public static void undefineEvent(java.lang.String r1) {
        com.appfour.backbone.api.runtime.b.j6().undefineEvent(r1);
    }
}
