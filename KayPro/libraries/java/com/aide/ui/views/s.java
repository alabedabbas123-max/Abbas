package com.aide.ui.views;

@abcd.Interfacexu
class s extends android.animation.AnimatorListenerAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;

    @abcd.Interfacevu
    final com.aide.ui.views.SplitView Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.s.class, 786228931312646151L, 5732301071884813023L);
    }

    s(com.aide.ui.views.SplitView r1, java.lang.Runnable r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3731465117122560333L)
    public void onAnimationEnd(android.animation.Animator r5) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -2777247055128298063L, this, r5);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2777247055128298063L, this, r5);     // Catch: java.lang.Throwable -> L13
    L6:
        com.aide.ui.views.SplitView.access$202(this.Hw, false);     // Catch: java.lang.Throwable -> L13
        com.aide.ui.views.SplitView.access$300(this.Hw);     // Catch: java.lang.Throwable -> L13
        if (com.aide.ui.views.SplitView.access$100(this.Hw) == null) goto L10;
        com.aide.ui.views.SplitView.access$100(this.Hw).j6(com.aide.ui.views.SplitView.access$200(this.Hw));     // Catch: java.lang.Throwable -> L13
    L10:
        if (this.FH == null) goto L20;
        this.FH.run();     // Catch: java.lang.Throwable -> L13
        return;
    }
}
