package abcd;

public final class po extends abcd.AbstractZn {
    private abcd.Sn v5;

    public po(abcd.Xn r1, abcd.hs r2, abcd.cs r3, abcd.Sn r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2, r3);
                    if (r4 == null) { $pc0 = 7; continue $sw0; }
                    this.v5 = r4;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("target == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J0() {
        return this.v5.FH();
    }

    public int J8() {
        return this.v5.FH() - FH();
    }

    public boolean Ws() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (u7() == true) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (this.v5.u7() == false) { $pc1 = 7; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractVn j6(abcd.Xn r5) {
        return new abcd.po(r5, VH(), gn(), this.v5);
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r5) {
        return new abcd.po(Zo(), VH(), r5, this.v5);
    }

    public abcd.po j6(abcd.Sn r5) {
        return new abcd.po(Zo().Zo(), VH(), gn(), r5);
    }

    @Override
    protected java.lang.String j6() {
        abcd.Sn r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != null) { $pc2 = 7; continue $sw2; }
                    return "????";
                }
                case 7: {
                    return r0.EQ();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Sn we() {
        return this.v5;
    }
}
