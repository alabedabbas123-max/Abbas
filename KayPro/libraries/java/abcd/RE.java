package abcd;

public abstract class RE {
    private boolean DW;
    private abcd.KE FH;
    private java.lang.String Hw;
    private abcd.yE VH;
    private abcd.yE Zo;
    private abcd.RE.a gn;
    private abcd.yE j6;
    private boolean tp;
    private final abcd.ME u7;
    private boolean v5;

    public static final enum a extends java.lang.Enum<abcd.RE.a> {
        public static final abcd.RE.a DW = null;
        private static final abcd.RE.a[] EQ = null;
        public static final abcd.RE.a FH = null;
        public static final abcd.RE.a Hw = null;
        public static final abcd.RE.a VH = null;
        public static final abcd.RE.a Zo = null;
        public static final abcd.RE.a gn = null;
        public static final abcd.RE.a j6 = null;
        public static final abcd.RE.a tp = null;
        public static final abcd.RE.a u7 = null;
        public static final abcd.RE.a v5 = null;

        static {
            j6 = new abcd.RE.a("NOT_ATTEMPTED", 0);
            DW = new abcd.RE.a("LOCK_FAILURE", 1);
            FH = new abcd.RE.a("NO_CHANGE", 2);
            Hw = new abcd.RE.a("NEW", 3);
            v5 = new abcd.RE.a("FORCED", 4);
            Zo = new abcd.RE.a("FAST_FORWARD", 5);
            VH = new abcd.RE.a("REJECTED", 6);
            gn = new abcd.RE.a("REJECTED_CURRENT_BRANCH", 7);
            u7 = new abcd.RE.a("IO_FAILURE", 8);
            tp = new abcd.RE.a("RENAMED", 9);
            EQ = new abcd.RE.a[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.RE.a valueOf(java.lang.String r1) {
            return (abcd.RE.a) java.lang.Enum.valueOf(abcd.RE.a.class, r1);
        }

        public static abcd.RE.a[] values() {
            abcd.RE.a[] r0 = EQ;
            int r1 = r0.length;
            abcd.RE.a[] r2 = new abcd.RE.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    private abstract class b {
        final abcd.RE j6;

        private b(abcd.RE r1) {
            this.j6 = r1;
        }

        b(abcd.RE r1, abcd.RE.b r2) {
            this(r1);
        }

        abstract abcd.RE.a j6(abcd.RE.a r1);
    }

    protected RE(abcd.ME r2) {
        this.gn = abcd.RE.a.j6;
        this.u7 = r2;
        this.Zo = r2.DW();
        this.Hw = "";
    }

    private void aM() {
        if (this.j6 == null) goto L6;
        return;
    L6:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().aNewObjectIdIsRequired);
    }

    private abcd.RE.a j6(abcd.qG r4, abcd.RE.b r5) {
        if (gn().FH(Hw()) == false) goto L55;
        return abcd.RE.a.DW;
    L55:
    L52:
        th = move-exception;
        QX();
        throw th;
    L8:
        if (DW(true) == true) goto L13;
        abcd.RE.a r6 = abcd.RE.a.DW;     // Catch: java.lang.Throwable -> L52
        QX();
        return r6;
    L13:
        if (this.VH == null) goto L24;
        if (this.Zo == null) goto L17;
        abcd.yE r0 = this.Zo;     // Catch: java.lang.Throwable -> L52
    L19:
        if (abcd.YD.j6(this.VH, r0) == true) goto L24;
        abcd.RE.a r7 = abcd.RE.a.DW;     // Catch: java.lang.Throwable -> L52
        QX();
        return r7;
    L17:
        r0 = abcd.yE.Ws();     // Catch: java.lang.Throwable -> L52
    L24:
        if (this.Zo != null) goto L28;
        abcd.RE.a r8 = r5.j6(abcd.RE.a.Hw);     // Catch: java.lang.Throwable -> L52
        QX();
        return r8;
    L28:
        abcd.AbstractiG r1 = j6(r4, this.j6);     // Catch: java.lang.Throwable -> L52
        abcd.AbstractiG r2 = j6(r4, this.Zo);     // Catch: java.lang.Throwable -> L52
        if (r1 != r2) goto L36;
        if (this.tp == true) goto L36;
        abcd.RE.a r9 = r5.j6(abcd.RE.a.FH);     // Catch: java.lang.Throwable -> L52
        QX();
        return r9;
    L36:
        if ((r1 instanceof abcd.dG) == false) goto L45;
        if ((r2 instanceof abcd.dG) == false) goto L45;
        if (r4.j6((abcd.dG) r2, (abcd.dG) r1) == false) goto L45;
        abcd.RE.a r10 = r5.j6(abcd.RE.a.Zo);     // Catch: java.lang.Throwable -> L52
        QX();
        return r10;
    L45:
        if (J0() == false) goto L49;
        abcd.RE.a r11 = r5.j6(abcd.RE.a.v5);     // Catch: java.lang.Throwable -> L52
        QX();
        return r11;
    L49:
        abcd.RE.a r12 = abcd.RE.a.VH;     // Catch: java.lang.Throwable -> L52
        QX();
        return r12;
    }

    private static abcd.AbstractiG j6(abcd.qG r1, abcd.YD r2) {
        if (r2 == null) goto L9;
        return r1.Zo(r2);
    L10:
        return null;
    L9:
        return null;
    }

    protected abstract abcd.RE.a DW(abcd.RE.a r1);

    public abcd.RE.a DW(abcd.qG r2) {
        aM();
        abcd.RE.a r3 = j6(r2, new abcd.PE(this));     // Catch: java.io.IOException -> L5
        this.gn = r3;     // Catch: java.io.IOException -> L5
        return r3;
    L5:
        e = move-exception;
        this.gn = abcd.RE.a.u7;
        throw e;
    }

    public abcd.RE.a DW(java.lang.String r5) {
        if (r5.startsWith("refs/") == false) goto L42;
        if (gn().FH(Hw()) == true) goto L7;
    L36:
        e = move-exception;
        this.gn = abcd.RE.a.u7;     // Catch: java.lang.Throwable -> L34
        throw e;     // Catch: java.lang.Throwable -> L34
    L9:
        if (DW(false) == true) goto L13;
        abcd.RE.a r6 = abcd.RE.a.DW;     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        QX();
        return r6;
    L13:
        abcd.ME r0 = gn().j6(Hw());     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        if (r0 != null) goto L16;
    L22:
        if (r0 != null) goto L24;
    L26:
        abcd.ME r1 = gn().j6(r5);     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        if (r1 != null) goto L29;
    L31:
        abcd.RE.a r7 = j6(r5);     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        this.gn = r7;     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        QX();
        return r7;
    L29:
        if (r1.DW() == null) goto L31;
        DW(r1.DW());     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        goto L31
    L24:
        if (r0.DW() == null) goto L26;
        j6(r0.DW());     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        goto L26
    L16:
        if (r0.Zo() == false) goto L22;
        if (r5.equals(r0.getTarget().getName()) == false) goto L22;
        abcd.RE.a r8 = abcd.RE.a.FH;     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        this.gn = r8;     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        QX();
        return r8;
    L7:
        return abcd.RE.a.DW;
    L34:
        th = move-exception;
        QX();
        throw th;
    L42:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().illegalArgumentNotA, new java.lang.Object[]{"refs/"}));
    }

    public void DW() {
        this.Hw = null;
        this.v5 = false;
    }

    public void DW(abcd.YD r1) {
        this.j6 = r1.Hw();
    }

    protected abstract boolean DW(boolean r1);

    protected abstract abcd.UE EQ();

    public abcd.RE.a FH() {
        this.DW = true;
        return XL();
    }

    public java.lang.String Hw() {
        return VH().getName();
    }

    public boolean J0() {
        return this.DW;
    }

    protected boolean J8() {
        return this.v5;
    }

    protected abstract void QX();

    public abcd.ME VH() {
        return this.u7;
    }

    public void Ws() {
        this.tp = true;
    }

    public abcd.RE.a XL() {
        abcd.qG r0 = new abcd.qG(EQ());
        abcd.RE.a r1 = DW(r0);     // Catch: java.lang.Throwable -> L6
        r0.EQ();
        return r1;
    L6:
        th = move-exception;
        r0.EQ();
        throw th;
    }

    public abcd.yE Zo() {
        return this.Zo;
    }

    protected abstract abcd.OE gn();

    public abcd.RE.a j6() {
        abcd.qG r0 = new abcd.qG(EQ());
        abcd.RE.a r1 = j6(r0);     // Catch: java.lang.Throwable -> L6
        r0.EQ();
        return r1;
    L6:
        th = move-exception;
        r0.EQ();
        throw th;
    }

    protected abstract abcd.RE.a j6(abcd.RE.a r1);

    public abcd.RE.a j6(abcd.qG r4) {
        java.lang.String r0 = VH().v5().getName();
        if (r0.startsWith("refs/heads/") == false) goto L18;
        abcd.ME r1 = gn().j6("HEAD");
    L6:
        if (r1.Zo() == false) goto L18;
        r1 = r1.getTarget();
        if (r0.equals(r1.getName()) == false) goto L6;
        abcd.RE.a r5 = abcd.RE.a.gn;
        this.gn = r5;
        return r5;
    L18:
        abcd.RE.a r6 = j6(r4, new abcd.QE(this));     // Catch: java.io.IOException -> L14
        this.gn = r6;     // Catch: java.io.IOException -> L14
        return r6;
    L14:
        e = move-exception;
        this.gn = abcd.RE.a.u7;
        throw e;
    }

    protected abstract abcd.RE.a j6(java.lang.String r1);

    public void j6(abcd.KE r1) {
        this.FH = r1;
    }

    public void j6(abcd.YD r1) {
        if (r1 == null) goto L4;
        abcd.yE r2 = r1.J8();
    L5:
        this.VH = r2;
        return;
    L4:
        r2 = null;
        goto L5
    }

    protected void j6(abcd.yE r1) {
        this.Zo = r1;
    }

    public void j6(java.lang.String r1, boolean r2) {
        if (r1 != null) goto L5;
        if (r2 == true) goto L5;
        DW();
        return;
    L5:
        if (r1 != null) goto L8;
        if (r2 == false) goto L8;
        this.Hw = "";
        this.v5 = true;
        return;
    L8:
        this.Hw = r1;
        this.v5 = r2;
    }

    public void j6(boolean r1) {
        this.DW = r1;
    }

    public java.lang.String tp() {
        return this.Hw;
    }

    public abcd.KE u7() {
        return this.FH;
    }

    public abcd.yE v5() {
        return this.j6;
    }

    public abcd.RE.a we() {
        return this.gn;
    }
}
