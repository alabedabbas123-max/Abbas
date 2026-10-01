package com.aide.ui.activities;

@abcd.Interfacexu
class ViewOnClickListenerv implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.ViewOnClickListenerv.class, -667729815873843261L, 3105027456463179819L);
    }

    ViewOnClickListenerv(com.aide.ui.activities.GotoBrowserActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 354948049583652448L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3923425854642707217L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3923425854642707217L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.finish();     // Catch: java.lang.Throwable -> L8
    }
}
