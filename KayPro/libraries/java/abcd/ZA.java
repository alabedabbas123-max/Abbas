package abcd;

public class ZA extends dB<abcd.dG> {
    private static int[] FH;
    private boolean EQ;
    private abcd.KE Hw;
    private java.lang.String J0;
    private boolean VH;
    private java.lang.String Zo;
    private java.util.List<java.lang.String> gn;
    private boolean tp;
    private boolean[] u7;
    private abcd.KE v5;
    private java.util.List<abcd.yE> we;

    protected ZA(abcd.UE r1) {
        super(r1);
        this.gn = new java.util.ArrayList();
        this.we = new java.util.LinkedList();
    }

    static int[] FH() {
        int[] r0 = FH;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.RE.a.values().length];
        r1[abcd.RE.a.Zo.ordinal()] = 6;     // Catch: java.lang.NoSuchFieldError -> L18
    L30:
        r1[abcd.RE.a.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L19
    L34:
        r1[abcd.RE.a.u7.ordinal()] = 9;     // Catch: java.lang.NoSuchFieldError -> L20
    L44:
        r1[abcd.RE.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L21
    L38:
        r1[abcd.RE.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L22
    L46:
        r1[abcd.RE.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L23
    L28:
        r1[abcd.RE.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L24
    L40:
        r1[abcd.RE.a.VH.ordinal()] = 7;     // Catch: java.lang.NoSuchFieldError -> L25
    L32:
        r1[abcd.RE.a.gn.ordinal()] = 8;     // Catch: java.lang.NoSuchFieldError -> L26
    L36:
        r1[abcd.RE.a.tp.ordinal()] = 10;     // Catch: java.lang.NoSuchFieldError -> L27
    L16:
        FH = r1;
        return r1;
    }

    private int Hw(java.lang.String r8) {
        java.util.Iterator<java.lang.String> r0 = this.gn.iterator();
        int r2 = 0;
    L4:
        if (r0.hasNext() == false) goto L5;
        java.lang.String r3 = r0.next();
        java.lang.String r4 = r8;
    L9:
        if (r4.equals(r3) == true) goto L10;
        int r5 = r4.lastIndexOf("/");
        if (r5 < 1) goto L13;
        r4 = r4.substring(0, r5);
        goto L9
    L13:
        r2 = r2 + 1;
        goto L4
    L10:
        return r2;
    L5:
        return -1;
    }

    private abcd.KC j6(abcd.yE r23, abcd.KC r24) {
        abcd.PC r2 = r24.Hw();
        abcd.KC r3 = abcd.KC.gn();
        abcd.MC r4 = r3.j6();
        this.u7 = new boolean[this.gn.size()];
        abcd.YJ r5 = new abcd.YJ(this.j6);
        int r6 = r5.j6(new abcd.RC(r24));
        int r7 = r5.j6(new abcd.WJ(this.j6));
        int r8 = -1;
        if (r23 == null) goto L5;
        int r0 = r5.j6(new abcd.qG(this.j6).gn(r23));
    L6:
        int r9 = 1;
        r5.j6(true);
        boolean r11 = true;
        abcd.EE r12 = null;
    L8:
        if (r5.EQ() == false) goto L21;
        java.lang.String r13 = r5.Hw();
        int r15 = Hw(r13);
        if (r0 == r8) goto L13;
        abcd.UJ r10 = (abcd.UJ) r5.j6(r0, abcd.UJ.class);
    L14:
        if (r15 < 0) goto L72;
        abcd.RC r14 = (abcd.RC) r5.j6(r6, abcd.RC.class);
        abcd.WJ r16 = (abcd.WJ) r5.j6(r7, abcd.WJ.class);
        if (r14 != null) goto L19;
        if (r10 != null) goto L19;
        boolean r17 = false;
    L20:
        if (r17 == false) goto L21;
        if (r16 == null) goto L67;
        abcd.QC r18 = new abcd.QC(r13);
        abcd.YJ r19 = r5;
        int r110 = r6;
        long r20 = r16.j3();
        r18.DW(r20);
        abcd.KC r21 = r3;
        abcd.MC r22 = r4;
        r18.j6(r16.aM());
        r18.j6(r16.j6(r14));
        if (r14 != null) goto L39;
    L40:
        if (r10 != null) goto L42;
    L45:
        boolean r25 = false;
    L46:
        if (r25 == false) goto L49;
        r18.j6(r16.v5());
    L56:
        r2.j6(new abcd.YA(this, r13, r18));
        r4 = r22;
        r4.DW(r18);
        if (r11 == false) goto L71;
        if (r10 != null) goto L60;
    L70:
        r11 = false;
        goto L71
    L60:
        if (r10.j6(r16) == false) goto L70;
        if (r10.VH() != r16.VH()) goto L70;
    L71:
        this.u7[r15] = true;
    L75:
        r5 = r19;
        r6 = r110;
        r3 = r21;
        r8 = -1;
        r9 = 1;
        goto L8
    L49:
        if (abcd.AbstractrE.v5.equals(r18.j6()) == false) goto L51;
        r18.j6(r16.v5());
        goto L56
    L51:
        if (r12 != null) goto L53;
        r12 = this.j6.aM();
    L53:
        java.io.InputStream r26 = r16.a8();
        r18.j6(r12.j6(3, r20, r26));     // Catch: java.lang.Throwable -> L64
        r26.close();
    L64:
        th = move-exception;
        r26.close();
        throw th;
    L42:
        if (r16.j6(r10) == false) goto L45;
    L44:
        r25 = true;
        goto L46
    L39:
        if (r16.j6(r14) == true) goto L44;
    L67:
        r21 = r3;
        r19 = r5;
        r110 = r6;
        r2.j6(new abcd.PC.a(r13));
        if (r11 == false) goto L71;
        if (r10 == null) goto L71;
    L19:
        r17 = true;
        goto L20
    L72:
        r21 = r3;
        r19 = r5;
        r110 = r6;
        if (r10 == null) goto L75;
        abcd.QC r27 = new abcd.QC(r13);
        r27.j6(r10.v5());
        r27.j6(r10.Hw());
        r4.DW(r27);
        goto L75
    L13:
        r10 = null;
    L21:
        int r1 = 0;
    L22:
        boolean[] r28 = this.u7;
        if (r1 >= r28.length) goto L24;
        if (r28[r1] == false) goto L32;
        r1 = r1 + 1;
        goto L22
    L32:
        java.lang.String r29 = org.eclipse.jgit.JGitText.j6().entryNotFoundByPath;
        java.lang.Object[] r30 = new java.lang.Object[r9];
        r30[0] = this.gn.get(r1);
        throw new abcd.SB(java.text.MessageFormat.format(r29, r30));
    L24:
        if (r11 == true) goto L28;
        r2.j6();
        r4.DW();
        return r3;
    L28:
        throw new abcd.SB(org.eclipse.jgit.JGitText.j6().emptyCommit);
    L5:
        r0 = -1;
        goto L6
    }

    private void j6(abcd.EnumiF r7) {
        if (this.v5 != null) goto L6;
        this.v5 = new abcd.KE(this.j6);
    L6:
        if (this.Hw != null) goto L9;
        this.Hw = this.v5;
    L9:
        if (r7 != abcd.EnumiF.Hw) goto L23;
        this.we = this.j6.lg();     // Catch: java.io.IOException -> L19
        if (this.Zo != null) goto L23;
        this.Zo = this.j6.a8();     // Catch: java.io.IOException -> L16
    L16:
        e = move-exception;
        throw new abcd.SB(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().exceptionOccurredDuringReadingOfGIT_DIR, new java.lang.Object[]{"MERGE_MSG", e}), e);
    L19:
        e = move-exception;
        throw new abcd.SB(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().exceptionOccurredDuringReadingOfGIT_DIR, new java.lang.Object[]{"MERGE_HEAD", e}), e);
    L23:
        if (this.Zo == null) goto L26;
        return;
    L26:
        throw new abcd.WB(org.eclipse.jgit.JGitText.j6().commitMessageNotSpecified);
    }

    private void j6(abcd.yE r6) {
        if (this.we.isEmpty() == true) goto L5;
        abcd.yE r0 = this.we.get(0);
    L6:
        abcd.yE r7 = abcd.mK.j6(r6, r0, this.Hw, this.v5, this.Zo);
        this.Zo = abcd.mK.j6(this.Zo, r7);
        if (r7 == null) goto L10;
        this.Zo = this.Zo.replaceAll("\nChange-Id: I" + abcd.yE.Ws().VH() + "\n", "\nChange-Id: I" + r7.VH() + "\n");
        return;
    L10:
        return;
    L5:
        r0 = null;
        goto L6
    }

    public abcd.ZA DW(java.lang.String r6) {
        j6();
        if (this.VH == true) goto L12;
        if (r6.endsWith("/") == false) goto L8;
        r6 = r6.substring(0, r6.length() - 1);
    L8:
        if (this.gn.contains(r6) == true) goto L10;
        this.gn.add(r6);
    L10:
        return this;
    L12:
        throw new abcd.SB(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().illegalCombinationOfArguments, new java.lang.Object[]{"--only", "--all"}));
    }

    public abcd.ZA DW(boolean r5) {
        j6();
        if (this.gn.isEmpty() == false) goto L7;
        this.VH = r5;
        return this;
    L7:
        throw new abcd.SB(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().illegalCombinationOfArguments, new java.lang.Object[]{"--all", "--only"}));
    }

    public abcd.ZA FH(java.lang.String r1) {
        this.J0 = r1;
        return this;
    }

    public abcd.dG call() {
        j6();
        abcd.EnumiF r1 = this.j6.J0();
        if (r1.Hw() == false) goto L90;
        j6(r1);
    L87:
        e = move-exception;
        throw e;
    L84:
        e = move-exception;
        throw new abcd.SB(org.eclipse.jgit.JGitText.j6().exceptionCaughtDuringExecutionOfCommitCommand, e);
    L6:
        if (this.VH == false) goto L18;
        if (this.j6.QX() == true) goto L18;
        if (this.j6.J8() == null) goto L18;
        abcd.OA r2 = new abcd.cB(this.j6).j6();     // Catch: abcd.UB -> L14 java.io.IOException -> L84 abcd.zD -> L87
        r2.j6(".");     // Catch: abcd.UB -> L14 java.io.IOException -> L84 abcd.zD -> L87
        r2.DW(true);     // Catch: abcd.UB -> L14 java.io.IOException -> L84 abcd.zD -> L87
        r2.call();     // Catch: abcd.UB -> L14 java.io.IOException -> L84 abcd.zD -> L87
    L14:
        e = move-exception;
        throw new abcd.SB(e.getMessage(), e);     // Catch: java.io.IOException -> L84 abcd.zD -> L87
    L18:
        if (this.j6.j6("HEAD") == null) goto L83;
        abcd.yE r3 = this.j6.FH("HEAD^{commit}");     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        if (r3 != null) goto L22;
    L29:
        abcd.KC r5 = this.j6.XL();     // Catch: java.io.IOException -> L84 abcd.zD -> L87
    L79:
        th = move-exception;
        r5.tp();     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        throw th;     // Catch: java.io.IOException -> L84 abcd.zD -> L87
    L31:
        if (this.gn.isEmpty() == true) goto L33;
        r5 = j6(r3, r5);     // Catch: java.lang.Throwable -> L79
    L33:
        abcd.EE r6 = this.j6.aM();     // Catch: java.lang.Throwable -> L79
        abcd.yE r7 = r5.j6(r6);     // Catch: java.lang.Throwable -> L76
        if (this.EQ == false) goto L37;
        j6(r7);     // Catch: java.lang.Throwable -> L76
    L37:
        abcd.fE r8 = new abcd.fE();     // Catch: java.lang.Throwable -> L76
        r8.DW(this.v5);     // Catch: java.lang.Throwable -> L76
        r8.j6(this.Hw);     // Catch: java.lang.Throwable -> L76
        r8.j6(this.Zo);     // Catch: java.lang.Throwable -> L76
        r8.j6(this.we);     // Catch: java.lang.Throwable -> L76
        r8.j6(r7);     // Catch: java.lang.Throwable -> L76
        abcd.yE r9 = r6.j6(r8);     // Catch: java.lang.Throwable -> L76
        r6.FH();     // Catch: java.lang.Throwable -> L76
        abcd.qG r10 = new abcd.qG(this.j6);     // Catch: java.lang.Throwable -> L76
        abcd.dG r11 = r10.VH(r9);     // Catch: java.lang.Throwable -> L73
        abcd.RE r12 = this.j6.v5("HEAD");     // Catch: java.lang.Throwable -> L73
        r12.DW(r9);     // Catch: java.lang.Throwable -> L73
        if (this.J0 == null) goto L42;
        r12.j6(this.J0, false);     // Catch: java.lang.Throwable -> L73
    L46:
        if (r3 == null) goto L48;
        r12.j6(r3);     // Catch: java.lang.Throwable -> L73
    L49:
        abcd.RE.a r4 = r12.FH();     // Catch: java.lang.Throwable -> L73
        int r13 = FH()[r4.ordinal()];     // Catch: java.lang.Throwable -> L73
        if (r13 == 2) goto L72;
        if (r13 != 4) goto L54;
    L61:
        j6(false);     // Catch: java.lang.Throwable -> L73
        if (r1 != abcd.EnumiF.Hw) goto L65;
        this.j6.Zo(null);     // Catch: java.lang.Throwable -> L73
        this.j6.j6(null);     // Catch: java.lang.Throwable -> L73
    L67:
        r10.EQ();     // Catch: java.lang.Throwable -> L76
        r6.Hw();     // Catch: java.lang.Throwable -> L79
        r5.tp();     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        return r11;
    L65:
        if (r1 != abcd.EnumiF.Zo) goto L67;
        this.j6.Zo(null);     // Catch: java.lang.Throwable -> L73
        this.j6.j6(null);     // Catch: java.lang.Throwable -> L73
        goto L67
    L54:
        if (r13 == 5) goto L61;
        if (r13 == 6) goto L61;
        if (r13 == 7) goto L72;
        throw new abcd.SB(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().updatingRefFailed, new java.lang.Object[]{"HEAD", r9.toString(), r4}));     // Catch: java.lang.Throwable -> L73
    L72:
        throw new abcd.LB(org.eclipse.jgit.JGitText.j6().couldNotLockHEAD, r12.VH(), r4);     // Catch: java.lang.Throwable -> L73
    L48:
        r12.j6(abcd.yE.Ws());     // Catch: java.lang.Throwable -> L73
        goto L49
    L42:
        if (this.tp == false) goto L44;
        java.lang.String r14 = "commit (amend): ";
    L45:
        r12.j6(r14 + r11.er(), false);     // Catch: java.lang.Throwable -> L73
        goto L46
    L44:
        r14 = "commit: ";
    L73:
        th = move-exception;
        r10.EQ();     // Catch: java.lang.Throwable -> L76
        throw th;     // Catch: java.lang.Throwable -> L76
    L76:
        th = move-exception;
        r6.Hw();     // Catch: java.lang.Throwable -> L79
        throw th;     // Catch: java.lang.Throwable -> L79
    L22:
        if (this.tp == false) goto L28;
        abcd.dG[] r15 = new abcd.qG(this.j6).VH(r3).rN();     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        int r16 = 0;
    L25:
        if (r16 >= r15.length) goto L29;
        java.util.List<abcd.yE> r17 = this.we;     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        abcd.dG r18 = r15[r16];     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        r18.getId();     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        r17.add(0, r18);     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        r16 = r16 + 1;     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        goto L25
    L28:
        this.we.add(0, r3);     // Catch: java.io.IOException -> L84 abcd.zD -> L87
        goto L29
    L83:
        throw new abcd.VB(org.eclipse.jgit.JGitText.j6().commitOnRepoWithoutHEADCurrentlyNotSupported);     // Catch: java.io.IOException -> L84 abcd.zD -> L87
    L90:
        throw new abcd.aC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().cannotCommitOnARepoWithState, new java.lang.Object[]{r1.name()}));
    }

    public java.lang.Object m16call() {
        return call();
    }

    public abcd.ZA j6(abcd.KE r1) {
        j6();
        this.Hw = r1;
        return this;
    }

    public abcd.ZA j6(java.lang.String r1) {
        j6();
        this.Zo = r1;
        return this;
    }
}
