package abcd;

public final class uo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.uo();
    }

    private uo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.v5(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = null;
        abcd.Abstractms r6 = null;
        abcd.Ds r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.gn();
                    if ((r5 instanceof abcd.Tn) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (r0.size() == 1) { $pc0 = 7; continue $sw0; }
                    return false;
                }
                case 7: {
                    if (abcd.Abstractao.v5(r0.get(0).we()) == false) { $pc0 = 22; continue $sw0; }
                    r6 = ((abcd.Tn) r5).we();
                    if ((r6 instanceof abcd.Ds) == true) { $pc0 = 12; continue $sw0; }
                    return false;
                }
                case 12: {
                    r7 = (abcd.Ds) r6;
                    if (r7.J8() == true) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                case 15: {
                    if (abcd.Abstractao.DW(r7.Ws()) == false) { $pc0 = 21; continue $sw0; }
                    return true;
                }
                case 21: {
                    return false;
                }
                case 22: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r4).we());
    }

    @Override
    public int j6() {
        return 1;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r1).we(), 4);
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.Ds) ((abcd.Tn) r5).we()).Ws();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, abcd.Abstractao.DW(r0.get(0).we(), r1 & 15)));
    }
}
