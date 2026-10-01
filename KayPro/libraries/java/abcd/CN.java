package abcd;

public class CN extends abcd.AbstractyL {
    private abcd.cM DW;
    private abcd.wN j6;

    public CN(abcd.FL r4) {
        if (r4.tp() != 2) goto L7;
        java.util.Enumeration r5 = r4.u7();
        this.j6 = abcd.wN.j6(r5.nextElement());
        this.DW = abcd.cM.j6(r5.nextElement());
        return;
    L7:
        throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
    }

    public CN(abcd.wN r2, abcd.InterfaceqL r3) {
        this.DW = new abcd.cM(r3);
        this.j6 = r2;
    }

    public static abcd.CN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.CN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.CN(abcd.FL.j6(r1));
    L5:
        return (abcd.CN) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        return new abcd.tM(r0);
    }

    public abcd.EL Zo() {
        return new abcd.C1419vL(this.DW.u7()).Hw();
    }

    public abcd.wN v5() {
        return this.j6;
    }
}
