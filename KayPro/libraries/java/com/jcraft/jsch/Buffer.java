package com.jcraft.jsch;

public class Buffer {
    byte[] DW;
    int FH;
    int Hw;
    final byte[] j6;

    public Buffer() {
        this(20480);
    }

    public Buffer(int r2) {
        this.j6 = new byte[4];
        this.DW = new byte[r2];
        this.FH = 0;
        this.Hw = 0;
    }

    public Buffer(byte[] r2) {
        this.j6 = new byte[4];
        this.DW = r2;
        this.FH = 0;
        this.Hw = 0;
    }

    static com.jcraft.jsch.Buffer j6(byte[][] r4) {
        int r1 = 0;
        int r2 = 0;
        int r0 = 0;
        com.jcraft.jsch.Buffer r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = 0;
                    r2 = r4.length * 4;
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= r4.length) { $pc0 = 5; continue $sw0; }
                    r2 = r2 + r4[r0].length;
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    r3 = new com.jcraft.jsch.Buffer(r2);
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 >= r4.length) { $pc0 = 8; continue $sw0; }
                    r3.Hw(r4[r1]);
                    r1 = r1 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    byte DW() {
        return this.DW[5];
    }

    public int DW(int r2) {
        int r0 = this.Hw;
        this.Hw = r2 + r0;
        return r0;
    }

    public void DW(byte[] r3) {
        DW(r3, 0, r3.length);
    }

    public void DW(byte[] r3, int r4, int r5) {
        java.lang.System.arraycopy(r3, r4, this.DW, this.FH, r5);
        this.FH += r5;
    }

    public long EQ() {
        long r0 = ((((long) j6()) << 8) & 65280) | ((long) (j6() & 255));
        return ((r0 << 16) & (-65536)) | (((65280 & (((long) j6()) << 8)) | ((long) (j6() & 255))) & 65535);
    }

    public int FH() {
        return ((u7() << 16) & (-65536)) | (u7() & 65535);
    }

    public void FH(int r5) {
        byte[] r0 = this.j6;
        r0[0] = (byte) (r5 >>> 24);
        r0[1] = (byte) (r5 >>> 16);
        r0[2] = (byte) (r5 >>> 8);
        r0[3] = (byte) r5;
        java.lang.System.arraycopy(r0, 0, this.DW, this.FH, 4);
        this.FH += 4;
    }

    public void FH(byte[] r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r4.length;
                    if ((r4[0] & 128) == 0) { $pc1 = 5; continue $sw1; }
                    FH(r0 + 1);
                    j6((byte) 0);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    DW(r4);
                    return;
                }
                case 5: {
                    FH(r0);
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(byte[] r1, int r2, int r3) {
        FH(r3);
        DW(r1, r2, r3);
    }

    public int Hw() {
        return this.FH - this.Hw;
    }

    public void Hw(int r1) {
        this.Hw = r1;
    }

    public void Hw(byte[] r3) {
        FH(r3, 0, r3.length);
    }

    void J0() {
        this.Hw = 0;
    }

    public void J8() {
        int r0 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != 0) { $pc2 = 5; continue $sw2; }
                    return;
                }
                case 5: {
                    r1 = this.DW;
                    java.lang.System.arraycopy(r1, r0, r1, 0, this.FH - r0);
                    this.FH -= this.Hw;
                    this.Hw = 0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] VH() {
        int r0 = 0;
        byte[] r1 = null;
        byte[] r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = (FH() + 7) / 8;
                    r1 = new byte[r0];
                    j6(r1, 0, r0);
                    if ((r1[0] & 128) == 0) { $pc3 = 6; continue $sw3; }
                    r2 = new byte[r1.length + 1];
                    r2[0] = 0;
                    java.lang.System.arraycopy(r1, 0, r2, 1, r1.length);
                    return r2;
                }
                case 6: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] Zo() {
        int r0 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = FH();
                    if (r0 < 0) { $pc4 = 5; continue $sw4; }
                    if (r0 > 8192) { $pc4 = 5; continue $sw4; }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r1 = new byte[r0];
                    j6(r1, 0, r0);
                    return r1;
                }
                case 5: {
                    r0 = 8192;
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int gn() {
        return this.Hw;
    }

    public int j6() {
        byte[] r0 = this.DW;
        int r1 = this.Hw;
        this.Hw = r1 + 1;
        return r0[r1] & 255;
    }

    public void j6(byte r4) {
        byte[] r0 = this.DW;
        int r1 = this.FH;
        this.FH = r1 + 1;
        r0[r1] = r4;
    }

    void j6(int r4) {
        int r0 = 0;
        byte[] r5 = null;
        int r6 = 0;
        byte[] r7 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = (this.FH + r4) + 84;
                    r5 = this.DW;
                    if (r5.length >= r0) { $pc5 = 9; continue $sw5; }
                    r6 = r5.length * 2;
                    if (r6 >= r0) { $pc5 = 7; continue $sw5; }
                    r6 = r0;
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    r7 = new byte[r6];
                    java.lang.System.arraycopy(this.DW, 0, r7, 0, this.FH);
                    this.DW = r7;
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(long r11) {
        byte[] r0 = this.j6;
        r0[0] = (byte) (r11 >>> 56);
        r0[1] = (byte) (r11 >>> 48);
        r0[2] = (byte) (r11 >>> 40);
        r0[3] = (byte) (r11 >>> 32);
        java.lang.System.arraycopy(r0, 0, this.DW, this.FH, 4);
        byte[] r1 = this.j6;
        r1[0] = (byte) (r11 >>> 24);
        r1[1] = (byte) (r11 >>> 16);
        r1[2] = (byte) (r11 >>> 8);
        r1[3] = (byte) r11;
        java.lang.System.arraycopy(r1, 0, this.DW, this.FH + 4, 4);
        this.FH += 8;
    }

    public void j6(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    void j6(byte[] r3, int r4, int r5) {
        java.lang.System.arraycopy(this.DW, this.Hw, r3, r4, r5);
        this.Hw += r5;
    }

    byte[] j6(int[] r4, int[] r5) {
        int r0 = FH();
        r4[0] = DW(r0);
        r5[0] = r0;
        return this.DW;
    }

    byte[][] j6(int r5, java.lang.String r6) {
        byte[][] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new byte[r5][];
                    r1 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r1 >= r5) { $pc6 = 4; continue $sw6; }
                    r2 = FH();
                    if (Hw() < r2) { $pc6 = 9; continue $sw6; }
                    r0[r1] = new byte[r2];
                    j6(r0[r1]);
                    r1 = r1 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 9: {
                    throw new com.jcraft.jsch.JSchException(r6);
                }
                case 4: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] tp() {
        int r0 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = FH();
                    if (r0 < 0) { $pc7 = 5; continue $sw7; }
                    if (r0 > 262144) { $pc7 = 5; continue $sw7; }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    r1 = new byte[r0];
                    j6(r1, 0, r0);
                    return r1;
                }
                case 5: {
                    r0 = 262144;
                    { $pc7 = 6; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int u7() {
        return ((j6() << 8) & 65280) | (j6() & 255);
    }

    public long v5() {
        return ((((long) FH()) & 4294967295L) << 32) | (4294967295L & ((long) FH()));
    }

    void v5(int r2) {
        this.FH += r2;
    }

    public void we() {
        this.FH = 0;
        this.Hw = 0;
    }
}
