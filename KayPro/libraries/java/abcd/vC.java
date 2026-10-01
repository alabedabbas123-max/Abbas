package abcd;

class vC extends abcd.AbstractzC {
    vC() {
    }

    @Override
    protected int j6(byte[] r4, int r5, int r6) {
        int r0 = 0;
        byte r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 5381;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r5 >= r6) { $pc0 = 4; continue $sw0; }
                    r1 = r4[r5];
                    if (abcd.HK.j6(r1) == true) { $pc0 = 8; continue $sw0; }
                    r0 = ((r0 << 5) + r0) + (r1 & 255);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r5 = r5 + 1;
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

    public boolean j6(abcd.tC r8, int r9, abcd.tC r10, int r11) {
        int r12 = 0;
        int r13 = 0;
        int r1 = 0;
        int r2 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        byte r4 = 0;
        byte r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r12 = r9 + 1;
                    r13 = r11 + 1;
                    r1 = r8.FH.DW(r12);
                    r2 = r10.FH.DW(r13);
                    r14 = r8.FH.DW(r12 + 1);
                    r15 = r10.FH.DW(r13 + 1);
                    r16 = abcd.HK.DW(r8.DW, r1, r14);
                    r17 = abcd.HK.DW(r10.DW, r2, r15);
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 >= r16) { $pc1 = 23; continue $sw1; }
                    if (r2 >= r17) { $pc1 = 23; continue $sw1; }
                    r4 = r8.DW[r1];
                    r5 = r10.DW[r2];
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r1 >= (r16 - 1)) { $pc1 = 15; continue $sw1; }
                    if (abcd.HK.j6(r4) == false) { $pc1 = 15; continue $sw1; }
                    r1 = r1 + 1;
                    r4 = r8.DW[r1];
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    if (r2 >= (r17 - 1)) { $pc1 = 20; continue $sw1; }
                    if (abcd.HK.j6(r5) == false) { $pc1 = 20; continue $sw1; }
                    r2 = r2 + 1;
                    r5 = r10.DW[r2];
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    if (r4 != r5) { $pc1 = 21; continue $sw1; }
                    r1 = r1 + 1;
                    r2 = r2 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 21: {
                    return false;
                }
                case 23: {
                    if (r1 != r16) { $pc1 = 26; continue $sw1; }
                    if (r2 != r17) { $pc1 = 26; continue $sw1; }
                    return true;
                }
                case 26: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
