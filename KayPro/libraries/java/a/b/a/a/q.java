package a.b.a.a;

public class q extends a.b.a.a.a {
    public a.b.a.a.a.h f;
    public a.b.a.a.s[] g;

    public q() {
    }

    public q(int r1, int r2, a.b.a.a.h[] r3, a.b.a.a.a.h r4, a.b.a.a.s[] r5) {
        super(r1, r2, r3);
        this.f = r4;
        this.g = r5;
    }

    public void a(a.b.c r2, a.b.a.a.a.a.b r3) {
        this.f.a(r2, this, r3);
    }

    public void a(a.b.c r3, a.b.a.a.b.i r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.g.length) goto L6;
        r4.a(r3, this, this.g[r0]);
        r0 = r0 + 1;
        goto L4
    }
}
