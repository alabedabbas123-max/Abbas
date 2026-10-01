package abcd;

public class FG extends abcd.AbstractjF {
    private final abcd.AbstractpK VH;
    private final java.io.File Zo;
    private volatile abcd.LG gn;
    private volatile abcd.yE u7;

    public FG(abcd.gE r1, java.io.File r2, abcd.AbstractpK r3) {
        super(r1);
        this.Zo = r2;
        this.VH = r3;
        this.gn = abcd.LG.j6;
        this.u7 = abcd.yE.Ws();
    }

    public FG(java.io.File r2, abcd.AbstractpK r3) {
        this(null, r2, r3);
    }

    private static abcd.yE j6(byte[] r1) {
        return abcd.yE.j6(abcd.hE.j6().digest(r1));
    }

    @Override
    protected boolean FH() {
        return false;
    }

    public boolean VH() {
        return this.gn.j6(Zo());
    }

    public final java.io.File Zo() {
        return this.Zo;
    }

    public void gn() {
        abcd.LG r0 = this.gn;
        abcd.LG r1 = abcd.LG.DW(Zo());
        byte[] r4 = abcd.BK.j6(Zo());     // Catch: abcd.XC -> L11 java.io.IOException -> L14 java.io.FileNotFoundException -> L17
        abcd.yE r5 = j6(r4);     // Catch: abcd.XC -> L11 java.io.IOException -> L14 java.io.FileNotFoundException -> L17
        if (this.u7.DW(r5) == true) goto L6;
        j6(abcd.IK.j6(r4));     // Catch: abcd.XC -> L11 java.io.IOException -> L14 java.io.FileNotFoundException -> L17
        this.gn = r1;     // Catch: abcd.XC -> L11 java.io.IOException -> L14 java.io.FileNotFoundException -> L17
        this.u7 = r5;     // Catch: abcd.XC -> L11 java.io.IOException -> L14 java.io.FileNotFoundException -> L17
    L19:
        return;
    L6:
        if (r0.j6(r1) == false) goto L8;
        r0.DW(r1);     // Catch: abcd.XC -> L11 java.io.IOException -> L14 java.io.FileNotFoundException -> L17
        goto L19
    L8:
        this.gn = r1;     // Catch: abcd.XC -> L11 java.io.IOException -> L14 java.io.FileNotFoundException -> L17
    L11:
        e = move-exception;
        throw new abcd.XC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotReadFile, new java.lang.Object[]{Zo()}), e);
    L17:
        j6();
        this.gn = r1;
        return;
    L14:
        e = move-exception;
        java.io.IOException r2 = new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotReadFile, new java.lang.Object[]{Zo()}));
        r2.initCause(e);
        throw r2;
    }

    @Override
    public void j6() {
        this.u7 = j6(new byte[0]);
        super.j6();
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getClass().getSimpleName()) + "[" + Zo().getPath() + "]";
    }

    @Override
    public void v5() {
        byte[] r0 = abcd.hE.j6(Hw());
        abcd.WG r1 = new abcd.WG(Zo(), this.VH);
        if (r1.Hw() == false) goto L15;
        r1.DW(true);     // Catch: java.lang.Throwable -> L11
        r1.j6(r0);     // Catch: java.lang.Throwable -> L11
        if (r1.j6() == false) goto L10;
        r1.v5();
        this.gn = r1.DW();
        this.u7 = j6(r0);
        DW();
        return;
    L10:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotCommitWriteTo, new java.lang.Object[]{Zo()}));     // Catch: java.lang.Throwable -> L11
    L11:
        th = move-exception;
        r1.v5();
        throw th;
    L15:
        throw new abcd.dD(Zo());
    }
}
