package abcd;

public class TC {
    private static final abcd.TC[] DW = null;
    private static final java.util.Comparator<abcd.TC> FH = null;
    private static final byte[] j6 = null;
    private abcd.TC Hw;
    private abcd.yE VH;
    private int Zo;
    private abcd.TC[] gn;
    private int u7;
    private byte[] v5;

    static {
        j6 = new byte[0];
        DW = new abcd.TC[0];
        FH = new abcd.SC();
    }

    TC() {
        this.v5 = j6;
        this.gn = DW;
        this.u7 = 0;
        this.Zo = -1;
    }

    private TC(abcd.TC r2, byte[] r3, int r4, int r5) {
        this.Hw = r2;
        this.v5 = new byte[r5];
        java.lang.System.arraycopy(r3, r4, this.v5, 0, r5);
        this.gn = DW;
        this.u7 = 0;
        this.Zo = -1;
    }

    TC(byte[] r7, abcd.EK r8, abcd.TC r9) {
        int r10 = 0;
        int r1 = 0;
        boolean r3 = false;
        int r2 = 0;
        int r11 = 0;
        int r4 = 0;
        java.util.Comparator<abcd.TC> r5 = null;
        abcd.TC[] r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Hw = r9;
                    r10 = abcd.IK.j6(r7, r8.j6, 0);
                    r1 = r8.j6;
                    r3 = true;
                    r2 = (r10 - r1) - 1;
                    if (r2 <= 0) { $pc0 = 5; continue $sw0; }
                    this.v5 = new byte[r2];
                    java.lang.System.arraycopy(r7, r1, this.v5, 0, r2);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.Zo = abcd.IK.j6(r7, r10, r8);
                    r11 = abcd.IK.j6(r7, r8.j6, r8);
                    r8.j6 = abcd.IK.j6(r7, r8.j6, '\n');
                    if (this.Zo < 0) { $pc0 = 9; continue $sw0; }
                    this.VH = abcd.yE.Hw(r7, r8.j6);
                    r8.j6 += 20;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r11 <= 0) { $pc0 = 21; continue $sw0; }
                    this.gn = new abcd.TC[r11];
                    r4 = 0;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r4 >= r11) { $pc0 = 12; continue $sw0; }
                    this.gn[r4] = new abcd.TC(r7, r8, this);
                    if (r3 == false) { $pc0 = 20; continue $sw0; }
                    if (r4 <= 0) { $pc0 = 20; continue $sw0; }
                    r5 = FH;
                    r6 = this.gn;
                    if (r5.compare(r6[r4 - 1], r6[r4]) <= 0) { $pc0 = 20; continue $sw0; }
                    r3 = false;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    r4 = r4 + 1;
                    { $pc0 = 11; continue $sw0; }
                }
                case 12: {
                    if (r3 == true) { $pc0 = 22; continue $sw0; }
                    java.util.Arrays.sort(this.gn, 0, r11, FH);
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    this.u7 = r11;
                    return;
                }
                case 21: {
                    this.gn = DW;
                    { $pc0 = 22; continue $sw0; }
                }
                case 5: {
                    this.v5 = j6;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int DW(abcd.QC[] r8, int r9, int r10, abcd.EE r11) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.QC r3 = null;
        byte[] r4 = null;
        abcd.TC r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Zo + r9;
                    r1 = 0;
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r9 >= r0) { $pc1 = 4; continue $sw1; }
                    r3 = r8[r9];
                    if (r3.VH() != 0) { $pc1 = 14; continue $sw1; }
                    r4 = r3.Hw;
                    if (r2 >= this.u7) { $pc1 = 12; continue $sw1; }
                    r5 = this.gn[r2];
                    if (r5.j6(r4, r10, r4.length) == false) { $pc1 = 12; continue $sw1; }
                    r5.j6(r8, r9, (r5.v5() + r10) + 1, r11);
                    r1 = r1 + abcd.mF.j6(abcd.AbstractrE.j6, r5.v5());
                    r9 = r9 + r5.Zo;
                    r2 = r2 + 1;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r1 = r1 + abcd.mF.j6(r3.j6(), r4.length - r10);
                    r9 = r9 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 14: {
                    throw new abcd.zD(r3);
                }
                case 4: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(int r5) {
        int r0 = 0;
        abcd.TC[] r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.u7 - 1;
                    this.u7 = r0;
                    if (r5 >= r0) { $pc2 = 5; continue $sw2; }
                    r1 = this.gn;
                    java.lang.System.arraycopy(r1, r5 + 1, r1, r5, r0 - r5);
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    this.gn[r0] = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(byte[] r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r3.length;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r4 >= r0) { $pc3 = 4; continue $sw3; }
                    if (r3[r4] == 47) { $pc3 = 8; continue $sw3; }
                    r4 = r4 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 8: {
                    return r4;
                }
                case 4: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(byte[] r7, int r8, abcd.TC r9) {
        byte[] r10 = null;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r9 != null) { $pc4 = 5; continue $sw4; }
                    return -1;
                }
                case 5: {
                    r10 = r9.v5;
                    r1 = r7.length;
                    r2 = r10.length;
                    r4 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r8 >= r1) { $pc4 = 13; continue $sw4; }
                    if (r4 >= r2) { $pc4 = 13; continue $sw4; }
                    r5 = (r7[r8] & 255) - (r10[r4] & 255);
                    if (r5 != 0) { $pc4 = 11; continue $sw4; }
                    r8 = r8 + 1;
                    r4 = r4 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 11: {
                    return r5;
                }
                case 13: {
                    if (r4 != r2) { $pc4 = 19; continue $sw4; }
                    if (r7[r8] != 47) { $pc4 = 23; continue $sw4; }
                    return 0;
                }
                case 23: {
                    return -1;
                }
                case 19: {
                    return r1 - r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r5, abcd.TC r6) {
        abcd.TC[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.TC[] r3 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.gn;
                    r1 = this.u7;
                    if ((r1 + 1) > r0.length) { $pc5 = 8; continue $sw5; }
                    if (r5 >= r1) { $pc5 = 6; continue $sw5; }
                    java.lang.System.arraycopy(r0, r5, r0, r5 + 1, r1 - r5);
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r0[r5] = r6;
                    this.u7++;
                    return;
                }
                case 8: {
                    r2 = r0.length;
                    r3 = new abcd.TC[r2 + 1];
                    if (r5 <= 0) { $pc5 = 11; continue $sw5; }
                    java.lang.System.arraycopy(r0, 0, r3, 0, r5);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    r3[r5] = r6;
                    if (r5 >= r2) { $pc5 = 14; continue $sw5; }
                    java.lang.System.arraycopy(r0, r5, r3, r5 + 1, r2 - r5);
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    this.gn = r3;
                    this.u7++;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(byte[] r3, byte[] r4, int r5) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r4.length >= r5) { $pc6 = 5; continue $sw6; }
                    return false;
                }
                case 5: {
                    r5 = r5 - 1;
                    if (r5 < 0) { $pc6 = 7; continue $sw6; }
                    if (r3[r5] == r4[r5]) { $pc6 = 5; continue $sw6; }
                    return false;
                }
                case 7: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[] j6(abcd.TC r0) {
        return r0.v5;
    }

    public int DW() {
        return this.Zo;
    }

    abcd.yE FH() {
        return this.VH;
    }

    public boolean Hw() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.VH == null) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6() {
        return this.u7;
    }

    public abcd.TC j6(int r2) {
        return this.gn[r2];
    }

    abcd.yE j6(abcd.QC[] r11, int r12, int r13, abcd.EE r14) {
        int r0 = 0;
        abcd.mF r8 = null;
        int r9 = 0;
        abcd.QC r1 = null;
        byte[] r2 = null;
        abcd.TC r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.VH != null) { $pc8 = 14; continue $sw8; }
                    r0 = this.Zo + r12;
                    r8 = new abcd.mF(DW(r11, r12, r13, r14));
                    r9 = 0;
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    if (r12 >= r0) { $pc8 = 6; continue $sw8; }
                    r1 = r11[r12];
                    r2 = r1.Hw;
                    if (r9 >= this.u7) { $pc8 = 12; continue $sw8; }
                    r3 = this.gn[r9];
                    if (r3.j6(r2, r13, r2.length) == false) { $pc8 = 12; continue $sw8; }
                    r8.j6(r3.v5, abcd.AbstractrE.j6, r3.VH);
                    r12 = r12 + r3.Zo;
                    r9 = r9 + 1;
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    r8.j6(r2, r13, r2.length - r13, r1.j6(), r1.gn(), r1.u7());
                    r12 = r12 + 1;
                    { $pc8 = 5; continue $sw8; }
                }
                case 6: {
                    this.VH = r14.j6(r8);
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    return this.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(byte[] r4, java.io.OutputStream r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r6 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r4.length - 1;
                    r4[r0] = 10;
                    r1 = abcd.IK.FH(r4, r0, this.u7) - 1;
                    r4[r1] = 32;
                    if (Hw() == false) { $pc9 = 5; continue $sw9; }
                    r2 = this.Zo;
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    r3 = abcd.IK.FH(r4, r1, r2) - 1;
                    r6 = 0;
                    r4[r3] = 0;
                    r5.write(this.v5);
                    r5.write(r4, r3, r4.length - r3);
                    if (Hw() == false) { $pc9 = 10; continue $sw9; }
                    this.VH.DW(r4, 0);
                    r5.write(r4, 0, 20);
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    if (r6 >= this.u7) { $pc9 = 11; continue $sw9; }
                    this.gn[r6].j6(r4, r5);
                    r6 = r6 + 1;
                    { $pc9 = 10; continue $sw9; }
                }
                case 11: {
                    return;
                }
                case 5: {
                    r2 = -1;
                    { $pc9 = 6; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.QC[] r6, int r7, int r8, int r9) {
        int r0 = 0;
        byte[] r1 = null;
        byte[] r2 = null;
        abcd.TC r3 = null;
        int r4 = 0;
        int r5 = 0;
        abcd.TC r10 = null;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.Zo < 0) { $pc10 = 5; continue $sw10; }
                    return;
                }
                case 5: {
                    r0 = 0;
                    this.Zo = 0;
                    if (r7 != 0) { $pc10 = 8; continue $sw10; }
                    return;
                }
                case 8: {
                    r1 = r6[r8].Hw;
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    if (r8 >= r7) { $pc10 = 15; continue $sw10; }
                    r2 = r6[r8].Hw;
                    if (r9 <= 0) { $pc10 = 20; continue $sw10; }
                    if (j6(r1, r2, r9) == false) { $pc10 = 15; continue $sw10; }
                    $pc10 = 20; continue $sw10;
                }
                case 20: {
                    if (r0 >= this.u7) { $pc10 = 22; continue $sw10; }
                    r3 = this.gn[r0];
                    $pc10 = 23; continue $sw10;
                }
                case 23: {
                    r4 = j6(r2, r9, r3);
                    if (r4 > 0) { $pc10 = 25; continue $sw10; }
                    if (r4 >= 0) { $pc10 = 31; continue $sw10; }
                    r5 = j6(r2, r9);
                    if (r5 < 0) { $pc10 = 29; continue $sw10; }
                    r10 = new abcd.TC(this, r2, r9, r5 - r9);
                    j6(r0, r10);
                    r3 = r10;
                    { $pc10 = 31; continue $sw10; }
                }
                case 29: {
                    r8 = r8 + 1;
                    this.Zo++;
                    $pc10 = 31; continue $sw10;
                }
                case 31: {
                    r3.j6(r6, r7, r8, (r3.v5() + r9) + 1);
                    r11 = r3.Zo;
                    r8 = r8 + r11;
                    this.Zo += r11;
                    r0 = r0 + 1;
                    { $pc10 = 9; continue $sw10; }
                }
                case 25: {
                    DW(r0);
                    { $pc10 = 9; continue $sw10; }
                }
                case 22: {
                    r3 = null;
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    r12 = this.u7;
                    if (r0 >= r12) { $pc10 = 17; continue $sw10; }
                    DW(r12 - 1);
                    { $pc10 = 15; continue $sw10; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final boolean j6(byte[] r7, int r8, int r9) {
        byte[] r0 = null;
        int r1 = 0;
        int r3 = 0;
        int r10 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.v5;
                    r1 = r0.length;
                    r3 = r8;
                    r10 = 0;
                    $pc11 = 3; continue $sw11;
                }
                case 3: {
                    if (r10 >= r1) { $pc11 = 10; continue $sw11; }
                    if (r3 >= r9) { $pc11 = 10; continue $sw11; }
                    if (r0[r10] != r7[r3]) { $pc11 = 8; continue $sw11; }
                    r10 = r10 + 1;
                    r3 = r3 + 1;
                    { $pc11 = 3; continue $sw11; }
                }
                case 8: {
                    return false;
                }
                case 10: {
                    if (r3 != r9) { $pc11 = 13; continue $sw11; }
                    return false;
                }
                case 13: {
                    if (r7[r3] != 47) { $pc11 = 16; continue $sw11; }
                    return true;
                }
                case 16: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final int v5() {
        return this.v5.length;
    }
}
