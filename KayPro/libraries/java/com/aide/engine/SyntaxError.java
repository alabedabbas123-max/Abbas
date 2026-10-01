package com.aide.engine;

@abcd.Interfacexu
public class SyntaxError implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.SyntaxError> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String EQ;
    public int FH;
    public int Hw;
    public int J0;
    public int J8;
    public int QX;
    public int VH;
    public boolean Ws;
    public int Zo;
    public int gn;
    public java.lang.String[] tp;
    public java.lang.String u7;
    public int v5;
    public java.lang.String we;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.engine.SyntaxError.class, 4104537337278253029L, 4104537337278253029L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2129579614895116965L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        CREATOR = new com.aide.engine.N();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2129579614895116965L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public SyntaxError() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -4169368234520153852L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-4169368234520153852L, null);
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

    public SyntaxError(android.os.Parcel r6) {
        int r3 = 0;
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 15: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 19; continue $sw2; }
                    abcd.wu.j6(th, -425723978459130624L, null, r6);
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-425723978459130624L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        this.v5 = r6.readInt();
                        this.Zo = r6.readInt();
                        this.VH = r6.readInt();
                        this.gn = r6.readInt();
                        this.u7 = r6.readString();
                        r3 = r6.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    if (r3 <= 0) { $pc2 = 9; continue $sw2; }
                    try {
                        this.tp = new java.lang.String[r3];
                        r6.readStringArray(this.tp);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    try {
                        this.FH = r6.readInt();
                        this.J0 = r6.readInt();
                        this.J8 = r6.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    if (r6.readInt() == 0) { $pc2 = 12; continue $sw2; }
                    r4 = true;
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    try {
                        this.Ws = r4;
                        this.QX = r6.readInt();
                        this.Hw = r6.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 15; continue $sw2;
                    }
                    return;
                }
                case 12: {
                    r4 = false;
                    { $pc2 = 13; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -3087337363600242633L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-3087337363600242633L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return this.u7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 12: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 16; continue $sw4; }
                    abcd.wu.j6(th, 668889873980152216L, this);
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(668889873980152216L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 12; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (this.FH != 400) { $pc4 = 10; continue $sw4; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 11: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 15; continue $sw5; }
                    abcd.wu.j6(th, 759250274641635327L, this);
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(759250274641635327L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 11; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (this.FH != 0) { $pc5 = 9; continue $sw5; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Zo() {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 19: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 23; continue $sw6; }
                    abcd.wu.j6(th, 3667319843045641327L, this);
                    $pc6 = 23; continue $sw6;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(3667319843045641327L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        r0 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 19; continue $sw6;
                    }
                    if (r0 != 2) { $pc6 = 10; continue $sw6; }
                    return true;
                }
                case 10: {
                    if (r0 != 250) { $pc6 = 12; continue $sw6; }
                    return true;
                }
                case 12: {
                    if (r0 == 251) { $pc6 = 27; continue $sw6; }
                    switch(r0) {
                        case 101: { $pc6 = 28; continue $sw6; }
                        case 102: { $pc6 = 28; continue $sw6; }
                        case 103: { $pc6 = 28; continue $sw6; }
                        case 104: { $pc6 = 28; continue $sw6; }
                        case 105: { $pc6 = 28; continue $sw6; }
                        case 106: { $pc6 = 28; continue $sw6; }
                        case 107: { $pc6 = 28; continue $sw6; }
                        case 108: { $pc6 = 28; continue $sw6; }
                        case 109: { $pc6 = 28; continue $sw6; }
                        case 110: { $pc6 = 28; continue $sw6; }
                        case 111: { $pc6 = 28; continue $sw6; }
                        case 112: { $pc6 = 28; continue $sw6; }
                        default: { $pc6 = 14; continue $sw6; }
                    };
                }
                case 14: {
                    switch(r0) {
                        case 200: { $pc6 = 29; continue $sw6; }
                        case 201: { $pc6 = 29; continue $sw6; }
                        case 202: { $pc6 = 29; continue $sw6; }
                        case 203: { $pc6 = 29; continue $sw6; }
                        case 204: { $pc6 = 29; continue $sw6; }
                        default: { $pc6 = 15; continue $sw6; }
                    };
                }
                case 15: {
                    return false;
                }
                case 29: {
                    return true;
                }
                case 28: {
                    return true;
                }
                case 27: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int describeContents() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 1883471214711647440L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 15; continue $sw7; }
                    try {
                        abcd.wu.j6(1883471214711647440L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
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

    public java.lang.String j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 3406977644717059875L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(3406977644717059875L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    return this.u7.replace("</C>", "'").replace("<//C>", "'");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 12: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 16; continue $sw9; }
                    abcd.wu.j6(th, 3715574730199035363L, this);
                    $pc9 = 16; continue $sw9;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(3715574730199035363L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 12; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    if (this.FH != 500) { $pc9 = 10; continue $sw9; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 16: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 20; continue $sw10; }
                    abcd.wu.j6(th, 3627705125535186759L, this, r8, new java.lang.Integer(r9));
                    $pc10 = 20; continue $sw10;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(3627705125535186759L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r8.writeInt(this.v5);
                        r8.writeInt(this.Zo);
                        r8.writeInt(this.VH);
                        r8.writeInt(this.gn);
                        r8.writeString(this.u7);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    r1 = 0;
                    if (this.tp != null) { $pc10 = 8; continue $sw10; }
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    try {
                        r8.writeInt(0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    try {
                        r8.writeInt(this.FH);
                        r8.writeInt(this.J0);
                        r8.writeInt(this.J8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    if (this.Ws == false) { $pc10 = 14; continue $sw10; }
                    r1 = 1;
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    try {
                        r8.writeInt(r1);
                        r8.writeInt(this.QX);
                        r8.writeInt(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    return;
                }
                case 8: {
                    if (this.tp.length <= 0) { $pc10 = 10; continue $sw10; }
                    try {
                        r8.writeInt(this.tp.length);
                        r8.writeStringArray(this.tp);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 16; continue $sw10;
                    }
                    { $pc10 = 11; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
