package abcd;

public class TO implements abcd.InterfaceqO {
    private java.math.BigInteger DW;
    private java.math.BigInteger FH;
    private java.math.BigInteger Hw;
    private abcd.WO VH;
    private int Zo;
    private java.math.BigInteger j6;
    private int v5;

    public TO(java.math.BigInteger r9, java.math.BigInteger r10, java.math.BigInteger r11, int r12) {
        this(r9, r10, r11, j6(r12), r12, null, null);
    }

    public TO(java.math.BigInteger r5, java.math.BigInteger r6, java.math.BigInteger r7, int r8, int r9, java.math.BigInteger r10, abcd.WO r11) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r9 != 0) { $pc0 = 5; continue $sw0; }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    this.j6 = r6;
                    this.DW = r5;
                    this.FH = r7;
                    this.v5 = r8;
                    this.Zo = r9;
                    this.Hw = r10;
                    this.VH = r11;
                    return;
                }
                case 5: {
                    if (java.math.BigInteger.valueOf(2 ^ ((long) (r9 - 1))).compareTo(r5) == 1) { $pc0 = 11; continue $sw0; }
                    if (r9 >= r8) { $pc0 = 12; continue $sw0; }
                    throw new java.lang.IllegalArgumentException("when l value specified, it may not be less than m value");
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public TO(java.math.BigInteger r9, java.math.BigInteger r10, java.math.BigInteger r11, java.math.BigInteger r12, abcd.WO r13) {
        this(r9, r10, r11, 160, 0, r12, r13);
    }

    private static int j6(int r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != 0) { $pc1 = 5; continue $sw1; }
                    return 160;
                }
                case 5: {
                    if (r1 < 160) { $pc1 = 9; continue $sw1; }
                    return 160;
                }
                case 9: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.Zo;
    }

    public int FH() {
        return this.v5;
    }

    public java.math.BigInteger Hw() {
        return this.DW;
    }

    public boolean equals(java.lang.Object r4) {
        abcd.TO r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r4 instanceof abcd.TO) == true) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.TO) r4;
                    if (v5() == null) { $pc2 = 11; continue $sw2; }
                    if (v5().equals(r5.v5()) == true) { $pc2 = 14; continue $sw2; }
                    return false;
                }
                case 14: {
                    if (r5.Hw().equals(this.DW) == true) { $pc2 = 16; continue $sw2; }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    return false;
                }
                case 16: {
                    if (r5.j6().equals(this.j6) == false) { $pc2 = 19; continue $sw2; }
                    return true;
                }
                case 11: {
                    if (r5.v5() == null) { $pc2 = 14; continue $sw2; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = Hw().hashCode() ^ j6().hashCode();
                    if (v5() == null) { $pc3 = 5; continue $sw3; }
                    r1 = v5().hashCode();
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    return r0 ^ r1;
                }
                case 5: {
                    r1 = 0;
                    { $pc3 = 7; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.math.BigInteger j6() {
        return this.j6;
    }

    public java.math.BigInteger v5() {
        return this.FH;
    }
}
