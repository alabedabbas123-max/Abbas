package abcd;

class NF {
    private abcd.NF.a DW;
    private abcd.NF.a FH;
    private abcd.NF.b j6;

    static final class a {
        final abcd.AbstractiG[] DW;
        int FH;
        int Hw;
        abcd.NF.a j6;

        a() {
            this.DW = new abcd.AbstractiG[256];
        }

        boolean DW() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.FH != this.Hw) { $pc0 = 6; continue $sw0; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        boolean FH() {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.Hw != 256) { $pc1 = 6; continue $sw1; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        abcd.AbstractiG Hw() {
            abcd.AbstractiG[] r0 = this.DW;
            int r1 = this.FH;
            this.FH = r1 + 1;
            return r0[r1];
        }

        void j6() {
            this.j6 = null;
            this.FH = 0;
            this.Hw = 0;
        }

        void j6(abcd.AbstractiG r4) {
            abcd.AbstractiG[] r0 = this.DW;
            int r1 = this.Hw;
            this.Hw = r1 + 1;
            r0[r1] = r4;
        }
    }

    static final class b {
        private abcd.NF.a j6;

        b() {
        }

        abcd.NF.a j6() {
            abcd.NF.a r0 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.j6;
                        if (r0 == null) { $pc2 = 5; continue $sw2; }
                        this.j6 = r0.j6;
                        r0.j6();
                        return r0;
                    }
                    case 5: {
                        return new abcd.NF.a();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6(abcd.NF.a r2) {
            r2.j6 = this.j6;
            this.j6 = r2;
        }
    }

    NF() {
        this.j6 = new abcd.NF.b();
    }

    abcd.AbstractiG j6() {
        abcd.NF.a r0 = null;
        abcd.AbstractiG r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    return null;
                }
                case 5: {
                    r2 = r0.Hw();
                    if (r0.DW() == false) { $pc3 = 11; continue $sw3; }
                    this.DW = r0.j6;
                    if (this.DW != null) { $pc3 = 10; continue $sw3; }
                    this.FH = null;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    this.j6.j6(r0);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.AbstractiG r3) {
        abcd.NF.a r0 = null;
        abcd.NF.a r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc4 = 7; continue $sw4; }
                    r1 = this.j6.j6();
                    r1.j6(r3);
                    this.DW = r1;
                    this.FH = r1;
                    return;
                }
                case 7: {
                    if (r0.FH() == false) { $pc4 = 9; continue $sw4; }
                    r0 = this.j6.j6();
                    this.FH.j6 = r0;
                    this.FH = r0;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r0.j6(r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
