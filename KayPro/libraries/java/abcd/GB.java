package abcd;

public abstract class GB<C extends abcd.AbstractCallabledB, T> extends dB<T> {
    protected abcd.AbstractkI FH;
    protected int Hw;
    protected abcd.HB v5;

    protected GB(abcd.UE r1) {
        super(r1);
    }

    protected final C FH() {
        return this;
    }

    public C j6(int r1) {
        this.Hw = r1;
        FH();
        return this;
    }

    protected C j6(abcd.GB r2) {
        r2.j6(this.FH);
        r2.j6(this.Hw);
        r2.j6(this.v5);
        FH();
        return this;
    }

    public C j6(abcd.HB r1) {
        this.v5 = r1;
        FH();
        return this;
    }

    protected C j6(abcd.AbstractjJ r2) {
        abcd.AbstractkI r0 = null;
        abcd.HB r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH;
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    r2.j6(r0);
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r2.j6(this.Hw);
                    r1 = this.v5;
                    if (r1 == null) { $pc0 = 8; continue $sw0; }
                    r1.j6(r2);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    FH();
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public C j6(abcd.AbstractkI r1) {
        this.FH = r1;
        FH();
        return this;
    }
}
