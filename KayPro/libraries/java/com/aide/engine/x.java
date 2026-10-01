package com.aide.engine;

@abcd.Interfacexu
public class x implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 99165816560974272L)
    private final boolean FH;

    @abcd.Interfaceru(field = -170320190808196716L)
    private final boolean Hw;

    @abcd.Interfaceru(field = -1061912428789299759L)
    private final com.aide.engine.s VH;

    @abcd.Interfaceru(field = 3363066909263371761L)
    private final java.lang.String Zo;

    @abcd.Interfaceru(field = 1702402661245362377L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.engine.x.class, 7418598902998530225L, 7418598902998530225L);
    }

    public x(boolean r11, boolean r12, java.lang.String r13, java.lang.String r14, com.aide.engine.s r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1357907814218154240L, null, new java.lang.Boolean(r11), new java.lang.Boolean(r12), r13, r14, r15);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1357907814218154240L, null, new java.lang.Boolean(r11), new java.lang.Boolean(r12), r13, r14, r15);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r11;     // Catch: java.lang.Throwable -> L7
        this.Hw = r12;     // Catch: java.lang.Throwable -> L7
        this.v5 = r13;     // Catch: java.lang.Throwable -> L7
        this.Zo = r14;     // Catch: java.lang.Throwable -> L7
        this.VH = r15;     // Catch: java.lang.Throwable -> L7
    }

    public java.lang.String toString() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 3476766796497400048L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3476766796497400048L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L12
        if (this.FH == false) goto L9;
        java.lang.String r3 = "";
    L10:
        r2.append(r3);     // Catch: java.lang.Throwable -> L12
        r2.append("(");     // Catch: java.lang.Throwable -> L12
        r2.append(this.v5);     // Catch: java.lang.Throwable -> L12
        r2.append(").");     // Catch: java.lang.Throwable -> L12
        r2.append(this.Zo);     // Catch: java.lang.Throwable -> L12
        return r2.toString();
    L9:
        r3 = this.VH + ".";     // Catch: java.lang.Throwable -> L12
        goto L10
    }
}
