package abcd;

public class kL extends java.lang.Exception {
    private java.lang.Object DW;
    private int FH;
    private int j6;

    public kL(int r1, int r2, java.lang.Object r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        java.lang.String r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuffer();
                    r1 = this.j6;
                    if (r1 != 0) { $pc0 = 5; continue $sw0; }
                    r0.append("Unexpected character (");
                    r0.append(this.DW);
                    r2 = ") at position ";
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r0.append(r2);
                    r0.append(this.FH);
                    r0.append(".");
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    return r0.toString();
                }
                case 5: {
                    if (r1 != 1) { $pc0 = 7; continue $sw0; }
                    r0.append("Unexpected token ");
                    r0.append(this.DW);
                    r2 = " at position ";
                    { $pc0 = 9; continue $sw0; }
                }
                case 7: {
                    if (r1 == 2) { $pc0 = 10; continue $sw0; }
                    r2 = "Unkown error at position ";
                    { $pc0 = 9; continue $sw0; }
                }
                case 10: {
                    r0.append("Unexpected exception at position ");
                    r0.append(this.FH);
                    r0.append(": ");
                    r0.append(this.DW);
                    { $pc0 = 14; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
