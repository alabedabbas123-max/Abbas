package abcd;

public abstract class AbstractyG {
    public static final abcd.AbstractyG DW = null;
    public static final abcd.AbstractyG FH = null;
    public static final abcd.AbstractyG Hw = null;
    public static final abcd.AbstractyG j6 = null;

    private static final class a extends abcd.AbstractyG {
        private a() {
        }

        a(abcd.AbstractyG.a r1) {
            this();
        }

        @Override
        public abcd.AbstractyG clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.qG r1, abcd.dG r2) {
            return true;
        }

        @Override
        public java.lang.String toString() {
            return "ALL";
        }
    }

    private static final class b extends abcd.AbstractyG {
        private b() {
        }

        b(abcd.AbstractyG.b r1) {
            this();
        }

        @Override
        public abcd.AbstractyG clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.qG r1, abcd.dG r2) {
            throw new java.lang.UnsupportedOperationException(org.eclipse.jgit.JGitText.j6().cannotBeCombined);
        }

        @Override
        public java.lang.String toString() {
            return "MERGE_BASE";
        }
    }

    private static final class c extends abcd.AbstractyG {
        private c() {
        }

        c(abcd.AbstractyG.c r1) {
            this();
        }

        @Override
        public abcd.AbstractyG clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.qG r1, abcd.dG r2) {
            if (r2.lg() >= 2) goto L6;
            return true;
        L6:
            return false;
        }

        @Override
        public java.lang.String toString() {
            return "NO_MERGES";
        }
    }

    private static final class d extends abcd.AbstractyG {
        private d() {
        }

        d(abcd.AbstractyG.d r1) {
            this();
        }

        @Override
        public abcd.AbstractyG clone() {
            return this;
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.qG r1, abcd.dG r2) {
            return false;
        }

        @Override
        public java.lang.String toString() {
            return "NONE";
        }
    }

    static {
        j6 = new abcd.AbstractyG.a(null);
        DW = new abcd.AbstractyG.d(null);
        FH = new abcd.AbstractyG.c(null);
        Hw = new abcd.AbstractyG.b(null);
    }

    public AbstractyG() {
    }

    public abstract abcd.AbstractyG clone();

    public java.lang.Object m38clone() {
        return clone();
    }

    public boolean j6() {
        return true;
    }

    public abstract boolean j6(abcd.qG r1, abcd.dG r2);

    public java.lang.String toString() {
        java.lang.String r0 = getClass().getName();
        int r2 = r0.lastIndexOf(46);
        if (r2 < 0) goto L6;
        r0 = r0.substring(r2 + 1);
    L6:
        return r0.replace('$', '.');
    }
}
