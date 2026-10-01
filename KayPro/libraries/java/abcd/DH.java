package abcd;

public class DH {
    private final byte[] DW;
    private final int FH;
    private int Hw;
    private final java.io.OutputStream j6;

    public DH(java.io.OutputStream r2, long r3, long r5, int r7) {
        this.DW = new byte[32];
        this.j6 = r2;
        this.FH = r7;
        j6(r3);
        j6(r5);
    }

    private int j6(int r12, long r13, int r15) {
        int r0 = 0;
        long r3 = 0L;
        int r7 = 0;
        int r14 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r12 + 1;
                    r3 = r13 & 255;
                    if (r3 == 0) { $pc0 = 5; continue $sw0; }
                    r7 = 129;
                    this.DW[r0] = (byte) r3;
                    r0 = r0 + 1;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if ((65280 & r13) == 0) { $pc0 = 10; continue $sw0; }
                    r7 = r7 | 2;
                    this.DW[r0] = (byte) ((r13 >>> 8) & 255);
                    r0 = r0 + 1;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if ((16711680 & r13) == 0) { $pc0 = 13; continue $sw0; }
                    r7 = r7 | 4;
                    this.DW[r0] = (byte) ((r13 >>> 16) & 255);
                    r0 = r0 + 1;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    if (((-16777216) & r13) == 0) { $pc0 = 16; continue $sw0; }
                    r7 = r7 | 8;
                    this.DW[r0] = (byte) ((r13 >>> 24) & 255);
                    r0 = r0 + 1;
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (r15 == 65536) { $pc0 = 26; continue $sw0; }
                    r14 = r15 & 255;
                    if (r14 == 0) { $pc0 = 21; continue $sw0; }
                    r7 = r7 | 16;
                    this.DW[r0] = (byte) r14;
                    r0 = r0 + 1;
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    if ((65280 & r15) == 0) { $pc0 = 24; continue $sw0; }
                    this.DW[r0] = (byte) ((r15 >>> 8) & 255);
                    r7 = r7 | 32;
                    r0 = r0 + 1;
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    if ((16711680 & r15) == 0) { $pc0 = 26; continue $sw0; }
                    r7 = r7 | 64;
                    this.DW[r0] = (byte) ((r15 >>> 16) & 255);
                    r0 = r0 + 1;
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    this.DW[r12] = (byte) r7;
                    return r0;
                }
                case 5: {
                    r7 = 128;
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(long r6) {
        int r1 = 0;
        int r3 = 0;
        int r7 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r6 < 128) { $pc1 = 5; continue $sw1; }
                    this.DW[r1] = (byte) ((((int) r6) & 127) | 128);
                    r6 = r6 >>> 7;
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    r3 = r1 + 1;
                    this.DW[r1] = (byte) (((int) r6) & 127);
                    this.Hw += r3;
                    r7 = this.FH;
                    if (r7 > 0) { $pc1 = 8; continue $sw1; }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    this.j6.write(this.DW, 0, r3);
                    return;
                }
                case 8: {
                    if (this.Hw < r7) { $pc1 = 9; continue $sw1; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(long r7, int r9) {
        long r2 = 0L;
        int r8 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r9 != 0) { $pc2 = 5; continue $sw2; }
                    return true;
                }
                case 5: {
                    r2 = r7;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r8 = 0;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (65536 >= r9) { $pc2 = 9; continue $sw2; }
                    r8 = j6(r8, r2, 65536);
                    r2 = r2 + 65536;
                    r9 = r9 - 65536;
                    if (this.DW.length >= (r8 + 8)) { $pc2 = 8; continue $sw2; }
                    r10 = this.FH;
                    if (r10 <= 0) { $pc2 = 23; continue $sw2; }
                    if (r10 >= (this.Hw + r8)) { $pc2 = 23; continue $sw2; }
                    return false;
                }
                case 23: {
                    this.j6.write(this.DW, 0, r8);
                    this.Hw += r8;
                    { $pc2 = 6; continue $sw2; }
                }
                case 9: {
                    r11 = j6(r8, r2, r9);
                    r12 = this.FH;
                    if (r12 > 0) { $pc2 = 12; continue $sw2; }
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    this.j6.write(this.DW, 0, r11);
                    this.Hw += r11;
                    return true;
                }
                case 12: {
                    if (r12 >= (this.Hw + r11)) { $pc2 = 14; continue $sw2; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(byte[] r3) {
        return j6(r3, 0, r3.length);
    }

    public boolean j6(byte[] r5, int r6, int r7) {
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r7 > 0) { $pc3 = 6; continue $sw3; }
                    return true;
                }
                case 6: {
                    if (this.FH <= 0) { $pc3 = 14; continue $sw3; }
                    r1 = r7 / 127;
                    if ((r7 % 127) == 0) { $pc3 = 11; continue $sw3; }
                    r1 = r1 + 1;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (this.FH >= ((this.Hw + r1) + r7)) { $pc3 = 14; continue $sw3; }
                    return false;
                }
                case 14: {
                    r2 = java.lang.Math.min(127, r7);
                    this.j6.write((byte) r2);
                    this.j6.write(r5, r6, r2);
                    r6 = r6 + r2;
                    r7 = r7 - r2;
                    this.Hw += r2 + 1;
                    if (r7 > 0) { $pc3 = 14; continue $sw3; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
