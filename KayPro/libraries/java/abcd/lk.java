package abcd;

@abcd.Interfacexu
public class lk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 996150106863176160L)
    private boolean FH;

    @abcd.Interfaceru(field = 3542630941687810280L)
    private boolean Hw;

    static {
        abcd.wu.j6(abcd.lk.class, -843596403928054707L, -843596403928054707L);
    }

    public lk() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2673701869623466392L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2673701869623466392L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 489121587868889915L)
    private void DW(java.lang.String r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5478772013821762951L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5478772013821762951L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.F.j6("Run app with root");     // Catch: java.lang.Throwable -> L7
        new java.lang.Thread(new abcd.RunnableC0965kk(this, r8, r9)).start();     // Catch: java.lang.Throwable -> L7
    }

    static void j6(abcd.lk r0, java.lang.String r1) {
        r0.j6(r1);
    }

    static void j6(abcd.lk r0, java.lang.String r1, java.lang.String r2) {
        r0.DW(r1, r2);
    }

    @abcd.Interfacesu(method = 5317307856483046095L)
    private void j6(java.lang.String r8) {
    L27:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, -5404124222150917387L, this, r8);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5404124222150917387L, this, r8);     // Catch: java.lang.Throwable -> L27
    L7:
        if (com.aide.ui.U.dx() == true) goto L9;
    L11:
        android.content.Intent r2 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L27
        r2.addFlags(268435456);     // Catch: java.lang.Throwable -> L27
        r2.addFlags(4096);     // Catch: java.lang.Throwable -> L27
        if (android.os.Build.VERSION.SDK_INT < 24) goto L14;
        android.net.Uri r3 = android.support.v4.content.FileProvider.j6(com.aide.ui.U.Zo(), abcd.Vl.Hw(), new java.io.File(r8));     // Catch: java.lang.Throwable -> L27
        r2.addFlags(1);     // Catch: java.lang.Throwable -> L27
    L15:
        r2.setDataAndType(r3, "application/vnd.android.package-archive");     // Catch: java.lang.Throwable -> L27
        java.util.List<android.content.pm.ResolveInfo> r4 = com.aide.ui.U.Zo().getPackageManager().queryIntentActivities(r2, 0);     // Catch: java.lang.Throwable -> L27
        if (r4 != null) goto L18;
    L25:
        com.aide.ui.U.Zo().startActivity(r2);     // Catch: java.lang.Throwable -> L27
        abcd.F.j6("Run app without root");     // Catch: java.lang.Throwable -> L27
        return;
    L18:
        if (r4.size() <= 1) goto L25;
        java.util.Iterator<android.content.pm.ResolveInfo> r5 = r4.iterator();     // Catch: java.lang.Throwable -> L27
    L21:
        if (r5.hasNext() == false) goto L25;
        android.content.pm.ActivityInfo r6 = r5.next().activityInfo;     // Catch: java.lang.Throwable -> L27
        if ("com.android.packageinstaller".equals(r6.applicationInfo.packageName) == false) goto L21;
        r2.setComponent(new android.content.ComponentName(r6.applicationInfo.packageName, r6.name));     // Catch: java.lang.Throwable -> L27
        goto L25
    L14:
        r3 = android.net.Uri.fromFile(new java.io.File(r8));     // Catch: java.lang.Throwable -> L27
        goto L15
    L9:
        if (com.aide.ui.U.ei().FH() == true) goto L11;
    }

    @abcd.Interfacesu(method = 50355060517135400L)
    private void j6(boolean r9, java.lang.Runnable r10, java.lang.Runnable r11) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 3154158015646723140L, this, new java.lang.Boolean(r9), r10, r11);
    L19:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3154158015646723140L, this, new java.lang.Boolean(r9), r10, r11);     // Catch: java.lang.Throwable -> L15
    L5:
        if (r9 == true) goto L8;
        r11.run();     // Catch: java.lang.Throwable -> L15
        return;
    L8:
        if (this.Hw == true) goto L10;
        this.Hw = true;     // Catch: java.lang.Throwable -> L15
        new java.lang.Thread(new abcd.Runnablegk(this, r10, r11)).start();     // Catch: java.lang.Throwable -> L15
        return;
    L10:
        if (this.FH == false) goto L12;
        r10.run();     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        r11.run();     // Catch: java.lang.Throwable -> L15
    }

    static boolean j6(abcd.lk r0) {
        return r0.FH;
    }

    static boolean j6(abcd.lk r0, boolean r1) {
        r0.FH = r1;
        return r1;
    }

    public void j6(java.lang.String r8, java.lang.String r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -112108143730738111L, this, r8, r9);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-112108143730738111L, this, r8, r9);     // Catch: java.lang.Throwable -> L13
    L5:
        com.aide.ui.U.gn().Ws();     // Catch: java.lang.Throwable -> L13
        if (com.aide.ui.U.U2().Zo() == true) goto L8;
    L10:
        boolean r0 = false;
    L11:
        j6(r0, new abcd.Runnabledk(this, r8, r9), new abcd.Runnableek(this, r8));     // Catch: java.lang.Throwable -> L13
        return;
    L8:
        if (com.aide.ui.aa.SI() == false) goto L10;
        r0 = true;
        goto L11
    }
}
