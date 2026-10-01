package abcd;

public final class Ur extends abcd.Xt {
    public Ur(int r1) {
        super(r1);
    }

    public abcd.Tr get(int r1) {
        return (abcd.Tr) DW(r1);
    }

    public void j6(int r1, abcd.Tr r2) {
        j6(r1, r2);
    }

    public void j6(abcd.Tr.b r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r1 >= r0) { $pc0 = 5; continue $sw0; }
                    get(r1).j6(r4);
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.Ur r6) {
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6 != null) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r1 = size();
                    if (r1 == r6.size()) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    r2 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r2 >= r1) { $pc1 = 14; continue $sw1; }
                    if (get(r2).j6(r6.get(r2)) == false) { $pc1 = 12; continue $sw1; }
                    r2 = r2 + 1;
                    { $pc1 = 9; continue $sw1; }
                }
                case 12: {
                    return false;
                }
                case 14: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Tr rN() {
        return get(size() - 1);
    }
}
