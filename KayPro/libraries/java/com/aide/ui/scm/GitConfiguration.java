package com.aide.ui.scm;

@abcd.Interfacexu
public class GitConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.ui.scm.GitConfiguration> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final java.lang.String FH;
    public final java.lang.String Hw;
    public final boolean Zo;
    public final java.lang.String v5;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.ui.scm.GitConfiguration.class, -1458982117399304019L, -1458982117399304019L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(185798929975896313L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        CREATOR = new com.aide.ui.scm.ClassG();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 185798929975896313L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public GitConfiguration(android.os.Parcel r6) {
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, -4127662786821328407L, null, r6);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-4127662786821328407L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.FH = r6.readString();
                        this.Hw = r6.readString();
                        this.v5 = r6.readString();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    if (r6.readByte() == 0) { $pc1 = 9; continue $sw1; }
                    r3 = true;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    try {
                        this.Zo = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    return;
                }
                case 9: {
                    r3 = false;
                    { $pc1 = 10; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public GitConfiguration(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 879103230294466680L, null, r10, r11, r12, new java.lang.Boolean(r13));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(879103230294466680L, null, r10, r11, r12, new java.lang.Boolean(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        this.FH = r10;
                        this.Hw = r11;
                        this.v5 = r12;
                        this.Zo = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int describeContents() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -869418057221540036L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 15; continue $sw3; }
                    try {
                        abcd.wu.j6(-869418057221540036L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
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

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
        byte r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 11: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 15; continue $sw4; }
                    abcd.wu.j6(th, -1909739184050860219L, this, r8, new java.lang.Integer(r9));
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-1909739184050860219L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        r8.writeString(this.FH);
                        r8.writeString(this.Hw);
                        r8.writeString(this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    if (this.Zo == false) { $pc4 = 8; continue $sw4; }
                    r0 = 1;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    try {
                        r8.writeByte(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    return;
                }
                case 8: {
                    r0 = 0;
                    { $pc4 = 9; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
