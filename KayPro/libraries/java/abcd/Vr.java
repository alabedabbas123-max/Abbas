package abcd;

public class Vr implements java.lang.Comparable<abcd.Vr> {
    private final abcd.Js DW;
    private final abcd.Js j6;

    private Vr(abcd.Js r1, abcd.Js r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private static int DW(abcd.Js r0, abcd.Js r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r0 != r1) { $pc0 = 5; continue $sw0; }
                    return 0;
                }
                case 5: {
                    if (r0 != null) { $pc0 = 8; continue $sw0; }
                    return -1;
                }
                case 8: {
                    if (r1 != null) { $pc0 = 12; continue $sw0; }
                    return 1;
                }
                case 12: {
                    return r0.j6(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Vr j6(abcd.Js r1, abcd.Js r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != null) { $pc1 = 7; continue $sw1; }
                    if (r2 != null) { $pc1 = 7; continue $sw1; }
                    return null;
                }
                case 7: {
                    return new abcd.Vr(r1, r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Js Hw() {
        return this.j6;
    }

    public abcd.Js Zo() {
        return this.DW;
    }

    @Override
    public int compareTo(abcd.Vr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r3 instanceof abcd.Vr) == true) { $pc2 = 6; continue $sw2; }
                    return false;
                }
                case 6: {
                    if (j6((abcd.Vr) r3) != 0) { $pc2 = 9; continue $sw2; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        abcd.Js r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.Js r4 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6;
                    r1 = 0;
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    r2 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r3 = r2 * 31;
                    r4 = this.DW;
                    if (r4 == null) { $pc3 = 11; continue $sw3; }
                    r1 = r4.hashCode();
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    return r3 + r1;
                }
                case 5: {
                    r2 = r0.hashCode();
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Vr r3) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = DW(this.j6, r3.j6);
                    if (r0 == 0) { $pc4 = 6; continue $sw4; }
                    return r0;
                }
                case 6: {
                    return DW(this.DW, r3.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        abcd.Js r0 = null;
        java.lang.String r1 = null;
        java.lang.StringBuilder r2 = null;
        abcd.Js r3 = null;
        java.lang.String r4 = null;
        abcd.Js r5 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.j6;
                    if (r0 != null) { $pc5 = 5; continue $sw5; }
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    r1 = "";
                    if (this.j6 == null) { $pc5 = 11; continue $sw5; }
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    r2 = new java.lang.StringBuilder();
                    r2.append("[");
                    r3 = this.j6;
                    if (r3 != null) { $pc5 = 16; continue $sw5; }
                    r4 = "";
                    $pc5 = 17; continue $sw5;
                }
                case 17: {
                    r2.append(r4);
                    r2.append("|");
                    r5 = this.DW;
                    if (r5 == null) { $pc5 = 21; continue $sw5; }
                    r1 = r5.lg();
                    $pc5 = 21; continue $sw5;
                }
                case 21: {
                    r2.append(r1);
                    return r2.toString();
                }
                case 16: {
                    r4 = r3.lg();
                    { $pc5 = 17; continue $sw5; }
                }
                case 11: {
                    if (this.DW != null) { $pc5 = 13; continue $sw5; }
                    return "";
                }
                case 5: {
                    if (this.DW != null) { $pc5 = 8; continue $sw5; }
                    return r0.lg();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
