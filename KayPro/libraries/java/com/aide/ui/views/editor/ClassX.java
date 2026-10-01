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
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 13: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, -168337655888775669L, null, new java.lang.Float(r9), r10, new java.lang.Integer(r11));
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-168337655888775669L, null, new java.lang.Float(r9), r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.Hw = android.graphics.Typeface.create(r10, r11);
                        this.FH = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    if ((r11 & 1) != 0) { $pc0 = 8; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r0 = false;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        this.v5 = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    if (r10.isBold() == true) { $pc0 = 10; continue $sw0; }
                    r0 = true;
                    { $pc0 = 11; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 177289077408575968L)
    private static float j6(android.graphics.Typeface r8, float r9, boolean r10) {
        android.graphics.Paint r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -103938136445258752L, null, r8, new java.lang.Float(r9), new java.lang.Boolean(r10));
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-103938136445258752L, null, r8, new java.lang.Float(r9), new java.lang.Boolean(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = new android.graphics.Paint();
                        r0.setFakeBoldText(r10);
                        r0.setTypeface(r8);
                        r0.setTextSize(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return r0.measureText("public");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.graphics.Typeface r7, float r8) {
        android.graphics.Typeface r1 = null;
        boolean r2 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 15: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 19; continue $sw2; }
                    abcd.wu.j6(th, 1090149807440638067L, null, r7, new java.lang.Float(r8));
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(1090149807440638067L, null, r7, new java.lang.Float(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r1 = android.graphics.Typeface.create(r7, 1);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    if (r1.isBold() == true) { $pc2 = 8; continue $sw2; }
                    r2 = true;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (j6(r1, r8, r2) == j6(android.graphics.Typeface.create(r7, 0), r8, false)) { $pc2 = 22; continue $sw2; }
                    return false;
                }
                case 22: {
                    return true;
                }
                case 8: {
                    r2 = false;
                    { $pc2 = 9; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
