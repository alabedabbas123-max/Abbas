package abcd;

public class sN extends abcd.AbstractyL implements abcd.InterfacepL {
    private static abcd.InterfacetN j6;
    private boolean DW;
    private int FH;
    private abcd.InterfacetN Hw;
    private abcd.rN[] v5;

    static {
        j6 = abcd.uN.j6;
    }

    private sN(abcd.FL r2) {
        this(j6, r2);
    }

    private sN(abcd.InterfacetN r4, abcd.FL r5) {
        this.Hw = r4;
        this.v5 = new abcd.rN[r5.tp()];
        java.util.Enumeration r6 = r5.u7();
        int r7 = 0;
    L4:
        if (r6.hasMoreElements() == false) goto L5;
        this.v5[r7] = abcd.rN.j6(r6.nextElement());
        r7 = r7 + 1;
        goto L4
    }

    public static abcd.sN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.sN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.sN(abcd.FL.j6(r1));
    L5:
        return (abcd.sN) r1;
    }

    @Override
    public abcd.EL DW() {
        return new abcd.tM(this.v5);
    }

    @Override
    public boolean equals(java.lang.Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof abcd.sN) == false) goto L8;
    L10:
        abcd.EL r1 = ((abcd.InterfaceqL) r5).DW();
        if (DW().equals(r1) == false) goto L16;
        return true;
    L16:
        return this.Hw.j6(this, new abcd.sN(abcd.FL.j6(((abcd.InterfaceqL) r5).DW())));
    L15:
        return false;
    L8:
        if ((r5 instanceof abcd.FL) == true) goto L10;
        return false;
    }

    @Override
    public int hashCode() {
        if (this.DW == true) goto L5;
        this.DW = true;
        this.FH = this.Hw.DW(this);
        return this.FH;
    L5:
        return this.FH;
    }

    public java.lang.String toString() {
        return this.Hw.j6(this);
    }

    public abcd.rN[] v5() {
        abcd.rN[] r0 = this.v5;
        abcd.rN[] r1 = new abcd.rN[r0.length];
        java.lang.System.arraycopy(r0, 0, r1, 0, r1.length);
        return r1;
    }
}
