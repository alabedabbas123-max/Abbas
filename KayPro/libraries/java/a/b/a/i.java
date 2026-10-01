package a.b.a;

public class i extends a.b.a.a {
    public int c;
    public int[] d;

    public i() {
    }

    public i(int r1, int r2, int[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    public void a(a.b.c r3, a.b.b.a.f r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r3.a(this.d[r0], r4);
        r0 = r0 + 1;
        goto L4
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }
}
