package a.b.a.c;

public class q extends a.b.a.c.r {

    public int f56a;

    public q() {
    }

    public q(int r1) {
        this.f56a = r1;
    }

    @Override
    public int a() {
        return 8;
    }

    @Override
    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, int r12, a.b.a.c.a.b r13) {
        r13.a(r8, r9, r10, r11, r12, this);
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.b r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    @Override
    public void b(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, int r12, a.b.a.c.a.b r13) {
        r13.b(r8, r9, r10, r11, r12, this);
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        if (super.equals(r4) == true) goto L6;
        return false;
    L6:
        if (this.f56a != ((a.b.a.c.q) r4).f56a) goto L8;
        return true;
    L8:
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f56a;
    }

    public java.lang.String toString() {
        return "u:" + this.f56a;
    }
}
