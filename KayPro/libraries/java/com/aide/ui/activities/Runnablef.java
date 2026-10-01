package com.aide.ui.activities;

@abcd.Interfacexu
class Runnablef implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.AndroidTrainerActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.Runnablef.class, 309968735317025088L, -727466108285928357L);
    }

    Runnablef(com.aide.ui.activities.AndroidTrainerActivity r1, android.view.View r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -800958751669565573L)
    public void run() {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 5323450954276543200L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(5323450954276543200L, this);     // Catch: java.lang.Throwable -> L13
    L7:
        if (com.aide.ui.U.sh() == true) goto L20;
        com.aide.ui.U.SI().er();     // Catch: java.lang.Throwable -> L13
        if (this.Hw.getIntent().getBooleanExtra("EXTRA_PLAYGROUND", false) == false) goto L11;
        return;
    L11:
        android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);     // Catch: java.lang.Throwable -> L13
        r2.setDuration(500);     // Catch: java.lang.Throwable -> L13
        this.FH.startAnimation(r2);     // Catch: java.lang.Throwable -> L13
        this.FH.setVisibility(0);     // Catch: java.lang.Throwable -> L13
        r2.setAnimationListener(new com.aide.ui.activities.AnimationAnimationListenerc(this));     // Catch: java.lang.Throwable -> L13
        new android.os.Handler().postDelayed(new com.aide.ui.activities.Runnablee(this), this.Hw.getIntent().getIntExtra("EXTRA_DURATION", 10) * 1000);     // Catch: java.lang.Throwable -> L13
        return;
    }
}
