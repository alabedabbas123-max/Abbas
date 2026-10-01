package abcd;

final class Runnableky implements java.lang.Runnable {
    private final abcd.jy DW;
    private final abcd.Yx j6;

    Runnableky(abcd.jy r1, abcd.Yx r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public final void run() {
        java.lang.Object r0 = abcd.jy.j6(this.DW);
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (abcd.jy.DW(this.DW) == null) goto L7;
        abcd.jy.DW(this.DW).j6(this.j6.j6());     // Catch: java.lang.Throwable -> L9
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L9
    }
}
