package abcd;

class aJ extends java.io.OutputStream {
    private final byte[] DW;
    private int FH;
    private final java.io.OutputStream j6;

    aJ(int r6, int r7, java.io.OutputStream r8) {
        if (r6 <= 0) goto L17;
        if (r6 > 255) goto L17;
        if (r7 <= 5) goto L15;
        if (65520 < r7) goto L13;
        this.j6 = r8;
        this.DW = new byte[r7];
        this.DW[4] = (byte) r6;
        this.FH = 5;
        return;
    L13:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packetSizeMustBeAtMost, new java.lang.Object[]{java.lang.Integer.valueOf(r7), 65520}));
    L15:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packetSizeMustBeAtLeast, new java.lang.Object[]{java.lang.Integer.valueOf(r7), 5}));
    L17:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().channelMustBeInRange0_255, new java.lang.Object[]{java.lang.Integer.valueOf(r6)}));
    }

    private void DW() {
        abcd.EI.j6(this.DW, this.FH);
        this.j6.write(this.DW, 0, this.FH);
        this.FH = 5;
    }

    @Override
    public void flush() {
        j6();
        this.j6.flush();
    }

    void j6() {
        if (5 >= this.FH) goto L6;
        DW();
        return;
    }

    @Override
    public void write(int r4) {
        if (this.FH != this.DW.length) goto L5;
        DW();
    L5:
        byte[] r0 = this.DW;
        int r1 = this.FH;
        this.FH = r1 + 1;
        r0[r1] = (byte) r4;
    }

    @Override
    public void write(byte[] r6, int r7, int r8) {
    L2:
        if (r8 <= 0) goto L3;
        byte[] r0 = this.DW;
        int r1 = r0.length;
        int r2 = this.FH;
        int r3 = r1 - r2;
        if (r2 != 5) goto L8;
        if (r3 >= r8) goto L8;
        abcd.EI.j6(r0, r0.length);
        this.j6.write(this.DW, 0, 5);
        this.j6.write(r6, r7, r3);
        r7 = r7 + r3;
        r8 = r8 - r3;
    L8:
        if (r3 != 0) goto L10;
        DW();
    L10:
        int r4 = java.lang.Math.min(r8, r3);
        java.lang.System.arraycopy(r6, r7, this.DW, this.FH, r4);
        this.FH += r4;
        r7 = r7 + r4;
        r8 = r8 - r4;
        goto L2
    }
}
