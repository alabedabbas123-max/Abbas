package com.aide.ui;

@abcd.Interfacexu
class Fa implements android.view.animation.Animation.AnimationListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.ui.Ga Hw;

    static {
        abcd.wu.j6(com.aide.ui.Fa.class, -4716673154304342080L, -1926217090178499573L);
    }

    Fa(com.aide.ui.Ga r1, android.view.View r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 4909249266232637619L)
    public void onAnimationEnd(android.view.animation.Animation r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2096774293128379227L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2096774293128379227L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.setVisibility(8);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 5264970898005224163L)
    public void onAnimationRepeat(android.view.animation.Animation r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 6157552769907693207L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(6157552769907693207L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = -167251094262227280L)
    public void onAnimationStart(android.view.animation.Animation r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 5729828160704637600L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(5729828160704637600L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }
}
