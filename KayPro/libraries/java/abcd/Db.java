package abcd;

@abcd.Interfacexu
public class Db {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3312765268069062568L)
    private long[] FH;

    @abcd.Interfaceru(field = -1600048704983574111L)
    private int Hw;

    static {
        abcd.wu.j6(abcd.Db.class, -3326378980488377480L, -3326378980488377480L);
    }

    public Db() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1520604431317412488L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1520604431317412488L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH = null;
                        this.Hw = 0;
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

    public long j6(int r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 17: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 21; continue $sw1; }
                    abcd.wu.j6(th, 2221685026128992244L, this, new java.lang.Integer(r6));
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(2221685026128992244L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 17; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (this.FH != null) { $pc1 = 10; continue $sw1; }
                    return -1;
                }
                case 10: {
                    if (r6 < this.FH.length) { $pc1 = 13; continue $sw1; }
                    return -1;
                }
                case 13: {
                    if (r6 < this.Hw) { $pc1 = 15; continue $sw1; }
                    return -1;
                }
                case 15: {
                    return this.FH[r6];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 2258090898471885312L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(2258090898471885312L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        this.Hw = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, long r9) {
        long[] r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 16: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 20; continue $sw3; }
                    abcd.wu.j6(th, -374471799622429867L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-374471799622429867L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (this.FH != null) { $pc3 = 9; continue $sw3; }
                    try {
                        this.FH = new long[java.lang.Math.max(10, r8 + 1)];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    if (r8 < this.Hw) { $pc3 = 14; continue $sw3; }
                    try {
                        this.Hw = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    try {
                        this.FH[r8] = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    return;
                }
                case 9: {
                    if (r8 < this.FH.length) { $pc3 = 12; continue $sw3; }
                    try {
                        r0 = new long[java.lang.Math.max(r8 + 1, (this.FH.length * 2) + 1)];
                        java.lang.System.arraycopy(this.FH, 0, r0, 0, this.FH.length);
                        this.FH = r0;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    { $pc3 = 12; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(long r7) {
        long[] r2 = null;
        int r3 = 0;
        long[] r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 14: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 18; continue $sw4; }
                    abcd.wu.j6(th, -1250435731425065133L, this, new java.lang.Long(r7));
                    $pc4 = 18; continue $sw4;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(-1250435731425065133L, this, new java.lang.Long(r7));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 14; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (this.FH != null) { $pc4 = 10; continue $sw4; }
                    try {
                        this.FH = new long[10];
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 14; continue $sw4;
                    }
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    try {
                        r2 = this.FH;
                        r3 = this.Hw;
                        this.Hw = r3 + 1;
                        r2[r3] = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 14; continue $sw4;
                    }
                    return;
                }
                case 10: {
                    if (this.Hw < this.FH.length) { $pc4 = 12; continue $sw4; }
                    try {
                        r4 = new long[(this.FH.length * 2) + 1];
                        java.lang.System.arraycopy(this.FH, 0, r4, 0, this.FH.length);
                        this.FH = r4;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 14; continue $sw4;
                    }
                    { $pc4 = 12; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 12: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 17; continue $sw5; }
                    abcd.wu.j6(th, 3679935882327221183L, this);
                    $pc5 = 17; continue $sw5;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(3679935882327221183L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r2 = "{";
                    r3 = 0;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    if (r3 >= this.Hw) { $pc5 = 10; continue $sw5; }
                    try {
                        r2 = r2 + this.FH[r3] + ", ";
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    { $pc5 = 8; continue $sw5; }
                }
                case 10: {
                    return r2 + "}";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
