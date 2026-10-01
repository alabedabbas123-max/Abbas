package abcd;

public final class Ey implements abcd.Fy {
    private static int[] j6;
    private int DW;

    static {
        j6 = new int[256];
        int r1 = 0;
    L3:
        if (r1 >= 256) goto L4;
        int r2 = 8;
        int r3 = r1;
    L6:
        r2 = r2 - 1;
        if (r2 < 0) goto L8;
        if ((r3 & 1) != 0) goto L11;
        r3 = r3 >>> 1;
        goto L6
    L11:
        r3 = (r3 >>> 1) ^ (-306674912);
        goto L6
    L8:
        j6[r1] = r3;
        r1 = r1 + 1;
        goto L3
    }

    public Ey() {
        this.DW = 0;
    }

    @Override
    public long getValue() {
        return ((long) this.DW) & 4294967295L;
    }

    @Override
    public void j6(long r3) {
        this.DW = (int) (r3 & 4294967295L);
    }

    @Override
    public void reset() {
        this.DW = 0;
    }

    @Override
    public void update(byte[] r4, int r5, int r6) {
        int r0 = this.DW ^ (-1);
    L3:
        r6 = r6 - 1;
        if (r6 < 0) goto L5;
        int r2 = r5 + 1;
        r0 = (r0 >>> 8) ^ j6[(r4[r5] ^ r0) & 255];
        r5 = r2;
        goto L3
    L5:
        this.DW = r0 ^ (-1);
    }
}
