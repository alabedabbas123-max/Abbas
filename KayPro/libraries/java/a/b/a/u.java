package a.b.a;

public class u extends a.b.a.a {
    public int c;
    public a.b.c[] d;

    public u() {
    }

    public u(int r1, int r2) {
        super(r1);
        this.c = r2;
    }

    @Override
    public void a(a.b.c r1, a.b.a.d.i r2) {
        r2.a(r1, this);
    }

    @Override
    public void a(a.b.c r1, a.b.d r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }

    public void a(a.b.g.s r3) {
        if (this.d == null) goto L11;
        int r0 = 0;
    L6:
        if (r0 >= this.d.length) goto L15;
        if (this.d[r0] == null) goto L10;
        this.d[r0].a(r3);
    L10:
        r0 = r0 + 1;
        goto L6
    L15:
        return;
    }

    public java.lang.String b(a.b.c r2) {
        return r2.c(this.c);
    }
}
