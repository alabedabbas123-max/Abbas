package abcd;

public class du extends abcd.Xt {
    private final abcd.au FH;

    public du(int r2) {
        super(r2);
        this.FH = new abcd.au(r2);
    }

    public du(abcd.du r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Object r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r4.size());
                    this.FH = r4.FH.lg();
                    r0 = r4.size();
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r1 >= r0) { $pc0 = 8; continue $sw0; }
                    r2 = r4.DW(r1);
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    j6(r1, r2);
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void er() {
        int r0 = 0;
        int r1 = 0;
        abcd.Interfacecu r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r0) { $pc1 = 8; continue $sw1; }
                    r2 = (abcd.Interfacecu) DW(r1);
                    if (r2 == null) { $pc1 = 7; continue $sw1; }
                    this.FH.FH(r2.DW(), r1);
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH.size();
                    r1 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1 > (r5 - r0)) { $pc2 = 6; continue $sw2; }
                    this.FH.DW(-1);
                    r1 = r1 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    this.FH.FH(r5, r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5(int r3) {
        this.FH.FH(r3, -1);
    }

    public final int Hw(int r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 < this.FH.size()) { $pc3 = 7; continue $sw3; }
                    return -1;
                }
                case 7: {
                    return this.FH.get(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(int r2, abcd.Interfacecu r3) {
        abcd.Interfacecu r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = (abcd.Interfacecu) FH(r2);
                    j6(r2, r3);
                    if (r0 == null) { $pc4 = 5; continue $sw4; }
                    v5(r0.DW());
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    if (r3 == null) { $pc4 = 8; continue $sw4; }
                    j6(r3.DW(), r2);
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void lg() {
        super.lg();
        er();
    }

    public final int rN() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.FH.size() - 1;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r0 < 0) { $pc5 = 7; continue $sw5; }
                    if (this.FH.get(r0) >= 0) { $pc5 = 7; continue $sw5; }
                    r0 = r0 - 1;
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    r1 = r0 + 1;
                    this.FH.gn(r1);
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
