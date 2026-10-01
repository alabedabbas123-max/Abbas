package com.aide.common;

@abcd.Interfacexu
class ClassO implements com.aide.common.ColorPickerView.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;

    @abcd.Interfacevu
    final com.aide.common.ClassT Hw;

    static {
        abcd.wu.j6(com.aide.common.ClassO.class, 2649604467815608996L, 3887770723241029891L);
    }

    ClassO(com.aide.common.ClassT r1, android.widget.EditText r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3936204643325502720L)
    public void j6(int r8, java.lang.String r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -5387899819455754440L, this, new java.lang.Integer(r8), r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5387899819455754440L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L10
    L6:
        if (com.aide.common.ClassT.j6(this.Hw) == true) goto L8;
        com.aide.common.ClassT.DW(this.Hw, true);     // Catch: java.lang.Throwable -> L10
        this.FH.setText(r9);     // Catch: java.lang.Throwable -> L10
        com.aide.common.ClassT.DW(this.Hw, false);     // Catch: java.lang.Throwable -> L10
    L8:
        com.aide.common.ClassT.j6(this.Hw, r9);     // Catch: java.lang.Throwable -> L10
        com.aide.common.ClassT.j6(this.Hw, r8);     // Catch: java.lang.Throwable -> L10
    }
}
