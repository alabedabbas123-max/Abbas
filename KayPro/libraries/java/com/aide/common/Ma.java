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
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 4614292038882057663L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L23:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4614292038882057663L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L19
    L5:
        com.aide.common.Wa.b r0 = (com.aide.common.Wa.b) r10.getItemAtPosition(r12);     // Catch: java.lang.Throwable -> L19
        if (com.aide.common.Wa.b.j6(r0) == false) goto L16;
        if (com.aide.common.Wa.DW(this.Zo) != null) goto L10;
    L12:
        this.v5.dismiss();     // Catch: java.lang.Throwable -> L19
        if (com.aide.common.Wa.j6(this.Zo) == null) goto L16;
        com.aide.common.Wa.j6(this.Zo).run();     // Catch: java.lang.Throwable -> L19
        goto L16
    L10:
        if (com.aide.common.Wa.FH(this.Zo) == true) goto L12;
        com.aide.common.Wa.j6(this.Zo, true);     // Catch: java.lang.Throwable -> L19
        this.FH.setAdapter(new com.aide.common.Wa.a(this.Zo, this.Hw, com.aide.common.Wa.DW(this.Zo)));     // Catch: java.lang.Throwable -> L19
    L16:
        if (com.aide.common.Wa.b.DW(r0) == null) goto L26;
        com.aide.common.Wa.b.DW(r0).run();     // Catch: java.lang.Throwable -> L19
        return;
    }
}
