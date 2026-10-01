package abcd;

public final class nq implements java.lang.Comparable<abcd.nq> {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final abcd.iq j6;

    public nq(abcd.iq r1, int r2, int r3, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public int Hw() {
        return this.DW;
    }

    public int VH() {
        return this.FH;
    }

    public int Zo() {
        return this.Hw;
    }

    @Override
    public int compareTo(abcd.nq r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        abcd.nq r6 = null;
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
                    if (abcd.nq.class == r5.getClass()) { $pc0 = 11; continue $sw0; }
                    return false;
                }
                case 11: {
                    r6 = (abcd.nq) r5;
                    if (this.DW == r6.DW) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.Hw == r6.Hw) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (this.FH == r6.FH) { $pc0 = 20; continue $sw0; }
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
        return ((((this.DW + 31) * 31) + this.Hw) * 31) + this.FH;
    }

    public int j6(abcd.nq r3) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW;
                    r1 = r3.DW;
                    if (r0 != r1) { $pc1 = 5; continue $sw1; }
                    r2 = this.Hw;
                    r4 = r3.Hw;
                    if (r2 == r4) { $pc1 = 11; continue $sw1; }
                    return abcd.nu.j6(r2, r4);
                }
                case 11: {
                    return abcd.nu.j6(this.FH, r3.FH);
                }
                case 5: {
                    return abcd.nu.j6(r0, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.hr.a r2) {
        r2.u7(this.DW);
        r2.u7(this.FH);
        r2.writeInt(this.Hw);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        abcd.iq r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6 == null) { $pc2 = 5; continue $sw2; }
                    r0 = new java.lang.StringBuilder();
                    r0.append(this.j6.Hw().get(this.DW));
                    r0.append(".");
                    r0.append(this.j6.FH().get(this.Hw));
                    r1 = this.j6;
                    r0.append(r1.FH(r1.DW().get(this.FH).Hw()));
                    return r0.toString();
                }
                case 5: {
                    return this.DW + " " + this.FH + " " + this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
