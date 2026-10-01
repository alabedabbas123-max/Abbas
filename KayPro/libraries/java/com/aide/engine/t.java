package com.aide.engine;

@abcd.Interfacexu
public class t implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2390932251684259229L)
    private final com.aide.engine.s FH;

    @abcd.Interfaceru(field = 1470512555388930688L)
    private final com.aide.engine.s Hw;

    static {
        abcd.wu.j6(com.aide.engine.t.class, 1127103718700658792L, 1127103718700658792L);
    }

    public t(com.aide.engine.s r8, com.aide.engine.s r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3141386852127688479L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3141386852127688479L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r8;     // Catch: java.lang.Throwable -> L7
        this.Hw = r9;     // Catch: java.lang.Throwable -> L7
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2587857934923953943L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2587857934923953943L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH + "[" + this.Hw + "]";
    }
}
