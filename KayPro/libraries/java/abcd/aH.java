package abcd;

public class aH implements java.lang.Iterable<abcd.AbstractbH.b> {
    public static final java.util.Comparator<abcd.aH> j6 = null;
    private final java.io.File DW;
    private int EQ;
    private final java.io.File FH;
    private volatile java.lang.String Hw;
    private byte[] J0;
    private abcd.AbstractbH J8;
    private volatile abcd.DK QX;
    private final java.lang.Object VH;
    private abcd.lH Ws;
    private java.io.RandomAccessFile Zo;
    long gn;
    private int tp;
    private int u7;
    final int v5;
    private volatile boolean we;

    private static class a {
        final long DW;
        final int FH;
        final int Hw;
        final abcd.aH.a j6;
        final long v5;

        a(abcd.aH.a r1, long r2, int r4, int r5, long r6) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r4;
            this.Hw = r5;
            this.v5 = r6;
        }

        private abcd.FE DW(abcd.aH r10, abcd.wH r11) {
            return new abcd.OG(this.DW, this.v5, this.Hw, r10, r11.v5);
        }

        abcd.FE j6(abcd.aH r3, abcd.wH r4) {
            abcd.aH.a r0 = this;
        L3:
            abcd.aH.a r1 = r0.j6;
            if (r1 == null) goto L6;
            r0 = r1;
            goto L3
        L6:
            return r0.DW(r3, r4);
        }
    }

    static {
        j6 = new abcd._G();
    }

    public aH(java.io.File r2, java.io.File r3) {
        this.VH = new java.lang.Object();
        this.DW = r2;
        this.FH = r3;
        this.EQ = (int) (r3.lastModified() >> 10);
        this.v5 = java.lang.System.identityHashCode(this) * 31;
        this.gn = Long.MAX_VALUE;
    }

    private long DW(long r5) {
        long r0 = this.gn - 20;
        return we().j6(r5, r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [long] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r31v0, types: [long] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [long] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v8, types: [long] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [long] */
    /* JADX WARN: Type inference failed for: r8v22, types: [abcd.TG] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [abcd.MH, abcd.TG] */
    /* JADX WARN: Type inference failed for: r8v5, types: [abcd.MH] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [long] */
    private void DW(abcd.OH r34, abcd.TG r35, boolean r36, abcd.wH r37) {
        abcd.aH r8 = this;
        abcd.TG r9 = r35;
        java.util.zip.CRC32 r1 = null;
        if (r36 == false) goto L5;
        java.util.zip.CRC32 r10 = new java.util.zip.CRC32();
    L6:
        if (r36 == false) goto L8;
        r1 = new java.util.zip.CRC32();
    L8:
        java.util.zip.CRC32 r11 = r1;
        byte[] r12 = r34.FH();
        j6(r9.aM, r12, 0, 20, r37);
        int r13 = 0;
        int r2 = r12[0] & 255;
        int r3 = (r2 >> 4) & 7;
        long r6 = r2 & 15;
        int r4 = 4;
        int r15 = 1;
    L10:
        if ((r2 & 128) == 0) goto L12;
        abcd.aH r5 = r8;
        abcd.TG r14 = r9;
        int r16 = r12[r15] & 255;
        r6 = ((long) ((r16 & 127) << r4)) + r6;
        r4 = r4 + 7;
        r15 = r15 + 1;
        r2 = r16;
        r13 = 0;
        r9 = r14;
        r8 = r5;
        goto L10
    L12:
        if (r3 != 6) goto L19;
    L13:
        int r7 = r15 + 1;
        if (((r12[r15] & 255) & 128) == 0) goto L15;
        r15 = r7;
        goto L13
    L15:
        if (r36 == false) goto L17;
        r10.update(r12, r13, r7);
        r11.update(r12, r13, r7);
    L17:
        r15 = r7;
        long r17 = r6;
    L29:
        long r18 = r9.aM + ((long) r15);
        long r19 = r9.j3;
        long r110 = r18;
        abcd.AG r20 = r37.j6(this, r18, r19);     // Catch: java.io.IOException -> L116 java.util.zip.DataFormatException -> L120
        if (r36 == true) goto L129;
    L52:
        long r21 = r19;
        abcd.AG r26 = r20;
        if (r36 == false) goto L89;
        java.util.zip.Inflater r22 = r37.VH();     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        byte[] r23 = new byte[1024];     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        if (r26 == null) goto L58;
        r26.j6(r22, r23, r110, (int) r21);     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        ?? r24 = r21;
    L125:
        if (r22.finished() == true) goto L64;
    L67:
        ?? r25 = r35;
    L70:
        Hw(r25.aM);     // Catch: java.io.IOException -> L85 java.util.zip.DataFormatException -> L87
        throw new java.io.EOFException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().shortCompressedStreamAt, new java.lang.Object[]{java.lang.Long.valueOf(r25.aM)}));     // Catch: java.io.IOException -> L85 java.util.zip.DataFormatException -> L87
    L85:
        e = e;
    L118:
        abcd.tD r27 = new abcd.tD(r25);
        r27.initCause(e);
        throw r27;
    L87:
        e = e;
    L122:
        Hw(r25.aM);
        abcd.YC r28 = new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r25.aM), v5()}));
        r28.initCause(e);
        abcd.tD r0 = new abcd.tD(r25);
        r0.initCause(r28);
        throw r0;
    L72:
        e = e;
    L74:
        e = e;
        goto L122
    L64:
        if (r22.getBytesRead() != r24) goto L67;
        long r111 = r10.getValue();     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        ?? r29 = r24;
        abcd.TG r30 = r35;
    L90:
        if (r26 == null) goto L92;
        r34.j6(r30, r17);
        r26.j6(r34, r110, (int) r29, null);
        return;
    L92:
        long r31 = r17;
        ?? r32 = r29;
        if (r32 > r12.length) goto L101;
        if (r36 == true) goto L100;
        long r112 = r110;
        ?? r113 = r32;
        r32 = r32;
    L97:
        if (r113 <= 0) goto L100;
        int r114 = (int) java.lang.Math.min(r113, r12.length);
        j6(r112, r12, 0, r114, r37);
        long r33 = r114;
        r112 = r112 + r33;
        r32 = r32;
        r113 = r113 - r33;
    L100:
        r34.j6(r30, r31);
        r34.write(r12, 0, (int) r32);
        return;
    L101:
        r34.j6(r30, r31);
        ?? r38 = r32;
    L103:
        if (r38 <= 0) goto L104;
        int r115 = (int) java.lang.Math.min(r38, r12.length);
        j6(r110, r12, 0, r115, r37);
        if (r36 == false) goto L114;
        int r39 = 0;
        r11.update(r12, 0, r115);
    L115:
        r34.write(r12, r39, r115);
        long r40 = r115;
        r110 = r110 + r40;
        r38 = r38 - r40;
        goto L103
    L114:
        r39 = 0;
        goto L115
    L104:
        if (r36 == true) goto L106;
        return;
    L106:
        if (r11.getValue() != r111) goto L109;
        return;
    L109:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r30.aM), v5()}));
    L76:
        e = e;
    L49:
        r25 = r35;
    L78:
        e = e;
    L51:
        r25 = r35;
        goto L122
    L58:
        long r41 = r21;
        long r116 = r110;
        r25 = r21;
    L59:
        r24 = r25;
        if (r41 <= 0) goto L125;
        ?? r42 = r25;
        int r43 = (int) java.lang.Math.min(r41, r12.length);     // Catch: java.io.IOException -> L85 java.util.zip.DataFormatException -> L87
        long r210 = r41;
        byte[] r117 = r23;
        java.util.zip.Inflater r44 = r22;
        j6(r116, r12, 0, r43, r37);     // Catch: java.io.IOException -> L85 java.util.zip.DataFormatException -> L87
        int r45 = 0;
        r10.update(r12, 0, r43);     // Catch: java.io.IOException -> L85 java.util.zip.DataFormatException -> L87
        r44.setInput(r12, 0, r43);     // Catch: java.io.IOException -> L85 java.util.zip.DataFormatException -> L87
    L82:
        if (r44.inflate(r117, r45, r117.length) <= 0) goto L83;
        r45 = 0;
        goto L82
    L83:
        long r46 = r43;
        r116 = r116 + r46;
        r22 = r44;
        r23 = r117;
        r25 = r42;
        r41 = r210 - r46;
        goto L59
    L89:
        r29 = r21;
        r30 = r35;
        r111 = -1;
        goto L90
    L129:
    L48:
        e = e;
    L50:
        e = e;
        goto L51
    L34:
        if (J0().FH() == false) goto L52;
        r111 = J0().j6(r9);     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        if (r20 == null) goto L39;
        long r47 = r19;
        r20.j6(r10, r110, (int) r47);     // Catch: java.io.IOException -> L116 java.util.zip.DataFormatException -> L120
    L43:
        if (r10.getValue() != r111) goto L45;
        r29 = r47;
        r26 = r20;
        r30 = r9;
        goto L90
    L45:
        r8.Hw(r9.aM);     // Catch: java.io.IOException -> L116 java.util.zip.DataFormatException -> L120
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r9.aM), v5()}));     // Catch: java.io.IOException -> L116 java.util.zip.DataFormatException -> L120
    L39:
        r47 = r19;
        long r48 = r47;
        long r211 = r110;
    L41:
        if (r48 <= 0) goto L43;
        int r49 = (int) java.lang.Math.min(r48, r12.length);     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        j6(r211, r12, 0, r49, r37);     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        r10.update(r12, 0, r49);     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        long r50 = r49;
        r211 = r211 + r50;     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        r48 = r48 - r50;     // Catch: java.io.IOException -> L48 java.util.zip.DataFormatException -> L50
        r47 = r47;
        r20 = r20;
        r8 = this;
        r9 = r35;
    L116:
        e = e;
        r25 = r9;
    L120:
        e = e;
        r25 = r9;
        goto L122
    L19:
        if (r3 != 7) goto L26;
        if (r36 == false) goto L22;
        r10.update(r12, r13, r15);
        r11.update(r12, r13, r15);
    L22:
        r17 = r6;
        j6(((long) r15) + r9.aM, r12, 0, 20, r37);
        if (r36 == false) goto L25;
        r10.update(r12, r13, 20);
        r11.update(r12, r13, 20);
    L25:
        r15 = r15 + 20;
        goto L29
    L26:
        r17 = r6;
        if (r36 == false) goto L29;
        r10.update(r12, r13, r15);
        r11.update(r12, r13, r15);
        goto L29
    L5:
        r10 = null;
        goto L6
    }

    private synchronized void EQ() {
        monitor-enter(this);
        int r0 = this.tp - 1;     // Catch: java.lang.Throwable -> L10
        this.tp = r0;     // Catch: java.lang.Throwable -> L10
        if (r0 == 0) goto L6;
    L8:
        monitor-exit(this);
        return;
    L6:
        if (this.u7 != 0) goto L8;
        u7();     // Catch: java.lang.Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    private boolean FH(long r2) {
        abcd.DK r0 = this.QX;
        if (r0 != null) goto L6;
        return false;
    L6:
        monitor-enter(r0);
        boolean r3 = r0.DW(r2);     // Catch: java.lang.Throwable -> L10
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L10
        return r3;
    L10:
        th = move-exception;
        throw th;
    }

    private void Hw(long r3) {
        abcd.DK r0 = this.QX;
        if (r0 != null) goto L14;
        java.lang.Object r1 = this.VH;
        monitor-enter(r1);
        r0 = this.QX;     // Catch: java.lang.Throwable -> L11
        if (r0 != null) goto L9;
        r0 = new abcd.DK();     // Catch: java.lang.Throwable -> L11
        this.QX = r0;     // Catch: java.lang.Throwable -> L11
    L9:
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    L14:
        monitor-enter(r0);
        r0.j6(r3);     // Catch: java.lang.Throwable -> L18
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L18
        return;
    L18:
        th = move-exception;
        throw th;
    }

    private synchronized abcd.AbstractbH J0() {
        monitor-enter(this);
    L24:
        th = move-exception;
        throw th;
    L4:
        if (this.J8 == null) goto L6;
    L21:
        abcd.AbstractbH r0 = this.J8;     // Catch: java.lang.Throwable -> L24
        monitor-exit(this);
        return r0;
    L6:
        if (this.we == true) goto L20;
        abcd.AbstractbH r1 = abcd.AbstractbH.j6(this.DW);     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L24
        if (this.J0 != null) goto L11;
        this.J0 = r1.j6;     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L24
    L12:
        this.J8 = r1;     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L24
        goto L21
    L11:
        if (java.util.Arrays.equals(this.J0, r1.j6) == true) goto L12;
        throw new abcd.mD(org.eclipse.jgit.JGitText.j6().packChecksumMismatch);     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L24
    L15:
        e = move-exception;
        this.we = true;     // Catch: java.lang.Throwable -> L24
        throw e;     // Catch: java.lang.Throwable -> L24
    L20:
        throw new abcd.lD(this.FH);     // Catch: java.lang.Throwable -> L24
    }

    private void J8() {
        abcd.AbstractbH r0 = J0();
        byte[] r2 = new byte[20];
        this.Zo.seek(0);
        this.Zo.readFully(r2, 0, 12);
        if (abcd.IK.j6(r2, 0, abcd.hE.v5) != 4) goto L21;
        long r5 = abcd.FK.FH(r2, 4);
        long r7 = abcd.FK.FH(r2, 8);
        if (r5 == 2) goto L12;
        if (r5 == 3) goto L12;
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unsupportedPackVersion, new java.lang.Object[]{java.lang.Long.valueOf(r5)}));
    L12:
        if (r7 != r0.j6()) goto L19;
        this.Zo.seek(this.gn - 20);
        this.Zo.readFully(r2, 0, 20);
        if (java.util.Arrays.equals(r2, this.J0) == false) goto L17;
        return;
    L17:
        throw new abcd.mD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packObjectCountMismatch, new java.lang.Object[]{abcd.yE.j6(r2).we(), abcd.yE.j6(r0.j6).we(), v5()}));
    L19:
        throw new abcd.mD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().packObjectCountMismatch, new java.lang.Object[]{java.lang.Long.valueOf(r7), java.lang.Long.valueOf(r0.j6()), v5()}));
    L21:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().notAPACKFile);
    }

    private void Ws() {
        this.u7 = 0;
        this.tp = 0;
        this.we = true;
        u7();
    }

    static int j6(abcd.aH r0) {
        return r0.EQ;
    }

    private long j6(abcd.yE r6) {
        long r0 = J0().DW(r6);
        if (r0 < 0) goto L6;
        return r0;
    L6:
        throw new abcd.fD(r6, org.eclipse.jgit.JGitText.j6().missingDeltaBase);
    }

    private void j6(long r8, byte[] r10, int r11, int r12, abcd.wH r13) {
        if (r13.j6(this, r8, r10, r11, r12) != r12) goto L6;
        return;
    L6:
        throw new java.io.EOFException();
    }

    private synchronized void j6(abcd.MH r3) {
        monitor-enter(this);
        int r0 = this.tp + 1;     // Catch: java.lang.Throwable -> L14
        this.tp = r0;     // Catch: java.lang.Throwable -> L14
        if (r0 == 1) goto L6;
    L12:
        monitor-exit(this);
        return;
    L6:
        if (this.u7 != 0) goto L12;
        tp();     // Catch: java.io.IOException -> L9 java.lang.Throwable -> L14
    L9:
        e = move-exception;
        abcd.tD r1 = new abcd.tD(r3);     // Catch: java.lang.Throwable -> L14
        r1.initCause(e);     // Catch: java.lang.Throwable -> L14
        throw r1;     // Catch: java.lang.Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    private final byte[] j6(long r8, int r10, abcd.wH r11) {
        byte[] r6 = new byte[r10];     // Catch: java.lang.OutOfMemoryError -> L8
        if (r11.j6(this, r8, r6, 0) != r10) goto L7;
        return r6;
    L7:
        throw new java.io.EOFException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().shortCompressedStreamAt, new java.lang.Object[]{java.lang.Long.valueOf(r8)}));
    L8:
        return null;
    }

    private void tp() {
    L20:
        e = move-exception;
        Ws();
        throw e;
    L14:
        e = move-exception;
        Ws();
        throw e;
    L17:
        e = move-exception;
        Ws();
        throw e;
    L3:
        if (this.we == true) goto L13;
        java.lang.Object r0 = this.VH;     // Catch: java.lang.Error -> L14 java.lang.RuntimeException -> L17 java.io.IOException -> L20
        monitor-enter(r0);     // Catch: java.lang.Error -> L14 java.lang.RuntimeException -> L17 java.io.IOException -> L20
        this.Zo = new java.io.RandomAccessFile(this.FH, "r");     // Catch: java.lang.Throwable -> L9
        this.gn = this.Zo.length();     // Catch: java.lang.Throwable -> L9
        J8();     // Catch: java.lang.Throwable -> L9
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: java.lang.Error -> L14 java.lang.RuntimeException -> L17 java.io.IOException -> L20
    L13:
        throw new abcd.lD(this.FH);     // Catch: java.lang.Error -> L14 java.lang.RuntimeException -> L17 java.io.IOException -> L20
    }

    private void u7() {
        java.lang.Object r0 = this.VH;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.Zo != null) goto L17;
    L9:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return;
    L17:
        this.Zo.close();     // Catch: java.io.IOException -> L14 java.lang.Throwable -> L11
    L8:
        this.Zo = null;     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    private synchronized abcd.lH we() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.Ws != null) goto L6;
        this.Ws = new abcd.lH(J0());     // Catch: java.lang.Throwable -> L9
    L6:
        abcd.lH r0 = this.Ws;     // Catch: java.lang.Throwable -> L9
        monitor-exit(this);
        return r0;
    }

    long DW(abcd.wH r17, long r18) {
        byte[] r8 = r17.j6;
        j6(r18, r8, 0, 20, r17);
        int r1 = r8[0] & 255;
        int r2 = (r1 >> 4) & 7;
        long r10 = r1 & 15;
        int r4 = 1;
        int r5 = 4;
    L4:
        if ((r1 & 128) == 0) goto L5;
        int r3 = r4 + 1;
        int r6 = r8[r4] & 255;
        r10 = r10 + ((long) ((r6 & 127) << r5));
        r5 = r5 + 7;
        r4 = r3;
        r1 = r6;
        goto L4
    L5:
        if (r2 == 1) goto L28;
        if (r2 == 2) goto L28;
        if (r2 == 3) goto L28;
        if (r2 == 4) goto L28;
        if (r2 == 6) goto L18;
        if (r2 != 7) goto L17;
        long r7 = (r18 + ((long) r4)) + 20;
    L30:
        return abcd.AH.j6(j6(r17, r7));
    L25:
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r18), v5()}));
    L17:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));
    L18:
        int r9 = r4 + 1;
        int r11 = r8[r4] & 255;
    L20:
        if ((r11 & 128) == 0) goto L21;
        r11 = r8[r9] & 255;
        r9 = r9 + 1;
        goto L20
    L21:
        r7 = r18 + ((long) r9);
    L28:
        return r10;
    }

    long DW(abcd.wH r5, abcd.YD r6) {
        long r0 = J0().DW(r6);
        if (0 < r0) goto L7;
        return -1;
    L7:
        return DW(r5, r0);
    }

    abcd.AG DW(long r7, int r9) {
        java.lang.Object r0 = this.VH;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.gn >= (((long) r9) + r7)) goto L7;
        r9 = (int) (this.gn - r7);     // Catch: java.lang.Throwable -> L10
    L7:
        byte[] r1 = new byte[r9];     // Catch: java.lang.Throwable -> L10
        this.Zo.seek(r7);     // Catch: java.lang.Throwable -> L10
        this.Zo.readFully(r1, 0, r9);     // Catch: java.lang.Throwable -> L10
        abcd.AG r10 = new abcd.AG(this, r7, r1);     // Catch: java.lang.Throwable -> L10
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L10
        return r10;
    }

    public void DW() {
        abcd.uH.j6(this);
        monitor-enter(this);
        this.J8 = null;     // Catch: java.lang.Throwable -> L8
        this.Ws = null;     // Catch: java.lang.Throwable -> L8
        monitor-exit(this);     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    int FH(abcd.wH r12, long r13) {
        byte[] r7 = r12.j6;
    L3:
        j6(r13, r7, 0, 20, r12);
        int r1 = r7[0] & 255;
        int r2 = (r1 >> 4) & 7;
        int r4 = 1;
        if (r2 == 1) goto L28;
        if (r2 == 2) goto L28;
        if (r2 == 3) goto L28;
        if (r2 == 4) goto L28;
        if (r2 != 6) goto L13;
    L21:
        if ((r1 & 128) == 0) goto L22;
        r1 = r7[r4] & 255;
        r4 = r4 + 1;
        goto L21
    L22:
        int r0 = r4 + 1;
        int r3 = r7[r4] & 255;
        long r5 = r3 & 127;
    L24:
        if ((r3 & 128) == 0) goto L25;
        int r6 = r0 + 1;
        int r8 = r7[r0] & 255;
        r5 = ((r5 + 1) << 7) + ((long) (r8 & 127));
        r3 = r8;
        r0 = r6;
        goto L24
    L25:
        r13 = r13 - r5;
        goto L3
    L13:
        if (r2 != 7) goto L19;
    L15:
        if ((r1 & 128) == 0) goto L16;
        r1 = r7[r4] & 255;
        r4 = r4 + 1;
        goto L15
    L16:
        j6(r13 + ((long) r4), r7, 0, 20, r12);
        r13 = j6(abcd.yE.j6(r7));
        goto L3
    L19:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));
    L28:
        return r2;
    }

    abcd.SG FH(abcd.wH r14, abcd.YD r15) {
        long r8 = J0().DW(r15);
        if (r8 >= 0) goto L6;
        return null;
    L6:
        byte[] r16 = r14.j6;
        j6(r8, r16, 0, 20, r14);
        int r1 = r16[0] & 255;
        int r2 = (r1 >> 4) & 7;
        int r5 = 1;
    L8:
        if ((r1 & 128) == 0) goto L9;
        int r3 = r5 + 1;
        int r6 = r16[r5] & 255;
        r5 = r3;
        r1 = r6;
        goto L8
    L9:
        long r7 = DW(r8) - r8;
        if (r2 == 1) goto L31;
        if (r2 == 2) goto L31;
        if (r2 == 3) goto L31;
        if (r2 == 4) goto L31;
        if (r2 == 6) goto L24;
        if (r2 != 7) goto L23;
        long r0 = r5;
        j6(r8 + r0, r16, 0, 20, r14);
        return abcd.SG.j6(this, r8, (r7 - r0) - 20, abcd.yE.j6(r16));
    L23:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));
    L24:
        int r17 = r5 + 1;
        int r4 = r16[r5] & 255;
        long r9 = r4 & 127;
    L26:
        if ((r4 & 128) == 0) goto L28;
        int r10 = r17 + 1;
        int r18 = r16[r17] & 255;
        r9 = ((r9 + 1) << 7) + ((long) (r18 & 127));
        r4 = r18;
        r17 = r10;
        goto L26
    L28:
        return abcd.SG.j6(this, r8, r7 - ((long) r17), r8 - r9);
    L31:
        return abcd.SG.j6(this, r8, r7 - ((long) r5));
    }

    synchronized boolean FH() {
        monitor-enter(this);
        boolean r1 = true;
        int r0 = this.u7 - 1;     // Catch: java.lang.Throwable -> L13
        this.u7 = r0;     // Catch: java.lang.Throwable -> L13
        if (r0 == 0) goto L7;
        r1 = false;
    L7:
        if (r1 == true) goto L9;
    L11:
        monitor-exit(this);
        return r1;
    L9:
        if (this.tp != 0) goto L11;
        u7();     // Catch: java.lang.Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    long Hw() {
        return J0().j6();
    }

    abcd.FE Hw(abcd.wH r26, long r27) {
        abcd.aH r10 = this;
        int r11 = 2;
        char r12 = 0;
        byte[] r8 = r26.j6;     // Catch: java.util.zip.DataFormatException -> L80
        byte[] r14 = null;
        long r23 = r27;
        abcd.aH.a r16 = null;
    L86:
        j6(r23, r8, 0, 20, r26);     // Catch: java.util.zip.DataFormatException -> L78
        int r1 = r8[r12] & 255;     // Catch: java.util.zip.DataFormatException -> L78
        int r2 = (r1 >> 4) & 7;     // Catch: java.util.zip.DataFormatException -> L78
        long r4 = r1 & 15;     // Catch: java.util.zip.DataFormatException -> L78
        int r7 = 4;
        int r15 = 1;
    L8:
        if ((r1 & 128) == 0) goto L9;
        long r13 = r4;
        int r3 = r15 + 1;     // Catch: java.util.zip.DataFormatException -> L78
        int r5 = r8[r15] & 255;
        long r9 = ((long) ((r5 & 127) << r7)) + r13;
        r7 = r7 + 7;
        r15 = r3;
        r1 = r5;
        r4 = r9;
        r11 = 2;
        r10 = this;
        goto L8
    L9:
        if (r2 == 1) goto L37;
        if (r2 == r11) goto L37;
        if (r2 == 3) goto L37;
        if (r2 == 4) goto L37;
        if (r2 == 6) goto L25;
        if (r2 != 7) goto L24;
        long r6 = r4;
        j6(r23 + ((long) r15), r8, 0, 20, r26);     // Catch: java.util.zip.DataFormatException -> L78
        long r17 = r10.j6(abcd.yE.j6(r8));     // Catch: java.util.zip.DataFormatException -> L78
        abcd.aH.a r18 = new abcd.aH.a(r16, r23, (int) r6, r15 + 20, r17);     // Catch: java.util.zip.DataFormatException -> L78
        if (r6 != r18.FH) goto L30;
        abcd.EG.a r19 = r26.v5().j6(r10, r17);     // Catch: java.util.zip.DataFormatException -> L78
        if (r19 == null) goto L35;
        int r20 = r19.DW;     // Catch: java.util.zip.DataFormatException -> L78
        r14 = r19.j6;     // Catch: java.util.zip.DataFormatException -> L78
    L34:
        int r21 = r20;
        boolean r22 = true;
    L42:
        if (r14 == null) goto L44;
        boolean r110 = r22;
        abcd.aH.a r24 = r18;
    L46:
        if (r110 == false) goto L49;
        r110 = false;
    L51:
        long r25 = r24.DW;     // Catch: java.util.zip.DataFormatException -> L78
        byte[] r28 = r10.j6(((long) r24.Hw) + r25, r24.FH, r26);     // Catch: java.util.zip.DataFormatException -> L69
        if (r28 == null) goto L55;
        long r29 = abcd.AH.j6(r28);     // Catch: java.util.zip.DataFormatException -> L69
        if (2147483647L <= r29) goto L59;
        byte[] r30 = new byte[(int) r29];     // Catch: java.lang.OutOfMemoryError -> L67 java.util.zip.DataFormatException -> L69
        abcd.AH.j6(r14, r28, r30);     // Catch: java.util.zip.DataFormatException -> L69
        r24 = r24.j6;     // Catch: java.util.zip.DataFormatException -> L69
        if (r24 == null) goto L65;
        r14 = r30;
        goto L46
    L65:
        return new abcd.FE.a(r21, r30);
    L68:
        return r24.j6(r10, r26);
    L59:
        return r24.j6(r10, r26);
    L55:
        return r24.j6(r10, r26);
    L69:
        e = e;
        r23 = r25;
    L82:
        abcd.YC r31 = new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().objectAtHasBadZlibStream, new java.lang.Object[]{java.lang.Long.valueOf(r23), v5()}));
        r31.initCause(e);
        throw r31;
    L49:
        if (r24.j6 != null) goto L51;
        r26.v5().j6(this, r24.v5, r14, r21);     // Catch: java.util.zip.DataFormatException -> L78
        goto L51
    L44:
        return r18.j6(r10, r26);
    L35:
        r23 = r17;
        r16 = r18;
        r11 = 2;
        r12 = 0;
    L30:
        r22 = false;
        r21 = -1;
        goto L42
    L24:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().unknownObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r2)}));     // Catch: java.util.zip.DataFormatException -> L78
    L25:
        long r111 = r4;
        int r32 = r15 + 1;     // Catch: java.util.zip.DataFormatException -> L78
        int r33 = r8[r15] & 255;     // Catch: java.util.zip.DataFormatException -> L78
        long r34 = r33 & 127;     // Catch: java.util.zip.DataFormatException -> L78
    L26:
        int r210 = r32;
        if ((r33 & 128) == 0) goto L28;
        r32 = r210 + 1;     // Catch: java.util.zip.DataFormatException -> L78
        r33 = r8[r210] & 255;     // Catch: java.util.zip.DataFormatException -> L78
        r34 = ((r34 + 1) << 7) + ((long) (r33 & 127));     // Catch: java.util.zip.DataFormatException -> L78
        goto L26
    L28:
        r17 = r23 - r34;     // Catch: java.util.zip.DataFormatException -> L78
        r18 = new abcd.aH.a(r16, r23, (int) r111, r210, r17);     // Catch: java.util.zip.DataFormatException -> L78
        if (r111 != r18.FH) goto L30;
        abcd.EG.a r35 = r26.v5().j6(r10, r17);     // Catch: java.util.zip.DataFormatException -> L78
        if (r35 == null) goto L35;
        r20 = r35.DW;     // Catch: java.util.zip.DataFormatException -> L78
        r14 = r35.j6;     // Catch: java.util.zip.DataFormatException -> L78
    L37:
        long r112 = r4;
        if (r112 >= r26.Zo()) goto L40;
        r14 = r10.j6(r23 + ((long) r15), (int) r112, r26);     // Catch: java.util.zip.DataFormatException -> L78
    L40:
        if (r16 == null) goto L71;
        r21 = r2;
        r18 = r16;
        r22 = false;
        goto L42
    L71:
        if (r14 == null) goto L75;
        return new abcd.FE.a(r2, r14);
    L75:
        return new abcd.PG(r2, r112, r23, r15, this, r26.v5);
    L78:
        e = e;
    L80:
        e = e;
        r23 = r27;
        goto L82
    }

    boolean VH() {
        return this.we;
    }

    public java.lang.String Zo() {
        java.lang.String r0 = this.Hw;
        if (r0 != null) goto L11;
        r0 = v5().getName();
        if (r0.startsWith("pack-") == false) goto L8;
        r0 = r0.substring(5);
    L8:
        if (r0.endsWith(".pack") == false) goto L10;
        r0 = r0.substring(0, r0.length() - 5);
    L10:
        this.Hw = r0;
    L11:
        return r0;
    }

    void gn() {
        this.we = true;
    }

    @Override
    public java.util.Iterator<abcd.AbstractbH.b> iterator() {
        return J0().iterator();
    L5:
        return java.util.Collections.emptyList().iterator();
    }

    abcd.CG j6(long r9, int r11) {
        java.lang.Object r0 = this.VH;
        monitor-enter(r0);
    L19:
        th = move-exception;
        throw th;
    L5:
        if (this.gn < (((long) r11) + r9)) goto L7;
    L23:
        java.nio.MappedByteBuffer r12 = this.Zo.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, r9, r11);     // Catch: java.io.IOException -> L10 java.lang.Throwable -> L19
    L12:
        if (r12.hasArray() == false) goto L16;
        abcd.AG r1 = new abcd.AG(this, r9, r12.array());     // Catch: java.lang.Throwable -> L19
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        return r1;
    L16:
        abcd.BG r2 = new abcd.BG(this, r9, r12);     // Catch: java.lang.Throwable -> L19
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        return r2;
    L10:
        java.lang.System.gc();     // Catch: java.lang.Throwable -> L19
        java.lang.System.runFinalization();     // Catch: java.lang.Throwable -> L19
        r12 = this.Zo.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, r9, r11);     // Catch: java.lang.Throwable -> L19
        goto L12
    L7:
        r11 = (int) (this.gn - r9);
        goto L23
    }

    abcd.FE j6(abcd.wH r5, abcd.YD r6) {
        long r0 = J0().DW(r6);
        if (0 < r0) goto L5;
    L7:
        return null;
    L5:
        if (FH(r0) == true) goto L7;
        return Hw(r5, r0);
    }

    abcd.yE j6(long r2) {
        return we().j6(r2);
    }

    final void j6(abcd.OH r1, abcd.TG r2, boolean r3, abcd.wH r4) {
        j6(r2);
        DW(r1, r2, r3, r4);     // Catch: java.lang.Throwable -> L6
        EQ();
        return;
    L6:
        th = move-exception;
        EQ();
        throw th;
    }

    void j6(abcd.OH r9, boolean r10, abcd.wH r11) {
        r11.j6(this, 0);
        r11.j6(this, this.gn, r10, r9);
    }

    void j6(java.util.Set<abcd.yE> r2, abcd.WD r3, int r4) {
        J0().j6(r2, r3, r4);
    }

    synchronized boolean j6() {
        monitor-enter(this);
        int r0 = this.u7 + 1;     // Catch: java.lang.Throwable -> L13
        this.u7 = r0;     // Catch: java.lang.Throwable -> L13
        if (r0 != 1) goto L11;
        if (this.tp != 0) goto L8;
        tp();     // Catch: java.lang.Throwable -> L13
    L8:
        monitor-exit(this);
        return true;
    L11:
        monitor-exit(this);
        return false;
    L13:
        th = move-exception;
        throw th;
    }

    public boolean j6(abcd.YD r5) {
        long r0 = J0().DW(r5);
        if (0 < r0) goto L5;
        return false;
    L5:
        if (FH(r0) == true) goto L10;
        return true;
    L10:
        return false;
    }

    byte[] j6(abcd.wH r8, long r9) {
        byte[] r0 = new byte[18];
        r8.j6(this, r9, r0, 0);
        return r0;
    }

    public java.io.File v5() {
        return this.FH;
    }
}
