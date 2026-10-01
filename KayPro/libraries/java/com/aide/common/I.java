package com.aide.common;

@abcd.Interfacexu
class I implements com.aide.common.ab<java.util.List<java.lang.Integer>> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.ab FH;
    final java.util.List Hw;

    static {
        abcd.wu.j6(com.aide.common.I.class, 5024868934807443193L, 6163089110917039588L);
    }

    I(com.aide.common.ab r1, java.util.List r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    public void j6(java.util.List<java.lang.Integer> r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -7576421390331842895L)
    public void j62(java.util.List<java.lang.Integer> r7) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 1553030859183131929L, this, r7);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1553030859183131929L, this, r7);     // Catch: java.lang.Throwable -> L18
    L7:
        if (r7.size() != 0) goto L9;
        this.FH.j6(null);     // Catch: java.lang.Throwable -> L18
        return;
    L9:
        java.lang.String r2 = "";
        java.util.Iterator<java.lang.Integer> r3 = r7.iterator();     // Catch: java.lang.Throwable -> L18
    L11:
        if (r3.hasNext() == false) goto L16;
        int r4 = r3.next().intValue();     // Catch: java.lang.Throwable -> L18
        if (r2.length() <= 0) goto L15;
        r2 = r2 + "|";     // Catch: java.lang.Throwable -> L18
    L15:
        r2 = r2 + ((java.lang.String) this.Hw.get(r4));     // Catch: java.lang.Throwable -> L18
        goto L11
    L16:
        this.FH.j6(r2);     // Catch: java.lang.Throwable -> L18
    }
}
