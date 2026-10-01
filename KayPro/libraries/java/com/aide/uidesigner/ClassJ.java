package com.aide.uidesigner;

@abcd.Interfacexu
class ClassJ extends android.view.animation.TranslateAnimation {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassJ.class, -2761603648942096159L, 1467756678505809864L);
    }

    ClassJ(com.aide.uidesigner.XmlLayoutDesignActivity r1, float r2, float r3, float r4, float r5, android.view.View r6) {
        this.Hw = r1;
        this.FH = r6;
        super(r2, r3, r4, r5);
    }

    @Override
    @abcd.Interfacesu(method = 480745020842538816L)
    protected void applyTransformation(float r8, android.view.animation.Transformation r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2696952967213896540L, this, new java.lang.Float(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2696952967213896540L, this, new java.lang.Float(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super.applyTransformation(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.FH.invalidate();     // Catch: java.lang.Throwable -> L7
    }
}
