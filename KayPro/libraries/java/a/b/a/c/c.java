package a.b.a.c;

public class c extends a.b.a.c.m {

    public int f51a;
    public a.b.a.c.r[] b;
    public int c;
    public a.b.a.c.r[] d;

    public c() {
    }

    public c(int r1, int r2, a.b.a.c.r[] r3, int r4, a.b.a.c.r[] r5) {
        this.e = r1;
        this.f51a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }

    public c(int r7, a.b.a.c.r[] r8, a.b.a.c.r[] r9) {
        this(r7, r8.length, r8, r9.length, r9);
    }

    @Override
    public int a() {
        return 255;
    }

    @Override
    public void a(a.b.c r7, a.b.j r8, a.b.a.d r9, int r10, a.b.a.c.a.a r11) {
        r11.a(r7, r8, r9, r10, this);
    }

    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, a.b.a.c.a.b r12) {
        int r5 = 0;
    L4:
        if (r5 >= this.f51a) goto L6;
        this.b[r5].b(r8, r9, r10, r11, r5, r12);
        r5 = r5 + 1;
        goto L4
    }

    public void b(a.b.c r8, a.b.j r9, a.b.a.d r10, int r11, a.b.a.c.a.b r12) {
        int r5 = 0;
    L4:
        if (r5 >= this.c) goto L6;
        this.d[r5].a(r8, r9, r10, r11, r5, r12);
        r5 = r5 + 1;
        goto L4
    }

    @Override
    public boolean equals(java.lang.Object r5) {
        if (super.equals(r5) == true) goto L5;
        return false;
    L5:
        a.b.a.c.c r6 = (a.b.a.c.c) r5;
        if (this.e == r6.e) goto L8;
        return false;
    L8:
        if (this.f51a == r6.f51a) goto L10;
        return false;
    L10:
        if (this.c != r6.c) goto L30;
        int r0 = 0;
    L13:
        if (r0 >= this.f51a) goto L17;
        if (this.b[r0].equals(r6.b[r0]) == false) goto L32;
        r0 = r0 + 1;
        goto L13
    L32:
        return false;
    L17:
        int r1 = 0;
    L19:
        if (r1 >= this.c) goto L23;
        if (this.d[r1].equals(r6.d[r1]) == false) goto L33;
        r1 = r1 + 1;
        goto L19
    L33:
        return false;
    L23:
        return true;
    L30:
        return false;
    }

    @Override
    public int hashCode() {
        int r1 = 0;
        int r2 = super.hashCode();
        int r0 = 0;
    L4:
        if (r0 >= this.f51a) goto L7;
        r2 = r2 ^ this.b[r0].hashCode();
        r0 = r0 + 1;
    L7:
        if (r1 >= this.c) goto L9;
        r2 = r2 ^ this.d[r1].hashCode();
        r1 = r1 + 1;
        goto L7
    L9:
        return r2;
    }

    @Override
    public java.lang.String toString() {
        int r1 = 0;
        java.lang.StringBuffer r2 = new java.lang.StringBuffer(super.toString()).append("Var: ");
        int r0 = 0;
    L4:
        if (r0 >= this.f51a) goto L6;
        r2 = r2.append('[').append(this.b[r0].toString()).append(']');
        r0 = r0 + 1;
        goto L4
    L6:
        r2.append(", Stack: ");
    L8:
        if (r1 >= this.c) goto L11;
        r2 = r2.append('[').append(this.d[r1].toString()).append(']');
        r1 = r1 + 1;
        goto L8
    L11:
        return r2.toString();
    }
}
