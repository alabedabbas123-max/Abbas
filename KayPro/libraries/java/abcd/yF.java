package abcd;

public class yF extends abcd.AbstractvF {
    private final int VH;
    private final java.lang.String Zo;

    static class a extends abcd.AbstractwF {
        private final int gn;

        protected a(abcd.UE r1, int r2) {
            super(r1);
            this.gn = r2;
        }

        @Override
        public abcd.yE FH() {
            return this.VH[this.gn];
        }

        @Override
        protected boolean Hw() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.gn >= this.VH.length) { $pc0 = 6; continue $sw0; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    protected yF(java.lang.String r1, int r2) {
        this.Zo = r1;
        this.VH = r2;
    }

    @Override
    public abcd.AbstractwF j6(abcd.UE r3) {
        return new abcd.yF.a(r3, this.VH);
    }

    @Override
    public java.lang.String j6() {
        return this.Zo;
    }
}
