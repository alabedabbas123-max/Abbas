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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 11; continue $sw0; }
                    if (r2 == abcd.Qs.EQ) { $pc0 = 9; continue $sw0; }
                    this.Mr = r2;
                    this.U2 = null;
                    return;
                }
                case 9: {
                    throw new java.lang.UnsupportedOperationException("KNOWN_NULL is not representable");
                }
                case 11: {
                    throw new java.lang.NullPointerException("type == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Ks DW(abcd.Qs r3) {
        synchronized (j6) {
            java.util.HashMap<abcd.Qs, abcd.Ks> r0 = null;
            abcd.Ks r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = j6;
                        try {
                            r1 = j6.get(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 9; continue $sw1;
                        }
                        if (r1 != null) { $pc1 = 7; continue $sw1; }
                        try {
                            r1 = new abcd.Ks(r3);
                            j6.put(r3, r1);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 9; continue $sw1;
                        }
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 9; continue $sw1;
                        }
                        return r1;
                    }
                    case 9: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static abcd.Ks j6(abcd.Qs r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    switch(r3.j3()) {
                        case 0: { $pc2 = 23; continue $sw2; }
                        case 1: { $pc2 = 21; continue $sw2; }
                        case 2: { $pc2 = 19; continue $sw2; }
                        case 3: { $pc2 = 17; continue $sw2; }
                        case 4: { $pc2 = 15; continue $sw2; }
                        case 5: { $pc2 = 13; continue $sw2; }
                        case 6: { $pc2 = 11; continue $sw2; }
                        case 7: { $pc2 = 9; continue $sw2; }
                        case 8: { $pc2 = 7; continue $sw2; }
                        default: { $pc2 = 5; continue $sw2; }
                    };
                }
                case 5: {
                    throw new java.lang.IllegalArgumentException("not primitive: " + r3);
                }
                case 7: {
                    return tp;
                }
                case 9: {
                    return gn;
                }
                case 11: {
                    return u7;
                }
                case 13: {
                    return VH;
                }
                case 15: {
                    return Zo;
                }
                case 17: {
                    return v5;
                }
                case 19: {
                    return Hw;
                }
                case 21: {
                    return FH;
                }
                case 23: {
                    return EQ;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r3 instanceof abcd.Ks) == true) { $pc3 = 6; continue $sw3; }
                    return false;
                }
                case 6: {
                    if (this.Mr != ((abcd.Ks) r3).Mr) { $pc3 = 9; continue $sw3; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.U2 != null) { $pc4 = 6; continue $sw4; }
                    this.U2 = new abcd.Js(this.Mr.J8());
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return this.U2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
