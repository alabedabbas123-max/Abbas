package abcd;

public final class Qm extends abcd.Xt {
    public static final abcd.Qm FH = null;

    public static class a {
        private final int DW;
        private final abcd.Js FH;
        private final abcd.Js Hw;
        private final int Zo;
        private final int j6;
        private final abcd.Js v5;

        public a(int r1, int r2, abcd.Js r3, abcd.Js r4, abcd.Js r5, int r6) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r1 < 0) { $pc0 = 21; continue $sw0; }
                        if (r2 < 0) { $pc0 = 19; continue $sw0; }
                        if (r3 == null) { $pc0 = 17; continue $sw0; }
                        if (r4 != null) { $pc0 = 11; continue $sw0; }
                        if (r5 != null) { $pc0 = 11; continue $sw0; }
                        throw new java.lang.NullPointerException("(descriptor == null) && (signature == null)");
                    }
                    case 11: {
                        if (r6 < 0) { $pc0 = 15; continue $sw0; }
                        this.j6 = r1;
                        this.DW = r2;
                        this.FH = r3;
                        this.Hw = r4;
                        this.v5 = r5;
                        this.Zo = r6;
                        return;
                    }
                    case 15: {
                        throw new java.lang.IllegalArgumentException("index < 0");
                    }
                    case 17: {
                        throw new java.lang.NullPointerException("name == null");
                    }
                    case 19: {
                        throw new java.lang.IllegalArgumentException("length < 0");
                    }
                    case 21: {
                        throw new java.lang.IllegalArgumentException("startPc < 0");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private abcd.Js FH() {
            return this.v5;
        }

        static abcd.Js j6(abcd.Qm.a r0) {
            return r0.FH();
        }

        public abcd.Qs DW() {
            return abcd.Qs.j6(this.Hw.we());
        }

        public boolean DW(abcd.Qm.a r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.j6 == r3.j6) { $pc1 = 5; continue $sw1; }
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        return false;
                    }
                    case 5: {
                        if (this.DW != r3.DW) { $pc1 = 11; continue $sw1; }
                        if (this.Zo != r3.Zo) { $pc1 = 11; continue $sw1; }
                        if (this.FH.equals(r3.FH) == false) { $pc1 = 11; continue $sw1; }
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.Qm.a j6(abcd.Js r9) {
            return new abcd.Qm.a(this.j6, this.DW, this.FH, this.Hw, r9, this.Zo);
        }

        public abcd.Vr j6() {
            return abcd.Vr.j6(this.FH, this.v5);
        }

        public boolean j6(int r2, int r3) {
            int r4 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (r3 != this.Zo) { $pc2 = 9; continue $sw2; }
                        r4 = this.j6;
                        if (r2 < r4) { $pc2 = 9; continue $sw2; }
                        if (r2 >= (r4 + this.DW)) { $pc2 = 9; continue $sw2; }
                        return true;
                    }
                    case 9: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        FH = new abcd.Qm(0);
    }

    public Qm(int r1) {
        super(r1);
    }

    public static abcd.Qm DW(abcd.Qm r5, abcd.Qm r6) {
        int r0 = 0;
        abcd.Qm r1 = null;
        int r2 = 0;
        abcd.Qm.a r3 = null;
        abcd.Qm.a r4 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r5.size();
                    r1 = new abcd.Qm(r0);
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r0) { $pc3 = 8; continue $sw3; }
                    r3 = r5.get(r2);
                    r4 = r6.j6(r3);
                    if (r4 == null) { $pc3 = 7; continue $sw3; }
                    r3 = r3.j6(abcd.Qm.a.j6(r4));
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    r1.j6(r2, r3);
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 8: {
                    r1.we();
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Qm j6(abcd.Qm r6, abcd.Qm r7) {
        int r0 = 0;
        int r1 = 0;
        abcd.Qm r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r6 != FH) { $pc4 = 5; continue $sw4; }
                    return r7;
                }
                case 5: {
                    r0 = r6.size();
                    r1 = r7.size();
                    r2 = new abcd.Qm(r0 + r1);
                    r3 = 0;
                    r4 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r4 >= r0) { $pc4 = 8; continue $sw4; }
                    r2.j6(r4, r6.get(r4));
                    r4 = r4 + 1;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r3 >= r1) { $pc4 = 10; continue $sw4; }
                    r2.j6(r0 + r3, r7.get(r3));
                    r3 = r3 + 1;
                    { $pc4 = 8; continue $sw4; }
                }
                case 10: {
                    r2.we();
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qm.a get(int r1) {
        return (abcd.Qm.a) DW(r1);
    }

    public abcd.Qm.a j6(int r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        abcd.Qm.a r2 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r1 >= r0) { $pc5 = 10; continue $sw5; }
                    r2 = (abcd.Qm.a) DW(r1);
                    if (r2 == null) { $pc5 = 9; continue $sw5; }
                    if (r2.j6(r5, r6) == false) { $pc5 = 9; continue $sw5; }
                    return r2;
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qm.a j6(abcd.Qm.a r5) {
        int r0 = 0;
        int r1 = 0;
        abcd.Qm.a r2 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r1 >= r0) { $pc6 = 10; continue $sw6; }
                    r2 = (abcd.Qm.a) DW(r1);
                    if (r2 == null) { $pc6 = 9; continue $sw6; }
                    if (r2.DW(r5) == false) { $pc6 = 9; continue $sw6; }
                    return r2;
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r9, int r10, int r11, abcd.Js r12, abcd.Js r13, abcd.Js r14, int r15) {
        j6(r9, new abcd.Qm.a(r10, r11, r12, r13, r14, r15));
    }

    public void j6(int r1, abcd.Qm.a r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 == null) { $pc7 = 6; continue $sw7; }
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
}
