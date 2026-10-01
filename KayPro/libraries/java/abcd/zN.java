package abcd;

public class zN {
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
    abcd.AL KD;
    boolean SI;
    private abcd.zL nw;

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

    public zN(abcd.zL r1, abcd.oL r2, abcd.AL r3) {
        this(r1, r2.u7(), r3);
    }

    public zN(abcd.zL r1, boolean r2, abcd.AL r3) {
        this.nw = r1;
        this.SI = r2;
        this.KD = r3;
    }

    public boolean DW() {
        return this.SI;
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.zN) == true) goto L5;
        return false;
    L5:
        abcd.zN r5 = (abcd.zN) r4;
        if (r5.j6().equals(j6()) == true) goto L8;
    L11:
        return false;
    L8:
        if (r5.DW() != DW()) goto L11;
        return true;
    }

    public int hashCode() {
        if (DW() == false) goto L7;
        return j6().hashCode();
    L7:
        return j6().hashCode() ^ (-1);
    }

    public abcd.AL j6() {
        return this.KD;
    }
}
