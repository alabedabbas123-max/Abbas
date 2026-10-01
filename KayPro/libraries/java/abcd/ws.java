package abcd;

public final class ws extends abcd.Fs {
    public ws(abcd.Ks r1, abcd.Hs r2) {
        super(r1, r2);
    }

    public static abcd.ws j6(abcd.Qs r2) {
        return new abcd.ws(abcd.Ks.j6(r2), abcd.Hs.j6);
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = super.DW(r2);
                    if (r0 == 0) { $pc0 = 6; continue $sw0; }
                    return r0;
                }
                case 6: {
                    return we().VH().j6(((abcd.ws) r2).we().VH());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo() {
        return "field";
    }

    @Override
    public abcd.Qs getType() {
        return we().we();
    }
}
