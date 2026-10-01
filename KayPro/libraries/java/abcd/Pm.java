package abcd;

public final class Pm extends abcd.Xt {
    public static final abcd.Pm FH = null;

    public static class a {
        private final int DW;
        private final int j6;

        public a(int r1, int r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r1 < 0) { $pc0 = 10; continue $sw0; }
                        if (r2 < 0) { $pc0 = 8; continue $sw0; }
                        this.j6 = r1;
                        this.DW = r2;
                        return;
                    }
                    case 8: {
                        throw new java.lang.IllegalArgumentException("lineNumber < 0");
                    }
                    case 10: {
                        throw new java.lang.IllegalArgumentException("startPc < 0");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    static {
        FH = new abcd.Pm(0);
    }

    public Pm(int r1) {
        super(r1);
    }

    public static abcd.Pm j6(abcd.Pm r6, abcd.Pm r7) {
        int r0 = 0;
        int r1 = 0;
        abcd.Pm r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6 != FH) { $pc1 = 5; continue $sw1; }
                    return r7;
                }
                case 5: {
                    r0 = r6.size();
                    r1 = r7.size();
                    r2 = new abcd.Pm(r0 + r1);
                    r3 = 0;
                    r4 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r4 >= r0) { $pc1 = 8; continue $sw1; }
                    r2.j6(r4, r6.get(r4));
                    r4 = r4 + 1;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r3 >= r1) { $pc1 = 10; continue $sw1; }
                    r2.j6(r0 + r3, r7.get(r3));
                    r3 = r3 + 1;
                    { $pc1 = 8; continue $sw1; }
                }
                case 10: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw(int r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.Pm.a r4 = null;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = size();
                    r1 = -1;
                    r2 = 0;
                    r3 = -1;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r0) { $pc2 = 12; continue $sw2; }
                    r4 = get(r2);
                    r5 = r4.DW();
                    if (r5 > r7) { $pc2 = 11; continue $sw2; }
                    if (r5 <= r1) { $pc2 = 11; continue $sw2; }
                    r3 = r4.j6();
                    if (r5 == r7) { $pc2 = 12; continue $sw2; }
                    r1 = r5;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r2 = r2 + 1;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Pm.a get(int r1) {
        return (abcd.Pm.a) DW(r1);
    }

    public void j6(int r2, int r3, int r4) {
        j6(r2, new abcd.Pm.a(r3, r4));
    }

    public void j6(int r1, abcd.Pm.a r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 == null) { $pc3 = 6; continue $sw3; }
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
