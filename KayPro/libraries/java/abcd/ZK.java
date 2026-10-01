package abcd;

public class ZK extends java.io.InputStream {
    private java.io.InputStream DW;
    private java.io.OutputStream FH;
    private byte[] j6;

    public ZK(java.io.InputStream r1, java.io.OutputStream r2) {
        this.DW = r1;
        this.FH = r2;
    }

    private byte[] j6() {
        if (this.j6 != null) goto L6;
        this.j6 = new byte[2048];
    L6:
        return this.j6;
    }

    @Override
    public void close() {
        byte[] r0 = j6();
    L3:
        int r1 = this.DW.read(r0);
        if (r1 <= 0) goto L5;
        this.FH.write(r0, 0, r1);
        goto L3
    L5:
        this.FH.close();
        this.DW.close();
    }

    @Override
    public int read() {
        byte[] r0 = j6();
        if (read(r0, 0, 1) == 1) goto L7;
        return -1;
    L7:
        return r0[0] & 255;
    }

    @Override
    public int read(byte[] r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        return 0;
    L5:
        int r5 = this.DW.read(r2, r3, r4);
        if (r5 <= 0) goto L8;
        this.FH.write(r2, r3, r5);
    L8:
        return r5;
    }

    @Override
    public long skip(long r9) {
        byte[] r0 = j6();
        long r3 = 0;
    L4:
        if (0 >= r9) goto L8;
        int r5 = this.DW.read(r0, 0, (int) java.lang.Math.min(r0.length, r9));
        if (r5 <= 0) goto L8;
        this.FH.write(r0, 0, r5);
        long r6 = r5;
        r3 = r3 + r6;
        r9 = r9 - r6;
    L8:
        return r3;
    }
}
