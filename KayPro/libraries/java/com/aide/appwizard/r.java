package com.aide.appwizard;

@abcd.Interfacexu
class r implements com.aide.common.ua.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final com.aide.common.ab Hw;

    @abcd.Interfacevu
    final com.aide.appwizard.B Zo;
    final java.lang.Boolean v5;

    static {
        abcd.wu.j6(com.aide.appwizard.r.class, 3947348440358438304L, -5959622563859386737L);
    }

    r(com.aide.appwizard.B r1, java.lang.String r2, com.aide.common.ab r3, java.lang.Boolean r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = 2926131489850939580L)
    public boolean DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 777748705054129639L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(777748705054129639L, this);     // Catch: java.lang.Throwable -> L8
        return true;
    L15:
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -1163258883087071553L)
    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2908248955640480712L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-2908248955640480712L, this);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = 3434375510036220512L)
    public java.lang.String getName() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1496038027929426477L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1496038027929426477L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        com.aide.appwizard.B r2 = this.Zo;     // Catch: java.lang.Throwable -> L12
        java.lang.String r3 = this.FH;     // Catch: java.lang.Throwable -> L12
        if (this.v5 != null) goto L9;
        java.lang.String r4 = null;
    L10:
        return com.aide.appwizard.B.j6(r2, r3, r4);
    L9:
        r4 = java.lang.Boolean.toString(this.v5.booleanValue());     // Catch: java.lang.Throwable -> L12
        goto L10
    }

    @Override
    @abcd.Interfacesu(method = -4829807785621060409L)
    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1005241352338936104L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1005241352338936104L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.Ma.icon_manage;
    }

    @Override
    @abcd.Interfacesu(method = -1520541859899521544L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 55993828611122545L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(55993828611122545L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.Abstractma.j6(com.aide.appwizard.B.j6(this.Zo), this.FH, java.util.Arrays.asList(new java.lang.String[]{"true", "false", "none"}), new com.aide.appwizard.q(this));     // Catch: java.lang.Throwable -> L8
    }
}
