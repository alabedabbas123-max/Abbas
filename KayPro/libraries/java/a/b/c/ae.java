package a.b.c;

public class ae {

    private final a.b.k f107a;
    private final a.b.b.a.f b;

    public ae(a.b.k r2) {
        this(r2, null, null);
    }

    public ae(a.b.k r3, a.b.b r4, a.b.b r5) {
        this.f107a = r3;
        if (r4 != null) goto L7;
        a.b.b.a.f r0 = null;
    L5:
        this.b = r0;
        return;
    L7:
        r0 = new a.g.c.ae(new a.b.f.f(r4, r5));
        goto L5
    }

    public int a(double r8) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L19;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L12;
        if (r0.a() != 6) goto L12;
        if (((a.b.b.c) r0).b() != r8) goto L12;
        return r1;
    L12:
        r1 = r1 + 1;
        goto L3
    L19:
        return a(new a.b.b.c(r8));
    }

    public int a(float r7) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L19;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L12;
        if (r0.a() != 4) goto L12;
        if (((a.b.b.e) r0).b() != r7) goto L12;
        return r1;
    L12:
        r1 = r1 + 1;
        goto L3
    L19:
        return a(new a.b.b.e(r7));
    }

    public int a(int r7) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L19;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L12;
        if (r0.a() != 3) goto L12;
        if (((a.b.b.f) r0).b() != r7) goto L12;
        return r1;
    L12:
        r1 = r1 + 1;
        goto L3
    L19:
        return a(new a.b.b.f(r7));
    }

    public int a(int r7, int r8) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L22;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L14;
        if (r0.a() != 15) goto L14;
        a.b.b.j r4 = (a.b.b.j) r0;
        if (r4.f93a != r7) goto L14;
        if (r4.b != r8) goto L14;
        return r1;
    L14:
        r1 = r1 + 1;
        goto L3
    L22:
        return a(new a.b.b.j(r7, r8));
    }

    public int a(int r7, int r8, a.b.c r9, a.b.i r10) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L22;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L14;
        if (r0.a() != 9) goto L14;
        a.b.b.d r4 = (a.b.b.d) r0;
        if (r4.f99a != r7) goto L14;
        if (r4.b != r8) goto L14;
        return r1;
    L14:
        r1 = r1 + 1;
        goto L3
    L22:
        return a(new a.b.b.d(r7, r8, r9, r10));
    }

    public int a(int r7, int r8, a.b.c[] r9) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L22;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L14;
        if (r0.a() != 18) goto L14;
        a.b.b.h r4 = (a.b.b.h) r0;
        if (r4.f91a != r7) goto L14;
        if (r4.b != r8) goto L14;
        return r1;
    L14:
        r1 = r1 + 1;
        goto L3
    L22:
        return a(new a.b.b.h(r7, r8, r9));
    }

    public int a(int r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return a(r2, a(r3, r4), r5, r6);
    }

    public int a(long r8) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L19;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L12;
        if (r0.a() != 5) goto L12;
        if (((a.b.b.i) r0).b() != r8) goto L12;
        return r1;
    L12:
        r1 = r1 + 1;
        goto L3
    L19:
        return a(new a.b.b.i(r8));
    }

    public int a(a.b.b.b r6) {
        int r1 = this.f107a.b;
        a.b.b.b[] r0 = this.f107a.c;
        if (r0.length >= (r1 + 2)) goto L5;
        a.b.b.b[] r2 = new a.b.b.b[r1 + 2];
        java.lang.System.arraycopy(r0, 0, r2, 0, r1);
        this.f107a.c = r2;
        r0 = this.f107a.c;
    L5:
        a.b.k r3 = this.f107a;
        int r4 = r3.b;
        r3.b = r4 + 1;
        r0[r4] = r6;
        int r5 = r6.a();
        if (r5 != 5) goto L8;
    L9:
        a.b.k r7 = this.f107a;
        int r8 = r7.b;
        r7.b = r8 + 1;
        r0[r8] = null;
    L11:
        if (this.b == null) goto L13;
        r6.a(this.f107a, this.b);
    L13:
        return r1;
    L8:
        if (r5 != 6) goto L11;
        goto L9
    }

    public int a(java.lang.Object r2) {
        return a(new a.b.b.p(r2));
    }

    public int a(java.lang.String r7) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L19;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L12;
        if (r0.a() != 19) goto L12;
        if (((a.b.b.m) r0).a(this.f107a).equals(r7) == false) goto L12;
        return r1;
    L12:
        r1 = r1 + 1;
        goto L3
    L19:
        return a(new a.b.b.m(c(r7)));
    }

    public int a(java.lang.String r2, int r3, a.b.c r4, a.b.i r5) {
        return a(a(r2, r4), r3, r4, r5);
    }

    public int a(java.lang.String r7, a.b.c r8) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L22;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L14;
        if (r0.a() != 7) goto L14;
        a.b.b.a r4 = (a.b.b.a) r0;
        if (r4.f80a >= r2) goto L14;
        if (r4.a(this.f107a).equals(r7) == false) goto L14;
        return r1;
    L14:
        r1 = r1 + 1;
        goto L3
    L22:
        return a(new a.b.b.a(c(r7), r8));
    }

    public int a(java.lang.String r7, a.b.c r8, a.b.i r9) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L28;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L18;
        if (r0.a() != 8) goto L18;
        a.b.b.r r4 = (a.b.b.r) r0;
        if (r4.f100a >= r2) goto L18;
        if (r4.a(this.f107a).equals(r7) == false) goto L18;
        if (r4.b != r8) goto L18;
        if (r4.c != r9) goto L18;
        return r1;
    L18:
        r1 = r1 + 1;
        goto L3
    L28:
        return a(new a.b.b.r(c(r7), r8, r9));
    }

    public int a(java.lang.String r7, java.lang.String r8) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L28;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L18;
        if (r0.a() != 12) goto L18;
        a.b.b.n r4 = (a.b.b.n) r0;
        if (r4.f96a >= r2) goto L18;
        if (r4.b >= r2) goto L18;
        if (r4.a(this.f107a).equals(r7) == false) goto L18;
        if (r4.b(this.f107a).equals(r8) == false) goto L18;
        return r1;
    L18:
        r1 = r1 + 1;
        goto L3
    L28:
        return a(new a.b.b.n(c(r7), c(r8)));
    }

    public int a(java.lang.String r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return a(r2, a(r3, r4), r5, r6);
    }

    public int a(java.lang.String r7, a.b.c[] r8) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L22;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L14;
        if (r0.a() != 16) goto L14;
        a.b.b.k r4 = (a.b.b.k) r0;
        if (r4.f94a >= r2) goto L14;
        if (r4.a(this.f107a).equals(r7) == false) goto L14;
        return r1;
    L14:
        r1 = r1 + 1;
        goto L3
    L22:
        return a(new a.b.b.k(c(r7), r8));
    }

    public a.b.k a() {
        return this.f107a;
    }

    public int b(int r7, int r8, a.b.c r9, a.b.i r10) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L22;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L14;
        if (r0.a() != 11) goto L14;
        a.b.b.g r4 = (a.b.b.g) r0;
        if (r4.f99a != r7) goto L14;
        if (r4.b != r8) goto L14;
        return r1;
    L14:
        r1 = r1 + 1;
        goto L3
    L22:
        return a(new a.b.b.g(r7, r8, r9, r10));
    }

    public int b(int r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return b(r2, a(r3, r4), r5, r6);
    }

    public int b(java.lang.String r7) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L19;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L12;
        if (r0.a() != 20) goto L12;
        if (((a.b.b.o) r0).a(this.f107a).equals(r7) == false) goto L12;
        return r1;
    L12:
        r1 = r1 + 1;
        goto L3
    L19:
        return a(new a.b.b.o(c(r7)));
    }

    public int b(java.lang.String r2, int r3, a.b.c r4, a.b.i r5) {
        return b(a(r2, r4), r3, r4, r5);
    }

    public int b(java.lang.String r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return b(r2, a(r3, r4), r5, r6);
    }

    public int c(int r7, int r8, a.b.c r9, a.b.i r10) {
        int r2 = this.f107a.b;
        a.b.b.b[] r3 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r2) goto L22;
        a.b.b.b r0 = r3[r1];
        if (r0 == null) goto L14;
        if (r0.a() != 10) goto L14;
        a.b.b.l r4 = (a.b.b.l) r0;
        if (r4.f99a != r7) goto L14;
        if (r4.b != r8) goto L14;
        return r1;
    L14:
        r1 = r1 + 1;
        goto L3
    L22:
        return a(new a.b.b.l(r7, r8, r9, r10));
    }

    public int c(int r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return c(r2, a(r3, r4), r5, r6);
    }

    public int c(java.lang.String r7) {
        int r3 = this.f107a.b;
        a.b.b.b[] r4 = this.f107a.c;
        int r1 = 1;
    L3:
        if (r1 >= r3) goto L19;
        a.b.b.b r0 = r4[r1];
        if (r0 == null) goto L12;
        if (r0.a() != 1) goto L12;
        if (((a.b.b.s) r0).c().equals(r7) == false) goto L12;
        return r1;
    L12:
        r1 = r1 + 1;
        goto L3
    L19:
        return a(new a.b.b.s(r7));
    }

    public int c(java.lang.String r2, int r3, a.b.c r4, a.b.i r5) {
        return c(a(r2, r4), r3, r4, r5);
    }

    public int c(java.lang.String r2, java.lang.String r3, java.lang.String r4, a.b.c r5, a.b.i r6) {
        return c(r2, a(r3, r4), r5, r6);
    }
}
