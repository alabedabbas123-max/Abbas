package abcd;

@abcd.Interfacexu
public class Tl {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String FH;
    public int Hw;
    public int VH;
    public int Zo;
    public int v5;

    static {
        abcd.wu.j6(abcd.Tl.class, -2158333802730359760L, -2158333802730359760L);
    }

    public Tl(java.lang.String r11, int r12, int r13, int r14, int r15) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -415774639461878880L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-415774639461878880L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH = r11;
                        this.Hw = r12;
                        this.v5 = r13;
                        this.Zo = r14;
                        this.VH = r15;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 11: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 15; continue $sw1; }
                    abcd.wu.j6(th, -1501909828150693592L, this);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1501909828150693592L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (this.Hw != this.Zo) { $pc1 = 9; continue $sw1; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r8) {
        abcd.Tl r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 36: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 40; continue $sw2; }
                    abcd.wu.j6(th, 342990384739897176L, this, r8);
                    $pc2 = 40; continue $sw2;
                }
                case 40: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(342990384739897176L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 36; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (this != r8) { $pc2 = 10; continue $sw2; }
                    return true;
                }
                case 10: {
                    if (r8 != null) { $pc2 = 13; continue $sw2; }
                    return false;
                }
                case 13: {
                    if (getClass() == r8.getClass()) { $pc2 = 15; continue $sw2; }
                    return false;
                }
                case 15: {
                    try {
                        r4 = (abcd.Tl) r8;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 36; continue $sw2;
                    }
                    if (this.VH == r4.VH) { $pc2 = 19; continue $sw2; }
                    return false;
                }
                case 19: {
                    if (this.Zo == r4.Zo) { $pc2 = 22; continue $sw2; }
                    return false;
                }
                case 22: {
                    if (this.FH != null) { $pc2 = 27; continue $sw2; }
                    if (r4.FH == null) { $pc2 = 30; continue $sw2; }
                    return false;
                }
                case 30: {
                    if (this.v5 == r4.v5) { $pc2 = 32; continue $sw2; }
                    return false;
                }
                case 32: {
                    if (this.Hw == r4.Hw) { $pc2 = 35; continue $sw2; }
                    return false;
                }
                case 35: {
                    return true;
                }
                case 27: {
                    if (this.FH.equals(r4.FH) == true) { $pc2 = 30; continue $sw2; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r2 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 13: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 17; continue $sw3; }
                    abcd.wu.j6(th, 2093363941184924245L, this);
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(2093363941184924245L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = (((this.VH + 31) * 31) + this.Zo) * 31;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    if (this.FH != null) { $pc3 = 9; continue $sw3; }
                    r4 = 0;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return ((((r2 + r4) * 31) + this.v5) * 31) + this.Hw;
                }
                case 9: {
                    try {
                        r4 = this.FH.hashCode();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    { $pc3 = 10; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 13: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 17; continue $sw4; }
                    abcd.wu.j6(th, 371353706849630307L, this);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(371353706849630307L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (this.Hw != this.Zo) { $pc4 = 11; continue $sw4; }
                    if (this.v5 != this.VH) { $pc4 = 11; continue $sw4; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.Tl r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 14: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 18; continue $sw5; }
                    abcd.wu.j6(th, 233253864155778200L, this, r6);
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(233253864155778200L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (r6.FH.equals(this.FH) == true) { $pc5 = 9; continue $sw5; }
                    return false;
                }
                case 9: {
                    if (java.lang.Math.abs(r6.Hw - this.Hw) >= 20) { $pc5 = 21; continue $sw5; }
                    return true;
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
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 2910247968380441856L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(2910247968380441856L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return this.FH + " (" + this.Hw + "," + this.v5 + "-" + this.Zo + "," + this.VH + ")";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
