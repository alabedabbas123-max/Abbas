package abcd;

public final class es {
    private final abcd.Qs DW;
    private final abcd.Ss FH;
    private final abcd.Ss Hw;
    private final java.lang.String VH;
    private final boolean Zo;
    private final int j6;
    private final int v5;

    public es(int r9, abcd.Qs r10, abcd.Ss r11, int r12, java.lang.String r13) {
        this(r9, r10, r11, abcd.Ps.FH, r12, false, r13);
    }

    public es(int r3, abcd.Qs r4, abcd.Ss r5, abcd.Ss r6, int r7, boolean r8, java.lang.String r9) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 == null) { $pc0 = 25; continue $sw0; }
                    if (r5 == null) { $pc0 = 23; continue $sw0; }
                    if (r6 == null) { $pc0 = 21; continue $sw0; }
                    if (r7 < 1) { $pc0 = 19; continue $sw0; }
                    if (r7 > 6) { $pc0 = 19; continue $sw0; }
                    if (r6.size() == 0) { $pc0 = 16; continue $sw0; }
                    if (r7 == 6) { $pc0 = 16; continue $sw0; }
                    throw new java.lang.IllegalArgumentException("exceptions / branchingness mismatch");
                }
                case 16: {
                    this.j6 = r3;
                    this.DW = r4;
                    this.FH = r5;
                    this.Hw = r6;
                    this.v5 = r7;
                    this.Zo = r8;
                    this.VH = r9;
                    return;
                }
                case 19: {
                    throw new java.lang.IllegalArgumentException("bogus branchingness");
                }
                case 21: {
                    throw new java.lang.NullPointerException("exceptions == null");
                }
                case 23: {
                    throw new java.lang.NullPointerException("sources == null");
                }
                case 25: {
                    throw new java.lang.NullPointerException("result == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public es(int r9, abcd.Qs r10, abcd.Ss r11, abcd.Ss r12, java.lang.String r13) {
        this(r9, r10, r11, r12, 6, false, r13);
    }

    public es(int r9, abcd.Qs r10, abcd.Ss r11, java.lang.String r12) {
        this(r9, r10, r11, abcd.Ps.FH, 1, false, r12);
    }

    public es(int r9, abcd.Ss r10, abcd.Ss r11) {
        this(r9, abcd.Qs.tp, r10, r11, 6, true, null);
    }

    public int DW() {
        return this.v5;
    }

    public java.lang.String FH() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.VH;
                    if (r0 == null) { $pc1 = 6; continue $sw1; }
                    return r0;
                }
                case 6: {
                    return toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw() {
        return this.j6;
    }

    public boolean VH() {
        return this.Zo;
    }

    public abcd.Ss Zo() {
        return this.FH;
    }

    public boolean equals(java.lang.Object r5) {
        abcd.es r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this != r5) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if ((r5 instanceof abcd.es) == true) { $pc2 = 8; continue $sw2; }
                    return false;
                }
                case 8: {
                    r6 = (abcd.es) r5;
                    if (this.j6 == r6.j6) { $pc2 = 11; continue $sw2; }
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    return false;
                }
                case 11: {
                    if (this.v5 != r6.v5) { $pc2 = 19; continue $sw2; }
                    if (this.DW != r6.DW) { $pc2 = 19; continue $sw2; }
                    if (this.FH.equals(r6.FH) == false) { $pc2 = 19; continue $sw2; }
                    if (this.Hw.equals(r6.Hw) == false) { $pc2 = 19; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean gn() {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6;
                    if (r0 != 14) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    if (r0 == 16) { $pc3 = 11; continue $sw3; }
                    switch(r0) {
                        case 20: { $pc3 = 12; continue $sw3; }
                        case 21: { $pc3 = 12; continue $sw3; }
                        case 22: { $pc3 = 12; continue $sw3; }
                        default: { $pc3 = 7; continue $sw3; }
                    };
                }
                case 7: {
                    return false;
                }
                case 12: {
                    return true;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return (((((((this.j6 * 31) + this.v5) * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode()) * 31) + this.Hw.hashCode();
    }

    public final boolean j6() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.Hw.size() == 0) { $pc4 = 5; continue $sw4; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        int r5 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuffer(40);
                    r0.append("Rop{");
                    r0.append(abcd._r.DW(this.j6));
                    if (this.DW == abcd.Qs.tp) { $pc5 = 5; continue $sw5; }
                    r0.append(" ");
                    r0.append(this.DW);
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r0.append(" <-");
                    r1 = this.FH.size();
                    r5 = 0;
                    if (r1 != 0) { $pc5 = 9; continue $sw5; }
                    r0.append(" .");
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    if (this.Zo == false) { $pc5 = 15; continue $sw5; }
                    r0.append(" call");
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r2 = this.Hw.size();
                    if (r2 == 0) { $pc5 = 24; continue $sw5; }
                    r0.append(" throws");
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    if (r5 >= r2) { $pc5 = 40; continue $sw5; }
                    r0.append(' ');
                    if (this.Hw.getType(r5) != abcd.Qs.j3) { $pc5 = 22; continue $sw5; }
                    r0.append("<any>");
                    $pc5 = 23; continue $sw5;
                }
                case 23: {
                    r5 = r5 + 1;
                    { $pc5 = 18; continue $sw5; }
                }
                case 22: {
                    r0.append(this.Hw.getType(r5));
                    $pc5 = 40; continue $sw5;
                }
                case 40: {
                    r0.append('}');
                    return r0.toString();
                }
                case 24: {
                    r3 = this.v5;
                    if (r3 != 1) { $pc5 = 27; continue $sw5; }
                    r0.append(" flows");
                    { $pc5 = 40; continue $sw5; }
                }
                case 27: {
                    if (r3 != 2) { $pc5 = 29; continue $sw5; }
                    r0.append(" returns");
                    { $pc5 = 40; continue $sw5; }
                }
                case 29: {
                    if (r3 != 3) { $pc5 = 31; continue $sw5; }
                    r0.append(" gotos");
                    { $pc5 = 40; continue $sw5; }
                }
                case 31: {
                    if (r3 != 4) { $pc5 = 33; continue $sw5; }
                    r0.append(" ifs");
                    { $pc5 = 40; continue $sw5; }
                }
                case 33: {
                    if (r3 == 5) { $pc5 = 35; continue $sw5; }
                    r0.append(" " + abcd.Yt.Hw(this.v5));
                    { $pc5 = 40; continue $sw5; }
                }
                case 35: {
                    r0.append(" switches");
                    { $pc5 = 40; continue $sw5; }
                }
                case 9: {
                    r4 = 0;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r4 >= r1) { $pc5 = 13; continue $sw5; }
                    r0.append(' ');
                    r0.append(this.FH.getType(r4));
                    r4 = r4 + 1;
                    { $pc5 = 10; continue $sw5; }
                }
                case 5: {
                    r0.append(" .");
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Qs v5() {
        return this.DW;
    }
}
