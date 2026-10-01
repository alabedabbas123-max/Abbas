package abcd;

public final class Vp implements java.lang.Comparable<abcd.Vp> {
    private final byte DW;
    private final int FH;
    private final int[] Hw;
    private final abcd.iq j6;
    private final abcd.jq[] v5;

    public Vp(abcd.iq r1, byte r2, int r3, int[] r4, abcd.jq[] r5) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
    }

    public int[] Hw() {
        return this.Hw;
    }

    public abcd.jq[] VH() {
        return this.v5;
    }

    public int Zo() {
        return this.FH;
    }

    @Override
    public int compareTo(abcd.Vp r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
        abcd.Vp r6 = null;
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
                    if (abcd.Vp.class == r5.getClass()) { $pc0 = 11; continue $sw0; }
                    return false;
                }
                case 11: {
                    r6 = (abcd.Vp) r5;
                    if (java.util.Arrays.equals(this.Hw, r6.Hw) == true) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (this.FH == r6.FH) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (java.util.Arrays.equals(this.v5, r6.v5) == true) { $pc0 = 21; continue $sw0; }
                    return false;
                }
                case 21: {
                    if (this.DW == r6.DW) { $pc0 = 23; continue $sw0; }
                    return false;
                }
                case 23: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return ((((((java.util.Arrays.hashCode(this.Hw) + 31) * 31) + this.FH) * 31) + java.util.Arrays.hashCode(this.v5)) * 31) + this.DW;
    }

    public int j6(abcd.Vp r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int[] r4 = null;
        int r5 = 0;
        int[] r6 = null;
        int r8 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH;
                    r1 = r7.FH;
                    if (r0 != r1) { $pc1 = 5; continue $sw1; }
                    r2 = java.lang.Math.min(this.Hw.length, r7.Hw.length);
                    r3 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r3 >= r2) { $pc1 = 17; continue $sw1; }
                    r4 = this.Hw;
                    r5 = r4[r3];
                    r6 = r7.Hw;
                    if (r5 != r6[r3]) { $pc1 = 11; continue $sw1; }
                    r8 = this.v5[r3].j6(r7.v5[r3]);
                    if (r8 != 0) { $pc1 = 14; continue $sw1; }
                    r3 = r3 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 14: {
                    return r8;
                }
                case 11: {
                    return abcd.nu.j6(r4[r3], r6[r3]);
                }
                case 17: {
                    return this.Hw.length - r7.Hw.length;
                }
                case 5: {
                    return abcd.nu.j6(r0, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.hr.a r4) {
        int r0 = 0;
        int[] r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r4.writeByte(this.DW);
                    r4.DW(this.FH);
                    r4.DW(this.Hw.length);
                    r0 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r1 = this.Hw;
                    if (r0 >= r1.length) { $pc2 = 6; continue $sw2; }
                    r4.DW(r1[r0]);
                    this.v5[r0].j6(r4);
                    r0 = r0 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6 == null) { $pc3 = 5; continue $sw3; }
                    r0 = new java.lang.StringBuilder();
                    r0.append(this.DW);
                    r0.append(" ");
                    r0.append(this.j6.Hw().get(this.FH));
                    r0.append("[");
                    r1 = 0;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r1 >= this.Hw.length) { $pc3 = 12; continue $sw3; }
                    if (r1 <= 0) { $pc3 = 11; continue $sw3; }
                    r0.append(", ");
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r0.append(this.j6.FH().get(this.Hw[r1]));
                    r0.append("=");
                    r0.append(this.v5[r1]);
                    r1 = r1 + 1;
                    { $pc3 = 8; continue $sw3; }
                }
                case 12: {
                    r0.append("]");
                    return r0.toString();
                }
                case 5: {
                    return this.DW + " " + this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte we() {
        return this.DW;
    }
}
