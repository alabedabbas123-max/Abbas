package com.aide.ui.views.editor;

@abcd.Interfacexu
public class ClassY {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2213565451470930465L)
    private android.graphics.Canvas FH;

    @abcd.Interfaceru(field = 3507393379949630652L)
    private android.graphics.Paint Hw;

    @abcd.Interfaceru(field = -4474959875070306480L)
    private android.graphics.Paint VH;

    @abcd.Interfaceru(field = 3989908510166070084L)
    private android.graphics.Paint Zo;

    @abcd.Interfaceru(field = -3299873652161921989L)
    private android.graphics.Paint v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassY.class, -7353299014352688448L, -7353299014352688448L);
    }

    public ClassY(android.graphics.Canvas r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -605090856915988128L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-605090856915988128L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
        this.v5 = new android.graphics.Paint();     // Catch: java.lang.Throwable -> L8
        this.v5.setStyle(android.graphics.Paint.Style.STROKE);     // Catch: java.lang.Throwable -> L8
        this.Zo = new android.graphics.Paint(1);     // Catch: java.lang.Throwable -> L8
        this.Hw = new android.graphics.Paint(1);     // Catch: java.lang.Throwable -> L8
        this.VH = new android.graphics.Paint();     // Catch: java.lang.Throwable -> L8
        this.VH.setFilterBitmap(true);     // Catch: java.lang.Throwable -> L8
    }

    public android.graphics.Rect DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4876262564070465135L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4876262564070465135L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH.getClipBounds();
    }

    public void DW(float r10, float r11, float r12, float r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 46722204233201740L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(46722204233201740L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.drawRect(r10, r11, r10 + r12, r11 + r13, this.v5);     // Catch: java.lang.Throwable -> L7
    }

    public com.aide.ui.views.editor.ClassJ FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2692424755444517745L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2692424755444517745L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.views.editor.ClassJ(this.v5.getColor());
    }

    public void FH(float r10, float r11, float r12, float r13) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 122880596251106365L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(122880596251106365L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));     // Catch: java.lang.Throwable -> L9
    L6:
        if (this.Zo.getColor() == 0) goto L16;
        this.FH.drawRect(r10, r11, r10 + r12, r11 + r13, this.Zo);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public int j6(char[] r10, int r11, int r12, float[] r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1153499729721352500L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1153499729721352500L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13);     // Catch: java.lang.Throwable -> L7
    L5:
        return this.Hw.getTextWidths(new java.lang.String(r10, r11, r12), r13);
    }

    public com.aide.ui.views.editor.sa j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4280198593186125045L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4280198593186125045L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.views.editor.sa(this.FH.getClipBounds());
    }

    public void j6(float r9, float r10, float r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 955626142363528364L, this, new java.lang.Float(r9), new java.lang.Float(r10), new java.lang.Float(r11));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(955626142363528364L, this, new java.lang.Float(r9), new java.lang.Float(r10), new java.lang.Float(r11));     // Catch: java.lang.Throwable -> L9
    L6:
        if (this.Zo.getColor() == 0) goto L16;
        this.FH.drawCircle(r9, r10, r11, this.Zo);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void j6(float r10, float r11, float r12, float r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 85231327918887104L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(85231327918887104L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.drawLine(r10, r11, r12, r13, this.v5);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(float r11, float r12, float r13, float r14, float r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1733723798634145899L, this, new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13), new java.lang.Float(r14), new java.lang.Float(r15));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1733723798634145899L, this, new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13), new java.lang.Float(r14), new java.lang.Float(r15));     // Catch: java.lang.Throwable -> L7
    L5:
        this.v5.setStrokeWidth(r15);     // Catch: java.lang.Throwable -> L7
        this.FH.drawLine(r11, r12, r13, r14, this.v5);     // Catch: java.lang.Throwable -> L7
        this.v5.setStrokeWidth(1.0f);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(android.graphics.Bitmap r10, float r11, float r12, float r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 652176900922497600L, this, r10, new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(652176900922497600L, this, r10, new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        int r0 = r10.getWidth();     // Catch: java.lang.Throwable -> L7
        int r1 = r10.getHeight();     // Catch: java.lang.Throwable -> L7
        this.FH.drawBitmap(r10, new android.graphics.Rect(0, 0, r0, r1), new android.graphics.RectF(r11, r12, (r0 * r13) + r11, (r1 * r13) + r12), this.VH);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(com.aide.ui.views.editor.ClassJ r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 959789661939208100L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(959789661939208100L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.setColor(r5.j6());     // Catch: java.lang.Throwable -> L8
        this.Zo.setColor(r5.j6());     // Catch: java.lang.Throwable -> L8
        this.Hw.setColor(r5.j6());     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.ui.views.editor.sa r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -211898888076645445L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-211898888076645445L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.clipRect(r6.j6(), android.graphics.Region.Op.REPLACE);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.ui.views.editor.ClassX r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 456265781125297260L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(456265781125297260L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.setTextSize(r5.FH);     // Catch: java.lang.Throwable -> L8
        this.Hw.setTypeface(r5.Hw);     // Catch: java.lang.Throwable -> L8
        this.Hw.setFakeBoldText(r5.v5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(com.aide.ui.views.editor.ClassZ r9, float r10, float r11) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -1315060682333460484L, this, r9, new java.lang.Float(r10), new java.lang.Float(r11));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-1315060682333460484L, this, r9, new java.lang.Float(r10), new java.lang.Float(r11));     // Catch: java.lang.Throwable -> L6
        return;
    }

    public void j6(java.lang.String r9, float r10, float r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2109645515561433155L, this, r9, new java.lang.Float(r10), new java.lang.Float(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2109645515561433155L, this, r9, new java.lang.Float(r10), new java.lang.Float(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.drawText(r9, r10, r11, this.Hw);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2318619284510447015L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2318619284510447015L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.setAntiAlias(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void j6(char[] r11, int r12, int r13, float r14, float r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1013972955537744643L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Float(r14), new java.lang.Float(r15));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1013972955537744643L, this, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Float(r14), new java.lang.Float(r15));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.drawText(r11, r12, r13, r14, r15, this.Hw);     // Catch: java.lang.Throwable -> L7
    }
}
