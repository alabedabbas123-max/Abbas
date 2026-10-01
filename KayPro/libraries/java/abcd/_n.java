package abcd;

public final class _n extends abcd.Abstractqo {
    private abcd.mo[] v5;

    public _n(abcd.hs r1, abcd.cs r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2);
                    if (r2.size() == 0) { $pc0 = 7; continue $sw0; }
                    this.v5 = null;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("registers.size() == 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.mo j6(abcd.bs r2, int r3) {
        return abcd.AbstractVn.j6(abcd.hs.j6, abcd.bs.j6(r3, r2.getType()), r2);
    }

    private void we() {
        abcd.cs r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.bs r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.v5 == null) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    r0 = gn();
                    r1 = r0.size();
                    this.v5 = new abcd.mo[r1];
                    r2 = 0;
                    r3 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r2 >= r1) { $pc1 = 8; continue $sw1; }
                    r4 = r0.get(r2);
                    this.v5[r2] = j6(r4, r3);
                    r3 = r3 + r4.Hw();
                    r2 = r2 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int DW() {
        abcd.mo[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    we();
                    r0 = this.v5;
                    r1 = r0.length;
                    r2 = 0;
                    r3 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r1) { $pc2 = 5; continue $sw2; }
                    r3 = r3 + r0[r2].DW();
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r3) {
        return new abcd._n(VH(), r3);
    }

    @Override
    protected java.lang.String j6() {
        return null;
    }

    @Override
    protected java.lang.String j6(boolean r9) {
        abcd.cs r0 = null;
        int r1 = 0;
        java.lang.StringBuffer r2 = null;
        int r3 = 0;
        int r4 = 0;
        abcd.bs r5 = null;
        abcd.mo r6 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = gn();
                    r1 = r0.size();
                    r2 = new java.lang.StringBuffer(100);
                    r3 = 0;
                    r4 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r3 >= r1) { $pc3 = 9; continue $sw3; }
                    r5 = r0.get(r3);
                    r6 = j6(r5, r4);
                    if (r3 == 0) { $pc3 = 7; continue $sw3; }
                    r2.append('\n');
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    r2.append(r6.j6(r9));
                    r4 = r4 + r5.Hw();
                    r3 = r3 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 9: {
                    return r2.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Lt r5) {
        abcd.mo[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    we();
                    r0 = this.v5;
                    r1 = r0.length;
                    r2 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r2 >= r1) { $pc4 = 5; continue $sw4; }
                    r0[r2].j6(r5);
                    r2 = r2 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
