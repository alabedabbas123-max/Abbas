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
            int r0 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.j6 < abcd.Pt.j6(this.FH)) { $pc0 = 6; continue $sw0; }
                        return -1;
                    }
                    case 6: {
                        r0 = abcd.Pt.j6(this.FH, this.j6);
                        this.j6++;
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public int read(byte[] r4, int r5, int r6) {
            int r0 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ((r5 + r6) <= r4.length) { $pc1 = 5; continue $sw1; }
                        r6 = r4.length - r5;
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        r0 = abcd.Pt.j6(this.FH) - this.j6;
                        if (r6 <= r0) { $pc1 = 8; continue $sw1; }
                        r6 = r0;
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        java.lang.System.arraycopy(abcd.Pt.DW(this.FH), this.j6 + abcd.Pt.FH(this.FH), r4, r5, r6);
                        this.j6 += r6;
                        return r6;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 17; continue $sw2; }
                    if (r3 < 0) { $pc2 = 15; continue $sw2; }
                    if (r4 < r3) { $pc2 = 13; continue $sw2; }
                    if (r4 > r2.length) { $pc2 = 11; continue $sw2; }
                    this.j6 = r2;
                    this.DW = r3;
                    this.FH = r4 - r3;
                    return;
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("end > bytes.length");
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException("end < start");
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("start < 0");
                }
                case 17: {
                    throw new java.lang.NullPointerException("bytes == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(int r4, int r5) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 < 0) { $pc3 = 8; continue $sw3; }
                    if (r5 < r4) { $pc3 = 8; continue $sw3; }
                    if (r5 > this.FH) { $pc3 = 8; continue $sw3; }
                    return;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("bad range: " + r4 + ".." + r5 + "; actual size " + this.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r4.length - r5;
                    r1 = this.FH;
                    if (r0 < r1) { $pc4 = 7; continue $sw4; }
                    java.lang.System.arraycopy(this.j6, this.DW, r4, r5, r1);
                    return;
                }
                case 7: {
                    throw new java.lang.IndexOutOfBoundsException("(out.length - offset) < size()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int v5(int r2) {
        DW(r2, r2 + 1);
        return gn(r2);
    }
}
