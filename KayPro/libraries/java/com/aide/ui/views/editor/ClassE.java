package com.aide.ui.views.editor;

@abcd.Interfacexu
class ClassE implements com.aide.ui.views.editor.Interfacep {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.views.editor.ClassG FH;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassE.class, 701484051258711375L, 4067103969721571863L);
    }

    ClassE(com.aide.ui.views.editor.ClassG r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -11003536162427025L)
    public void DW(com.aide.ui.views.editor.Interfaceo r11, int r12, int r13, int r14, int r15) {
        java.util.Iterator r0 = null;
        boolean r2 = false;
        abcd.hm r1 = null;
        java.util.Iterator<abcd.hm> r3 = null;
        abcd.hm r4 = null;
        abcd.hm r5 = null;
        boolean r6 = false;
        abcd.hm r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 56: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 61; continue $sw0; }
                    abcd.wu.j6(th, -1656478273935211221L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc0 = 61; continue $sw0;
                }
                case 61: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-1656478273935211221L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = com.aide.ui.views.editor.ClassG.FH(this.FH).iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r2 = true;
                    if (r0.hasNext() == false) { $pc0 = 22; continue $sw0; }
                    try {
                        r1 = (abcd.hm) r0.next();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    if (r1.j6(r13, r12) == true) { $pc0 = 11; continue $sw0; }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r2 = false;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    if (r2 != r1.j6(r15, r14)) { $pc0 = 18; continue $sw0; }
                    try {
                        r1.FH(r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    { $pc0 = 6; continue $sw0; }
                }
                case 18: {
                    try {
                        this.FH.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    return;
                }
                case 11: {
                    if (r13 != r1.DW()) { $pc0 = 17; continue $sw0; }
                    if (r12 == r1.j6()) { $pc0 = 15; continue $sw0; }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH) == null) { $pc0 = 75; continue $sw0; }
                    try {
                        r3 = com.aide.ui.views.editor.ClassG.Hw(this.FH).FH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    r4 = null;
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    if (r3.hasNext() == false) { $pc0 = 49; continue $sw0; }
                    try {
                        r5 = r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH).Hw == r5) { $pc0 = 25; continue $sw0; }
                    if (r5.j6(r13, r12) == true) { $pc0 = 31; continue $sw0; }
                    $pc0 = 35; continue $sw0;
                }
                case 35: {
                    r6 = false;
                    $pc0 = 37; continue $sw0;
                }
                case 37: {
                    if (r6 != r5.j6(r15, r14)) { $pc0 = 38; continue $sw0; }
                    if (r6 == false) { $pc0 = 45; continue $sw0; }
                    if (r13 != r15) { $pc0 = 43; continue $sw0; }
                    r4 = r5;
                    { $pc0 = 45; continue $sw0; }
                }
                case 43: {
                    try {
                        this.FH.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    return;
                }
                case 45: {
                    try {
                        r7 = r5.FH(r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    if (r7 == null) { $pc0 = 25; continue $sw0; }
                    try {
                        this.FH.j6(r7, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    { $pc0 = 25; continue $sw0; }
                }
                case 38: {
                    try {
                        this.FH.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    return;
                }
                case 31: {
                    if (r13 == r5.DW()) { $pc0 = 33; continue $sw0; }
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    r6 = true;
                    { $pc0 = 37; continue $sw0; }
                }
                case 33: {
                    if (r12 == r5.j6()) { $pc0 = 35; continue $sw0; }
                    $pc0 = 49; continue $sw0;
                }
                case 49: {
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH).Hw == null) { $pc0 = 51; continue $sw0; }
                    return;
                }
                case 51: {
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH).Zo == true) { $pc0 = 77; continue $sw0; }
                    if (r4 == null) { $pc0 = 54; continue $sw0; }
                    try {
                        com.aide.ui.views.editor.ClassG.j6(this.FH, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    return;
                }
                case 54: {
                    try {
                        this.FH.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 56; continue $sw0;
                    }
                    return;
                }
                case 77: {
                    return;
                }
                case 75: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 539959322668593747L)
    public void j6(com.aide.ui.views.editor.Interfaceo r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 3309131602721008141L, this, r5);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 14; continue $sw1; }
                    try {
                        abcd.wu.j6(3309131602721008141L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1769858912848233655L)
    public void j6(com.aide.ui.views.editor.Interfaceo r11, int r12, int r13, int r14, int r15) {
        java.util.Iterator r0 = null;
        boolean r2 = false;
        abcd.hm r1 = null;
        java.util.Iterator<abcd.hm> r3 = null;
        abcd.hm r4 = null;
        abcd.hm r5 = null;
        boolean r6 = false;
        boolean r7 = false;
        abcd.hm r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 55: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 60; continue $sw2; }
                    abcd.wu.j6(th, -1368150739322153969L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc2 = 60; continue $sw2;
                }
                case 60: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-1368150739322153969L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = com.aide.ui.views.editor.ClassG.FH(this.FH).iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r2 = true;
                    if (r0.hasNext() == false) { $pc2 = 21; continue $sw2; }
                    try {
                        r1 = (abcd.hm) r0.next();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    if (r1.j6(r13, r12) == false) { $pc2 = 16; continue $sw2; }
                    if (r12 != 0) { $pc2 = 16; continue $sw2; }
                    if (r1.FH() != 0) { $pc2 = 16; continue $sw2; }
                    if (r1.Hw() != r13) { $pc2 = 16; continue $sw2; }
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    if (r2 == true) { $pc2 = 18; continue $sw2; }
                    try {
                        r1.j6(r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    { $pc2 = 6; continue $sw2; }
                }
                case 18: {
                    try {
                        r1.DW(r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    r2 = false;
                    { $pc2 = 17; continue $sw2; }
                }
                case 21: {
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH) == null) { $pc2 = 77; continue $sw2; }
                    try {
                        r3 = com.aide.ui.views.editor.ClassG.Hw(this.FH).FH.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    r4 = null;
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    if (r3.hasNext() == false) { $pc2 = 48; continue $sw2; }
                    try {
                        r5 = r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH).Hw == r5) { $pc2 = 24; continue $sw2; }
                    try {
                        r6 = r5.j6(r13, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    if (r6 == false) { $pc2 = 35; continue $sw2; }
                    if (r12 != 0) { $pc2 = 35; continue $sw2; }
                    if (r5.FH() != 0) { $pc2 = 35; continue $sw2; }
                    if (r5.Hw() != r13) { $pc2 = 35; continue $sw2; }
                    r7 = true;
                    $pc2 = 36; continue $sw2;
                }
                case 36: {
                    if (r6 == false) { $pc2 = 42; continue $sw2; }
                    if (r7 == true) { $pc2 = 42; continue $sw2; }
                    if (r13 != r15) { $pc2 = 40; continue $sw2; }
                    r4 = r5;
                    { $pc2 = 42; continue $sw2; }
                }
                case 40: {
                    try {
                        this.FH.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    return;
                }
                case 42: {
                    if (r7 == false) { $pc2 = 44; continue $sw2; }
                    try {
                        r8 = r5.DW(r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    $pc2 = 45; continue $sw2;
                }
                case 45: {
                    if (r8 == null) { $pc2 = 24; continue $sw2; }
                    try {
                        this.FH.j6(r8, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    { $pc2 = 24; continue $sw2; }
                }
                case 44: {
                    try {
                        r8 = r5.j6(r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    $pc2 = 35; continue $sw2;
                }
                case 35: {
                    r7 = false;
                    { $pc2 = 36; continue $sw2; }
                }
                case 48: {
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH).Hw == null) { $pc2 = 50; continue $sw2; }
                    return;
                }
                case 50: {
                    if (com.aide.ui.views.editor.ClassG.Hw(this.FH).Zo == true) { $pc2 = 79; continue $sw2; }
                    if (r4 == null) { $pc2 = 53; continue $sw2; }
                    try {
                        com.aide.ui.views.editor.ClassG.j6(this.FH, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    return;
                }
                case 53: {
                    try {
                        this.FH.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 55; continue $sw2;
                    }
                    return;
                }
                case 79: {
                    return;
                }
                case 77: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -5322735152942983669L)
    public void j6(com.aide.ui.views.editor.Interfaceo r11, int r12, int r13, int r14, char[] r15) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 6: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 10; continue $sw3; }
                    abcd.wu.j6(th, -4545576030143572953L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 13; continue $sw3; }
                    try {
                        abcd.wu.j6(-4545576030143572953L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), r15);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 6; continue $sw3;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
