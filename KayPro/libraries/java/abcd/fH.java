package abcd;

class fH extends abcd.AbstractbH {
    private static final int[] DW = null;
    private static final byte[] FH = null;
    private long Hw;
    private byte[][] VH;
    private int[][] Zo;
    private byte[][] gn;
    private byte[] u7;
    private final long[] v5;

    private class a extends abcd.AbstractbH.a {
        private int Hw;
        final abcd.fH Zo;
        private int v5;

        private a(abcd.fH r1) {
            this.Zo = r1;
            super(r1);
        }

        a(abcd.fH r1, abcd.fH.a r2) {
            this(r1);
        }

        @Override
        protected abcd.AbstractbH.b j6() {
            return new abcd.eH(this);
        }

        @Override
        public abcd.AbstractbH.b next() {
            int r0 = 0;
            int[][] r1 = null;
            int r2 = 0;
            long r3 = 0L;
            abcd.AbstractbH.b r4 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 3: {
                        if (this.Hw >= abcd.fH.j6(this.Zo).length) { $pc0 = 13; continue $sw0; }
                        r0 = this.v5;
                        r1 = abcd.fH.j6(this.Zo);
                        r2 = this.Hw;
                        if (r0 < r1[r2].length) { $pc0 = 6; continue $sw0; }
                        this.v5 = 0;
                        this.Hw = r2 + 1;
                        { $pc0 = 3; continue $sw0; }
                    }
                    case 6: {
                        r3 = abcd.FK.FH(abcd.fH.DW(this.Zo)[this.Hw], (this.v5 / 5) * 4);
                        if ((2147483648L & r3) == 0) { $pc0 = 9; continue $sw0; }
                        r3 = abcd.FK.Hw(abcd.fH.FH(this.Zo), ((int) (r3 & (-2147483649L))) * 8);
                        $pc0 = 9; continue $sw0;
                    }
                    case 9: {
                        r4 = this.j6;
                        r4.DW = r3;
                        this.v5 += 5;
                        this.DW++;
                        return r4;
                    }
                    case 13: {
                        throw new java.util.NoSuchElementException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        DW = new int[0];
        FH = new byte[0];
    }

    fH(java.io.InputStream r11) {
        byte[] r0 = null;
        int r3 = 0;
        int r1 = 0;
        long r4 = 0L;
        byte[][] r5 = null;
        byte[] r6 = null;
        long r7 = 0L;
        int r8 = 0;
        byte[] r9 = null;
        int[] r10 = null;
        int r12 = 0;
        int r13 = 0;
        long[] r14 = null;
        int r2 = 0;
        byte[][] r15 = null;
        int r16 = 0;
        int r17 = 0;
        byte[] r18 = null;
        int r19 = 0;
        int r20 = 0;
        byte[] r21 = null;
        byte[] r22 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new byte[1024];
                    abcd.BK.j6(r11, r0, 0, r0.length);
                    this.v5 = new long[256];
                    r3 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r3 >= 256) { $pc1 = 4; continue $sw1; }
                    this.v5[r3] = abcd.FK.FH(r0, r3 * 4);
                    r3 = r3 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 4: {
                    this.Hw = this.v5[255];
                    this.Zo = new int[256][];
                    this.VH = new byte[256][];
                    this.gn = new byte[256][];
                    r1 = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r1 >= 256) { $pc1 = 6; continue $sw1; }
                    if (r1 != 0) { $pc1 = 26; continue $sw1; }
                    r4 = this.v5[r1];
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    if (r4 != 0) { $pc1 = 30; continue $sw1; }
                    this.Zo[r1] = DW;
                    r5 = this.VH;
                    r6 = FH;
                    r5[r1] = r6;
                    this.gn[r1] = r6;
                    $pc1 = 36; continue $sw1;
                }
                case 36: {
                    r1 = r1 + 1;
                    { $pc1 = 5; continue $sw1; }
                }
                case 30: {
                    r7 = 20 * r4;
                    if (r7 > 2147483647L) { $pc1 = 39; continue $sw1; }
                    r8 = (int) r7;
                    r9 = new byte[r8];
                    r10 = new int[r8 >>> 2];
                    abcd.BK.j6(r11, r9, 0, r9.length);
                    r12 = 0;
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    if (r12 >= r10.length) { $pc1 = 35; continue $sw1; }
                    r10[r12] = abcd.FK.j6(r9, r12 << 2);
                    r12 = r12 + 1;
                    { $pc1 = 34; continue $sw1; }
                }
                case 35: {
                    this.Zo[r1] = r10;
                    r13 = (int) (r4 * 4);
                    this.VH[r1] = new byte[r13];
                    this.gn[r1] = new byte[r13];
                    { $pc1 = 36; continue $sw1; }
                }
                case 39: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().indexFileIsTooLargeForJgit);
                }
                case 26: {
                    r14 = this.v5;
                    r4 = r14[r1] - r14[r1 - 1];
                    { $pc1 = 28; continue $sw1; }
                }
                case 6: {
                    r2 = 0;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r2 >= 256) { $pc1 = 8; continue $sw1; }
                    r15 = this.gn;
                    abcd.BK.j6(r11, r15[r2], 0, r15[r2].length);
                    r2 = r2 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 8: {
                    r16 = 0;
                    r17 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r17 >= 256) { $pc1 = 10; continue $sw1; }
                    r18 = this.VH[r17];
                    abcd.BK.j6(r11, r18, 0, r18.length);
                    r19 = r16;
                    r20 = 0;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    if (r20 >= r18.length) { $pc1 = 18; continue $sw1; }
                    if (r18[r20] >= 0) { $pc1 = 22; continue $sw1; }
                    r19 = r19 + 1;
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    r20 = r20 + 4;
                    { $pc1 = 17; continue $sw1; }
                }
                case 18: {
                    r17 = r17 + 1;
                    r16 = r19;
                    { $pc1 = 9; continue $sw1; }
                }
                case 10: {
                    if (r16 <= 0) { $pc1 = 12; continue $sw1; }
                    this.u7 = new byte[r16 * 8];
                    r21 = this.u7;
                    abcd.BK.j6(r11, r21, 0, r21.length);
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    this.j6 = new byte[20];
                    r22 = this.j6;
                    abcd.BK.j6(r11, r22, 0, r22.length);
                    return;
                }
                case 12: {
                    this.u7 = FH;
                    { $pc1 = 13; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static byte[][] DW(abcd.fH r0) {
        return r0.VH;
    }

    static byte[] FH(abcd.fH r0) {
        return r0.u7;
    }

    private static int Zo(int r1) {
        return (r1 << 2) + r1;
    }

    private int j6(abcd.YD r6, int r7) {
        int[] r0 = null;
        int r8 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.Zo[r7];
                    r8 = this.VH[r7].length >>> 2;
                    if (r8 != 0) { $pc2 = 5; continue $sw2; }
                    return -1;
                }
                case 5: {
                    r2 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r3 = (r2 + r8) >>> 1;
                    r4 = r6.j6(r0, (r3 << 2) + r3);
                    if (r4 >= 0) { $pc2 = 9; continue $sw2; }
                    r8 = r3;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (r2 < r8) { $pc2 = 6; continue $sw2; }
                    return -1;
                }
                case 9: {
                    if (r4 == 0) { $pc2 = 10; continue $sw2; }
                    r2 = r3 + 1;
                    { $pc2 = 12; continue $sw2; }
                }
                case 10: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[][] j6(abcd.fH r0) {
        return r0.Zo;
    }

    @Override
    public long DW() {
        return this.u7.length / 8;
    }

    @Override
    public long DW(abcd.YD r7) {
        int r0 = 0;
        int r8 = 0;
        long r1 = 0L;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r7.Zo();
                    r8 = j6(r7, r0);
                    if (r8 != (-1)) { $pc3 = 6; continue $sw3; }
                    return -1;
                }
                case 6: {
                    r1 = abcd.FK.FH(this.VH[r0], r8 << 2);
                    if ((2147483648L & r1) != 0) { $pc3 = 9; continue $sw3; }
                    return r1;
                }
                case 9: {
                    return abcd.FK.Hw(this.u7, ((int) (r1 & (-2147483649L))) * 8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean FH() {
        return true;
    }

    @Override
    public java.util.Iterator<abcd.AbstractbH.b> iterator() {
        return new abcd.fH.a(this, null);
    }

    @Override
    public long j6() {
        return this.Hw;
    }

    @Override
    public long j6(abcd.YD r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r4.Zo();
                    r1 = j6(r4, r0);
                    if (r1 == (-1)) { $pc4 = 7; continue $sw4; }
                    return abcd.FK.FH(this.gn[r0], r1 << 2);
                }
                case 7: {
                    throw new abcd.fD(r4.Hw(), "unknown");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.yE j6(long r7) {
        int r0 = 0;
        long r2 = 0L;
        long r3 = 0L;
        int r8 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = java.util.Arrays.binarySearch(this.v5, 1 + r7);
                    if (r0 < 0) { $pc5 = 10; continue $sw5; }
                    r2 = this.v5[r0];
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    if (r0 <= 0) { $pc5 = 11; continue $sw5; }
                    if (r2 != this.v5[r0 - 1]) { $pc5 = 11; continue $sw5; }
                    r0 = r0 - 1;
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    if (r0 <= 0) { $pc5 = 13; continue $sw5; }
                    r3 = this.v5[r0 - 1];
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    r8 = (int) (r7 - r3);
                    return abcd.yE.DW(this.Zo[r0], (r8 << 2) + r8);
                }
                case 13: {
                    r3 = 0;
                    { $pc5 = 14; continue $sw5; }
                }
                case 10: {
                    r0 = -(r0 + 1);
                    { $pc5 = 11; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.util.Set<abcd.yE> r7, abcd.WD r8, int r9) {
        int[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.Zo[r8.j6()];
                    r1 = this.VH[r8.j6()].length >>> 2;
                    if (r1 != 0) { $pc6 = 5; continue $sw6; }
                    return;
                }
                case 5: {
                    r2 = 0;
                    r3 = r1;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    r4 = (r2 + r3) >>> 1;
                    r5 = r8.j6(r0, Zo(r4));
                    if (r5 >= 0) { $pc6 = 9; continue $sw6; }
                    r3 = r4;
                    $pc6 = 25; continue $sw6;
                }
                case 25: {
                    if (r2 < r3) { $pc6 = 6; continue $sw6; }
                    return;
                }
                case 9: {
                    if (r5 == 0) { $pc6 = 10; continue $sw6; }
                    r2 = r4 + 1;
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    if (r4 <= 0) { $pc6 = 15; continue $sw6; }
                    if (r8.j6(r0, Zo(r4 - 1)) != 0) { $pc6 = 15; continue $sw6; }
                    r4 = r4 - 1;
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    if (r4 >= r1) { $pc6 = 39; continue $sw6; }
                    if (r8.j6(r0, Zo(r4)) != 0) { $pc6 = 23; continue $sw6; }
                    r7.add(abcd.yE.DW(r0, Zo(r4)));
                    if (r7.size() > r9) { $pc6 = 38; continue $sw6; }
                    r4 = r4 + 1;
                    { $pc6 = 15; continue $sw6; }
                }
                case 38: {
                    return;
                }
                case 23: {
                    return;
                }
                case 39: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
