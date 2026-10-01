package abcd;

public final class Qn extends abcd.Xt implements java.lang.Comparable<abcd.Qn> {
    public static final abcd.Qn FH = null;

    public static class a implements java.lang.Comparable<abcd.Qn.a> {
        private final int DW;
        private final abcd.Ks j6;

        public a(abcd.Ks r1, int r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r2 < 0) { $pc0 = 10; continue $sw0; }
                        if (r1 == null) { $pc0 = 8; continue $sw0; }
                        this.DW = r2;
                        this.j6 = r1;
                        return;
                    }
                    case 8: {
                        throw new java.lang.NullPointerException("exceptionType == null");
                    }
                    case 10: {
                        throw new java.lang.IllegalArgumentException("handler < 0");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.Ks Hw() {
            return this.j6;
        }

        public int Zo() {
            return this.DW;
        }

        @Override
        public int compareTo(abcd.Qn.a r1) {
            return j6(r1);
        }

        public boolean equals(java.lang.Object r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ((r3 instanceof abcd.Qn.a) == true) { $pc1 = 5; continue $sw1; }
                        return false;
                    }
                    case 5: {
                        if (j6((abcd.Qn.a) r3) != 0) { $pc1 = 9; continue $sw1; }
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
            return (this.DW * 31) + this.j6.hashCode();
        }

        public int j6(abcd.Qn.a r3) {
            int r0 = 0;
            int r1 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.DW;
                        r1 = r3.DW;
                        if (r0 >= r1) { $pc2 = 6; continue $sw2; }
                        return -1;
                    }
                    case 6: {
                        if (r0 <= r1) { $pc2 = 10; continue $sw2; }
                        return 1;
                    }
                    case 10: {
                        return this.j6.j6(r3.j6);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        FH = new abcd.Qn(0);
    }

    public Qn(int r1) {
        super(r1);
    }

    @Override
    public java.lang.String aM() {
        return j6("", "");
    }

    @Override
    public int compareTo(abcd.Qn r1) {
        return j6(r1);
    }

    public abcd.Qn.a get(int r1) {
        return (abcd.Qn.a) DW(r1);
    }

    public int j6(abcd.Qn r8) {
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

    public java.lang.String j6(java.lang.String r5, java.lang.String r6) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        int r7 = 0;
        abcd.Qn.a r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuilder(100);
                    r1 = size();
                    r0.append(r5);
                    r0.append(r6);
                    r0.append("catch ");
                    r7 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r7 >= r1) { $pc4 = 15; continue $sw4; }
                    r2 = get(r7);
                    if (r7 == 0) { $pc4 = 8; continue $sw4; }
                    r0.append(",\n");
                    r0.append(r5);
                    r0.append("  ");
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r7 == (r1 - 1)) { $pc4 = 10; continue $sw4; }
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r0.append(r2.Hw().aM());
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    r0.append(" -> ");
                    r0.append(abcd.Yt.Zo(r2.Zo()));
                    r7 = r7 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 10: {
                    if (rN() == false) { $pc4 = 12; continue $sw4; }
                    r0.append("<any>");
                    { $pc4 = 13; continue $sw4; }
                }
                case 15: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r2, abcd.Ks r3, int r4) {
        j6(r2, new abcd.Qn.a(r3, r4));
    }

    public boolean rN() {
        int r0 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = size();
                    if (r0 != 0) { $pc5 = 7; continue $sw5; }
                    return false;
                }
                case 7: {
                    return get(r0 - 1).Hw().equals(abcd.Ks.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
