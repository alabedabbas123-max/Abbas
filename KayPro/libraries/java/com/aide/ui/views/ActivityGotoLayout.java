package com.aide.ui.views;

@abcd.Interfacexu
public class ActivityGotoLayout extends android.view.ViewGroup {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.views.ActivityGotoLayout.class, -7039700628554560L, -7039700628554560L);
    }

    public ActivityGotoLayout(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 258949633952288801L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(258949633952288801L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
    }

    public ActivityGotoLayout(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -6334031528656167312L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-6334031528656167312L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public ActivityGotoLayout(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2415807670372947459L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2415807670372947459L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 1503241096327617335L)
    private float DW(float r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2611304108400573624L, this, new java.lang.Float(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2611304108400573624L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L8
    L6:
        return java.lang.Math.min(r5, Hw(r5));
    }

    @abcd.Interfacesu(method = 1288375128802837008L)
    private float FH(float r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 1142576163235709139L, this, new java.lang.Float(r5));
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1142576163235709139L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L9
    L6:
        return getContext().getResources().getDisplayMetrics().density * 600.0f;
    }

    @abcd.Interfacesu(method = -102674340223269255L)
    private float Hw(float r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 436539724560484560L, this, new java.lang.Float(r5));
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(436539724560484560L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L9
    L6:
        return getContext().getResources().getDisplayMetrics().density * 600.0f;
    }

    @abcd.Interfacesu(method = -7257402910061516736L)
    private float j6(float r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4109845372606184751L, this, new java.lang.Float(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4109845372606184751L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L8
    L6:
        return java.lang.Math.min(r5, FH(r5));
    }

    @Override
    @abcd.Interfacesu(method = 25981813519919181L)
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4645757774192883184L, this, new java.lang.Boolean(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4645757774192883184L, this, new java.lang.Boolean(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L7
    L5:
        float r0 = r14 - r12;     // Catch: java.lang.Throwable -> L7
        float r1 = r15 - r13;     // Catch: java.lang.Throwable -> L7
        float r2 = (r0 - DW(r0)) / 2.0f;     // Catch: java.lang.Throwable -> L7
        float r3 = (r1 - j6(r1)) / 2.0f;     // Catch: java.lang.Throwable -> L7
        getChildAt(0).layout((int) r2, (int) r3, (int) (r0 - r2), (int) (r1 - r3));     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = -2345800879145865240L)
    protected void onMeasure(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -229838818923902001L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-229838818923902001L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        int r0 = android.view.View.MeasureSpec.getSize(r9);     // Catch: java.lang.Throwable -> L7
        int r1 = android.view.View.MeasureSpec.getSize(r8);     // Catch: java.lang.Throwable -> L7
        getChildAt(0).measure(android.view.View.MeasureSpec.makeMeasureSpec((int) DW(r1), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((int) j6(r0), 1073741824));     // Catch: java.lang.Throwable -> L7
        setMeasuredDimension(r1, r0);     // Catch: java.lang.Throwable -> L7
    }
}
