package com.aide.ui.views;

@abcd.Interfacexu
class l extends android.animation.AnimatorListenerAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    @abcd.Interfacevu
    final com.aide.ui.views.CodeEditTextScrollView Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.l.class, 1527178060401062972L, -2223054920292895745L);
    }

    l(com.aide.ui.views.CodeEditTextScrollView r1, java.lang.Runnable r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -2838345783307714000L)
    public void onAnimationEnd(android.animation.Animator r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -843391886426008972L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-843391886426008972L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH == null) goto L17;
        this.FH.run();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
