package abcd;

public abstract class GH extends java.io.InputStream {
    private long DW;
    private int EQ;
    private long FH;
    private final byte[] Hw;
    private java.io.InputStream VH;
    private int Zo;
    private long gn;
    private final java.io.InputStream j6;
    private long tp;
    private int u7;
    private int v5;

    public GH(java.io.InputStream r7) {
        this.Hw = new byte[512];
        this.j6 = r7;
        if (j6(this.Hw.length) == false) goto L12;
        int r8 = 0;
        int r0 = 0;
    L5:
        byte[] r1 = this.Hw;
        int r2 = this.v5;
        this.v5 = r2 + 1;
        int r3 = r1[r2] & 255;
        this.DW |= (long) ((r3 & 127) << r0);
        r0 = r0 + 7;
        if ((r3 & 128) != 0) goto L5;
    L7:
        byte[] r4 = this.Hw;
        int r5 = this.v5;
        this.v5 = r5 + 1;
        int r6 = r4[r5] & 255;
        this.FH |= (long) ((r6 & 127) << r8);
        r8 = r8 + 7;
        if ((r6 & 128) != 0) goto L7;
        this.u7 = v5();
        return;
    L12:
        throw new java.io.EOFException();
    }

    private int Hw() {
        return this.Zo - this.v5;
    }

    private void Zo() {
        java.io.InputStream r0 = this.VH;
        if (r0 != null) goto L9;
        this.VH = FH();
        if (j6() != this.DW) goto L8;
        abcd.BK.j6(this.VH, this.tp);
        this.gn = this.tp;
        return;
    L8:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().baseLengthIncorrect);
    L9:
        long r1 = this.gn;
        long r3 = this.tp;
        if (r1 >= r3) goto L13;
        abcd.BK.j6(r0, r3 - r1);
        this.gn = this.tp;
        return;
    L13:
        if (r1 <= r3) goto L18;
        r0.close();
        this.VH = FH();
        abcd.BK.j6(this.VH, this.tp);
        this.gn = this.tp;
        return;
    }

    private boolean j6(int r7) {
        int r0 = Hw();
        if (r7 >= r0) goto L6;
        return true;
    L6:
        if (r0 != 0) goto L8;
        this.v5 = 0;
        this.Zo = 0;
    L11:
        java.io.InputStream r8 = this.j6;
        byte[] r1 = this.Hw;
        int r3 = this.Zo;
        int r9 = r8.read(r1, r3, r1.length - r3);
        if (r9 < 0) goto L14;
        this.Zo += r9;
        if (this.Zo < this.Hw.length) goto L11;
        return true;
    L14:
        if (Hw() <= 0) goto L16;
        return true;
    L16:
        return false;
    L8:
        byte[] r4 = this.Hw;
        int r5 = r4.length;
        int r6 = this.v5;
        if ((r5 - r6) >= r7) goto L11;
        java.lang.System.arraycopy(r4, r6, r4, 0, r0);
        this.v5 = 0;
        this.Zo = r0;
        goto L11
    }

    private int v5() {
        if (j6(8) == true) goto L6;
        return 2;
    L6:
        byte[] r1 = this.Hw;
        int r2 = this.v5;
        this.v5 = r2 + 1;
        int r3 = r1[r2] & 255;
        if ((r3 & 128) == 0) goto L33;
        this.tp = 0;
        if ((r3 & 1) == 0) goto L12;
        int r4 = this.v5;
        this.v5 = r4 + 1;
        this.tp = r1[r4] & 255;
    L12:
        if ((r3 & 2) == 0) goto L15;
        long r5 = this.tp;
        byte[] r6 = this.Hw;
        int r7 = this.v5;
        this.v5 = r7 + 1;
        this.tp = r5 | ((long) ((r6[r7] & 255) << 8));
    L15:
        if ((r3 & 4) == 0) goto L18;
        long r8 = this.tp;
        byte[] r9 = this.Hw;
        int r10 = this.v5;
        this.v5 = r10 + 1;
        this.tp = r8 | ((long) ((r9[r10] & 255) << 16));
    L18:
        if ((r3 & 8) == 0) goto L20;
        long r11 = this.tp;
        byte[] r12 = this.Hw;
        int r13 = this.v5;
        this.v5 = r13 + 1;
        this.tp = r11 | ((long) ((r12[r13] & 255) << 24));
    L20:
        this.EQ = 0;
        if ((r3 & 16) == 0) goto L24;
        byte[] r14 = this.Hw;
        int r15 = this.v5;
        this.v5 = r15 + 1;
        this.EQ = r14[r15] & 255;
    L24:
        if ((r3 & 32) == 0) goto L27;
        int r16 = this.EQ;
        byte[] r17 = this.Hw;
        int r18 = this.v5;
        this.v5 = r18 + 1;
        this.EQ = ((r17[r18] & 255) << 8) | r16;
    L27:
        if ((r3 & 64) == 0) goto L30;
        int r0 = this.EQ;
        byte[] r19 = this.Hw;
        int r20 = this.v5;
        this.v5 = r20 + 1;
        this.EQ = r0 | ((r19[r20] & 255) << 16);
    L30:
        if (this.EQ != 0) goto L32;
        this.EQ = 65536;
    L32:
        return 0;
    L33:
        if (r3 == 0) goto L37;
        j6(r3);
        this.EQ = r3;
        return 1;
    L37:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
    }

    public long DW() {
        return this.FH;
    }

    protected abstract java.io.InputStream FH();

    @Override
    public void close() {
        this.j6.close();
        java.io.InputStream r0 = this.VH;
        if (r0 == null) goto L6;
        r0.close();
        return;
    }

    protected abstract long j6();

    @Override
    public int read() {
        byte[] r1 = new byte[1];
        if (read(r1, 0, 1) == 1) goto L7;
        return -1;
    L7:
        return r1[0] & 255;
    }

    @Override
    public int read(byte[] r7, int r8, int r9) {
        int r0 = 0;
    L3:
        if (r9 <= 0) goto L4;
        int r1 = java.lang.Math.min(r9, this.EQ);
        int r2 = this.u7;
        if (r2 != 0) goto L8;
        Zo();
        r1 = this.VH.read(r7, r8, r1);
        if (r1 < 0) goto L25;
        this.tp += (long) r1;
        this.gn = this.tp;
    L21:
        r0 = r0 + r1;
        r8 = r8 + r1;
        r9 = r9 - r1;
        this.EQ -= r1;
        if (this.EQ != 0) goto L3;
        this.u7 = v5();
        goto L3
    L25:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().baseLengthIncorrect);
    L8:
        if (r2 != 1) goto L10;
        java.lang.System.arraycopy(this.Hw, this.v5, r7, r8, r1);
        this.v5 += r1;
        goto L21
    L10:
        if (r2 != 2) goto L16;
        if (r0 > 0) goto L34;
        return -1;
    L34:
        return r0;
    L16:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
    L4:
        return r0;
    }

    @Override
    public long skip(long r9) {
        long r2 = 0;
    L4:
        if (0 >= r9) goto L5;
        long r4 = java.lang.Math.min(r9, this.EQ);
        int r6 = this.u7;
        if (r6 != 0) goto L9;
        this.tp += r4;
    L17:
        r2 = r2 + r4;
        r9 = r9 - r4;
        this.EQ = (int) (((long) this.EQ) - r4);
        if (this.EQ != 0) goto L4;
        this.u7 = v5();
        goto L4
    L9:
        if (r6 != 1) goto L11;
        this.v5 = (int) (((long) this.v5) + r4);
        goto L17
    L11:
        if (r6 != 2) goto L14;
        return r2;
    L14:
        throw new abcd.YC(org.eclipse.jgit.JGitText.j6().unsupportedCommand0);
    L5:
        return r2;
    }
}
