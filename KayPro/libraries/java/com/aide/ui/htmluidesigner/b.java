package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class b {

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
                        abcd.wu.j6(com.aide.ui.htmluidesigner.b.class, -3499094272017024501L, -4405686351372270912L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3349045995288234592L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    try {
                        j6[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 18; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    try {
                        j6[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 19; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 28; continue $sw0;
                }
                case 28: {
                    try {
                        j6[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 20; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 32; continue $sw0;
                }
                case 32: {
                    try {
                        j6[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 21; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    try {
                        j6[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 5;
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
                    abcd.wu.j6(th, 3349045995288234592L, null);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 18: {
                    return;
                }
                case 19: {
                    return;
                }
                case 20: {
                    return;
                }
                case 21: {
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
