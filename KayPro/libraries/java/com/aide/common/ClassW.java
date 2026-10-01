package com.aide.common;

@abcd.Interfacexu
class ClassW implements com.aide.common.KeyStrokeDetector.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.KeyStrokeEditText FH;

    static {
        abcd.wu.j6(com.aide.common.ClassW.class, -2670818707938442347L, 620407520647363400L);
    }

    ClassW(com.aide.common.KeyStrokeEditText r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2734340384647146825L)
    public boolean j6(com.aide.common.ClassU r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 2255394380938386479L, this, r5);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2255394380938386479L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        this.FH.setKeyStroke(r5);     // Catch: java.lang.Throwable -> L9
        return true;
    }
}
