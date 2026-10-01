package com.aide.uidesigner;

@abcd.Interfacexu
class I implements com.aide.common.ua.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final android.app.Activity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.I.class, -2150908242116545680L, 3466411048625436800L);
    }

    I(com.aide.uidesigner.ClassS r1, android.app.Activity r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = -3073628696947065920L)
    public boolean DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1634942059157290275L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1634942059157290275L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.Hw();
    }

    @Override
    @abcd.Interfacesu(method = -139237749334249309L)
    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1386469675515532608L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1386469675515532608L, this);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = 1922428253310160596L)
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1329989744533213145L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1329989744533213145L, this);     // Catch: java.lang.Throwable -> L8
        return "Add behind...";
    L15:
        return "Add behind...";
    }

    @Override
    @abcd.Interfacesu(method = -1241285742715056441L)
    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -140717819313155212L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-140717819313155212L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.Ma.icon_add;
    }

    @Override
    @abcd.Interfacesu(method = 1213284910229595216L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4015866744319267467L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4015866744319267467L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.uidesigner.Ka.FH(this.Hw, "Add behind " + this.FH.getNodeName() + "...", new com.aide.uidesigner.H(this));     // Catch: java.lang.Throwable -> L8
    }
}
