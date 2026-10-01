package a.b.a;

public class b implements a.b.o {

    public int f46a;
    public int b;
    public int[] c;
    public java.lang.Object d;

    public b() {
    }

    public b(int r1, int r2, int[] r3) {
        this.f46a = r1;
        this.b = r2;
        this.c = r3;
    }

    public void a(a.b.c r3, a.b.b.a.f r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.b) goto L6;
        r3.a(this.c[r0], r4);
        r0 = r0 + 1;
        goto L4
    }

    @Override
    public void a(java.lang.Object r1) {
        this.d = r1;
    }

    @Override
    public java.lang.Object f() {
        return this.d;
    }
}
