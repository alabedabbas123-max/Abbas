package com.aide.ui.activities;

@abcd.Interfacexu
class ClassU implements android.widget.CompoundButton.OnCheckedChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassU.class, -667729815873843261L, 3104938722259391412L);
    }

    ClassU(com.aide.ui.activities.GotoBrowserActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 393531572825580672L)
    public void onCheckedChanged(android.widget.CompoundButton r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3468038664918372864L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3468038664918372864L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.activities.GotoBrowserActivity.DW(this.FH);     // Catch: java.lang.Throwable -> L7
        com.aide.ui.activities.GotoBrowserActivity.j6(this.FH);     // Catch: java.lang.Throwable -> L7
    }
}
