package abcd;

public class hK {

    static class a extends abcd.AbstractjK {
        private static final java.util.Comparator<abcd.fK> FH = null;
        private final abcd.fK[] Hw;

        static {
            FH = new abcd.gK();
        }

        private a(abcd.fK[] r2) {
            this.Hw = r2;
            java.util.Arrays.sort(this.Hw, FH);
        }

        a(abcd.fK[] r1, abcd.hK.a r2) {
            this(r1);
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            abcd.fK[] r0 = null;
            int r1 = 0;
            int r3 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.Hw;
                        r1 = r0.length;
                        r3 = 0;
                        $pc0 = 3; continue $sw0;
                    }
                    case 3: {
                        if (r3 >= r1) { $pc0 = 4; continue $sw0; }
                        if (r0[r3].j6() == true) { $pc0 = 7; continue $sw0; }
                        r3 = r3 + 1;
                        { $pc0 = 3; continue $sw0; }
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
            int r0 = 0;
            int r2 = 0;
            byte[] r3 = null;
            int r4 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.Hw.length;
                        r2 = 0;
                        $pc1 = 3; continue $sw1;
                    }
                    case 3: {
                        r3 = this.Hw[r2].Hw;
                        r4 = r6.j6(r3, r3.length);
                        if (r4 == 0) { $pc1 = 5; continue $sw1; }
                        r2 = r2 + 1;
                        if (r2 < r0) { $pc1 = 3; continue $sw1; }
                        if (r4 > 0) { $pc1 = 13; continue $sw1; }
                        return false;
                    }
                    case 13: {
                        throw abcd.sD.j6;
                    }
                    case 5: {
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
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = new java.lang.StringBuilder();
                        r0.append("FAST(");
                        r1 = 0;
                        $pc2 = 4; continue $sw2;
                    }
                    case 4: {
                        if (r1 >= this.Hw.length) { $pc2 = 5; continue $sw2; }
                        if (r1 <= 0) { $pc2 = 9; continue $sw2; }
                        r0.append(" OR ");
                        $pc2 = 9; continue $sw2;
                    }
                    case 9: {
                        r0.append(this.Hw[r1].toString());
                        r1 = r1 + 1;
                        { $pc2 = 4; continue $sw2; }
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

    static class b extends abcd.AbstractjK {
        private final abcd.fK FH;
        private final byte[] Hw;

        private b(abcd.fK r1) {
            this.FH = r1;
            this.Hw = this.FH.Hw;
        }

        b(abcd.fK r1, abcd.hK.b r2) {
            this(r1);
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return this.FH.j6();
        }

        @Override
        public boolean j6(abcd.YJ r3) {
            byte[] r0 = null;
            int r4 = 0;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.Hw;
                        r4 = r3.j6(r0, r0.length);
                        if (r4 > 0) { $pc3 = 10; continue $sw3; }
                        if (r4 != 0) { $pc3 = 7; continue $sw3; }
                        return true;
                    }
                    case 7: {
                        return false;
                    }
                    case 10: {
                        throw abcd.sD.j6;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String toString() {
            return "FAST_" + this.FH.toString();
        }
    }

    public static abcd.AbstractjK DW(java.util.Collection<java.lang.String> r4) {
        abcd.fK[] r0 = null;
        int r1 = 0;
        java.util.Iterator<java.lang.String> r5 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r4.isEmpty() == true) { $pc4 = 11; continue $sw4; }
                    r0 = new abcd.fK[r4.size()];
                    r1 = 0;
                    r5 = r4.iterator();
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r5.hasNext() == false) { $pc4 = 8; continue $sw4; }
                    r0[r1] = abcd.fK.j6(r5.next());
                    r1 = r1 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 8: {
                    return j6(r0);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().atLeastOnePathIsRequired);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractjK j6(java.util.Collection<abcd.fK> r1) {
        abcd.fK[] r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r1.isEmpty() == true) { $pc5 = 7; continue $sw5; }
                    r0 = new abcd.fK[r1.size()];
                    r1.toArray(r0);
                    return j6(r0);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().atLeastOnePathIsRequired);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.AbstractjK j6(abcd.fK[] r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r3.length != 1) { $pc6 = 7; continue $sw6; }
                    return new abcd.hK.b(r3[0], null);
                }
                case 7: {
                    return new abcd.hK.a(r3, null);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
