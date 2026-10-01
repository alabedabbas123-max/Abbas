package com.aide.engine;

@abcd.Interfacexu
public final class C {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2329768836414139879L)
    private final int FH;

    @abcd.Interfaceru(field = -1216802409054557981L)
    private final int Hw;

    @abcd.Interfaceru(field = -2548004457823135616L)
    private final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.engine.C.class, -1991496644882198913L, -1991496644882198913L);
    }

    public C(java.lang.String r9, int r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2956724040647298048L, null, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2956724040647298048L, null, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r10;     // Catch: java.lang.Throwable -> L7
        this.Hw = r11;     // Catch: java.lang.Throwable -> L7
        this.v5 = r9;     // Catch: java.lang.Throwable -> L7
    }

    public java.lang.String DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3976824193543907708L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3976824193543907708L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5;
    }

    public int FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2199888773323200649L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2199888773323200649L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }

    public com.aide.engine.C clone() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2475302012646589176L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2475302012646589176L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.C(this.v5, this.FH, this.Hw);
    }

    public java.lang.Object m39clone() {
        return clone();
    }

    public boolean equals(java.lang.Object r7) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -334801406093349735L, this, r7);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-334801406093349735L, this, r7);     // Catch: java.lang.Throwable -> L17
    L7:
        if ((r7 instanceof com.aide.engine.C) == true) goto L9;
        return false;
    L9:
        com.aide.engine.C r2 = (com.aide.engine.C) r7;     // Catch: java.lang.Throwable -> L17
        if (this.FH == r2.FH) goto L12;
        return false;
    L12:
        if (this.Hw != r2.Hw) goto L25;
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
        abcd.wu.j6(th, -27858242320564320L, this);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-27858242320564320L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return (this.v5.hashCode() + this.FH) + this.Hw;
    }

    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2397784624778008467L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2397784624778008467L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }
}
