package abcd;

public final class Eo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Eo();
    }

    private Eo() {
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
        abcd.Abstractms r6 = null;
        abcd.Ds r7 = null;
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
                    r6 = ((abcd.Tn) r5).we();
                    if ((r6 instanceof abcd.Ds) == true) { $pc0 = 14; continue $sw0; }
                    return false;
                }
                case 14: {
                    r7 = (abcd.Ds) r6;
                    if (r7.J8() == true) { $pc0 = 17; continue $sw0; }
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    return false;
                }
                case 17: {
                    if (abcd.Abstractao.FH(r7.Ws()) == false) { $pc0 = 19; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        return r0.get(0).lg() + ", " + r0.get(1).lg() + ", " + abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r5).we());
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r1).we(), 16);
    }

    @Override
    public void j6(abcd.Lt r5, abcd.AbstractVn r6) {
        abcd.cs r0 = r6.gn();
        int r1 = ((abcd.Ds) ((abcd.Tn) r6).we()).Ws();
        abcd.Abstractao.j6(r5, abcd.Abstractao.j6(r6, abcd.Abstractao.DW(r0.get(0).we(), r0.get(1).we())), (short) r1);
    }
}
