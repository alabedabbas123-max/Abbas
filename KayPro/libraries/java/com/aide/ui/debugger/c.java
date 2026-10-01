package com.aide.ui.debugger;

@abcd.Interfacexu
class c implements android.widget.AdapterView.OnItemLongClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.debugger.DebugView FH;

    static {
        abcd.wu.j6(com.aide.ui.debugger.c.class, 3296790518352727939L, -3189507922447283397L);
    }

    c(com.aide.ui.debugger.DebugView r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 534982246111566549L)
    public boolean onItemLongClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1850133580720404200L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-1850133580720404200L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        ((android.content.ClipboardManager) this.FH.getContext().getSystemService("clipboard")).setText(((android.widget.TextView) r11.findViewById(com.almlkaide.kaypro.R.id.debuggerEntryName)).getText().toString().replace(" ", " "));
                        com.almlkaide.kaypro.util.Toasty.toast(this.FH.getContext(), com.almlkaide.kaypro.R.string.view_toast_copied_to_clipboard, 0).show();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
