package abcd;

public final class Wn extends abcd.Xt {
    private final int FH;

    public Wn(int r1, int r2) {
        super(r1);
        this.FH = r2;
    }

    public static abcd.Wn j6(java.util.ArrayList<abcd.AbstractVn> r3, int r4) {
        int r0 = 0;
        abcd.Wn r1 = null;
        int r5 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r3.size();
                    r1 = new abcd.Wn(r0, r4);
                    r5 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r5 >= r0) { $pc0 = 5; continue $sw0; }
                    r1.j6(r5, r3.get(r5));
                    r5 = r5 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r1.we();
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int er() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.AbstractVn r4 = null;
        abcd.Abstractms r5 = null;
        boolean r6 = false;
        int r7 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = size();
                    r2 = 0;
                    r3 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= r0) { $pc1 = 18; continue $sw1; }
                    r4 = (abcd.AbstractVn) DW(r2);
                    if ((r4 instanceof abcd.Tn) == false) { $pc1 = 17; continue $sw1; }
                    r5 = ((abcd.Tn) r4).we();
                    if ((r5 instanceof abcd.Abstractqs) == false) { $pc1 = 17; continue $sw1; }
                    if (r4.Zo().j6() != 113) { $pc1 = 13; continue $sw1; }
                    r6 = true;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r7 = ((abcd.Abstractqs) r5).j6(r6);
                    if (r7 <= r3) { $pc1 = 17; continue $sw1; }
                    r3 = r7;
                    { $pc1 = 17; continue $sw1; }
                }
                case 13: {
                    r6 = false;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 18: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractVn get(int r1) {
        return (abcd.AbstractVn) DW(r1);
    }

    public void j6(int r1, abcd.AbstractVn r2) {
        j6(r1, r2);
    }

    public void j6(abcd.Lt r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        boolean r2 = false;
        int r4 = 0;
        abcd.AbstractVn r5 = null;
        int r6 = 0;
        java.lang.String r7 = null;
        abcd.AbstractVn r8 = null;
        int r12 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r11.v5();
                    r1 = size();
                    r3 = 0;
                    if (r11.Hw() == false) { $pc2 = 17; continue $sw2; }
                    r2 = r11.DW();
                    r4 = 0;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r4 >= r1) { $pc2 = 17; continue $sw2; }
                    r5 = (abcd.AbstractVn) DW(r4);
                    r6 = r5.DW() * 2;
                    if (r6 != 0) { $pc2 = 11; continue $sw2; }
                    if (r2 == true) { $pc2 = 11; continue $sw2; }
                    r7 = null;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (r7 == null) { $pc2 = 14; continue $sw2; }
                    r11.j6(r6, r7);
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r4 = r4 + 1;
                    { $pc2 = 5; continue $sw2; }
                }
                case 14: {
                    if (r6 == 0) { $pc2 = 16; continue $sw2; }
                    r11.j6(r6, "");
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r7 = r5.j6("  ", r11.j6(), true);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    if (r3 >= r1) { $pc2 = 24; continue $sw2; }
                    r8 = (abcd.AbstractVn) DW(r3);
                    try {
                        r8.j6(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 21; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3 = r3 + 1;
                    $pc2 = 24; continue $sw2;
                }
                case 21: {
                    e = $ex2;
                    throw abcd.Vt.j6(e, "...while writing " + r8);
                }
                case 24: {
                    r12 = (r11.v5() - r0) / 2;
                    if (r12 != rN()) { $pc2 = 28; continue $sw2; }
                    return;
                }
                case 28: {
                    throw new java.lang.RuntimeException("write length mismatch; expected " + rN() + " but actually wrote " + r12);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int rN() {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = size();
                    if (r0 != 0) { $pc3 = 7; continue $sw3; }
                    return 0;
                }
                case 7: {
                    return get(r0 - 1).v5();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int yS() {
        return this.FH;
    }
}
