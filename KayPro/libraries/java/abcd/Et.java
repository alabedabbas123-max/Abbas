package abcd;

public class Et {
    private final abcd.Or DW;
    private final abcd.Or FH;
    private final abcd.fs j6;

    public Et(abcd.fs r1) {
        this.j6 = r1;
        this.DW = this.j6.j6();
        this.FH = this.DW.gW();
    }

    private void j6(int r10, abcd.au r11) {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.Nr r4 = null;
        abcd.au r5 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r11.size();
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r0) { $pc0 = 8; continue $sw0; }
                    r3 = r11.get(r2);
                    r4 = this.DW.v5(r3);
                    r5 = this.j6.j6(r4.DW());
                    r6 = r5.size();
                    r7 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r7 >= r6) { $pc0 = 7; continue $sw0; }
                    j6(this.FH.v5(r5.get(r7)), r3, r10);
                    r7 = r7 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 7: {
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Nr r4, int r5, int r6) {
        abcd.au r0 = null;
        int r1 = 0;
        abcd.Nr r7 = null;
        abcd.Or r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r4.gn().lg();
                    r0.FH(r0.v5(r5), r6);
                    r1 = r4.Zo();
                    if (r1 == r5) { $pc1 = 6; continue $sw1; }
                    r6 = r1;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r0.we();
                    r7 = new abcd.Nr(r4.DW(), r4.Hw(), r0, r6);
                    r8 = this.FH;
                    r8.j6(r8.Hw(r4.DW()), r7);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(abcd.Nr r0, abcd.Nr r1) {
        return r0.Hw().j6(r1.Hw());
    }

    public abcd.fs j6() {
        int r0 = 0;
        java.util.BitSet r1 = null;
        int r3 = 0;
        abcd.Nr r5 = null;
        abcd.au r6 = null;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        abcd.Nr r10 = null;
        abcd.au r11 = null;
        int r12 = 0;
        int r13 = 0;
        abcd.Nr r14 = null;
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW.size();
                    r1 = new java.util.BitSet(this.DW.rN());
                    r3 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r3 >= r0) { $pc2 = 28; continue $sw2; }
                    r5 = this.DW.get(r3);
                    if (r1.get(r5.DW()) == true) { $pc2 = 27; continue $sw2; }
                    r6 = this.j6.j6(r5.DW());
                    r7 = r6.size();
                    r8 = 0;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r8 >= r7) { $pc2 = 27; continue $sw2; }
                    r9 = r6.get(r8);
                    r10 = this.DW.v5(r9);
                    if (r1.get(r9) == true) { $pc2 = 26; continue $sw2; }
                    if (r10.gn().size() > 1) { $pc2 = 26; continue $sw2; }
                    if (r10.FH().v5().Hw() == 55) { $pc2 = 26; continue $sw2; }
                    r11 = new abcd.au();
                    r12 = r8 + 1;
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    if (r12 >= r7) { $pc2 = 25; continue $sw2; }
                    r13 = r6.get(r12);
                    r14 = this.DW.v5(r13);
                    if (r14.gn().size() != 1) { $pc2 = 24; continue $sw2; }
                    if (j6(r10, r14) == false) { $pc2 = 24; continue $sw2; }
                    r11.DW(r13);
                    r1.set(r13);
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    r12 = r12 + 1;
                    { $pc2 = 18; continue $sw2; }
                }
                case 25: {
                    j6(r9, r11);
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    r8 = r8 + 1;
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    r3 = r3 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 28: {
                    r2 = r0 - 1;
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    if (r2 < 0) { $pc2 = 34; continue $sw2; }
                    if (r1.get(this.FH.get(r2).DW()) == false) { $pc2 = 33; continue $sw2; }
                    this.FH.j6(r2, null);
                    $pc2 = 33; continue $sw2;
                }
                case 33: {
                    r2 = r2 - 1;
                    { $pc2 = 29; continue $sw2; }
                }
                case 34: {
                    this.FH.lg();
                    this.FH.we();
                    return new abcd.fs(this.FH, this.j6.DW());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
