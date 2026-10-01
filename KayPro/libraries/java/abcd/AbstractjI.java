package abcd;

public abstract class AbstractjI {
    private final boolean DW;
    private final java.lang.String j6;

    public static class a extends abcd.AbstractjI {
        private char[] FH;

        public a(java.lang.String r1, boolean r2) {
            super(r1, r2);
        }

        public void DW() {
            char[] r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.FH;
                        if (r0 == null) { $pc0 = 6; continue $sw0; }
                        java.util.Arrays.fill(r0, 0);
                        this.FH = null;
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public char[] FH() {
            return this.FH;
        }

        public void j6(char[] r4) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        DW();
                        if (r4 == null) { $pc1 = 6; continue $sw1; }
                        this.FH = new char[r4.length];
                        java.lang.System.arraycopy(r4, 0, this.FH, 0, r4.length);
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public static class b extends abcd.AbstractjI {
        public b(java.lang.String r2) {
            super(r2, false);
        }
    }

    public static class c extends abcd.AbstractjI.a {
        public c() {
            super(org.eclipse.jgit.JGitText.j6().credentialPassword, true);
        }

        public c(java.lang.String r2) {
            super(r2, true);
        }
    }

    public static class d extends abcd.AbstractjI {
        private java.lang.String FH;

        public d(java.lang.String r1, boolean r2) {
            super(r1, r2);
        }

        public java.lang.String DW() {
            return this.FH;
        }

        public void j6(java.lang.String r1) {
            this.FH = r1;
        }
    }

    public static class e extends abcd.AbstractjI.d {
        public e() {
            super(org.eclipse.jgit.JGitText.j6().credentialUsername, false);
        }
    }

    public static class f extends abcd.AbstractjI {
        private boolean FH;

        public f(java.lang.String r2) {
            super(r2, false);
        }

        public boolean DW() {
            return this.FH;
        }

        public void j6(boolean r1) {
            this.FH = r1;
        }
    }

    public AbstractjI(java.lang.String r1, boolean r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public java.lang.String j6() {
        return this.j6;
    }
}
