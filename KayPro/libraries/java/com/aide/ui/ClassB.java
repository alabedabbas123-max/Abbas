package com.aide.ui;

@abcd.Interfacexu
class ClassB implements java.util.Comparator<com.aide.engine.SourceEntity> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.Binderd FH;

    static {
        abcd.wu.j6(com.aide.ui.ClassB.class, 1778539205842150985L, -179235748457578440L);
    }

    ClassB(com.aide.ui.Binderd r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.engine.SourceEntity r1, com.aide.engine.SourceEntity r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 1020758115910731345L)
    public int j6(com.aide.engine.SourceEntity r8, com.aide.engine.SourceEntity r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5702188855058932111L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5702188855058932111L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return r8.we().toLowerCase().compareTo(r9.we().toLowerCase());
    }
}
