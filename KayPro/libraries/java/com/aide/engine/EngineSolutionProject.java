package com.aide.engine;

@abcd.Interfacexu
public class EngineSolutionProject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.EngineSolutionProject> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 7977059701881350784L)
    final java.lang.String EQ;
    public final java.lang.String FH;

    @abcd.Interfaceru(field = -620350533856240000L)
    final java.lang.String Hw;

    @abcd.Interfaceru(field = -5197613737050178152L)
    final boolean J0;

    @abcd.Interfaceru(field = -136628901621416633L)
    final boolean J8;

    @abcd.Interfaceru(field = 922260892948779735L)
    final java.util.List<java.lang.String> Mr;

    @abcd.Interfaceru(field = 5390106072965256180L)
    final boolean QX;

    @abcd.Interfaceru(field = -3096342489270826887L)
    final java.util.List<java.lang.String> VH;

    @abcd.Interfaceru(field = -3685552844057905725L)
    final boolean Ws;

    @abcd.Interfaceru(field = -3752871520753642055L)
    final java.lang.String XL;

    @abcd.Interfaceru(field = 1045174330977364180L)
    final java.util.List<com.aide.engine.EngineSolution.File> Zo;

    @abcd.Interfaceru(field = -2185042331979794967L)
    final java.util.List<java.lang.String> aM;

    @abcd.Interfaceru(field = -3019411530363102225L)
    final boolean gn;

    @abcd.Interfaceru(field = -5090909549022219600L)
    final java.util.List<java.lang.String> j3;

    @abcd.Interfaceru(field = -4178124268803884000L)
    final java.lang.String tp;

    @abcd.Interfaceru(field = 3000432163642673760L)
    final java.lang.String u7;

    @abcd.Interfaceru(field = -3636871560821791825L)
    final java.lang.String v5;

    @abcd.Interfaceru(field = -5185872104270315585L)
    final java.lang.String we;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.engine.EngineSolutionProject.class, 391151518740039552L, 391151518740039552L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2966433173918126429L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        CREATOR = new com.aide.engine.ClassG();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2966433173918126429L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public EngineSolutionProject(android.os.Parcel r7) {
        boolean r4 = false;
        boolean r3 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r8 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 28: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 32; continue $sw1; }
                    abcd.wu.j6(th, 5780577176057328785L, null, r7);
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(5780577176057328785L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.FH = r7.readString();
                        this.Hw = r7.readString();
                        this.v5 = r7.readString();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    r4 = true;
                    if (r7.readInt() == 0) { $pc1 = 9; continue $sw1; }
                    r3 = true;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    try {
                        this.gn = r3;
                        this.u7 = r7.readString();
                        this.tp = r7.readString();
                        this.EQ = r7.readString();
                        this.we = r7.readString();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    if (r7.readInt() == 0) { $pc1 = 13; continue $sw1; }
                    r5 = true;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    try {
                        this.J0 = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    if (r7.readInt() == 0) { $pc1 = 17; continue $sw1; }
                    r6 = true;
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    try {
                        this.J8 = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    if (r7.readInt() == 0) { $pc1 = 21; continue $sw1; }
                    r8 = true;
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    try {
                        this.Ws = r8;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    if (r7.readInt() != 0) { $pc1 = 26; continue $sw1; }
                    r4 = false;
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    try {
                        this.QX = r4;
                        this.XL = r7.readString();
                        this.VH = new java.util.ArrayList();
                        r7.readList(this.VH, getClass().getClassLoader());
                        this.aM = new java.util.ArrayList();
                        r7.readList(this.aM, getClass().getClassLoader());
                        this.j3 = new java.util.ArrayList();
                        r7.readList(this.j3, getClass().getClassLoader());
                        this.Mr = new java.util.ArrayList();
                        r7.readList(this.Mr, getClass().getClassLoader());
                        this.Zo = new java.util.ArrayList();
                        r7.readList(this.Zo, getClass().getClassLoader());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 28; continue $sw1;
                    }
                    return;
                }
                case 21: {
                    r8 = false;
                    { $pc1 = 22; continue $sw1; }
                }
                case 17: {
                    r6 = false;
                    { $pc1 = 18; continue $sw1; }
                }
                case 13: {
                    r5 = false;
                    { $pc1 = 14; continue $sw1; }
                }
                case 9: {
                    r3 = false;
                    { $pc1 = 10; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public EngineSolutionProject(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List<com.aide.engine.EngineSolution.File> r22, java.util.List<java.lang.String> r23, boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, boolean r32, java.lang.String r33, java.util.List<java.lang.String> r34, java.util.List<java.lang.String> r35, java.util.List<java.lang.String> r36) {
        java.lang.String r14 = null;
        java.util.List<java.lang.String> r11 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    r14 = r33;
                    r11 = r35;
                    abcd.wu.j6(3401478432796578552L, null, new java.lang.Object[]{r19, r20, r21, r22, r23, new java.lang.Boolean(r24), r25, r26, r27, r28, new java.lang.Boolean(r29), new java.lang.Boolean(r30), new java.lang.Boolean(r31), new java.lang.Boolean(r32), r14, r34, r11, r36});
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    this.FH = r19;
                    this.Hw = r20;
                    this.v5 = r21;
                    this.Zo = r22;
                    this.VH = r23;
                    this.gn = r24;
                    this.u7 = r25;
                    this.tp = r26;
                    this.EQ = r27;
                    this.we = r28;
                    this.J0 = r29;
                    this.J8 = r30;
                    this.Ws = r31;
                    this.QX = r32;
                    this.XL = r14;
                    this.aM = r34;
                    this.j3 = r11;
                    this.Mr = r36;
                    return;
                }
                case 5: {
                    r11 = r35;
                    r14 = r33;
                    { $pc2 = 6; continue $sw2; }
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
                    abcd.wu.j6(th, -3921742580059231564L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 15; continue $sw3; }
                    try {
                        abcd.wu.j6(-3921742580059231564L, this);
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
        int r1 = 0;
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 27: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 31; continue $sw4; }
                    abcd.wu.j6(th, -2459182665222252375L, this, r8, new java.lang.Integer(r9));
                    $pc4 = 31; continue $sw4;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-2459182665222252375L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 27; continue $sw4;
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
                        $pc4 = 27; continue $sw4;
                    }
                    r1 = 1;
                    if (this.gn == false) { $pc4 = 8; continue $sw4; }
                    r0 = 1;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    try {
                        r8.writeInt(r0);
                        r8.writeString(this.u7);
                        r8.writeString(this.tp);
                        r8.writeString(this.EQ);
                        r8.writeString(this.we);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 27; continue $sw4;
                    }
                    if (this.J0 == false) { $pc4 = 12; continue $sw4; }
                    r2 = 1;
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    try {
                        r8.writeInt(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 27; continue $sw4;
                    }
                    if (this.J8 == false) { $pc4 = 16; continue $sw4; }
                    r3 = 1;
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    try {
                        r8.writeInt(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 27; continue $sw4;
                    }
                    if (this.Ws == false) { $pc4 = 20; continue $sw4; }
                    r4 = 1;
                    $pc4 = 21; continue $sw4;
                }
                case 21: {
                    try {
                        r8.writeInt(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 27; continue $sw4;
                    }
                    if (this.QX == true) { $pc4 = 25; continue $sw4; }
                    r1 = 0;
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    try {
                        r8.writeInt(r1);
                        r8.writeString(this.XL);
                        r8.writeList(this.VH);
                        r8.writeList(this.aM);
                        r8.writeList(this.j3);
                        r8.writeList(this.Mr);
                        r8.writeList(this.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 27; continue $sw4;
                    }
                    return;
                }
                case 20: {
                    r4 = 0;
                    { $pc4 = 21; continue $sw4; }
                }
                case 16: {
                    r3 = 0;
                    { $pc4 = 17; continue $sw4; }
                }
                case 12: {
                    r2 = 0;
                    { $pc4 = 13; continue $sw4; }
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
