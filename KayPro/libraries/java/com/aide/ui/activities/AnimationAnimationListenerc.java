package com.aide.ui.activities;

@abcd.Interfacexu
class AnimationAnimationListenerc implements android.view.animation.Animation.AnimationListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.Runnablef FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.AnimationAnimationListenerc.class, 309968735317025088L, -2462980138410051264L);
    }

    AnimationAnimationListenerc(com.aide.ui.activities.Runnablef r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -19499406964874811L)
    public void onAnimationEnd(android.view.animation.Animation r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 275641263555757617L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(275641263555757617L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH.Hw.getWindow().getCurrentFocus() != null) goto L17;
        this.FH.FH.findViewById(com.almlkaide.kaypro.R.id.trainerToast).requestFocus();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = -2981726216772377735L)
    public void onAnimationRepeat(android.view.animation.Animation r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5250004009860509243L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-5250004009860509243L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1738586229885423564L)
    public void onAnimationStart(android.view.animation.Animation r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4150823927895613016L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-4150823927895613016L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }
}
