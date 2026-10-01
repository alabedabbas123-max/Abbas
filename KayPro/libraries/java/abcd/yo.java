package abcd;

public final class yo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.yo();
    }

    private yo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r6) {
        abcd.cs r7 = null;
        int r0 = 0;
        java.util.BitSet r1 = null;
        boolean r3 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7 = r6.gn();
                    r0 = r7.size();
                    r1 = new java.util.BitSet(r0);
                    r3 = abcd.Abstractao.Hw(r7.get(0).we());
                    if (r0 != 1) { $pc0 = 6; continue $sw0; }
                    r1.set(0, r3);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return r1;
                }
                case 6: {
                    if (r7.get(0).we() != r7.get(1).we()) { $pc0 = 8; continue $sw0; }
                    r1.set(0, r3);
                    r1.set(1, r3);
                    { $pc0 = 8; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean VH(abcd.AbstractVn r6) {
        abcd.cs r0 = null;
        int r2 = 0;
        abcd.bs r3 = null;
        abcd.Tn r7 = null;
        int r1 = 0;
        abcd.Abstractms r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r6 instanceof abcd.Tn) == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r0 = r6.gn();
                    r2 = r0.size();
                    if (r2 != 1) { $pc1 = 8; continue $sw1; }
                    r3 = r0.get(0);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    if (abcd.Abstractao.Hw(r3.we()) == true) { $pc1 = 17; continue $sw1; }
                    return false;
                }
                case 17: {
                    r7 = (abcd.Tn) r6;
                    r1 = r7.J0();
                    r8 = r7.we();
                    if (abcd.Abstractao.Zo(r1) == true) { $pc1 = 21; continue $sw1; }
                    return false;
                }
                case 21: {
                    if ((r8 instanceof abcd.Ks) == false) { $pc1 = 23; continue $sw1; }
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    return true;
                }
                case 23: {
                    if ((r8 instanceof abcd.ws) == true) { $pc1 = 26; continue $sw1; }
                    if ((r8 instanceof abcd.Js) == true) { $pc1 = 26; continue $sw1; }
                    return false;
                }
                case 8: {
                    if (r2 == 2) { $pc1 = 10; continue $sw1; }
                    return false;
                }
                case 10: {
                    r3 = r0.get(0);
                    if (r3.we() == r0.get(1).we()) { $pc1 = 15; continue $sw1; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.v5(r4);
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == true) { $pc2 = 4; continue $sw2; }
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
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.Tn) r5).J0();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, r0.get(0).we()), (short) r1);
    }
}
