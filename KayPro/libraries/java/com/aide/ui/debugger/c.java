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
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1850133580720404200L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1850133580720404200L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L8
    L5:
        ((android.content.ClipboardManager) this.FH.getContext().getSystemService("clipboard")).setText(((android.widget.TextView) r11.findViewById(com.almlkaide.kaypro.R.id.debuggerEntryName)).getText().toString().replace(" ", " "));     // Catch: java.lang.Throwable -> L8
        com.almlkaide.kaypro.util.Toasty.toast(this.FH.getContext(), com.almlkaide.kaypro.R.string.view_toast_copied_to_clipboard, 0).show();     // Catch: java.lang.Throwable -> L8
        return true;
    }
}
