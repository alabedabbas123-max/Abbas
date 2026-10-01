package com.aide.uidesigner;

@abcd.Interfacexu
class ViewOnFocusChangeListenerl implements android.view.View.OnFocusChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.TextView FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ViewOnFocusChangeListenerl.class, -2761603648942096159L, 1467829115778169480L);
    }

    ViewOnFocusChangeListenerl(com.aide.uidesigner.XmlLayoutDesignActivity r1, android.widget.TextView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3813137624418866304L)
    public void onFocusChange(android.view.View r13, boolean r14) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1656020100838463897L, this, r13, new java.lang.Boolean(r14));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(1656020100838463897L, this, r13, new java.lang.Boolean(r14));     // Catch: java.lang.Throwable -> L10
    L6:
        if (r14 == false) goto L8;
        android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.0f, 1, 0.5f);     // Catch: java.lang.Throwable -> L10
        r11.setDuration(400);     // Catch: java.lang.Throwable -> L10
        r11.setFillAfter(true);     // Catch: java.lang.Throwable -> L10
        this.FH.startAnimation(r11);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        android.view.animation.ScaleAnimation r12 = new android.view.animation.ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.0f, 1, 0.5f);     // Catch: java.lang.Throwable -> L10
        r12.setDuration(400);     // Catch: java.lang.Throwable -> L10
        r12.setFillAfter(true);     // Catch: java.lang.Throwable -> L10
        this.FH.startAnimation(r12);     // Catch: java.lang.Throwable -> L10
    }
}
