package abcd;

public final class xo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.xo();
    }

    private xo() {
    }

    @Override
    public boolean VH(abcd.AbstractVn r2) {
        abcd.po r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof abcd.po) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (r2.gn().size() != 0) { $pc0 = 15; continue $sw0; }
                    r3 = (abcd.po) r2;
                    if (r3.Ws() == true) { $pc0 = 14; continue $sw0; }
                    return true;
                }
                case 14: {
                    return j6(r3);
                }
                case 15: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r1) {
        return abcd.Abstractao.DW(r1);
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
    public void j6(abcd.Lt r3, abcd.AbstractVn r4) {
        int r0 = ((abcd.po) r4).J8();
        abcd.Abstractao.j6(r3, abcd.Abstractao.j6(r4, 0), (short) r0);
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
