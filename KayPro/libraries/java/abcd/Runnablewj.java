package abcd;

@abcd.Interfacexu
class Runnablewj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final java.io.File Hw;

    @abcd.Interfacevu
    final abcd.Kj v5;

    static {
        abcd.wu.j6(abcd.Runnablewj.class, 144659656370786727L, 288295980702322944L);
    }

    Runnablewj(abcd.Kj r1, android.app.Activity r2, java.io.File r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -685545490027866244L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5753072197656716016L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5753072197656716016L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Kj.j6(this.v5, this.FH, this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
