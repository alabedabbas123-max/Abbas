package abcd;

final class Runnablemy implements java.lang.Runnable {
    private final abcd.ly DW;
    private final abcd.Yx j6;

    Runnablemy(abcd.ly r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        java.lang.Object r0 = abcd.ly.j6(this.DW);
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (abcd.ly.DW(this.DW) == null) goto L7;
        abcd.ly.DW(this.DW).j6(this.j6.DW());     // Catch: java.lang.Throwable -> L9
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L9
    }
}
