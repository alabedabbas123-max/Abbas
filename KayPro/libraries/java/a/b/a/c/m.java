package a.b.a.c;

public abstract class m implements a.b.o {
    public int e;
    public java.lang.Object f;

    public m() {
    }

    public abstract int a();

    public abstract void a(a.b.c r1, a.b.j r2, a.b.a.d r3, int r4, a.b.a.c.a.a r5);

    @Override
    public void a(java.lang.Object r1) {
        this.f = r1;
    }

    public int b() {
        return this.e;
    }

    public boolean equals(java.lang.Object r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        if (getClass() == r4.getClass()) goto L8;
        return false;
    L8:
        if (this.e != ((a.b.a.c.m) r4).e) goto L11;
        return true;
    L11:
        return false;
    }

    @Override
    public java.lang.Object f() {
        return this.f;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.e;
    }

    public java.lang.String toString() {
        return "[" + this.e + "] ";
    }
}
