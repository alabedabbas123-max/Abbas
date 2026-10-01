package abcd;

public abstract class AbstractjK {
    public static final abcd.AbstractjK DW = null;
    public static final abcd.AbstractjK j6 = null;

    private static final class a extends abcd.AbstractjK {
        private a() {
        }

        a(abcd.AbstractjK.a r1) {
            this();
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.YJ r1) {
            return true;
        }

        @Override
        public java.lang.String toString() {
            return "ALL";
        }
    }

    private static final class b extends abcd.AbstractjK {
        private b() {
        }

        b(abcd.AbstractjK.b r1) {
            this();
        }

        @Override
        public abcd.AbstractjK clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.YJ r7) {
            int r0 = r7.Zo();
            if (r0 != 1) goto L5;
            return true;
        L5:
            int r3 = r7.FH(0);
            int r4 = 1;
        L6:
            if (r4 >= r0) goto L7;
            if (r7.FH(r4) != r3) goto L14;
            if (r7.j6(r4, 0) == false) goto L14;
            r4 = r4 + 1;
        L14:
            return true;
        L7:
            return false;
        }

        @Override
        public java.lang.String toString() {
            return "ANY_DIFF";
        }
    }

    static {
        j6 = new abcd.AbstractjK.a(null);
        DW = new abcd.AbstractjK.b(null);
    }

    public AbstractjK() {
    }

    public abstract abcd.AbstractjK clone();

    public java.lang.Object m29clone() {
        return clone();
    }

    public abstract boolean j6();

    public abstract boolean j6(abcd.YJ r1);

    public java.lang.String toString() {
        java.lang.String r0 = getClass().getName();
        int r2 = r0.lastIndexOf(46);
        if (r2 < 0) goto L6;
        r0 = r0.substring(r2 + 1);
    L6:
        return r0.replace('$', '.');
    }
}
