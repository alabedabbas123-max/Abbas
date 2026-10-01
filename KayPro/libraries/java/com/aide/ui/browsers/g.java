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
        com.aide.ui.browsers.FileBrowser.b r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 309076927363851612L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(309076927363851612L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (com.aide.ui.browsers.FileBrowser.b) this.FH.getItemAtPosition(r12);
                        com.aide.ui.browsers.FileBrowser.j6(this.Hw, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1002715361939203776L)
    public void onNothingSelected(android.widget.AdapterView<?> r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -600036516860059017L, this, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-600036516860059017L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        com.aide.ui.browsers.FileBrowser.j6(this.Hw, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
