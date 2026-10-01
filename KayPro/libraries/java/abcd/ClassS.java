package abcd;

public class ClassS<F, S> {
    public final S DW;
    public final F j6;

    public ClassS(F r1, S r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private static boolean j6(java.lang.Object r0, java.lang.Object r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r0 == r1) { $pc0 = 8; continue $sw0; }
                    if (r0 != null) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.equals(r1) == false) { $pc0 = 7; continue $sw0; }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r4) {
        abcd.ClassS r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r4 instanceof abcd.ClassS) == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.ClassS) r4;
                    if (j6(r5.j6, this.j6) == true) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    if (j6(r5.DW, this.DW) == false) { $pc1 = 12; continue $sw1; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        F r0 = null;
        int r1 = 0;
        int r2 = 0;
        S r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6;
                    r1 = 0;
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    r2 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r3 = this.DW;
                    if (r3 == null) { $pc2 = 11; continue $sw2; }
                    r1 = r3.hashCode();
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    return r2 ^ r1;
                }
                case 5: {
                    r2 = r0.hashCode();
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "Pair{" + java.lang.String.valueOf(this.j6) + " " + java.lang.String.valueOf(this.DW) + "}";
    }
}
