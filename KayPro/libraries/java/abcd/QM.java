package abcd;

public class QM extends abcd.AbstractyL {
    private abcd.HL DW;
    private abcd.zL j6;

    private QM(abcd.FL r2) {
        this.j6 = (abcd.zL) r2.j6(0);
        this.DW = (abcd.HL) r2.j6(1);
    }

    public QM(abcd.zL r1, abcd.HL r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public static abcd.QM j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.QM) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.QM(abcd.FL.j6(r1));
    L5:
        return (abcd.QM) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        return new abcd.tM(r0);
    }

    public abcd.zL v5() {
        return this.j6;
    }
}
