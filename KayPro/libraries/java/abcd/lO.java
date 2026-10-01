package abcd;

public class lO {
    private boolean DW;
    private abcd.WN FH;
    private abcd.WN Hw;
    private abcd.AP j6;
    private abcd._N v5;

    public lO(abcd.AP r2) {
        this(r2, new abcd.hO());
    }

    public lO(abcd.AP r1, abcd._N r2) {
        this.j6 = r1;
        this.v5 = r2;
    }

    private abcd.kO j6(abcd.InterfacevP r9, abcd.XM r10) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW == false) { $pc0 = 7; continue $sw0; }
                    return new abcd.kO(r10, r9, this.j6, this.v5, true);
                }
                case 7: {
                    if (this.FH != null) { $pc0 = 14; continue $sw0; }
                    if (this.Hw != null) { $pc0 = 14; continue $sw0; }
                    return new abcd.kO(r10, r9, this.j6, this.v5);
                }
                case 14: {
                    if (this.FH != null) { $pc0 = 17; continue $sw0; }
                    this.FH = new abcd.iO();
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    return new abcd.kO(r10, r9, this.j6, this.v5, this.FH, this.Hw);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.lO DW(abcd.WN r1) {
        this.Hw = r1;
        return this;
    }

    public abcd.kO j6(abcd.InterfacevP r4, abcd.SN r5) {
        abcd.kO r6 = j6(r4, new abcd.XM(new abcd.VM(r5.j6())));
        r6.j6(r5);
        return r6;
    }

    public abcd.kO j6(abcd.InterfacevP r3, byte[] r4) {
        return j6(r3, new abcd.XM(new abcd.pM(r4)));
    }

    public abcd.lO j6(abcd.WN r1) {
        this.FH = r1;
        return this;
    }

    public abcd.lO j6(boolean r1) {
        this.DW = r1;
        return this;
    }
}
