package com.aide.ui.browsers;

@abcd.Interfacexu
class g implements android.widget.AdapterView.OnItemSelectedListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.CustomKeysListView FH;

    @abcd.Interfacevu
    final com.aide.ui.browsers.FileBrowser Hw;

    static {
        abcd.wu.j6(com.aide.ui.browsers.g.class, 5630979006676181253L, 974127255699943912L);
    }

    g(com.aide.ui.browsers.FileBrowser r1, com.aide.ui.views.CustomKeysListView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 873626513395257995L)
    public void onItemSelected(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 309076927363851612L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(309076927363851612L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.browsers.FileBrowser.b r0 = (com.aide.ui.browsers.FileBrowser.b) this.FH.getItemAtPosition(r12);     // Catch: java.lang.Throwable -> L7
        com.aide.ui.browsers.FileBrowser.j6(this.Hw, r0);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = -1002715361939203776L)
    public void onNothingSelected(android.widget.AdapterView<?> r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -600036516860059017L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-600036516860059017L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.browsers.FileBrowser.j6(this.Hw, null);     // Catch: java.lang.Throwable -> L8
    }
}
