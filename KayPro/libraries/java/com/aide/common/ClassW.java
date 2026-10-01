package com.aide.common;

@abcd.Interfacexu
class ClassW implements com.aide.common.KeyStrokeDetector.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.KeyStrokeEditText FH;

    static {
        abcd.wu.j6(com.aide.common.ClassW.class, -2670818707938442347L, 620407520647363400L);
    }

    ClassW(com.aide.common.KeyStrokeEditText r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2734340384647146825L)
    public boolean j6(com.aide.common.ClassU r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 9: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 13; continue $sw0; }
                    abcd.wu.j6(th, 2255394380938386479L, this, r5);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2255394380938386479L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.setKeyStroke(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
