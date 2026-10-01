package com.aide.uidesigner;

@abcd.Interfacexu
class da implements com.aide.common.ab<com.aide.uidesigner.ClassS> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;
    final android.app.Activity v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.da.class, 2051778340695604592L, 2148670120766147113L);
    }

    da(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2, android.app.Activity r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @abcd.Interfacesu(method = 434870954962979600L)
    public void j62(com.aide.uidesigner.ClassS r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, -4791861369533368800L, this, r7);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-4791861369533368800L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r7.getViewID() != null) { $pc0 = 9; continue $sw0; }
                    try {
                        this.FH.j6(this.Hw, r7, r7.EQ());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        com.almlkaide.kaypro.util.Toasty.toast(this.v5, "View was selected for attribute " + this.Hw.FH.j6(), 0).show();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    try {
                        this.FH.j6(this.Hw, null, r7.getViewID());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(com.aide.uidesigner.ClassS r1) {
        j62(r1);
    }
}
