package abcd;

public final class Pt {
    private final int DW;
    private final int FH;
    private final byte[] j6;

    public static class a extends java.io.DataInputStream {
        private final abcd.Pt.b j6;

        public a(abcd.Pt.b r1) {
            super(r1);
            this.j6 = r1;
        }
    }

    public class b extends java.io.InputStream {
        private int DW;
        final abcd.Pt FH;
        private int j6;

        public b(abcd.Pt r1) {
            this.FH = r1;
            this.j6 = 0;
            this.DW = 0;
        }

        @Override
        public int available() {
            return abcd.Pt.j6(this.FH) - this.j6;
        }

        @Override
        public void mark(int r1) {
            this.DW = this.j6;
        }

        @Override
        public boolean markSupported() {
            return true;
        }

        @Override
        public int read() {
            if (this.j6 < abcd.Pt.j6(this.FH)) goto L6;
            return -1;
        L6:
            int r0 = abcd.Pt.j6(this.FH, this.j6);
            this.j6++;
            return r0;
        }

        @Override
        public int read(byte[] r4, int r5, int r6) {
            if ((r5 + r6) <= r4.length) goto L5;
            r6 = r4.length - r5;
        L5:
            int r0 = abcd.Pt.j6(this.FH) - this.j6;
            if (r6 <= r0) goto L8;
            r6 = r0;
        L8:
            java.lang.System.arraycopy(abcd.Pt.DW(this.FH), this.j6 + abcd.Pt.FH(this.FH), r4, r5, r6);
            this.j6 += r6;
            return r6;
        }

        @Override
        public void reset() {
            this.j6 = this.DW;
        }
    }

    public Pt(byte[] r3) {
        this(r3, 0, r3.length);
    }

    public Pt(byte[] r2, int r3, int r4) {
        if (r2 == null) goto L17;
        if (r3 < 0) goto L15;
        if (r4 < r3) goto L13;
        if (r4 > r2.length) goto L11;
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4 - r3;
        return;
    L11:
        throw new java.lang.IllegalArgumentException("end > bytes.length");
    L13:
        throw new java.lang.IllegalArgumentException("end < start");
    L15:
        throw new java.lang.IllegalArgumentException("start < 0");
    L17:
        throw new java.lang.NullPointerException("bytes == null");
    }

    private void DW(int r4, int r5) {
        if (r4 < 0) goto L8;
        if (r5 < r4) goto L8;
        if (r5 > this.FH) goto L8;
        return;
    L8:
        throw new java.lang.IllegalArgumentException("bad range: " + r4 + ".." + r5 + "; actual size " + this.FH);
    }

    static byte[] DW(abcd.Pt r0) {
        return r0.j6;
    }

    static int FH(abcd.Pt r0) {
        return r0.DW;
    }

    private int VH(int r3) {
        return this.j6[this.DW + r3];
    }

    private int gn(int r3) {
        return this.j6[this.DW + r3] & 255;
    }

    static int j6(abcd.Pt r0) {
        return r0.FH;
    }

    static int j6(abcd.Pt r0, int r1) {
        return r0.gn(r1);
    }

    public int DW(int r3) {
        DW(r3, r3 + 4);
        int r0 = ((VH(r3) << 24) | (gn(r3 + 1) << 16)) | (gn(r3 + 2) << 8);
        return gn(r3 + 3) | r0;
    }

    public abcd.Pt.b DW() {
        return new abcd.Pt.b(this);
    }

    public int FH() {
        return this.FH;
    }

    public long FH(int r6) {
        DW(r6, r6 + 8);
        int r0 = (((VH(r6) << 24) | (gn(r6 + 1) << 16)) | (gn(r6 + 2) << 8)) | gn(r6 + 3);
        int r1 = ((VH(r6 + 4) << 24) | (gn(r6 + 5) << 16)) | (gn(r6 + 6) << 8);
        return (((long) (gn(r6 + 7) | r1)) & 4294967295L) | (((long) r0) << 32);
    }

    public int Hw(int r2) {
        DW(r2, r2 + 2);
        int r0 = VH(r2) << 8;
        return gn(r2 + 1) | r0;
    }

    public int Zo(int r2) {
        DW(r2, r2 + 2);
        int r0 = gn(r2) << 8;
        return gn(r2 + 1) | r0;
    }

    public int j6(int r2) {
        DW(r2, r2 + 1);
        return VH(r2);
    }

    public abcd.Pt.a j6() {
        return new abcd.Pt.a(DW());
    }

    public abcd.Pt j6(int r4, int r5) {
        DW(r4, r5);
        byte[] r1 = this.j6;
        int r2 = this.DW;
        return new abcd.Pt(r1, r4 + r2, r5 + r2);
    }

    public void j6(byte[] r4, int r5) {
        int r0 = r4.length - r5;
        int r1 = this.FH;
        if (r0 < r1) goto L7;
        java.lang.System.arraycopy(this.j6, this.DW, r4, r5, r1);
        return;
    L7:
        throw new java.lang.IndexOutOfBoundsException("(out.length - offset) < size()");
    }

    public int v5(int r2) {
        DW(r2, r2 + 1);
        return gn(r2);
    }
}
