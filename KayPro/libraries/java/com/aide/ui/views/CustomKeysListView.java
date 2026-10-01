package com.aide.ui.views;

@abcd.Interfacexu
public class CustomKeysListView extends android.widget.ListView {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1544908190932456740L)
    private com.aide.ui.views.CustomKeysListView.a FH;

    public interface a {
        boolean onKeyDown(int r1, android.view.KeyEvent r2);

        boolean onKeyUp(int r1, android.view.KeyEvent r2);
    }

    static {
        abcd.wu.j6(com.aide.ui.views.CustomKeysListView.class, -285407883451740000L, -285407883451740000L);
    }

    public CustomKeysListView(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2429505840056829768L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2429505840056829768L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        super(r6);
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

    public CustomKeysListView(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 399867451615048543L, null, r8, r9);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(399867451615048543L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        super(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public CustomKeysListView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 333633083686443036L, null, r9, r10, new java.lang.Integer(r11));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(333633083686443036L, null, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        super(r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 7: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 11; continue $sw3; }
                    abcd.wu.j6(th, -1464922279717604984L, this, new java.lang.Integer(r8), r9);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(-1464922279717604984L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    return super.onKeyUp(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 7: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 11; continue $sw4; }
                    abcd.wu.j6(th, -1292086796923669161L, this, new java.lang.Integer(r8), r9);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-1292086796923669161L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    return super.onKeyDown(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 13: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 17; continue $sw5; }
                    abcd.wu.j6(th, -912691128963686363L, this, new java.lang.Integer(r8), r9);
                    $pc5 = 17; continue $sw5;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-912691128963686363L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 13; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (this.FH != null) { $pc5 = 8; continue $sw5; }
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    return super.onKeyDown(r8, r9);
                }
                case 8: {
                    if (this.FH.onKeyDown(r8, r9) == false) { $pc5 = 11; continue $sw5; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 13: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 17; continue $sw6; }
                    abcd.wu.j6(th, 8270839950906617280L, this, new java.lang.Integer(r8), r9);
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(8270839950906617280L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 13; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (this.FH != null) { $pc6 = 8; continue $sw6; }
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    return super.onKeyUp(r8, r9);
                }
                case 8: {
                    if (this.FH.onKeyUp(r8, r9) == false) { $pc6 = 11; continue $sw6; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void onMeasure(int r3, int r4) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(r3), 1073741824), r4);
    }

    @Override
    public boolean requestFocus(int r8, android.graphics.Rect r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 11: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 15; continue $sw7; }
                    abcd.wu.j6(th, 3449932190114844280L, this, new java.lang.Integer(r8), r9);
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(3449932190114844280L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (getFocusedChild() == null) { $pc7 = 9; continue $sw7; }
                    return false;
                }
                case 9: {
                    return super.requestFocus(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setOnKeyEventListener(com.aide.ui.views.CustomKeysListView.a r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -377468209336966572L, this, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-377468209336966572L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        this.FH = r5;
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
