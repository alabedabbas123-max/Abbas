package a.b.a;

public class n extends a.b.a.a {
    public int c;
    public a.b.a.m[] d;

    public n() {
    }

    public n(int r1, int r2, a.b.a.m[] r3) {
        super(r1);
        this.c = r2;
        this.d = r3;
    }

    public int a() {
        int r0 = 0;
        int r2 = Integer.MAX_VALUE;
    L4:
        if (r0 >= this.c) goto L11;
        a.b.a.m r4 = this.d[r0];
        if (r4.a() != null) goto L10;
        int r5 = r4.c;
        if (r5 >= r2) goto L10;
        r2 = r5;
    L10:
        r0 = r0 + 1;
        goto L4
    L11:
        if (r2 != Integer.MAX_VALUE) goto L18;
        return 0;
    L18:
        return r2;
    }

    public java.lang.String a(int r2) {
        a.b.a.m r0 = b(r2);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.a();
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d r3, a.b.a.d.i r4) {
        r4.a(r1, r2, r3, this);
    }

    public void a(a.b.c r3, a.b.j r4, a.b.a.d r5, a.b.a.d.o r6) {
        int r0 = 0;
    L4:
        if (r0 >= this.c) goto L6;
        r6.a(r3, r4, r5, this.d[r0]);
        r0 = r0 + 1;
        goto L4
    }

    public int b() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= this.c) goto L11;
        a.b.a.m r2 = this.d[r0];
        if (r2.a() != null) goto L10;
        int r3 = r2.c;
        if (r3 <= r1) goto L10;
        r1 = r3;
    L10:
        r0 = r0 + 1;
        goto L4
    L11:
        return r1;
    }

    public a.b.a.m b(int r4) {
        int r1 = this.c - 1;
    L3:
        if (r1 < 0) goto L9;
        a.b.a.m r0 = this.d[r1];
        if (r4 >= r0.b) goto L15;
        r1 = r1 - 1;
        goto L3
    L15:
        return r0;
    L9:
        if (this.c > 0) goto L6;
        return null;
    L6:
        return this.d[0];
    }
}
