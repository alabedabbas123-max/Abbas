package a.b.c;

public class az {

    private a.b.a.n f126a;

    public az(a.b.a.n r1) {
        this.f126a = r1;
    }

    public void a(a.b.a.m r6) {
        int r1 = this.f126a.c;
        a.b.a.m[] r0 = this.f126a.d;
        if (r0.length > r1) goto L5;
        a.b.a.m[] r3 = new a.b.a.m[r1 + 1];
        this.f126a.d = r3;
        java.lang.System.arraycopy(r0, 0, this.f126a.d, 0, r1);
        r0 = this.f126a.d;
    L5:
        a.b.a.n r2 = this.f126a;
        int r4 = r2.c;
        r2.c = r4 + 1;
        r0[r4] = r6;
    }
}
