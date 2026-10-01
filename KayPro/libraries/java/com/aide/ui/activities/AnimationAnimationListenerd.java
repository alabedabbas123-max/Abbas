package com.aide.ui.activities;

@abcd.Interfacexu
class AnimationAnimationListenerd implements android.view.animation.Animation.AnimationListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.Runnablee FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.AnimationAnimationListenerd.class, 309968735317025088L, 26755660456090148L);
    }

    AnimationAnimationListenerd(com.aide.ui.activities.Runnablee r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -3054019432318858416L)
    public void onAnimationEnd(android.view.animation.Animation r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 136243751795101608L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(136243751795101608L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.FH.FH.setVisibility(8);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -7387041530071179680L)
    public void onAnimationRepeat(android.view.animation.Animation r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5474985320365713888L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-5474985320365713888L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 6587300782586216809L)
    public void onAnimationStart(android.view.animation.Animation r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4350575209200944031L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-4350575209200944031L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }
}
