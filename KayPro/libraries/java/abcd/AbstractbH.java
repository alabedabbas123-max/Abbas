package abcd;

public abstract class AbstractbH implements java.lang.Iterable<abcd.AbstractbH.b> {
    protected byte[] j6;

    abstract class a implements java.util.Iterator<abcd.AbstractbH.b> {
        protected long DW;
        final abcd.AbstractbH FH;
        protected final abcd.AbstractbH.b j6;

        a(abcd.AbstractbH r3) {
            this.FH = r3;
            this.j6 = j6();
            this.DW = 0;
        }

        @Override
        public boolean hasNext() {
            if (this.DW >= this.FH.j6()) goto L6;
            return true;
        L6:
            return false;
        }

        protected abstract abcd.AbstractbH.b j6();

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public abstract abcd.AbstractbH.b next();

        @Override
        public abcd.AbstractbH.b next() {
            return next();
        }

        @Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public static class b {
        long DW;
        final abcd.uE j6;

        public b() {
            this.j6 = new abcd.uE();
        }

        public long j6() {
            return this.DW;
        }
    }

    public AbstractbH() {
    }

    public static abcd.AbstractbH j6(java.io.File r6) {
        java.io.FileInputStream r0 = new java.io.FileInputStream(r6);
        abcd.AbstractbH r7 = j6(r0);     // Catch: java.lang.Throwable -> L6 java.io.IOException -> L8
    L20:
        r0.close();     // Catch: java.io.IOException -> L13
    L5:
        return r7;
    L8:
        e = move-exception;
        java.lang.String r8 = r6.getAbsolutePath();     // Catch: java.lang.Throwable -> L6
        java.io.IOException r2 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unreadablePackIndex, new java.lang.Object[]{r8}));     // Catch: java.lang.Throwable -> L6
        r2.initCause(e);     // Catch: java.lang.Throwable -> L6
        throw r2;     // Catch: java.lang.Throwable -> L6
    L6:
        th = move-exception;
        r0.close();     // Catch: java.io.IOException -> L14
    L12:
        throw th;
    }

    public static abcd.AbstractbH j6(java.io.InputStream r4) {
        byte[] r0 = new byte[8];
        abcd.BK.j6(r4, r0, 0, r0.length);
        if (j6(r0) == false) goto L11;
        int r1 = abcd.FK.j6(r0, 4);
        if (r1 != 2) goto L9;
        return new abcd.fH(r4);
    L9:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedPackIndexVersion, new java.lang.Object[]{java.lang.Integer.valueOf(r1)}));
    L11:
        return new abcd.dH(r4, r0);
    }

    private static boolean j6(byte[] r5) {
        byte[] r0 = abcd.AbstractgH.j6;
        int r2 = 0;
    L4:
        if (r2 >= r0.length) goto L5;
        if (r5[r2] != r0[r2]) goto L9;
        r2 = r2 + 1;
        goto L4
    L9:
        return false;
    L5:
        return true;
    }

    public abstract long DW();

    public abstract long DW(abcd.YD r1);

    public abstract boolean FH();

    public boolean FH(abcd.YD r5) {
        if (DW(r5) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public abstract java.util.Iterator<abcd.AbstractbH.b> iterator();

    public abstract long j6();

    public abstract long j6(abcd.YD r1);

    public abstract abcd.yE j6(long r1);

    public abstract void j6(java.util.Set<abcd.yE> r1, abcd.WD r2, int r3);

    public final abcd.yE v5(int r5) {
        if (r5 < 0) goto L6;
        return j6(r5);
    L6:
        return j6((((long) (r5 >>> 1)) << 1) | ((long) (r5 & 1)));
    }
}
