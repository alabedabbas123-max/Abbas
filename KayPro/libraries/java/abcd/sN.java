package abcd;

public class sN extends abcd.AbstractyL implements abcd.InterfacepL {
    private static abcd.InterfacetN j6;
    private boolean DW;
    private int FH;
    private abcd.InterfacetN Hw;
    private abcd.rN[] v5;

    static {
        j6 = abcd.uN.j6;
    }

    private sN(abcd.FL r2) {
        this(j6, r2);
    }

    private sN(abcd.InterfacetN r4, abcd.FL r5) {
        java.util.Enumeration r6 = null;
        int r7 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Hw = r4;
                    this.v5 = new abcd.rN[r5.tp()];
                    r6 = r5.u7();
                    r7 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r6.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    this.v5[r7] = abcd.rN.j6(r6.nextElement());
                    r7 = r7 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.sN j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.sN) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.sN(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.sN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        return new abcd.tM(this.v5);
    }

    @Override
    public boolean equals(java.lang.Object r5) {
        abcd.EL r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 != this) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if ((r5 instanceof abcd.sN) == false) { $pc2 = 8; continue $sw2; }
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    r1 = ((abcd.InterfaceqL) r5).DW();
                    if (DW().equals(r1) == false) { $pc2 = 16; continue $sw2; }
                    return true;
                }
                case 16: {
                    return this.Hw.j6(this, new abcd.sN(abcd.FL.j6(((abcd.InterfaceqL) r5).DW())));
                }
                case 15: {
                    return false;
                }
                case 8: {
                    if ((r5 instanceof abcd.FL) == true) { $pc2 = 10; continue $sw2; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.DW == true) { $pc3 = 5; continue $sw3; }
                    this.DW = true;
                    this.FH = this.Hw.DW(this);
                    return this.FH;
                }
                case 5: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return this.Hw.j6(this);
    }

    public abcd.rN[] v5() {
        abcd.rN[] r0 = this.v5;
        abcd.rN[] r1 = new abcd.rN[r0.length];
        java.lang.System.arraycopy(r0, 0, r1, 0, r1.length);
        return r1;
    }
}
