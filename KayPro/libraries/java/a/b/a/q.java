package a.b.a;

public class q implements a.b.o, java.lang.Comparable {

    public int f77a;
    public int b;
    public int c;
    public int d;
    public int e;
    public a.b.c[] f;
    public java.lang.Object g;

    public q() {
    }

    public q(int r1, int r2, int r3, int r4, int r5) {
        this.f77a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.c);
    }

    public void a(a.b.g.s r3) {
        if (this.f == null) goto L11;
        int r0 = 0;
    L6:
        if (r0 >= this.f.length) goto L15;
        a.b.c r1 = this.f[r0];
        if (r1 == null) goto L10;
        r1.a(r3);
    L10:
        r0 = r0 + 1;
        goto L6
    L15:
        return;
    }

    @Override
    public void a(java.lang.Object r1) {
        this.g = r1;
    }

    public java.lang.String b(a.b.c r2) {
        return r2.c(this.d);
    }

    @Override
    public int compareTo(java.lang.Object r5) {
        a.b.a.q r6 = (a.b.a.q) r5;
        if (this.f77a >= r6.f77a) goto L6;
        return -1;
    L6:
        if (this.f77a <= r6.f77a) goto L9;
        return 1;
    L9:
        if (this.b >= r6.b) goto L11;
        return -1;
    L11:
        if (this.b <= r6.b) goto L14;
        return 1;
    L14:
        if (this.e >= r6.e) goto L16;
        return -1;
    L16:
        if (this.e <= r6.e) goto L19;
        return 1;
    L19:
        if (this.d >= r6.d) goto L21;
        return -1;
    L21:
        if (this.d <= r6.d) goto L24;
        return 1;
    L24:
        if (this.c >= r6.c) goto L26;
        return -1;
    L26:
        if (this.c > r6.c) goto L37;
        return 0;
    L37:
        return 1;
    }

    @Override
    public java.lang.Object f() {
        return this.g;
    }
}
