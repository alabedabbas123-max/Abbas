package abcd;

class yC extends abcd.AbstractzC {
    yC() {
    }

    @Override
    protected int j6(byte[] r4, int r5, int r6) {
        int r7 = 0;
        int r0 = 0;
        byte r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7 = abcd.HK.DW(r4, r5, r6);
                    r0 = 5381;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r5 >= r7) { $pc0 = 4; continue $sw0; }
                    r1 = r4[r5];
                    r2 = (r0 << 5) + r0;
                    r0 = (r1 & 255) + r2;
                    if (abcd.HK.j6(r1) == true) { $pc0 = 7; continue $sw0; }
                    r5 = r5 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 7: {
                    r5 = abcd.HK.j6(r4, r5, r7);
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
        int r15 = 0;
        int r16 = 0;
        byte r4 = 0;
        byte r5 = 0;
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
                    r15 = abcd.HK.DW(r7.DW, r1, r13);
                    r16 = abcd.HK.DW(r9.DW, r2, r14);
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 >= r15) { $pc1 = 18; continue $sw1; }
                    if (r2 >= r16) { $pc1 = 18; continue $sw1; }
                    r4 = r7.DW[r1];
                    r5 = r9.DW[r2];
                    if (r4 != r5) { $pc1 = 9; continue $sw1; }
                    if (abcd.HK.j6(r4) == false) { $pc1 = 13; continue $sw1; }
                    r1 = abcd.HK.j6(r7.DW, r1, r15);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    if (abcd.HK.j6(r5) == true) { $pc1 = 16; continue $sw1; }
                    r2 = r2 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 16: {
                    r2 = abcd.HK.j6(r9.DW, r2, r16);
                    { $pc1 = 4; continue $sw1; }
                }
                case 13: {
                    r1 = r1 + 1;
                    { $pc1 = 15; continue $sw1; }
                }
                case 9: {
                    return false;
                }
                case 18: {
                    if (r1 != r15) { $pc1 = 21; continue $sw1; }
                    if (r2 != r16) { $pc1 = 21; continue $sw1; }
                    return true;
                }
                case 21: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
