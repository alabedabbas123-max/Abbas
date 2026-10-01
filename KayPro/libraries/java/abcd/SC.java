package abcd;

class SC implements java.util.Comparator<abcd.TC> {
    SC() {
    }

    @Override
    public int compare(abcd.TC r1, abcd.TC r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.TC r7, abcd.TC r8) {
        byte[] r9 = null;
        byte[] r10 = null;
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r9 = abcd.TC.j6(r7);
                    r10 = abcd.TC.j6(r8);
                    r0 = r9.length;
                    r1 = r10.length;
                    r3 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r3 >= r0) { $pc0 = 10; continue $sw0; }
                    if (r3 >= r1) { $pc0 = 10; continue $sw0; }
                    r4 = (r9[r3] & 255) - (r10[r3] & 255);
                    if (r4 != 0) { $pc0 = 8; continue $sw0; }
                    r3 = r3 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 8: {
                    return r4;
                }
                case 10: {
                    if (r0 != r1) { $pc0 = 12; continue $sw0; }
                    return 0;
                }
                case 12: {
                    if (r0 >= r1) { $pc0 = 16; continue $sw0; }
                    return 47 - (r10[r3] & 255);
                }
                case 16: {
                    return (r9[r3] & 255) - 47;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
