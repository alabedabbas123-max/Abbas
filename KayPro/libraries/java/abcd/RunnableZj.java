package abcd;

@abcd.Interfacexu
class RunnableZj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;

    @abcd.Interfacevu
    final abcd.ck Hw;

    static {
        abcd.wu.j6(abcd.RunnableZj.class, 7280145652699390275L, 4898448937961907195L);
    }

    RunnableZj(abcd.ck r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -703793692570751523L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 558009766810328361L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(558009766810328361L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ck.FH(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
