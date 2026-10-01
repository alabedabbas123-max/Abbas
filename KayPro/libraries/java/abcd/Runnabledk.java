package abcd;

@abcd.Interfacexu
class Runnabledk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final java.lang.String Hw;

    @abcd.Interfacevu
    final abcd.lk v5;

    static {
        abcd.wu.j6(abcd.Runnabledk.class, -843596403928054707L, -460190134519338760L);
    }

    Runnabledk(abcd.lk r1, java.lang.String r2, java.lang.String r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -1723852633842113048L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5539637517480330075L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5539637517480330075L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.lk.j6(this.v5, this.FH, this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
