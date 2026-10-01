package a.b.a.a;

public class a implements a.b.o {

    public int f24a;
    public int b;
    public a.b.a.a.h[] c;
    public a.b.c[] d;
    public java.lang.Object e;

    public a() {
    }

    public a(int r1, int r2, a.b.a.a.h[] r3) {
        this.f24a = r1;
        this.b = r2;
        this.c = r3;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f24a);
    }

    public void a(a.b.c r3, a.b.a.a.b.g r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.b) goto L6;
        this.c[r0].a(r3, this, r4);
        r0 = r0 + 1;
        goto L4
    }

    public void a(a.b.g.s r3) {
        if (this.d == null) goto L8;
        a.b.c r0 = this.d[0];
        if (r0 == null) goto L9;
        r0.a(r3);
        return;
    L9:
        return;
    }

    @Override
    public void a(java.lang.Object r1) {
        this.e = r1;
    }

    public void b(a.b.g.s r3) {
        if (this.d == null) goto L11;
        int r0 = 0;
    L6:
        if (r0 >= this.d.length) goto L15;
        a.b.c r1 = this.d[r0];
        if (r1 == null) goto L10;
        r1.a(r3);
    L10:
        r0 = r0 + 1;
        goto L6
    L15:
        return;
    }

    @Override
    public java.lang.Object f() {
        return this.e;
    }
}
