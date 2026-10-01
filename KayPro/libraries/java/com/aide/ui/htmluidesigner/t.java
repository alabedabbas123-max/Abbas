package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class t implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity.a FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.t.class, 38387212539063993L, 1714406517204890720L);
    }

    t(com.aide.ui.htmluidesigner.WebDesignActivity.a r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -625235851683802953L)
    public void onCancel(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 719685214074649264L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(719685214074649264L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        r5.dismiss();     // Catch: java.lang.Throwable -> L8
    }
}
