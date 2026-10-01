package abcd;

class RL implements java.util.Enumeration {
    final abcd.SL DW;
    int j6;

    RL(abcd.SL r1) {
        this.DW = r1;
        this.j6 = 0;
    }

    @Override
    public boolean hasMoreElements() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 >= abcd.SL.j6(this.DW).length) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object nextElement() {
        abcd.AL[] r0 = abcd.SL.j6(this.DW);
        int r1 = this.j6;
        this.j6 = r1 + 1;
        return r0[r1];
    }
}
