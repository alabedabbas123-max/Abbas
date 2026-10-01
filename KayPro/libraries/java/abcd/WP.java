package abcd;

public class WP implements abcd.UP {
    protected final byte[] DW;
    protected final byte[] j6;

    public WP() {
        this.j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.DW = new byte[128];
        j6();
    }

    private boolean j6(char r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != '\n') { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    if (r2 != '\r') { $pc0 = 7; continue $sw0; }
                    return true;
                }
                case 7: {
                    if (r2 != '\t') { $pc0 = 9; continue $sw0; }
                    return true;
                }
                case 9: {
                    if (r2 == ' ') { $pc0 = 16; continue $sw0; }
                    return false;
                }
                case 16: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6(java.lang.String r7, java.io.OutputStream r8) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        byte r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r7.length();
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 <= 0) { $pc1 = 7; continue $sw1; }
                    if (j6(r7.charAt(r0 - 1)) == false) { $pc1 = 7; continue $sw1; }
                    r0 = r0 - 1;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r1 = 0;
                    r2 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r1 >= r0) { $pc1 = 9; continue $sw1; }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r1 >= r0) { $pc1 = 15; continue $sw1; }
                    if (j6(r7.charAt(r1)) == false) { $pc1 = 15; continue $sw1; }
                    r1 = r1 + 1;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    r4 = r1 + 1;
                    r3 = this.DW[r7.charAt(r1)];
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r4 >= r0) { $pc1 = 21; continue $sw1; }
                    if (j6(r7.charAt(r4)) == false) { $pc1 = 21; continue $sw1; }
                    r4 = r4 + 1;
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    r8.write((r3 << 4) | this.DW[r7.charAt(r4)]);
                    r2 = r2 + 1;
                    r1 = r4 + 1;
                    { $pc1 = 8; continue $sw1; }
                }
                case 9: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6(byte[] r5, int r6, int r7, java.io.OutputStream r8) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r6;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0 >= (r6 + r7)) { $pc2 = 6; continue $sw2; }
                    r1 = r5[r0] & 255;
                    r8.write(this.j6[r1 >>> 4]);
                    r8.write(this.j6[r1 & 15]);
                    r0 = r0 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return r7 * 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6() {
        int r0 = 0;
        byte[] r1 = null;
        byte[] r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    r1 = this.j6;
                    if (r0 >= r1.length) { $pc3 = 5; continue $sw3; }
                    this.DW[r1[r0]] = (byte) r0;
                    r0 = r0 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    r2 = this.DW;
                    r2[65] = r2[97];
                    r2[66] = r2[98];
                    r2[67] = r2[99];
                    r2[68] = r2[100];
                    r2[69] = r2[101];
                    r2[70] = r2[102];
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
