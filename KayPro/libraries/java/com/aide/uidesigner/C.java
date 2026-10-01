package com.aide.uidesigner;

@abcd.Interfacexu
class C implements com.aide.common.ua.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final android.app.Activity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.C.class, -2150908242116545680L, 3466079593324326623L);
    }

    C(com.aide.uidesigner.ClassS r1, android.app.Activity r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = 1079671859570195408L)
    public boolean DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1948681476240367104L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1948681476240367104L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.DW();
    }

    @Override
    @abcd.Interfacesu(method = -4009468297818268065L)
    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1444808778329940615L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1444808778329940615L, this);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = -731644057723113380L)
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1671386852123574080L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1671386852123574080L, this);     // Catch: java.lang.Throwable -> L8
        return "Add above...";
    L15:
        return "Add above...";
    }

    @Override
    @abcd.Interfacesu(method = -2938658294116840429L)
    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -230899643095045645L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-230899643095045645L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.Ma.icon_add;
    }

    @Override
    @abcd.Interfacesu(method = 744848427637051920L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4249978862058396120L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4249978862058396120L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.uidesigner.Ka.FH(this.Hw, "Add above " + this.FH.getNodeName() + "...", new com.aide.uidesigner.B(this));     // Catch: java.lang.Throwable -> L8
    }
}
