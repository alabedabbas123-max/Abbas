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
        monitor-enter(abcd.AbstractvF.class);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (v5.containsKey(r4) == true) goto L10;
        v5.put(r4, r5);     // Catch: java.lang.Throwable -> L11
        monitor-exit(abcd.AbstractvF.class);
        return;
    L10:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().mergeStrategyAlreadyExistsAsDefault, new java.lang.Object[]{r4}));     // Catch: java.lang.Throwable -> L11
    }

    public abstract abcd.AbstractwF j6(abcd.UE r1);

    public abstract java.lang.String j6();
}
