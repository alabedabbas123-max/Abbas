package abcd;

final class hn {
    private final int DW;
    private final int FH;
    private final abcd.gn Hw;
    private abcd.Interfacexn VH;
    private int Zo;
    private final abcd.jn j6;
    private final abcd.yn v5;

    public hn(abcd.jn r2, int r3, int r4, abcd.gn r5) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 10; continue $sw0; }
                    if (r5 == null) { $pc0 = 8; continue $sw0; }
                    r0 = r2.Hw().Zo(r4);
                    this.j6 = r2;
                    this.DW = r3;
                    this.FH = r4;
                    this.Hw = r5;
                    this.v5 = new abcd.yn(r0);
                    this.Zo = -1;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("attributeFactory == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("cf == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        int r2 = 0;
        int r3 = 0;
        abcd.Pt r5 = null;
        abcd.Interfacexn r6 = null;
        int r7 = 0;
        int r4 = 0;
        abcd.Interfaceon r8 = null;
        abcd.wn r9 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2 = this.v5.size();
                    r3 = this.FH + 2;
                    r5 = this.j6.Hw();
                    r6 = this.VH;
                    if (r6 == null) { $pc1 = 5; continue $sw1; }
                    r6.j6(r5, this.FH, 2, "attributes_count: " + abcd.Yt.v5(r2));
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r7 = r3;
                    r4 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r4 >= r2) { $pc1 = 20; continue $sw1; }
                    if (this.VH == null) { $pc1 = 10; continue $sw1; }
                    try {
                        this.VH.j6(r5, r7, 0, "\nattributes[" + r4 + "]:\n");
                        this.VH.j6(1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 14; continue $sw1; }
                        if ($t instanceof abcd.wn) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    try {
                        r8 = this.Hw.j6(this.j6, this.DW, r7, this.VH);
                        r7 = r7 + r8.Hw();
                        this.v5.j6(r4, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 14; continue $sw1; }
                        if ($t instanceof abcd.wn) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.VH == null) { $pc1 = 13; continue $sw1; }
                    try {
                        this.VH.j6(-1);
                        this.VH.j6(r5, r7, 0, "end attributes[" + r4 + "]\n");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 14; continue $sw1; }
                        if ($t instanceof abcd.wn) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r4 = r4 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 17: {
                    e = $ex1;
                    e.j6("...while parsing attributes[" + r4 + "]");
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 14: {
                    e = $ex1;
                    r9 = new abcd.wn(e);
                    r9.j6("...while parsing attributes[" + r4 + "]");
                    throw r9;
                }
                case 20: {
                    this.Zo = r7;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Zo >= 0) { $pc2 = 6; continue $sw2; }
                    FH();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yn DW() {
        Hw();
        return this.v5;
    }

    public int j6() {
        Hw();
        return this.Zo;
    }

    public void j6(abcd.Interfacexn r1) {
        this.VH = r1;
    }
}
