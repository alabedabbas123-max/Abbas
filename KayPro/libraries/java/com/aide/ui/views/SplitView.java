package com.aide.ui.views;

@abcd.Interfacexu
public class SplitView extends android.view.ViewGroup {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = 305945481744851643L)
    private int animationPosition;

    @abcd.Interfaceru(field = -2220986906469670848L)
    private float dividerSpeed;

    @abcd.Interfaceru(field = 4376198832526380827L)
    private int dividerTouchSize;

    @abcd.Interfaceru(field = -2458900430770018197L)
    private int dragPosition;

    @abcd.Interfaceru(field = 6275994694731359941L)
    private float horizontalSplitRatio;

    @abcd.Interfaceru(field = -193356825386921805L)
    private boolean isDragging;

    @abcd.Interfaceru(field = 2965806935283339056L)
    private boolean isHorizontal;

    @abcd.Interfaceru(field = 1123020794462061216L)
    private boolean isSplit;

    @abcd.Interfaceru(field = -5477289533579244069L)
    private boolean isSwipeEnabled;

    @abcd.Interfaceru(field = 1306040584426626732L)
    private com.aide.ui.views.SplitView.a listener;

    @abcd.Interfaceru(field = -371747001152055781L)
    private float verticalSplitRatio;

    public interface a {
        void j6(boolean r1);
    }

    static {
        abcd.wu.j6(com.aide.ui.views.SplitView.class, 786228931312646151L, 786228931312646151L);
    }

    public SplitView(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if ($ON_THROW_TOGGLE == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -925898668235461107L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-925898668235461107L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        super(r6);
                        this.horizontalSplitRatio = 0.33f;
                        this.verticalSplitRatio = 0.5f;
                        this.dividerTouchSize = 30;
                        this.dividerSpeed = 1.0f;
                        this.isSplit = false;
                        this.isHorizontal = false;
                        this.isSwipeEnabled = false;
                        this.isDragging = false;
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

    public SplitView(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if ($ON_THROW_TOGGLE == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -163071011633314080L, null, r8, r9);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-163071011633314080L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        super(r8, r9);
                        this.horizontalSplitRatio = 0.33f;
                        this.verticalSplitRatio = 0.5f;
                        this.dividerTouchSize = 30;
                        this.dividerSpeed = 1.0f;
                        this.isSplit = false;
                        this.isHorizontal = false;
                        this.isSwipeEnabled = false;
                        this.isDragging = false;
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

    public SplitView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if ($ON_THROW_TOGGLE == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, -873886956513167781L, null, r9, r10, new java.lang.Integer(r11));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-873886956513167781L, null, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        super(r9, r10, r11);
                        this.horizontalSplitRatio = 0.33f;
                        this.verticalSplitRatio = 0.5f;
                        this.dividerTouchSize = 30;
                        this.dividerSpeed = 1.0f;
                        this.isSplit = false;
                        this.isHorizontal = false;
                        this.isSwipeEnabled = false;
                        this.isDragging = false;
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

    static int access$002(com.aide.ui.views.SplitView r0, int r1) {
        r0.animationPosition = r1;
        return r1;
    }

    static com.aide.ui.views.SplitView.a access$100(com.aide.ui.views.SplitView r0) {
        return r0.listener;
    }

    static boolean access$200(com.aide.ui.views.SplitView r0) {
        return r0.isSplit;
    }

    static boolean access$202(com.aide.ui.views.SplitView r0, boolean r1) {
        r0.isSplit = r1;
        return r1;
    }

    static void access$300(com.aide.ui.views.SplitView r0) {
        r0.updateChildVisibilities();
    }

    @abcd.Interfacesu(method = 987808508495265381L)
    private long getAnimationDuration(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if ($ON_THROW_TOGGLE == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 128590937060478525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(128590937060478525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    return (long) ((java.lang.Math.abs(r8 - r9) / getResources().getDisplayMetrics().density) / this.dividerSpeed);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -140033884680318960L)
    private int getCurrentDividerPosition(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 15: {
                    th = $ex4;
                    if ($ON_THROW_TOGGLE == false) { $pc4 = 19; continue $sw4; }
                    abcd.wu.j6(th, -2808768746050506200L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-2808768746050506200L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (this.isDragging == false) { $pc4 = 10; continue $sw4; }
                    return getDragPosition();
                }
                case 10: {
                    if (this.animationPosition >= 0) { $pc4 = 14; continue $sw4; }
                    return getDividerPosition(r8, r9);
                }
                case 14: {
                    return this.animationPosition;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4219343850436738947L)
    private int getDividerPosition() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if ($ON_THROW_TOGGLE == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 6295251823001664303L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(6295251823001664303L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return getDividerPosition(getWidth(), getHeight());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 284855949205714341L)
    private int getDividerPosition(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if ($ON_THROW_TOGGLE == false) { $pc6 = 16; continue $sw6; }
                    abcd.wu.j6(th, -75201145323663275L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-75201145323663275L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (this.isHorizontal == false) { $pc6 = 11; continue $sw6; }
                    return (int) (this.horizontalSplitRatio * r8);
                }
                case 11: {
                    return (int) (this.verticalSplitRatio * r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4185842995686126528L)
    private int getDragDistance() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 12: {
                    th = $ex7;
                    if ($ON_THROW_TOGGLE == false) { $pc7 = 16; continue $sw7; }
                    abcd.wu.j6(th, -2558393295404739768L, this);
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc7 = 7; continue $sw7; }
                    try {
                        abcd.wu.j6(-2558393295404739768L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 12; continue $sw7;
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (this.isSplit == false) { $pc7 = 11; continue $sw7; }
                    return getDividerPosition() - getDragPosition();
                }
                case 11: {
                    return getDragPosition();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -4388231017573430796L)
    private int getDragPosition() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 16: {
                    th = $ex8;
                    if ($ON_THROW_TOGGLE == false) { $pc8 = 20; continue $sw8; }
                    abcd.wu.j6(th, 894821514458755392L, this);
                    $pc8 = 20; continue $sw8;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(894821514458755392L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 16; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (this.isDragging == false) { $pc8 = 11; continue $sw8; }
                    return java.lang.Math.min(this.dragPosition, getDividerPosition());
                }
                case 11: {
                    if (this.isSplit == true) { $pc8 = 22; continue $sw8; }
                    return 0;
                }
                case 22: {
                    return getDividerPosition();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -320713910353111059L)
    private java.lang.Boolean getDragStartOrientation(android.view.MotionEvent r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 72: {
                    th = $ex9;
                    if ($ON_THROW_TOGGLE == false) { $pc9 = 76; continue $sw9; }
                    abcd.wu.j6(th, 185548597573864433L, this, r10);
                    $pc9 = 76; continue $sw9;
                }
                case 76: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc9 = 7; continue $sw9; }
                    try {
                        abcd.wu.j6(185548597573864433L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 72; continue $sw9;
                    }
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (this.isSwipeEnabled == false) { $pc9 = 21; continue $sw9; }
                    if (this.isSplit == true) { $pc9 = 21; continue $sw9; }
                    if (r10.getAction() != 0) { $pc9 = 21; continue $sw9; }
                    if (r10.getPointerCount() != 1) { $pc9 = 21; continue $sw9; }
                    if (r10.getX() >= (this.dividerTouchSize * getResources().getDisplayMetrics().density)) { $pc9 = 21; continue $sw9; }
                    if (splitHorizontalByDefault() == false) { $pc9 = 21; continue $sw9; }
                    return true;
                }
                case 21: {
                    if (this.isSwipeEnabled == false) { $pc9 = 39; continue $sw9; }
                    if (this.isSplit == false) { $pc9 = 39; continue $sw9; }
                    if (this.isHorizontal == false) { $pc9 = 39; continue $sw9; }
                    if (r10.getAction() != 0) { $pc9 = 39; continue $sw9; }
                    if (r10.getPointerCount() != 1) { $pc9 = 39; continue $sw9; }
                    if (r10.getY() <= (getResources().getDisplayMetrics().density * 50.0f)) { $pc9 = 39; continue $sw9; }
                    if (r10.getY() >= (getHeight() - (getResources().getDisplayMetrics().density * 50.0f))) { $pc9 = 39; continue $sw9; }
                    if (java.lang.Math.abs(r10.getX() - (getWidth() * this.horizontalSplitRatio)) >= (this.dividerTouchSize * getResources().getDisplayMetrics().density)) { $pc9 = 39; continue $sw9; }
                    return true;
                }
                case 39: {
                    if (this.isSwipeEnabled == false) { $pc9 = 53; continue $sw9; }
                    if (this.isSplit == true) { $pc9 = 53; continue $sw9; }
                    if (r10.getAction() != 0) { $pc9 = 53; continue $sw9; }
                    if (r10.getPointerCount() != 1) { $pc9 = 53; continue $sw9; }
                    if (r10.getY() <= (getHeight() - (this.dividerTouchSize * getResources().getDisplayMetrics().density))) { $pc9 = 53; continue $sw9; }
                    if (getHeight() <= (getResources().getDisplayMetrics().density * 150.0f)) { $pc9 = 53; continue $sw9; }
                    return false;
                }
                case 53: {
                    if (this.isSwipeEnabled == true) { $pc9 = 55; continue $sw9; }
                    return null;
                }
                case 55: {
                    if (this.isSplit == true) { $pc9 = 57; continue $sw9; }
                    return null;
                }
                case 57: {
                    if (this.isHorizontal == false) { $pc9 = 59; continue $sw9; }
                    return null;
                }
                case 59: {
                    if (r10.getAction() == 0) { $pc9 = 61; continue $sw9; }
                    return null;
                }
                case 61: {
                    if (r10.getPointerCount() == 1) { $pc9 = 63; continue $sw9; }
                    return null;
                }
                case 63: {
                    if (r10.getX() < (getWidth() - (getResources().getDisplayMetrics().density * 50.0f))) { $pc9 = 65; continue $sw9; }
                    return null;
                }
                case 65: {
                    if (r10.getX() > (getResources().getDisplayMetrics().density * 50.0f)) { $pc9 = 67; continue $sw9; }
                    return null;
                }
                case 67: {
                    if (java.lang.Math.abs(r10.getY() - (getHeight() * this.verticalSplitRatio)) < (this.dividerTouchSize * getResources().getDisplayMetrics().density)) { $pc9 = 69; continue $sw9; }
                    return null;
                }
                case 69: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2712575223900577881L)
    private boolean isVertical() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 9: {
                    th = $ex10;
                    if ($ON_THROW_TOGGLE == false) { $pc10 = 13; continue $sw10; }
                    abcd.wu.j6(th, -2334371885580039855L, this);
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-2334371885580039855L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 9; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return !isHorizontal();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 20996127316406067L)
    private void setOrientation(boolean r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 15: {
                    th = $ex11;
                    if ($ON_THROW_TOGGLE == false) { $pc11 = 19; continue $sw11; }
                    abcd.wu.j6(th, -1108527125298237265L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    $pc11 = 19; continue $sw11;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-1108527125298237265L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 15; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (this.isHorizontal == r8) { $pc11 = 21; continue $sw11; }
                    if (r9 == true) { $pc11 = 9; continue $sw11; }
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    try {
                        this.isHorizontal = r8;
                        requestLayout();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 15; continue $sw11;
                    }
                    if (this.listener == null) { $pc11 = 23; continue $sw11; }
                    try {
                        this.listener.j6(this.isSplit);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 15; continue $sw11;
                    }
                    return;
                }
                case 23: {
                    return;
                }
                case 9: {
                    if (this.isSplit == false) { $pc11 = 11; continue $sw11; }
                    try {
                        closeSplit(true, new com.aide.ui.views.t(this, r8));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 15; continue $sw11;
                    }
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 59528643349521097L)
    private void startDragging(android.view.MotionEvent r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 3;
        $sw12: while (true) {
            switch ($pc12) {
                case 7: {
                    th = $ex12;
                    if ($ON_THROW_TOGGLE == false) { $pc12 = 11; continue $sw12; }
                    abcd.wu.j6(th, -2940602194762988511L, this, r8, new java.lang.Boolean(r9));
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc12 = 5; continue $sw12; }
                    try {
                        abcd.wu.j6(-2940602194762988511L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 7; continue $sw12;
                    }
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    try {
                        this.isHorizontal = r9;
                        this.isDragging = true;
                        updateDragging(r8);
                        updateChildVisibilities();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 7; continue $sw12;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 62443640925067936L)
    private void stopDragging(android.view.MotionEvent r6) {
        boolean r2 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 15: {
                    th = $ex13;
                    if ($ON_THROW_TOGGLE == false) { $pc13 = 19; continue $sw13; }
                    abcd.wu.j6(th, 2117892044483915360L, this, r6);
                    $pc13 = 19; continue $sw13;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc13 = 7; continue $sw13; }
                    try {
                        abcd.wu.j6(2117892044483915360L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (getDragDistance() <= ((this.dividerTouchSize * 2) * getResources().getDisplayMetrics().density)) { $pc13 = 9; continue $sw13; }
                    r2 = true;
                    $pc13 = 11; continue $sw13;
                }
                case 11: {
                    if (this.isSplit != r2) { $pc13 = 13; continue $sw13; }
                    try {
                        closeSplit(true);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    return;
                }
                case 13: {
                    try {
                        openSplit(true);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 15; continue $sw13;
                    }
                    return;
                }
                case 9: {
                    r2 = false;
                    { $pc13 = 11; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 683790646653810332L)
    private void updateChildVisibilities() {
        android.view.View r2 = null;
        int r4 = 0;
        int r3 = 0;
        android.view.View r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 20: {
                    th = $ex14;
                    if ($ON_THROW_TOGGLE == false) { $pc14 = 24; continue $sw14; }
                    abcd.wu.j6(th, -2097690489952031744L, this);
                    $pc14 = 24; continue $sw14;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-2097690489952031744L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 20; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        r2 = getBottomView();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 20; continue $sw14;
                    }
                    r4 = 8;
                    if (this.isSplit == false) { $pc14 = 9; continue $sw14; }
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    r3 = 0;
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    try {
                        r2.setVisibility(r3);
                        r5 = getSeparatorView();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 20; continue $sw14;
                    }
                    if (this.isSplit == false) { $pc14 = 16; continue $sw14; }
                    $pc14 = 17; continue $sw14;
                }
                case 17: {
                    r4 = 0;
                    $pc14 = 18; continue $sw14;
                }
                case 18: {
                    try {
                        r5.setVisibility(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 20; continue $sw14;
                    }
                    return;
                }
                case 16: {
                    if (this.isDragging == false) { $pc14 = 18; continue $sw14; }
                    $pc14 = 9; continue $sw14;
                }
                case 9: {
                    if (this.isDragging == true) { $pc14 = 12; continue $sw14; }
                    r3 = 8;
                    { $pc14 = 13; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3333066494597236835L)
    private void updateDragging(android.view.MotionEvent r5) {
        float r2 = 0.0f;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 13: {
                    th = $ex15;
                    if ($ON_THROW_TOGGLE == false) { $pc15 = 18; continue $sw15; }
                    abcd.wu.j6(th, -2804852302916838417L, this, r5);
                    $pc15 = 18; continue $sw15;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc15 = 7; continue $sw15; }
                    try {
                        abcd.wu.j6(-2804852302916838417L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (this.isHorizontal == false) { $pc15 = 10; continue $sw15; }
                    try {
                        r2 = r5.getX();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    $pc15 = 11; continue $sw15;
                }
                case 11: {
                    try {
                        this.dragPosition = (int) r2;
                        requestLayout();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    return;
                }
                case 10: {
                    try {
                        r2 = getHeight() - r5.getY();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 13; continue $sw15;
                    }
                    { $pc15 = 11; continue $sw15; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void closeSplit(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if ($ON_THROW_TOGGLE == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, 968042982553192624L, this, new java.lang.Boolean(r5));
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(968042982553192624L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        closeSplit(r5, null);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void closeSplit(boolean r8, java.lang.Runnable r9) {
        com.almlkaide.kaypro.aide.MainListener.onSplitViewCloseSplit(this, r8, r9);
    }

    public void closeSplit_SOURCE(boolean r8, java.lang.Runnable r9) {
        android.animation.ObjectAnimator r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 3;
        $sw17: while (true) {
            switch ($pc17) {
                case 19: {
                    th = $ex17;
                    if ($ON_THROW_TOGGLE == false) { $pc17 = 23; continue $sw17; }
                    abcd.wu.j6(th, 2445538997323889139L, this, new java.lang.Boolean(r8), r9);
                    $pc17 = 23; continue $sw17;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(2445538997323889139L, this, new java.lang.Boolean(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 19; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (r8 == false) { $pc17 = 13; continue $sw17; }
                    if (this.isSplit == false) { $pc17 = 10; continue $sw17; }
                    $pc17 = 11; continue $sw17;
                }
                case 11: {
                    try {
                        r1 = android.animation.ObjectAnimator.ofInt(this, "animationPosition", new int[]{getDragPosition(), 0});
                        r1.setDuration(getAnimationDuration(getDragPosition(), 0));
                        r1.start();
                        r1.addListener(new com.aide.ui.views.s(this, r9));
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 19; continue $sw17;
                    }
                    $pc17 = 17; continue $sw17;
                }
                case 17: {
                    try {
                        this.isDragging = false;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 19; continue $sw17;
                    }
                    return;
                }
                case 10: {
                    if (this.isDragging == false) { $pc17 = 17; continue $sw17; }
                    $pc17 = 13; continue $sw17;
                }
                case 13: {
                    if (this.isSplit == false) { $pc17 = 17; continue $sw17; }
                    try {
                        this.isSplit = false;
                        updateChildVisibilities();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 19; continue $sw17;
                    }
                    if (this.listener == null) { $pc17 = 17; continue $sw17; }
                    try {
                        this.listener.j6(this.isSplit);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 19; continue $sw17;
                    }
                    { $pc17 = 17; continue $sw17; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public android.view.View getBottomView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if ($ON_THROW_TOGGLE == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, 3029476977813278245L, this);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(3029476977813278245L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    return getChildAt(2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public android.view.View getSeparatorView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if ($ON_THROW_TOGGLE == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, -5047942160362723881L, this);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(-5047942160362723881L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    return getChildAt(1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public android.view.View getTopView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 8: {
                    th = $ex20;
                    if ($ON_THROW_TOGGLE == false) { $pc20 = 12; continue $sw20; }
                    abcd.wu.j6(th, 3608116232558045L, this);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(3608116232558045L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    return getChildAt(0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean isHorizontal() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 8: {
                    th = $ex21;
                    if ($ON_THROW_TOGGLE == false) { $pc21 = 12; continue $sw21; }
                    abcd.wu.j6(th, 2587155244619108495L, this);
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(2587155244619108495L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    return this.isHorizontal;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean isSplit() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 8: {
                    th = $ex22;
                    if ($ON_THROW_TOGGLE == false) { $pc22 = 12; continue $sw22; }
                    abcd.wu.j6(th, 2883988019731561075L, this);
                    $pc22 = 12; continue $sw22;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(2883988019731561075L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    return this.isSplit;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1942620603747824000L)
    protected void onFinishInflate() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 8: {
                    th = $ex23;
                    if ($ON_THROW_TOGGLE == false) { $pc23 = 12; continue $sw23; }
                    abcd.wu.j6(th, -4557718513056722196L, this);
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(-4557718513056722196L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    try {
                        super.onFinishInflate();
                        updateChildVisibilities();
                        this.isHorizontal = splitHorizontalByDefault();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 12: {
                    th = $ex24;
                    if ($ON_THROW_TOGGLE == false) { $pc24 = 16; continue $sw24; }
                    abcd.wu.j6(th, 649268344929859375L, this, r5);
                    $pc24 = 16; continue $sw24;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc24 = 7; continue $sw24; }
                    try {
                        abcd.wu.j6(649268344929859375L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 12; continue $sw24;
                    }
                    $pc24 = 7; continue $sw24;
                }
                case 7: {
                    if (getDragStartOrientation(r5) == null) { $pc24 = 10; continue $sw24; }
                    return true;
                }
                case 10: {
                    return super.onInterceptTouchEvent(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -21662492513362371L)
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        android.view.View r0 = null;
        android.view.View r1 = null;
        android.view.View r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 3;
        $sw25: while (true) {
            switch ($pc25) {
                case 13: {
                    th = $ex25;
                    if ($ON_THROW_TOGGLE == false) { $pc25 = 17; continue $sw25; }
                    abcd.wu.j6(th, 5593874413716271585L, this, new java.lang.Boolean(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc25 = 17; continue $sw25;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc25 = 5; continue $sw25; }
                    try {
                        abcd.wu.j6(5593874413716271585L, this, new java.lang.Boolean(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    $pc25 = 5; continue $sw25;
                }
                case 5: {
                    try {
                        r0 = getTopView();
                        r1 = getBottomView();
                        r2 = getSeparatorView();
                        r3 = r14 - r12;
                        r4 = r15 - r13;
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    if (r1.getVisibility() != 8) { $pc25 = 8; continue $sw25; }
                    try {
                        r0.layout(0, 0, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    return;
                }
                case 8: {
                    if (this.isHorizontal == false) { $pc25 = 10; continue $sw25; }
                    try {
                        r5 = r1.getMeasuredWidth();
                        r6 = r2.getMeasuredWidth() + r5;
                        r0.layout(r6, 0, r3, r4);
                        r2.layout(r5, 0, r6, r4);
                        r1.layout(0, 0, r5, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    return;
                }
                case 10: {
                    try {
                        r7 = r0.getMeasuredHeight();
                        r8 = r2.getMeasuredHeight();
                        r0.layout(0, 0, r3, r7);
                        r9 = r8 + r7;
                        r2.layout(0, r7, r3, r9);
                        r1.layout(0, r9, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -186701376388399184L)
    protected void onMeasure(int r9, int r10) {
        android.view.View r0 = null;
        android.view.View r1 = null;
        android.view.View r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 3;
        $sw26: while (true) {
            switch ($pc26) {
                case 14: {
                    th = $ex26;
                    if ($ON_THROW_TOGGLE == false) { $pc26 = 18; continue $sw26; }
                    abcd.wu.j6(th, -671097678420622040L, this, new java.lang.Integer(r9), new java.lang.Integer(r10));
                    $pc26 = 18; continue $sw26;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc26 = 5; continue $sw26; }
                    try {
                        abcd.wu.j6(-671097678420622040L, this, new java.lang.Integer(r9), new java.lang.Integer(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 14; continue $sw26;
                    }
                    $pc26 = 5; continue $sw26;
                }
                case 5: {
                    try {
                        r0 = getTopView();
                        r1 = getBottomView();
                        r2 = getSeparatorView();
                        android.view.View.MeasureSpec.getMode(r10);
                        r3 = android.view.View.MeasureSpec.getSize(r10);
                        android.view.View.MeasureSpec.getMode(r9);
                        r4 = android.view.View.MeasureSpec.getSize(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 14; continue $sw26;
                    }
                    if (r1.getVisibility() != 8) { $pc26 = 8; continue $sw26; }
                    try {
                        r0.measure(r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 14; continue $sw26;
                    }
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    try {
                        setMeasuredDimension(r4, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 14; continue $sw26;
                    }
                    return;
                }
                case 8: {
                    if (this.isHorizontal == false) { $pc26 = 10; continue $sw26; }
                    try {
                        r1.measure(android.view.View.MeasureSpec.makeMeasureSpec(getCurrentDividerPosition(r4, r3), 1073741824), r10);
                        r0.measure(android.view.View.MeasureSpec.makeMeasureSpec(r4 - r1.getMeasuredWidth(), 1073741824), r10);
                        r2.measure(-2, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 14; continue $sw26;
                    }
                    { $pc26 = 12; continue $sw26; }
                }
                case 10: {
                    try {
                        r1.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(getCurrentDividerPosition(r4, r3), 1073741824));
                        r0.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r3 - r1.getMeasuredHeight(), 1073741824));
                        r2.measure(r9, -2);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 14; continue $sw26;
                    }
                    { $pc26 = 12; continue $sw26; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        java.lang.Boolean r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 23: {
                    th = $ex27;
                    if ($ON_THROW_TOGGLE == false) { $pc27 = 27; continue $sw27; }
                    abcd.wu.j6(th, -840158422541240879L, this, r6);
                    $pc27 = 27; continue $sw27;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc27 = 6; continue $sw27; }
                    try {
                        abcd.wu.j6(-840158422541240879L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    try {
                        r2 = getDragStartOrientation(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    if (r2 == null) { $pc27 = 11; continue $sw27; }
                    try {
                        startDragging(r6, r2.booleanValue());
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    return true;
                }
                case 11: {
                    if (this.isDragging == false) { $pc27 = 22; continue $sw27; }
                    if (r6.getAction() != 2) { $pc27 = 16; continue $sw27; }
                    try {
                        updateDragging(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    $pc27 = 16; continue $sw27;
                }
                case 16: {
                    if (r6.getAction() != 3) { $pc27 = 18; continue $sw27; }
                    $pc27 = 19; continue $sw27;
                }
                case 19: {
                    try {
                        stopDragging(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 23; continue $sw27;
                    }
                    $pc27 = 20; continue $sw27;
                }
                case 20: {
                    return true;
                }
                case 18: {
                    if (r6.getAction() != 1) { $pc27 = 20; continue $sw27; }
                    $pc27 = 22; continue $sw27;
                }
                case 22: {
                    return super.onTouchEvent(r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void openSplit(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 4;
        $sw28: while (true) {
            switch ($pc28) {
                case 8: {
                    th = $ex28;
                    if ($ON_THROW_TOGGLE == false) { $pc28 = 12; continue $sw28; }
                    abcd.wu.j6(th, 358859342192411260L, this, new java.lang.Boolean(r5));
                    $pc28 = 12; continue $sw28;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc28 = 6; continue $sw28; }
                    try {
                        abcd.wu.j6(358859342192411260L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    try {
                        openSplit(this.isHorizontal, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void openSplit(boolean r8, boolean r9) {
        com.almlkaide.kaypro.aide.MainListener.onSplitViewOpenSplit(this, r8, r9);
    }

    public void openSplit_SOURCE(boolean r8, boolean r9) {
        android.animation.ObjectAnimator r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 3;
        $sw29: while (true) {
            switch ($pc29) {
                case 19: {
                    th = $ex29;
                    if ($ON_THROW_TOGGLE == false) { $pc29 = 23; continue $sw29; }
                    abcd.wu.j6(th, 210353214876976479L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    $pc29 = 23; continue $sw29;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if ($ON_ENTER_TOGGLE == false) { $pc29 = 5; continue $sw29; }
                    try {
                        abcd.wu.j6(210353214876976479L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 19; continue $sw29;
                    }
                    $pc29 = 5; continue $sw29;
                }
                case 5: {
                    try {
                        this.isHorizontal = r8;
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 19; continue $sw29;
                    }
                    if (r9 == false) { $pc29 = 13; continue $sw29; }
                    if (this.isSplit == true) { $pc29 = 10; continue $sw29; }
                    $pc29 = 11; continue $sw29;
                }
                case 11: {
                    try {
                        r2 = android.animation.ObjectAnimator.ofInt(this, "animationPosition", new int[]{getDragPosition(), getDividerPosition()});
                        r2.setDuration(getAnimationDuration(getDragPosition(), getDividerPosition()));
                        r2.start();
                        r2.addListener(new com.aide.ui.views.r(this));
                        this.isSplit = true;
                        updateChildVisibilities();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 19; continue $sw29;
                    }
                    $pc29 = 17; continue $sw29;
                }
                case 17: {
                    try {
                        this.isDragging = false;
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 19; continue $sw29;
                    }
                    return;
                }
                case 10: {
                    if (this.isDragging == false) { $pc29 = 17; continue $sw29; }
                    $pc29 = 13; continue $sw29;
                }
                case 13: {
                    if (this.isSplit == true) { $pc29 = 17; continue $sw29; }
                    try {
                        this.isSplit = true;
                        this.animationPosition = -1;
                        updateChildVisibilities();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 19; continue $sw29;
                    }
                    if (this.listener == null) { $pc29 = 17; continue $sw29; }
                    try {
                        this.listener.j6(this.isSplit);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 19; continue $sw29;
                    }
                    { $pc29 = 17; continue $sw29; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setAnimationPosition(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 8: {
                    th = $ex30;
                    if ($ON_THROW_TOGGLE == false) { $pc30 = 12; continue $sw30; }
                    abcd.wu.j6(th, 2570423811308575491L, this, new java.lang.Integer(r5));
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc30 = 6; continue $sw30; }
                    try {
                        abcd.wu.j6(2570423811308575491L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 8; continue $sw30;
                    }
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    try {
                        this.animationPosition = r5;
                        requestLayout();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 8; continue $sw30;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setOnSplitChangeListener(com.aide.ui.views.SplitView.a r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 8: {
                    th = $ex31;
                    if ($ON_THROW_TOGGLE == false) { $pc31 = 12; continue $sw31; }
                    abcd.wu.j6(th, 917475200364158936L, this, r5);
                    $pc31 = 12; continue $sw31;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc31 = 6; continue $sw31; }
                    try {
                        abcd.wu.j6(917475200364158936L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    try {
                        this.listener = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setSwipeEnabled(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 4;
        $sw32: while (true) {
            switch ($pc32) {
                case 8: {
                    th = $ex32;
                    if ($ON_THROW_TOGGLE == false) { $pc32 = 12; continue $sw32; }
                    abcd.wu.j6(th, 2189167081104311109L, this, new java.lang.Boolean(r5));
                    $pc32 = 12; continue $sw32;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc32 = 6; continue $sw32; }
                    try {
                        abcd.wu.j6(2189167081104311109L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 8; continue $sw32;
                    }
                    $pc32 = 6; continue $sw32;
                }
                case 6: {
                    try {
                        this.isSwipeEnabled = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 8; continue $sw32;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean splitHorizontalByDefault() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 12: {
                    th = $ex33;
                    if ($ON_THROW_TOGGLE == false) { $pc33 = 16; continue $sw33; }
                    abcd.wu.j6(th, 38948533111501629L, this);
                    $pc33 = 16; continue $sw33;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc33 = 6; continue $sw33; }
                    try {
                        abcd.wu.j6(38948533111501629L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 12; continue $sw33;
                    }
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    if (com.aide.common.ClassG.Hw(getContext()) < 650.0f) { $pc33 = 10; continue $sw33; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void toggleSplit(java.lang.Runnable r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 18: {
                    th = $ex34;
                    if ($ON_THROW_TOGGLE == false) { $pc34 = 22; continue $sw34; }
                    abcd.wu.j6(th, 1919999326490340728L, this, r5);
                    $pc34 = 22; continue $sw34;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc34 = 7; continue $sw34; }
                    try {
                        abcd.wu.j6(1919999326490340728L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 18; continue $sw34;
                    }
                    $pc34 = 7; continue $sw34;
                }
                case 7: {
                    if (isSplit() == false) { $pc34 = 12; continue $sw34; }
                    if (isVertical() == false) { $pc34 = 12; continue $sw34; }
                    try {
                        closeSplit(true, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 18; continue $sw34;
                    }
                    return;
                }
                case 12: {
                    if (isSplit() == true) { $pc34 = 14; continue $sw34; }
                    $pc34 = 16; continue $sw34;
                }
                case 16: {
                    try {
                        openSplit(splitHorizontalByDefault(), true);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 18; continue $sw34;
                    }
                    return;
                }
                case 14: {
                    if (isHorizontal() == false) { $pc34 = 16; continue $sw34; }
                    try {
                        setOrientation(false, true);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 18; continue $sw34;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
