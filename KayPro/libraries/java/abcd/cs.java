package abcd;

public final class cs extends abcd.Xt implements abcd.Ss {
    public static final abcd.cs FH = null;

    static {
        FH = new abcd.cs(0);
    }

    public cs(int r1) {
        super(r1);
    }

    public static abcd.cs j6(abcd.bs r2) {
        abcd.cs r0 = new abcd.cs(1);
        r0.j6(0, r2);
        return r0;
    }

    public static abcd.cs j6(abcd.bs r2, abcd.bs r3) {
        abcd.cs r0 = new abcd.cs(2);
        r0.j6(0, r2);
        r0.j6(1, r3);
        return r0;
    }

    public abcd.cs DW(abcd.bs r6) {
        int r0 = 0;
        abcd.cs r1 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = size();
                    r1 = new abcd.cs(r0 + 1);
                    r3 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r3 >= r0) { $pc0 = 5; continue $sw0; }
                    r4 = r3 + 1;
                    r1.j6(r4, DW(r3));
                    r3 = r4;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r1.j6(0, r6);
                    if (VH() == false) { $pc0 = 8; continue $sw0; }
                    r1.we();
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw(int r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r0) { $pc1 = 8; continue $sw1; }
                    if (get(r1).we() == r4) { $pc1 = 6; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    return r1;
                }
                case 8: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.cs er() {
        int r0 = 0;
        abcd.cs r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = size() - 1;
                    if (r0 == 0) { $pc2 = 5; continue $sw2; }
                    r1 = new abcd.cs(r0);
                    r2 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r2 >= r0) { $pc2 = 10; continue $sw2; }
                    r3 = r2 + 1;
                    r1.j6(r2, DW(r3));
                    r2 = r3;
                    { $pc2 = 7; continue $sw2; }
                }
                case 10: {
                    if (VH() == false) { $pc2 = 12; continue $sw2; }
                    r1.we();
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    return r1;
                }
                case 5: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs get(int r1) {
        return (abcd.bs) DW(r1);
    }

    @Override
    public abcd.Qs getType(int r1) {
        abcd.Qs r2 = get(r1).getType();
        r2.getType();
        return r2;
    }

    @Override
    public abcd.Ss j6(abcd.Qs r2) {
        throw new java.lang.UnsupportedOperationException("unsupported");
    }

    public abcd.cs j6(int r8, boolean r9, java.util.BitSet r10) {
        int r0 = 0;
        abcd.cs r1 = null;
        boolean r3 = false;
        int r11 = 0;
        int r12 = 0;
        abcd.bs r4 = null;
        boolean r5 = false;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = size();
                    if (r0 != 0) { $pc3 = 5; continue $sw3; }
                    return this;
                }
                case 5: {
                    r1 = new abcd.cs(r0);
                    r3 = r9;
                    r11 = r8;
                    r12 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r12 >= r0) { $pc3 = 23; continue $sw3; }
                    r4 = (abcd.bs) DW(r12);
                    r5 = true;
                    if (r10 != null) { $pc3 = 11; continue $sw3; }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    if (r5 == false) { $pc3 = 18; continue $sw3; }
                    r1.j6(r12, r4.FH(r11));
                    if (r3 == true) { $pc3 = 19; continue $sw3; }
                    r11 = r11 + r4.Hw();
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    if (r3 == false) { $pc3 = 21; continue $sw3; }
                    r3 = false;
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    r12 = r12 + 1;
                    { $pc3 = 6; continue $sw3; }
                }
                case 18: {
                    r1.j6(r12, r4);
                    { $pc3 = 19; continue $sw3; }
                }
                case 11: {
                    if (r10.get(r12) == false) { $pc3 = 14; continue $sw3; }
                    r5 = false;
                    { $pc3 = 14; continue $sw3; }
                }
                case 23: {
                    if (VH() == false) { $pc3 = 25; continue $sw3; }
                    r1.we();
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.cs j6(java.util.BitSet r5) {
        int r0 = 0;
        abcd.cs r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = size() - r5.cardinality();
                    if (r0 == 0) { $pc4 = 5; continue $sw4; }
                    r1 = new abcd.cs(r0);
                    r2 = 0;
                    r3 = 0;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r2 >= size()) { $pc4 = 14; continue $sw4; }
                    if (r5.get(r2) == true) { $pc4 = 12; continue $sw4; }
                    r1.j6(r3, DW(r2));
                    r3 = r3 + 1;
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r2 = r2 + 1;
                    { $pc4 = 8; continue $sw4; }
                }
                case 14: {
                    if (VH() == false) { $pc4 = 16; continue $sw4; }
                    r1.we();
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    return r1;
                }
                case 5: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r1, abcd.bs r2) {
        j6(r1, r2);
    }

    public int rN() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    r2 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r1 >= r0) { $pc5 = 5; continue $sw5; }
                    r2 = r2 + getType(r1).Zo();
                    r1 = r1 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.cs v5(int r5) {
        int r0 = 0;
        abcd.cs r1 = null;
        int r2 = 0;
        abcd.bs r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = size();
                    if (r0 != 0) { $pc6 = 5; continue $sw6; }
                    return this;
                }
                case 5: {
                    r1 = new abcd.cs(r0);
                    r2 = 0;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r2 >= r0) { $pc6 = 12; continue $sw6; }
                    r3 = (abcd.bs) DW(r2);
                    if (r3 == null) { $pc6 = 10; continue $sw6; }
                    r1.j6(r2, r3.DW(r5));
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    r2 = r2 + 1;
                    { $pc6 = 6; continue $sw6; }
                }
                case 12: {
                    if (VH() == false) { $pc6 = 14; continue $sw6; }
                    r1.we();
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.cs yS() {
        int r0 = 0;
        abcd.cs r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = size() - 1;
                    if (r0 == 0) { $pc7 = 5; continue $sw7; }
                    r1 = new abcd.cs(r0);
                    r2 = 0;
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r2 >= r0) { $pc7 = 10; continue $sw7; }
                    r1.j6(r2, DW(r2));
                    r2 = r2 + 1;
                    { $pc7 = 7; continue $sw7; }
                }
                case 10: {
                    if (VH() == false) { $pc7 = 12; continue $sw7; }
                    r1.we();
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    return r1;
                }
                case 5: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
