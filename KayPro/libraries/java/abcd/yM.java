package abcd;

public class yM extends abcd.LL {
    private static final byte[] v5 = null;

    static {
        v5 = new byte[0];
    }

    public yM(boolean r1, int r2, abcd.InterfaceqL r3) {
        super(r1, r2, r3);
    }

    @Override
    boolean Zo() {
        if (this.DW == false) goto L5;
        return true;
    L5:
        if (this.FH == false) goto L8;
        return true;
    L8:
        return this.Hw.DW().VH().Zo();
    }

    @Override
    void j6(abcd.CL r4) {
        int r1 = 160;
        if (this.DW == true) goto L12;
        abcd.EL r0 = this.Hw.DW().VH();
        if (this.FH == false) goto L8;
        r4.j6(160, this.j6);
        r4.DW(r0.v5());
        r4.j6(r0);
        return;
    L8:
        if (r0.Zo() == true) goto L11;
        r1 = 128;
    L11:
        r4.j6(r1, this.j6);
        r4.j6(r0);
        return;
    L12:
        r4.j6(160, this.j6, v5);
    }

    @Override
    int v5() {
        if (this.DW == true) goto L11;
        int r0 = this.Hw.DW().VH().v5();
        if (this.FH == false) goto L9;
        int r1 = abcd.OM.DW(this.j6) + abcd.OM.j6(r0);
    L8:
        return r1 + r0;
    L9:
        r0 = r0 - 1;
        r1 = abcd.OM.DW(this.j6);
        goto L8
    L11:
        return abcd.OM.DW(this.j6) + 1;
    }
}
