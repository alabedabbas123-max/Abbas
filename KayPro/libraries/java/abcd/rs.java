package abcd;

public final class rs extends abcd.Bs {
    public static final abcd.rs DW = null;
    public static final abcd.rs FH = null;

    static {
        DW = new abcd.rs(false);
        FH = new abcd.rs(true);
    }

    private rs(boolean r1) {
        super(r1 ? 1 : 0);
    }

    public static abcd.rs j6(int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 != 0) { $pc0 = 6; continue $sw0; }
                    return DW;
                }
                case 6: {
                    if (r3 != 1) { $pc0 = 10; continue $sw0; }
                    return FH;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("bogus value: " + r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo() {
        return "boolean";
    }

    @Override
    public java.lang.String aM() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (rN() == false) { $pc1 = 5; continue $sw1; }
                    return "true";
                }
                case 5: {
                    return "false";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.DW;
    }

    public boolean rN() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (Ws() != 0) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (rN() == false) { $pc3 = 5; continue $sw3; }
                    return "boolean{true}";
                }
                case 5: {
                    return "boolean{false}";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
