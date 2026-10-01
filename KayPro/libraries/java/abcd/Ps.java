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
        int r0 = r4.size();
        if (r0 != 0) goto L6;
        return "<empty>";
    L6:
        java.lang.StringBuffer r1 = new java.lang.StringBuffer(100);
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L12;
        if (r2 == 0) goto L10;
        r1.append(", ");
    L10:
        r1.append(r4.getType(r2).aM());
        r2 = r2 + 1;
        goto L7
    L12:
        return r1.toString();
    }

    public static boolean DW(abcd.Ss r5, abcd.Ss r6) {
        int r0 = r5.size();
        if (r6.size() == r0) goto L5;
        return false;
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L11;
        if (r5.getType(r1).equals(r6.getType(r1)) == false) goto L9;
        r1 = r1 + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    }

    public static int j6(abcd.Ss r4) {
        int r0 = r4.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r2 = (r2 * 31) + r4.getType(r1).hashCode();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public static int j6(abcd.Ss r7, abcd.Ss r8) {
        int r0 = r7.size();
        int r1 = r8.size();
        int r2 = java.lang.Math.min(r0, r1);
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L8;
        int r5 = r7.getType(r4).j6(r8.getType(r4));
        if (r5 != 0) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        return r5;
    L8:
        if (r0 != r1) goto L10;
        return 0;
    L10:
        if (r0 >= r1) goto L13;
        return -1;
    L13:
        return 1;
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
        int r0 = size();
        abcd.Ps r1 = new abcd.Ps(r0 + 1);
        int r2 = 0;
        r1.j6(0, r4);
    L3:
        if (r2 >= r0) goto L5;
        int r5 = r2 + 1;
        r1.j6(r5, FH(r2));
        r2 = r5;
        goto L3
    L5:
        return r1;
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
        int r0 = size();
        abcd.Ps r1 = new abcd.Ps(r0 + 1);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1.j6(r2, DW(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        r1.j6(r0, r5);
        r1.we();
        return r1;
    }

    public void j6(int r1, abcd.Qs r2) {
        j6(r1, r2);
    }

    public int rN() {
        int r0 = size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r2 = r2 + get(r1).Zo();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }
}
