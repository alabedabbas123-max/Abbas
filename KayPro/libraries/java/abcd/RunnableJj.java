package abcd;

@abcd.Interfacexu
class RunnableJj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Kj.a FH;

    static {
        abcd.wu.j6(abcd.RunnableJj.class, -3145251390647306304L, -122792110765583071L);
    }

    RunnableJj(abcd.Kj.a r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -397668735862720560L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3318727222986178887L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3318727222986178887L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Kj.j6(this.FH.tp);     // Catch: java.lang.Throwable -> L8
        abcd.Kj.a.j6(this.FH).run();     // Catch: java.lang.Throwable -> L8
    }
}
