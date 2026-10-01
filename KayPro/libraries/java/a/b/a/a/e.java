package a.b.a.a;

public class e extends a.b.a.a.h {

    public int f41a;
    public a.b.a.a.h[] b;

    public e() {
    }

    public e(int r1, int r2, a.b.a.a.h[] r3) {
        super(r1);
        this.f41a = r2;
        this.b = r3;
    }

    @Override
    public char a() {
        return '[';
    }

    @Override
    public void a(a.b.c r1, a.b.a.a.a r2, a.b.a.a.b.g r3) {
        r3.a(r1, r2, this);
    }

    public void b(a.b.c r3, a.b.a.a.a r4, a.b.a.a.b.g r5) {
        int r0 = 0;
    L4:
        if (r0 >= this.f41a) goto L6;
        this.b[r0].a(r3, r4, r5);
        r0 = r0 + 1;
        goto L4
    }
}
