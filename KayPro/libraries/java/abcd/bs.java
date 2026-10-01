package abcd;

public final class bs implements abcd.Rs, abcd.Interfacelu, java.lang.Comparable<abcd.bs> {
    private static final abcd.bs.a DW = null;
    private static final java.util.HashMap<java.lang.Object, abcd.bs> j6 = null;
    private final int FH;
    private final abcd.Rs Hw;
    private final abcd.Vr v5;

    private static class a {
        private abcd.Rs DW;
        private abcd.Vr FH;
        private int j6;

        private a() {
        }

        a(abcd.as r1) {
            this();
        }

        static abcd.Rs DW(abcd.bs.a r0) {
            return r0.DW;
        }

        static abcd.Vr FH(abcd.bs.a r0) {
            return r0.FH;
        }

        static int j6(abcd.bs.a r0) {
            return r0.j6;
        }

        public boolean equals(java.lang.Object r4) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if ((r4 instanceof abcd.bs) == true) { $pc0 = 7; continue $sw0; }
                        return false;
                    }
                    case 7: {
                        return abcd.bs.j6((abcd.bs) r4, this.j6, this.DW, this.FH);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int hashCode() {
            return abcd.bs.j6(this.j6, this.DW, this.FH);
        }

        public abcd.bs j6() {
            return new abcd.bs(this.j6, this.DW, this.FH, null);
        }

        public void j6(int r1, abcd.Rs r2, abcd.Vr r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }
    }

    static {
        j6 = new java.util.HashMap(1000);
        DW = new abcd.bs.a(null);
    }

    private bs(int r1, abcd.Rs r2, abcd.Vr r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 < 0) { $pc1 = 10; continue $sw1; }
                    if (r2 == null) { $pc1 = 8; continue $sw1; }
                    this.FH = r1;
                    this.Hw = r2;
                    this.v5 = r3;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("type == null");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("reg < 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    bs(int r1, abcd.Rs r2, abcd.Vr r3, abcd.as r4) {
        this(r1, r2, r3);
    }

    public static abcd.bs DW(int r0, abcd.Rs r1, abcd.Vr r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 6; continue $sw2; }
                    return Zo(r0, r1, r2);
                }
                case 6: {
                    throw new java.lang.NullPointerException("local  == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.bs FH(int r0, abcd.Rs r1, abcd.Vr r2) {
        return Zo(r0, r1, r2);
    }

    private boolean Hw(int r2, abcd.Rs r3, abcd.Vr r4) {
        abcd.Vr r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.FH == r2) { $pc3 = 5; continue $sw3; }
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    return false;
                }
                case 5: {
                    if (this.Hw.equals(r3) == false) { $pc3 = 12; continue $sw3; }
                    r5 = this.v5;
                    if (r5 == r4) { $pc3 = 11; continue $sw3; }
                    if (r5 == null) { $pc3 = 12; continue $sw3; }
                    if (r5.equals(r4) == false) { $pc3 = 12; continue $sw3; }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.bs Zo(int r2, abcd.Rs r3, abcd.Vr r4) {
        java.util.HashMap<java.lang.Object, abcd.bs> r0 = null;
        abcd.bs r5 = null;
        abcd.bs r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = j6;
                    monitor-enter(r0);
                    try {
                        DW.j6(r2, r3, r4);
                        r5 = j6.get(DW);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    if (r5 == null) { $pc4 = 8; continue $sw4; }
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    return r5;
                }
                case 8: {
                    try {
                        r6 = DW.j6();
                        j6.put(r6, r6);
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    return r6;
                }
                case 11: {
                    th = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(int r0, abcd.Rs r1, abcd.Vr r2) {
        return v5(r0, r1, r2);
    }

    public static abcd.bs j6(int r1, abcd.Rs r2) {
        return Zo(r1, r2, null);
    }

    public static java.lang.String j6(int r2) {
        return "v" + r2;
    }

    private java.lang.String j6(boolean r4) {
        java.lang.StringBuffer r0 = null;
        abcd.Vr r1 = null;
        abcd.Qs r2 = null;
        abcd.Rs r3 = null;
        abcd.Rs r5 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuffer(40);
                    r0.append(lg());
                    r0.append(":");
                    r1 = this.v5;
                    if (r1 == null) { $pc5 = 5; continue $sw5; }
                    r0.append(r1.toString());
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r2 = this.Hw.getType();
                    r0.append(r2);
                    if (r2 == this.Hw) { $pc5 = 18; continue $sw5; }
                    r0.append("=");
                    if (r4 == false) { $pc5 = 12; continue $sw5; }
                    r3 = this.Hw;
                    if ((r3 instanceof abcd.Js) == false) { $pc5 = 12; continue $sw5; }
                    r0.append(((abcd.Js) r3).lg());
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    if (r4 == false) { $pc5 = 16; continue $sw5; }
                    r5 = this.Hw;
                    if ((r5 instanceof abcd.Abstractms) == false) { $pc5 = 16; continue $sw5; }
                    r0.append(r5.aM());
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    r0.append(this.Hw);
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(abcd.bs r0, int r1, abcd.Rs r2, abcd.Vr r3) {
        return r0.Hw(r1, r2, r3);
    }

    private static int v5(int r0, abcd.Rs r1, abcd.Vr r2) {
        int r3 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2 == null) { $pc6 = 4; continue $sw6; }
                    r3 = r2.hashCode();
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return (((r3 * 31) + r1.hashCode()) * 31) + r0;
                }
                case 4: {
                    r3 = 0;
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs DW(int r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 != 0) { $pc7 = 5; continue $sw7; }
                    return this;
                }
                case 5: {
                    return FH(this.FH + r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(abcd.bs r3) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (FH(r3) == true) { $pc8 = 6; continue $sw8; }
                    return false;
                }
                case 6: {
                    if (this.FH != r3.FH) { $pc8 = 9; continue $sw8; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs FH(int r3) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.FH != r3) { $pc9 = 6; continue $sw9; }
                    return this;
                }
                case 6: {
                    return FH(r3, this.Hw, this.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH(abcd.bs r4) {
        abcd.Vr r1 = null;
        abcd.Vr r5 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r4 != null) { $pc10 = 6; continue $sw10; }
                    return false;
                }
                case 6: {
                    if (this.Hw.getType().equals(r4.Hw.getType()) == false) { $pc10 = 14; continue $sw10; }
                    r1 = this.v5;
                    r5 = r4.v5;
                    if (r1 == r5) { $pc10 = 12; continue $sw10; }
                    if (r1 != null) { $pc10 = 11; continue $sw10; }
                    return false;
                }
                case 11: {
                    if (r1.equals(r5) == true) { $pc10 = 12; continue $sw10; }
                    return false;
                }
                case 12: {
                    return true;
                }
                case 14: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Hw() {
        return this.Hw.getType().Zo();
    }

    public abcd.Rs J8() {
        return this.Hw;
    }

    @Override
    public final int Mr() {
        return this.Hw.Mr();
    }

    @Override
    public abcd.Rs U2() {
        return this.Hw.U2();
    }

    public int VH() {
        return this.FH + Hw();
    }

    public boolean Ws() {
        return this.Hw.getType().yS();
    }

    public abcd.Vr Zo() {
        return this.v5;
    }

    @Override
    public final boolean a8() {
        return false;
    }

    @Override
    public java.lang.String aM() {
        return j6(true);
    }

    @Override
    public int compareTo(abcd.bs r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r3) {
        abcd.bs r4 = null;
        abcd.bs.a r5 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if ((r3 instanceof abcd.bs) == false) { $pc11 = 5; continue $sw11; }
                    r4 = (abcd.bs) r3;
                    return Hw(r4.FH, r4.Hw, r4.v5);
                }
                case 5: {
                    if ((r3 instanceof abcd.bs.a) == false) { $pc11 = 8; continue $sw11; }
                    r5 = (abcd.bs.a) r3;
                    return Hw(abcd.bs.a.j6(r5), abcd.bs.a.DW(r5), abcd.bs.a.FH(r5));
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Qs getType() {
        return this.Hw.getType();
    }

    public int hashCode() {
        return v5(this.FH, this.Hw, this.v5);
    }

    @Override
    public final int j3() {
        return this.Hw.j3();
    }

    public int j6(abcd.bs r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.Vr r3 = null;
        abcd.Vr r6 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.FH;
                    r1 = r5.FH;
                    if (r0 >= r1) { $pc12 = 6; continue $sw12; }
                    return -1;
                }
                case 6: {
                    if (r0 <= r1) { $pc12 = 8; continue $sw12; }
                    return 1;
                }
                case 8: {
                    r2 = this.Hw.getType().j6(r5.Hw.getType());
                    if (r2 == 0) { $pc12 = 11; continue $sw12; }
                    return r2;
                }
                case 11: {
                    r3 = this.v5;
                    if (r3 == null) { $pc12 = 14; continue $sw12; }
                    r6 = r5.v5;
                    if (r6 != null) { $pc12 = 21; continue $sw12; }
                    return 1;
                }
                case 21: {
                    return r3.j6(r6);
                }
                case 14: {
                    if (r5.v5 != null) { $pc12 = 22; continue $sw12; }
                    return 0;
                }
                case 22: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs j6(abcd.Rs r3) {
        return FH(this.FH, r3, this.v5);
    }

    public abcd.bs j6(abcd.Vr r3) {
        abcd.Vr r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == r3) { $pc13 = 10; continue $sw13; }
                    if (r0 == null) { $pc13 = 9; continue $sw13; }
                    if (r0.equals(r3) == true) { $pc13 = 10; continue $sw13; }
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    return FH(this.FH, this.Hw, r3);
                }
                case 10: {
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.bs j6(abcd.bs r5, boolean r6) {
        abcd.Vr r1 = null;
        abcd.Vr r2 = null;
        boolean r3 = false;
        abcd.Rs r7 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this != r5) { $pc14 = 5; continue $sw14; }
                    return this;
                }
                case 5: {
                    if (r5 != null) { $pc14 = 7; continue $sw14; }
                    $pc14 = 37; continue $sw14;
                }
                case 37: {
                    return null;
                }
                case 7: {
                    if (this.FH != r5.we()) { $pc14 = 37; continue $sw14; }
                    r1 = this.v5;
                    if (r1 != null) { $pc14 = 12; continue $sw14; }
                    $pc14 = 15; continue $sw14;
                }
                case 15: {
                    r2 = null;
                    $pc14 = 17; continue $sw14;
                }
                case 17: {
                    if (r2 != this.v5) { $pc14 = 19; continue $sw14; }
                    r3 = true;
                    $pc14 = 20; continue $sw14;
                }
                case 20: {
                    if (r6 == false) { $pc14 = 23; continue $sw14; }
                    if (r3 == true) { $pc14 = 23; continue $sw14; }
                    return null;
                }
                case 23: {
                    r7 = getType();
                    if (r7 == r5.getType()) { $pc14 = 27; continue $sw14; }
                    return null;
                }
                case 27: {
                    if (this.Hw.equals(r5.J8()) == false) { $pc14 = 30; continue $sw14; }
                    r7 = this.Hw;
                    $pc14 = 30; continue $sw14;
                }
                case 30: {
                    if (r7 != this.Hw) { $pc14 = 33; continue $sw14; }
                    if (r3 == false) { $pc14 = 33; continue $sw14; }
                    return this;
                }
                case 33: {
                    if (r2 != null) { $pc14 = 36; continue $sw14; }
                    return j6(this.FH, r7);
                }
                case 36: {
                    return DW(this.FH, r7, r2);
                }
                case 19: {
                    r3 = false;
                    { $pc14 = 20; continue $sw14; }
                }
                case 12: {
                    if (r1.equals(r5.Zo()) == false) { $pc14 = 15; continue $sw14; }
                    r2 = this.v5;
                    { $pc14 = 17; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String lg() {
        return j6(this.FH);
    }

    public abcd.bs rN() {
        abcd.Rs r0 = null;
        abcd.Qs r1 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.Hw;
                    if ((r0 instanceof abcd.Qs) == false) { $pc15 = 5; continue $sw15; }
                    r1 = (abcd.Qs) r0;
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (r1.P8() == false) { $pc15 = 9; continue $sw15; }
                    r1 = r1.Ws();
                    $pc15 = 9; continue $sw15;
                }
                case 9: {
                    if (r1 != r0) { $pc15 = 12; continue $sw15; }
                    return this;
                }
                case 12: {
                    return FH(this.FH, r1, this.v5);
                }
                case 5: {
                    r1 = r0.getType();
                    { $pc15 = 7; continue $sw15; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return j6(false);
    }

    public int we() {
        return this.FH;
    }
}
