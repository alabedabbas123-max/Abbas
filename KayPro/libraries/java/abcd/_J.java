package abcd;

public abstract class _J extends abcd.TJ {
    private static final byte[] EQ = null;
    private static int[] J0;
    private static int[] J8;
    private static int[] Ws;
    private static final byte[] tp = null;
    protected static final abcd._J.a[] u7 = null;
    private static final java.util.Comparator<abcd._J.a> we = null;
    private int Mr;
    private final abcd._J.b QX;
    private int U2;
    private byte[] XL;
    private abcd.UD a8;
    private int aM;
    private abcd._J.a[] j3;
    protected abcd.UE lg;

    protected static abstract class a {
        int DW;
        byte[] j6;

        protected a() {
        }

        public abstract long DW();

        public abstract abcd.AbstractrE FH();

        public abstract java.lang.String Hw();

        public abstract long j6();

        void j6(java.nio.charset.CharsetEncoder r5) {
            java.nio.ByteBuffer r6 = null;
            byte[] r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        try {
                            r6 = r5.encode(java.nio.CharBuffer.wrap(Hw()));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.nio.charset.CharacterCodingException) { $pc0 = 10; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        this.DW = r6.limit();
                        if (r6.hasArray() == true) { $pc0 = 6; continue $sw0; }
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        r0 = new byte[this.DW];
                        this.j6 = r0;
                        r6.get(r0);
                        return;
                    }
                    case 6: {
                        if (r6.arrayOffset() != 0) { $pc0 = 8; continue $sw0; }
                        this.j6 = r6.array();
                        return;
                    }
                    case 11: {
                        throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unencodeableFile, new java.lang.Object[]{Hw()}));
                    }
                    case 10: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String toString() {
            return java.lang.String.valueOf(FH().toString()) + " " + Hw();
        }

        public abstract java.io.InputStream v5();
    }

    private static final class b {
        final java.nio.charset.CharsetEncoder DW;
        java.security.MessageDigest FH;
        byte[] Hw;
        int Zo;
        final abcd.bK j6;
        abcd.YJ v5;

        b(abcd.bK r1) {
            this.j6 = r1;
            this.DW = abcd.hE.Zo.newEncoder();
        }

        void j6() {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.FH != null) { $pc1 = 6; continue $sw1; }
                        this.FH = abcd.hE.j6();
                        this.Hw = new byte[2048];
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public static final class c extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd._J.c DW = null;
        public static final abcd._J.c FH = null;
        public static final abcd._J.c Hw = null;
        public static final abcd._J.c j6 = null;
        private static final abcd._J.c[] v5 = null;

        static {
            j6 = new abcd._J.c("EQUAL", 0);
            DW = new abcd._J.c("DIFFER_BY_METADATA", 1);
            FH = new abcd._J.c("SMUDGED", 2);
            Hw = new abcd._J.c("DIFFER_BY_TIMESTAMP", 3);
            v5 = new abcd._J.c[]{j6, DW, FH, Hw};
        }

        private c(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd._J.c valueOf(java.lang.String r1) {
            return (abcd._J.c) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd._J.c.values(), r1);
        }

        public static abcd._J.c[] values() {
            abcd._J.c[] r0 = v5;
            int r1 = r0.length;
            abcd._J.c[] r2 = new abcd._J.c[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    private static class d extends abcd.UD {
        final abcd._J.a DW;

        d(abcd._J.a r2) {
            super(java.util.Collections.emptyList());
            this.DW = r2;
        }

        abcd.UD DW() {
            abcd.UD r0 = null;
            java.io.InputStream r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = new abcd.UD();
                        r1 = this.DW.v5();
                        try {
                            r0.j6(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        r1.close();
                        if (r0.j6().isEmpty() == false) { $pc2 = 13; continue $sw2; }
                        return null;
                    }
                    case 13: {
                        return r0;
                    }
                    case 8: {
                        th = $ex2;
                        r1.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static class e extends abcd._J.d {
        final abcd.UE FH;

        e(abcd._J.a r1, abcd.UE r2) {
            super(r1);
            this.FH = r2;
        }

        private void j6(abcd.UD r2, java.io.File r3) {
            java.io.FileInputStream r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (r3.exists() == false) { $pc3 = 10; continue $sw3; }
                        r0 = new java.io.FileInputStream(r3);
                        try {
                            r2.j6(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 7; continue $sw3;
                        }
                        r0.close();
                        return;
                    }
                    case 7: {
                        th = $ex3;
                        r0.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 10: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        abcd.UD DW() {
            abcd.UD r0 = null;
            abcd.AbstractpK r1 = null;
            java.lang.String r2 = null;
            java.io.File r3 = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (this.DW == null) { $pc4 = 7; continue $sw4; }
                        r0 = super.DW();
                        if (r0 != null) { $pc4 = 8; continue $sw4; }
                        r0 = new abcd.UD();
                        $pc4 = 8; continue $sw4;
                    }
                    case 8: {
                        r1 = this.FH.gn();
                        r2 = ((abcd.jE) this.FH.Zo().j6(abcd.jE.j6)).DW();
                        if (r2 != null) { $pc4 = 11; continue $sw4; }
                        $pc4 = 15; continue $sw4;
                    }
                    case 15: {
                        j6(r0, r1.j6(this.FH.VH(), "info/exclude"));
                        if (r0.j6().isEmpty() == true) { $pc4 = 18; continue $sw4; }
                        return r0;
                    }
                    case 18: {
                        return null;
                    }
                    case 11: {
                        if (r2.startsWith("~/") == false) { $pc4 = 13; continue $sw4; }
                        r3 = r1.j6(r1.Zo(), r2.substring(2));
                        $pc4 = 14; continue $sw4;
                    }
                    case 14: {
                        j6(r0, r3);
                        { $pc4 = 15; continue $sw4; }
                    }
                    case 13: {
                        r3 = r1.j6(null, r2);
                        { $pc4 = 14; continue $sw4; }
                    }
                    case 7: {
                        r0 = new abcd.UD();
                        { $pc4 = 8; continue $sw4; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        u7 = new abcd._J.a[0];
        tp = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        EQ = abcd.hE.j6(3);
        we = new abcd.ZJ();
    }

    protected _J(abcd._J r1) {
        super(r1);
        this.QX = r1.QX;
    }

    protected _J(abcd.bK r2) {
        this.QX = new abcd._J.b(r2);
    }

    static int DW(abcd._J.a r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r1.FH() != abcd.AbstractrE.j6) { $pc5 = 5; continue $sw5; }
                    return 47;
                }
                case 5: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.io.InputStream DW(java.io.InputStream r2) {
        return new abcd.UK(r2);
    }

    private boolean DW(abcd.QC r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (v5().DW(r3.Hw()) == false) { $pc6 = 6; continue $sw6; }
                    r3.j6((int) j3());
                    return false;
                }
                case 6: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean DW(byte[] r1, int r2) {
        return abcd.tC.j6(r1, r2);
    }

    private static void FH(java.io.InputStream r0) {
        r0.close();     // Catch: java.io.IOException -> L4
        return;
    }

    private byte[] FH(abcd._J.a r7) {
        java.io.InputStream r0 = null;
        long r1 = 0L;
        byte[] r8 = null;
        java.nio.ByteBuffer r9 = null;
        byte[] r2 = null;
        int r10 = 0;
        java.nio.ByteBuffer r11 = null;
        byte[] r12 = null;
        byte[] r13 = null;
        java.io.InputStream r14 = null;
        long r3 = 0L;
        byte[] r15 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    try {
                        r0 = r7.v5();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 36; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 == null) { $pc7 = 5; continue $sw7; }
                    try {
                        this.QX.j6();
                        r1 = r7.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    if (rN() == true) { $pc7 = 12; continue $sw7; }
                    try {
                        r8 = j6(r0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    try {
                        FH(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 36; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r8;
                }
                case 12: {
                    if (r1 > 65536) { $pc7 = 21; continue $sw7; }
                    try {
                        r9 = abcd.BK.j6(r0, (int) r1);
                        r2 = r9.array();
                        r10 = r9.limit();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    if (DW(r2, r10) == true) { $pc7 = 17; continue $sw7; }
                    try {
                        r11 = j6(r2, r10);
                        r2 = r11.array();
                        r10 = r11.limit();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    try {
                        r12 = j6(new java.io.ByteArrayInputStream(r2, 0, r10), r10);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    try {
                        FH(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 36; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r12;
                }
                case 21: {
                    if (Hw(r7) == false) { $pc7 = 25; continue $sw7; }
                    try {
                        r13 = j6(r0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    try {
                        FH(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 36; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r13;
                }
                case 25: {
                    try {
                        r14 = DW(r7.v5());
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    try {
                        r3 = j6(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 30; continue $sw7;
                    }
                    try {
                        FH(r14);
                        r15 = j6(DW(r0), r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                    try {
                        FH(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 36; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r15;
                }
                case 30: {
                    th = $ex7;
                    try {
                        FH(r14);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 33; continue $sw7;
                    }
                }
                case 33: {
                    th = $ex7;
                    try {
                        FH(r0);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 36; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 5: {
                    return abcd.TJ.j6;
                }
                case 37: {
                    return abcd.TJ.j6;
                }
                case 36: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean Hw(abcd._J.a r2) {
        java.io.InputStream r3 = null;
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r3 = r2.v5();
                    try {
                        r0 = abcd.tC.j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 6; continue $sw8;
                    }
                    FH(r3);
                    return r0;
                }
                case 6: {
                    th = $ex8;
                    FH(r3);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] J8() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = J8;
                    if (r0 == null) { $pc9 = 5; continue $sw9; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.UD.a.values().length];
                    try {
                        r1[abcd.UD.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc9 = 11; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    try {
                        r1[abcd.UD.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc9 = 12; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    try {
                        r1[abcd.UD.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc9 = 13; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    J8 = r1;
                    return r1;
                }
                case 11: {
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] QX() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = Ws;
                    if (r0 == null) { $pc10 = 5; continue $sw10; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd._J.c.values().length];
                    try {
                        r1[abcd._J.c.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 12; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 16; continue $sw10;
                }
                case 16: {
                    try {
                        r1[abcd._J.c.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 13; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 20; continue $sw10;
                }
                case 20: {
                    try {
                        r1[abcd._J.c.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 14; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 22; continue $sw10;
                }
                case 22: {
                    try {
                        r1[abcd._J.c.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 15; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    Ws = r1;
                    return r1;
                }
                case 12: {
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] Ws() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = J0;
                    if (r0 == null) { $pc11 = 5; continue $sw11; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.jE.a.values().length];
                    try {
                        r1[abcd.jE.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 11; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    try {
                        r1[abcd.jE.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 12; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 18; continue $sw11;
                }
                case 18: {
                    try {
                        r1[abcd.jE.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 13; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 9; continue $sw11;
                }
                case 9: {
                    J0 = r1;
                    return r1;
                }
                case 11: {
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void er() {
        abcd._J.a r0 = this.j3[this.U2];
        this.v5 = r0.FH().DW();
        int r1 = r0.DW;
        int r2 = this.VH;
        j6(r2 + r1, r2);
        java.lang.System.arraycopy(r0.j6, 0, this.Zo, this.VH, r1);
        this.gn = this.VH + r1;
    }

    private long j6(java.io.InputStream r8) {
        long r2 = 0L;
        long r4 = 0L;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r2 = 0;
                    $pc12 = 3; continue $sw12;
                }
                case 3: {
                    r4 = r8.skip(1048576);
                    if (r4 <= 0) { $pc12 = 5; continue $sw12; }
                    r2 = r2 + r4;
                    { $pc12 = 3; continue $sw12; }
                }
                case 5: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.nio.ByteBuffer j6(byte[] r2, int r3) {
        java.io.ByteArrayInputStream r0 = null;
        java.nio.ByteBuffer r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = new java.io.ByteArrayInputStream(r2);
                    try {
                        r4 = abcd.BK.j6(DW(r0), r3);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 6; continue $sw13;
                    }
                    FH(r0);
                    return r4;
                }
                case 6: {
                    th = $ex13;
                    FH(r0);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(java.io.InputStream r15, long r16) {
        abcd._J.b r1 = null;
        java.security.MessageDigest r2 = null;
        byte[] r3 = null;
        long r7 = 0L;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r1 = this.QX;
                    r2 = r1.FH;
                    r3 = r1.Hw;
                    r2.reset();
                    r2.update(EQ);
                    r2.update((byte) 32);
                    if (r16 != 0) { $pc14 = 5; continue $sw14; }
                    r2.update((byte) 48);
                    r7 = r16;
                    $pc14 = 9; continue $sw14;
                }
                case 9: {
                    r2.update((byte) 0);
                    $pc14 = 10; continue $sw14;
                }
                case 10: {
                    r4 = r15.read(r3);
                    if (r4 <= 0) { $pc14 = 13; continue $sw14; }
                    r2.update(r3, 0, r4);
                    r7 = r7 + ((long) r4);
                    { $pc14 = 10; continue $sw14; }
                }
                case 13: {
                    if (r7 == r16) { $pc14 = 17; continue $sw14; }
                    return abcd.TJ.j6;
                }
                case 17: {
                    return r2.digest();
                }
                case 5: {
                    r5 = r3.length;
                    r7 = r16;
                    r6 = r5;
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    r6 = r6 - 1;
                    r3[r6] = tp[(int) (r7 % 10)];
                    r7 = r7 / 10;
                    if (r7 > 0) { $pc14 = 6; continue $sw14; }
                    r2.update(r3, r6, r5 - r6);
                    { $pc14 = 9; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.UD lg() {
        abcd.UD r0 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.a8;
                    if ((r0 instanceof abcd._J.d) == false) { $pc15 = 6; continue $sw15; }
                    this.a8 = ((abcd._J.d) r0).DW();
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    return this.a8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean rN() {
        int r0 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = Ws()[Mr().j6().ordinal()];
                    if (r0 != 2) { $pc16 = 5; continue $sw16; }
                    return true;
                }
                case 5: {
                    if (r0 == 3) { $pc16 = 10; continue $sw16; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean DW() {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (this.U2 != this.Mr) { $pc17 = 6; continue $sw17; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void EQ() {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (FH() == true) { $pc18 = 8; continue $sw18; }
                    this.U2 = 0;
                    if (DW() == true) { $pc18 = 9; continue $sw18; }
                    er();
                    return;
                }
                case 9: {
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void FH(int r2) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    this.U2 += r2;
                    if (DW() == true) { $pc19 = 6; continue $sw19; }
                    er();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean FH() {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (this.U2 != 0) { $pc20 = 6; continue $sw20; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected boolean Hw(int r7) {
        abcd.UD r0 = null;
        int r2 = 0;
        int r1 = 0;
        abcd.TJ r3 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = lg();
                    if (r0 == null) { $pc21 = 14; continue $sw21; }
                    r2 = this.VH;
                    if (r2 <= 0) { $pc21 = 7; continue $sw21; }
                    r2 = r2 - 1;
                    $pc21 = 7; continue $sw21;
                }
                case 7: {
                    r1 = J8()[r0.j6(abcd.YJ.j6(this.Zo, r2, r7), abcd.AbstractrE.j6.j6(this.v5)).ordinal()];
                    if (r1 != 1) { $pc21 = 10; continue $sw21; }
                    return false;
                }
                case 10: {
                    if (r1 != 2) { $pc21 = 14; continue $sw21; }
                    return true;
                }
                case 14: {
                    r3 = this.DW;
                    if ((r3 instanceof abcd._J) == true) { $pc21 = 17; continue $sw21; }
                    return false;
                }
                case 17: {
                    return ((abcd._J) r3).Hw(r7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bK Mr() {
        return this.QX.j6;
    }

    public boolean U2() {
        return Hw(this.gn);
    }

    protected abcd._J.a XL() {
        return this.j3[this.U2];
    }

    public java.io.InputStream a8() {
        java.io.InputStream r0 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = XL().v5();
                    if (Mr().j6() != abcd.jE.a.j6) { $pc22 = 5; continue $sw22; }
                    return r0;
                }
                case 5: {
                    return new abcd.UK(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long aM() {
        return XL().j6();
    }

    @Override
    public boolean gn() {
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    if (this.aM != this.U2) { $pc23 = 6; continue $sw23; }
                    return true;
                }
                case 6: {
                    if ((this.v5 & 61440) != 32768) { $pc23 = 8; continue $sw23; }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long j3() {
        return XL().DW();
    }

    public abcd._J.c j6(abcd.QC r12) {
        int r0 = 0;
        long r1 = 0L;
        long r2 = 0L;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    if (r12.tp() == false) { $pc24 = 7; continue $sw24; }
                    return abcd._J.c.j6;
                }
                case 7: {
                    if (r12.J8() == false) { $pc24 = 11; continue $sw24; }
                    return abcd._J.c.DW;
                }
                case 11: {
                    if (r12.J0() == false) { $pc24 = 13; continue $sw24; }
                    $pc24 = 16; continue $sw24;
                }
                case 16: {
                    r0 = VH() ^ r12.Zo();
                    if (r0 != 0) { $pc24 = 19; continue $sw24; }
                    $pc24 = 26; continue $sw24;
                }
                case 26: {
                    r1 = r12.DW();
                    r2 = aM();
                    if ((r1 % 1000) != 0) { $pc24 = 30; continue $sw24; }
                    r2 = r2 - (r2 % 1000);
                    $pc24 = 30; continue $sw24;
                }
                case 30: {
                    if (r2 == r1) { $pc24 = 34; continue $sw24; }
                    return abcd._J.c.Hw;
                }
                case 34: {
                    if (r12.J0() == true) { $pc24 = 38; continue $sw24; }
                    return abcd._J.c.j6;
                }
                case 38: {
                    return abcd._J.c.FH;
                }
                case 19: {
                    if (abcd.AbstractrE.DW.j6(r12.Zo()) == true) { $pc24 = 26; continue $sw24; }
                    if (this.QX.j6.DW() == true) { $pc24 = 23; continue $sw24; }
                    r0 = r0 & (abcd.AbstractrE.Hw.DW() ^ (-1));
                    $pc24 = 23; continue $sw24;
                }
                case 23: {
                    if (r0 == 0) { $pc24 = 26; continue $sw24; }
                    return abcd._J.c.DW;
                }
                case 13: {
                    if (j3() == r12.FH()) { $pc24 = 16; continue $sw24; }
                    return abcd._J.c.DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractrE j6(abcd.RC r3) {
        abcd.AbstractrE r0 = null;
        abcd.AbstractrE r4 = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r0 = Hw();
                    if (r3 != null) { $pc25 = 6; continue $sw25; }
                    return r0;
                }
                case 6: {
                    if (Mr().DW() == false) { $pc25 = 8; continue $sw25; }
                    return r0;
                }
                case 8: {
                    r4 = r3.Hw();
                    if (abcd.AbstractrE.FH != r0) { $pc25 = 14; continue $sw25; }
                    if (abcd.AbstractrE.Hw != r4) { $pc25 = 14; continue $sw25; }
                    return r4;
                }
                case 14: {
                    if (abcd.AbstractrE.Hw == r0) { $pc25 = 16; continue $sw25; }
                    $pc25 = 18; continue $sw25;
                }
                case 18: {
                    return r0;
                }
                case 16: {
                    if (abcd.AbstractrE.FH != r4) { $pc25 = 18; continue $sw25; }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r2) {
        this.U2 -= r2;
        er();
    }

    protected void j6(abcd.UE r3) {
        abcd.UD r0 = null;
        abcd._J.a r1 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    this.lg = r3;
                    r0 = this.a8;
                    if ((r0 instanceof abcd._J.d) == false) { $pc26 = 5; continue $sw26; }
                    r1 = ((abcd._J.d) r0).DW;
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    this.a8 = new abcd._J.e(r1, r3);
                    return;
                }
                case 5: {
                    r1 = null;
                    { $pc26 = 6; continue $sw26; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(abcd._J.a[] r7) {
        java.nio.charset.CharsetEncoder r8 = null;
        int r1 = 0;
        int r2 = 0;
        abcd._J.a[] r3 = null;
        abcd._J.a r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    this.j3 = r7;
                    r8 = this.QX.DW;
                    r1 = 0;
                    r2 = 0;
                    $pc27 = 3; continue $sw27;
                }
                case 3: {
                    r3 = this.j3;
                    if (r1 >= r3.length) { $pc27 = 5; continue $sw27; }
                    r4 = r3[r1];
                    if (r4 == null) { $pc27 = 26; continue $sw27; }
                    r5 = r4.Hw();
                    if (".".equals(r5) == true) { $pc27 = 26; continue $sw27; }
                    if ("..".equals(r5) == true) { $pc27 = 26; continue $sw27; }
                    if (".git".equals(r5) == true) { $pc27 = 26; continue $sw27; }
                    if (".gitignore".equals(r5) == false) { $pc27 = 23; continue $sw27; }
                    this.a8 = new abcd._J.d(r4);
                    $pc27 = 23; continue $sw27;
                }
                case 23: {
                    if (r1 == r2) { $pc27 = 25; continue $sw27; }
                    this.j3[r2] = r4;
                    $pc27 = 25; continue $sw27;
                }
                case 25: {
                    r4.j6(r8);
                    r2 = r2 + 1;
                    $pc27 = 26; continue $sw27;
                }
                case 26: {
                    r1 = r1 + 1;
                    { $pc27 = 3; continue $sw27; }
                }
                case 5: {
                    this.Mr = r2;
                    java.util.Arrays.sort(r3, 0, this.Mr, we);
                    this.aM = -1;
                    this.U2 = 0;
                    if (DW() == true) { $pc27 = 33; continue $sw27; }
                    er();
                    return;
                }
                case 33: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.QC r6, boolean r7) {
        abcd._J.c r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    r0 = j6(r6);
                    r1 = QX()[r0.ordinal()];
                    if (r1 != 1) { $pc28 = 5; continue $sw28; }
                    return false;
                }
                case 5: {
                    if (r1 != 2) { $pc28 = 7; continue $sw28; }
                    return true;
                }
                case 7: {
                    if (r1 == 3) { $pc28 = 17; continue $sw28; }
                    if (r1 != 4) { $pc28 = 15; continue $sw28; }
                    if (r7 == true) { $pc28 = 12; continue $sw28; }
                    return true;
                }
                case 12: {
                    return DW(r6);
                }
                case 15: {
                    throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unexpectedCompareResult, new java.lang.Object[]{r0.name()}));
                }
                case 17: {
                    return DW(r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected byte[] j6(abcd._J.a r2) {
        abcd.UE r0 = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    r0 = this.lg;
                    if (r0 == null) { $pc29 = 5; continue $sw29; }
                    return j6(r0.J8(), r2);
                }
                case 10: {
                    return abcd.TJ.j6;
                }
                case 5: {
                    return abcd.TJ.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected byte[] j6(java.io.File r2, abcd._J.a r3) {
        abcd.UE r4 = null;
        abcd.yE r5 = null;
        byte[] r6 = null;
        byte[] r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    try {
                        r4 = abcd.YH.j6(r2, r3.Hw());
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.io.IOException) { $pc30 = 20; continue $sw30; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == null) { $pc30 = 5; continue $sw30; }
                    try {
                        r5 = r4.FH("HEAD");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.io.IOException) { $pc30 = 15; continue $sw30; }
                        $pc30 = 13; continue $sw30;
                    }
                    r4.j6();
                    if (r5 == null) { $pc30 = 10; continue $sw30; }
                    r6 = new byte[20];
                    r5.DW(r6, 0);
                    return r6;
                }
                case 10: {
                    return abcd.TJ.j6;
                }
                case 15: {
                    try {
                        r7 = abcd.TJ.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 13; continue $sw30;
                    }
                    r4.j6();
                    return r7;
                }
                case 5: {
                    return abcd.TJ.j6;
                }
                case 13: {
                    th = $ex30;
                    r4.j6();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 21: {
                    return abcd.TJ.j6;
                }
                case 20: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int tp() {
        return 0;
    }

    @Override
    public byte[] u7() {
        abcd._J.b r0 = null;
        abcd.YJ r1 = null;
        abcd.RC r2 = null;
        abcd.QC r3 = null;
        int r4 = 0;
        int r5 = 0;
        byte[] r6 = null;
        int r7 = 0;
        byte[] r8 = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    if (this.aM == this.U2) { $pc31 = 5; continue $sw31; }
                    r0 = this.QX;
                    r1 = r0.v5;
                    if (r1 == null) { $pc31 = 16; continue $sw31; }
                    r2 = (abcd.RC) r1.j6(r0.Zo, abcd.RC.class);
                    if (r2 == null) { $pc31 = 16; continue $sw31; }
                    r3 = r2.J8();
                    if (r3 == null) { $pc31 = 16; continue $sw31; }
                    if (j6(r3) != abcd._J.c.j6) { $pc31 = 16; continue $sw31; }
                    return r2.u7();
                }
                case 16: {
                    r4 = this.v5 & 61440;
                    if (r4 != 32768) { $pc31 = 19; continue $sw31; }
                    r5 = this.U2;
                    this.aM = r5;
                    r6 = FH(this.j3[r5]);
                    this.XL = r6;
                    return r6;
                }
                case 19: {
                    if (r4 == 40960) { $pc31 = 27; continue $sw31; }
                    if (r4 != 57344) { $pc31 = 23; continue $sw31; }
                    r7 = this.U2;
                    this.aM = r7;
                    r8 = j6(this.j3[r7]);
                    this.XL = r8;
                    return r8;
                }
                case 23: {
                    return abcd.TJ.j6;
                }
                case 27: {
                    return abcd.TJ.j6;
                }
                case 5: {
                    return this.XL;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
