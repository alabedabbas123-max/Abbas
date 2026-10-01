package abcd;

public final class au extends abcd.hu {
    public static final abcd.au DW = null;
    private int[] FH;
    private int Hw;
    private boolean v5;

    static {
        DW = new abcd.au(0);
        DW.we();
    }

    public au() {
        this(4);
    }

    public au(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(true);
                    try {
                        this.FH = new int[r2];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NegativeArraySizeException) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.Hw = 0;
                    this.v5 = true;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("size < 0");
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.au DW(int r2, int r3) {
        abcd.au r0 = new abcd.au(2);
        r0.DW(r2);
        r0.DW(r3);
        r0.we();
        return r0;
    }

    public static abcd.au Zo(int r2) {
        abcd.au r0 = new abcd.au(1);
        r0.DW(r2);
        r0.we();
        return r0;
    }

    private void gW() {
        int r0 = 0;
        int[] r1 = null;
        int[] r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw;
                    r1 = this.FH;
                    if (r0 != r1.length) { $pc1 = 6; continue $sw1; }
                    r2 = new int[((r0 * 3) / 2) + 10];
                    java.lang.System.arraycopy(r1, 0, r2, 0, r0);
                    this.FH = r2;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r4) {
        int[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    J8();
                    gW();
                    r0 = this.FH;
                    r1 = this.Hw;
                    this.Hw = r1 + 1;
                    r0[r1] = r4;
                    if (this.v5 == false) { $pc2 = 12; continue $sw2; }
                    r2 = this.Hw;
                    r3 = true;
                    if (r2 > 1) { $pc2 = 7; continue $sw2; }
                    return;
                }
                case 7: {
                    if (r4 >= r0[r2 - 2]) { $pc2 = 10; continue $sw2; }
                    r3 = false;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    this.v5 = r3;
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH(int r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Hw;
                    if (this.v5 == true) { $pc3 = 12; continue $sw3; }
                    r1 = 0;
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r1 >= r0) { $pc3 = 11; continue $sw3; }
                    if (this.FH[r1] == r6) { $pc3 = 8; continue $sw3; }
                    r1 = r1 + 1;
                    { $pc3 = 5; continue $sw3; }
                }
                case 8: {
                    return r1;
                }
                case 11: {
                    return -r0;
                }
                case 12: {
                    r2 = r0;
                    r3 = -1;
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    if (r2 <= (r3 + 1)) { $pc3 = 19; continue $sw3; }
                    r4 = ((r2 - r3) >> 1) + r3;
                    if (r6 <= this.FH[r4]) { $pc3 = 17; continue $sw3; }
                    r3 = r4;
                    { $pc3 = 14; continue $sw3; }
                }
                case 17: {
                    r2 = r4;
                    { $pc3 = 14; continue $sw3; }
                }
                case 19: {
                    if (r2 == r0) { $pc3 = 26; continue $sw3; }
                    if (r6 != this.FH[r2]) { $pc3 = 24; continue $sw3; }
                    return r2;
                }
                case 24: {
                    return (-r2) - 1;
                }
                case 26: {
                    return (-r0) - 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(int r2, int r3) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    J8();
                    if (r2 >= this.Hw) { $pc4 = 12; continue $sw4; }
                    try {
                        this.FH[r2] = r3;
                        this.v5 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc4 = 6; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 7: {
                    if (r2 < 0) { $pc4 = 10; continue $sw4; }
                    return;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("n < 0");
                }
                case 12: {
                    throw new java.lang.IndexOutOfBoundsException("n >= size()");
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Hw(int r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (v5(r1) < 0) { $pc5 = 5; continue $sw5; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void VH(int r4) {
        int r0 = 0;
        int[] r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.Hw;
                    if (r4 >= r0) { $pc6 = 7; continue $sw6; }
                    r1 = this.FH;
                    java.lang.System.arraycopy(r1, r4 + 1, r1, r4, (r0 - r4) - 1);
                    this.Hw--;
                    return;
                }
                case 7: {
                    throw new java.lang.IndexOutOfBoundsException("n >= size()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r6) {
        abcd.au r7 = null;
        int r1 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r6 != this) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    if ((r6 instanceof abcd.au) == true) { $pc7 = 8; continue $sw7; }
                    return false;
                }
                case 8: {
                    r7 = (abcd.au) r6;
                    if (this.v5 == r7.v5) { $pc7 = 12; continue $sw7; }
                    return false;
                }
                case 12: {
                    if (this.Hw == r7.Hw) { $pc7 = 14; continue $sw7; }
                    return false;
                }
                case 14: {
                    r1 = 0;
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    if (r1 >= this.Hw) { $pc7 = 21; continue $sw7; }
                    if (this.FH[r1] != r7.FH[r1]) { $pc7 = 19; continue $sw7; }
                    r1 = r1 + 1;
                    { $pc7 = 16; continue $sw7; }
                }
                case 19: {
                    return false;
                }
                case 21: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void er() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    J8();
                    if (this.v5 == true) { $pc8 = 6; continue $sw8; }
                    java.util.Arrays.sort(this.FH, 0, this.Hw);
                    this.v5 = true;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int get(int r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r2 >= this.Hw) { $pc9 = 9; continue $sw9; }
                    return this.FH[r2];
                }
                case 7: {
                    throw new java.lang.IndexOutOfBoundsException("n < 0");
                }
                case 9: {
                    throw new java.lang.IndexOutOfBoundsException("n >= size()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void gn(int r2) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r2 < 0) { $pc10 = 10; continue $sw10; }
                    if (r2 > this.Hw) { $pc10 = 8; continue $sw10; }
                    J8();
                    this.Hw = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("newSize > size");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("newSize < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r0 >= this.Hw) { $pc11 = 6; continue $sw11; }
                    r1 = (r1 * 31) + this.FH[r0];
                    r0 = r0 + 1;
                    { $pc11 = 4; continue $sw11; }
                }
                case 6: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r5, int r6) {
        int[] r0 = null;
        int r1 = 0;
        int[] r2 = null;
        boolean r3 = false;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (r5 > this.Hw) { $pc12 = 18; continue $sw12; }
                    gW();
                    r0 = this.FH;
                    r1 = r5 + 1;
                    java.lang.System.arraycopy(r0, r5, r0, r1, this.Hw - r5);
                    r2 = this.FH;
                    r2[r5] = r6;
                    r3 = true;
                    this.Hw++;
                    if (this.v5 == false) { $pc12 = 14; continue $sw12; }
                    if (r5 == 0) { $pc12 = 10; continue $sw12; }
                    if (r6 <= r2[r5 - 1]) { $pc12 = 14; continue $sw12; }
                    $pc12 = 10; continue $sw12;
                }
                case 10: {
                    if (r5 != (this.Hw - 1)) { $pc12 = 12; continue $sw12; }
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    this.v5 = r3;
                    return;
                }
                case 12: {
                    if (r6 < this.FH[r1]) { $pc12 = 15; continue $sw12; }
                    $pc12 = 14; continue $sw12;
                }
                case 14: {
                    r3 = false;
                    { $pc12 = 15; continue $sw12; }
                }
                case 18: {
                    throw new java.lang.IndexOutOfBoundsException("n > size()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.au lg() {
        int r0 = 0;
        abcd.au r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.Hw;
                    r1 = new abcd.au(r0);
                    r2 = 0;
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    if (r2 >= r0) { $pc13 = 5; continue $sw13; }
                    r1.DW(this.FH[r2]);
                    r2 = r2 + 1;
                    { $pc13 = 3; continue $sw13; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int rN() {
        J8();
        int r0 = get(this.Hw - 1);
        this.Hw--;
        return r0;
    }

    public int size() {
        return this.Hw;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = new java.lang.StringBuffer((this.Hw * 5) + 10);
                    r0.append('{');
                    r1 = 0;
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    if (r1 >= this.Hw) { $pc14 = 8; continue $sw14; }
                    if (r1 == 0) { $pc14 = 7; continue $sw14; }
                    r0.append(", ");
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    r0.append(this.FH[r1]);
                    r1 = r1 + 1;
                    { $pc14 = 4; continue $sw14; }
                }
                case 8: {
                    r0.append('}');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int v5(int r1) {
        int r2 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r2 = FH(r1);
                    if (r2 >= 0) { $pc15 = 7; continue $sw15; }
                    return -1;
                }
                case 7: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int yS() {
        return get(this.Hw - 1);
    }
}
