package abcd;

class _I extends java.io.InputStream {
    private static java.util.regex.Pattern DW;
    private static java.util.regex.Pattern FH;
    private static final java.lang.String j6 = null;
    private boolean EQ;
    private final java.io.InputStream Hw;
    private int J0;
    private final java.io.Writer VH;
    private final abcd.LE Zo;
    private java.lang.String gn;
    private int tp;
    private java.lang.String u7;
    private final abcd.DI v5;
    private int we;

    static {
        j6 = org.eclipse.jgit.JGitText.j6().prefixRemote;
        DW = java.util.regex.Pattern.compile("^([\\w ]+): +(\\d+)(?:, done\\.)? *[\r\n]$");
        FH = java.util.regex.Pattern.compile("^([\\w ]+): +\\d+% +\\( *(\\d+)/ *(\\d+)\\)(?:, done\\.)? *[\r\n]$");
    }

    _I(java.io.InputStream r3, abcd.LE r4, java.io.Writer r5) {
        this.gn = "";
        this.Hw = r3;
        this.v5 = new abcd.DI(this.Hw);
        this.Zo = r4;
        this.VH = r5;
        this.u7 = "";
    }

    private java.lang.String DW(int r4) {
        byte[] r0 = new byte[r4];
        abcd.BK.j6(this.Hw, r0, 0, r4);
        return abcd.IK.j6(abcd.hE.Zo, r0, 0, r4);
    }

    private void DW(java.lang.String r3) {
        java.lang.String r4 = null;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r4 = java.lang.String.valueOf(this.gn) + r3;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r0 = r4.indexOf(10);
                    r1 = r4.indexOf(13);
                    if (r0 < 0) { $pc0 = 7; continue $sw0; }
                    if (r1 < 0) { $pc0 = 7; continue $sw0; }
                    r0 = java.lang.Math.min(r0, r1);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r2 = r0 + 1;
                    j6(r4.substring(0, r2));
                    r4 = r4.substring(r2);
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r0 >= 0) { $pc0 = 11; continue $sw0; }
                    if (r1 < 0) { $pc0 = 12; continue $sw0; }
                    r0 = r1;
                    { $pc0 = 11; continue $sw0; }
                }
                case 12: {
                    this.gn = r4;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6() {
        int r0 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.EQ == false) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    if (this.we != 1) { $pc1 = 9; continue $sw1; }
                    if (this.J0 <= 0) { $pc1 = 9; continue $sw1; }
                    return;
                }
                case 9: {
                    this.J0 = this.v5.j6();
                    if (this.J0 == 0) { $pc1 = 11; continue $sw1; }
                    this.we = this.Hw.read() & 255;
                    this.J0 -= 5;
                    r0 = this.J0;
                    if (r0 == 0) { $pc1 = 9; continue $sw1; }
                    r2 = this.we;
                    if (r2 == 1) { $pc1 = 37; continue $sw1; }
                    if (r2 != 2) { $pc1 = 21; continue $sw1; }
                    DW(DW(r0));
                    { $pc1 = 9; continue $sw1; }
                }
                case 21: {
                    if (r2 != 3) { $pc1 = 23; continue $sw1; }
                    this.EQ = true;
                    throw new abcd.yD(java.lang.String.valueOf(j6) + DW(this.J0));
                }
                case 23: {
                    throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidChannel, new java.lang.Object[]{java.lang.Integer.valueOf(this.we)}));
                }
                case 37: {
                    return;
                }
                case 11: {
                    this.EQ = true;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r4) {
        this.Zo.j6(java.lang.String.valueOf(j6) + this.u7, r4);
    }

    private void j6(java.lang.String r6) {
        java.util.regex.Matcher r0 = null;
        java.lang.String r7 = null;
        int r8 = 0;
        java.util.regex.Matcher r1 = null;
        java.lang.String r9 = null;
        int r10 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = FH.matcher(r6);
                    if (r0.matches() == false) { $pc2 = 9; continue $sw2; }
                    r7 = r0.group(1);
                    if (this.u7.equals(r7) == true) { $pc2 = 7; continue $sw2; }
                    this.u7 = r7;
                    this.tp = 0;
                    j6(java.lang.Integer.parseInt(r0.group(3)));
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    r8 = java.lang.Integer.parseInt(r0.group(2));
                    this.Zo.update(r8 - this.tp);
                    this.tp = r8;
                    return;
                }
                case 9: {
                    r1 = DW.matcher(r6);
                    if (r1.matches() == false) { $pc2 = 16; continue $sw2; }
                    r9 = r1.group(1);
                    if (this.u7.equals(r9) == true) { $pc2 = 14; continue $sw2; }
                    this.u7 = r9;
                    this.tp = 0;
                    j6(0);
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    r10 = java.lang.Integer.parseInt(r1.group(2));
                    this.Zo.update(r10 - this.tp);
                    this.tp = r10;
                    return;
                }
                case 16: {
                    this.VH.write(r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    j6();
                    if (this.EQ == false) { $pc3 = 6; continue $sw3; }
                    return -1;
                }
                case 6: {
                    this.J0--;
                    return this.Hw.read();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r4, int r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r6 <= 0) { $pc4 = 11; continue $sw4; }
                    j6();
                    if (this.EQ == true) { $pc4 = 11; continue $sw4; }
                    r1 = this.Hw.read(r4, r5, java.lang.Math.min(r6, this.J0));
                    if (r1 < 0) { $pc4 = 11; continue $sw4; }
                    r0 = r0 + r1;
                    r5 = r5 + r1;
                    r6 = r6 - r1;
                    this.J0 -= r1;
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    if (this.EQ == false) { $pc4 = 19; continue $sw4; }
                    if (r0 != 0) { $pc4 = 20; continue $sw4; }
                    return -1;
                }
                case 20: {
                    return r0;
                }
                case 19: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
