package abcd;

@abcd.Interfacexu
public class Kl extends java.io.OutputStream {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -511362552826188901L)
    private final java.io.OutputStream FH;

    @abcd.Interfaceru(field = -511382988863066188L)
    private final java.io.OutputStream Hw;

    static {
        abcd.wu.j6(abcd.Kl.class, 350630418671245344L, 350630418671245344L);
    }

    public Kl(java.io.OutputStream r8, java.io.OutputStream r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 425321149652825512L, null, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(425321149652825512L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH = r8;
                        this.Hw = r9;
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

    @Override
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 13: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 17; continue $sw1; }
                    abcd.wu.j6(th, -1647043526303603424L, this);
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-1647043526303603424L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (this.FH == null) { $pc1 = 10; continue $sw1; }
                    try {
                        this.FH.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (this.Hw == null) { $pc1 = 20; continue $sw1; }
                    try {
                        this.Hw.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void flush() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 13: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 17; continue $sw2; }
                    abcd.wu.j6(th, -1550418596417897976L, this);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(-1550418596417897976L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (this.FH == null) { $pc2 = 10; continue $sw2; }
                    try {
                        this.FH.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (this.Hw == null) { $pc2 = 20; continue $sw2; }
                    try {
                        this.Hw.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 13: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 17; continue $sw3; }
                    abcd.wu.j6(th, -670904570860601360L, this, new java.lang.Integer(r5));
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(-670904570860601360L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (this.FH == null) { $pc3 = 10; continue $sw3; }
                    try {
                        this.FH.write(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    if (this.Hw == null) { $pc3 = 20; continue $sw3; }
                    try {
                        this.Hw.write(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 13: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 17; continue $sw4; }
                    abcd.wu.j6(th, 875292999722787212L, this, r5);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(875292999722787212L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (this.FH == null) { $pc4 = 10; continue $sw4; }
                    try {
                        this.FH.write(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (this.Hw == null) { $pc4 = 20; continue $sw4; }
                    try {
                        this.Hw.write(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 13; continue $sw4;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r9, int r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 12: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 16; continue $sw5; }
                    abcd.wu.j6(th, -414479510827417000L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-414479510827417000L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (this.FH == null) { $pc5 = 9; continue $sw5; }
                    try {
                        this.FH.write(r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    if (this.Hw == null) { $pc5 = 19; continue $sw5; }
                    try {
                        this.Hw.write(r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
