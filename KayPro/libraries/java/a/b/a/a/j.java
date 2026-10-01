package a.b.a.a;

public abstract class j extends a.b.a.a {
    public int c;
    public int[] d;
    public a.b.a.a.a[][] e;

    protected j() {
    }

    protected j(int r1, int r2, int[] r3, a.b.a.a.a[][] r4) {
        super(r1);
        this.c = r2;
        this.d = r3;
        this.e = r4;
    }

    public void a(a.b.c r7, a.b.j r8, a.b.a.a.b.f r9) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L9;
        int r3 = this.d[r0];
        a.b.a.a.a[] r4 = this.e[r0];
        int r2 = 0;
    L6:
        if (r2 >= r3) goto L8;
        r9.a(r7, r8, r0, r4[r2]);
        r2 = r2 + 1;
        goto L6
    L8:
        r0 = r0 + 1;
        goto L4
    }
}
