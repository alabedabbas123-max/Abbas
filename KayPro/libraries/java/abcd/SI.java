package abcd;

public class SI {
    private static int[] DW;
    private static int[] FH;
    private static int[] j6;
    private java.util.List<abcd.OI> BT;
    private boolean EQ;
    private final abcd.UE Hw;
    private abcd.VI J0;
    private abcd.II J8;
    private boolean KD;
    private java.io.OutputStream Mr;
    private java.lang.Throwable P8;
    private int QX;
    private abcd.kH SI;
    private java.io.OutputStream U2;
    private boolean VH;
    private abcd.GI Ws;
    private abcd.VK XL;
    private boolean Zo;
    private abcd.DI a8;
    private abcd._K aM;
    private boolean ei;
    private java.util.Map<java.lang.String, abcd.ME> er;
    private java.util.Set<java.lang.String> gW;
    private boolean gn;
    private java.io.InputStream j3;
    private abcd.EI lg;
    private boolean nw;
    private abcd.AI rN;
    private long ro;
    private boolean tp;
    private boolean u7;
    private final abcd.qG v5;
    private java.lang.StringBuilder vy;
    private abcd.KE we;
    private java.util.Set<abcd.yE> yS;

    private static class a {
        static final gE.b<abcd.SI.a> j6 = null;
        final boolean DW;
        final boolean FH;
        final boolean Hw;
        final boolean Zo;
        final boolean v5;

        static {
            j6 = new abcd.RI();
        }

        a(abcd.gE r5) {
            this.DW = r5.j6("receive", "fsckobjects", false);
            this.FH = true;
            this.Hw = !r5.j6("receive", "denydeletes", false);
            this.v5 = !r5.j6("receive", "denynonfastforwards", false);
            this.Zo = r5.j6("repack", "usedeltabaseoffset", true);
        }
    }

    static abstract class b {
        b() {
        }

        abstract void j6(java.lang.String r1);
    }

    public SI(abcd.UE r2) {
        this.Zo = true;
        this.Hw = r2;
        this.v5 = new abcd.qG(this.Hw);
        abcd.SI.a r3 = (abcd.SI.a) this.Hw.Zo().j6(abcd.SI.a.j6);
        this.VH = r3.DW;
        this.gn = r3.FH;
        this.u7 = r3.Hw;
        this.tp = r3.v5;
        this.EQ = r3.Zo;
        this.J0 = abcd.VI.j6;
        this.J8 = abcd.II.j6;
        this.Ws = abcd.GI.j6;
        this.yS = new java.util.HashSet();
    }

    static java.io.OutputStream DW(abcd.SI r0) {
        return r0.U2;
    }

    static int[] DW() {
        int[] r0 = FH;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.OI.a.values().length];
        r1[abcd.OI.a.gn.ordinal()] = 8;     // Catch: java.lang.NoSuchFieldError -> L17
    L30:
        r1[abcd.OI.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L18
    L32:
        r1[abcd.OI.a.u7.ordinal()] = 9;     // Catch: java.lang.NoSuchFieldError -> L19
    L42:
        r1[abcd.OI.a.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L20
    L34:
        r1[abcd.OI.a.Zo.ordinal()] = 6;     // Catch: java.lang.NoSuchFieldError -> L21
    L36:
        r1[abcd.OI.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L22
    L26:
        r1[abcd.OI.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L23
    L38:
        r1[abcd.OI.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L24
    L28:
        r1[abcd.OI.a.VH.ordinal()] = 7;     // Catch: java.lang.NoSuchFieldError -> L25
    L15:
        FH = r1;
        return r1;
    }

    private void EQ() {
        if (this.KD == false) goto L5;
        DE<abcd.yE> r0 = this.rN.FH();
        DE<abcd.yE> r2 = this.rN.v5();
    L6:
        this.rN = null;
        abcd._F r1 = new abcd._F(this.Hw);
        r1.j6(false);
        if (this.KD == false) goto L11;
        r1.DW(abcd.EnumkG.FH);
        if (r0.isEmpty() == true) goto L11;
        r1.j6(abcd.EnumkG.v5, true);
    L11:
        java.util.Iterator<abcd.OI> r3 = this.BT.iterator();
    L13:
        if (r3.hasNext() == false) goto L14;
        abcd.OI r4 = r3.next();
        if (r4.Zo() != abcd.OI.a.j6) goto L13;
        if (r4.VH() == abcd.OI.b.Hw) goto L13;
        r1.Hw(r1.Zo(r4.DW()));
        goto L13
    L14:
        java.util.Iterator<abcd.yE> r5 = this.yS.iterator();
    L16:
        if (r5.hasNext() == false) goto L17;
        abcd.AbstractiG r6 = r1.Zo(r5.next());
        r1.v5(r6);
        if (this.KD == false) goto L16;
        if (r0.isEmpty() == true) goto L16;
        abcd.AbstractiG r7 = r1.FH(r6);
        if ((r7 instanceof abcd.dG) == false) goto L67;
        r7 = ((abcd.dG) r7).yS();
    L67:
        if ((r7 instanceof abcd.mG) == false) goto L16;
        r1.v5(r7);
    L17:
        abcd.dG r8 = r1.tp();
        if (r8 == null) goto L19;
        if (this.KD == false) goto L17;
        if (r8.DW(abcd.fG.j6) == true) goto L17;
        if (r2.j6(r8) == true) goto L17;
        throw new abcd.fD(r8, "commit");
    L19:
        abcd.AbstractiG r9 = r1.yS();
        if (r9 == null) goto L22;
        if (r9.DW(abcd.fG.j6) == true) goto L19;
        if (this.KD == true) goto L39;
        if ((r9 instanceof abcd.cG) == false) goto L19;
        if (this.Hw.j6(r9) == true) goto L19;
        throw new abcd.fD(r9, "blob");
    L39:
        if (r2.j6(r9) == true) goto L19;
        throw new abcd.fD(r9, r9.aM());
    L22:
        if (this.KD == false) goto L32;
        java.util.Iterator r10 = r0.iterator();
    L25:
        if (r10.hasNext() == false) goto L115;
        abcd.AbstractiG r11 = r1.Zo((abcd.yE) r10.next());
        if (r11.DW(abcd.fG.j6) == true) goto L25;
        throw new abcd.fD(r11, r11.aM());
    L115:
        return;
    L32:
        return;
    L5:
        r0 = null;
        r2 = null;
        goto L6
    }

    static int[] FH() {
        int[] r0 = j6;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.OI.b.values().length];
        r1[abcd.OI.b.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L12
    L16:
        r1[abcd.OI.b.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L13
    L20:
        r1[abcd.OI.b.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L14
    L22:
        r1[abcd.OI.b.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L10:
        j6 = r1;
        return r1;
    }

    private void J0() {
        this.J8.j6(this, j6(abcd.OI.a.j6));
        java.util.List<abcd.OI> r0 = j6(abcd.OI.a.j6);
        abcd.vE r1 = abcd.vE.j6;
        abcd.LE r2 = r1;
        if (this.nw == false) goto L5;
        abcd.bJ r3 = new abcd.bJ(this.U2);
        r3.j6(250, java.util.concurrent.TimeUnit.MILLISECONDS);
        r2 = r3;
    L5:
        r2.j6(org.eclipse.jgit.JGitText.j6().updatingReferences, r0.size());
        java.util.Iterator<abcd.OI> r4 = r0.iterator();
    L7:
        if (r4.hasNext() == false) goto L8;
        abcd.OI r5 = r4.next();
        r2.update(1);
        j6(r5);
        goto L7
    L8:
        r2.j6();
    }

    private boolean J8() {
        if (u7() == false) goto L5;
        return true;
    L5:
        if (tp() == true) goto L10;
        return false;
    L10:
        return true;
    }

    private void Mr() {
        java.util.Iterator<abcd.OI> r0 = this.BT.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.OI r1 = r0.next();
        abcd.ME r2 = r1.Hw();
        if (r1.Zo() != abcd.OI.a.j6) goto L4;
        if (r1.VH() != abcd.OI.b.Hw) goto L15;
        if (VH() == true) goto L15;
        r1.j6(abcd.OI.a.FH);
    L15:
        if (r1.VH() != abcd.OI.b.j6) goto L26;
        if (Zo() == false) goto L18;
        if (r2 == null) goto L23;
        if (gn() == true) goto L23;
        r1.j6(abcd.OI.a.Hw);
    L23:
        if (r2 == null) goto L26;
        r1.j6(abcd.OI.a.VH, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().refAlreadyExists, new java.lang.Object[]{r2}));
        goto L4
    L18:
        r1.j6(abcd.OI.a.DW);
    L26:
        if (r1.VH() != abcd.OI.b.Hw) goto L34;
        if (r2 == null) goto L34;
        if (abcd.yE.Ws().DW(r1.FH()) == true) goto L34;
        if (r2.DW().DW(r1.FH()) == true) goto L34;
        r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().invalidOldIdSent);
    L34:
        if (r1.VH() != abcd.OI.b.DW) goto L57;
        if (r2 == null) goto L36;
        if (r2.DW().DW(r1.FH()) == false) goto L39;
        abcd.AbstractiG r3 = this.v5.Zo(r1.FH());     // Catch: java.io.IOException -> L55
        abcd.AbstractiG r4 = this.v5.Zo(r1.DW());     // Catch: java.io.IOException -> L54
        if ((r3 instanceof abcd.dG) == true) goto L45;
    L53:
        r1.j6(abcd.OI.b.FH);
        goto L57
    L45:
        if ((r4 instanceof abcd.dG) == false) goto L53;
    L51:
        e = move-exception;
        r1.j6(abcd.OI.a.Zo, e.getMessage());
    L50:
        r1.j6(abcd.OI.a.VH);
        goto L57
    L47:
        if (this.v5.j6((abcd.dG) r3, (abcd.dG) r4) == true) goto L57;
        r1.j6(abcd.OI.b.FH);     // Catch: java.io.IOException -> L50 abcd.fD -> L51
    L54:
        r1.j6(abcd.OI.a.Zo, r1.DW().we());
    L55:
        r1.j6(abcd.OI.a.Zo, r1.FH().we());
        goto L4
    L39:
        r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().invalidOldIdSent);
        goto L4
    L36:
        r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().noSuchRef);
    L57:
        if (r1.v5().startsWith("refs/") == false) goto L60;
        if (abcd.UE.DW(r1.v5()) == true) goto L4;
    L60:
        r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().funnyRefname);
        goto L4
    }

    private void QX() {
        abcd._K r0 = this.aM;
        if (r0 == null) goto L5;
        r0.j6((this.QX * 10) * 1000);
    L5:
        abcd.vE r1 = abcd.vE.j6;
        if (this.nw == false) goto L8;
        abcd.LE r2 = new abcd.bJ(this.U2);
    L9:
        abcd.EE r3 = this.Hw.aM();
        java.lang.String r4 = "jgit receive-pack";
        if (v5() == null) goto L13;
        r4 = "jgit receive-pack from " + v5().Hw();     // Catch: java.lang.Throwable -> L21
    L13:
        this.rN = r3.j6(this.j3);     // Catch: java.lang.Throwable -> L21
        boolean r5 = true;
        this.rN.j6(true);     // Catch: java.lang.Throwable -> L21
        this.rN.Hw(this.KD);     // Catch: java.lang.Throwable -> L21
        this.rN.FH(this.KD);     // Catch: java.lang.Throwable -> L21
        abcd.AI r6 = this.rN;     // Catch: java.lang.Throwable -> L21
        if (this.Zo == false) goto L16;
        r5 = false;
    L16:
        r6.DW(r5);     // Catch: java.lang.Throwable -> L21
        this.rN.v5(u7());     // Catch: java.lang.Throwable -> L21
        this.rN.j6(r4);     // Catch: java.lang.Throwable -> L21
        this.rN.DW(this.ro);     // Catch: java.lang.Throwable -> L21
        this.SI = this.rN.j6(r1, r2);     // Catch: java.lang.Throwable -> L21
        r3.FH();     // Catch: java.lang.Throwable -> L21
        r3.Hw();
        abcd._K r7 = this.aM;
        if (r7 == null) goto L26;
        r7.j6(this.QX * 1000);
        return;
    L26:
        return;
    L21:
        th = move-exception;
        r3.Hw();
        throw th;
    L8:
        r2 = r1;
        goto L9
    }

    private boolean Ws() {
        java.util.Iterator<abcd.OI> r0 = this.BT.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        if (r0.next().VH() == abcd.OI.b.Hw) goto L4;
        return true;
    L5:
        return false;
    }

    private void XL() {
    L30:
        java.lang.String r0 = this.a8.FH();     // Catch: java.io.EOFException -> L23
        if (r0 == abcd.DI.j6) goto L5;
        if (this.BT.isEmpty() == false) goto L15;
        int r1 = r0.indexOf(0);
        if (r1 < 0) goto L15;
        java.lang.String[] r3 = r0.substring(r1 + 1).split(" ");
        int r4 = r3.length;
        int r5 = 0;
    L11:
        if (r5 >= r4) goto L12;
        java.lang.String r6 = r3[r5];
        this.gW.add(r6);
        r5 = r5 + 1;
        goto L11
    L12:
        r0 = r0.substring(0, r1);
    L15:
        if (r0.length() < 83) goto L21;
        abcd.yE r2 = abcd.yE.j6(r0.substring(0, 40));
        abcd.yE r7 = abcd.yE.j6(r0.substring(41, 81));
        java.lang.String r8 = r0.substring(82);
        abcd.OI r9 = new abcd.OI(r2, r7, r8);
        if (r8.equals("HEAD") == false) goto L19;
        r9.j6(abcd.OI.a.v5);
    L20:
        this.BT.add(r9);
        goto L30
    L19:
        r9.j6(this.er.get(r9.v5()));
        goto L20
    L21:
        java.lang.String r10 = org.eclipse.jgit.JGitText.j6().errorInvalidProtocolWantedOldNewRef;
        j6(r10);
        throw new abcd.nD(r10);
    L5:
        return;
    L23:
        e = move-exception;
        if (this.BT.isEmpty() == false) goto L28;
        return;
    L28:
        throw e;
    }

    private void aM() {
        if (this.Zo == false) goto L5;
        j6(new abcd.TI.a(this.lg));
        this.lg.DW();
    L7:
        if (this.vy == null) goto L9;
        return;
    L9:
        XL();
        if (this.BT.isEmpty() == true) goto L38;
        we();
        if (Ws() == false) goto L25;
        QX();     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L20 java.io.IOException -> L22
        if (J8() == false) goto L16;
        EQ();     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L20 java.io.IOException -> L22
    L16:
        this.rN = null;     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L20 java.io.IOException -> L22
        this.P8 = null;     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L20 java.io.IOException -> L22
    L22:
        e = move-exception;
        this.P8 = e;
    L18:
        e = move-exception;
        this.P8 = e;
    L20:
        e = move-exception;
        this.P8 = e;
    L25:
        if (this.P8 != null) goto L27;
        Mr();
        J0();
    L27:
        j3();
        if (this.ei == false) goto L31;
        j6(true, new abcd.PI(this));
        this.lg.j6();
    L33:
        this.Ws.j6(this, j6(abcd.OI.a.u7));
        java.lang.Throwable r0 = this.P8;
        if (r0 != null) goto L37;
        return;
    L37:
        throw new abcd.AD(r0);
    L31:
        if (this.U2 == null) goto L33;
        j6(false, new abcd.QI(this));
        goto L33
    L38:
        return;
    L5:
        Hw();
        goto L7
    }

    private void j3() {
        abcd.kH r0 = this.SI;
        if (r0 == null) goto L6;
        r0.j6();
        this.SI = null;
        return;
    }

    static abcd.EI j6(abcd.SI r0) {
        return r0.lg;
    }

    private java.util.List<abcd.OI> j6(abcd.OI.a r5) {
        java.util.ArrayList r0 = new java.util.ArrayList(this.BT.size());
        java.util.Iterator<abcd.OI> r1 = this.BT.iterator();
    L4:
        if (r1.hasNext() == false) goto L5;
        abcd.OI r2 = r1.next();
        if (r2.Zo() != r5) goto L4;
        r0.add(r2);
        goto L4
    L5:
        return r0;
    }

    private void j6(abcd.OI r6) {
        abcd.RE r1 = this.Hw.v5(r6.v5());     // Catch: java.io.IOException -> L18
        r1.j6(v5());     // Catch: java.io.IOException -> L18
        int r2 = FH()[r6.VH().ordinal()];     // Catch: java.io.IOException -> L18
        if (r2 != 1) goto L6;
    L16:
        r1.j6(gn());     // Catch: java.io.IOException -> L18
        r1.j6(r6.FH());     // Catch: java.io.IOException -> L18
        r1.DW(r6.DW());     // Catch: java.io.IOException -> L18
        r1.j6("push", true);     // Catch: java.io.IOException -> L18
        j6(r6, r1.DW(this.v5));     // Catch: java.io.IOException -> L18
        return;
    L6:
        if (r2 == 2) goto L16;
        if (r2 == 3) goto L16;
        if (r2 == 4) goto L13;
        return;
    L13:
        if (abcd.yE.Ws().DW(r6.FH()) == true) goto L15;
        r1.j6(r6.FH());     // Catch: java.io.IOException -> L18
    L15:
        r1.j6(true);     // Catch: java.io.IOException -> L18
        j6(r6, r1.j6(this.v5));     // Catch: java.io.IOException -> L18
        return;
    L18:
        e = move-exception;
        r6.j6(abcd.OI.a.VH, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().lockError, new java.lang.Object[]{e.getMessage()}));
    }

    private void j6(abcd.OI r3, abcd.RE.a r4) {
        switch(j6()[r4.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L7;
            case 4: goto L7;
            case 5: goto L7;
            case 6: goto L7;
            case 7: goto L6;
            case 8: goto L5;
            case 9: goto L8;
            default: goto L4;
        };
    L4:
        r3.j6(abcd.OI.a.VH, r4.name());
        return;
    L5:
        r3.j6(abcd.OI.a.v5);
        return;
    L6:
        r3.j6(abcd.OI.a.Hw);
        return;
    L7:
        r3.j6(abcd.OI.a.u7);
        return;
    L8:
        r3.j6(abcd.OI.a.gn);
        return;
    L9:
        r3.j6(abcd.OI.a.j6);
    }

    private void j6(boolean r7, abcd.SI.b r8) {
        if (this.P8 == null) goto L12;
        r8.j6("unpack error " + this.P8.getMessage());
        if (r7 == false) goto L11;
        java.util.Iterator<abcd.OI> r9 = this.BT.iterator();
    L8:
        if (r9.hasNext() == false) goto L62;
        r8.j6("ng " + r9.next().v5() + " n/a (unpacker error)");
        goto L8
    L62:
        return;
    L11:
        return;
    L12:
        if (r7 == false) goto L14;
        r8.j6("unpack ok");
    L14:
        java.util.Iterator<abcd.OI> r0 = this.BT.iterator();
    L16:
        if (r0.hasNext() == false) goto L17;
        abcd.OI r2 = r0.next();
        if (r2.Zo() == abcd.OI.a.u7) goto L20;
        java.lang.StringBuilder r3 = new java.lang.StringBuilder();
        r3.append("ng ");
        r3.append(r2.v5());
        r3.append(" ");
        switch(DW()[r2.Zo().ordinal()]) {
            case 1: goto L41;
            case 2: goto L40;
            case 3: goto L39;
            case 4: goto L38;
            case 5: goto L37;
            case 6: goto L31;
            case 7: goto L27;
            case 8: goto L25;
            case 9: goto L16;
            default: goto L42;
        };
    L25:
        r3.append("failed to lock");
        goto L42
    L27:
        if (r2.j6() != null) goto L29;
        r3.append("unspecified reason");
        goto L42
    L29:
        r3.append(r2.j6());
        goto L42
    L31:
        if (r2.j6() != null) goto L34;
        r3.append("missing object(s)");
        goto L42
    L34:
        if (r2.j6().length() != 40) goto L36;
        r3.append("object " + r2.j6() + " missing");
        goto L42
    L36:
        r3.append(r2.j6());
        goto L42
    L37:
        r3.append("branch is currently checked out");
        goto L42
    L38:
        r3.append("non-fast forward");
        goto L42
    L39:
        r3.append("deletion prohibited");
        goto L42
    L40:
        r3.append("creation prohibited");
        goto L42
    L41:
        r3.append("server bug; ref not processed");
    L42:
        r8.j6(r3.toString());
        goto L16
    L20:
        if (r7 == false) goto L16;
        r8.j6("ok " + r2.v5());
        goto L16
    }

    static int[] j6() {
        int[] r0 = DW;
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
        DW = r1;
        return r1;
    }

    private void we() {
        this.ei = this.gW.contains("report-status");
        this.nw = this.gW.contains("side-band-64k");
        if (this.nw == false) goto L6;
        java.io.OutputStream r0 = this.Mr;
        this.Mr = new abcd.aJ(1, 65520, r0);
        this.U2 = new abcd.aJ(2, 65520, r0);
        this.lg = new abcd.EI(this.Mr);
        this.lg.j6(false);
        return;
    }

    public final java.util.Map<java.lang.String, abcd.ME> Hw() {
        if (this.er != null) goto L17;
        abcd.VI r0 = this.J0;
        java.util.Map<java.lang.String, abcd.ME> r1 = this.Hw.v5();
        r0.j6(r1);
        this.er = r1;
        abcd.ME r2 = this.er.get("HEAD");
        if (r2 != null) goto L7;
    L9:
        java.util.Iterator<abcd.ME> r3 = this.er.values().iterator();
    L11:
        if (r3.hasNext() == false) goto L12;
        abcd.ME r4 = r3.next();
        if (r4.DW() == null) goto L11;
        this.yS.add(r4.DW());
        goto L11
    L12:
        this.yS.addAll(this.Hw.Hw());
        goto L17
    L7:
        if (r2.Zo() == false) goto L9;
        this.er.remove("HEAD");
    L17:
        return this.er;
    }

    public boolean VH() {
        return this.u7;
    }

    public boolean Zo() {
        return this.gn;
    }

    public boolean gn() {
        return this.tp;
    }

    public void j6(abcd.TI r3) {
        if (this.vy == null) goto L6;
        r3.j6("ERR " + this.vy);
        return;
    L6:
        r3.j6(this.Hw);
        r3.j6("side-band-64k");
        r3.j6("delete-refs");
        r3.j6("report-status");
        if (this.EQ == false) goto L9;
        r3.j6("ofs-delta");
    L9:
        r3.j6(Hw());
        java.util.Iterator<abcd.yE> r0 = this.yS.iterator();
    L11:
        if (r0.hasNext() == false) goto L13;
        r3.j6(r0.next());
        goto L11
    L13:
        if (r3.DW() == false) goto L15;
        r3.j6(abcd.yE.Ws(), "capabilities^{}");
    L15:
        r3.j6();
    }

    public void j6(java.io.InputStream r4, java.io.OutputStream r5, java.io.OutputStream r6) {
        this.j3 = r4;     // Catch: java.lang.Throwable -> L36
        this.Mr = r5;     // Catch: java.lang.Throwable -> L36
        this.U2 = r6;     // Catch: java.lang.Throwable -> L36
        if (this.QX <= 0) goto L6;
        this.XL = new abcd.VK(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()) + "-Timer");     // Catch: java.lang.Throwable -> L36
        this.aM = new abcd._K(this.j3, this.XL);     // Catch: java.lang.Throwable -> L36
        abcd.aL r7 = new abcd.aL(this.Mr, this.XL);     // Catch: java.lang.Throwable -> L36
        this.aM.j6(this.QX * 1000);     // Catch: java.lang.Throwable -> L36
        r7.j6(this.QX * 1000);     // Catch: java.lang.Throwable -> L36
        this.j3 = this.aM;     // Catch: java.lang.Throwable -> L36
        this.Mr = r7;     // Catch: java.lang.Throwable -> L36
    L6:
        this.a8 = new abcd.DI(this.j3);     // Catch: java.lang.Throwable -> L36
        this.lg = new abcd.EI(this.Mr);     // Catch: java.lang.Throwable -> L36
        this.lg.j6(false);     // Catch: java.lang.Throwable -> L36
        this.gW = new java.util.HashSet();     // Catch: java.lang.Throwable -> L36
        this.BT = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L36
        aM();     // Catch: java.lang.Throwable -> L36
        this.v5.EQ();
    L27:
        th = move-exception;
        j3();
        this.aM = null;
        this.j3 = null;
        this.Mr = null;
        this.U2 = null;
        this.a8 = null;
        this.lg = null;
        this.er = null;
        this.gW = null;
        this.BT = null;
        abcd.VK r8 = this.XL;
        if (r8 != null) goto L72;
    L35:
        throw th;
    L72:
        r8.DW();     // Catch: java.lang.Throwable -> L32
        this.XL = null;
    L32:
        th = move-exception;
        this.XL = null;
        throw th;
    L9:
        if (this.nw == false) goto L12;
        ((abcd.aJ) this.U2).j6();     // Catch: java.lang.Throwable -> L27
        ((abcd.aJ) this.Mr).j6();     // Catch: java.lang.Throwable -> L27
        abcd.EI r9 = new abcd.EI(r5);     // Catch: java.lang.Throwable -> L27
        r9.j6(false);     // Catch: java.lang.Throwable -> L27
        r9.j6();     // Catch: java.lang.Throwable -> L27
    L12:
        if (this.Zo == true) goto L14;
    L19:
        j3();
        this.aM = null;
        this.j3 = null;
        this.Mr = null;
        this.U2 = null;
        this.a8 = null;
        this.lg = null;
        this.er = null;
        this.gW = null;
        this.BT = null;
        abcd.VK r10 = this.XL;
        if (r10 != null) goto L68;
        return;
    L68:
        r10.DW();     // Catch: java.lang.Throwable -> L23
        this.XL = null;
        return;
    L23:
        th = move-exception;
        this.XL = null;
        throw th;
    L14:
        if (this.nw == false) goto L16;
    L18:
        this.Mr.flush();     // Catch: java.lang.Throwable -> L27
        goto L19
    L16:
        if (this.U2 == null) goto L18;
        this.U2.flush();     // Catch: java.lang.Throwable -> L27
    L36:
        th = move-exception;
        this.v5.EQ();
    L57:
        th = move-exception;
        j3();
        this.aM = null;
        this.j3 = null;
        this.Mr = null;
        this.U2 = null;
        this.a8 = null;
        this.lg = null;
        this.er = null;
        this.gW = null;
        this.BT = null;
        abcd.VK r11 = this.XL;
        if (r11 != null) goto L76;
    L65:
        throw th;
    L76:
        r11.DW();     // Catch: java.lang.Throwable -> L62
        this.XL = null;
    L62:
        th = move-exception;
        this.XL = null;
        throw th;
    L39:
        if (this.nw == false) goto L42;
        ((abcd.aJ) this.U2).j6();     // Catch: java.lang.Throwable -> L57
        ((abcd.aJ) this.Mr).j6();     // Catch: java.lang.Throwable -> L57
        abcd.EI r12 = new abcd.EI(r5);     // Catch: java.lang.Throwable -> L57
        r12.j6(false);     // Catch: java.lang.Throwable -> L57
        r12.j6();     // Catch: java.lang.Throwable -> L57
    L42:
        if (this.Zo == true) goto L44;
    L49:
        j3();
        this.aM = null;
        this.j3 = null;
        this.Mr = null;
        this.U2 = null;
        this.a8 = null;
        this.lg = null;
        this.er = null;
        this.gW = null;
        this.BT = null;
        abcd.VK r13 = this.XL;
        if (r13 != null) goto L70;
    L56:
        throw th;
    L70:
        r13.DW();     // Catch: java.lang.Throwable -> L53
        this.XL = null;
    L53:
        th = move-exception;
        this.XL = null;
        throw th;
    L44:
        if (this.nw == false) goto L46;
    L48:
        this.Mr.flush();     // Catch: java.lang.Throwable -> L57
        goto L49
    L46:
        if (this.U2 == null) goto L48;
        this.U2.flush();     // Catch: java.lang.Throwable -> L57
        goto L48
    }

    public void j6(java.lang.String r4) {
        if (this.er == null) goto L5;
        if (this.U2 == null) goto L16;
        this.U2.write(abcd.hE.j6("error: " + r4 + "\n"));     // Catch: java.io.IOException -> L12
        return;
    L16:
        return;
    L17:
        return;
    L5:
        if (this.vy != null) goto L7;
        this.vy = new java.lang.StringBuilder();
    L7:
        java.lang.StringBuilder r0 = this.vy;
        r0.append(r4);
        r0.append('\n');
    }

    public boolean tp() {
        return this.KD;
    }

    public boolean u7() {
        return this.VH;
    }

    public abcd.KE v5() {
        return this.we;
    }
}
