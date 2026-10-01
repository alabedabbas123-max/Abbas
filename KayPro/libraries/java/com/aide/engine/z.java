package com.aide.engine;

@abcd.Interfacexu
public class z implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1782501115973262912L)
    private final com.aide.engine.s FH;

    @abcd.Interfaceru(field = -1697074097138248961L)
    private final java.lang.Class Hw;

    @abcd.Interfaceru(field = 2362166014735210488L)
    private final java.lang.Class v5;

    static {
        abcd.wu.j6(com.aide.engine.z.class, -4933782201093643184L, -4933782201093643184L);
    }

    public z(com.aide.engine.s r9, java.lang.Class r10, java.lang.Class r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -765366942442970775L, null, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-765366942442970775L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r9;     // Catch: java.lang.Throwable -> L7
        this.Hw = r10;     // Catch: java.lang.Throwable -> L7
        this.v5 = r11;     // Catch: java.lang.Throwable -> L7
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1655237069751377068L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1655237069751377068L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return "(" + this.v5.getName() + ") " + this.FH;
    }
}
