package com.aide.ui.views.editor;

@abcd.Interfacexu
public class va {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2724417494531810728L)
    private boolean EQ;

    @abcd.Interfaceru(field = 4782722753914987092L)
    private int FH;

    @abcd.Interfaceru(field = 3214872589193513607L)
    private java.util.Vector<com.aide.ui.views.editor.va.b> Hw;

    @abcd.Interfaceru(field = -551340116666529720L)
    private java.util.List<com.aide.ui.views.editor.va.g> VH;

    @abcd.Interfaceru(field = 659266929026161600L)
    private int Zo;

    @abcd.Interfaceru(field = 571158782468205280L)
    private abcd.fm gn;

    @abcd.Interfaceru(field = 2733736029107475652L)
    private boolean tp;

    @abcd.Interfaceru(field = 4389503699248078125L)
    private boolean u7;

    @abcd.Interfaceru(field = -4607851757110847568L)
    private int v5;

    @abcd.Interfaceru(field = -276805489635223500L)
    private com.aide.ui.views.editor.ClassG we;

    @abcd.Interfacexu
    class a extends com.aide.ui.views.editor.va.b {

        @abcd.Interfaceuu
        private static boolean Zo;

        @abcd.Interfacetu
        private static boolean v5;

        @abcd.Interfaceru(field = 1626050423073139917L)
        java.util.Vector<com.aide.ui.views.editor.va.b> VH;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va gn;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.a.class, -3620296247909045877L, -3620296247909045877L);
        }

        @abcd.Interfacesu(method = -107674805472326684L)
        public a(com.aide.ui.views.editor.va r8, abcd.fm r9) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 4178189817492492567L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(4178189817492492567L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.gn = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
            this.VH = new java.util.Vector();     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -7805117538865500160L)
        public a(com.aide.ui.views.editor.va r10, abcd.fm r11, com.aide.ui.views.editor.va.b r12, com.aide.ui.views.editor.va.b r13) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 282748282793739563L, null, r10, r11, r12, r13);
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(282748282793739563L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        L5:
            this.gn = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11);     // Catch: java.lang.Throwable -> L7
            this.VH = new java.util.Vector();     // Catch: java.lang.Throwable -> L7
            this.VH.addElement(r12);     // Catch: java.lang.Throwable -> L7
            this.VH.addElement(r13);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -3229444395573620103L)
        public com.aide.ui.views.editor.va.b DW() {
        L11:
            th = move-exception;
            if (Zo == false) goto L16;
            abcd.wu.j6(th, 5083046418004879471L, this);
        L16:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(5083046418004879471L, this);     // Catch: java.lang.Throwable -> L11
        L6:
            com.aide.ui.views.editor.va.a r2 = new com.aide.ui.views.editor.va.a(this.gn, null);     // Catch: java.lang.Throwable -> L11
            int r3 = this.VH.size() - 1;     // Catch: java.lang.Throwable -> L11
        L7:
            if (r3 < 0) goto L10;
            r2.VH.addElement(this.VH.elementAt(r3).DW());     // Catch: java.lang.Throwable -> L11
            r3 = r3 - 1;
            goto L7
        L10:
            return r2;
        }

        @Override
        @abcd.Interfacesu(method = 209884711551030792L)
        public void j6(com.aide.ui.views.editor.ClassG r5) {
        L12:
            th = move-exception;
            if (Zo == false) goto L17;
            abcd.wu.j6(th, -94194311398794828L, this, r5);
        L17:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-94194311398794828L, this, r5);     // Catch: java.lang.Throwable -> L12
        L6:
            int r2 = 0;
        L7:
            if (r2 >= this.VH.size()) goto L11;
            this.VH.elementAt(r2).j6(r5);     // Catch: java.lang.Throwable -> L12
            r2 = r2 + 1;
            goto L7
        }

        @Override
        @abcd.Interfacesu(method = 4172485550991436448L)
        public boolean j6(com.aide.ui.views.editor.va.b r5) {
        L14:
            th = move-exception;
            if (Zo == false) goto L18;
            abcd.wu.j6(th, -7501904528002448160L, this, r5);
        L18:
            throw th;
        L4:
            if (v5 == false) goto L7;
            abcd.wu.j6(-7501904528002448160L, this, r5);     // Catch: java.lang.Throwable -> L14
        L7:
            if (this.VH.size() != 0) goto L9;
            this.VH.addElement(r5);     // Catch: java.lang.Throwable -> L14
            return true;
        L9:
            if (this.VH.lastElement().j6(r5) == true) goto L20;
            this.VH.addElement(r5);     // Catch: java.lang.Throwable -> L14
            return true;
        L20:
            return true;
        }
    }

    @abcd.Interfacexu
    abstract class b {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -3285402068001834216L)
        private abcd.fm FH;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va Hw;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.b.class, 1438759628179638912L, 1438759628179638912L);
        }

        @abcd.Interfacesu(method = -2862603343437358320L)
        protected b(com.aide.ui.views.editor.va r8, abcd.fm r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 5147859381718535244L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(5147859381718535244L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
        }

        public abstract com.aide.ui.views.editor.va.b DW();

        @abcd.Interfacesu(method = -249103371749412375L)
        public abcd.fm j6() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 260307237177839499L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(260307237177839499L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.FH;
        }

        public abstract void j6(com.aide.ui.views.editor.ClassG r1);

        public abstract boolean j6(com.aide.ui.views.editor.va.b r1);
    }

    @abcd.Interfacexu
    class c extends com.aide.ui.views.editor.va.i {

        @abcd.Interfaceuu
        private static boolean EQ;

        @abcd.Interfacetu
        private static boolean tp;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va we;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.c.class, 7022508235177747195L, 7022508235177747195L);
        }

        @abcd.Interfacesu(method = -89005553727077185L)
        public c(com.aide.ui.views.editor.va r10, abcd.fm r11, abcd.hm r12, char r13) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, 3086671701206640467L, null, r10, r11, r12, new java.lang.Character(r13));
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(3086671701206640467L, null, r10, r11, r12, new java.lang.Character(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 167548313203168008L)
        public c(com.aide.ui.views.editor.va r10, abcd.fm r11, abcd.hm r12, java.lang.String r13) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, -100639308205867992L, null, r10, r11, r12, r13);
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(-100639308205867992L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -536166038317035075L)
        public c(com.aide.ui.views.editor.va r8, com.aide.ui.views.editor.va.h r9) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, -173540459434166223L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(-173540459434166223L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 895250687425318503L)
        public com.aide.ui.views.editor.va.b DW() {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, -2845936977018532560L, this);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(-2845936977018532560L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return new com.aide.ui.views.editor.va.h(this.we, this);
        }

        @Override
        @abcd.Interfacesu(method = 349149372573636256L)
        public void j6(com.aide.ui.views.editor.ClassG r7) {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, -6847311438842232285L, this, r7);
        L12:
            throw th;
        L4:
            if (tp == false) goto L14;
            abcd.wu.j6(-6847311438842232285L, this, r7);     // Catch: java.lang.Throwable -> L8
        L14:
            r7.j6(this.VH.FH(), this.VH.Hw(), new java.io.StringReader(this.gn.toString()), this.we);     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L8
            return;
        }

        @Override
        @abcd.Interfacesu(method = -5027538933730721100L)
        public boolean j6(com.aide.ui.views.editor.va.b r7) {
        L24:
            th = move-exception;
            if (EQ == false) goto L28;
            abcd.wu.j6(th, -5132148096750893621L, this, r7);
        L28:
            throw th;
        L4:
            if (tp == false) goto L7;
            abcd.wu.j6(-5132148096750893621L, this, r7);     // Catch: java.lang.Throwable -> L24
        L7:
            if ((r7 instanceof com.aide.ui.views.editor.va.c) == false) goto L15;
            com.aide.ui.views.editor.va.c r2 = (com.aide.ui.views.editor.va.c) r7;     // Catch: java.lang.Throwable -> L24
            if (r2.VH.Hw() == this.VH.DW()) goto L11;
            return false;
        L11:
            if (r2.VH.FH() != (this.VH.j6() + 1)) goto L30;
            this.gn.append(r2.gn.toString());     // Catch: java.lang.Throwable -> L24
            this.VH.j6(r2.VH.j6());     // Catch: java.lang.Throwable -> L24
            this.VH.DW(r2.VH.DW());     // Catch: java.lang.Throwable -> L24
            return true;
        L30:
            return false;
        L15:
            if ((r7 instanceof com.aide.ui.views.editor.va.e) == false) goto L31;
            com.aide.ui.views.editor.va.e r3 = (com.aide.ui.views.editor.va.e) r7;     // Catch: java.lang.Throwable -> L24
            if (r3.Hw() == this.VH.DW()) goto L19;
            return false;
        L19:
            if (r3.FH() != (this.VH.j6() + 1)) goto L33;
            this.gn.append('\n');     // Catch: java.lang.Throwable -> L24
            this.VH.j6(-1);     // Catch: java.lang.Throwable -> L24
            this.VH.DW(this.VH.DW() + 1);     // Catch: java.lang.Throwable -> L24
            return true;
        L33:
            return false;
        L31:
            return false;
        }
    }

    @abcd.Interfacexu
    abstract class d extends com.aide.ui.views.editor.va.b {

        @abcd.Interfaceuu
        private static boolean Zo;

        @abcd.Interfacetu
        private static boolean v5;

        @abcd.Interfaceru(field = 2478488237030312208L)
        int VH;

        @abcd.Interfaceru(field = -2094444105717284320L)
        int gn;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va u7;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.d.class, -4388110033657633115L, -4388110033657633115L);
        }

        @abcd.Interfacesu(method = -7316779070336628852L)
        protected d(com.aide.ui.views.editor.va r10, abcd.fm r11, int r12, int r13) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 4269626593996290627L, null, r10, r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(4269626593996290627L, null, r10, r11, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this.u7 = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11);     // Catch: java.lang.Throwable -> L7
            this.VH = r12;     // Catch: java.lang.Throwable -> L7
            this.gn = r13;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 7713430580643574267L)
        protected d(com.aide.ui.views.editor.va r8, com.aide.ui.views.editor.va.d r9) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 2957721107432743696L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(2957721107432743696L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.u7 = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, null);     // Catch: java.lang.Throwable -> L7
            this.VH = r9.VH;     // Catch: java.lang.Throwable -> L7
            this.gn = r9.gn;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 2761078392910007325L)
        public int FH() {
        L8:
            th = move-exception;
            if (Zo == false) goto L12;
            abcd.wu.j6(th, -325302996367937863L, this);
        L12:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-325302996367937863L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.VH;
        }

        @abcd.Interfacesu(method = -1242167836765822971L)
        public int Hw() {
        L8:
            th = move-exception;
            if (Zo == false) goto L12;
            abcd.wu.j6(th, -189951468283070631L, this);
        L12:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-189951468283070631L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.gn;
        }
    }

    @abcd.Interfacexu
    class e extends com.aide.ui.views.editor.va.d {

        @abcd.Interfaceuu
        private static boolean EQ;

        @abcd.Interfacetu
        private static boolean tp;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va we;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.e.class, 720871569698903160L, 720871569698903160L);
        }

        @abcd.Interfacesu(method = 3091777912061465952L)
        public e(com.aide.ui.views.editor.va r10, abcd.fm r11, int r12, int r13) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, -1457194715467910496L, null, r10, r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(-1457194715467910496L, null, r10, r11, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 119500895066992636L)
        public e(com.aide.ui.views.editor.va r8, com.aide.ui.views.editor.va.f r9) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, -3603935800505160920L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(-3603935800505160920L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 2963987527596970221L)
        public com.aide.ui.views.editor.va.b DW() {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, -3470170598383940349L, this);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(-3470170598383940349L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return new com.aide.ui.views.editor.va.f(this.we, this);
        }

        @Override
        @abcd.Interfacesu(method = -66703633146907760L)
        public void j6(com.aide.ui.views.editor.ClassG r6) {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, 449974227936093820L, this, r6);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(449974227936093820L, this, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            r6.j6(this.VH, this.gn, this.we);     // Catch: java.lang.Throwable -> L8
        }

        @Override
        @abcd.Interfacesu(method = 1267528408855137968L)
        public boolean j6(com.aide.ui.views.editor.va.b r5) {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, 2310197876871521472L, this, r5);
        L12:
            throw th;
        L4:
            if (tp == false) goto L15;
            abcd.wu.j6(2310197876871521472L, this, r5);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }
    }

    @abcd.Interfacexu
    class f extends com.aide.ui.views.editor.va.d {

        @abcd.Interfaceuu
        private static boolean EQ;

        @abcd.Interfacetu
        private static boolean tp;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va we;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.f.class, -3625794670126781997L, -3625794670126781997L);
        }

        @abcd.Interfacesu(method = -4337593137123470941L)
        public f(com.aide.ui.views.editor.va r10, abcd.fm r11, int r12, int r13) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, 48863946136932816L, null, r10, r11, new java.lang.Integer(r12), new java.lang.Integer(r13));
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(48863946136932816L, null, r10, r11, new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -6507639524783295811L)
        public f(com.aide.ui.views.editor.va r8, com.aide.ui.views.editor.va.e r9) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, 405949296224712340L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(405949296224712340L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -2950490311044851540L)
        public com.aide.ui.views.editor.va.b DW() {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, -3421368656480105604L, this);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(-3421368656480105604L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return new com.aide.ui.views.editor.va.e(this.we, this);
        }

        @Override
        @abcd.Interfacesu(method = 505850255841011515L)
        public void j6(com.aide.ui.views.editor.ClassG r5) {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, 182200450811531243L, this, r5);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(182200450811531243L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            r5.j6(this.gn, this.we);     // Catch: java.lang.Throwable -> L8
        }

        @Override
        @abcd.Interfacesu(method = 3565960215535500987L)
        public boolean j6(com.aide.ui.views.editor.va.b r5) {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, 6288888247788626443L, this, r5);
        L12:
            throw th;
        L4:
            if (tp == false) goto L15;
            abcd.wu.j6(6288888247788626443L, this, r5);     // Catch: java.lang.Throwable -> L8
            return false;
        L15:
            return false;
        }
    }

    @abcd.Interfacexu
    private static class g {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -3456590081099932329L)
        public int FH;

        @abcd.Interfaceru(field = -2190255284969858304L)
        public com.aide.ui.views.editor.va.j Hw;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.g.class, -83077752623814351L, -83077752623814351L);
        }

        @abcd.Interfacesu(method = 137722409209815303L)
        public g(int r8, com.aide.ui.views.editor.va.j r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -520329867138845148L, null, new java.lang.Integer(r8), r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-520329867138845148L, null, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r8;     // Catch: java.lang.Throwable -> L7
            this.Hw = r9;     // Catch: java.lang.Throwable -> L7
        }
    }

    @abcd.Interfacexu
    class h extends com.aide.ui.views.editor.va.i {

        @abcd.Interfaceuu
        private static boolean EQ;

        @abcd.Interfacetu
        private static boolean tp;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va we;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.h.class, 1891639545270625536L, 1891639545270625536L);
        }

        @abcd.Interfacesu(method = 3423510407587322872L)
        public h(com.aide.ui.views.editor.va r10, abcd.fm r11, abcd.hm r12, char r13) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, -3979615427603839725L, null, r10, r11, r12, new java.lang.Character(r13));
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(-3979615427603839725L, null, r10, r11, r12, new java.lang.Character(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 163389587907230125L)
        public h(com.aide.ui.views.editor.va r10, abcd.fm r11, abcd.hm r12, java.lang.String r13) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, -518570380147329048L, null, r10, r11, r12, r13);
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(-518570380147329048L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 335673432640640080L)
        public h(com.aide.ui.views.editor.va r8, com.aide.ui.views.editor.va.c r9) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, 2375843050760863485L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(2375843050760863485L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.we = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = 5392667533892446260L)
        public com.aide.ui.views.editor.va.b DW() {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, -4451837035946748975L, this);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(-4451837035946748975L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return new com.aide.ui.views.editor.va.c(this.we, this);
        }

        @Override
        @abcd.Interfacesu(method = 273550368559695935L)
        public void j6(com.aide.ui.views.editor.ClassG r5) {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, 7009305524007497384L, this, r5);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(7009305524007497384L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            r5.j6(this.VH, this.we);     // Catch: java.lang.Throwable -> L8
        }

        @Override
        @abcd.Interfacesu(method = -120588322841947385L)
        public boolean j6(com.aide.ui.views.editor.va.b r14) {
        L39:
            th = move-exception;
            if (EQ == false) goto L43;
            abcd.wu.j6(th, -1864826273751146640L, this, r14);
        L43:
            throw th;
        L4:
            if (tp == false) goto L7;
            abcd.wu.j6(-1864826273751146640L, this, r14);     // Catch: java.lang.Throwable -> L39
        L7:
            if ((r14 instanceof com.aide.ui.views.editor.va.h) == false) goto L25;
            com.aide.ui.views.editor.va.h r2 = (com.aide.ui.views.editor.va.h) r14;     // Catch: java.lang.Throwable -> L39
            int r5 = this.VH.Hw();     // Catch: java.lang.Throwable -> L39
            int r6 = this.VH.FH();     // Catch: java.lang.Throwable -> L39
            int r7 = this.VH.DW();     // Catch: java.lang.Throwable -> L39
            int r8 = this.VH.j6();     // Catch: java.lang.Throwable -> L39
            int r9 = r2.VH.Hw();     // Catch: java.lang.Throwable -> L39
            int r10 = r2.VH.FH();     // Catch: java.lang.Throwable -> L39
            int r11 = r2.VH.DW();     // Catch: java.lang.Throwable -> L39
            int r12 = r2.VH.j6();     // Catch: java.lang.Throwable -> L39
            if (r9 != r5) goto L16;
            if (r10 != r6) goto L16;
            this.gn.append(r2.gn.toString());     // Catch: java.lang.Throwable -> L39
            if (r9 != r11) goto L14;
            this.VH.j6(((r8 + r12) - r10) + 1);     // Catch: java.lang.Throwable -> L39
        L15:
            return true;
        L14:
            this.VH.j6(r12);     // Catch: java.lang.Throwable -> L39
            this.VH.DW((r7 + r11) - r9);     // Catch: java.lang.Throwable -> L39
        L16:
            if (r11 == r5) goto L18;
        L38:
            return false;
        L18:
            if (r12 != (r6 - 1)) goto L38;
            this.gn.insert(0, r2.gn);     // Catch: java.lang.Throwable -> L39
            if (r9 != r11) goto L22;
            this.VH.FH(r10);     // Catch: java.lang.Throwable -> L39
        L23:
            return true;
        L22:
            this.VH.FH(r10);     // Catch: java.lang.Throwable -> L39
            this.VH.Hw(r9);     // Catch: java.lang.Throwable -> L39
            goto L23
        L25:
            if ((r14 instanceof com.aide.ui.views.editor.va.f) == false) goto L38;
            com.aide.ui.views.editor.va.f r3 = (com.aide.ui.views.editor.va.f) r14;     // Catch: java.lang.Throwable -> L39
            if (r3.Hw() != this.VH.Hw()) goto L33;
            if (r3.FH() != this.VH.FH()) goto L33;
            this.gn.append('\n');     // Catch: java.lang.Throwable -> L39
            this.VH.j6(-1);     // Catch: java.lang.Throwable -> L39
            this.VH.DW(this.VH.DW() + 1);     // Catch: java.lang.Throwable -> L39
            return true;
        L33:
            if (r3.Hw() != (this.VH.Hw() - 1)) goto L38;
            if (this.VH.FH() != 0) goto L38;
            this.gn.insert(0, '\n');     // Catch: java.lang.Throwable -> L39
            this.VH.FH(r3.FH());     // Catch: java.lang.Throwable -> L39
            this.VH.Hw(this.VH.Hw() - 1);     // Catch: java.lang.Throwable -> L39
            return true;
        }
    }

    @abcd.Interfacexu
    abstract class i extends com.aide.ui.views.editor.va.b {

        @abcd.Interfaceuu
        private static boolean Zo;

        @abcd.Interfacetu
        private static boolean v5;

        @abcd.Interfaceru(field = 2598188816226223383L)
        protected abcd.hm VH;

        @abcd.Interfaceru(field = 1720897741372063371L)
        protected java.lang.StringBuffer gn;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va u7;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.i.class, 4418729315096096349L, 4418729315096096349L);
        }

        @abcd.Interfacesu(method = 3383138944805573888L)
        protected i(com.aide.ui.views.editor.va r10, abcd.fm r11, abcd.hm r12, char r13) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 227123242790577617L, null, r10, r11, r12, new java.lang.Character(r13));
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(227123242790577617L, null, r10, r11, r12, new java.lang.Character(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this.u7 = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11);     // Catch: java.lang.Throwable -> L7
            java.lang.StringBuffer r0 = new java.lang.StringBuffer();     // Catch: java.lang.Throwable -> L7
            r0.append(r13);     // Catch: java.lang.Throwable -> L7
            this.gn = r0;     // Catch: java.lang.Throwable -> L7
            this.VH = r12;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 100490803382289031L)
        protected i(com.aide.ui.views.editor.va r10, abcd.fm r11, abcd.hm r12, java.lang.String r13) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 221268389970862608L, null, r10, r11, r12, r13);
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(221268389970862608L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        L5:
            this.u7 = r10;     // Catch: java.lang.Throwable -> L7
            super(r10, r11);     // Catch: java.lang.Throwable -> L7
            this.gn = new java.lang.StringBuffer(r13);     // Catch: java.lang.Throwable -> L7
            this.VH = r12;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 3729619364131743300L)
        protected i(com.aide.ui.views.editor.va r8, com.aide.ui.views.editor.va.i r9) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, -62965559946536415L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(-62965559946536415L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.u7 = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, null);     // Catch: java.lang.Throwable -> L7
            this.VH = r9.VH;     // Catch: java.lang.Throwable -> L7
            this.gn = r9.gn;     // Catch: java.lang.Throwable -> L7
        }
    }

    public interface j {
    }

    @abcd.Interfacexu
    class k extends com.aide.ui.views.editor.va.b {

        @abcd.Interfaceuu
        private static boolean Zo;

        @abcd.Interfacetu
        private static boolean v5;

        @abcd.Interfacevu
        final com.aide.ui.views.editor.va EQ;

        @abcd.Interfaceru(field = -1658841207464378611L)
        int VH;

        @abcd.Interfaceru(field = 2585817773733203373L)
        int gn;

        @abcd.Interfaceru(field = 881699447245591296L)
        char[] tp;

        @abcd.Interfaceru(field = 2602186740783949125L)
        char[] u7;

        static {
            abcd.wu.j6(com.aide.ui.views.editor.va.k.class, -5671206475259852085L, -5671206475259852085L);
        }

        @abcd.Interfacesu(method = 2113605729448437007L)
        public k(com.aide.ui.views.editor.va r7, abcd.fm r8, int r9, int r10, char[] r11, char[] r12) {
            if (v5 == false) goto L5;
            abcd.wu.j6(-4698393692546487120L, null, new java.lang.Object[]{r7, r8, new java.lang.Integer(r9), new java.lang.Integer(r10), r11, r12});
        L5:
            this.EQ = r7;
            super(r7, r8);
            this.VH = r10;
            this.gn = r9;
            this.tp = r12;
            this.u7 = r11;
        }

        @abcd.Interfacesu(method = 156147901048549568L)
        public k(com.aide.ui.views.editor.va r8, com.aide.ui.views.editor.va.k r9) {
        L7:
            th = move-exception;
            if (Zo == false) goto L11;
            abcd.wu.j6(th, 2196461760567674695L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(2196461760567674695L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.EQ = r8;     // Catch: java.lang.Throwable -> L7
            super(r8, null);     // Catch: java.lang.Throwable -> L7
            this.u7 = r9.tp;     // Catch: java.lang.Throwable -> L7
            this.tp = r9.u7;     // Catch: java.lang.Throwable -> L7
            this.VH = r9.VH;     // Catch: java.lang.Throwable -> L7
            this.gn = r9.gn;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -102020871097405312L)
        private char[] j6(char[] r8, char[] r9) {
        L12:
            th = move-exception;
            if (Zo == false) goto L16;
            abcd.wu.j6(th, 2517668243924204888L, this, r8, r9);
        L16:
            throw th;
        L3:
            if (v5 == false) goto L5;
            abcd.wu.j6(2517668243924204888L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
        L5:
            char[] r0 = new char[r8.length + r9.length];     // Catch: java.lang.Throwable -> L12
            if (r8.length == 0) goto L9;
            java.lang.System.arraycopy(r8, 0, r0, 0, r8.length);     // Catch: java.lang.Throwable -> L12
        L9:
            if (r9.length == 0) goto L11;
            java.lang.System.arraycopy(r9, 0, r0, r8.length, r9.length);     // Catch: java.lang.Throwable -> L12
        L11:
            return r0;
        }

        @Override
        @abcd.Interfacesu(method = 1054255145208657408L)
        public com.aide.ui.views.editor.va.b DW() {
        L8:
            th = move-exception;
            if (Zo == false) goto L12;
            abcd.wu.j6(th, -10803691794907116L, this);
        L12:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(-10803691794907116L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return new com.aide.ui.views.editor.va.k(this.EQ, this);
        }

        @Override
        @abcd.Interfacesu(method = -312398544234862701L)
        public void j6(com.aide.ui.views.editor.ClassG r7) {
        L8:
            th = move-exception;
            if (Zo == false) goto L12;
            abcd.wu.j6(th, 99892496812752959L, this, r7);
        L12:
            throw th;
        L4:
            if (v5 == false) goto L6;
            abcd.wu.j6(99892496812752959L, this, r7);     // Catch: java.lang.Throwable -> L8
        L6:
            r7.j6(this.VH, this.gn, this.u7.length, this.EQ);     // Catch: java.lang.Throwable -> L8
            r7.j6(this.VH, this.gn, this.tp, this.EQ);     // Catch: java.lang.Throwable -> L8
        }

        @Override
        @abcd.Interfacesu(method = -1261825426720028965L)
        public boolean j6(com.aide.ui.views.editor.va.b r7) {
        L17:
            th = move-exception;
            if (Zo == false) goto L21;
            abcd.wu.j6(th, 6333237747989675271L, this, r7);
        L21:
            throw th;
        L4:
            if (v5 == false) goto L7;
            abcd.wu.j6(6333237747989675271L, this, r7);     // Catch: java.lang.Throwable -> L17
        L7:
            if ((r7 instanceof com.aide.ui.views.editor.va.k) == false) goto L15;
            com.aide.ui.views.editor.va.k r2 = (com.aide.ui.views.editor.va.k) r7;     // Catch: java.lang.Throwable -> L17
            if (r2.gn == this.gn) goto L11;
            return false;
        L11:
            if (r2.VH != (this.VH + this.tp.length)) goto L25;
            this.tp = j6(this.tp, r2.tp);     // Catch: java.lang.Throwable -> L17
            this.u7 = j6(this.u7, r2.u7);     // Catch: java.lang.Throwable -> L17
            return true;
        L25:
            return false;
        L15:
            return false;
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.views.editor.va.class, 1249987746797568L, 1249987746797568L);
    }

    public va(com.aide.ui.views.editor.ClassG r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 506561421172831871L, null, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(506561421172831871L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.we = r8;     // Catch: java.lang.Throwable -> L7
        this.VH = new java.util.ArrayList(3);     // Catch: java.lang.Throwable -> L7
        this.Hw = new java.util.Vector();     // Catch: java.lang.Throwable -> L7
        this.v5 = 0;     // Catch: java.lang.Throwable -> L7
        this.Zo = 0;     // Catch: java.lang.Throwable -> L7
        j6(r9);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 2878018346697557281L)
    private void DW(int r9) {
    L24:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, -1080196837532009221L, this, new java.lang.Integer(r9));
    L29:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1080196837532009221L, this, r9);     // Catch: java.lang.Throwable -> L24
    L6:
        int r2 = 0;
        int r3 = 0;
    L7:
        if (r3 >= r9) goto L13;
        int r4 = 0;
    L10:
        if (r4 >= (this.Hw.size() - 1)) goto L12;
        int r7 = r4 + 1;     // Catch: java.lang.Throwable -> L24
        this.Hw.setElementAt(this.Hw.elementAt(r7), r4);     // Catch: java.lang.Throwable -> L24
        r4 = r7;
        goto L10
    L12:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L24
        goto L7
    L13:
        this.Hw.setSize(this.Hw.size() - r9);     // Catch: java.lang.Throwable -> L24
        this.Zo -= r9;     // Catch: java.lang.Throwable -> L24
        if (this.Zo >= 0) goto L16;
        this.Zo = -1;     // Catch: java.lang.Throwable -> L24
    L16:
        if (r2 >= this.VH.size()) goto L23;
        com.aide.ui.views.editor.va.g r5 = this.VH.get(r2);     // Catch: java.lang.Throwable -> L24
        r5.FH -= r9;     // Catch: java.lang.Throwable -> L24
        if (r5.FH >= 0) goto L22;
        this.VH.remove(r5);     // Catch: java.lang.Throwable -> L24
        r2 = r2 - 1;
    L22:
        r2 = r2 + 1;
        goto L16
    }

    @abcd.Interfacesu(method = 1670376726708774168L)
    private void VH() {
    L21:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, 78474975497193780L, this);
    L25:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(78474975497193780L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        boolean r3 = true;
        if (this.v5 <= 0) goto L9;
        boolean r2 = true;
    L11:
        if (this.tp == r2) goto L14;
        this.tp = r2;     // Catch: java.lang.Throwable -> L21
        this.we.FH(r2);     // Catch: java.lang.Throwable -> L21
    L14:
        if (this.v5 != this.Hw.size()) goto L18;
        r3 = false;
    L18:
        if (this.EQ == r3) goto L28;
        this.EQ = r3;     // Catch: java.lang.Throwable -> L21
        this.we.DW(r3);     // Catch: java.lang.Throwable -> L21
        return;
    L28:
        return;
    L9:
        r2 = false;
        goto L11
    }

    @abcd.Interfacesu(method = -4656277294830632625L)
    private void gn() {
    L20:
        th = move-exception;
        if (DW == false) goto L25;
        abcd.wu.j6(th, -89629596837385059L, this);
    L25:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-89629596837385059L, this);     // Catch: java.lang.Throwable -> L20
    L7:
        if (this.v5 == this.Hw.size()) goto L19;
        this.Hw.setSize(this.v5);     // Catch: java.lang.Throwable -> L20
        if (this.Zo <= this.v5) goto L11;
        this.Zo = -1;     // Catch: java.lang.Throwable -> L20
    L11:
        int r2 = 0;
    L12:
        if (r2 >= this.VH.size()) goto L32;
        com.aide.ui.views.editor.va.g r3 = this.VH.get(r2);     // Catch: java.lang.Throwable -> L20
        if (r3.FH <= this.v5) goto L18;
        this.VH.remove(r3);     // Catch: java.lang.Throwable -> L20
        r2 = r2 - 1;
    L18:
        r2 = r2 + 1;
        goto L12
    L32:
        return;
    }

    @abcd.Interfacesu(method = 294758014376780320L)
    private abcd.fm j6(java.lang.Object r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -997366918397439040L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-997366918397439040L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if ((r5 instanceof com.aide.ui.views.editor.OConsole) == false) goto L10;
        return ((com.aide.ui.views.editor.OConsole) r5).getCaretPosition();
    L10:
        return null;
    }

    @abcd.Interfacesu(method = -1385882146424781576L)
    private void j6(com.aide.ui.views.editor.va.b r7) {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -1214181994691294336L, this, r7);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-1214181994691294336L, this, r7);     // Catch: java.lang.Throwable -> L19
    L7:
        if (this.u7 == false) goto L9;
    L14:
        this.u7 = false;     // Catch: java.lang.Throwable -> L19
        if (this.Hw.size() < this.FH) goto L17;
        DW((this.Hw.size() - this.FH) + 1);     // Catch: java.lang.Throwable -> L19
    L17:
        this.Hw.addElement(r7);     // Catch: java.lang.Throwable -> L19
        this.v5 = this.Hw.size();     // Catch: java.lang.Throwable -> L19
        VH();     // Catch: java.lang.Throwable -> L19
        return;
    L9:
        if (this.Hw.size() == 0) goto L14;
        com.aide.ui.views.editor.va.b r2 = this.Hw.lastElement();     // Catch: java.lang.Throwable -> L19
        if (r2.j6(r7) == true) goto L25;
        this.Hw.setElementAt(new com.aide.ui.views.editor.va.a(this, r2.j6(), r2, r7), this.Hw.size() - 1);     // Catch: java.lang.Throwable -> L19
        return;
    }

    public void DW(int r11, int r12, char r13, com.aide.ui.views.editor.ClassG r14, java.lang.Object r15) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6463168904715778408L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Character(r13), r14, r15);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6463168904715778408L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Character(r13), r14, r15);     // Catch: java.lang.Throwable -> L8
    L5:
        if (r15 == this) goto L15;
        gn();     // Catch: java.lang.Throwable -> L8
        abcd.hm r0 = new abcd.hm(r11, r12, r11, r12);     // Catch: java.lang.Throwable -> L8
        j6(new com.aide.ui.views.editor.va.h(this, j6(r15), r0, r13));     // Catch: java.lang.Throwable -> L8
        return;
    }

    public void DW(int r6, int r7, int r8, int r9, com.aide.ui.views.editor.ClassG r10, java.lang.Object r11) {
        if (j6 == false) goto L5;
        abcd.wu.j6(393215811465688761L, this, new java.lang.Object[]{new java.lang.Integer(r6), new java.lang.Integer(r7), new java.lang.Integer(r8), new java.lang.Integer(r9), r10, r11});
    L5:
        if (r11 == this) goto L11;
        gn();
        abcd.hm r0 = new abcd.hm(r6, r7, r8, r9);
        abcd.fm r12 = j6(r11);
        java.io.Reader r13 = r10.j6(r0);
        java.io.StringWriter r14 = new java.io.StringWriter();
        com.aide.common.Xa.j6(r13, r14);     // Catch: java.io.IOException -> L9
        j6(new com.aide.ui.views.editor.va.h(this, r12, r0, r14.toString()));
        return;
    L10:
        throw new java.lang.InternalError();
    }

    public void DW(int r10, int r11, com.aide.ui.views.editor.ClassG r12, java.lang.Object r13) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1466344142190790704L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), r12, r13);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1466344142190790704L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), r12, r13);     // Catch: java.lang.Throwable -> L8
    L5:
        if (r13 == this) goto L15;
        gn();     // Catch: java.lang.Throwable -> L8
        j6(new com.aide.ui.views.editor.va.f(this, j6(r13), r11, r10));     // Catch: java.lang.Throwable -> L8
        return;
    }

    public boolean DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 420049935388886357L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(420049935388886357L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.EQ;
    }

    public boolean FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 424669314176485259L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(424669314176485259L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp;
    }

    public java.util.List<com.aide.ui.views.editor.va.j> Hw() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 4457863292117528169L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4457863292117528169L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList(1);     // Catch: java.lang.Throwable -> L14
        int r3 = 0;
    L7:
        if (r3 >= this.VH.size()) goto L13;
        com.aide.ui.views.editor.va.g r4 = this.VH.get(r3);     // Catch: java.lang.Throwable -> L14
        if (r4.FH != this.v5) goto L12;
        r2.add(r4.Hw);     // Catch: java.lang.Throwable -> L14
    L12:
        r3 = r3 + 1;
        goto L7
    L13:
        return r2;
    }

    public void Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6440806834513154480L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6440806834513154480L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.u7 = true;     // Catch: java.lang.Throwable -> L8
    }

    public abcd.fm j6(com.aide.ui.views.editor.ClassG r6) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -90557112023679683L, this, r6);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-90557112023679683L, this, r6);     // Catch: java.lang.Throwable -> L16
    L7:
        if (this.EQ == false) goto L14;
        java.util.Vector<com.aide.ui.views.editor.va.b> r2 = this.Hw;     // Catch: java.lang.Throwable -> L16
        int r3 = this.v5;     // Catch: java.lang.Throwable -> L16
        this.v5 = r3 + 1;     // Catch: java.lang.Throwable -> L16
        r2.elementAt(r3).j6(r6);     // Catch: java.lang.Throwable -> L16
        VH();     // Catch: java.lang.Throwable -> L16
        if (this.v5 >= this.Hw.size()) goto L13;
        return this.Hw.elementAt(this.v5).j6();
    L13:
        return this.gn;
    L14:
        return null;
    }

    public abcd.fm j6(com.aide.ui.views.editor.ClassG r8, java.lang.Object r9) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 3711016680624179280L, this, r8, r9);
    L18:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(3711016680624179280L, this, r8, r9);     // Catch: java.lang.Throwable -> L14
    L6:
        if (this.tp == true) goto L8;
        return null;
    L8:
        if (this.v5 != this.Hw.size()) goto L10;
        this.gn = j6(r9);     // Catch: java.lang.Throwable -> L14
    L10:
        Zo();     // Catch: java.lang.Throwable -> L14
        java.util.Vector<com.aide.ui.views.editor.va.b> r0 = this.Hw;     // Catch: java.lang.Throwable -> L14
        int r1 = this.v5 - 1;     // Catch: java.lang.Throwable -> L14
        this.v5 = r1;     // Catch: java.lang.Throwable -> L14
        com.aide.ui.views.editor.va.b r2 = r0.elementAt(r1);     // Catch: java.lang.Throwable -> L14
        r2.DW().j6(r8);     // Catch: java.lang.Throwable -> L14
        VH();     // Catch: java.lang.Throwable -> L14
        return r2.j6();
    }

    public void j6(int r5) {
    L18:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, 1983232168136699628L, this, new java.lang.Integer(r5));
    L22:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1983232168136699628L, this, r5);     // Catch: java.lang.Throwable -> L18
    L7:
        if (this.FH == r5) goto L16;
        this.FH = r5;     // Catch: java.lang.Throwable -> L18
        if (this.Hw.size() <= r5) goto L16;
        int r2 = this.Hw.size() - r5;     // Catch: java.lang.Throwable -> L18
        if (r2 <= this.v5) goto L13;
        r2 = this.v5;     // Catch: java.lang.Throwable -> L18
    L13:
        DW(r2);     // Catch: java.lang.Throwable -> L18
        this.v5 -= r2;     // Catch: java.lang.Throwable -> L18
        if (this.Hw.size() <= r5) goto L16;
        this.Hw.setSize(r5);     // Catch: java.lang.Throwable -> L18
    L16:
        VH();     // Catch: java.lang.Throwable -> L18
    }

    public void j6(int r11, int r12, char r13, com.aide.ui.views.editor.ClassG r14, java.lang.Object r15) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1323785611154857991L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Character(r13), r14, r15);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1323785611154857991L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Character(r13), r14, r15);     // Catch: java.lang.Throwable -> L8
    L5:
        if (r15 == this) goto L15;
        gn();     // Catch: java.lang.Throwable -> L8
        abcd.hm r0 = new abcd.hm(r11, r12, r11, r12);     // Catch: java.lang.Throwable -> L8
        j6(new com.aide.ui.views.editor.va.c(this, j6(r15), r0, r13));     // Catch: java.lang.Throwable -> L8
        return;
    }

    public void j6(int r6, int r7, int r8, int r9, com.aide.ui.views.editor.ClassG r10, java.lang.Object r11) {
        if (j6 == false) goto L5;
        abcd.wu.j6(3644786495751586632L, this, new java.lang.Object[]{new java.lang.Integer(r6), new java.lang.Integer(r7), new java.lang.Integer(r8), new java.lang.Integer(r9), r10, r11});
    L5:
        if (r11 == this) goto L11;
        gn();
        abcd.hm r0 = new abcd.hm(r6, r7, r8, r9);
        abcd.fm r12 = j6(r11);
        java.io.Reader r13 = r10.j6(r0);
        java.io.StringWriter r14 = new java.io.StringWriter();
        com.aide.common.Xa.j6(r13, r14);     // Catch: java.io.IOException -> L9
        j6(new com.aide.ui.views.editor.va.c(this, r12, r0, r14.toString()));
        return;
    L10:
        throw new java.lang.InternalError();
    }

    public void j6(int r10, int r11, com.aide.ui.views.editor.ClassG r12, java.lang.Object r13) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4962723583755141015L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), r12, r13);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4962723583755141015L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), r12, r13);     // Catch: java.lang.Throwable -> L8
    L5:
        if (r13 == this) goto L15;
        gn();     // Catch: java.lang.Throwable -> L8
        j6(new com.aide.ui.views.editor.va.e(this, j6(r13), r11, r10));     // Catch: java.lang.Throwable -> L8
        return;
    }

    public void j6(int r11, int r12, char[] r13, char[] r14, com.aide.ui.views.editor.ClassG r15, java.lang.Object r16) {
        if (j6 == false) goto L6;
        abcd.wu.j6(8038012561751284320L, this, new java.lang.Object[]{new java.lang.Integer(r11), new java.lang.Integer(r12), r13, r14, r15, r16});
    L6:
        if (r16 == this) goto L9;
        gn();
        j6(new com.aide.ui.views.editor.va.k(this, j6(r16), r11, r12, r13, r14));
        return;
    }

    public void j6(com.aide.ui.views.editor.va.j r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6767090989045130709L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6767090989045130709L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH.add(new com.aide.ui.views.editor.va.g(this.v5, r6));     // Catch: java.lang.Throwable -> L8
        this.u7 = true;     // Catch: java.lang.Throwable -> L8
    }

    public boolean j6() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 5603120105774012713L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5603120105774012713L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.v5 != this.Zo) goto L9;
        return true;
    L9:
        return false;
    }

    public void v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1444757833063641148L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1444757833063641148L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L8
        this.u7 = true;     // Catch: java.lang.Throwable -> L8
    }
}
