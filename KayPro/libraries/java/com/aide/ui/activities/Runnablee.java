package com.aide.ui.activities;

@abcd.Interfacexu
class Runnablee implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.Runnablef FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.Runnablee.class, 309968735317025088L, -2463022478269158845L);
    }

    Runnablee(com.aide.ui.activities.Runnablef r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1992263547788468235L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5326613179874860365L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5326613179874860365L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);     // Catch: java.lang.Throwable -> L8
        r2.setAnimationListener(new com.aide.ui.activities.AnimationAnimationListenerd(this));     // Catch: java.lang.Throwable -> L8
        r2.setDuration(500);     // Catch: java.lang.Throwable -> L8
        this.FH.FH.startAnimation(r2);     // Catch: java.lang.Throwable -> L8
    }
}
