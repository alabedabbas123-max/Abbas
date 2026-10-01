package abcd;

final class RF extends abcd.XF {
    private final abcd.UF DW;
    private int FH;
    private final abcd.XF j6;

    RF(abcd.XF r1) {
        this.j6 = r1;
        this.DW = new abcd.UF();
    }

    @Override
    int DW() {
        return this.j6.DW();
    }

    @Override
    abcd.dG j6() {
    L3:
        if (this.FH >= 6) goto L7;
        abcd.dG r0 = this.j6.j6();
        if (r0 == null) goto L7;
        this.DW.j6(r0);
        this.FH++;
    L7:
        abcd.dG r1 = this.DW.j6();
        if (r1 != null) goto L11;
        return null;
    L11:
        this.FH--;
        return r1;
    }
}
