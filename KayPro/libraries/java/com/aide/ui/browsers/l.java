package com.aide.ui.browsers;

@abcd.Interfacexu
class l implements java.util.Comparator<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.browsers.FileBrowser FH;

    static {
        abcd.wu.j6(com.aide.ui.browsers.l.class, 5630979006676181253L, 974208454526411937L);
    }

    l(com.aide.ui.browsers.FileBrowser r1) {
        this.FH = r1;
    }

    @Override
    public int compare(java.lang.String r1, java.lang.String r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = -174904292936851685L)
    public int j6(java.lang.String r8, java.lang.String r9) {
    L38:
        th = move-exception;
        if (DW == false) goto L42;
        abcd.wu.j6(th, -1793199605573821267L, this, r8, r9);
    L42:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1793199605573821267L, this, r8, r9);     // Catch: java.lang.Throwable -> L38
    L6:
        boolean r1 = abcd.Vl.J0(r8);     // Catch: java.lang.Throwable -> L38
        boolean r2 = abcd.Vl.J0(r9);     // Catch: java.lang.Throwable -> L38
        java.lang.String r3 = abcd.Vl.tp(r8).toLowerCase();     // Catch: java.lang.Throwable -> L38
        java.lang.String r4 = abcd.Vl.tp(r9).toLowerCase();     // Catch: java.lang.Throwable -> L38
        if (r1 == false) goto L11;
        if (r2 == true) goto L11;
        return -1;
    L11:
        if (r1 == true) goto L14;
        if (r2 == false) goto L14;
        return 1;
    L14:
        if (r1 == false) goto L25;
        if (r2 == false) goto L25;
        boolean r0 = com.aide.ui.browsers.FileBrowser.j6(r3);     // Catch: java.lang.Throwable -> L38
        boolean r5 = com.aide.ui.browsers.FileBrowser.j6(r4);     // Catch: java.lang.Throwable -> L38
        if (r0 == false) goto L20;
        if (r5 == true) goto L20;
        return 1;
    L20:
        if (r0 == true) goto L24;
        if (r5 == false) goto L24;
        return -1;
    L24:
        return r3.compareTo(r4);
    L25:
        int r6 = r3.lastIndexOf(".");     // Catch: java.lang.Throwable -> L38
        java.lang.String r7 = "";
        if (r6 <= 0) goto L29;
        java.lang.String r10 = r3.substring(r6);     // Catch: java.lang.Throwable -> L38
    L30:
        int r11 = r4.lastIndexOf(".");     // Catch: java.lang.Throwable -> L38
        if (r11 <= 0) goto L33;
        r7 = r4.substring(r11);     // Catch: java.lang.Throwable -> L38
    L33:
        int r12 = r10.compareTo(r7);     // Catch: java.lang.Throwable -> L38
        if (r12 == 0) goto L37;
        return r12;
    L37:
        return r3.compareTo(r4);
    L29:
        r10 = "";
        goto L30
    }
}
