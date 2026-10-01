package abcd;

public final class Dm extends abcd.Xt {

    public static class a {
        private final abcd.Ks DW;
        private final abcd.Js FH;
        private final int Hw;
        private final abcd.Ks j6;

        public a(abcd.Ks r1, abcd.Ks r2, abcd.Js r3, int r4) {
            if (r1 == null) goto L7;
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
            return;
        L7:
            throw new java.lang.NullPointerException("innerClass == null");
        }

        public abcd.Ks DW() {
            return this.j6;
        }

        public abcd.Js FH() {
            return this.FH;
        }

        public abcd.Ks Hw() {
            return this.DW;
        }

        public int j6() {
            return this.Hw;
        }
    }

    public Dm(int r1) {
        super(r1);
    }

    public abcd.Dm.a get(int r1) {
        return (abcd.Dm.a) DW(r1);
    }

    public void j6(int r2, abcd.Ks r3, abcd.Ks r4, abcd.Js r5, int r6) {
        j6(r2, new abcd.Dm.a(r3, r4, r5, r6));
    }
}
