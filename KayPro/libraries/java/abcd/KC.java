package abcd;

public class KC {
    private static final abcd.QC[] DW = null;
    private static final byte[] FH = null;
    static final java.util.Comparator<abcd.QC> Hw = null;
    private static final byte[] j6 = null;
    private abcd.LG EQ;
    private byte[] J0;
    private abcd.FD J8;
    private int VH;
    private abcd.QC[] Zo;
    private abcd.TC gn;
    private final abcd.AbstractpK tp;
    private abcd.WG u7;
    private final java.io.File v5;
    private byte[] we;

    static {
        j6 = new byte[]{68, 73, 82, 67};
        DW = new abcd.QC[0];
        FH = new byte[0];
        Hw = new abcd.JC();
    }

    public KC(java.io.File r1, abcd.AbstractpK r2) {
        this.v5 = r1;
        this.tp = r2;
        DW();
    }

    public static abcd.KC DW(java.io.File r1, abcd.AbstractpK r2) {
        abcd.KC r0 = new abcd.KC(r1, r2);
        r0.u7();
        return r0;
    }

    private static boolean DW(byte[] r4) {
        if (r4.length >= j6.length) goto L5;
        return false;
    L5:
        int r0 = 0;
    L6:
        byte[] r1 = j6;
        if (r0 >= r1.length) goto L8;
        if (r4[r0] != r1[r0]) goto L12;
        r0 = r0 + 1;
        goto L6
    L12:
        return false;
    L8:
        return true;
    }

    public static abcd.KC gn() {
        return new abcd.KC(null, null);
    }

    static int j6(abcd.QC r1, abcd.QC r2) {
        byte[] r3 = r1.Hw;
        return j6(r3, r3.length, r2);
    }

    static int j6(byte[] r1, int r2, abcd.QC r3) {
        byte[] r4 = r3.Hw;
        return j6(r1, r2, r4, r4.length);
    }

    static int j6(byte[] r3, int r4, byte[] r5, int r6) {
        int r0 = 0;
    L3:
        if (r0 >= r4) goto L11;
        if (r0 >= r6) goto L11;
        int r1 = (r3[r0] & 255) - (r5[r0] & 255);
        if (r1 != 0) goto L8;
        r0 = r0 + 1;
        goto L3
    L8:
        return r1;
    L11:
        return r4 - r6;
    }

    public static abcd.KC j6(java.io.File r1, abcd.AbstractpK r2) {
        abcd.KC r0 = new abcd.KC(r1, r2);
        if (r0.VH() == false) goto L16;
        r0.u7();     // Catch: java.lang.Error -> L6 java.lang.RuntimeException -> L9 java.io.IOException -> L12
        return r0;
    L12:
        e = move-exception;
        r0.tp();
        throw e;
    L6:
        e = move-exception;
        r0.tp();
        throw e;
    L9:
        e = move-exception;
        r0.tp();
        throw e;
    L16:
        throw new abcd.dD(r1);
    }

    public static abcd.KC j6(java.io.File r0, abcd.AbstractpK r1, abcd.FD r2) {
        abcd.KC r3 = j6(r0, r1);
        r3.j6(r2);
        return r3;
    }

    private static java.lang.String j6(byte[] r6) {
        return "'" + new java.lang.String(r6, 0, 4, "ISO-8859-1") + "'";
    }

    private void j6(abcd.FD r1) {
        this.J8 = r1;
    }

    private void j6(abcd.WG r5) {
        if (this.v5 == null) goto L9;
        if (r5 == null) goto L7;
        return;
    L7:
        throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().dirCacheFileIsNotLocked, new java.lang.Object[]{this.v5.getAbsolutePath()}));
    L9:
        throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().dirCacheIsNotLocked);
    }

    private void j6(java.io.InputStream r15) {
        java.io.BufferedInputStream r6 = new java.io.BufferedInputStream(r15);
        java.security.MessageDigest r16 = abcd.hE.j6();
        byte[] r8 = new byte[20];
        abcd.BK.j6(r6, r8, 0, 12);
        r16.update(r8, 0, 12);
        if (DW(r8) == false) goto L42;
        int r0 = abcd.FK.j6(r8, 4);
        if (r0 != 3) goto L7;
        boolean r1 = true;
    L9:
        this.VH = abcd.FK.j6(r8, 8);
        if (this.VH < 0) goto L38;
        int r2 = abcd.QC.j6(r1);
        int r3 = this.VH;
        byte[] r4 = new byte[r2 * r3];
        this.Zo = new abcd.QC[r3];
        abcd.EK r5 = new abcd.EK();
        int r7 = 0;
    L13:
        if (r7 >= this.VH) goto L14;
        this.Zo[r7] = new abcd.QC(r4, r5, r6, r16);
        r7 = r7 + 1;
        goto L13
    L14:
        this.EQ = abcd.LG.DW(this.v5);
    L15:
        r6.mark(21);
        abcd.BK.j6(r6, r8, 0, 20);
        if (r6.read() < 0) goto L17;
        r6.reset();
        r16.update(r8, 0, 8);
        abcd.BK.j6(r6, 8);
        long r9 = abcd.FK.FH(r8, 4);
        if (abcd.FK.j6(r8, 0) != 1414677829) goto L25;
        if (2147483647L < r9) goto L35;
        byte[] r10 = new byte[(int) r9];
        abcd.BK.j6(r6, r10, 0, r10.length);
        r16.update(r10, 0, r10.length);
        this.gn = new abcd.TC(r10, new abcd.EK(), null);
        goto L15
    L35:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().DIRCExtensionIsTooLargeAt, new java.lang.Object[]{j6(r8), java.lang.Long.valueOf(r9)}));
    L25:
        if (r8[0] < 65) goto L30;
        if (r8[0] > 90) goto L30;
        j6(r6, r16, r8, r9);
    L30:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().DIRCExtensionNotSupportedByThisVersion, new java.lang.Object[]{j6(r8)}));
    L17:
        this.we = r16.digest();
        if (java.util.Arrays.equals(this.we, r8) == false) goto L21;
        return;
    L21:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().DIRCChecksumMismatch);
    L38:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().DIRCHasTooManyEntries);
    L7:
        if (r0 != 2) goto L40;
        r1 = false;
        goto L9
    L40:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownDIRCVersion, new java.lang.Object[]{java.lang.Integer.valueOf(r0)}));
    L42:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().notADIRCFile);
    }

    private void j6(java.io.InputStream r5, java.security.MessageDigest r6, byte[] r7, long r8) {
        byte[] r0 = new byte[4096];
    L4:
        if (0 >= r8) goto L5;
        int r2 = r5.read(r0, 0, (int) java.lang.Math.min(r0.length, r8));
        if (r2 < 0) goto L10;
        r6.update(r0, 0, r2);
        r8 = r8 - ((long) r2);
        goto L4
    L10:
        throw new java.io.EOFException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().shortReadOfOptionalDIRCExtensionExpectedAnotherBytes, new java.lang.Object[]{j6(r7), java.lang.Long.valueOf(r8)}));
    }

    public int DW(int r3) {
        abcd.QC r0 = this.Zo[r3];
        int r4 = r3 + 1;
    L4:
        if (r4 >= this.VH) goto L8;
        abcd.QC r1 = this.Zo[r4];
        if (j6(r0, r1) != 0) goto L8;
        r4 = r4 + 1;
        r0 = r1;
    L8:
        return r4;
    }

    public abcd.QC DW(java.lang.String r2) {
        int r3 = j6(r2);
        if (r3 >= 0) goto L6;
        return null;
    L6:
        return this.Zo[r3];
    }

    public void DW() {
        this.EQ = null;
        this.Zo = DW;
        this.VH = 0;
        this.gn = null;
        this.we = FH;
    }

    public void EQ() {
        abcd.WG r0 = this.u7;
        j6(r0);
        j6(new abcd.XK(r0.FH()));     // Catch: java.lang.Error -> L5 java.lang.RuntimeException -> L8 java.io.IOException -> L11
        return;
    L11:
        e = move-exception;
        r0.v5();
        throw e;
    L5:
        e = move-exception;
        r0.v5();
        throw e;
    L8:
        e = move-exception;
        r0.v5();
        throw e;
    }

    public boolean FH() {
        abcd.WG r0 = this.u7;
        j6(r0);
        this.u7 = null;
        if (r0.j6() == true) goto L6;
        return false;
    L6:
        this.EQ = r0.DW();
        if (this.J8 != null) goto L9;
        return true;
    L9:
        if (java.util.Arrays.equals(this.we, this.J0) == true) goto L14;
        this.J8.j6(new abcd.ED());
        return true;
    L14:
        return true;
    }

    public abcd.PC Hw() {
        return new abcd.PC(this, this.VH + 16);
    }

    public boolean VH() {
        java.io.File r0 = this.v5;
        if (r0 == null) goto L11;
        abcd.WG r1 = new abcd.WG(r0, this.tp);
        if (r1.Hw() == false) goto L8;
        r1.FH(true);
        this.u7 = r1;
        return true;
    L8:
        return false;
    L11:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().dirCacheDoesNotHaveABackingFile);
    }

    public boolean Zo() {
        int r1 = 0;
    L4:
        if (r1 >= this.VH) goto L5;
        if (this.Zo[r1].VH() > 0) goto L8;
        r1 = r1 + 1;
        goto L4
    L8:
        return true;
    L5:
        return false;
    }

    public int j6(java.lang.String r2) {
        byte[] r3 = abcd.hE.j6(r2);
        return j6(r3, r3.length);
    }

    int j6(byte[] r5, int r6) {
        int r0 = this.VH;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        int r2 = (r1 + r0) >>> 1;
        int r3 = j6(r5, r6, this.Zo[r2]);
        if (r3 < 0) goto L8;
        if (r3 == 0) goto L10;
        r1 = r2 + 1;
    L10:
        if (r2 <= 0) goto L15;
        if (j6(r5, r6, this.Zo[r2 - 1]) != 0) goto L15;
        r2 = r2 - 1;
    L15:
        return r2;
    L8:
        r0 = r2;
        goto L3
    L5:
        return -(r1 + 1);
    }

    public abcd.MC j6() {
        return new abcd.MC(this, this.VH + 16);
    }

    public abcd.QC j6(int r2) {
        return this.Zo[r2];
    }

    public abcd.TC j6(boolean r4) {
        if (r4 == false) goto L8;
        if (this.gn != null) goto L6;
        this.gn = new abcd.TC();
    L6:
        this.gn.j6(this.Zo, this.VH, 0, 0);
    L8:
        return this.gn;
    }

    public abcd.yE j6(abcd.EE r4) {
        return j6(true).j6(this.Zo, 0, 0, r4);
    }

    void j6(int r2, abcd.QC[] r3, int r4, int r5) {
        java.lang.System.arraycopy(this.Zo, r2, r3, r4, r5);
    }

    void j6(java.io.OutputStream r12) {
        java.security.MessageDigest r0 = abcd.hE.j6();
        java.security.DigestOutputStream r1 = new java.security.DigestOutputStream(r12, r0);
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= this.VH) goto L5;
        r4 = r4 | this.Zo[r3].EQ();
        r3 = r3 + 1;
        goto L4
    L5:
        byte[] r5 = new byte[128];
        byte[] r6 = j6;
        java.lang.System.arraycopy(r6, 0, r5, 0, r6.length);
        if (r4 == false) goto L8;
        int r7 = 3;
    L9:
        abcd.FK.DW(r5, 4, r7);
        abcd.FK.DW(r5, 8, this.VH);
        r1.write(r5, 0, 12);
        abcd.LG r8 = this.EQ;
        if (r8 != null) goto L16;
        int r9 = 0;
    L13:
        if (r9 >= this.VH) goto L20;
        this.Zo[r9].j6(r1);
        r9 = r9 + 1;
    L20:
        if (this.gn == null) goto L22;
        abcd.RK.d r10 = new abcd.RK.d();
        this.gn.j6(r5, r10);
        r10.close();
        abcd.FK.DW(r5, 0, 1414677829);
        abcd.FK.DW(r5, 4, (int) r10.DW());
        r1.write(r5, 0, 8);
        r10.j6(r1, null);
    L22:
        this.J0 = r0.digest();
        r12.write(this.J0);
        r12.close();
        return;
    L16:
        int r11 = (int) (r8.j6() / 1000);
        int r13 = ((int) (this.EQ.j6() % 1000)) * 1000000;
        int r14 = 0;
    L18:
        if (r14 >= this.VH) goto L20;
        abcd.QC r15 = this.Zo[r14];
        if (r15.j6(r11, r13) == false) goto L27;
        r15.Ws();
    L27:
        r15.j6(r1);
        r14 = r14 + 1;
        goto L18
    L8:
        r7 = 2;
        goto L9
    }

    void j6(abcd.QC[] r1, int r2) {
        this.Zo = r1;
        this.VH = r2;
        this.gn = null;
    }

    public void tp() {
        abcd.WG r0 = this.u7;
        if (r0 == null) goto L6;
        this.u7 = null;
        r0.v5();
        return;
    }

    public void u7() {
        java.io.File r0 = this.v5;
        if (r0 == null) goto L22;
        if (r0.exists() == true) goto L7;
        DW();
        return;
    L7:
        abcd.LG r1 = this.EQ;
        if (r1 != null) goto L10;
    L25:
        java.io.FileInputStream r2 = new java.io.FileInputStream(this.v5);     // Catch: java.io.FileNotFoundException -> L18
        DW();     // Catch: java.lang.Throwable -> L15
        j6(r2);     // Catch: java.lang.Throwable -> L15
        r2.close();     // Catch: java.io.IOException -> L23
    L19:
        this.EQ = abcd.LG.DW(this.v5);
        return;
    L15:
        th = move-exception;
        r2.close();     // Catch: java.io.IOException -> L24
    L17:
        throw th;     // Catch: java.io.FileNotFoundException -> L18
    L18:
        DW();
        goto L19
    L10:
        if (r1.j6(this.v5) == true) goto L25;
        return;
    L22:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().dirCacheDoesNotHaveABackingFile);
    }

    public int v5() {
        return this.VH;
    }
}
