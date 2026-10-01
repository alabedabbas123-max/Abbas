package abcd;

class aJ extends java.io.OutputStream {
    private final byte[] DW;
    private int FH;
    private final java.io.OutputStream j6;

    aJ(int r6, int r7, java.io.OutputStream r8) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6 <= 0) { $pc0 = 17; continue $sw0; }
                    if (r6 > 255) { $pc0 = 17; continue $sw0; }
                    if (r7 <= 5) { $pc0 = 15; continue $sw0; }
                    if (65520 < r7) { $pc0 = 13; continue $sw0; }
                    this.j6 = r8;
                    this.DW = new byte[r7];
                    this.DW[4] = (byte) r6;
                    this.FH = 5;
                    return;
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packetSizeMustBeAtMost, new java.lang.Object[]{java.lang.Integer.valueOf(r7), 65520}));
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packetSizeMustBeAtLeast, new java.lang.Object[]{java.lang.Integer.valueOf(r7), 5}));
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().channelMustBeInRange0_255, new java.lang.Object[]{java.lang.Integer.valueOf(r6)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (5 >= this.FH) { $pc1 = 6; continue $sw1; }
                    DW();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(int r4) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.FH != this.DW.length) { $pc2 = 5; continue $sw2; }
                    DW();
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r0 = this.DW;
                    r1 = this.FH;
                    this.FH = r1 + 1;
                    r0[r1] = (byte) r4;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r6, int r7, int r8) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 2;
        $sw3: while (true) {
            switch ($pc3) {
                case 2: {
                    if (r8 <= 0) { $pc3 = 3; continue $sw3; }
                    r0 = this.DW;
                    r1 = r0.length;
                    r2 = this.FH;
                    r3 = r1 - r2;
                    if (r2 != 5) { $pc3 = 8; continue $sw3; }
                    if (r3 >= r8) { $pc3 = 8; continue $sw3; }
                    abcd.EI.j6(r0, r0.length);
                    this.j6.write(this.DW, 0, 5);
                    this.j6.write(r6, r7, r3);
                    r7 = r7 + r3;
                    r8 = r8 - r3;
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r3 != 0) { $pc3 = 10; continue $sw3; }
                    DW();
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r4 = java.lang.Math.min(r8, r3);
                    java.lang.System.arraycopy(r6, r7, this.DW, this.FH, r4);
                    this.FH += r4;
                    r7 = r7 + r4;
                    r8 = r8 - r4;
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
