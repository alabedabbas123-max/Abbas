package abcd;

public class WL extends abcd.HL {
    public WL() {
    }

    public WL(abcd.InterfaceqL r1) {
        super(r1);
    }

    public WL(abcd.rL r2) {
        super(r2, false);
    }

    public WL(abcd.InterfaceqL[] r2) {
        super(r2, false);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(49);
        r3.j6(128);
        java.util.Enumeration r0 = u7();
    L4:
        if (r0.hasMoreElements() == false) goto L5;
        r3.j6((abcd.InterfaceqL) r0.nextElement());
        goto L4
    L5:
        r3.j6(0);
        r3.j6(0);
    }

    @Override
    int v5() {
        java.util.Enumeration r0 = u7();
        int r1 = 0;
    L4:
        if (r0.hasMoreElements() == false) goto L6;
        r1 = r1 + ((abcd.InterfaceqL) r0.nextElement()).DW().v5();
        goto L4
    L6:
        return (r1 + 2) + 2;
    }
}
