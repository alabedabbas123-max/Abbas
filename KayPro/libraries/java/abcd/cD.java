package abcd;

public class cD extends java.lang.RuntimeException {
    private abcd.yE j6;

    public static class a extends abcd.cD {
        public a() {
        }

        @Override
        public java.lang.String getMessage() {
            return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().largeObjectExceedsByteArray, new java.lang.Object[]{DW()});
        }
    }

    public static class b extends abcd.cD {
        private final long DW;
        private final long FH;

        public b(long r1, long r3) {
            this.DW = r1;
            this.FH = r3;
        }

        @Override
        public java.lang.String getMessage() {
            return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().largeObjectExceedsLimit, new java.lang.Object[]{DW(), java.lang.Long.valueOf(this.DW), java.lang.Long.valueOf(this.FH)});
        }
    }

    public static class c extends abcd.cD {
        public c(java.lang.OutOfMemoryError r1) {
            initCause(r1);
        }

        @Override
        public java.lang.String getMessage() {
            return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().largeObjectOutOfMemory, new java.lang.Object[]{DW()});
        }
    }

    public cD() {
    }

    public cD(abcd.YD r1) {
        j6(r1);
    }

    protected java.lang.String DW() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (j6() == null) { $pc0 = 7; continue $sw0; }
                    return j6().we();
                }
                case 7: {
                    return org.eclipse.jgit.JGitText.j6().unknownObject;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getMessage() {
        return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().largeObjectException, new java.lang.Object[]{DW()});
    }

    public abcd.yE j6() {
        return this.j6;
    }

    public void j6(abcd.YD r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 != null) { $pc1 = 6; continue $sw1; }
                    this.j6 = r2.Hw();
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
