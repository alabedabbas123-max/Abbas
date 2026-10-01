package abcd;

@abcd.Interfacexu
class RunnableAh implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.List FH;
    final java.lang.String Hw;
    final abcd.RunnableBh v5;

    static {
        abcd.wu.j6(abcd.RunnableAh.class, -6708075855096698041L, 361117421082573375L);
    }

    RunnableAh(abcd.RunnableBh r1, java.util.List r2, java.lang.String r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 2020553949778599060L)
    public void run() {
    L29:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, 6593264978836293168L, this);
    L33:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6593264978836293168L, this);     // Catch: java.lang.Throwable -> L29
    L7:
        if (this.v5.Zo.VH.gn == false) goto L15;
        com.aide.ui.U.er().j6(this.FH);     // Catch: java.lang.Throwable -> L29
        if (this.Hw == null) goto L12;
        com.aide.ui.U.J8().j6(this.Hw);     // Catch: java.lang.Throwable -> L29
    L12:
        if (abcd.Ch.DW(this.v5.VH) == null) goto L35;
        abcd.Ch.DW(this.v5.VH).j6(this.Hw);     // Catch: java.lang.Throwable -> L29
        return;
    L35:
        return;
    L15:
        if (this.v5.Zo.v5 != null) goto L17;
        java.lang.String r2 = this.Hw;     // Catch: java.lang.Throwable -> L29
    L18:
        if (r2 == null) goto L20;
        com.aide.ui.U.J8().j6(r2);     // Catch: java.lang.Throwable -> L29
    L20:
        com.aide.ui.U.lg().FH(false);     // Catch: java.lang.Throwable -> L29
        com.aide.ui.U.vy().rN(r2);     // Catch: java.lang.Throwable -> L29
        com.aide.ui.U.vy().U2("created");     // Catch: java.lang.Throwable -> L29
        com.aide.ui.U.er().j6(this.FH);     // Catch: java.lang.Throwable -> L29
        if (com.aide.ui.U.Ws().Hw(this.Hw) == true) goto L26;
        if (com.aide.ui.aa.gn() == false) goto L26;
        com.aide.ui.U.Ws().j6(this.Hw, "Initial commit", java.util.Arrays.asList(new java.lang.String[]{"bin/", "gen/", "obj/", "libs/*/*.so", ""}), new abcd.Runnablezh(this));     // Catch: java.lang.Throwable -> L29
        return;
    L26:
        if (abcd.Ch.DW(this.v5.VH) == null) goto L38;
        abcd.Ch.DW(this.v5.VH).j6(this.Hw);     // Catch: java.lang.Throwable -> L29
        return;
    L38:
        return;
    L17:
        r2 = this.Hw + "/" + this.v5.Zo.v5;     // Catch: java.lang.Throwable -> L29
        goto L18
    }
}
