package abcd;

public final class Bo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Bo();
    }

    private Bo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.Hw(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = null;
        abcd.po r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.gn();
                    if ((r5 instanceof abcd.po) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    return false;
                }
                case 5: {
                    if (r0.size() != 1) { $pc0 = 13; continue $sw0; }
                    if (abcd.Abstractao.Hw(r0.get(0).we()) == false) { $pc0 = 13; continue $sw0; }
                    r6 = (abcd.po) r5;
                    if (r6.Ws() == true) { $pc0 = 12; continue $sw0; }
                    return true;
                }
                case 12: {
                    return j6(r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.DW(r4);
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6(r1);
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.po) r5).J8();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, r0.get(0).we()), (short) r1);
    }

    @Override
    public boolean j6(abcd.po r1) {
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = r1.J8();
                    if (r2 != 0) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (abcd.Abstractao.FH(r2) == false) { $pc1 = 7; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
