package abcd;

public abstract class AbstractcC {

    private static class a extends abcd.AbstractcC {
        private final java.io.File j6;

        a(java.io.File r1) {
            this.j6 = r1;
        }

        @Override
        public long DW(java.lang.String r2, abcd.yE r3) {
            return new java.io.File(this.j6, r2).length();
        }

        @Override
        public abcd.FE j6(java.lang.String r2, abcd.yE r3) {
            java.io.File r4 = new java.io.File(this.j6, r2);
            if (r4.isFile() == false) goto L7;
            return new abcd.bC(this, r4);
        L7:
            throw new java.io.FileNotFoundException(r2);
        }
    }

    private static class b extends abcd.AbstractcC {
        private final abcd.IE j6;

        b(abcd.IE r1) {
            this.j6 = r1;
        }

        @Override
        public long DW(java.lang.String r2, abcd.yE r3) {
            return this.j6.DW(r3, 3);
        }

        @Override
        public abcd.FE j6(java.lang.String r2, abcd.yE r3) {
            return this.j6.Hw(r3, 3);
        }
    }

    public static final class c {
        private static int[] j6;
        private final abcd.AbstractcC DW;
        private final abcd.AbstractcC FH;

        public c(abcd.AbstractcC r1, abcd.AbstractcC r2) {
            this.DW = r1;
            this.FH = r2;
        }

        static int[] j6() {
            int[] r0 = j6;
            if (r0 == null) goto L5;
            return r0;
        L5:
            int[] r1 = new int[abcd.hC.b.values().length];
            r1[abcd.hC.b.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L10
        L12:
            r1[abcd.hC.b.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L11
        L8:
            j6 = r1;
            return r1;
        }

        public long DW(abcd.hC.b r2, abcd.hC r3) {
            int r4 = j6()[r2.ordinal()];
            if (r4 == 1) goto L11;
            if (r4 != 2) goto L9;
            return this.FH.DW(r3.Hw, r3.tp.v5());
        L9:
            throw new java.lang.IllegalArgumentException();
        L11:
            return this.DW.DW(r3.FH, r3.u7.v5());
        }

        public abcd.FE j6(abcd.hC.b r2, abcd.hC r3) {
            int r4 = j6()[r2.ordinal()];
            if (r4 == 1) goto L11;
            if (r4 != 2) goto L9;
            return this.FH.j6(r3.Hw, r3.tp.v5());
        L9:
            throw new java.lang.IllegalArgumentException();
        L11:
            return this.DW.j6(r3.FH, r3.u7.v5());
        }
    }

    private static class d extends abcd.AbstractcC {
        private final abcd._J DW;
        private java.lang.String FH;
        private abcd._J Hw;
        private final abcd.YJ j6;

        d(abcd._J r3) {
            this.j6 = new abcd.YJ(null);
            this.DW = r3;
        }

        static abcd._J j6(abcd.AbstractcC.d r0) {
            return r0.Hw;
        }

        private void j6(java.lang.String r4) {
            if (r4.equals(this.FH) == true) goto L13;
            this.DW.EQ();
            this.j6.J8();
            this.j6.j6(this.DW);
            this.j6.j6(abcd.fK.j6(r4));
            this.FH = r4;
            if (this.j6.EQ() == false) goto L12;
            this.Hw = (abcd._J) this.j6.j6(0, abcd._J.class);
            if (this.Hw == null) goto L10;
            return;
        L10:
            throw new java.io.FileNotFoundException(r4);
        L12:
            throw new java.io.FileNotFoundException(r4);
        }

        @Override
        public long DW(java.lang.String r1, abcd.yE r2) {
            j6(r1);
            return this.Hw.j3();
        }

        @Override
        public abcd.FE j6(java.lang.String r1, abcd.yE r2) {
            j6(r1);
            return new abcd.dC(this);
        }
    }

    public AbstractcC() {
    }

    public static abcd.AbstractcC j6(abcd.IE r1) {
        return new abcd.AbstractcC.b(r1);
    }

    public static abcd.AbstractcC j6(abcd._J r1) {
        if ((r1 instanceof abcd.WJ) == false) goto L7;
        return new abcd.AbstractcC.a(((abcd.WJ) r1).lg());
    L7:
        return new abcd.AbstractcC.d(r1);
    }

    public abstract long DW(java.lang.String r1, abcd.yE r2);

    public abstract abcd.FE j6(java.lang.String r1, abcd.yE r2);
}
