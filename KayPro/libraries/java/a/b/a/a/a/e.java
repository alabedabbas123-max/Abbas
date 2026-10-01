package a.b.a.a.a;

public class e extends a.b.a.a.a.h {

    public int f28a;
    public a.b.a.a.a.d[] b;

    public e() {
    }

    public e(byte r1) {
        super(r1);
    }

    public e(byte r1, int r2, a.b.a.a.a.d[] r3) {
        super(r1);
        this.f28a = r2;
        this.b = r3;
    }

    @Override
    public void a(a.b.c r7, a.b.a.a.q r8, a.b.a.a.a.a.b r9) {
        r9.a(r7, null, null, r8, this);
    }

    public void a(a.b.c r9, a.b.j r10, a.b.a.d r11, a.b.a.a.q r12, a.b.a.a.a.a.a r13) {
        int r0 = 0;
    L3:
        int r7 = r0;
        if (r7 >= this.f28a) goto L6;
        r13.a(r9, r10, r11, r12, this, this.b[r7]);
        r0 = r7 + 1;
        goto L3
    }
}
