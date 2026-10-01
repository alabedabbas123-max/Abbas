package com.aide.ui.views.editor;

@abcd.Interfacexu
public class ClassX {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public float FH;
    public android.graphics.Typeface Hw;
    public boolean v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassX.class, -1402906950571771580L, -1402906950571771580L);
    }

    public ClassX(float r9, android.graphics.Typeface r10, int r11) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -168337655888775669L, null, new java.lang.Float(r9), r10, new java.lang.Integer(r11));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-168337655888775669L, null, new java.lang.Float(r9), r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L13
    L5:
        this.Hw = android.graphics.Typeface.create(r10, r11);     // Catch: java.lang.Throwable -> L13
        this.FH = r9;     // Catch: java.lang.Throwable -> L13
        if ((r11 & 1) != 0) goto L8;
    L10:
        boolean r0 = false;
    L11:
        this.v5 = r0;     // Catch: java.lang.Throwable -> L13
        return;
    L8:
        if (r10.isBold() == true) goto L10;
        r0 = true;
        goto L11
    }

    @abcd.Interfacesu(method = 177289077408575968L)
    private static float j6(android.graphics.Typeface r8, float r9, boolean r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -103938136445258752L, null, r8, new java.lang.Float(r9), new java.lang.Boolean(r10));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-103938136445258752L, null, r8, new java.lang.Float(r9), new java.lang.Boolean(r10));     // Catch: java.lang.Throwable -> L7
    L5:
        android.graphics.Paint r0 = new android.graphics.Paint();     // Catch: java.lang.Throwable -> L7
        r0.setFakeBoldText(r10);     // Catch: java.lang.Throwable -> L7
        r0.setTypeface(r8);     // Catch: java.lang.Throwable -> L7
        r0.setTextSize(r9);     // Catch: java.lang.Throwable -> L7
        return r0.measureText("public");
    }

    public static boolean j6(android.graphics.Typeface r7, float r8) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 1090149807440638067L, null, r7, new java.lang.Float(r8));
    L19:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1090149807440638067L, null, r7, new java.lang.Float(r8));     // Catch: java.lang.Throwable -> L15
    L5:
        android.graphics.Typeface r1 = android.graphics.Typeface.create(r7, 1);     // Catch: java.lang.Throwable -> L15
        if (r1.isBold() == true) goto L8;
        boolean r2 = true;
    L9:
        if (j6(r1, r8, r2) == j6(android.graphics.Typeface.create(r7, 0), r8, false)) goto L22;
        return false;
    L22:
        return true;
    L8:
        r2 = false;
        goto L9
    }
}
