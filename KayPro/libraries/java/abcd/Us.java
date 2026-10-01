package abcd;

class Us implements java.util.Comparator<abcd.Abstractms> {
    final abcd.Ws DW;
    final java.util.HashMap j6;

    Us(abcd.Ws r1, java.util.HashMap r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public int compare(abcd.Abstractms r1, abcd.Abstractms r2) {
        return j6(r1, r2);
    }

    @Override
    public boolean equals(java.lang.Object r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 != this) { $pc0 = 4; continue $sw0; }
                    return true;
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Abstractms r3, abcd.Abstractms r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = ((java.lang.Integer) this.j6.get(r4)).intValue() - ((java.lang.Integer) this.j6.get(r3)).intValue();
                    if (r0 == 0) { $pc1 = 5; continue $sw1; }
                    return r0;
                }
                case 5: {
                    return r3.j6(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
