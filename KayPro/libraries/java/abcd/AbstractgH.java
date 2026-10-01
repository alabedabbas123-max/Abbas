package abcd;

public abstract class AbstractgH {
    protected static final byte[] j6 = null;
    protected final java.security.DigestOutputStream DW;
    protected final byte[] FH;
    protected java.util.List<? extends abcd.CI> Hw;
    protected byte[] v5;

    static {
        j6 = new byte[]{-1, 116, 79, 99};
    }

    protected AbstractgH(java.io.OutputStream r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r3 instanceof java.io.BufferedOutputStream) == true) { $pc0 = 6; continue $sw0; }
                    r3 = new abcd.XK(r3);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.DW = new java.security.DigestOutputStream(r3, abcd.hE.j6());
                    this.FH = new byte[24];
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractgH j6(java.io.OutputStream r3, int r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4 == 1) { $pc1 = 11; continue $sw1; }
                    if (r4 != 2) { $pc1 = 9; continue $sw1; }
                    return new abcd.iH(r3);
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedPackIndexVersion, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
                }
                case 11: {
                    return new abcd.hH(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractgH j6(java.io.OutputStream r1, java.util.List<? extends abcd.CI> r2) {
        java.util.Iterator<? extends abcd.CI> r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r3 = r2.iterator();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc2 = 5; continue $sw2; }
                    if (abcd.hH.j6(r3.next()) == true) { $pc2 = 4; continue $sw2; }
                    r4 = 2;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    return j6(r1, r4);
                }
                case 5: {
                    r4 = 1;
                    { $pc2 = 11; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void DW() {
        int[] r1 = null;
        java.util.Iterator<? extends abcd.CI> r2 = null;
        int r4 = 0;
        int r3 = 0;
        int r5 = 0;
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = new int[256];
                    r2 = this.Hw.iterator();
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    r4 = 1;
                    if (r2.hasNext() == false) { $pc3 = 5; continue $sw3; }
                    r3 = r2.next().Zo() & 255;
                    r1[r3] = r1[r3] + 1;
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r4 >= 256) { $pc3 = 6; continue $sw3; }
                    r1[r4] = r1[r4] + r1[r4 - 1];
                    r4 = r4 + 1;
                    { $pc3 = 5; continue $sw3; }
                }
                case 6: {
                    r5 = r1.length;
                    r0 = 0;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r0 >= r5) { $pc3 = 8; continue $sw3; }
                    abcd.FK.DW(this.FH, 0, r1[r0]);
                    this.DW.write(this.FH, 0, 4);
                    r0 = r0 + 1;
                    { $pc3 = 7; continue $sw3; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void FH();

    protected void j6() {
        this.DW.write(this.v5);
        this.DW.on(false);
        java.security.DigestOutputStream r0 = this.DW;
        r0.write(r0.getMessageDigest().digest());
    }

    protected void j6(int r4) {
        this.DW.write(j6);
        abcd.FK.DW(this.FH, 0, r4);
        this.DW.write(this.FH, 0, 4);
    }

    public void j6(java.util.List<? extends abcd.CI> r1, byte[] r2) {
        this.Hw = r1;
        this.v5 = r2;
        FH();
        this.DW.flush();
    }
}
