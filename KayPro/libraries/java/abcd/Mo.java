package abcd;

public final class Mo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Mo();
    }

    private Mo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        java.util.BitSet r0 = new java.util.BitSet(2);
        r0.set(0, abcd.Abstractao.Zo(r5.get(0).we()));
        r0.set(1, abcd.Abstractao.Zo(r5.get(1).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.gn();
                    if ((r5 instanceof abcd.mo) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    return false;
                }
                case 5: {
                    if (r0.size() != 2) { $pc0 = 11; continue $sw0; }
                    if (abcd.Abstractao.Zo(r0.get(0).we()) == false) { $pc0 = 11; continue $sw0; }
                    if (abcd.Abstractao.Zo(r0.get(1).we()) == false) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        return r4.get(0).lg() + ", " + r4.get(1).lg();
    }

    @Override
    public int j6() {
        return 3;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return "";
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, 0), (short) r0.get(0).we(), (short) r0.get(1).we());
    }
}
