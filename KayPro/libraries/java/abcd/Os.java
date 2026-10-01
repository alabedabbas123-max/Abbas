package abcd;

public final class Os implements java.lang.Comparable<abcd.Os> {
    private static final java.util.HashMap<java.lang.String, abcd.Os> j6 = null;
    private final java.lang.String DW;
    private final abcd.Qs FH;
    private final abcd.Ps Hw;
    private abcd.Ps v5;

    static {
        j6 = new java.util.HashMap(500);
    }

    private Os(java.lang.String r1, abcd.Qs r2, abcd.Ps r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 13; continue $sw0; }
                    if (r2 == null) { $pc0 = 11; continue $sw0; }
                    if (r3 == null) { $pc0 = 9; continue $sw0; }
                    this.DW = r1;
                    this.FH = r2;
                    this.Hw = r3;
                    this.v5 = null;
                    return;
                }
                case 9: {
                    throw new java.lang.NullPointerException("parameterTypes == null");
                }
                case 11: {
                    throw new java.lang.NullPointerException("returnType == null");
                }
                case 13: {
                    throw new java.lang.NullPointerException("descriptor == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.Os DW(abcd.Os r3) {
        synchronized (j6) {
            java.util.HashMap<java.lang.String, abcd.Os> r0 = null;
            java.lang.String r1 = null;
            abcd.Os r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = j6;
                        try {
                            r1 = r3.Hw();
                            r2 = j6.get(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        if (r2 == null) { $pc1 = 8; continue $sw1; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        return r2;
                    }
                    case 8: {
                        try {
                            j6.put(r1, r3);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        return r3;
                    }
                    case 11: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private static abcd.Qs[] DW(java.lang.String r8) {
        int r0 = 0;
        int r1 = 0;
        int r4 = 0;
        int r5 = 0;
        char r7 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r8.length();
                    r1 = 0;
                    if (r8.charAt(0) != '(') { $pc2 = 28; continue $sw2; }
                    r4 = 1;
                    r5 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r4 >= r0) { $pc2 = 16; continue $sw2; }
                    r7 = r8.charAt(r4);
                    if (r7 == ')') { $pc2 = 9; continue $sw2; }
                    if (r7 < 'A') { $pc2 = 15; continue $sw2; }
                    if (r7 > 'Z') { $pc2 = 15; continue $sw2; }
                    r5 = r5 + 1;
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r4 = r4 + 1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 9: {
                    r1 = r4;
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    if (r1 == 0) { $pc2 = 26; continue $sw2; }
                    if (r1 == (r0 - 1)) { $pc2 = 26; continue $sw2; }
                    if (r8.indexOf(41, r1 + 1) != (-1)) { $pc2 = 24; continue $sw2; }
                    return new abcd.Qs[r5];
                }
                case 24: {
                    throw new java.lang.IllegalArgumentException("bad descriptor");
                }
                case 26: {
                    throw new java.lang.IllegalArgumentException("bad descriptor");
                }
                case 28: {
                    throw new java.lang.IllegalArgumentException("bad descriptor");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Os j6(abcd.Qs r3, int r4) {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.lang.StringBuffer(100);
                    r0.append('(');
                    r1 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r1 >= r4) { $pc3 = 5; continue $sw3; }
                    r0.append('I');
                    r1 = r1 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    r0.append(')');
                    r0.append(r3.J8());
                    return j6(r0.toString());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Os j6(java.lang.String r8) {
        synchronized (j6) {
            java.util.HashMap<java.lang.String, abcd.Os> r0 = null;
            abcd.Os r1 = null;
            abcd.Qs[] r2 = null;
            int r3 = 0;
            int r4 = 0;
            int r5 = 0;
            char r6 = 0;
            int r7 = 0;
            int r9 = 0;
            int r10 = 0;
            abcd.Qs r11 = null;
            abcd.Ps r12 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (r8 == null) { $pc4 = 34; continue $sw4; }
                        r0 = j6;
                        try {
                            r1 = j6.get(r8);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 30; continue $sw4;
                        }
                        if (r1 == null) { $pc4 = 9; continue $sw4; }
                        return r1;
                    }
                    case 9: {
                        r2 = DW(r8);
                        r3 = 0;
                        r4 = 1;
                        r5 = 0;
                        $pc4 = 10; continue $sw4;
                    }
                    case 10: {
                        r6 = r8.charAt(r4);
                        if (r6 == ')') { $pc4 = 12; continue $sw4; }
                        r7 = r4;
                        $pc4 = 19; continue $sw4;
                    }
                    case 19: {
                        if (r6 != '[') { $pc4 = 22; continue $sw4; }
                        r7 = r7 + 1;
                        r6 = r8.charAt(r7);
                        { $pc4 = 19; continue $sw4; }
                    }
                    case 22: {
                        if (r6 != 'L') { $pc4 = 28; continue $sw4; }
                        r9 = r8.indexOf(59, r7);
                        if (r9 == (-1)) { $pc4 = 27; continue $sw4; }
                        r10 = r9 + 1;
                        $pc4 = 29; continue $sw4;
                    }
                    case 29: {
                        r2[r5] = abcd.Qs.j6(r8.substring(r4, r10));
                        r5 = r5 + 1;
                        r4 = r10;
                        { $pc4 = 10; continue $sw4; }
                    }
                    case 27: {
                        throw new java.lang.IllegalArgumentException("bad descriptor");
                    }
                    case 28: {
                        r10 = r7 + 1;
                        { $pc4 = 29; continue $sw4; }
                    }
                    case 12: {
                        r11 = abcd.Qs.FH(r8.substring(r4 + 1));
                        r12 = new abcd.Ps(r5);
                        $pc4 = 13; continue $sw4;
                    }
                    case 13: {
                        if (r3 >= r5) { $pc4 = 16; continue $sw4; }
                        r12.j6(r3, r2[r3]);
                        r3 = r3 + 1;
                        { $pc4 = 13; continue $sw4; }
                    }
                    case 16: {
                        return DW(new abcd.Os(r8, r11, r12));
                    }
                    case 30: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 34: {
                        throw new java.lang.NullPointerException("descriptor == null");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static abcd.Os j6(java.lang.String r0, abcd.Qs r1, boolean r2, boolean r3) {
        abcd.Os r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r4 = j6(r0);
                    if (r2 == false) { $pc5 = 5; continue $sw5; }
                    return r4;
                }
                case 5: {
                    if (r3 == false) { $pc5 = 8; continue $sw5; }
                    r1 = r1.j6(Integer.MAX_VALUE);
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    return r4.j6(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String Hw() {
        return this.DW;
    }

    public abcd.Ps VH() {
        return this.Hw;
    }

    public abcd.Ps Zo() {
        int r0 = 0;
        abcd.Ps r1 = null;
        int r2 = 0;
        boolean r3 = false;
        abcd.Qs r4 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.v5 != null) { $pc6 = 15; continue $sw6; }
                    r0 = this.Hw.size();
                    r1 = new abcd.Ps(r0);
                    r2 = 0;
                    r3 = false;
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    if (r2 >= r0) { $pc6 = 10; continue $sw6; }
                    r4 = this.Hw.get(r2);
                    if (r4.gW() == false) { $pc6 = 9; continue $sw6; }
                    r4 = abcd.Qs.VH;
                    r3 = true;
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    r1.j6(r2, r4);
                    r2 = r2 + 1;
                    { $pc6 = 5; continue $sw6; }
                }
                case 10: {
                    if (r3 == true) { $pc6 = 13; continue $sw6; }
                    r1 = this.Hw;
                    $pc6 = 13; continue $sw6;
                }
                case 13: {
                    this.v5 = r1;
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int compareTo(abcd.Os r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this != r2) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    if ((r2 instanceof abcd.Os) == true) { $pc7 = 10; continue $sw7; }
                    return false;
                }
                case 10: {
                    return this.DW.equals(((abcd.Os) r2).DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    public int j6(abcd.Os r8) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this != r8) { $pc8 = 5; continue $sw8; }
                    return 0;
                }
                case 5: {
                    r1 = this.FH.j6(r8.FH);
                    if (r1 == 0) { $pc8 = 8; continue $sw8; }
                    return r1;
                }
                case 8: {
                    r2 = this.Hw.size();
                    r3 = r8.Hw.size();
                    r4 = java.lang.Math.min(r2, r3);
                    r5 = 0;
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    if (r5 >= r4) { $pc8 = 14; continue $sw8; }
                    r6 = this.Hw.get(r5).j6(r8.Hw.get(r5));
                    if (r6 != 0) { $pc8 = 12; continue $sw8; }
                    r5 = r5 + 1;
                    { $pc8 = 9; continue $sw8; }
                }
                case 12: {
                    return r6;
                }
                case 14: {
                    if (r2 >= r3) { $pc8 = 17; continue $sw8; }
                    return -1;
                }
                case 17: {
                    if (r2 <= r3) { $pc8 = 20; continue $sw8; }
                    return 1;
                }
                case 20: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Os j6(abcd.Qs r4) {
        java.lang.String r0 = "(" + r4.J8() + this.DW.substring(1);
        abcd.Ps r5 = this.Hw.FH(r4);
        r5.we();
        return DW(new abcd.Os(r0, this.FH, r5));
    }

    public java.lang.String toString() {
        return this.DW;
    }

    public abcd.Qs we() {
        return this.FH;
    }
}
