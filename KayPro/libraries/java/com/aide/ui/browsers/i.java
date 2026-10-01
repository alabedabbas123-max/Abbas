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
        com.aide.ui.browsers.FileBrowser.b r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 1424469017040956483L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(1424469017040956483L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (com.aide.ui.browsers.FileBrowser.b) this.FH.getItemAtPosition(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    if (r0 != null) { $pc0 = 8; continue $sw0; }
                    return true;
                }
                case 8: {
                    try {
                        com.aide.ui.browsers.FileBrowser.j6(this.Hw, r0);
                        com.aide.ui.browsers.FileBrowser.j6(this.Hw, r11, true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
