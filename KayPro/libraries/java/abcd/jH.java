package abcd;

class jH extends java.io.InputStream {
    private final abcd.aH DW;
    private long FH;
    private final abcd.wH j6;

    jH(abcd.aH r1, long r2, abcd.wH r4) {
        this.DW = r1;
        this.FH = r2;
        this.j6 = r4;
        r4.j6(r1, r2);
    }

    @Override
    public void close() {
        this.j6.FH();
    }

    @Override
    public int read() {
        byte[] r1 = new byte[1];
        if (read(r1, 0, 1) == 1) goto L7;
        return -1;
    L7:
        return r1[0] & 255;
    }

    @Override
    public int read(byte[] r8, int r9, int r10) {
        int r11 = this.j6.j6(this.DW, this.FH, r8, r9, r10);
        this.FH += (long) r11;
        return r11;
    }
}
