package com.aide.ui.debugger;

@abcd.Interfacexu
class b implements android.widget.AdapterView.OnItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.ListView FH;

    @abcd.Interfacevu
    final com.aide.ui.debugger.DebugView Hw;

    static {
        abcd.wu.j6(com.aide.ui.debugger.b.class, 3296790518352727939L, -3189447614621606240L);
    }

    b(com.aide.ui.debugger.DebugView r1, android.widget.ListView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -495482328383007849L)
    public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -4971612561135926712L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L19:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4971612561135926712L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L15
    L5:
        com.aide.ui.debugger.DebugView.a r0 = (com.aide.ui.debugger.DebugView.a) this.FH.getAdapter().getItem(r12);     // Catch: java.lang.Throwable -> L15
        if (r0.Hw == null) goto L9;
        r0.Hw.j6();     // Catch: java.lang.Throwable -> L15
        return;
    L9:
        if (r0.FH == null) goto L12;
        r0.FH.j6();     // Catch: java.lang.Throwable -> L15
        return;
    L12:
        if (r0.v5 == null) goto L23;
        r0.v5.DW();     // Catch: java.lang.Throwable -> L15
        return;
    }
}
