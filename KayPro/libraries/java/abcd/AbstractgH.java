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
        if ((r3 instanceof java.io.BufferedOutputStream) == true) goto L6;
        r3 = new abcd.XK(r3);
    L6:
        this.DW = new java.security.DigestOutputStream(r3, abcd.hE.j6());
        this.FH = new byte[24];
    }

    public static abcd.AbstractgH j6(java.io.OutputStream r3, int r4) {
        if (r4 == 1) goto L11;
        if (r4 != 2) goto L9;
        return new abcd.iH(r3);
    L9:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedPackIndexVersion, new java.lang.Object[]{java.lang.Integer.valueOf(r4)}));
    L11:
        return new abcd.hH(r3);
    }

    public static abcd.AbstractgH j6(java.io.OutputStream r1, java.util.List<? extends abcd.CI> r2) {
        java.util.Iterator<? extends abcd.CI> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L5;
        if (abcd.hH.j6(r3.next()) == true) goto L4;
        int r4 = 2;
    L11:
        return j6(r1, r4);
    L5:
        r4 = 1;
        goto L11
    }

    protected void DW() {
        int[] r1 = new int[256];
        java.util.Iterator<? extends abcd.CI> r2 = this.Hw.iterator();
    L3:
        int r4 = 1;
        if (r2.hasNext() == false) goto L5;
        int r3 = r2.next().Zo() & 255;
        r1[r3] = r1[r3] + 1;
    L5:
        if (r4 >= 256) goto L6;
        r1[r4] = r1[r4] + r1[r4 - 1];
        r4 = r4 + 1;
        goto L5
    L6:
        int r5 = r1.length;
        int r0 = 0;
    L7:
        if (r0 >= r5) goto L8;
        abcd.FK.DW(this.FH, 0, r1[r0]);
        this.DW.write(this.FH, 0, 4);
        r0 = r0 + 1;
        goto L7
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
