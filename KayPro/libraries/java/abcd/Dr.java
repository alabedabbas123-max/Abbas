package abcd;

public class Dr {
    private static final int[] j6 = null;
    public final abcd.Dr.a DW;
    private int[] FH;
    private int[] Hw;
    private int VH;
    private int[] Zo;
    private int gn;
    private int u7;
    private int[] v5;

    public class a {
        private int DW;
        private int FH;
        private int Hw;
        final abcd.Dr Zo;
        private int j6;
        private int v5;

        private a(abcd.Dr r1) {
            this.Zo = r1;
            this.j6 = 0;
            this.DW = 0;
        }

        a(abcd.Dr r1, abcd.Cr r2) {
            this(r1);
        }

        public void DW() {
            this.j6 = 0;
            this.DW = 0;
        }

        public int FH() {
            return this.FH;
        }

        public int Hw() {
            return this.Hw;
        }

        public void j6(int r2) {
            int r3 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r2 != 0) { $pc0 = 5; continue $sw0; }
                        r2 = Integer.MAX_VALUE;
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        this.v5 = r2;
                        r3 = r2 & Integer.MAX_VALUE;
                        this.DW = (r3 % (abcd.Dr.j6(this.Zo).length - 2)) + 1;
                        this.j6 = r3 % abcd.Dr.j6(this.Zo).length;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public boolean j6() {
            int[] r0 = null;
            int r4 = 0;
            int r1 = 0;
            int[] r2 = null;
            int r3 = 0;
            int r5 = 0;
            int[] r6 = null;
            int r7 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.DW == 0) { $pc1 = 5; continue $sw1; }
                        $pc1 = 16; continue $sw1;
                    }
                    case 16: {
                        r0 = abcd.Dr.j6(this.Zo);
                        r4 = this.j6;
                        this.FH = r0[r4];
                        r1 = this.FH;
                        if (r1 == 0) { $pc1 = 18; continue $sw1; }
                        if (r1 == this.v5) { $pc1 = 21; continue $sw1; }
                        this.j6 = (r4 + this.DW) % abcd.Dr.j6(this.Zo).length;
                        { $pc1 = 16; continue $sw1; }
                    }
                    case 21: {
                        if (r1 != Integer.MAX_VALUE) { $pc1 = 23; continue $sw1; }
                        this.FH = 0;
                        $pc1 = 23; continue $sw1;
                    }
                    case 23: {
                        r2 = abcd.Dr.DW(this.Zo);
                        r3 = this.j6;
                        this.Hw = r2[r3];
                        this.j6 = (r3 + this.DW) % abcd.Dr.j6(this.Zo).length;
                        return true;
                    }
                    case 18: {
                        return false;
                    }
                    case 5: {
                        if (this.j6 >= abcd.Dr.j6(this.Zo).length) { $pc1 = 6; continue $sw1; }
                        this.FH = abcd.Dr.j6(this.Zo)[this.j6];
                        r5 = this.FH;
                        if (r5 == 0) { $pc1 = 15; continue $sw1; }
                        if (r5 == Integer.MIN_VALUE) { $pc1 = 15; continue $sw1; }
                        if (r5 != Integer.MAX_VALUE) { $pc1 = 13; continue $sw1; }
                        this.FH = 0;
                        $pc1 = 13; continue $sw1;
                    }
                    case 13: {
                        r6 = abcd.Dr.DW(this.Zo);
                        r7 = this.j6;
                        this.Hw = r6[r7];
                        this.j6 = r7 + 1;
                        return true;
                    }
                    case 15: {
                        this.j6++;
                        { $pc1 = 5; continue $sw1; }
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
    }

    public Dr() {
        this.DW = new abcd.Dr.a(this, null);
        this.u7 = 0;
        int[] r1 = j6;
        int r2 = this.u7;
        this.FH = new int[r1[r2]];
        this.v5 = new int[r1[r2]];
        this.VH = 0;
        this.gn = 0;
    }

    public Dr(int r6) {
        int[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.DW = new abcd.Dr.a(this, null);
                    this.u7 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r1 = j6;
                    r2 = this.u7;
                    if (r1[r2] >= (r6 * 2)) { $pc2 = 6; continue $sw2; }
                    this.u7 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    this.FH = new int[r1[r2]];
                    this.v5 = new int[r1[r2]];
                    this.VH = 0;
                    this.gn = 0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] DW(abcd.Dr r0) {
        return r0.v5;
    }

    private void Hw() {
        int r0 = 0;
        int[] r1 = null;
        int r3 = 0;
        int[] r2 = null;
        int r4 = 0;
        int[] r5 = null;
        int[] r6 = null;
        int r7 = 0;
        int[] r8 = null;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int[] r14 = null;
        int r15 = 0;
        int r16 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.gn * 2;
                    r1 = this.FH;
                    r3 = 0;
                    if (r0 <= r1.length) { $pc3 = 5; continue $sw3; }
                    this.u7++;
                    this.Hw = null;
                    this.Zo = null;
                    r2 = j6;
                    r4 = this.u7;
                    r5 = new int[r2[r4]];
                    r6 = new int[r2[r4]];
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    r7 = 0;
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    r8 = this.FH;
                    if (r3 >= r8.length) { $pc3 = 28; continue $sw3; }
                    r9 = r8[r3];
                    if (r9 == 0) { $pc3 = 27; continue $sw3; }
                    if (r9 == Integer.MIN_VALUE) { $pc3 = 27; continue $sw3; }
                    r10 = Integer.MAX_VALUE & r9;
                    r11 = (r10 % (r5.length - 2)) + 1;
                    r12 = r5.length;
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    r13 = r10 % r12;
                    if (r5[r13] == 0) { $pc3 = 26; continue $sw3; }
                    r10 = r13 + r11;
                    r12 = r5.length;
                    { $pc3 = 23; continue $sw3; }
                }
                case 26: {
                    r5[r13] = r9;
                    r6[r13] = this.v5[r3];
                    r7 = r7 + 1;
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    r3 = r3 + 1;
                    { $pc3 = 16; continue $sw3; }
                }
                case 28: {
                    this.FH = r5;
                    this.v5 = r6;
                    this.VH = r7;
                    return;
                }
                case 5: {
                    r5 = this.Hw;
                    if (r5 != null) { $pc3 = 8; continue $sw3; }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    this.Hw = this.FH;
                    this.Zo = this.v5;
                    r14 = j6;
                    r15 = this.u7;
                    r5 = new int[r14[r15]];
                    r6 = new int[r14[r15]];
                    { $pc3 = 15; continue $sw3; }
                }
                case 8: {
                    if (r5.length != r1.length) { $pc3 = 14; continue $sw3; }
                    r16 = 0;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (r16 >= r5.length) { $pc3 = 13; continue $sw3; }
                    r5[r16] = 0;
                    r16 = r16 + 1;
                    { $pc3 = 11; continue $sw3; }
                }
                case 13: {
                    r6 = this.Zo;
                    this.Hw = this.FH;
                    this.Zo = this.v5;
                    { $pc3 = 15; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] j6(abcd.Dr r0) {
        return r0.FH;
    }

    public abcd.Dr.a DW() {
        return new abcd.Dr.a(this, null);
    }

    public void DW(int r9, int r10) {
        int r0 = 0;
        int[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        boolean r4 = false;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int[] r8 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r9 != 0) { $pc4 = 5; continue $sw4; }
                    r9 = Integer.MAX_VALUE;
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r0 = Integer.MAX_VALUE & r9;
                    r1 = this.FH;
                    r2 = r0 % r1.length;
                    r3 = (r0 % (r1.length - 2)) + 1;
                    r4 = false;
                    r5 = r1[r2];
                    r6 = r2;
                    r7 = -1;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r5 == 0) { $pc4 = 16; continue $sw4; }
                    if (r5 == r9) { $pc4 = 10; continue $sw4; }
                    if (r5 != Integer.MIN_VALUE) { $pc4 = 15; continue $sw4; }
                    r7 = r6;
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    r8 = this.FH;
                    r6 = (r6 + r3) % r8.length;
                    r5 = r8[r6];
                    { $pc4 = 6; continue $sw4; }
                }
                case 10: {
                    if (this.v5[r6] != r10) { $pc4 = 12; continue $sw4; }
                    r4 = true;
                    { $pc4 = 15; continue $sw4; }
                }
                case 12: {
                    this.FH[r6] = Integer.MIN_VALUE;
                    this.gn--;
                    { $pc4 = 15; continue $sw4; }
                }
                case 16: {
                    if (r4 == true) { $pc4 = 31; continue $sw4; }
                    if (r7 == (-1)) { $pc4 = 19; continue $sw4; }
                    r6 = r7;
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    this.FH[r6] = r9;
                    this.v5[r6] = r10;
                    this.gn++;
                    if (r7 != (-1)) { $pc4 = 23; continue $sw4; }
                    this.VH++;
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    if ((this.VH * 2) <= this.FH.length) { $pc4 = 32; continue $sw4; }
                    Hw();
                    return;
                }
                case 32: {
                    return;
                }
                case 31: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        return this.gn;
    }

    public int j6(int r5) {
        int r0 = 0;
        int[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int[] r6 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r5 != 0) { $pc5 = 5; continue $sw5; }
                    r5 = Integer.MAX_VALUE;
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r0 = Integer.MAX_VALUE & r5;
                    r1 = this.FH;
                    r2 = (r0 % (r1.length - 2)) + 1;
                    r3 = r0 % r1.length;
                    r4 = r1[r3];
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (r4 == r5) { $pc5 = 12; continue $sw5; }
                    if (r4 == 0) { $pc5 = 8; continue $sw5; }
                    r6 = this.FH;
                    r3 = (r3 + r2) % r6.length;
                    r4 = r6[r3];
                    { $pc5 = 6; continue $sw5; }
                }
                case 8: {
                    return -1;
                }
                case 12: {
                    return this.v5[r3];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        int r1 = 0;
        int[] r2 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.VH <= 0) { $pc6 = 11; continue $sw6; }
                    r1 = 0;
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    r2 = this.FH;
                    if (r1 >= r2.length) { $pc6 = 8; continue $sw6; }
                    r2[r1] = 0;
                    r1 = r1 + 1;
                    { $pc6 = 5; continue $sw6; }
                }
                case 8: {
                    this.VH = 0;
                    this.gn = 0;
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r7, int r8) {
        int r0 = 0;
        int[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int[] r9 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r7 != 0) { $pc7 = 5; continue $sw7; }
                    r7 = Integer.MAX_VALUE;
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    r0 = Integer.MAX_VALUE & r7;
                    r1 = this.FH;
                    r2 = r0 % r1.length;
                    r3 = (r0 % (r1.length - 2)) + 1;
                    r4 = r1[r2];
                    r5 = r2;
                    r6 = -1;
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r4 == 0) { $pc7 = 15; continue $sw7; }
                    if (r4 != r7) { $pc7 = 12; continue $sw7; }
                    if (this.v5[r5] != r8) { $pc7 = 14; continue $sw7; }
                    return;
                }
                case 14: {
                    r9 = this.FH;
                    r5 = (r5 + r3) % r9.length;
                    r4 = r9[r5];
                    { $pc7 = 6; continue $sw7; }
                }
                case 12: {
                    if (r4 != Integer.MIN_VALUE) { $pc7 = 14; continue $sw7; }
                    r6 = r5;
                    { $pc7 = 14; continue $sw7; }
                }
                case 15: {
                    if (r6 == (-1)) { $pc7 = 17; continue $sw7; }
                    r5 = r6;
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    this.FH[r5] = r7;
                    this.v5[r5] = r8;
                    this.gn++;
                    if (r6 != (-1)) { $pc7 = 21; continue $sw7; }
                    this.VH++;
                    $pc7 = 21; continue $sw7;
                }
                case 21: {
                    if ((this.VH * 2) <= this.FH.length) { $pc7 = 29; continue $sw7; }
                    Hw();
                    return;
                }
                case 29: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String r0 = null;
        int r1 = 0;
        int[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = "{";
                    r1 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    r2 = this.FH;
                    if (r1 >= r2.length) { $pc8 = 15; continue $sw8; }
                    r3 = r2[r1];
                    if (r3 == 0) { $pc8 = 13; continue $sw8; }
                    if (r3 == Integer.MIN_VALUE) { $pc8 = 13; continue $sw8; }
                    r4 = this.v5[r1];
                    if (r3 != Integer.MAX_VALUE) { $pc8 = 12; continue $sw8; }
                    r0 = r0 + "0->" + r4 + ", ";
                    { $pc8 = 13; continue $sw8; }
                }
                case 12: {
                    r0 = r0 + r3 + "->" + r4 + ", ";
                    $pc8 = 13; continue $sw8;
                }
                case 13: {
                    r1 = r1 + 1;
                    { $pc8 = 3; continue $sw8; }
                }
                case 15: {
                    return r0 + "}";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
