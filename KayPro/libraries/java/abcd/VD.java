package abcd;

public class VD {
    private boolean DW;
    private boolean FH;
    private boolean Hw;
    private java.lang.String j6;
    private abcd.OD v5;

    public VD(java.lang.String r1) {
        this.j6 = r1;
        this.DW = false;
        this.FH = false;
        this.Hw = false;
        this.v5 = null;
        DW();
    }

    private void DW() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6.length();
                    if (this.j6.startsWith("!") == false) { $pc0 = 5; continue $sw0; }
                    this.DW = true;
                    r1 = 1;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (this.j6.endsWith("/") == false) { $pc0 = 9; continue $sw0; }
                    r0 = r0 - 1;
                    this.Hw = true;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    this.j6 = this.j6.substring(r1, r0);
                    if (this.j6.contains("/") == true) { $pc0 = 13; continue $sw0; }
                    this.FH = true;
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (this.j6.contains("*") == false) { $pc0 = 18; continue $sw0; }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    try {
                        this.v5 = new abcd.OD(this.j6, '/');
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.bD) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 27: {
                    return;
                }
                case 18: {
                    if (this.j6.contains("?") == true) { $pc0 = 24; continue $sw0; }
                    if (this.j6.contains("[") == true) { $pc0 = 24; continue $sw0; }
                    return;
                }
                case 13: {
                    if (this.j6.startsWith("/") == true) { $pc0 = 16; continue $sw0; }
                    this.j6 = "/" + this.j6;
                    { $pc0 = 16; continue $sw0; }
                }
                case 5: {
                    r1 = 0;
                    { $pc0 = 7; continue $sw0; }
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(boolean r2, int r3, int r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 >= (r4 - 1)) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if (this.Hw == false) { $pc1 = 10; continue $sw1; }
                    if (r2 == true) { $pc1 = 10; continue $sw1; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        return !this.DW;
    }

    public boolean j6(java.lang.String r8, boolean r9) {
        abcd.OD r1 = null;
        java.lang.String[] r10 = null;
        int r0 = 0;
        java.lang.String r2 = null;
        int r3 = 0;
        java.lang.String r4 = null;
        java.lang.String[] r11 = null;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r8.startsWith("/") == true) { $pc2 = 5; continue $sw2; }
                    r8 = "/" + r8;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r1 = this.v5;
                    if (r1 == null) { $pc2 = 8; continue $sw2; }
                    r1.j6(r8);
                    if (this.v5.j6() == false) { $pc2 = 32; continue $sw2; }
                    return true;
                }
                case 32: {
                    r10 = r8.split("/");
                    if (this.FH == false) { $pc2 = 44; continue $sw2; }
                    r0 = 0;
                    $pc2 = 36; continue $sw2;
                }
                case 36: {
                    if (r0 >= r10.length) { $pc2 = 47; continue $sw2; }
                    r2 = r10[r0];
                    this.v5.DW();
                    this.v5.j6(r2);
                    if (this.v5.j6() == false) { $pc2 = 43; continue $sw2; }
                    if (j6(r9, r0, r10.length) == false) { $pc2 = 43; continue $sw2; }
                    return true;
                }
                case 43: {
                    r0 = r0 + 1;
                    $pc2 = 47; continue $sw2;
                }
                case 47: {
                    return false;
                }
                case 44: {
                    this.v5.DW();
                    r3 = 0;
                    $pc2 = 46; continue $sw2;
                }
                case 46: {
                    if (r3 >= r10.length) { $pc2 = 47; continue $sw2; }
                    r4 = r10[r3];
                    if (r4.length() <= 0) { $pc2 = 52; continue $sw2; }
                    this.v5.j6("/" + r4);
                    $pc2 = 52; continue $sw2;
                }
                case 52: {
                    if (this.v5.j6() == false) { $pc2 = 56; continue $sw2; }
                    if (j6(r9, r3, r10.length) == false) { $pc2 = 56; continue $sw2; }
                    return true;
                }
                case 56: {
                    r3 = r3 + 1;
                    { $pc2 = 46; continue $sw2; }
                }
                case 8: {
                    if (r8.equals(this.j6) == false) { $pc2 = 15; continue $sw2; }
                    if (this.Hw == false) { $pc2 = 13; continue $sw2; }
                    if (r9 == true) { $pc2 = 13; continue $sw2; }
                    return false;
                }
                case 13: {
                    return true;
                }
                case 15: {
                    if (r8.startsWith(java.lang.String.valueOf(this.j6) + "/") == false) { $pc2 = 18; continue $sw2; }
                    return true;
                }
                case 18: {
                    if (this.FH == false) { $pc2 = 47; continue $sw2; }
                    r11 = r8.split("/");
                    r5 = 0;
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (r5 >= r11.length) { $pc2 = 47; continue $sw2; }
                    if (r11[r5].equals(this.j6) == false) { $pc2 = 28; continue $sw2; }
                    if (j6(r9, r5, r11.length) == false) { $pc2 = 28; continue $sw2; }
                    return true;
                }
                case 28: {
                    r5 = r5 + 1;
                    { $pc2 = 21; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
