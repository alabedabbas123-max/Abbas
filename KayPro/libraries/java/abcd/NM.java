package abcd;

public class NM {
    private int DW;
    private java.lang.String j6;

    public NM(java.lang.String r1) {
        this.j6 = r1;
        this.DW = 0;
    }

    public java.lang.String DW() {
        int r0 = 0;
        int r1 = 0;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != (-1)) { $pc0 = 6; continue $sw0; }
                    return null;
                }
                case 6: {
                    r1 = this.j6.indexOf(46, r0);
                    if (r1 != (-1)) { $pc0 = 10; continue $sw0; }
                    r2 = this.j6.substring(this.DW);
                    this.DW = -1;
                    return r2;
                }
                case 10: {
                    r3 = this.j6.substring(this.DW, r1);
                    this.DW = r1 + 1;
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW == (-1)) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
