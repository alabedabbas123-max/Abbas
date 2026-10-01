package a.b.a;

public class d extends a.b.a.a {
    private static final byte[] k = null;
    private static final a.b.a.h[] l = null;
    private static final a.b.a.a[] m = null;
    public int c;
    public int d;
    public int e;
    public byte[] f;
    public int g;
    public a.b.a.h[] h;
    public int i;
    public a.b.a.a[] j;

    static {
        k = new byte[0];
        l = new a.b.a.h[0];
        m = new a.b.a.a[0];
    }

    public d() {
    }

    public d(int r7) {
        this(r7, 0, 0, 0, k);
    }

    public d(int r11, int r12, int r13, int r14, byte[] r15) {
        this(r11, r12, r13, r14, r15, 0, l, 0, m);
    }

    public d(int r1, int r2, int r3, int r4, byte[] r5, int r6, a.b.a.h[] r7, int r8, a.b.a.a[] r9) {
        super(r1);
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
        this.j = r9;
    }

    public a.b.a.a a(a.b.c r4, java.lang.String r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.i) goto L10;
        a.b.a.a r1 = this.j[r0];
        if (r1.a(r4).equals(r5) == true) goto L8;
        r0 = r0 + 1;
        goto L4
    L8:
        return r1;
    L10:
        return null;
    }

    public void a(a.b.c r4, a.b.j r5, int r6, int r7, a.b.a.d.l r8) {
        int r0 = 0;
    L4:
        if (r0 >= this.g) goto L9;
        a.b.a.h r1 = this.h[r0];
        if (r1.a(r6, r7) == false) goto L8;
        r8.a(r4, r5, this, r1);
    L8:
        r0 = r0 + 1;
        goto L4
    }

    public void a(a.b.c r8, a.b.j r9, int r10, int r11, a.b.d.a.d r12) {
        int r4 = r10;
    L3:
        if (r4 >= r11) goto L5;
        a.b.d.c r0 = a.b.d.e.a(this.f, r4);
        int r6 = r0.a(r4);
        r0.a(r8, r9, this, r4, r12);
        r4 = r4 + r6;
        goto L3
    }

    public void a(a.b.c r4, a.b.j r5, int r6, a.b.a.d.l r7) {
        int r0 = 0;
    L4:
        if (r0 >= this.g) goto L9;
        a.b.a.h r1 = this.h[r0];
        if (r1.a(r6) == false) goto L8;
        r7.a(r4, r5, this, r1);
    L8:
        r0 = r0 + 1;
        goto L4
    }

    public void a(a.b.c r7, a.b.j r8, int r9, a.b.d.a.d r10) {
        a.b.d.e.a(this.f, r9).a(r7, r8, this, r9, r10);
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d.i r3) {
        r3.a(r1, r2, this);
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.d.l r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.g) goto L6;
        r5.a(r3, r4, this, this.h[r0]);
        r0 = r0 + 1;
        goto L4
    }

    public void a(a.b.c r7, a.b.j r8, a.b.d.a.d r9) {
        a(r7, r8, 0, this.e, r9);
    }

    public void b(a.b.c r3, a.b.j r4, a.b.a.d.i r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.i) goto L6;
        this.j[r0].a(r3, r4, this, r5);
        r0 = r0 + 1;
        goto L4
    }
}
