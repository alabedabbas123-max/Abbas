package abcd;

public class ClassY<E> implements java.lang.Cloneable {
    private static final java.lang.Object j6 = null;
    private boolean DW;
    private int[] FH;
    private java.lang.Object[] Hw;
    private int v5;

    static {
        j6 = new java.lang.Object();
    }

    public ClassY() {
        this(10);
    }

    public ClassY(int r3) {
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = false;
                    if (r3 != 0) { $pc0 = 5; continue $sw0; }
                    this.FH = abcd.ClassN.j6;
                    this.Hw = abcd.ClassN.FH;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.v5 = 0;
                    return;
                }
                case 5: {
                    r4 = abcd.ClassN.DW(r3);
                    this.FH = new int[r4];
                    this.Hw = new java.lang.Object[r4];
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        int r0 = 0;
        int[] r1 = null;
        java.lang.Object[] r2 = null;
        int r4 = 0;
        int r5 = 0;
        java.lang.Object r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.v5;
                    r1 = this.FH;
                    r2 = this.Hw;
                    r4 = 0;
                    r5 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r4 >= r0) { $pc1 = 10; continue $sw1; }
                    r6 = r2[r4];
                    if (r6 == j6) { $pc1 = 9; continue $sw1; }
                    if (r4 == r5) { $pc1 = 8; continue $sw1; }
                    r1[r5] = r1[r4];
                    r2[r5] = r6;
                    r2[r4] = null;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r5 = r5 + 1;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    r4 = r4 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 10: {
                    this.DW = false;
                    this.v5 = r5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.DW == false) { $pc2 = 6; continue $sw2; }
                    FH();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public E DW(int r2) {
        return j6(r2, null);
    }

    public void DW(int r7, E r8) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Object[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        int[] r5 = null;
        java.lang.Object[] r6 = null;
        int[] r9 = null;
        java.lang.Object[] r10 = null;
        int r11 = 0;
        int[] r12 = null;
        int r13 = 0;
        java.lang.Object[] r14 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = abcd.ClassN.j6(this.FH, this.v5, r7);
                    if (r0 < 0) { $pc3 = 5; continue $sw3; }
                    this.Hw[r0] = r8;
                    return;
                }
                case 5: {
                    r1 = r0 ^ (-1);
                    if (r1 >= this.v5) { $pc3 = 12; continue $sw3; }
                    r2 = this.Hw;
                    if (r2[r1] != j6) { $pc3 = 12; continue $sw3; }
                    this.FH[r1] = r7;
                    r2[r1] = r8;
                    return;
                }
                case 12: {
                    if (this.DW == true) { $pc3 = 14; continue $sw3; }
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    r3 = this.v5;
                    if (r3 < this.FH.length) { $pc3 = 19; continue $sw3; }
                    r4 = abcd.ClassN.DW(r3 + 1);
                    r5 = new int[r4];
                    r6 = new java.lang.Object[r4];
                    r9 = this.FH;
                    java.lang.System.arraycopy(r9, 0, r5, 0, r9.length);
                    r10 = this.Hw;
                    java.lang.System.arraycopy(r10, 0, r6, 0, r10.length);
                    this.FH = r5;
                    this.Hw = r6;
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    r11 = this.v5;
                    if ((r11 - r1) == 0) { $pc3 = 22; continue $sw3; }
                    r12 = this.FH;
                    r13 = r1 + 1;
                    java.lang.System.arraycopy(r12, r1, r12, r13, r11 - r1);
                    r14 = this.Hw;
                    java.lang.System.arraycopy(r14, r1, r14, r13, this.v5 - r1);
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    this.FH[r1] = r7;
                    this.Hw[r1] = r8;
                    this.v5++;
                    return;
                }
                case 14: {
                    if (this.v5 < this.FH.length) { $pc3 = 16; continue $sw3; }
                    FH();
                    r1 = abcd.ClassN.j6(this.FH, this.v5, r7) ^ (-1);
                    { $pc3 = 16; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH(int r3) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.DW == false) { $pc4 = 6; continue $sw4; }
                    FH();
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return abcd.ClassN.j6(this.FH, this.v5, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw(int r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.DW == false) { $pc5 = 6; continue $sw5; }
                    FH();
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return this.FH[r2];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public E Zo(int r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.DW == false) { $pc6 = 6; continue $sw6; }
                    FH();
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return (E) this.Hw[r2];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public y<E> clone() {
        abcd.ClassY r1 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    try {
                        r1 = (abcd.ClassY) super.clone();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.CloneNotSupportedException) { $pc7 = 6; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r1.FH = (int[]) this.FH.clone();
                        r1.Hw = (java.lang.Object[]) this.Hw.clone();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.CloneNotSupportedException) { $pc7 = 8; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r1;
                }
                case 14: {
                    return r1;
                }
                case 7: {
                    return null;
                }
                case 6: {
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.Object m37clone() {
        return clone();
    }

    public E j6(int r4, E r5) {
        int r6 = 0;
        java.lang.Object[] r0 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r6 = abcd.ClassN.j6(this.FH, this.v5, r4);
                    if (r6 < 0) { $pc8 = 9; continue $sw8; }
                    r0 = this.Hw;
                    if (r0[r6] == j6) { $pc8 = 9; continue $sw8; }
                    return (E) r0[r6];
                }
                case 9: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        int r0 = 0;
        java.lang.Object[] r1 = null;
        int r3 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.v5;
                    r1 = this.Hw;
                    r3 = 0;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    if (r3 >= r0) { $pc9 = 5; continue $sw9; }
                    r1[r3] = null;
                    r3 = r3 + 1;
                    { $pc9 = 3; continue $sw9; }
                }
                case 5: {
                    this.v5 = 0;
                    this.DW = false;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r4) {
        int r5 = 0;
        java.lang.Object[] r0 = null;
        java.lang.Object r1 = null;
        java.lang.Object r2 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r5 = abcd.ClassN.j6(this.FH, this.v5, r4);
                    if (r5 < 0) { $pc10 = 8; continue $sw10; }
                    r0 = this.Hw;
                    r1 = r0[r5];
                    r2 = j6;
                    if (r1 == r2) { $pc10 = 9; continue $sw10; }
                    r0[r5] = r2;
                    this.DW = true;
                    return;
                }
                case 9: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        E r2 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (DW() > 0) { $pc11 = 6; continue $sw11; }
                    return "{}";
                }
                case 6: {
                    r0 = new java.lang.StringBuilder(this.v5 * 28);
                    r0.append('{');
                    r1 = 0;
                    $pc11 = 8; continue $sw11;
                }
                case 8: {
                    if (r1 >= this.v5) { $pc11 = 16; continue $sw11; }
                    if (r1 <= 0) { $pc11 = 11; continue $sw11; }
                    r0.append(", ");
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    r0.append(Hw(r1));
                    r0.append('=');
                    r2 = Zo(r1);
                    if (r2 == this) { $pc11 = 14; continue $sw11; }
                    r0.append(r2);
                    $pc11 = 15; continue $sw11;
                }
                case 15: {
                    r1 = r1 + 1;
                    { $pc11 = 8; continue $sw11; }
                }
                case 14: {
                    r0.append("(this Map)");
                    { $pc11 = 15; continue $sw11; }
                }
                case 16: {
                    r0.append('}');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5(int r1) {
        j6(r1);
    }
}
