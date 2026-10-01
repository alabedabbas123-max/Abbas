package a.b.a;

public class k extends a.b.a.a {
    public int c;
    public a.b.a.l[] d;

    public k() {
    }

    public k(int r1, int r2, a.b.a.l[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    @Override
    public void a(a.b.c r1, a.b.a.d.i r2) {
        r2.a(r1, this);
    }

    public void a(a.b.c r3, a.b.a.d.m r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r4.a(r3, this.d[r0]);
        r0 = r0 + 1;
        goto L4
    }
}
