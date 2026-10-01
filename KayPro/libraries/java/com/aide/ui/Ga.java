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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -421287799826278401L, null, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-421287799826278401L, null, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH = false;
                        this.Hw = r8;
                        this.v5 = r9;
                        j6().setVisibility(8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -500308310504539232L)
    private android.view.View j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -1084710385753499573L, this);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1084710385753499573L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.Hw.findViewById(this.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.view.View.OnClickListener r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -1395212869700332009L, this, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-1395212869700332009L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        j6().setOnClickListener(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r10) {
        android.view.View r2 = null;
        android.view.animation.TranslateAnimation r3 = null;
        android.view.animation.TranslateAnimation r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 13: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 17; continue $sw3; }
                    abcd.wu.j6(th, 1175867164342060352L, this, new java.lang.Boolean(r10));
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(1175867164342060352L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = j6();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    if (r10 == this.FH) { $pc3 = 19; continue $sw3; }
                    try {
                        this.FH = r10;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    if (this.FH == false) { $pc3 = 11; continue $sw3; }
                    try {
                        r3 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, this.Hw.getResources().getDisplayMetrics().density * 60.0f, 0.0f);
                        r3.setDuration(300);
                        r2.startAnimation(r3);
                        r2.setVisibility(0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    return;
                }
                case 11: {
                    try {
                        r4 = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, this.Hw.getResources().getDisplayMetrics().density * 60.0f);
                        r4.setDuration(300);
                        r4.setAnimationListener(new com.aide.ui.Fa(this, r2));
                        r2.startAnimation(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
