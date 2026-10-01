package com.aide.uidesigner;

@abcd.Interfacexu
class K implements com.aide.common.ua.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.uidesigner.ClassS Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.K.class, -2150908242116545680L, 3466521533733933447L);
    }

    K(android.app.Activity r1, com.aide.uidesigner.ClassS r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2420929976063971413L)
    public boolean DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1530324728547616008L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1530324728547616008L, this);     // Catch: java.lang.Throwable -> L8
        return true;
    L15:
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -865018437470870760L)
    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1366985782995414615L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1366985782995414615L, this);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = -3068738100660847125L)
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1216153183754444176L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1216153183754444176L, this);     // Catch: java.lang.Throwable -> L8
        return "Surround with...";
    L15:
        return "Surround with...";
    }

    @Override
    @abcd.Interfacesu(method = 1958947964415619436L)
    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -110619686470543077L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-110619686470543077L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.Ma.icon_add;
    }

    @Override
    @abcd.Interfacesu(method = -752582219022939295L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3937791846824242592L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3937791846824242592L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.uidesigner.Ka.DW(this.FH, "Surround " + this.Hw.getNodeName() + " with...", new com.aide.uidesigner.J(this));     // Catch: java.lang.Throwable -> L8
    }
}
