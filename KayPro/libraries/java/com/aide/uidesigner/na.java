package com.aide.uidesigner;

@abcd.Interfacexu
class na extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final com.aide.common.ab EQ;
    final java.util.List gn;
    final boolean tp;
    final java.lang.String u7;

    static {
        abcd.wu.j6(com.aide.uidesigner.na.class, -20062164340700416L, 304247859432616215L);
    }

    na(java.util.List r1, java.lang.String r2, boolean r3, com.aide.common.ab r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = -182576620641636615L)
    public android.app.Dialog j6(android.app.Activity r7) {
        android.widget.ExpandableListView r2 = null;
        android.app.AlertDialog r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 176652414157537197L, this, r7);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(176652414157537197L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.widget.ExpandableListView(r7);
                        r2.setAdapter(new com.aide.uidesigner.Ka.b(r7, this.gn));
                        r3 = new android.app.AlertDialog.Builder(r7).setCancelable(true).setView(r2).setTitle(this.u7).create();
                        r2.setOnChildClickListener(new com.aide.uidesigner.ma(this, r3));
                        r3.setCanceledOnTouchOutside(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
