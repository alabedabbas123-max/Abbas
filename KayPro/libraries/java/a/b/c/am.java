package a.b.c;

public class am {

    private final a.b.a.d f115a;

    public am(a.b.a.d r1) {
        this.f115a = r1;
    }

    void a(a.b.a.h r7) {
        a.b.a.h[] r0 = this.f115a.h;
        int r1 = this.f115a.g;
        int r2 = r1 + 1;
        if (r0.length >= r2) goto L7;
        a.b.a.h[] r3 = new a.b.a.h[r2];
        java.lang.System.arraycopy(r0, 0, r3, 1, r1);
        r3[0] = r7;
        this.f115a.h = r3;
    L5:
        this.f115a.g = r2;
        return;
    L7:
        java.lang.System.arraycopy(r0, 0, r0, 1, r1);
        r0[0] = r7;
        goto L5
    }
}
