package abcd;

@abcd.Interfacexu
public class Sa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2634899998109949504L)
    private int EQ;

    @abcd.Interfaceru(field = -1308333031273689943L)
    private long FH;

    @abcd.Interfaceru(field = -2120884847720214891L)
    private long Hw;

    @abcd.Interfaceru(field = -74544553174374645L)
    private abcd.Interfacepa J0;

    @abcd.Interfaceru(field = 2473146989215406496L)
    private abcd.Da J8;

    @abcd.Interfaceru(field = -1089002982235518041L)
    private long Mr;

    @abcd.Interfaceru(field = -3891898145275900125L)
    private int QX;

    @abcd.Interfaceru(field = 3359638782115299145L)
    private boolean U2;

    @abcd.Interfaceru(field = -4019323189412237259L)
    private int VH;

    @abcd.Interfaceru(field = -1692353832846727140L)
    private long Ws;

    @abcd.Interfaceru(field = 2157621842970311200L)
    private long XL;

    @abcd.Interfaceru(field = -685535511738635552L)
    private char[] Zo;

    @abcd.Interfaceru(field = 3421389545897220864L)
    private abcd.Interfacena a8;

    @abcd.Interfaceru(field = 628313145946586328L)
    private long aM;

    @abcd.Interfaceru(field = 696580012348835651L)
    private int[] gn;

    @abcd.Interfaceru(field = 1698320586371803119L)
    private long j3;

    @abcd.Interfaceru(field = 720227207003004831L)
    private int[] tp;

    @abcd.Interfaceru(field = 554166430752445681L)
    private int u7;

    @abcd.Interfaceru(field = -2242099390321513335L)
    private abcd.La v5;

    @abcd.Interfaceru(field = -879061987634288920L)
    private int we;

    static {
        abcd.wu.j6(abcd.Sa.class, 1294351842892446711L, 1294351842892446711L);
    }

    public Sa(abcd.La r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2203727589164501199L, null, r8);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2203727589164501199L, null, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH = 1;
                        this.Hw = 1234567891234567891L - this.FH;
                        this.v5 = r8;
                        this.Zo = new char[1000];
                        this.VH = 1;
                        this.gn = new int[10000];
                        this.u7 = 0;
                        this.we = -1;
                        this.tp = new int[1000];
                        this.EQ = 0;
                        this.XL = -1;
                        this.aM = -1;
                        this.j3 = -1;
                        this.Mr = -1;
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

    @abcd.Interfacesu(method = -1871434070107037989L)
    private int CU(int r10) {
        int r2 = 0;
        int r3 = 0;
        int[] r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 31: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 35; continue $sw1; }
                    abcd.wu.j6(th, -5135763520134627125L, this, new java.lang.Integer(r10));
                    $pc1 = 35; continue $sw1;
                }
                case 35: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-5135763520134627125L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = this.EQ;
                        this.gn[r10 + 2] = r2;
                        r3 = P8(r10);
                        this.EQ += Xa(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    if (this.EQ < this.tp.length) { $pc1 = 10; continue $sw1; }
                    try {
                        r4 = new int[java.lang.Math.min(this.EQ * 2, (this.tp.length * 2) + 1)];
                        java.lang.System.arraycopy(this.tp, 0, r4, 0, this.tp.length);
                        this.tp = r4;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (this.J0.v5(r3) == false) { $pc1 = 13; continue $sw1; }
                    try {
                        DW(r10, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (this.J0.DW(r3) == false) { $pc1 = 16; continue $sw1; }
                    try {
                        DW(r10, -1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (this.J0.BT(r3) == false) { $pc1 = 19; continue $sw1; }
                    try {
                        j6(r10, this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    if (this.J0.u7(r3) == false) { $pc1 = 22; continue $sw1; }
                    try {
                        J8(r10, 4, 0);
                        J8(r10, 6, -1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    if (this.J0.a8(r3) == false) { $pc1 = 25; continue $sw1; }
                    try {
                        J8(r10, 4, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    if (this.J0.aM(r3) == false) { $pc1 = 28; continue $sw1; }
                    try {
                        J8(r10, 4, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    if (this.J0.gW(r3) == false) { $pc1 = 30; continue $sw1; }
                    try {
                        FH(r10, -1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 31; continue $sw1;
                    }
                    $pc1 = 30; continue $sw1;
                }
                case 30: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 116192177428965764L)
    private int DW(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 20: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 25; continue $sw2; }
                    abcd.wu.j6(th, -733252693315571100L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-733252693315571100L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    r1 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r1 >= r0) { $pc2 = 13; continue $sw2; }
                    try {
                        r3 = DW(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    if (r3 != (-1)) { $pc2 = 10; continue $sw2; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    { $pc2 = 7; continue $sw2; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.U2(P8(r11)) == true) { $pc2 = 15; continue $sw2; }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    return -1;
                }
                case 15: {
                    if (FH(r11, r12, r13) == false) { $pc2 = 19; continue $sw2; }
                    if (FH(r11, r14, r15) == false) { $pc2 = 19; continue $sw2; }
                    return r11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4411055247251795220L)
    private int EQ(int r9, int r10, int r11) {
        int r1 = 0;
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 45: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 50; continue $sw3; }
                    abcd.wu.j6(th, 440469726782448436L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc3 = 50; continue $sw3;
                }
                case 50: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(440469726782448436L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r1 = 0;
                    if (jJ(r9) == true) { $pc3 = 8; continue $sw3; }
                    $pc3 = 38; continue $sw3;
                }
                case 38: {
                    r0 = Integer.MAX_VALUE;
                    try {
                        r2 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    $pc3 = 39; continue $sw3;
                }
                case 39: {
                    if (r1 >= r2) { $pc3 = 44; continue $sw3; }
                    try {
                        r3 = EQ(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    if (r3 >= r0) { $pc3 = 43; continue $sw3; }
                    r0 = r3;
                    $pc3 = 43; continue $sw3;
                }
                case 43: {
                    r1 = r1 + 1;
                    { $pc3 = 39; continue $sw3; }
                }
                case 44: {
                    return r0;
                }
                case 8: {
                    if (this.J0.EQ(P8(r9)) == true) { $pc3 = 38; continue $sw3; }
                    try {
                        r4 = vy(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    if (r4 > r10) { $pc3 = 12; continue $sw3; }
                    try {
                        r5 = QX(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    if (r5 < r10) { $pc3 = 16; continue $sw3; }
                    if (r5 != r4) { $pc3 = 27; continue $sw3; }
                    try {
                        r6 = BT(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    if (r6 > r11) { $pc3 = 21; continue $sw3; }
                    try {
                        r12 = Ws(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    if (r12 < r11) { $pc3 = 25; continue $sw3; }
                    return 0;
                }
                case 25: {
                    return r11 - r12;
                }
                case 21: {
                    return r6 - r11;
                }
                case 27: {
                    if (r10 != r4) { $pc3 = 32; continue $sw3; }
                    try {
                        r13 = BT(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    if (r13 > r11) { $pc3 = 31; continue $sw3; }
                    $pc3 = 37; continue $sw3;
                }
                case 37: {
                    return 0;
                }
                case 31: {
                    return r13 - r11;
                }
                case 32: {
                    if (r10 != r5) { $pc3 = 37; continue $sw3; }
                    try {
                        r14 = Ws(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 45; continue $sw3;
                    }
                    if (r14 >= r11) { $pc3 = 37; continue $sw3; }
                    return r11 - r14;
                }
                case 16: {
                    return (r10 - r5) * 1000;
                }
                case 12: {
                    return (r4 - r10) * 1000;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 170351146463302013L)
    private boolean Eq(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 16: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 20; continue $sw4; }
                    abcd.wu.j6(th, 561686151557488077L, this, new java.lang.Integer(r5));
                    $pc4 = 20; continue $sw4;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(561686151557488077L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 16; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (lp(r5) == false) { $pc4 = 9; continue $sw4; }
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    return true;
                }
                case 9: {
                    if (vJ(r5) == true) { $pc4 = 14; continue $sw4; }
                    if (ca(r5) == true) { $pc4 = 14; continue $sw4; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -483854459384944221L)
    private int FH(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 20: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 25; continue $sw5; }
                    abcd.wu.j6(th, 8528999246858638611L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc5 = 25; continue $sw5;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(8528999246858638611L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 20; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 20; continue $sw5;
                    }
                    r1 = 0;
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (r1 >= r0) { $pc5 = 13; continue $sw5; }
                    try {
                        r3 = FH(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 20; continue $sw5;
                    }
                    if (r3 != (-1)) { $pc5 = 10; continue $sw5; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 20; continue $sw5;
                    }
                    { $pc5 = 7; continue $sw5; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.Mr(P8(r11)) == true) { $pc5 = 15; continue $sw5; }
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    return -1;
                }
                case 15: {
                    if (FH(r11, r12, r13) == false) { $pc5 = 19; continue $sw5; }
                    if (FH(r11, r14, r15) == false) { $pc5 = 19; continue $sw5; }
                    return r11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 937770849053219295L)
    private int Hw(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 20: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 25; continue $sw6; }
                    abcd.wu.j6(th, 1475591372307329487L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc6 = 25; continue $sw6;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(1475591372307329487L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 20; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (this.J0.Mr(P8(r11)) == true) { $pc6 = 8; continue $sw6; }
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 20; continue $sw6;
                    }
                    r1 = 0;
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    if (r1 >= r0) { $pc6 = 19; continue $sw6; }
                    try {
                        r3 = Hw(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 20; continue $sw6;
                    }
                    if (r3 != (-1)) { $pc6 = 17; continue $sw6; }
                    r1 = r1 + 1;
                    { $pc6 = 14; continue $sw6; }
                }
                case 17: {
                    return r3;
                }
                case 19: {
                    return -1;
                }
                case 8: {
                    if (vy(r11) != r12) { $pc6 = 12; continue $sw6; }
                    if (BT(r11) != r13) { $pc6 = 12; continue $sw6; }
                    return r11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 6006642630757966301L)
    private int J0(int r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 18: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 23; continue $sw7; }
                    abcd.wu.j6(th, 440698535733769389L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc7 = 23; continue $sw7;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(440698535733769389L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (jJ(r9) == true) { $pc7 = 8; continue $sw7; }
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    try {
                        r0 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    r1 = 0;
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    if (r1 >= r0) { $pc7 = 17; continue $sw7; }
                    try {
                        r3 = J0(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    if (r3 != (-1)) { $pc7 = 15; continue $sw7; }
                    r1 = r1 + 1;
                    { $pc7 = 12; continue $sw7; }
                }
                case 15: {
                    return r3;
                }
                case 17: {
                    return -1;
                }
                case 8: {
                    if (Hw(r9, r10, r11) == false) { $pc7 = 10; continue $sw7; }
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 413565602094773104L)
    private void J8(int r9, int r10, int r11) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 10: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 14; continue $sw8; }
                    abcd.wu.j6(th, -2749107966344953040L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(-2749107966344953040L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        this.U2 = false;
                        r0 = this.gn[r9 + 2];
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    if (r0 != (-1)) { $pc8 = 8; continue $sw8; }
                    try {
                        r0 = CU(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    try {
                        this.tp[r0 + r10] = r11;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4069987967497035488L)
    private int VH(int r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 18: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 23; continue $sw9; }
                    abcd.wu.j6(th, 1679197418529620672L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(1679197418529620672L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 18; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    if (this.J0.u7(P8(r9)) == true) { $pc9 = 8; continue $sw9; }
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    try {
                        r0 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 18; continue $sw9;
                    }
                    r1 = 0;
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    if (r1 >= r0) { $pc9 = 17; continue $sw9; }
                    try {
                        r3 = VH(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 18; continue $sw9;
                    }
                    if (r3 != (-1)) { $pc9 = 15; continue $sw9; }
                    r1 = r1 + 1;
                    { $pc9 = 12; continue $sw9; }
                }
                case 15: {
                    return r3;
                }
                case 17: {
                    return -1;
                }
                case 8: {
                    if (Hw(r9, r10, r11) == false) { $pc9 = 10; continue $sw9; }
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2767837846891004288L)
    private int VH(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 18: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 23; continue $sw10; }
                    abcd.wu.j6(th, -332703276092594240L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc10 = 23; continue $sw10;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(-332703276092594240L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 18; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 18; continue $sw10;
                    }
                    r1 = 0;
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if (r1 >= r0) { $pc10 = 13; continue $sw10; }
                    try {
                        r3 = VH(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 18; continue $sw10;
                    }
                    if (r3 != (-1)) { $pc10 = 10; continue $sw10; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 18; continue $sw10;
                    }
                    { $pc10 = 7; continue $sw10; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (Hw(r11, r12, r13) == false) { $pc10 = 17; continue $sw10; }
                    if (Hw(r11, r14, r15) == false) { $pc10 = 17; continue $sw10; }
                    return r11;
                }
                case 17: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5499298668930293901L)
    private int XL(int r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 13: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 17; continue $sw11; }
                    abcd.wu.j6(th, 24457679546302717L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc11 = 17; continue $sw11;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(24457679546302717L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 13; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    try {
                        r0 = this.gn[r8 + 2];
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 13; continue $sw11;
                    }
                    if (r0 != (-1)) { $pc11 = 8; continue $sw11; }
                    try {
                        r0 = CU(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 13; continue $sw11;
                    }
                    $pc11 = 8; continue $sw11;
                }
                case 8: {
                    try {
                        r1 = r0 + r9;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 13; continue $sw11;
                    }
                    if (r1 <= this.tp.length) { $pc11 = 11; continue $sw11; }
                    try {
                        java.lang.System.out.println("");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 13; continue $sw11;
                    }
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    return this.tp[r1];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1148790399884319225L)
    private int Xa(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 37: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 41; continue $sw12; }
                    abcd.wu.j6(th, -4534779324892621545L, this, new java.lang.Integer(r5));
                    $pc12 = 41; continue $sw12;
                }
                case 41: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 7; continue $sw12; }
                    try {
                        abcd.wu.j6(-4534779324892621545L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 37; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (this.J0.gW(r5) == false) { $pc12 = 11; continue $sw12; }
                    return 10;
                }
                case 11: {
                    if (this.J0.DW(r5) == false) { $pc12 = 15; continue $sw12; }
                    return 9;
                }
                case 15: {
                    if (this.J0.Ws(r5) == false) { $pc12 = 19; continue $sw12; }
                    return 8;
                }
                case 19: {
                    if (this.J0.u7(r5) == false) { $pc12 = 21; continue $sw12; }
                    return 7;
                }
                case 21: {
                    if (this.J0.aM(r5) == false) { $pc12 = 23; continue $sw12; }
                    return 7;
                }
                case 23: {
                    if (this.J0.a8(r5) == false) { $pc12 = 26; continue $sw12; }
                    return 7;
                }
                case 26: {
                    if (this.J0.BT(r5) == false) { $pc12 = 29; continue $sw12; }
                    return 4;
                }
                case 29: {
                    if (this.J0.v5(r5) == false) { $pc12 = 33; continue $sw12; }
                    return 2;
                }
                case 33: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5052475788483692569L)
    private int Zo(int r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 3;
        $sw13: while (true) {
            switch ($pc13) {
                case 32: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 37; continue $sw13; }
                    abcd.wu.j6(th, 5192238075159460905L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc13 = 37; continue $sw13;
                }
                case 37: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc13 = 5; continue $sw13; }
                    try {
                        abcd.wu.j6(5192238075159460905L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    $pc13 = 5; continue $sw13;
                }
                case 5: {
                    try {
                        r0 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    r1 = 0;
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r1 >= r0) { $pc13 = 13; continue $sw13; }
                    try {
                        r3 = Zo(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    if (r3 != (-1)) { $pc13 = 10; continue $sw13; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 32; continue $sw13;
                    }
                    { $pc13 = 7; continue $sw13; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.aM(P8(r9)) == true) { $pc13 = 17; continue $sw13; }
                    if (this.J0.rN(P8(r9)) == true) { $pc13 = 17; continue $sw13; }
                    $pc13 = 31; continue $sw13;
                }
                case 31: {
                    return -1;
                }
                case 17: {
                    if (Hw(r9, r10, r11) == false) { $pc13 = 20; continue $sw13; }
                    return r9;
                }
                case 20: {
                    if (QX(r9) != 0) { $pc13 = 31; continue $sw13; }
                    if (vy(r9) == 0) { $pc13 = 31; continue $sw13; }
                    if (r10 <= vy(r9)) { $pc13 = 27; continue $sw13; }
                    return r9;
                }
                case 27: {
                    if (r10 != vy(r9)) { $pc13 = 31; continue $sw13; }
                    if (r11 < BT(r9)) { $pc13 = 31; continue $sw13; }
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -635867557125048981L)
    private int Zo(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 3;
        $sw14: while (true) {
            switch ($pc14) {
                case 18: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 23; continue $sw14; }
                    abcd.wu.j6(th, 318051863670927195L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc14 = 23; continue $sw14;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc14 = 5; continue $sw14; }
                    try {
                        abcd.wu.j6(318051863670927195L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 18; continue $sw14;
                    }
                    $pc14 = 5; continue $sw14;
                }
                case 5: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 18; continue $sw14;
                    }
                    r1 = 0;
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    if (r1 >= r0) { $pc14 = 13; continue $sw14; }
                    try {
                        r3 = Zo(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 18; continue $sw14;
                    }
                    if (r3 != (-1)) { $pc14 = 10; continue $sw14; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 18; continue $sw14;
                    }
                    { $pc14 = 7; continue $sw14; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (FH(r11, r12, r13) == false) { $pc14 = 17; continue $sw14; }
                    if (Hw(r11, r14, r15) == false) { $pc14 = 17; continue $sw14; }
                    return r11;
                }
                case 17: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1259705582337152475L)
    private int aM(int r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 18: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 23; continue $sw15; }
                    abcd.wu.j6(th, 5124066964175050827L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc15 = 23; continue $sw15;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(5124066964175050827L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 18; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    if (this.J0.Hw(P8(r8)) == true) { $pc15 = 8; continue $sw15; }
                    $pc15 = 10; continue $sw15;
                }
                case 10: {
                    try {
                        r0 = we(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 18; continue $sw15;
                    }
                    r1 = 0;
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    if (r1 >= r0) { $pc15 = 17; continue $sw15; }
                    try {
                        r3 = aM(Zo(r8, r1), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 18; continue $sw15;
                    }
                    if (r3 != (-1)) { $pc15 = 15; continue $sw15; }
                    r1 = r1 + 1;
                    { $pc15 = 12; continue $sw15; }
                }
                case 15: {
                    return r3;
                }
                case 17: {
                    return -1;
                }
                case 8: {
                    if (J8(r8) != r9) { $pc15 = 10; continue $sw15; }
                    return r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3996703087379642684L)
    private void et(int r6) {
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 11: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 16; continue $sw16; }
                    abcd.wu.j6(th, 2464164286041683428L, this, new java.lang.Integer(r6));
                    $pc16 = 16; continue $sw16;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(2464164286041683428L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 11; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        r2 = we(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 11; continue $sw16;
                    }
                    r3 = 0;
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    if (r3 >= r2) { $pc16 = 9; continue $sw16; }
                    try {
                        et(Zo(r6, r3));
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 11; continue $sw16;
                    }
                    { $pc16 = 7; continue $sw16; }
                }
                case 9: {
                    try {
                        this.gn[r6 + 2] = -1;
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 11; continue $sw16;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5866306190822013105L)
    private int gn(int r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 3;
        $sw17: while (true) {
            switch ($pc17) {
                case 18: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 23; continue $sw17; }
                    abcd.wu.j6(th, 3563199106489240095L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc17 = 23; continue $sw17;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(3563199106489240095L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 18; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (this.J0.u7(P8(r9)) == true) { $pc17 = 8; continue $sw17; }
                    $pc17 = 10; continue $sw17;
                }
                case 10: {
                    try {
                        r0 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 18; continue $sw17;
                    }
                    r1 = 0;
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    if (r1 >= r0) { $pc17 = 17; continue $sw17; }
                    try {
                        r3 = gn(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 18; continue $sw17;
                    }
                    if (r3 != (-1)) { $pc17 = 15; continue $sw17; }
                    r1 = r1 + 1;
                    { $pc17 = 12; continue $sw17; }
                }
                case 15: {
                    return r3;
                }
                case 17: {
                    return -1;
                }
                case 8: {
                    if (FH(r9, r10, r11) == false) { $pc17 = 10; continue $sw17; }
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -8364826702701947295L)
    private int gn(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 3;
        $sw18: while (true) {
            switch ($pc18) {
                case 22: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 27; continue $sw18; }
                    abcd.wu.j6(th, 4416785504915907249L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc18 = 27; continue $sw18;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc18 = 5; continue $sw18; }
                    try {
                        abcd.wu.j6(4416785504915907249L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    $pc18 = 5; continue $sw18;
                }
                case 5: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    r1 = 0;
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    if (r1 >= r0) { $pc18 = 13; continue $sw18; }
                    try {
                        r3 = gn(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    if (r3 != (-1)) { $pc18 = 10; continue $sw18; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 22; continue $sw18;
                    }
                    { $pc18 = 7; continue $sw18; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.Mr(P8(r11)) == true) { $pc18 = 15; continue $sw18; }
                    $pc18 = 21; continue $sw18;
                }
                case 21: {
                    return -1;
                }
                case 15: {
                    if (Sf(r11) == true) { $pc18 = 21; continue $sw18; }
                    if (FH(r11, r12, r13) == false) { $pc18 = 21; continue $sw18; }
                    if (Hw(r11, r14, r15) == false) { $pc18 = 21; continue $sw18; }
                    return r11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1799731743523656705L)
    private int j3(int r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 3;
        $sw19: while (true) {
            switch ($pc19) {
                case 18: {
                    th = $ex19;
                    if (DW == false) { $pc19 = 23; continue $sw19; }
                    abcd.wu.j6(th, 5956771856239288591L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc19 = 23; continue $sw19;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(5956771856239288591L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 18; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    if (this.J0.P8(P8(r8)) == true) { $pc19 = 8; continue $sw19; }
                    $pc19 = 10; continue $sw19;
                }
                case 10: {
                    try {
                        r0 = we(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 18; continue $sw19;
                    }
                    r1 = 0;
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    if (r1 >= r0) { $pc19 = 17; continue $sw19; }
                    try {
                        r3 = j3(Zo(r8, r1), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 18; continue $sw19;
                    }
                    if (r3 != (-1)) { $pc19 = 15; continue $sw19; }
                    r1 = r1 + 1;
                    { $pc19 = 12; continue $sw19; }
                }
                case 15: {
                    return r3;
                }
                case 17: {
                    return -1;
                }
                case 8: {
                    if (J8(r8) != r9) { $pc19 = 10; continue $sw19; }
                    return r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -4002515507432392875L)
    private int j6(int r18, int r19, int r20, int r21, int r22, int r23) {
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r0 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (j6 == false) { $pc20 = 5; continue $sw20; }
                    abcd.wu.j6(2351324177367939973L, this, new java.lang.Object[]{new java.lang.Integer(r18), new java.lang.Integer(r19), new java.lang.Integer(r20), new java.lang.Integer(r21), new java.lang.Integer(r22), new java.lang.Integer(r23)});
                    $pc20 = 5; continue $sw20;
                }
                case 5: {
                    r14 = we(r18);
                    r15 = 0;
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    if (r15 >= r14) { $pc20 = 13; continue $sw20; }
                    r16 = r14;
                    r0 = j6(Zo(r18, r15), r19, r20, r21, r22, r23);
                    if (r0 != (-1)) { $pc20 = 10; continue $sw20; }
                    r15 = r15 + 1;
                    r14 = r16;
                    { $pc20 = 7; continue $sw20; }
                }
                case 10: {
                    return r0;
                }
                case 13: {
                    if (P8(r18) == r19) { $pc20 = 15; continue $sw20; }
                    $pc20 = 19; continue $sw20;
                }
                case 19: {
                    return -1;
                }
                case 15: {
                    if (FH(r18, r20, r21) == false) { $pc20 = 19; continue $sw20; }
                    if (FH(r18, r22, r23) == false) { $pc20 = 19; continue $sw20; }
                    return r18;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1907764860300944960L)
    private void j6(java.lang.StringBuffer r10, java.lang.String r11, abcd.Ta r12, int r13) {
        java.lang.String r0 = null;
        int r3 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 34: {
                    th = $ex21;
                    if (DW == false) { $pc21 = 39; continue $sw21; }
                    abcd.wu.j6(th, -6411636814120534272L, this, r10, r11, r12, new java.lang.Integer(r13));
                    $pc21 = 39; continue $sw21;
                }
                case 39: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(-6411636814120534272L, this, r10, r11, r12, new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    try {
                        r0 = "(" + r12.v5(this, r13) + "," + r12.Hw(this, r13) + "-" + r12.FH(this, r13) + "," + r12.DW(this, r13) + ") " + r13 + "                     ";
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    r3 = 0;
                    if (r0.length() <= 25) { $pc21 = 10; continue $sw21; }
                    try {
                        r0 = r0.substring(0, 25);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    $pc21 = 10; continue $sw21;
                }
                case 10: {
                    if (this.J0.u7(P8(r13)) == false) { $pc21 = 13; continue $sw21; }
                    try {
                        r10.append(r0 + r11 + aM(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    $pc21 = 18; continue $sw21;
                }
                case 18: {
                    if (this.J0 == null) { $pc21 = 24; continue $sw21; }
                    r1 = 0;
                    $pc21 = 21; continue $sw21;
                }
                case 21: {
                    if (r1 >= Xa(P8(r13))) { $pc21 = 24; continue $sw21; }
                    try {
                        r10.append(" " + XL(r13, r1));
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    $pc21 = 24; continue $sw21;
                }
                case 24: {
                    if (Eq(r13) == false) { $pc21 = 27; continue $sw21; }
                    try {
                        r10.append(" " + J8(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    $pc21 = 27; continue $sw21;
                }
                case 27: {
                    if (XG(r13) == false) { $pc21 = 29; continue $sw21; }
                    try {
                        r10.append(" synthetic");
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    $pc21 = 29; continue $sw21;
                }
                case 29: {
                    try {
                        r10.append("\n");
                        r2 = we(r13);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    $pc21 = 30; continue $sw21;
                }
                case 30: {
                    if (r3 >= r2) { $pc21 = 33; continue $sw21; }
                    try {
                        j6(r10, r11 + "  ", r12, Zo(r13, r3));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    r3 = r3 + 1;
                    { $pc21 = 30; continue $sw21; }
                }
                case 33: {
                    return;
                }
                case 13: {
                    if (this.J0.Zo(P8(r13)) == false) { $pc21 = 15; continue $sw21; }
                    try {
                        r10.append(r0 + r11 + lg(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    { $pc21 = 18; continue $sw21; }
                }
                case 15: {
                    try {
                        r10.append(r0 + r11 + this.J0.getString(P8(r13)));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 34; continue $sw21;
                    }
                    { $pc21 = 18; continue $sw21; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3478782675786185743L)
    private int tp(int r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 3;
        $sw22: while (true) {
            switch ($pc22) {
                case 18: {
                    th = $ex22;
                    if (DW == false) { $pc22 = 23; continue $sw22; }
                    abcd.wu.j6(th, 1164669666327476575L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc22 = 23; continue $sw22;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc22 = 5; continue $sw22; }
                    try {
                        abcd.wu.j6(1164669666327476575L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 18; continue $sw22;
                    }
                    $pc22 = 5; continue $sw22;
                }
                case 5: {
                    try {
                        r0 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 18; continue $sw22;
                    }
                    r1 = 0;
                    $pc22 = 7; continue $sw22;
                }
                case 7: {
                    if (r1 >= r0) { $pc22 = 13; continue $sw22; }
                    try {
                        r3 = tp(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 18; continue $sw22;
                    }
                    if (r3 != (-1)) { $pc22 = 10; continue $sw22; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 18; continue $sw22;
                    }
                    { $pc22 = 7; continue $sw22; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.a8(P8(r9)) == false) { $pc22 = 17; continue $sw22; }
                    if (Hw(r9, r10, r11) == false) { $pc22 = 17; continue $sw22; }
                    return r9;
                }
                case 17: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5144218931592275621L)
    private int u7(int r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 3;
        $sw23: while (true) {
            switch ($pc23) {
                case 24: {
                    th = $ex23;
                    if (DW == false) { $pc23 = 29; continue $sw23; }
                    abcd.wu.j6(th, -211833721295965963L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc23 = 29; continue $sw23;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc23 = 5; continue $sw23; }
                    try {
                        abcd.wu.j6(-211833721295965963L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 24; continue $sw23;
                    }
                    $pc23 = 5; continue $sw23;
                }
                case 5: {
                    try {
                        r0 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 24; continue $sw23;
                    }
                    r1 = 0;
                    $pc23 = 7; continue $sw23;
                }
                case 7: {
                    if (r1 >= r0) { $pc23 = 13; continue $sw23; }
                    try {
                        r3 = u7(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 24; continue $sw23;
                    }
                    if (r3 != (-1)) { $pc23 = 10; continue $sw23; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 24; continue $sw23;
                    }
                    { $pc23 = 7; continue $sw23; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.XL(P8(r9)) == true) { $pc23 = 15; continue $sw23; }
                    $pc23 = 23; continue $sw23;
                }
                case 23: {
                    return -1;
                }
                case 15: {
                    if (FH(r9, r10, r11) == false) { $pc23 = 17; continue $sw23; }
                    $pc23 = 22; continue $sw23;
                }
                case 22: {
                    return r9;
                }
                case 17: {
                    if (sh(r9) == false) { $pc23 = 23; continue $sw23; }
                    if (DW(j3(r9), r10, r11) == false) { $pc23 = 23; continue $sw23; }
                    if (j6(r9, r10, r11) == false) { $pc23 = 23; continue $sw23; }
                    { $pc23 = 22; continue $sw23; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3218033902245557040L)
    private int u7(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 3;
        $sw24: while (true) {
            switch ($pc24) {
                case 20: {
                    th = $ex24;
                    if (DW == false) { $pc24 = 25; continue $sw24; }
                    abcd.wu.j6(th, -6338966545055341968L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc24 = 25; continue $sw24;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc24 = 5; continue $sw24; }
                    try {
                        abcd.wu.j6(-6338966545055341968L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 20; continue $sw24;
                    }
                    $pc24 = 5; continue $sw24;
                }
                case 5: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 20; continue $sw24;
                    }
                    r1 = 0;
                    $pc24 = 7; continue $sw24;
                }
                case 7: {
                    if (r1 >= r0) { $pc24 = 13; continue $sw24; }
                    try {
                        r3 = u7(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 20; continue $sw24;
                    }
                    if (r3 != (-1)) { $pc24 = 10; continue $sw24; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 20; continue $sw24;
                    }
                    { $pc24 = 7; continue $sw24; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.FH(P8(r11)) == true) { $pc24 = 15; continue $sw24; }
                    $pc24 = 19; continue $sw24;
                }
                case 19: {
                    return -1;
                }
                case 15: {
                    if (FH(r11, r12, r13) == false) { $pc24 = 19; continue $sw24; }
                    if (FH(r11, r14, r15) == false) { $pc24 = 19; continue $sw24; }
                    return r11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -497571814379811360L)
    private int v5(int r11, int r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 3;
        $sw25: while (true) {
            switch ($pc25) {
                case 20: {
                    th = $ex25;
                    if (DW == false) { $pc25 = 25; continue $sw25; }
                    abcd.wu.j6(th, -676601774416656576L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc25 = 25; continue $sw25;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc25 = 5; continue $sw25; }
                    try {
                        abcd.wu.j6(-676601774416656576L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 20; continue $sw25;
                    }
                    $pc25 = 5; continue $sw25;
                }
                case 5: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 20; continue $sw25;
                    }
                    r1 = 0;
                    $pc25 = 7; continue $sw25;
                }
                case 7: {
                    if (r1 >= r0) { $pc25 = 13; continue $sw25; }
                    try {
                        r3 = v5(Zo(r11, r1), r12, r13, r14, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 20; continue $sw25;
                    }
                    if (r3 != (-1)) { $pc25 = 10; continue $sw25; }
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 20; continue $sw25;
                    }
                    { $pc25 = 7; continue $sw25; }
                }
                case 10: {
                    return r3;
                }
                case 13: {
                    if (this.J0.XL(P8(r11)) == true) { $pc25 = 15; continue $sw25; }
                    $pc25 = 19; continue $sw25;
                }
                case 19: {
                    return -1;
                }
                case 15: {
                    if (FH(r11, r12, r13) == false) { $pc25 = 19; continue $sw25; }
                    if (FH(r11, r14, r15) == false) { $pc25 = 19; continue $sw25; }
                    return r11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1664223720323826228L)
    private int we(int r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 3;
        $sw26: while (true) {
            switch ($pc26) {
                case 18: {
                    th = $ex26;
                    if (DW == false) { $pc26 = 23; continue $sw26; }
                    abcd.wu.j6(th, 770023590271691860L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc26 = 23; continue $sw26;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(770023590271691860L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 18; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    if (jJ(r9) == true) { $pc26 = 8; continue $sw26; }
                    $pc26 = 10; continue $sw26;
                }
                case 10: {
                    try {
                        r0 = we(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 18; continue $sw26;
                    }
                    r1 = 0;
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    if (r1 >= r0) { $pc26 = 17; continue $sw26; }
                    try {
                        r3 = we(Zo(r9, r1), r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 18; continue $sw26;
                    }
                    if (r3 != (-1)) { $pc26 = 15; continue $sw26; }
                    r1 = r1 + 1;
                    { $pc26 = 12; continue $sw26; }
                }
                case 15: {
                    return r3;
                }
                case 17: {
                    return -1;
                }
                case 8: {
                    if (FH(r9, r10, r11) == false) { $pc26 = 10; continue $sw26; }
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int BT(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 28: {
                    th = $ex27;
                    if (DW == false) { $pc27 = 32; continue $sw27; }
                    abcd.wu.j6(th, -686355732691674624L, this, new java.lang.Integer(r5));
                    $pc27 = 32; continue $sw27;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc27 = 7; continue $sw27; }
                    try {
                        abcd.wu.j6(-686355732691674624L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 28; continue $sw27;
                    }
                    $pc27 = 7; continue $sw27;
                }
                case 7: {
                    if (jJ(r5) == true) { $pc27 = 15; continue $sw27; }
                    if (we(r5) != 0) { $pc27 = 13; continue $sw27; }
                    return this.gn[r5 + 5];
                }
                case 13: {
                    return BT(Zo(r5, 0));
                }
                case 15: {
                    if (aj(r5) == false) { $pc27 = 19; continue $sw27; }
                    return this.gn[r5 + 5];
                }
                case 19: {
                    if (sy(r5) == false) { $pc27 = 23; continue $sw27; }
                    return this.gn[r5 + 5];
                }
                case 23: {
                    if (wc(r5) == false) { $pc27 = 27; continue $sw27; }
                    return this.gn[r5 + 4];
                }
                case 27: {
                    return this.gn[r5 + 4];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 3;
        $sw28: while (true) {
            switch ($pc28) {
                case 7: {
                    th = $ex28;
                    if (DW == false) { $pc28 = 11; continue $sw28; }
                    abcd.wu.j6(th, 3503332992377743515L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc28 = 11; continue $sw28;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc28 = 5; continue $sw28; }
                    try {
                        abcd.wu.j6(3503332992377743515L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 7; continue $sw28;
                    }
                    $pc28 = 5; continue $sw28;
                }
                case 5: {
                    return DW(aM(), r10, r11, r12, r13);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 4;
        $sw29: while (true) {
            switch ($pc29) {
                case 10: {
                    th = $ex29;
                    if (DW == false) { $pc29 = 14; continue $sw29; }
                    abcd.wu.j6(th, -4891947367175787837L, this);
                    $pc29 = 14; continue $sw29;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc29 = 7; continue $sw29; }
                    try {
                        abcd.wu.j6(-4891947367175787837L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 10; continue $sw29;
                    }
                    $pc29 = 7; continue $sw29;
                }
                case 7: {
                    if (this.U2 == true) { $pc29 = 17; continue $sw29; }
                    try {
                        et(aM());
                        this.U2 = true;
                        this.EQ = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 10; continue $sw29;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 8: {
                    th = $ex30;
                    if (DW == false) { $pc30 = 12; continue $sw30; }
                    abcd.wu.j6(th, -3894657242290242705L, this, new java.lang.Integer(r5));
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc30 = 6; continue $sw30; }
                    try {
                        abcd.wu.j6(-3894657242290242705L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 8; continue $sw30;
                    }
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    try {
                        this.we = r5;
                        this.U2 = true;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 8; continue $sw30;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 3;
        $sw31: while (true) {
            switch ($pc31) {
                case 7: {
                    th = $ex31;
                    if (DW == false) { $pc31 = 11; continue $sw31; }
                    abcd.wu.j6(th, 59997194561477853L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc31 = 11; continue $sw31;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc31 = 5; continue $sw31; }
                    try {
                        abcd.wu.j6(59997194561477853L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 7; continue $sw31;
                    }
                    $pc31 = 5; continue $sw31;
                }
                case 5: {
                    try {
                        J8(r8, 8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 7; continue $sw31;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r8, abcd.Ya r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 3;
        $sw32: while (true) {
            switch ($pc32) {
                case 12: {
                    th = $ex32;
                    if (DW == false) { $pc32 = 16; continue $sw32; }
                    abcd.wu.j6(th, 5992313596397942755L, this, new java.lang.Integer(r8), r9);
                    $pc32 = 16; continue $sw32;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc32 = 6; continue $sw32; }
                    try {
                        abcd.wu.j6(5992313596397942755L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 12; continue $sw32;
                    }
                    $pc32 = 6; continue $sw32;
                }
                case 6: {
                    if (this.v5.a8 != null) { $pc32 = 8; continue $sw32; }
                    return;
                }
                case 8: {
                    if (r9 != null) { $pc32 = 10; continue $sw32; }
                    try {
                        J8(r8, 1, -1);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 12; continue $sw32;
                    }
                    $pc32 = 10; continue $sw32;
                }
                case 10: {
                    try {
                        J8(r8, 1, this.v5.a8.Hw(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 12; continue $sw32;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(int r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 3;
        $sw33: while (true) {
            switch ($pc33) {
                case 18: {
                    th = $ex33;
                    if (DW == false) { $pc33 = 22; continue $sw33; }
                    abcd.wu.j6(th, -366616511851471236L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc33 = 22; continue $sw33;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc33 = 6; continue $sw33; }
                    try {
                        abcd.wu.j6(-366616511851471236L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 18; continue $sw33;
                    }
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    if (vy(r9) != 0) { $pc33 = 9; continue $sw33; }
                    return false;
                }
                case 9: {
                    if (r10 >= QX(r9)) { $pc33 = 12; continue $sw33; }
                    return false;
                }
                case 12: {
                    if (r10 <= QX(r9)) { $pc33 = 14; continue $sw33; }
                    return true;
                }
                case 14: {
                    if (Ws(r9) > r11) { $pc33 = 17; continue $sw33; }
                    return true;
                }
                case 17: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int EQ(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 8: {
                    th = $ex34;
                    if (DW == false) { $pc34 = 12; continue $sw34; }
                    abcd.wu.j6(th, -729737550477454255L, this, new java.lang.Integer(r5));
                    $pc34 = 12; continue $sw34;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc34 = 6; continue $sw34; }
                    try {
                        abcd.wu.j6(-729737550477454255L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 8; continue $sw34;
                    }
                    $pc34 = 6; continue $sw34;
                }
                case 6: {
                    return XL(r5, 7);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int EQ(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 3;
        $sw35: while (true) {
            switch ($pc35) {
                case 7: {
                    th = $ex35;
                    if (DW == false) { $pc35 = 11; continue $sw35; }
                    abcd.wu.j6(th, -1573968183836841540L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc35 = 11; continue $sw35;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc35 = 5; continue $sw35; }
                    try {
                        abcd.wu.j6(-1573968183836841540L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 7; continue $sw35;
                    }
                    $pc35 = 5; continue $sw35;
                }
                case 5: {
                    return u7(aM(), r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Cb EQ() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 4;
        $sw36: while (true) {
            switch ($pc36) {
                case 8: {
                    th = $ex36;
                    if (DW == false) { $pc36 = 12; continue $sw36; }
                    abcd.wu.j6(th, 4540282357276869965L, this);
                    $pc36 = 12; continue $sw36;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc36 = 6; continue $sw36; }
                    try {
                        abcd.wu.j6(4540282357276869965L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 8; continue $sw36;
                    }
                    $pc36 = 6; continue $sw36;
                }
                case 6: {
                    return this.J0.v5(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 4;
        $sw37: while (true) {
            switch ($pc37) {
                case 8: {
                    th = $ex37;
                    if (DW == false) { $pc37 = 12; continue $sw37; }
                    abcd.wu.j6(th, -5837588499091661984L, this);
                    $pc37 = 12; continue $sw37;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc37 = 6; continue $sw37; }
                    try {
                        abcd.wu.j6(-5837588499091661984L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 8; continue $sw37;
                    }
                    $pc37 = 6; continue $sw37;
                }
                case 6: {
                    return this.QX;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex38 = null;
        int $pc38 = 4;
        $sw38: while (true) {
            switch ($pc38) {
                case 8: {
                    th = $ex38;
                    if (DW == false) { $pc38 = 12; continue $sw38; }
                    abcd.wu.j6(th, 3862792546784222240L, this, new java.lang.Integer(r5));
                    $pc38 = 12; continue $sw38;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc38 = 6; continue $sw38; }
                    try {
                        abcd.wu.j6(3862792546784222240L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 8; continue $sw38;
                    }
                    $pc38 = 6; continue $sw38;
                }
                case 6: {
                    return XL(r5, 8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH(int r10, int r11, int r12, int r13) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex39 = null;
        int $pc39 = 3;
        $sw39: while (true) {
            switch ($pc39) {
                case 26: {
                    th = $ex39;
                    if (DW == false) { $pc39 = 31; continue $sw39; }
                    abcd.wu.j6(th, -354489795863329932L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc39 = 31; continue $sw39;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc39 = 5; continue $sw39; }
                    try {
                        abcd.wu.j6(-354489795863329932L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 26; continue $sw39;
                    }
                    $pc39 = 5; continue $sw39;
                }
                case 5: {
                    try {
                        r0 = DW(r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 26; continue $sw39;
                    }
                    if (r0 != (-1)) { $pc39 = 8; continue $sw39; }
                    return -1;
                }
                case 8: {
                    try {
                        r1 = we(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 26; continue $sw39;
                    }
                    r2 = 1;
                    $pc39 = 9; continue $sw39;
                }
                case 9: {
                    try {
                        r3 = r1 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 26; continue $sw39;
                    }
                    if (r2 >= r3) { $pc39 = 19; continue $sw39; }
                    try {
                        r4 = Zo(r0, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 26; continue $sw39;
                    }
                    if (this.J0.FH(P8(r4)) == false) { $pc39 = 18; continue $sw39; }
                    if (FH(r4, r10, r11) == true) { $pc39 = 17; continue $sw39; }
                    if (j6(r4, r10, r11) == false) { $pc39 = 18; continue $sw39; }
                    $pc39 = 17; continue $sw39;
                }
                case 17: {
                    return r4;
                }
                case 18: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 26; continue $sw39;
                    }
                    { $pc39 = 9; continue $sw39; }
                }
                case 19: {
                    try {
                        r5 = Zo(r0, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 26; continue $sw39;
                    }
                    if (r1 == 0) { $pc39 = 25; continue $sw39; }
                    if (this.J0.FH(P8(r5)) == false) { $pc39 = 25; continue $sw39; }
                    return r5;
                }
                case 25: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex40 = null;
        int $pc40 = 3;
        $sw40: while (true) {
            switch ($pc40) {
                case 7: {
                    th = $ex40;
                    if (DW == false) { $pc40 = 11; continue $sw40; }
                    abcd.wu.j6(th, -734511317426441499L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc40 = 11; continue $sw40;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc40 = 5; continue $sw40; }
                    try {
                        abcd.wu.j6(-734511317426441499L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 7; continue $sw40;
                    }
                    $pc40 = 5; continue $sw40;
                }
                case 5: {
                    try {
                        J8(r8, 9, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 7; continue $sw40;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH(int r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex41 = null;
        int $pc41 = 3;
        $sw41: while (true) {
            switch ($pc41) {
                case 34: {
                    th = $ex41;
                    if (DW == false) { $pc41 = 38; continue $sw41; }
                    abcd.wu.j6(th, 1080979025505365188L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc41 = 38; continue $sw41;
                }
                case 38: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc41 = 6; continue $sw41; }
                    try {
                        abcd.wu.j6(1080979025505365188L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 34; continue $sw41;
                    }
                    $pc41 = 6; continue $sw41;
                }
                case 6: {
                    if (vy(r9) != 0) { $pc41 = 9; continue $sw41; }
                    return false;
                }
                case 9: {
                    if (r10 >= vy(r9)) { $pc41 = 12; continue $sw41; }
                    return false;
                }
                case 12: {
                    if (r10 <= QX(r9)) { $pc41 = 15; continue $sw41; }
                    return false;
                }
                case 15: {
                    if (vy(r9) != QX(r9)) { $pc41 = 23; continue $sw41; }
                    if (r11 >= BT(r9)) { $pc41 = 20; continue $sw41; }
                    return false;
                }
                case 20: {
                    if (r11 < Ws(r9)) { $pc41 = 32; continue $sw41; }
                    return false;
                }
                case 32: {
                    return true;
                }
                case 23: {
                    if (r10 != vy(r9)) { $pc41 = 28; continue $sw41; }
                    if (r11 >= BT(r9)) { $pc41 = 28; continue $sw41; }
                    return false;
                }
                case 28: {
                    if (r10 == QX(r9)) { $pc41 = 30; continue $sw41; }
                    return true;
                }
                case 30: {
                    if (r11 < Ws(r9)) { $pc41 = 41; continue $sw41; }
                    return false;
                }
                case 41: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long Hw() {
        abcd.InterfaceC1126oa r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex42 = null;
        int $pc42 = 4;
        $sw42: while (true) {
            switch ($pc42) {
                case 16: {
                    th = $ex42;
                    if (DW == false) { $pc42 = 20; continue $sw42; }
                    abcd.wu.j6(th, 186483300783811085L, this);
                    $pc42 = 20; continue $sw42;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc42 = 7; continue $sw42; }
                    try {
                        abcd.wu.j6(186483300783811085L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 16; continue $sw42;
                    }
                    $pc42 = 7; continue $sw42;
                }
                case 7: {
                    if (this.aM != (-1)) { $pc42 = 9; continue $sw42; }
                    try {
                        r2 = J8().VH();
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 16; continue $sw42;
                    }
                    if (r2 != null) { $pc42 = 14; continue $sw42; }
                    return 0;
                }
                case 14: {
                    try {
                        this.aM = r2.Hw(this);
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 16; continue $sw42;
                    }
                    return this.aM;
                }
                case 9: {
                    return this.aM;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Cb Hw(int r10, int r11, int r12, int r13) {
        int r0 = 0;
        abcd.Cb r1 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex43 = null;
        int $pc43 = 3;
        $sw43: while (true) {
            switch ($pc43) {
                case 36: {
                    th = $ex43;
                    if (DW == false) { $pc43 = 41; continue $sw43; }
                    abcd.wu.j6(th, -4040598888606366893L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc43 = 41; continue $sw43;
                }
                case 41: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc43 = 5; continue $sw43; }
                    try {
                        abcd.wu.j6(-4040598888606366893L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    $pc43 = 5; continue $sw43;
                }
                case 5: {
                    try {
                        r0 = DW(r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    r1 = null;
                    if (r0 != (-1)) { $pc43 = 8; continue $sw43; }
                    return null;
                }
                case 8: {
                    try {
                        r3 = we(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    r4 = 0;
                    $pc43 = 9; continue $sw43;
                }
                case 9: {
                    if (r4 >= r3) { $pc43 = 16; continue $sw43; }
                    try {
                        r5 = Zo(r0, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    if (FH(r5, r10, r11) == true) { $pc43 = 17; continue $sw43; }
                    if (j6(r5, r10, r11) == true) { $pc43 = 17; continue $sw43; }
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    $pc43 = 17; continue $sw43;
                }
                case 17: {
                    try {
                        r6 = r3 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    $pc43 = 18; continue $sw43;
                }
                case 18: {
                    if (r6 < 0) { $pc43 = 25; continue $sw43; }
                    try {
                        r7 = Zo(r0, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    if (FH(r7, r12, r13) == true) { $pc43 = 26; continue $sw43; }
                    if (DW(r7, r12, r13) == true) { $pc43 = 26; continue $sw43; }
                    try {
                        r6 = r6 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    $pc43 = 26; continue $sw43;
                }
                case 26: {
                    if (r5 == (-1)) { $pc43 = 35; continue $sw43; }
                    if (r7 == (-1)) { $pc43 = 35; continue $sw43; }
                    if (r4 <= r6) { $pc43 = 31; continue $sw43; }
                    return null;
                }
                case 31: {
                    try {
                        r1 = new abcd.Cb();
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    $pc43 = 32; continue $sw43;
                }
                case 32: {
                    if (r4 > r6) { $pc43 = 35; continue $sw43; }
                    try {
                        r1.j6(Zo(r0, r4));
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 36; continue $sw43;
                    }
                    r4 = r4 + 1;
                    $pc43 = 35; continue $sw43;
                }
                case 35: {
                    return r1;
                }
                case 25: {
                    r7 = -1;
                    { $pc43 = 26; continue $sw43; }
                }
                case 16: {
                    r5 = -1;
                    { $pc43 = 17; continue $sw43; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Ya Hw(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex44 = null;
        int $pc44 = 4;
        $sw44: while (true) {
            switch ($pc44) {
                case 8: {
                    th = $ex44;
                    if (DW == false) { $pc44 = 12; continue $sw44; }
                    abcd.wu.j6(th, -69275498423213571L, this, new java.lang.Integer(r5));
                    $pc44 = 12; continue $sw44;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc44 = 6; continue $sw44; }
                    try {
                        abcd.wu.j6(-69275498423213571L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex44 = $t;
                        $pc44 = 8; continue $sw44;
                    }
                    $pc44 = 6; continue $sw44;
                }
                case 6: {
                    return (abcd.Ya) this.v5.a8.FH(XL(r5, 6));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex45 = null;
        int $pc45 = 3;
        $sw45: while (true) {
            switch ($pc45) {
                case 7: {
                    th = $ex45;
                    if (DW == false) { $pc45 = 11; continue $sw45; }
                    abcd.wu.j6(th, 2786626219995068792L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc45 = 11; continue $sw45;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc45 = 5; continue $sw45; }
                    try {
                        abcd.wu.j6(2786626219995068792L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 7; continue $sw45;
                    }
                    $pc45 = 5; continue $sw45;
                }
                case 5: {
                    try {
                        J8(r8, 7, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 7; continue $sw45;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Hw(int r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex46 = null;
        int $pc46 = 3;
        $sw46: while (true) {
            switch ($pc46) {
                case 31: {
                    th = $ex46;
                    if (DW == false) { $pc46 = 35; continue $sw46; }
                    abcd.wu.j6(th, 4620527242146325701L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc46 = 35; continue $sw46;
                }
                case 35: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc46 = 6; continue $sw46; }
                    try {
                        abcd.wu.j6(4620527242146325701L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex46 = $t;
                        $pc46 = 31; continue $sw46;
                    }
                    $pc46 = 6; continue $sw46;
                }
                case 6: {
                    if (r10 >= vy(r9)) { $pc46 = 9; continue $sw46; }
                    return false;
                }
                case 9: {
                    if (r10 <= QX(r9)) { $pc46 = 12; continue $sw46; }
                    return false;
                }
                case 12: {
                    if (vy(r9) != QX(r9)) { $pc46 = 20; continue $sw46; }
                    if (r11 >= BT(r9)) { $pc46 = 17; continue $sw46; }
                    return false;
                }
                case 17: {
                    if (r11 <= Ws(r9)) { $pc46 = 29; continue $sw46; }
                    return false;
                }
                case 29: {
                    return true;
                }
                case 20: {
                    if (r10 != vy(r9)) { $pc46 = 25; continue $sw46; }
                    if (r11 >= BT(r9)) { $pc46 = 25; continue $sw46; }
                    return false;
                }
                case 25: {
                    if (r10 == QX(r9)) { $pc46 = 27; continue $sw46; }
                    return true;
                }
                case 27: {
                    if (r11 <= Ws(r9)) { $pc46 = 38; continue $sw46; }
                    return false;
                }
                case 38: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean I(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex47 = null;
        int $pc47 = 4;
        $sw47: while (true) {
            switch ($pc47) {
                case 8: {
                    th = $ex47;
                    if (DW == false) { $pc47 = 12; continue $sw47; }
                    abcd.wu.j6(th, -2490995389834921761L, this, new java.lang.Integer(r5));
                    $pc47 = 12; continue $sw47;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc47 = 6; continue $sw47; }
                    try {
                        abcd.wu.j6(-2490995389834921761L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex47 = $t;
                        $pc47 = 8; continue $sw47;
                    }
                    $pc47 = 6; continue $sw47;
                }
                case 6: {
                    return this.J0.er(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J0() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex48 = null;
        int $pc48 = 4;
        $sw48: while (true) {
            switch ($pc48) {
                case 8: {
                    th = $ex48;
                    if (DW == false) { $pc48 = 12; continue $sw48; }
                    abcd.wu.j6(th, -4248775196637378944L, this);
                    $pc48 = 12; continue $sw48;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc48 = 6; continue $sw48; }
                    try {
                        abcd.wu.j6(-4248775196637378944L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex48 = $t;
                        $pc48 = 8; continue $sw48;
                    }
                    $pc48 = 6; continue $sw48;
                }
                case 6: {
                    return this.J0.Zo(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J0(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex49 = null;
        int $pc49 = 4;
        $sw49: while (true) {
            switch ($pc49) {
                case 8: {
                    th = $ex49;
                    if (DW == false) { $pc49 = 12; continue $sw49; }
                    abcd.wu.j6(th, 1168179825102721704L, this, new java.lang.Integer(r5));
                    $pc49 = 12; continue $sw49;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc49 = 6; continue $sw49; }
                    try {
                        abcd.wu.j6(1168179825102721704L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex49 = $t;
                        $pc49 = 8; continue $sw49;
                    }
                    $pc49 = 6; continue $sw49;
                }
                case 6: {
                    return aM(aM(), r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J0(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex50 = null;
        int $pc50 = 3;
        $sw50: while (true) {
            switch ($pc50) {
                case 7: {
                    th = $ex50;
                    if (DW == false) { $pc50 = 11; continue $sw50; }
                    abcd.wu.j6(th, -3997513118446960245L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc50 = 11; continue $sw50;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc50 = 5; continue $sw50; }
                    try {
                        abcd.wu.j6(-3997513118446960245L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex50 = $t;
                        $pc50 = 7; continue $sw50;
                    }
                    $pc50 = 5; continue $sw50;
                }
                case 5: {
                    return EQ(aM(), r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J8(int r7) {
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex51 = null;
        int $pc51 = 4;
        $sw51: while (true) {
            switch ($pc51) {
                case 16: {
                    th = $ex51;
                    if (DW == false) { $pc51 = 20; continue $sw51; }
                    abcd.wu.j6(th, 3630401698221014885L, this, new java.lang.Integer(r7));
                    $pc51 = 20; continue $sw51;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc51 = 7; continue $sw51; }
                    try {
                        abcd.wu.j6(3630401698221014885L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex51 = $t;
                        $pc51 = 16; continue $sw51;
                    }
                    $pc51 = 7; continue $sw51;
                }
                case 7: {
                    if (jJ(r7) == true) { $pc51 = 9; continue $sw51; }
                    try {
                        r3 = r7 + 3;
                    } catch (java.lang.Throwable $t) {
                        $ex51 = $t;
                        $pc51 = 16; continue $sw51;
                    }
                    if (this.gn[r3] != 0) { $pc51 = 15; continue $sw51; }
                    return this.gn[r7 + 6];
                }
                case 15: {
                    return this.gn[(r7 + 4) + this.gn[r3]];
                }
                case 9: {
                    return this.gn[r7 + 8];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J8(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex52 = null;
        int $pc52 = 3;
        $sw52: while (true) {
            switch ($pc52) {
                case 7: {
                    th = $ex52;
                    if (DW == false) { $pc52 = 11; continue $sw52; }
                    abcd.wu.j6(th, -363835886358214053L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc52 = 11; continue $sw52;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc52 = 5; continue $sw52; }
                    try {
                        abcd.wu.j6(-363835886358214053L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex52 = $t;
                        $pc52 = 7; continue $sw52;
                    }
                    $pc52 = 5; continue $sw52;
                }
                case 5: {
                    return we(aM(), r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Interfacena J8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex53 = null;
        int $pc53 = 4;
        $sw53: while (true) {
            switch ($pc53) {
                case 8: {
                    th = $ex53;
                    if (DW == false) { $pc53 = 12; continue $sw53; }
                    abcd.wu.j6(th, -2238847541271191025L, this);
                    $pc53 = 12; continue $sw53;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc53 = 6; continue $sw53; }
                    try {
                        abcd.wu.j6(-2238847541271191025L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 8; continue $sw53;
                    }
                    $pc53 = 6; continue $sw53;
                }
                case 6: {
                    return this.a8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean KD(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex54 = null;
        int $pc54 = 4;
        $sw54: while (true) {
            switch ($pc54) {
                case 12: {
                    th = $ex54;
                    if (DW == false) { $pc54 = 16; continue $sw54; }
                    abcd.wu.j6(th, -1594934599337135212L, this, new java.lang.Integer(r5));
                    $pc54 = 16; continue $sw54;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc54 = 6; continue $sw54; }
                    try {
                        abcd.wu.j6(-1594934599337135212L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex54 = $t;
                        $pc54 = 12; continue $sw54;
                    }
                    $pc54 = 6; continue $sw54;
                }
                case 6: {
                    if (XL(r5, 9) == (-1)) { $pc54 = 10; continue $sw54; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long Mr() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex55 = null;
        int $pc55 = 4;
        $sw55: while (true) {
            switch ($pc55) {
                case 9: {
                    th = $ex55;
                    if (DW == false) { $pc55 = 13; continue $sw55; }
                    abcd.wu.j6(th, -1857278324651276395L, this);
                    $pc55 = 13; continue $sw55;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc55 = 6; continue $sw55; }
                    try {
                        abcd.wu.j6(-1857278324651276395L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 9; continue $sw55;
                    }
                    $pc55 = 6; continue $sw55;
                }
                case 6: {
                    return (this.u7 * 4) + (this.EQ * 4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public char[] Mr(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex56 = null;
        int $pc56 = 4;
        $sw56: while (true) {
            switch ($pc56) {
                case 8: {
                    th = $ex56;
                    if (DW == false) { $pc56 = 12; continue $sw56; }
                    abcd.wu.j6(th, 2095438848431276420L, this, new java.lang.Integer(r5));
                    $pc56 = 12; continue $sw56;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc56 = 6; continue $sw56; }
                    try {
                        abcd.wu.j6(2095438848431276420L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex56 = $t;
                        $pc56 = 8; continue $sw56;
                    }
                    $pc56 = 6; continue $sw56;
                }
                case 6: {
                    return this.Zo;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Mz(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex57 = null;
        int $pc57 = 4;
        $sw57: while (true) {
            switch ($pc57) {
                case 13: {
                    th = $ex57;
                    if (DW == false) { $pc57 = 17; continue $sw57; }
                    abcd.wu.j6(th, -1606814630192017785L, this, new java.lang.Integer(r5));
                    $pc57 = 17; continue $sw57;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc57 = 7; continue $sw57; }
                    try {
                        abcd.wu.j6(-1606814630192017785L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex57 = $t;
                        $pc57 = 13; continue $sw57;
                    }
                    $pc57 = 7; continue $sw57;
                }
                case 7: {
                    if (this.J0.u7(P8(r5)) == false) { $pc57 = 11; continue $sw57; }
                    if (this.J0.J0(this, r5) == false) { $pc57 = 11; continue $sw57; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean OW(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex58 = null;
        int $pc58 = 4;
        $sw58: while (true) {
            switch ($pc58) {
                case 8: {
                    th = $ex58;
                    if (DW == false) { $pc58 = 12; continue $sw58; }
                    abcd.wu.j6(th, -4561488395200125208L, this, new java.lang.Integer(r5));
                    $pc58 = 12; continue $sw58;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc58 = 6; continue $sw58; }
                    try {
                        abcd.wu.j6(-4561488395200125208L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex58 = $t;
                        $pc58 = 8; continue $sw58;
                    }
                    $pc58 = 6; continue $sw58;
                }
                case 6: {
                    return this.J0.XL(this, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int P8(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex59 = null;
        int $pc59 = 4;
        $sw59: while (true) {
            switch ($pc59) {
                case 9: {
                    th = $ex59;
                    if (DW == false) { $pc59 = 13; continue $sw59; }
                    abcd.wu.j6(th, -1645872972450610435L, this, new java.lang.Integer(r5));
                    $pc59 = 13; continue $sw59;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc59 = 6; continue $sw59; }
                    try {
                        abcd.wu.j6(-1645872972450610435L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 9; continue $sw59;
                    }
                    $pc59 = 6; continue $sw59;
                }
                case 6: {
                    return this.gn[r5] & 65535;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int QX(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex60 = null;
        int $pc60 = 4;
        $sw60: while (true) {
            switch ($pc60) {
                case 28: {
                    th = $ex60;
                    if (DW == false) { $pc60 = 32; continue $sw60; }
                    abcd.wu.j6(th, -266813667501870135L, this, new java.lang.Integer(r5));
                    $pc60 = 32; continue $sw60;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc60 = 7; continue $sw60; }
                    try {
                        abcd.wu.j6(-266813667501870135L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex60 = $t;
                        $pc60 = 28; continue $sw60;
                    }
                    $pc60 = 7; continue $sw60;
                }
                case 7: {
                    if (jJ(r5) == true) { $pc60 = 15; continue $sw60; }
                    if (we(r5) != 0) { $pc60 = 13; continue $sw60; }
                    return this.gn[r5 + 4];
                }
                case 13: {
                    return QX(Zo(r5, we(r5) - 1));
                }
                case 15: {
                    if (aj(r5) == false) { $pc60 = 19; continue $sw60; }
                    return this.gn[r5 + 6];
                }
                case 19: {
                    if (sy(r5) == false) { $pc60 = 23; continue $sw60; }
                    return this.gn[r5 + 6];
                }
                case 23: {
                    if (wc(r5) == false) { $pc60 = 27; continue $sw60; }
                    return this.gn[r5 + 5];
                }
                case 27: {
                    return this.gn[r5 + 3];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Cb QX() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex61 = null;
        int $pc61 = 4;
        $sw61: while (true) {
            switch ($pc61) {
                case 8: {
                    th = $ex61;
                    if (DW == false) { $pc61 = 12; continue $sw61; }
                    abcd.wu.j6(th, -1398812590765049391L, this);
                    $pc61 = 12; continue $sw61;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc61 = 6; continue $sw61; }
                    try {
                        abcd.wu.j6(-1398812590765049391L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex61 = $t;
                        $pc61 = 8; continue $sw61;
                    }
                    $pc61 = 6; continue $sw61;
                }
                case 6: {
                    return this.J0.j6(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean QX(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex62 = null;
        int $pc62 = 3;
        $sw62: while (true) {
            switch ($pc62) {
                case 15: {
                    th = $ex62;
                    if (DW == false) { $pc62 = 20; continue $sw62; }
                    abcd.wu.j6(th, 308217590367869355L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc62 = 20; continue $sw62;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc62 = 6; continue $sw62; }
                    try {
                        abcd.wu.j6(308217590367869355L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex62 = $t;
                        $pc62 = 15; continue $sw62;
                    }
                    $pc62 = 6; continue $sw62;
                }
                case 6: {
                    if (r9 != r8) { $pc62 = 8; continue $sw62; }
                    return true;
                }
                case 8: {
                    if (r9 == aM()) { $pc62 = 13; continue $sw62; }
                    try {
                        r9 = er(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex62 = $t;
                        $pc62 = 15; continue $sw62;
                    }
                    if (r9 != r8) { $pc62 = 8; continue $sw62; }
                    return true;
                }
                case 13: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Qq(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex63 = null;
        int $pc63 = 4;
        $sw63: while (true) {
            switch ($pc63) {
                case 8: {
                    th = $ex63;
                    if (DW == false) { $pc63 = 12; continue $sw63; }
                    abcd.wu.j6(th, -6487217610839618137L, this, new java.lang.Integer(r5));
                    $pc63 = 12; continue $sw63;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc63 = 6; continue $sw63; }
                    try {
                        abcd.wu.j6(-6487217610839618137L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex63 = $t;
                        $pc63 = 8; continue $sw63;
                    }
                    $pc63 = 6; continue $sw63;
                }
                case 6: {
                    return this.J0.VH(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean SI(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex64 = null;
        int $pc64 = 4;
        $sw64: while (true) {
            switch ($pc64) {
                case 12: {
                    th = $ex64;
                    if (DW == false) { $pc64 = 16; continue $sw64; }
                    abcd.wu.j6(th, 45427089711977693L, this, new java.lang.Integer(r5));
                    $pc64 = 16; continue $sw64;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc64 = 6; continue $sw64; }
                    try {
                        abcd.wu.j6(45427089711977693L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 12; continue $sw64;
                    }
                    $pc64 = 6; continue $sw64;
                }
                case 6: {
                    if (XL(r5, 6) == (-1)) { $pc64 = 10; continue $sw64; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Sf(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex65 = null;
        int $pc65 = 4;
        $sw65: while (true) {
            switch ($pc65) {
                case 8: {
                    th = $ex65;
                    if (DW == false) { $pc65 = 12; continue $sw65; }
                    abcd.wu.j6(th, 900085504741262984L, this, new java.lang.Integer(r5));
                    $pc65 = 12; continue $sw65;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc65 = 6; continue $sw65; }
                    try {
                        abcd.wu.j6(900085504741262984L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 8; continue $sw65;
                    }
                    $pc65 = 6; continue $sw65;
                }
                case 6: {
                    return this.J0.EQ(this, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int U2(int r5) {
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex66 = null;
        int $pc66 = 4;
        $sw66: while (true) {
            switch ($pc66) {
                case 8: {
                    th = $ex66;
                    if (DW == false) { $pc66 = 12; continue $sw66; }
                    abcd.wu.j6(th, 297569932104613832L, this, new java.lang.Integer(r5));
                    $pc66 = 12; continue $sw66;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc66 = 6; continue $sw66; }
                    try {
                        abcd.wu.j6(297569932104613832L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex66 = $t;
                        $pc66 = 8; continue $sw66;
                    }
                    $pc66 = 6; continue $sw66;
                }
                case 6: {
                    try {
                        r2 = this.gn[r5 + 3];
                    } catch (java.lang.Throwable $t) {
                        $ex66 = $t;
                        $pc66 = 8; continue $sw66;
                    }
                    return this.Zo[r2];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long U2() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex67 = null;
        int $pc67 = 4;
        $sw67: while (true) {
            switch ($pc67) {
                case 9: {
                    th = $ex67;
                    if (DW == false) { $pc67 = 13; continue $sw67; }
                    abcd.wu.j6(th, -3216320501675236380L, this);
                    $pc67 = 13; continue $sw67;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc67 = 6; continue $sw67; }
                    try {
                        abcd.wu.j6(-3216320501675236380L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex67 = $t;
                        $pc67 = 9; continue $sw67;
                    }
                    $pc67 = 6; continue $sw67;
                }
                case 6: {
                    return (this.gn.length * 4) + (this.tp.length * 4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int VH(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex68 = null;
        int $pc68 = 4;
        $sw68: while (true) {
            switch ($pc68) {
                case 8: {
                    th = $ex68;
                    if (DW == false) { $pc68 = 12; continue $sw68; }
                    abcd.wu.j6(th, 2656951041168363200L, this, new java.lang.Integer(r5));
                    $pc68 = 12; continue $sw68;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc68 = 6; continue $sw68; }
                    try {
                        abcd.wu.j6(2656951041168363200L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex68 = $t;
                        $pc68 = 8; continue $sw68;
                    }
                    $pc68 = 6; continue $sw68;
                }
                case 6: {
                    return XL(r5, 5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int VH(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex69 = null;
        int $pc69 = 3;
        $sw69: while (true) {
            switch ($pc69) {
                case 7: {
                    th = $ex69;
                    if (DW == false) { $pc69 = 11; continue $sw69; }
                    abcd.wu.j6(th, 1315899244292813312L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc69 = 11; continue $sw69;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc69 = 5; continue $sw69; }
                    try {
                        abcd.wu.j6(1315899244292813312L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex69 = $t;
                        $pc69 = 7; continue $sw69;
                    }
                    $pc69 = 5; continue $sw69;
                }
                case 5: {
                    return FH(aM(), r8, r9, r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int VH(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex70 = null;
        int $pc70 = 3;
        $sw70: while (true) {
            switch ($pc70) {
                case 7: {
                    th = $ex70;
                    if (DW == false) { $pc70 = 11; continue $sw70; }
                    abcd.wu.j6(th, -126726138978238183L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc70 = 11; continue $sw70;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc70 = 5; continue $sw70; }
                    try {
                        abcd.wu.j6(-126726138978238183L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex70 = $t;
                        $pc70 = 7; continue $sw70;
                    }
                    $pc70 = 5; continue $sw70;
                }
                case 5: {
                    return v5(aM(), r10, r11, r12, r13);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Da VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex71 = null;
        int $pc71 = 4;
        $sw71: while (true) {
            switch ($pc71) {
                case 8: {
                    th = $ex71;
                    if (DW == false) { $pc71 = 12; continue $sw71; }
                    abcd.wu.j6(th, 2037051920088535167L, this);
                    $pc71 = 12; continue $sw71;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc71 = 6; continue $sw71; }
                    try {
                        abcd.wu.j6(2037051920088535167L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex71 = $t;
                        $pc71 = 8; continue $sw71;
                    }
                    $pc71 = 6; continue $sw71;
                }
                case 6: {
                    return this.J8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Ws(int r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex72 = null;
        int $pc72 = 4;
        $sw72: while (true) {
            switch ($pc72) {
                case 33: {
                    th = $ex72;
                    if (DW == false) { $pc72 = 37; continue $sw72; }
                    abcd.wu.j6(th, 1083525908733095837L, this, new java.lang.Integer(r6));
                    $pc72 = 37; continue $sw72;
                }
                case 37: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc72 = 7; continue $sw72; }
                    try {
                        abcd.wu.j6(1083525908733095837L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex72 = $t;
                        $pc72 = 33; continue $sw72;
                    }
                    $pc72 = 7; continue $sw72;
                }
                case 7: {
                    if (jJ(r6) == true) { $pc72 = 15; continue $sw72; }
                    if (we(r6) != 0) { $pc72 = 13; continue $sw72; }
                    return this.gn[r6 + 5];
                }
                case 13: {
                    return Ws(Zo(r6, we(r6) - 1));
                }
                case 15: {
                    if (aj(r6) == false) { $pc72 = 19; continue $sw72; }
                    return this.gn[r6 + 7];
                }
                case 19: {
                    if (sy(r6) == false) { $pc72 = 23; continue $sw72; }
                    return this.gn[r6 + 7];
                }
                case 23: {
                    if (wc(r6) == false) { $pc72 = 27; continue $sw72; }
                    return this.gn[r6 + 6];
                }
                case 27: {
                    if (XG(r6) == false) { $pc72 = 32; continue $sw72; }
                    return this.gn[r6 + 4];
                }
                case 32: {
                    return this.gn[r6 + 4] + this.J0.J8(P8(r6));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Ws(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex73 = null;
        int $pc73 = 3;
        $sw73: while (true) {
            switch ($pc73) {
                case 7: {
                    th = $ex73;
                    if (DW == false) { $pc73 = 11; continue $sw73; }
                    abcd.wu.j6(th, 3094592027165154892L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc73 = 11; continue $sw73;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc73 = 5; continue $sw73; }
                    try {
                        abcd.wu.j6(3094592027165154892L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex73 = $t;
                        $pc73 = 7; continue $sw73;
                    }
                    $pc73 = 5; continue $sw73;
                }
                case 5: {
                    return J0(aM(), r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.La Ws() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex74 = null;
        int $pc74 = 4;
        $sw74: while (true) {
            switch ($pc74) {
                case 8: {
                    th = $ex74;
                    if (DW == false) { $pc74 = 12; continue $sw74; }
                    abcd.wu.j6(th, -386862077097776640L, this);
                    $pc74 = 12; continue $sw74;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc74 = 6; continue $sw74; }
                    try {
                        abcd.wu.j6(-386862077097776640L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex74 = $t;
                        $pc74 = 8; continue $sw74;
                    }
                    $pc74 = 6; continue $sw74;
                }
                case 6: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean XG(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex75 = null;
        int $pc75 = 4;
        $sw75: while (true) {
            switch ($pc75) {
                case 12: {
                    th = $ex75;
                    if (DW == false) { $pc75 = 16; continue $sw75; }
                    abcd.wu.j6(th, -933997744338220485L, this, new java.lang.Integer(r5));
                    $pc75 = 16; continue $sw75;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc75 = 6; continue $sw75; }
                    try {
                        abcd.wu.j6(-933997744338220485L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex75 = $t;
                        $pc75 = 12; continue $sw75;
                    }
                    $pc75 = 6; continue $sw75;
                }
                case 6: {
                    if ((this.gn[r5] & 1048576) == 0) { $pc75 = 10; continue $sw75; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int XL(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex76 = null;
        int $pc76 = 4;
        $sw76: while (true) {
            switch ($pc76) {
                case 8: {
                    th = $ex76;
                    if (DW == false) { $pc76 = 12; continue $sw76; }
                    abcd.wu.j6(th, -224836775509390933L, this, new java.lang.Integer(r5));
                    $pc76 = 12; continue $sw76;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc76 = 6; continue $sw76; }
                    try {
                        abcd.wu.j6(-224836775509390933L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex76 = $t;
                        $pc76 = 8; continue $sw76;
                    }
                    $pc76 = 6; continue $sw76;
                }
                case 6: {
                    return this.gn[r5 + 3];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long XL() {
        abcd.InterfaceC1126oa r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex77 = null;
        int $pc77 = 4;
        $sw77: while (true) {
            switch ($pc77) {
                case 16: {
                    th = $ex77;
                    if (DW == false) { $pc77 = 20; continue $sw77; }
                    abcd.wu.j6(th, -1454964320046957952L, this);
                    $pc77 = 20; continue $sw77;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc77 = 7; continue $sw77; }
                    try {
                        abcd.wu.j6(-1454964320046957952L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex77 = $t;
                        $pc77 = 16; continue $sw77;
                    }
                    $pc77 = 7; continue $sw77;
                }
                case 7: {
                    if (this.j3 != (-1)) { $pc77 = 9; continue $sw77; }
                    try {
                        r2 = J8().VH();
                    } catch (java.lang.Throwable $t) {
                        $ex77 = $t;
                        $pc77 = 16; continue $sw77;
                    }
                    if (r2 != null) { $pc77 = 14; continue $sw77; }
                    return 0;
                }
                case 14: {
                    try {
                        this.j3 = r2.v5(this);
                    } catch (java.lang.Throwable $t) {
                        $ex77 = $t;
                        $pc77 = 16; continue $sw77;
                    }
                    return this.j3;
                }
                case 9: {
                    return this.j3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean XX(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex78 = null;
        int $pc78 = 4;
        $sw78: while (true) {
            switch ($pc78) {
                case 13: {
                    th = $ex78;
                    if (DW == false) { $pc78 = 17; continue $sw78; }
                    abcd.wu.j6(th, -2958570517571427300L, this, new java.lang.Integer(r5));
                    $pc78 = 17; continue $sw78;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc78 = 7; continue $sw78; }
                    try {
                        abcd.wu.j6(-2958570517571427300L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex78 = $t;
                        $pc78 = 13; continue $sw78;
                    }
                    $pc78 = 7; continue $sw78;
                }
                case 7: {
                    if (this.J0.u7(P8(r5)) == false) { $pc78 = 11; continue $sw78; }
                    if (this.J0.FH(this, r5) == false) { $pc78 = 11; continue $sw78; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Zo(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex79 = null;
        int $pc79 = 4;
        $sw79: while (true) {
            switch ($pc79) {
                case 8: {
                    th = $ex79;
                    if (DW == false) { $pc79 = 12; continue $sw79; }
                    abcd.wu.j6(th, -5531045293657421280L, this, new java.lang.Integer(r5));
                    $pc79 = 12; continue $sw79;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc79 = 6; continue $sw79; }
                    try {
                        abcd.wu.j6(-5531045293657421280L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex79 = $t;
                        $pc79 = 8; continue $sw79;
                    }
                    $pc79 = 6; continue $sw79;
                }
                case 6: {
                    return XL(r5, 4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Zo(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex80 = null;
        int $pc80 = 3;
        $sw80: while (true) {
            switch ($pc80) {
                case 7: {
                    th = $ex80;
                    if (DW == false) { $pc80 = 11; continue $sw80; }
                    abcd.wu.j6(th, -2645726271021842515L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc80 = 11; continue $sw80;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc80 = 5; continue $sw80; }
                    try {
                        abcd.wu.j6(-2645726271021842515L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex80 = $t;
                        $pc80 = 7; continue $sw80;
                    }
                    $pc80 = 5; continue $sw80;
                }
                case 5: {
                    return this.gn[(r8 + 4) + r9];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long Zo() {
        abcd.InterfaceC1126oa r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex81 = null;
        int $pc81 = 4;
        $sw81: while (true) {
            switch ($pc81) {
                case 16: {
                    th = $ex81;
                    if (DW == false) { $pc81 = 20; continue $sw81; }
                    abcd.wu.j6(th, 2599580829042023523L, this);
                    $pc81 = 20; continue $sw81;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc81 = 7; continue $sw81; }
                    try {
                        abcd.wu.j6(2599580829042023523L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex81 = $t;
                        $pc81 = 16; continue $sw81;
                    }
                    $pc81 = 7; continue $sw81;
                }
                case 7: {
                    if (this.XL != (-1)) { $pc81 = 9; continue $sw81; }
                    try {
                        r2 = J8().VH();
                    } catch (java.lang.Throwable $t) {
                        $ex81 = $t;
                        $pc81 = 16; continue $sw81;
                    }
                    if (r2 != null) { $pc81 = 14; continue $sw81; }
                    return 0;
                }
                case 14: {
                    try {
                        this.XL = r2.DW(this);
                    } catch (java.lang.Throwable $t) {
                        $ex81 = $t;
                        $pc81 = 16; continue $sw81;
                    }
                    return this.XL;
                }
                case 9: {
                    return this.XL;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Cb Zo(int r10, int r11, int r12, int r13) {
        int r0 = 0;
        abcd.Cb r1 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex82 = null;
        int $pc82 = 3;
        $sw82: while (true) {
            switch ($pc82) {
                case 36: {
                    th = $ex82;
                    if (DW == false) { $pc82 = 41; continue $sw82; }
                    abcd.wu.j6(th, -582209268948290445L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc82 = 41; continue $sw82;
                }
                case 41: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc82 = 5; continue $sw82; }
                    try {
                        abcd.wu.j6(-582209268948290445L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    $pc82 = 5; continue $sw82;
                }
                case 5: {
                    try {
                        r0 = v5(r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    r1 = null;
                    if (r0 != (-1)) { $pc82 = 8; continue $sw82; }
                    return null;
                }
                case 8: {
                    try {
                        r3 = we(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    r4 = 0;
                    $pc82 = 9; continue $sw82;
                }
                case 9: {
                    try {
                        r5 = r3 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    if (r4 >= r5) { $pc82 = 17; continue $sw82; }
                    try {
                        r6 = Zo(r0, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    if (FH(r6, r10, r11) == true) { $pc82 = 18; continue $sw82; }
                    if (j6(r6, r10, r11) == true) { $pc82 = 18; continue $sw82; }
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    $pc82 = 18; continue $sw82;
                }
                case 18: {
                    if (r5 < 0) { $pc82 = 25; continue $sw82; }
                    try {
                        r7 = Zo(r0, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    if (FH(r7, r12, r13) == true) { $pc82 = 26; continue $sw82; }
                    if (DW(r7, r12, r13) == true) { $pc82 = 26; continue $sw82; }
                    try {
                        r5 = r5 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    $pc82 = 26; continue $sw82;
                }
                case 26: {
                    if (r6 == (-1)) { $pc82 = 35; continue $sw82; }
                    if (r7 == (-1)) { $pc82 = 35; continue $sw82; }
                    if (r4 <= r5) { $pc82 = 31; continue $sw82; }
                    return null;
                }
                case 31: {
                    try {
                        r1 = new abcd.Cb();
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    $pc82 = 32; continue $sw82;
                }
                case 32: {
                    if (r4 > r5) { $pc82 = 35; continue $sw82; }
                    try {
                        r1.j6(Zo(r0, r4));
                    } catch (java.lang.Throwable $t) {
                        $ex82 = $t;
                        $pc82 = 36; continue $sw82;
                    }
                    r4 = r4 + 1;
                    $pc82 = 35; continue $sw82;
                }
                case 35: {
                    return r1;
                }
                case 25: {
                    r7 = -1;
                    { $pc82 = 26; continue $sw82; }
                }
                case 17: {
                    r6 = -1;
                    { $pc82 = 18; continue $sw82; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int a8(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex83 = null;
        int $pc83 = 4;
        $sw83: while (true) {
            switch ($pc83) {
                case 9: {
                    th = $ex83;
                    if (DW == false) { $pc83 = 13; continue $sw83; }
                    abcd.wu.j6(th, 306157390040880256L, this, new java.lang.Integer(r5));
                    $pc83 = 13; continue $sw83;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc83 = 6; continue $sw83; }
                    try {
                        abcd.wu.j6(306157390040880256L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex83 = $t;
                        $pc83 = 9; continue $sw83;
                    }
                    $pc83 = 6; continue $sw83;
                }
                case 6: {
                    return this.gn[r5 + 3] + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int aM() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex84 = null;
        int $pc84 = 4;
        $sw84: while (true) {
            switch ($pc84) {
                case 8: {
                    th = $ex84;
                    if (DW == false) { $pc84 = 12; continue $sw84; }
                    abcd.wu.j6(th, 1610919990977412225L, this);
                    $pc84 = 12; continue $sw84;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc84 = 6; continue $sw84; }
                    try {
                        abcd.wu.j6(1610919990977412225L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex84 = $t;
                        $pc84 = 8; continue $sw84;
                    }
                    $pc84 = 6; continue $sw84;
                }
                case 6: {
                    return this.we;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String aM(int r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex85 = null;
        int $pc85 = 4;
        $sw85: while (true) {
            switch ($pc85) {
                case 8: {
                    th = $ex85;
                    if (DW == false) { $pc85 = 12; continue $sw85; }
                    abcd.wu.j6(th, -6547211289958936572L, this, new java.lang.Integer(r6));
                    $pc85 = 12; continue $sw85;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc85 = 6; continue $sw85; }
                    try {
                        abcd.wu.j6(-6547211289958936572L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex85 = $t;
                        $pc85 = 8; continue $sw85;
                    }
                    $pc85 = 6; continue $sw85;
                }
                case 6: {
                    return this.v5.j3.j6(this.gn[r6 + 3]);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean aj(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex86 = null;
        int $pc86 = 4;
        $sw86: while (true) {
            switch ($pc86) {
                case 8: {
                    th = $ex86;
                    if (DW == false) { $pc86 = 12; continue $sw86; }
                    abcd.wu.j6(th, 420254434345031055L, this, new java.lang.Integer(r5));
                    $pc86 = 12; continue $sw86;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc86 = 6; continue $sw86; }
                    try {
                        abcd.wu.j6(420254434345031055L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex86 = $t;
                        $pc86 = 8; continue $sw86;
                    }
                    $pc86 = 6; continue $sw86;
                }
                case 6: {
                    return this.J0.Zo(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean br(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex87 = null;
        int $pc87 = 4;
        $sw87: while (true) {
            switch ($pc87) {
                case 8: {
                    th = $ex87;
                    if (DW == false) { $pc87 = 12; continue $sw87; }
                    abcd.wu.j6(th, -1655428337792827400L, this, new java.lang.Integer(r5));
                    $pc87 = 12; continue $sw87;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc87 = 6; continue $sw87; }
                    try {
                        abcd.wu.j6(-1655428337792827400L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex87 = $t;
                        $pc87 = 8; continue $sw87;
                    }
                    $pc87 = 6; continue $sw87;
                }
                case 6: {
                    return this.J0.a8(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean ca(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex88 = null;
        int $pc88 = 4;
        $sw88: while (true) {
            switch ($pc88) {
                case 8: {
                    th = $ex88;
                    if (DW == false) { $pc88 = 12; continue $sw88; }
                    abcd.wu.j6(th, -162820776430117960L, this, new java.lang.Integer(r5));
                    $pc88 = 12; continue $sw88;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc88 = 6; continue $sw88; }
                    try {
                        abcd.wu.j6(-162820776430117960L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex88 = $t;
                        $pc88 = 8; continue $sw88;
                    }
                    $pc88 = 6; continue $sw88;
                }
                case 6: {
                    return this.J0.j3(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean cb(int r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex89 = null;
        int $pc89 = 4;
        $sw89: while (true) {
            switch ($pc89) {
                case 11: {
                    th = $ex89;
                    if (DW == false) { $pc89 = 15; continue $sw89; }
                    abcd.wu.j6(th, 777108872215754140L, this, new java.lang.Integer(r6));
                    $pc89 = 15; continue $sw89;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc89 = 6; continue $sw89; }
                    try {
                        abcd.wu.j6(777108872215754140L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex89 = $t;
                        $pc89 = 11; continue $sw89;
                    }
                    $pc89 = 6; continue $sw89;
                }
                case 6: {
                    if (Zo(er(r6), we(er(r6)) - 1) != r6) { $pc89 = 18; continue $sw89; }
                    return false;
                }
                case 18: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean cn(int r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex90 = null;
        int $pc90 = 4;
        $sw90: while (true) {
            switch ($pc90) {
                case 14: {
                    th = $ex90;
                    if (DW == false) { $pc90 = 18; continue $sw90; }
                    abcd.wu.j6(th, -1802570537421994032L, this, new java.lang.Integer(r7));
                    $pc90 = 18; continue $sw90;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc90 = 7; continue $sw90; }
                    try {
                        abcd.wu.j6(-1802570537421994032L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex90 = $t;
                        $pc90 = 14; continue $sw90;
                    }
                    $pc90 = 7; continue $sw90;
                }
                case 7: {
                    if (this.J0.BT(P8(r7)) == true) { $pc90 = 9; continue $sw90; }
                    return false;
                }
                case 9: {
                    if (tp(r7) == this.Hw) { $pc90 = 21; continue $sw90; }
                    return true;
                }
                case 21: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean dx(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex91 = null;
        int $pc91 = 4;
        $sw91: while (true) {
            switch ($pc91) {
                case 8: {
                    th = $ex91;
                    if (DW == false) { $pc91 = 12; continue $sw91; }
                    abcd.wu.j6(th, -4370822974145421632L, this, new java.lang.Integer(r5));
                    $pc91 = 12; continue $sw91;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc91 = 6; continue $sw91; }
                    try {
                        abcd.wu.j6(-4370822974145421632L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex91 = $t;
                        $pc91 = 8; continue $sw91;
                    }
                    $pc91 = 6; continue $sw91;
                }
                case 6: {
                    return this.J0.aM(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean ef(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex92 = null;
        int $pc92 = 4;
        $sw92: while (true) {
            switch ($pc92) {
                case 8: {
                    th = $ex92;
                    if (DW == false) { $pc92 = 12; continue $sw92; }
                    abcd.wu.j6(th, 284245414879853875L, this, new java.lang.Integer(r5));
                    $pc92 = 12; continue $sw92;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc92 = 6; continue $sw92; }
                    try {
                        abcd.wu.j6(284245414879853875L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex92 = $t;
                        $pc92 = 8; continue $sw92;
                    }
                    $pc92 = 6; continue $sw92;
                }
                case 6: {
                    return this.J0.U2(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int ei(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex93 = null;
        int $pc93 = 4;
        $sw93: while (true) {
            switch ($pc93) {
                case 8: {
                    th = $ex93;
                    if (DW == false) { $pc93 = 12; continue $sw93; }
                    abcd.wu.j6(th, -45450274122156413L, this, new java.lang.Integer(r5));
                    $pc93 = 12; continue $sw93;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc93 = 6; continue $sw93; }
                    try {
                        abcd.wu.j6(-45450274122156413L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex93 = $t;
                        $pc93 = 8; continue $sw93;
                    }
                    $pc93 = 6; continue $sw93;
                }
                case 6: {
                    return this.J0.J8(this, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int er(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex94 = null;
        int $pc94 = 4;
        $sw94: while (true) {
            switch ($pc94) {
                case 8: {
                    th = $ex94;
                    if (DW == false) { $pc94 = 12; continue $sw94; }
                    abcd.wu.j6(th, 2269871905661785152L, this, new java.lang.Integer(r5));
                    $pc94 = 12; continue $sw94;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc94 = 6; continue $sw94; }
                    try {
                        abcd.wu.j6(2269871905661785152L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex94 = $t;
                        $pc94 = 8; continue $sw94;
                    }
                    $pc94 = 6; continue $sw94;
                }
                case 6: {
                    return this.gn[r5 + 1];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean g3(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex95 = null;
        int $pc95 = 4;
        $sw95: while (true) {
            switch ($pc95) {
                case 8: {
                    th = $ex95;
                    if (DW == false) { $pc95 = 12; continue $sw95; }
                    abcd.wu.j6(th, 4874395526381652888L, this, new java.lang.Integer(r5));
                    $pc95 = 12; continue $sw95;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc95 = 6; continue $sw95; }
                    try {
                        abcd.wu.j6(4874395526381652888L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex95 = $t;
                        $pc95 = 8; continue $sw95;
                    }
                    $pc95 = 6; continue $sw95;
                }
                case 6: {
                    return this.J0.j6(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int gW(int r6) {
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex96 = null;
        int $pc96 = 4;
        $sw96: while (true) {
            switch ($pc96) {
                case 16: {
                    th = $ex96;
                    if (DW == false) { $pc96 = 21; continue $sw96; }
                    abcd.wu.j6(th, 6185318794524381100L, this, new java.lang.Integer(r6));
                    $pc96 = 21; continue $sw96;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc96 = 6; continue $sw96; }
                    try {
                        abcd.wu.j6(6185318794524381100L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex96 = $t;
                        $pc96 = 16; continue $sw96;
                    }
                    $pc96 = 6; continue $sw96;
                }
                case 6: {
                    try {
                        r2 = er(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex96 = $t;
                        $pc96 = 16; continue $sw96;
                    }
                    r3 = 0;
                    $pc96 = 8; continue $sw96;
                }
                case 8: {
                    if (r3 >= (we(r2) - 1)) { $pc96 = 14; continue $sw96; }
                    if (Zo(r2, r3) == r6) { $pc96 = 11; continue $sw96; }
                    r3 = r3 + 1;
                    { $pc96 = 8; continue $sw96; }
                }
                case 11: {
                    return Zo(r2, r3 + 1);
                }
                case 14: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int gn(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex97 = null;
        int $pc97 = 4;
        $sw97: while (true) {
            switch ($pc97) {
                case 8: {
                    th = $ex97;
                    if (DW == false) { $pc97 = 12; continue $sw97; }
                    abcd.wu.j6(th, -3739975057095524380L, this, new java.lang.Integer(r5));
                    $pc97 = 12; continue $sw97;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc97 = 6; continue $sw97; }
                    try {
                        abcd.wu.j6(-3739975057095524380L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex97 = $t;
                        $pc97 = 8; continue $sw97;
                    }
                    $pc97 = 6; continue $sw97;
                }
                case 6: {
                    return XL(r5, 9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int gn(int r8, int r9) {
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex98 = null;
        int $pc98 = 3;
        $sw98: while (true) {
            switch ($pc98) {
                case 7: {
                    th = $ex98;
                    if (DW == false) { $pc98 = 11; continue $sw98; }
                    abcd.wu.j6(th, 827554396114709760L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc98 = 11; continue $sw98;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc98 = 5; continue $sw98; }
                    try {
                        abcd.wu.j6(827554396114709760L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex98 = $t;
                        $pc98 = 7; continue $sw98;
                    }
                    $pc98 = 5; continue $sw98;
                }
                case 5: {
                    try {
                        r6 = r9 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex98 = $t;
                        $pc98 = 7; continue $sw98;
                    }
                    return Hw(aM(), r8, r6, r8, r6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int gn(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex99 = null;
        int $pc99 = 3;
        $sw99: while (true) {
            switch ($pc99) {
                case 7: {
                    th = $ex99;
                    if (DW == false) { $pc99 = 11; continue $sw99; }
                    abcd.wu.j6(th, -805193992003998896L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc99 = 11; continue $sw99;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc99 = 5; continue $sw99; }
                    try {
                        abcd.wu.j6(-805193992003998896L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex99 = $t;
                        $pc99 = 7; continue $sw99;
                    }
                    $pc99 = 5; continue $sw99;
                }
                case 5: {
                    return Zo(aM(), r10, r11, r12, r13);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long gn() {
        abcd.InterfaceC1126oa r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex100 = null;
        int $pc100 = 4;
        $sw100: while (true) {
            switch ($pc100) {
                case 16: {
                    th = $ex100;
                    if (DW == false) { $pc100 = 20; continue $sw100; }
                    abcd.wu.j6(th, -3810314660696464437L, this);
                    $pc100 = 20; continue $sw100;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc100 = 7; continue $sw100; }
                    try {
                        abcd.wu.j6(-3810314660696464437L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex100 = $t;
                        $pc100 = 16; continue $sw100;
                    }
                    $pc100 = 7; continue $sw100;
                }
                case 7: {
                    if (this.Mr != (-1)) { $pc100 = 9; continue $sw100; }
                    try {
                        r2 = J8().VH();
                    } catch (java.lang.Throwable $t) {
                        $ex100 = $t;
                        $pc100 = 16; continue $sw100;
                    }
                    if (r2 != null) { $pc100 = 14; continue $sw100; }
                    return 0;
                }
                case 14: {
                    try {
                        this.Mr = r2.j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex100 = $t;
                        $pc100 = 16; continue $sw100;
                    }
                    return this.Mr;
                }
                case 9: {
                    return this.Mr;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j3(int r7) {
        int r2 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex101 = null;
        int $pc101 = 4;
        $sw101: while (true) {
            switch ($pc101) {
                case 16: {
                    th = $ex101;
                    if (DW == false) { $pc101 = 21; continue $sw101; }
                    abcd.wu.j6(th, -1736429567479659489L, this, new java.lang.Integer(r7));
                    $pc101 = 21; continue $sw101;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc101 = 6; continue $sw101; }
                    try {
                        abcd.wu.j6(-1736429567479659489L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex101 = $t;
                        $pc101 = 16; continue $sw101;
                    }
                    $pc101 = 6; continue $sw101;
                }
                case 6: {
                    try {
                        r2 = er(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex101 = $t;
                        $pc101 = 16; continue $sw101;
                    }
                    r4 = 1;
                    $pc101 = 8; continue $sw101;
                }
                case 8: {
                    if (r4 >= we(r2)) { $pc101 = 14; continue $sw101; }
                    if (Zo(r2, r4) == r7) { $pc101 = 11; continue $sw101; }
                    r4 = r4 + 1;
                    { $pc101 = 8; continue $sw101; }
                }
                case 11: {
                    return Zo(r2, r4 - 1);
                }
                case 14: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j3() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex102 = null;
        int $pc102 = 4;
        $sw102: while (true) {
            switch ($pc102) {
                case 12: {
                    th = $ex102;
                    if (DW == false) { $pc102 = 16; continue $sw102; }
                    abcd.wu.j6(th, -1799895917073369152L, this);
                    $pc102 = 16; continue $sw102;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc102 = 6; continue $sw102; }
                    try {
                        abcd.wu.j6(-1799895917073369152L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex102 = $t;
                        $pc102 = 12; continue $sw102;
                    }
                    $pc102 = 6; continue $sw102;
                }
                case 6: {
                    if (this.we != (-1)) { $pc102 = 10; continue $sw102; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r10, int r11, int r12, int r13) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex103 = null;
        int $pc103 = 3;
        $sw103: while (true) {
            switch ($pc103) {
                case 22: {
                    th = $ex103;
                    if (DW == false) { $pc103 = 27; continue $sw103; }
                    abcd.wu.j6(th, -3078254311063519419L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc103 = 27; continue $sw103;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc103 = 5; continue $sw103; }
                    try {
                        abcd.wu.j6(-3078254311063519419L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex103 = $t;
                        $pc103 = 22; continue $sw103;
                    }
                    $pc103 = 5; continue $sw103;
                }
                case 5: {
                    try {
                        r0 = DW(r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex103 = $t;
                        $pc103 = 22; continue $sw103;
                    }
                    if (r0 != (-1)) { $pc103 = 8; continue $sw103; }
                    return -1;
                }
                case 8: {
                    try {
                        r1 = we(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex103 = $t;
                        $pc103 = 22; continue $sw103;
                    }
                    r2 = 1;
                    $pc103 = 9; continue $sw103;
                }
                case 9: {
                    try {
                        r3 = r1 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex103 = $t;
                        $pc103 = 22; continue $sw103;
                    }
                    if (r2 >= r3) { $pc103 = 18; continue $sw103; }
                    try {
                        r4 = Zo(r0, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex103 = $t;
                        $pc103 = 22; continue $sw103;
                    }
                    if (FH(r4, r10, r11) == true) { $pc103 = 17; continue $sw103; }
                    if (j6(r4, r10, r11) == true) { $pc103 = 17; continue $sw103; }
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex103 = $t;
                        $pc103 = 22; continue $sw103;
                    }
                    $pc103 = 17; continue $sw103;
                }
                case 17: {
                    return r4;
                }
                case 18: {
                    if (r1 != 0) { $pc103 = 20; continue $sw103; }
                    return r0;
                }
                case 20: {
                    return Zo(r0, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r11, int r12, int r13, int r14, int r15) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex104 = null;
        int $pc104 = 3;
        $sw104: while (true) {
            switch ($pc104) {
                case 7: {
                    th = $ex104;
                    if (DW == false) { $pc104 = 11; continue $sw104; }
                    abcd.wu.j6(th, -305372515164087120L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc104 = 11; continue $sw104;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc104 = 5; continue $sw104; }
                    try {
                        abcd.wu.j6(-305372515164087120L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex104 = $t;
                        $pc104 = 7; continue $sw104;
                    }
                    $pc104 = 5; continue $sw104;
                }
                case 5: {
                    return j6(aM(), r11, r12, r13, r14, r15);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r11, boolean r12, int r13, int r14, int r15) {
        int r0 = 0;
        int r3 = 0;
        int[] r1 = null;
        int[] r2 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex105 = null;
        int $pc105 = 3;
        $sw105: while (true) {
            switch ($pc105) {
                case 14: {
                    th = $ex105;
                    if (DW == false) { $pc105 = 19; continue $sw105; }
                    abcd.wu.j6(th, -1634049399167125920L, this, new java.lang.Integer(r11), new java.lang.Boolean(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc105 = 19; continue $sw105;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc105 = 5; continue $sw105; }
                    try {
                        abcd.wu.j6(-1634049399167125920L, this, new java.lang.Integer(r11), new java.lang.Boolean(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex105 = $t;
                        $pc105 = 14; continue $sw105;
                    }
                    $pc105 = 5; continue $sw105;
                }
                case 5: {
                    try {
                        r0 = this.u7;
                        this.u7 += 5;
                    } catch (java.lang.Throwable $t) {
                        $ex105 = $t;
                        $pc105 = 14; continue $sw105;
                    }
                    $pc105 = 6; continue $sw105;
                }
                case 6: {
                    r3 = 0;
                    if (this.u7 < this.gn.length) { $pc105 = 9; continue $sw105; }
                    try {
                        r1 = new int[(this.gn.length * 2) + 1];
                        java.lang.System.arraycopy(this.gn, 0, r1, 0, this.gn.length);
                        this.gn = r1;
                    } catch (java.lang.Throwable $t) {
                        $ex105 = $t;
                        $pc105 = 14; continue $sw105;
                    }
                    { $pc105 = 6; continue $sw105; }
                }
                case 9: {
                    try {
                        r2 = this.gn;
                        r4 = r0 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex105 = $t;
                        $pc105 = 14; continue $sw105;
                    }
                    if (r12 == false) { $pc105 = 12; continue $sw105; }
                    r3 = 1048576;
                    $pc105 = 12; continue $sw105;
                }
                case 12: {
                    try {
                        r2[r0] = (r3 | r11) | 268435456;
                        r5 = r4 + 1;
                        r2[r4] = -1;
                        r6 = r5 + 1;
                        r2[r5] = -1;
                        r2[r6] = r13;
                        r2[r6 + 1] = r14;
                    } catch (java.lang.Throwable $t) {
                        $ex105 = $t;
                        $pc105 = 14; continue $sw105;
                    }
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r9, boolean r10, int r11, int r12, int r13, int r14) {
        int r2 = 0;
        int r0 = 0;
        int r4 = 0;
        int[] r5 = null;
        int[] r6 = null;
        int r1 = 0;
        int r15 = 0;
        int r3 = 0;
        int r16 = 0;
        int r17 = 0;
        java.lang.Throwable $ex106 = null;
        int $pc106 = -1;
        $sw106: while (true) {
            switch ($pc106) {
                case -1: {
                    r2 = 0;
                    if (j6 == false) { $pc106 = 5; continue $sw106; }
                    abcd.wu.j6(4433539346830450959L, this, new java.lang.Object[]{new java.lang.Integer(r9), new java.lang.Boolean(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14)});
                    $pc106 = 5; continue $sw106;
                }
                case 5: {
                    r0 = this.u7;
                    this.u7 = r0 + 8;
                    $pc106 = 6; continue $sw106;
                }
                case 6: {
                    r4 = this.u7;
                    r5 = this.gn;
                    if (r4 < r5.length) { $pc106 = 9; continue $sw106; }
                    r6 = new int[(r5.length * 2) + 1];
                    java.lang.System.arraycopy(r5, 0, r6, 0, r5.length);
                    this.gn = r6;
                    { $pc106 = 6; continue $sw106; }
                }
                case 9: {
                    r1 = r0 + 1;
                    if (r10 == false) { $pc106 = 12; continue $sw106; }
                    r2 = 1048576;
                    $pc106 = 12; continue $sw106;
                }
                case 12: {
                    r5[r0] = (r9 | r2) | 268435456;
                    r15 = r1 + 1;
                    r5[r1] = -1;
                    r3 = r15 + 1;
                    r5[r15] = -1;
                    r16 = r3 + 1;
                    r5[r3] = r11;
                    r17 = r16 + 1;
                    r5[r16] = r12;
                    r5[r17] = r13;
                    r5[r17 + 1] = r14;
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r9, boolean r10, int r11, int r12, int r13, int r14, int r15) {
        int r2 = 0;
        int r0 = 0;
        int r4 = 0;
        int[] r5 = null;
        int[] r6 = null;
        int r1 = 0;
        int r16 = 0;
        int r3 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        java.lang.Throwable $ex107 = null;
        int $pc107 = -1;
        $sw107: while (true) {
            switch ($pc107) {
                case -1: {
                    r2 = 0;
                    if (j6 == false) { $pc107 = 5; continue $sw107; }
                    abcd.wu.j6(-548402709039955012L, this, new java.lang.Object[]{new java.lang.Integer(r9), new java.lang.Boolean(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15)});
                    $pc107 = 5; continue $sw107;
                }
                case 5: {
                    r0 = this.u7;
                    this.u7 = r0 + 8;
                    $pc107 = 6; continue $sw107;
                }
                case 6: {
                    r4 = this.u7;
                    r5 = this.gn;
                    if (r4 < r5.length) { $pc107 = 9; continue $sw107; }
                    r6 = new int[(r5.length * 2) + 1];
                    java.lang.System.arraycopy(r5, 0, r6, 0, r5.length);
                    this.gn = r6;
                    { $pc107 = 6; continue $sw107; }
                }
                case 9: {
                    r1 = r0 + 1;
                    if (r10 == false) { $pc107 = 12; continue $sw107; }
                    r2 = 1048576;
                    $pc107 = 12; continue $sw107;
                }
                case 12: {
                    r5[r0] = (r9 | r2) | 268435456;
                    r16 = r1 + 1;
                    r5[r1] = -1;
                    r3 = r16 + 1;
                    r5[r16] = -1;
                    r17 = r3 + 1;
                    r5[r3] = r11;
                    r18 = r17 + 1;
                    r5[r17] = r12;
                    r19 = r18 + 1;
                    r5[r18] = r13;
                    r5[r19] = r14;
                    r5[r19 + 1] = r15;
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r17, boolean r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        int r9 = 0;
        int r11 = 0;
        int[] r13 = null;
        int[] r12 = null;
        int r10 = 0;
        int r14 = 0;
        int r1 = 0;
        int r15 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex108 = null;
        int $pc108 = -1;
        $sw108: while (true) {
            switch ($pc108) {
                case -1: {
                    if (j6 == false) { $pc108 = 5; continue $sw108; }
                    abcd.wu.j6(92527830019203757L, this, new java.lang.Object[]{new java.lang.Integer(r17), new java.lang.Boolean(r18), new java.lang.Integer(r19), new java.lang.Integer(r20), new java.lang.Integer(r21), new java.lang.Integer(r22), new java.lang.Integer(r23), new java.lang.Integer(r24)});
                    $pc108 = 5; continue $sw108;
                }
                case 5: {
                    r9 = this.u7;
                    this.u7 = r9 + 9;
                    $pc108 = 6; continue $sw108;
                }
                case 6: {
                    r11 = this.u7;
                    r13 = this.gn;
                    if (r11 < r13.length) { $pc108 = 9; continue $sw108; }
                    r12 = new int[(r13.length * 2) + 1];
                    java.lang.System.arraycopy(r13, 0, r12, 0, r13.length);
                    this.gn = r12;
                    { $pc108 = 6; continue $sw108; }
                }
                case 9: {
                    r10 = r9 + 1;
                    if (r18 == false) { $pc108 = 12; continue $sw108; }
                    r14 = 1048576;
                    $pc108 = 13; continue $sw108;
                }
                case 13: {
                    r13[r9] = (r17 | r14) | 268435456;
                    r1 = r10 + 1;
                    r13[r10] = -1;
                    r15 = r1 + 1;
                    r13[r1] = -1;
                    r2 = r15 + 1;
                    r13[r15] = r19;
                    r3 = r2 + 1;
                    r13[r2] = r20;
                    r4 = r3 + 1;
                    r13[r3] = r21;
                    r5 = r4 + 1;
                    r13[r4] = r22;
                    r13[r5] = r23;
                    r13[r5 + 1] = r24;
                    return r9;
                }
                case 12: {
                    r14 = 0;
                    { $pc108 = 13; continue $sw108; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r9, boolean r10, int[] r11, int r12, int r13, int r14, int r15) {
        int r2 = 0;
        int r0 = 0;
        int r4 = 0;
        int[] r5 = null;
        int[] r6 = null;
        int r1 = 0;
        int r16 = 0;
        int r17 = 0;
        int r3 = 0;
        int r18 = 0;
        java.lang.Throwable $ex109 = null;
        int $pc109 = -1;
        $sw109: while (true) {
            switch ($pc109) {
                case -1: {
                    r2 = 0;
                    if (j6 == false) { $pc109 = 5; continue $sw109; }
                    abcd.wu.j6(-1329560150282501528L, this, new java.lang.Object[]{new java.lang.Integer(r9), new java.lang.Boolean(r10), r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15)});
                    $pc109 = 5; continue $sw109;
                }
                case 5: {
                    r0 = this.u7;
                    if (r13 <= 0) { $pc109 = 8; continue $sw109; }
                    this.u7 = (r13 + 4) + r0;
                    $pc109 = 9; continue $sw109;
                }
                case 9: {
                    r4 = this.u7;
                    r5 = this.gn;
                    if (r4 < r5.length) { $pc109 = 12; continue $sw109; }
                    r6 = new int[(r5.length * 2) + 1];
                    java.lang.System.arraycopy(r5, 0, r6, 0, r5.length);
                    this.gn = r6;
                    { $pc109 = 9; continue $sw109; }
                }
                case 12: {
                    r1 = r0 + 1;
                    if (r10 == false) { $pc109 = 15; continue $sw109; }
                    r16 = 1048576;
                    $pc109 = 16; continue $sw109;
                }
                case 16: {
                    r5[r0] = r9 | r16;
                    r17 = r1 + 1;
                    r5[r1] = -1;
                    r3 = r17 + 1;
                    r5[r17] = -1;
                    r18 = r3 + 1;
                    r5[r3] = r13;
                    if (r13 <= 0) { $pc109 = 21; continue $sw109; }
                    java.lang.System.arraycopy(r11, r12, r5, r18, r13);
                    $pc109 = 19; continue $sw109;
                }
                case 19: {
                    if (r2 >= r13) { $pc109 = 22; continue $sw109; }
                    r5[r11[r12 + r2] + 1] = r0;
                    r2 = r2 + 1;
                    $pc109 = 22; continue $sw109;
                }
                case 22: {
                    return r0;
                }
                case 21: {
                    r5[r18] = r14;
                    r5[r18 + 1] = r15;
                    { $pc109 = 22; continue $sw109; }
                }
                case 15: {
                    r16 = 0;
                    { $pc109 = 16; continue $sw109; }
                }
                case 8: {
                    this.u7 = (r13 + 6) + r0;
                    { $pc109 = 9; continue $sw109; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r17, boolean r18, int[] r19, int r20, int r21, int r22, int r23, int r24) {
        int r9 = 0;
        int r11 = 0;
        int[] r13 = null;
        int[] r12 = null;
        int r15 = 0;
        int r10 = 0;
        int r14 = 0;
        int r1 = 0;
        int r16 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex110 = null;
        int $pc110 = -1;
        $sw110: while (true) {
            switch ($pc110) {
                case -1: {
                    if (j6 == false) { $pc110 = 5; continue $sw110; }
                    abcd.wu.j6(1130522489315424771L, this, new java.lang.Object[]{new java.lang.Integer(r17), new java.lang.Boolean(r18), r19, new java.lang.Integer(r20), new java.lang.Integer(r21), new java.lang.Integer(r22), new java.lang.Integer(r23), new java.lang.Integer(r24)});
                    $pc110 = 5; continue $sw110;
                }
                case 5: {
                    r9 = this.u7;
                    if (r21 <= 0) { $pc110 = 8; continue $sw110; }
                    this.u7 = (r21 + 5) + r9;
                    $pc110 = 9; continue $sw110;
                }
                case 9: {
                    r11 = this.u7;
                    r13 = this.gn;
                    if (r11 < r13.length) { $pc110 = 12; continue $sw110; }
                    r12 = new int[(r13.length * 2) + 1];
                    java.lang.System.arraycopy(r13, 0, r12, 0, r13.length);
                    this.gn = r12;
                    { $pc110 = 9; continue $sw110; }
                }
                case 12: {
                    r15 = 0;
                    r10 = r9 + 1;
                    if (r18 == false) { $pc110 = 15; continue $sw110; }
                    r14 = 1048576;
                    $pc110 = 16; continue $sw110;
                }
                case 16: {
                    r13[r9] = r17 | r14;
                    r1 = r10 + 1;
                    r13[r10] = -1;
                    r16 = r1 + 1;
                    r13[r1] = -1;
                    r2 = r16 + 1;
                    r13[r16] = r21;
                    if (r21 <= 0) { $pc110 = 22; continue $sw110; }
                    java.lang.System.arraycopy(r19, r20, r13, r2, r21);
                    $pc110 = 19; continue $sw110;
                }
                case 19: {
                    if (r15 >= r21) { $pc110 = 21; continue $sw110; }
                    r13[r19[r20 + r15] + 1] = r9;
                    r15 = r15 + 1;
                    { $pc110 = 19; continue $sw110; }
                }
                case 21: {
                    r3 = r2 + r21;
                    $pc110 = 23; continue $sw110;
                }
                case 23: {
                    r13[r3] = r24;
                    return r9;
                }
                case 22: {
                    r4 = r2 + 1;
                    r13[r2] = r22;
                    r3 = r4 + 1;
                    r13[r4] = r23;
                    { $pc110 = 23; continue $sw110; }
                }
                case 15: {
                    r14 = 0;
                    { $pc110 = 16; continue $sw110; }
                }
                case 8: {
                    this.u7 = (r21 + 7) + r9;
                    { $pc110 = 9; continue $sw110; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(char[] r9, int r10, int r11) {
        char[] r0 = null;
        int r1 = 0;
        char[] r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex111 = null;
        int $pc111 = 3;
        $sw111: while (true) {
            switch ($pc111) {
                case 10: {
                    th = $ex111;
                    if (DW == false) { $pc111 = 14; continue $sw111; }
                    abcd.wu.j6(th, 1593976699461289405L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc111 = 14; continue $sw111;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc111 = 6; continue $sw111; }
                    try {
                        abcd.wu.j6(1593976699461289405L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex111 = $t;
                        $pc111 = 10; continue $sw111;
                    }
                    $pc111 = 6; continue $sw111;
                }
                case 6: {
                    if (((this.VH + r11) + 1) < this.Zo.length) { $pc111 = 8; continue $sw111; }
                    try {
                        r0 = new char[java.lang.Math.max((this.Zo.length * 2) + 1, (this.VH + r11) + 1)];
                        java.lang.System.arraycopy(this.Zo, 0, r0, 0, this.Zo.length);
                        this.Zo = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex111 = $t;
                        $pc111 = 10; continue $sw111;
                    }
                    $pc111 = 8; continue $sw111;
                }
                case 8: {
                    try {
                        r1 = this.VH;
                        r2 = this.Zo;
                        r3 = this.VH;
                        this.VH = r3 + 1;
                        r2[r3] = (char) r11;
                        java.lang.System.arraycopy(r9, r10, this.Zo, this.VH, r11);
                        this.VH += r11;
                    } catch (java.lang.Throwable $t) {
                        $ex111 = $t;
                        $pc111 = 10; continue $sw111;
                    }
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex112 = null;
        int $pc112 = 4;
        $sw112: while (true) {
            switch ($pc112) {
                case 8: {
                    th = $ex112;
                    if (DW == false) { $pc112 = 12; continue $sw112; }
                    abcd.wu.j6(th, -870621613969580700L, this);
                    $pc112 = 12; continue $sw112;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc112 = 6; continue $sw112; }
                    try {
                        abcd.wu.j6(-870621613969580700L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex112 = $t;
                        $pc112 = 8; continue $sw112;
                    }
                    $pc112 = 6; continue $sw112;
                }
                case 6: {
                    try {
                        this.VH = 1;
                        this.u7 = 0;
                        this.we = -1;
                        this.XL = -1;
                        this.EQ = 0;
                        this.aM = -1;
                        this.j3 = -1;
                        this.Mr = -1;
                    } catch (java.lang.Throwable $t) {
                        $ex112 = $t;
                        $pc112 = 8; continue $sw112;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex113 = null;
        int $pc113 = 4;
        $sw113: while (true) {
            switch ($pc113) {
                case 8: {
                    th = $ex113;
                    if (DW == false) { $pc113 = 12; continue $sw113; }
                    abcd.wu.j6(th, -319625974371715809L, this, new java.lang.Integer(r5));
                    $pc113 = 12; continue $sw113;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc113 = 6; continue $sw113; }
                    try {
                        abcd.wu.j6(-319625974371715809L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex113 = $t;
                        $pc113 = 8; continue $sw113;
                    }
                    $pc113 = 6; continue $sw113;
                }
                case 6: {
                    try {
                        this.QX = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex113 = $t;
                        $pc113 = 8; continue $sw113;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r9, int r10, abcd.AbstractAa r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex114 = null;
        int $pc114 = 3;
        $sw114: while (true) {
            switch ($pc114) {
                case 7: {
                    th = $ex114;
                    if (DW == false) { $pc114 = 11; continue $sw114; }
                    abcd.wu.j6(th, -2456910180197216360L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
                    $pc114 = 11; continue $sw114;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc114 = 5; continue $sw114; }
                    try {
                        abcd.wu.j6(-2456910180197216360L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex114 = $t;
                        $pc114 = 7; continue $sw114;
                    }
                    $pc114 = 5; continue $sw114;
                }
                case 5: {
                    try {
                        J8(r9, 4, r10);
                        J8(r9, 5, this.v5.a8.Hw(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex114 = $t;
                        $pc114 = 7; continue $sw114;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, long r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex115 = null;
        int $pc115 = 3;
        $sw115: while (true) {
            switch ($pc115) {
                case 7: {
                    th = $ex115;
                    if (DW == false) { $pc115 = 11; continue $sw115; }
                    abcd.wu.j6(th, 518182250756189225L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    $pc115 = 11; continue $sw115;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc115 = 5; continue $sw115; }
                    try {
                        abcd.wu.j6(518182250756189225L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex115 = $t;
                        $pc115 = 7; continue $sw115;
                    }
                    $pc115 = 5; continue $sw115;
                }
                case 5: {
                    try {
                        J8(r8, 3, (int) r9);
                        J8(r8, 2, (int) (r9 >> 32));
                    } catch (java.lang.Throwable $t) {
                        $ex115 = $t;
                        $pc115 = 7; continue $sw115;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, abcd.Ya r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex116 = null;
        int $pc116 = 3;
        $sw116: while (true) {
            switch ($pc116) {
                case 7: {
                    th = $ex116;
                    if (DW == false) { $pc116 = 11; continue $sw116; }
                    abcd.wu.j6(th, -5563532518223335579L, this, new java.lang.Integer(r8), r9);
                    $pc116 = 11; continue $sw116;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc116 = 5; continue $sw116; }
                    try {
                        abcd.wu.j6(-5563532518223335579L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex116 = $t;
                        $pc116 = 7; continue $sw116;
                    }
                    $pc116 = 5; continue $sw116;
                }
                case 5: {
                    try {
                        J8(r8, 6, this.v5.a8.Hw(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex116 = $t;
                        $pc116 = 7; continue $sw116;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(long r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex117 = null;
        int $pc117 = 4;
        $sw117: while (true) {
            switch ($pc117) {
                case 8: {
                    th = $ex117;
                    if (DW == false) { $pc117 = 12; continue $sw117; }
                    abcd.wu.j6(th, 51213403119891051L, this, new java.lang.Long(r5));
                    $pc117 = 12; continue $sw117;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc117 = 6; continue $sw117; }
                    try {
                        abcd.wu.j6(51213403119891051L, this, new java.lang.Long(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex117 = $t;
                        $pc117 = 8; continue $sw117;
                    }
                    $pc117 = 6; continue $sw117;
                }
                case 6: {
                    try {
                        this.Ws = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex117 = $t;
                        $pc117 = 8; continue $sw117;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Da r8, abcd.Interfacena r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex118 = null;
        int $pc118 = 3;
        $sw118: while (true) {
            switch ($pc118) {
                case 7: {
                    th = $ex118;
                    if (DW == false) { $pc118 = 11; continue $sw118; }
                    abcd.wu.j6(th, -4574838189411099072L, this, r8, r9);
                    $pc118 = 11; continue $sw118;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc118 = 5; continue $sw118; }
                    try {
                        abcd.wu.j6(-4574838189411099072L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex118 = $t;
                        $pc118 = 7; continue $sw118;
                    }
                    $pc118 = 5; continue $sw118;
                }
                case 5: {
                    try {
                        this.J8 = r8;
                        this.a8 = r9;
                        this.J0 = r9.v5();
                    } catch (java.lang.Throwable $t) {
                        $ex118 = $t;
                        $pc118 = 7; continue $sw118;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Sa r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex119 = null;
        int $pc119 = 4;
        $sw119: while (true) {
            switch ($pc119) {
                case 17: {
                    th = $ex119;
                    if (DW == false) { $pc119 = 21; continue $sw119; }
                    abcd.wu.j6(th, -110129584258471239L, this, r7);
                    $pc119 = 21; continue $sw119;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc119 = 7; continue $sw119; }
                    try {
                        abcd.wu.j6(-110129584258471239L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex119 = $t;
                        $pc119 = 17; continue $sw119;
                    }
                    $pc119 = 7; continue $sw119;
                }
                case 7: {
                    if (r7.gn.length >= this.u7) { $pc119 = 9; continue $sw119; }
                    try {
                        r7.gn = new int[(this.u7 * 5) / 4];
                    } catch (java.lang.Throwable $t) {
                        $ex119 = $t;
                        $pc119 = 17; continue $sw119;
                    }
                    $pc119 = 9; continue $sw119;
                }
                case 9: {
                    try {
                        java.lang.System.arraycopy(this.gn, 0, r7.gn, 0, this.u7);
                    } catch (java.lang.Throwable $t) {
                        $ex119 = $t;
                        $pc119 = 17; continue $sw119;
                    }
                    if (r7.Zo.length > this.VH) { $pc119 = 12; continue $sw119; }
                    try {
                        r7.Zo = new char[(this.VH * 5) / 4];
                    } catch (java.lang.Throwable $t) {
                        $ex119 = $t;
                        $pc119 = 17; continue $sw119;
                    }
                    $pc119 = 12; continue $sw119;
                }
                case 12: {
                    try {
                        java.lang.System.arraycopy(this.Zo, 0, r7.Zo, 0, this.VH);
                        r7.VH = this.VH;
                        r7.u7 = this.u7;
                        r7.we = this.we;
                        r7.XL = this.XL;
                        r7.aM = this.aM;
                        r7.j3 = this.j3;
                        r7.Mr = this.Mr;
                        r7.J8 = this.J8;
                        r7.a8 = this.a8;
                        r7.J0 = this.J0;
                        r7.Ws = this.Ws;
                        r7.EQ = 0;
                        r7.U2 = this.U2;
                        r7.EQ = this.EQ;
                    } catch (java.lang.Throwable $t) {
                        $ex119 = $t;
                        $pc119 = 17; continue $sw119;
                    }
                    if (r7.tp.length > this.EQ) { $pc119 = 15; continue $sw119; }
                    try {
                        r7.tp = new int[(this.EQ * 5) / 4];
                    } catch (java.lang.Throwable $t) {
                        $ex119 = $t;
                        $pc119 = 17; continue $sw119;
                    }
                    $pc119 = 15; continue $sw119;
                }
                case 15: {
                    try {
                        java.lang.System.arraycopy(this.tp, 0, r7.tp, 0, this.EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex119 = $t;
                        $pc119 = 17; continue $sw119;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Wa r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex120 = null;
        int $pc120 = 4;
        $sw120: while (true) {
            switch ($pc120) {
                case 11: {
                    th = $ex120;
                    if (DW == false) { $pc120 = 15; continue $sw120; }
                    abcd.wu.j6(th, 8017453186970565296L, this, r7);
                    $pc120 = 15; continue $sw120;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc120 = 6; continue $sw120; }
                    try {
                        abcd.wu.j6(8017453186970565296L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex120 = $t;
                        $pc120 = 11; continue $sw120;
                    }
                    $pc120 = 6; continue $sw120;
                }
                case 6: {
                    try {
                        this.VH = r7.tp;
                    } catch (java.lang.Throwable $t) {
                        $ex120 = $t;
                        $pc120 = 11; continue $sw120;
                    }
                    if (this.Zo.length > this.VH) { $pc120 = 9; continue $sw120; }
                    try {
                        this.Zo = new char[(this.VH * 5) / 4];
                    } catch (java.lang.Throwable $t) {
                        $ex120 = $t;
                        $pc120 = 11; continue $sw120;
                    }
                    $pc120 = 9; continue $sw120;
                }
                case 9: {
                    try {
                        java.lang.System.arraycopy(r7.u7, 0, this.Zo, 0, this.VH);
                    } catch (java.lang.Throwable $t) {
                        $ex120 = $t;
                        $pc120 = 11; continue $sw120;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r11, int r12) {
        int r0 = 0;
        char[] r1 = null;
        int r3 = 0;
        int r4 = 0;
        char[] r5 = null;
        int r6 = 0;
        int r7 = 0;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex121 = null;
        int $pc121 = 3;
        $sw121: while (true) {
            switch ($pc121) {
                case 35: {
                    th = $ex121;
                    if (DW == false) { $pc121 = 40; continue $sw121; }
                    abcd.wu.j6(th, 390655094783402495L, this, new java.lang.Integer(r11), new java.lang.Integer(r12));
                    $pc121 = 40; continue $sw121;
                }
                case 40: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc121 = 6; continue $sw121; }
                    try {
                        abcd.wu.j6(390655094783402495L, this, new java.lang.Integer(r11), new java.lang.Integer(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex121 = $t;
                        $pc121 = 35; continue $sw121;
                    }
                    $pc121 = 6; continue $sw121;
                }
                case 6: {
                    if (P8(r11) == P8(r12)) { $pc121 = 8; continue $sw121; }
                    return false;
                }
                case 8: {
                    try {
                        r0 = we(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex121 = $t;
                        $pc121 = 35; continue $sw121;
                    }
                    if (r0 == we(r12)) { $pc121 = 12; continue $sw121; }
                    return false;
                }
                case 12: {
                    if (this.J0.u7(P8(r11)) == false) { $pc121 = 17; continue $sw121; }
                    if (XL(r11) == XL(r12)) { $pc121 = 17; continue $sw121; }
                    return false;
                }
                case 17: {
                    if (this.J0.Zo(P8(r11)) == false) { $pc121 = 27; continue $sw121; }
                    try {
                        r1 = Mr(r11);
                        r3 = a8(r11);
                        r4 = U2(r11);
                        r5 = Mr(r12);
                        r6 = a8(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex121 = $t;
                        $pc121 = 35; continue $sw121;
                    }
                    if (r4 == U2(r12)) { $pc121 = 21; continue $sw121; }
                    return false;
                }
                case 21: {
                    r7 = 0;
                    $pc121 = 22; continue $sw121;
                }
                case 22: {
                    if (r7 >= r4) { $pc121 = 27; continue $sw121; }
                    if (r1[r3 + r7] != r5[r6 + r7]) { $pc121 = 25; continue $sw121; }
                    try {
                        r7 = r7 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex121 = $t;
                        $pc121 = 35; continue $sw121;
                    }
                    { $pc121 = 22; continue $sw121; }
                }
                case 25: {
                    return false;
                }
                case 27: {
                    r2 = 0;
                    $pc121 = 28; continue $sw121;
                }
                case 28: {
                    if (r2 >= r0) { $pc121 = 33; continue $sw121; }
                    if (j6(Zo(r11, r2), Zo(r12, r2)) == false) { $pc121 = 31; continue $sw121; }
                    r2 = r2 + 1;
                    { $pc121 = 28; continue $sw121; }
                }
                case 31: {
                    return false;
                }
                case 33: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex122 = null;
        int $pc122 = 3;
        $sw122: while (true) {
            switch ($pc122) {
                case 15: {
                    th = $ex122;
                    if (DW == false) { $pc122 = 19; continue $sw122; }
                    abcd.wu.j6(th, 14123380365479255L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc122 = 19; continue $sw122;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc122 = 6; continue $sw122; }
                    try {
                        abcd.wu.j6(14123380365479255L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex122 = $t;
                        $pc122 = 15; continue $sw122;
                    }
                    $pc122 = 6; continue $sw122;
                }
                case 6: {
                    if (r10 <= vy(r9)) { $pc122 = 9; continue $sw122; }
                    return false;
                }
                case 9: {
                    if (r10 >= vy(r9)) { $pc122 = 11; continue $sw122; }
                    return true;
                }
                case 11: {
                    if (BT(r9) <= r11) { $pc122 = 14; continue $sw122; }
                    return true;
                }
                case 14: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean jJ(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex123 = null;
        int $pc123 = 4;
        $sw123: while (true) {
            switch ($pc123) {
                case 12: {
                    th = $ex123;
                    if (DW == false) { $pc123 = 16; continue $sw123; }
                    abcd.wu.j6(th, 2291522638343345505L, this, new java.lang.Integer(r5));
                    $pc123 = 16; continue $sw123;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc123 = 6; continue $sw123; }
                    try {
                        abcd.wu.j6(2291522638343345505L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex123 = $t;
                        $pc123 = 12; continue $sw123;
                    }
                    $pc123 = 6; continue $sw123;
                }
                case 6: {
                    if ((this.gn[r5] & 268435456) == 0) { $pc123 = 10; continue $sw123; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean kQ(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex124 = null;
        int $pc124 = 4;
        $sw124: while (true) {
            switch ($pc124) {
                case 8: {
                    th = $ex124;
                    if (DW == false) { $pc124 = 12; continue $sw124; }
                    abcd.wu.j6(th, 3248521486034431915L, this, new java.lang.Integer(r5));
                    $pc124 = 12; continue $sw124;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc124 = 6; continue $sw124; }
                    try {
                        abcd.wu.j6(3248521486034431915L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex124 = $t;
                        $pc124 = 8; continue $sw124;
                    }
                    $pc124 = 6; continue $sw124;
                }
                case 6: {
                    return this.J0.tp(this, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String lg(int r8) {
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex125 = null;
        int $pc125 = 4;
        $sw125: while (true) {
            switch ($pc125) {
                case 8: {
                    th = $ex125;
                    if (DW == false) { $pc125 = 12; continue $sw125; }
                    abcd.wu.j6(th, 5505768138436738336L, this, new java.lang.Integer(r8));
                    $pc125 = 12; continue $sw125;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc125 = 6; continue $sw125; }
                    try {
                        abcd.wu.j6(5505768138436738336L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex125 = $t;
                        $pc125 = 8; continue $sw125;
                    }
                    $pc125 = 6; continue $sw125;
                }
                case 6: {
                    try {
                        r2 = this.gn[r8 + 3];
                    } catch (java.lang.Throwable $t) {
                        $ex125 = $t;
                        $pc125 = 8; continue $sw125;
                    }
                    return new java.lang.String(this.Zo, r2 + 1, this.Zo[r2]);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean lp(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex126 = null;
        int $pc126 = 4;
        $sw126: while (true) {
            switch ($pc126) {
                case 8: {
                    th = $ex126;
                    if (DW == false) { $pc126 = 12; continue $sw126; }
                    abcd.wu.j6(th, -1181742728599761021L, this, new java.lang.Integer(r5));
                    $pc126 = 12; continue $sw126;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc126 = 6; continue $sw126; }
                    try {
                        abcd.wu.j6(-1181742728599761021L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex126 = $t;
                        $pc126 = 8; continue $sw126;
                    }
                    $pc126 = 6; continue $sw126;
                }
                case 6: {
                    return this.J0.XL(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean nw(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex127 = null;
        int $pc127 = 4;
        $sw127: while (true) {
            switch ($pc127) {
                case 12: {
                    th = $ex127;
                    if (DW == false) { $pc127 = 16; continue $sw127; }
                    abcd.wu.j6(th, 1707151156610599200L, this, new java.lang.Integer(r5));
                    $pc127 = 16; continue $sw127;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc127 = 6; continue $sw127; }
                    try {
                        abcd.wu.j6(1707151156610599200L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex127 = $t;
                        $pc127 = 12; continue $sw127;
                    }
                    $pc127 = 6; continue $sw127;
                }
                case 6: {
                    if (XL(r5, 8) == (-1)) { $pc127 = 10; continue $sw127; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int rN(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex128 = null;
        int $pc128 = 4;
        $sw128: while (true) {
            switch ($pc128) {
                case 8: {
                    th = $ex128;
                    if (DW == false) { $pc128 = 12; continue $sw128; }
                    abcd.wu.j6(th, -110624207094939480L, this, new java.lang.Integer(r5));
                    $pc128 = 12; continue $sw128;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc128 = 6; continue $sw128; }
                    try {
                        abcd.wu.j6(-110624207094939480L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex128 = $t;
                        $pc128 = 8; continue $sw128;
                    }
                    $pc128 = 6; continue $sw128;
                }
                case 6: {
                    return j3(aM(), r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean ro(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex129 = null;
        int $pc129 = 4;
        $sw129: while (true) {
            switch ($pc129) {
                case 15: {
                    th = $ex129;
                    if (DW == false) { $pc129 = 19; continue $sw129; }
                    abcd.wu.j6(th, 1829168262871407207L, this, new java.lang.Integer(r5));
                    $pc129 = 19; continue $sw129;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc129 = 7; continue $sw129; }
                    try {
                        abcd.wu.j6(1829168262871407207L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex129 = $t;
                        $pc129 = 15; continue $sw129;
                    }
                    $pc129 = 7; continue $sw129;
                }
                case 7: {
                    if (this.J0.v5(P8(r5)) == true) { $pc129 = 9; continue $sw129; }
                    return false;
                }
                case 9: {
                    if (XL(r5, 1) != (-1)) { $pc129 = 22; continue $sw129; }
                    return false;
                }
                case 22: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean sG(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex130 = null;
        int $pc130 = 4;
        $sw130: while (true) {
            switch ($pc130) {
                case 8: {
                    th = $ex130;
                    if (DW == false) { $pc130 = 12; continue $sw130; }
                    abcd.wu.j6(th, -1297826729805963264L, this, new java.lang.Integer(r5));
                    $pc130 = 12; continue $sw130;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc130 = 6; continue $sw130; }
                    try {
                        abcd.wu.j6(-1297826729805963264L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex130 = $t;
                        $pc130 = 8; continue $sw130;
                    }
                    $pc130 = 6; continue $sw130;
                }
                case 6: {
                    return this.J0.u7(this, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean sh(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex131 = null;
        int $pc131 = 4;
        $sw131: while (true) {
            switch ($pc131) {
                case 10: {
                    th = $ex131;
                    if (DW == false) { $pc131 = 14; continue $sw131; }
                    abcd.wu.j6(th, -3520067495481528057L, this, new java.lang.Integer(r5));
                    $pc131 = 14; continue $sw131;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc131 = 6; continue $sw131; }
                    try {
                        abcd.wu.j6(-3520067495481528057L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex131 = $t;
                        $pc131 = 10; continue $sw131;
                    }
                    $pc131 = 6; continue $sw131;
                }
                case 6: {
                    if (Zo(er(r5), 0) == r5) { $pc131 = 17; continue $sw131; }
                    return true;
                }
                case 17: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean sy(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex132 = null;
        int $pc132 = 4;
        $sw132: while (true) {
            switch ($pc132) {
                case 8: {
                    th = $ex132;
                    if (DW == false) { $pc132 = 12; continue $sw132; }
                    abcd.wu.j6(th, -4717938278844320225L, this, new java.lang.Integer(r5));
                    $pc132 = 12; continue $sw132;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc132 = 6; continue $sw132; }
                    try {
                        abcd.wu.j6(-4717938278844320225L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex132 = $t;
                        $pc132 = 8; continue $sw132;
                    }
                    $pc132 = 6; continue $sw132;
                }
                case 6: {
                    return this.J0.u7(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex133 = null;
        int $pc133 = 4;
        $sw133: while (true) {
            switch ($pc133) {
                case 12: {
                    th = $ex133;
                    if (DW == false) { $pc133 = 16; continue $sw133; }
                    abcd.wu.j6(th, -190379137432152693L, this);
                    $pc133 = 16; continue $sw133;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc133 = 7; continue $sw133; }
                    try {
                        abcd.wu.j6(-190379137432152693L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex133 = $t;
                        $pc133 = 12; continue $sw133;
                    }
                    $pc133 = 7; continue $sw133;
                }
                case 7: {
                    if (j3() == false) { $pc133 = 10; continue $sw133; }
                    return "\n";
                }
                case 10: {
                    try {
                        r2 = new java.lang.StringBuffer();
                        j6(r2, "", new abcd.Ta(), aM());
                    } catch (java.lang.Throwable $t) {
                        $ex133 = $t;
                        $pc133 = 12; continue $sw133;
                    }
                    return r2.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex134 = null;
        int $pc134 = 4;
        $sw134: while (true) {
            switch ($pc134) {
                case 8: {
                    th = $ex134;
                    if (DW == false) { $pc134 = 12; continue $sw134; }
                    abcd.wu.j6(th, -1085929393558596765L, this);
                    $pc134 = 12; continue $sw134;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc134 = 6; continue $sw134; }
                    try {
                        abcd.wu.j6(-1085929393558596765L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex134 = $t;
                        $pc134 = 8; continue $sw134;
                    }
                    $pc134 = 6; continue $sw134;
                }
                case 6: {
                    return this.J0.DW(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int tp(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex135 = null;
        int $pc135 = 3;
        $sw135: while (true) {
            switch ($pc135) {
                case 7: {
                    th = $ex135;
                    if (DW == false) { $pc135 = 11; continue $sw135; }
                    abcd.wu.j6(th, 1161503709944033520L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc135 = 11; continue $sw135;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc135 = 5; continue $sw135; }
                    try {
                        abcd.wu.j6(1161503709944033520L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex135 = $t;
                        $pc135 = 7; continue $sw135;
                    }
                    $pc135 = 5; continue $sw135;
                }
                case 5: {
                    return gn(aM(), r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int tp(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex136 = null;
        int $pc136 = 3;
        $sw136: while (true) {
            switch ($pc136) {
                case 7: {
                    th = $ex136;
                    if (DW == false) { $pc136 = 11; continue $sw136; }
                    abcd.wu.j6(th, 4055930834682546675L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc136 = 11; continue $sw136;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc136 = 5; continue $sw136; }
                    try {
                        abcd.wu.j6(4055930834682546675L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex136 = $t;
                        $pc136 = 7; continue $sw136;
                    }
                    $pc136 = 5; continue $sw136;
                }
                case 5: {
                    return u7(aM(), r10, r11, r12, r13);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long tp(int r7) {
        long r2 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex137 = null;
        int $pc137 = 4;
        $sw137: while (true) {
            switch ($pc137) {
                case 9: {
                    th = $ex137;
                    if (DW == false) { $pc137 = 13; continue $sw137; }
                    abcd.wu.j6(th, -3095116799952671808L, this, new java.lang.Integer(r7));
                    $pc137 = 13; continue $sw137;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc137 = 6; continue $sw137; }
                    try {
                        abcd.wu.j6(-3095116799952671808L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex137 = $t;
                        $pc137 = 9; continue $sw137;
                    }
                    $pc137 = 6; continue $sw137;
                }
                case 6: {
                    try {
                        r2 = ((long) XL(r7, 2)) << 32;
                    } catch (java.lang.Throwable $t) {
                        $ex137 = $t;
                        $pc137 = 9; continue $sw137;
                    }
                    return r2 + (((long) XL(r7, 3)) & 4294967295L);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex138 = null;
        int $pc138 = 4;
        $sw138: while (true) {
            switch ($pc138) {
                case 8: {
                    th = $ex138;
                    if (DW == false) { $pc138 = 12; continue $sw138; }
                    abcd.wu.j6(th, 4756701280858756487L, this);
                    $pc138 = 12; continue $sw138;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc138 = 6; continue $sw138; }
                    try {
                        abcd.wu.j6(4756701280858756487L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex138 = $t;
                        $pc138 = 8; continue $sw138;
                    }
                    $pc138 = 6; continue $sw138;
                }
                case 6: {
                    return this.J0.Hw(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int u7(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex139 = null;
        int $pc139 = 3;
        $sw139: while (true) {
            switch ($pc139) {
                case 7: {
                    th = $ex139;
                    if (DW == false) { $pc139 = 11; continue $sw139; }
                    abcd.wu.j6(th, 139503057843655233L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc139 = 11; continue $sw139;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc139 = 5; continue $sw139; }
                    try {
                        abcd.wu.j6(139503057843655233L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex139 = $t;
                        $pc139 = 7; continue $sw139;
                    }
                    $pc139 = 5; continue $sw139;
                }
                case 5: {
                    return VH(aM(), r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int u7(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex140 = null;
        int $pc140 = 3;
        $sw140: while (true) {
            switch ($pc140) {
                case 7: {
                    th = $ex140;
                    if (DW == false) { $pc140 = 11; continue $sw140; }
                    abcd.wu.j6(th, 1636641040684233220L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc140 = 11; continue $sw140;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc140 = 5; continue $sw140; }
                    try {
                        abcd.wu.j6(1636641040684233220L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex140 = $t;
                        $pc140 = 7; continue $sw140;
                    }
                    $pc140 = 5; continue $sw140;
                }
                case 5: {
                    return gn(aM(), r10, r11, r12, r13);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Ya u7(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex141 = null;
        int $pc141 = 4;
        $sw141: while (true) {
            switch ($pc141) {
                case 8: {
                    th = $ex141;
                    if (DW == false) { $pc141 = 12; continue $sw141; }
                    abcd.wu.j6(th, 2309857363351115695L, this, new java.lang.Integer(r5));
                    $pc141 = 12; continue $sw141;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc141 = 6; continue $sw141; }
                    try {
                        abcd.wu.j6(2309857363351115695L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex141 = $t;
                        $pc141 = 8; continue $sw141;
                    }
                    $pc141 = 6; continue $sw141;
                }
                case 6: {
                    return (abcd.Ya) this.v5.a8.FH(XL(r5, 1));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int v5(int r8, int r9) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex142 = null;
        int $pc142 = 3;
        $sw142: while (true) {
            switch ($pc142) {
                case 11: {
                    th = $ex142;
                    if (DW == false) { $pc142 = 15; continue $sw142; }
                    abcd.wu.j6(th, -523683655768857708L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc142 = 15; continue $sw142;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc142 = 5; continue $sw142; }
                    try {
                        abcd.wu.j6(-523683655768857708L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex142 = $t;
                        $pc142 = 11; continue $sw142;
                    }
                    $pc142 = 5; continue $sw142;
                }
                case 5: {
                    try {
                        r0 = Zo(aM(), r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex142 = $t;
                        $pc142 = 11; continue $sw142;
                    }
                    if (r0 == (-1)) { $pc142 = 10; continue $sw142; }
                    if (this.J0.rN(P8(r0)) == false) { $pc142 = 10; continue $sw142; }
                    return -1;
                }
                case 10: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int v5(int r10, int r11, int r12, int r13) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex143 = null;
        int $pc143 = 3;
        $sw143: while (true) {
            switch ($pc143) {
                case 15: {
                    th = $ex143;
                    if (DW == false) { $pc143 = 20; continue $sw143; }
                    abcd.wu.j6(th, -1845339995254673304L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc143 = 20; continue $sw143;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc143 = 5; continue $sw143; }
                    try {
                        abcd.wu.j6(-1845339995254673304L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex143 = $t;
                        $pc143 = 15; continue $sw143;
                    }
                    $pc143 = 5; continue $sw143;
                }
                case 5: {
                    try {
                        r0 = VH(aM(), r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex143 = $t;
                        $pc143 = 15; continue $sw143;
                    }
                    if (r0 == (-1)) { $pc143 = 14; continue $sw143; }
                    $pc143 = 7; continue $sw143;
                }
                case 7: {
                    if (r0 == aM()) { $pc143 = 14; continue $sw143; }
                    if (this.J0.rN(P8(r0)) == true) { $pc143 = 11; continue $sw143; }
                    try {
                        r0 = er(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex143 = $t;
                        $pc143 = 15; continue $sw143;
                    }
                    { $pc143 = 7; continue $sw143; }
                }
                case 11: {
                    return r0;
                }
                case 14: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex144 = null;
        int $pc144 = 4;
        $sw144: while (true) {
            switch ($pc144) {
                case 8: {
                    th = $ex144;
                    if (DW == false) { $pc144 = 12; continue $sw144; }
                    abcd.wu.j6(th, -1757018842426264992L, this);
                    $pc144 = 12; continue $sw144;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc144 = 6; continue $sw144; }
                    try {
                        abcd.wu.j6(-1757018842426264992L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex144 = $t;
                        $pc144 = 8; continue $sw144;
                    }
                    $pc144 = 6; continue $sw144;
                }
                case 6: {
                    return this.Ws;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractAa v5(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex145 = null;
        int $pc145 = 4;
        $sw145: while (true) {
            switch ($pc145) {
                case 8: {
                    th = $ex145;
                    if (DW == false) { $pc145 = 12; continue $sw145; }
                    abcd.wu.j6(th, -438492623558725053L, this, new java.lang.Integer(r5));
                    $pc145 = 12; continue $sw145;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc145 = 6; continue $sw145; }
                    try {
                        abcd.wu.j6(-438492623558725053L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex145 = $t;
                        $pc145 = 8; continue $sw145;
                    }
                    $pc145 = 6; continue $sw145;
                }
                case 6: {
                    return this.v5.a8.FH(XL(r5, 5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5(int r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex146 = null;
        int $pc146 = 3;
        $sw146: while (true) {
            switch ($pc146) {
                case 7: {
                    th = $ex146;
                    if (DW == false) { $pc146 = 11; continue $sw146; }
                    abcd.wu.j6(th, -2735566267874905788L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc146 = 11; continue $sw146;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc146 = 5; continue $sw146; }
                    try {
                        abcd.wu.j6(-2735566267874905788L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex146 = $t;
                        $pc146 = 7; continue $sw146;
                    }
                    $pc146 = 5; continue $sw146;
                }
                case 5: {
                    try {
                        J8(r9, 4, r10);
                        J8(r9, 5, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex146 = $t;
                        $pc146 = 7; continue $sw146;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean vJ(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex147 = null;
        int $pc147 = 4;
        $sw147: while (true) {
            switch ($pc147) {
                case 8: {
                    th = $ex147;
                    if (DW == false) { $pc147 = 12; continue $sw147; }
                    abcd.wu.j6(th, 19743024220849832L, this, new java.lang.Integer(r5));
                    $pc147 = 12; continue $sw147;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc147 = 6; continue $sw147; }
                    try {
                        abcd.wu.j6(19743024220849832L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex147 = $t;
                        $pc147 = 8; continue $sw147;
                    }
                    $pc147 = 6; continue $sw147;
                }
                case 6: {
                    return this.J0.Hw(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int vy(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex148 = null;
        int $pc148 = 4;
        $sw148: while (true) {
            switch ($pc148) {
                case 28: {
                    th = $ex148;
                    if (DW == false) { $pc148 = 32; continue $sw148; }
                    abcd.wu.j6(th, 2743300132563769236L, this, new java.lang.Integer(r5));
                    $pc148 = 32; continue $sw148;
                }
                case 32: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc148 = 7; continue $sw148; }
                    try {
                        abcd.wu.j6(2743300132563769236L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex148 = $t;
                        $pc148 = 28; continue $sw148;
                    }
                    $pc148 = 7; continue $sw148;
                }
                case 7: {
                    if (jJ(r5) == true) { $pc148 = 15; continue $sw148; }
                    if (we(r5) != 0) { $pc148 = 13; continue $sw148; }
                    return this.gn[r5 + 4];
                }
                case 13: {
                    return vy(Zo(r5, 0));
                }
                case 15: {
                    if (aj(r5) == false) { $pc148 = 19; continue $sw148; }
                    return this.gn[r5 + 4];
                }
                case 19: {
                    if (sy(r5) == false) { $pc148 = 23; continue $sw148; }
                    return this.gn[r5 + 4];
                }
                case 23: {
                    if (wc(r5) == false) { $pc148 = 27; continue $sw148; }
                    return this.gn[r5 + 3];
                }
                case 27: {
                    return this.gn[r5 + 3];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean wc(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex149 = null;
        int $pc149 = 4;
        $sw149: while (true) {
            switch ($pc149) {
                case 8: {
                    th = $ex149;
                    if (DW == false) { $pc149 = 12; continue $sw149; }
                    abcd.wu.j6(th, 6894015580425709176L, this, new java.lang.Integer(r5));
                    $pc149 = 12; continue $sw149;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc149 = 6; continue $sw149; }
                    try {
                        abcd.wu.j6(6894015580425709176L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex149 = $t;
                        $pc149 = 8; continue $sw149;
                    }
                    $pc149 = 6; continue $sw149;
                }
                case 6: {
                    return this.J0.we(P8(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int we() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex150 = null;
        int $pc150 = 4;
        $sw150: while (true) {
            switch ($pc150) {
                case 8: {
                    th = $ex150;
                    if (DW == false) { $pc150 = 12; continue $sw150; }
                    abcd.wu.j6(th, -2391785489392344500L, this);
                    $pc150 = 12; continue $sw150;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc150 = 6; continue $sw150; }
                    try {
                        abcd.wu.j6(-2391785489392344500L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex150 = $t;
                        $pc150 = 8; continue $sw150;
                    }
                    $pc150 = 6; continue $sw150;
                }
                case 6: {
                    return this.J0.FH(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int we(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex151 = null;
        int $pc151 = 4;
        $sw151: while (true) {
            switch ($pc151) {
                case 12: {
                    th = $ex151;
                    if (DW == false) { $pc151 = 16; continue $sw151; }
                    abcd.wu.j6(th, 2539271698958058279L, this, new java.lang.Integer(r5));
                    $pc151 = 16; continue $sw151;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc151 = 7; continue $sw151; }
                    try {
                        abcd.wu.j6(2539271698958058279L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex151 = $t;
                        $pc151 = 12; continue $sw151;
                    }
                    $pc151 = 7; continue $sw151;
                }
                case 7: {
                    if ((this.gn[r5] & 268435456) == 0) { $pc151 = 10; continue $sw151; }
                    return 0;
                }
                case 10: {
                    return this.gn[r5 + 3];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int we(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex152 = null;
        int $pc152 = 3;
        $sw152: while (true) {
            switch ($pc152) {
                case 7: {
                    th = $ex152;
                    if (DW == false) { $pc152 = 11; continue $sw152; }
                    abcd.wu.j6(th, -443862020206281600L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc152 = 11; continue $sw152;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc152 = 5; continue $sw152; }
                    try {
                        abcd.wu.j6(-443862020206281600L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex152 = $t;
                        $pc152 = 7; continue $sw152;
                    }
                    $pc152 = 5; continue $sw152;
                }
                case 5: {
                    return tp(aM(), r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean x9(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex153 = null;
        int $pc153 = 4;
        $sw153: while (true) {
            switch ($pc153) {
                case 8: {
                    th = $ex153;
                    if (DW == false) { $pc153 = 12; continue $sw153; }
                    abcd.wu.j6(th, 5840223329168666781L, this, new java.lang.Integer(r5));
                    $pc153 = 12; continue $sw153;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc153 = 6; continue $sw153; }
                    try {
                        abcd.wu.j6(5840223329168666781L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex153 = $t;
                        $pc153 = 8; continue $sw153;
                    }
                    $pc153 = 6; continue $sw153;
                }
                case 6: {
                    return this.J0.Ws(this, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean yO(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex154 = null;
        int $pc154 = 4;
        $sw154: while (true) {
            switch ($pc154) {
                case 9: {
                    th = $ex154;
                    if (DW == false) { $pc154 = 13; continue $sw154; }
                    abcd.wu.j6(th, 5554543451613439056L, this, new java.lang.Integer(r5));
                    $pc154 = 13; continue $sw154;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc154 = 6; continue $sw154; }
                    try {
                        abcd.wu.j6(5554543451613439056L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex154 = $t;
                        $pc154 = 9; continue $sw154;
                    }
                    $pc154 = 6; continue $sw154;
                }
                case 6: {
                    return !sG(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int yS(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex155 = null;
        int $pc155 = 4;
        $sw155: while (true) {
            switch ($pc155) {
                case 8: {
                    th = $ex155;
                    if (DW == false) { $pc155 = 12; continue $sw155; }
                    abcd.wu.j6(th, 3519731362693859255L, this, new java.lang.Integer(r5));
                    $pc155 = 12; continue $sw155;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc155 = 6; continue $sw155; }
                    try {
                        abcd.wu.j6(3519731362693859255L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex155 = $t;
                        $pc155 = 8; continue $sw155;
                    }
                    $pc155 = 6; continue $sw155;
                }
                case 6: {
                    return this.J0.QX(this, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
