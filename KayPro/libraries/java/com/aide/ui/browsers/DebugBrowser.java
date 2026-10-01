package com.aide.ui.browsers;

@abcd.Interfacexu
public class DebugBrowser extends android.widget.LinearLayout implements com.aide.ui.browsers.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2542993726183447776L)
    private com.aide.ui.debugger.DebugView FH;

    static {
        abcd.wu.j6(com.aide.ui.browsers.DebugBrowser.class, -7952777071481453884L, -7952777071481453884L);
    }

    public DebugBrowser(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3281695828500395712L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3281695828500395712L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        Hw();     // Catch: java.lang.Throwable -> L8
    }

    public DebugBrowser(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1696557347334413025L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1696557347334413025L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        Hw();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -1907980205095799575L)
    private void Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2616171380868274944L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2616171380868274944L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));     // Catch: java.lang.Throwable -> L8
        removeAllViews();     // Catch: java.lang.Throwable -> L8
        com.aide.ui.debugger.DebugView r2 = new com.aide.ui.debugger.DebugView(getContext());     // Catch: java.lang.Throwable -> L8
        this.FH = r2;     // Catch: java.lang.Throwable -> L8
        addView(r2);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void DW() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1069153245918441360L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(1069153245918441360L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public void FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2940359921276748300L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2940359921276748300L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.j6();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void j6() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -766701334913309432L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-766701334913309432L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }
}
