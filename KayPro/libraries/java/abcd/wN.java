package abcd;

public class wN extends abcd.AbstractyL {
    private abcd.InterfaceqL DW;
    private boolean FH;
    private abcd.zL j6;

    public wN(abcd.FL r5) {
        this.FH = false;
        if (r5.tp() < 1) goto L12;
        if (r5.tp() > 2) goto L12;
        this.j6 = abcd.oM.j6(r5.j6(0));
        if (r5.tp() != 2) goto L9;
        this.FH = true;
        this.DW = r5.j6(1);
        return;
    L9:
        this.DW = null;
        return;
    L12:
        throw new java.lang.IllegalArgumentException("Bad sequence size: " + r5.tp());
    }

    public wN(abcd.oM r2) {
        this.FH = false;
        this.j6 = new abcd.zL(r2.tp());
    }

    public wN(abcd.oM r2, abcd.InterfaceqL r3) {
        this.FH = false;
        this.FH = true;
        this.j6 = new abcd.zL(r2.tp());
        this.DW = r3;
    }

    public wN(abcd.zL r2) {
        this.FH = false;
        this.j6 = r2;
    }

    public wN(abcd.zL r2, abcd.InterfaceqL r3) {
        this.FH = false;
        this.FH = true;
        this.j6 = r2;
        this.DW = r3;
    }

    public wN(java.lang.String r2) {
        this.FH = false;
        this.j6 = new abcd.zL(r2);
    }

    public static abcd.wN j6(abcd.LL r0, boolean r1) {
        return j6(abcd.FL.j6(r0, r1));
    }

    public static abcd.wN j6(java.lang.Object r3) {
        if (r3 == null) goto L24;
        if ((r3 instanceof abcd.wN) == true) goto L24;
        if ((r3 instanceof abcd.zL) == false) goto L11;
        return new abcd.wN((abcd.zL) r3);
    L11:
        if ((r3 instanceof java.lang.String) == false) goto L15;
        return new abcd.wN((java.lang.String) r3);
    L15:
        if ((r3 instanceof abcd.FL) == true) goto L22;
        if ((r3 instanceof abcd.GL) == true) goto L22;
        throw new java.lang.IllegalArgumentException("unknown object in factory: " + r3.getClass().getName());
    L22:
        return new abcd.wN(abcd.FL.j6(r3));
    L24:
        return (abcd.wN) r3;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        if (this.FH == false) goto L9;
        abcd.InterfaceqL r1 = this.DW;
        if (r1 == null) goto L7;
        r0.j6(r1);
        goto L9
    L7:
        r0.j6(abcd.mM.j6);
    L9:
        return new abcd.tM(r0);
    }

    public abcd.InterfaceqL VH() {
        return this.DW;
    }

    public abcd.zL Zo() {
        return this.j6;
    }

    public abcd.zL v5() {
        return new abcd.zL(this.j6.tp());
    }
}
