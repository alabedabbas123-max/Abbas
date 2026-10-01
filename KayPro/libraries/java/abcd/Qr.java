package abcd;

public final class Qr implements abcd.Interfacels {
    public static final abcd.Qr DW = null;
    public static final abcd.Qr j6 = null;
    private final boolean FH;

    static {
        j6 = new abcd.Qr();
        DW = new abcd.Qr(true);
    }

    private Qr() {
        this.FH = false;
    }

    private Qr(boolean r1) {
        this.FH = r1;
    }

    private int j6(abcd.cs r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.size();
                    r1 = 0;
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r1 >= r0) { $pc0 = 5; continue $sw0; }
                    r2 = r2 + r5.get(r1).Hw();
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6() {
        return 16;
    }

    @Override
    public boolean j6(abcd.es r4, abcd.bs r5, abcd.bs r6) {
        abcd.ys r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5.getType() == abcd.Qs.VH) { $pc1 = 6; continue $sw1; }
                    return false;
                }
                case 6: {
                    if ((r6.J8() instanceof abcd.ys) == false) { $pc1 = 8; continue $sw1; }
                    r7 = (abcd.ys) r6.J8();
                    switch(r4.Hw()) {
                        case 14: { $pc1 = 22; continue $sw1; }
                        case 15: { $pc1 = 20; continue $sw1; }
                        case 16: { $pc1 = 22; continue $sw1; }
                        case 17: { $pc1 = 22; continue $sw1; }
                        case 18: { $pc1 = 22; continue $sw1; }
                        case 19: { $pc1 = 16; continue $sw1; }
                        case 20: { $pc1 = 22; continue $sw1; }
                        case 21: { $pc1 = 22; continue $sw1; }
                        case 22: { $pc1 = 22; continue $sw1; }
                        case 23: { $pc1 = 18; continue $sw1; }
                        case 24: { $pc1 = 18; continue $sw1; }
                        case 25: { $pc1 = 18; continue $sw1; }
                        default: { $pc1 = 16; continue $sw1; }
                    };
                }
                case 16: {
                    return false;
                }
                case 18: {
                    return r7.we();
                }
                case 20: {
                    return abcd.ys.j6(-r7.rN()).VH();
                }
                case 22: {
                    return r7.VH();
                }
                case 8: {
                    if ((r5.J8() instanceof abcd.ys) == true) { $pc1 = 10; continue $sw1; }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    return false;
                }
                case 10: {
                    if (r4.Hw() != 15) { $pc1 = 13; continue $sw1; }
                    return ((abcd.ys) r5.J8()).VH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(abcd.es r2, abcd.cs r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.FH == false) { $pc2 = 5; continue $sw2; }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    return false;
                }
                case 5: {
                    if (r2.VH() == false) { $pc2 = 9; continue $sw2; }
                    if (j6(r3) < 6) { $pc2 = 9; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
