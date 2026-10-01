package abcd;

final class qy<TResult> extends Yx<TResult> {
    private final oy<TResult> DW;
    private boolean FH;
    private volatile boolean Hw;
    private java.lang.Exception Zo;
    private final java.lang.Object j6;
    private TResult v5;

    qy() {
        this.j6 = new java.lang.Object();
        this.DW = new abcd.oy();
    }

    private final void VH() {
        com.google.android.gms.common.internal.r.DW(this.FH, "Task is not yet complete");
    }

    private final void gn() {
        com.google.android.gms.common.internal.r.DW(!this.FH, "Task is already complete");
    }

    private final void tp() {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.FH == true) goto L8;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        this.DW.j6(this);
    }

    private final void u7() {
        if (this.Hw == true) goto L6;
        return;
    L6:
        throw new java.util.concurrent.CancellationException("Task is already canceled.");
    }

    public final <TContinuationResult> Yx<TContinuationResult> DW(java.util.concurrent.Executor r4, Sx<TResult, Yx<TContinuationResult>> r5) {
        abcd.qy r0 = new abcd.qy();
        this.DW.j6(new abcd.dy(r4, r5, r0));
        tp();
        return r0;
    }

    public final TResult DW() {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
        VH();     // Catch: java.lang.Throwable -> L11
        u7();     // Catch: java.lang.Throwable -> L11
        if (this.Zo != null) goto L10;
        TResult r1 = this.v5;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return r1;
    L10:
        throw new abcd.Xx(this.Zo);     // Catch: java.lang.Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public final boolean DW(java.lang.Exception r3) {
        com.google.android.gms.common.internal.r.j6(r3, "Exception must not be null");
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.FH == true) goto L7;
        this.FH = true;     // Catch: java.lang.Throwable -> L13
        this.Zo = r3;     // Catch: java.lang.Throwable -> L13
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L13
        this.DW.j6(this);
        return true;
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L13
        return false;
    }

    public final boolean DW(TResult r3) {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.FH == true) goto L7;
        this.FH = true;     // Catch: java.lang.Throwable -> L13
        this.v5 = r3;     // Catch: java.lang.Throwable -> L13
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L13
        this.DW.j6(this);
        return true;
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L13
        return false;
    }

    public final boolean FH() {
        return this.Hw;
    }

    public final boolean Hw() {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
        boolean r1 = this.FH;     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final boolean Zo() {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (this.FH == true) goto L7;
        this.FH = true;     // Catch: java.lang.Throwable -> L13
        this.Hw = true;     // Catch: java.lang.Throwable -> L13
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L13
        this.DW.j6(this);
        return true;
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L13
        return false;
    }

    public final <TContinuationResult> Yx<TContinuationResult> j6(java.util.concurrent.Executor r4, Sx<TResult, TContinuationResult> r5) {
        abcd.qy r0 = new abcd.qy();
        this.DW.j6(new abcd.by(r4, r5, r0));
        tp();
        return r0;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, abcd.Tx r4) {
        this.DW.j6(new abcd.fy(r3, r4));
        tp();
        return this;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, Ux<TResult> r4) {
        this.DW.j6(new abcd.hy(r3, r4));
        tp();
        return this;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, abcd.Vx r4) {
        this.DW.j6(new abcd.jy(r3, r4));
        tp();
        return this;
    }

    public final Yx<TResult> j6(java.util.concurrent.Executor r3, Wx<? super TResult> r4) {
        this.DW.j6(new abcd.ly(r3, r4));
        tp();
        return this;
    }

    public final java.lang.Exception j6() {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
        java.lang.Exception r1 = this.Zo;     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public final <X extends java.lang.Throwable> TResult j6(java.lang.Class<X> r3) {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
        VH();     // Catch: java.lang.Throwable -> L15
        u7();     // Catch: java.lang.Throwable -> L15
        if (r3.isInstance(this.Zo) == true) goto L14;
        if (this.Zo != null) goto L12;
        TResult r4 = this.v5;     // Catch: java.lang.Throwable -> L15
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L15
        return r4;
    L12:
        throw new abcd.Xx(this.Zo);     // Catch: java.lang.Throwable -> L15
    L14:
        throw r3.cast(this.Zo);     // Catch: java.lang.Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    }

    public final void j6(java.lang.Exception r3) {
        com.google.android.gms.common.internal.r.j6(r3, "Exception must not be null");
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
        gn();     // Catch: java.lang.Throwable -> L8
        this.FH = true;     // Catch: java.lang.Throwable -> L8
        this.Zo = r3;     // Catch: java.lang.Throwable -> L8
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L8
        this.DW.j6(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void j6(TResult r3) {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
        gn();     // Catch: java.lang.Throwable -> L8
        this.FH = true;     // Catch: java.lang.Throwable -> L8
        this.v5 = r3;     // Catch: java.lang.Throwable -> L8
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L8
        this.DW.j6(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final boolean v5() {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.FH == true) goto L7;
    L11:
        boolean r1 = false;
    L12:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L14
        return r1;
    L7:
        if (this.Hw == true) goto L11;
        if (this.Zo != null) goto L11;
        r1 = true;
        goto L12
    }
}
