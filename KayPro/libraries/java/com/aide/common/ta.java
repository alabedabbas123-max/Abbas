package com.aide.common;

@abcd.Interfacexu
class ta implements android.widget.AdapterView.OnItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final com.aide.common.ua Hw;

    static {
        abcd.wu.j6(com.aide.common.ta.class, -5728075795338140784L, 3511701246127052745L);
    }

    ta(com.aide.common.ua r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3029969737543561421L)
    public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3696185828202684321L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3696185828202684321L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.dismiss();     // Catch: java.lang.Throwable -> L7
        ((com.aide.common.ua.a) com.aide.common.ua.j6(this.Hw).get(r12)).run();     // Catch: java.lang.Throwable -> L7
    }
}
