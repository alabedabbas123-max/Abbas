package com.aide.ui;

@abcd.Interfacexu
public class Ga {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -592614160844375331L)
    private boolean FH;

    @abcd.Interfaceru(field = -3168204921541507024L)
    private android.app.Activity Hw;

    @abcd.Interfaceru(field = 885063300650214400L)
    private int v5;

    static {
        abcd.wu.j6(com.aide.ui.Ga.class, -4716673154304342080L, -4716673154304342080L);
    }

    public Ga(android.app.Activity r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -421287799826278401L, null, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-421287799826278401L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = false;     // Catch: java.lang.Throwable -> L7
        this.Hw = r8;     // Catch: java.lang.Throwable -> L7
        this.v5 = r9;     // Catch: java.lang.Throwable -> L7
        j6().setVisibility(8);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -500308310504539232L)
    private android.view.View j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1084710385753499573L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1084710385753499573L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw.findViewById(this.v5);
    }

    public void j6(android.view.View.OnClickListener r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1395212869700332009L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1395212869700332009L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6().setOnClickListener(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(boolean r10) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 1175867164342060352L, this, new java.lang.Boolean(r10));
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1175867164342060352L, this, r10);     // Catch: java.lang.Throwable -> L13
    L6:
        android.view.View r2 = j6();     // Catch: java.lang.Throwable -> L13
        if (r10 == this.FH) goto L19;
        this.FH = r10;     // Catch: java.lang.Throwable -> L13
        if (this.FH == false) goto L11;
        android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, this.Hw.getResources().getDisplayMetrics().density * 60.0f, 0.0f);     // Catch: java.lang.Throwable -> L13
        r3.setDuration(300);     // Catch: java.lang.Throwable -> L13
        r2.startAnimation(r3);     // Catch: java.lang.Throwable -> L13
        r2.setVisibility(0);     // Catch: java.lang.Throwable -> L13
        return;
    L11:
        android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, this.Hw.getResources().getDisplayMetrics().density * 60.0f);     // Catch: java.lang.Throwable -> L13
        r4.setDuration(300);     // Catch: java.lang.Throwable -> L13
        r4.setAnimationListener(new com.aide.ui.Fa(this, r2));     // Catch: java.lang.Throwable -> L13
        r2.startAnimation(r4);     // Catch: java.lang.Throwable -> L13
        return;
    }
}
