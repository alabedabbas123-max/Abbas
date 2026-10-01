package a;

public class aa extends a.f {
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final a.f r;

    public aa(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, a.f r8, a.f r9) {
        super(r9);
        this.k = r1;
        this.l = r2;
        this.m = r3;
        this.n = r4;
        this.o = r5;
        this.p = r6;
        this.q = r7;
        this.r = r8;
    }

    @Override
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        if (getClass() != r4.getClass()) goto L31;
        a.aa r5 = (a.aa) r4;
        if (this.k == r5.k) goto L10;
        return false;
    L10:
        if (this.l == r5.l) goto L12;
        return false;
    L12:
        if (this.m == r5.m) goto L14;
        return false;
    L14:
        if (this.n == r5.n) goto L16;
        return false;
    L16:
        if (this.o == r5.o) goto L18;
        return false;
    L18:
        if (this.p == r5.p) goto L20;
        return false;
    L20:
        if (this.q == r5.q) goto L22;
        return false;
    L22:
        if (this.r != null) goto L29;
        if (r5.r == null) goto L26;
        return false;
    L26:
        if (super.equals(r5) == false) goto L40;
        return true;
    L40:
        return false;
    L29:
        if (this.r.equals(r5.r) == true) goto L26;
        return false;
    L31:
        return false;
    }

    @Override
    public int hashCode() {
        int r1 = 0;
        if (this.k == false) goto L27;
        int r0 = 0;
    L6:
        if (this.l == false) goto L28;
        int r2 = 0;
    L8:
        int r3 = r2 ^ r0;
        if (this.m == false) goto L29;
        int r4 = 0;
    L11:
        int r5 = r3 ^ r4;
        if (this.n == false) goto L30;
        int r6 = 0;
    L14:
        int r7 = r5 ^ r6;
        if (this.o == false) goto L31;
        int r8 = 0;
    L17:
        int r9 = r7 ^ r8;
        if (this.p == false) goto L32;
        int r10 = 0;
    L20:
        int r11 = r9 ^ r10;
        if (this.q == false) goto L33;
        int r12 = 0;
    L23:
        int r13 = r12 ^ r11;
        if (this.r == null) goto L26;
        r1 = this.r.hashCode();
    L26:
        return (r13 ^ r1) ^ super.hashCode();
    L33:
        r12 = 64;
        goto L23
    L32:
        r10 = 32;
        goto L20
    L31:
        r8 = 16;
        goto L17
    L30:
        r6 = 8;
        goto L14
    L29:
        r4 = 4;
        goto L11
    L28:
        r2 = 2;
        goto L8
    L27:
        r0 = 1;
        goto L6
    }
}
