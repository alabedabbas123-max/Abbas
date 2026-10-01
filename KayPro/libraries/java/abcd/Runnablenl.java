package abcd;

@abcd.Interfacexu
class Runnablenl implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.List FH;

    @abcd.Interfacevu
    final abcd.ol Hw;

    static {
        abcd.wu.j6(abcd.Runnablenl.class, -1401858080030435915L, -1843347375838441935L);
    }

    Runnablenl(abcd.ol r1, java.util.List r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 1678521097545554337L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -330408303518875392L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-330408303518875392L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ol.j6(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
