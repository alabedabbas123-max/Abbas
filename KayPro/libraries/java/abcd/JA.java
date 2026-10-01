package abcd;

public class JA extends java.io.InputStream {
    int DW;
    int FH;
    abcd.InterfacetA Hw;
    java.io.OutputStream VH;
    boolean Zo;
    java.io.RandomAccessFile j6;
    boolean v5;

    public JA(abcd.IA r7) {
        this.Zo = false;
        this.VH = null;
        this.Hw = abcd.uA.j6(abcd.JA.class.getName());
        this.v5 = this.Hw.isDebugEnabled();
        this.FH = 0;
        this.DW = r7.j6();
        this.j6 = r7.aM().FH;
        if (r7.gn() >= 0) goto L5;
        r7.Mr();
        return;
    L5:
        if (this.v5 == false) goto L7;
        this.Hw.FH(java.lang.String.format("Seeking to %d", new java.lang.Object[]{java.lang.Long.valueOf(r7.gn())}));
    L7:
        this.j6.seek(r7.gn());
    }

    private int j6(byte[] r6, int r7, int r8) {
        if ((this.DW - this.FH) == 0) goto L5;
        int r0 = this.j6.read(r6, r7, java.lang.Math.min(r8, available()));
        if (r0 <= 0) goto L17;
        java.io.OutputStream r3 = this.VH;
        if (r3 == null) goto L15;
        r3.write(r6, r7, r0);
    L15:
        this.FH += r0;
    L17:
        if (this.v5 == false) goto L19;
        this.Hw.FH(java.lang.String.format("Read %d bytes for read(b,%d,%d)", new java.lang.Object[]{java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r8)}));
    L19:
        return r0;
    L5:
        if (this.Zo == false) goto L8;
        this.Zo = false;
        r6[r7] = 0;
        return 1;
    L8:
        return -1;
    }

    @Override
    public int available() {
        int r0 = this.DW - this.FH;
        if (this.v5 == false) goto L5;
        this.Hw.FH(java.lang.String.format("Available = %d", new java.lang.Object[]{java.lang.Integer.valueOf(r0)}));
    L5:
        if (r0 == 0) goto L7;
    L9:
        return r0;
    L7:
        if (this.Zo == false) goto L9;
        return 1;
    }

    @Override
    public void close() {
    }

    public void j6(java.io.OutputStream r1) {
        this.VH = r1;
    }

    public void j6(boolean r1) {
        this.Zo = r1;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() {
        if ((this.DW - this.FH) == 0) goto L5;
        int r0 = this.j6.read();
        if (r0 < 0) goto L20;
        java.io.OutputStream r1 = this.VH;
        if (r1 == null) goto L16;
        r1.write(r0);
    L16:
        if (this.v5 == false) goto L18;
        this.Hw.FH("Read 1 byte");
    L18:
        this.FH++;
    L22:
        return r0;
    L20:
        if (this.v5 == false) goto L22;
        this.Hw.FH("Read 0 bytes");
        goto L22
    L5:
        if (this.Zo == false) goto L8;
        this.Zo = false;
        return 0;
    L8:
        return -1;
    }

    @Override
    public int read(byte[] r3) {
        return j6(r3, 0, r3.length);
    }

    @Override
    public int read(byte[] r1, int r2, int r3) {
        return j6(r1, r2, r3);
    }

    @Override
    public long skip(long r5) {
        long r6 = java.lang.Math.min(r5, available());
        java.io.RandomAccessFile r0 = this.j6;
        r0.seek(r0.getFilePointer() + r6);
        if (this.v5 == false) goto L5;
        this.Hw.FH(java.lang.String.format("Skipped %d bytes", new java.lang.Object[]{java.lang.Long.valueOf(r6)}));
    L5:
        return r6;
    }
}
