package com.aide.common;

@abcd.Interfacexu
public class sa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 838758651928592592L)
    private final android.app.Activity FH;

    @abcd.Interfaceru(field = -1194706431140899040L)
    private final java.lang.String Hw;

    @abcd.Interfaceru(field = -1024908850174466719L)
    private java.lang.Runnable VH;

    @abcd.Interfaceru(field = -433778956045767207L)
    private android.os.Handler Zo;

    @abcd.Interfaceru(field = -265548789896474136L)
    private int gn;

    @abcd.Interfaceru(field = 597559973676931720L)
    private android.app.ProgressDialog v5;

    static {
        abcd.wu.j6(com.aide.common.sa.class, -443066808001349768L, -443066808001349768L);
    }

    public sa(android.app.Activity r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -2259859479713448584L, null, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-2259859479713448584L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.Zo = new android.os.Handler();
                        this.FH = r8;
                        this.Hw = r9;
                        this.gn = 500;
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

    static void j6(com.aide.common.sa r0) {
        r0.v5();
    }

    @abcd.Interfacesu(method = 4282309975616894155L)
    private void v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -1183668049773131675L, this);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1183668049773131675L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.v5 = new android.app.ProgressDialog(this.FH);
                        this.v5.setMessage(this.Hw);
                        this.v5.setOnCancelListener(new com.aide.common.DialogInterfaceOnCancelListenerra(this));
                        this.v5.getWindow().clearFlags(2);
                        this.v5.show();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2790036783533969775L)
    protected void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, -2001298607835609485L, this);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 14; continue $sw2; }
                    try {
                        abcd.wu.j6(-2001298607835609485L, this);
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

    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -2273123547971387904L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-2273123547971387904L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        j6();
                        v5();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -6258904993486479808L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-6258904993486479808L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        j6();
                        this.VH = new com.aide.common.Runnableqa(this);
                        this.Zo.postDelayed(this.VH, this.gn);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 13: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 17; continue $sw5; }
                    abcd.wu.j6(th, -1950676336890241184L, this);
                    $pc5 = 17; continue $sw5;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(-1950676336890241184L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 13; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (this.VH == null) { $pc5 = 10; continue $sw5; }
                    try {
                        this.Zo.removeCallbacks(this.VH);
                        this.VH = null;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 13; continue $sw5;
                    }
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (this.v5 == null) { $pc5 = 20; continue $sw5; }
                    try {
                        this.v5.dismiss();
                        this.v5 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 13; continue $sw5;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
