package a.b.c;

public class ax {

    private final a.b.k f124a;

    public ax(a.b.k r1) {
        this.f124a = r1;
    }

    private int b(int r5) {
        int r1 = this.f124a.g;
        int[] r2 = this.f124a.h;
        int r0 = 0;
    L3:
        if (r0 >= r1) goto L8;
        if (r2[r0] == r5) goto L11;
        r0 = r0 + 1;
        goto L3
    L11:
        return r0;
    L8:
        return -1;
    }

    public void a(int r6) {
        if (b(r6) >= 0) goto L6;
        a.b.k r0 = this.f124a;
        int[] r1 = this.f124a.h;
        a.b.k r2 = this.f124a;
        int r3 = r2.g;
        r2.g = r3 + 1;
        r0.h = a.j.b.a(r1, r3, r6);
        return;
    }
}
