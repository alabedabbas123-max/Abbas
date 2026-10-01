package a.b.a.a;

public abstract class d extends a.b.a.a {
    public int c;
    public a.b.a.a.a[] d;

    protected d() {
    }

    protected d(int r1, int r2, a.b.a.a.a[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    public void a(a.b.c r3, a.b.a.a.b.f r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r4.a(r3, this.d[r0]);
        r0 = r0 + 1;
        goto L4
    }

    public void a(a.b.c r3, a.b.d r4, a.b.a.a.b.f r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r5.a(r3, r4, this.d[r0]);
        r0 = r0 + 1;
        goto L4
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.a.b.f r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r5.a(r3, r4, this.d[r0]);
        r0 = r0 + 1;
        goto L4
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.d r5, a.b.a.a.b.f r6) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r6.a(r3, r4, r5, this.d[r0]);
        r0 = r0 + 1;
        goto L4
    }
}
