package abcd;

public final class Ps extends abcd.Xt implements abcd.Ss {
    public static final abcd.Ps BT = null;
    public static final abcd.Ps EQ = null;
    public static final abcd.Ps FH = null;
    public static final abcd.Ps Hw = null;
    public static final abcd.Ps J0 = null;
    public static final abcd.Ps J8 = null;
    public static final abcd.Ps KD = null;
    public static final abcd.Ps Mr = null;
    public static final abcd.Ps P8 = null;
    public static final abcd.Ps QX = null;
    public static final abcd.Ps SI = null;
    public static final abcd.Ps U2 = null;
    public static final abcd.Ps VH = null;
    public static final abcd.Ps Ws = null;
    public static final abcd.Ps XL = null;
    public static final abcd.Ps Zo = null;
    public static final abcd.Ps a8 = null;
    public static final abcd.Ps aM = null;
    public static final abcd.Ps cb = null;
    public static final abcd.Ps cn = null;
    public static final abcd.Ps ei = null;
    public static final abcd.Ps er = null;
    public static final abcd.Ps gW = null;
    public static final abcd.Ps gn = null;
    public static final abcd.Ps j3 = null;
    public static final abcd.Ps lg = null;
    public static final abcd.Ps nw = null;
    public static final abcd.Ps rN = null;
    public static final abcd.Ps ro = null;
    public static final abcd.Ps sh = null;
    public static final abcd.Ps tp = null;
    public static final abcd.Ps u7 = null;
    public static final abcd.Ps v5 = null;
    public static final abcd.Ps vy = null;
    public static final abcd.Ps we = null;
    public static final abcd.Ps yS = null;

    static {
        FH = new abcd.Ps(0);
        Hw = DW(abcd.Qs.VH);
        v5 = DW(abcd.Qs.gn);
        Zo = DW(abcd.Qs.Zo);
        VH = DW(abcd.Qs.v5);
        gn = DW(abcd.Qs.QX);
        u7 = DW(abcd.Qs.we);
        tp = DW(abcd.Qs.j3);
        abcd.Qs r0 = abcd.Qs.VH;
        EQ = j6(r0, r0);
        abcd.Qs r1 = abcd.Qs.gn;
        we = j6(r1, r1);
        abcd.Qs r2 = abcd.Qs.Zo;
        J0 = j6(r2, r2);
        abcd.Qs r3 = abcd.Qs.v5;
        J8 = j6(r3, r3);
        abcd.Qs r4 = abcd.Qs.QX;
        Ws = j6(r4, r4);
        QX = j6(abcd.Qs.VH, abcd.Qs.QX);
        XL = j6(abcd.Qs.gn, abcd.Qs.QX);
        aM = j6(abcd.Qs.Zo, abcd.Qs.QX);
        j3 = j6(abcd.Qs.v5, abcd.Qs.QX);
        Mr = j6(abcd.Qs.gn, abcd.Qs.VH);
        U2 = j6(abcd.Qs.KD, abcd.Qs.VH);
        a8 = j6(abcd.Qs.ro, abcd.Qs.VH);
        lg = j6(abcd.Qs.SI, abcd.Qs.VH);
        rN = j6(abcd.Qs.nw, abcd.Qs.VH);
        er = j6(abcd.Qs.cn, abcd.Qs.VH);
        yS = j6(abcd.Qs.vy, abcd.Qs.VH);
        gW = j6(abcd.Qs.P8, abcd.Qs.VH);
        BT = j6(abcd.Qs.ei, abcd.Qs.VH);
        vy = j6(abcd.Qs.sh, abcd.Qs.VH);
        P8 = j6(abcd.Qs.VH, abcd.Qs.KD, abcd.Qs.VH);
        ei = j6(abcd.Qs.gn, abcd.Qs.ro, abcd.Qs.VH);
        nw = j6(abcd.Qs.Zo, abcd.Qs.SI, abcd.Qs.VH);
        SI = j6(abcd.Qs.v5, abcd.Qs.nw, abcd.Qs.VH);
        KD = j6(abcd.Qs.QX, abcd.Qs.cn, abcd.Qs.VH);
        ro = j6(abcd.Qs.VH, abcd.Qs.vy, abcd.Qs.VH);
        cn = j6(abcd.Qs.VH, abcd.Qs.P8, abcd.Qs.VH);
        sh = j6(abcd.Qs.VH, abcd.Qs.ei, abcd.Qs.VH);
        cb = j6(abcd.Qs.VH, abcd.Qs.sh, abcd.Qs.VH);
    }

    public Ps(int r1) {
        super(r1);
    }

    public static abcd.Ps DW(abcd.Qs r2) {
        abcd.Ps r0 = new abcd.Ps(1);
        r0.j6(0, r2);
        return r0;
    }

    public static java.lang.String DW(abcd.Ss r4) {
        int r0 = 0;
        java.lang.StringBuffer r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4.size();
                    if (r0 != 0) { $pc0 = 6; continue $sw0; }
                    return "<empty>";
                }
                case 6: {
                    r1 = new java.lang.StringBuffer(100);
                    r2 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r2 >= r0) { $pc0 = 12; continue $sw0; }
                    if (r2 == 0) { $pc0 = 10; continue $sw0; }
                    r1.append(", ");
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r1.append(r4.getType(r2).aM());
                    r2 = r2 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 12: {
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(abcd.Ss r5, abcd.Ss r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r5.size();
                    if (r6.size() == r0) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r1 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r1 >= r0) { $pc1 = 11; continue $sw1; }
                    if (r5.getType(r1).equals(r6.getType(r1)) == false) { $pc1 = 9; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 9: {
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(abcd.Ss r4) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r4.size();
                    r1 = 0;
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r1 >= r0) { $pc2 = 5; continue $sw2; }
                    r2 = (r2 * 31) + r4.getType(r1).hashCode();
                    r1 = r1 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(abcd.Ss r7, abcd.Ss r8) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r7.size();
                    r1 = r8.size();
                    r2 = java.lang.Math.min(r0, r1);
                    r4 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r4 >= r2) { $pc3 = 8; continue $sw3; }
                    r5 = r7.getType(r4).j6(r8.getType(r4));
                    if (r5 != 0) { $pc3 = 6; continue $sw3; }
                    r4 = r4 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 6: {
                    return r5;
                }
                case 8: {
                    if (r0 != r1) { $pc3 = 10; continue $sw3; }
                    return 0;
                }
                case 10: {
                    if (r0 >= r1) { $pc3 = 13; continue $sw3; }
                    return -1;
                }
                case 13: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Ps j6(abcd.Qs r2, abcd.Qs r3) {
        abcd.Ps r0 = new abcd.Ps(2);
        r0.j6(0, r2);
        r0.j6(1, r3);
        return r0;
    }

    public static abcd.Ps j6(abcd.Qs r2, abcd.Qs r3, abcd.Qs r4) {
        abcd.Ps r0 = new abcd.Ps(3);
        r0.j6(0, r2);
        r0.j6(1, r3);
        r0.j6(2, r4);
        return r0;
    }

    public static abcd.Ps j6(abcd.Qs r2, abcd.Qs r3, abcd.Qs r4, abcd.Qs r5) {
        abcd.Ps r0 = new abcd.Ps(4);
        r0.j6(0, r2);
        r0.j6(1, r3);
        r0.j6(2, r4);
        r0.j6(3, r5);
        return r0;
    }

    public abcd.Ps FH(abcd.Qs r4) {
        int r0 = 0;
        abcd.Ps r1 = null;
        int r2 = 0;
        int r5 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = size();
                    r1 = new abcd.Ps(r0 + 1);
                    r2 = 0;
                    r1.j6(0, r4);
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r2 >= r0) { $pc4 = 5; continue $sw4; }
                    r5 = r2 + 1;
                    r1.j6(r5, FH(r2));
                    r2 = r5;
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qs get(int r1) {
        return (abcd.Qs) DW(r1);
    }

    @Override
    public abcd.Qs getType(int r1) {
        return get(r1);
    }

    @Override
    public abcd.Ss j6(abcd.Qs r5) {
        int r0 = 0;
        abcd.Ps r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = size();
                    r1 = new abcd.Ps(r0 + 1);
                    r2 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r2 >= r0) { $pc5 = 5; continue $sw5; }
                    r1.j6(r2, DW(r2));
                    r2 = r2 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 5: {
                    r1.j6(r0, r5);
                    r1.we();
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r1, abcd.Qs r2) {
        j6(r1, r2);
    }

    public int rN() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    r2 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r1 >= r0) { $pc6 = 5; continue $sw6; }
                    r2 = r2 + get(r1).Zo();
                    r1 = r1 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
