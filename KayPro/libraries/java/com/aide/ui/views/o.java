package com.aide.ui.views;

@abcd.Interfacexu
class o extends android.animation.AnimatorListenerAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CodeEditTextScrollView FH;
    final com.aide.ui.views.CodeEditTextScrollView.a Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.o.class, -1411785762941269443L, -4372523855922039040L);
    }

    o(com.aide.ui.views.CodeEditTextScrollView.a r1, com.aide.ui.views.CodeEditTextScrollView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -3546821365743434445L)
    public void onAnimationEnd(android.animation.Animator r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 1866879545032684000L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1866879545032684000L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw.isVisible() == true) goto L9;
        return;
    L9:
        if (com.aide.ui.views.CodeEditTextScrollView.a.j6(this.Hw) == true) goto L20;
        r5.start();     // Catch: java.lang.Throwable -> L12
        return;
    }
}
