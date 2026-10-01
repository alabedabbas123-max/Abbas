package abcd;

public abstract class DJ {
    private static int[] j6;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.DJ.a DW = null;
        public static final abcd.DJ.a FH = null;
        public static final abcd.DJ.a Hw = null;
        private static final abcd.DJ.a[] Zo = null;
        public static final abcd.DJ.a j6 = null;
        public static final abcd.DJ.a v5 = null;

        static {
            j6 = new abcd.DJ.a("USER", 0);
            DW = new abcd.DJ.a("PASS", 1);
            FH = new abcd.DJ.a("HOST", 2);
            Hw = new abcd.DJ.a("PORT", 3);
            v5 = new abcd.DJ.a("PATH", 4);
            Zo = new abcd.DJ.a[]{j6, DW, FH, Hw, v5};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.DJ.a valueOf(java.lang.String r1) {
            return (abcd.DJ.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.DJ.a.values(), r1);
        }

        public static abcd.DJ.a[] values() {
            abcd.DJ.a[] r0 = Zo;
            int r1 = r0.length;
            abcd.DJ.a[] r2 = new abcd.DJ.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public DJ() {
    }

    static int[] j6() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = j6;
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.DJ.a.values().length];
                    try {
                        r1[abcd.DJ.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    try {
                        r1[abcd.DJ.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    try {
                        r1[abcd.DJ.a.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 15; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    try {
                        r1[abcd.DJ.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 16; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        r1[abcd.DJ.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    j6 = r1;
                    return r1;
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                case 14: {
                    throw new java.lang.IllegalStateException();
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                case 16: {
                    throw new java.lang.IllegalStateException();
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.AbstractjJ DW(abcd.HJ r1, abcd.UE r2, java.lang.String r3);

    public abstract java.lang.String DW();

    public java.util.Set<abcd.DJ.a> FH() {
        return java.util.Collections.emptySet();
    }

    public java.util.Set<abcd.DJ.a> Hw() {
        return java.util.Collections.unmodifiableSet(java.util.EnumSet.of(abcd.DJ.a.v5));
    }

    public boolean j6(abcd.HJ r2) {
        return j6(r2, null, null);
    }

    public boolean j6(abcd.HJ r4, abcd.UE r5, java.lang.String r6) {
        java.util.Iterator<abcd.DJ.a> r7 = null;
        abcd.DJ.a r0 = null;
        int r1 = 0;
        java.util.EnumSet r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (v5().isEmpty() == false) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r7 = Hw().iterator();
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r7.hasNext() == false) { $pc1 = 10; continue $sw1; }
                    r0 = r7.next();
                    r1 = j6()[r0.ordinal()];
                    if (r1 != 1) { $pc1 = 39; continue $sw1; }
                    if (r4.gn() == null) { $pc1 = 69; continue $sw1; }
                    if (r4.gn().length() != 0) { $pc1 = 9; continue $sw1; }
                    $pc1 = 69; continue $sw1;
                }
                case 69: {
                    return false;
                }
                case 39: {
                    if (r1 != 2) { $pc1 = 41; continue $sw1; }
                    if (r4.FH() == null) { $pc1 = 64; continue $sw1; }
                    if (r4.FH().length() != 0) { $pc1 = 9; continue $sw1; }
                    $pc1 = 64; continue $sw1;
                }
                case 64: {
                    return false;
                }
                case 41: {
                    if (r1 != 3) { $pc1 = 43; continue $sw1; }
                    if (r4.j6() == null) { $pc1 = 59; continue $sw1; }
                    if (r4.j6().length() != 0) { $pc1 = 9; continue $sw1; }
                    $pc1 = 59; continue $sw1;
                }
                case 59: {
                    return false;
                }
                case 43: {
                    if (r1 != 4) { $pc1 = 45; continue $sw1; }
                    if (r4.v5() > 0) { $pc1 = 9; continue $sw1; }
                    return false;
                }
                case 45: {
                    if (r1 != 5) { $pc1 = 46; continue $sw1; }
                    if (r4.Hw() == null) { $pc1 = 51; continue $sw1; }
                    if (r4.Hw().length() != 0) { $pc1 = 9; continue $sw1; }
                    $pc1 = 51; continue $sw1;
                }
                case 51: {
                    return false;
                }
                case 46: {
                    return false;
                }
                case 10: {
                    r8 = java.util.EnumSet.copyOf(Hw());
                    r8.addAll(FH());
                    if (r4.gn() == null) { $pc1 = 16; continue $sw1; }
                    if (r8.contains(abcd.DJ.a.j6) == true) { $pc1 = 16; continue $sw1; }
                    return false;
                }
                case 16: {
                    if (r4.FH() == null) { $pc1 = 21; continue $sw1; }
                    if (r8.contains(abcd.DJ.a.DW) == true) { $pc1 = 21; continue $sw1; }
                    return false;
                }
                case 21: {
                    if (r4.j6() == null) { $pc1 = 26; continue $sw1; }
                    if (r8.contains(abcd.DJ.a.FH) == true) { $pc1 = 26; continue $sw1; }
                    return false;
                }
                case 26: {
                    if (r4.v5() <= 0) { $pc1 = 31; continue $sw1; }
                    if (r8.contains(abcd.DJ.a.Hw) == true) { $pc1 = 31; continue $sw1; }
                    return false;
                }
                case 31: {
                    if (r4.Hw() != null) { $pc1 = 33; continue $sw1; }
                    $pc1 = 35; continue $sw1;
                }
                case 35: {
                    return true;
                }
                case 33: {
                    if (r8.contains(abcd.DJ.a.v5) == true) { $pc1 = 35; continue $sw1; }
                    return false;
                }
                case 5: {
                    if (v5().contains(r4.VH()) == true) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Set<java.lang.String> v5() {
        return java.util.Collections.emptySet();
    }
}
