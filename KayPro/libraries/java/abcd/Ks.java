package abcd;

public final class Ks extends abcd.Ms {
    public static final abcd.Ks DW = null;
    public static final abcd.Ks EQ = null;
    public static final abcd.Ks FH = null;
    public static final abcd.Ks Hw = null;
    public static final abcd.Ks J0 = null;
    public static final abcd.Ks J8 = null;
    public static final abcd.Ks QX = null;
    public static final abcd.Ks VH = null;
    public static final abcd.Ks Ws = null;
    public static final abcd.Ks XL = null;
    public static final abcd.Ks Zo = null;
    public static final abcd.Ks aM = null;
    public static final abcd.Ks gn = null;
    public static final abcd.Ks j3 = null;
    private static final java.util.HashMap<abcd.Qs, abcd.Ks> j6 = null;
    public static final abcd.Ks tp = null;
    public static final abcd.Ks u7 = null;
    public static final abcd.Ks v5 = null;
    public static final abcd.Ks we = null;
    private final abcd.Qs Mr;
    private abcd.Js U2;

    static {
        j6 = new java.util.HashMap(100);
        DW = DW(abcd.Qs.QX);
        FH = DW(abcd.Qs.Mr);
        Hw = DW(abcd.Qs.U2);
        v5 = DW(abcd.Qs.a8);
        Zo = DW(abcd.Qs.lg);
        VH = DW(abcd.Qs.rN);
        gn = DW(abcd.Qs.yS);
        u7 = DW(abcd.Qs.er);
        tp = DW(abcd.Qs.gW);
        EQ = DW(abcd.Qs.BT);
        we = DW(abcd.Qs.vy);
        J0 = DW(abcd.Qs.P8);
        J8 = DW(abcd.Qs.ei);
        Ws = DW(abcd.Qs.nw);
        QX = DW(abcd.Qs.SI);
        XL = DW(abcd.Qs.ro);
        aM = DW(abcd.Qs.KD);
        j3 = DW(abcd.Qs.sh);
    }

    public Ks(abcd.Qs r2) {
        if (r2 == null) goto L11;
        if (r2 == abcd.Qs.EQ) goto L9;
        this.Mr = r2;
        this.U2 = null;
        return;
    L9:
        throw new java.lang.UnsupportedOperationException("KNOWN_NULL is not representable");
    L11:
        throw new java.lang.NullPointerException("type == null");
    }

    public static abcd.Ks DW(abcd.Qs r3) {
        java.util.HashMap<abcd.Qs, abcd.Ks> r0 = j6;
        monitor-enter(r0);
        abcd.Ks r1 = j6.get(r3);     // Catch: java.lang.Throwable -> L9
        if (r1 != null) goto L7;
        r1 = new abcd.Ks(r3);     // Catch: java.lang.Throwable -> L9
        j6.put(r3, r1);     // Catch: java.lang.Throwable -> L9
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L9
        return r1;
    L9:
        th = move-exception;
        throw th;
    }

    public static abcd.Ks j6(abcd.Qs r3) {
        switch(r3.j3()) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L17;
            case 4: goto L15;
            case 5: goto L13;
            case 6: goto L11;
            case 7: goto L9;
            case 8: goto L7;
            default: goto L5;
        };
    L5:
        throw new java.lang.IllegalArgumentException("not primitive: " + r3);
    L7:
        return tp;
    L9:
        return gn;
    L11:
        return u7;
    L13:
        return VH;
    L15:
        return Zo;
    L17:
        return v5;
    L19:
        return Hw;
    L21:
        return FH;
    L23:
        return EQ;
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        return this.Mr.J8().compareTo(((abcd.Ks) r2).Mr.J8());
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public abcd.Qs VH() {
        return this.Mr;
    }

    @Override
    public java.lang.String Zo() {
        return "type";
    }

    @Override
    public java.lang.String aM() {
        return this.Mr.aM();
    }

    public boolean equals(java.lang.Object r3) {
        if ((r3 instanceof abcd.Ks) == true) goto L6;
        return false;
    L6:
        if (this.Mr != ((abcd.Ks) r3).Mr) goto L9;
        return true;
    L9:
        return false;
    }

    @Override
    public abcd.Qs getType() {
        return abcd.Qs.J8;
    }

    public int hashCode() {
        return this.Mr.hashCode();
    }

    public java.lang.String toString() {
        return "type{" + aM() + '}';
    }

    public abcd.Js we() {
        if (this.U2 != null) goto L6;
        this.U2 = new abcd.Js(this.Mr.J8());
    L6:
        return this.U2;
    }
}
