package com.aide.engine;

@abcd.Interfacexu
public class y implements com.aide.engine.s {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1520873204300764084L)
    private final boolean FH;

    @abcd.Interfaceru(field = -2981413012288138571L)
    private final java.lang.String Hw;

    @abcd.Interfaceru(field = 138260020958461672L)
    private final java.util.List<com.aide.engine.s> VH;

    @abcd.Interfaceru(field = -1098430244318508924L)
    private final java.lang.String Zo;

    @abcd.Interfaceru(field = 2059369227098108529L)
    private final com.aide.engine.s gn;

    @abcd.Interfaceru(field = -2255612768569473520L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.engine.y.class, -3077738511138984000L, -3077738511138984000L);
    }

    public y(boolean r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<com.aide.engine.s> r11, com.aide.engine.s r12) {
        if (j6 == false) goto L5;
        abcd.wu.j6(-2480695073251961676L, null, new java.lang.Object[]{new java.lang.Boolean(r7), r8, r9, r10, r11, r12});
    L5:
        this.FH = r7;
        this.Hw = r8;
        this.v5 = r9;
        this.Zo = r10;
        this.VH = r11;
        this.gn = r12;
    }

    public java.lang.String toString() {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -243976993083577568L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-243976993083577568L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        java.lang.StringBuilder r3 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L16
        if (this.FH == false) goto L9;
        java.lang.String r4 = "";
    L10:
        r3.append(r4);     // Catch: java.lang.Throwable -> L16
        r3.append("(");     // Catch: java.lang.Throwable -> L16
        r3.append(this.Hw);     // Catch: java.lang.Throwable -> L16
        r3.append(").");     // Catch: java.lang.Throwable -> L16
        r3.append(this.v5);     // Catch: java.lang.Throwable -> L16
        r3.append("(");     // Catch: java.lang.Throwable -> L16
        java.lang.String r0 = r3.toString();     // Catch: java.lang.Throwable -> L16
        java.util.Iterator<com.aide.engine.s> r5 = this.VH.iterator();     // Catch: java.lang.Throwable -> L16
    L12:
        if (r5.hasNext() == false) goto L14;
        r0 = r0 + r5.next() + ",";     // Catch: java.lang.Throwable -> L16
        goto L12
    L14:
        return r0 + ")";
    L9:
        r4 = this.gn + ".";     // Catch: java.lang.Throwable -> L16
        goto L10
    }
}
