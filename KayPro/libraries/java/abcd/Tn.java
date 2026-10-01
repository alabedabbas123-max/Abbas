package abcd;

public final class Tn extends abcd.AbstractZn {
    private int VH;
    private int Zo;
    private final abcd.Abstractms v5;

    public Tn(abcd.Xn r1, abcd.hs r2, abcd.cs r3, abcd.Abstractms r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2, r3);
                    if (r4 == null) { $pc0 = 7; continue $sw0; }
                    this.v5 = r4;
                    this.Zo = -1;
                    this.VH = -1;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("constant == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(int r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 < 0) { $pc1 = 10; continue $sw1; }
                    if (this.VH >= 0) { $pc1 = 8; continue $sw1; }
                    this.VH = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.RuntimeException("class index already set");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("index < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(int r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 < 0) { $pc2 = 10; continue $sw2; }
                    if (this.Zo >= 0) { $pc2 = 8; continue $sw2; }
                    this.Zo = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.RuntimeException("index already set");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("index < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J0() {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Zo;
                    if (r0 < 0) { $pc3 = 6; continue $sw3; }
                    return r0;
                }
                case 6: {
                    throw new java.lang.RuntimeException("index not yet set for " + this.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean J8() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.Zo < 0) { $pc4 = 5; continue $sw4; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractVn j6(abcd.Xn r5) {
        abcd.Tn r0 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new abcd.Tn(r5, VH(), gn(), this.v5);
                    r6 = this.Zo;
                    if (r6 < 0) { $pc5 = 5; continue $sw5; }
                    r0.Hw(r6);
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r7 = this.VH;
                    if (r7 < 0) { $pc5 = 8; continue $sw5; }
                    r0.FH(r7);
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r5) {
        abcd.Tn r0 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new abcd.Tn(Zo(), VH(), r5, this.v5);
                    r6 = this.Zo;
                    if (r6 < 0) { $pc6 = 5; continue $sw6; }
                    r0.Hw(r6);
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    r7 = this.VH;
                    if (r7 < 0) { $pc6 = 8; continue $sw6; }
                    r0.FH(r7);
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.lang.String j6() {
        return this.v5.aM();
    }

    public abcd.Abstractms we() {
        return this.v5;
    }
}
