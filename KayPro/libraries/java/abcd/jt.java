package abcd;

class jt extends abcd.Abstractqt {
    final abcd.bs DW;
    final abcd.kt FH;
    final abcd.bs j6;

    jt(abcd.kt r1, abcd.bs r2, abcd.bs r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public int j6() {
        return abcd.lt.j6(this.FH.FH).u7();
    }

    @Override
    public abcd.bs j6(abcd.bs r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.we() == this.j6.we()) { $pc0 = 5; continue $sw0; }
                    return r3;
                }
                case 5: {
                    return this.DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
