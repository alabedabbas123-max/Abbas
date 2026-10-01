package abcd;

public final class wo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.wo();
    }

    private wo() {
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
    public boolean VH(abcd.AbstractVn r6) {
        abcd.cs r7 = null;
        int r0 = 0;
        abcd.bs r1 = null;
        abcd.bs r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r6 instanceof abcd.mo) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r7 = r6.gn();
                    r0 = r7.size();
                    if (r0 != 2) { $pc0 = 8; continue $sw0; }
                    r1 = r7.get(0);
                    r2 = r7.get(1);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    if (abcd.Abstractao.v5(r1.we()) == true) { $pc0 = 17; continue $sw0; }
                    return false;
                }
                case 17: {
                    if (abcd.Abstractao.v5(r2.we()) == false) { $pc0 = 21; continue $sw0; }
                    return true;
                }
                case 21: {
                    return false;
                }
                case 8: {
                    if (r0 == 3) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                case 10: {
                    r1 = r7.get(1);
                    r2 = r7.get(2);
                    if (r1.we() == r7.get(0).we()) { $pc0 = 15; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        int r0 = r5.size();
        return r5.get(r0 - 2).lg() + ", " + r5.get(r0 - 1).lg();
    }

    @Override
    public int j6() {
        return 1;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return "";
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = r0.size();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, abcd.Abstractao.DW(r0.get(r1 - 2).we(), r0.get(r1 - 1).we())));
    }
}
