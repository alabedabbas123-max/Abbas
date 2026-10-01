package abcd;

public class mN extends abcd.AbstractyL {
    private abcd.wN DW;
    private abcd.HL FH;
    private abcd.AL j6;

    public mN(abcd.FL r2) {
        java.util.Enumeration r3 = r2.u7();
        if (((abcd.wL) r3.nextElement()).tp().intValue() != 0) goto L9;
        this.DW = abcd.wN.j6(r3.nextElement());
        this.j6 = abcd.AL.j6(r3.nextElement());
        if (r3.hasMoreElements() == false) goto L10;
        this.FH = abcd.HL.j6((abcd.LL) r3.nextElement(), false);
        return;
    L10:
        return;
    L9:
        throw new java.lang.IllegalArgumentException("wrong version for private key info");
    }

    public mN(abcd.wN r2, abcd.InterfaceqL r3) {
        this(r2, r3, null);
    }

    public mN(abcd.wN r3, abcd.InterfaceqL r4, abcd.HL r5) {
        this.j6 = new abcd.pM(r4.DW().j6("DER"));
        this.DW = r3;
        this.FH = r5;
    }

    public static abcd.mN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.mN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.mN(abcd.FL.j6(r1));
    L5:
        return (abcd.mN) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(new abcd.wL(0));
        r0.j6(this.DW);
        r0.j6(this.j6);
        abcd.HL r1 = this.FH;
        if (r1 == null) goto L6;
        r0.j6(new abcd.yM(false, 0, r1));
    L6:
        return new abcd.tM(r0);
    }

    public abcd.InterfaceqL Zo() {
        return abcd.EL.j6(this.j6.u7());
    }

    public abcd.wN v5() {
        return this.DW;
    }
}
