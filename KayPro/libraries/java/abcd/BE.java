package abcd;

public abstract class BE implements abcd.ME {
    private final abcd.ME.a DW;
    private final abcd.yE FH;
    private final java.lang.String j6;

    public static class a extends abcd.BE {
        public a(abcd.ME.a r1, java.lang.String r2, abcd.yE r3) {
            super(r1, r2, r3);
        }

        @Override
        public abcd.yE FH() {
            return null;
        }

        @Override
        public boolean Hw() {
            return true;
        }
    }

    public static class b extends abcd.BE {
        private final abcd.yE Hw;

        public b(abcd.ME.a r1, java.lang.String r2, abcd.yE r3, abcd.yE r4) {
            super(r1, r2, r3);
            this.Hw = r4;
        }

        @Override
        public abcd.yE FH() {
            return this.Hw;
        }

        @Override
        public boolean Hw() {
            return true;
        }
    }

    public static class c extends abcd.BE {
        public c(abcd.ME.a r1, java.lang.String r2, abcd.yE r3) {
            super(r1, r2, r3);
        }

        @Override
        public abcd.yE FH() {
            return null;
        }

        @Override
        public boolean Hw() {
            return false;
        }
    }

    protected BE(abcd.ME.a r1, java.lang.String r2, abcd.yE r3) {
        this.j6 = r2;
        this.DW = r1;
        this.FH = r3;
    }

    @Override
    public abcd.yE DW() {
        return this.FH;
    }

    @Override
    public boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getName() {
        return this.j6;
    }

    @Override
    public abcd.ME getTarget() {
        return this;
    }

    @Override
    public abcd.ME.a j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        return "Ref[" + getName() + '=' + abcd.yE.j6(DW()) + ']';
    }

    @Override
    public abcd.ME v5() {
        return this;
    }
}
