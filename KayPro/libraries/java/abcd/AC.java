package abcd;

class AC implements java.util.Comparator<abcd.hC> {
    private static int[] j6;

    AC() {
    }

    private int j6(abcd.hC.a r3) {
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r4 = j6()[r3.ordinal()];
                    if (r4 != 1) { $pc0 = 5; continue $sw0; }
                    return 2;
                }
                case 5: {
                    if (r4 == 3) { $pc0 = 8; continue $sw0; }
                    return 10;
                }
                case 8: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(abcd.hC r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3.VH != abcd.hC.a.FH) { $pc1 = 7; continue $sw1; }
                    return r3.FH;
                }
                case 7: {
                    return r3.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
                    r1 = new int[abcd.hC.a.values().length];
                    try {
                        r1[abcd.hC.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 13; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    try {
                        r1[abcd.hC.a.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 14; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    try {
                        r1[abcd.hC.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 15; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    try {
                        r1[abcd.hC.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 16; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    try {
                        r1[abcd.hC.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 17; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    j6 = r1;
                    return r1;
                }
                case 13: {
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int compare(abcd.hC r1, abcd.hC r2) {
        return j6(r1, r2);
    }

    public int j6(abcd.hC r3, abcd.hC r4) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = j6(r3).compareTo(j6(r4));
                    if (r0 == 0) { $pc3 = 5; continue $sw3; }
                    return r0;
                }
                case 5: {
                    return j6(r3.DW()) - j6(r4.DW());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
