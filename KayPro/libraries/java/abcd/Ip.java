package abcd;

public final class Ip extends abcd.Abstractup {
    private final abcd.Os DW;
    private final abcd.Js FH;
    private abcd.Rp Hw;

    public Ip(abcd.Os r2) {
        abcd.Ps r3 = null;
        abcd.Rp r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 11; continue $sw0; }
                    this.DW = r2;
                    this.FH = j6(r2);
                    r3 = r2.VH();
                    if (r3.size() != 0) { $pc0 = 7; continue $sw0; }
                    r4 = null;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.Hw = r4;
                    return;
                }
                case 7: {
                    r4 = new abcd.Rp(r3);
                    { $pc0 = 8; continue $sw0; }
                }
                case 11: {
                    throw new java.lang.NullPointerException("prototype == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static char j6(abcd.Qs r1) {
        char r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = r1.J8().charAt(0);
                    if (r2 != '[') { $pc1 = 6; continue $sw1; }
                    return 'L';
                }
                case 6: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.Js j6(abcd.Os r4) {
        abcd.Ps r0 = null;
        int r1 = 0;
        java.lang.StringBuilder r2 = null;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r4.VH();
                    r1 = r0.size();
                    r2 = new java.lang.StringBuilder(r1 + 1);
                    r2.append(j6(r4.we()));
                    r5 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r5 >= r1) { $pc2 = 6; continue $sw2; }
                    r2.append(j6(r0.getType(r5)));
                    r5 = r5 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    return new abcd.Js(r2.toString());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.Hw;
    }

    @Override
    public int VH() {
        return 12;
    }

    @Override
    public void j6(abcd.jp r4) {
        abcd.Op r0 = null;
        abcd.Qp r1 = null;
        abcd.Fp r5 = null;
        abcd.Rp r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r4.J8();
                    r1 = r4.Ws();
                    r5 = r4.QX();
                    r1.DW(this.DW.we());
                    r0.DW(this.FH);
                    r2 = this.Hw;
                    if (r2 == null) { $pc3 = 6; continue $sw3; }
                    this.Hw = (abcd.Rp) r5.DW(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.jp r9, abcd.Lt r10) {
        int r0 = 0;
        int r11 = 0;
        int r1 = 0;
        java.lang.StringBuilder r2 = null;
        abcd.Ps r3 = null;
        int r4 = 0;
        int r6 = 0;
        java.lang.StringBuilder r5 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r9.J8().j6(this.FH);
                    r11 = r9.Ws().j6(this.DW.we());
                    r1 = abcd.AbstractGp.FH(this.Hw);
                    if (r10.Hw() == false) { $pc4 = 10; continue $sw4; }
                    r2 = new java.lang.StringBuilder();
                    r2.append(this.DW.we().aM());
                    r2.append(" proto(");
                    r3 = this.DW.VH();
                    r4 = r3.size();
                    r6 = 0;
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    if (r6 >= r4) { $pc4 = 9; continue $sw4; }
                    if (r6 == 0) { $pc4 = 8; continue $sw4; }
                    r2.append(", ");
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r2.append(r3.getType(r6).aM());
                    r6 = r6 + 1;
                    { $pc4 = 5; continue $sw4; }
                }
                case 9: {
                    r2.append(")");
                    r10.j6(0, Ws() + ' ' + r2.toString());
                    r10.j6(4, "  shorty_idx:      " + abcd.Yt.gn(r0) + " // " + this.FH.lg());
                    r10.j6(4, "  return_type_idx: " + abcd.Yt.gn(r11) + " // " + this.DW.we().aM());
                    r5 = new java.lang.StringBuilder();
                    r5.append("  parameters_off:  ");
                    r5.append(abcd.Yt.gn(r1));
                    r10.j6(4, r5.toString());
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    r10.writeInt(r0);
                    r10.writeInt(r11);
                    r10.writeInt(r1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
