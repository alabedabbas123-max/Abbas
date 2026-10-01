package abcd;

public abstract class AbstracteI extends abcd.AbstractC0597cI implements abcd.InterfacenI {
    private static int[] aM;
    private boolean BT;
    private abcd.EI KD;
    private eG<abcd.dG> Mr;
    private boolean P8;
    private abcd.RK.c SI;
    final abcd.fG U2;
    final abcd.fG a8;
    private java.lang.String ei;
    private abcd.AbstracteI.c er;
    private boolean gW;
    private final abcd.qG j3;
    private final abcd.fG lg;
    private abcd.kH nw;
    final abcd.fG rN;
    private boolean vy;
    private boolean yS;

    private static class a extends java.lang.Exception {
        private a() {
        }

        a(abcd.AbstracteI.a r1) {
            this();
        }
    }

    private static class b {
        static final gE.b<abcd.AbstracteI.b> j6 = null;
        final boolean DW;

        static {
            j6 = new abcd.fI();
        }

        b(abcd.gE r4) {
            this.DW = r4.j6("repack", "usedeltabaseoffset", true);
        }
    }

    static final enum c extends java.lang.Enum<abcd.AbstracteI.c> {
        public static final abcd.AbstracteI.c DW = null;
        public static final abcd.AbstracteI.c FH = null;
        private static final abcd.AbstracteI.c[] Hw = null;
        public static final abcd.AbstracteI.c j6 = null;

        static {
            j6 = new abcd.AbstracteI.c("OFF", 0);
            DW = new abcd.AbstracteI.c("CONTINUE", 1);
            FH = new abcd.AbstracteI.c("DETAILED", 2);
            Hw = new abcd.AbstracteI.c[]{j6, DW, FH};
        }

        private c(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.AbstracteI.c valueOf(java.lang.String r1) {
            return (abcd.AbstracteI.c) java.lang.Enum.valueOf(abcd.AbstracteI.c.class, r1);
        }

        public static abcd.AbstracteI.c[] values() {
            abcd.AbstracteI.c[] r0 = Hw;
            int r1 = r0.length;
            abcd.AbstracteI.c[] r2 = new abcd.AbstracteI.c[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public AbstracteI(abcd.BI r3) {
        super(r3);
        this.er = abcd.AbstracteI.c.j6;
        abcd.AbstracteI.b r4 = (abcd.AbstracteI.b) this.Hw.Zo().j6(abcd.AbstracteI.b.j6);
        if (this.Zo.VH() == abcd.EnumeJ.DW) goto L5;
        boolean r0 = true;
    L6:
        this.BT = r0;
        this.yS = this.Zo.J0();
        this.vy = r4.DW;
        this.j3 = new abcd.qG(this.Hw);
        this.Mr = new abcd.eG();
        this.U2 = this.j3.j6("REACHABLE");
        this.a8 = this.j3.j6("COMMON");
        this.lg = this.j3.j6("STATE");
        this.rN = this.j3.j6("ADVERTISED");
        this.j3.j6(this.a8);
        this.j3.j6(this.U2);
        this.j3.j6(this.rN);
        return;
    L5:
        r0 = false;
        goto L6
    }

    private void DW(abcd.LE r4) {
        java.io.InputStream r0 = this.tp;
        if (this.gW == false) goto L5;
        r0 = new abcd._I(r0, r4, VH());
    L5:
        abcd.EE r1 = this.Hw.aM();
        abcd.AI r2 = r1.j6(r0);     // Catch: java.lang.Throwable -> L9
        r2.j6(this.yS);     // Catch: java.lang.Throwable -> L9
        r2.v5(this.Zo.EQ());     // Catch: java.lang.Throwable -> L9
        r2.j6(this.ei);     // Catch: java.lang.Throwable -> L9
        this.nw = r2.j6(r4);     // Catch: java.lang.Throwable -> L9
        r1.FH();     // Catch: java.lang.Throwable -> L9
        r1.Hw();
        return;
    L9:
        th = move-exception;
        r1.Hw();
        throw th;
    }

    private boolean DW(java.util.Collection<abcd.ME> r8) {
        if (this.Ws == false) goto L5;
        abcd.EI r0 = this.KD;
    L6:
        java.util.Iterator<abcd.ME> r9 = r8.iterator();
        boolean r2 = true;
    L8:
        if (r9.hasNext() == false) goto L9;
        abcd.ME r3 = r9.next();
        if (this.j3.Zo(r3.DW()).DW(this.U2) == true) goto L8;
    L17:
        java.lang.StringBuilder r5 = new java.lang.StringBuilder(46);
        r5.append("want ");
        r5.append(r3.DW().we());
        if (r2 == false) goto L20;
        r5.append(J0());
        r2 = false;
    L20:
        r5.append('\n');
        r0.j6(r5.toString());
        goto L8
    L9:
        if (r2 == false) goto L11;
        return false;
    L11:
        r0.j6();
        this.J8 = false;
        return true;
    L5:
        r0 = this.J0;
        goto L6
    }

    private java.lang.String J0() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        if (this.BT == false) goto L6;
        this.BT = j6(r0, "include-tag");
    L6:
        if (this.vy == false) goto L9;
        j6(r0, "ofs-delta");
    L9:
        if (j6(r0, "multi_ack_detailed") == false) goto L14;
        this.er = abcd.AbstracteI.c.FH;
        if (this.Ws == false) goto L18;
        this.P8 = j6(r0, "no-done");
    L18:
        if (this.yS == false) goto L21;
        this.yS = j6(r0, "thin-pack");
    L21:
        if (j6(r0, "side-band-64k") == false) goto L24;
        this.gW = true;
    L27:
        if (this.Ws == false) goto L34;
        if (this.er == abcd.AbstracteI.c.FH) goto L34;
        throw new abcd.nD(this.v5, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().statelessRPCRequiresOptionToBeEnabled, new java.lang.Object[]{"multi_ack_detailed"}));
    L34:
        return r0.toString();
    L24:
        if (j6(r0, "side-band") == false) goto L27;
        this.gW = true;
        goto L27
    L14:
        if (j6(r0, "multi_ack") == false) goto L16;
        this.er = abcd.AbstracteI.c.DW;
        goto L18
    L16:
        this.er = abcd.AbstracteI.c.j6;
        goto L18
    }

    private void J8() {
        java.util.Iterator<abcd.ME> r0 = DW().iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.ME r1 = r0.next();
        j6(r1.DW());
        if (r1.FH() == null) goto L4;
        j6(r1.FH());
        goto L4
    }

    private void Ws() {
        this.j3.j6(new abcd.fG[]{this.U2, this.rN});
        this.j3.j6(this.Mr);
        this.j3.DW(abcd.EnumkG.DW);
        this.j3.j6(new abcd.C0641dI(this));
    }

    private int j6(java.util.Collection<abcd.ME> r4) {
        java.util.Iterator<abcd.ME> r5 = r4.iterator();
        int r0 = 0;
    L4:
        if (r5.hasNext() == false) goto L5;
        abcd.ME r1 = r5.next();
        abcd.AbstractiG r2 = this.j3.Zo(r1.DW());     // Catch: java.io.IOException -> L12
        if ((r2 instanceof abcd.dG) == false) goto L4;
        int r3 = ((abcd.dG) r2).U2();     // Catch: java.io.IOException -> L12
        if (r0 >= r3) goto L4;
        r0 = r3;
        goto L4
    L5:
        return r0;
    }

    private void j6(abcd.LE r17) {
        abcd.uE r1 = new abcd.uE();
        if (this.Ws == false) goto L5;
        this.SI.j6(this.EQ, null);
    L5:
        Ws();
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        boolean r7 = false;
        boolean r8 = false;
        boolean r9 = false;
    L6:
        abcd.dG r10 = this.j3.tp();
        if (r10 == null) goto L51;
        abcd.EI r2 = this.J0;
        java.lang.StringBuilder r3 = new java.lang.StringBuilder("have ");
        r10.getId();
        r3.append(r10.we());
        r3.append("\n");
        r2.j6(r3.toString());
        r4 = r4 + 1;
        r5 = r5 + 1;
        if ((r4 & 31) != 0) goto L6;
        if (r17.isCancelled() == true) goto L83;
        this.J0.j6();
        r6 = r6 + 1;
        if (r4 != 32) goto L19;
        if (this.Ws == false) goto L6;
    L19:
        abcd.DI.a r11 = this.we.j6(r1);
        int r12 = we()[r11.ordinal()];
        if (r12 == 1) goto L41;
        if (r12 == 2) goto L37;
        if (r12 == 3) goto L27;
        if (r12 == 4) goto L27;
        if (r12 == 5) goto L27;
    L33:
        if (r17.isCancelled() == false) goto L19;
        throw new abcd.AbstracteI.a(null);
    L27:
        j6(this.j3.Zo(r1), r11);
        if (r11 != abcd.DI.a.v5) goto L30;
        r5 = 0;
        r7 = true;
    L31:
        r8 = true;
        r9 = true;
        goto L33
    L30:
        r5 = 0;
        goto L31
    L37:
        this.er = abcd.AbstracteI.c.j6;
        if (this.Ws == false) goto L40;
        this.SI.j6(this.EQ, null);
    L40:
        r6 = 0;
        r9 = true;
        goto L51
    L41:
        r6 = r6 - 1;
        if ((this.P8 & r7) == true) goto L51;
        if (this.Ws == false) goto L47;
        this.SI.j6(this.EQ, null);
    L47:
        if (r8 == false) goto L6;
        if (r5 <= 256) goto L6;
    L83:
        throw new abcd.AbstracteI.a(null);
    L51:
        if (r17.isCancelled() == true) goto L80;
        if (r7 == true) goto L54;
    L55:
        this.J0.j6("done\n");
        this.J0.DW();
    L56:
        if (r9 == true) goto L58;
        this.er = abcd.AbstracteI.c.j6;
        r6 = r6 + 1;
    L58:
        if (r6 <= 0) goto L60;
    L62:
        r6 = r6 - 1;
        int r13 = we()[this.we.j6(r1).ordinal()];
        if (r13 == 1) goto L75;
        if (r13 == 2) goto L72;
        if (r13 == 3) goto L71;
        if (r13 == 4) goto L71;
        if (r13 != 5) goto L75;
    L71:
        this.er = abcd.AbstracteI.c.DW;
        goto L75
    L72:
        return;
    L75:
        if (r17.isCancelled() == false) goto L58;
        throw new abcd.AbstracteI.a(null);
    L60:
        if (this.er != abcd.AbstracteI.c.j6) goto L62;
        return;
    L54:
        if (this.P8 == true) goto L56;
    L80:
        throw new abcd.AbstracteI.a(null);
    }

    private void j6(abcd.YD r2) {
        this.j3.Zo(r2).j6(this.rN);     // Catch: java.io.IOException -> L4
        return;
    }

    private void j6(abcd.AbstractiG r2, abcd.DI.a r3) {
        if (this.Ws == true) goto L5;
    L9:
        r2.j6(this.a8);
        if ((r2 instanceof abcd.dG) == false) goto L13;
        ((abcd.dG) r2).FH(this.a8);
        return;
    L13:
        return;
    L5:
        if (r3 != abcd.DI.a.Hw) goto L9;
        if (r2.DW(this.lg) == true) goto L9;
        java.lang.StringBuilder r4 = new java.lang.StringBuilder(46);
        r4.append("have ");
        r4.append(r2.we());
        r4.append('\n');
        this.KD.j6(r4.toString());
        r2.j6(this.lg);
        goto L9
    }

    private void j6(abcd.yE r2) {
        abcd.dG r3 = this.j3.VH(r2);     // Catch: java.io.IOException -> L6
        if (r3.DW(this.U2) == true) goto L9;
        r3.j6(this.U2);     // Catch: java.io.IOException -> L6
        this.Mr.add(r3);     // Catch: java.io.IOException -> L6
        return;
    L9:
        return;
    }

    private void j6(java.util.Set<abcd.yE> r5, int r6) {
        java.util.Iterator<abcd.ME> r0 = this.Hw.v5().values().iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.ME r1 = r0.next();
        abcd.yE r2 = r1.FH();
        if (r2 != null) goto L27;
        r2 = r1.DW();
    L27:
        if (r2 == null) goto L4;
        j6(r2);
        goto L4
    L5:
        java.util.Iterator<abcd.yE> r3 = this.Hw.Hw().iterator();
    L7:
        if (r3.hasNext() == false) goto L8;
        j6(r3.next());
        goto L7
    L8:
        java.util.Iterator<abcd.yE> r4 = r5.iterator();
    L10:
        if (r4.hasNext() == false) goto L11;
        j6(r4.next());
        goto L10
    L11:
        if (r6 <= 0) goto L21;
        java.util.Date r7 = new java.util.Date(((long) r6) * 1000);
        this.j3.DW(abcd.EnumkG.DW);
        this.j3.j6(this.Mr);
        this.j3.j6(abcd.AbstractwG.j6(r7));
    L13:
        abcd.dG r8 = this.j3.tp();
        if (r8 == null) goto L44;
        if (r8.DW(this.rN) == false) goto L13;
        if (r8.DW(this.a8) == true) goto L13;
        r8.j6(this.a8);
        r8.FH(this.a8);
        this.Mr.add(r8);
        goto L13
    L44:
        return;
    }

    static int[] we() {
        int[] r0 = aM;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.DI.a.values().length];
        r1[abcd.DI.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L13
    L18:
        r1[abcd.DI.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L14
    L24:
        r1[abcd.DI.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L26:
        r1[abcd.DI.a.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L16
    L20:
        r1[abcd.DI.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L17
    L11:
        aM = r1;
        return r1;
    }

    protected void DW(abcd.LE r2, java.util.Collection<abcd.ME> r3, java.util.Set<abcd.yE> r4) {
        J8();     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        j6(r4, j6(r3));     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        if (this.Ws == false) goto L6;
        this.SI = new abcd.RK.c(Integer.MAX_VALUE);     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        this.KD = new abcd.EI(this.SI);     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
    L6:
        if (DW(r3) == false) goto L19;
        j6(r2);     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        this.j3.v5();     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        this.Mr = null;     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        this.SI = null;     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        this.KD = null;     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        DW(r2);     // Catch: java.lang.RuntimeException -> L9 java.io.IOException -> L12 abcd.AbstracteI.a -> L15
        return;
    L19:
        return;
    L15:
        close();
        return;
    L12:
        e = move-exception;
        close();
        throw new abcd.yD(e.getMessage(), e);
    L9:
        e = move-exception;
        close();
        throw new abcd.yD(e.getMessage(), e);
    }

    @Override
    public java.util.Collection<abcd.kH> Hw() {
        abcd.kH r0 = this.nw;
        if (r0 == null) goto L7;
        return java.util.Collections.singleton(r0);
    L7:
        return java.util.Collections.emptyList();
    }

    @Override
    public boolean Zo() {
        return false;
    }

    @Override
    public void close() {
        this.j3.EQ();
        super.close();
    }

    @Override
    public final void j6(abcd.LE r1, java.util.Collection<abcd.ME> r2, java.util.Set<abcd.yE> r3) {
        gn();
        DW(r1, r2, r3);
    }

    @Override
    public void j6(java.lang.String r1) {
        this.ei = r1;
    }

    @Override
    public boolean v5() {
        return false;
    }
}
