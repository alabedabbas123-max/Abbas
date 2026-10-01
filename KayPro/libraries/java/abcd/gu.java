package abcd;

public class gu implements abcd.Interfacebu {
    final abcd.au j6;

    public gu() {
        this.j6 = new abcd.au();
        this.j6.er();
    }

    @Override
    public void add(int r3) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6.FH(r3);
                    if (r0 >= 0) { $pc0 = 6; continue $sw0; }
                    this.j6.j6(-(r0 + 1), r3);
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
    public abcd._t iterator() {
        return new abcd.fu(this);
    }

    @Override
    public int j6() {
        return this.j6.size();
    }

    @Override
    public void j6(abcd.Interfacebu r7) {
        int r1 = 0;
        abcd.gu r8 = null;
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        abcd.Nt r9 = null;
        abcd._t r10 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    if ((r7 instanceof abcd.gu) == false) { $pc1 = 21; continue $sw1; }
                    r8 = (abcd.gu) r7;
                    r0 = this.j6.size();
                    r2 = r8.j6.size();
                    r3 = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r1 >= r2) { $pc1 = 17; continue $sw1; }
                    if (r3 >= r0) { $pc1 = 17; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r1 >= r2) { $pc1 = 11; continue $sw1; }
                    if (r8.j6.get(r1) >= this.j6.get(r3)) { $pc1 = 11; continue $sw1; }
                    r5 = r1 + 1;
                    add(r8.j6.get(r1));
                    r1 = r5;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r1 == r2) { $pc1 = 17; continue $sw1; }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (r3 >= r0) { $pc1 = 5; continue $sw1; }
                    if (r8.j6.get(r1) < this.j6.get(r3)) { $pc1 = 5; continue $sw1; }
                    r3 = r3 + 1;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    if (r1 >= r2) { $pc1 = 19; continue $sw1; }
                    add(r8.j6.get(r1));
                    r1 = r1 + 1;
                    { $pc1 = 17; continue $sw1; }
                }
                case 19: {
                    this.j6.er();
                    return;
                }
                case 21: {
                    if ((r7 instanceof abcd.Nt) == false) { $pc1 = 26; continue $sw1; }
                    r9 = (abcd.Nt) r7;
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    if (r1 < 0) { $pc1 = 25; continue $sw1; }
                    this.j6.DW(r1);
                    r1 = abcd.Ot.DW(r9.j6, r1 + 1);
                    { $pc1 = 23; continue $sw1; }
                }
                case 25: {
                    this.j6.er();
                    return;
                }
                case 26: {
                    r10 = r7.iterator();
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    if (r10.hasNext() == false) { $pc1 = 44; continue $sw1; }
                    add(r10.next());
                    { $pc1 = 28; continue $sw1; }
                }
                case 44: {
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
                    if (this.j6.v5(r2) < 0) { $pc2 = 5; continue $sw2; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return this.j6.toString();
    }
}
