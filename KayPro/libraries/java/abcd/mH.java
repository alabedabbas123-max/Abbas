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
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH.j6(true);
                    this.FH.DW(true);
                    try {
                        this.FH.j6(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        this.FH.Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc0 = 11; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.FH.j6() == false) { $pc0 = 10; continue $sw0; }
                    abcd.nH.DW(this.DW).compareAndSet(this.Hw, new abcd.nH.g(this.v5, this.FH.DW()));
                    return;
                }
                case 10: {
                    throw new abcd.kD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unableToWrite, new java.lang.Object[]{r5}));
                }
                case 11: {
                    this.FH.v5();
                    throw new abcd.kD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().interruptedWriting, new java.lang.Object[]{r5}));
                }
                case 13: {
                    e = $ex0;
                    throw new abcd.kD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unableToWrite, new java.lang.Object[]{r5}), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
