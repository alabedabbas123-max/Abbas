package a.b.c;

public class an {

    private a.b.a.i f116a;

    public an(a.b.a.i r1) {
        this.f116a = r1;
    }

    public void a(int r6) {
        int r1 = this.f116a.c;
        int[] r0 = this.f116a.d;
        if (r0.length > r1) goto L5;
        int[] r3 = new int[r1 + 1];
        this.f116a.d = r3;
        java.lang.System.arraycopy(r0, 0, this.f116a.d, 0, r1);
        r0 = this.f116a.d;
    L5:
        a.b.a.i r2 = this.f116a;
        int r4 = r2.c;
        r2.c = r4 + 1;
        r0[r4] = r6;
    }
}
