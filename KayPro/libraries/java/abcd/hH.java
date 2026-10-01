package abcd;

class hH extends abcd.AbstractgH {
    hH(java.io.OutputStream r1) {
        super(r1);
    }

    static boolean j6(abcd.CI r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r5.getOffset() >>> 1) >= 2147483647L) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void FH() {
        java.util.Iterator<? extends abcd.CI> r0 = null;
        abcd.CI r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    DW();
                    r0 = this.Hw.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc1 = 5; continue $sw1; }
                    r1 = r0.next();
                    if (j6(r1) == false) { $pc1 = 11; continue $sw1; }
                    abcd.FK.DW(this.FH, 0, (int) r1.getOffset());
                    r1.DW(this.FH, 4);
                    this.DW.write(this.FH);
                    { $pc1 = 4; continue $sw1; }
                }
                case 11: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packTooLargeForIndexVersion1);
                }
                case 5: {
                    j6();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
