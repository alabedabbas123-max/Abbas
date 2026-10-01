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
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1605006505721893120L, null, r8, r9);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1605006505721893120L, null, r8, r9);     // Catch: java.lang.Throwable -> L12
    L6:
        super(r8, r9);     // Catch: java.lang.Throwable -> L12
        boolean r2 = true;
        int r1 = r9.getAttributeIntValue("android", "orientation", 1);     // Catch: java.lang.Throwable -> L12
        this.Hw = r9.getAttributeIntValue("android", "topOffset", 0);     // Catch: java.lang.Throwable -> L12
        if (r1 == 1) goto L10;
        r2 = false;
    L10:
        this.FH = r2;     // Catch: java.lang.Throwable -> L12
    }

    public WrappingSlidingDrawer(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -507211066623366561L, null, r9, r10, new java.lang.Integer(r11));
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-507211066623366561L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L12
    L6:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L12
        boolean r2 = true;
        int r1 = r10.getAttributeIntValue("android", "orientation", 1);     // Catch: java.lang.Throwable -> L12
        this.Hw = r10.getAttributeIntValue("android", "topOffset", 0);     // Catch: java.lang.Throwable -> L12
        if (r1 == 1) goto L10;
        r2 = false;
    L10:
        this.FH = r2;     // Catch: java.lang.Throwable -> L12
    }

    @Override
    @abcd.Interfacesu(method = -137268825418187376L)
    protected void onMeasure(int r8, int r9) {
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -959454100828577320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-959454100828577320L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L20
    L5:
        int r0 = android.view.View.MeasureSpec.getMode(r8);     // Catch: java.lang.Throwable -> L20
        int r1 = android.view.View.MeasureSpec.getSize(r8);     // Catch: java.lang.Throwable -> L20
        int r2 = android.view.View.MeasureSpec.getMode(r9);     // Catch: java.lang.Throwable -> L20
        int r3 = android.view.View.MeasureSpec.getSize(r9);     // Catch: java.lang.Throwable -> L20
        if (r0 == 0) goto L19;
        if (r2 == 0) goto L19;
        android.view.View r4 = getHandle();     // Catch: java.lang.Throwable -> L20
        android.view.View r5 = getContent();     // Catch: java.lang.Throwable -> L20
        measureChild(r4, r8, r9);     // Catch: java.lang.Throwable -> L20
        if (this.FH == false) goto L13;
        r5.measure(r8, android.view.View.MeasureSpec.makeMeasureSpec((r3 - r4.getMeasuredHeight()) - this.Hw, r2));     // Catch: java.lang.Throwable -> L20
        int r6 = (r4.getMeasuredHeight() + this.Hw) + r5.getMeasuredHeight();     // Catch: java.lang.Throwable -> L20
        int r7 = r5.getMeasuredWidth();     // Catch: java.lang.Throwable -> L20
        if (r4.getMeasuredWidth() <= r7) goto L16;
        r7 = r4.getMeasuredWidth();     // Catch: java.lang.Throwable -> L20
    L16:
        setMeasuredDimension(r7, r6);     // Catch: java.lang.Throwable -> L20
        return;
    L13:
        r5.measure(android.view.View.MeasureSpec.makeMeasureSpec((r1 - r4.getMeasuredWidth()) - this.Hw, r0), r9);     // Catch: java.lang.Throwable -> L20
        int r10 = r4.getMeasuredWidth() + this.Hw;     // Catch: java.lang.Throwable -> L20
        r7 = r5.getMeasuredWidth() + r10;     // Catch: java.lang.Throwable -> L20
        r6 = r5.getMeasuredHeight();     // Catch: java.lang.Throwable -> L20
        if (r4.getMeasuredHeight() <= r6) goto L16;
        r6 = r4.getMeasuredHeight();     // Catch: java.lang.Throwable -> L20
    L19:
        throw new java.lang.RuntimeException("SlidingDrawer cannot have UNSPECIFIED dimensions");     // Catch: java.lang.Throwable -> L20
    }
}
