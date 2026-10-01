package abcd;

public final class Rn extends abcd.Xt implements java.lang.Comparable<abcd.Rn> {
    public static final abcd.Rn FH = null;

    public static class a implements java.lang.Comparable<abcd.Rn.a> {
        private final int DW;
        private final abcd.Qn FH;
        private final int j6;

        public a(int r2, int r3, abcd.Qn r4) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r2 < 0) { $pc0 = 14; continue $sw0; }
                        if (r3 <= r2) { $pc0 = 12; continue $sw0; }
                        if (r4.Zo() == true) { $pc0 = 10; continue $sw0; }
                        this.j6 = r2;
                        this.DW = r3;
                        this.FH = r4;
                        return;
                    }
                    case 10: {
                        throw new java.lang.IllegalArgumentException("handlers.isMutable()");
                    }
                    case 12: {
                        throw new java.lang.IllegalArgumentException("end <= start");
                    }
                    case 14: {
                        throw new java.lang.IllegalArgumentException("start < 0");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int Hw() {
            return this.DW;
        }

        public int VH() {
            return this.j6;
        }

        public abcd.Qn Zo() {
            return this.FH;
        }

        @Override
        public int compareTo(abcd.Rn.a r1) {
            return j6(r1);
        }

        public boolean equals(java.lang.Object r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ((r3 instanceof abcd.Rn.a) == true) { $pc1 = 5; continue $sw1; }
                        return false;
                    }
                    case 5: {
                        if (j6((abcd.Rn.a) r3) != 0) { $pc1 = 9; continue $sw1; }
                        return true;
                    }
                    case 9: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int hashCode() {
            return (((this.j6 * 31) + this.DW) * 31) + this.FH.hashCode();
        }

        public int j6(abcd.Rn.a r5) {
            int r0 = 0;
            int r1 = 0;
            int r2 = 0;
            int r3 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.j6;
                        r1 = r5.j6;
                        if (r0 >= r1) { $pc2 = 6; continue $sw2; }
                        return -1;
                    }
                    case 6: {
                        if (r0 <= r1) { $pc2 = 8; continue $sw2; }
                        return 1;
                    }
                    case 8: {
                        r2 = this.DW;
                        r3 = r5.DW;
                        if (r2 >= r3) { $pc2 = 11; continue $sw2; }
                        return -1;
                    }
                    case 11: {
                        if (r2 <= r3) { $pc2 = 14; continue $sw2; }
                        return 1;
                    }
                    case 14: {
                        return this.FH.j6(r5.FH);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        FH = new abcd.Rn(0);
    }

    public Rn(int r1) {
        super(r1);
    }

    @Override
    public int compareTo(abcd.Rn r1) {
        return j6(r1);
    }

    public abcd.Rn.a get(int r1) {
        return (abcd.Rn.a) DW(r1);
    }

    public int j6(abcd.Rn r8) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this != r8) { $pc3 = 5; continue $sw3; }
                    return 0;
                }
                case 5: {
                    r1 = size();
                    r2 = r8.size();
                    r3 = java.lang.Math.min(r1, r2);
                    r4 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r4 >= r3) { $pc3 = 11; continue $sw3; }
                    r5 = get(r4).j6(r8.get(r4));
                    if (r5 != 0) { $pc3 = 9; continue $sw3; }
                    r4 = r4 + 1;
                    { $pc3 = 6; continue $sw3; }
                }
                case 9: {
                    return r5;
                }
                case 11: {
                    if (r1 >= r2) { $pc3 = 14; continue $sw3; }
                    return -1;
                }
                case 14: {
                    if (r1 <= r2) { $pc3 = 17; continue $sw3; }
                    return 1;
                }
                case 17: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r1, abcd.Rn.a r2) {
        j6(r1, r2);
    }
}
