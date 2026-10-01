package abcd;

@abcd.Interfacexu
class Runnablexj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;

    @abcd.Interfacevu
    final abcd.Kj Hw;

    static {
        abcd.wu.j6(abcd.Runnablexj.class, 144659656370786727L, 288317430184919457L);
    }

    Runnablexj(abcd.Kj r1, int r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 611527625102561464L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 87876525700315845L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(87876525700315845L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Kj.DW(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L8
        abcd.Kj.Hw(this.Hw);     // Catch: java.lang.Throwable -> L8
    }
}
