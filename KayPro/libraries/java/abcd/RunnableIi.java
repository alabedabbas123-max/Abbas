package abcd;

@abcd.Interfacexu
class RunnableIi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.nio.channels.InterruptibleChannel FH;

    @abcd.Interfacevu
    final abcd.Ji Hw;

    static {
        abcd.wu.j6(abcd.RunnableIi.class, 4379885248179836745L, -159873158420168256L);
    }

    RunnableIi(abcd.Ji r1, java.nio.channels.InterruptibleChannel r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -2118055098731350821L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -755807237633406861L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-755807237633406861L, this);     // Catch: java.lang.Throwable -> L8
    L14:
        this.FH.close();     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L8
        return;
    }
}
