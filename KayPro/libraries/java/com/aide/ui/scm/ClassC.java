package com.aide.ui.scm;

@abcd.Interfacexu
class ClassC implements com.aide.ui.views.editor.ra.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.ArrayList FH;
    final java.lang.StringBuilder Hw;

    @abcd.Interfacevu
    final com.aide.ui.scm.DiffView v5;

    static {
        abcd.wu.j6(com.aide.ui.scm.ClassC.class, -2208139259786690749L, 187012877605898848L);
    }

    ClassC(com.aide.ui.scm.DiffView r1, java.util.ArrayList r2, java.lang.StringBuilder r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 214371140683706133L)
    public void DW(int r10, char[] r11, int r12, int r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 5047220549151579136L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5047220549151579136L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.add(new java.lang.String(r11, r12, r13));     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = -4497839733718405071L)
    public void j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -7688579964517937224L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-7688579964517937224L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.append(r5);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -5077784443652718779L)
    public boolean j6(int r10, char[] r11, int r12, int r13) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5822832530979006048L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5822832530979006048L, this, new java.lang.Integer(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L8
    L5:
        this.FH.add(new java.lang.String(r11, r12, r13));     // Catch: java.lang.Throwable -> L8
        return true;
    }
}
