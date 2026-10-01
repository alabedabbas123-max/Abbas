package com.aide.uidesigner;

@abcd.Interfacexu
class ha implements com.aide.common.ab<java.lang.Integer> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.List FH;
    final com.aide.uidesigner.ClassS Hw;
    final java.util.ArrayList VH;
    final android.app.Activity Zo;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ha.class, 2051778340695604592L, 2148878598113111865L);
    }

    ha(java.util.List r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3, android.app.Activity r4, java.util.ArrayList r5) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
        this.VH = r5;
    }

    @abcd.Interfacesu(method = -5811126370284434680L)
    public void j62(java.lang.Integer r7) {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 17: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 21; continue $sw0; }
                    abcd.wu.j6(th, 3339260184219208879L, this, r7);
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3339260184219208879L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = (java.lang.String) this.FH.get(r7.intValue());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    if (r2.equals("none") == false) { $pc0 = 10; continue $sw0; }
                    try {
                        this.Hw.j6(this.v5, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return;
                }
                case 10: {
                    if (r2.equals("other...") == false) { $pc0 = 13; continue $sw0; }
                    try {
                        com.aide.uidesigner.ka.j6(this.Zo, this.Hw, this.v5, "@drawable/");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return;
                }
                case 13: {
                    if (r2.equals("add...") == false) { $pc0 = 15; continue $sw0; }
                    try {
                        com.aide.uidesigner.ka.Hw(this.Zo, this.Hw, this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return;
                }
                case 15: {
                    try {
                        this.Hw.j6(this.v5, (java.lang.String) this.VH.get(r7.intValue()));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.Integer r1) {
        j62(r1);
    }
}
