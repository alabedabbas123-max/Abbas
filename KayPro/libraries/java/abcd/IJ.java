package abcd;

public class IJ {
    private static int[] DW;
    private static int[] j6;
    private final abcd.fG BT;
    private abcd.DI EQ;
    private final abcd.UE FH;
    private final abcd.qG Hw;
    private java.util.Map<java.lang.String, abcd.ME> J0;
    private abcd.VI J8;
    private boolean KD;
    private final java.util.Set<abcd.yE> Mr;
    private final abcd.fG P8;
    private final java.util.Set<java.lang.String> QX;
    private abcd.AbstracteI.c SI;
    private final java.util.List<abcd.yE> U2;
    private boolean VH;
    private abcd.KI Ws;
    private final java.util.Set<abcd.yE> XL;
    private int Zo;
    private int a8;
    private final java.util.Set<abcd.AbstractiG> aM;
    private abcd.LJ cn;
    private final abcd.hG ei;
    private boolean er;
    private final abcd.fG gW;
    private abcd.VK gn;
    private final java.util.Set<abcd.AbstractiG> j3;
    private int lg;
    private abcd.IJ.a nw;
    private java.lang.Boolean rN;
    private abcd.TH.c ro;
    private java.io.OutputStream tp;
    private java.io.InputStream u7;
    private abcd.NH v5;
    private final abcd.fG vy;
    private abcd.EI we;
    private java.util.Set<abcd.yE> yS;

    public static final enum a extends java.lang.Enum<abcd.IJ.a> {
        public static final abcd.IJ.a DW = null;
        public static final abcd.IJ.a FH = null;
        private static final abcd.IJ.a[] Hw = null;
        public static final abcd.IJ.a j6 = null;

        static {
            j6 = new abcd.IJ.a("ADVERTISED", 0);
            DW = new abcd.IJ.a("REACHABLE_COMMIT", 1);
            FH = new abcd.IJ.a("ANY", 2);
            Hw = new abcd.IJ.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.IJ.a valueOf(java.lang.String r1) {
            return (abcd.IJ.a) java.lang.Enum.valueOf(abcd.IJ.a.class, r1);
        }

        public static abcd.IJ.a[] values() {
            abcd.IJ.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.IJ.a[] r2 = new abcd.IJ.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public IJ(abcd.UE r2) {
        this.VH = true;
        this.Ws = abcd.KI.j6;
        this.QX = new java.util.HashSet();
        this.XL = new java.util.HashSet();
        this.aM = new java.util.HashSet();
        this.j3 = new java.util.HashSet();
        this.Mr = new java.util.HashSet();
        this.U2 = new java.util.ArrayList();
        this.nw = abcd.IJ.a.j6;
        this.SI = abcd.AbstracteI.c.j6;
        this.cn = abcd.LJ.j6;
        this.FH = r2;
        this.Hw = new abcd.qG(this.FH);
        this.Hw.j6(false);
        this.gW = this.Hw.j6("WANT");
        this.BT = this.Hw.j6("PEER_HAS");
        this.vy = this.Hw.j6("COMMON");
        this.P8 = this.Hw.j6("SATISFIED");
        this.Hw.j6(this.BT);
        this.ei = new abcd.hG();
        this.ei.j6(this.gW);
        this.ei.j6(this.BT);
        this.ei.j6(this.vy);
        this.ei.j6(this.P8);
        this.J8 = abcd.VI.j6;
    }

    private boolean DW(abcd.AbstractiG r8) {
        if (r8.DW(this.P8) == false) goto L5;
        return true;
    L5:
        this.Hw.j6(this.ei);
        this.Hw.DW((abcd.dG) r8);
        int r0 = this.lg;
        if (r0 == 0) goto L8;
        this.Hw.j6(abcd.AbstractwG.j6(((long) r0) * 1000));
    L8:
        abcd.dG r1 = this.Hw.tp();
        if (r1 == null) goto L10;
        if (r1.DW(this.BT) == false) goto L8;
        j6(r1);
        r8.j6(this.P8);
        return true;
    L10:
        return false;
    }

    static int[] DW() {
        int[] r0 = DW;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.IJ.a.values().length];
        r1[abcd.IJ.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L11
    L14:
        r1[abcd.IJ.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L12
    L18:
        r1[abcd.IJ.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L13
    L9:
        DW = r1;
        return r1;
    }

    private void EQ() {
        if (this.VH == false) goto L6;
        j6(new abcd.TI.a(this.we));
    L47:
        gn();     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
        if (this.XL.isEmpty() == false) goto L16;
        this.Ws.j6(this, this.XL, 0);     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
        this.Ws.j6(this, this.XL, 0, 0, false);     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
        return;
    L16:
        if (this.QX.contains("multi_ack_detailed") == false) goto L19;
        this.SI = abcd.AbstracteI.c.FH;     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
        this.KD = this.QX.contains("no-done");     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
    L23:
        if (this.a8 == 0) goto L26;
        VH();     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
    L26:
        if (Hw() == false) goto L52;
        tp();
        return;
    L52:
        return;
    L19:
        if (this.QX.contains("multi_ack") == false) goto L21;
        this.SI = abcd.AbstracteI.c.DW;     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
        goto L23
    L21:
        this.SI = abcd.AbstracteI.c.j6;     // Catch: java.lang.Error -> L29 java.lang.RuntimeException -> L32 java.io.IOException -> L35 abcd.MJ -> L38 abcd.nD -> L41
    L38:
        e = move-exception;
        e.j6();
        throw null;
    L41:
        e = move-exception;
        j6(e.getMessage());
        throw e;
    L35:
        e = move-exception;
        j6(org.eclipse.jgit.JGitText.j6().internalServerError);
        throw e;
    L29:
        e = move-exception;
        j6(org.eclipse.jgit.JGitText.j6().internalServerError);
        throw e;
    L32:
        e = move-exception;
        j6(org.eclipse.jgit.JGitText.j6().internalServerError);
        throw e;
    L6:
        if (this.nw != abcd.IJ.a.FH) goto L8;
        this.yS = java.util.Collections.emptySet();
        goto L47
    L8:
        this.yS = new java.util.HashSet();
        java.util.Iterator<abcd.ME> r0 = FH().values().iterator();
    L10:
        if (r0.hasNext() == false) goto L47;
        abcd.ME r1 = r0.next();
        if (r1.DW() == null) goto L10;
        this.yS.add(r1.DW());
        goto L10
    }

    private boolean Hw() {
        this.rN = java.lang.Boolean.FALSE;
        abcd.yE r0 = abcd.yE.Ws();
        java.util.ArrayList r1 = new java.util.ArrayList(64);
    L47:
        java.lang.String r3 = this.EQ.DW();     // Catch: java.io.EOFException -> L38
        if (r3 == abcd.DI.j6) goto L7;
        if (r3.startsWith("have ") == false) goto L28;
        if (r3.length() != 45) goto L28;
        r1.add(abcd.yE.j6(r3.substring(5)));
    L28:
        if (r3.equals("done") == false) goto L37;
        abcd.yE r2 = j6(r1, r0);
        if (this.j3.isEmpty() == false) goto L33;
        this.we.j6("NAK\n");
    L35:
        return true;
    L33:
        if (this.SI == abcd.AbstracteI.c.j6) goto L35;
        this.we.j6("ACK " + r2.we() + "\n");
        goto L35
    L37:
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedGot, new java.lang.Object[]{"have", r3}));
    L7:
        r0 = j6(r1, r0);
        if (this.j3.isEmpty() == false) goto L10;
    L11:
        this.we.j6("NAK\n");
    L13:
        if (this.KD == false) goto L19;
        if (this.er == false) goto L19;
        this.we.j6("ACK " + r0.we() + "\n");
        return true;
    L19:
        if (this.VH == false) goto L20;
        this.we.DW();
        goto L47
    L20:
        return false;
    L10:
        if (this.SI == abcd.AbstracteI.c.j6) goto L13;
    L38:
        e = move-exception;
        if (this.VH == false) goto L42;
    L45:
        throw e;
    L42:
        if (this.a8 <= 0) goto L45;
        return false;
    }

    private void VH() {
        abcd.TF.c r0 = new abcd.TF.c(this.Hw.Zo(), this.a8);
        java.util.Iterator<abcd.yE> r1 = this.XL.iterator();
    L4:
        if (r1.hasNext() == false) goto L5;
        r0.Hw(r0.VH(r1.next()));     // Catch: abcd.ZC -> L22
    L5:
        abcd.dG r2 = r0.tp();
        if (r2 == null) goto L7;
        abcd.TF.a r3 = (abcd.TF.a) r2;
        if (r3.BT() != this.a8) goto L15;
        if (this.Mr.contains(r3) == true) goto L15;
        this.we.j6("shallow " + r2.we());
    L15:
        if (r3.BT() >= this.a8) goto L5;
        if (this.Mr.contains(r3) == false) goto L5;
        this.U2.add(r3.Hw());
        this.we.j6("unshallow " + r3.we());
        goto L5
    L7:
        this.we.j6();
    }

    private boolean Zo() {
        if (this.j3.isEmpty() == false) goto L17;
        return false;
    L17:
        java.util.Iterator<abcd.AbstractiG> r0 = this.aM.iterator();     // Catch: java.io.IOException -> L13
    L7:
        if (r0.hasNext() == false) goto L8;
        if (DW(r0.next()) == true) goto L7;
        return false;
    L8:
        return true;
    L13:
        e = move-exception;
        throw new abcd.nD(org.eclipse.jgit.JGitText.j6().internalRevisionError, e);
    }

    private void gn() {
        boolean r2 = true;
    L36:
        java.lang.String r3 = this.EQ.DW();     // Catch: java.io.EOFException -> L30
        if (r3 == abcd.DI.j6) goto L50;
        if (r3.startsWith("deepen ") == true) goto L9;
        if (r3.startsWith("shallow ") == true) goto L12;
        if (r3.startsWith("want ") == false) goto L29;
        if (r3.length() < 45) goto L29;
        if (r2 == true) goto L19;
    L27:
        this.XL.add(abcd.yE.j6(r3.substring(5)));
        r2 = false;
        goto L36
    L19:
        if (r3.length() <= 45) goto L27;
        java.lang.String r4 = r3.substring(45);
        if (r4.startsWith(" ") == false) goto L23;
        r4 = r4.substring(1);
    L23:
        java.lang.String[] r5 = r4.split(" ");
        int r6 = r5.length;
        int r7 = 0;
    L24:
        if (r7 >= r6) goto L25;
        this.QX.add(r5[r7]);
        r7 = r7 + 1;
        goto L24
    L25:
        r3 = r3.substring(0, 45);
    L29:
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedGot, new java.lang.Object[]{"want", r3}));
    L12:
        this.Mr.add(abcd.yE.j6(r3.substring(8)));
        goto L36
    L9:
        this.a8 = java.lang.Integer.parseInt(r3.substring(7));
        goto L36
    L50:
        return;
    L30:
        e = move-exception;
        if (r2 == false) goto L34;
        return;
    L34:
        throw e;
    }

    private abcd.yE j6(java.util.List<abcd.yE> r14, abcd.yE r15) {
        this.Ws.j6(this, this.XL, r14.size());
        if (r14.isEmpty() == false) goto L5;
        return r15;
    L5:
        boolean r0 = false;
        this.er = false;
        java.util.HashSet r2 = null;
        if (this.aM.isEmpty() == true) goto L8;
    L10:
        java.util.List r5 = r14;
        java.util.HashSet r4 = null;
        boolean r1 = false;
    L11:
        abcd.MF r3 = this.Hw.j6(r5, r1);
        int r8 = 0;
    L112:
        abcd.AbstractiG r6 = r3.next();     // Catch: java.lang.Throwable -> L101 abcd.fD -> L103
    L14:
        if (r6 == null) goto L15;
        if (this.XL.remove(r6) == false) goto L77;
        if (this.yS.contains(r6) == true) goto L62;
        if (this.nw == abcd.IJ.a.FH) goto L62;
        if (r2 != null) goto L60;
        r2 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L101
    L60:
        r2.add(r6);     // Catch: java.lang.Throwable -> L101
    L62:
        if (r6.DW(this.gW) == true) goto L65;
        r6.j6(this.gW);     // Catch: java.lang.Throwable -> L101
        this.aM.add(r6);     // Catch: java.lang.Throwable -> L101
    L65:
        if ((r6 instanceof abcd.dG) == true) goto L68;
        r6.j6(this.P8);     // Catch: java.lang.Throwable -> L101
    L68:
        if ((r6 instanceof abcd.lG) == false) goto L75;
        abcd.AbstractiG r11 = this.Hw.FH(r6);     // Catch: java.lang.Throwable -> L101
        if ((r11 instanceof abcd.dG) == false) goto L75;
        if (r11.DW(this.gW) == true) goto L75;
        r11.j6(this.gW);     // Catch: java.lang.Throwable -> L101
        this.aM.add(r11);     // Catch: java.lang.Throwable -> L101
    L75:
        if (r4.contains(r6) == false) goto L112;
    L77:
        r8 = r8 + 1;     // Catch: java.lang.Throwable -> L101
        if ((r6 instanceof abcd.dG) == false) goto L85;
        abcd.dG r16 = (abcd.dG) r6;     // Catch: java.lang.Throwable -> L101
        if (this.lg != 0) goto L82;
    L83:
        this.lg = r16.U2();     // Catch: java.lang.Throwable -> L101
        goto L85
    L82:
        if (r16.U2() < this.lg) goto L83;
    L85:
        if (r6.DW(this.BT) == true) goto L100;
        r6.j6(this.BT);     // Catch: java.lang.Throwable -> L101
        if ((r6 instanceof abcd.dG) == false) goto L90;
        ((abcd.dG) r6).FH(this.BT);     // Catch: java.lang.Throwable -> L101
    L90:
        j6(r6);     // Catch: java.lang.Throwable -> L101
        int r17 = j6()[this.SI.ordinal()];     // Catch: java.lang.Throwable -> L101
        if (r17 == 1) goto L98;
        if (r17 == 2) goto L96;
        if (r17 != 3) goto L100;
        this.we.j6("ACK " + r6.we() + " common\n");     // Catch: java.lang.Throwable -> L101
        goto L100
    L96:
        this.we.j6("ACK " + r6.we() + " continue\n");     // Catch: java.lang.Throwable -> L101
        goto L100
    L98:
        if (this.j3.size() != 1) goto L100;
        this.we.j6("ACK " + r6.we() + "\n");     // Catch: java.lang.Throwable -> L101
    L100:
        r15 = r6;
        goto L112
    L15:
        r3.j6();
        if (r2 != null) goto L18;
    L26:
        int r7 = r14.size() - r8;
        if (r7 <= 0) goto L45;
        int r9 = r14.size() - 1;
    L29:
        if (r9 < 0) goto L45;
        abcd.yE r10 = r14.get(r9);
        if (this.Hw.Hw(r10) == null) goto L34;
        r9 = r9 - 1;
        goto L29
    L34:
        if (v5() == false) goto L42;
        int r12 = j6()[this.SI.ordinal()];
        if (r12 == 1) goto L42;
        if (r12 == 2) goto L41;
        if (r12 != 3) goto L42;
        this.we.j6("ACK " + r10.we() + " ready\n");
        this.er = true;
        goto L42
    L41:
        this.we.j6("ACK " + r10.we() + " continue\n");
    L42:
        r0 = true;
    L45:
        if (this.SI != abcd.AbstracteI.c.FH) goto L50;
        if (r0 == true) goto L50;
        if (v5() == false) goto L50;
        abcd.yE r13 = r14.get(r14.size() - 1);
        this.er = true;
        this.we.j6("ACK " + r13.we() + " ready\n");
        this.er = true;
    L50:
        this.Ws.j6(this, this.aM, r8, r7, this.er);
        r14.clear();
        return r15;
    L18:
        if (r2.isEmpty() == true) goto L26;
        int r18 = DW()[this.nw.ordinal()];
        if (r18 == 2) goto L25;
        if (r18 == 3) goto L26;
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r2.iterator().next().we()}));
    L25:
        j6(r2);
    L103:
        e = move-exception;
        abcd.yE r19 = e.j6();     // Catch: java.lang.Throwable -> L101
        if (this.XL.contains(r19) == false) goto L112;
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r19.we()}), e);     // Catch: java.lang.Throwable -> L101
    L101:
        th = move-exception;
        r3.j6();
        throw th;
    L8:
        if (this.XL.isEmpty() == true) goto L10;
        java.util.HashSet r20 = new java.util.HashSet(r14);
        r5 = new java.util.ArrayList(this.XL.size() + r20.size());
        r5.addAll(this.XL);
        r5.addAll(r20);
        r4 = r20;
        r1 = true;
        goto L11
    }

    private void j6(abcd.AbstractiG r2) {
        if (r2.DW(this.vy) == true) goto L6;
        r2.j6(this.vy);
        this.j3.add(r2);
        this.rN = null;
        return;
    }

    private void j6(java.lang.String r4) {
        this.we.j6("ERR " + r4 + "\n");     // Catch: java.lang.Throwable -> L4
        return;
    }

    private void j6(java.util.Set<abcd.AbstractiG> r6) {
        java.util.Iterator<abcd.AbstractiG> r0 = r6.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.AbstractiG r1 = r0.next();
        if ((r1 instanceof abcd.dG) == false) goto L22;
        this.Hw.DW((abcd.dG) r1);
        goto L4
    L22:
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r6.iterator().next().we()}));
    L5:
        java.util.Iterator<abcd.yE> r2 = this.yS.iterator();
    L7:
        if (r2.hasNext() == false) goto L8;
        this.Hw.FH(this.Hw.VH(r2.next()));     // Catch: abcd.ZC -> L17
        goto L7
    L8:
        abcd.dG r7 = this.Hw.tp();
        if (r7 != null) goto L13;
        this.Hw.we();
        return;
    L13:
        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r7.we()}));
    }

    private void j6(boolean r11) {
        abcd.LE r0 = abcd.vE.j6;
        java.io.OutputStream r1 = this.tp;
        if (r11 == false) goto L10;
        int r2 = 1000;
        if (this.QX.contains("side-band-64k") == false) goto L7;
        r2 = 65520;
    L7:
        java.io.OutputStream r4 = new abcd.aJ(1, r2, this.tp);
        if (this.QX.contains("no-progress") == true) goto L11;
        abcd.aJ r3 = new abcd.aJ(2, r2, this.tp);
        abcd.aJ r5 = r3;
        r0 = new abcd.bJ(r3);
    L97:
    L86:
        e = move-exception;
        if (r11 == true) goto L89;
    L93:
        throw e;
    L89:
        if (e.getMessage() == null) goto L93;
        e.DW();
        throw null;
    L13:
        if (this.aM.isEmpty() == false) goto L15;
        this.Ws.j6(this, this.XL, this.j3);     // Catch: abcd.MJ -> L86
    L16:
        abcd.NH r6 = this.v5;
        if (r6 != null) goto L19;
        r6 = new abcd.NH(this.FH);
    L19:
        abcd.TH r7 = new abcd.TH(r6, this.Hw.Zo());
        r7.v5(true);     // Catch: java.lang.Throwable -> L83
        r7.DW(true);     // Catch: java.lang.Throwable -> L83
        r7.j6(this.QX.contains("ofs-delta"));     // Catch: java.lang.Throwable -> L83
        r7.Hw(this.QX.contains("thin-pack"));     // Catch: java.lang.Throwable -> L83
        r7.FH(false);     // Catch: java.lang.Throwable -> L83
        if (this.j3.isEmpty() == false) goto L38;
        if (this.J0 == null) goto L38;
        java.util.HashSet r8 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L83
        java.util.Iterator<abcd.ME> r9 = this.J0.values().iterator();     // Catch: java.lang.Throwable -> L83
    L26:
        if (r9.hasNext() == false) goto L27;
        abcd.ME r10 = r9.next();     // Catch: java.lang.Throwable -> L83
        if (r10.FH() != null) goto L30;
        if (r10.DW() == null) goto L26;
        if (r10.getName().startsWith("refs/heads/") == false) goto L26;
        r8.add(r10.DW());     // Catch: java.lang.Throwable -> L83
        goto L26
    L30:
        r8.add(r10.FH());     // Catch: java.lang.Throwable -> L83
        goto L26
    L27:
        r7.j6(r8);     // Catch: java.lang.Throwable -> L83
    L38:
        if (this.a8 <= 0) goto L40;
        r7.j6(this.a8, this.U2);     // Catch: java.lang.Throwable -> L83
    L40:
        abcd.qG r12 = this.Hw;     // Catch: java.lang.Throwable -> L83
        if (this.aM.isEmpty() == false) goto L43;
        r7.j6(r0, this.XL, this.j3);     // Catch: java.lang.Throwable -> L83
        abcd.qG r13 = r12;
    L45:
        if (this.QX.contains("include-tag") == true) goto L47;
    L73:
        r7.j6(r0, abcd.vE.j6, r4);     // Catch: java.lang.Throwable -> L83
        this.ro = r7.v5();     // Catch: java.lang.Throwable -> L83
        if (r5 == null) goto L76;
        r5.write(abcd.hE.j6(java.lang.String.valueOf(r7.v5().j6()) + '\n'));     // Catch: java.lang.Throwable -> L83
        r5.flush();     // Catch: java.lang.Throwable -> L83
    L76:
        r7.VH();
        if (r11 == false) goto L79;
        this.we.j6();
    L79:
        abcd.TH.c r14 = this.ro;
        if (r14 == null) goto L128;
        this.cn.j6(r14);
        return;
    L128:
        return;
    L47:
        if (this.J0 == null) goto L73;
        java.util.Iterator<abcd.ME> r15 = this.J0.values().iterator();     // Catch: java.lang.Throwable -> L83
    L50:
        if (r15.hasNext() == false) goto L73;
        abcd.ME r16 = r15.next();     // Catch: java.lang.Throwable -> L83
        abcd.yE r17 = r16.DW();     // Catch: java.lang.Throwable -> L83
        if (this.aM.isEmpty() == true) goto L55;
        abcd.AbstractiG r18 = r13.Hw(r17);     // Catch: java.lang.Throwable -> L83
        if (r18 == null) goto L63;
        if (r18.DW(this.gW) == true) goto L50;
    L63:
        if (r16.Hw() == true) goto L65;
        r16 = this.FH.j6(r16);     // Catch: java.lang.Throwable -> L83
    L65:
        abcd.yE r19 = r16.FH();     // Catch: java.lang.Throwable -> L83
        if (r19 == null) goto L50;
        abcd.yE r20 = r16.DW();     // Catch: java.lang.Throwable -> L83
        if (r7.j6(r19) == false) goto L50;
        if (r7.j6(r20) == true) goto L50;
        r7.j6(r13.Zo(r20));     // Catch: java.lang.Throwable -> L83
        goto L50
    L55:
        if (this.XL.contains(r17) == false) goto L63;
    L43:
        this.Hw.we();     // Catch: java.lang.Throwable -> L83
        abcd._F r21 = this.Hw.J0();     // Catch: java.lang.Throwable -> L83
        r7.j6(r0, r21, this.aM, this.j3);     // Catch: java.lang.Throwable -> L83
        r13 = r21;
    L83:
        th = move-exception;
        r7.VH();
        throw th;
    L15:
        this.Ws.j6(this, this.aM, this.j3);     // Catch: abcd.MJ -> L86
    L11:
        r5 = null;
        goto L97
    L10:
        r4 = r1;
        goto L11
    }

    static int[] j6() {
        int[] r0 = j6;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.AbstracteI.c.values().length];
        r1[abcd.AbstracteI.c.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L11
    L14:
        r1[abcd.AbstracteI.c.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L12
    L18:
        r1[abcd.AbstracteI.c.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L13
    L9:
        j6 = r1;
        return r1;
    }

    private void tp() {
        if (this.QX.contains("side-band") == false) goto L5;
    L7:
        boolean r0 = true;
    L9:
        if (this.VH == true) goto L15;
        int r3 = this.u7.read();
        if (r3 < 0) goto L15;
        throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedEOFReceived, new java.lang.Object[]{"\\x" + java.lang.Integer.toHexString(r3)}));
    L15:
        if (r0 == true) goto L40;
        j6(false);
        return;
    L40:
        j6(true);     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L24 java.io.IOException -> L30 abcd.MJ -> L36
    L42:
        return;
    L36:
        e = move-exception;
        throw e;
    L30:
        e = move-exception;
        if (u7() == true) goto L34;
        throw e;
    L34:
        throw new abcd.JJ(e);
    L18:
        e = move-exception;
        if (u7() == true) goto L22;
        throw e;
    L22:
        throw new abcd.JJ(e);
    L24:
        e = move-exception;
        if (u7() == true) goto L28;
        throw e;
    L28:
        throw new abcd.JJ(e);
    L5:
        if (this.QX.contains("side-band-64k") == true) goto L7;
        r0 = false;
        goto L9
    }

    private boolean u7() {
        abcd.aJ r0 = new abcd.aJ(3, 1000, this.tp);     // Catch: java.lang.Throwable -> L5
        r0.write(abcd.hE.j6(org.eclipse.jgit.JGitText.j6().internalServerError));     // Catch: java.lang.Throwable -> L5
        r0.flush();     // Catch: java.lang.Throwable -> L5
        return true;
    L5:
        return false;
    }

    private boolean v5() {
        if (this.rN != null) goto L6;
        this.rN = java.lang.Boolean.valueOf(Zo());
    L6:
        return this.rN.booleanValue();
    }

    public final java.util.Map<java.lang.String, abcd.ME> FH() {
        if (this.J0 != null) goto L6;
        j6(this.FH.v5());
    L6:
        return this.J0;
    }

    public void j6(abcd.TI r4) {
        this.Ws.j6(this);     // Catch: abcd.MJ -> L8
        r4.j6(this.FH);
        r4.j6("include-tag");
        r4.j6("multi_ack_detailed");
        r4.j6("multi_ack");
        r4.j6("ofs-delta");
        r4.j6("side-band");
        r4.j6("side-band-64k");
        r4.j6("thin-pack");
        r4.j6("no-progress");
        r4.j6("shallow");
        if (this.VH == true) goto L6;
        r4.j6("no-done");
    L6:
        r4.j6(true);
        this.yS = r4.j6(FH());
        r4.j6();
        return;
    L8:
        e = move-exception;
        if (e.getMessage() == null) goto L13;
        r4.j6("ERR " + e.getMessage());
        e.DW();
        throw null;
    L13:
        throw e;
    }

    public void j6(java.io.InputStream r3, java.io.OutputStream r4, java.io.OutputStream r5) {
        this.u7 = r3;     // Catch: java.lang.Throwable -> L15
        this.tp = r4;     // Catch: java.lang.Throwable -> L15
        if (this.Zo <= 0) goto L6;
        this.gn = new abcd.VK(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()) + "-Timer");     // Catch: java.lang.Throwable -> L15
        abcd._K r6 = new abcd._K(this.u7, this.gn);     // Catch: java.lang.Throwable -> L15
        abcd.aL r7 = new abcd.aL(this.tp, this.gn);     // Catch: java.lang.Throwable -> L15
        r6.j6(this.Zo * 1000);     // Catch: java.lang.Throwable -> L15
        r7.j6(this.Zo * 1000);     // Catch: java.lang.Throwable -> L15
        this.u7 = r6;     // Catch: java.lang.Throwable -> L15
        this.tp = r7;     // Catch: java.lang.Throwable -> L15
    L6:
        this.EQ = new abcd.DI(this.u7);     // Catch: java.lang.Throwable -> L15
        this.we = new abcd.EI(this.tp);     // Catch: java.lang.Throwable -> L15
        EQ();     // Catch: java.lang.Throwable -> L15
        this.Hw.EQ();
        abcd.VK r8 = this.gn;
        if (r8 != null) goto L24;
        return;
    L24:
        r8.DW();     // Catch: java.lang.Throwable -> L11
        this.gn = null;
        return;
    L11:
        th = move-exception;
        this.gn = null;
        throw th;
    L15:
        th = move-exception;
        this.Hw.EQ();
        abcd.VK r9 = this.gn;
        if (r9 != null) goto L26;
    L23:
        throw th;
    L26:
        r9.DW();     // Catch: java.lang.Throwable -> L20
        this.gn = null;
    L20:
        th = move-exception;
        this.gn = null;
        throw th;
    }

    public void j6(java.util.Map<java.lang.String, abcd.ME> r2) {
        this.J8.j6(r2);
        this.J0 = r2;
    }
}
