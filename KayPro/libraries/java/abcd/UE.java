package abcd;

public abstract class UE {
    private static final abcd.HD j6 = null;
    private final java.util.concurrent.atomic.AtomicInteger DW;
    private final java.io.File FH;
    private final abcd.AbstractpK Hw;
    private final java.io.File VH;
    private final java.io.File Zo;
    private final abcd.HD v5;

    static {
        j6 = new abcd.HD();
    }

    protected UE(abcd.bE r3) {
        this.DW = new java.util.concurrent.atomic.AtomicInteger(1);
        this.v5 = new abcd.HD();
        this.FH = r3.v5();
        this.Hw = r3.Hw();
        this.Zo = r3.gn();
        this.VH = r3.Zo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [abcd.YD] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    private abcd.yE DW(abcd.qG r13, java.lang.String r14) {
        char[] r0 = r14.toCharArray();
        abcd.AbstractiG r4 = null;
        int r3 = 0;
    L4:
        if (r3 >= r0.length) goto L5;
        char r5 = r0[r3];
        if (r5 == ':') goto L139;
        if (r5 != '@') goto L14;
        int r6 = r3 + 2;
        int r7 = r6;
    L124:
        if (r7 >= r0.length) goto L125;
        if (r0[r7] == '}') goto L128;
        r7 = r7 + 1;
        goto L124
    L128:
        java.lang.String r8 = new java.lang.String(r0, r6, (r7 - r3) - 2);
    L129:
        if (r8 == null) goto L136;
        abcd.ME r9 = we().j6(new java.lang.String(r0, 0, r3));
        if (r9 == null) goto L132;
        abcd.AbstractiG r10 = j6(r13, r9, r8);
    L134:
        r4 = r10;
    L135:
        r3 = r7;
    L137:
        r3 = r3 + 1;
        goto L4
    L132:
        return null;
    L136:
        r3 = r7 - 1;
        goto L137
    L125:
        r8 = null;
        goto L129
    L14:
        if (r5 != '^') goto L16;
        if (r4 != null) goto L54;
        r4 = j6(r13, new java.lang.String(r0, 0, r3));
        if (r4 != null) goto L54;
        return null;
    L54:
        int r11 = r3 + 1;
        if (r11 >= r0.length) goto L114;
        char r12 = r0[r11];
        if (r12 == '{') goto L85;
        switch(r12) {
            case 48: goto L67;
            case 49: goto L67;
            case 50: goto L67;
            case 51: goto L67;
            case 52: goto L67;
            case 53: goto L67;
            case 54: goto L67;
            case 55: goto L67;
            case 56: goto L67;
            case 57: goto L67;
            default: goto L59;
        };
    L59:
        abcd.AbstractiG r15 = r13.Zo(r4);
        if ((r15 instanceof abcd.dG) == false) goto L66;
        abcd.dG r16 = (abcd.dG) r15;
        if (r16.lg() == 0) goto L118;
        r4 = r16.DW(0);
    L118:
        r4 = null;
        goto L137
    L66:
        throw new abcd.ZC(r15, "commit");
    L67:
        abcd.dG r17 = r13.VH(r4);
        int r18 = r11;
    L69:
        if (r18 >= r0.length) goto L161;
        if (java.lang.Character.isDigit(r0[r18]) == false) goto L161;
        r18 = r18 + 1;
    L161:
        int r19 = java.lang.Integer.parseInt(new java.lang.String(r0, r11, (r18 - r3) - 1));     // Catch: java.lang.NumberFormatException -> L82
        if (r19 != 0) goto L77;
        abcd.dG r20 = r17;
    L81:
        int r21 = r18 - 1;
        r4 = r20;
        r3 = r21;
        goto L137
    L77:
        if (r19 <= r17.lg()) goto L79;
        r20 = null;
        goto L81
    L79:
        r20 = r17.DW(r19 - 1);
    L83:
        throw new abcd.rD(org.eclipse.jgit.JGitText.j6().invalidCommitParentNumber, r14);
    L85:
        int r22 = r3 + 2;
        r7 = r22;
    L87:
        if (r7 >= r0.length) goto L88;
        if (r0[r7] == '}') goto L91;
        r7 = r7 + 1;
        goto L87
    L91:
        java.lang.String r23 = new java.lang.String(r0, r22, (r7 - r3) - 2);
    L92:
        if (r23 == null) goto L112;
        if (r23.equals("tree") == false) goto L97;
        r10 = r13.gn(r4);
        goto L134
    L97:
        if (r23.equals("commit") == false) goto L100;
        r10 = r13.VH(r4);
        goto L134
    L100:
        if (r23.equals("blob") == false) goto L107;
        r4 = r13.FH(r4);
        if ((r4 instanceof abcd.cG) == true) goto L135;
        throw new abcd.ZC(r4, "blob");
    L107:
        if (r23.equals("") == false) goto L110;
        r10 = r13.FH(r4);
        goto L134
    L110:
        throw new abcd.rD(r14);
    L112:
        throw new abcd.rD(r14);
    L88:
        r23 = null;
        goto L92
    L114:
        abcd.AbstractiG r24 = r13.FH(r4);
        if ((r24 instanceof abcd.dG) == false) goto L121;
        abcd.dG r25 = (abcd.dG) r24;
        if (r25.lg() == 0) goto L118;
        r4 = r25.DW(0);
        goto L137
    L121:
        throw new abcd.ZC(r24, "commit");
    L16:
        if (r5 == '~') goto L21;
        if (r4 == null) goto L137;
        throw new abcd.rD(r14);
    L21:
        if (r4 != null) goto L25;
        r4 = j6(r13, new java.lang.String(r0, 0, r3));
        if (r4 != null) goto L25;
        return null;
    L25:
        r4 = r13.FH(r4);
        if ((r4 instanceof abcd.dG) == false) goto L49;
        int r26 = r3 + 1;
        r7 = r26;
    L29:
        if (r7 >= r0.length) goto L33;
        if (java.lang.Character.isDigit(r0[r7]) == false) goto L33;
        r7 = r7 + 1;
    L33:
        int r27 = r7 - r3;
        if (r27 > 1) goto L157;
        int r28 = 1;
    L41:
        if (r28 <= 0) goto L136;
        abcd.dG r29 = (abcd.dG) r4;
        if (r29.lg() == 0) goto L45;
        r4 = r29.DW(0);
        r13.DW(r4);
        r28 = r28 - 1;
        goto L41
    L45:
        r4 = null;
        goto L136
    L157:
        r28 = java.lang.Integer.parseInt(new java.lang.String(r0, r26, r27 - 1));     // Catch: java.lang.NumberFormatException -> L38
    L39:
        throw new abcd.rD(org.eclipse.jgit.JGitText.j6().invalidAncestryLength, r14);
    L49:
        throw new abcd.ZC(r4, "commit");
    L139:
        if (r4 == null) goto L159;
        abcd.mG r110 = r13.gn(r4);
    L150:
        if (r3 == (r0.length - 1)) goto L152;
        abcd.YJ r111 = abcd.YJ.j6(r13.Zo(), new java.lang.String(r0, r3 + 1, (r0.length - r3) - 1), new abcd.YD[]{r110});
        if (r111 != null) goto L156;
        return null;
    L156:
        return r111.DW(0);
    L152:
        return r110.Hw();
    L159:
        if (r3 != 0) goto L142;
        r14 = DW(r13, "HEAD");     // Catch: abcd.rD -> L146
    L143:
        if (r14 != 0) goto L145;
        return null;
    L145:
        r110 = r13.gn(r14);
        goto L150
    L142:
        r14 = DW(r13, new java.lang.String(r0, 0, r3));     // Catch: abcd.rD -> L146
    L147:
        throw new abcd.rD(r14);
    L5:
        if (r4 == null) goto L8;
        return r4.Hw();
    L8:
        return u7(r14);
    }

    public static boolean DW(java.lang.String r9) {
        int r0 = r9.length();
        if (r0 != 0) goto L6;
        return false;
    L6:
        if (r9.endsWith(".lock") == false) goto L8;
        return false;
    L8:
        int r3 = 0;
        int r4 = 1;
        char r5 = 0;
    L9:
        if (r3 >= r0) goto L10;
        char r6 = r9.charAt(r3);
        if (r6 <= ' ') goto L15;
        if (r6 == '*') goto L52;
        if (r6 == ':') goto L52;
        if (r6 == '?') goto L52;
        if (r6 == '^') goto L52;
        if (r6 == '{') goto L49;
        if (r6 == '~') goto L52;
        if (r6 == '.') goto L42;
        if (r6 != '/') goto L32;
        if (r3 == 0) goto L41;
        if (r3 == (r0 - 1)) goto L41;
        r4 = r4 + 1;
    L51:
        r3 = r3 + 1;
        r5 = r6;
    L41:
        return false;
    L32:
        if (r6 == '[') goto L52;
        if (r6 == '\\') goto L52;
    L42:
        if (r5 == 0) goto L47;
        if (r5 == '.') goto L47;
        if (r5 == '/') goto L47;
        if (r3 != (r0 - 1)) goto L51;
    L47:
        return false;
    L49:
        if (r5 != '@') goto L51;
        return false;
    L52:
        return false;
    L15:
        return false;
    L10:
        if (r4 <= 1) goto L12;
        return true;
    L12:
        return false;
    }

    public static java.lang.String Hw(java.lang.String r1) {
        if (r1.startsWith("refs/heads/") == false) goto L7;
        return r1.substring(11);
    L7:
        if (r1.startsWith("refs/tags/") == false) goto L11;
        return r1.substring(10);
    L11:
        if (r1.startsWith("refs/remotes/") == true) goto L13;
        return r1;
    L13:
        return r1.substring(13);
    }

    private byte[] VH(java.lang.String r3) {
        byte[] r0 = abcd.BK.j6(new java.io.File(VH(), r3));     // Catch: java.io.FileNotFoundException -> L7
        if (r0.length > 0) goto L6;
        return null;
    L6:
        return r0;
    L11:
        return null;
    }

    private abcd.yE gn(java.lang.String r5) {
        abcd.WD r6 = abcd.WD.j6(r5);
        abcd.IE r0 = j3();
        java.util.Collection<abcd.yE> r1 = r0.j6(r6);     // Catch: java.lang.Throwable -> L14
        if (r1.size() != 0) goto L8;
        r0.FH();
        return null;
    L8:
        if (r1.size() != 1) goto L13;
        abcd.yE r7 = r1.iterator().next();     // Catch: java.lang.Throwable -> L14
        r0.FH();
        return r7;
    L13:
        throw new abcd.UC(r6, r1);     // Catch: java.lang.Throwable -> L14
    L14:
        th = move-exception;
        r0.FH();
        throw th;
    }

    private abcd.dG j6(abcd.qG r5, abcd.ME r6, java.lang.String r7) {
        int r2 = java.lang.Integer.parseInt(r7);     // Catch: java.lang.NumberFormatException -> L13
        if (r2 < 0) goto L12;
        abcd.pH r8 = new abcd.qH(this, r6.getName()).j6(r2);
        if (r8 == null) goto L10;
        return r5.VH(r8.DW());
    L10:
        throw new abcd.rD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().reflogEntryNotFound, new java.lang.Object[]{java.lang.Integer.valueOf(r2), r6.getName()}));
    L12:
        throw new abcd.rD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidReflogRevision, new java.lang.Object[]{r7}));
    L14:
        throw new abcd.rD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidReflogRevision, new java.lang.Object[]{r7}));
    }

    private abcd.AbstractiG j6(abcd.qG r1, java.lang.String r2) {
        abcd.yE r3 = u7(r2);
        if (r3 != null) goto L7;
        return null;
    L7:
        return r1.Zo(r3);
    }

    private void j6(java.util.List<abcd.yE> r3, java.lang.String r4) {
        java.io.File r0 = new java.io.File(VH(), r4);
        if (r3 == null) goto L14;
        abcd.XK r5 = new abcd.XK(new java.io.FileOutputStream(r0));
        java.util.Iterator<abcd.yE> r6 = r3.iterator();     // Catch: java.lang.Throwable -> L11
    L7:
        if (r6.hasNext() == false) goto L8;
        r6.next().DW(r5);     // Catch: java.lang.Throwable -> L11
        r5.write(10);     // Catch: java.lang.Throwable -> L11
        goto L7
    L8:
        r5.close();
        return;
    L11:
        th = move-exception;
        r5.close();
        throw th;
    L14:
        abcd.zK.j6(r0, 4);
    }

    private static boolean j6(char r1) {
        if ('0' > r1) goto L7;
        if (r1 > '9') goto L7;
        return true;
    L7:
        if ('a' > r1) goto L11;
        if (r1 > 'f') goto L11;
        return true;
    L11:
        if ('A' <= r1) goto L13;
        return false;
    L13:
        if (r1 > 'F') goto L21;
        return true;
    L21:
        return false;
    }

    private static boolean j6(java.lang.String r1, int r2) {
    L3:
        if (r2 >= r1.length()) goto L4;
        int r0 = r2 + 1;
        if (j6(r1.charAt(r2)) == false) goto L8;
        r2 = r0;
        goto L3
    L8:
        return false;
    L4:
        return true;
    }

    private abcd.yE u7(java.lang.String r4) {
        if (abcd.yE.DW(r4) == true) goto L5;
        abcd.ME r0 = we().j6(r4);
        if (r0 == null) goto L11;
        return r0.DW();
    L11:
        if (abcd.WD.DW(r4) == true) goto L13;
        int r1 = r4.indexOf("-g");
        if ((r1 + 5) >= r4.length()) goto L27;
        if (r1 < 0) goto L29;
        int r2 = r1 + 2;
        if (j6(r4.charAt(r2)) == true) goto L20;
        return null;
    L20:
        if (j6(r4.charAt(r1 + 3)) == true) goto L22;
        return null;
    L22:
        if (j6(r4, r1 + 4) == false) goto L32;
        java.lang.String r5 = r4.substring(r2);
        if (abcd.WD.DW(r5) == true) goto L26;
        return null;
    L26:
        return gn(r5);
    L32:
        return null;
    L29:
        return null;
    L27:
        return null;
    L13:
        return gn(r4);
    L5:
        return abcd.yE.j6(r4);
    }

    public void DW() {
        j6(false);
    }

    public abstract abcd.AbstractxE EQ();

    public abcd.yE FH(java.lang.String r2) {
        abcd.qG r0 = new abcd.qG(this);
        abcd.yE r3 = DW(r0, r2);     // Catch: java.lang.Throwable -> L6
        r0.EQ();
        return r3;
    L6:
        th = move-exception;
        r0.EQ();
        throw th;
    }

    protected void FH() {
        EQ().j6();
        we().j6();
    }

    public java.util.Set<abcd.yE> Hw() {
        return java.util.Collections.emptySet();
    }

    public abcd.EnumiF J0() {
        if (QX() == true) goto L58;
        if (VH() == null) goto L58;
        if (new java.io.File(J8(), ".dotest").exists() == false) goto L12;
        return abcd.EnumiF.VH;
    L12:
        if (new java.io.File(VH(), ".dotest-merge").exists() == false) goto L16;
        return abcd.EnumiF.EQ;
    L16:
        if (new java.io.File(VH(), "rebase-apply/rebasing").exists() == false) goto L20;
        return abcd.EnumiF.gn;
    L20:
        if (new java.io.File(VH(), "rebase-apply/applying").exists() == false) goto L24;
        return abcd.EnumiF.u7;
    L24:
        if (new java.io.File(VH(), "rebase-apply").exists() == false) goto L28;
        return abcd.EnumiF.VH;
    L28:
        if (new java.io.File(VH(), "rebase-merge/interactive").exists() == false) goto L32;
        return abcd.EnumiF.EQ;
    L32:
        if (new java.io.File(VH(), "rebase-merge").exists() == false) goto L36;
        return abcd.EnumiF.tp;
    L36:
        if (new java.io.File(VH(), "MERGE_HEAD").exists() == false) goto L44;
        if (U2().Zo() == true) goto L42;
        return abcd.EnumiF.Hw;
    L42:
        return abcd.EnumiF.FH;
    L44:
        if (new java.io.File(VH(), "BISECT_LOG").exists() == false) goto L48;
        return abcd.EnumiF.we;
    L48:
        if (new java.io.File(VH(), "CHERRY_PICK_HEAD").exists() == false) goto L56;
        if (U2().Zo() == true) goto L54;
        return abcd.EnumiF.Zo;
    L54:
        return abcd.EnumiF.v5;
    L56:
        return abcd.EnumiF.DW;
    L58:
        return abcd.EnumiF.j6;
    }

    public java.io.File J8() {
        if (QX() == true) goto L7;
        return this.Zo;
    L7:
        throw new abcd.iD();
    }

    public abstract void Mr();

    public boolean QX() {
        if (this.Zo != null) goto L6;
        return true;
    L6:
        return false;
    }

    public abcd.KC U2() {
        return abcd.KC.DW(tp(), gn());
    }

    public java.io.File VH() {
        return this.FH;
    }

    public void Ws() {
        this.DW.incrementAndGet();
    }

    public abcd.KC XL() {
        abcd.TE r0 = new abcd.TE(this);
        return abcd.KC.j6(tp(), gn(), r0);
    }

    public abstract abcd.AbstractjF Zo();

    public void Zo(java.lang.String r4) {
        java.io.File r0 = new java.io.File(this.FH, "MERGE_MSG");
        if (r4 == null) goto L10;
        java.io.FileOutputStream r1 = new java.io.FileOutputStream(r0);
        r1.write(r4.getBytes("UTF-8"));     // Catch: java.lang.Throwable -> L7
        r1.close();
        return;
    L7:
        th = move-exception;
        r1.close();
        throw th;
    L10:
        abcd.zK.j6(r0, 4);
    }

    public java.lang.String a8() {
        if (QX() == true) goto L12;
        if (VH() == null) goto L12;
        return abcd.IK.j6(abcd.BK.j6(new java.io.File(VH(), "MERGE_MSG")));
    L9:
        return null;
    L12:
        throw new abcd.iD();
    }

    public abcd.EE aM() {
        return EQ().Hw();
    }

    public abcd.AbstractpK gn() {
        return this.Hw;
    }

    public abcd.IE j3() {
        return EQ().v5();
    }

    public abcd.FE j6(abcd.YD r2, int r3) {
        return EQ().j6(r2, r3);
    }

    public abcd.ME j6(abcd.ME r2) {
        return we().j6(r2);
    L7:
        return r2;
    }

    public abcd.ME j6(java.lang.String r2) {
        return we().j6(r2);
    }

    public abcd.RE j6(java.lang.String r2, boolean r3) {
        return we().j6(r2, r3);
    }

    public void j6() {
        if (this.DW.decrementAndGet() != 0) goto L6;
        FH();
        return;
    }

    public void j6(KD<?> r2) {
        r2.j6(this);
        this.v5.j6(r2);
        j6.j6(r2);
    }

    public void j6(abcd.yE r2) {
        if (r2 == null) goto L4;
        java.util.List<abcd.yE> r3 = java.util.Collections.singletonList(r2);
    L5:
        j6(r3, "CHERRY_PICK_HEAD");
        return;
    L4:
        r3 = null;
        goto L5
    }

    public void j6(java.util.List<abcd.yE> r2) {
        j6(r2, "MERGE_HEAD");
    }

    public abstract void j6(boolean r1);

    public boolean j6(abcd.YD r2) {
        return EQ().j6(r2);
    L4:
        return false;
    }

    public java.util.List<abcd.yE> lg() {
        if (QX() == true) goto L16;
        if (VH() == null) goto L16;
        byte[] r0 = VH("MERGE_HEAD");
        if (r0 != null) goto L10;
        return null;
    L10:
        java.util.LinkedList r1 = new java.util.LinkedList();
        int r2 = 0;
    L12:
        if (r2 >= r0.length) goto L13;
        r1.add(abcd.yE.v5(r0, r2));
        r2 = abcd.IK.Zo(r0, r2 + 40);
        goto L12
    L13:
        return r1;
    L16:
        throw new abcd.iD();
    }

    public java.lang.String toString() {
        if (VH() == null) goto L5;
        java.lang.String r0 = VH().getPath();
    L7:
        return "Repository[" + r0 + "]";
    L5:
        r0 = java.lang.String.valueOf(getClass().getSimpleName()) + "-" + java.lang.System.identityHashCode(this);
        goto L7
    }

    public java.io.File tp() {
        if (QX() == true) goto L7;
        return this.VH;
    L7:
        throw new abcd.iD();
    }

    public java.lang.String u7() {
        abcd.ME r0 = j6("HEAD");
        if (r0 != null) goto L6;
        return null;
    L6:
        if (r0.Zo() == false) goto L10;
        return r0.getTarget().getName();
    L10:
        if (r0.DW() != null) goto L12;
        return null;
    L12:
        return r0.DW().we();
    }

    public abcd.RE v5(java.lang.String r2) {
        return j6(r2, false);
    }

    public java.util.Map<java.lang.String, abcd.ME> v5() {
        return we().DW("");
    L5:
        return new java.util.HashMap();
    }

    public abstract abcd.OE we();
}
