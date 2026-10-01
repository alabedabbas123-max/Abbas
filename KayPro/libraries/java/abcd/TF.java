package abcd;

public interface TF {

    public static class a extends abcd.dG {
        int aM;

        protected a(abcd.YD r1) {
            super(r1);
            this.aM = -1;
        }

        public int BT() {
            return this.aM;
        }
    }

    public static class b extends abcd._F implements abcd.TF {
        private final abcd.fG er;
        private final int rN;
        private final abcd.fG yS;

        public b(abcd.IE r1, int r2) {
            super(r1);
            this.rN = r2;
            this.er = j6("UNSHALLOW");
            this.yS = j6("REINTERESTING");
        }

        @Override
        public abcd.fG DW() {
            return this.er;
        }

        public void VH(abcd.AbstractiG r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if ((r2 instanceof abcd.dG) == false) { $pc0 = 5; continue $sw0; }
                        r2.j6(this.er);
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        super.Hw(r2);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void Zo(abcd.AbstractiG r3) {
            abcd.AbstractiG r0 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = r3;
                        $pc1 = 4; continue $sw1;
                    }
                    case 4: {
                        if ((r0 instanceof abcd.lG) == false) { $pc1 = 6; continue $sw1; }
                        r0 = ((abcd.lG) r0).j3();
                        DW(r0);
                        { $pc1 = 4; continue $sw1; }
                    }
                    case 6: {
                        if ((r0 instanceof abcd.TF.a) == false) { $pc1 = 8; continue $sw1; }
                        ((abcd.TF.a) r0).aM = 0;
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        super.Hw(r3);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int getDepth() {
            return this.rN;
        }

        @Override
        protected abcd.dG j6(abcd.YD r2) {
            return new abcd.TF.a(r2);
        }

        @Override
        public abcd.fG j6() {
            return this.yS;
        }
    }

    public static class c extends abcd.qG implements abcd.TF {
        private final abcd.fG QX;
        private final int Ws;
        private final abcd.fG XL;

        public c(abcd.IE r1, int r2) {
            super(r1);
            this.Ws = r2;
            this.QX = j6("UNSHALLOW");
            this.XL = j6("REINTERESTING");
        }

        @Override
        public abcd.fG DW() {
            return this.QX;
        }

        public void Hw(abcd.dG r3) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if ((r3 instanceof abcd.TF.a) == false) { $pc2 = 5; continue $sw2; }
                        ((abcd.TF.a) r3).aM = 0;
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        super.DW(r3);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int getDepth() {
            return this.Ws;
        }

        @Override
        protected abcd.dG j6(abcd.YD r2) {
            return new abcd.TF.a(r2);
        }

        @Override
        public abcd.fG j6() {
            return this.XL;
        }
    }

    abcd.fG DW();

    int getDepth();

    abcd.fG j6();
}
