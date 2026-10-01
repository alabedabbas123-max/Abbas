package abcd;

final class Runnablegy implements java.lang.Runnable {
    private final abcd.fy j6;

    Runnablegy(abcd.fy r1) {
        this.j6 = r1;
    }

    @Override
    public final void run() {
        java.lang.Object r0 = abcd.fy.j6(this.j6);
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (abcd.fy.DW(this.j6) == null) goto L7;
        abcd.fy.DW(this.j6).j6();     // Catch: java.lang.Throwable -> L9
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L9
    }
}
