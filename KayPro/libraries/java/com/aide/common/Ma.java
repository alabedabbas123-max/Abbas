package com.aide.common;

@abcd.Interfacexu
class Ma implements android.widget.AdapterView.OnItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.ListView FH;
    final android.app.Activity Hw;

    @abcd.Interfacevu
    final com.aide.common.Wa Zo;
    final android.app.AlertDialog v5;

    static {
        abcd.wu.j6(com.aide.common.Ma.class, 1991841546302420120L, 4295899963058578281L);
    }

    Ma(com.aide.common.Wa r1, android.widget.ListView r2, android.app.Activity r3, android.app.AlertDialog r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = -5489272191350157225L)
    public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
        com.aide.common.Wa.b r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 19: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 23; continue $sw0; }
                    abcd.wu.j6(th, 4614292038882057663L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(4614292038882057663L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (com.aide.common.Wa.b) r10.getItemAtPosition(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (com.aide.common.Wa.b.j6(r0) == false) { $pc0 = 16; continue $sw0; }
                    if (com.aide.common.Wa.DW(this.Zo) != null) { $pc0 = 10; continue $sw0; }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    try {
                        this.v5.dismiss();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    if (com.aide.common.Wa.j6(this.Zo) == null) { $pc0 = 16; continue $sw0; }
                    try {
                        com.aide.common.Wa.j6(this.Zo).run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    { $pc0 = 16; continue $sw0; }
                }
                case 10: {
                    if (com.aide.common.Wa.FH(this.Zo) == true) { $pc0 = 12; continue $sw0; }
                    try {
                        com.aide.common.Wa.j6(this.Zo, true);
                        this.FH.setAdapter(new com.aide.common.Wa.a(this.Zo, this.Hw, com.aide.common.Wa.DW(this.Zo)));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    if (com.aide.common.Wa.b.DW(r0) == null) { $pc0 = 26; continue $sw0; }
                    try {
                        com.aide.common.Wa.b.DW(r0).run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 19; continue $sw0;
                    }
                    return;
                }
                case 26: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
