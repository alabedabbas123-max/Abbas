package abcd;

public final class Qs implements abcd.Rs, java.lang.Comparable<abcd.Qs> {
    public static final abcd.Qs BT = null;
    public static final abcd.Qs DW = null;
    public static final abcd.Qs EQ = null;
    public static final abcd.Qs FH = null;
    public static final abcd.Qs Hw = null;
    public static final abcd.Qs J0 = null;
    public static final abcd.Qs J8 = null;
    public static final abcd.Qs KD = null;
    public static final abcd.Qs Mr = null;
    public static final abcd.Qs P8 = null;
    public static final abcd.Qs QX = null;
    public static final abcd.Qs SI = null;
    public static final abcd.Qs U2 = null;
    public static final abcd.Qs VH = null;
    public static final abcd.Qs Ws = null;
    public static final abcd.Qs XL = null;
    public static final abcd.Qs Zo = null;
    public static final abcd.Qs a8 = null;
    public static final abcd.Qs aM = null;
    public static final abcd.Qs cn = null;
    public static final abcd.Qs ei = null;
    public static final abcd.Qs er = null;
    public static final abcd.Qs gW = null;
    public static final abcd.Qs gn = null;
    public static final abcd.Qs j3 = null;
    private static final java.util.HashMap<java.lang.String, abcd.Qs> j6 = null;
    public static final abcd.Qs lg = null;
    public static final abcd.Qs nw = null;
    public static final abcd.Qs rN = null;
    public static final abcd.Qs ro = null;
    public static final abcd.Qs sh = null;
    public static final abcd.Qs tp = null;
    public static final abcd.Qs u7 = null;
    public static final abcd.Qs v5 = null;
    public static final abcd.Qs vy = null;
    public static final abcd.Qs we = null;
    public static final abcd.Qs yS = null;
    private abcd.Qs Sf;
    private final java.lang.String cb;
    private final int dx;
    private java.lang.String ef;
    private abcd.Qs g3;
    private final int sG;
    private abcd.Qs vJ;

    static {
        j6 = new java.util.HashMap(500);
        DW = new abcd.Qs("Z", 1);
        FH = new abcd.Qs("B", 2);
        Hw = new abcd.Qs("C", 3);
        v5 = new abcd.Qs("D", 4);
        Zo = new abcd.Qs("F", 5);
        VH = new abcd.Qs("I", 6);
        gn = new abcd.Qs("J", 7);
        u7 = new abcd.Qs("S", 8);
        tp = new abcd.Qs("V", 0);
        EQ = new abcd.Qs("<null>", 9);
        we = new abcd.Qs("<addr>", 10);
        DW(DW);
        DW(FH);
        DW(Hw);
        DW(v5);
        DW(Zo);
        DW(VH);
        DW(gn);
        DW(u7);
        J0 = j6("Ljava/lang/annotation/Annotation;");
        J8 = j6("Ljava/lang/Class;");
        Ws = j6("Ljava/lang/Cloneable;");
        QX = j6("Ljava/lang/Object;");
        XL = j6("Ljava/io/Serializable;");
        aM = j6("Ljava/lang/String;");
        j3 = j6("Ljava/lang/Throwable;");
        Mr = j6("Ljava/lang/Boolean;");
        U2 = j6("Ljava/lang/Byte;");
        a8 = j6("Ljava/lang/Character;");
        lg = j6("Ljava/lang/Double;");
        rN = j6("Ljava/lang/Float;");
        er = j6("Ljava/lang/Integer;");
        yS = j6("Ljava/lang/Long;");
        gW = j6("Ljava/lang/Short;");
        BT = j6("Ljava/lang/Void;");
        vy = DW.Hw();
        P8 = FH.Hw();
        ei = Hw.Hw();
        nw = v5.Hw();
        SI = Zo.Hw();
        KD = VH.Hw();
        ro = gn.Hw();
        cn = QX.Hw();
        sh = u7.Hw();
    }

    private Qs(java.lang.String r2, int r3) {
        this(r2, r3, -1);
    }

    private Qs(java.lang.String r2, int r3, int r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 16; continue $sw0; }
                    if (r3 < 0) { $pc0 = 14; continue $sw0; }
                    if (r3 >= 11) { $pc0 = 14; continue $sw0; }
                    if (r4 < (-1)) { $pc0 = 12; continue $sw0; }
                    this.cb = r2;
                    this.dx = r3;
                    this.sG = r4;
                    this.Sf = null;
                    this.vJ = null;
                    this.g3 = null;
                    return;
                }
                case 12: {
                    throw new java.lang.IllegalArgumentException("newAt < -1");
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("bad basicType");
                }
                case 16: {
                    throw new java.lang.NullPointerException("descriptor == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.Qs DW(abcd.Qs r3) {
        synchronized (j6) {
            java.util.HashMap<java.lang.String, abcd.Qs> r0 = null;
            java.lang.String r1 = null;
            abcd.Qs r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = j6;
                        try {
                            r1 = r3.J8();
                            r2 = j6.get(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        if (r2 == null) { $pc1 = 8; continue $sw1; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        return r2;
                    }
                    case 8: {
                        try {
                            j6.put(r1, r3);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        return r3;
                    }
                    case 11: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static abcd.Qs DW(java.lang.String r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 10; continue $sw2; }
                    if (r2.startsWith("[") == false) { $pc2 = 8; continue $sw2; }
                    return j6(r2);
                }
                case 8: {
                    return j6('L' + r2 + ';');
                }
                case 10: {
                    throw new java.lang.NullPointerException("name == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Qs FH(java.lang.String r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1.equals("V") == false) { $pc3 = 7; continue $sw3; }
                    return tp;
                }
                case 7: {
                    return j6(r1);
                }
                case 9: {
                    throw new java.lang.NullPointerException("descriptor == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Qs j6(java.lang.String r7) {
        synchronized (j6) {
            java.util.HashMap<java.lang.String, abcd.Qs> r0 = null;
            abcd.Qs r1 = null;
            char r2 = 0;
            int r3 = 0;
            int r4 = 0;
            int r5 = 0;
            char r6 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = j6;
                        try {
                            r1 = j6.get(r7);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 48; continue $sw4;
                        }
                        if (r1 == null) { $pc4 = 55; continue $sw4; }
                        return r1;
                    }
                    case 55: {
                        try {
                            r2 = r7.charAt(0);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            if ($t instanceof java.lang.NullPointerException) { $pc4 = 44; continue $sw4; }
                            if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc4 = 46; continue $sw4; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        if (r2 == '[') { $pc4 = 13; continue $sw4; }
                        r3 = r7.length();
                        if (r2 != 'L') { $pc4 = 43; continue $sw4; }
                        r4 = r3 - 1;
                        if (r7.charAt(r4) != ';') { $pc4 = 43; continue $sw4; }
                        r5 = 1;
                        $pc4 = 19; continue $sw4;
                    }
                    case 19: {
                        if (r5 >= r4) { $pc4 = 41; continue $sw4; }
                        r6 = r7.charAt(r5);
                        if (r6 == '(') { $pc4 = 39; continue $sw4; }
                        if (r6 == ')') { $pc4 = 39; continue $sw4; }
                        if (r6 == '.') { $pc4 = 39; continue $sw4; }
                        if (r6 == '/') { $pc4 = 31; continue $sw4; }
                        if (r6 == ';') { $pc4 = 39; continue $sw4; }
                        if (r6 == '[') { $pc4 = 39; continue $sw4; }
                        $pc4 = 35; continue $sw4;
                    }
                    case 35: {
                        r5 = r5 + 1;
                        { $pc4 = 19; continue $sw4; }
                    }
                    case 31: {
                        if (r5 == 1) { $pc4 = 37; continue $sw4; }
                        if (r5 == r4) { $pc4 = 37; continue $sw4; }
                        if (r7.charAt(r5 - 1) != '/') { $pc4 = 35; continue $sw4; }
                        $pc4 = 37; continue $sw4;
                    }
                    case 37: {
                        throw new java.lang.IllegalArgumentException("bad descriptor: " + r7);
                    }
                    case 39: {
                        throw new java.lang.IllegalArgumentException("bad descriptor: " + r7);
                    }
                    case 41: {
                        return DW(new abcd.Qs(r7, 9));
                    }
                    case 43: {
                        throw new java.lang.IllegalArgumentException("bad descriptor: " + r7);
                    }
                    case 13: {
                        return j6(r7.substring(1)).Hw();
                    }
                    case 47: {
                        throw new java.lang.IllegalArgumentException("descriptor is empty");
                    }
                    case 45: {
                        throw new java.lang.NullPointerException("descriptor == null");
                    }
                    case 48: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 44: {
                        throw new java.lang.IllegalStateException();
                    }
                    case 46: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public boolean BT() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    switch(this.dx) {
                        case 0: { $pc5 = 6; continue $sw5; }
                        case 1: { $pc5 = 6; continue $sw5; }
                        case 2: { $pc5 = 6; continue $sw5; }
                        case 3: { $pc5 = 6; continue $sw5; }
                        case 4: { $pc5 = 6; continue $sw5; }
                        case 5: { $pc5 = 6; continue $sw5; }
                        case 6: { $pc5 = 6; continue $sw5; }
                        case 7: { $pc5 = 6; continue $sw5; }
                        case 8: { $pc5 = 6; continue $sw5; }
                        default: { $pc5 = 4; continue $sw5; }
                    };
                }
                case 4: {
                    return false;
                }
                case 6: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qs Hw() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.Sf != null) { $pc6 = 6; continue $sw6; }
                    this.Sf = DW(new abcd.Qs('[' + this.cb, 9));
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return this.Sf;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String J8() {
        return this.cb;
    }

    @Override
    public int Mr() {
        int r0 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.dx;
                    if (r0 != 1) { $pc7 = 5; continue $sw7; }
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    return 6;
                }
                case 5: {
                    if (r0 == 2) { $pc7 = 12; continue $sw7; }
                    if (r0 == 3) { $pc7 = 12; continue $sw7; }
                    if (r0 == 6) { $pc7 = 12; continue $sw7; }
                    if (r0 == 8) { $pc7 = 12; continue $sw7; }
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean P8() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.sG < 0) { $pc8 = 5; continue $sw8; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Qs U2() {
        int r0 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.dx;
                    if (r0 == 1) { $pc9 = 14; continue $sw9; }
                    if (r0 == 2) { $pc9 = 14; continue $sw9; }
                    if (r0 == 3) { $pc9 = 14; continue $sw9; }
                    if (r0 == 6) { $pc9 = 14; continue $sw9; }
                    if (r0 == 8) { $pc9 = 14; continue $sw9; }
                    return this;
                }
                case 14: {
                    return VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Rs U2() {
        return U2();
    }

    public java.lang.String VH() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.ef != null) { $pc10 = 13; continue $sw10; }
                    if (vy() == false) { $pc10 = 11; continue $sw10; }
                    if (this.cb.charAt(0) != '[') { $pc10 = 9; continue $sw10; }
                    this.ef = this.cb;
                    { $pc10 = 13; continue $sw10; }
                }
                case 9: {
                    r0 = this.cb;
                    this.ef = r0.substring(1, r0.length() - 1);
                    { $pc10 = 13; continue $sw10; }
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("not an object type: " + this.cb);
                }
                case 13: {
                    return this.ef;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qs Ws() {
        abcd.Qs r0 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.g3;
                    if (r0 == null) { $pc11 = 6; continue $sw11; }
                    return r0;
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException("initialized type: " + this.cb);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Zo() {
        int r0 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.dx;
                    if (r0 != 4) { $pc12 = 5; continue $sw12; }
                    return 2;
                }
                case 5: {
                    if (r0 == 7) { $pc12 = 10; continue $sw12; }
                    return 1;
                }
                case 10: {
                    return 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean a8() {
        return false;
    }

    @Override
    public java.lang.String aM() {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    switch(this.dx) {
                        case 0: { $pc13 = 28; continue $sw13; }
                        case 1: { $pc13 = 26; continue $sw13; }
                        case 2: { $pc13 = 24; continue $sw13; }
                        case 3: { $pc13 = 22; continue $sw13; }
                        case 4: { $pc13 = 20; continue $sw13; }
                        case 5: { $pc13 = 18; continue $sw13; }
                        case 6: { $pc13 = 16; continue $sw13; }
                        case 7: { $pc13 = 14; continue $sw13; }
                        case 8: { $pc13 = 12; continue $sw13; }
                        case 9: { $pc13 = 7; continue $sw13; }
                        default: { $pc13 = 5; continue $sw13; }
                    };
                }
                case 12: {
                    return "short";
                }
                case 14: {
                    return "long";
                }
                case 16: {
                    return "int";
                }
                case 18: {
                    return "float";
                }
                case 20: {
                    return "double";
                }
                case 22: {
                    return "char";
                }
                case 24: {
                    return "byte";
                }
                case 26: {
                    return "boolean";
                }
                case 28: {
                    return "void";
                }
                case 5: {
                    return this.cb;
                }
                case 7: {
                    if (lg() == false) { $pc13 = 11; continue $sw13; }
                    return we().aM() + "[]";
                }
                case 11: {
                    return VH().replace("/", ".");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int compareTo(abcd.Qs r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this != r2) { $pc14 = 6; continue $sw14; }
                    return true;
                }
                case 6: {
                    if ((r2 instanceof abcd.Qs) == true) { $pc14 = 10; continue $sw14; }
                    return false;
                }
                case 10: {
                    return this.cb.equals(((abcd.Qs) r2).cb);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean er() {
        int r0 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.dx;
                    if (r0 != 4) { $pc15 = 5; continue $sw15; }
                    return false;
                }
                case 5: {
                    if (r0 == 7) { $pc15 = 10; continue $sw15; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean gW() {
        int r0 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.dx;
                    if (r0 != 1) { $pc16 = 5; continue $sw16; }
                    $pc16 = 14; continue $sw16;
                }
                case 14: {
                    return true;
                }
                case 5: {
                    if (r0 == 2) { $pc16 = 14; continue $sw16; }
                    if (r0 == 3) { $pc16 = 14; continue $sw16; }
                    if (r0 == 6) { $pc16 = 14; continue $sw16; }
                    if (r0 == 8) { $pc16 = 14; continue $sw16; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Qs getType() {
        return this;
    }

    public int hashCode() {
        return this.cb.hashCode();
    }

    @Override
    public int j3() {
        return this.dx;
    }

    public int j6(abcd.Qs r2) {
        return this.cb.compareTo(r2.cb);
    }

    public abcd.Qs j6(int r4) {
        abcd.Qs r1 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (r4 < 0) { $pc17 = 14; continue $sw17; }
                    if (vy() == false) { $pc17 = 12; continue $sw17; }
                    if (P8() == true) { $pc17 = 10; continue $sw17; }
                    r1 = new abcd.Qs('N' + abcd.Yt.v5(r4) + this.cb, 9, r4);
                    r1.g3 = this;
                    return DW(r1);
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("already uninitialized: " + this.cb);
                }
                case 12: {
                    throw new java.lang.IllegalArgumentException("not a reference type: " + this.cb);
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("newAt < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean lg() {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.cb.charAt(0) != '[') { $pc18 = 6; continue $sw18; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean rN() {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (lg() == false) { $pc19 = 5; continue $sw19; }
                    $pc19 = 8; continue $sw19;
                }
                case 8: {
                    return true;
                }
                case 5: {
                    if (equals(EQ) == true) { $pc19 = 8; continue $sw19; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return this.cb;
    }

    public boolean vy() {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (this.dx != 9) { $pc20 = 5; continue $sw20; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qs we() {
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (this.vJ != null) { $pc21 = 10; continue $sw21; }
                    if (this.cb.charAt(0) != '[') { $pc21 = 8; continue $sw21; }
                    this.vJ = j6(this.cb.substring(1));
                    { $pc21 = 10; continue $sw21; }
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("not an array type: " + this.cb);
                }
                case 10: {
                    return this.vJ;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean yS() {
        int r0 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = this.dx;
                    if (r0 != 4) { $pc22 = 5; continue $sw22; }
                    return true;
                }
                case 5: {
                    if (r0 == 7) { $pc22 = 10; continue $sw22; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
