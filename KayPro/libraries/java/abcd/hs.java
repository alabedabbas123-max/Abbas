package abcd;

public final class hs {
    public static final abcd.hs j6 = null;
    private final abcd.Js DW;
    private final int FH;
    private final int Hw;

    static {
        j6 = new abcd.hs(null, -1, -1);
    }

    public hs(abcd.Js r2, int r3, int r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 < (-1)) { $pc0 = 10; continue $sw0; }
                    if (r4 < (-1)) { $pc0 = 8; continue $sw0; }
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = r4;
                    return;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("line < -1");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("address < -1");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(abcd.hs r3) {
        abcd.Js r0 = null;
        abcd.Js r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw != r3.Hw) { $pc1 = 10; continue $sw1; }
                    r0 = this.DW;
                    r4 = r3.DW;
                    if (r0 == r4) { $pc1 = 9; continue $sw1; }
                    if (r0 == null) { $pc1 = 10; continue $sw1; }
                    if (r0.equals(r4) == false) { $pc1 = 10; continue $sw1; }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r5) {
        abcd.hs r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r5 instanceof abcd.hs) == true) { $pc2 = 6; continue $sw2; }
                    return false;
                }
                case 6: {
                    if (this != r5) { $pc2 = 8; continue $sw2; }
                    return true;
                }
                case 8: {
                    r6 = (abcd.hs) r5;
                    if (this.FH == r6.FH) { $pc2 = 11; continue $sw2; }
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    return false;
                }
                case 11: {
                    if (DW(r6) == false) { $pc2 = 13; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return (this.DW.hashCode() + this.FH) + this.Hw;
    }

    public int j6() {
        return this.Hw;
    }

    public boolean j6(abcd.hs r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.Hw != r2.Hw) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = null;
        abcd.Js r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuffer(50);
                    r1 = this.DW;
                    if (r1 == null) { $pc4 = 5; continue $sw4; }
                    r0.append(r1.aM());
                    r0.append(":");
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r2 = this.Hw;
                    if (r2 < 0) { $pc4 = 8; continue $sw4; }
                    r0.append(r2);
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r0.append('@');
                    r3 = this.FH;
                    if (r3 >= 0) { $pc4 = 11; continue $sw4; }
                    r0.append("????");
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    return r0.toString();
                }
                case 11: {
                    r0.append(abcd.Yt.v5(r3));
                    { $pc4 = 13; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
