package abcd;

public class WG {
    static final java.io.FilenameFilter j6 = null;
    private final java.io.File DW;
    private final java.io.File FH;
    private boolean Hw;
    private boolean VH;
    private boolean Zo;
    private abcd.LG gn;
    private final abcd.AbstractpK u7;
    private java.io.FileOutputStream v5;

    static {
        j6 = new abcd.UG();
    }

    public WG(java.io.File r1, abcd.AbstractpK r2) {
        this.DW = r1;
        this.FH = j6(this.DW);
        this.u7 = r2;
    }

    static java.io.FileOutputStream DW(abcd.WG r0) {
        return r0.v5;
    }

    private boolean VH() {
        if (this.u7.Hw() == false) goto L5;
        int r1 = 0;
    L8:
        if (r1 >= 10) goto L9;
        if (this.DW.delete() == true) goto L12;
        java.lang.Thread.sleep(100);     // Catch: java.lang.InterruptedException -> L17
        r1 = r1 + 1;
    L17:
        return false;
    L12:
        return true;
    L9:
        return false;
    L5:
        return this.DW.delete();
    }

    private boolean gn() {
        if (this.u7.Hw() == false) goto L5;
        int r1 = 0;
    L8:
        if (r1 >= 10) goto L9;
        if (this.FH.renameTo(this.DW) == true) goto L12;
        java.lang.Thread.sleep(100);     // Catch: java.lang.InterruptedException -> L17
        r1 = r1 + 1;
    L17:
        return false;
    L12:
        return true;
    L9:
        return false;
    L5:
        return this.FH.renameTo(this.DW);
    }

    static java.io.File j6(java.io.File r3) {
        return new java.io.File(r3.getParentFile(), java.lang.String.valueOf(r3.getName()) + ".lock");
    }

    static void j6(abcd.WG r0, java.io.FileOutputStream r1) {
        r0.v5 = r1;
    }

    static boolean j6(abcd.WG r0) {
        return r0.VH;
    }

    private void tp() {
        if (this.Zo == false) goto L6;
        this.gn = abcd.LG.DW(this.FH);
        return;
    }

    private void u7() {
        if (this.v5 == null) goto L5;
        return;
    L5:
        v5();
        throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().lockOnNotHeld, new java.lang.Object[]{this.DW}));
    }

    public abcd.LG DW() {
        return this.gn;
    }

    public void DW(boolean r1) {
        this.Zo = r1;
    }

    public java.io.OutputStream FH() {
        u7();
        if (this.VH == false) goto L5;
        java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(this.v5.getChannel());
    L7:
        return new abcd.VG(this, r0);
    L5:
        r0 = this.v5;
        goto L7
    }

    public void FH(boolean r1) {
        DW(r1);
    }

    public boolean Hw() {
        abcd.zK.DW(this.FH.getParentFile(), true);
        if (this.FH.createNewFile() == false) goto L11;
        this.Hw = true;
        this.v5 = new java.io.FileOutputStream(this.FH);     // Catch: java.io.IOException -> L7
    L7:
        e = move-exception;
        v5();
        throw e;
    L11:
        return this.Hw;
    }

    public void Zo() {
        abcd.LG r0 = abcd.LG.DW(this.DW);
        abcd.LG r1 = abcd.LG.DW(this.FH);
    L4:
        if (r0.j6(r1) == false) goto L5;
        java.lang.Thread.sleep(25);
        this.FH.setLastModified(java.lang.System.currentTimeMillis());
        r1 = abcd.LG.DW(this.FH);
        goto L4
    }

    public void j6(abcd.yE r3) {
        byte[] r0 = new byte[41];
        r3.FH(r0, 0);
        r0[40] = 10;
        j6(r0);
    }

    public void j6(boolean r1) {
        this.VH = r1;
    }

    public void j6(byte[] r3) {
        u7();
    L19:
        e = move-exception;
        v5();
        throw e;
    L13:
        e = move-exception;
        v5();
        throw e;
    L16:
        e = move-exception;
        v5();
        throw e;
    L4:
        if (this.VH == false) goto L10;
        java.nio.channels.FileChannel r0 = this.v5.getChannel();     // Catch: java.lang.Error -> L13 java.lang.RuntimeException -> L16 java.io.IOException -> L19
        java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3);     // Catch: java.lang.Error -> L13 java.lang.RuntimeException -> L16 java.io.IOException -> L19
    L7:
        if (r4.remaining() <= 0) goto L8;
        r0.write(r4);     // Catch: java.lang.Error -> L13 java.lang.RuntimeException -> L16 java.io.IOException -> L19
        goto L7
    L8:
        r0.force(true);     // Catch: java.lang.Error -> L13 java.lang.RuntimeException -> L16 java.io.IOException -> L19
    L11:
        this.v5.close();     // Catch: java.lang.Error -> L13 java.lang.RuntimeException -> L16 java.io.IOException -> L19
        this.v5 = null;     // Catch: java.lang.Error -> L13 java.lang.RuntimeException -> L16 java.io.IOException -> L19
        return;
    L10:
        this.v5.write(r3);     // Catch: java.lang.Error -> L13 java.lang.RuntimeException -> L16 java.io.IOException -> L19
        goto L11
    }

    public boolean j6() {
        if (this.v5 != null) goto L16;
        tp();
        if (this.FH.renameTo(this.DW) == false) goto L8;
        return true;
    L8:
        if (this.DW.exists() == false) goto L12;
        if (VH() == true) goto L12;
    L14:
        v5();
        return false;
    L12:
        if (gn() == false) goto L14;
        return true;
    L16:
        v5();
        throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().lockOnNotClosed, new java.lang.Object[]{this.DW}));
    }

    public java.lang.String toString() {
        return "LockFile[" + this.FH + ", haveLck=" + this.Hw + "]";
    }

    public void v5() {
        java.io.FileOutputStream r0 = this.v5;
        if (r0 == null) goto L7;
        r0.close();     // Catch: java.io.IOException -> L12
    L5:
        this.v5 = null;
    L7:
        if (this.Hw == false) goto L17;
        this.Hw = false;
        abcd.zK.j6(this.FH, 2);     // Catch: java.io.IOException -> L11
        return;
    L18:
        return;
    }
}
