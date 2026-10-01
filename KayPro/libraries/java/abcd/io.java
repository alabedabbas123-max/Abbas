package abcd;

public final class io extends abcd.Xt {
    public static final abcd.io FH = null;

    public static class a {
        private final abcd.hs DW;
        private final int j6;

        public a(int r1, abcd.hs r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r1 < 0) { $pc0 = 10; continue $sw0; }
                        if (r2 == null) { $pc0 = 8; continue $sw0; }
                        this.j6 = r1;
                        this.DW = r2;
                        return;
                    }
                    case 8: {
                        throw new java.lang.NullPointerException("position == null");
                    }
                    case 10: {
                        throw new java.lang.IllegalArgumentException("address < 0");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.hs DW() {
            return this.DW;
        }

        public int j6() {
            return this.j6;
        }
    }

    static {
        FH = new abcd.io(0);
    }

    public io(int r1) {
        super(r1);
    }

    public static abcd.io j6(abcd.Wn r13, int r14) {
        abcd.hs r1 = null;
        int r3 = 0;
        abcd.io.a[] r4 = null;
        int r5 = 0;
        abcd.hs r8 = null;
        int r6 = 0;
        int r7 = 0;
        boolean r9 = false;
        abcd.AbstractVn r10 = null;
        abcd.hs r11 = null;
        abcd.io r15 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r14 == 1) { $pc1 = 31; continue $sw1; }
                    if (r14 == 2) { $pc1 = 10; continue $sw1; }
                    if (r14 == 3) { $pc1 = 10; continue $sw1; }
                    throw new java.lang.IllegalArgumentException("bogus howMuch");
                }
                case 10: {
                    r1 = abcd.hs.j6;
                    r3 = r13.size();
                    r4 = new abcd.io.a[r3];
                    r5 = 0;
                    r8 = r1;
                    r6 = 0;
                    r7 = 0;
                    r9 = false;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r6 >= r3) { $pc1 = 25; continue $sw1; }
                    r10 = r13.get(r6);
                    if ((r10 instanceof abcd.Sn) == false) { $pc1 = 15; continue $sw1; }
                    r9 = true;
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    r6 = r6 + 1;
                    { $pc1 = 11; continue $sw1; }
                }
                case 15: {
                    r11 = r10.VH();
                    if (r11.equals(r1) == true) { $pc1 = 24; continue $sw1; }
                    if (r11.j6(r8) == true) { $pc1 = 24; continue $sw1; }
                    if (r14 != 3) { $pc1 = 23; continue $sw1; }
                    if (r9 == false) { $pc1 = 24; continue $sw1; }
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    r4[r7] = new abcd.io.a(r10.FH(), r11);
                    r7 = r7 + 1;
                    r8 = r11;
                    r9 = false;
                    { $pc1 = 24; continue $sw1; }
                }
                case 25: {
                    r15 = new abcd.io(r7);
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    if (r5 >= r7) { $pc1 = 28; continue $sw1; }
                    r15.j6(r5, r4[r5]);
                    r5 = r5 + 1;
                    { $pc1 = 26; continue $sw1; }
                }
                case 28: {
                    r15.we();
                    return r15;
                }
                case 31: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.io.a get(int r1) {
        return (abcd.io.a) DW(r1);
    }

    public void j6(int r1, abcd.io.a r2) {
        j6(r1, r2);
    }
}
