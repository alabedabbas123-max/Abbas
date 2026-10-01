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
        this.FH.u7 = null;
        if (r8 != (-1)) goto L6;
        r8 = 6;
    L6:
        if (r10 >= 0) goto L8;
        int r4 = 0;
        r10 = -r10;
    L11:
        if (r11 >= 1) goto L13;
        return -2;
    L13:
        if (r11 <= 9) goto L15;
        return -2;
    L15:
        if (r9 != 8) goto L28;
        if (r10 < 9) goto L29;
        if (r10 > 15) goto L30;
        if (r8 < 0) goto L31;
        if (r8 > 9) goto L32;
        if (r12 < 0) goto L33;
        if (r12 > 2) goto L34;
        this.FH.tp = this;
        this.u7 = r4;
        this.J8 = r10;
        this.J0 = 1 << this.J8;
        int r13 = this.J0;
        this.Ws = r13 - 1;
        this.a8 = r11 + 7;
        int r1 = this.a8;
        this.U2 = 1 << r1;
        int r2 = this.U2;
        this.lg = r2 - 1;
        this.rN = ((r1 + 3) - 1) / 3;
        this.QX = new byte[r13 * 2];
        this.aM = new short[r13];
        this.j3 = new short[r2];
        this.lp = 1 << (r11 + 6);
        int r14 = this.lp;
        this.v5 = new byte[r14 * 3];
        this.Zo = r14 * 3;
        this.br = r14;
        this.aj = new byte[r14];
        this.ro = r8;
        this.cn = r12;
        this.EQ = (byte) r9;
        return gn();
    L34:
        return -2;
    L33:
        return -2;
    L32:
        return -2;
    L31:
        return -2;
    L30:
        return -2;
    L29:
        return -2;
    L28:
        return -2;
    L8:
        if (r10 <= 15) goto L10;
        r10 = r10 - 16;
        this.FH.J0 = new abcd.Ey();
        r4 = 2;
        goto L11
    L10:
        r4 = 1;
        goto L11
    }

    static boolean j6(short[] r2, int r3, int r4, byte[] r5) {
        short r0 = r2[r3 * 2];
        short r6 = r2[r4 * 2];
        if (r0 < r6) goto L9;
        if (r0 == r6) goto L6;
        return false;
    L6:
        if (r5[r3] <= r5[r4]) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
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
    L4:
        if (this.ei >= 262) goto L25;
        u7();
        if (this.ei >= 262) goto L10;
        if (r14 != 0) goto L10;
        return 0;
    L10:
        if (this.ei != 0) goto L25;
        if (r14 != 4) goto L14;
        boolean r2 = true;
    L15:
        j6(r2);
        if (this.FH.VH != 0) goto L20;
        if (r14 != 4) goto L19;
        return 2;
    L19:
        return 0;
    L20:
        if (r14 == 4) goto L59;
        return 1;
    L59:
        return 3;
    L14:
        r2 = false;
    L25:
        if (this.ei < 3) goto L28;
        int r3 = this.Mr << this.rN;
        byte[] r4 = this.QX;
        int r8 = this.vy;
        this.Mr = (r3 ^ (r4[r8 + 2] & 255)) & this.lg;
        short[] r5 = this.j3;
        int r6 = this.Mr;
        int r9 = r5[r6] & 65535;
        this.aM[this.Ws & r8] = r5[r6];
        r5[r6] = (short) r8;
        r1 = r9;
    L28:
        if (r1 != 0) goto L30;
    L34:
        int r7 = this.yS;
        if (r7 < 3) goto L45;
        boolean r10 = j6(this.vy - this.P8, r7 - 3);
        int r11 = this.ei;
        int r12 = this.yS;
        this.ei = r11 - r12;
        if (r12 <= this.KD) goto L39;
    L44:
        this.vy += this.yS;
        this.yS = 0;
        byte[] r13 = this.QX;
        int r15 = this.vy;
        this.Mr = r13[r15] & 255;
        this.Mr = ((r13[r15 + 1] & 255) ^ (this.Mr << this.rN)) & this.lg;
    L46:
        if (r10 == false) goto L4;
        j6(false);
        if (this.FH.VH != 0) goto L4;
        return 0;
    L39:
        if (this.ei < 3) goto L44;
        this.yS = r12 - 1;
    L41:
        this.vy++;
        int r16 = this.Mr << this.rN;
        byte[] r17 = this.QX;
        int r18 = this.vy;
        this.Mr = (r16 ^ (r17[r18 + 2] & 255)) & this.lg;
        short[] r19 = this.j3;
        int r20 = this.Mr;
        int r21 = r19[r20] & 65535;
        this.aM[this.Ws & r18] = r19[r20];
        r19[r20] = (short) r18;
        int r22 = this.yS - 1;
        this.yS = r22;
        if (r22 != 0) goto L41;
        this.vy = r18 + 1;
        r1 = r21;
        goto L46
    L45:
        r10 = j6(0, this.QX[this.vy] & 255);
        this.ei--;
        this.vy++;
        goto L46
    L30:
        if (((this.vy - r1) & 65535) > (this.J0 - 262)) goto L34;
        if (this.cn == 2) goto L34;
        this.yS = v5(r1);
        goto L34
    }

    int DW(int r7, int r8) {
        return j6(r7, 8, r8, 8, 0);
    }

    void DW() {
        int r0 = this.wc;
        if (r0 != 16) goto L6;
        VH(this.jJ);
        this.jJ = 0;
        this.wc = 0;
        return;
    L6:
        if (r0 < 8) goto L10;
        j6((byte) this.jJ);
        this.jJ = (short) (this.jJ >>> 8);
        this.wc -= 8;
        return;
    }

    void DW(int r2, int r3, boolean r4) {
        FH((r4 ? 1 : 0) + 0, 3);
        FH(r2, r3, true);
    }

    void DW(short[] r14, int r15) {
        short r1 = r14[1];
        if (r1 != 0) goto L5;
        int r6 = 138;
        int r7 = 3;
    L6:
        r14[((r15 + 1) * 2) + 1] = -1;
        int r9 = r6;
        int r10 = r7;
        int r8 = 0;
        short r11 = -1;
        r11 = r1;
        int r2 = 0;
    L7:
        if (r2 > r15) goto L8;
        r2 = r2 + 1;
        short r12 = r14[(r2 * 2) + 1];
        r8 = r8 + 1;
        if (r8 >= r9) goto L13;
        if (r11 != r12) goto L13;
    L29:
        r11 = r12;
    L13:
        if (r8 >= r10) goto L15;
        short[] r13 = this.ef;
        int r16 = r11 * 2;
        r13[r16] = (short) (r13[r16] + r8);
    L23:
        if (r12 != 0) goto L26;
        r8 = 0;
        r9 = 138;
    L25:
        r10 = 3;
        goto L29
    L26:
        if (r11 != r12) goto L28;
        r8 = 0;
        r9 = 6;
        goto L25
    L28:
        r11 = r11;
        r8 = 0;
        r9 = 7;
        r10 = 4;
        goto L29
    L15:
        if (r11 == 0) goto L20;
        if (r11 == r11) goto L18;
        short[] r17 = this.ef;
        int r18 = r11 * 2;
        r17[r18] = (short) (r17[r18] + 1);
    L18:
        short[] r19 = this.ef;
        r19[32] = (short) (r19[32] + 1);
        goto L23
    L20:
        if (r8 > 10) goto L22;
        short[] r20 = this.ef;
        r20[34] = (short) (r20[34] + 1);
        goto L23
    L22:
        short[] r21 = this.ef;
        r21[36] = (short) (r21[36] + 1);
        goto L23
    L8:
        return;
    L5:
        r6 = 7;
        r7 = 4;
        goto L6
    }

    void EQ() {
        int r1 = 0;
    L4:
        if (r1 >= 286) goto L5;
        this.dx[r1 * 2] = 0;
        r1 = r1 + 1;
        goto L4
    L5:
        int r2 = 0;
    L7:
        if (r2 >= 30) goto L8;
        this.sG[r2 * 2] = 0;
        r2 = r2 + 1;
        goto L7
    L8:
        int r3 = 0;
    L10:
        if (r3 >= 19) goto L11;
        this.ef[r3 * 2] = 0;
        r3 = r3 + 1;
        goto L10
    L11:
        this.dx[512(0x200, float:7.17E-43)] = 1;
        this.kQ = 0;
        this.XX = 0;
        this.yO = 0;
        this.OW = 0;
    }

    int FH(int r14) {
        int r1 = 0;
    L4:
        if (this.ei >= 262) goto L28;
        u7();
        if (this.ei >= 262) goto L10;
        if (r14 != 0) goto L10;
        return 0;
    L10:
        if (this.ei != 0) goto L28;
        if (this.BT == 0) goto L15;
        j6(0, this.QX[this.vy - 1] & 255);
        this.BT = 0;
    L15:
        if (r14 != 4) goto L17;
        boolean r2 = true;
    L18:
        j6(r2);
        if (this.FH.VH != 0) goto L23;
        if (r14 != 4) goto L22;
        return 2;
    L22:
        return 0;
    L23:
        if (r14 == 4) goto L88;
        return 1;
    L88:
        return 3;
    L17:
        r2 = false;
    L28:
        if (this.ei < 3) goto L30;
        int r3 = this.Mr << this.rN;
        byte[] r4 = this.QX;
        int r8 = this.vy;
        this.Mr = (r3 ^ (r4[r8 + 2] & 255)) & this.lg;
        short[] r5 = this.j3;
        int r6 = this.Mr;
        int r9 = r5[r6] & 65535;
        this.aM[this.Ws & r8] = r5[r6];
        r5[r6] = (short) r8;
        r1 = r9;
    L30:
        this.nw = this.yS;
        this.gW = this.P8;
        this.yS = 2;
        if (r1 != 0) goto L33;
    L47:
        int r7 = this.nw;
        if (r7 < 3) goto L63;
        if (this.yS > r7) goto L63;
        int r10 = this.vy;
        int r11 = (this.ei + r10) - 3;
        boolean r12 = j6((r10 - 1) - this.gW, r7 - 3);
        int r13 = this.ei;
        int r15 = this.nw;
        this.ei = r13 - (r15 - 1);
        this.nw = r15 - 2;
    L52:
        int r16 = this.vy + 1;
        this.vy = r16;
        if (r16 > r11) goto L55;
        int r17 = this.Mr << this.rN;
        byte[] r18 = this.QX;
        int r19 = this.vy;
        this.Mr = (r17 ^ (r18[r19 + 2] & 255)) & this.lg;
        short[] r20 = this.j3;
        int r21 = this.Mr;
        int r22 = r20[r21] & 65535;
        this.aM[this.Ws & r19] = r20[r21];
        r20[r21] = (short) r19;
        r1 = r22;
    L55:
        int r23 = this.nw - 1;
        this.nw = r23;
        if (r23 != 0) goto L52;
        this.BT = 0;
        this.yS = 2;
        this.vy++;
        if (r12 == false) goto L4;
        j6(false);
        if (this.FH.VH != 0) goto L4;
        return 0;
    L63:
        if (this.BT != 0) goto L65;
        this.BT = 1;
        this.vy++;
        this.ei--;
        goto L4
    L65:
        if (j6(0, this.QX[this.vy - 1] & 255) == false) goto L67;
        j6(false);
    L67:
        this.vy++;
        this.ei--;
        if (this.FH.VH != 0) goto L4;
        return 0;
    L33:
        if (this.nw >= this.KD) goto L47;
        if (((this.vy - r1) & 65535) > (this.J0 - 262)) goto L47;
        if (this.cn == 2) goto L39;
        this.yS = v5(r1);
    L39:
        int r24 = this.yS;
        if (r24 > 5) goto L47;
        if (this.cn == 1) goto L46;
        if (r24 != 3) goto L47;
        if ((this.vy - this.P8) <= 4096) goto L47;
    L46:
        this.yS = 2;
        goto L47
    }

    void FH() {
        int r0 = this.wc;
        if (r0 <= 8) goto L5;
        VH(this.jJ);
    L7:
        this.jJ = 0;
        this.wc = 0;
        return;
    L5:
        if (r0 <= 0) goto L7;
        j6((byte) this.jJ);
        goto L7
    }

    void FH(int r4, int r5) {
        int r0 = this.wc;
        if (r0 <= (16 - r5)) goto L5;
        this.jJ = (short) (((r4 << r0) & 65535) | this.jJ);
        VH(this.jJ);
        int r1 = this.wc;
        this.jJ = (short) (r4 >>> (16 - r1));
        this.wc = r1 + (r5 - 16);
        return;
    L5:
        this.jJ = (short) (((r4 << r0) & 65535) | this.jJ);
        this.wc = r0 + r5;
    }

    void FH(int r2, int r3, boolean r4) {
        FH();
        this.XG = 8;
        if (r4 == false) goto L5;
        VH((short) r3);
        VH((short) (r3 ^ (-1)));
    L5:
        j6(this.QX, r2, r3);
    }

    void FH(short[] r17, int r18) {
        short r2 = r17[1];
        if (r2 != 0) goto L5;
        int r7 = 138;
        int r8 = 3;
    L6:
        int r12 = r7;
        int r13 = r8;
        int r9 = 0;
        int r11 = 0;
        short r14 = -1;
        r14 = r2;
    L7:
        if (r9 > r18) goto L8;
        r9 = r9 + 1;
        short r15 = r17[(r9 * 2) + 1];
        r11 = r11 + 1;
        if (r11 >= r12) goto L13;
        if (r14 != r15) goto L13;
    L31:
        r14 = r15;
    L13:
        if (r11 >= r13) goto L17;
    L14:
        j6(r14, this.ef);
        r11 = r11 - 1;
        if (r11 != 0) goto L14;
    L25:
        if (r15 != 0) goto L28;
        r11 = 0;
        r12 = 138;
    L27:
        r13 = 3;
        goto L31
    L28:
        if (r14 != r15) goto L30;
        r11 = 0;
        r12 = 6;
        goto L27
    L30:
        r14 = r14;
        r11 = 0;
        r12 = 7;
        r13 = 4;
        goto L31
    L17:
        if (r14 == 0) goto L22;
        if (r14 == r14) goto L20;
        j6(r14, this.ef);
        r11 = r11 - 1;
    L20:
        j6(16, this.ef);
        FH(r11 - 3, 2);
        goto L25
    L22:
        if (r11 > 10) goto L24;
        j6(17, this.ef);
        FH(r11 - 3, 3);
        goto L25
    L24:
        j6(18, this.ef);
        FH(r11 - 11, 7);
        goto L25
    L8:
        return;
    L5:
        r7 = 7;
        r8 = 4;
        goto L6
    }

    int Hw(int r5) {
        int r0 = this.Zo;
        int r2 = 65535;
        if (65535 <= (r0 - 5)) goto L6;
        r2 = r0 - 5;
    L6:
        if (this.ei > 1) goto L25;
        u7();
        if (this.ei != 0) goto L12;
        if (r5 != 0) goto L12;
        return 0;
    L12:
        if (this.ei != 0) goto L25;
        if (r5 != 4) goto L16;
        boolean r3 = true;
    L17:
        j6(r3);
        if (this.FH.VH != 0) goto L22;
        if (r5 != 4) goto L45;
        return 2;
    L45:
        return 0;
    L22:
        if (r5 != 4) goto L46;
        return 3;
    L46:
        return 1;
    L16:
        r3 = false;
    L25:
        this.vy += this.ei;
        this.ei = 0;
        int r1 = this.er + r2;
        int r4 = this.vy;
        if (r4 == 0) goto L28;
        if (r4 >= r1) goto L28;
    L32:
        if ((this.vy - this.er) < (this.J0 - 262)) goto L6;
        j6(false);
        if (this.FH.VH != 0) goto L6;
        return 0;
    L28:
        this.ei = this.vy - r1;
        this.vy = r1;
        j6(false);
        if (this.FH.VH != 0) goto L32;
        return 0;
    }

    void J0() {
        this.XL = this.J0 * 2;
        this.j3[this.U2 - 1] = 0;
        int r0 = 0;
    L4:
        if (r0 >= (this.U2 - 1)) goto L5;
        this.j3[r0] = 0;
        r0 = r0 + 1;
        goto L4
    L5:
        abcd.Gy.a[] r1 = j6;
        int r2 = this.ro;
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
    }

    void QX() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r1 >= 7) goto L5;
        r2 = r2 + this.dx[r1 * 2];
        r1 = r1 + 1;
        goto L4
    L5:
        int r3 = 0;
    L7:
        if (r1 >= 128) goto L9;
        r3 = r3 + this.dx[r1 * 2];
        r1 = r1 + 1;
    L9:
        if (r1 >= 256) goto L11;
        r2 = r2 + this.dx[r1 * 2];
        r1 = r1 + 1;
        goto L9
    L11:
        if (r2 > (r3 >>> 2)) goto L14;
        r0 = 1;
    L14:
        this.tp = (byte) r0;
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
        abcd.Gy r0 = (abcd.Gy) super.clone();
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
        abcd.Ny r1 = r0.Sf;
        r1.u7 = r0.dx;
        abcd.Ny r2 = r0.vJ;
        r2.u7 = r0.sG;
        abcd.Ny r3 = r0.g3;
        r3.u7 = r0.ef;
        abcd.Hy r4 = r0.et;
        if (r4 == null) goto L5;
        r0.et = (abcd.Hy) r4.clone();
    L5:
        return r0;
    }

    int gn() {
        abcd.Oy r0 = this.FH;
        r0.gn = 0;
        r0.Hw = 0;
        r0.u7 = null;
        r0.we = 2;
        this.gn = 0;
        this.VH = 0;
        int r1 = this.u7;
        if (r1 >= 0) goto L6;
        this.u7 = -r1;
    L6:
        if (this.u7 != 0) goto L8;
        int r2 = 113;
    L9:
        this.Hw = r2;
        this.FH.J0.reset();
        this.we = 0;
        XL();
        J0();
        return 0;
    L8:
        r2 = 42;
        goto L9
    }

    int j6(int r17) {
        if (r17 > 4) goto L110;
        if (r17 < 0) goto L110;
        abcd.Oy r4 = this.FH;
        if (r4.v5 != null) goto L9;
    L109:
        this.FH.u7 = DW[4];
        goto L110
    L9:
        if (r4.j6 != null) goto L13;
        if (r4.FH != 0) goto L109;
    L13:
        if (this.Hw != 666) goto L16;
        if (r17 != 4) goto L109;
    L16:
        abcd.Oy r2 = this.FH;
        if (r2.VH != 0) goto L20;
        r2.u7 = DW[7];
        return -5;
    L20:
        int r3 = this.we;
        this.we = r17;
        if (this.Hw != 42) goto L36;
        if (this.u7 != 2) goto L25;
        tp().j6(this);
        this.Hw = 113;
        this.FH.J0.reset();
        goto L36
    L25:
        int r5 = (((this.J8 - 8) << 4) + 8) << 8;
        int r14 = ((this.ro - 1) & 255) >> 1;
        if (r14 <= 3) goto L28;
        r14 = 3;
    L28:
        int r6 = r5 | (r14 << 6);
        if (this.vy == 0) goto L31;
        r6 = r6 | 32;
    L31:
        this.Hw = 113;
        Zo(r6 + (31 - (r6 % 31)));
        if (this.vy == 0) goto L34;
        long r15 = this.FH.J0.getValue();
        Zo((int) (r15 >>> 16));
        Zo((int) (65535 & r15));
    L34:
        this.FH.J0.reset();
    L36:
        if (this.gn == 0) goto L41;
        this.FH.j6();
        if (this.FH.VH != 0) goto L48;
        this.we = -1;
        return 0;
    L48:
        if (this.Hw != 666) goto L54;
        abcd.Oy r7 = this.FH;
        if (r7.FH == 0) goto L54;
        r7.u7 = DW[7];
        return -5;
    L54:
        if (this.FH.FH == 0) goto L56;
    L60:
        int r8 = j6[this.ro].v5;
        if (r8 == 0) goto L67;
        if (r8 == 1) goto L66;
        if (r8 == 2) goto L65;
        int r9 = -1;
    L68:
        if (r9 != 2) goto L70;
    L71:
        this.Hw = 666;
    L72:
        if (r9 == 0) goto L106;
        if (r9 == 2) goto L106;
        if (r9 != 1) goto L89;
        if (r17 != 1) goto L78;
        j6();
    L85:
        this.FH.j6();
        if (this.FH.VH != 0) goto L89;
        this.we = -1;
        return 0;
    L78:
        DW(0, 0, false);
        if (r17 != 3) goto L85;
        int r10 = 0;
    L82:
        if (r10 >= this.U2) goto L85;
        this.j3[r10] = 0;
        r10 = r10 + 1;
    L89:
        if (r17 == 4) goto L91;
        return 0;
    L91:
        int r1 = this.u7;
        if (r1 > 0) goto L94;
        return 1;
    L94:
        if (r1 != 2) goto L96;
        long r11 = this.FH.J0.getValue();
        j6((byte) (r11 & 255));
        j6((byte) ((r11 >> 8) & 255));
        j6((byte) ((r11 >> 16) & 255));
        j6((byte) ((r11 >> 24) & 255));
        j6((byte) (this.FH.Hw & 255));
        j6((byte) ((this.FH.Hw >> 8) & 255));
        j6((byte) ((this.FH.Hw >> 16) & 255));
        j6((byte) (255 & (this.FH.Hw >> 24)));
        tp().j6(r11);
    L97:
        this.FH.j6();
        int r12 = this.u7;
        if (r12 <= 0) goto L101;
        this.u7 = -r12;
    L101:
        if (this.gn != 0) goto L112;
        return 1;
    L112:
        return 0;
    L96:
        long r13 = this.FH.J0.getValue();
        Zo((int) (r13 >>> 16));
        Zo((int) (r13 & 65535));
    L106:
        if (this.FH.VH != 0) goto L108;
        this.we = -1;
    L108:
        return 0;
    L70:
        if (r9 != 3) goto L72;
    L65:
        r9 = FH(r17);
        goto L68
    L66:
        r9 = DW(r17);
        goto L68
    L67:
        r9 = Hw(r17);
        goto L68
    L56:
        if (this.ei != 0) goto L60;
        if (r17 == 0) goto L89;
        if (this.Hw == 666) goto L89;
    L41:
        abcd.Oy r16 = this.FH;
        if (r16.FH != 0) goto L48;
        if (r17 > r3) goto L48;
        if (r17 == 4) goto L48;
        r16.u7 = DW[7];
        return -5;
    L110:
        return -2;
    }

    void j6() {
        FH(2, 3);
        j6(256, abcd.My.j6);
        DW();
        if ((((this.XG + 1) + 10) - this.wc) >= 9) goto L5;
        FH(2, 3);
        j6(256, abcd.My.j6);
        DW();
    L5:
        this.XG = 7;
    }

    final void j6(byte r4) {
        byte[] r0 = this.v5;
        int r1 = this.gn;
        this.gn = r1 + 1;
        r0[r1] = r4;
    }

    void j6(int r4, int r5, int r6) {
        FH(r4 - 257, 5);
        int r7 = r5 - 1;
        FH(r7, 5);
        FH(r6 - 4, 4);
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L4;
        FH(this.ef[(abcd.Ny.Hw[r0] * 2) + 1], 3);
        r0 = r0 + 1;
        goto L3
    L4:
        FH(this.dx, r4 - 1);
        FH(this.sG, r7);
    }

    void j6(int r6, int r7, boolean r8) {
        if (this.ro > 0) goto L5;
        int r2 = r7 + 5;
        int r0 = 0;
        int r3 = r2;
    L12:
        if ((r7 + 4) <= r2) goto L14;
    L16:
        if (r3 != r2) goto L18;
        FH((r8 ? 1 : 0) + 2, 3);
        j6(abcd.My.j6, abcd.My.DW);
    L19:
        EQ();
        if (r8 == false) goto L23;
        FH();
        return;
    L23:
        return;
    L18:
        FH((r8 ? 1 : 0) + 4, 3);
        j6(this.Sf.tp + 1, this.vJ.tp + 1, r0 + 1);
        j6(this.dx, this.sG);
        goto L19
    L14:
        if (r6 == (-1)) goto L16;
        DW(r6, r7, r8);
        goto L19
    L5:
        if (this.tp != 2) goto L7;
        QX();
    L7:
        this.Sf.j6(this);
        this.vJ.j6(this);
        r0 = v5();
        r2 = ((this.XX + 3) + 7) >>> 3;
        r3 = ((this.kQ + 3) + 7) >>> 3;
        if (r3 > r2) goto L12;
        r2 = r3;
        goto L12
    }

    final void j6(int r3, short[] r4) {
        int r5 = r3 * 2;
        FH(r4[r5] & 65535, r4[r5 + 1] & 65535);
    }

    void j6(boolean r4) {
        int r0 = this.er;
        if (r0 >= 0) goto L6;
        r0 = -1;
    L6:
        j6(r0, this.vy - this.er, r4);
        this.er = this.vy;
        this.FH.j6();
    }

    final void j6(byte[] r3, int r4, int r5) {
        java.lang.System.arraycopy(r3, r4, this.v5, this.gn, r5);
        this.gn += r5;
    }

    void j6(short[] r8, int r9) {
        int r0 = this.ca[r9];
        int r1 = r9 << 1;
    L3:
        int r2 = this.x9;
        if (r1 > r2) goto L12;
        if (r1 >= r2) goto L11;
        int[] r3 = this.ca;
        int r4 = r1 + 1;
        if (j6(r8, r3[r4], r3[r1], this.sy) == false) goto L11;
        r1 = r4;
    L11:
        if (j6(r8, r0, this.ca[r1], this.sy) == true) goto L12;
        int[] r5 = this.ca;
        r5[r9] = r5[r1];
        int r6 = r1;
        r1 = r1 << 1;
        r9 = r6;
    L12:
        this.ca[r9] = r0;
    }

    void j6(short[] r7, short[] r8) {
        if (this.OW == 0) goto L16;
        int r0 = 0;
    L5:
        byte[] r1 = this.v5;
        int r2 = this.br;
        int r3 = r0 * 2;
        int r4 = (r1[(r2 + r3) + 1] & 255) | ((r1[r2 + r3] << 8) & 65280);
        int r5 = this.aj[r0] & 255;
        r0 = r0 + 1;
        if (r4 != 0) goto L8;
        j6(r5, r7);
    L15:
        if (r0 < this.OW) goto L5;
    L8:
        byte r6 = abcd.Ny.Zo[r5];
        j6((r6 + 256) + 1, r7);
        int r9 = abcd.Ny.j6[r6];
        if (r9 == 0) goto L11;
        FH(r5 - abcd.Ny.VH[r6], r9);
    L11:
        int r10 = r4 - 1;
        int r11 = abcd.Ny.j6(r10);
        j6(r11, r8);
        int r12 = abcd.Ny.DW[r11];
        if (r12 == 0) goto L15;
        FH(r10 - abcd.Ny.gn[r11], r12);
    L16:
        j6(256, r7);
        this.XG = r7[513(0x201, float:7.19E-43)];
    }

    boolean j6(int r13, int r14) {
        byte[] r0 = this.v5;
        int r1 = this.br;
        int r2 = this.OW;
        r0[(r2 * 2) + r1] = (byte) (r13 >>> 8);
        r0[(r1 + (r2 * 2)) + 1] = (byte) r13;
        this.aj[r2] = (byte) r14;
        this.OW = r2 + 1;
        if (r13 != 0) goto L5;
        short[] r15 = this.dx;
        int r16 = r14 * 2;
        r15[r16] = (short) (r15[r16] + 1);
    L6:
        int r17 = this.OW;
        if ((r17 & 8191) != 0) goto L20;
        if (this.ro <= 2) goto L20;
        int r18 = this.vy - this.er;
        int r3 = r17 * 8;
        int r19 = 0;
    L12:
        if (r19 >= 30) goto L13;
        r3 = (int) (((long) r3) + (((long) this.sG[r19 * 2]) * (((long) abcd.Ny.DW[r19]) + 5)));
        r19 = r19 + 1;
        goto L12
    L13:
        int r110 = r3 >>> 3;
        if (this.yO >= (this.OW / 2)) goto L20;
        if (r110 >= (r18 / 2)) goto L20;
        return true;
    L20:
        if (this.OW != (this.lp - 1)) goto L22;
        return true;
    L22:
        return false;
    L5:
        this.yO++;
        short[] r4 = this.dx;
        int r111 = ((abcd.Ny.Zo[r14] + 256) + 1) * 2;
        r4[r111] = (short) (r4[r111] + 1);
        short[] r112 = this.sG;
        int r113 = abcd.Ny.j6(r13 - 1) * 2;
        r112[r113] = (short) (r112[r113] + 1);
        goto L6
    }

    synchronized abcd.Hy tp() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.et != null) goto L6;
        this.et = new abcd.Hy();     // Catch: java.lang.Throwable -> L9
    L6:
        abcd.Hy r0 = this.et;     // Catch: java.lang.Throwable -> L9
        monitor-exit(this);
        return r0;
    }

    void u7() {
    L2:
        int r0 = this.XL;
        int r1 = this.ei;
        int r2 = this.vy;
        int r3 = (r0 - r1) - r2;
        if (r3 != 0) goto L8;
        if (r2 != 0) goto L8;
        if (r1 != 0) goto L8;
        r3 = this.J0;
    L27:
        abcd.Oy r4 = this.FH;
        if (r4.FH == 0) goto L29;
        this.ei += r4.j6(this.QX, this.vy + this.ei, r3);
        if (this.ei < 3) goto L34;
        byte[] r5 = this.QX;
        int r6 = this.vy;
        this.Mr = r5[r6] & 255;
        this.Mr = ((r5[r6 + 1] & 255) ^ (this.Mr << this.rN)) & this.lg;
    L34:
        if (this.ei >= 262) goto L37;
        if (this.FH.FH != 0) goto L2;
        return;
    L37:
        return;
    L29:
        return;
    L8:
        if (r3 != (-1)) goto L10;
        r3 = r3 - 1;
        goto L27
    L10:
        int r7 = this.vy;
        int r8 = this.J0;
        if (r7 < ((r8 + r8) - 262)) goto L27;
        byte[] r9 = this.QX;
        java.lang.System.arraycopy(r9, r8, r9, 0, r8);
        int r10 = this.P8;
        int r11 = this.J0;
        this.P8 = r10 - r11;
        this.vy -= r11;
        this.er -= r11;
        int r12 = this.U2;
        int r13 = r12;
    L13:
        short[] r14 = this.j3;
        r12 = r12 - 1;
        int r15 = r14[r12] & 65535;
        int r16 = this.J0;
        if (r15 < r16) goto L16;
        short r17 = (short) (r15 - r16);
    L17:
        r14[r12] = r17;
        r13 = r13 - 1;
        if (r13 != 0) goto L13;
        int r18 = this.J0;
        int r19 = r18;
    L20:
        short[] r20 = this.aM;
        r18 = r18 - 1;
        int r21 = r20[r18] & 65535;
        int r22 = this.J0;
        if (r21 < r22) goto L23;
        short r23 = (short) (r21 - r22);
    L24:
        r20[r18] = r23;
        r19 = r19 - 1;
        if (r19 != 0) goto L20;
        r3 = r3 + this.J0;
        goto L27
    L23:
        r23 = 0;
        goto L24
    L16:
        r17 = 0;
        goto L17
    }

    int v5() {
        DW(this.dx, this.Sf.tp);
        DW(this.sG, this.vJ.tp);
        this.g3.j6(this);
        int r0 = 18;
    L4:
        if (r0 < 3) goto L8;
        if (this.ef[(abcd.Ny.Hw[r0] * 2) + 1] != 0) goto L8;
        r0 = r0 - 1;
    L8:
        this.XX += ((((r0 + 1) * 3) + 5) + 5) + 4;
        return r0;
    }

    int v5(int r14) {
        int r0 = this.SI;
        int r1 = this.vy;
        int r2 = this.nw;
        int r3 = this.J0;
        if (r1 <= (r3 - 262)) goto L5;
        int r4 = r1 - (r3 - 262);
    L6:
        int r5 = this.cb;
        int r6 = this.Ws;
        int r7 = this.vy + 258;
        byte[] r8 = this.QX;
        int r9 = r1 + r2;
        byte r10 = r8[r9 - 1];
        byte r11 = r8[r9];
        if (this.nw < this.sh) goto L9;
        r0 = r0 >> 2;
    L9:
        int r12 = this.ei;
        if (r5 <= r12) goto L12;
        r5 = r12;
    L12:
        byte[] r13 = this.QX;
        int r15 = r14 + r2;
        if (r13[r15] == r11) goto L15;
    L46:
        r14 = this.aM[r14 & r6] & 65535;
        if (r14 <= r4) goto L50;
        r0 = r0 - 1;
        if (r0 != 0) goto L12;
    L50:
        int r16 = r2;
    L51:
        int r17 = this.ei;
        if (r16 > r17) goto L54;
        return r16;
    L54:
        return r17;
    L15:
        if (r13[r15 - 1] != r10) goto L46;
        if (r13[r14] != r13[r1]) goto L46;
        int r18 = r14 + 1;
        if (r13[r18] != r13[r1 + 1]) goto L46;
        int r19 = r1 + 2;
        int r110 = r18 + 1;
    L22:
        byte[] r20 = this.QX;
        r19 = r19 + 1;
        int r111 = r110 + 1;
        if (r20[r19] != r20[r111]) goto L39;
        r19 = r19 + 1;
        int r112 = r111 + 1;
        if (r20[r19] != r20[r112]) goto L39;
        r19 = r19 + 1;
        int r113 = r112 + 1;
        if (r20[r19] != r20[r113]) goto L39;
        r19 = r19 + 1;
        int r114 = r113 + 1;
        if (r20[r19] != r20[r114]) goto L39;
        r19 = r19 + 1;
        int r115 = r114 + 1;
        if (r20[r19] != r20[r115]) goto L39;
        r19 = r19 + 1;
        int r116 = r115 + 1;
        if (r20[r19] != r20[r116]) goto L39;
        r19 = r19 + 1;
        int r117 = r116 + 1;
        if (r20[r19] != r20[r117]) goto L39;
        r19 = r19 + 1;
        r110 = r117 + 1;
        if (r20[r19] != r20[r110]) goto L39;
        if (r19 < r7) goto L22;
    L39:
        r16 = 258 - (r7 - r19);
        int r21 = r7 - 258;
        if (r16 <= r2) goto L45;
        this.P8 = r14;
        if (r16 >= r5) goto L51;
        byte[] r22 = this.QX;
        int r23 = r21 + r16;
        r10 = r22[r23 - 1];
        r11 = r22[r23];
        r2 = r16;
    L45:
        r1 = r21;
        goto L46
    L5:
        r4 = 0;
        goto L6
    }
}
