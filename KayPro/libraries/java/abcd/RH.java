package abcd;

class RH implements java.util.Comparator<abcd.MH> {
    final abcd.TH j6;

    RH(abcd.TH r1) {
        this.j6 = r1;
    }

    @Override
    public int compare(abcd.MH r1, abcd.MH r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.MH r3, abcd.MH r4) {
        boolean r0 = false;
        boolean r1 = false;
        int r2 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r3.vy();
                    r1 = r4.vy();
                    r2 = (r0 ? 1 : 0) - (r1 ? 1 : 0);
                    if (r2 == 0) { $pc0 = 5; continue $sw0; }
                    return r2;
                }
                case 5: {
                    r5 = r3.yS() - r4.yS();
                    if (r5 == 0) { $pc0 = 8; continue $sw0; }
                    return r5;
                }
                case 8: {
                    r6 = (r3.er() >>> 1) - (r4.er() >>> 1);
                    if (r6 == 0) { $pc0 = 11; continue $sw0; }
                    return r6;
                }
                case 11: {
                    r7 = (r3.er() & 1) - (r4.er() & 1);
                    if (r7 == 0) { $pc0 = 14; continue $sw0; }
                    return r7;
                }
                case 14: {
                    r8 = (!r3.P8() ? 1 : 0) - (!r4.P8() ? 1 : 0);
                    if (r8 == 0) { $pc0 = 18; continue $sw0; }
                    return r8;
                }
                case 18: {
                    return r4.gW() - r3.gW();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
