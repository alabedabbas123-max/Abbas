package com.aide.ui;

@abcd.Interfacexu
class db implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final com.aide.ui.hb Hw;

    static {
        abcd.wu.j6(com.aide.ui.db.class, -1144715414290518888L, 5656184466746339040L);
    }

    db(com.aide.ui.hb r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 655390568105464912L)
    public void onShow(android.content.DialogInterface r7) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 878948551058042520L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(878948551058042520L, this, r7);     // Catch: java.lang.Throwable -> L13
    L6:
        android.view.View r2 = com.aide.ui.hb.j6(this.Hw).findViewById(this.FH.getResources().getIdentifier("android:id/title_template", null, null));     // Catch: java.lang.Throwable -> L13
        if (r2 == null) goto L9;
        r2.setBackgroundColor(-1);     // Catch: java.lang.Throwable -> L13
    L9:
        android.view.View r3 = com.aide.ui.hb.j6(this.Hw).findViewById(this.FH.getResources().getIdentifier("android:id/alertTitle", null, null));     // Catch: java.lang.Throwable -> L13
        if ((r3 instanceof android.widget.TextView) == false) goto L20;
        ((android.widget.TextView) r3).setTextColor(-4473925);     // Catch: java.lang.Throwable -> L13
        return;
    }
}
