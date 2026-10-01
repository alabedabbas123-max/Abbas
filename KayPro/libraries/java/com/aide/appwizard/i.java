package com.aide.appwizard;

@abcd.Interfacexu
class i implements com.aide.common.ab<java.lang.Boolean> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.appwizard.runtime.i.b FH;

    @abcd.Interfacevu
    final com.aide.appwizard.B Hw;

    static {
        abcd.wu.j6(com.aide.appwizard.i.class, 3947348440358438304L, -5959149736594528825L);
    }

    i(com.aide.appwizard.B r1, com.aide.appwizard.runtime.i.b r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @abcd.Interfacesu(method = -5988553370174489448L)
    public void j62(java.lang.Boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6875799961447635392L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6875799961447635392L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.DW(r5);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6(java.lang.Boolean r1) {
        j62(r1);
    }
}
