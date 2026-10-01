package abcd;

@abcd.Interfacexu
class RunnableAj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final abcd.Kj Hw;

    static {
        abcd.wu.j6(abcd.RunnableAj.class, 144659656370786727L, -1312253098124156100L);
    }

    RunnableAj(abcd.Kj r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 433204217483470209L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -396890463138729084L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-396890463138729084L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Kj.j6(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
