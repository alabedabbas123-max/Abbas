package a.b.a.d;

public class p implements a.b.a.d.o {

    private int f68a;
    private int b;
    private boolean c;

    public p() {
        this.f68a = Integer.MAX_VALUE;
        this.b = 0;
    }

    public int a() {
        return this.b;
    }

    @Override
    public void a(a.b.c r3, a.b.j r4, a.b.a.d r5, a.b.a.m r6) {
        int r0 = r6.c;
        if (this.f68a <= r0) goto L6;
        this.f68a = r0;
    L6:
        if (this.b >= r0) goto L9;
        this.b = r0;
    L9:
        if (r6.a() == null) goto L12;
        this.c = true;
        return;
    }

    public boolean b() {
        return this.c;
    }
}
