package abcd;

public final class jq implements java.lang.Comparable<abcd.jq> {
    private final byte[] j6;

    public jq(byte[] r1) {
        this.j6 = r1;
    }

    public abcd.St Hw() {
        return new abcd.Rt(this.j6);
    }

    @Override
    public int compareTo(abcd.jq r1) {
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
                    if (abcd.jq.class == r5.getClass()) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (java.util.Arrays.equals(this.j6, ((abcd.jq) r5).j6) == true) { $pc0 = 14; continue $sw0; }
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
        return 31 + java.util.Arrays.hashCode(this.j6);
    }

    public int j6(abcd.jq r7) {
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        byte r3 = 0;
        byte[] r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = java.lang.Math.min(this.j6.length, r7.j6.length);
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r0) { $pc1 = 10; continue $sw1; }
                    r2 = this.j6;
                    r3 = r2[r1];
                    r4 = r7.j6;
                    if (r3 != r4[r1]) { $pc1 = 7; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 7: {
                    return (r2[r1] & 255) - (r4[r1] & 255);
                }
                case 10: {
                    return this.j6.length - r7.j6.length;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.hr.a r2) {
        r2.write(this.j6);
    }

    public java.lang.String toString() {
        return java.lang.Integer.toHexString(this.j6[0] & 255) + "...(" + this.j6.length + ")";
    }
}
