package abcd;

public class YL extends abcd.LL {
    public YL(int r2, abcd.InterfaceqL r3) {
        super(true, r2, r3);
    }

    public YL(boolean r1, int r2, abcd.InterfaceqL r3) {
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
    void j6(abcd.CL r3) {
        r3.j6(160, this.j6);
        r3.j6(128);
        if (this.DW == false) goto L5;
    L25:
        r3.j6(0);
        r3.j6(0);
        return;
    L5:
        if (this.FH == true) goto L24;
        abcd.InterfaceqL r0 = this.Hw;
        if ((r0 instanceof abcd.AL) == false) goto L13;
        if ((r0 instanceof abcd.SL) == false) goto L11;
        java.util.Enumeration r1 = ((abcd.SL) r0).tp();
    L19:
        if (r1.hasMoreElements() == false) goto L25;
        r3.j6((abcd.InterfaceqL) r1.nextElement());
        goto L19
    L11:
        r1 = new abcd.SL(((abcd.AL) r0).u7()).tp();
        goto L19
    L13:
        if ((r0 instanceof abcd.FL) == false) goto L16;
        r1 = ((abcd.FL) r0).u7();
        goto L19
    L16:
        if ((r0 instanceof abcd.HL) == false) goto L23;
        r1 = ((abcd.HL) r0).u7();
        goto L19
    L23:
        throw new java.lang.RuntimeException("not implemented: " + this.Hw.getClass().getName());
    L24:
        r3.j6(this.Hw);
        goto L25
    }

    @Override
    int v5() {
        if (this.DW == true) goto L11;
        int r0 = this.Hw.DW().v5();
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
