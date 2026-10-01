package abcd;

@abcd.Interfacexu
class Runnablebl implements java.lang.Runnable {

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
        abcd.wu.j6(abcd.Runnablebl.class, 1486310305192075776L, 3507377799297230935L);
    }

    Runnablebl(abcd.el r1, android.app.Activity r2, com.aide.ui.trainer.g.j r3, java.lang.Runnable r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = -2024514272361238664L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6379904683083736560L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6379904683083736560L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.el.j6(this.Zo, this.FH, this.Hw, true, this.v5);     // Catch: java.lang.Throwable -> L8
    }
}
