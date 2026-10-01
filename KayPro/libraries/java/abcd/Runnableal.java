package abcd;

@abcd.Interfacexu
class Runnableal implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.ui.trainer.g.j Hw;

    @abcd.Interfacevu
    final abcd.el Zo;
    final java.lang.Runnable v5;

    static {
        abcd.wu.j6(abcd.Runnableal.class, 1486310305192075776L, 3507289534622216940L);
    }

    Runnableal(abcd.el r1, android.app.Activity r2, com.aide.ui.trainer.g.j r3, java.lang.Runnable r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = -18701626836969441L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6376254902561961009L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6376254902561961009L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.el.j6(this.Zo, this.FH, this.Hw, false, this.v5);     // Catch: java.lang.Throwable -> L8
    }
}
