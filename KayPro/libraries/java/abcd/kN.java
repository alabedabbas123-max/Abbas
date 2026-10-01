package abcd;

public class kN extends abcd.AbstractyL {
    abcd.wL DW;
    abcd.wL FH;
    abcd.wL j6;

    private kN(abcd.FL r2) {
        java.util.Enumeration r3 = r2.u7();
        this.j6 = abcd.lM.j6(r3.nextElement());
        this.DW = abcd.lM.j6(r3.nextElement());
        if (r3.hasMoreElements() == false) goto L5;
        this.FH = (abcd.wL) r3.nextElement();
        return;
    L5:
        this.FH = null;
    }

    public kN(java.math.BigInteger r2, java.math.BigInteger r3, int r4) {
        this.j6 = new abcd.wL(r2);
        this.DW = new abcd.wL(r3);
        if (r4 == 0) goto L5;
        this.FH = new abcd.wL(r4);
        return;
    L5:
        this.FH = null;
    }

    public static abcd.kN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.kN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.kN(abcd.FL.j6(r1));
    L5:
        return (abcd.kN) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        if (Zo() == null) goto L6;
        r0.j6(this.FH);
    L6:
        return new abcd.tM(r0);
    }

    public java.math.BigInteger VH() {
        return this.j6.u7();
    }

    public java.math.BigInteger Zo() {
        abcd.wL r0 = this.FH;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.u7();
    }

    public java.math.BigInteger v5() {
        return this.DW.u7();
    }
}
