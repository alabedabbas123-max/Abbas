package com.jcraft.jsch;

public class SftpATTRS {
    long DW;
    int FH;
    int Hw;
    int VH;
    int Zo;
    java.lang.String[] gn;
    int j6;
    int v5;

    private SftpATTRS() {
        this.j6 = 0;
        this.gn = null;
    }

    static com.jcraft.jsch.SftpATTRS DW(com.jcraft.jsch.Buffer r6) {
        com.jcraft.jsch.SftpATTRS r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new com.jcraft.jsch.SftpATTRS();
                    r0.j6 = r6.FH();
                    if ((r0.j6 & 1) == 0) { $pc0 = 6; continue $sw0; }
                    r0.DW = r6.v5();
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if ((r0.j6 & 2) == 0) { $pc0 = 9; continue $sw0; }
                    r0.FH = r6.FH();
                    r0.Hw = r6.FH();
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if ((r0.j6 & 4) == 0) { $pc0 = 12; continue $sw0; }
                    r0.v5 = r6.FH();
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if ((r0.j6 & 8) == 0) { $pc0 = 15; continue $sw0; }
                    r0.Zo = r6.FH();
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    if ((r0.j6 & 8) == 0) { $pc0 = 18; continue $sw0; }
                    r0.VH = r6.FH();
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if ((r0.j6 & Integer.MIN_VALUE) == 0) { $pc0 = 25; continue $sw0; }
                    r1 = r6.FH();
                    if (r1 <= 0) { $pc0 = 25; continue $sw0; }
                    r0.gn = new java.lang.String[r1 * 2];
                    r2 = 0;
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    if (r2 >= r1) { $pc0 = 25; continue $sw0; }
                    r4 = r2 * 2;
                    r0.gn[r4] = com.jcraft.jsch.Util.j6(r6.tp());
                    r0.gn[r4 + 1] = com.jcraft.jsch.Util.j6(r6.tp());
                    r2 = r2 + 1;
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(int r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((this.j6 & 4) != 0) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    if ((this.v5 & 61440) != r3) { $pc1 = 10; continue $sw1; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.Hw;
    }

    public int FH() {
        return this.VH;
    }

    public java.lang.String Hw() {
        return new java.util.Date(((long) this.VH) * 1000).toString();
    }

    public int VH() {
        return this.FH;
    }

    public long Zo() {
        return this.DW;
    }

    public boolean gn() {
        return j6(16384);
    }

    public int j6() {
        return this.j6;
    }

    void j6(com.jcraft.jsch.Buffer r5) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r5.FH(this.j6);
                    if ((this.j6 & 1) == 0) { $pc2 = 6; continue $sw2; }
                    r5.j6(this.DW);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if ((this.j6 & 2) == 0) { $pc2 = 9; continue $sw2; }
                    r5.FH(this.FH);
                    r5.FH(this.Hw);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if ((this.j6 & 4) == 0) { $pc2 = 12; continue $sw2; }
                    r5.FH(this.v5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if ((this.j6 & 8) == 0) { $pc2 = 15; continue $sw2; }
                    r5.FH(this.Zo);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    if ((this.j6 & 8) == 0) { $pc2 = 18; continue $sw2; }
                    r5.FH(this.VH);
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    if ((this.j6 & Integer.MIN_VALUE) == 0) { $pc2 = 25; continue $sw2; }
                    r0 = this.gn.length / 2;
                    if (r0 <= 0) { $pc2 = 27; continue $sw2; }
                    r1 = 0;
                    $pc2 = 22; continue $sw2;
                }
                case 22: {
                    if (r1 >= r0) { $pc2 = 28; continue $sw2; }
                    r3 = r1 * 2;
                    r5.Hw(com.jcraft.jsch.Util.FH(this.gn[r3]));
                    r5.Hw(com.jcraft.jsch.Util.FH(this.gn[r3 + 1]));
                    r1 = r1 + 1;
                    { $pc2 = 22; continue $sw2; }
                }
                case 28: {
                    return;
                }
                case 27: {
                    return;
                }
                case 25: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(v5()) + " " + VH() + " " + DW() + " " + Zo() + " " + Hw();
    }

    int tp() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((this.j6 & 1) == 0) { $pc3 = 5; continue $sw3; }
                    r0 = 12;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if ((this.j6 & 2) == 0) { $pc3 = 10; continue $sw3; }
                    r0 = r0 + 8;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    if ((this.j6 & 4) == 0) { $pc3 = 13; continue $sw3; }
                    r0 = r0 + 4;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if ((this.j6 & 8) == 0) { $pc3 = 16; continue $sw3; }
                    r0 = r0 + 8;
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    if ((this.j6 & Integer.MIN_VALUE) == 0) { $pc3 = 23; continue $sw3; }
                    r0 = r0 + 4;
                    r2 = this.gn.length / 2;
                    if (r2 <= 0) { $pc3 = 23; continue $sw3; }
                    r3 = 0;
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    if (r3 >= r2) { $pc3 = 23; continue $sw3; }
                    r5 = r3 * 2;
                    r0 = (((r0 + 4) + this.gn[r5].length()) + 4) + this.gn[r5 + 1].length();
                    r3 = r3 + 1;
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    return r0;
                }
                case 5: {
                    r0 = 4;
                    { $pc3 = 7; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean u7() {
        return j6(40960);
    }

    public java.lang.String v5() {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuffer(10);
                    if (gn() == false) { $pc4 = 6; continue $sw4; }
                    r0.append('d');
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if ((this.v5 & 256) == 0) { $pc4 = 12; continue $sw4; }
                    r0.append('r');
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    if ((this.v5 & 128) == 0) { $pc4 = 16; continue $sw4; }
                    r0.append('w');
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    r1 = this.v5;
                    if ((r1 & 2048) == 0) { $pc4 = 21; continue $sw4; }
                    r0.append('s');
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    if ((this.v5 & 32) == 0) { $pc4 = 27; continue $sw4; }
                    r0.append('r');
                    $pc4 = 29; continue $sw4;
                }
                case 29: {
                    if ((this.v5 & 16) == 0) { $pc4 = 31; continue $sw4; }
                    r0.append('w');
                    $pc4 = 32; continue $sw4;
                }
                case 32: {
                    r2 = this.v5;
                    if ((r2 & 1024) == 0) { $pc4 = 36; continue $sw4; }
                    r0.append('s');
                    $pc4 = 40; continue $sw4;
                }
                case 40: {
                    if ((this.v5 & 4) == 0) { $pc4 = 42; continue $sw4; }
                    r0.append('r');
                    $pc4 = 44; continue $sw4;
                }
                case 44: {
                    if ((this.v5 & 2) == 0) { $pc4 = 46; continue $sw4; }
                    r0.append('w');
                    $pc4 = 48; continue $sw4;
                }
                case 48: {
                    if ((this.v5 & 1) == 0) { $pc4 = 50; continue $sw4; }
                    r0.append('x');
                    $pc4 = 52; continue $sw4;
                }
                case 52: {
                    return r0.toString();
                }
                case 50: {
                    r0.append('-');
                    { $pc4 = 52; continue $sw4; }
                }
                case 46: {
                    r0.append('-');
                    { $pc4 = 48; continue $sw4; }
                }
                case 42: {
                    r0.append('-');
                    { $pc4 = 44; continue $sw4; }
                }
                case 36: {
                    if ((r2 & 8) == 0) { $pc4 = 38; continue $sw4; }
                    r0.append('x');
                    { $pc4 = 40; continue $sw4; }
                }
                case 38: {
                    r0.append('-');
                    { $pc4 = 40; continue $sw4; }
                }
                case 31: {
                    r0.append('-');
                    { $pc4 = 32; continue $sw4; }
                }
                case 27: {
                    r0.append('-');
                    { $pc4 = 29; continue $sw4; }
                }
                case 21: {
                    if ((r1 & 64) == 0) { $pc4 = 23; continue $sw4; }
                    r0.append('x');
                    { $pc4 = 25; continue $sw4; }
                }
                case 23: {
                    r0.append('-');
                    { $pc4 = 25; continue $sw4; }
                }
                case 16: {
                    r0.append('-');
                    { $pc4 = 17; continue $sw4; }
                }
                case 12: {
                    r0.append('-');
                    { $pc4 = 14; continue $sw4; }
                }
                case 6: {
                    if (u7() == false) { $pc4 = 8; continue $sw4; }
                    r0.append('l');
                    { $pc4 = 10; continue $sw4; }
                }
                case 8: {
                    r0.append('-');
                    { $pc4 = 10; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
