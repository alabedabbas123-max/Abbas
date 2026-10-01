package abcd;

class dH extends abcd.AbstractbH {
    private final long[] DW;
    private byte[][] FH;
    private long Hw;

    private class a extends abcd.AbstractbH.a {
        private int Hw;
        final abcd.dH Zo;
        private int v5;

        private a(abcd.dH r1) {
            this.Zo = r1;
            super(r1);
        }

        a(abcd.dH r1, abcd.dH.a r2) {
            this(r1);
        }

        @Override
        protected abcd.AbstractbH.b j6() {
            return new abcd.cH(this);
        }

        @Override
        public abcd.AbstractbH.b next() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 3: {
                        if (this.Hw >= abcd.dH.j6(this.Zo).length) { $pc0 = 14; continue $sw0; }
                        if (abcd.dH.j6(this.Zo)[this.Hw] == null) { $pc0 = 12; continue $sw0; }
                        if (this.v5 < abcd.dH.j6(this.Zo)[this.Hw].length) { $pc0 = 9; continue $sw0; }
                        this.v5 = 0;
                        { $pc0 = 12; continue $sw0; }
                    }
                    case 9: {
                        this.j6.DW = abcd.FK.FH(abcd.dH.j6(this.Zo)[this.Hw], this.v5);
                        this.v5 += 24;
                        this.DW++;
                        return this.j6;
                    }
                    case 12: {
                        this.Hw++;
                        { $pc0 = 3; continue $sw0; }
                    }
                    case 14: {
                        throw new java.util.NoSuchElementException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    dH(java.io.InputStream r7, byte[] r8) {
        byte[] r1 = null;
        int r9 = 0;
        long[] r0 = null;
        int r10 = 0;
        long[] r2 = null;
        long r3 = 0L;
        int r4 = 0;
        byte[][] r5 = null;
        byte[] r11 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = new byte[1024];
                    java.lang.System.arraycopy(r8, 0, r1, 0, r8.length);
                    abcd.BK.j6(r7, r1, r8.length, 1024 - r8.length);
                    this.DW = new long[256];
                    r9 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r0 = this.DW;
                    if (r9 >= r0.length) { $pc1 = 5; continue $sw1; }
                    r0[r9] = abcd.FK.FH(r1, r9 * 4);
                    r9 = r9 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    this.FH = new byte[r0.length][];
                    r10 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r2 = this.DW;
                    if (r10 >= r2.length) { $pc1 = 8; continue $sw1; }
                    if (r10 != 0) { $pc1 = 12; continue $sw1; }
                    r3 = r2[r10];
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r4 = (int) r3;
                    if (r4 <= 0) { $pc1 = 16; continue $sw1; }
                    r5 = this.FH;
                    r5[r10] = new byte[r4 * 24];
                    abcd.BK.j6(r7, r5[r10], 0, r5[r10].length);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    r10 = r10 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 12: {
                    r3 = r2[r10] - r2[r10 - 1];
                    { $pc1 = 13; continue $sw1; }
                }
                case 8: {
                    this.Hw = r2[255];
                    this.j6 = new byte[20];
                    r11 = this.j6;
                    abcd.BK.j6(r7, r11, 0, r11.length);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int Zo(int r0) {
        return (r0 * 24) + 4;
    }

    static byte[][] j6(abcd.dH r0) {
        return r0.FH;
    }

    @Override
    public long DW() {
        java.util.Iterator<abcd.AbstractbH.b> r0 = null;
        long r1 = 0L;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = iterator();
                    r1 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc2 = 5; continue $sw2; }
                    if (r0.next().j6() < 2147483647L) { $pc2 = 4; continue $sw2; }
                    r1 = r1 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public long DW(abcd.YD r10) {
        byte[] r0 = null;
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r11 = 0;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.FH[r10.Zo()];
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    return -1;
                }
                case 5: {
                    r3 = r0.length / 24;
                    r5 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r6 = (r5 + r3) >>> 1;
                    r7 = Zo(r6);
                    r8 = r10.j6(r0, r7);
                    if (r8 >= 0) { $pc3 = 9; continue $sw3; }
                    r3 = r6;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (r5 < r3) { $pc3 = 6; continue $sw3; }
                    return -1;
                }
                case 9: {
                    if (r8 == 0) { $pc3 = 10; continue $sw3; }
                    r5 = r6 + 1;
                    { $pc3 = 13; continue $sw3; }
                }
                case 10: {
                    r11 = r0[r7 - 4] & 255;
                    r1 = r0[r7 - 3] & 255;
                    return (((long) ((r0[r7 - 2] & 255) << 8)) | ((((long) r11) << 24) | ((long) (r1 << 16)))) | ((long) (r0[r7 - 1] & 255));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean FH() {
        return false;
    }

    @Override
    public java.util.Iterator<abcd.AbstractbH.b> iterator() {
        return new abcd.dH.a(this, null);
    }

    @Override
    public long j6() {
        return this.Hw;
    }

    @Override
    public long j6(abcd.YD r1) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public abcd.yE j6(long r7) {
        int r0 = 0;
        long r2 = 0L;
        long r3 = 0L;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = java.util.Arrays.binarySearch(this.DW, 1 + r7);
                    if (r0 < 0) { $pc4 = 10; continue $sw4; }
                    r2 = this.DW[r0];
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    if (r0 <= 0) { $pc4 = 11; continue $sw4; }
                    if (r2 != this.DW[r0 - 1]) { $pc4 = 11; continue $sw4; }
                    r0 = r0 - 1;
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    if (r0 <= 0) { $pc4 = 13; continue $sw4; }
                    r3 = this.DW[r0 - 1];
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    return abcd.yE.Hw(this.FH[r0], Zo((int) (r7 - r3)));
                }
                case 13: {
                    r3 = 0;
                    { $pc4 = 15; continue $sw4; }
                }
                case 10: {
                    r0 = -(r0 + 1);
                    { $pc4 = 11; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.util.Set<abcd.yE> r7, abcd.WD r8, int r9) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.FH[r8.j6()];
                    if (r0 != null) { $pc5 = 5; continue $sw5; }
                    return;
                }
                case 5: {
                    r1 = r0.length / 24;
                    r2 = 0;
                    r3 = r1;
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r4 = (r2 + r3) >>> 1;
                    r5 = r8.j6(r0, Zo(r4));
                    if (r5 >= 0) { $pc5 = 9; continue $sw5; }
                    r3 = r4;
                    $pc5 = 25; continue $sw5;
                }
                case 25: {
                    if (r2 < r3) { $pc5 = 6; continue $sw5; }
                    return;
                }
                case 9: {
                    if (r5 == 0) { $pc5 = 10; continue $sw5; }
                    r2 = r4 + 1;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r4 <= 0) { $pc5 = 15; continue $sw5; }
                    if (r8.j6(r0, Zo(r4 - 1)) != 0) { $pc5 = 15; continue $sw5; }
                    r4 = r4 - 1;
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    if (r4 >= r1) { $pc5 = 39; continue $sw5; }
                    if (r8.j6(r0, Zo(r4)) != 0) { $pc5 = 23; continue $sw5; }
                    r7.add(abcd.yE.Hw(r0, Zo(r4)));
                    if (r7.size() > r9) { $pc5 = 38; continue $sw5; }
                    r4 = r4 + 1;
                    { $pc5 = 15; continue $sw5; }
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
