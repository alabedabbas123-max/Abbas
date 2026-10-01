package abcd;

public final class Lr implements java.lang.Comparable<abcd.Lr> {
    private final abcd.Abstractms DW;
    private final abcd.Js j6;

    public Lr(abcd.Js r1, abcd.Abstractms r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    this.j6 = r1;
                    this.DW = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("value == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("name == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Js Hw() {
        return this.j6;
    }

    public abcd.Abstractms Zo() {
        return this.DW;
    }

    @Override
    public int compareTo(abcd.Lr r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r4) {
        abcd.Lr r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r4 instanceof abcd.Lr) == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.Lr) r4;
                    if (this.j6.equals(r5.j6) == true) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    if (this.DW.equals(r5.DW) == false) { $pc1 = 12; continue $sw1; }
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
        return (this.j6.hashCode() * 31) + this.DW.hashCode();
    }

    public int j6(abcd.Lr r3) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6.j6(r3.j6);
                    if (r0 == 0) { $pc2 = 6; continue $sw2; }
                    return r0;
                }
                case 6: {
                    return this.DW.j6(r3.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return this.j6.aM() + ":" + this.DW;
    }
}
