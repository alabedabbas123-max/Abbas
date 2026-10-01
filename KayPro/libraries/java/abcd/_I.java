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
        java.lang.String r4 = java.lang.String.valueOf(this.gn) + r3;
    L3:
        int r0 = r4.indexOf(10);
        int r1 = r4.indexOf(13);
        if (r0 < 0) goto L7;
        if (r1 < 0) goto L7;
        r0 = java.lang.Math.min(r0, r1);
    L11:
        int r2 = r0 + 1;
        j6(r4.substring(0, r2));
        r4 = r4.substring(r2);
    L7:
        if (r0 >= 0) goto L11;
        if (r1 < 0) goto L12;
        r0 = r1;
        goto L11
    L12:
        this.gn = r4;
    }

    private void j6() {
        if (this.EQ == false) goto L5;
        return;
    L5:
        if (this.we != 1) goto L9;
        if (this.J0 <= 0) goto L9;
        return;
    L9:
        this.J0 = this.v5.j6();
        if (this.J0 == 0) goto L11;
        this.we = this.Hw.read() & 255;
        this.J0 -= 5;
        int r0 = this.J0;
        if (r0 == 0) goto L9;
        int r2 = this.we;
        if (r2 == 1) goto L37;
        if (r2 != 2) goto L21;
        DW(DW(r0));
        goto L9
    L21:
        if (r2 != 3) goto L23;
        this.EQ = true;
        throw new abcd.yD(java.lang.String.valueOf(j6) + DW(this.J0));
    L23:
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidChannel, new java.lang.Object[]{java.lang.Integer.valueOf(this.we)}));
    L37:
        return;
    L11:
        this.EQ = true;
    }

    private void j6(int r4) {
        this.Zo.j6(java.lang.String.valueOf(j6) + this.u7, r4);
    }

    private void j6(java.lang.String r6) {
        java.util.regex.Matcher r0 = FH.matcher(r6);
        if (r0.matches() == false) goto L9;
        java.lang.String r7 = r0.group(1);
        if (this.u7.equals(r7) == true) goto L7;
        this.u7 = r7;
        this.tp = 0;
        j6(java.lang.Integer.parseInt(r0.group(3)));
    L7:
        int r8 = java.lang.Integer.parseInt(r0.group(2));
        this.Zo.update(r8 - this.tp);
        this.tp = r8;
        return;
    L9:
        java.util.regex.Matcher r1 = DW.matcher(r6);
        if (r1.matches() == false) goto L16;
        java.lang.String r9 = r1.group(1);
        if (this.u7.equals(r9) == true) goto L14;
        this.u7 = r9;
        this.tp = 0;
        j6(0);
    L14:
        int r10 = java.lang.Integer.parseInt(r1.group(2));
        this.Zo.update(r10 - this.tp);
        this.tp = r10;
        return;
    L16:
        this.VH.write(r6);
    }

    @Override
    public int read() {
        j6();
        if (this.EQ == false) goto L6;
        return -1;
    L6:
        this.J0--;
        return this.Hw.read();
    }

    @Override
    public int read(byte[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r6 <= 0) goto L11;
        j6();
        if (this.EQ == true) goto L11;
        int r1 = this.Hw.read(r4, r5, java.lang.Math.min(r6, this.J0));
        if (r1 < 0) goto L11;
        r0 = r0 + r1;
        r5 = r5 + r1;
        r6 = r6 - r1;
        this.J0 -= r1;
    L11:
        if (this.EQ == false) goto L19;
        if (r0 != 0) goto L20;
        return -1;
    L20:
        return r0;
    L19:
        return r0;
    }
}
