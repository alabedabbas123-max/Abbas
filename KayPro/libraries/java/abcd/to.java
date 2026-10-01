package abcd;

public final class to extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.to();
    }

    private to() {
    }

    @Override
    public boolean VH(abcd.AbstractVn r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof abcd.mo) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r2.gn().size() != 0) { $pc0 = 7; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r1) {
        return "";
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
    public void j6(abcd.Lt r2, abcd.AbstractVn r3) {
        abcd.Abstractao.j6(r2, abcd.Abstractao.j6(r3, 0));
    }
}
