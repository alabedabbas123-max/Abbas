package abcd;

final class fy<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private abcd.Tx FH;
    private final java.util.concurrent.Executor j6;

    public fy(java.util.concurrent.Executor r2, abcd.Tx r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Tx DW(abcd.fy r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.fy r0) {
        return r0.DW;
    }

    public final void j6(abcd.Yx r2) {
        if (r2.FH() == false) goto L15;
        java.lang.Object r3 = this.DW;
        monitor-enter(r3);
    L12:
        th = move-exception;
        throw th;
    L7:
        if (this.FH != null) goto L10;
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L12
        return;
    L10:
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L12
        this.j6.execute(new abcd.Runnablegy(this));
        return;
    }
}
