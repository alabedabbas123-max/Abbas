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
    L32:
        th = move-exception;
        if (DW == false) goto L37;
        abcd.wu.j6(th, -101413971107968681L, this, r7);
    L37:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-101413971107968681L, this, r7);     // Catch: java.lang.Throwable -> L32
    L6:
        java.util.List<abcd.InterfaceWl> r2 = this.FH.PH.getCustomEditorCommands();     // Catch: java.lang.Throwable -> L32
        if (r2 == null) goto L19;
        java.util.Iterator<abcd.InterfaceWl> r3 = r2.iterator();     // Catch: java.lang.Throwable -> L32
    L10:
        if (r3.hasNext() == false) goto L19;
        abcd.InterfaceWl r4 = r3.next();     // Catch: java.lang.Throwable -> L32
        java.util.List<com.aide.common.ClassU> r5 = this.FH.PH.j6(r4);     // Catch: java.lang.Throwable -> L32
        if (r5 == null) goto L10;
        java.util.Iterator<com.aide.common.ClassU> r6 = r5.iterator();     // Catch: java.lang.Throwable -> L32
    L15:
        if (r6.hasNext() == false) goto L10;
        if (r6.next().j6(r7) == false) goto L15;
        return r4;
    L19:
        java.util.Iterator<abcd.InterfaceWl> r8 = this.FH.PH.getBasicEditorCommands().iterator();     // Catch: java.lang.Throwable -> L32
    L20:
        if (r8.hasNext() == false) goto L30;
        abcd.InterfaceWl r9 = r8.next();     // Catch: java.lang.Throwable -> L32
        java.util.List<com.aide.common.ClassU> r10 = this.FH.PH.j6(r9);     // Catch: java.lang.Throwable -> L32
        if (r10 == null) goto L20;
        java.util.Iterator<com.aide.common.ClassU> r11 = r10.iterator();     // Catch: java.lang.Throwable -> L32
    L26:
        if (r11.hasNext() == false) goto L20;
        if (r11.next().j6(r7) == false) goto L26;
        return r9;
    L30:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = -863256365000365000L)
    public boolean j6(com.aide.common.ClassU r6) {
    L29:
        th = move-exception;
        if (DW == false) goto L33;
        abcd.wu.j6(th, 6512284474480749371L, this, r6);
    L33:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6512284474480749371L, this, r6);     // Catch: java.lang.Throwable -> L29
    L6:
        int r2 = r6.DW();     // Catch: java.lang.Throwable -> L29
        if (r2 != 96) goto L9;
    L27:
        this.FH.PH.Mr();     // Catch: java.lang.Throwable -> L29
        return true;
    L9:
        if (r2 == 23) goto L27;
        abcd.InterfaceWl r3 = DW(r6);     // Catch: java.lang.Throwable -> L29
        if (r3 == null) goto L18;
        if (r3.isEnabled() == false) goto L16;
        r3.run();     // Catch: java.lang.Throwable -> L29
    L16:
        return true;
    L18:
        if (r6.FH() == false) goto L22;
        this.FH.PH.j6(r6.j6());     // Catch: java.lang.Throwable -> L29
        return true;
    L22:
        if (r6.DW() != 66) goto L26;
        this.FH.PH.j6('\n');     // Catch: java.lang.Throwable -> L29
        return true;
    L26:
        return this.FH.PH.j6(r6);
    }
}
