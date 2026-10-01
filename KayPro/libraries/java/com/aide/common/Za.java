package com.aide.common;

@abcd.Interfacexu
public class Za extends android.graphics.drawable.Drawable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 530367287756106504L)
    private android.content.Context FH;

    @abcd.Interfaceru(field = 1089982636806485568L)
    private android.graphics.drawable.Drawable Hw;

    @abcd.Interfaceru(field = 1107372641231293568L)
    private java.lang.String[] v5;

    static {
        abcd.wu.j6(com.aide.common.Za.class, 719480879837168673L, 719480879837168673L);
    }

    public Za(android.content.Context r9, int r10, java.lang.String[] r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -707788385893162448L, null, r9, new java.lang.Integer(r10), r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-707788385893162448L, null, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r9;     // Catch: java.lang.Throwable -> L7
        this.v5 = r11;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9.getResources().getDrawable(r10);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.ActionBar r8, int r9, java.lang.String[] r10) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -6349990907778744920L, null, r8, new java.lang.Integer(r9), r10);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-6349990907778744920L, null, r8, new java.lang.Integer(r9), r10);     // Catch: java.lang.Throwable -> L10
    L5:
        android.content.Context r0 = r8.getThemedContext();     // Catch: java.lang.Throwable -> L10
        if (com.aide.common.ClassG.QX(r0) == false) goto L8;
        r8.setDisplayShowTitleEnabled(true);     // Catch: java.lang.Throwable -> L10
        r8.setIcon(r9);     // Catch: java.lang.Throwable -> L10
        r8.setTitle(r10[0]);     // Catch: java.lang.Throwable -> L10
        r8.setSubtitle(r10[1]);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        r8.setDisplayShowTitleEnabled(false);     // Catch: java.lang.Throwable -> L10
        r8.setLogo(new com.aide.common.Za(r0, r9, r10));     // Catch: java.lang.Throwable -> L10
    }

    @Override
    public void draw(android.graphics.Canvas r9) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 541004158327237965L, this, r9);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(541004158327237965L, this, r9);     // Catch: java.lang.Throwable -> L8
    L6:
        android.graphics.Paint r2 = new android.graphics.Paint();     // Catch: java.lang.Throwable -> L8
        r2.setColor(-13421773);     // Catch: java.lang.Throwable -> L8
        r2.setAntiAlias(true);     // Catch: java.lang.Throwable -> L8
        r2.setTextSize(40.0f);     // Catch: java.lang.Throwable -> L8
        r2.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);     // Catch: java.lang.Throwable -> L8
        r9.drawText(this.v5[0], 120.0f, 40.0f, r2);     // Catch: java.lang.Throwable -> L8
        r2.setTextSize(35.0f);     // Catch: java.lang.Throwable -> L8
        r2.setTypeface(android.graphics.Typeface.DEFAULT);     // Catch: java.lang.Throwable -> L8
        r9.drawText(this.v5[1], 120.0f, 90.0f, r2);     // Catch: java.lang.Throwable -> L8
        this.Hw.setBounds(0, 0, 100, 100);     // Catch: java.lang.Throwable -> L8
        this.Hw.draw(r9);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public int getIntrinsicHeight() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5348465685662353408L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(5348465685662353408L, this);     // Catch: java.lang.Throwable -> L8
        return 100;
    L15:
        return 100;
    }

    @Override
    public int getIntrinsicWidth() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2281900910868417475L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(2281900910868417475L, this);     // Catch: java.lang.Throwable -> L8
        return 400;
    L15:
        return 400;
    }

    @Override
    public int getOpacity() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1519488372921239203L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1519488372921239203L, this);     // Catch: java.lang.Throwable -> L8
        return -1;
    L15:
        return -1;
    }

    @Override
    public void setAlpha(int r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 343205115111904437L, this, new java.lang.Integer(r5));
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(343205115111904437L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    public void setColorFilter(android.graphics.ColorFilter r5) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1514245693360453476L, this, r5);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-1514245693360453476L, this, r5);     // Catch: java.lang.Throwable -> L7
        return;
    }
}
