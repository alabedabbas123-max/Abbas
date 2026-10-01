package abcd;

public class Yp {
    private final int[] j6;

    public Yp(int[] r1) {
        this.j6 = r1;
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
                    if (abcd.Yp.class == r5.getClass()) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    if (java.util.Arrays.equals(this.j6, ((abcd.Yp) r5).j6) == true) { $pc0 = 14; continue $sw0; }
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

    public void j6(abcd.hr.a r4) {
        int r0 = 0;
        int[] r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r4.writeInt(this.j6.length);
                    r0 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = this.j6;
                    if (r0 >= r1.length) { $pc1 = 6; continue $sw1; }
                    r4.writeInt(r1[r0]);
                    r0 = r0 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int[] j6() {
        return this.j6;
    }
}
