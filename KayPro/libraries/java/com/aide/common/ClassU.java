package com.aide.common;

@abcd.Interfacexu
public class ClassU {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1569918895593984708L)
    private char FH;

    @abcd.Interfaceru(field = -248795108199589435L)
    private int Hw;

    @abcd.Interfaceru(field = 1685610015466982760L)
    private boolean VH;

    @abcd.Interfaceru(field = 945948109527955456L)
    private boolean Zo;

    @abcd.Interfaceru(field = 2052865788647426077L)
    private boolean v5;

    static {
        abcd.wu.j6(com.aide.common.ClassU.class, -664295398846055440L, -664295398846055440L);
    }

    public ClassU(int r11, char r12, boolean r13, boolean r14, boolean r15) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -155828606081124015L, null, new java.lang.Integer(r11), new java.lang.Character(r12), new java.lang.Boolean(r13), new java.lang.Boolean(r14), new java.lang.Boolean(r15));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-155828606081124015L, null, new java.lang.Integer(r11), new java.lang.Character(r12), new java.lang.Boolean(r13), new java.lang.Boolean(r14), new java.lang.Boolean(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH = r12;
                        this.Hw = r11;
                        this.v5 = r13;
                        this.Zo = r14;
                        this.VH = r15;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public ClassU(int r10, boolean r11, boolean r12, boolean r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 512710817818247784L, null, new java.lang.Integer(r10), new java.lang.Boolean(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(512710817818247784L, null, new java.lang.Integer(r10), new java.lang.Boolean(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        this.FH = 65535;
                        this.Hw = r10;
                        this.v5 = r11;
                        this.Zo = r12;
                        this.VH = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.aide.common.ClassU j6(java.lang.String r12) {
        java.lang.String[] r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 11: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 15; continue $sw2; }
                    abcd.wu.j6(th, -2537502731119537559L, null, r12);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-2537502731119537559L, null, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r3 = r12.split(",");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    if (r3.length == 5) { $pc2 = 9; continue $sw2; }
                    return null;
                }
                case 9: {
                    return new com.aide.common.ClassU(java.lang.Integer.parseInt(r3[0]), (char) java.lang.Integer.parseInt(r3[1]), java.lang.Boolean.parseBoolean(r3[2]), java.lang.Boolean.parseBoolean(r3[3]), java.lang.Boolean.parseBoolean(r3[4]));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5169375836427724992L)
    private java.lang.String v5() {
        int r2 = 0;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 72: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 76; continue $sw3; }
                    abcd.wu.j6(th, 2792074058462256339L, this);
                    $pc3 = 76; continue $sw3;
                }
                case 76: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(2792074058462256339L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 72; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = this.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 72; continue $sw3;
                    }
                    if (r2 == (-1)) { $pc3 = 71; continue $sw3; }
                    if (r2 != 164) { $pc3 = 12; continue $sw3; }
                    return "VolMute";
                }
                case 12: {
                    if (r2 != 24) { $pc3 = 14; continue $sw3; }
                    return "VolUp";
                }
                case 14: {
                    if (r2 != 25) { $pc3 = 16; continue $sw3; }
                    return "VolDown";
                }
                case 16: {
                    if (r2 != 61) { $pc3 = 18; continue $sw3; }
                    return "Tab";
                }
                case 18: {
                    if (r2 != 62) { $pc3 = 20; continue $sw3; }
                    return "Space";
                }
                case 20: {
                    if (r2 != 66) { $pc3 = 22; continue $sw3; }
                    return "Enter";
                }
                case 22: {
                    if (r2 != 67) { $pc3 = 24; continue $sw3; }
                    return "Backspace";
                }
                case 24: {
                    if (r2 != 92) { $pc3 = 26; continue $sw3; }
                    return "PgUp";
                }
                case 26: {
                    if (r2 != 93) { $pc3 = 28; continue $sw3; }
                    return "PgDown";
                }
                case 28: {
                    if (r2 != 122) { $pc3 = 30; continue $sw3; }
                    return "Home";
                }
                case 30: {
                    if (r2 == 123) { $pc3 = 48; continue $sw3; }
                    switch(r2) {
                        case 19: { $pc3 = 46; continue $sw3; }
                        case 20: { $pc3 = 44; continue $sw3; }
                        case 21: { $pc3 = 42; continue $sw3; }
                        case 22: { $pc3 = 40; continue $sw3; }
                        default: { $pc3 = 32; continue $sw3; }
                    };
                }
                case 32: {
                    try {
                        r3 = (android.view.KeyCharacterMap.load(0).getDisplayLabel(this.Hw) + "").trim();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 72; continue $sw3;
                    }
                    if (r3.length() <= 0) { $pc3 = 35; continue $sw3; }
                    return r3;
                }
                case 35: {
                    try {
                        r4 = android.view.KeyEvent.keyCodeToString(this.Hw).toLowerCase();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 72; continue $sw3;
                    }
                    if (r4.startsWith("keycode_") == false) { $pc3 = 38; continue $sw3; }
                    try {
                        r4 = r4.substring(8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 72; continue $sw3;
                    }
                    $pc3 = 38; continue $sw3;
                }
                case 38: {
                    try {
                        r5 = r4.replace("_", " ");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 72; continue $sw3;
                    }
                    return r5.substring(0, 1).toUpperCase() + r5.substring(1);
                }
                case 40: {
                    return "Right";
                }
                case 42: {
                    return "Left";
                }
                case 44: {
                    return "Down";
                }
                case 46: {
                    return "Up";
                }
                case 48: {
                    return "End";
                }
                case 71: {
                    return java.lang.Character.toUpperCase(this.FH) + "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 2685244385518823983L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2685244385518823983L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 12: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 16; continue $sw5; }
                    abcd.wu.j6(th, 1957728969498150387L, this);
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(1957728969498150387L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (this.FH == 65535) { $pc5 = 10; continue $sw5; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -808465392394113792L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-808465392394113792L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return this.Hw + "," + this.FH + "," + this.v5 + "," + this.Zo + "," + this.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public char j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -503879727728061657L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-503879727728061657L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(com.aide.common.ClassU r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 26: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 30; continue $sw8; }
                    abcd.wu.j6(th, -437635320464540300L, this, r7);
                    $pc8 = 30; continue $sw8;
                }
                case 30: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(-437635320464540300L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 26; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (this.VH == r7.VH) { $pc8 = 10; continue $sw8; }
                    return false;
                }
                case 10: {
                    if (this.Zo == r7.Zo) { $pc8 = 13; continue $sw8; }
                    return false;
                }
                case 13: {
                    if (this.v5 == r7.v5) { $pc8 = 16; continue $sw8; }
                    return false;
                }
                case 16: {
                    if (this.Hw == (-1)) { $pc8 = 21; continue $sw8; }
                    if (this.Hw != r7.Hw) { $pc8 = 21; continue $sw8; }
                    return true;
                }
                case 21: {
                    if (this.FH == 65535) { $pc8 = 25; continue $sw8; }
                    if (this.FH != r7.FH) { $pc8 = 25; continue $sw8; }
                    return true;
                }
                case 25: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 17: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 21; continue $sw9; }
                    abcd.wu.j6(th, -2418983212377143529L, this);
                    $pc9 = 21; continue $sw9;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-2418983212377143529L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    r2 = "";
                    if (this.v5 == false) { $pc9 = 10; continue $sw9; }
                    try {
                        r2 = "Shift+";
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    if (this.Zo == false) { $pc9 = 13; continue $sw9; }
                    try {
                        r2 = r2 + "Ctrl+";
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    if (this.VH == false) { $pc9 = 15; continue $sw9; }
                    try {
                        r2 = r2 + "Alt+";
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 17; continue $sw9;
                    }
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    return r2 + v5();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
