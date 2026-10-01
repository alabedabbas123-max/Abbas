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
    L49:
        th = move-exception;
        if (DW == false) goto L54;
        abcd.wu.j6(th, -1478195853923552896L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
    L54:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1478195853923552896L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L49
    L5:
        this.FH.setLength(0);     // Catch: java.lang.Throwable -> L49
        if (this.Hw == false) goto L35;
        int r0 = r12;
        int r3 = 0;
    L8:
        int r4 = r12 + r13;     // Catch: java.lang.Throwable -> L49
        if (r0 >= r4) goto L20;
        char r6 = r11[r0];     // Catch: java.lang.Throwable -> L49
        if (r6 == '\t') goto L15;
        if (r6 != ' ') goto L20;
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L49
    L19:
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L49
        goto L8
    L15:
        int r5 = this.v5 - (r3 % this.v5);     // Catch: java.lang.Throwable -> L49
        if (r5 != 0) goto L18;
        r5 = this.v5;     // Catch: java.lang.Throwable -> L49
    L18:
        r3 = r3 + r5;     // Catch: java.lang.Throwable -> L49
    L20:
        int r7 = 0;
    L22:
        if (r7 >= (r3 / this.v5)) goto L24;
        this.FH.append('\t');     // Catch: java.lang.Throwable -> L49
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L49
        goto L22
    L24:
        int r8 = 0;
    L26:
        if (r8 >= (r3 % this.v5)) goto L28;
        this.FH.append(' ');     // Catch: java.lang.Throwable -> L49
        r8 = r8 + 1;     // Catch: java.lang.Throwable -> L49
    L28:
        if (r0 >= r4) goto L45;
        if (java.lang.Character.isISOControl(r11[r0]) == true) goto L32;
    L33:
        this.FH.append(r11[r0]);     // Catch: java.lang.Throwable -> L49
    L34:
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L49
        goto L28
    L32:
        if (r11[r0] != '\t') goto L34;
    L45:
        if (this.FH.length() == 0) goto L47;
        char[] r1 = new char[this.FH.length()];     // Catch: java.lang.Throwable -> L49
        this.FH.getChars(0, this.FH.length(), r1, 0);     // Catch: java.lang.Throwable -> L49
        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.j6(this.VH, r1));     // Catch: java.lang.Throwable -> L49
        return;
    L47:
        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.DW(this.VH));     // Catch: java.lang.Throwable -> L49
        return;
    L35:
        int r2 = r12;
    L37:
        if (r2 >= (r12 + r13)) goto L45;
        if (java.lang.Character.isISOControl(r11[r2]) == true) goto L41;
    L42:
        this.FH.append(r11[r2]);     // Catch: java.lang.Throwable -> L49
    L43:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L49
        goto L37
    L41:
        if (r11[r2] != '\t') goto L43;
        goto L42
    }

    @Override
    @abcd.Interfacesu(method = 2024488279564409327L)
    public void j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -954518513574271360L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-954518513574271360L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        boolean r6 = this.Zo;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 270058414691690891L)
    public boolean j6(int r10, char[] r11, int r12, int r13) {
    L50:
        th = move-exception;
        if (DW == false) goto L55;
        abcd.wu.j6(th, -4508556052710039960L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
    L55:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4508556052710039960L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L50
    L5:
        this.FH.setLength(0);     // Catch: java.lang.Throwable -> L50
        if (this.Hw == false) goto L35;
        int r0 = r12;
        int r3 = 0;
    L8:
        int r4 = r12 + r13;     // Catch: java.lang.Throwable -> L50
        if (r0 >= r4) goto L20;
        char r6 = r11[r0];     // Catch: java.lang.Throwable -> L50
        if (r6 == '\t') goto L15;
        if (r6 != ' ') goto L20;
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L50
    L19:
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L50
        goto L8
    L15:
        int r5 = this.v5 - (r3 % this.v5);     // Catch: java.lang.Throwable -> L50
        if (r5 != 0) goto L18;
        r5 = this.v5;     // Catch: java.lang.Throwable -> L50
    L18:
        r3 = r3 + r5;     // Catch: java.lang.Throwable -> L50
    L20:
        int r7 = 0;
    L22:
        if (r7 >= (r3 / this.v5)) goto L24;
        this.FH.append('\t');     // Catch: java.lang.Throwable -> L50
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L50
        goto L22
    L24:
        int r8 = 0;
    L26:
        if (r8 >= (r3 % this.v5)) goto L28;
        this.FH.append(' ');     // Catch: java.lang.Throwable -> L50
        r8 = r8 + 1;     // Catch: java.lang.Throwable -> L50
    L28:
        if (r0 >= r4) goto L45;
        if (java.lang.Character.isISOControl(r11[r0]) == true) goto L32;
    L33:
        this.FH.append(r11[r0]);     // Catch: java.lang.Throwable -> L50
    L34:
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L50
        goto L28
    L32:
        if (r11[r0] != '\t') goto L34;
    L45:
        if (this.FH.length() == 0) goto L47;
        char[] r1 = new char[this.FH.length()];     // Catch: java.lang.Throwable -> L50
        this.FH.getChars(0, this.FH.length(), r1, 0);     // Catch: java.lang.Throwable -> L50
        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.j6(this.VH, r1));     // Catch: java.lang.Throwable -> L50
        return true;
    L47:
        com.aide.ui.views.editor.ClassG.j6(this.VH).addElement(com.aide.ui.views.editor.ClassG.DW(this.VH));     // Catch: java.lang.Throwable -> L50
        return true;
    L35:
        int r2 = r12;
    L37:
        if (r2 >= (r12 + r13)) goto L45;
        if (java.lang.Character.isISOControl(r11[r2]) == true) goto L41;
    L42:
        this.FH.append(r11[r2]);     // Catch: java.lang.Throwable -> L50
    L43:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L50
        goto L37
    L41:
        if (r11[r2] != '\t') goto L43;
        goto L42
    }
}
