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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2159712698807232000L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2159712698807232000L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.Hw = new byte[1000];
                        this.FH = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3341137981534712400L)
    private void j6(int r7) {
        byte[] r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 2569844392977721680L, this, new java.lang.Integer(r7));
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(2569844392977721680L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = new byte[java.lang.Math.max(this.Hw.length * 2, r7)];
                        java.lang.System.arraycopy(this.Hw, 0, r2, 0, this.Hw.length);
                        this.Hw = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
        java.io.FileOutputStream r2 = null;
        java.io.FileInputStream r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r7 = 0;
        boolean r6 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 23: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 28; continue $sw2; }
                    abcd.wu.j6(th, 1549171073775137592L, this);
                    $pc2 = 28; continue $sw2;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1549171073775137592L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        new java.io.File(this.FH).getParentFile().mkdirs();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    if (new java.io.File(this.FH).exists() == true) { $pc2 = 9; continue $sw2; }
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    try {
                        r2 = new java.io.FileOutputStream(this.FH);
                        r2.write(this.Hw, 0, this.v5);
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    return;
                }
                case 9: {
                    if (new java.io.File(this.FH).length() != this.v5) { $pc2 = 21; continue $sw2; }
                    try {
                        r3 = new java.io.FileInputStream(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    r4 = 0;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    try {
                        r5 = r3.read();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    if (r5 == (-1)) { $pc2 = 17; continue $sw2; }
                    try {
                        r7 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    if (r5 != this.Hw[r4]) { $pc2 = 15; continue $sw2; }
                    r4 = r7;
                    { $pc2 = 11; continue $sw2; }
                }
                case 15: {
                    r6 = true;
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    try {
                        r3.close();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    if (r6 == true) { $pc2 = 21; continue $sw2; }
                    return;
                }
                case 17: {
                    r6 = false;
                    { $pc2 = 18; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(int r6) {
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 11: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 15; continue $sw3; }
                    abcd.wu.j6(th, -552376840011211392L, this, new java.lang.Integer(r6));
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(-552376840011211392L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (this.v5 < this.Hw.length) { $pc3 = 9; continue $sw3; }
                    try {
                        j6(this.v5 + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    try {
                        r2 = this.Hw;
                        r3 = this.v5;
                        this.v5 = r3 + 1;
                        r2[r3] = (byte) r6;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 11; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r9, int r10, int r11) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 13: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 18; continue $sw4; }
                    abcd.wu.j6(th, 954789037784654712L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(954789037784654712L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if ((this.v5 + r11) < this.Hw.length) { $pc4 = 8; continue $sw4; }
                    try {
                        j6(this.v5 + r11);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r0 = 0;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    if (r0 >= r11) { $pc4 = 11; continue $sw4; }
                    try {
                        this.Hw[this.v5 + r0] = r9[r10 + r0];
                        r0 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    { $pc4 = 9; continue $sw4; }
                }
                case 11: {
                    try {
                        this.v5 += r11;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
