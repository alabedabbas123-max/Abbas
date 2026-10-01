package abcd;

@abcd.Interfacexu
class Runnableph implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final boolean FH;
    final abcd.Runnableqh Hw;

    static {
        abcd.wu.j6(abcd.Runnableph.class, 570958555126909067L, 3172324934362683971L);
    }

    Runnableph(abcd.Runnableqh r1, boolean r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 274293329890145500L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 7928225560053656088L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(7928225560053656088L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.rh.j6(this.Hw.QX).j6(this.FH, this.Hw.FH);     // Catch: java.lang.Throwable -> L8
    }
}
