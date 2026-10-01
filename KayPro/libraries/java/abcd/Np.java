package abcd;

public final class Np extends abcd.Abstractup implements java.lang.Comparable {
    private final abcd.Js DW;
    private abcd.Mp FH;

    public Np(abcd.Js r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r2;
                    this.FH = null;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("value == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.DW;
    }

    @Override
    public int VH() {
        return 4;
    }

    public abcd.Js aM() {
        return this.DW;
    }

    @Override
    public int compareTo(java.lang.Object r2) {
        return this.DW.j6(((abcd.Np) r2).DW);
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd.Np) == true) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return this.DW.equals(((abcd.Np) r2).DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    @Override
    public void j6(abcd.jp r3) {
        abcd.Fp r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.FH != null) { $pc2 = 6; continue $sw2; }
                    r4 = r3.J0();
                    this.FH = new abcd.Mp(this.DW);
                    r4.j6(this.FH);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.jp r5, abcd.Lt r6) {
        int r7 = 0;
        java.lang.StringBuilder r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r7 = this.FH.we();
                    if (r6.Hw() == false) { $pc3 = 5; continue $sw3; }
                    r6.j6(0, Ws() + ' ' + this.DW.j6(100));
                    r1 = new java.lang.StringBuilder();
                    r1.append("  string_data_off: ");
                    r1.append(abcd.Yt.gn(r7));
                    r6.j6(4, r1.toString());
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r6.writeInt(r7);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
