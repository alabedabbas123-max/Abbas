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
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -3978720971917722628L, null, r8, r9);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3978720971917722628L, null, r8, r9);     // Catch: java.lang.Throwable -> L10
    L5:
        super(r8);     // Catch: java.lang.Throwable -> L10
        this.VH = true;     // Catch: java.lang.Throwable -> L10
        if (r9 == null) goto L8;
        addView(r9, new android.widget.LinearLayout.LayoutParams(-1, -1));     // Catch: java.lang.Throwable -> L10
    L8:
        setWillNotDraw(false);     // Catch: java.lang.Throwable -> L10
        setClipChildren(false);     // Catch: java.lang.Throwable -> L10
        setEnabled(true);     // Catch: java.lang.Throwable -> L10
        setFocusable(true);     // Catch: java.lang.Throwable -> L10
        setOnClickListener(new com.aide.common.ViewOnClickListenerl(this));     // Catch: java.lang.Throwable -> L10
        this.FH = new android.graphics.Paint();     // Catch: java.lang.Throwable -> L10
        this.FH.setStyle(android.graphics.Paint.Style.STROKE);     // Catch: java.lang.Throwable -> L10
        this.FH.setColor(-5592406);     // Catch: java.lang.Throwable -> L10
        this.FH.setStrokeWidth(1.0f);     // Catch: java.lang.Throwable -> L10
        this.FH.setPathEffect(new android.graphics.DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));     // Catch: java.lang.Throwable -> L10
        this.Hw = new android.graphics.Paint();     // Catch: java.lang.Throwable -> L10
        this.Hw.setStyle(android.graphics.Paint.Style.STROKE);     // Catch: java.lang.Throwable -> L10
        this.Hw.setColor(-13388315);     // Catch: java.lang.Throwable -> L10
        this.Hw.setStrokeWidth(getResources().getDisplayMetrics().density * 6.0f);     // Catch: java.lang.Throwable -> L10
        this.v5 = getResources().getDisplayMetrics().density * 2.0f;     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = -80030152899912791L)
    private void DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2070346168301311611L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2070346168301311611L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        invalidate(-10, -10, getWidth() + 10, getHeight() + 10);     // Catch: java.lang.Throwable -> L8
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
    L27:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, 2196498643431194143L, this, new java.lang.Integer(r6));
    L31:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2196498643431194143L, this, r6);     // Catch: java.lang.Throwable -> L27
    L7:
        if (r6 != 130) goto L19;
        if (getChildCount() <= 0) goto L26;
        if ((getChildAt(0) instanceof android.view.ViewGroup) == false) goto L26;
        android.view.ViewGroup r2 = (android.view.ViewGroup) getChildAt(0);     // Catch: java.lang.Throwable -> L27
        if (r2.getChildCount() <= 0) goto L26;
        if ((r2.getChildAt(0) instanceof com.aide.common.ClassN) == false) goto L26;
        return r2.getChildAt(0);
    L26:
        return super.focusSearch(r6);
    L19:
        if (r6 != 33) goto L26;
        if ((getParent().getParent() instanceof com.aide.common.ClassN) == false) goto L26;
        android.view.ViewGroup r3 = (android.view.ViewGroup) getParent().getParent();     // Catch: java.lang.Throwable -> L27
        if (((android.view.ViewGroup) r3.getChildAt(0)).getChildAt(0) != this) goto L26;
        return r3;
    }

    @abcd.Interfacesu(method = 2050566322915344072L)
    protected void j6() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 211254612467715664L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(211254612467715664L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = -224902165668309216L)
    protected void onDraw(android.graphics.Canvas r7) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -33554994788841888L, this, r7);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-33554994788841888L, this, r7);     // Catch: java.lang.Throwable -> L16
    L6:
        super.onDraw(r7);     // Catch: java.lang.Throwable -> L16
        if (this.VH == true) goto L9;
        return;
    L9:
        if (this.Zo == false) goto L11;
    L14:
        r7.drawRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth() - 1, getHeight() - 1), this.v5, this.v5, this.Hw);     // Catch: java.lang.Throwable -> L16
        return;
    L11:
        if (isFocused() == true) goto L14;
        r7.drawRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth() - 1, getHeight() - 1), this.v5, this.v5, this.FH);     // Catch: java.lang.Throwable -> L16
    }

    @Override
    @abcd.Interfacesu(method = 794386187632089556L)
    protected void onFocusChanged(boolean r9, int r10, android.graphics.Rect r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 957929081249098440L, this, new java.lang.Boolean(r9), new java.lang.Integer(r10), r11);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(957929081249098440L, this, new java.lang.Boolean(r9), new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L9
    L5:
        super.onFocusChanged(r9, r10, r11);     // Catch: java.lang.Throwable -> L9
        if ((getParent() instanceof android.view.View) == false) goto L16;
        ((android.view.View) getParent()).invalidate();     // Catch: java.lang.Throwable -> L9
        return;
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 7062133595128325356L, this, r6);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(7062133595128325356L, this, r6);     // Catch: java.lang.Throwable -> L13
    L6:
        android.view.View r3 = getChildAt(0);     // Catch: java.lang.Throwable -> L13
        if ((r3 instanceof android.view.ViewGroup) == false) goto L11;
        if ((r3 instanceof android.widget.AdapterView) == true) goto L20;
        return false;
    L20:
        return true;
    L11:
        return true;
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, 2127159939489541760L, this, r7);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2127159939489541760L, this, r7);     // Catch: java.lang.Throwable -> L18
    L7:
        if (isEnabled() == true) goto L9;
    L16:
        return super.onTouchEvent(r7);
    L9:
        if (r7.getAction() != 0) goto L12;
        this.Zo = true;     // Catch: java.lang.Throwable -> L18
        DW();     // Catch: java.lang.Throwable -> L18
        postDelayed(new com.aide.common.Runnablem(this), 1000);     // Catch: java.lang.Throwable -> L18
    L12:
        if (r7.getAction() != 1) goto L16;
        if (this.Zo == false) goto L16;
        this.Zo = false;     // Catch: java.lang.Throwable -> L18
        DW();     // Catch: java.lang.Throwable -> L18
        goto L16
    }

    public void setIsVisible(boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2502057039925426905L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2502057039925426905L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH = r5;     // Catch: java.lang.Throwable -> L8
        invalidate();     // Catch: java.lang.Throwable -> L8
    }
}
