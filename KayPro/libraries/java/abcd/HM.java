package abcd;

class HM extends abcd.MM {
    private static final byte[] FH = null;
    private final int Hw;
    private int v5;

    static {
        FH = new byte[0];
    }

    HM(java.io.InputStream r1, int r2) {
        super(r1, r2);
        if (r2 < 0) goto L9;
        this.Hw = r2;
        this.v5 = r2;
        if (r2 != 0) goto L10;
        j6(true);
        return;
    L10:
        return;
    L9:
        throw new java.lang.IllegalArgumentException("negative lengths not allowed");
    }

    byte[] DW() {
        int r0 = this.v5;
        if (r0 == 0) goto L5;
        byte[] r1 = new byte[r0];
        int r2 = r0 - abcd.XP.j6(this.j6, r1);
        this.v5 = r2;
        if (r2 != 0) goto L11;
        j6(true);
        return r1;
    L11:
        throw new java.io.EOFException("DEF length " + this.Hw + " object truncated by " + this.v5);
    L5:
        return FH;
    }

    @Override
    int j6() {
        return this.v5;
    }

    @Override
    public int read() {
        if (this.v5 != 0) goto L6;
        return -1;
    L6:
        int r0 = this.j6.read();
        if (r0 < 0) goto L13;
        int r1 = this.v5 - 1;
        this.v5 = r1;
        if (r1 != 0) goto L11;
        j6(true);
    L11:
        return r0;
    L13:
        throw new java.io.EOFException("DEF length " + this.Hw + " object truncated by " + this.v5);
    }

    @Override
    public int read(byte[] r2, int r3, int r4) {
        int r0 = this.v5;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r5 = this.j6.read(r2, r3, java.lang.Math.min(r4, r0));
        if (r5 < 0) goto L13;
        int r6 = this.v5 - r5;
        this.v5 = r6;
        if (r6 != 0) goto L11;
        j6(true);
    L11:
        return r5;
    L13:
        throw new java.io.EOFException("DEF length " + this.Hw + " object truncated by " + this.v5);
    }
}
