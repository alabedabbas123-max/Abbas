package abcd;

public class ClassV<T> extends u<T> {
    private final java.lang.Object FH;

    public ClassV(int r1) {
        super(r1);
        this.FH = new java.lang.Object();
    }

    public boolean j6(T r2) {
        java.lang.Object r0 = this.FH;
        monitor-enter(r0);
        boolean r3 = super.j6(r2);     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return r3;
    L7:
        th = move-exception;
        throw th;
    }
}
