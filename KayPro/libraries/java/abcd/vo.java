package abcd;

public final class vo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.vo();
    }

    private vo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.Hw(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r4) {
        abcd.cs r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4.gn();
                    if ((r4 instanceof abcd.mo) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return false;
                }
                case 5: {
                    if (r0.size() != 1) { $pc0 = 9; continue $sw0; }
                    if (abcd.Abstractao.Hw(r0.get(0).we()) == false) { $pc0 = 9; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r2) {
        return r2.gn().get(0).lg();
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
    public void j6(abcd.Lt r3, abcd.AbstractVn r4) {
        abcd.Abstractao.j6(r3, abcd.Abstractao.j6(r4, r4.gn().get(0).we()));
    }
}
