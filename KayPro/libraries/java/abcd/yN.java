package abcd;

public class yN extends abcd.AbstractyL {
    abcd.DN DW;
    abcd.wN FH;
    abcd.cM Hw;
    abcd.FL j6;

    private yN(abcd.FL r3) {
        this.j6 = r3;
        if (r3.tp() != 3) goto L7;
        this.DW = abcd.DN.j6(r3.j6(0));
        this.FH = abcd.wN.j6(r3.j6(1));
        this.Hw = abcd.cM.j6(r3.j6(2));
        return;
    L7:
        throw new java.lang.IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static abcd.yN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.yN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.yN(abcd.FL.j6(r1));
    L5:
        return (abcd.yN) r1;
    }

    @Override
    public abcd.EL DW() {
        return this.j6;
    }

    public abcd.DN VH() {
        return this.DW;
    }

    public abcd.wL Zo() {
        return this.DW.VH();
    }

    public abcd.sN v5() {
        return this.DW.Zo();
    }
}
