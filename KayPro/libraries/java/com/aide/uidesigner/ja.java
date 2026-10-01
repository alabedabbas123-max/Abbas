package com.aide.uidesigner;

@abcd.Interfacexu
class ja implements com.almlkaide.kaypro.manifesteditor.colorpicker.ColorPickerDialog.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ja.class, 2051778340695604592L, 2148982836810974005L);
    }

    ja(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @abcd.Interfacesu(method = -1835257434871494119L)
    public void a(int r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3596944155035310880L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3596944155035310880L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.j6(this.Hw, r9);     // Catch: java.lang.Throwable -> L7
    }
}
