package a.b.a;

public abstract class a implements a.b.o {

    public int f23a;
    public java.lang.Object b;

    protected a() {
    }

    protected a(int r1) {
        this.f23a = r1;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f23a);
    }

    public void a(a.b.c r4, a.b.a.d.i r5) {
        throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    public void a(a.b.c r4, a.b.d r5, a.b.a.d.i r6) {
        if (r5 != null) goto L6;
        a(r4, r6);
        return;
    L6:
        throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    public void a(a.b.c r4, a.b.j r5, a.b.a.d.i r6) {
        if (r5 != null) goto L6;
        a(r4, (a.b.d) null, r6);
        return;
    L6:
        throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    public void a(a.b.c r4, a.b.j r5, a.b.a.d r6, a.b.a.d.i r7) {
        if (r6 != null) goto L6;
        a(r4, r5, r7);
        return;
    L6:
        throw new java.lang.UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    @Override
    public void a(java.lang.Object r1) {
        this.b = r1;
    }

    @Override
    public java.lang.Object f() {
        return this.b;
    }
}
