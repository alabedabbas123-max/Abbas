package abcd;

class ZJ implements java.util.Comparator<abcd._J.a> {
    ZJ() {
    }

    @Override
    public int compare(abcd._J.a r1, abcd._J.a r2) {
        return j6(r1, r2);
    }

    public int j6(abcd._J.a r8, abcd._J.a r9) {
        byte[] r0 = null;
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r10 = 0;
        int r11 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r8.j6;
                    r1 = r9.j6;
                    r2 = r8.DW;
                    r3 = r9.DW;
                    r4 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r4 >= r2) { $pc0 = 10; continue $sw0; }
                    if (r4 >= r3) { $pc0 = 10; continue $sw0; }
                    r5 = (r0[r4] & 255) - (r1[r4] & 255);
                    if (r5 != 0) { $pc0 = 8; continue $sw0; }
                    r4 = r4 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 8: {
                    return r5;
                }
                case 10: {
                    if (r4 >= r2) { $pc0 = 14; continue $sw0; }
                    r10 = r0[r4] & 255;
                    r11 = abcd._J.DW(r9);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    return r10 - r11;
                }
                case 14: {
                    if (r4 >= r3) { $pc0 = 16; continue $sw0; }
                    r10 = abcd._J.DW(r8);
                    r11 = r1[r4] & 255;
                    { $pc0 = 13; continue $sw0; }
                }
                case 16: {
                    r10 = abcd._J.DW(r8);
                    r11 = abcd._J.DW(r9);
                    { $pc0 = 13; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
