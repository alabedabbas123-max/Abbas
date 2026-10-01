package abcd;

public final class Oo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Oo();
    }

    private Oo() {
    }

    @Override
    public boolean VH(abcd.AbstractVn r4) {
        abcd.Tn r5 = null;
        int r0 = 0;
        abcd.Abstractms r2 = null;
        abcd.cs r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r4 instanceof abcd.Tn) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.Tn) r4;
                    r0 = r5.J0();
                    r2 = r5.we();
                    if (abcd.Abstractao.Zo(r0) == true) { $pc0 = 9; continue $sw0; }
                    return false;
                }
                case 9: {
                    if ((r2 instanceof abcd.Gs) == false) { $pc0 = 11; continue $sw0; }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r6 = r5.gn();
                    r6.size();
                    if (r6.size() != 0) { $pc0 = 16; continue $sw0; }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    return true;
                }
                case 16: {
                    if (abcd.Abstractao.j6(r6) == true) { $pc0 = 18; continue $sw0; }
                    return false;
                }
                case 18: {
                    if (abcd.Abstractao.Zo(r6.get(0).we()) == true) { $pc0 = 20; continue $sw0; }
                    return false;
                }
                case 20: {
                    if (abcd.Abstractao.Hw(r6.rN()) == true) { $pc0 = 21; continue $sw0; }
                    return false;
                }
                case 11: {
                    if ((r2 instanceof abcd.Ks) == true) { $pc0 = 13; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r3) {
        return abcd.Abstractao.FH(r3.gn()) + ", " + abcd.Abstractao.v5(r3);
    }

    @Override
    public int j6() {
        return 3;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 == true) { $pc1 = 4; continue $sw1; }
                    return "";
                }
                case 4: {
                    return abcd.Abstractao.Hw(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Lt r5, abcd.AbstractVn r6) {
        abcd.cs r0 = null;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r6.gn();
                    r1 = ((abcd.Tn) r6).J0();
                    r3 = 0;
                    if (r0.size() == 0) { $pc2 = 6; continue $sw2; }
                    r3 = r0.get(0).we();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    abcd.Abstractao.j6(r5, abcd.Abstractao.j6(r6, r0.rN()), (short) r1, (short) r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
