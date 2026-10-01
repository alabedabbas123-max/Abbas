package abcd;

public final class qq implements java.lang.Comparable<abcd.qq> {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final abcd.iq j6;

    public qq(abcd.iq r1, int r2, int r3, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public int Hw() {
        return this.Hw;
    }

    public int VH() {
        return this.DW;
    }

    public int Zo() {
        return this.FH;
    }

    @Override
    public int compareTo(abcd.qq r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        abcd.qq r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r5) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if (r5 != null) { $pc0 = 9; continue $sw0; }
                    return false;
                }
                case 9: {
                    if (abcd.qq.class == r5.getClass()) { $pc0 = 11; continue $sw0; }
                    return false;
                }
                case 11: {
                    r6 = (abcd.qq) r5;
                    if (this.Hw == r6.Hw) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.FH == r6.FH) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (this.DW == r6.DW) { $pc0 = 20; continue $sw0; }
                    return false;
                }
                case 20: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return ((((this.Hw + 31) * 31) + this.FH) * 31) + this.DW;
    }

    public int j6(abcd.qq r3) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH;
                    r1 = r3.FH;
                    if (r0 == r1) { $pc1 = 7; continue $sw1; }
                    return abcd.nu.j6(r0, r1);
                }
                case 7: {
                    return abcd.nu.j6(this.Hw, r3.Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.hr.a r2) {
        r2.writeInt(this.DW);
        r2.writeInt(this.FH);
        r2.writeInt(this.Hw);
    }

    public java.lang.String toString() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6 != null) { $pc2 = 7; continue $sw2; }
                    return this.DW + " " + this.FH + " " + this.Hw;
                }
                case 7: {
                    return this.j6.FH().get(this.DW) + ": " + this.j6.Hw().get(this.FH) + " " + this.j6.FH(this.Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
