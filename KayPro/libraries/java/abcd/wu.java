package abcd;

public class wu {
    private static java.lang.String DW;
    private static java.lang.Object FH;
    private static android.app.Application j6;

    static {
        FH = new java.lang.Object();
    }

    public static java.lang.String DW() {
        return DW;
    }

    public static void DW(java.lang.Object r1, int r2, android.app.Notification r3) {
    L8:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (j6 != null) goto L5;
        return;
    L5:
        if ((r1 instanceof android.app.Service) == false) goto L14;
        abcd.Iv.j6(null, r2, r3);     // Catch: java.lang.Throwable -> L8
        return;
    }

    public static android.app.Application j6() {
        return j6;
    }

    private static android.app.Application j6(java.lang.Object r1) {
        if ((r1 instanceof android.app.Application) == false) goto L6;
        return (android.app.Application) r1;
    L6:
        if ((r1 instanceof android.content.Context) == false) goto L10;
        android.content.Context r2 = (android.content.Context) r1;
        if ((r2.getApplicationContext() instanceof android.app.Application) == false) goto L10;
        return (android.app.Application) r2.getApplicationContext();
    L10:
        return null;
    }

    public static android.app.PendingIntent j6(android.content.Context r1, int r2, android.content.Intent r3, int r4) {
        if (j6 == null) goto L7;
        return abcd.Iv.j6(r1, r2, r3, r4, null);
    L7:
        return android.app.PendingIntent.getActivity(r1, r2, r3, r4);
    }

    public static void j6(long r2, java.lang.Object r4) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[0]);     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, int r5) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[]{java.lang.Integer.valueOf(r5)});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, java.lang.Object r5) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[]{r5});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[]{r5, r6});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[]{r5, r6, r7});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[]{r5, r6, r7, r8});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[]{r5, r6, r7, r8, r9});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, boolean r5) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, new java.lang.Object[]{java.lang.Boolean.valueOf(r5)});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(long r2, java.lang.Object r4, java.lang.Object[] r5) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.j6.contains(java.lang.Long.valueOf(r2)) == false) goto L11;
        abcd.kv.j6(r2, r4, r5);     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(android.os.Bundle r1, java.lang.Object r2, int r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (j6 == null) goto L11;
        abcd.Jv.j6(r1, r2, r3, r4, r5, r6);     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(android.os.Bundle r1, java.lang.Object r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (j6 == null) goto L11;
        abcd.Jv.j6(r1, r2, r3, r4, r5, r6, r7);     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(com.appfour.backbone.api.objects.MarketReferrer r0, long r1, long r3) {
        abcd.kv.j6(r0, r1, r3);
    }

    public static void j6(java.lang.Class<?> r0, long r1, long r3) {
        abcd.Ev.j6(r0, r1, r3);     // Catch: java.lang.Throwable -> L4
        abcd.kv.j6(r1, r3);     // Catch: java.lang.Throwable -> L4
        return;
    L4:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }

    public static void j6(java.lang.Object r1, int r2, int r3, android.content.Intent r4) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (j6 == null) goto L11;
        abcd.Jv.j6(r1, r2, r3, r4);     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(java.lang.Object r1, int r2, android.app.Notification r3) {
    L8:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (j6 != null) goto L5;
        return;
    L5:
        if ((r1 instanceof android.app.NotificationManager) == false) goto L14;
        abcd.Iv.j6(null, r2, r3);     // Catch: java.lang.Throwable -> L8
        return;
    }

    public static void j6(java.lang.Object r7, long r8, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        java.lang.Object r0 = FH;     // Catch: java.lang.Throwable -> L34
        monitor-enter(r0);     // Catch: java.lang.Throwable -> L34
        boolean r2 = false;
        if (j6 == null) goto L7;
    L19:
        boolean r9 = false;
    L20:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L31
        if (j6 != null) goto L24;
        return;
    L24:
        if (com.appfour.backbone.api.Api.isMainProcess() == false) goto L29;
        if (r2 == false) goto L27;
        abcd.kv.j6(new com.appfour.backbone.api.objects.Market(j6.getPackageManager().getInstallerPackageName(j6.getPackageName())));     // Catch: java.lang.Throwable -> L34
        goto L29
    L27:
        if (r9 == false) goto L29;
        abcd.kv.FH();     // Catch: java.lang.Throwable -> L34
    L29:
        abcd.kv.j6(j6);     // Catch: java.lang.Throwable -> L34
        return;
    L7:
        if (android.os.Build.VERSION.SDK_INT < 14) goto L19;
        if (java.lang.System.currentTimeMillis() >= 1575158400000L) goto L19;
        android.app.Application r14 = j6(r7);     // Catch: java.lang.Throwable -> L31
        if (r14 == null) goto L19;
        java.io.File r1 = abcd.uw.DW(r14, r13);     // Catch: java.lang.Throwable -> L31
        if (r1 != null) goto L15;
    L18:
        j6 = r14;     // Catch: java.lang.Throwable -> L31
        DW = r10;     // Catch: java.lang.Throwable -> L31
        abcd.Mv.aM();     // Catch: java.lang.Throwable -> L31
        r2 = abcd.rw.j6();     // Catch: java.lang.Throwable -> L31
        r9 = abcd.rw.DW();     // Catch: java.lang.Throwable -> L31
        abcd.qw.DW();     // Catch: java.lang.Throwable -> L31
        abcd.xw.j6();     // Catch: java.lang.Throwable -> L31
        abcd.kv.j6(r2);     // Catch: java.lang.Throwable -> L31
        abcd.ow.j6(r2, r8, r11, r12);     // Catch: java.lang.Throwable -> L31
        abcd.Lv.j6();     // Catch: java.lang.Throwable -> L31
        abcd.Hv.u7();     // Catch: java.lang.Throwable -> L31
        abcd.Ov.j6();     // Catch: java.lang.Throwable -> L31
        abcd.Yv.j6(r13);     // Catch: java.lang.Throwable -> L31
        goto L20
    L15:
        if (r1.exists() == false) goto L18;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L31
        return;
    L31:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L34
    L34:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }

    public static void j6(java.lang.Object r1, android.content.Intent r2) {
    L8:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (j6 != null) goto L5;
        return;
    L5:
        if ((r1 instanceof android.app.Activity) == false) goto L14;
        abcd.Iv.j6((android.app.Activity) r1, r2);     // Catch: java.lang.Throwable -> L8
        return;
    }

    public static void j6(java.lang.Object r1, android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (j6 == null) goto L11;
        abcd.Jv.j6(r1, r2, r3, r4, r5, r6, r7);     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(java.lang.Throwable r2, long r3, java.lang.Object r5) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.DW.contains(java.lang.Long.valueOf(r3)) == false) goto L11;
        abcd.kv.j6(r3, r2, r5, new java.lang.Object[0]);     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(java.lang.Throwable r2, long r3, java.lang.Object r5, java.lang.Object r6) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.DW.contains(java.lang.Long.valueOf(r3)) == false) goto L11;
        abcd.kv.j6(r3, r2, r5, new java.lang.Object[]{r6});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(java.lang.Throwable r2, long r3, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.DW.contains(java.lang.Long.valueOf(r3)) == false) goto L11;
        abcd.kv.j6(r3, r2, r5, new java.lang.Object[]{r6, r7});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(java.lang.Throwable r2, long r3, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.DW.contains(java.lang.Long.valueOf(r3)) == false) goto L11;
        abcd.kv.j6(r3, r2, r5, new java.lang.Object[]{r6, r7, r8});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(java.lang.Throwable r2, long r3, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.DW.contains(java.lang.Long.valueOf(r3)) == false) goto L11;
        abcd.kv.j6(r3, r2, r5, new java.lang.Object[]{r6, r7, r8, r9});     // Catch: java.lang.Throwable -> L6
        return;
    }

    public static void j6(java.lang.Throwable r2, long r3, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
    L6:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        return;
    L3:
        if (abcd.Ev.DW.contains(java.lang.Long.valueOf(r3)) == false) goto L11;
        abcd.kv.j6(r3, r2, r5, new java.lang.Object[]{r6, r7, r8, r9, r10});     // Catch: java.lang.Throwable -> L6
        return;
    }
}
