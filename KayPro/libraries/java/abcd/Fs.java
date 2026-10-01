package abcd;

public abstract class Fs extends abcd.Ms {
    private final abcd.Hs DW;
    private final abcd.Ks j6;

    Fs(abcd.Ks r1, abcd.Hs r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.j6 = r1;
        this.DW = r2;
        return;
    L8:
        throw new java.lang.NullPointerException("nat == null");
    L10:
        throw new java.lang.NullPointerException("definingClass == null");
    }

    @Override
    protected int DW(abcd.Abstractms r3) {
        abcd.Fs r4 = (abcd.Fs) r3;
        int r0 = this.j6.j6(r4.j6);
        if (r0 == 0) goto L6;
        return r0;
    L6:
        return this.DW.J8().j6(r4.DW.J8());
    }

    @Override
    public final boolean Hw() {
        return false;
    }

    public final abcd.Ks VH() {
        return this.j6;
    }

    @Override
    public final java.lang.String aM() {
        return this.j6.aM() + '.' + this.DW.aM();
    }

    public final boolean equals(java.lang.Object r4) {
        if (r4 != null) goto L5;
        return false;
    L5:
        if (getClass() != r4.getClass()) goto L16;
        abcd.Fs r5 = (abcd.Fs) r4;
        if (this.j6.equals(r5.j6) == true) goto L10;
        return false;
    L10:
        if (this.DW.equals(r5.DW) == false) goto L15;
        return true;
    L15:
        return false;
    L16:
        return false;
    }

    public final int hashCode() {
        return (this.j6.hashCode() * 31) ^ this.DW.hashCode();
    }

    public final java.lang.String toString() {
        return Zo() + '{' + aM() + '}';
    }

    public final abcd.Hs we() {
        return this.DW;
    }
}
