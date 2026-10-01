package abcd;

public class DE<V extends abcd.yE> implements java.lang.Iterable<V> {
    private int DW;
    private int FH;
    private V[] Hw;
    private int j6;

    public DE() {
        Zo(2048);
    }

    private void DW(V r5) {
        int r0 = 0;
        int r1 = 0;
        V[] r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH;
                    r1 = r5.FH & r0;
                    r2 = this.Hw;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r2[r1] == null) { $pc0 = 5; continue $sw0; }
                    r1 = (r1 + 1) & r0;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    r2[r1] = r5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.yE[] DW(abcd.DE r0) {
        return r0.Hw;
    }

    private void Zo(int r2) {
        this.DW = r2 >> 1;
        this.FH = r2 - 1;
        this.Hw = (V[]) v5(r2);
    }

    static int j6(abcd.DE r0) {
        return r0.j6;
    }

    private void j6() {
        V[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        V r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw;
                    r1 = r0.length;
                    Zo(r1 << 1);
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= r1) { $pc1 = 4; continue $sw1; }
                    r3 = r0[r2];
                    if (r3 == null) { $pc1 = 8; continue $sw1; }
                    DW(r3);
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private final V[] v5(int r1) {
        return (V[]) new abcd.yE[r1];
    }

    public V DW(abcd.YD r6) {
        int r0 = 0;
        int r1 = 0;
        V[] r2 = null;
        V r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH;
                    r1 = r6.FH & r0;
                    r2 = this.Hw;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r3 = r2[r1];
                    if (r3 == null) { $pc2 = 5; continue $sw2; }
                    if (abcd.YD.j6(r3, r6) == true) { $pc2 = 9; continue $sw2; }
                    r1 = (r1 + 1) & r0;
                    { $pc2 = 3; continue $sw2; }
                }
                case 9: {
                    return r3;
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean isEmpty() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6 != 0) { $pc3 = 6; continue $sw3; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<V> iterator() {
        return new abcd.CE(this);
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)V */
    public void j6(abcd.yE r3) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.j6 + 1;
                    this.j6 = r0;
                    if (r0 != this.DW) { $pc4 = 5; continue $sw4; }
                    j6();
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    DW(r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.YD r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (DW(r1) == null) { $pc5 = 6; continue $sw5; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
