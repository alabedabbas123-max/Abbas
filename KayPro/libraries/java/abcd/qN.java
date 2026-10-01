package abcd;

public class qN extends abcd.AbstractyL {
    private abcd.InterfaceqL DW;
    private abcd.zL j6;

    private qN(abcd.FL r2) {
        this.j6 = (abcd.zL) r2.j6(0);
        this.DW = r2.j6(1);
    }

    public static abcd.qN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.qN) == true) goto L5;
        if (r1 == null) goto L10;
        return new abcd.qN(abcd.FL.j6(r1));
    L10:
        throw new java.lang.IllegalArgumentException("null value in getInstance()");
    L5:
        return (abcd.qN) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        return new abcd.tM(r0);
    }

    public abcd.InterfaceqL Zo() {
        return this.DW;
    }

    public abcd.zL v5() {
        return this.j6;
    }
}
