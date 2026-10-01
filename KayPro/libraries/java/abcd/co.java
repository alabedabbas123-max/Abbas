package abcd;

public final class co extends abcd.Xt {
    public static final abcd.co FH = null;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.co.a DW = null;
        public static final abcd.co.a FH = null;
        public static final abcd.co.a Hw = null;
        private static final abcd.co.a[] VH = null;
        public static final abcd.co.a Zo = null;
        public static final abcd.co.a j6 = null;
        public static final abcd.co.a v5 = null;

        static {
            j6 = new abcd.co.a("START", 0);
            DW = new abcd.co.a("END_SIMPLY", 1);
            FH = new abcd.co.a("END_REPLACED", 2);
            Hw = new abcd.co.a("END_MOVED", 3);
            v5 = new abcd.co.a("END_CLOBBERED_BY_PREV", 4);
            Zo = new abcd.co.a("END_CLOBBERED_BY_NEXT", 5);
            VH = new abcd.co.a[]{j6, DW, FH, Hw, v5, Zo};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.co.a valueOf(java.lang.String r1) {
            return (abcd.co.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.co.a.values(), r1);
        }

        public static abcd.co.a[] values() {
            return (abcd.co.a[]) VH.clone();
        }
    }

    public static class b implements java.lang.Comparable<abcd.co.b> {
        private final abcd.co.a DW;
        private final abcd.bs FH;
        private final abcd.Ks Hw;
        private final int j6;

        public b(int r2, abcd.co.a r3, abcd.bs r4) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r2 < 0) { $pc0 = 16; continue $sw0; }
                        if (r3 == null) { $pc0 = 14; continue $sw0; }
                        if (r4.Zo() == null) { $pc0 = 10; continue $sw0; }
                        this.j6 = r2;
                        this.DW = r3;
                        this.FH = r4;
                        this.Hw = abcd.Ks.DW(r4.getType());
                        return;
                    }
                    case 10: {
                        try {
                            throw new java.lang.NullPointerException("spec.getLocalItem() == null");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.NullPointerException) { $pc0 = 11; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 12: {
                        throw new java.lang.NullPointerException("spec == null");
                    }
                    case 14: {
                        throw new java.lang.NullPointerException("disposition == null");
                    }
                    case 16: {
                        throw new java.lang.IllegalArgumentException("address < 0");
                    }
                    case 11: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public boolean DW(abcd.co.b r1) {
            return j6(r1.FH);
        }

        public int Hw() {
            return this.j6;
        }

        public abcd.bs J8() {
            return this.FH;
        }

        public abcd.Js VH() {
            return this.FH.Zo().Hw();
        }

        public abcd.Js Ws() {
            return this.FH.Zo().Zo();
        }

        public abcd.co.a Zo() {
            return this.DW;
        }

        public abcd.Ks aM() {
            return this.Hw;
        }

        @Override
        public int compareTo(abcd.co.b r1) {
            return j6(r1);
        }

        public boolean equals(java.lang.Object r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ((r3 instanceof abcd.co.b) == true) { $pc1 = 6; continue $sw1; }
                        return false;
                    }
                    case 6: {
                        if (j6((abcd.co.b) r3) != 0) { $pc1 = 9; continue $sw1; }
                        return true;
                    }
                    case 9: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public boolean j3() {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.DW != abcd.co.a.j6) { $pc2 = 5; continue $sw2; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int j6(abcd.co.b r5) {
            int r0 = 0;
            int r1 = 0;
            boolean r2 = false;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.j6;
                        r1 = r5.j6;
                        if (r0 >= r1) { $pc3 = 6; continue $sw3; }
                        return -1;
                    }
                    case 6: {
                        if (r0 <= r1) { $pc3 = 8; continue $sw3; }
                        return 1;
                    }
                    case 8: {
                        r2 = j3();
                        if (r2 == r5.j3()) { $pc3 = 14; continue $sw3; }
                        if (r2 == false) { $pc3 = 15; continue $sw3; }
                        return 1;
                    }
                    case 15: {
                        return -1;
                    }
                    case 14: {
                        return this.FH.j6(r5.FH);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.co.b j6(abcd.co.a r4) {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (r4 != this.DW) { $pc4 = 6; continue $sw4; }
                        return this;
                    }
                    case 6: {
                        return new abcd.co.b(this.j6, r4, this.FH);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public boolean j6(abcd.bs r2) {
            return this.FH.DW(r2);
        }

        public java.lang.String toString() {
            return java.lang.Integer.toHexString(this.j6) + " " + this.DW + " " + this.FH;
        }

        public int we() {
            return this.FH.we();
        }
    }

    public static class c {
        private int DW;
        private abcd.ds FH;
        private int[] Hw;
        private final java.util.ArrayList<abcd.co.b> j6;
        private int v5;

        public c(int r2) {
            this.j6 = new java.util.ArrayList(r2);
            this.DW = 0;
            this.FH = null;
            this.Hw = null;
            this.v5 = 0;
        }

        private void DW(int r4, abcd.co.a r5, abcd.bs r6) {
            int r0 = 0;
            int r1 = 0;
            abcd.co.b r2 = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        if (r5 == abcd.co.a.j6) { $pc5 = 15; continue $sw5; }
                        r0 = r6.we();
                        r1 = this.Hw[r0];
                        if (r1 < 0) { $pc5 = 12; continue $sw5; }
                        r2 = this.j6.get(r1);
                        if (r2.Hw() != r4) { $pc5 = 12; continue $sw5; }
                        if (r2.J8().equals(r6) == false) { $pc5 = 12; continue $sw5; }
                        this.j6.set(r1, r2.j6(r5));
                        this.FH.Hw(r6);
                        return;
                    }
                    case 12: {
                        j6(r4, r6, r5);
                        return;
                    }
                    case 15: {
                        throw new java.lang.RuntimeException("shouldn't happen");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private boolean FH(int r6, abcd.bs r7) {
            int r0 = 0;
            boolean r2 = false;
            abcd.co.b r3 = null;
            abcd.co.b r4 = null;
            int r8 = 0;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        r0 = this.j6.size() - 1;
                        $pc6 = 3; continue $sw6;
                    }
                    case 3: {
                        r2 = false;
                        if (r0 < 0) { $pc6 = 15; continue $sw6; }
                        r3 = this.j6.get(r0);
                        if (r3 == null) { $pc6 = 14; continue $sw6; }
                        if (r3.Hw() != r6) { $pc6 = 10; continue $sw6; }
                        if (r3.j6(r7) == false) { $pc6 = 14; continue $sw6; }
                        $pc6 = 10; continue $sw6;
                    }
                    case 10: {
                        return false;
                    }
                    case 14: {
                        r0 = r0 - 1;
                        $pc6 = 15; continue $sw6;
                    }
                    case 15: {
                        this.FH.Hw(r7);
                        r4 = null;
                        this.j6.set(r0, null);
                        this.DW++;
                        r8 = r7.we();
                        $pc6 = 16; continue $sw6;
                    }
                    case 16: {
                        r0 = r0 - 1;
                        if (r0 < 0) { $pc6 = 24; continue $sw6; }
                        r4 = this.j6.get(r0);
                        if (r4 == null) { $pc6 = 16; continue $sw6; }
                        if (r4.J8().we() != r8) { $pc6 = 16; continue $sw6; }
                        r2 = true;
                        $pc6 = 24; continue $sw6;
                    }
                    case 24: {
                        if (r2 == false) { $pc6 = 28; continue $sw6; }
                        this.Hw[r8] = r0;
                        if (r4.Hw() != r6) { $pc6 = 28; continue $sw6; }
                        this.j6.set(r0, r4.j6(abcd.co.a.DW));
                        $pc6 = 28; continue $sw6;
                    }
                    case 28: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static abcd.bs j6(abcd.bs r2) {
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        if (r2 != null) { $pc7 = 4; continue $sw7; }
                        return r2;
                    }
                    case 4: {
                        if (r2.getType() == abcd.Qs.EQ) { $pc7 = 6; continue $sw7; }
                        return r2;
                    }
                    case 6: {
                        return r2.j6(abcd.Qs.QX);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void j6(int r5, int r6) {
            boolean r0 = false;
            int r7 = 0;
            abcd.ds r8 = null;
            int[] r9 = null;
            int[] r1 = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        if (this.Hw != null) { $pc8 = 5; continue $sw8; }
                        r0 = true;
                        $pc8 = 7; continue $sw8;
                    }
                    case 7: {
                        if (r5 != this.v5) { $pc8 = 11; continue $sw8; }
                        if (r0 == true) { $pc8 = 11; continue $sw8; }
                        return;
                    }
                    case 11: {
                        if (r5 < this.v5) { $pc8 = 21; continue $sw8; }
                        if (r0 == false) { $pc8 = 14; continue $sw8; }
                        $pc8 = 15; continue $sw8;
                    }
                    case 15: {
                        r7 = r6 + 1;
                        r8 = new abcd.ds(r7);
                        r9 = new int[r7];
                        java.util.Arrays.fill(r9, -1);
                        if (r0 == true) { $pc8 = 18; continue $sw8; }
                        r8.j6(this.FH);
                        r1 = this.Hw;
                        java.lang.System.arraycopy(r1, 0, r9, 0, r1.length);
                        $pc8 = 18; continue $sw8;
                    }
                    case 18: {
                        this.FH = r8;
                        this.Hw = r9;
                        return;
                    }
                    case 14: {
                        if (r6 >= this.Hw.length) { $pc8 = 15; continue $sw8; }
                        return;
                    }
                    case 21: {
                        throw new java.lang.RuntimeException("shouldn't happen");
                    }
                    case 5: {
                        r0 = false;
                        { $pc8 = 7; continue $sw8; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void j6(int r4, abcd.co.a r5, abcd.bs r6) {
            int r0 = 0;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        r0 = r6.we();
                        this.j6.add(new abcd.co.b(r4, r5, r6));
                        if (r5 != abcd.co.a.j6) { $pc9 = 5; continue $sw9; }
                        this.FH.FH(r6);
                        this.Hw[r0] = -1;
                        return;
                    }
                    case 5: {
                        this.FH.Hw(r6);
                        this.Hw[r0] = this.j6.size() - 1;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void DW(int r5, abcd.bs r6) {
            int r0 = 0;
            abcd.bs r7 = null;
            abcd.bs r1 = null;
            abcd.bs r2 = null;
            int r3 = 0;
            abcd.bs r4 = null;
            abcd.bs r8 = null;
            abcd.co.b r9 = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        r0 = r6.we();
                        r7 = j6(r6);
                        j6(r5, r0);
                        r1 = this.FH.get(r0);
                        if (r7.DW(r1) == false) { $pc10 = 5; continue $sw10; }
                        return;
                    }
                    case 5: {
                        r2 = this.FH.j6(r7);
                        if (r2 == null) { $pc10 = 8; continue $sw10; }
                        DW(r5, abcd.co.a.Hw, r2);
                        $pc10 = 8; continue $sw10;
                    }
                    case 8: {
                        r3 = this.Hw[r0];
                        if (r1 == null) { $pc10 = 11; continue $sw10; }
                        j6(r5, abcd.co.a.FH, r1);
                        $pc10 = 19; continue $sw10;
                    }
                    case 19: {
                        if (r0 <= 0) { $pc10 = 26; continue $sw10; }
                        r4 = this.FH.get(r0 - 1);
                        if (r4 == null) { $pc10 = 26; continue $sw10; }
                        if (r4.Ws() == false) { $pc10 = 26; continue $sw10; }
                        DW(r5, abcd.co.a.Zo, r4);
                        $pc10 = 26; continue $sw10;
                    }
                    case 26: {
                        if (r7.Ws() == false) { $pc10 = 30; continue $sw10; }
                        r8 = this.FH.get(r0 + 1);
                        if (r8 == null) { $pc10 = 30; continue $sw10; }
                        DW(r5, abcd.co.a.v5, r8);
                        $pc10 = 30; continue $sw10;
                    }
                    case 30: {
                        j6(r5, abcd.co.a.j6, r7);
                        return;
                    }
                    case 11: {
                        if (r3 < 0) { $pc10 = 19; continue $sw10; }
                        r9 = this.j6.get(r3);
                        if (r9.Hw() != r5) { $pc10 = 19; continue $sw10; }
                        if (r9.j6(r7) == false) { $pc10 = 18; continue $sw10; }
                        this.j6.set(r3, null);
                        this.DW++;
                        this.FH.FH(r7);
                        this.Hw[r0] = -1;
                        return;
                    }
                    case 18: {
                        this.j6.set(r3, r9.j6(abcd.co.a.FH));
                        { $pc10 = 19; continue $sw10; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public abcd.co j6() {
            int r0 = 0;
            int r1 = 0;
            int r2 = 0;
            abcd.co.b[] r3 = null;
            abcd.co r4 = null;
            java.util.Iterator<abcd.co.b> r5 = null;
            int r6 = 0;
            abcd.co.b r7 = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = -1;
            $sw11: while (true) {
                switch ($pc11) {
                    case -1: {
                        r0 = 0;
                        j6(Integer.MAX_VALUE, 0);
                        r1 = this.j6.size();
                        r2 = r1 - this.DW;
                        if (r2 == 0) { $pc11 = 5; continue $sw11; }
                        r3 = new abcd.co.b[r2];
                        if (r1 != r2) { $pc11 = 9; continue $sw11; }
                        this.j6.toArray(r3);
                        $pc11 = 15; continue $sw11;
                    }
                    case 15: {
                        java.util.Arrays.sort(r3);
                        r4 = new abcd.co(r2);
                        $pc11 = 16; continue $sw11;
                    }
                    case 16: {
                        if (r0 >= r2) { $pc11 = 18; continue $sw11; }
                        r4.j6(r0, r3[r0]);
                        r0 = r0 + 1;
                        { $pc11 = 16; continue $sw11; }
                    }
                    case 18: {
                        r4.we();
                        return r4;
                    }
                    case 9: {
                        r5 = this.j6.iterator();
                        r6 = 0;
                        $pc11 = 11; continue $sw11;
                    }
                    case 11: {
                        if (r5.hasNext() == false) { $pc11 = 15; continue $sw11; }
                        r7 = r5.next();
                        if (r7 == null) { $pc11 = 11; continue $sw11; }
                        r3[r6] = r7;
                        r6 = r6 + 1;
                        { $pc11 = 11; continue $sw11; }
                    }
                    case 5: {
                        return abcd.co.FH;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(int r2, abcd.bs r3) {
            j6(r2, r3, abcd.co.a.DW);
        }

        public void j6(int r3, abcd.bs r4, abcd.co.a r5) {
            int r0 = 0;
            abcd.bs r6 = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = -1;
            $sw12: while (true) {
                switch ($pc12) {
                    case -1: {
                        r0 = r4.we();
                        r6 = j6(r4);
                        j6(r3, r0);
                        if (this.Hw[r0] < 0) { $pc12 = 6; continue $sw12; }
                        return;
                    }
                    case 6: {
                        if (FH(r3, r6) == false) { $pc12 = 8; continue $sw12; }
                        return;
                    }
                    case 8: {
                        j6(r3, r5, r6);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(int r6, abcd.ds r7) {
            int r0 = 0;
            int r1 = 0;
            abcd.bs r2 = null;
            abcd.bs r3 = null;
            java.lang.Throwable $ex13 = null;
            int $pc13 = -1;
            $sw13: while (true) {
                switch ($pc13) {
                    case -1: {
                        r0 = r7.lg();
                        j6(r6, r0 - 1);
                        r1 = 0;
                        $pc13 = 3; continue $sw13;
                    }
                    case 3: {
                        if (r1 >= r0) { $pc13 = 14; continue $sw13; }
                        r2 = this.FH.get(r1);
                        r3 = j6(r7.get(r1));
                        if (r2 != null) { $pc13 = 8; continue $sw13; }
                        if (r3 == null) { $pc13 = 13; continue $sw13; }
                        DW(r6, r3);
                        $pc13 = 13; continue $sw13;
                    }
                    case 13: {
                        r1 = r1 + 1;
                        { $pc13 = 3; continue $sw13; }
                    }
                    case 8: {
                        if (r3 != null) { $pc13 = 11; continue $sw13; }
                        j6(r6, r2);
                        { $pc13 = 13; continue $sw13; }
                    }
                    case 11: {
                        if (r3.DW(r2) == true) { $pc13 = 13; continue $sw13; }
                        j6(r6, r2);
                        DW(r6, r3);
                        { $pc13 = 13; continue $sw13; }
                    }
                    case 14: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        FH = new abcd.co(0);
    }

    public co(int r1) {
        super(r1);
    }

    public static abcd.co j6(abcd.Wn r5) {
        int r0 = 0;
        abcd.co.c r1 = null;
        int r2 = 0;
        abcd.AbstractVn r3 = null;
        abcd.ds r4 = null;
        abcd.bs r6 = null;
        abcd.bs r7 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = r5.size();
                    r1 = new abcd.co.c(r0);
                    r2 = 0;
                    $pc14 = 3; continue $sw14;
                }
                case 3: {
                    if (r2 >= r0) { $pc14 = 15; continue $sw14; }
                    r3 = r5.get(r2);
                    if ((r3 instanceof abcd.Cdo) == false) { $pc14 = 8; continue $sw14; }
                    r4 = ((abcd.Cdo) r3).we();
                    r1.j6(r3.FH(), r4);
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    r2 = r2 + 1;
                    { $pc14 = 3; continue $sw14; }
                }
                case 8: {
                    if ((r3 instanceof abcd.eo) == false) { $pc14 = 11; continue $sw14; }
                    r6 = ((abcd.eo) r3).we();
                    r1.DW(r3.FH(), r6);
                    { $pc14 = 13; continue $sw14; }
                }
                case 11: {
                    if ((r3 instanceof abcd.bo) == false) { $pc14 = 13; continue $sw14; }
                    r7 = ((abcd.bo) r3).we();
                    r1.j6(r3.FH(), r7);
                    { $pc14 = 13; continue $sw14; }
                }
                case 15: {
                    return r1.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.co.b get(int r1) {
        return (abcd.co.b) DW(r1);
    }

    public void j6(int r1, abcd.co.b r2) {
        j6(r1, r2);
    }
}
