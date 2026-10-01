package abcd;

class tH {
    private volatile abcd.tH.a j6;

    private static class a {
        private final int DW;
        final int FH;
        private final java.util.concurrent.atomic.AtomicReferenceArray<abcd.yE> j6;

        a(int r3) {
            this.j6 = new java.util.concurrent.atomic.AtomicReferenceArray(1 << r3);
            this.DW = 32 - r3;
            this.FH = r3;
        }

        private int FH(abcd.YD r2) {
            return r2.hashCode() >>> this.DW;
        }

        boolean DW(abcd.YD r5) {
            int r2 = 0;
            int r0 = 0;
            abcd.yE r3 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r2 = FH(r5);
                        r0 = 0;
                        $pc0 = 4; continue $sw0;
                    }
                    case 4: {
                        if (r0 >= 8) { $pc0 = 8; continue $sw0; }
                        r3 = this.j6.get(r2);
                        if (r3 == null) { $pc0 = 8; continue $sw0; }
                        if (abcd.YD.j6(r3, r5) == true) { $pc0 = 11; continue $sw0; }
                        r2 = r2 + 1;
                        if (r2 != this.j6.length()) { $pc0 = 16; continue $sw0; }
                        r2 = 0;
                        $pc0 = 16; continue $sw0;
                    }
                    case 16: {
                        r0 = r0 + 1;
                        { $pc0 = 4; continue $sw0; }
                    }
                    case 11: {
                        return true;
                    }
                    case 8: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        boolean j6(abcd.YD r8) {
            int r2 = 0;
            int r0 = 0;
            abcd.yE r3 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r2 = FH(r8);
                        r0 = 0;
                        $pc1 = 4; continue $sw1;
                    }
                    case 4: {
                        if (r0 >= 8) { $pc1 = 5; continue $sw1; }
                        r3 = this.j6.get(r2);
                        if (r3 == null) { $pc1 = 9; continue $sw1; }
                        if (abcd.YD.j6(r3, r8) == true) { $pc1 = 13; continue $sw1; }
                        r2 = r2 + 1;
                        if (r2 != this.j6.length()) { $pc1 = 17; continue $sw1; }
                        r2 = 0;
                        $pc1 = 17; continue $sw1;
                    }
                    case 17: {
                        r0 = r0 + 1;
                        { $pc1 = 4; continue $sw1; }
                    }
                    case 13: {
                        return true;
                    }
                    case 9: {
                        if (this.j6.compareAndSet(r2, null, r8.Hw()) == false) { $pc1 = 4; continue $sw1; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    tH() {
        this.j6 = new abcd.tH.a(5);
    }

    boolean DW(abcd.YD r2) {
        return this.j6.DW(r2);
    }

    void FH(abcd.YD r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (DW(r1) == false) { $pc2 = 6; continue $sw2; }
                    j6();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6() {
        this.j6 = new abcd.tH.a(5);
    }

    void j6(abcd.YD r4) {
        abcd.tH.a r0 = null;
        abcd.tH.a r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6;
                    if (r0.j6(r4) == true) { $pc3 = 6; continue $sw3; }
                    r1 = new abcd.tH.a(java.lang.Math.min(r0.FH + 1, 11));
                    r1.j6(r4);
                    this.j6 = r1;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
