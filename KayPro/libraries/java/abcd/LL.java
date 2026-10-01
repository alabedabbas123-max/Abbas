package abcd;

public abstract class LL extends abcd.EL implements abcd.ML {
    boolean DW;
    boolean FH;
    abcd.InterfaceqL Hw;
    int j6;

    public LL(boolean r3, int r4, abcd.InterfaceqL r5) {
        this.DW = false;
        this.FH = true;
        this.Hw = null;
        if ((r5 instanceof abcd.InterfacepL) == false) goto L5;
        this.FH = true;
    L6:
        this.j6 = r4;
        if (this.FH == false) goto L9;
        this.Hw = r5;
        return;
    L9:
        boolean r6 = r5.DW() instanceof abcd.HL;
        this.Hw = r5;
        return;
    L5:
        this.FH = r3;
        goto L6
    }

    public static abcd.LL j6(java.lang.Object r3) {
        if (r3 == null) goto L16;
        if ((r3 instanceof abcd.LL) == true) goto L16;
        if ((r3 instanceof byte[]) == false) goto L14;
        return j6(abcd.EL.j6((byte[]) r3));
    L10:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
    L14:
        throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r3.getClass().getName());
    L16:
        return (abcd.LL) r3;
    }

    public boolean EQ() {
        return this.DW;
    }

    @Override
    abcd.EL VH() {
        return new abcd.yM(this.FH, this.j6, this.Hw);
    }

    @Override
    abcd.EL gn() {
        return new abcd.GM(this.FH, this.j6, this.Hw);
    }

    @Override
    public int hashCode() {
        int r0 = this.j6;
        abcd.InterfaceqL r1 = this.Hw;
        if (r1 != null) goto L5;
        return r0;
    L5:
        return r0 ^ r1.hashCode();
    }

    @Override
    public abcd.EL j6() {
        DW();
        return this;
    }

    @Override
    boolean j6(abcd.EL r4) {
        if ((r4 instanceof abcd.LL) == true) goto L5;
        return false;
    L5:
        abcd.LL r5 = (abcd.LL) r4;
        if (this.j6 == r5.j6) goto L8;
    L22:
        return false;
    L8:
        if (this.DW != r5.DW) goto L22;
        if (this.FH != r5.FH) goto L22;
        abcd.InterfaceqL r0 = this.Hw;
        if (r0 != null) goto L18;
        if (r5.Hw == null) goto L20;
        return false;
    L20:
        return true;
    L18:
        if (r0.DW().equals(r5.Hw.DW()) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public java.lang.String toString() {
        return "[" + this.j6 + "]" + this.Hw;
    }

    public int tp() {
        return this.j6;
    }

    public abcd.EL u7() {
        abcd.InterfaceqL r0 = this.Hw;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.DW();
    }

    public boolean we() {
        return this.FH;
    }
}
