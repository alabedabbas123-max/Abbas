package com.aide.uidesigner;

@abcd.Interfacexu
class ga implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final com.aide.uidesigner.ClassS Hw;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ga.class, 2051778340695604592L, 2148826478770275736L);
    }

    ga(android.app.Activity r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -5358581029720838976L)
    public void j62(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 18; continue $sw0; }
                    abcd.wu.j6(th, 7957711318513413560L, this, r6);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(7957711318513413560L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r6.equals("Color...") == false) { $pc0 = 10; continue $sw0; }
                    try {
                        com.aide.uidesigner.ka.DW(this.FH, this.Hw, this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 10: {
                    if (r6.equals("Drawable...") == false) { $pc0 = 12; continue $sw0; }
                    try {
                        com.aide.uidesigner.ka.FH(this.FH, this.Hw, this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 12: {
                    try {
                        this.Hw.j6(this.v5, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
