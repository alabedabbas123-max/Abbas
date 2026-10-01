package com.aide.appwizard.runtime;

@abcd.Interfacexu
public class i {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1820927581626770964L)
    protected com.aide.appwizard.runtime.AppWizardActivity FH;

    @abcd.Interfaceru(field = -505859424202625024L)
    protected org.w3c.dom.Document Hw;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 1190719544853572280L)
        private org.w3c.dom.Element FH;

        @abcd.Interfacevu
        final com.aide.appwizard.runtime.i Hw;

        static {
            abcd.wu.j6(com.aide.appwizard.runtime.i.a.class, -1306509483419979212L, -1306509483419979212L);
        }

        public a(com.aide.appwizard.runtime.i r8, org.w3c.dom.Element r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 3516212287528188339L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(3516212287528188339L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
        }

        public com.aide.appwizard.runtime.i.b DW() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -4639242331643436320L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-4639242331643436320L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return new com.aide.appwizard.runtime.i.b(this.Hw, (org.w3c.dom.Element) this.Hw.Hw.getElementsByTagName("activity").item(0));
        }

        public com.aide.appwizard.runtime.i.b j6() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 4145710251922180720L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(4145710251922180720L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            org.w3c.dom.Node r2 = this.FH.appendChild(this.Hw.Hw.createElement("activity"));     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.Hw, 1);     // Catch: java.lang.Throwable -> L8
            return new com.aide.appwizard.runtime.i.b(this.Hw, (org.w3c.dom.Element) r2);
        }
    }

    @abcd.Interfacexu
    public class b {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 2831507827959610240L)
        private org.w3c.dom.Element FH;

        @abcd.Interfacevu
        final com.aide.appwizard.runtime.i Hw;

        static {
            abcd.wu.j6(com.aide.appwizard.runtime.i.b.class, -708008207123869275L, -708008207123869275L);
        }

        public b(com.aide.appwizard.runtime.i r8, org.w3c.dom.Element r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -674206457155955776L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-674206457155955776L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this.Hw = r8;     // Catch: java.lang.Throwable -> L7
            this.FH = r9;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -6220129697231463L)
        private void Hw(java.lang.Boolean r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 11736670178950332L, this, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(11736670178950332L, this, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Hw.j6(this.FH, "showtitle", r6);     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = -1560475266036820328L)
        private com.aide.appwizard.runtime.i.c we() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -383778040582831965L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-383778040582831965L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            int r2 = DW().size();     // Catch: java.lang.Throwable -> L8
            org.w3c.dom.Element r3 = this.Hw.Hw.createElement("fragment");     // Catch: java.lang.Throwable -> L8
            this.FH.appendChild(r3);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.c r4 = new com.aide.appwizard.runtime.i.c(this.Hw, r3, r2);     // Catch: java.lang.Throwable -> L8
            r4.DW("Section " + (r2 + 1));     // Catch: java.lang.Throwable -> L8
            return r4;
        }

        public java.util.List<com.aide.appwizard.runtime.i.c> DW() {
        L17:
            th = move-exception;
            if (DW == false) goto L22;
            abcd.wu.j6(th, 593021763670637769L, this);
        L22:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(593021763670637769L, this);     // Catch: java.lang.Throwable -> L17
        L6:
            java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L17
            org.w3c.dom.NodeList r3 = this.FH.getChildNodes();     // Catch: java.lang.Throwable -> L17
            int r4 = 0;
            int r5 = 0;
        L7:
            if (r4 >= r3.getLength()) goto L16;
            if ((r3.item(r4) instanceof org.w3c.dom.Element) == false) goto L15;
            org.w3c.dom.Element r6 = (org.w3c.dom.Element) r3.item(r4);     // Catch: java.lang.Throwable -> L17
            if ("fragment".equals(r6.getTagName()) == false) goto L15;
            int r9 = r5 + 1;     // Catch: java.lang.Throwable -> L17
            r2.add(new com.aide.appwizard.runtime.i.c(this.Hw, r6, r5));     // Catch: java.lang.Throwable -> L17
            r5 = r9;
        L15:
            r4 = r4 + 1;
            goto L7
        L16:
            return r2;
        }

        public void DW(java.lang.Boolean r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1773122701396174275L, this, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1773122701396174275L, this, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Hw.j6(this.FH, "fullscreen", r6);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.Hw, 1);     // Catch: java.lang.Throwable -> L8
        }

        public java.lang.Boolean EQ() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1853168409681259032L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1853168409681259032L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Hw.j6(this.FH, "showtitle");
        }

        public com.aide.appwizard.runtime.i.e FH() {
        L12:
            th = move-exception;
            if (DW == false) goto L16;
            abcd.wu.j6(th, 996944302804518255L, this);
        L16:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(996944302804518255L, this);     // Catch: java.lang.Throwable -> L12
        L6:
            java.lang.String r2 = com.aide.appwizard.runtime.i.j6(this.Hw, this.FH, "theme");     // Catch: java.lang.Throwable -> L12
            if (r2 == null) goto L11;
            return com.aide.appwizard.runtime.i.e.valueOf(r2);
        L11:
            return com.aide.appwizard.runtime.i.e.Hw;
        }

        public void FH(java.lang.Boolean r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -473320284855031172L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-473320284855031172L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            Hw(r5);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.Hw, 2);     // Catch: java.lang.Throwable -> L8
        }

        public java.lang.String Hw() {
        L11:
            th = move-exception;
            if (DW == false) goto L15;
            abcd.wu.j6(th, 1001058009136545728L, this);
        L15:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1001058009136545728L, this);     // Catch: java.lang.Throwable -> L11
        L6:
            java.lang.String r2 = com.aide.appwizard.runtime.i.j6(this.Hw, this.FH, "title");     // Catch: java.lang.Throwable -> L11
            if (r2 == null) goto L9;
            return r2;
        L9:
            return "MyApp";
        }

        public java.lang.Boolean VH() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 825566806623122255L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(825566806623122255L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Hw.j6(this.FH, "showactionbar");
        }

        public boolean Zo() {
        L9:
            th = move-exception;
            if (DW == false) goto L13;
            abcd.wu.j6(th, -3749934042892293552L, this);
        L13:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3749934042892293552L, this);     // Catch: java.lang.Throwable -> L9
        L6:
            return !java.lang.Boolean.FALSE.equals(VH());
        }

        public boolean gn() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1842350009435335884L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1842350009435335884L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return java.lang.Boolean.TRUE.equals(u7());
        }

        public com.aide.appwizard.runtime.i.c j6() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3001312941186728155L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3001312941186728155L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            com.aide.appwizard.runtime.i.c r2 = we();     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.Hw, 2);     // Catch: java.lang.Throwable -> L8
            return r2;
        }

        public com.aide.appwizard.runtime.i.c j6(int r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1982596911851114967L, this, new java.lang.Integer(r5));
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1982596911851114967L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return DW().get(r5);
        }

        public void j6(com.aide.appwizard.runtime.i.d r6) {
        L13:
            th = move-exception;
            if (DW == false) goto L17;
            abcd.wu.j6(th, 2806915491090483184L, this, r6);
        L17:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2806915491090483184L, this, r6);     // Catch: java.lang.Throwable -> L13
        L6:
            this.FH.setAttribute("type", r6.name());     // Catch: java.lang.Throwable -> L13
            Hw(java.lang.Boolean.valueOf(r6.VH()));     // Catch: java.lang.Throwable -> L13
            if (r6.Zo() == true) goto L9;
        L11:
            com.aide.appwizard.runtime.i.j6(this.Hw, 1);     // Catch: java.lang.Throwable -> L13
            return;
        L9:
            if (DW().size() >= 2) goto L11;
            we();     // Catch: java.lang.Throwable -> L13
            goto L11
        }

        public void j6(com.aide.appwizard.runtime.i.e r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -223567980805873616L, this, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-223567980805873616L, this, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH.setAttribute("theme", r6.name());     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.Hw, 1);     // Catch: java.lang.Throwable -> L8
        }

        public void j6(java.lang.Boolean r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 3508286572153299321L, this, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(3508286572153299321L, this, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Hw.j6(this.FH, "showactionbar", r6);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.Hw, 2);     // Catch: java.lang.Throwable -> L8
        }

        public void j6(java.lang.String r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 740392166154567784L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(740392166154567784L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH.setAttribute("title", r5);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.Hw, 2);     // Catch: java.lang.Throwable -> L8
        }

        public boolean tp() {
        L9:
            th = move-exception;
            if (DW == false) goto L13;
            abcd.wu.j6(th, -1714939279897329739L, this);
        L13:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1714939279897329739L, this);     // Catch: java.lang.Throwable -> L9
        L6:
            return !java.lang.Boolean.FALSE.equals(EQ());
        }

        public java.lang.Boolean u7() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3574379288936874375L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3574379288936874375L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Hw.j6(this.FH, "fullscreen");
        }

        public com.aide.appwizard.runtime.i.d v5() {
        L12:
            th = move-exception;
            if (DW == false) goto L16;
            abcd.wu.j6(th, 2480839748886490560L, this);
        L16:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2480839748886490560L, this);     // Catch: java.lang.Throwable -> L12
        L6:
            java.lang.String r2 = com.aide.appwizard.runtime.i.j6(this.Hw, this.FH, "type");     // Catch: java.lang.Throwable -> L12
            if (r2 == null) goto L11;
            return com.aide.appwizard.runtime.i.d.valueOf(r2);
        L11:
            return com.aide.appwizard.runtime.i.d.v5;
        }
    }

    @abcd.Interfacexu
    public class c {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -151999950586864176L)
        private org.w3c.dom.Element FH;

        @abcd.Interfaceru(field = 1639798589376002615L)
        private int Hw;

        @abcd.Interfacevu
        final com.aide.appwizard.runtime.i v5;

        static {
            abcd.wu.j6(com.aide.appwizard.runtime.i.c.class, -404897390490125028L, -404897390490125028L);
        }

        public c(com.aide.appwizard.runtime.i r9, org.w3c.dom.Element r10, int r11) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 1257111394116314000L, null, r9, r10, new java.lang.Integer(r11));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(1257111394116314000L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
        L5:
            this.v5 = r9;     // Catch: java.lang.Throwable -> L7
            this.FH = r10;     // Catch: java.lang.Throwable -> L7
            this.Hw = r11;     // Catch: java.lang.Throwable -> L7
        }

        public com.aide.appwizard.runtime.i.b DW() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2474043622959430809L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2474043622959430809L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5.FH();
        }

        public void DW(java.lang.String r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -320441403928005360L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-320441403928005360L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH.setAttribute("title", r5);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.v5, 2);     // Catch: java.lang.Throwable -> L8
        }

        public int FH() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 757410798985454627L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(757410798985454627L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Hw;
        }

        public java.lang.String Hw() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1714474251821067640L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1714474251821067640L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return com.aide.appwizard.runtime.i.j6(this.v5, this.FH, "layout");
        }

        public void j6() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1364085835274056275L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1364085835274056275L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH.getParentNode().removeChild(this.FH);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.v5, 2);     // Catch: java.lang.Throwable -> L8
        }

        public void j6(java.lang.String r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 5104627437618689040L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(5104627437618689040L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH.setAttribute("layout", r5);     // Catch: java.lang.Throwable -> L8
            com.aide.appwizard.runtime.i.j6(this.v5, 0);     // Catch: java.lang.Throwable -> L8
        }

        public java.lang.String v5() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -116681196939594000L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-116681196939594000L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return com.aide.appwizard.runtime.i.j6(this.v5, this.FH, "title");
        }
    }

    @abcd.Interfacexu
    public static final enum d extends java.lang.Enum<com.aide.appwizard.runtime.i.d> {
        public static final com.aide.appwizard.runtime.i.d DW = null;

        @abcd.Interfaceuu
        private static boolean EQ;
        public static final com.aide.appwizard.runtime.i.d FH = null;
        public static final com.aide.appwizard.runtime.i.d Hw = null;
        public static final com.aide.appwizard.runtime.i.d VH = null;
        public static final com.aide.appwizard.runtime.i.d Zo = null;
        public static final com.aide.appwizard.runtime.i.d gn = null;
        public static final com.aide.appwizard.runtime.i.d j6 = null;

        @abcd.Interfacetu
        private static boolean tp;
        private static final com.aide.appwizard.runtime.i.d[] u7 = null;
        public static final com.aide.appwizard.runtime.i.d v5 = null;
        public java.lang.String we;

        static {
            abcd.wu.j6(com.aide.appwizard.runtime.i.d.class, -4604390756329882245L, -4604390756329882245L);     // Catch: java.lang.Throwable -> L8
            if (tp == false) goto L6;
            abcd.wu.j6(2741704959502285972L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new com.aide.appwizard.runtime.i.d("Single", 0, "Single Section");     // Catch: java.lang.Throwable -> L8
            DW = new com.aide.appwizard.runtime.i.d("Drawer", 1, "Single Section with Drawer");     // Catch: java.lang.Throwable -> L8
            FH = new com.aide.appwizard.runtime.i.d("Slider", 2, "Scrollable Tabs");     // Catch: java.lang.Throwable -> L8
            Hw = new com.aide.appwizard.runtime.i.d("SliderDrawer", 3, "Scrollable Tabs with Drawer");     // Catch: java.lang.Throwable -> L8
            v5 = new com.aide.appwizard.runtime.i.d("Tabs", 4, "Fixed Tabs");     // Catch: java.lang.Throwable -> L8
            Zo = new com.aide.appwizard.runtime.i.d("TabsDrawer", 5, "Fixed Tabs with Drawer");     // Catch: java.lang.Throwable -> L8
            VH = new com.aide.appwizard.runtime.i.d("Spinner", 6, "Dropdown List");     // Catch: java.lang.Throwable -> L8
            gn = new com.aide.appwizard.runtime.i.d("SpinnerDrawer", 7, "Dropdown List with Drawer");     // Catch: java.lang.Throwable -> L8
            u7 = new com.aide.appwizard.runtime.i.d[]{j6, DW, FH, Hw, v5, Zo, VH, gn};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, 2741704959502285972L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = 3280572883675172640L)
        private d(java.lang.String r9, int r10, java.lang.String r11) {
        L7:
            th = move-exception;
            if (EQ == false) goto L11;
            abcd.wu.j6(th, 2566226735923928805L, null, r9, new java.lang.Integer(r10), r11);
        L11:
            throw th;
        L3:
            if (tp == false) goto L5;
            abcd.wu.j6(2566226735923928805L, null, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L7
        L5:
            super(r9, r10);     // Catch: java.lang.Throwable -> L7
            this.we = r11;     // Catch: java.lang.Throwable -> L7
        }

        public static java.util.List<java.lang.String> Hw() {
        L11:
            th = move-exception;
            if (EQ == false) goto L16;
            abcd.wu.j6(th, -2784427341184626401L, null);
        L16:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(-2784427341184626401L, null);     // Catch: java.lang.Throwable -> L11
        L6:
            java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L11
            com.aide.appwizard.runtime.i.d[] r4 = values();     // Catch: java.lang.Throwable -> L11
            int r5 = r4.length;     // Catch: java.lang.Throwable -> L11
            int r6 = 0;
        L7:
            if (r6 >= r5) goto L10;
            r3.add(r4[r6].we);     // Catch: java.lang.Throwable -> L11
            r6 = r6 + 1;
            goto L7
        L10:
            return r3;
        }

        public static com.aide.appwizard.runtime.i.d j6(java.lang.String r8) {
        L14:
            th = move-exception;
            if (EQ == false) goto L19;
            abcd.wu.j6(th, 182287153849865772L, null, r8);
        L19:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(182287153849865772L, null, r8);     // Catch: java.lang.Throwable -> L14
        L6:
            com.aide.appwizard.runtime.i.d[] r3 = values();     // Catch: java.lang.Throwable -> L14
            int r4 = r3.length;     // Catch: java.lang.Throwable -> L14
            int r5 = 0;
        L7:
            if (r5 >= r4) goto L12;
            com.aide.appwizard.runtime.i.d r6 = r3[r5];     // Catch: java.lang.Throwable -> L14
            if (r6.we.equals(r8) == true) goto L10;
            r5 = r5 + 1;     // Catch: java.lang.Throwable -> L14
            goto L7
        L10:
            return r6;
        L12:
            return j6;
        }

        public static com.aide.appwizard.runtime.i.d valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, -246496543910301960L, null, r5);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(-246496543910301960L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.appwizard.runtime.i.d) java.lang.Enum.valueOf(com.aide.appwizard.runtime.i.d.class, r5);
        }

        public static com.aide.appwizard.runtime.i.d[] values() {
        L8:
            th = move-exception;
            if (EQ == false) goto L12;
            abcd.wu.j6(th, 1446932069865490288L, null);
        L12:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(1446932069865490288L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.appwizard.runtime.i.d[]) u7.clone();
        }

        public boolean VH() {
        L15:
            th = move-exception;
            if (EQ == false) goto L19;
            abcd.wu.j6(th, 7244829157542468951L, this);
        L19:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(7244829157542468951L, this);     // Catch: java.lang.Throwable -> L15
        L6:
            int r0 = com.aide.appwizard.runtime.h.j6[ordinal()];     // Catch: java.lang.Throwable -> L15
            if (r0 != 2) goto L10;
            return false;
        L10:
            if (r0 == 5) goto L22;
            return true;
        L22:
            return false;
        }

        public boolean Zo() {
        L18:
            th = move-exception;
            if (EQ == false) goto L22;
            abcd.wu.j6(th, 3078581091693428951L, this);
        L22:
            throw th;
        L4:
            if (tp == false) goto L6;
            abcd.wu.j6(3078581091693428951L, this);     // Catch: java.lang.Throwable -> L18
        L6:
            int r0 = com.aide.appwizard.runtime.h.j6[ordinal()];     // Catch: java.lang.Throwable -> L18
            if (r0 != 1) goto L10;
        L17:
            return true;
        L10:
            if (r0 == 2) goto L17;
            if (r0 == 3) goto L17;
            if (r0 == 4) goto L17;
            return false;
        }
    }

    @abcd.Interfacexu
    public static final enum e extends java.lang.Enum<com.aide.appwizard.runtime.i.e> {
        public static final com.aide.appwizard.runtime.i.e DW = null;
        public static final com.aide.appwizard.runtime.i.e FH = null;
        public static final com.aide.appwizard.runtime.i.e Hw = null;
        public static final com.aide.appwizard.runtime.i.e VH = null;
        public static final com.aide.appwizard.runtime.i.e Zo = null;
        private static final com.aide.appwizard.runtime.i.e[] gn = null;
        public static final com.aide.appwizard.runtime.i.e j6 = null;

        @abcd.Interfaceuu
        private static boolean tp;

        @abcd.Interfacetu
        private static boolean u7;
        public static final com.aide.appwizard.runtime.i.e v5 = null;
        public java.lang.String EQ;

        static {
            abcd.wu.j6(com.aide.appwizard.runtime.i.e.class, 7488561427838058888L, 7488561427838058888L);     // Catch: java.lang.Throwable -> L8
            if (u7 == false) goto L6;
            abcd.wu.j6(1797550341084023828L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new com.aide.appwizard.runtime.i.e("HoloDark", 0, "Holo Dark");     // Catch: java.lang.Throwable -> L8
            DW = new com.aide.appwizard.runtime.i.e("HoloLight", 1, "Holo Light");     // Catch: java.lang.Throwable -> L8
            FH = new com.aide.appwizard.runtime.i.e("HoloLightHoloActionBar", 2, "Holo Light Holo ActionBar");     // Catch: java.lang.Throwable -> L8
            Hw = new com.aide.appwizard.runtime.i.e("HoloLightDarkActionBar", 3, "Holo Light Dark ActionBar");     // Catch: java.lang.Throwable -> L8
            v5 = new com.aide.appwizard.runtime.i.e("DeviceDefault", 4, "Device Default Dark");     // Catch: java.lang.Throwable -> L8
            Zo = new com.aide.appwizard.runtime.i.e("DeviceDefaultLight", 5, "Device Default Light");     // Catch: java.lang.Throwable -> L8
            VH = new com.aide.appwizard.runtime.i.e("DeviceDefaultLightDarkActionBar", 6, "Device Default Light Dark ActionBar");     // Catch: java.lang.Throwable -> L8
            gn = new com.aide.appwizard.runtime.i.e[]{j6, DW, FH, Hw, v5, Zo, VH};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (tp == false) goto L12;
            abcd.wu.j6(th, 1797550341084023828L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = 883853409448579608L)
        private e(java.lang.String r9, int r10, java.lang.String r11) {
        L7:
            th = move-exception;
            if (tp == false) goto L11;
            abcd.wu.j6(th, -76355220123665324L, null, r9, new java.lang.Integer(r10), r11);
        L11:
            throw th;
        L3:
            if (u7 == false) goto L5;
            abcd.wu.j6(-76355220123665324L, null, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L7
        L5:
            super(r9, r10);     // Catch: java.lang.Throwable -> L7
            this.EQ = r11;     // Catch: java.lang.Throwable -> L7
        }

        public static java.util.List<java.lang.String> Hw() {
        L11:
            th = move-exception;
            if (tp == false) goto L16;
            abcd.wu.j6(th, 4362824624622547055L, null);
        L16:
            throw th;
        L4:
            if (u7 == false) goto L6;
            abcd.wu.j6(4362824624622547055L, null);     // Catch: java.lang.Throwable -> L11
        L6:
            java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L11
            com.aide.appwizard.runtime.i.e[] r4 = values();     // Catch: java.lang.Throwable -> L11
            int r5 = r4.length;     // Catch: java.lang.Throwable -> L11
            int r6 = 0;
        L7:
            if (r6 >= r5) goto L10;
            r3.add(r4[r6].EQ);     // Catch: java.lang.Throwable -> L11
            r6 = r6 + 1;
            goto L7
        L10:
            return r3;
        }

        public static com.aide.appwizard.runtime.i.e j6(java.lang.String r8) {
        L14:
            th = move-exception;
            if (tp == false) goto L19;
            abcd.wu.j6(th, 47391348789990060L, null, r8);
        L19:
            throw th;
        L4:
            if (u7 == false) goto L6;
            abcd.wu.j6(47391348789990060L, null, r8);     // Catch: java.lang.Throwable -> L14
        L6:
            com.aide.appwizard.runtime.i.e[] r3 = values();     // Catch: java.lang.Throwable -> L14
            int r4 = r3.length;     // Catch: java.lang.Throwable -> L14
            int r5 = 0;
        L7:
            if (r5 >= r4) goto L12;
            com.aide.appwizard.runtime.i.e r6 = r3[r5];     // Catch: java.lang.Throwable -> L14
            if (r6.EQ.equals(r8) == true) goto L10;
            r5 = r5 + 1;     // Catch: java.lang.Throwable -> L14
            goto L7
        L10:
            return r6;
        L12:
            return Hw;
        }

        public static com.aide.appwizard.runtime.i.e valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (tp == false) goto L12;
            abcd.wu.j6(th, -296509002529399576L, null, r5);
        L12:
            throw th;
        L4:
            if (u7 == false) goto L6;
            abcd.wu.j6(-296509002529399576L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.appwizard.runtime.i.e) java.lang.Enum.valueOf(com.aide.appwizard.runtime.i.e.class, r5);
        }

        public static com.aide.appwizard.runtime.i.e[] values() {
        L8:
            th = move-exception;
            if (tp == false) goto L12;
            abcd.wu.j6(th, -2796084798225889248L, null);
        L12:
            throw th;
        L4:
            if (u7 == false) goto L6;
            abcd.wu.j6(-2796084798225889248L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.appwizard.runtime.i.e[]) gn.clone();
        }
    }

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.i.class, 4136550149595440731L, 4136550149595440731L);
    }

    public i(com.aide.appwizard.runtime.AppWizardActivity r6) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 5483039264126565141L, null, r6);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5483039264126565141L, null, r6);     // Catch: java.lang.Throwable -> L10
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L10
        this.Hw = r6.EQ();     // Catch: java.lang.Throwable -> L10
        if (this.Hw != null) goto L17;
        j6();     // Catch: java.lang.Throwable -> L10
        return;
    }

    @abcd.Interfacesu(method = -1161102720058875125L)
    private java.lang.String DW(org.w3c.dom.Element r8, java.lang.String r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -872204956856419509L, this, r8, r9);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-872204956856419509L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
    L5:
        java.lang.String r0 = r8.getAttribute(r9);     // Catch: java.lang.Throwable -> L12
        if (r0 == null) goto L10;
        if (r0.length() <= 0) goto L19;
        return r0;
    L19:
        return null;
    L10:
        return null;
    }

    @abcd.Interfacesu(method = 8212348414248936L)
    private void DW(int r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 7697171020155544944L, this, new java.lang.Integer(r5));
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(7697171020155544944L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH.u7() == null) goto L17;
        this.FH.j6(this.Hw, r5);     // Catch: java.lang.Throwable -> L10
        j6(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    static java.lang.String j6(com.aide.appwizard.runtime.i r0, org.w3c.dom.Element r1, java.lang.String r2) {
        return r0.DW(r1, r2);
    }

    @abcd.Interfacesu(method = 3049021838972733273L)
    private void j6(int r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -2841115541658087995L, this, new java.lang.Integer(r5));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2841115541658087995L, this, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r5 != 1) goto L9;
        this.FH.recreate();     // Catch: java.lang.Throwable -> L14
        return;
    L9:
        if (r5 != 2) goto L20;
        this.FH.we();     // Catch: java.lang.Throwable -> L14
        return;
    }

    static void j6(com.aide.appwizard.runtime.i r0, int r1) {
        r0.DW(r1);
    }

    public com.aide.appwizard.runtime.i.a DW() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2124900456956236625L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2124900456956236625L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.appwizard.runtime.i.a(this, (org.w3c.dom.Element) this.Hw.getElementsByTagName("app").item(0));
    }

    public com.aide.appwizard.runtime.i.b FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -633402251954826200L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-633402251954826200L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return DW().DW();
    }

    public java.lang.Boolean j6(org.w3c.dom.Element r8, java.lang.String r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 414009716376104337L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(414009716376104337L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        java.lang.String r0 = DW(r8, r9);     // Catch: java.lang.Throwable -> L11
        if (r0 != null) goto L9;
        return null;
    L9:
        return java.lang.Boolean.valueOf("true".equals(r0));
    }

    public void j6() {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -184845895394263135L, this);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L17;
        abcd.wu.j6(-184845895394263135L, this);     // Catch: java.lang.Throwable -> L9
    L17:
        this.Hw = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();     // Catch: javax.xml.parsers.ParserConfigurationException -> L14 java.lang.Throwable -> L9
        this.Hw.appendChild(this.Hw.createElement("app"));     // Catch: javax.xml.parsers.ParserConfigurationException -> L14 java.lang.Throwable -> L9
        DW(1);     // Catch: javax.xml.parsers.ParserConfigurationException -> L14 java.lang.Throwable -> L9
    L7:
        com.aide.appwizard.runtime.i.b r2 = DW().j6();     // Catch: java.lang.Throwable -> L9
        r2.j6();     // Catch: java.lang.Throwable -> L9
        r2.j6();     // Catch: java.lang.Throwable -> L9
        r2.j6();     // Catch: java.lang.Throwable -> L9
    }

    public void j6(org.w3c.dom.Document r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2445587626810945995L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2445587626810945995L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.Hw = r8;     // Catch: java.lang.Throwable -> L7
        j6(r9);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(org.w3c.dom.Element r9, java.lang.String r10, java.lang.Boolean r11) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 4164126699753548076L, this, r9, r10, r11);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4164126699753548076L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L9
    L5:
        if (r11 != null) goto L7;
        r9.setAttribute(r10, null);     // Catch: java.lang.Throwable -> L9
        return;
    L7:
        r9.setAttribute(r10, java.lang.Boolean.toString(r11.booleanValue()));     // Catch: java.lang.Throwable -> L9
    }
}
