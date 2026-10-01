package com.aide.ui;

@abcd.Interfacexu
class Va {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;
    static final int[] j6 = null;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.ui.Va.class, -2007863676330719029L, 5684559321259543219L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(415275763506901420L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new int[com.aide.ui.Wa.a.values().length];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    try {
                        j6[com.aide.ui.Wa.a.DW.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 15; continue $sw0; }
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    try {
                        j6[com.aide.ui.Wa.a.j6.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 16; continue $sw0; }
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 22: {
                    return;
                }
                case 10: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 415275763506901420L, null);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 15: {
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
