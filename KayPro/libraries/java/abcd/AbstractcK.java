package abcd;

public abstract class AbstractcK extends abcd.AbstractjK {

    private static class a extends abcd.AbstractcK {
        private final abcd.AbstractjK FH;
        private final abcd.AbstractjK Hw;

        a(abcd.AbstractjK r1, abcd.AbstractjK r2) {
            this.FH = r1;
            this.Hw = r2;
        }

        @Override
        public abcd.AbstractjK clone() {
            return new abcd.AbstractcK.a(this.FH.clone(), this.Hw.clone());
        }

        @Override
        public boolean j6() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.FH.j6() == false) { $pc0 = 5; continue $sw0; }
                        return true;
                    }
                    case 5: {
                        if (this.Hw.j6() == true) { $pc0 = 10; continue $sw0; }
                        return false;
                    }
                    case 10: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean j6(abcd.YJ r2) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.FH.j6(r2) == true) { $pc1 = 5; continue $sw1; }
                        return false;
                    }
                    case 5: {
                        if (this.Hw.j6(r2) == false) { $pc1 = 10; continue $sw1; }
                        return true;
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String toString() {
            return "(" + this.FH.toString() + " AND " + this.Hw.toString() + ")";
        }
    }

    private static class b extends abcd.AbstractcK {
        private final abcd.AbstractjK[] FH;

        b(abcd.AbstractjK[] r1) {
            this.FH = r1;
        }

        @Override
        public abcd.AbstractjK clone() {
            abcd.AbstractjK[] r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = new abcd.AbstractjK[this.FH.length];
                        r1 = 0;
                        $pc2 = 4; continue $sw2;
                    }
                    case 4: {
                        if (r1 >= r0.length) { $pc2 = 6; continue $sw2; }
                        r0[r1] = this.FH[r1].clone();
                        r1 = r1 + 1;
                        { $pc2 = 4; continue $sw2; }
                    }
                    case 6: {
                        return new abcd.AbstractcK.b(r0);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean j6() {
            abcd.AbstractjK[] r0 = null;
            int r1 = 0;
            int r3 = 0;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.FH;
                        r1 = r0.length;
                        r3 = 0;
                        $pc3 = 3; continue $sw3;
                    }
                    case 3: {
                        if (r3 >= r1) { $pc3 = 4; continue $sw3; }
                        if (r0[r3].j6() == true) { $pc3 = 7; continue $sw3; }
                        r3 = r3 + 1;
                        { $pc3 = 3; continue $sw3; }
                    }
                    case 7: {
                        return true;
                    }
                    case 4: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean j6(abcd.YJ r6) {
            abcd.AbstractjK[] r0 = null;
            int r1 = 0;
            int r3 = 0;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = this.FH;
                        r1 = r0.length;
                        r3 = 0;
                        $pc4 = 3; continue $sw4;
                    }
                    case 3: {
                        if (r3 >= r1) { $pc4 = 4; continue $sw4; }
                        if (r0[r3].j6(r6) == false) { $pc4 = 8; continue $sw4; }
                        r3 = r3 + 1;
                        { $pc4 = 3; continue $sw4; }
                    }
                    case 8: {
                        return false;
                    }
                    case 4: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = new java.lang.StringBuilder();
                        r0.append("(");
                        r1 = 0;
                        $pc5 = 4; continue $sw5;
                    }
                    case 4: {
                        if (r1 >= this.FH.length) { $pc5 = 5; continue $sw5; }
                        if (r1 <= 0) { $pc5 = 9; continue $sw5; }
                        r0.append(" AND ");
                        $pc5 = 9; continue $sw5;
                    }
                    case 9: {
                        r0.append(this.FH[r1].toString());
                        r1 = r1 + 1;
                        { $pc5 = 4; continue $sw5; }
                    }
                    case 5: {
                        r0.append(")");
                        return r0.toString();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public AbstractcK() {
    }

    public static abcd.AbstractjK j6(abcd.AbstractjK r1, abcd.AbstractjK r2) {
        abcd.AbstractjK r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = abcd.AbstractjK.j6;
                    if (r1 != r0) { $pc6 = 5; continue $sw6; }
                    return r2;
                }
                case 5: {
                    if (r2 != r0) { $pc6 = 8; continue $sw6; }
                    return r1;
                }
                case 8: {
                    return new abcd.AbstractcK.a(r1, r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractjK j6(java.util.Collection<abcd.AbstractjK> r2) {
        abcd.AbstractjK[] r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2.size() < 2) { $pc7 = 11; continue $sw7; }
                    r0 = new abcd.AbstractjK[r2.size()];
                    r2.toArray(r0);
                    if (r0.length != 2) { $pc7 = 9; continue $sw7; }
                    return j6(r0[0], r0[1]);
                }
                case 9: {
                    return new abcd.AbstractcK.b(r0);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().atLeastTwoFiltersNeeded);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
