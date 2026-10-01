package abcd;

public class LG {
    public static final abcd.LG DW = null;
    public static final abcd.LG j6 = null;
    private final long FH;
    private volatile long Hw;
    private boolean v5;

    static {
        j6 = new abcd.LG(-1, -1);
        DW = new abcd.KG(0, 0);
    }

    private LG(long r1, long r3) {
        this.Hw = r1;
        this.FH = r3;
        this.v5 = DW(r1);
    }

    LG(long r1, long r3, abcd.LG r5) {
        this(r1, r3);
    }

    public static abcd.LG DW(java.io.File r4) {
        return new abcd.LG(java.lang.System.currentTimeMillis(), r4.lastModified());
    }

    private boolean DW(long r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r4 - this.FH) <= 2500) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(long r5) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.FH == r5) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if (this.v5 == false) { $pc1 = 9; continue $sw1; }
                    return false;
                }
                case 9: {
                    if (DW(this.Hw) == false) { $pc1 = 11; continue $sw1; }
                    return false;
                }
                case 11: {
                    this.Hw = java.lang.System.currentTimeMillis();
                    if (DW(this.Hw) == false) { $pc1 = 14; continue $sw1; }
                    return false;
                }
                case 14: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.LG r3) {
        long r0 = 0L;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r3.Hw;
                    if (DW(r0) == false) { $pc2 = 5; continue $sw2; }
                    this.v5 = true;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    this.Hw = r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r2 instanceof abcd.LG) == true) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    return j6((abcd.LG) r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return (int) this.FH;
    }

    public long j6() {
        return this.FH;
    }

    public boolean j6(abcd.LG r5) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.FH != r5.FH) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(java.io.File r3) {
        return j6(r3.lastModified());
    }
}
