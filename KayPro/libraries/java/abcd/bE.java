package abcd;

public class bE<B extends abcd.bE, R extends abcd.UE> {
    private java.io.File DW;
    private java.io.File FH;
    private java.util.List<java.io.File> Hw;
    private java.util.List<java.io.File> VH;
    private java.io.File Zo;
    private boolean gn;
    private abcd.AbstractpK j6;
    private abcd.gE tp;
    private boolean u7;
    private java.io.File v5;

    public bE() {
    }

    private java.io.File U2() {
        abcd.gE r0 = FH();
        java.lang.String r3 = r0.j6("core", null, "worktree");
        if (r3 == null) goto L7;
        return J8().j6(v5(), r3);
    L7:
        if (r0.j6("core", null, "bare") == null) goto L15;
        if (r0.j6("core", "bare", true) == false) goto L13;
        QX();
        return null;
    L13:
        return v5().getParentFile();
    L15:
        if (v5().getName().equals(".git") == true) goto L17;
        QX();
        return null;
    L17:
        return v5().getParentFile();
    }

    private static boolean j6(byte[] r5) {
        if (r5.length >= 9) goto L6;
        return false;
    L6:
        if (r5[0] == 103) goto L8;
    L22:
        return false;
    L8:
        if (r5[1] != 105) goto L22;
        if (r5[2] != 116) goto L22;
        if (r5[3] != 100) goto L22;
        if (r5[4] != 105) goto L22;
        if (r5[5] != 114) goto L22;
        if (r5[6] != 58) goto L22;
        if (r5[7] != 32) goto L22;
        return true;
    }

    public B DW(java.io.File r2) {
        if (r2 != null) goto L4;
    L7:
        Ws();
        return this;
    L4:
        if (this.VH != null) goto L6;
        this.VH = new java.util.LinkedList();
    L6:
        this.VH.add(r2);
        goto L7
    }

    public java.io.File[] DW() {
        java.util.List<java.io.File> r0 = this.Hw;
        if (r0 != null) goto L7;
        return null;
    L7:
        return (java.io.File[]) r0.toArray(new java.io.File[r0.size()]);
    }

    protected abcd.gE EQ() {
        if (v5() == null) goto L11;
        java.io.File r0 = J8().j6(v5(), "config");
        abcd.FG r1 = new abcd.FG(r0, J8());
        r1.gn();     // Catch: abcd.XC -> L7
        return r1;
    L7:
        e = move-exception;
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().repositoryConfigFileInvalid, new java.lang.Object[]{r0.getAbsolutePath(), e.getMessage()}));
    L11:
        return new abcd.gE();
    }

    public B FH(java.io.File r1) {
        this.DW = r1;
        this.tp = null;
        Ws();
        return this;
    }

    protected abcd.gE FH() {
        if (this.tp != null) goto L6;
        this.tp = EQ();
    L6:
        return this.tp;
    }

    public B Hw(java.io.File r1) {
        this.v5 = r1;
        Ws();
        return this;
    }

    public abcd.AbstractpK Hw() {
        return this.j6;
    }

    protected void J0() {
        if (v5() == null) goto L5;
        return;
    L5:
        if (gn() == null) goto L8;
        return;
    L8:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().eitherGitDirOrWorkTreeRequired);
    }

    protected abcd.AbstractpK J8() {
        if (Hw() == null) goto L6;
        return Hw();
    L6:
        return abcd.AbstractpK.j6;
    }

    protected void Mr() {
        if (Hw() != null) goto L6;
        j6(abcd.AbstractpK.j6);
    L6:
        if (u7() == true) goto L11;
        if (gn() != null) goto L11;
        Zo(U2());
    L11:
        if (u7() == false) goto L13;
        return;
    L13:
        if (v5() != null) goto L16;
        FH(gn().getParentFile());
    L16:
        if (Zo() != null) goto L20;
        Hw(new java.io.File(v5(), "index"));
        return;
    }

    public B QX() {
        Hw(null);
        Zo(null);
        this.gn = true;
        Ws();
        return this;
    }

    public java.io.File VH() {
        return this.FH;
    }

    protected final B Ws() {
        return this;
    }

    public B XL() {
        J0();
        aM();
        Mr();
        j3();
        Ws();
        return this;
    }

    public B Zo(java.io.File r1) {
        this.Zo = r1;
        Ws();
        return this;
    }

    public java.io.File Zo() {
        return this.v5;
    }

    protected void aM() {
        if (v5() == null) goto L5;
        return;
    L5:
        if (gn() == null) goto L24;
        java.io.File r0 = new java.io.File(gn(), ".git");
        if (r0.isFile() == true) goto L9;
        FH(r0);
        return;
    L9:
        byte[] r1 = abcd.BK.j6(r0);
        if (j6(r1) == false) goto L22;
        int r5 = abcd.IK.Zo(r1, 8);
        if (r1[r5 - 1] != 10) goto L14;
        r5 = r5 - 1;
    L14:
        if (r5 == 8) goto L20;
        java.lang.String r2 = abcd.IK.j6(r1, 8, r5);
        java.io.File r3 = new java.io.File(r2);
        if (r3.isAbsolute() == false) goto L18;
        FH(r3);
        return;
    L18:
        FH(new java.io.File(gn(), r2).getCanonicalFile());
        return;
    L20:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidGitdirRef, new java.lang.Object[]{r0.getAbsolutePath()}));
    L22:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidGitdirRef, new java.lang.Object[]{r0.getAbsolutePath()}));
    }

    public java.io.File gn() {
        return this.Zo;
    }

    protected void j3() {
        if (VH() == null) goto L5;
        return;
    L5:
        if (v5() == null) goto L9;
        v5(J8().j6(v5(), "objects"));
        return;
    }

    public R j6() {
        XL();
        abcd.IG r0 = new abcd.IG(this);
        if (tp() == true) goto L5;
    L9:
        return r0;
    L5:
        if (r0.EQ().DW() == true) goto L9;
        throw new abcd.pD(v5());
    }

    public B j6(abcd.QK r7) {
        if (v5() != null) goto L8;
        java.lang.String r0 = r7.DW("GIT_DIR");
        if (r0 == null) goto L8;
        FH(new java.io.File(r0));
    L8:
        if (VH() != null) goto L12;
        java.lang.String r1 = r7.DW("GIT_OBJECT_DIRECTORY");
        if (r1 == null) goto L12;
        v5(new java.io.File(r1));
    L12:
        int r2 = 0;
        if (DW() != null) goto L21;
        java.lang.String r3 = r7.DW("GIT_ALTERNATE_OBJECT_DIRECTORIES");
        if (r3 == null) goto L21;
        java.lang.String[] r4 = r3.split(java.io.File.pathSeparator);
        int r5 = r4.length;
        int r6 = 0;
    L17:
        if (r6 >= r5) goto L21;
        j6(new java.io.File(r4[r6]));
        r6 = r6 + 1;
    L21:
        if (gn() != null) goto L26;
        java.lang.String r8 = r7.DW("GIT_WORK_TREE");
        if (r8 == null) goto L26;
        Zo(new java.io.File(r8));
    L26:
        if (Zo() != null) goto L31;
        java.lang.String r9 = r7.DW("GIT_INDEX_FILE");
        if (r9 == null) goto L31;
        Hw(new java.io.File(r9));
    L31:
        if (this.VH != null) goto L38;
        java.lang.String r10 = r7.DW("GIT_CEILING_DIRECTORIES");
        if (r10 == null) goto L38;
        java.lang.String[] r11 = r10.split(java.io.File.pathSeparator);
        int r12 = r11.length;
    L35:
        if (r2 >= r12) goto L38;
        DW(new java.io.File(r11[r2]));
        r2 = r2 + 1;
    L38:
        Ws();
        return this;
    }

    public B j6(abcd.AbstractpK r1) {
        this.j6 = r1;
        Ws();
        return this;
    }

    public B j6(java.io.File r2) {
        if (r2 != null) goto L4;
    L7:
        Ws();
        return this;
    L4:
        if (this.Hw != null) goto L6;
        this.Hw = new java.util.LinkedList();
    L6:
        this.Hw.add(r2);
        goto L7
    }

    public B j6(boolean r1) {
        this.u7 = r1;
        Ws();
        return this;
    }

    public boolean tp() {
        return this.u7;
    }

    public boolean u7() {
        return this.gn;
    }

    public B v5(java.io.File r1) {
        this.FH = r1;
        Ws();
        return this;
    }

    public java.io.File v5() {
        return this.DW;
    }

    public B we() {
        j6(abcd.QK.FH());
        return this;
    }
}
