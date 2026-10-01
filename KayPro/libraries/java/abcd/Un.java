package abcd;

public final class Un {
    private abcd.ho DW;
    private abcd.InterfacePn FH;
    private abcd.Rn Hw;
    private abcd.Wn VH;
    private abcd.co Zo;
    private final int j6;
    private abcd.io v5;

    public interface a {
        int j6(abcd.Abstractms r1);
    }

    public Un(int r1, abcd.ho r2, abcd.InterfacePn r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 10; continue $sw0; }
                    if (r3 == null) { $pc0 = 8; continue $sw0; }
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = null;
                    this.v5 = null;
                    this.Zo = null;
                    this.VH = null;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("unprocessedCatches == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("unprocessedInsns == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void tp() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.VH == null) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    this.VH = this.DW.j6();
                    this.v5 = abcd.io.j6(this.VH, this.j6);
                    this.Zo = abcd.co.j6(this.VH);
                    this.Hw = this.FH.build();
                    this.DW = null;
                    this.FH = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Rn DW() {
        tp();
        return this.Hw;
    }

    public java.util.HashSet<abcd.Abstractms> FH() {
        return this.DW.DW();
    }

    public abcd.Wn Hw() {
        tp();
        return this.VH;
    }

    public boolean VH() {
        return this.FH.DW();
    }

    public abcd.io Zo() {
        tp();
        return this.v5;
    }

    public boolean gn() {
        return this.DW.FH();
    }

    public java.util.HashSet<abcd.Qs> j6() {
        return this.FH.j6();
    }

    public void j6(abcd.Un.a r2) {
        this.DW.j6(r2);
    }

    public boolean u7() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6 != 1) { $pc2 = 5; continue $sw2; }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (this.DW.Hw() == false) { $pc2 = 7; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.co v5() {
        tp();
        return this.Zo;
    }
}
