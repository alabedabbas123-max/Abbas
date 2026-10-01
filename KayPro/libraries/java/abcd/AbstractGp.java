package abcd;

public abstract class AbstractGp extends abcd.Abstractvp implements java.lang.Comparable<abcd.AbstractGp> {
    private int DW;
    private abcd.AbstractKp FH;
    private int Hw;
    private final int j6;

    public AbstractGp(int r2, int r3) {
        abcd.AbstractKp.FH(r2);
        if (r3 < (-1)) goto L7;
        this.j6 = r2;
        this.DW = r3;
        this.FH = null;
        this.Hw = -1;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("writeSize < -1");
    }

    public static int FH(abcd.AbstractGp r0) {
        if (r0 != null) goto L6;
        return 0;
    L6:
        return r0.we();
    }

    protected int DW(abcd.AbstractGp r2) {
        throw new java.lang.UnsupportedOperationException("unsupported");
    }

    protected void DW(abcd.AbstractKp r1, int r2) {
    }

    protected abstract void DW(abcd.jp r1, abcd.Lt r2);

    public final int J8() {
        return this.j6;
    }

    @Override
    public final int VH() {
        int r0 = this.DW;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new java.lang.UnsupportedOperationException("writeSize is unknown");
    }

    public final java.lang.String Ws() {
        return '[' + java.lang.Integer.toHexString(we()) + ']';
    }

    public abstract java.lang.String aM();

    @Override
    public int compareTo(abcd.AbstractGp r1) {
        return j6(r1);
    }

    public final boolean equals(java.lang.Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        abcd.AbstractGp r6 = (abcd.AbstractGp) r5;
        if (Hw() == r6.Hw()) goto L9;
        return false;
    L9:
        if (DW(r6) == 0) goto L13;
        return false;
    L13:
        return true;
    }

    public final int j6(abcd.AbstractGp r3) {
        if (this != r3) goto L5;
        return 0;
    L5:
        abcd.Enumwp r0 = Hw();
        abcd.Enumwp r1 = r3.Hw();
        if (r0 == r1) goto L10;
        return r0.compareTo(r1);
    L10:
        return DW(r3);
    }

    public final int j6(abcd.AbstractKp r2, int r3) {
        if (r2 == null) goto L13;
        if (r3 < 0) goto L11;
        if (this.FH != null) goto L9;
        int r0 = this.j6 - 1;
        int r4 = (r3 + r0) & (r0 ^ (-1));
        this.FH = r2;
        this.Hw = r4;
        DW(r2, r4);
        return r4;
    L9:
        throw new java.lang.RuntimeException("already written");
    L11:
        throw new java.lang.IllegalArgumentException("offset < 0");
    L13:
        throw new java.lang.NullPointerException("addedTo == null");
    }

    public final void j6(int r2) {
        if (r2 < 0) goto L10;
        if (this.DW >= 0) goto L8;
        this.DW = r2;
        return;
    L8:
        throw new java.lang.UnsupportedOperationException("writeSize already set");
    L10:
        throw new java.lang.IllegalArgumentException("writeSize < 0");
    }

    @Override
    public final void j6(abcd.jp r2, abcd.Lt r3) {
        r3.Hw(this.j6);
    L10:
        e = move-exception;
        throw abcd.Vt.j6(e, "...while writing " + this);
    L4:
        if (this.DW < 0) goto L9;
        r3.FH(we());     // Catch: java.lang.RuntimeException -> L10
        DW(r2, r3);
        return;
    L9:
        throw new java.lang.UnsupportedOperationException("writeSize is unknown");     // Catch: java.lang.RuntimeException -> L10
    }

    public final int we() {
        int r0 = this.Hw;
        if (r0 < 0) goto L7;
        return this.FH.j6(r0);
    L7:
        throw new java.lang.RuntimeException("offset not yet known");
    }
}
