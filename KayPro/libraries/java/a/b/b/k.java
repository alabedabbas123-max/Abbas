package a.b.b;

public class k extends a.b.b.b {

    public int f94a;
    public a.b.c b;
    public a.b.c[] c;

    public k() {
    }

    public k(int r1, a.b.c[] r2) {
        this.f94a = r1;
        this.c = r2;
    }

    @Override
    public int a() {
        return 16;
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f94a);
    }

    @Override
    public void a(a.b.c r1, a.b.b.a.f r2) {
        r2.a(r1, this);
    }

    public void a(a.b.g.s r3) {
        if (this.c == null) goto L11;
        int r0 = 0;
    L6:
        if (r0 >= this.c.length) goto L15;
        if (this.c[r0] == null) goto L10;
        this.c[r0].a(r3);
    L10:
        r0 = r0 + 1;
        goto L6
    L15:
        return;
    }
}
