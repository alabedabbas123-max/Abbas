package abcd;

public final class fr implements java.lang.Comparable<abcd.fr> {
    public static final abcd.fr j6 = null;
    private final abcd.iq DW;
    private final short[] FH;

    static {
        j6 = new abcd.fr(null, new short[0]);
    }

    public fr(abcd.iq r1, short[] r2) {
        this.DW = r1;
        this.FH = r2;
    }

    public short[] Hw() {
        return this.FH;
    }

    @Override
    public int compareTo(abcd.fr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r5) {
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
                    if (abcd.fr.class == r5.getClass()) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (java.util.Arrays.equals(this.FH, ((abcd.fr) r5).FH) == true) { $pc0 = 14; continue $sw0; }
                    return false;
                }
                case 14: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return 31 + java.util.Arrays.hashCode(this.FH);
    }

    public int j6(abcd.fr r6) {
        int r0 = 0;
        short[] r1 = null;
        short[] r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = this.FH;
                    if (r0 >= r1.length) { $pc1 = 13; continue $sw1; }
                    r2 = r6.FH;
                    if (r0 >= r2.length) { $pc1 = 13; continue $sw1; }
                    if (r1[r0] != r2[r0]) { $pc1 = 10; continue $sw1; }
                    r0 = r0 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 10: {
                    return abcd.nu.j6(r1[r0], r2[r0]);
                }
                case 13: {
                    return abcd.nu.j6(this.FH.length, r6.FH.length);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.iq r3 = null;
        java.lang.Object r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("(");
                    r1 = this.FH.length;
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r1) { $pc2 = 9; continue $sw2; }
                    r3 = this.DW;
                    if (r3 == null) { $pc2 = 7; continue $sw2; }
                    r4 = r3.Hw().get(this.FH[r2]);
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    r0.append(r4);
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 7: {
                    r4 = java.lang.Short.valueOf(this.FH[r2]);
                    { $pc2 = 8; continue $sw2; }
                }
                case 9: {
                    r0.append(")");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
