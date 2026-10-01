package abcd;

abstract class OF extends abcd.LF {
    protected abcd.OF.b FH;

    static final class a {
        final abcd.dG[] DW;
        int FH;
        int Hw;
        abcd.OF.a j6;

        a() {
            this.DW = new abcd.dG[256];
        }

        void DW() {
            this.j6 = null;
            this.FH = 0;
            this.Hw = 0;
        }

        void DW(abcd.dG r3) {
            abcd.dG[] r0 = this.DW;
            int r1 = this.FH - 1;
            this.FH = r1;
            r0[r1] = r3;
        }

        boolean FH() {
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

        boolean Hw() {
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

        void VH() {
            this.Hw = 128;
            this.FH = 128;
        }

        void Zo() {
            this.Hw = 256;
            this.FH = 256;
        }

        void j6(abcd.dG r4) {
            abcd.dG[] r0 = this.DW;
            int r1 = this.Hw;
            this.Hw = r1 + 1;
            r0[r1] = r4;
        }

        boolean j6() {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.FH <= 0) { $pc2 = 6; continue $sw2; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        abcd.dG v5() {
            abcd.dG[] r0 = this.DW;
            int r1 = this.FH;
            this.FH = r1 + 1;
            return r0[r1];
        }
    }

    static final class b {
        private abcd.OF.a j6;

        b() {
        }

        abcd.OF.a j6() {
            abcd.OF.a r0 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.j6;
                        if (r0 == null) { $pc3 = 5; continue $sw3; }
                        this.j6 = r0.j6;
                        r0.DW();
                        return r0;
                    }
                    case 5: {
                        return new abcd.OF.a();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6(abcd.OF.a r2) {
            r2.j6 = this.j6;
            this.j6 = r2;
        }
    }

    protected OF() {
        this.FH = new abcd.OF.b();
    }

    OF(abcd.XF r2) {
        abcd.dG r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    this.FH = new abcd.OF.b();
                    this.DW = r2.DW();
                    r2.j6(this);
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    r0 = r2.j6();
                    if (r0 == null) { $pc4 = 5; continue $sw4; }
                    j6(r0);
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.OF r1) {
        this.FH = r1.FH;
    }
}
