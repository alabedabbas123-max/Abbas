package com.aide.uidesigner;

@abcd.Interfacexu
class T implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.T.class, 2051778340695604592L, -3477060578540684295L);
    }

    T(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = 1818244047642369991L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 823730582088214992L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(823730582088214992L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.j6(this.Hw, null);     // Catch: java.lang.Throwable -> L8
    }
}
