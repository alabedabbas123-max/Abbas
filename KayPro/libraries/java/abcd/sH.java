package abcd;

public class sH {

    private static final class a extends abcd.FE {
        private final long DW;
        private final java.io.File FH;
        private final abcd.yE Hw;
        private final int j6;
        private final abcd.GG v5;

        private a(int r1, long r2, java.io.File r4, abcd.YD r5, abcd.GG r6) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r4;
            this.Hw = r5.Hw();
            this.v5 = r6;
        }

        a(int r1, long r2, java.io.File r4, abcd.YD r5, abcd.GG r6, abcd.sH.a r7) {
            this(r1, r2, r4, r5, r6);
        }

        @Override
        public long DW() {
            return this.DW;
        }

        @Override
        public int FH() {
            return this.j6;
        }

        @Override
        public boolean Hw() {
            return true;
        }

        @Override
        public byte[] j6() {
            throw new abcd.cD(this.Hw);
        }

        @Override
        public abcd.JE v5() {
            java.io.BufferedInputStream r0 = abcd.sH.j6(new java.io.FileInputStream(this.FH));     // Catch: java.io.FileNotFoundException -> L25
            boolean r3 = false;
            byte[] r1 = new byte[64];     // Catch: java.lang.Throwable -> L21
            r0.mark(20);     // Catch: java.lang.Throwable -> L21
            abcd.BK.j6(r0, r1, 0, 2);     // Catch: java.lang.Throwable -> L21
            if (abcd.sH.j6(r1) == false) goto L10;
            r0.reset();     // Catch: java.lang.Throwable -> L21
            r0 = abcd.sH.j6(abcd.sH.j6(r0, this.DW, this.Hw));     // Catch: java.lang.Throwable -> L21
        L8:
            if (r0.read() > 0) goto L8;
        L27:
            return new abcd.JE.a(this.j6, this.DW, r0);
        L16:
            th = th;
            r3 = true;
        L22:
            if (r3 == true) goto L24;
            r0.close();
        L24:
            throw th;
        L10:
            abcd.sH.j6(r0, r1, 2, 18);     // Catch: java.lang.Throwable -> L21
            int r4 = r1[0] & 255;     // Catch: java.lang.Throwable -> L21
            int r5 = 1;
        L12:
            if ((r4 & 128) == 0) goto L13;
            int r6 = r5 + 1;
            int r7 = r1[r5] & 255;
            r5 = r6;
            r4 = r7;
            goto L12
        L13:
            r0.reset();     // Catch: java.lang.Throwable -> L21
            abcd.BK.j6(r0, r5);     // Catch: java.lang.Throwable -> L21
            r0 = abcd.sH.j6(abcd.sH.j6(r0, this.DW, this.Hw));     // Catch: java.lang.Throwable -> L21
        L21:
            th = th;
        L26:
            return this.v5.j6(this.Hw, this.j6).v5();
        }
    }

    private static int DW(java.io.InputStream r2, byte[] r3, int r4, int r5) {
        int r0 = 0;
    L3:
        if (r5 <= 0) goto L7;
        int r1 = r2.read(r3, r4, r5);
        if (r1 < 0) goto L7;
        r0 = r0 + r1;
        r4 = r4 + r1;
        r5 = r5 - r1;
    L7:
        return r0;
    }

    private static java.io.BufferedInputStream DW(java.io.InputStream r2) {
        return new java.io.BufferedInputStream(r2, 8192);
    }

    private static java.io.InputStream DW(java.io.InputStream r7, long r8, abcd.yE r10) {
        return new abcd.rH(r7, abcd.tE.j6(), r8, r10);
    }

    private static void DW(java.io.InputStream r2, java.util.zip.Inflater r3, abcd.YD r4, byte[] r5) {
    L27:
        if (r3.inflate(r5) != 0) goto L23;
        if (r3.finished() == true) goto L7;
        if (r3.needsInput() == false) goto L21;
        int r0 = r2.read(r5);
        if (r0 <= 0) goto L19;
        r3.setInput(r5, 0, r0);
        goto L27
    L19:
        throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
    L21:
        throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
    L7:
        if (r3.getRemaining() != 0) goto L12;
        if (r2.read() != (-1)) goto L12;
        return;
    L12:
        throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
    L23:
        throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectIncorrectLength);
    L25:
        throw new abcd.YC(r4, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
    }

    private static boolean DW(byte[] r4) {
        int r1 = r4[0] & 255;
        if ((r1 & 143) != 8) goto L7;
        int r5 = r4[1] & 255;
        if (((r5 | (r1 << 8)) % 31) != 0) goto L7;
        return true;
    L7:
        return false;
    }

    static int j6(java.io.InputStream r0, byte[] r1, int r2, int r3) {
        return DW(r0, r1, r2, r3);
    }

    static long j6(java.io.InputStream r7, abcd.YD r8, abcd.wH r9) {
        java.io.BufferedInputStream r10 = DW(r7);     // Catch: java.util.zip.ZipException -> L19
        r10.mark(20);     // Catch: java.util.zip.ZipException -> L19
        byte[] r1 = new byte[64];     // Catch: java.util.zip.ZipException -> L19
        abcd.BK.j6(r10, r1, 0, 2);     // Catch: java.util.zip.ZipException -> L19
        if (DW(r1) == false) goto L13;
        r10.reset();     // Catch: java.util.zip.ZipException -> L19
        if (DW(j6(r10, r9.VH()), r1, 0, 64) < 5) goto L12;
        abcd.EK r11 = new abcd.EK();     // Catch: java.util.zip.ZipException -> L19
        abcd.hE.j6(r8, r1, (byte) 32, r11);     // Catch: java.util.zip.ZipException -> L19
        long r0 = abcd.IK.DW(r1, r11.j6, r11);     // Catch: java.util.zip.ZipException -> L19
        if (r0 < 0) goto L10;
        return r0;
    L10:
        throw new abcd.YC(r8, org.eclipse.jgit.JGitText.j6().corruptObjectNegativeSize);     // Catch: java.util.zip.ZipException -> L19
    L12:
        throw new abcd.YC(r8, org.eclipse.jgit.JGitText.j6().corruptObjectNoHeader);     // Catch: java.util.zip.ZipException -> L19
    L13:
        DW(r10, r1, 2, 18);     // Catch: java.util.zip.ZipException -> L19
        int r12 = r1[0] & 255;     // Catch: java.util.zip.ZipException -> L19
        long r2 = r12 & 15;     // Catch: java.util.zip.ZipException -> L19
        int r13 = 4;
        int r3 = 1;
    L15:
        if ((r12 & 128) == 0) goto L16;
        int r14 = r3 + 1;     // Catch: java.util.zip.ZipException -> L19
        int r4 = r1[r3] & 255;
        r2 = r2 + ((long) ((r4 & 127) << r13));
        r13 = r13 + 7;
        r3 = r14;
        r12 = r4;
        goto L15
    L16:
        return r2;
    L20:
        throw new abcd.YC(r8, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
    }

    static abcd.FE j6(java.io.InputStream r18, java.io.File r19, abcd.YD r20, abcd.wH r21) {
        java.io.BufferedInputStream r1 = DW(r18);     // Catch: java.util.zip.ZipException -> L61
        r1.mark(20);     // Catch: java.util.zip.ZipException -> L61
        byte[] r3 = new byte[64];     // Catch: java.util.zip.ZipException -> L61
        int r4 = 2;
        int r5 = 0;
        abcd.BK.j6(r1, r3, 0, 2);     // Catch: java.util.zip.ZipException -> L61
        if (DW(r3) == false) goto L34;
        r1.reset();     // Catch: java.util.zip.ZipException -> L61
        java.util.zip.Inflater r6 = r21.VH();     // Catch: java.util.zip.ZipException -> L61
        java.util.zip.InflaterInputStream r7 = j6(r1, r6);     // Catch: java.util.zip.ZipException -> L61
        int r2 = DW(r7, r3, 0, 64);     // Catch: java.util.zip.ZipException -> L61
        if (r2 < 5) goto L33;
        abcd.EK r8 = new abcd.EK();     // Catch: java.util.zip.ZipException -> L61
        int r11 = abcd.hE.j6(r20, r3, (byte) 32, r8);     // Catch: java.util.zip.ZipException -> L61
        long r12 = abcd.IK.DW(r3, r8.j6, r8);     // Catch: java.util.zip.ZipException -> L61
        if (r12 < 0) goto L31;
        int r14 = r8.j6;     // Catch: java.util.zip.ZipException -> L61
        r8.j6 = r14 + 1;     // Catch: java.util.zip.ZipException -> L61
        if (r3[r14] != 0) goto L29;
        if (r19 != null) goto L18;
        if (2147483647L >= r12) goto L18;
        abcd.cD.a r0 = new abcd.cD.a();     // Catch: java.util.zip.ZipException -> L61
        r0.j6(r20);     // Catch: java.util.zip.ZipException -> L61
        throw r0;     // Catch: java.util.zip.ZipException -> L61
    L18:
        if (r12 < r21.Zo()) goto L23;
        if (r19 == null) goto L23;
        return new abcd.sH.a(r11, r12, r19, r20, r21.v5, null);
    L23:
        byte[] r9 = new byte[(int) r12];     // Catch: java.util.zip.ZipException -> L61
        int r10 = r2 - r8.j6;     // Catch: java.util.zip.ZipException -> L61
        if (r10 <= 0) goto L26;
        java.lang.System.arraycopy(r3, r8.j6, r9, 0, r10);     // Catch: java.util.zip.ZipException -> L61
    L26:
        abcd.BK.j6(r7, r9, r10, r9.length - r10);     // Catch: java.util.zip.ZipException -> L61
        DW(r1, r6, r20, r3);     // Catch: java.util.zip.ZipException -> L61
        return new abcd.FE.a(r11, r9);
    L29:
        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectGarbageAfterSize);     // Catch: java.util.zip.ZipException -> L61
    L31:
        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectNegativeSize);     // Catch: java.util.zip.ZipException -> L61
    L33:
        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectNoHeader);     // Catch: java.util.zip.ZipException -> L61
    L34:
        DW(r1, r3, 2, 18);     // Catch: java.util.zip.ZipException -> L61
        int r13 = r3[0] & 255;     // Catch: java.util.zip.ZipException -> L61
        int r15 = (r13 >> 4) & 7;     // Catch: java.util.zip.ZipException -> L61
        long r16 = r13 & 15;     // Catch: java.util.zip.ZipException -> L61
        int r17 = 1;
        int r110 = 4;
    L36:
        if ((r13 & 128) == 0) goto L37;
        int r22 = r17 + 1;     // Catch: java.util.zip.ZipException -> L61
        int r111 = r3[r17] & 255;
        r16 = r16 + ((long) ((r111 & 127) << r110));
        r110 = r110 + 7;
        r15 = r15;
        r4 = 2;
        r5 = 0;
        r17 = r22;
        r13 = r111;
        goto L36
    L37:
        if (r15 == 1) goto L45;
        if (r15 == r4) goto L45;
        if (r15 == 3) goto L45;
        if (r15 == 4) goto L45;
        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectInvalidType);     // Catch: java.util.zip.ZipException -> L61
    L45:
        if (r19 != null) goto L52;
        if (2147483647L >= r16) goto L52;
        abcd.cD.a r23 = new abcd.cD.a();     // Catch: java.util.zip.ZipException -> L61
        r23.j6(r20);     // Catch: java.util.zip.ZipException -> L61
        throw r23;     // Catch: java.util.zip.ZipException -> L61
    L52:
        if (r16 < r21.Zo()) goto L57;
        if (r19 == null) goto L57;
        return new abcd.sH.a(r15, r16, r19, r20, r21.v5, null);
    L57:
        r1.reset();     // Catch: java.util.zip.ZipException -> L61
        abcd.BK.j6(r1, r17);     // Catch: java.util.zip.ZipException -> L61
        java.util.zip.Inflater r24 = r21.VH();     // Catch: java.util.zip.ZipException -> L61
        byte[] r25 = new byte[(int) r16];     // Catch: java.util.zip.ZipException -> L61
        abcd.BK.j6(j6(r1, r24), r25, r5, r25.length);     // Catch: java.util.zip.ZipException -> L61
        DW(r1, r24, r20, r3);     // Catch: java.util.zip.ZipException -> L61
        return new abcd.FE.a(r15, r25);
    L62:
        throw new abcd.YC(r20, org.eclipse.jgit.JGitText.j6().corruptObjectBadStream);
    }

    public static abcd.FE j6(byte[] r3, abcd.YD r4) {
        abcd.wH r0 = new abcd.wH(null);
        abcd.FE r5 = j6(new java.io.ByteArrayInputStream(r3), null, r4, r0);     // Catch: java.lang.Throwable -> L6
        r0.FH();
        return r5;
    L6:
        th = move-exception;
        r0.FH();
        throw th;
    }

    static java.io.BufferedInputStream j6(java.io.InputStream r0) {
        return DW(r0);
    }

    static java.io.InputStream j6(java.io.InputStream r0, long r1, abcd.yE r3) {
        return DW(r0, r1, r3);
    }

    private static java.util.zip.InflaterInputStream j6(java.io.InputStream r2, java.util.zip.Inflater r3) {
        return new java.util.zip.InflaterInputStream(r2, r3, 8192);
    }

    static void j6(java.io.InputStream r0, java.util.zip.Inflater r1, abcd.YD r2, byte[] r3) {
        DW(r0, r1, r2, r3);
    }

    static boolean j6(byte[] r0) {
        return DW(r0);
    }
}
