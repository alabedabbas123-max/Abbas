package abcd;

public abstract class Tr implements abcd.Interfacelu {
    private final abcd.hs DW;
    private final abcd.bs FH;
    private final abcd.cs Hw;
    private final abcd.es j6;

    public static class a implements abcd.Tr.b {
        public a() {
        }

        @Override
        public void j6(abcd.Sr r1) {
        }

        @Override
        public void j6(abcd.Zr r1) {
        }

        @Override
        public void j6(abcd.is r1) {
        }

        @Override
        public void j6(abcd.js r1) {
        }

        @Override
        public void j6(abcd.ks r1) {
        }
    }

    public interface b {
        void j6(abcd.Sr r1);

        void j6(abcd.Yr r1);

        void j6(abcd.Zr r1);

        void j6(abcd.is r1);

        void j6(abcd.js r1);

        void j6(abcd.ks r1);
    }

    public Tr(abcd.es r1, abcd.hs r2, abcd.bs r3, abcd.cs r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 13; continue $sw0; }
                    if (r2 == null) { $pc0 = 11; continue $sw0; }
                    if (r4 == null) { $pc0 = 9; continue $sw0; }
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = r4;
                    return;
                }
                case 9: {
                    throw new java.lang.NullPointerException("sources == null");
                }
                case 11: {
                    throw new java.lang.NullPointerException("position == null");
                }
                case 13: {
                    throw new java.lang.NullPointerException("opcode == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(java.lang.Object r0, java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r0 == r1) { $pc1 = 8; continue $sw1; }
                    if (r0 != null) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.equals(r1) == false) { $pc1 = 7; continue $sw1; }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.Ss DW();

    protected final java.lang.String DW(java.lang.String r4) {
        java.lang.StringBuffer r0 = null;
        abcd.bs r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuffer(80);
                    r0.append("Insn{");
                    r0.append(this.DW);
                    r0.append(' ');
                    r0.append(this.j6);
                    if (r4 == null) { $pc2 = 5; continue $sw2; }
                    r0.append(' ');
                    r0.append(r4);
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0.append(" :: ");
                    r5 = this.FH;
                    if (r5 == null) { $pc2 = 8; continue $sw2; }
                    r0.append(r5);
                    r0.append(" <- ");
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    r0.append(this.Hw);
                    r0.append('}');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String FH() {
        return null;
    }

    public final abcd.bs Hw() {
        abcd.bs r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6.Hw() != 54) { $pc3 = 5; continue $sw3; }
                    r0 = this.Hw.get(0);
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r0 != null) { $pc3 = 10; continue $sw3; }
                    return null;
                }
                case 10: {
                    if (r0.Zo() != null) { $pc3 = 12; continue $sw3; }
                    return null;
                }
                case 12: {
                    return r0;
                }
                case 5: {
                    r0 = this.FH;
                    { $pc3 = 7; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.bs VH() {
        return this.FH;
    }

    public final abcd.hs Zo() {
        return this.DW;
    }

    @Override
    public java.lang.String aM() {
        return j6(FH());
    }

    public final boolean equals(java.lang.Object r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this != r1) { $pc4 = 4; continue $sw4; }
                    return true;
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final abcd.cs gn() {
        return this.Hw;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    public abstract abcd.Tr j6(abcd.Qs r1);

    public abstract abcd.Tr j6(abcd.bs r1, abcd.cs r2);

    protected final java.lang.String j6(java.lang.String r5) {
        java.lang.StringBuffer r0 = null;
        int r6 = 0;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuffer(80);
                    r0.append(this.DW);
                    r0.append(": ");
                    r0.append(this.j6.FH());
                    if (r5 == null) { $pc5 = 6; continue $sw5; }
                    r0.append("(");
                    r0.append(r5);
                    r0.append(")");
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    if (this.FH != null) { $pc5 = 8; continue $sw5; }
                    r0.append(" .");
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    r0.append(" <-");
                    r6 = this.Hw.size();
                    if (r6 != 0) { $pc5 = 12; continue $sw5; }
                    r0.append(" .");
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    return r0.toString();
                }
                case 12: {
                    r1 = 0;
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    if (r1 >= r6) { $pc5 = 16; continue $sw5; }
                    r0.append(" ");
                    r0.append(this.Hw.get(r1).aM());
                    r1 = r1 + 1;
                    { $pc5 = 13; continue $sw5; }
                }
                case 8: {
                    r0.append(" ");
                    r0.append(this.FH.aM());
                    { $pc5 = 9; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract void j6(abcd.Tr.b r1);

    public final boolean j6() {
        return this.j6.j6();
    }

    public boolean j6(abcd.Tr r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.j6 == r3.v5()) { $pc6 = 5; continue $sw6; }
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    return false;
                }
                case 5: {
                    if (this.DW.equals(r3.Zo()) == false) { $pc6 = 15; continue $sw6; }
                    if (getClass() != r3.getClass()) { $pc6 = 15; continue $sw6; }
                    if (j6(this.FH, r3.VH()) == false) { $pc6 = 15; continue $sw6; }
                    if (j6(this.Hw, r3.gn()) == false) { $pc6 = 15; continue $sw6; }
                    if (abcd.Ps.DW(DW(), r3.DW()) == false) { $pc6 = 15; continue $sw6; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return DW(FH());
    }

    public abcd.Tr u7() {
        return this;
    }

    public final abcd.es v5() {
        return this.j6;
    }
}
