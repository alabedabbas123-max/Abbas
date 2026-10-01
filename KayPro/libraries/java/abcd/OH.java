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
        long r1 = 0L;
        byte[] r3 = null;
        int r8 = 0;
        int r15 = 0;
        long r16 = 0L;
        byte[] r0 = null;
        int r4 = 0;
        int r9 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = r14 >>> 4;
                    r3 = this.VH;
                    if (r1 <= 0) { $pc0 = 5; continue $sw0; }
                    r8 = 128;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r3[0] = (byte) ((r14 & 15) | ((long) ((r13 << 4) | r8)));
                    r15 = 1;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r1 <= 0) { $pc0 = 9; continue $sw0; }
                    r16 = r1 >>> 7;
                    r0 = this.VH;
                    r4 = r15 + 1;
                    if (r16 <= 0) { $pc0 = 13; continue $sw0; }
                    r9 = 128;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r0[r15] = (byte) ((r1 & 127) | ((long) r9));
                    r1 = r16;
                    r15 = r4;
                    { $pc0 = 8; continue $sw0; }
                }
                case 13: {
                    r9 = 0;
                    { $pc0 = 14; continue $sw0; }
                }
                case 9: {
                    return r15;
                }
                case 5: {
                    r8 = 0;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int DW() {
        return (int) this.Hw.getValue();
    }

    public byte[] FH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.gn != null) { $pc1 = 6; continue $sw1; }
                    this.gn = new byte[16384];
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.MH r0 = null;
        long r3 = 0L;
        long r4 = 0L;
        byte[] r12 = null;
        int r13 = 0;
        long r1 = 0L;
        long r2 = 0L;
        byte[] r14 = null;
        int r15 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r10.BT() == true) { $pc2 = 5; continue $sw2; }
                    write(this.VH, 0, DW(r10.yS(), r11));
                    return;
                }
                case 5: {
                    if (this.FH.Zo() == false) { $pc2 = 16; continue $sw2; }
                    r0 = r10.a8();
                    if (r0 == null) { $pc2 = 16; continue $sw2; }
                    if (r0.nw() == false) { $pc2 = 16; continue $sw2; }
                    r3 = this.Zo;
                    write(this.VH, 0, DW(6, r11));
                    r4 = r3 - r0.getOffset();
                    r12 = this.VH;
                    r13 = r12.length - 1;
                    r12[r13] = (byte) (r4 & 127);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r1 = r4 >> 7;
                    if (r1 <= 0) { $pc2 = 13; continue $sw2; }
                    r13 = r13 - 1;
                    r2 = r1 - 1;
                    this.VH[r13] = (byte) (128 | (r2 & 127));
                    r4 = r2;
                    { $pc2 = 11; continue $sw2; }
                }
                case 13: {
                    r14 = this.VH;
                    write(r14, r13, r14.length - r13);
                    return;
                }
                case 16: {
                    r15 = DW(7, r11);
                    r10.lg().DW(this.VH, r15);
                    write(this.VH, 0, r15 + 20);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 2;
        $sw3: while (true) {
            switch ($pc3) {
                case 2: {
                    if (r9 <= 0) { $pc3 = 3; continue $sw3; }
                    r0 = java.lang.Math.min(r9, 131072);
                    this.Zo += (long) r0;
                    if (this.u7 > this.Zo) { $pc3 = 11; continue $sw3; }
                    if (this.j6.isCancelled() == true) { $pc3 = 10; continue $sw3; }
                    this.u7 = this.Zo + 131072;
                    { $pc3 = 11; continue $sw3; }
                }
                case 10: {
                    throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().packingCancelledDuringObjectsWriting);
                }
                case 11: {
                    this.DW.write(r7, r8, r0);
                    this.Hw.update(r7, r8, r0);
                    this.v5.update(r7, r8, r0);
                    r8 = r8 + r0;
                    r9 = r9 - r0;
                    { $pc3 = 2; continue $sw3; }
                }
                case 3: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
