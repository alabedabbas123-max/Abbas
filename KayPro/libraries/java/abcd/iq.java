package abcd;

public final class iq {
    private static final byte[] j6 = null;
    private byte[] DW;
    private final abcd.Gn FH;
    private int Hw;
    private final java.util.List<java.lang.String> VH;
    private final java.util.List<java.lang.Integer> Zo;
    private final java.util.List<abcd.qq> gn;
    private final java.util.List<abcd.nq> tp;
    private final java.util.List<abcd.lq> u7;
    private final java.util.List<java.lang.String> v5;

    public final class a implements abcd.St, abcd.Tt {
        private int DW;
        private final int FH;
        private final int Hw;
        private final java.lang.String j6;
        final abcd.iq v5;

        private a(abcd.iq r3, int r4) {
            this(r3, "section", r4, abcd.iq.Hw(r3).length);
        }

        a(abcd.iq r1, int r2, abcd.cq r3) {
            this(r1, r2);
        }

        private a(abcd.iq r1, java.lang.String r2, int r3, int r4) {
            this.v5 = r1;
            this.j6 = r2;
            this.Hw = r3;
            this.DW = r3;
            this.FH = r4;
        }

        private abcd.bq BT() {
            int r1 = yS();
            int r2 = yS();
            int r3 = yS();
            int r0 = yS();
            int r4 = XL();
            short[] r5 = Zo(XL());
            abcd.bq.b[] r6 = new abcd.bq.b[r0];
            int r7 = 0;
            abcd.bq.a[] r8 = new abcd.bq.a[0];
            if (r0 > 0) goto L5;
            abcd.bq.a[] r9 = r8;
        L16:
            return new abcd.bq(r1, r2, r3, r4, r5, r6, r9);
        L5:
            if ((r5.length % 2) != 1) goto L7;
            Mr();
        L7:
            int r10 = 0;
        L8:
            if (r10 >= r0) goto L10;
            r6[r10] = new abcd.bq.b(XL(), yS(), yS());
            r10 = r10 + 1;
            goto L8
        L10:
            int r11 = gn();
            int r12 = rN();
            abcd.bq.a[] r13 = new abcd.bq.a[r12];
        L11:
            if (r7 >= r12) goto L13;
            r13[r7] = gn(r11);
            r7 = r7 + 1;
            goto L11
        L13:
            r9 = r13;
            goto L16
        }

        static abcd.bq DW(abcd.iq.a r0) {
            return r0.BT();
        }

        private void VH(int r3) {
            if ((this.DW + r3) > this.FH) goto L6;
            return;
        L6:
            throw new abcd.Ut("Section limit " + this.FH + " exceeded by " + this.j6);
        }

        private abcd._p gW() {
            int r0 = rN();
            int r1 = rN();
            int r2 = rN();
            int r3 = rN();
            return new abcd._p(u7(r0), u7(r1), tp(r2), tp(r3));
        }

        private abcd.bq.a gn(int r7) {
            int r0 = gn() - r7;
            int r8 = U2();
            int r1 = java.lang.Math.abs(r8);
            int[] r2 = new int[r1];
            int[] r3 = new int[r1];
            int r4 = 0;
        L3:
            if (r4 >= r1) goto L5;
            r2[r4] = rN();
            r3[r4] = rN();
            r4 = r4 + 1;
            goto L3
        L5:
            if (r8 > 0) goto L7;
            int r9 = rN();
        L9:
            return new abcd.bq.a(r0, r2, r3, r9);
        L7:
            r9 = -1;
            goto L9
        }

        static abcd._p j6(abcd.iq.a r0) {
            return r0.gW();
        }

        private abcd._p.b[] tp(int r7) {
            abcd._p.b[] r0 = new abcd._p.b[r7];
            int r1 = 0;
            int r2 = 0;
        L3:
            if (r1 >= r7) goto L5;
            r2 = r2 + rN();
            r0[r1] = new abcd._p.b(r2, rN(), rN());
            r1 = r1 + 1;
            goto L3
        L5:
            return r0;
        }

        private abcd._p.a[] u7(int r6) {
            abcd._p.a[] r0 = new abcd._p.a[r6];
            int r1 = 0;
            int r2 = 0;
        L3:
            if (r1 >= r6) goto L5;
            r2 = r2 + rN();
            r0[r1] = new abcd._p.a(r2, rN());
            r1 = r1 + 1;
            goto L3
        L5:
            return r0;
        }

        public abcd.Xp EQ() {
            int r0 = XL();
            int[] r1 = new int[r0];
            int r2 = 0;
        L3:
            if (r2 >= r0) goto L6;
            r1[r2] = XL();
            r2 = r2 + 1;
            goto L3
        L6:
            return new abcd.Xp(r1);
        }

        public abcd.aq J0() {
            int r2 = gn();
            int r3 = XL();
            int r4 = XL();
            int r5 = XL();
            int r6 = XL();
            int r7 = XL();
            int r8 = XL();
            int r9 = XL();
            int r10 = XL();
            return new abcd.aq(this.v5, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        }

        public abcd.jq J8() {
            int r0 = this.DW;
            new abcd.kq(this).DW();
            int r1 = this.DW;
            return new abcd.jq(abcd.iq.j6(abcd.iq.Hw(this.v5), r0, r1));
        }

        public short Mr() {
            int r0 = abcd.iq.Hw(this.v5)[this.DW] & 255;
            byte[] r1 = abcd.iq.Hw(this.v5);
            int r2 = this.DW;
            int r3 = r0 | ((r1[r2 + 1] & 255) << 8);
            this.DW = r2 + 2;
            return (short) r3;
        }

        public abcd.lq QX() {
            int r0 = yS();
            int r1 = yS();
            int r2 = XL();
            return new abcd.lq(this.v5, r0, r1, r2);
        }

        public int U2() {
            return abcd.eu.j6(this);
        }

        public byte[] VH() {
            return abcd.iq.Hw(this.v5);
        }

        public abcd.jq Ws() {
            int r0 = this.DW;
            new abcd.kq(this).FH();
            int r1 = this.DW;
            return new abcd.jq(abcd.iq.j6(abcd.iq.Hw(this.v5), r0, r1));
        }

        public int XL() {
            int r0 = ((abcd.iq.Hw(this.v5)[this.DW] & 255) | ((abcd.iq.Hw(this.v5)[this.DW + 1] & 255) << 8)) | ((abcd.iq.Hw(this.v5)[this.DW + 2] & 255) << 16);
            byte[] r1 = abcd.iq.Hw(this.v5);
            int r2 = this.DW;
            int r3 = r0 | ((r1[r2 + 3] & 255) << 24);
            this.DW = r2 + 4;
            return r3;
        }

        public void Zo() {
            int r0 = this.DW;
            this.DW = abcd.iq.j6(r0);
        L4:
            if (r0 >= this.DW) goto L6;
            abcd.iq.Hw(this.v5)[r0] = 0;
            r0 = r0 + 1;
            goto L4
        }

        public short[] Zo(int r4) {
            short[] r0 = new short[r4];
            int r1 = 0;
        L3:
            if (r1 >= r4) goto L5;
            r0[r1] = Mr();
            r1 = r1 + 1;
            goto L3
        L5:
            return r0;
        }

        public java.lang.String a8() {
            int r0 = XL();
            int r1 = this.DW;
            this.DW = r0;
            int r2 = rN();     // Catch: java.lang.Throwable -> L9 java.io.UTFDataFormatException -> L11
            java.lang.String r3 = abcd.ju.j6(this, new char[r2]);     // Catch: java.lang.Throwable -> L9 java.io.UTFDataFormatException -> L11
            if (r3.length() != r2) goto L8;
            this.DW = r1;
            return r3;
        L8:
            throw new abcd.Ut("Declared length " + r2 + " doesn't match decoded length of " + r3.length());     // Catch: java.lang.Throwable -> L9 java.io.UTFDataFormatException -> L11
        L11:
            e = move-exception;
            throw new abcd.Ut(e);     // Catch: java.lang.Throwable -> L9
        L9:
            th = move-exception;
            this.DW = r1;
            throw th;
        }

        public abcd.nq aM() {
            int r0 = yS();
            int r1 = yS();
            int r2 = XL();
            return new abcd.nq(this.v5, r0, r1, r2);
        }

        public int er() {
            return abcd.eu.DW(this) - 1;
        }

        public int gn() {
            return this.DW;
        }

        public abcd.qq j3() {
            int r0 = XL();
            int r1 = XL();
            int r2 = XL();
            return new abcd.qq(this.v5, r0, r1, r2);
        }

        public abcd.fr lg() {
            int r0 = XL();
            short[] r1 = new short[r0];
            int r2 = 0;
        L3:
            if (r2 >= r0) goto L5;
            r1[r2] = Mr();
            r2 = r2 + 1;
            goto L3
        L5:
            Zo();
            return new abcd.fr(this.v5, r1);
        }

        public int rN() {
            return abcd.eu.DW(this);
        }

        @Override
        public byte readByte() {
            byte[] r0 = abcd.iq.Hw(this.v5);
            int r1 = this.DW;
            this.DW = r1 + 1;
            return (byte) (r0[r1] & 255);
        }

        public abcd.Wp tp() {
            int r1 = XL();
            int r0 = XL();
            int r2 = XL();
            int r3 = XL();
            if (r0 != 0) goto L5;
            int[] r4 = abcd.Zp.j6;
        L6:
            if (r0 != 0) goto L8;
            int[] r5 = abcd.Zp.j6;
        L9:
            int r6 = 0;
            int r7 = 0;
        L10:
            if (r7 >= r0) goto L12;
            r4[r7] = XL();
            r5[r7] = XL();
            r7 = r7 + 1;
            goto L10
        L12:
            if (r2 != 0) goto L14;
            int[] r8 = abcd.Zp.j6;
        L15:
            int[] r9 = r8;
            if (r2 != 0) goto L18;
            int[] r10 = abcd.Zp.j6;
        L19:
            int[] r11 = r10;
            int r12 = 0;
        L20:
            if (r12 >= r2) goto L22;
            r9[r12] = XL();
            r11[r12] = XL();
            r12 = r12 + 1;
            goto L20
        L22:
            if (r3 != 0) goto L24;
            int[] r13 = abcd.Zp.j6;
        L25:
            int[] r14 = r13;
            if (r3 != 0) goto L28;
            int[] r15 = abcd.Zp.j6;
        L29:
            int[] r16 = r15;
        L30:
            if (r6 >= r3) goto L33;
            r14[r6] = XL();
            r16[r6] = XL();
            r6 = r6 + 1;
            goto L30
        L33:
            return new abcd.Wp(r1, r4, r5, r9, r11, r14, r16);
        L28:
            r15 = new int[r3];
            goto L29
        L24:
            r13 = new int[r3];
            goto L25
        L18:
            r10 = new int[r2];
            goto L19
        L14:
            r8 = new int[r2];
            goto L15
        L8:
            r5 = new int[r0];
            goto L9
        L5:
            r4 = new int[r0];
            goto L6
        }

        public abcd.Vp u7() {
            byte r2 = readByte();
            int r3 = rN();
            int r0 = rN();
            int[] r4 = new int[r0];
            abcd.jq[] r5 = new abcd.jq[r0];
            int r1 = 0;
        L3:
            if (r1 >= r0) goto L6;
            r4[r1] = rN();
            r5[r1] = Ws();
            r1 = r1 + 1;
            goto L3
        L6:
            return new abcd.Vp(this.v5, r2, r3, r4, r5);
        }

        public byte[] v5(int r4) {
            byte[] r0 = abcd.iq.Hw(this.v5);
            int r1 = this.DW;
            byte[] r2 = abcd.iq.j6(r0, r1, r1 + r4);
            this.DW += r4;
            return r2;
        }

        public abcd.Yp we() {
            int r0 = XL();
            int[] r1 = new int[r0];
            int r2 = 0;
        L3:
            if (r2 >= r0) goto L6;
            r1[r2] = XL();
            r2 = r2 + 1;
            goto L3
        L6:
            return new abcd.Yp(r1);
        }

        @Override
        public void writeByte(int r4) {
            VH(1);
            byte[] r0 = abcd.iq.Hw(this.v5);
            int r1 = this.DW;
            this.DW = r1 + 1;
            r0[r1] = (byte) r4;
        }

        public int yS() {
            return Mr() & 65535;
        }
    }

    static {
        j6 = new byte[8192];
    }

    public iq(java.io.File r4) {
        this.FH = new abcd.Gn();
        this.Hw = 0;
        this.v5 = new abcd.cq(this);
        this.Zo = new abcd.dq(this);
        this.VH = new abcd.eq(this);
        this.gn = new abcd.fq(this);
        this.u7 = new abcd.gq(this);
        this.tp = new abcd.hq(this);
        if (abcd.Wt.j6(r4.getName()) == false) goto L10;
        java.util.zip.ZipFile r0 = new java.util.zip.ZipFile(r4);
        java.util.zip.ZipEntry r1 = r0.getEntry("classes.dex");
        if (r1 == null) goto L8;
        j6(r0.getInputStream(r1), (int) r1.getSize());
        r0.close();
        return;
    L8:
        throw new abcd.Ut("Expected classes.dex in " + r4);
    L10:
        if (r4.getName().endsWith(".dex") == false) goto L14;
        j6(new java.io.FileInputStream(r4), (int) r4.length());
        return;
    L14:
        throw new abcd.Ut("unknown output extension: " + r4);
    }

    public iq(java.io.InputStream r2, int r3) {
        this.FH = new abcd.Gn();
        this.Hw = 0;
        this.v5 = new abcd.cq(this);
        this.Zo = new abcd.dq(this);
        this.VH = new abcd.eq(this);
        this.gn = new abcd.fq(this);
        this.u7 = new abcd.gq(this);
        this.tp = new abcd.hq(this);
        j6(r2, r3);
    }

    static java.util.List DW(abcd.iq r0) {
        return r0.Zo;
    }

    private static void DW(int r3, int r4) {
        if (r3 < 0) goto L6;
        if (r3 >= r4) goto L6;
        return;
    L6:
        throw new java.lang.IndexOutOfBoundsException("index:" + r3 + ", length=" + r4);
    }

    private static byte[] DW(byte[] r2, int r3, int r4) {
        if (r3 > r4) goto L11;
        int r0 = r2.length;
        if (r3 < 0) goto L9;
        if (r3 > r0) goto L9;
        int r5 = r4 - r3;
        int r1 = java.lang.Math.min(r5, r0 - r3);
        byte[] r6 = new byte[r5];
        java.lang.System.arraycopy(r2, r3, r6, 0, r1);
        return r6;
    L9:
        throw new java.lang.ArrayIndexOutOfBoundsException();
    L11:
        throw new java.lang.IllegalArgumentException();
    }

    static java.util.List FH(abcd.iq r0) {
        return r0.v5;
    }

    private static int Hw(int r0) {
        return (r0 + 3) & (-4);
    }

    static byte[] Hw(abcd.iq r0) {
        return r0.DW;
    }

    static int j6(int r0) {
        return Hw(r0);
    }

    static abcd.Gn j6(abcd.iq r0) {
        return r0.FH;
    }

    static void j6(int r0, int r1) {
        DW(r0, r1);
    }

    private void j6(java.io.InputStream r5, int r6) {
        if (r6 != (-1)) goto L9;
        java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream();
    L5:
        int r1 = r5.read(j6);
        if (r1 == (-1)) goto L8;
        r7.write(j6, 0, r1);
        goto L5
    L8:
        this.DW = r7.toByteArray();
    L10:
        this.Hw = this.DW.length;
        this.FH.j6(this);
        return;
    L9:
        this.DW = new byte[r6];
        new java.io.DataInputStream(r5).readFully(this.DW);
        goto L10
    }

    static byte[] j6(byte[] r0, int r1, int r2) {
        return DW(r0, r1, r2);
    }

    public abcd.iq.a DW(int r4) {
        if (r4 < 0) goto L8;
        if (r4 > this.Hw) goto L8;
        return new abcd.iq.a(this, r4, null);
    L8:
        throw new java.lang.IllegalArgumentException("position=" + r4 + " length=" + this.Hw);
    }

    public java.util.List<abcd.qq> DW() {
        return this.gn;
    }

    public abcd.fr FH(int r1) {
        if (r1 != 0) goto L6;
        return abcd.fr.j6;
    L6:
        return DW(r1).lg();
    }

    public java.util.List<java.lang.String> FH() {
        return this.v5;
    }

    public java.util.List<java.lang.String> Hw() {
        return this.VH;
    }

    public abcd.Gn j6() {
        return this.FH;
    }

    public abcd._p j6(abcd.aq r2) {
        int r3 = r2.FH();
        if (r3 == 0) goto L7;
        return abcd.iq.a.j6(DW(r3));
    L7:
        throw new java.lang.IllegalArgumentException("offset == 0");
    }

    public abcd.bq j6(abcd._p.b r2) {
        int r3 = r2.DW();
        if (r3 == 0) goto L7;
        return abcd.iq.a.DW(DW(r3));
    L7:
        throw new java.lang.IllegalArgumentException("offset == 0");
    }
}
