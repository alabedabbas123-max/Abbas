package abcd;

public abstract class AbstractcC {

    private static class a extends abcd.AbstractcC {
        private final java.io.File j6;

        a(java.io.File r1) {
            this.j6 = r1;
        }

        @Override
        public long DW(java.lang.String r2, abcd.yE r3) {
            return new java.io.File(this.j6, r2).length();
        }

        @Override
        public abcd.FE j6(java.lang.String r2, abcd.yE r3) {
            java.io.File r4 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r4 = new java.io.File(this.j6, r2);
                        if (r4.isFile() == false) { $pc0 = 7; continue $sw0; }
                        return new abcd.bC(this, r4);
                    }
                    case 7: {
                        throw new java.io.FileNotFoundException(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static class b extends abcd.AbstractcC {
        private final abcd.IE j6;

        b(abcd.IE r1) {
            this.j6 = r1;
        }

        @Override
        public long DW(java.lang.String r2, abcd.yE r3) {
            return this.j6.DW(r3, 3);
        }

        @Override
        public abcd.FE j6(java.lang.String r2, abcd.yE r3) {
            return this.j6.Hw(r3, 3);
        }
    }

    public static final class c {
        private static int[] j6;
        private final abcd.AbstractcC DW;
        private final abcd.AbstractcC FH;

        public c(abcd.AbstractcC r1, abcd.AbstractcC r2) {
            this.DW = r1;
            this.FH = r2;
        }

        static int[] j6() {
            int[] r0 = null;
            int[] r1 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = j6;
                        if (r0 == null) { $pc1 = 5; continue $sw1; }
                        return r0;
                    }
                    case 5: {
                        r1 = new int[abcd.hC.b.values().length];
                        try {
                            r1[abcd.hC.b.DW.ordinal()] = 2;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 10; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        try {
                            r1[abcd.hC.b.j6.ordinal()] = 1;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 11; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        j6 = r1;
                        return r1;
                    }
                    case 10: {
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public long DW(abcd.hC.b r2, abcd.hC r3) {
            int r4 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r4 = j6()[r2.ordinal()];
                        if (r4 == 1) { $pc2 = 11; continue $sw2; }
                        if (r4 != 2) { $pc2 = 9; continue $sw2; }
                        return this.FH.DW(r3.Hw, r3.tp.v5());
                    }
                    case 9: {
                        throw new java.lang.IllegalArgumentException();
                    }
                    case 11: {
                        return this.DW.DW(r3.FH, r3.u7.v5());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.FE j6(abcd.hC.b r2, abcd.hC r3) {
            int r4 = 0;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r4 = j6()[r2.ordinal()];
                        if (r4 == 1) { $pc3 = 11; continue $sw3; }
                        if (r4 != 2) { $pc3 = 9; continue $sw3; }
                        return this.FH.j6(r3.Hw, r3.tp.v5());
                    }
                    case 9: {
                        throw new java.lang.IllegalArgumentException();
                    }
                    case 11: {
                        return this.DW.j6(r3.FH, r3.u7.v5());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static class d extends abcd.AbstractcC {
        private final abcd._J DW;
        private java.lang.String FH;
        private abcd._J Hw;
        private final abcd.YJ j6;

        d(abcd._J r3) {
            this.j6 = new abcd.YJ(null);
            this.DW = r3;
        }

        static abcd._J j6(abcd.AbstractcC.d r0) {
            return r0.Hw;
        }

        private void j6(java.lang.String r4) {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (r4.equals(this.FH) == true) { $pc4 = 13; continue $sw4; }
                        this.DW.EQ();
                        this.j6.J8();
                        this.j6.j6(this.DW);
                        this.j6.j6(abcd.fK.j6(r4));
                        this.FH = r4;
                        if (this.j6.EQ() == false) { $pc4 = 12; continue $sw4; }
                        this.Hw = (abcd._J) this.j6.j6(0, abcd._J.class);
                        if (this.Hw == null) { $pc4 = 10; continue $sw4; }
                        return;
                    }
                    case 10: {
                        throw new java.io.FileNotFoundException(r4);
                    }
                    case 12: {
                        throw new java.io.FileNotFoundException(r4);
                    }
                    case 13: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public long DW(java.lang.String r1, abcd.yE r2) {
            j6(r1);
            return this.Hw.j3();
        }

        @Override
        public abcd.FE j6(java.lang.String r1, abcd.yE r2) {
            j6(r1);
            return new abcd.dC(this);
        }
    }

    public AbstractcC() {
    }

    public static abcd.AbstractcC j6(abcd.IE r1) {
        return new abcd.AbstractcC.b(r1);
    }

    public static abcd.AbstractcC j6(abcd._J r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if ((r1 instanceof abcd.WJ) == false) { $pc5 = 7; continue $sw5; }
                    return new abcd.AbstractcC.a(((abcd.WJ) r1).lg());
                }
                case 7: {
                    return new abcd.AbstractcC.d(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract long DW(java.lang.String r1, abcd.yE r2);

    public abstract abcd.FE j6(java.lang.String r1, abcd.yE r2);
}
