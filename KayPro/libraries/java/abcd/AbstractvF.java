package abcd;

public abstract class AbstractvF {
    public static final abcd.AbstractvF DW = null;
    public static final abcd.BF FH = null;
    public static final abcd.BF Hw = null;
    public static final abcd.AbstractvF j6 = null;
    private static final java.util.HashMap<java.lang.String, abcd.AbstractvF> v5 = null;

    static {
        j6 = new abcd.yF("ours", 0);
        DW = new abcd.yF("theirs", 1);
        FH = new abcd.AF();
        Hw = new abcd.C1584zF();
        v5 = new java.util.HashMap();
        j6(j6);
        j6(DW);
        j6(FH);
        j6(Hw);
    }

    public AbstractvF() {
    }

    public static void j6(abcd.AbstractvF r1) {
        j6(r1.j6(), r1);
    }

    public static synchronized void j6(java.lang.String r4, abcd.AbstractvF r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    monitor-enter(abcd.AbstractvF.class);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (v5.containsKey(r4) == true) { $pc0 = 10; continue $sw0; }
                    try {
                        v5.put(r4, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    monitor-exit(abcd.AbstractvF.class);
                    return;
                }
                case 10: {
                    try {
                        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().mergeStrategyAlreadyExistsAsDefault, new java.lang.Object[]{r4}));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.AbstractwF j6(abcd.UE r1);

    public abstract java.lang.String j6();
}
