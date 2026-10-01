package abcd;

final class ly<TResult> implements ny<TResult> {
    private final java.lang.Object DW;
    private Wx<? super TResult> FH;
    private final java.util.concurrent.Executor j6;

    public ly(java.util.concurrent.Executor r2, Wx<? super TResult> r3) {
        this.DW = new java.lang.Object();
        this.j6 = r2;
        this.FH = r3;
    }

    static abcd.Wx DW(abcd.ly r0) {
        return r0.FH;
    }

    static java.lang.Object j6(abcd.ly r0) {
        return r0.DW;
    }

    public final void j6(Yx<TResult> r3) {
        if (r3.v5() == false) goto L15;
        java.lang.Object r0 = this.DW;
        monitor-enter(r0);
    L12:
        th = move-exception;
        throw th;
    L7:
        if (this.FH != null) goto L10;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L12
        return;
    L10:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L12
        this.j6.execute(new abcd.Runnablemy(this, r3));
        return;
    }
}
