package abcd;

public class nN extends abcd.AbstractyL {
    public static final abcd.wN DW = null;
    public static final abcd.wL FH = null;
    public static final abcd.wL Hw = null;
    public static final abcd.wN j6 = null;
    private abcd.wL VH;
    private abcd.wN Zo;
    private abcd.wL gn;
    private abcd.wN v5;

    static {
        j6 = new abcd.wN(abcd.InterfacejN.u7, new abcd.mM());
        DW = new abcd.wN(abcd.InterfacelN.u7, j6);
        FH = new abcd.wL(20);
        Hw = new abcd.wL(1);
    }

    public nN() {
        this.v5 = j6;
        this.Zo = DW;
        this.VH = FH;
        this.gn = Hw;
    }

    private nN(abcd.FL r6) {
        this.v5 = j6;
        this.Zo = DW;
        this.VH = FH;
        this.gn = Hw;
        int r0 = 0;
    L4:
        if (r0 == r6.tp()) goto L5;
        abcd.LL r1 = (abcd.LL) r6.j6(r0);
        int r2 = r1.tp();
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L10;
        this.Zo = abcd.wN.j6(r1, true);
    L19:
        r0 = r0 + 1;
        goto L4
    L10:
        if (r2 != 2) goto L12;
        this.VH = abcd.lM.j6(r1, true);
        goto L19
    L12:
        if (r2 != 3) goto L15;
        this.gn = abcd.lM.j6(r1, true);
        goto L19
    L15:
        throw new java.lang.IllegalArgumentException("unknown tag");
    L18:
        this.v5 = abcd.wN.j6(r1, true);
        goto L19
    }

    public nN(abcd.wN r1, abcd.wN r2, abcd.wL r3, abcd.wL r4) {
        this.v5 = r1;
        this.Zo = r2;
        this.VH = r3;
        this.gn = r4;
    }

    public static abcd.nN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.nN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.nN(abcd.FL.j6(r1));
    L5:
        return (abcd.nN) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        if (this.v5.equals(j6) == true) goto L6;
        r0.j6(new abcd.yM(true, 0, this.v5));
    L6:
        if (this.Zo.equals(DW) == true) goto L9;
        r0.j6(new abcd.yM(true, 1, this.Zo));
    L9:
        if (this.VH.equals(FH) == true) goto L12;
        r0.j6(new abcd.yM(true, 2, this.VH));
    L12:
        if (this.gn.equals(Hw) == true) goto L15;
        r0.j6(new abcd.yM(true, 3, this.gn));
    L15:
        return new abcd.tM(r0);
    }

    public abcd.wN v5() {
        return this.v5;
    }
}
