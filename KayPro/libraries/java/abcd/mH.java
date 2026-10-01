package abcd;

class mH extends abcd.SE {
    final abcd.nH DW;
    private final abcd.WG FH;
    private final abcd.nH.g Hw;
    private final abcd.KK v5;

    mH(abcd.nH r1, abcd.KK r2, abcd.WG r3, abcd.nH.g r4, abcd.KK r5) {
        this.DW = r1;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        super(r2);
    }

    @Override
    protected void j6(java.lang.String r5, byte[] r6) {
        this.FH.j6(true);
        this.FH.DW(true);
        this.FH.j6(r6);     // Catch: java.io.IOException -> L13
        this.FH.Zo();     // Catch: java.lang.InterruptedException -> L11
        if (this.FH.j6() == false) goto L10;
        abcd.nH.DW(this.DW).compareAndSet(this.Hw, new abcd.nH.g(this.v5, this.FH.DW()));
        return;
    L10:
        throw new abcd.kD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unableToWrite, new java.lang.Object[]{r5}));
    L11:
        this.FH.v5();
        throw new abcd.kD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().interruptedWriting, new java.lang.Object[]{r5}));
    L13:
        e = move-exception;
        throw new abcd.kD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unableToWrite, new java.lang.Object[]{r5}), e);
    }
}
