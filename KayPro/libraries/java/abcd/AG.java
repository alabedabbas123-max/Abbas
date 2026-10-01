package abcd;

final class AG extends abcd.CG {
    private final byte[] Hw;

    AG(abcd.aH r2, long r3, byte[] r5) {
        super(r2, r3, r5.length);
        this.Hw = r5;
    }

    @Override
    protected int j6(int r3, java.util.zip.Inflater r4) {
        byte[] r0 = this.Hw;
        int r1 = r0.length - r3;
        r4.setInput(r0, r3, r1);
        return r1;
    }

    @Override
    protected int j6(int r2, byte[] r3, int r4, int r5) {
        int r6 = java.lang.Math.min(this.Hw.length - r2, r5);
        java.lang.System.arraycopy(this.Hw, r2, r3, r4, r6);
        return r6;
    }

    @Override
    void j6(abcd.OH r3, long r4, int r6, java.security.MessageDigest r7) {
        int r5 = (int) (r4 - this.DW);
        r3.write(this.Hw, r5, r6);
        if (r7 == null) goto L6;
        r7.update(this.Hw, r5, r6);
        return;
    }

    void j6(java.util.zip.CRC32 r4, long r5, int r7) {
        r4.update(this.Hw, (int) (r5 - this.DW), r7);
    }

    void j6(java.util.zip.Inflater r4, byte[] r5, long r6, int r8) {
        r4.setInput(this.Hw, (int) (r6 - this.DW), r8);
    L4:
        if (r4.inflate(r5, 0, r5.length) > 0) goto L4;
    }
}
