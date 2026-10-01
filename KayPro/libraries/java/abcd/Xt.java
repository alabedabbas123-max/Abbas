package abcd;

public class Xt extends abcd.hu implements abcd.Interfacelu {
    private java.lang.Object[] DW;

    public Xt(int r2) {
        if (r2 == 0) goto L4;
        boolean r0 = true;
    L5:
        super(r0);
        this.DW = new java.lang.Object[r2];     // Catch: java.lang.NegativeArraySizeException -> L8
        return;
    L9:
        throw new java.lang.IllegalArgumentException("size < 0");
    L4:
        r0 = false;
        goto L5
    }

    private java.lang.Object Hw(int r2) {
        if (r2 >= 0) goto L6;
        throw new java.lang.IndexOutOfBoundsException("n < 0");
    L6:
        throw new java.lang.IndexOutOfBoundsException("n >= size()");
    }

    private java.lang.String j6(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        int r0 = this.DW.length;
        java.lang.StringBuffer r1 = new java.lang.StringBuffer((r0 * 10) + 10);
        if (r4 == null) goto L5;
        r1.append(r4);
    L5:
        int r8 = 0;
    L6:
        if (r8 >= r0) goto L14;
        if (r8 == 0) goto L10;
        if (r5 == null) goto L10;
        r1.append(r5);
    L10:
        if (r7 == false) goto L12;
        r1.append(((abcd.Interfacelu) this.DW[r8]).aM());
    L13:
        r8 = r8 + 1;
        goto L6
    L12:
        r1.append(this.DW[r8]);
        goto L13
    L14:
        if (r6 == null) goto L17;
        r1.append(r6);
    L17:
        return r1.toString();
    }

    protected final java.lang.Object DW(int r4) {
        java.lang.Object r0 = this.DW[r4];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new java.lang.NullPointerException("unset: " + r4);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7
    L7:
        Hw(r4);
        throw null;
    }

    public java.lang.String DW(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        return j6(r2, r3, r4, false);
    }

    protected final java.lang.Object FH(int r2) {
        return this.DW[r2];
    }

    public java.lang.String aM() {
        java.lang.String r0 = getClass().getName();
        return j6(r0.substring(r0.lastIndexOf(46) + 1) + '{', ", ", "}", true);
    }

    public boolean equals(java.lang.Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (getClass() == r3.getClass()) goto L10;
        return false;
    L10:
        return java.util.Arrays.equals(this.DW, ((abcd.Xt) r3).DW);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.DW);
    }

    public java.lang.String j6(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        return j6(r2, r3, r4, true);
    }

    protected final void j6(int r2, java.lang.Object r3) {
        J8();
        this.DW[r2] = r3;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
        return;
    L5:
        Hw(r2);
        throw null;
    }

    public void lg() {
        int r0 = this.DW.length;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L8;
        if (this.DW[r2] == null) goto L7;
        r3 = r3 + 1;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        if (r0 != r3) goto L10;
        return;
    L10:
        J8();
        java.lang.Object[] r4 = new java.lang.Object[r3];
        int r5 = 0;
    L11:
        if (r1 >= r0) goto L16;
        java.lang.Object r6 = this.DW[r1];
        if (r6 == null) goto L15;
        r4[r5] = r6;
        r5 = r5 + 1;
    L15:
        r1 = r1 + 1;
        goto L11
    L16:
        this.DW = r4;
        if (r3 != 0) goto L26;
        we();
        return;
    }

    public final int size() {
        return this.DW.length;
    }

    public java.lang.String toString() {
        java.lang.String r0 = getClass().getName();
        return j6(r0.substring(r0.lastIndexOf(46) + 1) + '{', ", ", "}", false);
    }
}
