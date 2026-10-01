package com.aide.common;

@abcd.Interfacexu
public class ClassN extends android.widget.LinearLayout {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3268455842325784176L)
    private android.graphics.Paint FH;

    @abcd.Interfaceru(field = 3557391884467472400L)
    private android.graphics.Paint Hw;

    @abcd.Interfaceru(field = 2502709895803738851L)
    private boolean VH;

    @abcd.Interfaceru(field = -838998675012019655L)
    private boolean Zo;

    @abcd.Interfaceru(field = 2239703020048878873L)
    private float v5;

    static {
        abcd.wu.j6(com.aide.common.ClassN.class, 1009115569069974369L, 1009115569069974369L);
    }

    public ClassN(android.content.Context r8, android.view.View r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -3978720971917722628L, null, r8, r9);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-3978720971917722628L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        super(r8);
                        this.VH = true;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    if (r9 == null) { $pc0 = 8; continue $sw0; }
                    try {
                        addView(r9, new android.widget.LinearLayout.LayoutParams(-1, -1));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    try {
                        setWillNotDraw(false);
                        setClipChildren(false);
                        setEnabled(true);
                        setFocusable(true);
                        setOnClickListener(new com.aide.common.ViewOnClickListenerl(this));
                        this.FH = new android.graphics.Paint();
                        this.FH.setStyle(android.graphics.Paint.Style.STROKE);
                        this.FH.setColor(-5592406);
                        this.FH.setStrokeWidth(1.0f);
                        this.FH.setPathEffect(new android.graphics.DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
                        this.Hw = new android.graphics.Paint();
                        this.Hw.setStyle(android.graphics.Paint.Style.STROKE);
                        this.Hw.setColor(-13388315);
                        this.Hw.setStrokeWidth(getResources().getDisplayMetrics().density * 6.0f);
                        this.v5 = getResources().getDisplayMetrics().density * 2.0f;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -80030152899912791L)
    private void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 2070346168301311611L, this);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(2070346168301311611L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        invalidate(-10, -10, getWidth() + 10, getHeight() + 10);
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

    static void DW(com.aide.common.ClassN r0) {
        r0.DW();
    }

    static boolean j6(com.aide.common.ClassN r0) {
        return r0.Zo;
    }

    static boolean j6(com.aide.common.ClassN r0, boolean r1) {
        r0.Zo = r1;
        return r1;
    }

    @Override
    public android.view.View focusSearch(int r6) {
        android.view.ViewGroup r2 = null;
        android.view.ViewGroup r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 27: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 31; continue $sw2; }
                    abcd.wu.j6(th, 2196498643431194143L, this, new java.lang.Integer(r6));
                    $pc2 = 31; continue $sw2;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(2196498643431194143L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r6 != 130) { $pc2 = 19; continue $sw2; }
                    if (getChildCount() <= 0) { $pc2 = 26; continue $sw2; }
                    if ((getChildAt(0) instanceof android.view.ViewGroup) == false) { $pc2 = 26; continue $sw2; }
                    try {
                        r2 = (android.view.ViewGroup) getChildAt(0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if (r2.getChildCount() <= 0) { $pc2 = 26; continue $sw2; }
                    if ((r2.getChildAt(0) instanceof com.aide.common.ClassN) == false) { $pc2 = 26; continue $sw2; }
                    return r2.getChildAt(0);
                }
                case 26: {
                    return super.focusSearch(r6);
                }
                case 19: {
                    if (r6 != 33) { $pc2 = 26; continue $sw2; }
                    if ((getParent().getParent() instanceof com.aide.common.ClassN) == false) { $pc2 = 26; continue $sw2; }
                    try {
                        r3 = (android.view.ViewGroup) getParent().getParent();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    if (((android.view.ViewGroup) r3.getChildAt(0)).getChildAt(0) != this) { $pc2 = 26; continue $sw2; }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2050566322915344072L)
    protected void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 7: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 11; continue $sw3; }
                    abcd.wu.j6(th, 211254612467715664L, this);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 14; continue $sw3; }
                    try {
                        abcd.wu.j6(211254612467715664L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
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
    @abcd.Interfacesu(method = -224902165668309216L)
    protected void onDraw(android.graphics.Canvas r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 16: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 20; continue $sw4; }
                    abcd.wu.j6(th, -33554994788841888L, this, r7);
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-33554994788841888L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 16; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        super.onDraw(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 16; continue $sw4;
                    }
                    if (this.VH == true) { $pc4 = 9; continue $sw4; }
                    return;
                }
                case 9: {
                    if (this.Zo == false) { $pc4 = 11; continue $sw4; }
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    try {
                        r7.drawRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth() - 1, getHeight() - 1), this.v5, this.v5, this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 16; continue $sw4;
                    }
                    return;
                }
                case 11: {
                    if (isFocused() == true) { $pc4 = 14; continue $sw4; }
                    try {
                        r7.drawRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth() - 1, getHeight() - 1), this.v5, this.v5, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 16; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 794386187632089556L)
    protected void onFocusChanged(boolean r9, int r10, android.graphics.Rect r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 9: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 13; continue $sw5; }
                    abcd.wu.j6(th, 957929081249098440L, this, new java.lang.Boolean(r9), new java.lang.Integer(r10), r11);
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(957929081249098440L, this, new java.lang.Boolean(r9), new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        super.onFocusChanged(r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    if ((getParent() instanceof android.view.View) == false) { $pc5 = 16; continue $sw5; }
                    try {
                        ((android.view.View) getParent()).invalidate();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        android.view.View r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 13: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 17; continue $sw6; }
                    abcd.wu.j6(th, 7062133595128325356L, this, r6);
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(7062133595128325356L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 13; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r3 = getChildAt(0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 13; continue $sw6;
                    }
                    if ((r3 instanceof android.view.ViewGroup) == false) { $pc6 = 11; continue $sw6; }
                    if ((r3 instanceof android.widget.AdapterView) == true) { $pc6 = 20; continue $sw6; }
                    return false;
                }
                case 20: {
                    return true;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 18: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 22; continue $sw7; }
                    abcd.wu.j6(th, 2127159939489541760L, this, r7);
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 7; continue $sw7; }
                    try {
                        abcd.wu.j6(2127159939489541760L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (isEnabled() == true) { $pc7 = 9; continue $sw7; }
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    return super.onTouchEvent(r7);
                }
                case 9: {
                    if (r7.getAction() != 0) { $pc7 = 12; continue $sw7; }
                    try {
                        this.Zo = true;
                        DW();
                        postDelayed(new com.aide.common.Runnablem(this), 1000);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    if (r7.getAction() != 1) { $pc7 = 16; continue $sw7; }
                    if (this.Zo == false) { $pc7 = 16; continue $sw7; }
                    try {
                        this.Zo = false;
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    { $pc7 = 16; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setIsVisible(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 2502057039925426905L, this, new java.lang.Boolean(r5));
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(2502057039925426905L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        this.VH = r5;
                        invalidate();
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
