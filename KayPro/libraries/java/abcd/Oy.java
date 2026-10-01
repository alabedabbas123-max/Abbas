package abcd;

@java.lang.Deprecated
public class Oy {
    public int DW;
    abcd.Ly EQ;
    public int FH;
    public long Hw;
    abcd.Fy J0;
    public int VH;
    public int Zo;
    public long gn;
    public byte[] j6;
    abcd.Gy tp;
    public java.lang.String u7;
    public byte[] v5;
    int we;

    public Oy() {
        this(new abcd.Dy());
    }

    public Oy(abcd.Fy r1) {
        this.J0 = r1;
    }

    public int DW() {
        return Hw(15);
    }

    public int DW(int r2) {
        return j6(r2, 15);
    }

    public int FH(int r2) {
        abcd.Ly r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.EQ;
                    if (r0 != null) { $pc0 = 7; continue $sw0; }
                    return -2;
                }
                case 7: {
                    return r0.j6(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw(int r2) {
        return j6(r2, false);
    }

    public int j6(int r2) {
        abcd.Gy r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.tp;
                    if (r0 != null) { $pc1 = 7; continue $sw1; }
                    return -2;
                }
                case 7: {
                    return r0.j6(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r2, int r3) {
        return j6(r2, r3, false);
    }

    public int j6(int r2, int r3, boolean r4) {
        abcd.Gy r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.tp = new abcd.Gy(this);
                    r0 = this.tp;
                    if (r4 == false) { $pc2 = 6; continue $sw2; }
                    r3 = -r3;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return r0.DW(r2, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(int r2, boolean r3) {
        abcd.Ly r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.EQ = new abcd.Ly(this);
                    r0 = this.EQ;
                    if (r3 == false) { $pc3 = 6; continue $sw3; }
                    r2 = -r2;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return r0.DW(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(byte[] r4, int r5, int r6) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.FH;
                    if (r0 > r6) { $pc4 = 6; continue $sw4; }
                    r6 = r0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r6 != 0) { $pc4 = 9; continue $sw4; }
                    return 0;
                }
                case 9: {
                    this.FH -= r6;
                    if (this.tp.u7 == 0) { $pc4 = 12; continue $sw4; }
                    this.J0.update(this.j6, this.DW, r6);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    java.lang.System.arraycopy(this.j6, this.DW, r4, r5, r6);
                    this.DW += r6;
                    this.Hw += (long) r6;
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6() {
        int r0 = 0;
        int r1 = 0;
        abcd.Gy r2 = null;
        byte[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        byte[] r6 = null;
        int r7 = 0;
        abcd.Gy r8 = null;
        abcd.Gy r9 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.tp.gn;
                    r1 = this.VH;
                    if (r0 <= r1) { $pc5 = 5; continue $sw5; }
                    r0 = r1;
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    if (r0 != 0) { $pc5 = 7; continue $sw5; }
                    return;
                }
                case 7: {
                    r2 = this.tp;
                    r3 = r2.v5;
                    r4 = r3.length;
                    r5 = r2.VH;
                    if (r4 <= r5) { $pc5 = 14; continue $sw5; }
                    r6 = this.v5;
                    if (r6.length <= this.Zo) { $pc5 = 14; continue $sw5; }
                    if (r3.length < (r5 + r0)) { $pc5 = 14; continue $sw5; }
                    r7 = r6.length;
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    r8 = this.tp;
                    java.lang.System.arraycopy(r8.v5, r8.VH, this.v5, this.Zo, r0);
                    this.Zo += r0;
                    r9 = this.tp;
                    r9.VH += r0;
                    this.gn += (long) r0;
                    this.VH -= r0;
                    r9.gn -= r0;
                    if (r9.gn != 0) { $pc5 = 18; continue $sw5; }
                    r9.VH = 0;
                    return;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
