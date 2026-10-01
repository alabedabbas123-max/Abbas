package abcd;

public final class Do extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Do();
    }

    private Do() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        java.util.BitSet r0 = new java.util.BitSet(2);
        r0.set(0, abcd.Abstractao.v5(r5.get(0).we()));
        r0.set(1, abcd.Abstractao.v5(r5.get(1).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = null;
        abcd.Tn r6 = null;
        abcd.Abstractms r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.gn();
                    if ((r5 instanceof abcd.Tn) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    return false;
                }
                case 5: {
                    if (r0.size() != 2) { $pc0 = 21; continue $sw0; }
                    if (abcd.Abstractao.v5(r0.get(0).we()) == false) { $pc0 = 21; continue $sw0; }
                    if (abcd.Abstractao.v5(r0.get(1).we()) == false) { $pc0 = 21; continue $sw0; }
                    r6 = (abcd.Tn) r5;
                    if (abcd.Abstractao.Zo(r6.J0()) == true) { $pc0 = 14; continue $sw0; }
                    return false;
                }
                case 14: {
                    r7 = r6.we();
                    if ((r7 instanceof abcd.Ks) == false) { $pc0 = 17; continue $sw0; }
                    return true;
                }
                case 17: {
                    if ((r7 instanceof abcd.ws) == true) { $pc0 = 23; continue $sw0; }
                    return false;
                }
                case 23: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        return r0.get(0).lg() + ", " + r0.get(1).lg() + ", " + abcd.Abstractao.v5(r5);
    }

    @Override
    public int j6() {
        return 2;
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
        abcd.cs r0 = r6.gn();
        int r1 = ((abcd.Tn) r6).J0();
        abcd.Abstractao.j6(r5, abcd.Abstractao.j6(r6, abcd.Abstractao.DW(r0.get(0).we(), r0.get(1).we())), (short) r1);
    }
}
