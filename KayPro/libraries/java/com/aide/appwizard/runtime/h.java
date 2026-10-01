package com.aide.appwizard.runtime;

@abcd.Interfacexu
class h {

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
                        abcd.wu.j6(com.aide.appwizard.runtime.h.class, 4136550149595440731L, -1824270371302218892L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3241048879321721908L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new int[com.aide.appwizard.runtime.i.d.values().length];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    try {
                        j6[com.aide.appwizard.runtime.i.d.Hw.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 18; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    try {
                        j6[com.aide.appwizard.runtime.i.d.gn.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 19; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 28; continue $sw0;
                }
                case 28: {
                    try {
                        j6[com.aide.appwizard.runtime.i.d.Zo.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 20; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 32; continue $sw0;
                }
                case 32: {
                    try {
                        j6[com.aide.appwizard.runtime.i.d.DW.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 21; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    try {
                        j6[com.aide.appwizard.runtime.i.d.VH.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 22; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    return;
                }
                case 34: {
                    return;
                }
                case 13: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, -3241048879321721908L, null);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 18: {
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
