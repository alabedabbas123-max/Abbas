package com.aide.ui.views;

@abcd.Interfacexu
class r extends android.animation.AnimatorListenerAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.views.SplitView FH;

    static {
        abcd.wu.j6(com.aide.ui.views.r.class, 786228931312646151L, 5732171316550764988L);
    }

    r(com.aide.ui.views.SplitView r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -4667583895997088085L)
    public void onAnimationEnd(android.animation.Animator r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2834547301221155835L, this, r7);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2834547301221155835L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.views.SplitView.access$002(this.FH, -1);     // Catch: java.lang.Throwable -> L8
        this.FH.postDelayed(new com.aide.ui.views.q(this), 50);     // Catch: java.lang.Throwable -> L8
    }
}
