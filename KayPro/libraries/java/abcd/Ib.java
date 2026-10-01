package abcd;

@abcd.Interfacexu
public class Ib {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 41347381820705317L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = -2594694057391598385L)
    private int[] EQ;

    @abcd.Interfaceru(field = 2558317741010154933L)
    private int[] Hw;

    @abcd.Interfaceru(field = -2599006275127982181L)
    private int[] VH;

    @abcd.Interfaceru(field = 2408824838078374560L)
    private int[] Zo;

    @abcd.Interfaceru(field = 1401348054059239888L)
    private int gn;

    @abcd.Interfaceru(field = 3082726183384112697L)
    private int tp;

    @abcd.Interfaceru(field = 747565675296007008L)
    private int u7;

    @abcd.Interfaceru(field = -1740943664598758720L)
    private int v5;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.Ib.class, 30717209212082835L, 30717209212082835L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (DW == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-2125784050070869956L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (FH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -2125784050070869956L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Ib() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (FH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -2731326174239369112L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-2731326174239369112L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.tp = 0;
                        this.Zo = new int[j6[this.tp]];
                        this.VH = new int[j6[this.tp]];
                        this.Hw = new int[10];
                        this.v5 = 1;
                        this.gn = 0;
                        this.u7 = 0;
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

    public Ib(abcd.ec r8) {
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 20: {
                    th = $ex2;
                    if (FH == false) { $pc2 = 25; continue $sw2; }
                    abcd.wu.j6(th, -2229565801241763432L, null, r8);
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-2229565801241763432L, null, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        this.u7 = r8.readInt();
                        this.gn = r8.readInt();
                        this.tp = r8.readInt();
                        this.Zo = new int[j6[this.tp]];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    r3 = 0;
                    r4 = 0;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r4 >= this.Zo.length) { $pc2 = 10; continue $sw2; }
                    try {
                        this.Zo[r4] = r8.readInt();
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    { $pc2 = 8; continue $sw2; }
                }
                case 10: {
                    try {
                        this.VH = new int[j6[this.tp]];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    r5 = 0;
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (r5 >= this.VH.length) { $pc2 = 14; continue $sw2; }
                    try {
                        this.VH[r5] = r8.readInt();
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    { $pc2 = 12; continue $sw2; }
                }
                case 14: {
                    try {
                        this.v5 = r8.readInt();
                        this.Hw = new int[r8.readInt()];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    if (r3 >= this.v5) { $pc2 = 19; continue $sw2; }
                    try {
                        this.Hw[r3] = r8.readInt();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 20; continue $sw2;
                    }
                    r3 = r3 + 1;
                    { $pc2 = 15; continue $sw2; }
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3804513888865510953L)
    private int FH(int[] r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 14: {
                    th = $ex3;
                    if (FH == false) { $pc3 = 19; continue $sw3; }
                    abcd.wu.j6(th, -659394407513054579L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(-659394407513054579L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 14; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r0 = 0;
                    r1 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r0 >= r11) { $pc3 = 10; continue $sw3; }
                    r1 = r1 ^ r9[r0 + r10];
                    r0 = r0 + 1;
                    { $pc3 = 6; continue $sw3; }
                }
                case 10: {
                    if (r1 != 0) { $pc3 = 13; continue $sw3; }
                    r1 = Integer.MAX_VALUE;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    return Integer.MAX_VALUE & r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2516941107689935045L)
    private void j6() {
        int[] r2 = null;
        int[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 21: {
                    th = $ex4;
                    if (FH == false) { $pc4 = 26; continue $sw4; }
                    abcd.wu.j6(th, 264760601564290281L, this);
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(264760601564290281L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        this.tp++;
                        r2 = new int[j6[this.tp]];
                        r3 = new int[j6[this.tp]];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    r4 = 0;
                    r5 = 0;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r4 >= this.Zo.length) { $pc4 = 19; continue $sw4; }
                    try {
                        r6 = this.Zo[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    if (r6 == 0) { $pc4 = 18; continue $sw4; }
                    if (r6 == Integer.MIN_VALUE) { $pc4 = 18; continue $sw4; }
                    try {
                        r7 = FH(this.Hw, r6 + 1, this.Hw[r6]);
                        r8 = r7 % r2.length;
                        r9 = (r7 % (r2.length - 2)) + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if (r2[r8] == 0) { $pc4 = 17; continue $sw4; }
                    try {
                        r8 = (r8 + r9) % r2.length;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    { $pc4 = 15; continue $sw4; }
                }
                case 17: {
                    try {
                        r2[r8] = r6;
                        r3[r8] = this.VH[r4];
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    { $pc4 = 8; continue $sw4; }
                }
                case 19: {
                    try {
                        this.Zo = r2;
                        this.VH = r3;
                        this.gn = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 21; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW(int r11, int[] r12, int[] r13, int r14, int r15) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 12: {
                    th = $ex5;
                    if (FH == false) { $pc5 = 16; continue $sw5; }
                    abcd.wu.j6(th, -2828003442192993537L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(-2828003442192993537L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        r0 = (r15 * 2) + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    if (this.EQ != null) { $pc5 = 8; continue $sw5; }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    try {
                        this.EQ = new int[r0];
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    try {
                        this.EQ[0] = r11;
                        java.lang.System.arraycopy(r12, r14, this.EQ, 1, r15);
                        java.lang.System.arraycopy(r13, r14, this.EQ, r15 + 1, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    return DW(this.EQ, 0, r0);
                }
                case 8: {
                    if (this.EQ.length > r0) { $pc5 = 10; continue $sw5; }
                    { $pc5 = 9; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    public int DW(int[] r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 23: {
                    th = $ex6;
                    if (FH == false) { $pc6 = 28; continue $sw6; }
                    abcd.wu.j6(th, -1716786471069664269L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc6 = 28; continue $sw6;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(-1716786471069664269L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        r0 = FH(r9, r10, r11);
                        r1 = r0 % this.Zo.length;
                        r2 = (r0 % (this.Zo.length - 2)) + 1;
                        r3 = this.Zo[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r3 == 0) { $pc6 = 21; continue $sw6; }
                    if (r3 == Integer.MIN_VALUE) { $pc6 = 38; continue $sw6; }
                    if (this.Hw[r3] != r11) { $pc6 = 19; continue $sw6; }
                    try {
                        r4 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    r5 = 0;
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    if (r5 >= r11) { $pc6 = 17; continue $sw6; }
                    try {
                        r6 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    if (this.Hw[r4] != r9[r10 + r5]) { $pc6 = 19; continue $sw6; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    r4 = r6;
                    { $pc6 = 12; continue $sw6; }
                }
                case 17: {
                    try {
                        r9 = this.VH[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    return r9;
                }
                case 19: {
                    try {
                        r1 = (r1 + r2) % this.Zo.length;
                        r3 = this.Zo[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 23; continue $sw6;
                    }
                    { $pc6 = 6; continue $sw6; }
                }
                case 38: {
                    return -1;
                }
                case 21: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, int[] r9, int[] r10, int r11, int r12, int r13) {
        int r0 = 0;
        int[] r3 = null;
        int[] r4 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (DW == false) { $pc7 = 5; continue $sw7; }
                    abcd.wu.j6(-635802111660573L, this, new java.lang.Object[]{new java.lang.Integer(r8), r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13)});
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    r0 = (r12 * 2) + 1;
                    r3 = this.EQ;
                    if (r3 != null) { $pc7 = 8; continue $sw7; }
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    this.EQ = new int[r0];
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    r4 = this.EQ;
                    r4[0] = r8;
                    java.lang.System.arraycopy(r9, r11, r4, 1, r12);
                    java.lang.System.arraycopy(r10, r11, this.EQ, r12 + 1, r12);
                    j6(this.EQ, 0, r0, r13);
                    return;
                }
                case 8: {
                    if (r3.length > r0) { $pc7 = 10; continue $sw7; }
                    { $pc7 = 9; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.fc r6) {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 20: {
                    th = $ex8;
                    if (FH == false) { $pc8 = 25; continue $sw8; }
                    abcd.wu.j6(th, -7423424447459465236L, this, r6);
                    $pc8 = 25; continue $sw8;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-7423424447459465236L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 20; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        r6.writeInt(this.u7);
                        r6.writeInt(this.gn);
                        r6.writeInt(this.tp);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 20; continue $sw8;
                    }
                    r2 = 0;
                    r3 = 0;
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    if (r3 >= this.Zo.length) { $pc8 = 10; continue $sw8; }
                    try {
                        r6.writeInt(this.Zo[r3]);
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 20; continue $sw8;
                    }
                    { $pc8 = 8; continue $sw8; }
                }
                case 10: {
                    r4 = 0;
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    if (r4 >= this.VH.length) { $pc8 = 14; continue $sw8; }
                    try {
                        r6.writeInt(this.VH[r4]);
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 20; continue $sw8;
                    }
                    { $pc8 = 12; continue $sw8; }
                }
                case 14: {
                    try {
                        r6.writeInt(this.v5);
                        r6.writeInt(this.Hw.length);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 20; continue $sw8;
                    }
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    if (r2 >= this.v5) { $pc8 = 19; continue $sw8; }
                    try {
                        r6.writeInt(this.Hw[r2]);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 20; continue $sw8;
                    }
                    r2 = r2 + 1;
                    { $pc8 = 15; continue $sw8; }
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int[] r10, int r11, int r12, int r13) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int[] r7 = null;
        int[] r8 = null;
        int r9 = 0;
        int[] r14 = null;
        int r15 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 33: {
                    th = $ex9;
                    if (FH == false) { $pc9 = 38; continue $sw9; }
                    abcd.wu.j6(th, -580043143434076047L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc9 = 38; continue $sw9;
                }
                case 38: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(-580043143434076047L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        r0 = FH(r10, r11, r12);
                        r1 = r0 % this.Zo.length;
                        r2 = (r0 % (this.Zo.length - 2)) + 1;
                        r3 = this.Zo[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    r4 = 0;
                    if (r3 == 0) { $pc9 = 20; continue $sw9; }
                    if (r3 == Integer.MIN_VALUE) { $pc9 = 20; continue $sw9; }
                    if (this.Hw[r3] != r12) { $pc9 = 19; continue $sw9; }
                    try {
                        r5 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    if (r4 >= r12) { $pc9 = 17; continue $sw9; }
                    try {
                        r6 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    if (this.Hw[r5] != r10[r11 + r4]) { $pc9 = 19; continue $sw9; }
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    r5 = r6;
                    { $pc9 = 12; continue $sw9; }
                }
                case 17: {
                    try {
                        this.VH[r1] = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    return;
                }
                case 19: {
                    try {
                        r1 = (r1 + r2) % this.Zo.length;
                        r3 = this.Zo[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 20; continue $sw9;
                }
                case 20: {
                    try {
                        this.Zo[r1] = this.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    if (((this.v5 + r12) + 1) < this.Hw.length) { $pc9 = 23; continue $sw9; }
                    try {
                        r7 = new int[java.lang.Math.max((this.Hw.length + r12) + 1, (this.Hw.length * 2) + 1)];
                        java.lang.System.arraycopy(this.Hw, 0, r7, 0, this.Hw.length);
                        this.Hw = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    try {
                        r8 = this.Hw;
                        r9 = this.v5;
                        this.v5 = r9 + 1;
                        r8[r9] = r12;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 24; continue $sw9;
                }
                case 24: {
                    if (r4 >= r12) { $pc9 = 26; continue $sw9; }
                    try {
                        r14 = this.Hw;
                        r15 = this.v5;
                        this.v5 = r15 + 1;
                        r14[r15] = r10[r11 + r4];
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    { $pc9 = 24; continue $sw9; }
                }
                case 26: {
                    try {
                        this.VH[r1] = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    if (r3 == Integer.MIN_VALUE) { $pc9 = 29; continue $sw9; }
                    try {
                        this.gn++;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 29; continue $sw9;
                }
                case 29: {
                    try {
                        this.u7++;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    if ((this.gn * 2) <= this.Zo.length) { $pc9 = 48; continue $sw9; }
                    try {
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    return;
                }
                case 48: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r11, int[] r12, int[] r13, int r14, int r15) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 12: {
                    th = $ex10;
                    if (FH == false) { $pc10 = 16; continue $sw10; }
                    abcd.wu.j6(th, 5926346260535450600L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc10 = 16; continue $sw10;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(5926346260535450600L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r0 = (r15 * 2) + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    if (this.EQ != null) { $pc10 = 8; continue $sw10; }
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    try {
                        this.EQ = new int[r0];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    try {
                        this.EQ[0] = r11;
                        java.lang.System.arraycopy(r12, r14, this.EQ, 1, r15);
                        java.lang.System.arraycopy(r13, r14, this.EQ, r15 + 1, r15);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 12; continue $sw10;
                    }
                    return j6(this.EQ, 0, r0);
                }
                case 8: {
                    if (this.EQ.length > r0) { $pc10 = 10; continue $sw10; }
                    { $pc10 = 9; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int[] r9, int r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 22: {
                    th = $ex11;
                    if (FH == false) { $pc11 = 27; continue $sw11; }
                    abcd.wu.j6(th, 2665953759176881668L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc11 = 27; continue $sw11;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(2665953759176881668L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 22; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    try {
                        r0 = FH(r9, r10, r11);
                        r1 = r0 % this.Zo.length;
                        r2 = (r0 % (this.Zo.length - 2)) + 1;
                        r3 = this.Zo[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 22; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    r4 = 0;
                    if (r3 == 0) { $pc11 = 21; continue $sw11; }
                    if (r3 == Integer.MIN_VALUE) { $pc11 = 21; continue $sw11; }
                    if (this.Hw[r3] != r11) { $pc11 = 19; continue $sw11; }
                    try {
                        r5 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 22; continue $sw11;
                    }
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    if (r4 >= r11) { $pc11 = 18; continue $sw11; }
                    try {
                        r6 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 22; continue $sw11;
                    }
                    if (this.Hw[r5] != r9[r10 + r4]) { $pc11 = 19; continue $sw11; }
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 22; continue $sw11;
                    }
                    r5 = r6;
                    { $pc11 = 13; continue $sw11; }
                }
                case 18: {
                    return true;
                }
                case 19: {
                    try {
                        r1 = (r1 + r2) % this.Zo.length;
                        r3 = this.Zo[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 22; continue $sw11;
                    }
                    $pc11 = 21; continue $sw11;
                }
                case 21: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (FH == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, 1890622685958199240L, this);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(1890622685958199240L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return getClass().getName() + "[Size=" + this.u7 + "]";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
