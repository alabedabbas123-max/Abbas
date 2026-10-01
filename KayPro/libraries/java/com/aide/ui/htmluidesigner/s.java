package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class s implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity.a FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.s.class, 38387212539063993L, 1714274317547483789L);
    }

    s(com.aide.ui.htmluidesigner.WebDesignActivity.a r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -5478199116684848488L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1217312236897806285L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1217312236897806285L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L7
    }
}
