package abcd;

public class UK extends java.io.InputStream {
    private final byte[] DW;
    private final java.io.InputStream FH;
    private int Hw;
    private boolean VH;
    private boolean Zo;
    private final byte[] j6;
    private int v5;

    public UK(java.io.InputStream r2) {
        this.j6 = new byte[1];
        this.DW = new byte[8096];
        this.FH = r2;
    }

    private boolean j6() {
        java.io.InputStream r0 = null;
        byte[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH;
                    r1 = this.DW;
                    this.Hw = r0.read(r1, 0, r1.length);
                    r2 = this.Hw;
                    if (r2 >= 1) { $pc0 = 6; continue $sw0; }
                    return false;
                }
                case 6: {
                    if (this.VH == true) { $pc0 = 8; continue $sw0; }
                    this.Zo = abcd.tC.j6(this.DW, r2);
                    this.VH = true;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.v5 = 0;
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
        this.FH.close();
    }

    @Override
    public int read() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (read(this.j6, 0, 1) == 1) { $pc1 = 7; continue $sw1; }
                    return -1;
                }
                case 7: {
                    return this.j6[0] & 255;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r7, int r8, int r9) {
        int r10 = 0;
        int r0 = 0;
        byte[] r2 = null;
        int r3 = 0;
        byte r4 = 0;
        byte[] r5 = null;
        int r6 = 0;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r9 != 0) { $pc2 = 6; continue $sw2; }
                    return 0;
                }
                case 6: {
                    if (this.Hw != (-1)) { $pc2 = 8; continue $sw2; }
                    return -1;
                }
                case 8: {
                    r10 = r9 + r8;
                    r0 = r8;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r0 >= r10) { $pc2 = 15; continue $sw2; }
                    if (this.v5 == this.Hw) { $pc2 = 14; continue $sw2; }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r2 = this.DW;
                    r3 = this.v5;
                    this.v5 = r3 + 1;
                    r4 = r2[r3];
                    if (this.Zo == true) { $pc2 = 35; continue $sw2; }
                    if (r4 != 13) { $pc2 = 35; continue $sw2; }
                    if (this.v5 == this.Hw) { $pc2 = 24; continue $sw2; }
                    $pc2 = 30; continue $sw2;
                }
                case 30: {
                    r5 = this.DW;
                    r6 = this.v5;
                    if (r5[r6] != 10) { $pc2 = 33; continue $sw2; }
                    r11 = r0 + 1;
                    r7[r0] = 10;
                    this.v5 = r6 + 1;
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    r0 = r11;
                    { $pc2 = 9; continue $sw2; }
                }
                case 33: {
                    r11 = r0 + 1;
                    r7[r0] = 13;
                    { $pc2 = 34; continue $sw2; }
                }
                case 24: {
                    if (j6() == true) { $pc2 = 30; continue $sw2; }
                    r12 = r0 + 1;
                    r7[r0] = 13;
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    if (r8 != r12) { $pc2 = 29; continue $sw2; }
                    return -1;
                }
                case 29: {
                    return r12 - r8;
                }
                case 35: {
                    r7[r0] = r4;
                    r0 = r0 + 1;
                    { $pc2 = 9; continue $sw2; }
                }
                case 14: {
                    if (j6() == true) { $pc2 = 16; continue $sw2; }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r12 = r0;
                    { $pc2 = 26; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
