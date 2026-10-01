package abcd;

public class kq {
    protected final abcd.St j6;

    public kq(abcd.St r1) {
        this.j6 = r1;
    }

    public kq(abcd.jq r1) {
        this(r1.Hw());
    }

    private int j6(abcd.St r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r6) { $pc0 = 5; continue $sw0; }
                    r1 = r1 + ((r5.readByte() & 255) << r2);
                    r2 = r2 + 8;
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void DW() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = abcd.eu.DW(this.j6);
                    FH(r0);
                    r1 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r1 >= r0) { $pc1 = 5; continue $sw1; }
                    FH();
                    r1 = r1 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void DW(int r1) {
    }

    protected void DW(int r1, int r2) {
    }

    public final void FH() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6.readByte() & 255;
                    r1 = r0 & 31;
                    r2 = (r0 & 224) >> 5;
                    r3 = r2 + 1;
                    if (r1 != 0) { $pc2 = 5; continue $sw2; }
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    j6(r0, r1, r2, r3);
                    return;
                }
                case 5: {
                    if (r1 == 6) { $pc2 = 26; continue $sw2; }
                    if (r1 == 2) { $pc2 = 26; continue $sw2; }
                    if (r1 == 3) { $pc2 = 26; continue $sw2; }
                    if (r1 == 4) { $pc2 = 26; continue $sw2; }
                    if (r1 == 16) { $pc2 = 26; continue $sw2; }
                    if (r1 == 17) { $pc2 = 26; continue $sw2; }
                    switch(r1) {
                        case 23: { $pc2 = 25; continue $sw2; }
                        case 24: { $pc2 = 24; continue $sw2; }
                        case 25: { $pc2 = 23; continue $sw2; }
                        case 26: { $pc2 = 22; continue $sw2; }
                        case 27: { $pc2 = 23; continue $sw2; }
                        case 28: { $pc2 = 21; continue $sw2; }
                        case 29: { $pc2 = 20; continue $sw2; }
                        case 30: { $pc2 = 19; continue $sw2; }
                        case 31: { $pc2 = 18; continue $sw2; }
                        default: { $pc2 = 36; continue $sw2; }
                    };
                }
                case 18: {
                    v5(r0);
                    return;
                }
                case 19: {
                    Zo(r0);
                    return;
                }
                case 20: {
                    DW(r0);
                    j6();
                    return;
                }
                case 21: {
                    Hw(r0);
                    DW();
                    return;
                }
                case 22: {
                    FH(r1, j6(this.j6, r3));
                    return;
                }
                case 23: {
                    DW(r1, j6(this.j6, r3));
                    return;
                }
                case 24: {
                    v5(r1, j6(this.j6, r3));
                    return;
                }
                case 25: {
                    Hw(r1, j6(this.j6, r3));
                    return;
                }
                case 36: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void FH(int r1) {
    }

    protected void FH(int r1, int r2) {
    }

    protected void Hw(int r1) {
    }

    protected void Hw(int r1, int r2) {
    }

    protected void Zo(int r1) {
    }

    public final void j6() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = abcd.eu.DW(this.j6);
                    r1 = abcd.eu.DW(this.j6);
                    j6(r0, r1);
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r1) { $pc3 = 5; continue $sw3; }
                    j6(abcd.eu.DW(this.j6));
                    FH();
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(int r1) {
    }

    protected void j6(int r1, int r2) {
    }

    protected void j6(int r1, int r2, int r3, int r4) {
        int r5 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r5 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r5 >= r4) { $pc4 = 5; continue $sw4; }
                    this.j6.readByte();
                    r5 = r5 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void v5(int r1) {
    }

    protected void v5(int r1, int r2) {
    }
}
