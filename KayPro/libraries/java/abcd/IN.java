package abcd;

public class IN {
    public static final abcd.zL BT = null;
    public static final abcd.zL DW = null;
    public static final abcd.zL EQ = null;
    public static final abcd.zL FH = null;
    public static final abcd.zL Hw = null;
    public static final abcd.zL J0 = null;
    public static final abcd.zL J8 = null;
    public static final abcd.zL Mr = null;
    public static final abcd.zL P8 = null;
    public static final abcd.zL QX = null;
    public static final abcd.zL U2 = null;
    public static final abcd.zL VH = null;
    public static final abcd.zL Ws = null;
    public static final abcd.zL XL = null;
    public static final abcd.zL Zo = null;
    public static final abcd.zL a8 = null;
    public static final abcd.zL aM = null;
    public static final abcd.zL ei = null;
    public static final abcd.zL er = null;
    public static final abcd.zL gW = null;
    public static final abcd.zL gn = null;
    public static final abcd.zL j3 = null;
    public static final abcd.zL j6 = null;
    public static final abcd.zL lg = null;
    public static final abcd.zL rN = null;
    public static final abcd.zL tp = null;
    public static final abcd.zL u7 = null;
    public static final abcd.zL v5 = null;
    public static final abcd.zL vy = null;
    public static final abcd.zL we = null;
    public static final abcd.zL yS = null;
    abcd.AL SI;
    boolean nw;

    static {
        j6 = new abcd.zL("2.5.29.9");
        DW = new abcd.zL("2.5.29.14");
        FH = new abcd.zL("2.5.29.15");
        Hw = new abcd.zL("2.5.29.16");
        v5 = new abcd.zL("2.5.29.17");
        Zo = new abcd.zL("2.5.29.18");
        VH = new abcd.zL("2.5.29.19");
        gn = new abcd.zL("2.5.29.20");
        u7 = new abcd.zL("2.5.29.21");
        tp = new abcd.zL("2.5.29.23");
        EQ = new abcd.zL("2.5.29.24");
        we = new abcd.zL("2.5.29.27");
        J0 = new abcd.zL("2.5.29.28");
        J8 = new abcd.zL("2.5.29.29");
        Ws = new abcd.zL("2.5.29.30");
        QX = new abcd.zL("2.5.29.31");
        XL = new abcd.zL("2.5.29.32");
        aM = new abcd.zL("2.5.29.33");
        j3 = new abcd.zL("2.5.29.35");
        Mr = new abcd.zL("2.5.29.36");
        U2 = new abcd.zL("2.5.29.37");
        a8 = new abcd.zL("2.5.29.46");
        lg = new abcd.zL("2.5.29.54");
        rN = new abcd.zL("1.3.6.1.5.5.7.1.1");
        er = new abcd.zL("1.3.6.1.5.5.7.1.11");
        yS = new abcd.zL("1.3.6.1.5.5.7.1.12");
        gW = new abcd.zL("1.3.6.1.5.5.7.1.2");
        BT = new abcd.zL("1.3.6.1.5.5.7.1.3");
        vy = new abcd.zL("1.3.6.1.5.5.7.1.4");
        P8 = new abcd.zL("2.5.29.56");
        ei = new abcd.zL("2.5.29.55");
    }

    public IN(abcd.dM r1, abcd.AL r2) {
        this.nw = r1.u7();
        this.SI = r2;
    }

    public IN(boolean r1, abcd.AL r2) {
        this.nw = r1;
        this.SI = r2;
    }

    public static abcd.EL j6(abcd.IN r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return abcd.EL.j6(r3.j6().u7());
                }
                case 4: {
                    e = $ex0;
                    throw new java.lang.IllegalArgumentException("can't convert extension: " + e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        return this.nw;
    }

    public boolean equals(java.lang.Object r4) {
        abcd.IN r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r4 instanceof abcd.IN) == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.IN) r4;
                    if (r5.j6().equals(j6()) == true) { $pc1 = 8; continue $sw1; }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    return false;
                }
                case 8: {
                    if (r5.DW() != DW()) { $pc1 = 11; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (DW() == false) { $pc2 = 7; continue $sw2; }
                    return j6().hashCode();
                }
                case 7: {
                    return j6().hashCode() ^ (-1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AL j6() {
        return this.SI;
    }
}
