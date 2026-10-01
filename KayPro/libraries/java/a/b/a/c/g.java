package a.b.a.c;

public class g extends a.b.a.c.m {

    public int f53a;
    public a.b.a.c.r[] b;

    public g() {
    }

    public g(int r2) {
        this.f53a = (r2 + 1) - 252;
    }

    public g(int r1, a.b.a.c.r[] r2) {
        this.f53a = r1;
        this.b = r2;
    }

    public g(a.b.a.c.r[] r2) {
        this(r2.length, r2);
    }

    @Override
    public int a() {
        return (this.f53a + 252) - 1;
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, a.b.a.c.a.b r12) {
        int r0 = 0;
    L3:
        int r6 = r0;
        if (r6 >= this.f53a) goto L6;
        this.b[r6].a(r8, r9, r10, r11, r12);
        r0 = r6 + 1;
        goto L3
    }

    @Override
    public boolean equals(java.lang.Object r5) {
        if (super.equals(r5) == true) goto L5;
        return false;
    L5:
        a.b.a.c.g r6 = (a.b.a.c.g) r5;
        if (this.e == r6.e) goto L8;
        return false;
    L8:
        if (this.f53a != r6.f53a) goto L19;
        int r0 = 0;
    L11:
        if (r0 >= this.f53a) goto L15;
        if (this.b[r0].equals(r6.b[r0]) == false) goto L21;
        r0 = r0 + 1;
        goto L11
    L21:
        return false;
    L15:
        return true;
    L19:
        return false;
    }

    @Override
    public int hashCode() {
        int r1 = super.hashCode();
        int r0 = 0;
    L4:
        if (r0 >= this.f53a) goto L6;
        r1 = r1 ^ this.b[r0].hashCode();
        r0 = r0 + 1;
        goto L4
    L6:
        return r1;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuffer r1 = new java.lang.StringBuffer(super.toString()).append("Var: ...");
        int r0 = 0;
    L4:
        if (r0 >= this.f53a) goto L6;
        r1 = r1.append('[').append(this.b[r0].toString()).append(']');
        r0 = r0 + 1;
        goto L4
    L6:
        r1.append(", Stack: (empty)");
        return r1.toString();
    }
}
