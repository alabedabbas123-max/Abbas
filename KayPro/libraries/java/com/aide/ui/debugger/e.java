package com.aide.ui.debugger;

@abcd.Interfacexu
class e implements java.util.Comparator<com.aide.ui.debugger.Debugger.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.debugger.Debugger FH;

    static {
        abcd.wu.j6(com.aide.ui.debugger.e.class, 1693385072073297168L, -1681562570888520328L);
    }

    e(com.aide.ui.debugger.Debugger r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.ui.debugger.Debugger.a r1, com.aide.ui.debugger.Debugger.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 60290718605040000L)
    public int j6(com.aide.ui.debugger.Debugger.a r8, com.aide.ui.debugger.Debugger.a r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -911111694508386428L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-911111694508386428L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = r8.Hw.compareTo(r9.Hw);     // Catch: java.lang.Throwable -> L11
        if (r0 == 0) goto L8;
        return r0;
    L8:
        return r8.v5 - r9.v5;
    }
}
