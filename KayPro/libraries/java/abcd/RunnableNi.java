package abcd;

@abcd.Interfacexu
class RunnableNi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final java.lang.String Hw;
    final abcd.AbstractOi.a v5;

    static {
        abcd.wu.j6(abcd.RunnableNi.class, 31530143936738400L, -2788343840011214540L);
    }

    RunnableNi(abcd.AbstractOi.a r1, java.lang.String r2, java.lang.String r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -1562031772049535380L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3962200575229746960L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3962200575229746960L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.AbstractOi.j6(this.v5.v5, this.FH, this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
