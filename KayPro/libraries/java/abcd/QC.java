package abcd;

public class QC {
    private static final byte[] j6 = null;
    private final byte[] DW;
    private final int FH;
    final byte[] Hw;
    private byte v5;

    static {
        j6 = new byte[8];
    }

    public QC(java.lang.String r1) {
        this(abcd.hE.j6(r1));
    }

    public QC(java.lang.String r1, int r2) {
        this(abcd.hE.j6(r1), r2);
    }

    public QC(byte[] r2) {
        this(r2, 0);
    }

    public QC(byte[] r6, int r7) {
        if (j6(r6) == false) goto L16;
        if (r7 < 0) goto L14;
        if (3 < r7) goto L14;
        this.DW = new byte[62];
        this.FH = 0;
        this.Hw = r6;
        int r8 = (r7 & 3) << 12;
        byte[] r9 = this.Hw;
        if (r9.length >= 4095) goto L10;
        int r10 = r8 | r9.length;
    L11:
        abcd.FK.j6(this.DW, this.FH + 60, r10);
        return;
    L10:
        r10 = r8 | 4095;
    L14:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidStageForPath, new java.lang.Object[]{java.lang.Integer.valueOf(r7), DW(r6)}));
    L16:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidPath, new java.lang.Object[]{DW(r6)}));
    }

    QC(byte[] r6, abcd.EK r7, java.io.InputStream r8, java.security.MessageDigest r9) {
        this.DW = r6;
        this.FH = r7.j6;
        abcd.BK.j6(r8, this.DW, this.FH, 62);
        int r0 = 1;
        if (EQ() == false) goto L9;
        int r10 = 64;
        abcd.BK.j6(r8, this.DW, this.FH + 62, 2);
        if ((QX() & (-1610612737)) != 0) goto L8;
    L10:
        r7.j6 += r10;
        r9.update(this.DW, this.FH, r10);
        int r11 = abcd.FK.DW(this.DW, this.FH + 60) & 4095;
        if (r11 >= 4095) goto L13;
        this.Hw = new byte[r11];
        abcd.BK.j6(r8, this.Hw, 0, r11);
        r9.update(this.Hw, 0, r11);
        r0 = 0;
    L18:
        int r12 = r10 + r11;
        int r13 = (((r12 + 8) & (-8)) - r12) - r0;
        if (r13 <= 0) goto L28;
        abcd.BK.j6(r8, r13);
        r9.update(j6, 0, r13);
        return;
    L28:
        return;
    L13:
        java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream();
        byte[] r3 = new byte[4095];
        abcd.BK.j6(r8, r3, 0, 4095);
        r14.write(r3);
    L14:
        int r1 = r8.read();
        if (r1 < 0) goto L24;
        if (r1 == 0) goto L17;
        r14.write(r1);
        goto L14
    L17:
        this.Hw = r14.toByteArray();
        byte[] r15 = this.Hw;
        int r2 = r15.length;
        r9.update(r15, 0, r2);
        r9.update((byte) 0);
        r11 = r2;
        goto L18
    L24:
        throw new java.io.EOFException(org.eclipse.jgit.JGitText.j6().shortReadOfBlock);
    L8:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().DIRCUnrecognizedExtendedFlags, new java.lang.Object[]{java.lang.String.valueOf(QX())}));
    L9:
        r10 = 62;
        goto L10
    }

    private long DW(int r6) {
        int r0 = this.FH + r6;
        int r7 = abcd.FK.j6(this.DW, r0);
        int r1 = abcd.FK.j6(this.DW, r0 + 4) / 1000000;
        return (((long) r7) * 1000) + ((long) r1);
    }

    private static java.lang.String DW(byte[] r1) {
        return abcd.hE.Zo.decode(java.nio.ByteBuffer.wrap(r1)).toString();
    }

    private int QX() {
        if (EQ() == true) goto L5;
        return 0;
    L5:
        return abcd.FK.DW(this.DW, this.FH + 62) << 16;
    }

    static int j6(boolean r0) {
        if (r0 == false) goto L4;
        return 64;
    L4:
        return 62;
    }

    private void j6(int r6, long r7) {
        int r0 = this.FH + r6;
        abcd.FK.DW(this.DW, r0, (int) (r7 / 1000));
        abcd.FK.DW(this.DW, r0 + 4, ((int) (r7 % 1000)) * 1000000);
    }

    static boolean j6(byte[] r6) {
        if (r6.length != 0) goto L5;
        return false;
    L5:
        int r0 = r6.length;
        int r2 = 0;
        boolean r3 = false;
    L6:
        if (r2 >= r0) goto L7;
        byte r4 = r6[r2];
        if (r4 == 0) goto L16;
        if (r4 == 47) goto L13;
        r3 = true;
    L15:
        r2 = r2 + 1;
        goto L6
    L13:
        if (r3 == false) goto L16;
        r3 = false;
    L16:
        return false;
    L7:
        return r3;
    }

    public long DW() {
        return DW(8);
    }

    public void DW(long r6) {
        if (2147483647L <= r6) goto L7;
        j6((int) r6);
        return;
    L7:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().sizeExceeds2GB, new java.lang.Object[]{v5(), java.lang.Long.valueOf(r6)}));
    }

    boolean EQ() {
        if ((this.DW[this.FH + 60] & 64) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public int FH() {
        return abcd.FK.j6(this.DW, this.FH + 36);
    }

    public abcd.yE Hw() {
        return abcd.yE.Hw(gn(), u7());
    }

    public final boolean J0() {
        int r0 = this.FH + 40;
        if (FH() == 0) goto L5;
        return false;
    L5:
        if (abcd.hE.VH.j6(this.DW, r0) == 0) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean J8() {
        if ((this.v5 & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public int VH() {
        return (this.DW[this.FH + 60] >>> 4) & 3;
    }

    public final void Ws() {
        int r0 = this.FH + 36;
        java.util.Arrays.fill(this.DW, r0, r0 + 4, (byte) 0);
    }

    public int Zo() {
        return abcd.FK.j6(this.DW, this.FH + 24);
    }

    final byte[] gn() {
        return this.DW;
    }

    public abcd.AbstractrE j6() {
        return abcd.AbstractrE.DW(Zo());
    }

    public void j6(int r3) {
        abcd.FK.DW(this.DW, this.FH + 36, r3);
    }

    public void j6(long r2) {
        j6(8, r2);
    }

    public void j6(abcd.QC r6) {
        int r0 = abcd.FK.DW(this.DW, this.FH + 60) & 4095;
        java.lang.System.arraycopy(r6.DW, r6.FH, this.DW, this.FH, 62);
        byte[] r7 = this.DW;
        int r1 = this.FH;
        abcd.FK.j6(r7, r1 + 60, r0 | (abcd.FK.DW(r7, r1 + 60) & (-4096)));
    }

    public void j6(abcd.YD r3) {
        r3.DW(gn(), u7());
    }

    public void j6(abcd.AbstractrE r5) {
        int r0 = r5.DW() & 61440;
        if (r0 == 0) goto L9;
        if (r0 == 16384) goto L9;
        abcd.FK.DW(this.DW, this.FH + 24, r5.DW());
        return;
    L9:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidModeForPath, new java.lang.Object[]{r5, v5()}));
    }

    void j6(java.io.OutputStream r5) {
        if (EQ() == false) goto L5;
        int r0 = 64;
    L6:
        int r1 = this.Hw.length;
        r5.write(this.DW, this.FH, r0);
        r5.write(this.Hw, 0, r1);
        int r2 = r0 + r1;
        int r3 = (r2 + 8) & (-8);
        if (r2 == r3) goto L10;
        r5.write(j6, 0, r3 - r2);
        return;
    L10:
        return;
    L5:
        r0 = 62;
        goto L6
    }

    public void j6(byte[] r4, int r5) {
        java.lang.System.arraycopy(r4, r5, gn(), u7(), 20);
    }

    public final boolean j6(int r4, int r5) {
        int r0 = this.FH + 8;
        if (r4 == abcd.FK.j6(this.DW, r0)) goto L5;
    L8:
        return false;
    L5:
        if (r5 > abcd.FK.j6(this.DW, r0 + 4)) goto L8;
        return true;
    }

    public java.lang.String toString() {
        return j6() + " " + FH() + " " + DW() + " " + Hw() + " " + VH() + " " + v5() + "\n";
    }

    public boolean tp() {
        if ((this.DW[this.FH + 60] & 128) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    final int u7() {
        return this.FH + 40;
    }

    public java.lang.String v5() {
        return DW(this.Hw);
    }

    public boolean we() {
        if ((QX() & 1073741824) == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
