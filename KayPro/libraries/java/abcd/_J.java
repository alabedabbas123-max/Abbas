package abcd;

public abstract class _J extends abcd.TJ {
    private static final byte[] EQ = null;
    private static int[] J0;
    private static int[] J8;
    private static int[] Ws;
    private static final byte[] tp = null;
    protected static final abcd._J.a[] u7 = null;
    private static final java.util.Comparator<abcd._J.a> we = null;
    private int Mr;
    private final abcd._J.b QX;
    private int U2;
    private byte[] XL;
    private abcd.UD a8;
    private int aM;
    private abcd._J.a[] j3;
    protected abcd.UE lg;

    protected static abstract class a {
        int DW;
        byte[] j6;

        protected a() {
        }

        public abstract long DW();

        public abstract abcd.AbstractrE FH();

        public abstract java.lang.String Hw();

        public abstract long j6();

        void j6(java.nio.charset.CharsetEncoder r5) {
            java.nio.ByteBuffer r6 = r5.encode(java.nio.CharBuffer.wrap(Hw()));     // Catch: java.nio.charset.CharacterCodingException -> L10
            this.DW = r6.limit();
            if (r6.hasArray() == true) goto L6;
        L8:
            byte[] r0 = new byte[this.DW];
            this.j6 = r0;
            r6.get(r0);
            return;
        L6:
            if (r6.arrayOffset() != 0) goto L8;
            this.j6 = r6.array();
            return;
        L11:
            throw new java.lang.RuntimeException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unencodeableFile, new java.lang.Object[]{Hw()}));
        }

        public java.lang.String toString() {
            return java.lang.String.valueOf(FH().toString()) + " " + Hw();
        }

        public abstract java.io.InputStream v5();
    }

    private static final class b {
        final java.nio.charset.CharsetEncoder DW;
        java.security.MessageDigest FH;
        byte[] Hw;
        int Zo;
        final abcd.bK j6;
        abcd.YJ v5;

        b(abcd.bK r1) {
            this.j6 = r1;
            this.DW = abcd.hE.Zo.newEncoder();
        }

        void j6() {
            if (this.FH != null) goto L6;
            this.FH = abcd.hE.j6();
            this.Hw = new byte[2048];
            return;
        }
    }

    public static final enum c extends java.lang.Enum<abcd._J.c> {
        public static final abcd._J.c DW = null;
        public static final abcd._J.c FH = null;
        public static final abcd._J.c Hw = null;
        public static final abcd._J.c j6 = null;
        private static final abcd._J.c[] v5 = null;

        static {
            j6 = new abcd._J.c("EQUAL", 0);
            DW = new abcd._J.c("DIFFER_BY_METADATA", 1);
            FH = new abcd._J.c("SMUDGED", 2);
            Hw = new abcd._J.c("DIFFER_BY_TIMESTAMP", 3);
            v5 = new abcd._J.c[]{j6, DW, FH, Hw};
        }

        private c(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd._J.c valueOf(java.lang.String r1) {
            return (abcd._J.c) java.lang.Enum.valueOf(abcd._J.c.class, r1);
        }

        public static abcd._J.c[] values() {
            abcd._J.c[] r0 = v5;
            int r1 = r0.length;
            abcd._J.c[] r2 = new abcd._J.c[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    private static class d extends abcd.UD {
        final abcd._J.a DW;

        d(abcd._J.a r2) {
            super(java.util.Collections.emptyList());
            this.DW = r2;
        }

        abcd.UD DW() {
            abcd.UD r0 = new abcd.UD();
            java.io.InputStream r1 = this.DW.v5();
            r0.j6(r1);     // Catch: java.lang.Throwable -> L8
            r1.close();
            if (r0.j6().isEmpty() == false) goto L13;
            return null;
        L13:
            return r0;
        L8:
            th = move-exception;
            r1.close();
            throw th;
        }
    }

    private static class e extends abcd._J.d {
        final abcd.UE FH;

        e(abcd._J.a r1, abcd.UE r2) {
            super(r1);
            this.FH = r2;
        }

        private void j6(abcd.UD r2, java.io.File r3) {
            if (r3.exists() == false) goto L10;
            java.io.FileInputStream r0 = new java.io.FileInputStream(r3);
            r2.j6(r0);     // Catch: java.lang.Throwable -> L7
            r0.close();
            return;
        L7:
            th = move-exception;
            r0.close();
            throw th;
        }

        @Override
        abcd.UD DW() {
            if (this.DW == null) goto L7;
            abcd.UD r0 = super.DW();
            if (r0 != null) goto L8;
            r0 = new abcd.UD();
        L8:
            abcd.AbstractpK r1 = this.FH.gn();
            java.lang.String r2 = ((abcd.jE) this.FH.Zo().j6(abcd.jE.j6)).DW();
            if (r2 != null) goto L11;
        L15:
            j6(r0, r1.j6(this.FH.VH(), "info/exclude"));
            if (r0.j6().isEmpty() == true) goto L18;
            return r0;
        L18:
            return null;
        L11:
            if (r2.startsWith("~/") == false) goto L13;
            java.io.File r3 = r1.j6(r1.Zo(), r2.substring(2));
        L14:
            j6(r0, r3);
            goto L15
        L13:
            r3 = r1.j6(null, r2);
            goto L14
        L7:
            r0 = new abcd.UD();
            goto L8
        }
    }

    static {
        u7 = new abcd._J.a[0];
        tp = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        EQ = abcd.hE.j6(3);
        we = new abcd.ZJ();
    }

    protected _J(abcd._J r1) {
        super(r1);
        this.QX = r1.QX;
    }

    protected _J(abcd.bK r2) {
        this.QX = new abcd._J.b(r2);
    }

    static int DW(abcd._J.a r1) {
        if (r1.FH() != abcd.AbstractrE.j6) goto L5;
        return 47;
    L5:
        return 0;
    }

    private java.io.InputStream DW(java.io.InputStream r2) {
        return new abcd.UK(r2);
    }

    private boolean DW(abcd.QC r3) {
        if (v5().DW(r3.Hw()) == false) goto L6;
        r3.j6((int) j3());
        return false;
    L6:
        return true;
    }

    private boolean DW(byte[] r1, int r2) {
        return abcd.tC.j6(r1, r2);
    }

    private static void FH(java.io.InputStream r0) {
        r0.close();     // Catch: java.io.IOException -> L4
        return;
    }

    private byte[] FH(abcd._J.a r7) {
        java.io.InputStream r0 = r7.v5();     // Catch: java.io.IOException -> L36
        if (r0 == null) goto L5;
        this.QX.j6();     // Catch: java.lang.Throwable -> L33
        long r1 = r7.DW();     // Catch: java.lang.Throwable -> L33
        if (rN() == true) goto L12;
        byte[] r8 = j6(r0, r1);     // Catch: java.lang.Throwable -> L33
        FH(r0);     // Catch: java.io.IOException -> L36
        return r8;
    L12:
        if (r1 > 65536) goto L21;
        java.nio.ByteBuffer r9 = abcd.BK.j6(r0, (int) r1);     // Catch: java.lang.Throwable -> L33
        byte[] r2 = r9.array();     // Catch: java.lang.Throwable -> L33
        int r10 = r9.limit();     // Catch: java.lang.Throwable -> L33
        if (DW(r2, r10) == true) goto L17;
        java.nio.ByteBuffer r11 = j6(r2, r10);     // Catch: java.lang.Throwable -> L33
        r2 = r11.array();     // Catch: java.lang.Throwable -> L33
        r10 = r11.limit();     // Catch: java.lang.Throwable -> L33
    L17:
        byte[] r12 = j6(new java.io.ByteArrayInputStream(r2, 0, r10), r10);     // Catch: java.lang.Throwable -> L33
        FH(r0);     // Catch: java.io.IOException -> L36
        return r12;
    L21:
        if (Hw(r7) == false) goto L25;
        byte[] r13 = j6(r0, r1);     // Catch: java.lang.Throwable -> L33
        FH(r0);     // Catch: java.io.IOException -> L36
        return r13;
    L25:
        java.io.InputStream r14 = DW(r7.v5());     // Catch: java.lang.Throwable -> L33
        long r3 = j6(r14);     // Catch: java.lang.Throwable -> L30
        FH(r14);     // Catch: java.lang.Throwable -> L33
        byte[] r15 = j6(DW(r0), r3);     // Catch: java.lang.Throwable -> L33
        FH(r0);     // Catch: java.io.IOException -> L36
        return r15;
    L30:
        th = move-exception;
        FH(r14);     // Catch: java.lang.Throwable -> L33
        throw th;     // Catch: java.lang.Throwable -> L33
    L33:
        th = move-exception;
        FH(r0);     // Catch: java.io.IOException -> L36
        throw th;     // Catch: java.io.IOException -> L36
    L5:
        return abcd.TJ.j6;
    L37:
        return abcd.TJ.j6;
    }

    private boolean Hw(abcd._J.a r2) {
        java.io.InputStream r3 = r2.v5();
        boolean r0 = abcd.tC.j6(r3);     // Catch: java.lang.Throwable -> L6
        FH(r3);
        return r0;
    L6:
        th = move-exception;
        FH(r3);
        throw th;
    }

    static int[] J8() {
        int[] r0 = J8;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.UD.a.values().length];
        r1[abcd.UD.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L11
    L14:
        r1[abcd.UD.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L12
    L18:
        r1[abcd.UD.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L13
    L9:
        J8 = r1;
        return r1;
    }

    static int[] QX() {
        int[] r0 = Ws;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd._J.c.values().length];
        r1[abcd._J.c.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L12
    L16:
        r1[abcd._J.c.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L13
    L20:
        r1[abcd._J.c.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L14
    L22:
        r1[abcd._J.c.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L10:
        Ws = r1;
        return r1;
    }

    static int[] Ws() {
        int[] r0 = J0;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.jE.a.values().length];
        r1[abcd.jE.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L11
    L14:
        r1[abcd.jE.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L12
    L18:
        r1[abcd.jE.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L13
    L9:
        J0 = r1;
        return r1;
    }

    private void er() {
        abcd._J.a r0 = this.j3[this.U2];
        this.v5 = r0.FH().DW();
        int r1 = r0.DW;
        int r2 = this.VH;
        j6(r2 + r1, r2);
        java.lang.System.arraycopy(r0.j6, 0, this.Zo, this.VH, r1);
        this.gn = this.VH + r1;
    }

    private long j6(java.io.InputStream r8) {
        long r2 = 0;
    L3:
        long r4 = r8.skip(1048576);
        if (r4 <= 0) goto L5;
        r2 = r2 + r4;
        goto L3
    L5:
        return r2;
    }

    private java.nio.ByteBuffer j6(byte[] r2, int r3) {
        java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream(r2);
        java.nio.ByteBuffer r4 = abcd.BK.j6(DW(r0), r3);     // Catch: java.lang.Throwable -> L6
        FH(r0);
        return r4;
    L6:
        th = move-exception;
        FH(r0);
        throw th;
    }

    private byte[] j6(java.io.InputStream r15, long r16) {
        abcd._J.b r1 = this.QX;
        java.security.MessageDigest r2 = r1.FH;
        byte[] r3 = r1.Hw;
        r2.reset();
        r2.update(EQ);
        r2.update((byte) 32);
        if (r16 != 0) goto L5;
        r2.update((byte) 48);
        long r7 = r16;
    L9:
        r2.update((byte) 0);
    L10:
        int r4 = r15.read(r3);
        if (r4 <= 0) goto L13;
        r2.update(r3, 0, r4);
        r7 = r7 + ((long) r4);
        goto L10
    L13:
        if (r7 == r16) goto L17;
        return abcd.TJ.j6;
    L17:
        return r2.digest();
    L5:
        int r5 = r3.length;
        r7 = r16;
        int r6 = r5;
    L6:
        r6 = r6 - 1;
        r3[r6] = tp[(int) (r7 % 10)];
        r7 = r7 / 10;
        if (r7 > 0) goto L6;
        r2.update(r3, r6, r5 - r6);
        goto L9
    }

    private abcd.UD lg() {
        abcd.UD r0 = this.a8;
        if ((r0 instanceof abcd._J.d) == false) goto L6;
        this.a8 = ((abcd._J.d) r0).DW();
    L6:
        return this.a8;
    }

    private boolean rN() {
        int r0 = Ws()[Mr().j6().ordinal()];
        if (r0 != 2) goto L5;
        return true;
    L5:
        if (r0 == 3) goto L10;
        return false;
    L10:
        return true;
    }

    @Override
    public boolean DW() {
        if (this.U2 != this.Mr) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public void EQ() {
        if (FH() == true) goto L8;
        this.U2 = 0;
        if (DW() == true) goto L9;
        er();
        return;
    L9:
        return;
    }

    @Override
    public void FH(int r2) {
        this.U2 += r2;
        if (DW() == true) goto L6;
        er();
        return;
    }

    @Override
    public boolean FH() {
        if (this.U2 != 0) goto L6;
        return true;
    L6:
        return false;
    }

    protected boolean Hw(int r7) {
        abcd.UD r0 = lg();
        if (r0 == null) goto L14;
        int r2 = this.VH;
        if (r2 <= 0) goto L7;
        r2 = r2 - 1;
    L7:
        int r1 = J8()[r0.j6(abcd.YJ.j6(this.Zo, r2, r7), abcd.AbstractrE.j6.j6(this.v5)).ordinal()];
        if (r1 != 1) goto L10;
        return false;
    L10:
        if (r1 != 2) goto L14;
        return true;
    L14:
        abcd.TJ r3 = this.DW;
        if ((r3 instanceof abcd._J) == true) goto L17;
        return false;
    L17:
        return ((abcd._J) r3).Hw(r7);
    }

    public abcd.bK Mr() {
        return this.QX.j6;
    }

    public boolean U2() {
        return Hw(this.gn);
    }

    protected abcd._J.a XL() {
        return this.j3[this.U2];
    }

    public java.io.InputStream a8() {
        java.io.InputStream r0 = XL().v5();
        if (Mr().j6() != abcd.jE.a.j6) goto L5;
        return r0;
    L5:
        return new abcd.UK(r0);
    }

    public long aM() {
        return XL().j6();
    }

    @Override
    public boolean gn() {
        if (this.aM != this.U2) goto L6;
        return true;
    L6:
        if ((this.v5 & 61440) != 32768) goto L8;
        return true;
    L8:
        return false;
    }

    public long j3() {
        return XL().DW();
    }

    public abcd._J.c j6(abcd.QC r12) {
        if (r12.tp() == false) goto L7;
        return abcd._J.c.j6;
    L7:
        if (r12.J8() == false) goto L11;
        return abcd._J.c.DW;
    L11:
        if (r12.J0() == false) goto L13;
    L16:
        int r0 = VH() ^ r12.Zo();
        if (r0 != 0) goto L19;
    L26:
        long r1 = r12.DW();
        long r2 = aM();
        if ((r1 % 1000) != 0) goto L30;
        r2 = r2 - (r2 % 1000);
    L30:
        if (r2 == r1) goto L34;
        return abcd._J.c.Hw;
    L34:
        if (r12.J0() == true) goto L38;
        return abcd._J.c.j6;
    L38:
        return abcd._J.c.FH;
    L19:
        if (abcd.AbstractrE.DW.j6(r12.Zo()) == true) goto L26;
        if (this.QX.j6.DW() == true) goto L23;
        r0 = r0 & (abcd.AbstractrE.Hw.DW() ^ (-1));
    L23:
        if (r0 == 0) goto L26;
        return abcd._J.c.DW;
    L13:
        if (j3() == r12.FH()) goto L16;
        return abcd._J.c.DW;
    }

    public abcd.AbstractrE j6(abcd.RC r3) {
        abcd.AbstractrE r0 = Hw();
        if (r3 != null) goto L6;
        return r0;
    L6:
        if (Mr().DW() == false) goto L8;
        return r0;
    L8:
        abcd.AbstractrE r4 = r3.Hw();
        if (abcd.AbstractrE.FH != r0) goto L14;
        if (abcd.AbstractrE.Hw != r4) goto L14;
        return r4;
    L14:
        if (abcd.AbstractrE.Hw == r0) goto L16;
    L18:
        return r0;
    L16:
        if (abcd.AbstractrE.FH != r4) goto L18;
        return r4;
    }

    @Override
    public void j6(int r2) {
        this.U2 -= r2;
        er();
    }

    protected void j6(abcd.UE r3) {
        this.lg = r3;
        abcd.UD r0 = this.a8;
        if ((r0 instanceof abcd._J.d) == false) goto L5;
        abcd._J.a r1 = ((abcd._J.d) r0).DW;
    L6:
        this.a8 = new abcd._J.e(r1, r3);
        return;
    L5:
        r1 = null;
        goto L6
    }

    protected void j6(abcd._J.a[] r7) {
        this.j3 = r7;
        java.nio.charset.CharsetEncoder r8 = this.QX.DW;
        int r1 = 0;
        int r2 = 0;
    L3:
        abcd._J.a[] r3 = this.j3;
        if (r1 >= r3.length) goto L5;
        abcd._J.a r4 = r3[r1];
        if (r4 == null) goto L26;
        java.lang.String r5 = r4.Hw();
        if (".".equals(r5) == true) goto L26;
        if ("..".equals(r5) == true) goto L26;
        if (".git".equals(r5) == true) goto L26;
        if (".gitignore".equals(r5) == false) goto L23;
        this.a8 = new abcd._J.d(r4);
    L23:
        if (r1 == r2) goto L25;
        this.j3[r2] = r4;
    L25:
        r4.j6(r8);
        r2 = r2 + 1;
    L26:
        r1 = r1 + 1;
        goto L3
    L5:
        this.Mr = r2;
        java.util.Arrays.sort(r3, 0, this.Mr, we);
        this.aM = -1;
        this.U2 = 0;
        if (DW() == true) goto L33;
        er();
        return;
    }

    public boolean j6(abcd.QC r6, boolean r7) {
        abcd._J.c r0 = j6(r6);
        int r1 = QX()[r0.ordinal()];
        if (r1 != 1) goto L5;
        return false;
    L5:
        if (r1 != 2) goto L7;
        return true;
    L7:
        if (r1 == 3) goto L17;
        if (r1 != 4) goto L15;
        if (r7 == true) goto L12;
        return true;
    L12:
        return DW(r6);
    L15:
        throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unexpectedCompareResult, new java.lang.Object[]{r0.name()}));
    L17:
        return DW(r6);
    }

    protected byte[] j6(abcd._J.a r2) {
        abcd.UE r0 = this.lg;
        if (r0 == null) goto L5;
        return j6(r0.J8(), r2);
    L10:
        return abcd.TJ.j6;
    L5:
        return abcd.TJ.j6;
    }

    protected byte[] j6(java.io.File r2, abcd._J.a r3) {
        abcd.UE r4 = abcd.YH.j6(r2, r3.Hw());     // Catch: java.io.IOException -> L20
        if (r4 == null) goto L5;
        abcd.yE r5 = r4.FH("HEAD");     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
        r4.j6();
        if (r5 == null) goto L10;
        byte[] r6 = new byte[20];
        r5.DW(r6, 0);
        return r6;
    L10:
        return abcd.TJ.j6;
    L15:
        byte[] r7 = abcd.TJ.j6;     // Catch: java.lang.Throwable -> L13
        r4.j6();
        return r7;
    L5:
        return abcd.TJ.j6;
    L13:
        th = move-exception;
        r4.j6();
        throw th;
    L21:
        return abcd.TJ.j6;
    }

    @Override
    public int tp() {
        return 0;
    }

    @Override
    public byte[] u7() {
        if (this.aM == this.U2) goto L5;
        abcd._J.b r0 = this.QX;
        abcd.YJ r1 = r0.v5;
        if (r1 == null) goto L16;
        abcd.RC r2 = (abcd.RC) r1.j6(r0.Zo, abcd.RC.class);
        if (r2 == null) goto L16;
        abcd.QC r3 = r2.J8();
        if (r3 == null) goto L16;
        if (j6(r3) != abcd._J.c.j6) goto L16;
        return r2.u7();
    L16:
        int r4 = this.v5 & 61440;
        if (r4 != 32768) goto L19;
        int r5 = this.U2;
        this.aM = r5;
        byte[] r6 = FH(this.j3[r5]);
        this.XL = r6;
        return r6;
    L19:
        if (r4 == 40960) goto L27;
        if (r4 != 57344) goto L23;
        int r7 = this.U2;
        this.aM = r7;
        byte[] r8 = j6(this.j3[r7]);
        this.XL = r8;
        return r8;
    L23:
        return abcd.TJ.j6;
    L27:
        return abcd.TJ.j6;
    L5:
        return this.XL;
    }
}
