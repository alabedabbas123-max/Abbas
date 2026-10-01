package a.b.a.a;

public class f extends a.b.a.a.h {

    public int f42a;
    public a.b.c[] b;

    public f() {
    }

    public f(int r1, int r2) {
        super(r1);
        this.f42a = r2;
    }

    @Override
    public char a() {
        return 'c';
    }

    public java.lang.String a(a.b.c r2) {
        return r2.c(this.f42a);
    }

    @Override
    public void a(a.b.c r1, a.b.a.a.a r2, a.b.a.a.b.g r3) {
        r3.a(r1, r2, this);
    }

    public void a(a.b.g.s r3) {
        if (this.b == null) goto L11;
        int r0 = 0;
    L6:
        if (r0 >= this.b.length) goto L15;
        a.b.c r1 = this.b[r0];
        if (r1 == null) goto L10;
        r1.a(r3);
    L10:
        r0 = r0 + 1;
        goto L6
    L15:
        return;
    }
}
