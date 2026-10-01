package com.aide.common;

@abcd.Interfacexu
public class na extends java.io.OutputStream {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1107234354923090988L)
    private java.lang.String FH;

    @abcd.Interfaceru(field = -1942073296936951275L)
    private byte[] Hw;

    @abcd.Interfaceru(field = 209312664855054373L)
    private int v5;

    static {
        abcd.wu.j6(com.aide.common.na.class, -157391955206854869L, -157391955206854869L);
    }

    public na(java.lang.String r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2159712698807232000L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2159712698807232000L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new byte[1000];     // Catch: java.lang.Throwable -> L8
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 3341137981534712400L)
    private void j6(int r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2569844392977721680L, this, new java.lang.Integer(r7));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2569844392977721680L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        byte[] r2 = new byte[java.lang.Math.max(this.Hw.length * 2, r7)];     // Catch: java.lang.Throwable -> L8
        java.lang.System.arraycopy(this.Hw, 0, r2, 0, this.Hw.length);     // Catch: java.lang.Throwable -> L8
        this.Hw = r2;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void close() {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 1549171073775137592L, this);
    L28:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1549171073775137592L, this);     // Catch: java.lang.Throwable -> L23
    L6:
        new java.io.File(this.FH).getParentFile().mkdirs();     // Catch: java.lang.Throwable -> L23
        if (new java.io.File(this.FH).exists() == true) goto L9;
    L21:
        java.io.FileOutputStream r2 = new java.io.FileOutputStream(this.FH);     // Catch: java.lang.Throwable -> L23
        r2.write(this.Hw, 0, this.v5);     // Catch: java.lang.Throwable -> L23
        r2.close();     // Catch: java.lang.Throwable -> L23
        return;
    L9:
        if (new java.io.File(this.FH).length() != this.v5) goto L21;
        java.io.FileInputStream r3 = new java.io.FileInputStream(this.FH);     // Catch: java.lang.Throwable -> L23
        int r4 = 0;
    L11:
        int r5 = r3.read();     // Catch: java.lang.Throwable -> L23
        if (r5 == (-1)) goto L17;
        int r7 = r4 + 1;     // Catch: java.lang.Throwable -> L23
        if (r5 != this.Hw[r4]) goto L15;
        r4 = r7;
        goto L11
    L15:
        boolean r6 = true;
    L18:
        r3.close();     // Catch: java.lang.Throwable -> L23
        if (r6 == true) goto L21;
        return;
    L17:
        r6 = false;
        goto L18
    }

    @Override
    public void write(int r6) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -552376840011211392L, this, new java.lang.Integer(r6));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-552376840011211392L, this, r6);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.v5 < this.Hw.length) goto L9;
        j6(this.v5 + 1);     // Catch: java.lang.Throwable -> L11
    L9:
        byte[] r2 = this.Hw;     // Catch: java.lang.Throwable -> L11
        int r3 = this.v5;     // Catch: java.lang.Throwable -> L11
        this.v5 = r3 + 1;     // Catch: java.lang.Throwable -> L11
        r2[r3] = (byte) r6;     // Catch: java.lang.Throwable -> L11
    }

    @Override
    public void write(byte[] r9, int r10, int r11) {
    L13:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 954789037784654712L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L18:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(954789037784654712L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L13
    L6:
        if ((this.v5 + r11) < this.Hw.length) goto L8;
        j6(this.v5 + r11);     // Catch: java.lang.Throwable -> L13
    L8:
        int r0 = 0;
    L9:
        if (r0 >= r11) goto L11;
        this.Hw[this.v5 + r0] = r9[r10 + r0];     // Catch: java.lang.Throwable -> L13
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L13
        goto L9
    L11:
        this.v5 += r11;     // Catch: java.lang.Throwable -> L13
    }
}
