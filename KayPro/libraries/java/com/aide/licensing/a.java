package com.aide.licensing;

@abcd.Interfacexu
class a implements android.content.ServiceConnection {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.licensing.d FH;

    static {
        abcd.wu.j6(com.aide.licensing.a.class, 2773153765153353776L, 4870152255606488055L);
    }

    a(com.aide.licensing.d r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1265895324247227440L)
    public void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -441918266366148105L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-441918266366148105L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.ue.j6("Licensing service connected.");     // Catch: java.lang.Throwable -> L7
        com.aide.licensing.d.j6(this.FH, com.android.vending.licensing.ILicensingService.a.j6(r9));     // Catch: java.lang.Throwable -> L7
        com.aide.licensing.d.j6(this.FH, false);     // Catch: java.lang.Throwable -> L7
        com.aide.licensing.d.j6(this.FH);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = -709114751916616728L)
    public void onServiceDisconnected(android.content.ComponentName r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 507656950902017423L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(507656950902017423L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ue.FH("Licensing service unexpectedly disconnected.");     // Catch: java.lang.Throwable -> L8
        com.aide.licensing.d.j6(this.FH, false);     // Catch: java.lang.Throwable -> L8
        com.aide.licensing.d.j6(this.FH, null);     // Catch: java.lang.Throwable -> L8
    }
}
