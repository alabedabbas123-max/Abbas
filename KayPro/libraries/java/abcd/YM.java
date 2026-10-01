package abcd;

public class YM extends abcd.AbstractyL {
    private abcd.XM DW;
    private abcd.wN FH;
    private abcd.HL Hw;
    private abcd.HL VH;
    private abcd.AL Zo;
    private abcd.wL j6;
    private abcd.wN v5;

    public YM(abcd.FL r5) {
        java.util.Enumeration r6 = r5.u7();
        this.j6 = (abcd.wL) r6.nextElement();
        this.DW = abcd.XM.j6(r6.nextElement());
        this.FH = abcd.wN.j6(r6.nextElement());
        java.lang.Object r0 = r6.nextElement();
        if ((r0 instanceof abcd.LL) == false) goto L5;
        this.Hw = abcd.HL.j6((abcd.LL) r0, false);
        this.v5 = abcd.wN.j6(r6.nextElement());
    L6:
        this.Zo = abcd.AL.j6(r6.nextElement());
        if (r6.hasMoreElements() == false) goto L9;
        this.VH = abcd.HL.j6((abcd.LL) r6.nextElement(), false);
        return;
    L9:
        this.VH = null;
        return;
    L5:
        this.Hw = null;
        this.v5 = abcd.wN.j6(r0);
        goto L6
    }

    public YM(abcd.XM r3, abcd.wN r4, abcd.HL r5, abcd.wN r6, abcd.AL r7, abcd.HL r8) {
        if (r3.v5() == false) goto L5;
        this.j6 = new abcd.wL(3);
    L6:
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = r6;
        this.Zo = r7;
        this.VH = r8;
        return;
    L5:
        this.j6 = new abcd.wL(1);
        goto L6
    }

    public static abcd.YM j6(java.lang.Object r3) {
        if (r3 == null) goto L13;
        if ((r3 instanceof abcd.YM) == true) goto L13;
        if ((r3 instanceof abcd.FL) == false) goto L11;
        return new abcd.YM((abcd.FL) r3);
    L11:
        throw new java.lang.IllegalArgumentException("unknown object in factory: " + r3.getClass().getName());
    L13:
        return (abcd.YM) r3;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        r0.j6(this.FH);
        abcd.HL r1 = this.Hw;
        if (r1 == null) goto L5;
        r0.j6(new abcd.yM(false, 0, r1));
    L5:
        r0.j6(this.v5);
        r0.j6(this.Zo);
        abcd.HL r2 = this.VH;
        if (r2 == null) goto L9;
        r0.j6(new abcd.yM(false, 1, r2));
    L9:
        return new abcd.tM(r0);
    }

    public abcd.wL Zo() {
        return this.j6;
    }

    public abcd.wN v5() {
        return this.FH;
    }
}
