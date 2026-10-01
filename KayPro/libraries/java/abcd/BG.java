package abcd;

final class BG extends abcd.CG {
    private final java.nio.ByteBuffer Hw;

    BG(abcd.aH r2, long r3, java.nio.ByteBuffer r5) {
        super(r2, r3, r5.capacity());
        this.Hw = r5;
    }

    @Override
    protected int j6(int r4, java.util.zip.Inflater r5) {
        java.nio.ByteBuffer r0 = this.Hw.slice();
        r0.position(r4);
        byte[] r6 = new byte[java.lang.Math.min(r0.remaining(), 512)];
        r0.get(r6, 0, r6.length);
        r5.setInput(r6, 0, r6.length);
        return r6.length;
    }

    @Override
    protected int j6(int r2, byte[] r3, int r4, int r5) {
        java.nio.ByteBuffer r0 = this.Hw.slice();
        r0.position(r2);
        int r6 = java.lang.Math.min(r0.remaining(), r5);
        r0.get(r3, r4, r6);
        return r6;
    }

    @Override
    void j6(abcd.OH r4, long r5, int r7, java.security.MessageDigest r8) {
        java.nio.ByteBuffer r0 = this.Hw.slice();
        r0.position((int) (r5 - this.DW));
    L3:
        if (r7 <= 0) goto L4;
        byte[] r6 = r4.FH();
        int r9 = java.lang.Math.min(r7, r6.length);
        r0.get(r6, 0, r9);
        r4.write(r6, 0, r9);
        if (r8 == null) goto L8;
        r8.update(r6, 0, r9);
    L8:
        r7 = r7 - r9;
        goto L3
    }
}
