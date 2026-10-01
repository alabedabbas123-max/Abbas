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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -2696952967213896540L, this, new java.lang.Float(r8), r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-2696952967213896540L, this, new java.lang.Float(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        super.applyTransformation(r8, r9);
                        this.FH.invalidate();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
