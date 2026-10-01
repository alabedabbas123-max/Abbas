package com.aide.ui.views;

@abcd.Interfacexu
class d implements com.aide.common.KeyStrokeDetector.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CodeEditText.c FH;

    static {
        abcd.wu.j6(com.aide.ui.views.d.class, 2358818556014640983L, 157050855361570380L);
    }

    d(com.aide.ui.views.CodeEditText.c r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -182519146299093696L)
    private abcd.InterfaceWl DW(com.aide.common.ClassU r7) {
        java.util.List<abcd.InterfaceWl> r2 = null;
        java.util.Iterator<abcd.InterfaceWl> r3 = null;
        abcd.InterfaceWl r4 = null;
        java.util.List<com.aide.common.ClassU> r5 = null;
        java.util.Iterator<com.aide.common.ClassU> r6 = null;
        java.util.Iterator<abcd.InterfaceWl> r8 = null;
        abcd.InterfaceWl r9 = null;
        java.util.List<com.aide.common.ClassU> r10 = null;
        java.util.Iterator<com.aide.common.ClassU> r11 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 32: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 37; continue $sw0; }
                    abcd.wu.j6(th, -101413971107968681L, this, r7);
                    $pc0 = 37; continue $sw0;
                }
                case 37: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-101413971107968681L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = this.FH.PH.getCustomEditorCommands();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (r2 == null) { $pc0 = 19; continue $sw0; }
                    try {
                        r3 = r2.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r3.hasNext() == false) { $pc0 = 19; continue $sw0; }
                    try {
                        r4 = r3.next();
                        r5 = this.FH.PH.j6(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (r5 == null) { $pc0 = 10; continue $sw0; }
                    try {
                        r6 = r5.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    if (r6.hasNext() == false) { $pc0 = 10; continue $sw0; }
                    if (r6.next().j6(r7) == false) { $pc0 = 15; continue $sw0; }
                    return r4;
                }
                case 19: {
                    try {
                        r8 = this.FH.PH.getBasicEditorCommands().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    if (r8.hasNext() == false) { $pc0 = 30; continue $sw0; }
                    try {
                        r9 = r8.next();
                        r10 = this.FH.PH.j6(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    if (r10 == null) { $pc0 = 20; continue $sw0; }
                    try {
                        r11 = r10.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 32; continue $sw0;
                    }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    if (r11.hasNext() == false) { $pc0 = 20; continue $sw0; }
                    if (r11.next().j6(r7) == false) { $pc0 = 26; continue $sw0; }
                    return r9;
                }
                case 30: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -863256365000365000L)
    public boolean j6(com.aide.common.ClassU r6) {
        int r2 = 0;
        abcd.InterfaceWl r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 29: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 33; continue $sw1; }
                    abcd.wu.j6(th, 6512284474480749371L, this, r6);
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(6512284474480749371L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = r6.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                    if (r2 != 96) { $pc1 = 9; continue $sw1; }
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    try {
                        this.FH.PH.Mr();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                    return true;
                }
                case 9: {
                    if (r2 == 23) { $pc1 = 27; continue $sw1; }
                    try {
                        r3 = DW(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                    if (r3 == null) { $pc1 = 18; continue $sw1; }
                    if (r3.isEnabled() == false) { $pc1 = 16; continue $sw1; }
                    try {
                        r3.run();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    return true;
                }
                case 18: {
                    if (r6.FH() == false) { $pc1 = 22; continue $sw1; }
                    try {
                        this.FH.PH.j6(r6.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                    return true;
                }
                case 22: {
                    if (r6.DW() != 66) { $pc1 = 26; continue $sw1; }
                    try {
                        this.FH.PH.j6('\n');
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 29; continue $sw1;
                    }
                    return true;
                }
                case 26: {
                    return this.FH.PH.j6(r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
