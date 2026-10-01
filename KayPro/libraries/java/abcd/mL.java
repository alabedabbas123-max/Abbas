package abcd;

public class mL {
    public java.lang.Object DW;
    public int j6;

    public mL(int r2, java.lang.Object r3) {
        this.j6 = 0;
        this.DW = null;
        this.j6 = r2;
        this.DW = r3;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuffer();
                    switch(this.j6) {
                        case -1: { $pc0 = 12; continue $sw0; }
                        case 0: { $pc0 = 11; continue $sw0; }
                        case 1: { $pc0 = 10; continue $sw0; }
                        case 2: { $pc0 = 9; continue $sw0; }
                        case 3: { $pc0 = 8; continue $sw0; }
                        case 4: { $pc0 = 7; continue $sw0; }
                        case 5: { $pc0 = 6; continue $sw0; }
                        case 6: { $pc0 = 5; continue $sw0; }
                        default: { $pc0 = 15; continue $sw0; }
                    };
                }
                case 5: {
                    r1 = "COLON(:)";
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r0.append(r1);
                    { $pc0 = 15; continue $sw0; }
                }
                case 6: {
                    r1 = "COMMA(,)";
                    { $pc0 = 13; continue $sw0; }
                }
                case 7: {
                    r1 = "RIGHT SQUARE(])";
                    { $pc0 = 13; continue $sw0; }
                }
                case 8: {
                    r1 = "LEFT SQUARE([)";
                    { $pc0 = 13; continue $sw0; }
                }
                case 9: {
                    r1 = "RIGHT BRACE(})";
                    { $pc0 = 13; continue $sw0; }
                }
                case 10: {
                    r1 = "LEFT BRACE({)";
                    { $pc0 = 13; continue $sw0; }
                }
                case 11: {
                    r0.append("VALUE(");
                    r0.append(this.DW);
                    r1 = ")";
                    { $pc0 = 13; continue $sw0; }
                }
                case 12: {
                    r1 = "END OF FILE";
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
