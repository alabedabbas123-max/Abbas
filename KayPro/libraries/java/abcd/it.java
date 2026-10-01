package abcd;

public class it extends abcd.hu {
    private final int DW;
    private final abcd.ds FH;
    private final abcd.ds[] Hw;
    private final java.util.HashMap<abcd.Abstractvt, abcd.bs> v5;

    public it(abcd.yt r3) {
        java.util.ArrayList<abcd.tt> r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 == null) { $pc0 = 7; continue $sw0; }
                    r0 = r3.DW();
                    this.DW = r3.u7();
                    this.FH = new abcd.ds(this.DW);
                    this.Hw = new abcd.ds[r0.size()];
                    this.v5 = new java.util.HashMap();
                    this.FH.we();
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("method == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.ds Hw(int r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return this.Hw[r2];
                }
                case 5: {
                    throw new java.lang.IllegalArgumentException("bogus index");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.ds DW(int r1) {
        abcd.ds r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r2 = Hw(r1);
                    if (r2 == null) { $pc2 = 6; continue $sw2; }
                    return r2;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r2, abcd.ds r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    J8();
                    if (r3 == null) { $pc3 = 9; continue $sw3; }
                    try {
                        this.Hw[r2] = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc3 = 6; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("bogus index");
                }
                case 9: {
                    throw new java.lang.NullPointerException("specs == null");
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.ds FH(int r2) {
        abcd.ds r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r3 = Hw(r2);
                    if (r3 == null) { $pc4 = 6; continue $sw4; }
                    return r3.rN();
                }
                case 6: {
                    return new abcd.ds(this.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Abstractvt r2, abcd.bs r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    J8();
                    if (r2 == null) { $pc5 = 10; continue $sw5; }
                    if (r3 == null) { $pc5 = 8; continue $sw5; }
                    this.v5.put(r2, r3);
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("spec == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("insn == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(int r4, abcd.ds r5) {
        abcd.ds r0 = null;
        abcd.ds r2 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = Hw(r4);
                    if (r0 != null) { $pc6 = 6; continue $sw6; }
                    DW(r4, r5);
                    return true;
                }
                case 6: {
                    r2 = r0.rN();
                    r2.j6(r5, true);
                    if (r0.equals(r2) == false) { $pc6 = 10; continue $sw6; }
                    return false;
                }
                case 10: {
                    r2.we();
                    DW(r4, r2);
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
