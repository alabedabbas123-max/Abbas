package abcd;

@abcd.Interfacexu
class ServiceConnectionKi implements android.content.ServiceConnection {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.AbstractOi FH;

    static {
        abcd.wu.j6(abcd.ServiceConnectionKi.class, -6228992669085397497L, -49858147330989840L);
    }

    ServiceConnectionKi(abcd.AbstractOi r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -197403028489595000L)
    public void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5478669003169519633L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5478669003169519633L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.AbstractOi.j6(this.FH, "Licensing service connected.");     // Catch: java.lang.Throwable -> L7
        abcd.AbstractOi.j6(this.FH, com.aide.licensing.IAideLicensingService.a.j6(r9));     // Catch: java.lang.Throwable -> L7
        abcd.AbstractOi.j6(this.FH, false);     // Catch: java.lang.Throwable -> L7
        abcd.AbstractOi.j6(this.FH);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = 4565599093160098000L)
    public void onServiceDisconnected(android.content.ComponentName r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -616793488481455233L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-616793488481455233L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ue.FH("Licensing service unexpectedly disconnected.");     // Catch: java.lang.Throwable -> L8
        abcd.AbstractOi.j6(this.FH, false);     // Catch: java.lang.Throwable -> L8
        abcd.AbstractOi.j6(this.FH, null);     // Catch: java.lang.Throwable -> L8
    }
}
