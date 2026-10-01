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
        com.aide.ui.debugger.DebugView.a r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 15: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 19; continue $sw0; }
                    abcd.wu.j6(th, -4971612561135926712L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-4971612561135926712L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (com.aide.ui.debugger.DebugView.a) this.FH.getAdapter().getItem(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    if (r0.Hw == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r0.Hw.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    if (r0.FH == null) { $pc0 = 12; continue $sw0; }
                    try {
                        r0.FH.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return;
                }
                case 12: {
                    if (r0.v5 == null) { $pc0 = 23; continue $sw0; }
                    try {
                        r0.v5.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return;
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
