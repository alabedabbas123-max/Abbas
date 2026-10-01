package com.aide.common;

@abcd.Interfacexu
public class KeyStrokeDetector {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -4570948708669963000L)
    private boolean EQ;

    @abcd.Interfaceru(field = 2102757878571566775L)
    private boolean FH;

    @abcd.Interfaceru(field = 864812605871956368L)
    private boolean Hw;

    @abcd.Interfaceru(field = -5567953115656525644L)
    private boolean J0;

    @abcd.Interfaceru(field = 4468261064361072583L)
    private android.view.KeyCharacterMap J8;

    @abcd.Interfaceru(field = -1914409971811083351L)
    private boolean VH;

    @abcd.Interfaceru(field = -2007436848140662380L)
    private android.content.Context Ws;

    @abcd.Interfaceru(field = 489062553661005805L)
    private boolean Zo;

    @abcd.Interfaceru(field = -5287266847798850560L)
    private boolean gn;

    @abcd.Interfaceru(field = 3570024579988647771L)
    private boolean tp;

    @abcd.Interfaceru(field = -3720460559953668063L)
    private boolean u7;

    @abcd.Interfaceru(field = 1339590429424913444L)
    private boolean v5;

    @abcd.Interfaceru(field = -604333159712324053L)
    private int we;

    public interface a {
        boolean j6(com.aide.common.ClassU r1);
    }

    static {
        abcd.wu.j6(com.aide.common.KeyStrokeDetector.class, -2626290547296404472L, -2626290547296404472L);
    }

    public KeyStrokeDetector(android.content.Context r6) {
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, 211847340499652800L, null, r6);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(211847340499652800L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.Ws = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    r4 = true;
                    if (r6.getResources().getConfiguration().keyboard == 1) { $pc0 = 10; continue $sw0; }
                    r4 = false;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        this.J0 = r4;
                        j6("new KeyStrokeDetector() - isSoftKeyboard: " + this.J0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 14005335356034208L)
    private void DW(int r8, boolean r9) {
        boolean r0 = false;
        boolean r2 = false;
        boolean r1 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        boolean r10 = false;
        boolean r11 = false;
        boolean r12 = false;
        boolean r13 = false;
        boolean r14 = false;
        boolean r15 = false;
        boolean r16 = false;
        boolean r17 = false;
        boolean r18 = false;
        boolean r19 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 47: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 51; continue $sw1; }
                    abcd.wu.j6(th, 2685077797094764336L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    $pc1 = 51; continue $sw1;
                }
                case 51: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(2685077797094764336L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        j6("onMetaKeysUp " + r8);
                        r0 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    r2 = true;
                    if (r8 == 57) { $pc1 = 8; continue $sw1; }
                    r1 = true;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    try {
                        this.FH = r0 & r1;
                        r3 = this.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 == 58) { $pc1 = 12; continue $sw1; }
                    r4 = true;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    try {
                        this.Hw = r3 & r4;
                        r5 = this.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 == 59) { $pc1 = 16; continue $sw1; }
                    r6 = true;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    try {
                        this.v5 = r5 & r6;
                        r7 = this.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 == 60) { $pc1 = 20; continue $sw1; }
                    r10 = true;
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    try {
                        this.Zo = r7 & r10;
                        r11 = this.EQ;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 != 59) { $pc1 = 26; continue $sw1; }
                    if (r9 == true) { $pc1 = 26; continue $sw1; }
                    r12 = false;
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    try {
                        this.EQ = r11 & r12;
                        r13 = this.tp;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 != 60) { $pc1 = 32; continue $sw1; }
                    if (r9 == true) { $pc1 = 32; continue $sw1; }
                    r14 = false;
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    try {
                        this.tp = r13 & r14;
                        r15 = this.u7;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 == 0) { $pc1 = 36; continue $sw1; }
                    r16 = true;
                    $pc1 = 37; continue $sw1;
                }
                case 37: {
                    try {
                        this.u7 = r15 & r16;
                        r17 = this.VH;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 == 113) { $pc1 = 40; continue $sw1; }
                    r18 = true;
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    try {
                        this.VH = r17 & r18;
                        r19 = this.gn;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    if (r8 != 114) { $pc1 = 45; continue $sw1; }
                    r2 = false;
                    $pc1 = 45; continue $sw1;
                }
                case 45: {
                    try {
                        this.gn = r19 & r2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 47; continue $sw1;
                    }
                    return;
                }
                case 40: {
                    r18 = false;
                    { $pc1 = 41; continue $sw1; }
                }
                case 36: {
                    r16 = false;
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    r14 = true;
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    r12 = true;
                    { $pc1 = 27; continue $sw1; }
                }
                case 20: {
                    r10 = false;
                    { $pc1 = 21; continue $sw1; }
                }
                case 16: {
                    r6 = false;
                    { $pc1 = 17; continue $sw1; }
                }
                case 12: {
                    r4 = false;
                    { $pc1 = 13; continue $sw1; }
                }
                case 8: {
                    r1 = false;
                    { $pc1 = 9; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean DW(com.aide.common.KeyStrokeDetector r0) {
        return r0.J0;
    }

    @abcd.Interfacesu(method = -342692098111630079L)
    private com.aide.common.ClassU FH(int r9, android.view.KeyEvent r10) {
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        int r1 = 0;
        char r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 25: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 29; continue $sw2; }
                    abcd.wu.j6(th, 3470998291504142863L, this, new java.lang.Integer(r9), r10);
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(3470998291504142863L, this, new java.lang.Integer(r9), r10);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 25; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r9 != 0) { $pc2 = 7; continue $sw2; }
                    return null;
                }
                case 7: {
                    if (r9 != 3) { $pc2 = 9; continue $sw2; }
                    return null;
                }
                case 9: {
                    if (r9 != 4) { $pc2 = 11; continue $sw2; }
                    return null;
                }
                case 11: {
                    if (r9 != 113) { $pc2 = 13; continue $sw2; }
                    return null;
                }
                case 13: {
                    if (r9 == 114) { $pc2 = 35; continue $sw2; }
                    try {
                        switch(r9) {
                            case 57: { $pc2 = 36; continue $sw2; }
                            case 58: { $pc2 = 36; continue $sw2; }
                            case 59: { $pc2 = 36; continue $sw2; }
                            case 60: { $pc2 = 36; continue $sw2; }
                            default: { $pc2 = 15; continue $sw2; }
                        };
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 25; continue $sw2;
                    }
                }
                case 15: {
                    try {
                        r5 = (this.v5 | this.Zo) | r10.isShiftPressed();
                        r6 = (this.VH | this.gn) | j6(r10.getMetaState());
                        r7 = (this.FH | this.Hw) | r10.isAltPressed();
                        r1 = r10.getUnicodeChar();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 25; continue $sw2;
                    }
                    if (r1 != 0) { $pc2 = 18; continue $sw2; }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r4 = 65535;
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    return new com.aide.common.ClassU(r9, r4, r5, r6, r7);
                }
                case 18: {
                    if (java.lang.Character.isISOControl(r1) == true) { $pc2 = 20; continue $sw2; }
                    try {
                        r4 = (char) r1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 25; continue $sw2;
                    }
                    { $pc2 = 21; continue $sw2; }
                }
                case 36: {
                    return null;
                }
                case 35: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean FH(com.aide.common.KeyStrokeDetector r0) {
        return r0.EQ;
    }

    static boolean Hw(com.aide.common.KeyStrokeDetector r0) {
        return r0.tp;
    }

    static android.content.Context Zo(com.aide.common.KeyStrokeDetector r0) {
        return r0.Ws;
    }

    private void cl() {
        this.FH = false;
        this.Hw = false;
        this.VH = false;
        this.gn = false;
        this.v5 = false;
        this.Zo = false;
    }

    static void cl(com.aide.common.KeyStrokeDetector r1) {
        r1.cl();
    }

    static int j6(com.aide.common.KeyStrokeDetector r0) {
        return r0.we;
    }

    static int j6(com.aide.common.KeyStrokeDetector r0, int r1) {
        r0.we = r1;
        return r1;
    }

    static android.view.KeyCharacterMap j6(com.aide.common.KeyStrokeDetector r0, android.view.KeyCharacterMap r1) {
        r0.J8 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -3306886932270292448L)
    private com.aide.common.ClassU j6(char r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -749892910932203508L, this, new java.lang.Character(r10));
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-749892910932203508L, this, new java.lang.Character(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return new com.aide.common.ClassU(-1, r10, (this.EQ | this.tp) | java.lang.Character.isUpperCase(r10), false, false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.common.ClassU j6(com.aide.common.KeyStrokeDetector r0, char r1) {
        return r0.j6(r1);
    }

    @abcd.Interfacesu(method = -998189621382317425L)
    private void j6(int r8, boolean r9) {
        boolean r0 = false;
        boolean r2 = false;
        boolean r1 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        boolean r10 = false;
        boolean r11 = false;
        boolean r12 = false;
        boolean r13 = false;
        boolean r14 = false;
        boolean r15 = false;
        boolean r16 = false;
        boolean r17 = false;
        boolean r18 = false;
        boolean r19 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 45: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 49; continue $sw4; }
                    abcd.wu.j6(th, 801650849126027901L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    $pc4 = 49; continue $sw4;
                }
                case 49: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(801650849126027901L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        j6("onMetaKeysDown " + r8);
                        r0 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    r2 = true;
                    if (r8 != 57) { $pc4 = 8; continue $sw4; }
                    r1 = true;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    try {
                        this.FH = r0 | r1;
                        r3 = this.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 != 58) { $pc4 = 12; continue $sw4; }
                    r4 = true;
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    try {
                        this.Hw = r3 | r4;
                        r5 = this.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 != 59) { $pc4 = 16; continue $sw4; }
                    r6 = true;
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    try {
                        this.v5 = r5 | r6;
                        r7 = this.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 != 60) { $pc4 = 20; continue $sw4; }
                    r10 = true;
                    $pc4 = 21; continue $sw4;
                }
                case 21: {
                    try {
                        this.Zo = r7 | r10;
                        r11 = this.EQ;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 != 59) { $pc4 = 25; continue $sw4; }
                    if (r9 == true) { $pc4 = 25; continue $sw4; }
                    r12 = true;
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    try {
                        this.EQ = r11 | r12;
                        r13 = this.tp;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 != 60) { $pc4 = 30; continue $sw4; }
                    if (r9 == true) { $pc4 = 30; continue $sw4; }
                    r14 = true;
                    $pc4 = 31; continue $sw4;
                }
                case 31: {
                    try {
                        this.tp = r13 | r14;
                        r15 = this.u7;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 != 0) { $pc4 = 34; continue $sw4; }
                    r16 = true;
                    $pc4 = 35; continue $sw4;
                }
                case 35: {
                    try {
                        this.u7 = r15 | r16;
                        r17 = this.VH;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 != 113) { $pc4 = 38; continue $sw4; }
                    r18 = true;
                    $pc4 = 39; continue $sw4;
                }
                case 39: {
                    try {
                        this.VH = r17 | r18;
                        r19 = this.gn;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    if (r8 == 114) { $pc4 = 43; continue $sw4; }
                    r2 = false;
                    $pc4 = 43; continue $sw4;
                }
                case 43: {
                    try {
                        this.gn = r19 | r2;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 45; continue $sw4;
                    }
                    return;
                }
                case 38: {
                    r18 = false;
                    { $pc4 = 39; continue $sw4; }
                }
                case 34: {
                    r16 = false;
                    $pc4 = 30; continue $sw4;
                }
                case 30: {
                    r14 = false;
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    r12 = false;
                    { $pc4 = 26; continue $sw4; }
                }
                case 20: {
                    r10 = false;
                    { $pc4 = 21; continue $sw4; }
                }
                case 16: {
                    r6 = false;
                    { $pc4 = 17; continue $sw4; }
                }
                case 12: {
                    r4 = false;
                    { $pc4 = 13; continue $sw4; }
                }
                case 8: {
                    r1 = false;
                    { $pc4 = 9; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.common.KeyStrokeDetector r0, java.lang.String r1) {
        r0.j6(r1);
    }

    @abcd.Interfacesu(method = 1084114156735046367L)
    private void j6(com.aide.common.ClassU r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -3856832108462147115L, this, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-3856832108462147115L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        j6("onKeyStroke " + r5.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 6510326703949956160L)
    private void j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 7: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 11; continue $sw6; }
                    abcd.wu.j6(th, 3044798538389927472L, this, r5);
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 14; continue $sw6; }
                    try {
                        abcd.wu.j6(3044798538389927472L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 7; continue $sw6;
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

    @abcd.Interfacesu(method = 2693316646629372071L)
    private void j6(java.lang.String r9, int r10, android.view.KeyEvent r11) {
        java.lang.StringBuilder r1 = null;
        java.lang.String r3 = null;
        java.lang.String r2 = null;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 20: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 24; continue $sw7; }
                    abcd.wu.j6(th, -3564819180313796227L, this, r9, new java.lang.Integer(r10), r11);
                    $pc7 = 24; continue $sw7;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-3564819180313796227L, this, r9, new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r1 = new java.lang.StringBuilder();
                        r1.append(r9);
                        r1.append(" ");
                        r1.append(r10);
                        r1.append("  ");
                        r1.append(r11.getFlags());
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    r3 = "";
                    if (r11.isAltPressed() == false) { $pc7 = 10; continue $sw7; }
                    r2 = " alt";
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    try {
                        r1.append(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    if (r11.isShiftPressed() == false) { $pc7 = 14; continue $sw7; }
                    r4 = " shift";
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    try {
                        r1.append(r4);
                        r1.append(" ");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    if (j6(r11.getMetaState()) == false) { $pc7 = 18; continue $sw7; }
                    r3 = " ctrl";
                    $pc7 = 18; continue $sw7;
                }
                case 18: {
                    try {
                        r1.append(r3);
                        j6(r1.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    return;
                }
                case 14: {
                    r4 = "";
                    { $pc7 = 15; continue $sw7; }
                }
                case 10: {
                    r2 = "";
                    { $pc7 = 11; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 347389564348050092L)
    private boolean j6(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 11: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 15; continue $sw8; }
                    abcd.wu.j6(th, 49014999568739136L, this, new java.lang.Integer(r5));
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(49014999568739136L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 11; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if ((r5 & 12288) == 0) { $pc8 = 9; continue $sw8; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.view.KeyCharacterMap v5(com.aide.common.KeyStrokeDetector r0) {
        return r0.J8;
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 2011926733778531907L, this);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(2011926733778531907L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        this.we = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r8, android.view.KeyEvent r9) {
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 11: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 15; continue $sw10; }
                    abcd.wu.j6(th, -1071927887052637632L, this, new java.lang.Integer(r8), r9);
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-1071927887052637632L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 11; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    if ((r9.getFlags() & 2) == 0) { $pc10 = 8; continue $sw10; }
                    r0 = true;
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    try {
                        DW(r8, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 11; continue $sw10;
                    }
                    return;
                }
                case 8: {
                    r0 = false;
                    { $pc10 = 9; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(int r9, android.view.KeyEvent r10, com.aide.common.KeyStrokeDetector.a r11) {
        java.lang.Throwable r1 = null;
        int r2 = 0;
        boolean r3 = false;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 20: {
                    th = th;
                    $pc11 = 22; continue $sw11;
                }
                case 22: {
                    if (DW == false) { $pc11 = 24; continue $sw11; }
                    r1 = th;
                    abcd.wu.j6(r1, -62291960055867243L, this, new java.lang.Integer(r9), r10, r11);
                    $pc11 = 24; continue $sw11;
                }
                case 24: {
                    throw th;
                }
                case 3: {
                    if (j6 == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(-62291960055867243L, this, new java.lang.Integer(r9), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    try {
                        j6("onKeyUp", r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 20; continue $sw11;
                    }
                    if (r9 != 84) { $pc11 = 9; continue $sw11; }
                    r2 = 57;
                    $pc11 = 25; continue $sw11;
                }
                case 25: {
                    $pc11 = 11; continue $sw11;
                }
                case 18: {
                    th = th;
                    r9 = r2;
                    { $pc11 = 22; continue $sw11; }
                }
                case 11: {
                    if ((r10.getFlags() & 2) == 0) { $pc11 = 13; continue $sw11; }
                    r3 = true;
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    try {
                        DW(r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 18; continue $sw11;
                    }
                    if (r9 != 84) { $pc11 = 17; continue $sw11; }
                    return true;
                }
                case 17: {
                    return false;
                }
                case 13: {
                    r3 = false;
                    { $pc11 = 14; continue $sw11; }
                }
                case 9: {
                    r2 = r9;
                    { $pc11 = 25; continue $sw11; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public android.view.inputmethod.InputConnection j6(android.view.View r8, com.aide.common.KeyStrokeDetector.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 7: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 11; continue $sw12; }
                    abcd.wu.j6(th, 960257137080474675L, this, r8, r9);
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc12 = 5; continue $sw12; }
                    try {
                        abcd.wu.j6(960257137080474675L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 7; continue $sw12;
                    }
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    return new com.aide.common.ClassV(this, r8, true, r9, r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, android.view.KeyEvent r9) {
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 3;
        $sw13: while (true) {
            switch ($pc13) {
                case 11: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 15; continue $sw13; }
                    abcd.wu.j6(th, -1251475993808772111L, this, new java.lang.Integer(r8), r9);
                    $pc13 = 15; continue $sw13;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-1251475993808772111L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 11; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    if ((r9.getFlags() & 2) == 0) { $pc13 = 8; continue $sw13; }
                    r0 = true;
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    try {
                        j6(r8, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 11; continue $sw13;
                    }
                    return;
                }
                case 8: {
                    r0 = false;
                    { $pc13 = 9; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.content.Context r5) {
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 12: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 16; continue $sw14; }
                    abcd.wu.j6(th, 1416516942134704880L, this, r5);
                    $pc14 = 16; continue $sw14;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(1416516942134704880L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 12; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    r3 = true;
                    if (r5.getResources().getConfiguration().keyboard == 1) { $pc14 = 10; continue $sw14; }
                    r3 = false;
                    $pc14 = 10; continue $sw14;
                }
                case 10: {
                    try {
                        this.J0 = r3;
                        j6("KeyStrokeDetector.onConfigChange() - isSoftKeyboard: " + this.J0);
                        this.J8 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 12; continue $sw14;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 14: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 18; continue $sw15; }
                    abcd.wu.j6(th, -3763531224502629384L, this);
                    $pc15 = 18; continue $sw15;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 7; continue $sw15; }
                    try {
                        abcd.wu.j6(-3763531224502629384L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (this.VH == true) { $pc15 = 12; continue $sw15; }
                    if (this.gn == true) { $pc15 = 12; continue $sw15; }
                    return false;
                }
                case 12: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r9, android.view.KeyEvent r10, com.aide.common.KeyStrokeDetector.a r11) {
        java.lang.Throwable r1 = null;
        int r2 = 0;
        boolean r3 = false;
        com.aide.common.ClassU r4 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 3;
        $sw16: while (true) {
            switch ($pc16) {
                case 25: {
                    th = th;
                    $pc16 = 27; continue $sw16;
                }
                case 27: {
                    if (DW == false) { $pc16 = 29; continue $sw16; }
                    r1 = th;
                    abcd.wu.j6(r1, 3835102424242503428L, this, new java.lang.Integer(r9), r10, r11);
                    $pc16 = 29; continue $sw16;
                }
                case 29: {
                    throw th;
                }
                case 3: {
                    if (j6 == false) { $pc16 = 5; continue $sw16; }
                    try {
                        abcd.wu.j6(3835102424242503428L, this, new java.lang.Integer(r9), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 25; continue $sw16;
                    }
                    $pc16 = 5; continue $sw16;
                }
                case 5: {
                    try {
                        j6("onKeyDown", r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 25; continue $sw16;
                    }
                    if (r9 != 84) { $pc16 = 9; continue $sw16; }
                    r2 = 57;
                    $pc16 = 30; continue $sw16;
                }
                case 30: {
                    $pc16 = 11; continue $sw16;
                }
                case 23: {
                    th = th;
                    r9 = r2;
                    { $pc16 = 27; continue $sw16; }
                }
                case 11: {
                    if ((r10.getFlags() & 2) == 0) { $pc16 = 13; continue $sw16; }
                    r3 = true;
                    $pc16 = 14; continue $sw16;
                }
                case 14: {
                    try {
                        j6(r2, r3);
                        r4 = FH(r2, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 23; continue $sw16;
                    }
                    if (r4 != null) { $pc16 = 17; continue $sw16; }
                    $pc16 = 20; continue $sw16;
                }
                case 20: {
                    if (r9 != 84) { $pc16 = 22; continue $sw16; }
                    return true;
                }
                case 22: {
                    return false;
                }
                case 17: {
                    if (r11.j6(r4) == false) { $pc16 = 20; continue $sw16; }
                    try {
                        j6(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 23; continue $sw16;
                    }
                    return true;
                }
                case 13: {
                    r3 = false;
                    { $pc16 = 14; continue $sw16; }
                }
                case 9: {
                    r2 = r9;
                    { $pc16 = 30; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
