package a.b.c;

public class ap {

    private a.b.a.k f118a;

    public ap(a.b.a.k r1) {
        this.f118a = r1;
    }

    private int b(a.b.a.l r5) {
        int r1 = this.f118a.c;
        a.b.a.l[] r2 = this.f118a.d;
        int r0 = 0;
    L3:
        if (r0 >= r1) goto L6;
        if (r2[r0].equals(r5) == true) goto L11;
        r0 = r0 + 1;
        goto L3
    L11:
        return r0;
    L6:
        return r1;
    }

    public void a(a.b.a.l r5) {
        a.b.a.l[] r0 = this.f118a.d;
        a.b.a.k r1 = this.f118a;
        int r2 = r1.c;
        r1.c = r2 - 1;
        a.j.b.a(r0, r2, b(r5));
    }
}
