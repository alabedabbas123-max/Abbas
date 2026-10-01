package abcd;

@abcd.Interfacexu
class RunnableBh implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final java.lang.String Hw;

    @abcd.Interfacevu
    final abcd.Ch VH;
    final abcd.Sk.a Zo;
    final java.lang.String v5;

    static {
        abcd.wu.j6(abcd.RunnableBh.class, -6708075855096698041L, -291095770432338432L);
    }

    RunnableBh(abcd.Ch r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, abcd.Sk.a r5) {
        this.VH = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
        this.Zo = r5;
    }

    @Override
    @abcd.Interfacesu(method = -2494128121454285757L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6588941484516348711L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6588941484516348711L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        java.lang.String r2 = com.aide.ui.U.gW().j6(this.FH, this.Hw);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.U.j6(new abcd.RunnableAh(this, com.aide.ui.U.gW().j6(this.FH, this.Hw, this.v5, "", this.Zo), r2));     // Catch: java.lang.Throwable -> L8
    }
}
