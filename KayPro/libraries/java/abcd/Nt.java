package abcd;

public class Nt implements abcd.Interfacebu {
    int[] j6;

    public Nt(int r1) {
        this.j6 = abcd.Ot.j6(r1);
    }

    private void DW(int r4) {
        int[] r5 = null;
        int[] r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 < abcd.Ot.DW(this.j6)) { $pc0 = 6; continue $sw0; }
                    r5 = abcd.Ot.j6(java.lang.Math.max(r4 + 1, abcd.Ot.DW(this.j6) * 2));
                    r0 = this.j6;
                    java.lang.System.arraycopy(r0, 0, r5, 0, r0.length);
                    this.j6 = r5;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void add(int r3) {
        DW(r3);
        abcd.Ot.j6(this.j6, r3, true);
    }

    @Override
    public abcd._t iterator() {
        return new abcd.Mt(this);
    }

    @Override
    public int j6() {
        return abcd.Ot.j6(this.j6);
    }

    @Override
    public void j6(abcd.Interfacebu r5) {
        abcd.Nt r6 = null;
        abcd.gu r7 = null;
        int r0 = 0;
        int r1 = 0;
        abcd._t r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r5 instanceof abcd.Nt) == false) { $pc1 = 6; continue $sw1; }
                    r6 = (abcd.Nt) r5;
                    DW(abcd.Ot.DW(r6.j6) + 1);
                    abcd.Ot.j6(this.j6, r6.j6);
                    return;
                }
                case 6: {
                    if ((r5 instanceof abcd.gu) == false) { $pc1 = 14; continue $sw1; }
                    r7 = (abcd.gu) r5;
                    r0 = r7.j6.size();
                    if (r0 <= 0) { $pc1 = 10; continue $sw1; }
                    DW(r7.j6.get(r0 - 1));
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    r1 = 0;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r1 >= r7.j6.size()) { $pc1 = 21; continue $sw1; }
                    abcd.Ot.j6(this.j6, r7.j6.get(r1), true);
                    r1 = r1 + 1;
                    { $pc1 = 12; continue $sw1; }
                }
                case 21: {
                    return;
                }
                case 14: {
                    r8 = r5.iterator();
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r8.hasNext() == false) { $pc1 = 22; continue $sw1; }
                    add(r8.next());
                    { $pc1 = 16; continue $sw1; }
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(int r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 < abcd.Ot.DW(this.j6)) { $pc2 = 5; continue $sw2; }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (abcd.Ot.FH(this.j6, r2) == false) { $pc2 = 7; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        boolean r3 = false;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append('{');
                    r1 = abcd.Ot.DW(this.j6, 0);
                    r3 = true;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r1 < 0) { $pc3 = 7; continue $sw3; }
                    if (r3 == true) { $pc3 = 6; continue $sw3; }
                    r0.append(", ");
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r0.append(r1);
                    r1 = abcd.Ot.DW(this.j6, r1 + 1);
                    r3 = false;
                    { $pc3 = 3; continue $sw3; }
                }
                case 7: {
                    r0.append('}');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
