package com.aide.ui.views;

@abcd.Interfacexu
public class WrappingSlidingDrawer extends android.widget.SlidingDrawer {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3740104355881371705L)
    private boolean FH;

    @abcd.Interfaceru(field = -1727980716268968189L)
    private int Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.WrappingSlidingDrawer.class, -619920423127698829L, -619920423127698829L);
    }

    public WrappingSlidingDrawer(android.content.Context r8, android.util.AttributeSet r9) {
        boolean r2 = false;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, -1605006505721893120L, null, r8, r9);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1605006505721893120L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        super(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    r2 = true;
                    try {
                        r1 = r9.getAttributeIntValue("android", "orientation", 1);
                        this.Hw = r9.getAttributeIntValue("android", "topOffset", 0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    if (r1 == 1) { $pc0 = 10; continue $sw0; }
                    r2 = false;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        this.FH = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public WrappingSlidingDrawer(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        boolean r2 = false;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, -507211066623366561L, null, r9, r10, new java.lang.Integer(r11));
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-507211066623366561L, null, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        super(r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    r2 = true;
                    try {
                        r1 = r10.getAttributeIntValue("android", "orientation", 1);
                        this.Hw = r10.getAttributeIntValue("android", "topOffset", 0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    if (r1 == 1) { $pc1 = 10; continue $sw1; }
                    r2 = false;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    try {
                        this.FH = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -137268825418187376L)
    protected void onMeasure(int r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        android.view.View r4 = null;
        android.view.View r5 = null;
        int r6 = 0;
        int r7 = 0;
        int r10 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 20: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 24; continue $sw2; }
                    abcd.wu.j6(th, -959454100828577320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-959454100828577320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = android.view.View.MeasureSpec.getMode(r8);
                        r1 = android.view.View.MeasureSpec.getSize(r8);
                        r2 = android.view.View.MeasureSpec.getMode(r9);
                        r3 = android.view.View.MeasureSpec.getSize(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    if (r0 == 0) { $pc2 = 19; continue $sw2; }
                    if (r2 == 0) { $pc2 = 19; continue $sw2; }
                    try {
                        r4 = getHandle();
                        r5 = getContent();
                        measureChild(r4, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    if (this.FH == false) { $pc2 = 13; continue $sw2; }
                    try {
                        r5.measure(r8, android.view.View.MeasureSpec.makeMeasureSpec((r3 - r4.getMeasuredHeight()) - this.Hw, r2));
                        r6 = (r4.getMeasuredHeight() + this.Hw) + r5.getMeasuredHeight();
                        r7 = r5.getMeasuredWidth();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    if (r4.getMeasuredWidth() <= r7) { $pc2 = 16; continue $sw2; }
                    try {
                        r7 = r4.getMeasuredWidth();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    try {
                        setMeasuredDimension(r7, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    return;
                }
                case 13: {
                    try {
                        r5.measure(android.view.View.MeasureSpec.makeMeasureSpec((r1 - r4.getMeasuredWidth()) - this.Hw, r0), r9);
                        r10 = r4.getMeasuredWidth() + this.Hw;
                        r7 = r5.getMeasuredWidth() + r10;
                        r6 = r5.getMeasuredHeight();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    if (r4.getMeasuredHeight() <= r6) { $pc2 = 16; continue $sw2; }
                    try {
                        r6 = r4.getMeasuredHeight();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    try {
                        throw new java.lang.RuntimeException("SlidingDrawer cannot have UNSPECIFIED dimensions");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
