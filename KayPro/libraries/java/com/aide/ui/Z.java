package com.aide.ui;

@abcd.Interfacexu
public class Z {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2673557389408368568L)
    private int FH;

    @abcd.Interfaceru(field = 995749408906923615L)
    private com.aide.ui.MainActivity Hw;

    @abcd.Interfaceru(field = 2848292792606770712L)
    private boolean VH;

    @abcd.Interfaceru(field = -970253835911781660L)
    private android.widget.PopupMenu Zo;

    @abcd.Interfaceru(field = 1001059706434660995L)
    private android.view.ActionMode v5;

    static {
        abcd.wu.j6(com.aide.ui.Z.class, -583473860859722665L, -583473860859722665L);
    }

    public Z(com.aide.ui.MainActivity r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 5203549328229951309L, null, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(5203549328229951309L, null, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.Hw = r8;
                        this.FH = r9;
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

    static com.aide.ui.MainActivity DW(com.aide.ui.Z r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = 3738585348802249921L)
    private void DW(android.view.MenuItem r9) {
        int r2 = 0;
        int r3 = 0;
        abcd.InterfaceYl r4 = null;
        boolean r6 = false;
        com.aide.engine.SyntaxError r5 = null;
        com.aide.engine.SyntaxError r7 = null;
        abcd.Interface_l r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 35: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 39; continue $sw1; }
                    abcd.wu.j6(th, -1755407012901552465L, this, r9);
                    $pc1 = 39; continue $sw1;
                }
                case 39: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1755407012901552465L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = r9.getItemId();
                        r3 = j6(r2);
                        r4 = com.aide.ui.V.DW(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    r6 = true;
                    if (r2 != com.almlkaide.kaypro.R.id.editorMenuFix) { $pc1 = 17; continue $sw1; }
                    try {
                        r5 = FH();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    if (r5 != null) { $pc1 = 11; continue $sw1; }
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    r6 = false;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    try {
                        r9.setVisible(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    return;
                }
                case 11: {
                    if (r5.tp == null) { $pc1 = 15; continue $sw1; }
                    if (r5.tp.length <= 0) { $pc1 = 15; continue $sw1; }
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    if (r3 < 0) { $pc1 = 26; continue $sw1; }
                    try {
                        r7 = FH();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    if (r7 != null) { $pc1 = 21; continue $sw1; }
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    try {
                        r9.setVisible(false);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    return;
                }
                case 21: {
                    if (r7.tp == null) { $pc1 = 25; continue $sw1; }
                    if (r7.tp.length <= r3) { $pc1 = 25; continue $sw1; }
                    try {
                        r9.setTitle(r7.tp[r3]);
                        r9.setVisible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    return;
                }
                case 26: {
                    if (r4 == null) { $pc1 = 44; continue $sw1; }
                    try {
                        r9.setEnabled(r4.isEnabled());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    if ((r4 instanceof abcd.Interface_l) == false) { $pc1 = 45; continue $sw1; }
                    try {
                        r8 = (abcd.Interface_l) r4;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    if (this.VH == false) { $pc1 = 33; continue $sw1; }
                    r6 = false;
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    try {
                        r9.setVisible(r8.j6(r6));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 35; continue $sw1;
                    }
                    return;
                }
                case 45: {
                    return;
                }
                case 44: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int FH(com.aide.ui.Z r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = 5171501588721899172L)
    private com.aide.engine.SyntaxError FH() {
        abcd.Tl r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -5209578430772988200L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-5209578430772988200L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.U.lg().J8().getCurrentFileSpan();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return com.aide.ui.U.we().DW(r2.FH, r2.Hw, r2.v5, r2.Zo, r2.VH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 567630484326148628L)
    private int j6(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 21: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 25; continue $sw3; }
                    abcd.wu.j6(th, 229372328685032568L, this, new java.lang.Integer(r5));
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(229372328685032568L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 21; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    switch(r5) {
                        case com.almlkaide.kaypro.R.id.editorMenuFix0: { $pc3 = 19; continue $sw3; }
                        case com.almlkaide.kaypro.R.id.editorMenuFix1: { $pc3 = 17; continue $sw3; }
                        case com.almlkaide.kaypro.R.id.editorMenuFix2: { $pc3 = 15; continue $sw3; }
                        case com.almlkaide.kaypro.R.id.editorMenuFix3: { $pc3 = 13; continue $sw3; }
                        case com.almlkaide.kaypro.R.id.editorMenuFix4: { $pc3 = 11; continue $sw3; }
                        case com.almlkaide.kaypro.R.id.editorMenuFix5: { $pc3 = 9; continue $sw3; }
                        default: { $pc3 = 7; continue $sw3; }
                    };
                }
                case 7: {
                    return -1;
                }
                case 9: {
                    return 5;
                }
                case 11: {
                    return 4;
                }
                case 13: {
                    return 3;
                }
                case 15: {
                    return 2;
                }
                case 17: {
                    return 1;
                }
                case 19: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.view.ActionMode j6(com.aide.ui.Z r0, android.view.ActionMode r1) {
        r0.v5 = r1;
        return r1;
    }

    static android.widget.PopupMenu j6(com.aide.ui.Z r0) {
        return r0.Zo;
    }

    static android.widget.PopupMenu j6(com.aide.ui.Z r0, android.widget.PopupMenu r1) {
        r0.Zo = r1;
        return r1;
    }

    @abcd.Interfacesu(method = -3672315906798082425L)
    private boolean j6(android.view.Menu r6) {
        int r2 = 0;
        android.view.MenuItem r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 15: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 20; continue $sw4; }
                    abcd.wu.j6(th, 2678924594937412665L, this, r6);
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2678924594937412665L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    r2 = 0;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r2 >= r6.size()) { $pc4 = 13; continue $sw4; }
                    try {
                        r3 = r6.getItem(r2);
                        DW(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if (r3.getSubMenu() == null) { $pc4 = 12; continue $sw4; }
                    try {
                        j6(r3.getSubMenu());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r2 = r2 + 1;
                    { $pc4 = 7; continue $sw4; }
                }
                case 13: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1131019222019471785L)
    private boolean j6(android.view.MenuItem r6) {
        int r2 = 0;
        int r3 = 0;
        abcd.InterfaceYl r4 = null;
        com.aide.engine.SyntaxError r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 22: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 26; continue $sw5; }
                    abcd.wu.j6(th, 1699403057877220933L, this, r6);
                    $pc5 = 26; continue $sw5;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(1699403057877220933L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 22; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        r2 = r6.getItemId();
                        r3 = j6(r2);
                        r4 = com.aide.ui.V.DW(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 22; continue $sw5;
                    }
                    if (r3 < 0) { $pc5 = 17; continue $sw5; }
                    try {
                        r5 = FH();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 22; continue $sw5;
                    }
                    if (r5 != null) { $pc5 = 11; continue $sw5; }
                    return true;
                }
                case 11: {
                    if (r5.tp != null) { $pc5 = 13; continue $sw5; }
                    return true;
                }
                case 13: {
                    if (r5.tp.length <= r3) { $pc5 = 30; continue $sw5; }
                    try {
                        com.aide.ui.U.lg().cb();
                        com.aide.ui.U.EQ().j6(r5, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 22; continue $sw5;
                    }
                    return true;
                }
                case 30: {
                    return true;
                }
                case 17: {
                    if (r4 == null) { $pc5 = 20; continue $sw5; }
                    try {
                        abcd.F.j6("Quick Action Menu: " + r6.getTitle());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 22; continue $sw5;
                    }
                    return r4.run();
                }
                case 20: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.aide.ui.Z r0, android.view.Menu r1) {
        return r0.j6(r1);
    }

    static boolean j6(com.aide.ui.Z r0, android.view.MenuItem r1) {
        return r0.j6(r1);
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 10: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 14; continue $sw6; }
                    abcd.wu.j6(th, 1749789399746372621L, this);
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(1749789399746372621L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 10; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (this.v5 == null) { $pc6 = 17; continue $sw6; }
                    try {
                        this.v5.invalidate();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 10; continue $sw6;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 10: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 14; continue $sw7; }
                    abcd.wu.j6(th, -2241692135330717036L, this);
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 7; continue $sw7; }
                    try {
                        abcd.wu.j6(-2241692135330717036L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (this.v5 == null) { $pc7 = 17; continue $sw7; }
                    try {
                        this.v5.finish();
                        this.v5 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.view.View r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 10: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 14; continue $sw8; }
                    abcd.wu.j6(th, -2252974524077968692L, this, r8, new java.lang.Boolean(r9));
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(-2252974524077968692L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        j6();
                        this.VH = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    if (this.Zo == null) { $pc8 = 8; continue $sw8; }
                    try {
                        this.Zo.dismiss();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    try {
                        new android.os.Handler().post(new com.aide.ui.X(this, r8));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 10: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 14; continue $sw9; }
                    abcd.wu.j6(th, -1095756205709844720L, this, new java.lang.Boolean(r5));
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 7; continue $sw9; }
                    try {
                        abcd.wu.j6(-1095756205709844720L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 10; continue $sw9;
                    }
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (this.v5 != null) { $pc9 = 17; continue $sw9; }
                    try {
                        this.VH = r5;
                        this.v5 = this.Hw.startActionMode(new com.aide.ui.Y(this));
                        this.Hw.v5(true);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 10; continue $sw9;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
