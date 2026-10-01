package abcd;

public final class fo extends abcd.Abstractqo {
    public fo(abcd.hs r2) {
        super(r2, abcd.cs.FH);
    }

    @Override
    public int DW() {
        return FH() & 1;
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r2) {
        return new abcd.fo(VH());
    }

    @Override
    protected java.lang.String j6() {
        return null;
    }

    @Override
    protected java.lang.String j6(boolean r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (DW() != 0) { $pc0 = 6; continue $sw0; }
                    return null;
                }
                case 6: {
                    return "nop // spacer";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Lt r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (DW() == 0) { $pc1 = 6; continue $sw1; }
                    r2.writeShort(abcd.Abstractao.j6(0, 0));
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
