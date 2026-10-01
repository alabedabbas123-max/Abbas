package abcd;

public class vM extends abcd.HL {
    private int FH;

    public vM() {
        this.FH = -1;
    }

    public vM(abcd.InterfaceqL r1) {
        super(r1);
        this.FH = -1;
    }

    public vM(abcd.rL r2) {
        super(r2, true);
        this.FH = -1;
    }

    vM(abcd.rL r1, boolean r2) {
        super(r1, r2);
        this.FH = -1;
    }

    private int we() {
        if (this.FH >= 0) goto L10;
        int r0 = 0;
        java.util.Enumeration r1 = u7();
    L6:
        if (r1.hasMoreElements() == false) goto L7;
        r0 = r0 + ((abcd.InterfaceqL) r1.nextElement()).DW().VH().v5();
        goto L6
    L7:
        this.FH = r0;
    L10:
        return this.FH;
    }

    @Override
    void j6(abcd.CL r4) {
        abcd.CL r0 = r4.j6();
        int r1 = we();
        r4.j6(49);
        r4.DW(r1);
        java.util.Enumeration r5 = u7();
    L4:
        if (r5.hasMoreElements() == false) goto L5;
        r0.j6((abcd.InterfaceqL) r5.nextElement());
        goto L4
    }

    @Override
    int v5() {
        int r0 = we();
        return (abcd.OM.j6(r0) + 1) + r0;
    }
}
