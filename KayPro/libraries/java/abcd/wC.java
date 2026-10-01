package abcd;

class wC extends abcd.AbstractzC {
    wC() {
    }

    @Override
    protected int j6(byte[] r3, int r4, int r5) {
        int r6 = 0;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = abcd.HK.j6(r3, r4, r5);
                    r0 = 5381;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r6 >= r5) { $pc0 = 4; continue $sw0; }
                    r1 = (r0 << 5) + r0;
                    r0 = (r3[r6] & 255) + r1;
                    r6 = r6 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.CC r1, int r2, abcd.CC r3, int r4) {
        return j6((abcd.tC) r1, r2, (abcd.tC) r3, r4);
    }

    public boolean j6(abcd.tC r7, int r8, abcd.tC r9, int r10) {
        int r11 = 0;
        int r12 = 0;
        int r1 = 0;
        int r2 = 0;
        int r13 = 0;
        int r14 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r11 = r8 + 1;
                    r12 = r10 + 1;
                    r1 = r7.FH.DW(r11);
                    r2 = r9.FH.DW(r12);
                    r13 = r7.FH.DW(r11 + 1);
                    r14 = r9.FH.DW(r12 + 1);
                    r3 = abcd.HK.j6(r7.DW, r1, r13);
                    r4 = abcd.HK.j6(r9.DW, r2, r14);
                    if ((r13 - r3) == (r14 - r4)) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    if (r3 >= r13) { $pc1 = 6; continue $sw1; }
                    r5 = r3 + 1;
                    r6 = r4 + 1;
                    if (r7.DW[r3] != r9.DW[r4]) { $pc1 = 9; continue $sw1; }
                    r3 = r5;
                    r4 = r6;
                    { $pc1 = 5; continue $sw1; }
                }
                case 9: {
                    return false;
                }
                case 6: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
