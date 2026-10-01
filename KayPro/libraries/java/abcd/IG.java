package abcd;

public class IG extends abcd.UE {
    private final abcd.OE EQ;
    private abcd.LG J0;
    private final abcd.FG gn;
    private final abcd.FG tp;
    private final abcd.FG u7;
    private final abcd.XG we;

    public IG(abcd.bE r7) {
        super(r7);
        this.gn = abcd.QK.FH().j6(null, gn());
        this.u7 = abcd.QK.FH().DW(this.gn, gn());
        this.tp = new abcd.FG(this.u7, gn().j6(VH(), "config"), gn());
        er();
        yS();
        rN();
        this.tp.j6(new abcd.HG(this));
        this.EQ = new abcd.nH(this);
        this.we = new abcd.XG(this.tp, r7.VH(), r7.DW(), gn());
        if (this.we.DW() == false) goto L10;
        java.lang.String r8 = Zo().j6("core", null, "repositoryformatversion");
        if ("0".equals(r8) == true) goto L10;
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownRepositoryFormat2, new java.lang.Object[]{r8}));
    L10:
        if (QX() == true) goto L13;
        this.J0 = abcd.LG.DW(tp());
        return;
    }

    public IG(java.io.File r2) {
        abcd.JG r0 = new abcd.JG();
        r0.FH(r2);
        abcd.JG r1 = r0;
        r1.XL();
        this(r1);
    }

    private void er() {
        this.gn.gn();     // Catch: abcd.XC -> L4
        return;
    L4:
        e = move-exception;
        java.io.IOException r1 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().systemConfigFileInvalid, new java.lang.Object[]{this.gn.Zo().getAbsolutePath(), e}));
        r1.initCause(e);
        throw r1;
    }

    private void rN() {
        this.tp.gn();     // Catch: abcd.XC -> L4
        return;
    L4:
        e = move-exception;
        java.io.IOException r1 = new java.io.IOException(org.eclipse.jgit.JGitText.j6().unknownRepositoryFormat);
        r1.initCause(e);
        throw r1;
    }

    private void yS() {
        this.u7.gn();     // Catch: abcd.XC -> L4
        return;
    L4:
        e = move-exception;
        java.io.IOException r1 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().userConfigFileInvalid, new java.lang.Object[]{this.u7.Zo().getAbsolutePath(), e}));
        r1.initCause(e);
        throw r1;
    }

    @Override
    public abcd.XG EQ() {
        return this.we;
    }

    @Override
    public abcd.AbstractxE EQ() {
        return EQ();
    }

    @Override
    public java.util.Set<abcd.yE> Hw() {
        java.util.HashSet r0 = new java.util.HashSet();
        abcd.GG.a[] r1 = this.we.tp();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L4;
        abcd.GG.a r4 = r1[r3];
        if ((r4 instanceof abcd.GG.b) == false) goto L17;
        abcd.IG r5 = ((abcd.GG.b) r4).DW;
        java.util.Iterator<abcd.ME> r6 = r5.v5().values().iterator();
    L9:
        if (r6.hasNext() == false) goto L10;
        abcd.ME r7 = r6.next();
        if (r7.DW() == null) goto L15;
        r0.add(r7.DW());
    L15:
        if (r7.FH() == null) goto L9;
        r0.add(r7.FH());
        goto L9
    L10:
        r0.addAll(r5.Hw());
    L17:
        r3 = r3 + 1;
        goto L3
    L4:
        return r0;
    }

    @Override
    public void Mr() {
        this.J0 = abcd.LG.DW(tp());
        j6(new abcd.ED());
    }

    @Override
    public abcd.FG Zo() {
        if (this.gn.VH() == false) goto L10;
        er();     // Catch: java.io.IOException -> L6
    L6:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    L10:
        if (this.u7.VH() == false) goto L17;
        yS();     // Catch: java.io.IOException -> L13
    L13:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    L17:
        if (this.tp.VH() == false) goto L24;
        rN();     // Catch: java.io.IOException -> L20
    L20:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    L24:
        return this.tp;
    }

    @Override
    public abcd.AbstractjF Zo() {
        return Zo();
    }

    @Override
    public void j6(boolean r8) {
        abcd.FG r0 = Zo();
        if (r0.Zo().exists() == true) goto L17;
        abcd.zK.DW(VH(), true);
        this.EQ.DW();
        this.we.J0();
        abcd.zK.DW(new java.io.File(VH(), "branches"));
        abcd.zK.DW(new java.io.File(VH(), "hooks"));
        abcd.RE r1 = v5("HEAD");
        r1.DW();
        r1.DW("refs/heads/master");
        if (gn().v5() == false) goto L10;
        java.io.File r2 = java.io.File.createTempFile("try", "execute", VH());
        gn().j6(r2, true);
        boolean r4 = gn().j6(r2);
        gn().j6(r2, false);
        boolean r5 = gn().j6(r2);
        abcd.zK.j6(r2);
        if (r4 == false) goto L10;
        if (r5 == true) goto L10;
        boolean r3 = true;
    L11:
        r0.DW("core", null, "repositoryformatversion", 0);
        r0.DW("core", null, "filemode", r3);
        if (r8 == false) goto L14;
        r0.DW("core", null, "bare", true);
    L14:
        r0.DW("core", null, "logallrefupdates", !r8);
        r0.DW("core", null, "autocrlf", false);
        r0.v5();
        return;
    L10:
        r3 = false;
        goto L11
    L17:
        throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().repositoryAlreadyExists, new java.lang.Object[]{VH()}));
    }

    @Override
    public abcd.OE we() {
        return this.EQ;
    }
}
