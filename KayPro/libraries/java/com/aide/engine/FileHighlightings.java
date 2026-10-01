package com.aide.engine;

@abcd.Interfacexu
public class FileHighlightings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.FileHighlightings> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String FH;
    public com.aide.engine.Enumm[] Hw;
    public int[] VH;
    public int[] Zo;
    public int[] gn;
    public int tp;
    public int u7;
    public int[] v5;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.engine.FileHighlightings.class, 7780765271333714769L, 7780765271333714769L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1314669640533748995L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        CREATOR = new com.aide.engine.ClassI();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1314669640533748995L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public FileHighlightings() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 3566736626202971200L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(3566736626202971200L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int describeContents() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 4910506993268413032L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 15; continue $sw2; }
                    try {
                        abcd.wu.j6(4910506993268413032L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return 0;
                }
                case 15: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.os.Parcel r8) {
        int r2 = 0;
        com.aide.engine.Enumm[] r3 = null;
        int r4 = 0;
        byte r5 = 0;
        int r6 = 0;
        int[] r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 23: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 28; continue $sw3; }
                    abcd.wu.j6(th, -2812940080177441136L, this, r8);
                    $pc3 = 28; continue $sw3;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-2812940080177441136L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        this.FH = r8.readString();
                        this.u7 = r8.readInt();
                        this.tp = r8.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    if (this.Hw != null) { $pc3 = 9; continue $sw3; }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    try {
                        r2 = (this.u7 * 5) / 4;
                        this.Hw = new com.aide.engine.Enumm[r2];
                        this.v5 = new int[r2];
                        this.VH = new int[r2];
                        this.Zo = new int[r2];
                        this.gn = new int[r2];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    try {
                        r3 = com.aide.engine.Enumm.values();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    r4 = 0;
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    if (r4 >= this.u7) { $pc3 = 22; continue $sw3; }
                    try {
                        r5 = r8.readByte();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    if (r5 != 0) { $pc3 = 18; continue $sw3; }
                    try {
                        this.Hw[r4] = null;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    r4 = r4 + 1;
                    { $pc3 = 12; continue $sw3; }
                }
                case 18: {
                    if ((r5 & 128) != 0) { $pc3 = 20; continue $sw3; }
                    try {
                        this.Hw[r4] = r3[r5];
                        r6 = r8.readInt();
                        r7 = this.v5;
                        this.VH[r4] = r6;
                        r7[r4] = r6;
                        this.Zo[r4] = r8.readByte();
                        this.gn[r4] = r8.readByte();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 20: {
                    try {
                        this.Hw[r4] = r3[r5 & 127];
                        this.v5[r4] = r8.readInt();
                        this.Zo[r4] = r8.readInt();
                        this.VH[r4] = r8.readInt();
                        this.gn[r4] = r8.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 23; continue $sw3;
                    }
                    { $pc3 = 21; continue $sw3; }
                }
                case 22: {
                    return;
                }
                case 9: {
                    if (this.Hw.length >= this.u7) { $pc3 = 11; continue $sw3; }
                    { $pc3 = 10; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeToParcel(android.os.Parcel r9, int r10) {
        int r1 = 0;
        com.aide.engine.Enumm r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 22: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 27; continue $sw4; }
                    abcd.wu.j6(th, -2593435452539459385L, this, r9, new java.lang.Integer(r10));
                    $pc4 = 27; continue $sw4;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-2593435452539459385L, this, r9, new java.lang.Integer(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        this.u7 = java.lang.Math.min(30000, this.u7);
                        r9.writeString(this.FH);
                        r9.writeInt(this.u7);
                        r9.writeInt(this.tp);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    r1 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r1 >= this.u7) { $pc4 = 21; continue $sw4; }
                    try {
                        r2 = this.Hw[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    if (r2 != null) { $pc4 = 11; continue $sw4; }
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    try {
                        r9.writeByte((byte) 0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    r1 = r1 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 11: {
                    if (r2 == com.aide.engine.Enumm.j6) { $pc4 = 19; continue $sw4; }
                    try {
                        r3 = this.v5[r1];
                        r4 = this.Zo[r1];
                        r5 = this.VH[r1];
                        r6 = this.gn[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    if (r3 == r5) { $pc4 = 16; continue $sw4; }
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    try {
                        r9.writeByte((byte) (r2.ordinal() | 128));
                        r9.writeInt(r3);
                        r9.writeInt(r4);
                        r9.writeInt(r5);
                        r9.writeInt(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    { $pc4 = 20; continue $sw4; }
                }
                case 16: {
                    if (r6 >= 127) { $pc4 = 18; continue $sw4; }
                    try {
                        r9.writeByte((byte) r2.ordinal());
                        r9.writeInt(r3);
                        r9.writeByte((byte) r4);
                        r9.writeByte((byte) r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    { $pc4 = 20; continue $sw4; }
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
