package abcd;

@abcd.Interfacexu
class RunnableHi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ji FH;

    static {
        abcd.wu.j6(abcd.RunnableHi.class, 4379885248179836745L, -159797358290622575L);
    }

    RunnableHi(abcd.Ji r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1383654197796735980L)
    public void run() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -720885568192460928L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-720885568192460928L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.Iterator r2 = abcd.Ji.FH(this.FH).iterator();     // Catch: java.lang.Throwable -> L12
    L7:
        if (r2.hasNext() == false) goto L11;
        ((abcd.Ji.c) r2.next()).j6();     // Catch: java.lang.Throwable -> L12
        goto L7
    }
}
