package com.aide.engine;

@abcd.Interfacexu
public class w implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2165122280292590880L)
    private final java.lang.Object FH;

    static {
        abcd.wu.j6(com.aide.engine.w.class, -5869603869117064877L, -5869603869117064877L);
    }

    public w(java.lang.Object r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 15273987377764496L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(15273987377764496L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    public java.lang.String toString() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1204927327852527720L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1204927327852527720L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.FH != null) goto L10;
        return "null";
    L10:
        return this.FH.toString();
    }
}
