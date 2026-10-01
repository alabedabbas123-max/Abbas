package com.aide.ui.browsers;

@abcd.Interfacexu
class i implements android.widget.AdapterView.OnItemLongClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CustomKeysListView FH;

    @abcd.Interfacevu
    final com.aide.ui.browsers.FileBrowser Hw;

    static {
        abcd.wu.j6(com.aide.ui.browsers.i.class, 5630979006676181253L, 974159735218341240L);
    }

    i(com.aide.ui.browsers.FileBrowser r1, com.aide.ui.views.CustomKeysListView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -1510103773586112649L)
    public boolean onItemLongClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1424469017040956483L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1424469017040956483L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L10
    L5:
        com.aide.ui.browsers.FileBrowser.b r0 = (com.aide.ui.browsers.FileBrowser.b) this.FH.getItemAtPosition(r12);     // Catch: java.lang.Throwable -> L10
        if (r0 != null) goto L8;
        return true;
    L8:
        com.aide.ui.browsers.FileBrowser.j6(this.Hw, r0);     // Catch: java.lang.Throwable -> L10
        com.aide.ui.browsers.FileBrowser.j6(this.Hw, r11, true);     // Catch: java.lang.Throwable -> L10
        return true;
    }
}
