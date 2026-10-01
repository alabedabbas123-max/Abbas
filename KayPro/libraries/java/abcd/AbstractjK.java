package abcd;

public abstract class AbstractjK {
    public static final abcd.AbstractjK DW = null;
    public static final abcd.AbstractjK j6 = null;

    private static final class a extends abcd.AbstractjK {
        private a() {
        }

        a(abcd.AbstractjK.a r1) {
            this();
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.YJ r1) {
            return true;
        }

        @Override
        public java.lang.String toString() {
            return "ALL";
        }
    }

    private static final class b extends abcd.AbstractjK {
        private b() {
        }

        b(abcd.AbstractjK.b r1) {
            this();
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.YJ r7) {
            int r0 = 0;
            int r3 = 0;
            int r4 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = r7.Zo();
                        if (r0 != 1) { $pc0 = 5; continue $sw0; }
                        return true;
                    }
                    case 5: {
                        r3 = r7.FH(0);
                        r4 = 1;
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        if (r4 >= r0) { $pc0 = 7; continue $sw0; }
                        if (r7.FH(r4) != r3) { $pc0 = 14; continue $sw0; }
                        if (r7.j6(r4, 0) == false) { $pc0 = 14; continue $sw0; }
                        r4 = r4 + 1;
                        $pc0 = 14; continue $sw0;
                    }
                    case 14: {
                        return true;
                    }
                    case 7: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String toString() {
            return "ANY_DIFF";
        }
    }

    static {
        j6 = new abcd.AbstractjK.a(null);
        DW = new abcd.AbstractjK.b(null);
    }

    public AbstractjK() {
    }

    public abstract abcd.AbstractjK clone();

    public java.lang.Object m29clone() {
        return clone();
    }

    public abstract boolean j6();

    public abstract boolean j6(abcd.YJ r1);

    public java.lang.String toString() {
        java.lang.String r0 = null;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = getClass().getName();
                    r2 = r0.lastIndexOf(46);
                    if (r2 < 0) { $pc1 = 6; continue $sw1; }
                    r0 = r0.substring(r2 + 1);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return r0.replace('$', '.');
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
