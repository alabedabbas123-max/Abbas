package abcd;

@abcd.Interfacexu
class ServiceConnectionsk implements android.content.ServiceConnection {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.yk FH;

    static {
        abcd.wu.j6(abcd.ServiceConnectionsk.class, -7932626172141952505L, 404002176226591423L);
    }

    ServiceConnectionsk(abcd.yk r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 380206884670360605L)
    public void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 26237578953835304L, this, r8, r9);
    L18:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(26237578953835304L, this, r8, r9);     // Catch: java.lang.Throwable -> L14
    L5:
        this.FH.VH("service connected.");     // Catch: java.lang.Throwable -> L14
        java.lang.Object r0 = abcd.yk.Zo(this.FH);     // Catch: java.lang.Throwable -> L14
        monitor-enter(r0);     // Catch: java.lang.Throwable -> L14
        abcd.yk.j6(this.FH, abcd.Interfacequ.a.j6(r9));     // Catch: java.lang.Throwable -> L11
        abcd.yk.DW(this.FH, true);     // Catch: java.lang.Throwable -> L11
        abcd.yk.Zo(this.FH).notifyAll();     // Catch: java.lang.Throwable -> L11
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        this.FH.j6();     // Catch: java.lang.Throwable -> L14
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    @Override
    @abcd.Interfacesu(method = -20389536286894953L)
    public void onServiceDisconnected(android.content.ComponentName r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 63626672643443136L, this, r7);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(63626672643443136L, this, r7);     // Catch: java.lang.Throwable -> L14
    L6:
        this.FH.VH("service disconnected.");     // Catch: java.lang.Throwable -> L14
        abcd.yk.j6(this.FH, false);     // Catch: java.lang.Throwable -> L14
        java.lang.Object r2 = abcd.yk.Zo(this.FH);     // Catch: java.lang.Throwable -> L14
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L14
        abcd.yk.j6(this.FH, null);     // Catch: java.lang.Throwable -> L11
        abcd.yk.DW(this.FH, false);     // Catch: java.lang.Throwable -> L11
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }
}
