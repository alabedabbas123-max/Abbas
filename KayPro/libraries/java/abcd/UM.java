package abcd;

public class UM extends abcd.AbstractyL implements abcd.TM {
    private abcd.InterfaceqL DW;
    private abcd.zL j6;

    public UM(abcd.FL r4) {
        if (r4.tp() < 1) goto L17;
        if (r4.tp() > 2) goto L17;
        this.j6 = (abcd.zL) r4.j6(0);
        if (r4.tp() <= 1) goto L15;
        abcd.LL r5 = (abcd.LL) r4.j6(1);
        if (r5.we() == false) goto L14;
        if (r5.tp() != 0) goto L14;
        this.DW = r5.u7();
        return;
    L14:
        throw new java.lang.IllegalArgumentException("Bad tag for 'content'");
    L15:
        return;
    L17:
        throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
    }

    public UM(abcd.zL r1, abcd.InterfaceqL r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public static abcd.UM j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.UM) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.UM(abcd.FL.j6(r1));
    L5:
        return (abcd.UM) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        abcd.InterfaceqL r1 = this.DW;
        if (r1 == null) goto L6;
        r0.j6(new abcd.YL(0, r1));
    L6:
        return new abcd.UL(r0);
    }

    public abcd.zL Zo() {
        return this.j6;
    }

    public abcd.InterfaceqL v5() {
        return this.DW;
    }
}
