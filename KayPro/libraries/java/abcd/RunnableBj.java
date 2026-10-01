package abcd;

@abcd.Interfacexu
class RunnableBj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final java.lang.String Hw;

    @abcd.Interfacevu
    final abcd.Kj v5;

    static {
        abcd.wu.j6(abcd.RunnableBj.class, 144659656370786727L, -1312388587061767425L);
    }

    RunnableBj(abcd.Kj r1, android.app.Activity r2, java.lang.String r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 781486597590120875L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1601017098487986949L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1601017098487986949L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Kj.j6(this.v5, this.FH, this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
