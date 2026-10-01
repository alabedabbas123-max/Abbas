package abcd;

public abstract class AbstracteC {
    private static int[] DW;
    private static int[] j6;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.AbstracteC.a DW = null;
        private static final abcd.AbstracteC.a[] FH = null;
        public static final abcd.AbstracteC.a j6 = null;

        static {
            j6 = new abcd.AbstracteC.a("MYERS", 0);
            DW = new abcd.AbstracteC.a("HISTOGRAM", 1);
            FH = new abcd.AbstracteC.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.AbstracteC.a valueOf(java.lang.String r1) {
            return (abcd.AbstracteC.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.AbstracteC.a.values(), r1);
        }

        public static abcd.AbstracteC.a[] values() {
            abcd.AbstracteC.a[] r0 = FH;
            int r1 = r0.length;
            abcd.AbstracteC.a[] r2 = new abcd.AbstracteC.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public AbstracteC() {
    }

    static int[] DW() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = DW;
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.jC.a.values().length];
                    try {
                        r1[abcd.jC.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    try {
                        r1[abcd.jC.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        r1[abcd.jC.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    try {
                        r1[abcd.jC.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 15; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    DW = r1;
                    return r1;
                }
                case 12: {
                    throw new java.lang.IllegalStateException();
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
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstracteC j6(abcd.AbstracteC.a r1) {
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = j6()[r1.ordinal()];
                    if (r2 == 1) { $pc1 = 11; continue $sw1; }
                    if (r2 != 2) { $pc1 = 9; continue $sw1; }
                    return new abcd.oC();
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException();
                }
                case 11: {
                    return abcd.sC.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static <S extends abcd.CC> abcd.jC j6(S r2, S r3) {
        return new abcd.jC(0, r2.j6(), 0, r3.j6());
    }

    static int[] j6() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6;
                    if (r0 == null) { $pc2 = 5; continue $sw2; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.AbstracteC.a.values().length];
                    try {
                        r1[abcd.AbstracteC.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 10; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    try {
                        r1[abcd.AbstracteC.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 11; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    j6 = r1;
                    return r1;
                }
                case 10: {
                    throw new java.lang.IllegalStateException();
                }
                case 11: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract <S extends abcd.CC> abcd.kC DW(DC<? super S> r1, S r2, S r3);

    public <S extends abcd.CC> abcd.kC j6(DC<? super S> r5, S r6, S r7) {
        abcd.jC r0 = null;
        int r1 = 0;
        DC<? super S> r2 = null;
        abcd.GC r8 = null;
        abcd.GC r3 = null;
        abcd.kC r4 = null;
        abcd.jC r9 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r5.j6(r6, r7, j6(r6, r7));
                    r1 = DW()[r0.gn().ordinal()];
                    if (r1 == 1) { $pc3 = 24; continue $sw3; }
                    if (r1 == 2) { $pc3 = 24; continue $sw3; }
                    if (r1 != 3) { $pc3 = 9; continue $sw3; }
                    r2 = new abcd.HC(r5);
                    r8 = abcd.GC.j6(r6, r0);
                    r3 = abcd.GC.DW(r7, r0);
                    r4 = DW(r2, r8, r3);
                    abcd.GC.j6(r4, r8, r3);
                    r9 = r4.get(r4.size() - 1);
                    if (r9.gn() == abcd.jC.a.j6) { $pc3 = 17; continue $sw3; }
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    return r4;
                }
                case 17: {
                    if (r9.Hw >= r7.j6()) { $pc3 = 22; continue $sw3; }
                    if (r5.j6(r7, r9.FH, r7, r9.Hw) == false) { $pc3 = 22; continue $sw3; }
                    r9.j6++;
                    r9.DW++;
                    r9.FH++;
                    r9.Hw++;
                    { $pc3 = 17; continue $sw3; }
                }
                case 9: {
                    if (r1 != 4) { $pc3 = 13; continue $sw3; }
                    return new abcd.kC(0);
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                case 24: {
                    return abcd.kC.j6(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
