package abcd;

public class PN extends abcd.AbstractyL {
    private abcd.wL DW;
    private abcd.cM j6;

    private PN(abcd.FL r4) {
        if (r4.tp() != 2) goto L7;
        this.j6 = abcd.cM.j6(r4.j6(0));
        this.DW = abcd.lM.j6(r4.j6(1));
        return;
    L7:
        throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
    }

    public static abcd.PN j6(java.lang.Object r3) {
        if (r3 == null) goto L13;
        if ((r3 instanceof abcd.ON) == true) goto L13;
        if ((r3 instanceof abcd.FL) == false) goto L11;
        return new abcd.PN((abcd.FL) r3);
    L11:
        throw new java.lang.IllegalArgumentException("Invalid DHValidationParms: " + r3.getClass().getName());
    L13:
        return (abcd.PN) r3;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        return new abcd.tM(r0);
    }
}
