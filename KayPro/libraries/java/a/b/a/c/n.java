package a.b.a.c;

public class n extends a.b.a.a {
    public int c;
    public a.b.a.c.m[] d;

    public n() {
    }

    public n(int r1, a.b.a.c.m[] r2) {
        this.c = r1;
        this.d = r2;
    }

    public n(a.b.a.c.m[] r2) {
        this(r2.length, r2);
    }

    public void a(a.b.c r9, a.b.j r10, a.b.a.d r11, a.b.a.c.a.a r12) {
        int r6 = 0;
        int r4 = 0;
    L4:
        if (r6 >= this.c) goto L10;
        a.b.a.c.m r0 = this.d[r6];
        int r2 = r0.b();
        if (r6 != 0) goto L9;
        int r1 = 0;
    L8:
        r4 = r4 + (r1 + r2);
        r0.a(r9, r10, r11, r4, r12);
        r6 = r6 + 1;
        goto L4
    L9:
        r1 = 1;
        goto L8
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d r3, a.b.a.d.i r4) {
        r4.a(r1, r2, r3, this);
    }
}
