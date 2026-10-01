package abcd;

public final class Jm extends abcd.Xt {
    public static final abcd.Jm FH = null;

    public static class a {
        private final int DW;
        private final int FH;
        private final abcd.Ks Hw;
        private final int j6;

        public a(int r1, int r2, int r3, abcd.Ks r4) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r1 < 0) { $pc0 = 13; continue $sw0; }
                        if (r2 < r1) { $pc0 = 11; continue $sw0; }
                        if (r3 < 0) { $pc0 = 9; continue $sw0; }
                        this.j6 = r1;
                        this.DW = r2;
                        this.FH = r3;
                        this.Hw = r4;
                        return;
                    }
                    case 9: {
                        throw new java.lang.IllegalArgumentException("handlerPc < 0");
                    }
                    case 11: {
                        throw new java.lang.IllegalArgumentException("endPc < startPc");
                    }
                    case 13: {
                        throw new java.lang.IllegalArgumentException("startPc < 0");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.Ks DW() {
            abcd.Ks r0 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.Hw;
                        if (r0 == null) { $pc1 = 6; continue $sw1; }
                        return r0;
                    }
                    case 6: {
                        return abcd.Ks.DW;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int FH() {
            return this.FH;
        }

        public int Hw() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }

        public boolean j6(int r2) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (r2 >= this.j6) { $pc2 = 5; continue $sw2; }
                        $pc2 = 7; continue $sw2;
                    }
                    case 7: {
                        return false;
                    }
                    case 5: {
                        if (r2 >= this.DW) { $pc2 = 7; continue $sw2; }
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        FH = new abcd.Jm(0);
    }

    public Jm(int r1) {
        super(r1);
    }

    private static boolean j6(abcd.Jm.a r4, abcd.Jm.a[] r5, int r6) {
        abcd.Ks r7 = null;
        int r1 = 0;
        abcd.Ks r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r7 = r4.DW();
                    r1 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r1 >= r6) { $pc3 = 11; continue $sw3; }
                    r2 = r5[r1].DW();
                    if (r2 == r7) { $pc3 = 10; continue $sw3; }
                    if (r2 == abcd.Ks.DW) { $pc3 = 10; continue $sw3; }
                    r1 = r1 + 1;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw() {
        return (size() * 8) + 2;
    }

    public abcd.Jm Hw(int r8) {
        int r0 = 0;
        abcd.Jm.a[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        abcd.Jm.a r5 = null;
        abcd.Jm r9 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = size();
                    r1 = new abcd.Jm.a[r0];
                    r2 = 0;
                    r3 = 0;
                    r4 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r3 >= r0) { $pc4 = 10; continue $sw4; }
                    r5 = get(r3);
                    if (r5.j6(r8) == false) { $pc4 = 9; continue $sw4; }
                    if (j6(r5, r1, r4) == false) { $pc4 = 9; continue $sw4; }
                    r1[r4] = r5;
                    r4 = r4 + 1;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r3 = r3 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 10: {
                    if (r4 == 0) { $pc4 = 12; continue $sw4; }
                    r9 = new abcd.Jm(r4);
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    if (r2 >= r4) { $pc4 = 16; continue $sw4; }
                    r9.j6(r2, r1[r2]);
                    r2 = r2 + 1;
                    { $pc4 = 14; continue $sw4; }
                }
                case 16: {
                    r9.we();
                    return r9;
                }
                case 12: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Jm.a get(int r1) {
        return (abcd.Jm.a) DW(r1);
    }

    public void j6(int r2, int r3, int r4, int r5, abcd.Ks r6) {
        j6(r2, new abcd.Jm.a(r3, r4, r5, r6));
    }

    public void j6(int r1, abcd.Jm.a r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2 == null) { $pc5 = 6; continue $sw5; }
                    j6(r1, r2);
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("item == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Ss rN() {
        int r0 = 0;
        abcd.Ps r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = size();
                    if (r0 == 0) { $pc6 = 5; continue $sw6; }
                    r1 = new abcd.Ps(r0);
                    r2 = 0;
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r2 >= r0) { $pc6 = 9; continue $sw6; }
                    r1.j6(r2, get(r2).DW().VH());
                    r2 = r2 + 1;
                    { $pc6 = 7; continue $sw6; }
                }
                case 9: {
                    r1.we();
                    return r1;
                }
                case 5: {
                    return abcd.Ps.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.au v5(int r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.au r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r6 < (-1)) { $pc7 = 23; continue $sw7; }
                    r0 = 0;
                    if (r6 < 0) { $pc7 = 7; continue $sw7; }
                    r1 = 1;
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    r2 = size();
                    if (r2 != 0) { $pc7 = 15; continue $sw7; }
                    if (r1 == 0) { $pc7 = 14; continue $sw7; }
                    return abcd.au.Zo(r6);
                }
                case 14: {
                    return abcd.au.DW;
                }
                case 15: {
                    r3 = new abcd.au(r2 + r1);
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    if (r0 >= r2) { $pc7 = 18; continue $sw7; }
                    r3.DW(get(r0).FH());
                    r0 = r0 + 1;
                    { $pc7 = 16; continue $sw7; }
                }
                case 18: {
                    if (r1 == 0) { $pc7 = 20; continue $sw7; }
                    r3.DW(r6);
                    $pc7 = 20; continue $sw7;
                }
                case 20: {
                    r3.we();
                    return r3;
                }
                case 7: {
                    r1 = 0;
                    { $pc7 = 8; continue $sw7; }
                }
                case 23: {
                    throw new java.lang.IllegalArgumentException("noException < -1");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
