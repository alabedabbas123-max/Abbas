package abcd;

final class hy<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private Ux<TResult> FH;
    private final java.util.concurrent.Executor j6;

    public hy(java.util.concurrent.Executor r2, Ux<TResult> r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Ux DW(abcd.hy r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.hy r0) {
        return r0.DW;
    }

    public final void j6(Yx<TResult> r3) {
        java.lang.Object r0 = this.DW;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.FH != null) goto L8;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        this.j6.execute(new abcd.Runnableiy(this, r3));
    }
}
