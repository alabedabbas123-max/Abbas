package abcd;

final class VF extends abcd.XF {
    private final abcd.XF j6;

    VF(abcd.XF r1) {
        this.j6 = r1;
    }

    @Override
    int DW() {
        return this.j6.DW();
    }

    @Override
    abcd.dG j6() {
        abcd.dG r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    r0 = this.j6.j6();
                    if (r0 == null) { $pc0 = 4; continue $sw0; }
                    if ((r0.EQ & 4) != 0) { $pc0 = 2; continue $sw0; }
                    return r0;
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
