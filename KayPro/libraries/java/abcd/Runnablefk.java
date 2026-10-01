package abcd;

@abcd.Interfacexu
class Runnablefk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Runnablegk FH;

    static {
        abcd.wu.j6(abcd.Runnablefk.class, -843596403928054707L, 2408933586012736061L);
    }

    Runnablefk(abcd.Runnablegk r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 152926132909888080L)
    public void run() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -216868841697114696L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-216868841697114696L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (abcd.lk.j6(this.FH.v5) == false) goto L9;
        this.FH.FH.run();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        this.FH.Hw.run();     // Catch: java.lang.Throwable -> L11
    }
}
