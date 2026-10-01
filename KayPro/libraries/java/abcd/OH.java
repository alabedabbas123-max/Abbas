package abcd;

public final class OH extends java.io.OutputStream {
    private final java.io.OutputStream DW;
    private final abcd.TH FH;
    private final java.util.zip.CRC32 Hw;
    private byte[] VH;
    private long Zo;
    private byte[] gn;
    private final abcd.LE j6;
    private long u7;
    private final java.security.MessageDigest v5;

    public OH(abcd.LE r2, java.io.OutputStream r3, abcd.TH r4) {
        this.Hw = new java.util.zip.CRC32();
        this.v5 = abcd.hE.j6();
        this.VH = new byte[32];
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.u7 = 131072;
    }

    private int DW(int r13, long r14) {
        long r1 = r14 >>> 4;
        byte[] r3 = this.VH;
        if (r1 <= 0) goto L5;
        int r8 = 128;
    L6:
        r3[0] = (byte) ((r14 & 15) | ((long) ((r13 << 4) | r8)));
        int r15 = 1;
    L8:
        if (r1 <= 0) goto L9;
        long r16 = r1 >>> 7;
        byte[] r0 = this.VH;
        int r4 = r15 + 1;
        if (r16 <= 0) goto L13;
        int r9 = 128;
    L14:
        r0[r15] = (byte) ((r1 & 127) | ((long) r9));
        r1 = r16;
        r15 = r4;
        goto L8
    L13:
        r9 = 0;
        goto L14
    L9:
        return r15;
    L5:
        r8 = 0;
        goto L6
    }

    int DW() {
        return (int) this.Hw.getValue();
    }

    public byte[] FH() {
        if (this.gn != null) goto L6;
        this.gn = new byte[16384];
    L6:
        return this.gn;
    }

    byte[] Hw() {
        return this.v5.digest();
    }

    void Zo() {
        this.Hw.reset();
    }

    @Override
    public void flush() {
        this.DW.flush();
    }

    void j6() {
        this.j6.update(1);
    }

    void j6(int r5, long r6) {
        java.lang.System.arraycopy(abcd.hE.v5, 0, this.VH, 0, 4);
        abcd.FK.DW(this.VH, 4, r5);
        abcd.FK.DW(this.VH, 8, (int) r6);
        write(this.VH, 0, 12);
    }

    public void j6(abcd.MH r2) {
        this.FH.j6(this, r2);
    }

    public void j6(abcd.MH r10, long r11) {
        if (r10.BT() == true) goto L5;
        write(this.VH, 0, DW(r10.yS(), r11));
        return;
    L5:
        if (this.FH.Zo() == false) goto L16;
        abcd.MH r0 = r10.a8();
        if (r0 == null) goto L16;
        if (r0.nw() == false) goto L16;
        long r3 = this.Zo;
        write(this.VH, 0, DW(6, r11));
        long r4 = r3 - r0.getOffset();
        byte[] r12 = this.VH;
        int r13 = r12.length - 1;
        r12[r13] = (byte) (r4 & 127);
    L11:
        long r1 = r4 >> 7;
        if (r1 <= 0) goto L13;
        r13 = r13 - 1;
        long r2 = r1 - 1;
        this.VH[r13] = (byte) (128 | (r2 & 127));
        r4 = r2;
        goto L11
    L13:
        byte[] r14 = this.VH;
        write(r14, r13, r14.length - r13);
        return;
    L16:
        int r15 = DW(7, r11);
        r10.lg().DW(this.VH, r15);
        write(this.VH, 0, r15 + 20);
    }

    public long v5() {
        return this.Zo;
    }

    @Override
    public void write(int r5) {
        this.Zo++;
        this.DW.write(r5);
        this.Hw.update(r5);
        this.v5.update((byte) r5);
    }

    @Override
    public void write(byte[] r7, int r8, int r9) {
    L2:
        if (r9 <= 0) goto L3;
        int r0 = java.lang.Math.min(r9, 131072);
        this.Zo += (long) r0;
        if (this.u7 > this.Zo) goto L11;
        if (this.j6.isCancelled() == true) goto L10;
        this.u7 = this.Zo + 131072;
        goto L11
    L10:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
    L11:
        this.DW.write(r7, r8, r0);
        this.Hw.update(r7, r8, r0);
        this.v5.update(r7, r8, r0);
        r8 = r8 + r0;
        r9 = r9 - r0;
        goto L2
    }
}
