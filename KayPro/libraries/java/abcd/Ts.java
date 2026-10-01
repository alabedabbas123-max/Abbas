package abcd;

public class Ts extends abcd.Abstractqt {
    private int DW;
    private abcd.au j6;

    public Ts(int r2) {
        this.j6 = new abcd.au(r2);
    }

    @Override
    public int j6() {
        return this.DW;
    }

    public int j6(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 < this.j6.size()) { $pc0 = 7; continue $sw0; }
                    return -1;
                }
                case 7: {
                    return this.j6.get(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.bs j6(abcd.bs r3) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 != null) { $pc1 = 13; continue $sw1; }
                    return null;
                }
                case 13: {
                    try {
                        r0 = this.j6.get(r3.we());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc1 = 7; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r0 < 0) { $pc1 = 12; continue $sw1; }
                    return r3.FH(r0);
                }
                case 12: {
                    throw new java.lang.RuntimeException("no mapping specified for register");
                }
                case 7: {
                    r0 = -1;
                    { $pc1 = 8; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r4, int r5, int r6) {
        int r0 = 0;
        int r7 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4 < this.j6.size()) { $pc2 = 7; continue $sw2; }
                    r0 = r4 - this.j6.size();
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r0 < 0) { $pc2 = 7; continue $sw2; }
                    this.j6.DW(-1);
                    r0 = r0 - 1;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    this.j6.FH(r4, r5);
                    r7 = r5 + r6;
                    if (this.DW >= r7) { $pc2 = 12; continue $sw2; }
                    this.DW = r7;
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
