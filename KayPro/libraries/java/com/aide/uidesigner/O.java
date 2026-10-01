package com.aide.uidesigner;

@abcd.Interfacexu
class O implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;
    final android.app.Activity v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.O.class, 2051778340695604592L, -3476757842972596567L);
    }

    O(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2, android.app.Activity r3) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = 4195710493438311392L)
    public void j62(java.lang.String r8) {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 23: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 27; continue $sw0; }
                    abcd.wu.j6(th, 300942786749748933L, this, r8);
                    $pc0 = 27; continue $sw0;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 8; continue $sw0; }
                    try {
                        abcd.wu.j6(300942786749748933L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 23; continue $sw0;
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r8.equals("Wrap Content") == false) { $pc0 = 12; continue $sw0; }
                    try {
                        this.FH.j6(this.Hw, "wrap_content");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 23; continue $sw0;
                    }
                    return;
                }
                case 12: {
                    if (r8.equals("Match Parent") == false) { $pc0 = 16; continue $sw0; }
                    try {
                        this.FH.j6(this.Hw, "match_parent");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 23; continue $sw0;
                    }
                    return;
                }
                case 16: {
                    if ("match_parent".equals(this.Hw.Hw) == false) { $pc0 = 18; continue $sw0; }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    r2 = "10dp";
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    try {
                        com.aide.uidesigner.ka.j6(this.v5, this.FH, this.Hw, r2, "10dp");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 23; continue $sw0;
                    }
                    return;
                }
                case 18: {
                    if ("wrap_content".equals(this.Hw.Hw) == true) { $pc0 = 20; continue $sw0; }
                    try {
                        r2 = this.Hw.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 23; continue $sw0;
                    }
                    { $pc0 = 21; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
