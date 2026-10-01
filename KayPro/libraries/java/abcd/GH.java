package abcd;

public abstract class GH extends java.io.InputStream {
    private long DW;
    private int EQ;
    private long FH;
    private final byte[] Hw;
    private java.io.InputStream VH;
    private int Zo;
    private long gn;
    private final java.io.InputStream j6;
    private long tp;
    private int u7;
    private int v5;

    public GH(java.io.InputStream r7) {
        int r8 = 0;
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Hw = new byte[512];
                    this.j6 = r7;
                    if (j6(this.Hw.length) == false) { $pc0 = 12; continue $sw0; }
                    r8 = 0;
                    r0 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r1 = this.Hw;
                    r2 = this.v5;
                    this.v5 = r2 + 1;
                    r3 = r1[r2] & 255;
                    this.DW |= (long) ((r3 & 127) << r0);
                    r0 = r0 + 7;
                    if ((r3 & 128) != 0) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r4 = this.Hw;
                    r5 = this.v5;
                    this.v5 = r5 + 1;
                    r6 = r4[r5] & 255;
                    this.FH |= (long) ((r6 & 127) << r8);
                    r8 = r8 + 7;
                    if ((r6 & 128) != 0) { $pc0 = 7; continue $sw0; }
                    this.u7 = v5();
                    return;
                }
                case 12: {
                    throw new java.io.EOFException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int Hw() {
        return this.Zo - this.v5;
    }

    private void Zo() {
        java.io.InputStream r0 = null;
        long r1 = 0L;
        long r3 = 0L;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.VH;
                    if (r0 != null) { $pc1 = 9; continue $sw1; }
                    this.VH = FH();
                    if (j6() != this.DW) { $pc1 = 8; continue $sw1; }
                    abcd.BK.j6(this.VH, this.tp);
                    this.gn = this.tp;
                    return;
                }
                case 8: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().baseLengthIncorrect);
                }
                case 9: {
                    r1 = this.gn;
                    r3 = this.tp;
                    if (r1 >= r3) { $pc1 = 13; continue $sw1; }
                    abcd.BK.j6(r0, r3 - r1);
                    this.gn = this.tp;
                    return;
                }
                case 13: {
                    if (r1 <= r3) { $pc1 = 18; continue $sw1; }
                    r0.close();
                    this.VH = FH();
                    abcd.BK.j6(this.VH, this.tp);
                    this.gn = this.tp;
                    return;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(int r7) {
        int r0 = 0;
        java.io.InputStream r8 = null;
        byte[] r1 = null;
        int r3 = 0;
        int r9 = 0;
        byte[] r4 = null;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = Hw();
                    if (r7 >= r0) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if (r0 != 0) { $pc2 = 8; continue $sw2; }
                    this.v5 = 0;
                    this.Zo = 0;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r8 = this.j6;
                    r1 = this.Hw;
                    r3 = this.Zo;
                    r9 = r8.read(r1, r3, r1.length - r3);
                    if (r9 < 0) { $pc2 = 14; continue $sw2; }
                    this.Zo += r9;
                    if (this.Zo < this.Hw.length) { $pc2 = 11; continue $sw2; }
                    return true;
                }
                case 14: {
                    if (Hw() <= 0) { $pc2 = 16; continue $sw2; }
                    return true;
                }
                case 16: {
                    return false;
                }
                case 8: {
                    r4 = this.Hw;
                    r5 = r4.length;
                    r6 = this.v5;
                    if ((r5 - r6) >= r7) { $pc2 = 11; continue $sw2; }
                    java.lang.System.arraycopy(r4, r6, r4, 0, r0);
                    this.v5 = 0;
                    this.Zo = r0;
                    { $pc2 = 11; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int v5() {
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        long r5 = 0L;
        byte[] r6 = null;
        int r7 = 0;
        long r8 = 0L;
        byte[] r9 = null;
        int r10 = 0;
        long r11 = 0L;
        byte[] r12 = null;
        int r13 = 0;
        byte[] r14 = null;
        int r15 = 0;
        int r16 = 0;
        byte[] r17 = null;
        int r18 = 0;
        int r0 = 0;
        byte[] r19 = null;
        int r20 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (j6(8) == true) { $pc3 = 6; continue $sw3; }
                    return 2;
                }
                case 6: {
                    r1 = this.Hw;
                    r2 = this.v5;
                    this.v5 = r2 + 1;
                    r3 = r1[r2] & 255;
                    if ((r3 & 128) == 0) { $pc3 = 33; continue $sw3; }
                    this.tp = 0;
                    if ((r3 & 1) == 0) { $pc3 = 12; continue $sw3; }
                    r4 = this.v5;
                    this.v5 = r4 + 1;
                    this.tp = r1[r4] & 255;
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    if ((r3 & 2) == 0) { $pc3 = 15; continue $sw3; }
                    r5 = this.tp;
                    r6 = this.Hw;
                    r7 = this.v5;
                    this.v5 = r7 + 1;
                    this.tp = r5 | ((long) ((r6[r7] & 255) << 8));
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    if ((r3 & 4) == 0) { $pc3 = 18; continue $sw3; }
                    r8 = this.tp;
                    r9 = this.Hw;
                    r10 = this.v5;
                    this.v5 = r10 + 1;
                    this.tp = r8 | ((long) ((r9[r10] & 255) << 16));
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    if ((r3 & 8) == 0) { $pc3 = 20; continue $sw3; }
                    r11 = this.tp;
                    r12 = this.Hw;
                    r13 = this.v5;
                    this.v5 = r13 + 1;
                    this.tp = r11 | ((long) ((r12[r13] & 255) << 24));
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    this.EQ = 0;
                    if ((r3 & 16) == 0) { $pc3 = 24; continue $sw3; }
                    r14 = this.Hw;
                    r15 = this.v5;
                    this.v5 = r15 + 1;
                    this.EQ = r14[r15] & 255;
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    if ((r3 & 32) == 0) { $pc3 = 27; continue $sw3; }
                    r16 = this.EQ;
                    r17 = this.Hw;
                    r18 = this.v5;
                    this.v5 = r18 + 1;
                    this.EQ = ((r17[r18] & 255) << 8) | r16;
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    if ((r3 & 64) == 0) { $pc3 = 30; continue $sw3; }
                    r0 = this.EQ;
                    r19 = this.Hw;
                    r20 = this.v5;
                    this.v5 = r20 + 1;
                    this.EQ = r0 | ((r19[r20] & 255) << 16);
                    $pc3 = 30; continue $sw3;
                }
                case 30: {
                    if (this.EQ != 0) { $pc3 = 32; continue $sw3; }
                    this.EQ = 65536;
                    $pc3 = 32; continue $sw3;
                }
                case 32: {
                    return 0;
                }
                case 33: {
                    if (r3 == 0) { $pc3 = 37; continue $sw3; }
                    j6(r3);
                    this.EQ = r3;
                    return 1;
                }
                case 37: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long DW() {
        return this.FH;
    }

    protected abstract java.io.InputStream FH();

    @Override
    public void close() {
        java.io.InputStream r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    this.j6.close();
                    r0 = this.VH;
                    if (r0 == null) { $pc4 = 6; continue $sw4; }
                    r0.close();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract long j6();

    @Override
    public int read() {
        byte[] r1 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r1 = new byte[1];
                    if (read(r1, 0, 1) == 1) { $pc5 = 7; continue $sw5; }
                    return -1;
                }
                case 7: {
                    return r1[0] & 255;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r7, int r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r9 <= 0) { $pc6 = 4; continue $sw6; }
                    r1 = java.lang.Math.min(r9, this.EQ);
                    r2 = this.u7;
                    if (r2 != 0) { $pc6 = 8; continue $sw6; }
                    Zo();
                    r1 = this.VH.read(r7, r8, r1);
                    if (r1 < 0) { $pc6 = 25; continue $sw6; }
                    this.tp += (long) r1;
                    this.gn = this.tp;
                    $pc6 = 21; continue $sw6;
                }
                case 21: {
                    r0 = r0 + r1;
                    r8 = r8 + r1;
                    r9 = r9 - r1;
                    this.EQ -= r1;
                    if (this.EQ != 0) { $pc6 = 3; continue $sw6; }
                    this.u7 = v5();
                    { $pc6 = 3; continue $sw6; }
                }
                case 25: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().baseLengthIncorrect);
                }
                case 8: {
                    if (r2 != 1) { $pc6 = 10; continue $sw6; }
                    java.lang.System.arraycopy(this.Hw, this.v5, r7, r8, r1);
                    this.v5 += r1;
                    { $pc6 = 21; continue $sw6; }
                }
                case 10: {
                    if (r2 != 2) { $pc6 = 16; continue $sw6; }
                    if (r0 > 0) { $pc6 = 34; continue $sw6; }
                    return -1;
                }
                case 34: {
                    return r0;
                }
                case 16: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
                }
                case 4: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public long skip(long r9) {
        long r2 = 0L;
        long r4 = 0L;
        int r6 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r2 = 0;
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (0 >= r9) { $pc7 = 5; continue $sw7; }
                    r4 = java.lang.Math.min(r9, this.EQ);
                    r6 = this.u7;
                    if (r6 != 0) { $pc7 = 9; continue $sw7; }
                    this.tp += r4;
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    r2 = r2 + r4;
                    r9 = r9 - r4;
                    this.EQ = (int) (((long) this.EQ) - r4);
                    if (this.EQ != 0) { $pc7 = 4; continue $sw7; }
                    this.u7 = v5();
                    { $pc7 = 4; continue $sw7; }
                }
                case 9: {
                    if (r6 != 1) { $pc7 = 11; continue $sw7; }
                    this.v5 = (int) (((long) this.v5) + r4);
                    { $pc7 = 17; continue $sw7; }
                }
                case 11: {
                    if (r6 != 2) { $pc7 = 14; continue $sw7; }
                    return r2;
                }
                case 14: {
                    throw new abcd.YC(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
