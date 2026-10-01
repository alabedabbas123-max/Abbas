package abcd;

public final class Xo extends abcd.AbstractGp {
    private abcd.Wo v5;

    public Xo(abcd.Wo r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(4, 4);
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.v5 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("annotations == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void DW(abcd.jp r4, abcd.Lt r5) {
        int r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = this.v5.we();
                    if (r5.Hw() == false) { $pc1 = 5; continue $sw1; }
                    r5.j6(4, "  annotations_off: " + abcd.Yt.gn(r6));
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r5.writeInt(r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.a8;
    }

    @Override
    public java.lang.String aM() {
        return this.v5.aM();
    }

    @Override
    public void j6(abcd.jp r2) {
        this.v5 = (abcd.Wo) r2.XL().DW(this.v5);
    }
}
