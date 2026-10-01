package com.aide.uidesigner;

@abcd.Interfacexu
class ClassD implements java.util.Comparator<java.io.File> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassD.class, -2705139259622029791L, 5069638513269065968L);
    }

    ClassD() {
    }

    @Override
    public int compare(java.io.File r1, java.io.File r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 16011194074055168L)
    public int j6(java.io.File r8, java.io.File r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 5530343609321838021L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5530343609321838021L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return r8.getName().compareTo(r9.getName());
    }
}
