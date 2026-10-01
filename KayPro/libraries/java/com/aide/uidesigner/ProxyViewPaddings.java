package com.aide.uidesigner;

@abcd.Interfacexu
public class ProxyViewPaddings {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = 1283934071954100160L)
    private int padding;

    @abcd.Interfaceru(field = 2502059665285126269L)
    private int paddingBottom;

    @abcd.Interfaceru(field = -941965546655400267L)
    private int paddingEnd;

    @abcd.Interfaceru(field = -3138892354802734225L)
    private int paddingLeft;

    @abcd.Interfaceru(field = -3093936463656996900L)
    private int paddingRight;

    @abcd.Interfaceru(field = -3007477963878563320L)
    private int paddingStart;

    @abcd.Interfaceru(field = -942836894611569765L)
    private int paddingTop;

    @abcd.Interfaceru(field = 583791923828363040L)
    private android.view.View view;

    static {
        abcd.wu.j6(com.aide.uidesigner.ProxyViewPaddings.class, 232054640984430660L, 232054640984430660L);
    }

    public ProxyViewPaddings(java.lang.Object r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if ($ON_THROW_TOGGLE == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1541985154764514020L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1541985154764514020L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.view = (android.view.View) r6;
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

    @abcd.Interfacesu(method = -1906919809088034468L)
    private void updatePadding() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 27: {
                    th = $ex1;
                    if ($ON_THROW_TOGGLE == false) { $pc1 = 31; continue $sw1; }
                    abcd.wu.j6(th, 4071297115228859836L, this);
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(4071297115228859836L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 27; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (this.padding <= 0) { $pc1 = 10; continue $sw1; }
                    try {
                        this.view.setPadding(this.padding, this.padding, this.padding, this.padding);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 27; continue $sw1;
                    }
                    return;
                }
                case 10: {
                    if (this.paddingStart > 0) { $pc1 = 24; continue $sw1; }
                    if (this.paddingEnd > 0) { $pc1 = 24; continue $sw1; }
                    if (this.paddingLeft <= 0) { $pc1 = 17; continue $sw1; }
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    try {
                        this.view.setPadding(this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 27; continue $sw1;
                    }
                    return;
                }
                case 17: {
                    if (this.paddingRight > 0) { $pc1 = 22; continue $sw1; }
                    if (this.paddingTop > 0) { $pc1 = 22; continue $sw1; }
                    if (this.paddingBottom > 0) { $pc1 = 22; continue $sw1; }
                    return;
                }
                case 24: {
                    if (android.os.Build.VERSION.SDK_INT < 17) { $pc1 = 36; continue $sw1; }
                    try {
                        this.view.setPaddingRelative(this.paddingStart, this.paddingTop, this.paddingEnd, this.paddingBottom);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 27; continue $sw1;
                    }
                    return;
                }
                case 36: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setPadding(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if ($ON_THROW_TOGGLE == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -633694578456592928L, this, new java.lang.Integer(r5));
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-633694578456592928L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        this.padding = r5;
                        updatePadding();
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

    public void setPaddingBottom(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if ($ON_THROW_TOGGLE == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 1493921854605055659L, this, new java.lang.Integer(r5));
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(1493921854605055659L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.paddingBottom = r5;
                        updatePadding();
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

    public void setPaddingEnd(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if ($ON_THROW_TOGGLE == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 2588808217676287737L, this, new java.lang.Integer(r5));
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2588808217676287737L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        this.paddingEnd = r5;
                        updatePadding();
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

    public void setPaddingLeft(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if ($ON_THROW_TOGGLE == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -2955563154388918191L, this, new java.lang.Integer(r5));
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-2955563154388918191L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        this.paddingLeft = r5;
                        updatePadding();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setPaddingRight(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if ($ON_THROW_TOGGLE == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 302511640466470520L, this, new java.lang.Integer(r5));
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(302511640466470520L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        this.paddingRight = r5;
                        updatePadding();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setPaddingStart(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if ($ON_THROW_TOGGLE == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -977041310190241500L, this, new java.lang.Integer(r5));
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-977041310190241500L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        this.paddingStart = r5;
                        updatePadding();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setPaddingTop(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if ($ON_THROW_TOGGLE == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -890816286062971485L, this, new java.lang.Integer(r5));
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-890816286062971485L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        this.paddingTop = r5;
                        updatePadding();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
