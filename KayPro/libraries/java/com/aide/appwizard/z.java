package com.aide.appwizard;

@abcd.Interfacexu
class z implements com.aide.common.ab<java.lang.Boolean> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.appwizard.runtime.i.b FH;

    @abcd.Interfacevu
    final com.aide.appwizard.B Hw;

    static {
        abcd.wu.j6(com.aide.appwizard.z.class, 3947348440358438304L, 1900671147023325664L);
    }

    z(com.aide.appwizard.B r1, com.aide.appwizard.runtime.i.b r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @abcd.Interfacesu(method = 5285026130750908875L)
    public void j62(java.lang.Boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 7347717509102492004L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(7347717509102492004L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.FH(r5);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6(java.lang.Boolean r1) {
        j62(r1);
    }
}
