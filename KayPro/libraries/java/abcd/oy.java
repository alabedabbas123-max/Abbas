package abcd;

final class oy<TResult> {
    private java.util.Queue<ny<TResult>> DW;
    private boolean FH;
    private final java.lang.Object j6;

    oy() {
        this.j6 = new java.lang.Object();
    }

    public final void j6(Yx<TResult> r3) {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
    L25:
        th = move-exception;
        throw th;
    L5:
        if (this.DW != null) goto L7;
    L23:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L25
        return;
    L7:
        if (this.FH == true) goto L23;
        this.FH = true;     // Catch: java.lang.Throwable -> L25
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L25
    L11:
        java.lang.Object r1 = this.j6;
        monitor-enter(r1);
        abcd.Interfaceny r2 = this.DW.poll();     // Catch: java.lang.Throwable -> L20
        if (r2 == null) goto L15;
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L20
        r2.j6(r3);
        goto L11
    L15:
        this.FH = false;     // Catch: java.lang.Throwable -> L20
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L20
        return;
    L20:
        th = move-exception;
        throw th;
    }

    public final void j6(ny<TResult> r3) {
        java.lang.Object r0 = this.j6;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.DW != null) goto L7;
        this.DW = new java.util.ArrayDeque();     // Catch: java.lang.Throwable -> L10
    L7:
        this.DW.add(r3);     // Catch: java.lang.Throwable -> L10
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L10
    }
}
