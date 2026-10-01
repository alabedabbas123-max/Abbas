package abcd;

public class Bt implements java.lang.Runnable {
    private int DW;
    private final int FH;
    private int Hw;
    private final java.util.ArrayList<abcd.Vr> Zo;
    private final abcd.yt j6;
    private final abcd.bs[][] v5;

    private class a implements abcd.Abstractvt.a {
        private final abcd.bs[] DW;
        private final java.util.HashSet<abcd.Abstractvt> FH;
        private final java.util.HashMap<abcd.Abstractvt, abcd.Abstractvt> Hw;
        final abcd.Bt Zo;
        private final abcd.tt j6;
        private final abcd.Bt.a.C0000a v5;

        private class C0000a extends abcd.Abstractqt {
            final abcd.Bt.a j6;

            public C0000a(abcd.Bt.a r1) {
                this.j6 = r1;
            }

            @Override
            public int j6() {
                return abcd.Bt.DW(this.j6.Zo);
            }

            @Override
            public abcd.bs j6(abcd.bs r3) {
                int r0 = 0;
                java.lang.Throwable $ex0 = null;
                int $pc0 = -1;
                $sw0: while (true) {
                    switch ($pc0) {
                        case -1: {
                            if (r3 != null) { $pc0 = 5; continue $sw0; }
                            return null;
                        }
                        case 5: {
                            r0 = r3.we();
                            return r3.FH(abcd.Bt.a.DW(this.j6)[r0].we());
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }

        a(abcd.Bt r3, abcd.tt r4) {
            this.Zo = r3;
            this.j6 = r4;
            this.DW = abcd.Bt.j6(r3)[r4.DW()];
            this.FH = new java.util.HashSet();
            this.Hw = new java.util.HashMap();
            this.v5 = new abcd.Bt.a.C0000a(this);
            abcd.Bt.j6(r3)[r4.DW()] = null;
        }

        private void DW() {
            abcd.At r0 = null;
            java.util.BitSet r1 = null;
            int r2 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = new abcd.At(this);
                        r1 = this.j6.Ws();
                        r2 = r1.nextSetBit(0);
                        $pc1 = 3; continue $sw1;
                    }
                    case 3: {
                        if (r2 < 0) { $pc1 = 5; continue $sw1; }
                        abcd.Bt.Hw(this.Zo).DW().get(r2).j6(r0);
                        r2 = r1.nextSetBit(r2 + 1);
                        { $pc1 = 3; continue $sw1; }
                    }
                    case 5: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static abcd.bs[] DW(abcd.Bt.a r0) {
            return r0.DW;
        }

        static abcd.tt j6(abcd.Bt.a r0) {
            return r0.j6;
        }

        private void j6(int r5, abcd.bs r6) {
            int r0 = 0;
            abcd.Vr r1 = null;
            abcd.bs[] r2 = null;
            int r7 = 0;
            int r8 = 0;
            abcd.bs r9 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = r6.we();
                        r1 = r6.Zo();
                        r2 = this.DW;
                        r2[r5] = r6;
                        r7 = r2.length - 1;
                        $pc2 = 3; continue $sw2;
                    }
                    case 3: {
                        if (r7 < 0) { $pc2 = 8; continue $sw2; }
                        if (r0 != this.DW[r7].we()) { $pc2 = 7; continue $sw2; }
                        this.DW[r7] = r6;
                        $pc2 = 7; continue $sw2;
                    }
                    case 7: {
                        r7 = r7 - 1;
                        { $pc2 = 3; continue $sw2; }
                    }
                    case 8: {
                        if (r1 != null) { $pc2 = 10; continue $sw2; }
                        return;
                    }
                    case 10: {
                        abcd.Bt.j6(this.Zo, r6);
                        r8 = this.DW.length - 1;
                        $pc2 = 11; continue $sw2;
                    }
                    case 11: {
                        if (r8 < 0) { $pc2 = 18; continue $sw2; }
                        r9 = this.DW[r8];
                        if (r0 == r9.we()) { $pc2 = 17; continue $sw2; }
                        if (r1.equals(r9.Zo()) == false) { $pc2 = 17; continue $sw2; }
                        this.DW[r8] = r9.j6(null);
                        $pc2 = 17; continue $sw2;
                    }
                    case 17: {
                        r8 = r8 - 1;
                        { $pc2 = 11; continue $sw2; }
                    }
                    case 18: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void DW(abcd.mt r2) {
            r2.DW(this.v5);
            j6(r2);
        }

        public void j6() {
            java.util.ArrayList<abcd.Abstractvt> r0 = null;
            boolean r2 = false;
            int r1 = 0;
            abcd.Abstractvt r3 = null;
            abcd.Abstractvt r4 = null;
            java.util.Iterator<abcd.tt> r5 = null;
            abcd.tt r6 = null;
            abcd.bs[] r7 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        this.j6.j6(this);
                        DW();
                        r0 = this.j6.FH();
                        r2 = true;
                        r1 = r0.size() - 1;
                        $pc3 = 3; continue $sw3;
                    }
                    case 3: {
                        if (r1 < 0) { $pc3 = 13; continue $sw3; }
                        r3 = r0.get(r1);
                        r4 = this.Hw.get(r3);
                        if (r4 == null) { $pc3 = 8; continue $sw3; }
                        r0.set(r1, r4);
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        r1 = r1 - 1;
                        { $pc3 = 3; continue $sw3; }
                    }
                    case 8: {
                        if (r3.QX() == false) { $pc3 = 12; continue $sw3; }
                        if (this.FH.contains(r3) == true) { $pc3 = 12; continue $sw3; }
                        r0.remove(r1);
                        { $pc3 = 12; continue $sw3; }
                    }
                    case 13: {
                        r5 = this.j6.j6().iterator();
                        $pc3 = 15; continue $sw3;
                    }
                    case 15: {
                        if (r5.hasNext() == false) { $pc3 = 22; continue $sw3; }
                        r6 = r5.next();
                        if (r6 == this.j6) { $pc3 = 15; continue $sw3; }
                        if (r2 == false) { $pc3 = 20; continue $sw3; }
                        r7 = this.DW;
                        $pc3 = 21; continue $sw3;
                    }
                    case 21: {
                        abcd.Bt.j6(this.Zo)[r6.DW()] = r7;
                        r2 = false;
                        { $pc3 = 15; continue $sw3; }
                    }
                    case 20: {
                        r7 = abcd.Bt.j6(this.DW);
                        { $pc3 = 21; continue $sw3; }
                    }
                    case 22: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void j6(abcd.mt r8) {
            abcd.bs r0 = null;
            int r1 = 0;
            boolean r3 = false;
            int r2 = 0;
            int r4 = 0;
            abcd.Vr r5 = null;
            abcd.Vr r6 = null;
            abcd.Vr r7 = null;
            abcd.bs r9 = null;
            abcd.cs r10 = null;
            abcd.Abstractvt r11 = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = r8.u7();
                        r1 = r0.we();
                        r3 = false;
                        r2 = r8.tp().get(0).we();
                        r8.DW(this.v5);
                        r4 = r8.tp().get(0).we();
                        r5 = this.DW[r2].Zo();
                        r6 = r0.Zo();
                        if (r6 != null) { $pc4 = 5; continue $sw4; }
                        r6 = r5;
                        $pc4 = 5; continue $sw4;
                    }
                    case 5: {
                        r7 = abcd.Bt.j6(this.Zo, r4);
                        if (r7 == null) { $pc4 = 10; continue $sw4; }
                        if (r6 == null) { $pc4 = 10; continue $sw4; }
                        if (r6.equals(r7) == true) { $pc4 = 10; continue $sw4; }
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        r9 = abcd.bs.FH(r4, r0.getType(), r6);
                        if (abcd.C1102nt.DW() == false) { $pc4 = 25; continue $sw4; }
                        if (r3 == true) { $pc4 = 15; continue $sw4; }
                        $pc4 = 19; continue $sw4;
                    }
                    case 19: {
                        if (r3 == false) { $pc4 = 24; continue $sw4; }
                        if (r5 != null) { $pc4 = 24; continue $sw4; }
                        if (abcd.Bt.v5(this.Zo) != 0) { $pc4 = 24; continue $sw4; }
                        r10 = abcd.cs.j6(abcd.bs.DW(r9.we(), r9.getType(), r6));
                        r11 = abcd.Abstractvt.j6(new abcd.Zr(abcd.gs.gn(r9), abcd.hs.j6, null, r10), this.j6);
                        this.Hw.put(r8, r11);
                        j6(r1, r9);
                        return;
                    }
                    case 24: {
                        j6(r8);
                        this.FH.add(r8);
                        return;
                    }
                    case 15: {
                        if (abcd.Bt.j6(r6, r5) == false) { $pc4 = 19; continue $sw4; }
                        if (abcd.Bt.v5(this.Zo) != 0) { $pc4 = 19; continue $sw4; }
                        $pc4 = 25; continue $sw4;
                    }
                    case 25: {
                        j6(r1, r9);
                        return;
                    }
                    case 10: {
                        r3 = true;
                        { $pc4 = 11; continue $sw4; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void j6(abcd.ot r1) {
            j6(r1);
        }

        void j6(abcd.Abstractvt r3) {
            abcd.bs r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = r3.u7();
                        if (r0 != null) { $pc5 = 5; continue $sw5; }
                        return;
                    }
                    case 5: {
                        r1 = r0.we();
                        if (abcd.Bt.DW(this.Zo, r1) == false) { $pc5 = 8; continue $sw5; }
                        return;
                    }
                    case 8: {
                        r3.j6(abcd.Bt.DW(this.Zo));
                        j6(r1, r3.u7());
                        abcd.Bt.FH(this.Zo);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public Bt(abcd.yt r4) {
        int r0 = 0;
        abcd.bs[] r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    this.FH = r4.u7();
                    this.j6 = r4;
                    this.DW = this.FH;
                    r0 = 0;
                    this.Hw = 0;
                    this.v5 = new abcd.bs[r4.DW().size()][];
                    this.Zo = new java.util.ArrayList();
                    r1 = new abcd.bs[this.FH];
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0 >= this.FH) { $pc6 = 6; continue $sw6; }
                    r1[r0] = abcd.bs.j6(r0, abcd.Qs.tp);
                    r0 = r0 + 1;
                    { $pc6 = 4; continue $sw6; }
                }
                case 6: {
                    this.v5[r4.v5()] = r1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Bt(abcd.yt r1, int r2) {
        this(r1);
        this.Hw = r2;
    }

    static int DW(abcd.Bt r0) {
        return r0.DW;
    }

    private boolean DW(int r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 >= this.Hw) { $pc7 = 5; continue $sw7; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean DW(abcd.Bt r0, int r1) {
        return r0.DW(r1);
    }

    private static boolean DW(java.lang.Object r0, java.lang.Object r1) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r0 == r1) { $pc8 = 8; continue $sw8; }
                    if (r0 != null) { $pc8 = 5; continue $sw8; }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.equals(r1) == false) { $pc8 = 7; continue $sw8; }
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.bs[] DW(abcd.bs[] r3) {
        abcd.bs[] r0 = new abcd.bs[r3.length];
        java.lang.System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }

    static int FH(abcd.Bt r2) {
        int r0 = r2.DW;
        r2.DW = r0 + 1;
        return r0;
    }

    private boolean FH(int r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r2 >= this.FH) { $pc9 = 5; continue $sw9; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean FH(abcd.Bt r0, int r1) {
        return r0.FH(r1);
    }

    static abcd.yt Hw(abcd.Bt r0) {
        return r0.j6;
    }

    private abcd.Vr j6(int r2) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r2 < this.Zo.size()) { $pc10 = 5; continue $sw10; }
                    return null;
                }
                case 5: {
                    return this.Zo.get(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.Vr j6(abcd.Bt r0, int r1) {
        return r0.j6(r1);
    }

    static void j6(abcd.Bt r0, abcd.bs r1) {
        r0.j6(r1);
    }

    private void j6(abcd.bs r4) {
        int r0 = 0;
        abcd.Vr r5 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = r4.we();
                    r5 = r4.Zo();
                    this.Zo.ensureCapacity(r0 + 1);
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (this.Zo.size() > r0) { $pc11 = 6; continue $sw11; }
                    this.Zo.add(null);
                    { $pc11 = 4; continue $sw11; }
                }
                case 6: {
                    this.Zo.set(r0, r5);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(java.lang.Object r0, java.lang.Object r1) {
        return DW(r0, r1);
    }

    static abcd.bs[] j6(abcd.bs[] r0) {
        return DW(r0);
    }

    static abcd.bs[][] j6(abcd.Bt r0) {
        return r0.v5;
    }

    static int v5(abcd.Bt r0) {
        return r0.Hw;
    }

    @Override
    public void run() {
        this.j6.j6(new abcd.zt(this));
        this.j6.v5(this.DW);
        this.j6.J8();
    }
}
