package abcd;

public final class Or extends abcd.du {
    private int Hw;

    private static class a implements abcd.Tr.b {
        private int j6;

        public a() {
            this.j6 = 0;
        }

        private void j6(abcd.Tr r4) {
            abcd.bs r0 = null;
            abcd.cs r5 = null;
            int r1 = 0;
            int r2 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = r4.VH();
                        if (r0 == null) { $pc0 = 5; continue $sw0; }
                        j6(r0);
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        r5 = r4.gn();
                        r1 = r5.size();
                        r2 = 0;
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        if (r2 >= r1) { $pc0 = 8; continue $sw0; }
                        j6(r5.get(r2));
                        r2 = r2 + 1;
                        { $pc0 = 6; continue $sw0; }
                    }
                    case 8: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void j6(abcd.bs r2) {
            int r3 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r3 = r2.VH();
                        if (r3 <= this.j6) { $pc1 = 6; continue $sw1; }
                        this.j6 = r3;
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public int j6() {
            return this.j6;
        }

        @Override
        public void j6(abcd.Sr r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.Yr r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.Zr r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.is r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.js r1) {
            j6(r1);
        }

        @Override
        public void j6(abcd.ks r1) {
            j6(r1);
        }
    }

    public Or(int r1) {
        super(r1);
        this.Hw = -1;
    }

    private Or(abcd.Or r1) {
        super(r1);
        this.Hw = r1.Hw;
    }

    public int BT() {
        abcd.Or.a r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Hw != (-1)) { $pc2 = 6; continue $sw2; }
                    r0 = new abcd.Or.a();
                    j6(r0);
                    this.Hw = r0.j6();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int er() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.Nr r4 = null;
        abcd.Ur r5 = null;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = size();
                    r2 = 0;
                    r3 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r0) { $pc3 = 14; continue $sw3; }
                    r4 = (abcd.Nr) FH(r2);
                    if (r4 == null) { $pc3 = 13; continue $sw3; }
                    r5 = r4.Hw();
                    r6 = r5.size();
                    r7 = r3;
                    r8 = 0;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r8 >= r6) { $pc3 = 12; continue $sw3; }
                    if (r5.get(r8).v5().Hw() == 54) { $pc3 = 11; continue $sw3; }
                    r7 = r7 + 1;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r8 = r8 + 1;
                    { $pc3 = 7; continue $sw3; }
                }
                case 12: {
                    r3 = r7;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 14: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Or gW() {
        return new abcd.Or(this);
    }

    public abcd.Nr get(int r1) {
        return (abcd.Nr) DW(r1);
    }

    public abcd.Nr j6(abcd.Nr r5) {
        int r0 = 0;
        abcd.au r6 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r5.Zo();
                    r6 = r5.gn();
                    r1 = r6.size();
                    if (r1 != 0) { $pc4 = 5; continue $sw4; }
                    return null;
                }
                case 5: {
                    if (r1 == 1) { $pc4 = 13; continue $sw4; }
                    if (r0 == (-1)) { $pc4 = 11; continue $sw4; }
                    return v5(r0);
                }
                case 11: {
                    return v5(r6.get(0));
                }
                case 13: {
                    return v5(r6.get(0));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r1, abcd.Nr r2) {
        super.j6(r1, r2);
        this.Hw = -1;
    }

    public void j6(abcd.Tr.b r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r1 >= r0) { $pc5 = 5; continue $sw5; }
                    get(r1).Hw().j6(r4);
                    r1 = r1 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Nr v5(int r4) {
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = Hw(r4);
                    if (r0 < 0) { $pc6 = 7; continue $sw6; }
                    return get(r0);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("no such label: " + abcd.Yt.v5(r4));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int yS() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.Nr r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = size();
                    r1 = 0;
                    r2 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r1 >= r0) { $pc7 = 8; continue $sw7; }
                    r3 = (abcd.Nr) FH(r1);
                    if (r3 == null) { $pc7 = 7; continue $sw7; }
                    r2 = r2 + r3.Hw().size();
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    r1 = r1 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 8: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
