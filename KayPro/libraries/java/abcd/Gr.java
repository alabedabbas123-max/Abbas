package abcd;

public class Gr {
    private byte[] DW;
    private int FH;
    private java.lang.StringBuffer Hw;
    private abcd.Dr j6;
    private java.lang.StringBuffer v5;

    public Gr() {
        this.j6 = new abcd.Dr();
        this.DW = new byte[8192];
        this.Hw = new java.lang.StringBuffer();
        this.v5 = new java.lang.StringBuffer();
    }

    private int j6(byte[] r6, int r7, int r8, int r9) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        byte[] r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r8 == 0) { $pc0 = 18; continue $sw0; }
                    r0 = this.DW;
                    this.j6.DW.j6(r9);
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (this.j6.DW.j6() == false) { $pc0 = 15; continue $sw0; }
                    r1 = this.j6.DW.Hw();
                    if ((r1 + r8) > this.FH) { $pc0 = 5; continue $sw0; }
                    r2 = 0;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r2 >= r8) { $pc0 = 14; continue $sw0; }
                    if (r0[r1 + r2] != r6[r7 + r2]) { $pc0 = 5; continue $sw0; }
                    r2 = r2 + 1;
                    { $pc0 = 9; continue $sw0; }
                }
                case 14: {
                    return r1;
                }
                case 15: {
                    j6(this.FH + r8);
                    r3 = this.DW;
                    r4 = this.FH;
                    java.lang.System.arraycopy(r6, r7, r3, r4, r8);
                    this.FH += r8;
                    this.j6.j6(r9, r4);
                    return r4;
                }
                case 18: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r4) {
        byte[] r0 = null;
        int r1 = 0;
        byte[] r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW;
                    if (r0.length >= r4) { $pc1 = 12; continue $sw1; }
                    r1 = r0.length;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r1 = r1 * 2;
                    if (r1 < r4) { $pc1 = 5; continue $sw1; }
                    r5 = new byte[r1];
                    java.lang.System.arraycopy(this.DW, 0, r5, 0, this.FH);
                    this.DW = r5;
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r6, java.lang.StringBuffer r7) {
        byte[] r0 = null;
        int r1 = 0;
        int r8 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r6 >= r0.length) { $pc2 = 23; continue $sw2; }
                    r1 = r6 + 1;
                    r8 = r0[r6] & 255;
                    if (r8 == 0) { $pc2 = 36; continue $sw2; }
                    switch((r8 >> 4)) {
                        case 0: { $pc2 = 22; continue $sw2; }
                        case 1: { $pc2 = 22; continue $sw2; }
                        case 2: { $pc2 = 22; continue $sw2; }
                        case 3: { $pc2 = 22; continue $sw2; }
                        case 4: { $pc2 = 22; continue $sw2; }
                        case 5: { $pc2 = 22; continue $sw2; }
                        case 6: { $pc2 = 22; continue $sw2; }
                        case 7: { $pc2 = 22; continue $sw2; }
                        case 8: { $pc2 = 11; continue $sw2; }
                        case 9: { $pc2 = 11; continue $sw2; }
                        case 10: { $pc2 = 11; continue $sw2; }
                        case 11: { $pc2 = 11; continue $sw2; }
                        case 12: { $pc2 = 18; continue $sw2; }
                        case 13: { $pc2 = 18; continue $sw2; }
                        case 14: { $pc2 = 12; continue $sw2; }
                        default: { $pc2 = 11; continue $sw2; }
                    };
                }
                case 11: {
                    throw new java.lang.RuntimeException(new java.io.UTFDataFormatException("Malformed input"));
                }
                case 18: {
                    if (r1 >= r0.length) { $pc2 = 21; continue $sw2; }
                    r2 = r1 + 1;
                    r7.append((char) (((r8 & 31) << 6) | ((r0[r1] & 255) & 63)));
                    r6 = r2;
                    { $pc2 = 4; continue $sw2; }
                }
                case 21: {
                    throw new java.lang.RuntimeException(new java.io.UTFDataFormatException("End index not on boundary"));
                }
                case 22: {
                    r7.append((char) r8);
                    r6 = r1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 12: {
                    r3 = r1 + 1;
                    if (r3 >= r0.length) { $pc2 = 16; continue $sw2; }
                    r4 = r0[r1] & 255;
                    r5 = r3 + 1;
                    r7.append((char) ((((r8 & 15) << 12) | ((r4 & 63) << 6)) | (((r0[r3] & 255) & 63) << 0)));
                    r6 = r5;
                    { $pc2 = 4; continue $sw2; }
                }
                case 16: {
                    throw new java.lang.RuntimeException(new java.io.UTFDataFormatException("End index not on boundary"));
                }
                case 36: {
                    return;
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.j6.FH();
    }

    public int FH() {
        return this.FH;
    }

    public int j6(int r13, int r14) {
        byte[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r15 = 0;
        boolean r5 = false;
        int r16 = 0;
        int r17 = 0;
        int r8 = 0;
        int r9 = 0;
        int r18 = 0;
        int r19 = 0;
        int r110 = 0;
        int r111 = 0;
        int r6 = 0;
        int r7 = 0;
        int r10 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW;
                    r2 = 0;
                    r3 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    r4 = r13 + 1;
                    r15 = r0[r13] & 255;
                    r2 = r2 | ((r15 & 127) << (r3 * 7));
                    r5 = true;
                    r3 = r3 + 1;
                    r16 = r15 & 128;
                    if (r16 != 128) { $pc3 = 9; continue $sw3; }
                    if (r3 >= 5) { $pc3 = 9; continue $sw3; }
                    r13 = r4;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (r16 == 128) { $pc3 = 36; continue $sw3; }
                    r17 = 0;
                    r8 = 0;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r9 = r14 + 1;
                    r18 = r0[r14] & 255;
                    r17 = r17 | ((r18 & 127) << (r8 * 7));
                    r8 = r8 + 1;
                    r19 = r18 & 128;
                    if (r19 != 128) { $pc3 = 16; continue $sw3; }
                    if (r8 >= 5) { $pc3 = 16; continue $sw3; }
                    r14 = r9;
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    if (r19 == 128) { $pc3 = 34; continue $sw3; }
                    r110 = java.lang.Math.min(r2 + 1, r17 + 1);
                    r111 = 0;
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    if (r111 >= r110) { $pc3 = 28; continue $sw3; }
                    r6 = r0[r4 + r111] & 255;
                    r7 = r0[r9 + r111] & 255;
                    if ((r6 & 128) != 0) { $pc3 = 29; continue $sw3; }
                    if ((r7 & 128) != 0) { $pc3 = 29; continue $sw3; }
                    r10 = r6 - r7;
                    if (r10 != 0) { $pc3 = 26; continue $sw3; }
                    r111 = r111 + 1;
                    { $pc3 = 18; continue $sw3; }
                }
                case 26: {
                    return r10;
                }
                case 29: {
                    if (r5 == true) { $pc3 = 31; continue $sw3; }
                    return 0;
                }
                case 31: {
                    this.Hw.setLength(0);
                    j6(r4, this.Hw);
                    this.v5.setLength(0);
                    j6(r9, this.v5);
                    return j6(this.Hw.toString(), this.v5.toString());
                }
                case 28: {
                    r5 = false;
                    { $pc3 = 29; continue $sw3; }
                }
                case 34: {
                    throw new abcd.Ut("invalid LEB128 sequence");
                }
                case 36: {
                    throw new abcd.Ut("invalid LEB128 sequence");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(java.lang.String r7, java.lang.String r8) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        char r4 = 0;
        char r5 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r7.length();
                    r1 = r8.length();
                    r2 = java.lang.Math.min(r0, r1);
                    r3 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r3 >= r2) { $pc4 = 10; continue $sw4; }
                    r4 = r7.charAt(r3);
                    r5 = r8.charAt(r3);
                    if (r4 != r5) { $pc4 = 7; continue $sw4; }
                    r3 = r3 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 7: {
                    return r4 - r5;
                }
                case 10: {
                    return r0 - r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(byte[] r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        byte r7 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r6;
                    r1 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    r2 = r0 + 1;
                    r3 = r5[r0] & 255;
                    r1 = (r1 * 37) + r3;
                    if ((r3 & 128) != 128) { $pc5 = 5; continue $sw5; }
                    r0 = r2;
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r4 = r2 + 1;
                    r7 = r5[r2];
                    if (r7 == 0) { $pc5 = 9; continue $sw5; }
                    r1 = (r1 * 37) + r7;
                    r2 = r4;
                    { $pc5 = 5; continue $sw5; }
                }
                case 9: {
                    return j6(r5, r6, r4 - r6, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] j6() {
        return this.DW;
    }
}
