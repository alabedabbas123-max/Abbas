package a.b.c;

public class aj {

    private final a.b.k f112a;
    private final a.b.a.a.a b;
    private final a.b.a.a.e c;
    private final boolean d;

    public aj(a.b.k r2, a.b.a.a.a r3, boolean r4) {
        this.f112a = r2;
        this.b = r3;
        this.c = null;
        this.d = r4;
    }

    public aj(a.b.k r2, a.b.a.a.e r3, boolean r4) {
        this.f112a = r2;
        this.b = null;
        this.c = r3;
        this.d = r4;
    }

    private int a(int r4, a.b.a.a.h[] r5, java.lang.String r6) {
        int r0 = 0;
    L3:
        if (r0 >= r4) goto L8;
        if (r5[r0].b(this.f112a).equals(r6) == true) goto L11;
        r0 = r0 + 1;
        goto L3
    L11:
        return r0;
    L8:
        return -1;
    }

    private boolean a(int r2, a.b.a.a.h[] r3, a.b.a.a.h r4) {
        int r0 = a(r2, r3, r4.b(this.f112a));
        if (r0 >= 0) goto L6;
        return false;
    L6:
        r3[r0] = r4;
        return true;
    }

    private a.b.a.a.h[] b(int r3, a.b.a.a.h[] r4, a.b.a.a.h r5) {
        if (r4.length > r3) goto L5;
        a.b.a.a.h[] r0 = new a.b.a.a.h[r3 + 1];
        java.lang.System.arraycopy(r4, 0, r0, 0, r3);
        r4 = r0;
    L5:
        r4[r3] = r5;
        return r4;
    }

    public void a(a.b.a.a.h r4) {
        if (this.b == null) goto L11;
        if (this.d == true) goto L7;
    L8:
        this.b.c = b(this.b.b, this.b.c, r4);
        this.b.b++;
        return;
    L7:
        if (a(this.b.b, this.b.c, r4) == false) goto L8;
        return;
    L11:
        if (this.d == true) goto L13;
    L14:
        this.c.b = b(this.c.f41a, this.c.b, r4);
        this.c.f41a++;
        return;
    L13:
        if (a(this.c.f41a, this.c.b, r4) == false) goto L14;
    }
}
