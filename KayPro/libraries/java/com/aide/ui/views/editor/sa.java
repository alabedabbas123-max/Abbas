package com.aide.ui.views.editor;

@abcd.Interfacexu
public class sa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public float FH;
    public float Hw;
    public float Zo;
    public float v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.sa.class, 4995312689617170360L, 4995312689617170360L);
    }

    public sa(android.graphics.Rect r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 919612054478021071L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(919612054478021071L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6.left;     // Catch: java.lang.Throwable -> L8
        this.Hw = r6.top;     // Catch: java.lang.Throwable -> L8
        this.v5 = r6.right - r6.left;     // Catch: java.lang.Throwable -> L8
        this.Zo = r6.bottom - r6.top;     // Catch: java.lang.Throwable -> L8
    }

    public sa(com.aide.ui.views.editor.sa r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -583964220007417511L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-583964220007417511L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6.FH;     // Catch: java.lang.Throwable -> L8
        this.Hw = r6.Hw;     // Catch: java.lang.Throwable -> L8
        this.v5 = r6.v5;     // Catch: java.lang.Throwable -> L8
        this.Zo = r6.Zo;     // Catch: java.lang.Throwable -> L8
    }

    public android.graphics.RectF j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2168292519240769953L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2168292519240769953L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new android.graphics.RectF(this.FH, this.Hw, this.FH + this.v5, this.Hw + this.Zo);
    }
}
