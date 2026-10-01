package abcd;

final class Runnableiy implements java.lang.Runnable {
    private final abcd.hy DW;
    private final abcd.Yx j6;

    Runnableiy(abcd.hy r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        java.lang.Object r0 = abcd.hy.j6(this.DW);
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (abcd.hy.DW(this.DW) == null) goto L7;
        abcd.hy.DW(this.DW).j6(this.j6);     // Catch: java.lang.Throwable -> L9
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L9
    }
}
