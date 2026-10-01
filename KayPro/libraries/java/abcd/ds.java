package abcd;

public final class ds extends abcd.hu {
    public static final abcd.ds DW = null;
    private final abcd.bs[] FH;
    private int Hw;

    static {
        DW = new abcd.ds(0);
    }

    public ds(int r3) {
        boolean r1 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == 0) { $pc0 = 5; continue $sw0; }
                    r1 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    super(r1);
                    this.FH = new abcd.bs[r3];
                    this.Hw = 0;
                    return;
                }
                case 5: {
                    r1 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs DW(abcd.bs r1) {
        return get(r1.we());
    }

    public abcd.ds DW(int r5) {
        int r0 = 0;
        abcd.ds r1 = null;
        int r2 = 0;
        abcd.bs r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.FH.length;
                    r1 = new abcd.ds(r0 + r5);
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= r0) { $pc1 = 8; continue $sw1; }
                    r3 = this.FH[r2];
                    if (r3 == null) { $pc1 = 7; continue $sw1; }
                    r1.FH(r3.DW(r5));
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 8: {
                    r1.Hw = this.Hw;
                    if (VH() == false) { $pc1 = 11; continue $sw1; }
                    r1.we();
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(abcd.bs r6) {
        int r0 = 0;
        int r3 = 0;
        abcd.bs r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    J8();
                    if (r6 == null) { $pc2 = 19; continue $sw2; }
                    this.Hw = -1;
                    try {
                        r0 = r6.we();
                        this.FH[r0] = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc2 = 16; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 <= 0) { $pc2 = 13; continue $sw2; }
                    try {
                        r3 = r0 - 1;
                        r4 = this.FH[r3];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc2 = 16; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == null) { $pc2 = 13; continue $sw2; }
                    if (r4.Hw() != 2) { $pc2 = 13; continue $sw2; }
                    try {
                        this.FH[r3] = null;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc2 = 16; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    if (r6.Hw() != 2) { $pc2 = 22; continue $sw2; }
                    try {
                        this.FH[r0 + 1] = null;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc2 = 16; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 22: {
                    return;
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException("spec.getReg() out of range");
                }
                case 19: {
                    throw new java.lang.NullPointerException("spec == null");
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(abcd.bs r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        this.FH[r3.we()] = null;
                        this.Hw = -1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 4; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    throw new java.lang.IllegalArgumentException("bogus reg");
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r6) {
        abcd.ds r7 = null;
        abcd.bs[] r0 = null;
        int r2 = 0;
        int r8 = 0;
        abcd.bs r3 = null;
        java.lang.Object r4 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r6 instanceof abcd.ds) == true) { $pc4 = 5; continue $sw4; }
                    return false;
                }
                case 5: {
                    r7 = (abcd.ds) r6;
                    r0 = r7.FH;
                    r2 = this.FH.length;
                    if (r2 == r0.length) { $pc4 = 8; continue $sw4; }
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    return false;
                }
                case 8: {
                    if (size() != r7.size()) { $pc4 = 23; continue $sw4; }
                    r8 = 0;
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    if (r8 >= r2) { $pc4 = 21; continue $sw4; }
                    r3 = this.FH[r8];
                    r4 = r0[r8];
                    if (r3 == r4) { $pc4 = 19; continue $sw4; }
                    if (r3 == null) { $pc4 = 20; continue $sw4; }
                    if (r3.equals(r4) == true) { $pc4 = 19; continue $sw4; }
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    return false;
                }
                case 19: {
                    r8 = r8 + 1;
                    { $pc4 = 11; continue $sw4; }
                }
                case 21: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs get(int r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    return this.FH[r2];
                }
                case 5: {
                    throw new java.lang.IllegalArgumentException("bogus reg");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.bs r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.FH.length;
                    r2 = 0;
                    r3 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r2 >= r0) { $pc6 = 9; continue $sw6; }
                    r4 = this.FH[r2];
                    if (r4 != null) { $pc6 = 7; continue $sw6; }
                    r5 = 0;
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    r3 = (r3 * 31) + r5;
                    r2 = r2 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 7: {
                    r5 = r4.hashCode();
                    { $pc6 = 8; continue $sw6; }
                }
                case 9: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs j6(abcd.Vr r5) {
        int r0 = 0;
        int r1 = 0;
        abcd.bs r2 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.FH.length;
                    r1 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r1 >= r0) { $pc7 = 10; continue $sw7; }
                    r2 = this.FH[r1];
                    if (r2 == null) { $pc7 = 9; continue $sw7; }
                    if (r5.equals(r2.Zo()) == false) { $pc7 = 9; continue $sw7; }
                    return r2;
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs j6(abcd.bs r5) {
        int r0 = 0;
        int r1 = 0;
        abcd.bs r2 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.FH.length;
                    r1 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    if (r1 >= r0) { $pc8 = 11; continue $sw8; }
                    r2 = this.FH[r1];
                    if (r2 == null) { $pc8 = 10; continue $sw8; }
                    if (r5.FH(r2) == false) { $pc8 = 10; continue $sw8; }
                    return r2;
                }
                case 10: {
                    r1 = r1 + 1;
                    { $pc8 = 3; continue $sw8; }
                }
                case 11: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.ds r4) {
        int r0 = 0;
        int r1 = 0;
        abcd.bs r2 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r4.lg();
                    r1 = 0;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    if (r1 >= r0) { $pc9 = 8; continue $sw9; }
                    r2 = r4.get(r1);
                    if (r2 == null) { $pc9 = 7; continue $sw9; }
                    FH(r2);
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    r1 = r1 + 1;
                    { $pc9 = 3; continue $sw9; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.ds r6, boolean r7) {
        abcd.bs[] r8 = null;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.bs r3 = null;
        abcd.bs r4 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    J8();
                    r8 = r6.FH;
                    r0 = this.FH.length;
                    r1 = java.lang.Math.min(r0, r8.length);
                    this.Hw = -1;
                    r2 = 0;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r2 >= r1) { $pc10 = 11; continue $sw10; }
                    r3 = this.FH[r2];
                    if (r3 == null) { $pc10 = 10; continue $sw10; }
                    r4 = r3.j6(r8[r2], r7);
                    if (r4 == r3) { $pc10 = 10; continue $sw10; }
                    this.FH[r2] = r4;
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    r2 = r2 + 1;
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    if (r1 >= r0) { $pc10 = 13; continue $sw10; }
                    this.FH[r1] = null;
                    r1 = r1 + 1;
                    { $pc10 = 11; continue $sw10; }
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int lg() {
        return this.FH.length;
    }

    public abcd.ds rN() {
        int r0 = 0;
        abcd.ds r1 = null;
        int r2 = 0;
        abcd.bs r3 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.FH.length;
                    r1 = new abcd.ds(r0);
                    r2 = 0;
                    $pc11 = 3; continue $sw11;
                }
                case 3: {
                    if (r2 >= r0) { $pc11 = 8; continue $sw11; }
                    r3 = this.FH[r2];
                    if (r3 == null) { $pc11 = 7; continue $sw11; }
                    r1.FH(r3);
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    r2 = r2 + 1;
                    { $pc11 = 3; continue $sw11; }
                }
                case 8: {
                    r1.Hw = this.Hw;
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int size() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 >= 0) { $pc12 = 15; continue $sw12; }
                    r1 = this.FH.length;
                    r2 = 0;
                    r3 = 0;
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    if (r2 >= r1) { $pc12 = 10; continue $sw12; }
                    if (this.FH[r2] == null) { $pc12 = 9; continue $sw12; }
                    r3 = r3 + 1;
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    r2 = r2 + 1;
                    { $pc12 = 5; continue $sw12; }
                }
                case 10: {
                    this.Hw = r3;
                    return r3;
                }
                case 15: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        int r0 = 0;
        java.lang.StringBuffer r1 = null;
        int r2 = 0;
        boolean r3 = false;
        abcd.bs r4 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.FH.length;
                    r1 = new java.lang.StringBuffer(r0 * 25);
                    r1.append('{');
                    r2 = 0;
                    r3 = false;
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    if (r2 >= r0) { $pc13 = 11; continue $sw13; }
                    r4 = this.FH[r2];
                    if (r4 == null) { $pc13 = 10; continue $sw13; }
                    if (r3 == false) { $pc13 = 8; continue $sw13; }
                    r1.append(", ");
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    r1.append(r4);
                    { $pc13 = 10; continue $sw13; }
                }
                case 8: {
                    r3 = true;
                    $pc13 = 10; continue $sw13;
                }
                case 10: {
                    r2 = r2 + 1;
                    { $pc13 = 3; continue $sw13; }
                }
                case 11: {
                    r1.append('}');
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
