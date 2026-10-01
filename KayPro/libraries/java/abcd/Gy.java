package abcd;

public final class Gy implements java.lang.Cloneable {
    private static final java.lang.String[] DW = null;
    private static final abcd.Gy.a[] j6 = null;
    int BT;
    byte EQ;
    abcd.Oy FH;
    int Hw;
    short[] I;
    int J0;
    int J8;
    int KD;
    int Mr;
    short[] Mz;
    int OW;
    int P8;
    byte[] QX;
    int Qq;
    int SI;
    abcd.Ny Sf;
    int U2;
    int VH;
    int Ws;
    int XG;
    int XL;
    int XX;
    int Zo;
    int a8;
    short[] aM;
    byte[] aj;
    int br;
    int[] ca;
    int cb;
    int cn;
    short[] dx;
    short[] ef;
    int ei;
    int er;
    abcd.Hy et;
    abcd.Ny g3;
    int gW;
    int gn;
    short[] j3;
    short jJ;
    int kQ;
    int lg;
    int lp;
    int nw;
    int rN;
    int ro;
    short[] sG;
    int sh;
    byte[] sy;
    byte tp;
    int u7;
    byte[] v5;
    abcd.Ny vJ;
    int vy;
    int wc;
    int we;
    int x9;
    int yO;
    int yS;

    static class a {
        int DW;
        int FH;
        int Hw;
        int j6;
        int v5;

        a(int r1, int r2, int r3, int r4, int r5) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
            this.v5 = r5;
        }
    }

    static {
        j6 = new abcd.Gy.a[10];
        j6[0] = new abcd.Gy.a(0, 0, 0, 0, 0);
        j6[1] = new abcd.Gy.a(4, 4, 8, 4, 1);
        j6[2] = new abcd.Gy.a(4, 5, 16, 8, 1);
        j6[3] = new abcd.Gy.a(4, 6, 32, 32, 1);
        j6[4] = new abcd.Gy.a(4, 4, 16, 16, 2);
        j6[5] = new abcd.Gy.a(8, 16, 32, 32, 2);
        j6[6] = new abcd.Gy.a(8, 16, 128, 128, 2);
        j6[7] = new abcd.Gy.a(8, 32, 128, 256, 2);
        j6[8] = new abcd.Gy.a(32, 128, 258, 1024, 2);
        j6[9] = new abcd.Gy.a(32, 258, 258, 4096, 2);
        DW = new java.lang.String[]{"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};
    }

    Gy(abcd.Oy r3) {
        this.u7 = 1;
        this.Sf = new abcd.Ny();
        this.vJ = new abcd.Ny();
        this.g3 = new abcd.Ny();
        this.Mz = new short[16];
        this.I = new short[16];
        this.ca = new int[573];
        this.sy = new byte[573];
        this.et = null;
        this.FH = r3;
        this.dx = new short[1146];
        this.sG = new short[122];
        this.ef = new short[78];
    }

    private int j6(int r8, int r9, int r10, int r11, int r12) {
        int r4 = 0;
        int r13 = 0;
        int r1 = 0;
        int r2 = 0;
        int r14 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH.u7 = null;
                    if (r8 != (-1)) { $pc0 = 6; continue $sw0; }
                    r8 = 6;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r10 >= 0) { $pc0 = 8; continue $sw0; }
                    r4 = 0;
                    r10 = -r10;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r11 >= 1) { $pc0 = 13; continue $sw0; }
                    return -2;
                }
                case 13: {
                    if (r11 <= 9) { $pc0 = 15; continue $sw0; }
                    return -2;
                }
                case 15: {
                    if (r9 != 8) { $pc0 = 28; continue $sw0; }
                    if (r10 < 9) { $pc0 = 29; continue $sw0; }
                    if (r10 > 15) { $pc0 = 30; continue $sw0; }
                    if (r8 < 0) { $pc0 = 31; continue $sw0; }
                    if (r8 > 9) { $pc0 = 32; continue $sw0; }
                    if (r12 < 0) { $pc0 = 33; continue $sw0; }
                    if (r12 > 2) { $pc0 = 34; continue $sw0; }
                    this.FH.tp = this;
                    this.u7 = r4;
                    this.J8 = r10;
                    this.J0 = 1 << this.J8;
                    r13 = this.J0;
                    this.Ws = r13 - 1;
                    this.a8 = r11 + 7;
                    r1 = this.a8;
                    this.U2 = 1 << r1;
                    r2 = this.U2;
                    this.lg = r2 - 1;
                    this.rN = ((r1 + 3) - 1) / 3;
                    this.QX = new byte[r13 * 2];
                    this.aM = new short[r13];
                    this.j3 = new short[r2];
                    this.lp = 1 << (r11 + 6);
                    r14 = this.lp;
                    this.v5 = new byte[r14 * 3];
                    this.Zo = r14 * 3;
                    this.br = r14;
                    this.aj = new byte[r14];
                    this.ro = r8;
                    this.cn = r12;
                    this.EQ = (byte) r9;
                    return gn();
                }
                case 34: {
                    return -2;
                }
                case 33: {
                    return -2;
                }
                case 32: {
                    return -2;
                }
                case 31: {
                    return -2;
                }
                case 30: {
                    return -2;
                }
                case 29: {
                    return -2;
                }
                case 28: {
                    return -2;
                }
                case 8: {
                    if (r10 <= 15) { $pc0 = 10; continue $sw0; }
                    r10 = r10 - 16;
                    this.FH.J0 = new abcd.Ey();
                    r4 = 2;
                    { $pc0 = 11; continue $sw0; }
                }
                case 10: {
                    r4 = 1;
                    { $pc0 = 11; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(short[] r2, int r3, int r4, byte[] r5) {
        short r0 = 0;
        short r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r2[r3 * 2];
                    r6 = r2[r4 * 2];
                    if (r0 < r6) { $pc1 = 9; continue $sw1; }
                    if (r0 == r6) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    if (r5[r3] <= r5[r4]) { $pc1 = 12; continue $sw1; }
                    return false;
                }
                case 12: {
                    return true;
                }
                case 9: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(byte[] r4) {
        byte[] r0 = new byte[r4.length];
        java.lang.System.arraycopy(r4, 0, r0, 0, r0.length);
        return r0;
    }

    private int[] j6(int[] r4) {
        int[] r0 = new int[r4.length];
        java.lang.System.arraycopy(r4, 0, r0, 0, r0.length);
        return r0;
    }

    private short[] j6(short[] r4) {
        short[] r0 = new short[r4.length];
        java.lang.System.arraycopy(r4, 0, r0, 0, r0.length);
        return r0;
    }

    int DW(int r14) {
        int r1 = 0;
        boolean r2 = false;
        int r3 = 0;
        byte[] r4 = null;
        int r8 = 0;
        short[] r5 = null;
        int r6 = 0;
        int r9 = 0;
        int r7 = 0;
        boolean r10 = false;
        int r11 = 0;
        int r12 = 0;
        byte[] r13 = null;
        int r15 = 0;
        int r16 = 0;
        byte[] r17 = null;
        int r18 = 0;
        short[] r19 = null;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (this.ei >= 262) { $pc2 = 25; continue $sw2; }
                    u7();
                    if (this.ei >= 262) { $pc2 = 10; continue $sw2; }
                    if (r14 != 0) { $pc2 = 10; continue $sw2; }
                    return 0;
                }
                case 10: {
                    if (this.ei != 0) { $pc2 = 25; continue $sw2; }
                    if (r14 != 4) { $pc2 = 14; continue $sw2; }
                    r2 = true;
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    j6(r2);
                    if (this.FH.VH != 0) { $pc2 = 20; continue $sw2; }
                    if (r14 != 4) { $pc2 = 19; continue $sw2; }
                    return 2;
                }
                case 19: {
                    return 0;
                }
                case 20: {
                    if (r14 == 4) { $pc2 = 59; continue $sw2; }
                    return 1;
                }
                case 59: {
                    return 3;
                }
                case 14: {
                    r2 = false;
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    if (this.ei < 3) { $pc2 = 28; continue $sw2; }
                    r3 = this.Mr << this.rN;
                    r4 = this.QX;
                    r8 = this.vy;
                    this.Mr = (r3 ^ (r4[r8 + 2] & 255)) & this.lg;
                    r5 = this.j3;
                    r6 = this.Mr;
                    r9 = r5[r6] & 65535;
                    this.aM[this.Ws & r8] = r5[r6];
                    r5[r6] = (short) r8;
                    r1 = r9;
                    $pc2 = 28; continue $sw2;
                }
                case 28: {
                    if (r1 != 0) { $pc2 = 30; continue $sw2; }
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    r7 = this.yS;
                    if (r7 < 3) { $pc2 = 45; continue $sw2; }
                    r10 = j6(this.vy - this.P8, r7 - 3);
                    r11 = this.ei;
                    r12 = this.yS;
                    this.ei = r11 - r12;
                    if (r12 <= this.KD) { $pc2 = 39; continue $sw2; }
                    $pc2 = 44; continue $sw2;
                }
                case 44: {
                    this.vy += this.yS;
                    this.yS = 0;
                    r13 = this.QX;
                    r15 = this.vy;
                    this.Mr = r13[r15] & 255;
                    this.Mr = ((r13[r15 + 1] & 255) ^ (this.Mr << this.rN)) & this.lg;
                    $pc2 = 46; continue $sw2;
                }
                case 46: {
                    if (r10 == false) { $pc2 = 4; continue $sw2; }
                    j6(false);
                    if (this.FH.VH != 0) { $pc2 = 4; continue $sw2; }
                    return 0;
                }
                case 39: {
                    if (this.ei < 3) { $pc2 = 44; continue $sw2; }
                    this.yS = r12 - 1;
                    $pc2 = 41; continue $sw2;
                }
                case 41: {
                    this.vy++;
                    r16 = this.Mr << this.rN;
                    r17 = this.QX;
                    r18 = this.vy;
                    this.Mr = (r16 ^ (r17[r18 + 2] & 255)) & this.lg;
                    r19 = this.j3;
                    r20 = this.Mr;
                    r21 = r19[r20] & 65535;
                    this.aM[this.Ws & r18] = r19[r20];
                    r19[r20] = (short) r18;
                    r22 = this.yS - 1;
                    this.yS = r22;
                    if (r22 != 0) { $pc2 = 41; continue $sw2; }
                    this.vy = r18 + 1;
                    r1 = r21;
                    { $pc2 = 46; continue $sw2; }
                }
                case 45: {
                    r10 = j6(0, this.QX[this.vy] & 255);
                    this.ei--;
                    this.vy++;
                    { $pc2 = 46; continue $sw2; }
                }
                case 30: {
                    if (((this.vy - r1) & 65535) > (this.J0 - 262)) { $pc2 = 34; continue $sw2; }
                    if (this.cn == 2) { $pc2 = 34; continue $sw2; }
                    this.yS = v5(r1);
                    { $pc2 = 34; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int DW(int r7, int r8) {
        return j6(r7, 8, r8, 8, 0);
    }

    void DW() {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.wc;
                    if (r0 != 16) { $pc3 = 6; continue $sw3; }
                    VH(this.jJ);
                    this.jJ = 0;
                    this.wc = 0;
                    return;
                }
                case 6: {
                    if (r0 < 8) { $pc3 = 10; continue $sw3; }
                    j6((byte) this.jJ);
                    this.jJ = (short) (this.jJ >>> 8);
                    this.wc -= 8;
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void DW(int r2, int r3, boolean r4) {
        FH((r4 ? 1 : 0) + 0, 3);
        FH(r2, r3, true);
    }

    void DW(short[] r14, int r15) {
        short r1 = 0;
        int r6 = 0;
        int r7 = 0;
        int r9 = 0;
        int r10 = 0;
        int r8 = 0;
        short r11 = 0;
        int r2 = 0;
        short r12 = 0;
        short[] r13 = null;
        int r16 = 0;
        short[] r17 = null;
        int r18 = 0;
        short[] r19 = null;
        short[] r20 = null;
        short[] r21 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = r14[1];
                    if (r1 != 0) { $pc4 = 5; continue $sw4; }
                    r6 = 138;
                    r7 = 3;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r14[((r15 + 1) * 2) + 1] = -1;
                    r9 = r6;
                    r10 = r7;
                    r8 = 0;
                    r11 = -1;
                    r11 = r1;
                    r2 = 0;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r2 > r15) { $pc4 = 8; continue $sw4; }
                    r2 = r2 + 1;
                    r12 = r14[(r2 * 2) + 1];
                    r8 = r8 + 1;
                    if (r8 >= r9) { $pc4 = 13; continue $sw4; }
                    if (r11 != r12) { $pc4 = 13; continue $sw4; }
                    $pc4 = 29; continue $sw4;
                }
                case 29: {
                    r11 = r12;
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    if (r8 >= r10) { $pc4 = 15; continue $sw4; }
                    r13 = this.ef;
                    r16 = r11 * 2;
                    r13[r16] = (short) (r13[r16] + r8);
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    if (r12 != 0) { $pc4 = 26; continue $sw4; }
                    r8 = 0;
                    r9 = 138;
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    r10 = 3;
                    { $pc4 = 29; continue $sw4; }
                }
                case 26: {
                    if (r11 != r12) { $pc4 = 28; continue $sw4; }
                    r8 = 0;
                    r9 = 6;
                    { $pc4 = 25; continue $sw4; }
                }
                case 28: {
                    r11 = r11;
                    r8 = 0;
                    r9 = 7;
                    r10 = 4;
                    { $pc4 = 29; continue $sw4; }
                }
                case 15: {
                    if (r11 == 0) { $pc4 = 20; continue $sw4; }
                    if (r11 == r11) { $pc4 = 18; continue $sw4; }
                    r17 = this.ef;
                    r18 = r11 * 2;
                    r17[r18] = (short) (r17[r18] + 1);
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    r19 = this.ef;
                    r19[32] = (short) (r19[32] + 1);
                    { $pc4 = 23; continue $sw4; }
                }
                case 20: {
                    if (r8 > 10) { $pc4 = 22; continue $sw4; }
                    r20 = this.ef;
                    r20[34] = (short) (r20[34] + 1);
                    { $pc4 = 23; continue $sw4; }
                }
                case 22: {
                    r21 = this.ef;
                    r21[36] = (short) (r21[36] + 1);
                    { $pc4 = 23; continue $sw4; }
                }
                case 8: {
                    return;
                }
                case 5: {
                    r6 = 7;
                    r7 = 4;
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void EQ() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r1 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r1 >= 286) { $pc5 = 5; continue $sw5; }
                    this.dx[r1 * 2] = 0;
                    r1 = r1 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 5: {
                    r2 = 0;
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (r2 >= 30) { $pc5 = 8; continue $sw5; }
                    this.sG[r2 * 2] = 0;
                    r2 = r2 + 1;
                    { $pc5 = 7; continue $sw5; }
                }
                case 8: {
                    r3 = 0;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r3 >= 19) { $pc5 = 11; continue $sw5; }
                    this.ef[r3 * 2] = 0;
                    r3 = r3 + 1;
                    { $pc5 = 10; continue $sw5; }
                }
                case 11: {
                    this.dx[512] = 1;
                    this.kQ = 0;
                    this.XX = 0;
                    this.yO = 0;
                    this.OW = 0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int FH(int r14) {
        int r1 = 0;
        boolean r2 = false;
        int r3 = 0;
        byte[] r4 = null;
        int r8 = 0;
        short[] r5 = null;
        int r6 = 0;
        int r9 = 0;
        int r7 = 0;
        int r10 = 0;
        int r11 = 0;
        boolean r12 = false;
        int r13 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        byte[] r18 = null;
        int r19 = 0;
        short[] r20 = null;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r1 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (this.ei >= 262) { $pc6 = 28; continue $sw6; }
                    u7();
                    if (this.ei >= 262) { $pc6 = 10; continue $sw6; }
                    if (r14 != 0) { $pc6 = 10; continue $sw6; }
                    return 0;
                }
                case 10: {
                    if (this.ei != 0) { $pc6 = 28; continue $sw6; }
                    if (this.BT == 0) { $pc6 = 15; continue $sw6; }
                    j6(0, this.QX[this.vy - 1] & 255);
                    this.BT = 0;
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    if (r14 != 4) { $pc6 = 17; continue $sw6; }
                    r2 = true;
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    j6(r2);
                    if (this.FH.VH != 0) { $pc6 = 23; continue $sw6; }
                    if (r14 != 4) { $pc6 = 22; continue $sw6; }
                    return 2;
                }
                case 22: {
                    return 0;
                }
                case 23: {
                    if (r14 == 4) { $pc6 = 88; continue $sw6; }
                    return 1;
                }
                case 88: {
                    return 3;
                }
                case 17: {
                    r2 = false;
                    $pc6 = 28; continue $sw6;
                }
                case 28: {
                    if (this.ei < 3) { $pc6 = 30; continue $sw6; }
                    r3 = this.Mr << this.rN;
                    r4 = this.QX;
                    r8 = this.vy;
                    this.Mr = (r3 ^ (r4[r8 + 2] & 255)) & this.lg;
                    r5 = this.j3;
                    r6 = this.Mr;
                    r9 = r5[r6] & 65535;
                    this.aM[this.Ws & r8] = r5[r6];
                    r5[r6] = (short) r8;
                    r1 = r9;
                    $pc6 = 30; continue $sw6;
                }
                case 30: {
                    this.nw = this.yS;
                    this.gW = this.P8;
                    this.yS = 2;
                    if (r1 != 0) { $pc6 = 33; continue $sw6; }
                    $pc6 = 47; continue $sw6;
                }
                case 47: {
                    r7 = this.nw;
                    if (r7 < 3) { $pc6 = 63; continue $sw6; }
                    if (this.yS > r7) { $pc6 = 63; continue $sw6; }
                    r10 = this.vy;
                    r11 = (this.ei + r10) - 3;
                    r12 = j6((r10 - 1) - this.gW, r7 - 3);
                    r13 = this.ei;
                    r15 = this.nw;
                    this.ei = r13 - (r15 - 1);
                    this.nw = r15 - 2;
                    $pc6 = 52; continue $sw6;
                }
                case 52: {
                    r16 = this.vy + 1;
                    this.vy = r16;
                    if (r16 > r11) { $pc6 = 55; continue $sw6; }
                    r17 = this.Mr << this.rN;
                    r18 = this.QX;
                    r19 = this.vy;
                    this.Mr = (r17 ^ (r18[r19 + 2] & 255)) & this.lg;
                    r20 = this.j3;
                    r21 = this.Mr;
                    r22 = r20[r21] & 65535;
                    this.aM[this.Ws & r19] = r20[r21];
                    r20[r21] = (short) r19;
                    r1 = r22;
                    $pc6 = 55; continue $sw6;
                }
                case 55: {
                    r23 = this.nw - 1;
                    this.nw = r23;
                    if (r23 != 0) { $pc6 = 52; continue $sw6; }
                    this.BT = 0;
                    this.yS = 2;
                    this.vy++;
                    if (r12 == false) { $pc6 = 4; continue $sw6; }
                    j6(false);
                    if (this.FH.VH != 0) { $pc6 = 4; continue $sw6; }
                    return 0;
                }
                case 63: {
                    if (this.BT != 0) { $pc6 = 65; continue $sw6; }
                    this.BT = 1;
                    this.vy++;
                    this.ei--;
                    { $pc6 = 4; continue $sw6; }
                }
                case 65: {
                    if (j6(0, this.QX[this.vy - 1] & 255) == false) { $pc6 = 67; continue $sw6; }
                    j6(false);
                    $pc6 = 67; continue $sw6;
                }
                case 67: {
                    this.vy++;
                    this.ei--;
                    if (this.FH.VH != 0) { $pc6 = 4; continue $sw6; }
                    return 0;
                }
                case 33: {
                    if (this.nw >= this.KD) { $pc6 = 47; continue $sw6; }
                    if (((this.vy - r1) & 65535) > (this.J0 - 262)) { $pc6 = 47; continue $sw6; }
                    if (this.cn == 2) { $pc6 = 39; continue $sw6; }
                    this.yS = v5(r1);
                    $pc6 = 39; continue $sw6;
                }
                case 39: {
                    r24 = this.yS;
                    if (r24 > 5) { $pc6 = 47; continue $sw6; }
                    if (this.cn == 1) { $pc6 = 46; continue $sw6; }
                    if (r24 != 3) { $pc6 = 47; continue $sw6; }
                    if ((this.vy - this.P8) <= 4096) { $pc6 = 47; continue $sw6; }
                    $pc6 = 46; continue $sw6;
                }
                case 46: {
                    this.yS = 2;
                    { $pc6 = 47; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void FH() {
        int r0 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.wc;
                    if (r0 <= 8) { $pc7 = 5; continue $sw7; }
                    VH(this.jJ);
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    this.jJ = 0;
                    this.wc = 0;
                    return;
                }
                case 5: {
                    if (r0 <= 0) { $pc7 = 7; continue $sw7; }
                    j6((byte) this.jJ);
                    { $pc7 = 7; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void FH(int r4, int r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.wc;
                    if (r0 <= (16 - r5)) { $pc8 = 5; continue $sw8; }
                    this.jJ = (short) (((r4 << r0) & 65535) | this.jJ);
                    VH(this.jJ);
                    r1 = this.wc;
                    this.jJ = (short) (r4 >>> (16 - r1));
                    this.wc = r1 + (r5 - 16);
                    return;
                }
                case 5: {
                    this.jJ = (short) (((r4 << r0) & 65535) | this.jJ);
                    this.wc = r0 + r5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void FH(int r2, int r3, boolean r4) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    FH();
                    this.XG = 8;
                    if (r4 == false) { $pc9 = 5; continue $sw9; }
                    VH((short) r3);
                    VH((short) (r3 ^ (-1)));
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    j6(this.QX, r2, r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void FH(short[] r17, int r18) {
        short r2 = 0;
        int r7 = 0;
        int r8 = 0;
        int r12 = 0;
        int r13 = 0;
        int r9 = 0;
        int r11 = 0;
        short r14 = 0;
        short r15 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r2 = r17[1];
                    if (r2 != 0) { $pc10 = 5; continue $sw10; }
                    r7 = 138;
                    r8 = 3;
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    r12 = r7;
                    r13 = r8;
                    r9 = 0;
                    r11 = 0;
                    r14 = -1;
                    r14 = r2;
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if (r9 > r18) { $pc10 = 8; continue $sw10; }
                    r9 = r9 + 1;
                    r15 = r17[(r9 * 2) + 1];
                    r11 = r11 + 1;
                    if (r11 >= r12) { $pc10 = 13; continue $sw10; }
                    if (r14 != r15) { $pc10 = 13; continue $sw10; }
                    $pc10 = 31; continue $sw10;
                }
                case 31: {
                    r14 = r15;
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    if (r11 >= r13) { $pc10 = 17; continue $sw10; }
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    j6(r14, this.ef);
                    r11 = r11 - 1;
                    if (r11 != 0) { $pc10 = 14; continue $sw10; }
                    $pc10 = 25; continue $sw10;
                }
                case 25: {
                    if (r15 != 0) { $pc10 = 28; continue $sw10; }
                    r11 = 0;
                    r12 = 138;
                    $pc10 = 27; continue $sw10;
                }
                case 27: {
                    r13 = 3;
                    { $pc10 = 31; continue $sw10; }
                }
                case 28: {
                    if (r14 != r15) { $pc10 = 30; continue $sw10; }
                    r11 = 0;
                    r12 = 6;
                    { $pc10 = 27; continue $sw10; }
                }
                case 30: {
                    r14 = r14;
                    r11 = 0;
                    r12 = 7;
                    r13 = 4;
                    { $pc10 = 31; continue $sw10; }
                }
                case 17: {
                    if (r14 == 0) { $pc10 = 22; continue $sw10; }
                    if (r14 == r14) { $pc10 = 20; continue $sw10; }
                    j6(r14, this.ef);
                    r11 = r11 - 1;
                    $pc10 = 20; continue $sw10;
                }
                case 20: {
                    j6(16, this.ef);
                    FH(r11 - 3, 2);
                    { $pc10 = 25; continue $sw10; }
                }
                case 22: {
                    if (r11 > 10) { $pc10 = 24; continue $sw10; }
                    j6(17, this.ef);
                    FH(r11 - 3, 3);
                    { $pc10 = 25; continue $sw10; }
                }
                case 24: {
                    j6(18, this.ef);
                    FH(r11 - 11, 7);
                    { $pc10 = 25; continue $sw10; }
                }
                case 8: {
                    return;
                }
                case 5: {
                    r7 = 7;
                    r8 = 4;
                    { $pc10 = 6; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int Hw(int r5) {
        int r0 = 0;
        int r2 = 0;
        boolean r3 = false;
        int r1 = 0;
        int r4 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.Zo;
                    r2 = 65535;
                    if (65535 <= (r0 - 5)) { $pc11 = 6; continue $sw11; }
                    r2 = r0 - 5;
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (this.ei > 1) { $pc11 = 25; continue $sw11; }
                    u7();
                    if (this.ei != 0) { $pc11 = 12; continue $sw11; }
                    if (r5 != 0) { $pc11 = 12; continue $sw11; }
                    return 0;
                }
                case 12: {
                    if (this.ei != 0) { $pc11 = 25; continue $sw11; }
                    if (r5 != 4) { $pc11 = 16; continue $sw11; }
                    r3 = true;
                    $pc11 = 17; continue $sw11;
                }
                case 17: {
                    j6(r3);
                    if (this.FH.VH != 0) { $pc11 = 22; continue $sw11; }
                    if (r5 != 4) { $pc11 = 45; continue $sw11; }
                    return 2;
                }
                case 45: {
                    return 0;
                }
                case 22: {
                    if (r5 != 4) { $pc11 = 46; continue $sw11; }
                    return 3;
                }
                case 46: {
                    return 1;
                }
                case 16: {
                    r3 = false;
                    $pc11 = 25; continue $sw11;
                }
                case 25: {
                    this.vy += this.ei;
                    this.ei = 0;
                    r1 = this.er + r2;
                    r4 = this.vy;
                    if (r4 == 0) { $pc11 = 28; continue $sw11; }
                    if (r4 >= r1) { $pc11 = 28; continue $sw11; }
                    $pc11 = 32; continue $sw11;
                }
                case 32: {
                    if ((this.vy - this.er) < (this.J0 - 262)) { $pc11 = 6; continue $sw11; }
                    j6(false);
                    if (this.FH.VH != 0) { $pc11 = 6; continue $sw11; }
                    return 0;
                }
                case 28: {
                    this.ei = this.vy - r1;
                    this.vy = r1;
                    j6(false);
                    if (this.FH.VH != 0) { $pc11 = 32; continue $sw11; }
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void J0() {
        int r0 = 0;
        abcd.Gy.a[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    this.XL = this.J0 * 2;
                    this.j3[this.U2 - 1] = 0;
                    r0 = 0;
                    $pc12 = 4; continue $sw12;
                }
                case 4: {
                    if (r0 >= (this.U2 - 1)) { $pc12 = 5; continue $sw12; }
                    this.j3[r0] = 0;
                    r0 = r0 + 1;
                    { $pc12 = 4; continue $sw12; }
                }
                case 5: {
                    r1 = j6;
                    r2 = this.ro;
                    this.KD = r1[r2].DW;
                    this.sh = r1[r2].j6;
                    this.cb = r1[r2].FH;
                    this.SI = r1[r2].Hw;
                    this.vy = 0;
                    this.er = 0;
                    this.ei = 0;
                    this.nw = 2;
                    this.yS = 2;
                    this.BT = 0;
                    this.Mr = 0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void QX() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    r2 = 0;
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r1 >= 7) { $pc13 = 5; continue $sw13; }
                    r2 = r2 + this.dx[r1 * 2];
                    r1 = r1 + 1;
                    { $pc13 = 4; continue $sw13; }
                }
                case 5: {
                    r3 = 0;
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r1 >= 128) { $pc13 = 9; continue $sw13; }
                    r3 = r3 + this.dx[r1 * 2];
                    r1 = r1 + 1;
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    if (r1 >= 256) { $pc13 = 11; continue $sw13; }
                    r2 = r2 + this.dx[r1 * 2];
                    r1 = r1 + 1;
                    { $pc13 = 9; continue $sw13; }
                }
                case 11: {
                    if (r2 > (r3 >>> 2)) { $pc13 = 14; continue $sw13; }
                    r0 = 1;
                    $pc13 = 14; continue $sw13;
                }
                case 14: {
                    this.tp = (byte) r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final void VH(int r2) {
        j6((byte) r2);
        j6((byte) (r2 >>> 8));
    }

    void XL() {
        abcd.Ny r0 = this.Sf;
        r0.u7 = this.dx;
        r0.EQ = abcd.My.FH;
        abcd.Ny r1 = this.vJ;
        r1.u7 = this.sG;
        r1.EQ = abcd.My.Hw;
        abcd.Ny r2 = this.g3;
        r2.u7 = this.ef;
        r2.EQ = abcd.My.v5;
        this.jJ = 0;
        this.wc = 0;
        this.XG = 8;
        EQ();
    }

    final void Zo(int r2) {
        j6((byte) (r2 >> 8));
        j6((byte) r2);
    }

    public java.lang.Object clone() {
        abcd.Gy r0 = null;
        abcd.Ny r1 = null;
        abcd.Ny r2 = null;
        abcd.Ny r3 = null;
        abcd.Hy r4 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = (abcd.Gy) super.clone();
                    r0.v5 = j6(r0.v5);
                    r0.br = r0.br;
                    r0.aj = j6(r0.aj);
                    r0.QX = j6(r0.QX);
                    r0.aM = j6(r0.aM);
                    r0.j3 = j6(r0.j3);
                    r0.dx = j6(r0.dx);
                    r0.sG = j6(r0.sG);
                    r0.ef = j6(r0.ef);
                    r0.Mz = j6(r0.Mz);
                    r0.I = j6(r0.I);
                    r0.ca = j6(r0.ca);
                    r0.sy = j6(r0.sy);
                    r1 = r0.Sf;
                    r1.u7 = r0.dx;
                    r2 = r0.vJ;
                    r2.u7 = r0.sG;
                    r3 = r0.g3;
                    r3.u7 = r0.ef;
                    r4 = r0.et;
                    if (r4 == null) { $pc14 = 5; continue $sw14; }
                    r0.et = (abcd.Hy) r4.clone();
                    $pc14 = 5; continue $sw14;
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int gn() {
        abcd.Oy r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.FH;
                    r0.gn = 0;
                    r0.Hw = 0;
                    r0.u7 = null;
                    r0.we = 2;
                    this.gn = 0;
                    this.VH = 0;
                    r1 = this.u7;
                    if (r1 >= 0) { $pc15 = 6; continue $sw15; }
                    this.u7 = -r1;
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    if (this.u7 != 0) { $pc15 = 8; continue $sw15; }
                    r2 = 113;
                    $pc15 = 9; continue $sw15;
                }
                case 9: {
                    this.Hw = r2;
                    this.FH.J0.reset();
                    this.we = 0;
                    XL();
                    J0();
                    return 0;
                }
                case 8: {
                    r2 = 42;
                    { $pc15 = 9; continue $sw15; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(int r17) {
        abcd.Oy r4 = null;
        abcd.Oy r2 = null;
        int r3 = 0;
        int r5 = 0;
        int r14 = 0;
        int r6 = 0;
        long r15 = 0L;
        abcd.Oy r7 = null;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r1 = 0;
        long r11 = 0L;
        int r12 = 0;
        long r13 = 0L;
        abcd.Oy r16 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (r17 > 4) { $pc16 = 110; continue $sw16; }
                    if (r17 < 0) { $pc16 = 110; continue $sw16; }
                    r4 = this.FH;
                    if (r4.v5 != null) { $pc16 = 9; continue $sw16; }
                    $pc16 = 109; continue $sw16;
                }
                case 109: {
                    this.FH.u7 = DW[4];
                    { $pc16 = 110; continue $sw16; }
                }
                case 9: {
                    if (r4.j6 != null) { $pc16 = 13; continue $sw16; }
                    if (r4.FH != 0) { $pc16 = 109; continue $sw16; }
                    $pc16 = 13; continue $sw16;
                }
                case 13: {
                    if (this.Hw != 666) { $pc16 = 16; continue $sw16; }
                    if (r17 != 4) { $pc16 = 109; continue $sw16; }
                    $pc16 = 16; continue $sw16;
                }
                case 16: {
                    r2 = this.FH;
                    if (r2.VH != 0) { $pc16 = 20; continue $sw16; }
                    r2.u7 = DW[7];
                    return -5;
                }
                case 20: {
                    r3 = this.we;
                    this.we = r17;
                    if (this.Hw != 42) { $pc16 = 36; continue $sw16; }
                    if (this.u7 != 2) { $pc16 = 25; continue $sw16; }
                    tp().j6(this);
                    this.Hw = 113;
                    this.FH.J0.reset();
                    { $pc16 = 36; continue $sw16; }
                }
                case 25: {
                    r5 = (((this.J8 - 8) << 4) + 8) << 8;
                    r14 = ((this.ro - 1) & 255) >> 1;
                    if (r14 <= 3) { $pc16 = 28; continue $sw16; }
                    r14 = 3;
                    $pc16 = 28; continue $sw16;
                }
                case 28: {
                    r6 = r5 | (r14 << 6);
                    if (this.vy == 0) { $pc16 = 31; continue $sw16; }
                    r6 = r6 | 32;
                    $pc16 = 31; continue $sw16;
                }
                case 31: {
                    this.Hw = 113;
                    Zo(r6 + (31 - (r6 % 31)));
                    if (this.vy == 0) { $pc16 = 34; continue $sw16; }
                    r15 = this.FH.J0.getValue();
                    Zo((int) (r15 >>> 16));
                    Zo((int) (65535 & r15));
                    $pc16 = 34; continue $sw16;
                }
                case 34: {
                    this.FH.J0.reset();
                    $pc16 = 36; continue $sw16;
                }
                case 36: {
                    if (this.gn == 0) { $pc16 = 41; continue $sw16; }
                    this.FH.j6();
                    if (this.FH.VH != 0) { $pc16 = 48; continue $sw16; }
                    this.we = -1;
                    return 0;
                }
                case 48: {
                    if (this.Hw != 666) { $pc16 = 54; continue $sw16; }
                    r7 = this.FH;
                    if (r7.FH == 0) { $pc16 = 54; continue $sw16; }
                    r7.u7 = DW[7];
                    return -5;
                }
                case 54: {
                    if (this.FH.FH == 0) { $pc16 = 56; continue $sw16; }
                    $pc16 = 60; continue $sw16;
                }
                case 60: {
                    r8 = j6[this.ro].v5;
                    if (r8 == 0) { $pc16 = 67; continue $sw16; }
                    if (r8 == 1) { $pc16 = 66; continue $sw16; }
                    if (r8 == 2) { $pc16 = 65; continue $sw16; }
                    r9 = -1;
                    $pc16 = 68; continue $sw16;
                }
                case 68: {
                    if (r9 != 2) { $pc16 = 70; continue $sw16; }
                    $pc16 = 71; continue $sw16;
                }
                case 71: {
                    this.Hw = 666;
                    $pc16 = 72; continue $sw16;
                }
                case 72: {
                    if (r9 == 0) { $pc16 = 106; continue $sw16; }
                    if (r9 == 2) { $pc16 = 106; continue $sw16; }
                    if (r9 != 1) { $pc16 = 89; continue $sw16; }
                    if (r17 != 1) { $pc16 = 78; continue $sw16; }
                    j6();
                    $pc16 = 85; continue $sw16;
                }
                case 85: {
                    this.FH.j6();
                    if (this.FH.VH != 0) { $pc16 = 89; continue $sw16; }
                    this.we = -1;
                    return 0;
                }
                case 78: {
                    DW(0, 0, false);
                    if (r17 != 3) { $pc16 = 85; continue $sw16; }
                    r10 = 0;
                    $pc16 = 82; continue $sw16;
                }
                case 82: {
                    if (r10 >= this.U2) { $pc16 = 85; continue $sw16; }
                    this.j3[r10] = 0;
                    r10 = r10 + 1;
                    $pc16 = 89; continue $sw16;
                }
                case 89: {
                    if (r17 == 4) { $pc16 = 91; continue $sw16; }
                    return 0;
                }
                case 91: {
                    r1 = this.u7;
                    if (r1 > 0) { $pc16 = 94; continue $sw16; }
                    return 1;
                }
                case 94: {
                    if (r1 != 2) { $pc16 = 96; continue $sw16; }
                    r11 = this.FH.J0.getValue();
                    j6((byte) (r11 & 255));
                    j6((byte) ((r11 >> 8) & 255));
                    j6((byte) ((r11 >> 16) & 255));
                    j6((byte) ((r11 >> 24) & 255));
                    j6((byte) (this.FH.Hw & 255));
                    j6((byte) ((this.FH.Hw >> 8) & 255));
                    j6((byte) ((this.FH.Hw >> 16) & 255));
                    j6((byte) (255 & (this.FH.Hw >> 24)));
                    tp().j6(r11);
                    $pc16 = 97; continue $sw16;
                }
                case 97: {
                    this.FH.j6();
                    r12 = this.u7;
                    if (r12 <= 0) { $pc16 = 101; continue $sw16; }
                    this.u7 = -r12;
                    $pc16 = 101; continue $sw16;
                }
                case 101: {
                    if (this.gn != 0) { $pc16 = 112; continue $sw16; }
                    return 1;
                }
                case 112: {
                    return 0;
                }
                case 96: {
                    r13 = this.FH.J0.getValue();
                    Zo((int) (r13 >>> 16));
                    Zo((int) (r13 & 65535));
                    $pc16 = 106; continue $sw16;
                }
                case 106: {
                    if (this.FH.VH != 0) { $pc16 = 108; continue $sw16; }
                    this.we = -1;
                    $pc16 = 108; continue $sw16;
                }
                case 108: {
                    return 0;
                }
                case 70: {
                    if (r9 != 3) { $pc16 = 72; continue $sw16; }
                    $pc16 = 65; continue $sw16;
                }
                case 65: {
                    r9 = FH(r17);
                    { $pc16 = 68; continue $sw16; }
                }
                case 66: {
                    r9 = DW(r17);
                    { $pc16 = 68; continue $sw16; }
                }
                case 67: {
                    r9 = Hw(r17);
                    { $pc16 = 68; continue $sw16; }
                }
                case 56: {
                    if (this.ei != 0) { $pc16 = 60; continue $sw16; }
                    if (r17 == 0) { $pc16 = 89; continue $sw16; }
                    if (this.Hw == 666) { $pc16 = 89; continue $sw16; }
                    $pc16 = 41; continue $sw16;
                }
                case 41: {
                    r16 = this.FH;
                    if (r16.FH != 0) { $pc16 = 48; continue $sw16; }
                    if (r17 > r3) { $pc16 = 48; continue $sw16; }
                    if (r17 == 4) { $pc16 = 48; continue $sw16; }
                    r16.u7 = DW[7];
                    return -5;
                }
                case 110: {
                    return -2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6() {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    FH(2, 3);
                    j6(256, abcd.My.j6);
                    DW();
                    if ((((this.XG + 1) + 10) - this.wc) >= 9) { $pc17 = 5; continue $sw17; }
                    FH(2, 3);
                    j6(256, abcd.My.j6);
                    DW();
                    $pc17 = 5; continue $sw17;
                }
                case 5: {
                    this.XG = 7;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final void j6(byte r4) {
        byte[] r0 = this.v5;
        int r1 = this.gn;
        this.gn = r1 + 1;
        r0[r1] = r4;
    }

    void j6(int r4, int r5, int r6) {
        int r7 = 0;
        int r0 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    FH(r4 - 257, 5);
                    r7 = r5 - 1;
                    FH(r7, 5);
                    FH(r6 - 4, 4);
                    r0 = 0;
                    $pc18 = 3; continue $sw18;
                }
                case 3: {
                    if (r0 >= r6) { $pc18 = 4; continue $sw18; }
                    FH(this.ef[(abcd.Ny.Hw[r0] * 2) + 1], 3);
                    r0 = r0 + 1;
                    { $pc18 = 3; continue $sw18; }
                }
                case 4: {
                    FH(this.dx, r4 - 1);
                    FH(this.sG, r7);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(int r6, int r7, boolean r8) {
        int r2 = 0;
        int r0 = 0;
        int r3 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (this.ro > 0) { $pc19 = 5; continue $sw19; }
                    r2 = r7 + 5;
                    r0 = 0;
                    r3 = r2;
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    if ((r7 + 4) <= r2) { $pc19 = 14; continue $sw19; }
                    $pc19 = 16; continue $sw19;
                }
                case 16: {
                    if (r3 != r2) { $pc19 = 18; continue $sw19; }
                    FH((r8 ? 1 : 0) + 2, 3);
                    j6(abcd.My.j6, abcd.My.DW);
                    $pc19 = 19; continue $sw19;
                }
                case 19: {
                    EQ();
                    if (r8 == false) { $pc19 = 23; continue $sw19; }
                    FH();
                    return;
                }
                case 23: {
                    return;
                }
                case 18: {
                    FH((r8 ? 1 : 0) + 4, 3);
                    j6(this.Sf.tp + 1, this.vJ.tp + 1, r0 + 1);
                    j6(this.dx, this.sG);
                    { $pc19 = 19; continue $sw19; }
                }
                case 14: {
                    if (r6 == (-1)) { $pc19 = 16; continue $sw19; }
                    DW(r6, r7, r8);
                    { $pc19 = 19; continue $sw19; }
                }
                case 5: {
                    if (this.tp != 2) { $pc19 = 7; continue $sw19; }
                    QX();
                    $pc19 = 7; continue $sw19;
                }
                case 7: {
                    this.Sf.j6(this);
                    this.vJ.j6(this);
                    r0 = v5();
                    r2 = ((this.XX + 3) + 7) >>> 3;
                    r3 = ((this.kQ + 3) + 7) >>> 3;
                    if (r3 > r2) { $pc19 = 12; continue $sw19; }
                    r2 = r3;
                    { $pc19 = 12; continue $sw19; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final void j6(int r3, short[] r4) {
        int r5 = r3 * 2;
        FH(r4[r5] & 65535, r4[r5 + 1] & 65535);
    }

    void j6(boolean r4) {
        int r0 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = this.er;
                    if (r0 >= 0) { $pc20 = 6; continue $sw20; }
                    r0 = -1;
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    j6(r0, this.vy - this.er, r4);
                    this.er = this.vy;
                    this.FH.j6();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final void j6(byte[] r3, int r4, int r5) {
        java.lang.System.arraycopy(r3, r4, this.v5, this.gn, r5);
        this.gn += r5;
    }

    void j6(short[] r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int[] r3 = null;
        int r4 = 0;
        int[] r5 = null;
        int r6 = 0;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = this.ca[r9];
                    r1 = r9 << 1;
                    $pc21 = 3; continue $sw21;
                }
                case 3: {
                    r2 = this.x9;
                    if (r1 > r2) { $pc21 = 12; continue $sw21; }
                    if (r1 >= r2) { $pc21 = 11; continue $sw21; }
                    r3 = this.ca;
                    r4 = r1 + 1;
                    if (j6(r8, r3[r4], r3[r1], this.sy) == false) { $pc21 = 11; continue $sw21; }
                    r1 = r4;
                    $pc21 = 11; continue $sw21;
                }
                case 11: {
                    if (j6(r8, r0, this.ca[r1], this.sy) == true) { $pc21 = 12; continue $sw21; }
                    r5 = this.ca;
                    r5[r9] = r5[r1];
                    r6 = r1;
                    r1 = r1 << 1;
                    r9 = r6;
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    this.ca[r9] = r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(short[] r7, short[] r8) {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        byte r6 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    if (this.OW == 0) { $pc22 = 16; continue $sw22; }
                    r0 = 0;
                    $pc22 = 5; continue $sw22;
                }
                case 5: {
                    r1 = this.v5;
                    r2 = this.br;
                    r3 = r0 * 2;
                    r4 = (r1[(r2 + r3) + 1] & 255) | ((r1[r2 + r3] << 8) & 65280);
                    r5 = this.aj[r0] & 255;
                    r0 = r0 + 1;
                    if (r4 != 0) { $pc22 = 8; continue $sw22; }
                    j6(r5, r7);
                    $pc22 = 15; continue $sw22;
                }
                case 15: {
                    if (r0 < this.OW) { $pc22 = 5; continue $sw22; }
                    $pc22 = 8; continue $sw22;
                }
                case 8: {
                    r6 = abcd.Ny.Zo[r5];
                    j6((r6 + 256) + 1, r7);
                    r9 = abcd.Ny.j6[r6];
                    if (r9 == 0) { $pc22 = 11; continue $sw22; }
                    FH(r5 - abcd.Ny.VH[r6], r9);
                    $pc22 = 11; continue $sw22;
                }
                case 11: {
                    r10 = r4 - 1;
                    r11 = abcd.Ny.j6(r10);
                    j6(r11, r8);
                    r12 = abcd.Ny.DW[r11];
                    if (r12 == 0) { $pc22 = 15; continue $sw22; }
                    FH(r10 - abcd.Ny.gn[r11], r12);
                    $pc22 = 16; continue $sw22;
                }
                case 16: {
                    j6(256, r7);
                    this.XG = r7[513];
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(int r13, int r14) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        short[] r15 = null;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r3 = 0;
        int r19 = 0;
        int r110 = 0;
        short[] r4 = null;
        int r111 = 0;
        short[] r112 = null;
        int r113 = 0;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = this.v5;
                    r1 = this.br;
                    r2 = this.OW;
                    r0[(r2 * 2) + r1] = (byte) (r13 >>> 8);
                    r0[(r1 + (r2 * 2)) + 1] = (byte) r13;
                    this.aj[r2] = (byte) r14;
                    this.OW = r2 + 1;
                    if (r13 != 0) { $pc23 = 5; continue $sw23; }
                    r15 = this.dx;
                    r16 = r14 * 2;
                    r15[r16] = (short) (r15[r16] + 1);
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    r17 = this.OW;
                    if ((r17 & 8191) != 0) { $pc23 = 20; continue $sw23; }
                    if (this.ro <= 2) { $pc23 = 20; continue $sw23; }
                    r18 = this.vy - this.er;
                    r3 = r17 * 8;
                    r19 = 0;
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    if (r19 >= 30) { $pc23 = 13; continue $sw23; }
                    r3 = (int) (((long) r3) + (((long) this.sG[r19 * 2]) * (((long) abcd.Ny.DW[r19]) + 5)));
                    r19 = r19 + 1;
                    { $pc23 = 12; continue $sw23; }
                }
                case 13: {
                    r110 = r3 >>> 3;
                    if (this.yO >= (this.OW / 2)) { $pc23 = 20; continue $sw23; }
                    if (r110 >= (r18 / 2)) { $pc23 = 20; continue $sw23; }
                    return true;
                }
                case 20: {
                    if (this.OW != (this.lp - 1)) { $pc23 = 22; continue $sw23; }
                    return true;
                }
                case 22: {
                    return false;
                }
                case 5: {
                    this.yO++;
                    r4 = this.dx;
                    r111 = ((abcd.Ny.Zo[r14] + 256) + 1) * 2;
                    r4[r111] = (short) (r4[r111] + 1);
                    r112 = this.sG;
                    r113 = abcd.Ny.j6(r13 - 1) * 2;
                    r112[r113] = (short) (r112[r113] + 1);
                    { $pc23 = 6; continue $sw23; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized abcd.Hy tp() {
        synchronized (this) {
            abcd.Hy r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex24 = null;
            int $pc24 = -1;
            $sw24: while (true) {
                switch ($pc24) {
                    case -1: {
                        $pc24 = 4; continue $sw24;
                    }
                    case 9: {
                        th = $ex24;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.et != null) { $pc24 = 6; continue $sw24; }
                        try {
                            this.et = new abcd.Hy();
                        } catch (java.lang.Throwable $t) {
                            $ex24 = $t;
                            $pc24 = 9; continue $sw24;
                        }
                        $pc24 = 6; continue $sw24;
                    }
                    case 6: {
                        try {
                            r0 = this.et;
                        } catch (java.lang.Throwable $t) {
                            $ex24 = $t;
                            $pc24 = 9; continue $sw24;
                        }
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    void u7() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.Oy r4 = null;
        byte[] r5 = null;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        byte[] r9 = null;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        short[] r14 = null;
        int r15 = 0;
        int r16 = 0;
        short r17 = 0;
        int r18 = 0;
        int r19 = 0;
        short[] r20 = null;
        int r21 = 0;
        int r22 = 0;
        short r23 = 0;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 2;
        $sw25: while (true) {
            switch ($pc25) {
                case 2: {
                    r0 = this.XL;
                    r1 = this.ei;
                    r2 = this.vy;
                    r3 = (r0 - r1) - r2;
                    if (r3 != 0) { $pc25 = 8; continue $sw25; }
                    if (r2 != 0) { $pc25 = 8; continue $sw25; }
                    if (r1 != 0) { $pc25 = 8; continue $sw25; }
                    r3 = this.J0;
                    $pc25 = 27; continue $sw25;
                }
                case 27: {
                    r4 = this.FH;
                    if (r4.FH == 0) { $pc25 = 29; continue $sw25; }
                    this.ei += r4.j6(this.QX, this.vy + this.ei, r3);
                    if (this.ei < 3) { $pc25 = 34; continue $sw25; }
                    r5 = this.QX;
                    r6 = this.vy;
                    this.Mr = r5[r6] & 255;
                    this.Mr = ((r5[r6 + 1] & 255) ^ (this.Mr << this.rN)) & this.lg;
                    $pc25 = 34; continue $sw25;
                }
                case 34: {
                    if (this.ei >= 262) { $pc25 = 37; continue $sw25; }
                    if (this.FH.FH != 0) { $pc25 = 2; continue $sw25; }
                    return;
                }
                case 37: {
                    return;
                }
                case 29: {
                    return;
                }
                case 8: {
                    if (r3 != (-1)) { $pc25 = 10; continue $sw25; }
                    r3 = r3 - 1;
                    { $pc25 = 27; continue $sw25; }
                }
                case 10: {
                    r7 = this.vy;
                    r8 = this.J0;
                    if (r7 < ((r8 + r8) - 262)) { $pc25 = 27; continue $sw25; }
                    r9 = this.QX;
                    java.lang.System.arraycopy(r9, r8, r9, 0, r8);
                    r10 = this.P8;
                    r11 = this.J0;
                    this.P8 = r10 - r11;
                    this.vy -= r11;
                    this.er -= r11;
                    r12 = this.U2;
                    r13 = r12;
                    $pc25 = 13; continue $sw25;
                }
                case 13: {
                    r14 = this.j3;
                    r12 = r12 - 1;
                    r15 = r14[r12] & 65535;
                    r16 = this.J0;
                    if (r15 < r16) { $pc25 = 16; continue $sw25; }
                    r17 = (short) (r15 - r16);
                    $pc25 = 17; continue $sw25;
                }
                case 17: {
                    r14[r12] = r17;
                    r13 = r13 - 1;
                    if (r13 != 0) { $pc25 = 13; continue $sw25; }
                    r18 = this.J0;
                    r19 = r18;
                    $pc25 = 20; continue $sw25;
                }
                case 20: {
                    r20 = this.aM;
                    r18 = r18 - 1;
                    r21 = r20[r18] & 65535;
                    r22 = this.J0;
                    if (r21 < r22) { $pc25 = 23; continue $sw25; }
                    r23 = (short) (r21 - r22);
                    $pc25 = 24; continue $sw25;
                }
                case 24: {
                    r20[r18] = r23;
                    r19 = r19 - 1;
                    if (r19 != 0) { $pc25 = 20; continue $sw25; }
                    r3 = r3 + this.J0;
                    { $pc25 = 27; continue $sw25; }
                }
                case 23: {
                    r23 = 0;
                    { $pc25 = 24; continue $sw25; }
                }
                case 16: {
                    r17 = 0;
                    { $pc25 = 17; continue $sw25; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int v5() {
        int r0 = 0;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    DW(this.dx, this.Sf.tp);
                    DW(this.sG, this.vJ.tp);
                    this.g3.j6(this);
                    r0 = 18;
                    $pc26 = 4; continue $sw26;
                }
                case 4: {
                    if (r0 < 3) { $pc26 = 8; continue $sw26; }
                    if (this.ef[(abcd.Ny.Hw[r0] * 2) + 1] != 0) { $pc26 = 8; continue $sw26; }
                    r0 = r0 - 1;
                    $pc26 = 8; continue $sw26;
                }
                case 8: {
                    this.XX += ((((r0 + 1) * 3) + 5) + 5) + 4;
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int v5(int r14) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        byte[] r8 = null;
        int r9 = 0;
        byte r10 = 0;
        byte r11 = 0;
        int r12 = 0;
        byte[] r13 = null;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r110 = 0;
        byte[] r20 = null;
        int r111 = 0;
        int r112 = 0;
        int r113 = 0;
        int r114 = 0;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        int r21 = 0;
        byte[] r22 = null;
        int r23 = 0;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    r0 = this.SI;
                    r1 = this.vy;
                    r2 = this.nw;
                    r3 = this.J0;
                    if (r1 <= (r3 - 262)) { $pc27 = 5; continue $sw27; }
                    r4 = r1 - (r3 - 262);
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    r5 = this.cb;
                    r6 = this.Ws;
                    r7 = this.vy + 258;
                    r8 = this.QX;
                    r9 = r1 + r2;
                    r10 = r8[r9 - 1];
                    r11 = r8[r9];
                    if (this.nw < this.sh) { $pc27 = 9; continue $sw27; }
                    r0 = r0 >> 2;
                    $pc27 = 9; continue $sw27;
                }
                case 9: {
                    r12 = this.ei;
                    if (r5 <= r12) { $pc27 = 12; continue $sw27; }
                    r5 = r12;
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    r13 = this.QX;
                    r15 = r14 + r2;
                    if (r13[r15] == r11) { $pc27 = 15; continue $sw27; }
                    $pc27 = 46; continue $sw27;
                }
                case 46: {
                    r14 = this.aM[r14 & r6] & 65535;
                    if (r14 <= r4) { $pc27 = 50; continue $sw27; }
                    r0 = r0 - 1;
                    if (r0 != 0) { $pc27 = 12; continue $sw27; }
                    $pc27 = 50; continue $sw27;
                }
                case 50: {
                    r16 = r2;
                    $pc27 = 51; continue $sw27;
                }
                case 51: {
                    r17 = this.ei;
                    if (r16 > r17) { $pc27 = 54; continue $sw27; }
                    return r16;
                }
                case 54: {
                    return r17;
                }
                case 15: {
                    if (r13[r15 - 1] != r10) { $pc27 = 46; continue $sw27; }
                    if (r13[r14] != r13[r1]) { $pc27 = 46; continue $sw27; }
                    r18 = r14 + 1;
                    if (r13[r18] != r13[r1 + 1]) { $pc27 = 46; continue $sw27; }
                    r19 = r1 + 2;
                    r110 = r18 + 1;
                    $pc27 = 22; continue $sw27;
                }
                case 22: {
                    r20 = this.QX;
                    r19 = r19 + 1;
                    r111 = r110 + 1;
                    if (r20[r19] != r20[r111]) { $pc27 = 39; continue $sw27; }
                    r19 = r19 + 1;
                    r112 = r111 + 1;
                    if (r20[r19] != r20[r112]) { $pc27 = 39; continue $sw27; }
                    r19 = r19 + 1;
                    r113 = r112 + 1;
                    if (r20[r19] != r20[r113]) { $pc27 = 39; continue $sw27; }
                    r19 = r19 + 1;
                    r114 = r113 + 1;
                    if (r20[r19] != r20[r114]) { $pc27 = 39; continue $sw27; }
                    r19 = r19 + 1;
                    r115 = r114 + 1;
                    if (r20[r19] != r20[r115]) { $pc27 = 39; continue $sw27; }
                    r19 = r19 + 1;
                    r116 = r115 + 1;
                    if (r20[r19] != r20[r116]) { $pc27 = 39; continue $sw27; }
                    r19 = r19 + 1;
                    r117 = r116 + 1;
                    if (r20[r19] != r20[r117]) { $pc27 = 39; continue $sw27; }
                    r19 = r19 + 1;
                    r110 = r117 + 1;
                    if (r20[r19] != r20[r110]) { $pc27 = 39; continue $sw27; }
                    if (r19 < r7) { $pc27 = 22; continue $sw27; }
                    $pc27 = 39; continue $sw27;
                }
                case 39: {
                    r16 = 258 - (r7 - r19);
                    r21 = r7 - 258;
                    if (r16 <= r2) { $pc27 = 45; continue $sw27; }
                    this.P8 = r14;
                    if (r16 >= r5) { $pc27 = 51; continue $sw27; }
                    r22 = this.QX;
                    r23 = r21 + r16;
                    r10 = r22[r23 - 1];
                    r11 = r22[r23];
                    r2 = r16;
                    $pc27 = 45; continue $sw27;
                }
                case 45: {
                    r1 = r21;
                    { $pc27 = 46; continue $sw27; }
                }
                case 5: {
                    r4 = 0;
                    { $pc27 = 6; continue $sw27; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
