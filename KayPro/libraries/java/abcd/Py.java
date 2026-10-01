package abcd;

public abstract class Py<T> implements Ry<T> {
    private final Ry<T> j6;

    public Py(Ry<T> r1) {
        this.j6 = r1;
    }

    private void DW(android.content.Context r1, T r2) {
        if (r2 == null) goto L6;
        j6(r1, r2);
        return;
    L6:
        throw new java.lang.NullPointerException();
    }

    protected abstract T j6(android.content.Context r1);

    public final synchronized T j6(android.content.Context r2, Sy<T> r3) {
        monitor-enter(this);
        T r0 = j6(r2);     // Catch: java.lang.Throwable -> L12
        if (r0 == null) goto L6;
    L10:
        monitor-exit(this);
        return r0;
    L6:
        if (this.j6 == null) goto L8;
        java.lang.Object r4 = this.j6.j6(r2, r3);     // Catch: java.lang.Throwable -> L12
    L9:
        r0 = (T) r4;
        DW(r2, r0);     // Catch: java.lang.Throwable -> L12
        goto L10
    L8:
        r4 = r3.j6(r2);     // Catch: java.lang.Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    protected abstract void j6(android.content.Context r1, T r2);
}
