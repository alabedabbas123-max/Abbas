package abcd;

public class Fr {
    public static final abcd.Fr DW = null;
    private static final int[] j6 = null;
    public final abcd.Fr.a FH;
    private int[] Hw;
    private int VH;
    private int Zo;
    private int gn;
    private int[] v5;

    public class a {
        private int DW;
        final abcd.Fr FH;
        private int j6;

        private a(abcd.Fr r1) {
            this.FH = r1;
            this.j6 = 0;
        }

        a(abcd.Fr r1, abcd.Er r2) {
            this(r1);
        }

        public void DW() {
            this.j6 = 0;
        }

        public int FH() {
            return this.DW;
        }

        public boolean j6() {
            int[] r0 = null;
            int r1 = 0;
            int r2 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 3: {
                        if (this.j6 >= abcd.Fr.j6(this.FH).length) { $pc0 = 4; continue $sw0; }
                        r0 = abcd.Fr.j6(this.FH);
                        r1 = this.j6;
                        this.DW = r0[r1];
                        this.j6 = r1 + 1;
                        r2 = this.DW;
                        if (r2 == 0) { $pc0 = 3; continue $sw0; }
                        if (r2 == Integer.MIN_VALUE) { $pc0 = 3; continue $sw0; }
                        if (r2 != Integer.MAX_VALUE) { $pc0 = 12; continue $sw0; }
                        this.DW = 0;
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        return true;
                    }
                    case 4: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
        DW = new abcd.Fr();
    }

    public Fr() {
        this.FH = new abcd.Fr.a(this, null);
        this.gn = 1;
        this.Hw = new int[j6[this.gn]];
        this.Zo = 0;
        this.VH = 0;
    }

    private void DW() {
        int r0 = 0;
        int[] r1 = null;
        int r3 = 0;
        int[] r2 = null;
        int r4 = 0;
        int[] r5 = null;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.VH * 2;
                    r1 = this.Hw;
                    r3 = 0;
                    if (r0 <= r1.length) { $pc1 = 5; continue $sw1; }
                    this.gn++;
                    this.v5 = null;
                    r2 = new int[j6[this.gn]];
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    r4 = 0;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    r5 = this.Hw;
                    if (r3 >= r5.length) { $pc1 = 28; continue $sw1; }
                    r6 = r5[r3];
                    if (r6 == 0) { $pc1 = 27; continue $sw1; }
                    if (r6 == Integer.MIN_VALUE) { $pc1 = 27; continue $sw1; }
                    r7 = Integer.MAX_VALUE & r6;
                    r8 = (r7 % (r2.length - 2)) + 1;
                    r9 = r2.length;
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    r10 = r7 % r9;
                    if (r2[r10] == 0) { $pc1 = 26; continue $sw1; }
                    r7 = r10 + r8;
                    r9 = r2.length;
                    { $pc1 = 23; continue $sw1; }
                }
                case 26: {
                    r2[r10] = r6;
                    r4 = r4 + 1;
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    r3 = r3 + 1;
                    { $pc1 = 16; continue $sw1; }
                }
                case 28: {
                    this.Hw = r2;
                    this.Zo = r4;
                    return;
                }
                case 5: {
                    r2 = this.v5;
                    if (r2 != null) { $pc1 = 8; continue $sw1; }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    this.v5 = this.Hw;
                    r2 = new int[j6[this.gn]];
                    { $pc1 = 15; continue $sw1; }
                }
                case 8: {
                    if (r2.length != r1.length) { $pc1 = 14; continue $sw1; }
                    r11 = 0;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r11 >= r2.length) { $pc1 = 13; continue $sw1; }
                    r2[r11] = 0;
                    r11 = r11 + 1;
                    { $pc1 = 11; continue $sw1; }
                }
                case 13: {
                    this.v5 = this.Hw;
                    { $pc1 = 15; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] j6(abcd.Fr r0) {
        return r0.Hw;
    }

    public void DW(int r7) {
        int r0 = 0;
        int[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int[] r8 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r7 != 0) { $pc2 = 5; continue $sw2; }
                    r7 = Integer.MAX_VALUE;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = Integer.MAX_VALUE & r7;
                    r1 = this.Hw;
                    r2 = r0 % r1.length;
                    r3 = (r0 % (r1.length - 2)) + 1;
                    r4 = r1[r2];
                    r5 = r2;
                    r6 = -1;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r4 == 0) { $pc2 = 13; continue $sw2; }
                    if (r4 == r7) { $pc2 = 8; continue $sw2; }
                    if (r4 != Integer.MIN_VALUE) { $pc2 = 12; continue $sw2; }
                    r6 = r5;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    r8 = this.Hw;
                    r5 = (r5 + r3) % r8.length;
                    r4 = r8[r5];
                    { $pc2 = 6; continue $sw2; }
                }
                case 8: {
                    return;
                }
                case 13: {
                    if (r6 == (-1)) { $pc2 = 15; continue $sw2; }
                    r5 = r6;
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    this.Hw[r5] = r7;
                    if (r6 != (-1)) { $pc2 = 18; continue $sw2; }
                    this.Zo++;
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    this.VH++;
                    if ((this.Zo * 2) <= this.Hw.length) { $pc2 = 26; continue $sw2; }
                    DW();
                    return;
                }
                case 26: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r5) {
        abcd.Fr r6 = null;
        int r0 = 0;
        int[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r5 instanceof abcd.Fr) == true) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    r6 = (abcd.Fr) r5;
                    if (r6.j6() == j6()) { $pc3 = 8; continue $sw3; }
                    return false;
                }
                case 8: {
                    r0 = 0;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r2 = this.Hw;
                    if (r0 >= r2.length) { $pc3 = 22; continue $sw3; }
                    r3 = r2[r0];
                    if (r3 == 0) { $pc3 = 21; continue $sw3; }
                    if (r3 == Integer.MIN_VALUE) { $pc3 = 21; continue $sw3; }
                    if (r3 != Integer.MAX_VALUE) { $pc3 = 19; continue $sw3; }
                    r3 = 0;
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    if (r6.j6(r3) == true) { $pc3 = 21; continue $sw3; }
                    return false;
                }
                case 21: {
                    r0 = r0 + 1;
                    { $pc3 = 9; continue $sw3; }
                }
                case 22: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6() {
        return this.VH;
    }

    public boolean j6(int r6) {
        int r0 = 0;
        int[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int[] r5 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r6 != 0) { $pc4 = 5; continue $sw4; }
                    r6 = Integer.MAX_VALUE;
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r0 = Integer.MAX_VALUE & r6;
                    r1 = this.Hw;
                    r2 = (r0 % (r1.length - 2)) + 1;
                    r3 = r0 % r1.length;
                    r4 = r1[r3];
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r4 == r6) { $pc4 = 11; continue $sw4; }
                    if (r4 == 0) { $pc4 = 8; continue $sw4; }
                    r5 = this.Hw;
                    r3 = (r3 + r2) % r5.length;
                    r4 = r5[r3];
                    { $pc4 = 6; continue $sw4; }
                }
                case 8: {
                    return false;
                }
                case 11: {
                    return true;
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
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = "{";
                    r1 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    r2 = this.Hw;
                    if (r1 >= r2.length) { $pc5 = 15; continue $sw5; }
                    r3 = r2[r1];
                    if (r3 == 0) { $pc5 = 13; continue $sw5; }
                    if (r3 == Integer.MIN_VALUE) { $pc5 = 13; continue $sw5; }
                    if (r3 != Integer.MAX_VALUE) { $pc5 = 12; continue $sw5; }
                    r0 = r0 + "0, ";
                    { $pc5 = 13; continue $sw5; }
                }
                case 12: {
                    r0 = r0 + r3 + ", ";
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    r1 = r1 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 15: {
                    return r0 + "}";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
