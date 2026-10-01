package com.aide.uidesigner;

@abcd.Interfacexu
class ViewOnClickListenerk implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.ViewOnClickListenerk.class, -2761603648942096159L, 1467792897139958025L);
    }

    ViewOnClickListenerk(com.aide.uidesigner.XmlLayoutDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -419947584690221016L)
    public void onClick(android.view.View r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2873650901344724160L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2873650901344724160L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.content.Intent r2 = new android.content.Intent();     // Catch: java.lang.Throwable -> L8
        r2.putExtra("EXTRA_TRAINER_ACTION", 1);     // Catch: java.lang.Throwable -> L8
        this.FH.setResult(-1, r2);     // Catch: java.lang.Throwable -> L8
        this.FH.finish();     // Catch: java.lang.Throwable -> L8
    }
}
