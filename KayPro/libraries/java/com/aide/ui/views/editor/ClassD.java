package com.aide.ui.views.editor;

@abcd.Interfacexu
class ClassD implements com.aide.ui.views.editor.ra.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.StringBuffer FH;
    final boolean Hw;

    @abcd.Interfacevu
    final com.aide.ui.views.editor.ClassG VH;
    final boolean Zo;
    final int v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassD.class, 701484051258711375L, 4066963683342623340L);
    }

    ClassD(com.aide.ui.views.editor.ClassG r1, java.lang.StringBuffer r2, boolean r3, int r4, boolean r5) {
        this.VH = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
        this.Zo = r5;
    }

    @Override
    @abcd.Interfacesu(method = -2290258381371006509L)
    public void DW(int r10, char[] r11, int r12, int r13) {
        int r0 = 0;
        int r3 = 0;
        int r4 = 0;
        char r6 = 0;
        int r5 = 0;
        int r7 = 0;
        int r8 = 0;
        char[] r1 = null;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 49: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 54; continue $sw0; }
                    abcd.wu.j6(th, -1478195853923552896L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc0 = 54; continue $sw0;
                }
                case 54: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-1478195853923552896L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH.setLength(0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    if (this.Hw == false) { $pc0 = 35; continue $sw0; }
                    r0 = r12;
                    r3 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    try {
                        r4 = r12 + r13;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    if (r0 >= r4) { $pc0 = 20; continue $sw0; }
                    try {
                        r6 = r11[r0];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    if (r6 == '\t') { $pc0 = 15; continue $sw0; }
                    if (r6 != ' ') { $pc0 = 20; continue $sw0; }
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    try {
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    { $pc0 = 8; continue $sw0; }
                }
                case 15: {
                    try {
                        r5 = this.v5 - (r3 % this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    if (r5 != 0) { $pc0 = 18; continue $sw0; }
                    try {
                        r5 = this.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    try {
                        r3 = r3 + r5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    r7 = 0;
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    if (r7 >= (r3 / this.v5)) { $pc0 = 24; continue $sw0; }
                    try {
                        this.FH.append('\t');
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    { $pc0 = 22; continue $sw0; }
                }
                case 24: {
                    r8 = 0;
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    if (r8 >= (r3 % this.v5)) { $pc0 = 28; continue $sw0; }
                    try {
                        this.FH.append(' ');
                        r8 = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    $pc0 = 28; continue $sw0;
                }
                case 28: {
                    if (r0 >= r4) { $pc0 = 45; continue $sw0; }
                    if (java.lang.Character.isISOControl(r11[r0]) == true) { $pc0 = 32; continue $sw0; }
                    $pc0 = 33; continue $sw0;
                }
                case 33: {
                    try {
                        this.FH.append(r11[r0]);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    try {
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    { $pc0 = 28; continue $sw0; }
                }
                case 32: {
                    if (r11[r0] != '\t') { $pc0 = 34; continue $sw0; }
                    $pc0 = 45; continue $sw0;
                }
                case 45: {
                    if (this.FH.length() == 0) { $pc0 = 47; continue $sw0; }
                    try {
                        r1 = new char[this.FH.length()];
                        this.FH.getChars(0, this.FH.length(), r1, 0);
                        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.j6(this.VH, r1));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    return;
                }
                case 47: {
                    try {
                        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.DW(this.VH));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    return;
                }
                case 35: {
                    r2 = r12;
                    $pc0 = 37; continue $sw0;
                }
                case 37: {
                    if (r2 >= (r12 + r13)) { $pc0 = 45; continue $sw0; }
                    if (java.lang.Character.isISOControl(r11[r2]) == true) { $pc0 = 41; continue $sw0; }
                    $pc0 = 42; continue $sw0;
                }
                case 42: {
                    try {
                        this.FH.append(r11[r2]);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    $pc0 = 43; continue $sw0;
                }
                case 43: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 49; continue $sw0;
                    }
                    { $pc0 = 37; continue $sw0; }
                }
                case 41: {
                    if (r11[r2] != '\t') { $pc0 = 43; continue $sw0; }
                    { $pc0 = 42; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2024488279564409327L)
    public void j6(java.lang.String r5) {
        boolean r6 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -954518513574271360L, this, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-954518513574271360L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r6 = this.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 270058414691690891L)
    public boolean j6(int r10, char[] r11, int r12, int r13) {
        int r0 = 0;
        int r3 = 0;
        int r4 = 0;
        char r6 = 0;
        int r5 = 0;
        int r7 = 0;
        int r8 = 0;
        char[] r1 = null;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 50: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 55; continue $sw2; }
                    abcd.wu.j6(th, -4508556052710039960L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc2 = 55; continue $sw2;
                }
                case 55: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-4508556052710039960L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        this.FH.setLength(0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    if (this.Hw == false) { $pc2 = 35; continue $sw2; }
                    r0 = r12;
                    r3 = 0;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    try {
                        r4 = r12 + r13;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    if (r0 >= r4) { $pc2 = 20; continue $sw2; }
                    try {
                        r6 = r11[r0];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    if (r6 == '\t') { $pc2 = 15; continue $sw2; }
                    if (r6 != ' ') { $pc2 = 20; continue $sw2; }
                    try {
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    try {
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    { $pc2 = 8; continue $sw2; }
                }
                case 15: {
                    try {
                        r5 = this.v5 - (r3 % this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    if (r5 != 0) { $pc2 = 18; continue $sw2; }
                    try {
                        r5 = this.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    try {
                        r3 = r3 + r5;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r7 = 0;
                    $pc2 = 22; continue $sw2;
                }
                case 22: {
                    if (r7 >= (r3 / this.v5)) { $pc2 = 24; continue $sw2; }
                    try {
                        this.FH.append('\t');
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    { $pc2 = 22; continue $sw2; }
                }
                case 24: {
                    r8 = 0;
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    if (r8 >= (r3 % this.v5)) { $pc2 = 28; continue $sw2; }
                    try {
                        this.FH.append(' ');
                        r8 = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    $pc2 = 28; continue $sw2;
                }
                case 28: {
                    if (r0 >= r4) { $pc2 = 45; continue $sw2; }
                    if (java.lang.Character.isISOControl(r11[r0]) == true) { $pc2 = 32; continue $sw2; }
                    $pc2 = 33; continue $sw2;
                }
                case 33: {
                    try {
                        this.FH.append(r11[r0]);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    try {
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    { $pc2 = 28; continue $sw2; }
                }
                case 32: {
                    if (r11[r0] != '\t') { $pc2 = 34; continue $sw2; }
                    $pc2 = 45; continue $sw2;
                }
                case 45: {
                    if (this.FH.length() == 0) { $pc2 = 47; continue $sw2; }
                    try {
                        r1 = new char[this.FH.length()];
                        this.FH.getChars(0, this.FH.length(), r1, 0);
                        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.j6(this.VH, r1));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    return true;
                }
                case 47: {
                    try {
                        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.DW(this.VH));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    return true;
                }
                case 35: {
                    r2 = r12;
                    $pc2 = 37; continue $sw2;
                }
                case 37: {
                    if (r2 >= (r12 + r13)) { $pc2 = 45; continue $sw2; }
                    if (java.lang.Character.isISOControl(r11[r2]) == true) { $pc2 = 41; continue $sw2; }
                    $pc2 = 42; continue $sw2;
                }
                case 42: {
                    try {
                        this.FH.append(r11[r2]);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    $pc2 = 43; continue $sw2;
                }
                case 43: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 50; continue $sw2;
                    }
                    { $pc2 = 37; continue $sw2; }
                }
                case 41: {
                    if (r11[r2] != '\t') { $pc2 = 43; continue $sw2; }
                    { $pc2 = 42; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
