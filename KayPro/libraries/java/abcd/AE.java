package abcd;

public class AE<V extends abcd.AE.a> implements java.lang.Iterable<V> {
    private int DW;
    private int FH;
    private int Hw;
    private V[][] j6;
    private int v5;

    public static abstract class a extends abcd.yE {
        abcd.AE.a tp;

        public a(abcd.YD r1) {
            super(r1);
        }
    }

    public AE() {
        this.Hw = 0;
        this.v5 = 0;
        this.FH = v5(this.Hw);
        this.j6 = (V[][]) new abcd.AE.a[1024][];
        ((V[][]) this.j6)[0] = DW();
    }

    private final V[] DW() {
        return (V[]) new abcd.AE.a[2048];
    }

    static abcd.AE.a[][] DW(abcd.AE r0) {
        return r0.j6;
    }

    static int FH(abcd.AE r0) {
        return r0.Hw;
    }

    static int j6(abcd.AE r0) {
        return r0.DW;
    }

    private void j6() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r1 = 0;
        int r4 = 0;
        V[][] r5 = null;
        V[][] r6 = null;
        int r7 = 0;
        abcd.AE.a[] r8 = null;
        abcd.AE.a[] r9 = null;
        int r10 = 0;
        abcd.AE.a r11 = null;
        abcd.AE.a r12 = null;
        abcd.AE.a r13 = null;
        abcd.AE.a r14 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw;
                    r2 = 1 << r0;
                    r3 = 1 << r0;
                    this.Hw = r0 + 1;
                    r1 = this.Hw;
                    this.v5 = (1 << r1) - 1;
                    this.FH = v5(r1);
                    r4 = 1 << this.Hw;
                    r5 = this.j6;
                    if (r5.length >= r4) { $pc0 = 5; continue $sw0; }
                    r6 = (V[][]) new abcd.AE.a[r4 << 1][];
                    java.lang.System.arraycopy(r5, 0, r6, 0, r2);
                    this.j6 = r6;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r7 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r7 >= r2) { $pc0 = 7; continue $sw0; }
                    r8 = this.j6[r7];
                    r9 = DW();
                    r10 = 0;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r10 >= r8.length) { $pc0 = 11; continue $sw0; }
                    r11 = r8[r10];
                    r12 = null;
                    r13 = null;
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    if (r11 == null) { $pc0 = 14; continue $sw0; }
                    r14 = r11.tp;
                    if ((r11.FH & r3) != 0) { $pc0 = 18; continue $sw0; }
                    r11.tp = r12;
                    r12 = r11;
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    r11 = r14;
                    { $pc0 = 13; continue $sw0; }
                }
                case 18: {
                    r11.tp = r13;
                    r13 = r11;
                    { $pc0 = 19; continue $sw0; }
                }
                case 14: {
                    r8[r10] = r12;
                    r9[r10] = r13;
                    r10 = r10 + 1;
                    { $pc0 = 10; continue $sw0; }
                }
                case 11: {
                    ((V[][]) this.j6)[r2 + r7] = r9;
                    r7 = r7 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static final boolean j6(abcd.YD r2, abcd.YD r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2.Hw == r3.Hw) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    if (r2.v5 == r3.v5) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    if (r2.Zo == r3.Zo) { $pc1 = 9; continue $sw1; }
                    return false;
                }
                case 9: {
                    if (r2.VH == r3.VH) { $pc1 = 11; continue $sw1; }
                    return false;
                }
                case 11: {
                    if (r2.FH != r3.FH) { $pc1 = 19; continue $sw1; }
                    return true;
                }
                case 19: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static final int v5(int r1) {
        return 1 << (r1 + 11);
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)TV; */
    public abcd.AE.a DW(abcd.AE.a r5) {
        int r0 = 0;
        abcd.AE.a[] r1 = null;
        int r2 = 0;
        abcd.AE.a r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r5.FH;
                    r1 = this.j6[this.v5 & r0];
                    r2 = r0 >>> 21;
                    r3 = r1[r2];
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r3 == null) { $pc2 = 4; continue $sw2; }
                    if (j6(r3, r5) == true) { $pc2 = 10; continue $sw2; }
                    r3 = r3.tp;
                    { $pc2 = 3; continue $sw2; }
                }
                case 10: {
                    return r3;
                }
                case 4: {
                    r5.tp = r1[r2];
                    r1[r2] = r5;
                    r4 = this.DW + 1;
                    this.DW = r4;
                    if (r4 != this.FH) { $pc2 = 7; continue $sw2; }
                    j6();
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public V DW(abcd.YD r4) {
        int r0 = 0;
        V r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r4.FH;
                    r1 = this.j6[this.v5 & r0][r0 >>> 21];
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r1 == null) { $pc3 = 4; continue $sw3; }
                    if (j6(r1, r4) == true) { $pc3 = 8; continue $sw3; }
                    r1 = (V) r1.tp;
                    { $pc3 = 3; continue $sw3; }
                }
                case 8: {
                    return r1;
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void clear() {
        int r0 = 0;
        V[][] r1 = null;
        int r2 = 0;
        V[] r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = 0;
                    this.DW = 0;
                    r1 = this.j6;
                    r2 = r1.length;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r0 >= r2) { $pc4 = 7; continue $sw4; }
                    r3 = r1[r0];
                    if (r3 == null) { $pc4 = 11; continue $sw4; }
                    java.util.Arrays.fill(r3, null);
                    r0 = r0 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 11: {
                    return;
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<V> iterator() {
        return new abcd.zE(this);
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)V */
    public void j6(abcd.AE.a r4) {
        int r0 = 0;
        int r1 = 0;
        abcd.AE.a[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.DW + 1;
                    this.DW = r0;
                    if (r0 != this.FH) { $pc5 = 5; continue $sw5; }
                    j6();
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r1 = r4.FH;
                    r2 = this.j6[this.v5 & r1];
                    r3 = r1 >>> 21;
                    r4.tp = r2[r3];
                    r2[r3] = r4;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.YD r1) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (DW(r1) == null) { $pc6 = 6; continue $sw6; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int size() {
        return this.DW;
    }
}
