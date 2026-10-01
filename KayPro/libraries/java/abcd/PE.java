package abcd;

class PE extends abcd.RE.b {
    final abcd.RE DW;

    PE(abcd.RE r2) {
        this.DW = r2;
        super(r2, null);
    }

    @Override
    abcd.RE.a j6(abcd.RE.a r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != abcd.RE.a.FH) { $pc0 = 6; continue $sw0; }
                    return r2;
                }
                case 6: {
                    return this.DW.DW(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
