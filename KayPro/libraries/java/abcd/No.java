package abcd;

public final class No extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.No();
    }

    private No() {
    }

    private static abcd.cs Hw(abcd.cs r7) {
        int r0 = 0;
        int r1 = 0;
        abcd.cs r2 = null;
        int r3 = 0;
        int r4 = 0;
        abcd.bs r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = v5(r7);
                    r1 = r7.size();
                    if (r0 != r1) { $pc0 = 5; continue $sw0; }
                    return r7;
                }
                case 5: {
                    r2 = new abcd.cs(r0);
                    r3 = 0;
                    r4 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r3 >= r1) { $pc0 = 12; continue $sw0; }
                    r5 = r7.get(r3);
                    r2.j6(r4, r5);
                    if (r5.Hw() != 2) { $pc0 = 10; continue $sw0; }
                    r2.j6(r4 + 1, abcd.bs.j6(r5.we() + 1, abcd.Qs.tp));
                    r4 = r4 + 2;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r3 = r3 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 10: {
                    r4 = r4 + 1;
                    { $pc0 = 11; continue $sw0; }
                }
                case 12: {
                    r2.we();
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int v5(abcd.cs r7) {
        int r0 = 0;
        int r3 = 0;
        int r4 = 0;
        abcd.bs r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r7.size();
                    if (r0 <= 5) { $pc1 = 5; continue $sw1; }
                    return -1;
                }
                case 5: {
                    r3 = 0;
                    r4 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r3 >= r0) { $pc1 = 11; continue $sw1; }
                    r5 = r7.get(r3);
                    r4 = r4 + r5.Hw();
                    if (abcd.Abstractao.v5((r5.we() + r5.Hw()) - 1) == false) { $pc1 = 9; continue $sw1; }
                    r3 = r3 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 9: {
                    return -1;
                }
                case 11: {
                    if (r4 <= 5) { $pc1 = 13; continue $sw1; }
                    return -1;
                }
                case 13: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r6) {
        abcd.cs r7 = null;
        int r0 = 0;
        java.util.BitSet r1 = null;
        int r2 = 0;
        abcd.bs r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r7 = r6.gn();
                    r0 = r7.size();
                    r1 = new java.util.BitSet(r0);
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r0) { $pc2 = 5; continue $sw2; }
                    r3 = r7.get(r2);
                    r1.set(r2, abcd.Abstractao.v5((r3.we() + r3.Hw()) - 1));
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean VH(abcd.AbstractVn r4) {
        abcd.Tn r5 = null;
        abcd.Abstractms r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r4 instanceof abcd.Tn) == true) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.Tn) r4;
                    if (abcd.Abstractao.Zo(r5.J0()) == true) { $pc3 = 8; continue $sw3; }
                    return false;
                }
                case 8: {
                    r0 = r5.we();
                    if ((r0 instanceof abcd.Gs) == true) { $pc3 = 14; continue $sw3; }
                    if ((r0 instanceof abcd.Ks) == true) { $pc3 = 14; continue $sw3; }
                    return false;
                }
                case 14: {
                    if (v5(r5.gn()) < 0) { $pc3 = 17; continue $sw3; }
                    return true;
                }
                case 17: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r3) {
        return abcd.Abstractao.DW(Hw(r3.gn())) + ", " + abcd.Abstractao.v5(r3);
    }

    @Override
    public int j6() {
        return 3;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r2 == true) { $pc4 = 4; continue $sw4; }
                    return "";
                }
                case 4: {
                    return abcd.Abstractao.Hw(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Lt r10, abcd.AbstractVn r11) {
        int r0 = 0;
        abcd.cs r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = ((abcd.Tn) r11).J0();
                    r1 = Hw(r11.gn());
                    r2 = r1.size();
                    r3 = 0;
                    if (r2 <= 0) { $pc5 = 5; continue $sw5; }
                    r4 = r1.get(0).we();
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (r2 <= 1) { $pc5 = 9; continue $sw5; }
                    r5 = r1.get(1).we();
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    if (r2 <= 2) { $pc5 = 13; continue $sw5; }
                    r6 = r1.get(2).we();
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    if (r2 <= 3) { $pc5 = 17; continue $sw5; }
                    r7 = r1.get(3).we();
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    if (r2 <= 4) { $pc5 = 21; continue $sw5; }
                    r3 = r1.get(4).we();
                    $pc5 = 21; continue $sw5;
                }
                case 21: {
                    abcd.Abstractao.j6(r10, abcd.Abstractao.j6(r11, abcd.Abstractao.DW(r3, r2)), (short) r0, abcd.Abstractao.j6(r4, r5, r6, r7));
                    return;
                }
                case 17: {
                    r7 = 0;
                    { $pc5 = 19; continue $sw5; }
                }
                case 13: {
                    r6 = 0;
                    { $pc5 = 15; continue $sw5; }
                }
                case 9: {
                    r5 = 0;
                    { $pc5 = 11; continue $sw5; }
                }
                case 5: {
                    r4 = 0;
                    { $pc5 = 7; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
