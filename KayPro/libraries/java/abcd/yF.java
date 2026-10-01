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
            if (this.gn >= this.VH.length) goto L6;
            return true;
        L6:
            return false;
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
