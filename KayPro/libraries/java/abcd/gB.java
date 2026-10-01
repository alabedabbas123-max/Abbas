package abcd;

public class gB extends dB<java.util.List<abcd.ME>> {
    private abcd.gB.a FH;

    public static final enum a extends java.lang.Enum<abcd.gB.a> {
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
            return (abcd.gB.a) java.lang.Enum.valueOf(abcd.gB.a.class, r1);
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
        j6();
    L14:
        e = move-exception;
        throw new abcd.SB(e.getMessage(), e);
    L5:
        if (this.FH != null) goto L9;
        java.util.Map<java.lang.String, abcd.ME> r0 = this.j6.we().DW("refs/heads/");     // Catch: java.io.IOException -> L14
    L12:
        java.util.ArrayList r1 = new java.util.ArrayList();
        r1.addAll(r0.values());
        java.util.Collections.sort(r1, new abcd.fB(this));
        j6(false);
        return r1;
    L9:
        if (this.FH != abcd.gB.a.DW) goto L11;
        r0 = this.j6.we().DW("refs/remotes/");     // Catch: java.io.IOException -> L14
        goto L12
    L11:
        r0 = new java.util.HashMap(this.j6.we().DW("refs/heads/"));     // Catch: java.io.IOException -> L14
        r0.putAll(this.j6.we().DW("refs/remotes/"));     // Catch: java.io.IOException -> L14
        goto L12
    }

    public abcd.gB j6(abcd.gB.a r1) {
        j6();
        this.FH = r1;
        return this;
    }
}
