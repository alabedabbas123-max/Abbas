package abcd;

public final class ds extends abcd.hu {
    public static final abcd.ds DW = null;
    private final abcd.bs[] FH;
    private int Hw;

    static {
        DW = new abcd.ds(0);
    }

    public ds(int r3) {
        if (r3 == 0) goto L5;
        boolean r1 = true;
    L6:
        super(r1);
        this.FH = new abcd.bs[r3];
        this.Hw = 0;
        return;
    L5:
        r1 = false;
        goto L6
    }

    public abcd.bs DW(abcd.bs r1) {
        return get(r1.we());
    }

    public abcd.ds DW(int r5) {
        int r0 = this.FH.length;
        abcd.ds r1 = new abcd.ds(r0 + r5);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        abcd.bs r3 = this.FH[r2];
        if (r3 == null) goto L7;
        r1.FH(r3.DW(r5));
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        r1.Hw = this.Hw;
        if (VH() == false) goto L11;
        r1.we();
    L11:
        return r1;
    }

    public void FH(abcd.bs r6) {
        J8();
        if (r6 == null) goto L19;
        this.Hw = -1;
        int r0 = r6.we();     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        this.FH[r0] = r6;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        if (r0 <= 0) goto L13;
        int r3 = r0 - 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        abcd.bs r4 = this.FH[r3];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        if (r4 == null) goto L13;
        if (r4.Hw() != 2) goto L13;
        this.FH[r3] = null;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
    L13:
        if (r6.Hw() != 2) goto L22;
        this.FH[r0 + 1] = null;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        return;
    L22:
        return;
    L17:
        throw new java.lang.IllegalArgumentException("spec.getReg() out of range");
    L19:
        throw new java.lang.NullPointerException("spec == null");
    }

    public void Hw(abcd.bs r3) {
        this.FH[r3.we()] = null;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        this.Hw = -1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4
        return;
    L5:
        throw new java.lang.IllegalArgumentException("bogus reg");
    }

    public boolean equals(java.lang.Object r6) {
        if ((r6 instanceof abcd.ds) == true) goto L5;
        return false;
    L5:
        abcd.ds r7 = (abcd.ds) r6;
        abcd.bs[] r0 = r7.FH;
        int r2 = this.FH.length;
        if (r2 == r0.length) goto L8;
    L23:
        return false;
    L8:
        if (size() != r7.size()) goto L23;
        int r8 = 0;
    L11:
        if (r8 >= r2) goto L21;
        abcd.bs r3 = this.FH[r8];
        java.lang.Object r4 = r0[r8];
        if (r3 == r4) goto L19;
        if (r3 == null) goto L20;
        if (r3.equals(r4) == true) goto L19;
    L20:
        return false;
    L19:
        r8 = r8 + 1;
        goto L11
    L21:
        return true;
    }

    public abcd.bs get(int r2) {
        return this.FH[r2];
    L5:
        throw new java.lang.IllegalArgumentException("bogus reg");
    }

    public int hashCode() {
        int r0 = this.FH.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L9;
        abcd.bs r4 = this.FH[r2];
        if (r4 != null) goto L7;
        int r5 = 0;
    L8:
        r3 = (r3 * 31) + r5;
        r2 = r2 + 1;
        goto L3
    L7:
        r5 = r4.hashCode();
        goto L8
    L9:
        return r3;
    }

    public abcd.bs j6(abcd.Vr r5) {
        int r0 = this.FH.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L10;
        abcd.bs r2 = this.FH[r1];
        if (r2 == null) goto L9;
        if (r5.equals(r2.Zo()) == false) goto L9;
        return r2;
    L9:
        r1 = r1 + 1;
        goto L3
    L10:
        return null;
    }

    public abcd.bs j6(abcd.bs r5) {
        int r0 = this.FH.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        abcd.bs r2 = this.FH[r1];
        if (r2 == null) goto L10;
        if (r5.FH(r2) == false) goto L10;
        return r2;
    L10:
        r1 = r1 + 1;
        goto L3
    L11:
        return null;
    }

    public void j6(abcd.ds r4) {
        int r0 = r4.lg();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        abcd.bs r2 = r4.get(r1);
        if (r2 == null) goto L7;
        FH(r2);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    public void j6(abcd.ds r6, boolean r7) {
        J8();
        abcd.bs[] r8 = r6.FH;
        int r0 = this.FH.length;
        int r1 = java.lang.Math.min(r0, r8.length);
        this.Hw = -1;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L11;
        abcd.bs r3 = this.FH[r2];
        if (r3 == null) goto L10;
        abcd.bs r4 = r3.j6(r8[r2], r7);
        if (r4 == r3) goto L10;
        this.FH[r2] = r4;
    L10:
        r2 = r2 + 1;
    L11:
        if (r1 >= r0) goto L13;
        this.FH[r1] = null;
        r1 = r1 + 1;
        goto L11
    }

    public int lg() {
        return this.FH.length;
    }

    public abcd.ds rN() {
        int r0 = this.FH.length;
        abcd.ds r1 = new abcd.ds(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        abcd.bs r3 = this.FH[r2];
        if (r3 == null) goto L7;
        r1.FH(r3);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        r1.Hw = this.Hw;
        return r1;
    }

    public int size() {
        int r0 = this.Hw;
        if (r0 >= 0) goto L15;
        int r1 = this.FH.length;
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r2 >= r1) goto L10;
        if (this.FH[r2] == null) goto L9;
        r3 = r3 + 1;
    L9:
        r2 = r2 + 1;
        goto L5
    L10:
        this.Hw = r3;
        return r3;
    L15:
        return r0;
    }

    public java.lang.String toString() {
        int r0 = this.FH.length;
        java.lang.StringBuffer r1 = new java.lang.StringBuffer(r0 * 25);
        r1.append('{');
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r0) goto L11;
        abcd.bs r4 = this.FH[r2];
        if (r4 == null) goto L10;
        if (r3 == false) goto L8;
        r1.append(", ");
    L9:
        r1.append(r4);
        goto L10
    L8:
        r3 = true;
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        r1.append('}');
        return r1.toString();
    }
}
