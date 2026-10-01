package com.aide.uidesigner;

@abcd.Interfacexu
class E implements com.aide.common.ua.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final android.app.Activity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.E.class, -2150908242116545680L, 3466190078420633388L);
    }

    E(com.aide.uidesigner.ClassS r1, android.app.Activity r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = 1799032561970511456L)
    public boolean DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1844120433003665823L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1844120433003665823L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.v5();
    }

    @Override
    @abcd.Interfacesu(method = 2622759954947966449L)
    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1425381173182795608L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1425381173182795608L, this);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = 2696872583789426744L)
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1557606578717778097L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1557606578717778097L, this);     // Catch: java.lang.Throwable -> L8
        return "Add below...";
    L15:
        return "Add below...";
    }

    @Override
    @abcd.Interfacesu(method = -980773884784283319L)
    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -200857797625406496L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-200857797625406496L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.Ma.icon_add;
    }

    @Override
    @abcd.Interfacesu(method = -562522844408023428L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4171960251936344231L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4171960251936344231L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.uidesigner.Ka.FH(this.Hw, "Add below " + this.FH.getNodeName() + "...", new com.aide.uidesigner.D(this));     // Catch: java.lang.Throwable -> L8
    }
}
