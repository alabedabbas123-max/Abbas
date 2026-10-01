package com.aide.ui.scm;

@abcd.Interfacexu
public class DiffView extends com.aide.ui.views.CodeEditText {

    @abcd.Interfacetu
    private static boolean J0;

    @abcd.Interfaceuu
    private static boolean J8;

    @abcd.Interfaceru(field = 2189486516427060765L)
    private java.lang.Object QX;

    @abcd.Interfaceru(field = 3040277300493817989L)
    private com.aide.ui.scm.DiffView.a Ws;

    @abcd.Interfaceru(field = -636136340544233200L)
    private int XL;

    @abcd.Interfaceru(field = -636169269069296487L)
    private int aM;

    @abcd.Interfaceru(field = 2968802806890530263L)
    private com.aide.common.KeyStrokeDetector j3;

    @abcd.Interfacexu
    public class a extends com.aide.ui.views.CodeEditText.b {

        @abcd.Interfaceuu
        private static boolean SI;

        @abcd.Interfacetu
        private static boolean nw;

        @abcd.Interfaceru(field = 1348204581343355400L)
        private java.util.List<com.aide.ui.scm.DiffView.c> KD;

        @abcd.Interfaceru(field = 583724768663328465L)
        private com.aide.engine.ClassO cb;

        @abcd.Interfaceru(field = 2545998618238386224L)
        private java.util.ArrayList<java.lang.Integer> cn;

        @abcd.Interfaceru(field = 583692788180474280L)
        private com.aide.engine.ClassO dx;

        @abcd.Interfaceru(field = -880815428847654123L)
        private java.util.ArrayList<java.lang.Integer> ro;

        @abcd.Interfacevu
        final com.aide.ui.scm.DiffView sG;

        @abcd.Interfaceru(field = 2546098541940689505L)
        private java.util.ArrayList<java.lang.Integer> sh;

        static {
            abcd.wu.j6(com.aide.ui.scm.DiffView.a.class, -858911175984304184L, -858911175984304184L);
        }

        public a(com.aide.ui.scm.DiffView r6) {
        L8:
            th = move-exception;
            if (SI == false) goto L12;
            abcd.wu.j6(th, -1899540583449713775L, null, r6);
        L12:
            throw th;
        L4:
            if (nw == false) goto L6;
            abcd.wu.j6(-1899540583449713775L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.sG = r6;     // Catch: java.lang.Throwable -> L8
            super(r6);     // Catch: java.lang.Throwable -> L8
            this.KD = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
            j3();     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = 2594614560312257325L)
        private void DW(java.lang.String r7) {
        L12:
            th = move-exception;
            if (SI == false) goto L16;
            abcd.wu.j6(th, -1999544909227185920L, this, r7);
        L16:
            throw th;
        L4:
            if (nw == false) goto L6;
            abcd.wu.j6(-1999544909227185920L, this, r7);     // Catch: java.lang.Throwable -> L12
        L6:
            int r2 = v5() - 1;     // Catch: java.lang.Throwable -> L12
            int r3 = EQ(r2) - 1;     // Catch: java.lang.Throwable -> L12
            if (r3 != (-1)) goto L9;
            if (r2 != 0) goto L9;
        L20:
            j6(0, 0, new com.aide.ui.scm.DiffView.b(r7), this);     // Catch: java.io.IOException -> L17 java.lang.Throwable -> L12
            return;
        L21:
            return;
        L9:
            j6(new abcd.hm(0, 0, r2, r3), this);     // Catch: java.lang.Throwable -> L12
            goto L20
        }

        @abcd.Interfacesu(method = 1349658793897232104L)
        private void FH(java.lang.String r5) {
        L8:
            th = move-exception;
            if (SI == false) goto L12;
            abcd.wu.j6(th, 1266884240733767851L, this, r5);
        L12:
            throw th;
        L4:
            if (nw == false) goto L6;
            abcd.wu.j6(1266884240733767851L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.KD.clear();     // Catch: java.lang.Throwable -> L8
            DW(r5);     // Catch: java.lang.Throwable -> L8
        }

        static void j6(com.aide.ui.scm.DiffView.a r0, java.lang.String r1) {
            r0.FH(r1);
        }

        @Override
        public void DW(char r1, int r2, int r3) {
            super.DW(r1, r2, r3);
        }

        @Override
        public void DW(int r1, int r2, int r3) {
            super.DW(r1, r2, r3);
        }

        @Override
        public void DW(com.aide.engine.Enumm[] r1, int[] r2, int[] r3, int[] r4, int[] r5, int r6) {
            super.DW(r1, r2, r3, r4, r5, r6);
        }

        @Override
        public com.aide.ui.views.editor.ClassS FH(int r1) {
            return super.FH(r1);
        }

        @Override
        public void J8(int r1, int r2) {
            super.J8(r1, r2);
        }

        @Override
        public void QX(int r1, int r2) {
            super.QX(r1, r2);
        }

        @Override
        public int VH(int r1, int r2) {
            return super.VH(r1, r2);
        }

        @Override
        public boolean Ws(int r1, int r2) {
            return super.Ws(r1, r2);
        }

        @Override
        public boolean gn(int r8, int r9) {
        L12:
            th = move-exception;
            if (SI == false) goto L16;
            abcd.wu.j6(th, 733658571807984289L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L16:
            throw th;
        L3:
            if (nw == false) goto L6;
            abcd.wu.j6(733658571807984289L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
        L6:
            if (this.KD.size() <= r9) goto L10;
            if (this.KD.get(r9) != com.aide.ui.scm.DiffView.c.DW) goto L10;
            return true;
        L10:
            return false;
        }

        @Override
        public void j6(char r1, int r2, int r3) {
            super.j6(r1, r2, r3);
        }

        @Override
        public void j6(int r1, int r2, int r3, int r4, java.lang.String r5) {
            super.j6(r1, r2, r3, r4, r5);
        }

        public void j6(java.util.List<java.lang.String> r12, java.util.List<java.lang.String> r13, java.util.List<com.aide.ui.scm.ClassB.a> r14) {
        L40:
            th = move-exception;
            if (SI == false) goto L45;
            abcd.wu.j6(th, -5607053438206852760L, this, r12, r13, r14);
        L45:
            throw th;
        L3:
            if (nw == false) goto L5;
            abcd.wu.j6(-5607053438206852760L, this, r12, r13, r14);     // Catch: java.lang.Throwable -> L40
        L5:
            this.cb = null;     // Catch: java.lang.Throwable -> L40
            this.dx = null;     // Catch: java.lang.Throwable -> L40
            this.KD = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L40
            this.ro = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L40
            this.cn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L40
            this.sh = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L40
            java.io.StringWriter r0 = new java.io.StringWriter();     // Catch: java.lang.Throwable -> L40
            java.io.PrintWriter r1 = new java.io.PrintWriter(r0);     // Catch: java.lang.Throwable -> L40
            int r4 = 0;
            int r5 = -1;
        L7:
            if (r4 >= r14.size()) goto L38;
            com.aide.ui.scm.ClassB.a r6 = r14.get(r4);     // Catch: java.lang.Throwable -> L40
            int r7 = r6.j6() - 3;     // Catch: java.lang.Throwable -> L40
        L10:
            if (r7 >= r6.j6()) goto L15;
            if (r7 < r5) goto L14;
            if (r7 < 0) goto L14;
            r1.println(r13.get(r7));     // Catch: java.lang.Throwable -> L40
            this.cn.add(-1);     // Catch: java.lang.Throwable -> L40
            this.sh.add(java.lang.Integer.valueOf(r7));     // Catch: java.lang.Throwable -> L40
            this.KD.add(com.aide.ui.scm.DiffView.c.FH);     // Catch: java.lang.Throwable -> L40
            this.ro.add(java.lang.Integer.valueOf(r7));     // Catch: java.lang.Throwable -> L40
        L14:
            r7 = r7 + 1;     // Catch: java.lang.Throwable -> L40
            goto L10
        L15:
            int r8 = 0;
        L17:
            if (r8 >= r6.Hw()) goto L19;
            r1.println(r12.get(r6.FH() + r8));     // Catch: java.lang.Throwable -> L40
            this.cn.add(java.lang.Integer.valueOf(r6.FH() + r8));     // Catch: java.lang.Throwable -> L40
            this.sh.add(-1);     // Catch: java.lang.Throwable -> L40
            this.KD.add(com.aide.ui.scm.DiffView.c.j6);     // Catch: java.lang.Throwable -> L40
            this.ro.add(java.lang.Integer.valueOf(r6.j6()));     // Catch: java.lang.Throwable -> L40
            r8 = r8 + 1;     // Catch: java.lang.Throwable -> L40
            goto L17
        L19:
            int r9 = 0;
        L21:
            if (r9 >= r6.DW()) goto L23;
            r1.println(r13.get(r6.j6() + r9));     // Catch: java.lang.Throwable -> L40
            this.cn.add(-1);     // Catch: java.lang.Throwable -> L40
            this.sh.add(java.lang.Integer.valueOf(r6.j6() + r9));     // Catch: java.lang.Throwable -> L40
            this.KD.add(com.aide.ui.scm.DiffView.c.DW);     // Catch: java.lang.Throwable -> L40
            this.ro.add(java.lang.Integer.valueOf(r6.j6() + r9));     // Catch: java.lang.Throwable -> L40
            r9 = r9 + 1;     // Catch: java.lang.Throwable -> L40
            goto L21
        L23:
            int r10 = Integer.MAX_VALUE;
            int r11 = r4 + 1;     // Catch: java.lang.Throwable -> L40
            if (r11 >= r14.size()) goto L26;
            r10 = r14.get(r11).j6();     // Catch: java.lang.Throwable -> L40
        L26:
            int r15 = r6.j6() + r6.DW();     // Catch: java.lang.Throwable -> L40
            int r16 = r15 + 3;     // Catch: java.lang.Throwable -> L40
        L27:
            if (r15 >= r16) goto L33;
            if (r15 >= r10) goto L33;
            if (r15 >= r13.size()) goto L33;
            r1.println(r13.get(r15));     // Catch: java.lang.Throwable -> L40
            this.cn.add(-1);     // Catch: java.lang.Throwable -> L40
            this.sh.add(java.lang.Integer.valueOf(r15));     // Catch: java.lang.Throwable -> L40
            this.KD.add(com.aide.ui.scm.DiffView.c.FH);     // Catch: java.lang.Throwable -> L40
            this.ro.add(java.lang.Integer.valueOf(r15));     // Catch: java.lang.Throwable -> L40
            r15 = r15 + 1;     // Catch: java.lang.Throwable -> L40
        L33:
            if (r16 >= (r10 - 3)) goto L37;
            if (r4 == (r14.size() - 1)) goto L37;
            r1.println("");     // Catch: java.lang.Throwable -> L40
            this.cn.add(-1);     // Catch: java.lang.Throwable -> L40
            this.sh.add(-1);     // Catch: java.lang.Throwable -> L40
            this.KD.add(com.aide.ui.scm.DiffView.c.Hw);     // Catch: java.lang.Throwable -> L40
            this.ro.add(0);     // Catch: java.lang.Throwable -> L40
        L37:
            r5 = r16;
            r4 = r11;
            goto L7
        L38:
            r1.flush();     // Catch: java.lang.Throwable -> L40
            DW(r0.toString());     // Catch: java.lang.Throwable -> L40
        }

        public void j6(boolean r15, com.aide.engine.Enumm[] r16, int[] r17, int[] r18, int[] r19, int[] r20, int r21) {
            int r3 = 0;
            if (nw == false) goto L6;
            abcd.wu.j6(-4291566791386378392L, this, new java.lang.Object[]{new java.lang.Boolean(r15), r16, r17, r18, r19, r20, new java.lang.Integer(r21)});
        L6:
            if (r15 == false) goto L8;
            this.dx = new com.aide.engine.ClassO();
            this.dx.j6(r16, r17, r18, r19, r20, r21);
        L10:
            if (this.dx != null) goto L12;
            return;
        L12:
            if (this.cb == null) goto L35;
            com.aide.engine.ClassO r1 = ei();
            r1.j6();
            int r2 = 0;
        L15:
            if (r2 >= this.cn.size()) goto L21;
            int r4 = this.cn.get(r2).intValue();
            if (r4 == (-1)) goto L19;
            r1.j6(r2, this.dx, r4);
        L19:
            r2 = r2 + 1;
        L21:
            if (r3 >= this.sh.size()) goto L26;
            int r5 = this.sh.get(r3).intValue();
            if (r5 == (-1)) goto L25;
            r1.j6(r3, this.cb, r5);
        L25:
            r3 = r3 + 1;
            goto L21
        L26:
            P8();
            return;
        L35:
            return;
        L8:
            this.cb = new com.aide.engine.ClassO();
            this.cb.j6(r16, r17, r18, r19, r20, r21);
            goto L10
        }

        @Override
        public void j6(com.aide.engine.Enumm[] r1, int[] r2, int[] r3, int[] r4, int[] r5, int r6) {
            super.j6(r1, r2, r3, r4, r5, r6);
        }

        @Override
        public boolean j6(int r5) {
        L14:
            th = move-exception;
            if (SI == false) goto L18;
            abcd.wu.j6(th, 3176938342339038607L, this, new java.lang.Integer(r5));
        L18:
            throw th;
        L4:
            if (nw == false) goto L6;
            abcd.wu.j6(3176938342339038607L, this, r5);     // Catch: java.lang.Throwable -> L14
        L6:
            if (r5 <= 0) goto L12;
            int r3 = r5 - 1;     // Catch: java.lang.Throwable -> L14
            if (this.KD.size() <= r3) goto L12;
            if (this.KD.get(r3) != com.aide.ui.scm.DiffView.c.Hw) goto L12;
            return true;
        L12:
            return false;
        }

        @Override
        public int tp() {
            return super.tp();
        }

        @Override
        public boolean tp(int r5) {
        L8:
            th = move-exception;
            if (SI == false) goto L12;
            abcd.wu.j6(th, -1537978937404656435L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (nw == false) goto L15;
            abcd.wu.j6(-1537978937404656435L, this, r5);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }

        @Override
        public boolean u7(int r8, int r9) {
        L12:
            th = move-exception;
            if (SI == false) goto L16;
            abcd.wu.j6(th, 325838956882811336L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L16:
            throw th;
        L3:
            if (nw == false) goto L6;
            abcd.wu.j6(325838956882811336L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
        L6:
            if (this.KD.size() <= r9) goto L10;
            if (this.KD.get(r9) != com.aide.ui.scm.DiffView.c.j6) goto L10;
            return true;
        L10:
            return false;
        }

        @Override
        public void vy() {
            super.vy();
        }
    }

    @abcd.Interfacexu
    private static class b extends java.io.Reader {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 1959472078989220112L)
        private java.lang.String FH;

        @abcd.Interfaceru(field = -1236157226571306723L)
        private int Hw;

        @abcd.Interfaceru(field = -179639570537357472L)
        private int v5;

        static {
            abcd.wu.j6(com.aide.ui.scm.DiffView.b.class, 344059681158054648L, 344059681158054648L);
        }

        @abcd.Interfacesu(method = -205402445807323376L)
        public b(java.lang.String r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2761510744926703464L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2761510744926703464L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            j6(r6);     // Catch: java.lang.Throwable -> L8
        }

        @Override
        @abcd.Interfacesu(method = -2829168681434493112L)
        public void close() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -337100010472454541L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L14;
            abcd.wu.j6(-337100010472454541L, this);     // Catch: java.lang.Throwable -> L7
            return;
        }

        @abcd.Interfacesu(method = -2131931566749880125L)
        public void j6(java.lang.String r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1422684757358836452L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1422684757358836452L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = r5;     // Catch: java.lang.Throwable -> L8
            this.Hw = r5.length();     // Catch: java.lang.Throwable -> L8
            this.v5 = 0;     // Catch: java.lang.Throwable -> L8
        }

        @Override
        @abcd.Interfacesu(method = 129735231389024460L)
        public int read() {
        L17:
            th = move-exception;
            if (DW == false) goto L21;
            abcd.wu.j6(th, 1188225919907983775L, this);
        L21:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(1188225919907983775L, this);     // Catch: java.lang.Throwable -> L17
        L7:
            if (this.v5 >= this.Hw) goto L11;
            java.lang.String r2 = this.FH;     // Catch: java.lang.Throwable -> L17
            int r3 = this.v5;     // Catch: java.lang.Throwable -> L17
            this.v5 = r3 + 1;     // Catch: java.lang.Throwable -> L17
            return r2.charAt(r3);
        L11:
            if (this.v5 != this.Hw) goto L15;
            this.v5++;     // Catch: java.lang.Throwable -> L17
            return 10;
        L15:
            return -1;
        }

        @Override
        @abcd.Interfacesu(method = 1063031570219061944L)
        public int read(char[] r9, int r10, int r11) {
        L27:
            th = move-exception;
            if (DW == false) goto L31;
            abcd.wu.j6(th, 4171741386555731135L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
        L31:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(4171741386555731135L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L27
        L5:
            if (r10 < 0) goto L26;
            if (r10 > r9.length) goto L26;
            if (r11 < 0) goto L26;
            int r0 = r10 + r11;     // Catch: java.lang.Throwable -> L27
            if (r0 > r9.length) goto L26;
            if (r0 < 0) goto L26;
            if (r11 != 0) goto L16;
            return 0;
        L16:
            if (this.v5 <= this.Hw) goto L20;
            return -1;
        L20:
            if (this.v5 != this.Hw) goto L23;
            r9[r10] = '\n';     // Catch: java.lang.Throwable -> L27
            this.v5++;     // Catch: java.lang.Throwable -> L27
            return 1;
        L23:
            int r1 = java.lang.Math.min(this.Hw - this.v5, r11);     // Catch: java.lang.Throwable -> L27
            this.FH.getChars(this.v5, this.v5 + r1, r9, r10);     // Catch: java.lang.Throwable -> L27
            this.v5 += r1;     // Catch: java.lang.Throwable -> L27
            return r1;
        L26:
            throw new java.lang.IndexOutOfBoundsException();     // Catch: java.lang.Throwable -> L27
        }
    }

    @abcd.Interfacexu
    private static final enum c extends java.lang.Enum<com.aide.ui.scm.DiffView.c> {

        @abcd.Interfaceru(field = -3315372281895001020L)
        public static final com.aide.ui.scm.DiffView.c DW = null;

        @abcd.Interfaceru(field = 148399580296853895L)
        public static final com.aide.ui.scm.DiffView.c FH = null;

        @abcd.Interfaceru(field = -716603339664427657L)
        public static final com.aide.ui.scm.DiffView.c Hw = null;

        @abcd.Interfaceuu
        private static boolean VH;

        @abcd.Interfacetu
        private static boolean Zo;

        @abcd.Interfaceru(field = -3289932142681750923L)
        public static final com.aide.ui.scm.DiffView.c j6 = null;
        private static final com.aide.ui.scm.DiffView.c[] v5 = null;

        static {
            abcd.wu.j6(com.aide.ui.scm.DiffView.c.class, -643176075855783200L, -643176075855783200L);     // Catch: java.lang.Throwable -> L8
            if (Zo == false) goto L6;
            abcd.wu.j6(2422059270640380000L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new com.aide.ui.scm.DiffView.c("deleted", 0);     // Catch: java.lang.Throwable -> L8
            DW = new com.aide.ui.scm.DiffView.c("inserted", 1);     // Catch: java.lang.Throwable -> L8
            FH = new com.aide.ui.scm.DiffView.c("normal", 2);     // Catch: java.lang.Throwable -> L8
            Hw = new com.aide.ui.scm.DiffView.c("separator", 3);     // Catch: java.lang.Throwable -> L8
            v5 = new com.aide.ui.scm.DiffView.c[]{j6, DW, FH, Hw};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, 2422059270640380000L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = -109728416929794048L)
        private c(java.lang.String r8, int r9) {
        L7:
            th = move-exception;
            if (VH == false) goto L11;
            abcd.wu.j6(th, -6331272462828957300L, null, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (Zo == false) goto L5;
            abcd.wu.j6(-6331272462828957300L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 650836046562999087L)
        public static com.aide.ui.scm.DiffView.c valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, -205199222549346272L, null, r5);
        L12:
            throw th;
        L4:
            if (Zo == false) goto L6;
            abcd.wu.j6(-205199222549346272L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.ui.scm.DiffView.c) java.lang.Enum.valueOf(com.aide.ui.scm.DiffView.c.class, r5);
        }

        @abcd.Interfacesu(method = 981975102083389773L)
        public static com.aide.ui.scm.DiffView.c[] values() {
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, -1583076517914858000L, null);
        L12:
            throw th;
        L4:
            if (Zo == false) goto L6;
            abcd.wu.j6(-1583076517914858000L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.ui.scm.DiffView.c[]) v5.clone();
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.scm.DiffView.class, -2208139259786690749L, -2208139259786690749L);
    }

    public DiffView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 995507978695068615L, null, r6);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(995507978695068615L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        this.QX = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        rN();     // Catch: java.lang.Throwable -> L8
    }

    public DiffView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (J8 == false) goto L11;
        abcd.wu.j6(th, -426445272046881660L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (J0 == false) goto L5;
        abcd.wu.j6(-426445272046881660L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.QX = new java.lang.Object();     // Catch: java.lang.Throwable -> L7
        rN();     // Catch: java.lang.Throwable -> L7
    }

    public DiffView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (J8 == false) goto L11;
        abcd.wu.j6(th, 3016008985590151361L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (J0 == false) goto L5;
        abcd.wu.j6(3016008985590151361L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        this.QX = new java.lang.Object();     // Catch: java.lang.Throwable -> L7
        rN();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 6296053236678548421L)
    private java.util.List<java.lang.String> j6(java.lang.String r8, java.lang.StringBuilder r9) {
    L26:
        th = move-exception;
        if (J8 == false) goto L31;
        abcd.wu.j6(th, -3409178666275389900L, this, r8, r9);
    L31:
        throw th;
    L3:
        if (J0 == false) goto L5;
        abcd.wu.j6(-3409178666275389900L, this, r8, r9);     // Catch: java.lang.Throwable -> L26
    L5:
        if (r8 == null) goto L25;
        if (new java.io.File(r8).exists() == false) goto L25;
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L26
        java.io.Reader r1 = abcd.Vl.lg(r8);     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L26
        com.aide.ui.scm.ClassC r3 = new com.aide.ui.scm.ClassC(this, r0, r9);     // Catch: java.lang.Throwable -> L18
        com.aide.ui.views.editor.ra.j6(r1, r3, new char[1024]);     // Catch: java.lang.Throwable -> L18
        java.io.BufferedReader r2 = new java.io.BufferedReader(r1);     // Catch: java.lang.Throwable -> L18
    L12:
        java.lang.String r4 = r2.readLine();     // Catch: java.lang.Throwable -> L18
        if (r4 == null) goto L16;
        r0.add(r4);     // Catch: java.lang.Throwable -> L18
        goto L12
    L16:
        r1.close();     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L26
        return r0;
    L18:
        th = move-exception;
        r1.close();     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L26
        throw th;     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L26
    L21:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L26
        return java.util.Collections.emptyList();
    L25:
        return java.util.Collections.emptyList();
    }

    @abcd.Interfacesu(method = 2506261604080349775L)
    private void rN() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -1915893125802515200L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-1915893125802515200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Ws = new com.aide.ui.scm.DiffView.a(this);     // Catch: java.lang.Throwable -> L8
        getOEditorView().setModel(this.Ws);     // Catch: java.lang.Throwable -> L8
        getOEditorView().setEditable(false);     // Catch: java.lang.Throwable -> L8
        getOEditorView().setCaretVisibility(false);     // Catch: java.lang.Throwable -> L8
        this.j3 = new com.aide.common.KeyStrokeDetector(getContext());     // Catch: java.lang.Throwable -> L8
    }

    public void a8() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 387079889831802768L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(387079889831802768L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        setIsLightTheme(com.aide.ui.aa.lg());     // Catch: java.lang.Throwable -> L8
        getOEditorView().setTabSize(com.aide.ui.aa.cn());     // Catch: java.lang.Throwable -> L8
        getOEditorView().setInsertTabsAsSpaces(com.aide.ui.aa.a8());     // Catch: java.lang.Throwable -> L8
        getOEditorView().setFontSize(com.aide.ui.aa.tp());     // Catch: java.lang.Throwable -> L8
    }

    public com.aide.ui.scm.DiffView.a getDiffViewModel() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, -1843515684582880245L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-1843515684582880245L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Ws;
    }

    @Override
    public com.aide.common.KeyStrokeDetector getKeyStrokeDetector() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 4042976247959491595L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(4042976247959491595L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.j3;
    }

    public void j6(com.aide.engine.FileHighlightings r13) {
    L25:
        th = move-exception;
        if (J8 == false) goto L29;
        abcd.wu.j6(th, -934210217849879579L, this, r13);
    L29:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(-934210217849879579L, this, r13);     // Catch: java.lang.Throwable -> L25
    L6:
        java.lang.Object r2 = this.QX;     // Catch: java.lang.Throwable -> L25
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L25
    L22:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L25
    L9:
        if (r13.tp != this.XL) goto L11;
    L14:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L22
        if (r13.tp != this.XL) goto L19;
        this.Ws.j6(true, r13.Hw, r13.v5, r13.Zo, r13.VH, r13.gn, r13.u7);     // Catch: java.lang.Throwable -> L25
        return;
    L19:
        if (r13.tp != this.aM) goto L33;
        this.Ws.j6(false, r13.Hw, r13.v5, r13.Zo, r13.VH, r13.gn, r13.u7);     // Catch: java.lang.Throwable -> L25
        return;
    L33:
        return;
    L11:
        if (r13.tp == this.aM) goto L14;
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L22
    }

    public void j6(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
    L23:
        th = move-exception;
        if (J8 == false) goto L27;
        abcd.wu.j6(th, -7071736865925709887L, this, r9, r10, r11);
    L27:
        throw th;
    L3:
        if (J0 == false) goto L5;
        abcd.wu.j6(-7071736865925709887L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L23
    L5:
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L23
        java.util.List<java.lang.String> r1 = j6(r9, r0);     // Catch: java.lang.Throwable -> L23
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L23
        java.util.List<java.lang.String> r3 = j6(r10, r2);     // Catch: java.lang.Throwable -> L23
        java.util.List<com.aide.ui.scm.ClassB.a> r4 = com.aide.ui.scm.ClassB.j6(r1, r3);     // Catch: java.lang.Throwable -> L23
        if (r4.size() == 0) goto L8;
    L10:
        this.Ws.j6(r1, r3, r4);     // Catch: java.lang.Throwable -> L23
        getOEditorView().v5(0, 0);     // Catch: java.lang.Throwable -> L23
        getOEditorView().setSoftMaxWidthRealColumn(-1);     // Catch: java.lang.Throwable -> L23
        java.lang.Object r5 = this.QX;     // Catch: java.lang.Throwable -> L23
        monitor-enter(r5);     // Catch: java.lang.Throwable -> L23
    L20:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L23
    L13:
        if (r1.size() == 0) goto L16;
        this.XL = com.aide.ui.U.EQ().DW(r11, r9);     // Catch: java.lang.Throwable -> L20
    L16:
        if (r3.size() == 0) goto L18;
        this.aM = com.aide.ui.U.EQ().DW(r11, r10);     // Catch: java.lang.Throwable -> L20
    L18:
        monitor-exit(r5);     // Catch: java.lang.Throwable -> L20
        return;
    L8:
        if (r0.toString().equals(r2.toString()) == true) goto L10;
        setInformationalContent("Only the line separators differ");     // Catch: java.lang.Throwable -> L23
    }

    public void lg() {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 2564329294907786848L, this);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(2564329294907786848L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Ws.j6(java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList());     // Catch: java.lang.Throwable -> L8
    }

    public void setInformationalContent(java.lang.String r6) {
    L8:
        th = move-exception;
        if (J8 == false) goto L12;
        abcd.wu.j6(th, 2716955397185413032L, this, r6);
    L12:
        throw th;
    L4:
        if (J0 == false) goto L6;
        abcd.wu.j6(2716955397185413032L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.scm.DiffView.a.j6(this.Ws, "\n >>> " + r6 + "\n");     // Catch: java.lang.Throwable -> L8
        getOEditorView().v5(0, 0);     // Catch: java.lang.Throwable -> L8
        getOEditorView().setSoftMaxWidthRealColumn(-1);     // Catch: java.lang.Throwable -> L8
    }
}
