package abcd;

public class rN extends abcd.AbstractyL {
    private abcd.HL j6;

    private rN(abcd.HL r1) {
        this.j6 = r1;
    }

    public static abcd.rN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.rN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.rN(abcd.HL.j6(r1));
    L5:
        return (abcd.rN) r1;
    }

    @Override
    public abcd.EL DW() {
        return this.j6;
    }

    public boolean VH() {
        if (this.j6.tp() <= 1) goto L5;
        return true;
    L5:
        return false;
    }

    public abcd.qN[] Zo() {
        abcd.qN[] r0 = new abcd.qN[this.j6.tp()];
        int r1 = 0;
    L4:
        if (r1 == r0.length) goto L5;
        r0[r1] = abcd.qN.j6(this.j6.j6(r1));
        r1 = r1 + 1;
        goto L4
    L5:
        return r0;
    }

    public abcd.qN v5() {
        if (this.j6.tp() != 0) goto L7;
        return null;
    L7:
        return abcd.qN.j6(this.j6.j6(0));
    }
}
