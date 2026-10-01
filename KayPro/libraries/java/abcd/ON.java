package abcd;

public class ON extends abcd.AbstractyL {
    private abcd.wL DW;
    private abcd.wL FH;
    private abcd.wL Hw;
    private abcd.wL j6;
    private abcd.PN v5;

    private ON(abcd.FL r4) {
        if (r4.tp() < 3) goto L15;
        if (r4.tp() > 5) goto L15;
        java.util.Enumeration r5 = r4.u7();
        this.j6 = abcd.lM.j6(r5.nextElement());
        this.DW = abcd.lM.j6(r5.nextElement());
        this.FH = abcd.lM.j6(r5.nextElement());
        abcd.InterfaceqL r0 = j6(r5);
        if (r0 != null) goto L9;
    L11:
        if (r0 == null) goto L16;
        this.v5 = abcd.PN.j6(r0.DW());
        return;
    L16:
        return;
    L9:
        if ((r0 instanceof abcd.wL) == false) goto L11;
        this.Hw = abcd.lM.j6(r0);
        r0 = j6(r5);
    L15:
        throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
    }

    public static abcd.ON j6(java.lang.Object r3) {
        if (r3 == null) goto L13;
        if ((r3 instanceof abcd.ON) == true) goto L13;
        if ((r3 instanceof abcd.FL) == false) goto L11;
        return new abcd.ON((abcd.FL) r3);
    L11:
        throw new java.lang.IllegalArgumentException("Invalid DHDomainParameters: " + r3.getClass().getName());
    L13:
        return (abcd.ON) r3;
    }

    private static abcd.InterfaceqL j6(java.util.Enumeration r1) {
        if (r1.hasMoreElements() == true) goto L7;
        return null;
    L7:
        return (abcd.InterfaceqL) r1.nextElement();
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        r0.j6(this.FH);
        abcd.wL r1 = this.Hw;
        if (r1 == null) goto L5;
        r0.j6(r1);
    L5:
        abcd.PN r2 = this.v5;
        if (r2 == null) goto L9;
        r0.j6(r2);
    L9:
        return new abcd.tM(r0);
    }

    public abcd.wL Zo() {
        return this.j6;
    }

    public abcd.wL v5() {
        return this.DW;
    }
}
