package com.aide.ui.activities;

@abcd.Interfacexu
class V implements android.view.View.OnFocusChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.V.class, 3404442532748635224L, -4321179414784815483L);
    }

    V(com.aide.ui.activities.TrainerCourseActivity r1, android.view.View r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 5325654333745505067L)
    public void onFocusChange(android.view.View r13, boolean r14) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 3612437317759635144L, this, r13, new java.lang.Boolean(r14));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(3612437317759635144L, this, r13, new java.lang.Boolean(r14));     // Catch: java.lang.Throwable -> L10
    L6:
        if (r14 == false) goto L8;
        android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation(1.0f, 1.05f, 1.0f, 1.05f, 1, 0.5f, 1, 0.5f);     // Catch: java.lang.Throwable -> L10
        r11.setDuration(400);     // Catch: java.lang.Throwable -> L10
        r11.setFillAfter(true);     // Catch: java.lang.Throwable -> L10
        this.FH.startAnimation(r11);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        android.view.animation.ScaleAnimation r12 = new android.view.animation.ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);     // Catch: java.lang.Throwable -> L10
        r12.setDuration(400);     // Catch: java.lang.Throwable -> L10
        r12.setFillAfter(true);     // Catch: java.lang.Throwable -> L10
        this.FH.startAnimation(r12);     // Catch: java.lang.Throwable -> L10
    }
}
