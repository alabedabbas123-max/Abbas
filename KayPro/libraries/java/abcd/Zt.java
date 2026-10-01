package abcd;

public final class Zt extends java.io.FilterWriter {
    private final int DW;
    private final int FH;
    private int Hw;
    private int Zo;
    private final java.lang.String j6;
    private boolean v5;

    public Zt(java.io.Writer r2, int r3) {
        this(r2, r3, "");
    }

    public Zt(java.io.Writer r1, int r2, java.lang.String r3) {
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1);
                    if (r1 == null) { $pc0 = 19; continue $sw0; }
                    if (r2 < 0) { $pc0 = 17; continue $sw0; }
                    if (r3 == null) { $pc0 = 15; continue $sw0; }
                    if (r2 == 0) { $pc0 = 8; continue $sw0; }
                    r4 = r2;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    this.DW = r4;
                    this.FH = r2 >> 1;
                    if (r3.length() != 0) { $pc0 = 12; continue $sw0; }
                    r3 = null;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    this.j6 = r3;
                    j6();
                    return;
                }
                case 8: {
                    r4 = Integer.MAX_VALUE;
                    { $pc0 = 9; continue $sw0; }
                }
                case 15: {
                    throw new java.lang.NullPointerException("prefix == null");
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException("width < 0");
                }
                case 19: {
                    throw new java.lang.NullPointerException("out == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6() {
        boolean r1 = false;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.Hw = 0;
                    if (this.FH == 0) { $pc1 = 5; continue $sw1; }
                    r1 = true;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.v5 = r1;
                    this.Zo = 0;
                    return;
                }
                case 5: {
                    r1 = false;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(int r7) {
        java.lang.Object r0 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = ((java.io.FilterWriter) this).lock;
                    monitor-enter(r0);
                    r3 = 0;
                    if (this.v5 == false) { $pc2 = 12; continue $sw2; }
                    if (r7 != 32) { $pc2 = 10; continue $sw2; }
                    try {
                        this.Zo++;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    if (this.Zo < this.FH) { $pc2 = 12; continue $sw2; }
                    try {
                        this.Zo = this.FH;
                        this.v5 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    { $pc2 = 12; continue $sw2; }
                }
                case 10: {
                    try {
                        this.v5 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (this.Hw != this.DW) { $pc2 = 16; continue $sw2; }
                    if (r7 == 10) { $pc2 = 16; continue $sw2; }
                    try {
                        ((java.io.FilterWriter) this).out.write(10);
                        this.Hw = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    if (this.Hw == 0) { $pc2 = 18; continue $sw2; }
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    try {
                        ((java.io.FilterWriter) this).out.write(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    if (r7 != 10) { $pc2 = 29; continue $sw2; }
                    try {
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    $pc2 = 30; continue $sw2;
                }
                case 30: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    return;
                }
                case 29: {
                    try {
                        this.Hw++;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    { $pc2 = 30; continue $sw2; }
                }
                case 18: {
                    if (this.j6 == null) { $pc2 = 21; continue $sw2; }
                    try {
                        ((java.io.FilterWriter) this).out.write(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (this.v5 == true) { $pc2 = 26; continue $sw2; }
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    if (r3 >= this.Zo) { $pc2 = 25; continue $sw2; }
                    try {
                        ((java.io.FilterWriter) this).out.write(32);
                        r3 = r3 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    { $pc2 = 23; continue $sw2; }
                }
                case 25: {
                    try {
                        this.Hw = this.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 32; continue $sw2;
                    }
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(java.lang.String r3, int r4, int r5) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = ((java.io.FilterWriter) this).lock;
                    monitor-enter(r0);
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r5 <= 0) { $pc3 = 6; continue $sw3; }
                    try {
                        write(r3.charAt(r4));
                        r4 = r4 + 1;
                        r5 = r5 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 6: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(char[] r3, int r4, int r5) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = ((java.io.FilterWriter) this).lock;
                    monitor-enter(r0);
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r5 <= 0) { $pc4 = 6; continue $sw4; }
                    try {
                        write(r3[r4]);
                        r4 = r4 + 1;
                        r5 = r5 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    th = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 6: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
