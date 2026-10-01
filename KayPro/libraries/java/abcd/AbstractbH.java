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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW >= this.FH.j6()) { $pc0 = 6; continue $sw0; }
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.io.FileInputStream r0 = null;
        abcd.AbstractbH r7 = null;
        java.lang.String r8 = null;
        java.io.IOException r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.io.FileInputStream(r6);
                    try {
                        r7 = j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 8; continue $sw1; }
                        $pc1 = 6; continue $sw1;
                    }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    return r7;
                }
                case 8: {
                    e = $ex1;
                    try {
                        r8 = r6.getAbsolutePath();
                        r2 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unreadablePackIndex, new java.lang.Object[]{r8}));
                        r2.initCause(e);
                        throw r2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 6; continue $sw1;
                    }
                }
                case 6: {
                    th = $ex1;
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 14; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                case 14: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractbH j6(java.io.InputStream r4) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new byte[8];
                    abcd.BK.j6(r4, r0, 0, r0.length);
                    if (j6(r0) == false) { $pc2 = 11; continue $sw2; }
                    r1 = abcd.FK.j6(r0, 4);
                    if (r1 != 2) { $pc2 = 9; continue $sw2; }
                    return new abcd.fH(r4);
                }
                case 9: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedPackIndexVersion, new java.lang.Object[]{java.lang.Integer.valueOf(r1)}));
                }
                case 11: {
                    return new abcd.dH(r4, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(byte[] r5) {
        byte[] r0 = null;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = abcd.AbstractgH.j6;
                    r2 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r2 >= r0.length) { $pc3 = 5; continue $sw3; }
                    if (r5[r2] != r0[r2]) { $pc3 = 9; continue $sw3; }
                    r2 = r2 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 9: {
                    return false;
                }
                case 5: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract long DW();

    public abstract long DW(abcd.YD r1);

    public abstract boolean FH();

    public boolean FH(abcd.YD r5) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (DW(r5) == (-1)) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abstract java.util.Iterator<abcd.AbstractbH.b> iterator();

    public abstract long j6();

    public abstract long j6(abcd.YD r1);

    public abstract abcd.yE j6(long r1);

    public abstract void j6(java.util.Set<abcd.yE> r1, abcd.WD r2, int r3);

    public final abcd.yE v5(int r5) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r5 < 0) { $pc5 = 6; continue $sw5; }
                    return j6(r5);
                }
                case 6: {
                    return j6((((long) (r5 >>> 1)) << 1) | ((long) (r5 & 1)));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
