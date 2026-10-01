package abcd;

public class MK extends java.util.AbstractMap<java.lang.String, abcd.ME> {
    private KK<abcd.ME> DW;
    private KK<abcd.ME> FH;
    private KK<abcd.ME> Hw;
    private java.util.Set<java.util.Map.Entry<java.lang.String, abcd.ME>> VH;
    private boolean Zo;
    private final java.lang.String j6;
    private int v5;

    private class a implements java.util.Map.Entry<java.lang.String, abcd.ME> {
        final abcd.MK DW;
        private abcd.ME j6;

        a(abcd.MK r1, abcd.ME r2) {
            this.DW = r1;
            this.j6 = r2;
        }

        @Override
        public boolean equals(java.lang.Object r3) {
            java.util.Map.Entry r4 = null;
            java.lang.Object r0 = null;
            java.lang.Object r5 = null;
            abcd.ME r6 = null;
            abcd.yE r7 = null;
            abcd.yE r1 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if ((r3 instanceof java.util.Map.Entry) == false) { $pc0 = 17; continue $sw0; }
                        r4 = (java.util.Map.Entry) r3;
                        r0 = r4.getKey();
                        r5 = r4.getValue();
                        if ((r0 instanceof java.lang.String) == true) { $pc0 = 7; continue $sw0; }
                        return false;
                    }
                    case 7: {
                        if ((r5 instanceof abcd.ME) == false) { $pc0 = 20; continue $sw0; }
                        r6 = (abcd.ME) r5;
                        if (r6.getName().equals(this.j6.getName()) == false) { $pc0 = 21; continue $sw0; }
                        r7 = r6.DW();
                        r1 = this.j6.DW();
                        if (r7 == null) { $pc0 = 22; continue $sw0; }
                        if (r1 != null) { $pc0 = 14; continue $sw0; }
                        return false;
                    }
                    case 14: {
                        if (abcd.YD.j6(r7, r1) == false) { $pc0 = 24; continue $sw0; }
                        return true;
                    }
                    case 24: {
                        return false;
                    }
                    case 22: {
                        return false;
                    }
                    case 21: {
                        return false;
                    }
                    case 20: {
                        return false;
                    }
                    case 17: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.String getKey() {
            return getKey2();
        }

        @Override
        public java.lang.String getKey2() {
            return abcd.MK.j6(this.DW, this.j6);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public abcd.ME getValue() {
            return this.j6;
        }

        @Override
        public abcd.ME getValue() {
            return getValue();
        }

        @Override
        public int hashCode() {
            return getKey2().hashCode();
        }

        public abcd.ME j6(abcd.ME r3) {
            abcd.ME r0 = this.DW.j6(getKey2(), r3);
            this.j6 = r3;
            return r0;
        }

        @Override
        public abcd.ME setValue(abcd.ME r1) {
            return j6(r1);
        }

        public java.lang.String toString() {
            return this.j6.toString();
        }
    }

    private class b implements java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.ME>> {
        private int DW;
        private int FH;
        private java.util.Map.Entry<java.lang.String, abcd.ME> Hw;
        private int j6;
        final abcd.MK v5;

        b(abcd.MK r3) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.v5 = r3;
                        if (abcd.MK.DW(r3).length() <= 0) { $pc1 = 6; continue $sw1; }
                        this.j6 = -(abcd.MK.FH(r3).DW(abcd.MK.DW(r3)) + 1);
                        this.DW = -(abcd.MK.Hw(r3).DW(abcd.MK.DW(r3)) + 1);
                        this.FH = -(abcd.MK.v5(r3).DW(abcd.MK.DW(r3)) + 1);
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private abcd.MK.a DW(abcd.ME r3) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (r3.getName().startsWith(abcd.MK.DW(this.v5)) == true) { $pc2 = 5; continue $sw2; }
                        this.j6 = abcd.MK.FH(this.v5).size();
                        this.DW = abcd.MK.Hw(this.v5).size();
                        this.FH = abcd.MK.v5(this.v5).size();
                        return null;
                    }
                    case 5: {
                        return new abcd.MK.a(this.v5, r3);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private abcd.ME j6(abcd.ME r3) {
            abcd.ME r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (this.FH >= abcd.MK.v5(this.v5).size()) { $pc3 = 12; continue $sw3; }
                        r0 = abcd.MK.v5(this.v5).get(this.FH);
                        r1 = abcd.NE.DW(r3, r0);
                        if (r1 != 0) { $pc3 = 8; continue $sw3; }
                        this.FH++;
                        return r0;
                    }
                    case 8: {
                        if (r1 <= 0) { $pc3 = 12; continue $sw3; }
                        throw new java.lang.IllegalStateException();
                    }
                    case 12: {
                        return r3;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean hasNext() {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if (this.Hw != null) { $pc4 = 6; continue $sw4; }
                        this.Hw = j6();
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        if (this.Hw == null) { $pc4 = 9; continue $sw4; }
                        return true;
                    }
                    case 9: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.util.Map.Entry<java.lang.String, abcd.ME> j6() {
            abcd.ME r0 = null;
            abcd.ME r1 = null;
            int r2 = 0;
            abcd.KK r3 = null;
            int r4 = 0;
            abcd.KK r5 = null;
            int r6 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        if (this.j6 >= abcd.MK.FH(this.v5).size()) { $pc5 = 15; continue $sw5; }
                        if (this.DW >= abcd.MK.Hw(this.v5).size()) { $pc5 = 15; continue $sw5; }
                        r0 = abcd.MK.FH(this.v5).get(this.j6);
                        r1 = abcd.MK.Hw(this.v5).get(this.DW);
                        r2 = abcd.NE.DW(r0, r1);
                        if (r2 >= 0) { $pc5 = 10; continue $sw5; }
                        this.j6++;
                        return DW(r0);
                    }
                    case 10: {
                        if (r2 != 0) { $pc5 = 12; continue $sw5; }
                        this.j6++;
                        $pc5 = 12; continue $sw5;
                    }
                    case 12: {
                        this.DW++;
                        return DW(j6(r1));
                    }
                    case 15: {
                        if (this.DW >= abcd.MK.Hw(this.v5).size()) { $pc5 = 19; continue $sw5; }
                        r3 = abcd.MK.Hw(this.v5);
                        r4 = this.DW;
                        this.DW = r4 + 1;
                        return DW(j6(r3.get(r4)));
                    }
                    case 19: {
                        if (this.j6 >= abcd.MK.FH(this.v5).size()) { $pc5 = 22; continue $sw5; }
                        r5 = abcd.MK.FH(this.v5);
                        r6 = this.j6;
                        this.j6 = r6 + 1;
                        return DW(r5.get(r6));
                    }
                    case 22: {
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.util.Map.Entry<java.lang.String, abcd.ME> next() {
            return next2();
        }

        @Override
        public java.util.Map.Entry<java.lang.String, abcd.ME> next2() {
            java.util.Map.Entry<java.lang.String, abcd.ME> r0 = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        if (hasNext() == false) { $pc6 = 7; continue $sw6; }
                        r0 = this.Hw;
                        this.Hw = j6();
                        return r0;
                    }
                    case 7: {
                        throw new java.util.NoSuchElementException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MK(java.lang.String r1, KK<? extends abcd.ME> r2, KK<? extends abcd.ME> r3, KK<? extends abcd.ME> r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    static java.lang.String DW(abcd.MK r0) {
        return r0.j6;
    }

    static void DW(abcd.MK r0, abcd.KK r1) {
        r0.FH = r1;
    }

    static abcd.KK FH(abcd.MK r0) {
        return r0.DW;
    }

    static void FH(abcd.MK r0, abcd.KK r1) {
        r0.Hw = r1;
    }

    static abcd.KK Hw(abcd.MK r0) {
        return r0.FH;
    }

    static boolean Zo(abcd.MK r0) {
        return r0.Zo;
    }

    static int j6(abcd.MK r0) {
        return r0.v5;
    }

    private java.lang.String j6(abcd.ME r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r3 = r2.getName();
                    if (this.j6.length() > 0) { $pc7 = 5; continue $sw7; }
                    return r3;
                }
                case 5: {
                    return r3.substring(this.j6.length());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(abcd.MK r0, abcd.ME r1) {
        return r0.j6(r1);
    }

    private java.lang.String j6(java.lang.String r3) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.j6.length() > 0) { $pc8 = 5; continue $sw8; }
                    return r3;
                }
                case 5: {
                    return java.lang.String.valueOf(this.j6) + r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd.MK r0, int r1) {
        r0.v5 = r1;
    }

    static void j6(abcd.MK r0, abcd.KK r1) {
        r0.DW = r1;
    }

    static void j6(abcd.MK r0, boolean r1) {
        r0.Zo = r1;
    }

    static abcd.KK v5(abcd.MK r0) {
        return r0.Hw;
    }

    @Override
    public boolean containsKey(java.lang.Object r1) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (get(r1) == null) { $pc9 = 6; continue $sw9; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Set<java.util.Map.Entry<java.lang.String, abcd.ME>> entrySet() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.VH != null) { $pc10 = 6; continue $sw10; }
                    this.VH = new abcd.LK(this);
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return this.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.ME get(java.lang.Object r2) {
        java.lang.String r3 = null;
        abcd.ME r0 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r3 = j6((java.lang.String) r2);
                    r0 = this.Hw.FH(r3);
                    if (r0 != null) { $pc11 = 5; continue $sw11; }
                    r0 = this.FH.FH(r3);
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    if (r0 == null) { $pc11 = 7; continue $sw11; }
                    return r0;
                }
                case 7: {
                    return this.DW.FH(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object get(java.lang.Object r1) {
        return get(r1);
    }

    @Override
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public abcd.ME j6(java.lang.String r5, abcd.ME r6) {
        java.lang.String r0 = null;
        java.util.Iterator<abcd.ME> r1 = null;
        abcd.ME r2 = null;
        int r3 = 0;
        abcd.ME r7 = null;
        abcd.ME r8 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = j6(r5);
                    if (r0.equals(r6.getName()) == false) { $pc12 = 18; continue $sw12; }
                    if (this.Hw.isEmpty() == true) { $pc12 = 11; continue $sw12; }
                    r1 = this.Hw.iterator();
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    if (r1.hasNext() == false) { $pc12 = 9; continue $sw12; }
                    r2 = r1.next();
                    this.FH = this.FH.j6(r2);
                    { $pc12 = 8; continue $sw12; }
                }
                case 9: {
                    this.Hw = abcd.KK.DW();
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    r3 = this.FH.DW(r0);
                    if (r3 < 0) { $pc12 = 15; continue $sw12; }
                    r7 = this.FH.FH(r0);
                    this.FH = this.FH.DW(r3, r6);
                    return r7;
                }
                case 15: {
                    r8 = get(r5);
                    this.FH = this.FH.j6(r3, r6);
                    this.Zo = false;
                    return r8;
                }
                case 18: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
        return j6((java.lang.String) r1, (abcd.ME) r2);
    }

    @Override
    public abcd.ME remove(java.lang.Object r5) {
        java.lang.String r6 = null;
        int r0 = 0;
        abcd.ME r2 = null;
        int r1 = 0;
        int r3 = 0;
        abcd.ME r4 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r6 = j6((java.lang.String) r5);
                    r0 = this.DW.DW(r6);
                    if (r0 < 0) { $pc13 = 5; continue $sw13; }
                    r2 = this.DW.FH(r6);
                    this.DW = this.DW.remove(r0);
                    this.Zo = false;
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    r1 = this.FH.DW(r6);
                    if (r1 < 0) { $pc13 = 9; continue $sw13; }
                    r2 = this.FH.FH(r6);
                    this.FH = this.FH.remove(r1);
                    this.Zo = false;
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    r3 = this.Hw.DW(r6);
                    if (r3 < 0) { $pc13 = 13; continue $sw13; }
                    r4 = this.Hw.FH(r6);
                    this.Hw = this.Hw.remove(r3);
                    this.Zo = false;
                    return r4;
                }
                case 13: {
                    return r2;
                }
                case 5: {
                    r2 = null;
                    { $pc13 = 6; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object remove(java.lang.Object r1) {
        return remove(r1);
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<abcd.ME> r1 = null;
        boolean r2 = false;
        abcd.ME r3 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append('[');
                    r1 = values().iterator();
                    r2 = true;
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc14 = 5; continue $sw14; }
                    r3 = r1.next();
                    if (r2 == false) { $pc14 = 10; continue $sw14; }
                    r2 = false;
                    $pc14 = 11; continue $sw14;
                }
                case 11: {
                    r0.append(r3);
                    { $pc14 = 4; continue $sw14; }
                }
                case 10: {
                    r0.append(", ");
                    { $pc14 = 11; continue $sw14; }
                }
                case 5: {
                    r0.append(']');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
