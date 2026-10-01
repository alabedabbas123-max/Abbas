package abcd;

public abstract class YD implements java.lang.Comparable {
    private static final char[] DW = null;
    private static final byte[] j6 = null;
    int FH;
    int Hw;
    int VH;
    int Zo;
    int v5;

    static {
        j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        DW = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public YD() {
    }

    private byte[] Ws() {
        byte[] r0 = new byte[40];
        j6(r0, 0, this.FH);
        j6(r0, 8, this.Hw);
        j6(r0, 16, this.v5);
        j6(r0, 24, this.Zo);
        j6(r0, 32, this.VH);
        return r0;
    }

    private char[] aM() {
        char[] r0 = new char[40];
        j6(r0);
        return r0;
    }

    private static void j6(java.io.OutputStream r1, int r2) {
        r1.write(r2 >>> 24);
        r1.write(r2 >>> 16);
        r1.write(r2 >>> 8);
        r1.write(r2);
    }

    private static void j6(byte[] r4, int r5, int r6) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5 + 7;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 < r5) { $pc0 = 7; continue $sw0; }
                    if (r6 == 0) { $pc0 = 7; continue $sw0; }
                    r4[r0] = j6[r6 & 15];
                    r6 = r6 >>> 4;
                    r0 = r0 - 1;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r0 < r5) { $pc0 = 8; continue $sw0; }
                    r4[r0] = 48;
                    r0 = r0 - 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(char[] r3) {
        j6(r3, 0, this.FH);
        j6(r3, 8, this.Hw);
        j6(r3, 16, this.v5);
        j6(r3, 24, this.Zo);
        j6(r3, 32, this.VH);
    }

    static void j6(char[] r4, int r5, int r6) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r5 + 7;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 < r5) { $pc1 = 7; continue $sw1; }
                    if (r6 == 0) { $pc1 = 7; continue $sw1; }
                    r4[r0] = DW[r6 & 15];
                    r6 = r6 >>> 4;
                    r0 = r0 - 1;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r0 < r5) { $pc1 = 8; continue $sw1; }
                    r4[r0] = '0';
                    r0 = r0 - 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(abcd.YD r3, abcd.YD r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 != r4) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if (r3.Hw == r4.Hw) { $pc2 = 8; continue $sw2; }
                    return false;
                }
                case 8: {
                    if (r3.v5 == r4.v5) { $pc2 = 10; continue $sw2; }
                    return false;
                }
                case 10: {
                    if (r3.Zo == r4.Zo) { $pc2 = 12; continue $sw2; }
                    return false;
                }
                case 12: {
                    if (r3.VH == r4.VH) { $pc2 = 14; continue $sw2; }
                    return false;
                }
                case 14: {
                    if (r3.FH != r4.FH) { $pc2 = 21; continue $sw2; }
                    return true;
                }
                case 21: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(java.io.OutputStream r2) {
        r2.write(Ws());
    }

    public void DW(byte[] r3, int r4) {
        abcd.FK.DW(r3, r4, this.FH);
        abcd.FK.DW(r3, r4 + 4, this.Hw);
        abcd.FK.DW(r3, r4 + 8, this.v5);
        abcd.FK.DW(r3, r4 + 12, this.Zo);
        abcd.FK.DW(r3, r4 + 16, this.VH);
    }

    public final boolean DW(abcd.YD r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 != null) { $pc3 = 6; continue $sw3; }
                    return false;
                }
                case 6: {
                    return j6(this, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(byte[] r3, int r4) {
        j6(r3, r4 + 0, this.FH);
        j6(r3, r4 + 8, this.Hw);
        j6(r3, r4 + 16, this.v5);
        j6(r3, r4 + 24, this.Zo);
        j6(r3, r4 + 32, this.VH);
    }

    public final abcd.yE Hw() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (getClass() != abcd.yE.class) { $pc4 = 7; continue $sw4; }
                    return (abcd.yE) this;
                }
                case 7: {
                    return new abcd.yE(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.yE J8();

    public final java.lang.String VH() {
        return we();
    }

    public final int Zo() {
        return this.FH >>> 24;
    }

    @Override
    public final int compareTo(java.lang.Object r1) {
        return j6((abcd.YD) r1);
    }

    public final boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if ((r2 instanceof abcd.YD) == true) { $pc5 = 5; continue $sw5; }
                    return false;
                }
                case 5: {
                    return DW((abcd.YD) r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int hashCode() {
        return this.Hw;
    }

    public final int j6(abcd.YD r3) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this != r3) { $pc6 = 5; continue $sw6; }
                    return 0;
                }
                case 5: {
                    r0 = abcd.FK.j6(this.FH, r3.FH);
                    if (r0 == 0) { $pc6 = 8; continue $sw6; }
                    return r0;
                }
                case 8: {
                    r1 = abcd.FK.j6(this.Hw, r3.Hw);
                    if (r1 == 0) { $pc6 = 11; continue $sw6; }
                    return r1;
                }
                case 11: {
                    r2 = abcd.FK.j6(this.v5, r3.v5);
                    if (r2 == 0) { $pc6 = 14; continue $sw6; }
                    return r2;
                }
                case 14: {
                    r4 = abcd.FK.j6(this.Zo, r3.Zo);
                    if (r4 == 0) { $pc6 = 18; continue $sw6; }
                    return r4;
                }
                case 18: {
                    return abcd.FK.j6(this.VH, r3.VH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int j6(byte[] r3, int r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r5 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = abcd.FK.j6(this.FH, abcd.FK.j6(r3, r4));
                    if (r0 == 0) { $pc7 = 5; continue $sw7; }
                    return r0;
                }
                case 5: {
                    r1 = abcd.FK.j6(this.Hw, abcd.FK.j6(r3, r4 + 4));
                    if (r1 == 0) { $pc7 = 8; continue $sw7; }
                    return r1;
                }
                case 8: {
                    r2 = abcd.FK.j6(this.v5, abcd.FK.j6(r3, r4 + 8));
                    if (r2 == 0) { $pc7 = 11; continue $sw7; }
                    return r2;
                }
                case 11: {
                    r5 = abcd.FK.j6(this.Zo, abcd.FK.j6(r3, r4 + 12));
                    if (r5 == 0) { $pc7 = 15; continue $sw7; }
                    return r5;
                }
                case 15: {
                    return abcd.FK.j6(this.VH, abcd.FK.j6(r3, r4 + 16));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int j6(int[] r3, int r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r5 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = abcd.FK.j6(this.FH, r3[r4]);
                    if (r0 == 0) { $pc8 = 5; continue $sw8; }
                    return r0;
                }
                case 5: {
                    r1 = abcd.FK.j6(this.Hw, r3[r4 + 1]);
                    if (r1 == 0) { $pc8 = 8; continue $sw8; }
                    return r1;
                }
                case 8: {
                    r2 = abcd.FK.j6(this.v5, r3[r4 + 2]);
                    if (r2 == 0) { $pc8 = 11; continue $sw8; }
                    return r2;
                }
                case 11: {
                    r5 = abcd.FK.j6(this.Zo, r3[r4 + 3]);
                    if (r5 == 0) { $pc8 = 15; continue $sw8; }
                    return r5;
                }
                case 15: {
                    return abcd.FK.j6(this.VH, r3[r4 + 4]);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.WD j6(int r10) {
        return new abcd.WD(r10, abcd.WD.j6(r10, 1, this.FH), abcd.WD.j6(r10, 2, this.Hw), abcd.WD.j6(r10, 3, this.v5), abcd.WD.j6(r10, 4, this.Zo), abcd.WD.j6(r10, 5, this.VH));
    }

    public void j6(java.io.OutputStream r2) {
        j6(r2, this.FH);
        j6(r2, this.Hw);
        j6(r2, this.v5);
        j6(r2, this.Zo);
        j6(r2, this.VH);
    }

    public void j6(char[] r3, java.io.Writer r4) {
        j6(r3);
        r4.write(r3, 0, 40);
    }

    public void j6(char[] r3, java.lang.StringBuilder r4) {
        j6(r3);
        r4.append(r3, 0, 40);
    }

    public java.lang.String toString() {
        return "AnyObjectId[" + we() + "]";
    }

    public final java.lang.String we() {
        return new java.lang.String(aM());
    }
}
