package a.b.a.c;

public class l extends a.b.a.a {
    public int c;
    public a.b.a.c.c[] d;

    public l() {
    }

    public l(int r1, a.b.a.c.c[] r2) {
        this.c = r1;
        this.d = r2;
    }

    public l(a.b.a.c.c[] r2) {
        this(r2.length, r2);
    }

    public void a(a.b.c r8, a.b.j r9, a.b.a.d r10, a.b.a.c.a.a r11) {
        int r0 = 0;
    L3:
        int r6 = r0;
        if (r6 >= this.c) goto L6;
        a.b.a.c.c r5 = this.d[r6];
        r11.a(r8, r9, r10, r5.b(), r5);
        r0 = r6 + 1;
        goto L3
    }

    @Override
    public void a(a.b.c r1, a.b.j r2, a.b.a.d r3, a.b.a.d.i r4) {
        r4.a(r1, r2, r3, this);
    }
}
