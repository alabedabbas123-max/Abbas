package a.b.a;

public class s extends a.b.a.a {
    public int c;
    public a.b.a.t[] d;

    public s() {
    }

    public s(int r1, int r2, a.b.a.t[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.d.u r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r5.a(r3, r4, r0, this.d[r0]);
        r0 = r0 + 1;
        goto L4
    }
}
