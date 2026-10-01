package abcd;

public final class zs extends abcd.Abstractqs {
    private abcd.Gs v5;

    public zs(abcd.Ks r1, abcd.Hs r2) {
        super(r1, r2);
        this.v5 = null;
    }

    @Override
    public java.lang.String Zo() {
        return "ifaceMethod";
    }

    public abcd.Gs rN() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.v5 != null) { $pc0 = 6; continue $sw0; }
                    this.v5 = new abcd.Gs(VH(), we());
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
