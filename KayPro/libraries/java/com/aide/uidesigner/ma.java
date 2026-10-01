package com.aide.uidesigner;

@abcd.Interfacexu
class ma implements android.widget.ExpandableListView.OnChildClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.na Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ma.class, -20062164340700416L, -1453526942889476916L);
    }

    ma(com.aide.uidesigner.na r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3268146217971866880L)
    public boolean onChildClick(android.widget.ExpandableListView r15, android.view.View r16, int r17, int r18, long r19) {
        com.aide.uidesigner.Ka.a r0 = null;
        java.util.HashMap r1 = null;
        com.aide.uidesigner.ClassB r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 26: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 30; continue $sw0; }
                    abcd.wu.j6(th, 6212157870653134011L, this, r15, r16, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Long(r19));
                    $pc0 = 30; continue $sw0;
                }
                case 30: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(6212157870653134011L, this, r15, r16, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Long(r19));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.dismiss();
                        r0 = (com.aide.uidesigner.Ka.a) ((java.util.List) this.Hw.gn.get(r17)).get(r18);
                        r1 = new java.util.HashMap();
                        r1.putAll(r0.Hw());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    if (this.Hw.tp == false) { $pc0 = 18; continue $sw0; }
                    if (r1.containsKey("android:layout_width") == true) { $pc0 = 14; continue $sw0; }
                    try {
                        r1.put("android:layout_width", "match_parent");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if (r1.containsKey("android:layout_height") == true) { $pc0 = 23; continue $sw0; }
                    try {
                        r1.put("android:layout_height", "match_parent");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    try {
                        r2 = new com.aide.uidesigner.ClassB(r0.VH(), r1);
                        this.Hw.EQ.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    return true;
                }
                case 18: {
                    if (r1.containsKey("android:layout_width") == true) { $pc0 = 21; continue $sw0; }
                    try {
                        r1.put("android:layout_width", "wrap_content");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    if (r1.containsKey("android:layout_height") == true) { $pc0 = 23; continue $sw0; }
                    try {
                        r1.put("android:layout_height", "wrap_content");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    { $pc0 = 23; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
