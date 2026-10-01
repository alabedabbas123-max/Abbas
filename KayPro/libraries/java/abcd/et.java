package abcd;

public class et extends abcd.Ts {
    private final java.util.ArrayList<abcd.Nt> FH;
    private final abcd.Ft Hw;

    public et(abcd.Ft r1, int r2) {
        super(r2);
        this.FH = new java.util.ArrayList();
        this.Hw = r1;
    }

    private void j6(int r4, int r5) {
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = r4 + 1;
                    this.FH.ensureCapacity(r1);
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r4 < this.FH.size()) { $pc0 = 6; continue $sw0; }
                    this.FH.add(new abcd.Nt(r1));
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    this.Hw.j6(r5, this.FH.get(r4));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(int r4, int r5, int r6) {
        abcd.Nt r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5 < this.FH.size()) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r0 = this.FH.get(r5);
                    if (r0 != null) { $pc1 = 9; continue $sw1; }
                    return false;
                }
                case 9: {
                    if (r6 != 1) { $pc1 = 13; continue $sw1; }
                    return r0.j6(r4);
                }
                case 13: {
                    if (r0.j6(r4) == false) { $pc1 = 15; continue $sw1; }
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    return true;
                }
                case 15: {
                    if (DW(r4, r5 + 1, r6 - 1) == true) { $pc1 = 16; continue $sw1; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r2, int r3, int r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    super.j6(r2, r3, r4);
                    j6(r3, r2);
                    if (r4 != 2) { $pc2 = 6; continue $sw2; }
                    j6(r3 + 1, r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.bs r2, int r3) {
        return DW(r2.we(), r3, r2.Hw());
    }

    public boolean j6(abcd.cs r7, int r8, int r9) {
        int r0 = 0;
        int r2 = 0;
        abcd.bs r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r7.size();
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r0) { $pc3 = 17; continue $sw3; }
                    r3 = r7.get(r2);
                    r4 = j6(r3.we());
                    if (r4 == r8) { $pc3 = 15; continue $sw3; }
                    if (r3.Hw() == 2) { $pc3 = 9; continue $sw3; }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    if (r9 != 2) { $pc3 = 14; continue $sw3; }
                    if (r4 != (r8 + 1)) { $pc3 = 14; continue $sw3; }
                    return true;
                }
                case 14: {
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 9: {
                    if ((r4 + 1) != r8) { $pc3 = 10; continue $sw3; }
                    return true;
                }
                case 15: {
                    return true;
                }
                case 17: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
