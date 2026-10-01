package abcd;

public abstract class AbstractKp {
    private final abcd.jp DW;
    private final int FH;
    private int Hw;
    private final java.lang.String j6;
    private boolean v5;

    public AbstractKp(java.lang.String r1, abcd.jp r2, int r3) {
        if (r2 == null) goto L7;
        FH(r3);
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = -1;
        this.v5 = false;
        return;
    L7:
        throw new java.lang.NullPointerException("file == null");
    }

    public static void FH(int r1) {
        if (r1 <= 0) goto L7;
        if ((r1 & (r1 - 1)) != 0) goto L7;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("invalid alignment");
    }

    public final int DW(int r2) {
        if (r2 < 0) goto L10;
        if (this.Hw >= 0) goto L8;
        int r0 = this.FH - 1;
        int r3 = (r2 + r0) & (r0 ^ (-1));
        this.Hw = r3;
        return r3;
    L8:
        throw new java.lang.RuntimeException("fileOffset already set");
    L10:
        throw new java.lang.IllegalArgumentException("fileOffset < 0");
    }

    public final abcd.jp DW() {
        return this.DW;
    }

    public final void DW(abcd.Lt r5) {
        VH();
        j6(r5);
        int r0 = r5.v5();
        int r1 = this.Hw;
        if (r1 >= 0) goto L5;
        this.Hw = r0;
    L7:
        if (r5.Hw() == true) goto L9;
    L13:
        FH(r5);
        return;
    L9:
        if (this.j6 == null) goto L11;
        r5.j6(0, "\n" + this.j6 + ":");
        goto L13
    L11:
        if (r0 == 0) goto L13;
        r5.j6(0, "\n");
        goto L13
    L5:
        if (r1 == r0) goto L7;
        throw new java.lang.RuntimeException("alignment mismatch: for " + this + ", at " + r0 + ", but expected " + this.Hw);
    }

    public final int FH() {
        int r0 = this.Hw;
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new java.lang.RuntimeException("fileOffset not set");
    }

    protected abstract void FH(abcd.Lt r1);

    public abstract java.util.Collection<? extends abcd.Abstractvp> Hw();

    protected final void VH() {
        if (this.v5 == false) goto L6;
        return;
    L6:
        throw new java.lang.RuntimeException("not prepared");
    }

    protected abstract void Zo();

    protected final void gn() {
        if (this.v5 == true) goto L6;
        return;
    L6:
        throw new java.lang.RuntimeException("already prepared");
    }

    public final int j6() {
        return this.FH;
    }

    public final int j6(int r2) {
        if (r2 < 0) goto L10;
        int r0 = this.Hw;
        if (r0 < 0) goto L8;
        return r0 + r2;
    L8:
        throw new java.lang.RuntimeException("fileOffset not yet set");
    L10:
        throw new java.lang.IllegalArgumentException("relative < 0");
    }

    public abstract int j6(abcd.Abstractvp r1);

    protected final void j6(abcd.Lt r2) {
        r2.Hw(this.FH);
    }

    public abstract int u7();

    public final void v5() {
        gn();
        Zo();
        this.v5 = true;
    }
}
