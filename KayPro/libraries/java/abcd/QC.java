package abcd;

public class QC {
    private static final byte[] j6 = null;
    private final byte[] DW;
    private final int FH;
    final byte[] Hw;
    private byte v5;

    static {
        j6 = new byte[8];
    }

    public QC(java.lang.String r1) {
        this(abcd.hE.j6(r1));
    }

    public QC(java.lang.String r1, int r2) {
        this(abcd.hE.j6(r1), r2);
    }

    public QC(byte[] r2) {
        this(r2, 0);
    }

    public QC(byte[] r6, int r7) {
        int r8 = 0;
        byte[] r9 = null;
        int r10 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6(r6) == false) { $pc0 = 16; continue $sw0; }
                    if (r7 < 0) { $pc0 = 14; continue $sw0; }
                    if (3 < r7) { $pc0 = 14; continue $sw0; }
                    this.DW = new byte[62];
                    this.FH = 0;
                    this.Hw = r6;
                    r8 = (r7 & 3) << 12;
                    r9 = this.Hw;
                    if (r9.length >= 4095) { $pc0 = 10; continue $sw0; }
                    r10 = r8 | r9.length;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    abcd.FK.j6(this.DW, this.FH + 60, r10);
                    return;
                }
                case 10: {
                    r10 = r8 | 4095;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidStageForPath, new java.lang.Object[]{java.lang.Integer.valueOf(r7), DW(r6)}));
                }
                case 16: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidPath, new java.lang.Object[]{DW(r6)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    QC(byte[] r6, abcd.EK r7, java.io.InputStream r8, java.security.MessageDigest r9) {
        int r0 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        java.io.ByteArrayOutputStream r14 = null;
        byte[] r3 = null;
        int r1 = 0;
        byte[] r15 = null;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.DW = r6;
                    this.FH = r7.j6;
                    abcd.BK.j6(r8, this.DW, this.FH, 62);
                    r0 = 1;
                    if (EQ() == false) { $pc1 = 9; continue $sw1; }
                    r10 = 64;
                    abcd.BK.j6(r8, this.DW, this.FH + 62, 2);
                    if ((QX() & (-1610612737)) != 0) { $pc1 = 8; continue $sw1; }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    r7.j6 += r10;
                    r9.update(this.DW, this.FH, r10);
                    r11 = abcd.FK.DW(this.DW, this.FH + 60) & 4095;
                    if (r11 >= 4095) { $pc1 = 13; continue $sw1; }
                    this.Hw = new byte[r11];
                    abcd.BK.j6(r8, this.Hw, 0, r11);
                    r9.update(this.Hw, 0, r11);
                    r0 = 0;
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r12 = r10 + r11;
                    r13 = (((r12 + 8) & (-8)) - r12) - r0;
                    if (r13 <= 0) { $pc1 = 28; continue $sw1; }
                    abcd.BK.j6(r8, r13);
                    r9.update(j6, 0, r13);
                    return;
                }
                case 28: {
                    return;
                }
                case 13: {
                    r14 = new java.io.ByteArrayOutputStream();
                    r3 = new byte[4095];
                    abcd.BK.j6(r8, r3, 0, 4095);
                    r14.write(r3);
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r1 = r8.read();
                    if (r1 < 0) { $pc1 = 24; continue $sw1; }
                    if (r1 == 0) { $pc1 = 17; continue $sw1; }
                    r14.write(r1);
                    { $pc1 = 14; continue $sw1; }
                }
                case 17: {
                    this.Hw = r14.toByteArray();
                    r15 = this.Hw;
                    r2 = r15.length;
                    r9.update(r15, 0, r2);
                    r9.update((byte) 0);
                    r11 = r2;
                    { $pc1 = 18; continue $sw1; }
                }
                case 24: {
                    throw new java.io.EOFException(org.eclipse.jgit.JGitText.j6().shortReadOfBlock);
                }
                case 8: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().DIRCUnrecognizedExtendedFlags, new java.lang.Object[]{java.lang.String.valueOf(QX())}));
                }
                case 9: {
                    r10 = 62;
                    { $pc1 = 10; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private long DW(int r6) {
        int r0 = this.FH + r6;
        int r7 = abcd.FK.j6(this.DW, r0);
        int r1 = abcd.FK.j6(this.DW, r0 + 4) / 1000000;
        return (((long) r7) * 1000) + ((long) r1);
    }

    private static java.lang.String DW(byte[] r1) {
        return abcd.hE.Zo.decode(java.nio.ByteBuffer.wrap(r1)).toString();
    }

    private int QX() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (EQ() == true) { $pc2 = 5; continue $sw2; }
                    return 0;
                }
                case 5: {
                    return abcd.FK.DW(this.DW, this.FH + 62) << 16;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(boolean r0) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r0 == false) { $pc3 = 4; continue $sw3; }
                    return 64;
                }
                case 4: {
                    return 62;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r6, long r7) {
        int r0 = this.FH + r6;
        abcd.FK.DW(this.DW, r0, (int) (r7 / 1000));
        abcd.FK.DW(this.DW, r0 + 4, ((int) (r7 % 1000)) * 1000000);
    }

    static boolean j6(byte[] r6) {
        int r0 = 0;
        int r2 = 0;
        boolean r3 = false;
        byte r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r6.length != 0) { $pc4 = 5; continue $sw4; }
                    return false;
                }
                case 5: {
                    r0 = r6.length;
                    r2 = 0;
                    r3 = false;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r2 >= r0) { $pc4 = 7; continue $sw4; }
                    r4 = r6[r2];
                    if (r4 == 0) { $pc4 = 16; continue $sw4; }
                    if (r4 == 47) { $pc4 = 13; continue $sw4; }
                    r3 = true;
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    r2 = r2 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 13: {
                    if (r3 == false) { $pc4 = 16; continue $sw4; }
                    r3 = false;
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    return false;
                }
                case 7: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long DW() {
        return DW(8);
    }

    public void DW(long r6) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (2147483647L <= r6) { $pc5 = 7; continue $sw5; }
                    j6((int) r6);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().sizeExceeds2GB, new java.lang.Object[]{v5(), java.lang.Long.valueOf(r6)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean EQ() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if ((this.DW[this.FH + 60] & 64) == 0) { $pc6 = 6; continue $sw6; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        return abcd.FK.j6(this.DW, this.FH + 36);
    }

    public abcd.yE Hw() {
        return abcd.yE.Hw(gn(), u7());
    }

    public final boolean J0() {
        int r0 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.FH + 40;
                    if (FH() == 0) { $pc7 = 5; continue $sw7; }
                    return false;
                }
                case 5: {
                    if (abcd.hE.VH.j6(this.DW, r0) == 0) { $pc7 = 10; continue $sw7; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean J8() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if ((this.v5 & 1) == 0) { $pc8 = 5; continue $sw8; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int VH() {
        return (this.DW[this.FH + 60] >>> 4) & 3;
    }

    public final void Ws() {
        int r0 = this.FH + 36;
        java.util.Arrays.fill(this.DW, r0, r0 + 4, (byte) 0);
    }

    public int Zo() {
        return abcd.FK.j6(this.DW, this.FH + 24);
    }

    final byte[] gn() {
        return this.DW;
    }

    public abcd.AbstractrE j6() {
        return abcd.AbstractrE.DW(Zo());
    }

    public void j6(int r3) {
        abcd.FK.DW(this.DW, this.FH + 36, r3);
    }

    public void j6(long r2) {
        j6(8, r2);
    }

    public void j6(abcd.QC r6) {
        int r0 = abcd.FK.DW(this.DW, this.FH + 60) & 4095;
        java.lang.System.arraycopy(r6.DW, r6.FH, this.DW, this.FH, 62);
        byte[] r7 = this.DW;
        int r1 = this.FH;
        abcd.FK.j6(r7, r1 + 60, r0 | (abcd.FK.DW(r7, r1 + 60) & (-4096)));
    }

    public void j6(abcd.YD r3) {
        r3.DW(gn(), u7());
    }

    public void j6(abcd.AbstractrE r5) {
        int r0 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r5.DW() & 61440;
                    if (r0 == 0) { $pc9 = 9; continue $sw9; }
                    if (r0 == 16384) { $pc9 = 9; continue $sw9; }
                    abcd.FK.DW(this.DW, this.FH + 24, r5.DW());
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidModeForPath, new java.lang.Object[]{r5, v5()}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.io.OutputStream r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (EQ() == false) { $pc10 = 5; continue $sw10; }
                    r0 = 64;
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    r1 = this.Hw.length;
                    r5.write(this.DW, this.FH, r0);
                    r5.write(this.Hw, 0, r1);
                    r2 = r0 + r1;
                    r3 = (r2 + 8) & (-8);
                    if (r2 == r3) { $pc10 = 10; continue $sw10; }
                    r5.write(j6, 0, r3 - r2);
                    return;
                }
                case 10: {
                    return;
                }
                case 5: {
                    r0 = 62;
                    { $pc10 = 6; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r4, int r5) {
        java.lang.System.arraycopy(r4, r5, gn(), u7(), 20);
    }

    public final boolean j6(int r4, int r5) {
        int r0 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.FH + 8;
                    if (r4 == abcd.FK.j6(this.DW, r0)) { $pc11 = 5; continue $sw11; }
                    $pc11 = 8; continue $sw11;
                }
                case 8: {
                    return false;
                }
                case 5: {
                    if (r5 > abcd.FK.j6(this.DW, r0 + 4)) { $pc11 = 8; continue $sw11; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return j6() + " " + FH() + " " + DW() + " " + Hw() + " " + VH() + " " + v5() + "\n";
    }

    public boolean tp() {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if ((this.DW[this.FH + 60] & 128) == 0) { $pc12 = 6; continue $sw12; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    final int u7() {
        return this.FH + 40;
    }

    public java.lang.String v5() {
        return DW(this.Hw);
    }

    public boolean we() {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if ((QX() & 1073741824) == 0) { $pc13 = 6; continue $sw13; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
