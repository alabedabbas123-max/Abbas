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
        if (j6() == null) goto L7;
        return j6().we();
    L7:
        return org.eclipse.jgit.JGitText.j6().unknownObject;
    }

    @Override
    public java.lang.String getMessage() {
        return java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().largeObjectException, new java.lang.Object[]{DW()});
    }

    public abcd.yE j6() {
        return this.j6;
    }

    public void j6(abcd.YD r2) {
        if (this.j6 != null) goto L6;
        this.j6 = r2.Hw();
        return;
    }
}
