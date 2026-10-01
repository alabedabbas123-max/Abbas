package com.aide.licensing;

@abcd.Interfacexu
public class LicenseUpdateAlarmReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.licensing.LicenseUpdateAlarmReceiver.class, -1214724525099987816L, -1214724525099987816L);
    }

    public LicenseUpdateAlarmReceiver() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 242723384064248805L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(242723384064248805L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void DW(android.content.Context r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -7397548022290710592L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-7397548022290710592L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, 120000, false);     // Catch: java.lang.Throwable -> L8
    }

    public static void j6(android.content.Context r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -236552509058634860L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-236552509058634860L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, 3600000, true);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -341753287749332060L)
    private static void j6(android.content.Context r8, int r9, boolean r10) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 1162441539074843508L, null, r8, new java.lang.Integer(r9), new java.lang.Boolean(r10));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1162441539074843508L, null, r8, new java.lang.Integer(r9), new java.lang.Boolean(r10));     // Catch: java.lang.Throwable -> L12
    L5:
        com.aide.licensing.d r0 = new com.aide.licensing.d();     // Catch: java.lang.Throwable -> L12
        r0.j6(r8, true);     // Catch: java.lang.Throwable -> L12
        if (r0.j6() == false) goto L18;
        abcd.ue.j6("Restarting timer.");     // Catch: java.lang.Throwable -> L12
        android.app.AlarmManager r1 = (android.app.AlarmManager) r8.getSystemService("alarm");     // Catch: java.lang.Throwable -> L12
        android.app.PendingIntent r7 = android.app.PendingIntent.getBroadcast(r8, 0, new android.content.Intent(r8, com.aide.licensing.LicenseUpdateAlarmReceiver.class), 0);     // Catch: java.lang.Throwable -> L12
        if (r10 == false) goto L10;
        r1.setInexactRepeating(0, java.lang.System.currentTimeMillis() + ((long) r9), 3600000, r7);     // Catch: java.lang.Throwable -> L12
        return;
    L10:
        r1.setRepeating(0, java.lang.System.currentTimeMillis() + ((long) r9), 3600000, r7);     // Catch: java.lang.Throwable -> L12
        return;
    }

    @Override
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -934271877848022180L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-934271877848022180L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.ue.j6("Timer broadcast received.");     // Catch: java.lang.Throwable -> L7
        r8.startService(new android.content.Intent(r8, com.aide.licensing.LicenseUpdateService.class));     // Catch: java.lang.Throwable -> L7
    }
}
