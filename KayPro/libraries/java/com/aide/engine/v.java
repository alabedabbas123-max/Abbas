package com.aide.engine;

@abcd.Interfacexu
public class v implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 81248612460903040L)
    private final com.aide.engine.s FH;

    @abcd.Interfaceru(field = -1943702965759404421L)
    private final com.aide.engine.s Hw;

    @abcd.Interfaceru(field = -2052139946700345411L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.engine.v.class, -2113641575223505767L, -2113641575223505767L);
    }

    public v(com.aide.engine.s r9, com.aide.engine.s r10, java.lang.String r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 6399633874708922536L, null, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6399633874708922536L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r10;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9;     // Catch: java.lang.Throwable -> L7
        this.v5 = r11;     // Catch: java.lang.Throwable -> L7
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2240782965461983553L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2240782965461983553L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw + this.v5 + this.FH;
    }
}
