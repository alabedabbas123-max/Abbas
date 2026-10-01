package abcd;

public final class vs extends abcd.Fs {
    private abcd.ws FH;

    public vs(abcd.Hs r3) {
        super(new abcd.Ks(r3.we()), r3);
        this.FH = null;
    }

    public abcd.ws J8() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH != null) { $pc0 = 6; continue $sw0; }
                    this.FH = new abcd.ws(VH(), we());
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo() {
        return "enum";
    }

    @Override
    public abcd.Qs getType() {
        return VH().VH();
    }
}
