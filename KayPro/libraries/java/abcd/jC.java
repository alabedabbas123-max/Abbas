package abcd;

public class jC {
    int DW;
    int FH;
    int Hw;
    int j6;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.jC.a DW = null;
        public static final abcd.jC.a FH = null;
        public static final abcd.jC.a Hw = null;
        public static final abcd.jC.a j6 = null;
        private static final abcd.jC.a[] v5 = null;

        static {
            j6 = new abcd.jC.a("INSERT", 0);
            DW = new abcd.jC.a("DELETE", 1);
            FH = new abcd.jC.a("REPLACE", 2);
            Hw = new abcd.jC.a("EMPTY", 3);
            v5 = new abcd.jC.a[]{j6, DW, FH, Hw};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.jC.a valueOf(java.lang.String r1) {
            return (abcd.jC.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.jC.a.values(), r1);
        }

        public static abcd.jC.a[] values() {
            abcd.jC.a[] r0 = v5;
            int r1 = r0.length;
            abcd.jC.a[] r2 = new abcd.jC.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public jC(int r1, int r2) {
        this(r1, r1, r2, r2);
    }

    public jC(int r1, int r2, int r3, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public final abcd.jC DW(abcd.jC r5) {
        return new abcd.jC(this.j6, r5.j6, this.FH, r5.FH);
    }

    public void DW() {
        this.Hw++;
    }

    public final int FH() {
        return this.j6;
    }

    public final int Hw() {
        return this.FH;
    }

    public final int VH() {
        return this.DW - this.j6;
    }

    public final int Zo() {
        return this.Hw;
    }

    public boolean equals(java.lang.Object r4) {
        abcd.jC r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r4 instanceof abcd.jC) == false) { $pc0 = 14; continue $sw0; }
                    r5 = (abcd.jC) r4;
                    if (this.j6 != r5.j6) { $pc0 = 14; continue $sw0; }
                    if (this.DW != r5.DW) { $pc0 = 14; continue $sw0; }
                    if (this.FH != r5.FH) { $pc0 = 14; continue $sw0; }
                    if (this.Hw != r5.Hw) { $pc0 = 14; continue $sw0; }
                    return true;
                }
                case 14: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.jC.a gn() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 >= this.DW) { $pc1 = 11; continue $sw1; }
                    if (this.FH >= this.Hw) { $pc1 = 9; continue $sw1; }
                    return abcd.jC.a.FH;
                }
                case 9: {
                    return abcd.jC.a.DW;
                }
                case 11: {
                    if (this.FH >= this.Hw) { $pc1 = 15; continue $sw1; }
                    return abcd.jC.a.j6;
                }
                case 15: {
                    return abcd.jC.a.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.j6 ^ this.DW;
    }

    public final abcd.jC j6(abcd.jC r5) {
        return new abcd.jC(r5.DW, this.DW, r5.Hw, this.Hw);
    }

    public void j6() {
        this.DW++;
    }

    public java.lang.String toString() {
        return gn() + "(" + this.j6 + "-" + this.DW + "," + this.FH + "-" + this.Hw + ")";
    }

    public final boolean u7() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6 == this.DW) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    if (this.FH != this.Hw) { $pc2 = 10; continue $sw2; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int v5() {
        return this.DW;
    }
}
