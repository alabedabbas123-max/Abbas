package abcd;

public class du extends abcd.Xt {
    private final abcd.au FH;

    public du(int r2) {
        super(r2);
        this.FH = new abcd.au(r2);
    }

    public du(abcd.du r4) {
        super(r4.size());
        this.FH = r4.FH.lg();
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        java.lang.Object r2 = r4.DW(r1);
        if (r2 == null) goto L7;
        j6(r1, r2);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    private void er() {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        abcd.Interfacecu r2 = (abcd.Interfacecu) DW(r1);
        if (r2 == null) goto L7;
        this.FH.FH(r2.DW(), r1);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    private void j6(int r5, int r6) {
        int r0 = this.FH.size();
        int r1 = 0;
    L4:
        if (r1 > (r5 - r0)) goto L6;
        this.FH.DW(-1);
        r1 = r1 + 1;
        goto L4
    L6:
        this.FH.FH(r5, r6);
    }

    private void v5(int r3) {
        this.FH.FH(r3, -1);
    }

    public final int Hw(int r2) {
        if (r2 < this.FH.size()) goto L7;
        return -1;
    L7:
        return this.FH.get(r2);
    }

    protected void j6(int r2, abcd.Interfacecu r3) {
        abcd.Interfacecu r0 = (abcd.Interfacecu) FH(r2);
        j6(r2, r3);
        if (r0 == null) goto L5;
        v5(r0.DW());
    L5:
        if (r3 == null) goto L8;
        j6(r3.DW(), r2);
        return;
    }

    @Override
    public void lg() {
        super.lg();
        er();
    }

    public final int rN() {
        int r0 = this.FH.size() - 1;
    L3:
        if (r0 < 0) goto L7;
        if (this.FH.get(r0) >= 0) goto L7;
        r0 = r0 - 1;
    L7:
        int r1 = r0 + 1;
        this.FH.gn(r1);
        return r1;
    }
}
