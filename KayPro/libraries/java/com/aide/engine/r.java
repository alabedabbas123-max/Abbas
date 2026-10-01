package com.aide.engine;

@abcd.Interfacexu
public final class r {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3384090264454787793L)
    private final java.lang.String FH;

    @abcd.Interfaceru(field = -2921231449288353880L)
    private final java.lang.String Hw;

    @abcd.Interfaceru(field = -3480541864810991572L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.engine.r.class, -1140929093877866676L, -1140929093877866676L);
    }

    public r(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2874216031776284720L, null, r9, r10, r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2874216031776284720L, null, r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r9;     // Catch: java.lang.Throwable -> L7
        this.Hw = r10;     // Catch: java.lang.Throwable -> L7
        this.v5 = r11;     // Catch: java.lang.Throwable -> L7
    }

    public java.lang.String DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6868480586795416820L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6868480586795416820L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5;
    }

    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4839711584149375392L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4839711584149375392L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    public com.aide.engine.r clone() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2123964332879944851L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2123964332879944851L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.r(this.FH, this.Hw, this.v5);
    }

    public java.lang.Object m40clone() {
        return clone();
    }

    public boolean equals(java.lang.Object r7) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -136474242748518240L, this, r7);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-136474242748518240L, this, r7);     // Catch: java.lang.Throwable -> L17
    L7:
        if ((r7 instanceof com.aide.engine.r) == true) goto L9;
        return false;
    L9:
        com.aide.engine.r r2 = (com.aide.engine.r) r7;     // Catch: java.lang.Throwable -> L17
        if (this.FH.equals(r2.FH) == true) goto L12;
        return false;
    L12:
        if (this.Hw.equals(r2.Hw) == false) goto L25;
        if (this.v5.equals(r2.v5) == false) goto L26;
        return true;
    L26:
        return false;
    L25:
        return false;
    }

    public int hashCode() {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -1121876085216528213L, this);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1121876085216528213L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return (this.FH.hashCode() + this.Hw.hashCode()) + this.v5.hashCode();
    }

    public java.lang.String j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2394207721300312071L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2394207721300312071L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }
}
