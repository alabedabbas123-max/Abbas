package a.b.a.c;

public class j extends a.b.a.c.m {

    public a.b.a.c.r f55a;

    public j() {
    }

    public j(int r2) {
        this.e = r2 - 64;
    }

    public j(a.b.a.c.r r1) {
        this.f55a = r1;
    }

    @Override
    public int a() {
        if (this.e < 64) goto L5;
        return 247;
    L5:
        return this.e + 64;
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.b r11) {
        this.f55a.a(r7, r8, r9, r10, r11);
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        if (super.equals(r4) == true) goto L5;
        return false;
    L5:
        a.b.a.c.j r5 = (a.b.a.c.j) r4;
        if (this.e == r5.e) goto L8;
        return false;
    L8:
        if (this.f55a.equals(r5.f55a) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.f55a.hashCode();
    }

    @Override
    public java.lang.String toString() {
        return super.toString() + "Var: ..., Stack: [" + this.f55a.toString() + "]";
    }
}
