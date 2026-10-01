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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2096774293128379227L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2096774293128379227L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.setVisibility(8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 5264970898005224163L)
    public void onAnimationRepeat(android.view.animation.Animation r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 6157552769907693207L, this, r5);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 14; continue $sw1; }
                    try {
                        abcd.wu.j6(6157552769907693207L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -167251094262227280L)
    public void onAnimationStart(android.view.animation.Animation r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 5729828160704637600L, this, r5);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 14; continue $sw2; }
                    try {
                        abcd.wu.j6(5729828160704637600L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
