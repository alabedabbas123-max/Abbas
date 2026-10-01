package abcd;

public final class Io extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Io();
    }

    private Io() {
    }

    @Override
    public boolean VH(abcd.AbstractVn r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof abcd.po) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (r2.gn().size() != 0) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                case 11: {
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
        return 3;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6(r1);
    }

    @Override
    public void j6(abcd.Lt r3, abcd.AbstractVn r4) {
        int r0 = ((abcd.po) r4).J8();
        abcd.Abstractao.j6(r3, abcd.Abstractao.j6(r4, 0), r0);
    }

    @Override
    public boolean j6(abcd.po r1) {
        return true;
    }
}
