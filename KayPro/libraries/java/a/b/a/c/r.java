package a.b.a.c;

public abstract class r implements a.b.o {
    public java.lang.Object b;

    public r() {
    }

    public abstract int a();

    public abstract void a(a.b.c r1, a.b.j r2, a.b.a.d r3, int r4, int r5, a.b.a.c.a.b r6);

    public abstract void a(a.b.c r1, a.b.j r2, a.b.a.d r3, int r4, a.b.a.c.a.b r5);

    @Override
    public void a(java.lang.Object r1) {
        this.b = r1;
    }

    public abstract void b(a.b.c r1, a.b.j r2, a.b.a.d r3, int r4, int r5, a.b.a.c.a.b r6);

    public boolean equals(java.lang.Object r3) {
        if (r3 != null) goto L4;
    L7:
        return false;
    L4:
        if (getClass() != r3.getClass()) goto L7;
        return true;
    }

    @Override
    public java.lang.Object f() {
        return this.b;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
