package abcd;

public class JF {
    final int DW;
    int FH;
    private final abcd.JF.a Hw;
    int VH;
    int Zo;
    private abcd.kC gn;
    final abcd.HF j6;
    int v5;

    public static abstract class a {
        int DW;
        int j6;

        public a() {
        }

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    JF(abcd.HF r2, int r3) {
        this(r2, r3, new abcd.IF(r2));
    }

    JF(abcd.HF r1, int r2, abcd.JF.a r3) {
        this.j6 = r1;
        this.DW = r2;
        this.Hw = r3;
    }

    JF(abcd.HF r2, abcd.kC r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this(r2, r2.yS.length);
                    this.gn = r3;
                    this.FH = this.DW;
                    this.VH = 0;
                    if (r3.isEmpty() == false) { $pc0 = 5; continue $sw0; }
                    this.v5 = 0;
                    this.Zo = 0;
                    return;
                }
                case 5: {
                    this.v5 = r3.get(0).Hw();
                    this.Zo = r3.get(r3.size() - 1).Zo() - this.v5;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.Zo;
    }

    public int FH() {
        return this.v5;
    }

    public abcd.JF.a Hw() {
        return this.Hw;
    }

    public abcd.kC Zo() {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.jC r5 = null;
        byte r6 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.gn != null) { $pc1 = 28; continue $sw1; }
                    this.gn = new abcd.kC();
                    r0 = this.j6.yS;
                    r1 = abcd.IK.Zo(r0, this.DW);
                    r2 = this.Hw.j6;
                    r3 = this.v5;
                    r5 = null;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r1 >= this.FH) { $pc1 = 28; continue $sw1; }
                    r6 = r0[r1];
                    if (r6 != 10) { $pc1 = 11; continue $sw1; }
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    r2 = r2 + 1;
                    r3 = r3 + 1;
                    r5 = null;
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    r1 = abcd.IK.Zo(r0, r1);
                    { $pc1 = 6; continue $sw1; }
                }
                case 11: {
                    if (r6 == 32) { $pc1 = 25; continue $sw1; }
                    if (r6 != 43) { $pc1 = 15; continue $sw1; }
                    if (r5 != null) { $pc1 = 24; continue $sw1; }
                    r5 = new abcd.jC(r2 - 1, r3 - 1);
                    this.gn.add(r5);
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    r3 = r3 + 1;
                    r5.DW();
                    { $pc1 = 26; continue $sw1; }
                }
                case 15: {
                    if (r6 != 45) { $pc1 = 17; continue $sw1; }
                    if (r5 != null) { $pc1 = 21; continue $sw1; }
                    r5 = new abcd.jC(r2 - 1, r3 - 1);
                    this.gn.add(r5);
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    r2 = r2 + 1;
                    r5.j6();
                    { $pc1 = 26; continue $sw1; }
                }
                case 17: {
                    if (r6 == 92) { $pc1 = 26; continue $sw1; }
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.HF j6() {
        return this.j6;
    }

    public java.lang.String toString() {
        return "HunkHeader[" + Hw().DW() + ',' + Hw().j6() + "->" + FH() + ',' + DW() + ']';
    }

    public int v5() {
        return this.DW;
    }
}
