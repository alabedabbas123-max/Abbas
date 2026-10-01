package abcd;

class PF extends abcd.XF {
    abcd.XF j6;

    private class a extends abcd.XF {
        private final abcd.UF DW;
        private final abcd.XF FH;
        final abcd.PF Hw;
        private final abcd.qG j6;

        a(abcd.PF r1, abcd.qG r2, abcd.XF r3) {
            this.Hw = r1;
            this.j6 = r2;
            this.DW = new abcd.UF();
            this.FH = r3;
            this.FH.j6(this.DW);
        }

        @Override
        int DW() {
            return this.FH.DW();
        }

        @Override
        abcd.dG j6() {
            abcd.dG r0 = null;
            abcd.dG[] r1 = null;
            int r2 = 0;
            int r3 = 0;
            abcd.dG r4 = null;
            abcd.UF r5 = null;
            abcd.dG r6 = null;
            int r7 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.FH.j6();
                        if (r0 == null) { $pc0 = 11; continue $sw0; }
                        r1 = r0.J8;
                        r2 = r1.length;
                        r3 = 0;
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        if (r3 >= r2) { $pc0 = 6; continue $sw0; }
                        r4 = r1[r3];
                        if ((r4.EQ & 4) == 0) { $pc0 = 10; continue $sw0; }
                        this.DW.j6(r4);
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        r3 = r3 + 1;
                        { $pc0 = 5; continue $sw0; }
                    }
                    case 6: {
                        return r0;
                    }
                    case 11: {
                        r5 = new abcd.UF();
                        r5.j6(this.DW);
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        r6 = this.DW.j6();
                        if (r6 == null) { $pc0 = 14; continue $sw0; }
                        r7 = r6.EQ;
                        if ((r7 & 16) != 0) { $pc0 = 12; continue $sw0; }
                        if ((r7 & 1) != 0) { $pc0 = 22; continue $sw0; }
                        r6.j6(this.j6);
                        $pc0 = 22; continue $sw0;
                    }
                    case 22: {
                        r6.EQ = 16 | r6.EQ;
                        r5.j6(r6);
                        { $pc0 = 12; continue $sw0; }
                    }
                    case 14: {
                        r5.DW(16);
                        this.Hw.j6 = r5;
                        return r5.j6();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        void j6(abcd.OF r2) {
            r2.j6(this.DW);
        }
    }

    PF(abcd.qG r2, abcd.XF r3) {
        this.j6 = new abcd.PF.a(this, r2, r3);
    }

    @Override
    int DW() {
        return this.j6.DW() | 16;
    }

    @Override
    abcd.dG j6() {
        return this.j6.j6();
    }

    @Override
    void j6(abcd.OF r2) {
        this.j6.j6(r2);
    }
}
