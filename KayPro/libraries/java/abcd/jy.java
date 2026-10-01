package abcd;

final class jy<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private abcd.Vx FH;
    private final java.util.concurrent.Executor j6;

    public jy(java.util.concurrent.Executor r2, abcd.Vx r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Vx DW(abcd.jy r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.jy r0) {
        return r0.DW;
    }

    public final void j6(Yx<TResult> r3) {
        if (r3.v5() == false) goto L5;
        return;
    L5:
        if (r3.FH() == true) goto L19;
        java.lang.Object r0 = this.DW;
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L9:
        if (this.FH != null) goto L12;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L14
        return;
    L12:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L14
        this.j6.execute(new abcd.Runnableky(this, r3));
        return;
    }
}
