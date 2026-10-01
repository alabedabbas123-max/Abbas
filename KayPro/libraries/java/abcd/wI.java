package abcd;

final class wI<V> {
    private int DW;
    private int FH;
    private wI.a<V>[] j6;

    private static class a<V> {
        V DW;
        wI.a<V> FH;
        final long j6;

        a(long r1, V r3) {
            this.j6 = r1;
            this.DW = r3;
        }
    }

    wI() {
        this.j6 = j6(64);
        this.FH = (int) (this.j6.length * 0.75f);
    }

    private final int DW(long r2) {
        int r3 = ((int) r2) >>> 1;
        return (r3 ^ ((r3 >>> 20) ^ (r3 >>> 12))) & (this.j6.length - 1);
    }

    private void j6() {
        abcd.wI.a[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.wI.a r3 = null;
        abcd.wI.a r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6;
                    r1 = r0.length;
                    this.j6 = j6(r1 << 1);
                    this.FH = (int) (this.j6.length * 0.75f);
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r1) { $pc0 = 4; continue $sw0; }
                    r3 = r0[r2];
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r3 == null) { $pc0 = 7; continue $sw0; }
                    r4 = r3.FH;
                    j6(r3);
                    r3 = r4;
                    { $pc0 = 6; continue $sw0; }
                }
                case 7: {
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(wI.a<V> r4) {
        int r0 = DW(r4.j6);
        wI.a<V>[] r1 = this.j6;
        r4.FH = r1[r0];
        r1[r0] = r4;
    }

    private static final <V> wI.a<V>[] j6(int r0) {
        return new abcd.wI.a[r0];
    }

    V j6(long r8) {
        abcd.wI.a r0 = null;
        abcd.wI.a r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6[DW(r8)];
                    r2 = null;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 == null) { $pc1 = 4; continue $sw1; }
                    if (r0.j6 == r8) { $pc1 = 7; continue $sw1; }
                    r2 = r0;
                    r0 = r0.FH;
                    { $pc1 = 3; continue $sw1; }
                }
                case 7: {
                    if (r2 != null) { $pc1 = 9; continue $sw1; }
                    this.j6[DW(r8)] = r0.FH;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    this.DW--;
                    return r0.DW;
                }
                case 9: {
                    r2.FH = r0.FH;
                    { $pc1 = 10; continue $sw1; }
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    V j6(long r5, V r7) {
        wI.a<V> r0 = null;
        V r6 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6[DW(r5)];
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r0 == null) { $pc2 = 4; continue $sw2; }
                    if (r0.j6 == r5) { $pc2 = 11; continue $sw2; }
                    r0 = r0.FH;
                    { $pc2 = 3; continue $sw2; }
                }
                case 11: {
                    r6 = r0.DW;
                    r0.DW = r7;
                    return r6;
                }
                case 4: {
                    r1 = this.DW + 1;
                    this.DW = r1;
                    if (r1 != this.FH) { $pc2 = 7; continue $sw2; }
                    j6();
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    j6(new abcd.wI.a(r5, r7));
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
