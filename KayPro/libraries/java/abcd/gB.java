package abcd;

public class gB extends dB<java.util.List<abcd.ME>> {
    private abcd.gB.a FH;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.gB.a DW = null;
        private static final abcd.gB.a[] FH = null;
        public static final abcd.gB.a j6 = null;

        static {
            j6 = new abcd.gB.a("ALL", 0);
            DW = new abcd.gB.a("REMOTE", 1);
            FH = new abcd.gB.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.gB.a valueOf(java.lang.String r1) {
            return (abcd.gB.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.gB.a.values(), r1);
        }

        public static abcd.gB.a[] values() {
            abcd.gB.a[] r0 = FH;
            int r1 = r0.length;
            abcd.gB.a[] r2 = new abcd.gB.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    protected gB(abcd.UE r1) {
        super(r1);
    }

    public java.lang.Object call() {
        return m23call();
    }

    public java.util.List<abcd.ME> m23call() {
        java.util.Map<java.lang.String, abcd.ME> r0 = null;
        java.util.ArrayList r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6();
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    e = $ex0;
                    throw new abcd.SB(e.getMessage(), e);
                }
                case 5: {
                    if (this.FH != null) { $pc0 = 9; continue $sw0; }
                    try {
                        r0 = this.j6.we().DW("refs/heads/");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r1 = new java.util.ArrayList();
                    r1.addAll(r0.values());
                    java.util.Collections.sort(r1, new abcd.fB(this));
                    j6(false);
                    return r1;
                }
                case 9: {
                    if (this.FH != abcd.gB.a.DW) { $pc0 = 11; continue $sw0; }
                    try {
                        r0 = this.j6.we().DW("refs/remotes/");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 12; continue $sw0; }
                }
                case 11: {
                    try {
                        r0 = new java.util.HashMap(this.j6.we().DW("refs/heads/"));
                        r0.putAll(this.j6.we().DW("refs/remotes/"));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 14; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 12; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.gB j6(abcd.gB.a r1) {
        j6();
        this.FH = r1;
        return this;
    }
}
