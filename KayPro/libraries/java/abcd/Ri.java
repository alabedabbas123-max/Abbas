package abcd;

@abcd.Interfacexu
public class Ri extends Si<abcd.Ri> {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    public java.util.List<abcd.Ri.a> gn;

    @abcd.Interfacexu
    public static class a {
        public static abcd.Ri.a DW;

        @abcd.Interfacetu
        private static boolean FH;

        @abcd.Interfaceuu
        private static boolean Hw;
        public static abcd.Ri.a j6;
        public boolean VH;
        public java.lang.String Zo;
        public java.lang.String gn;
        public java.lang.String v5;

        static {
            abcd.wu.j6(abcd.Ri.a.class, -1065310913627962872L, -1065310913627962872L);     // Catch: java.lang.Throwable -> L8
            if (FH == false) goto L6;
            abcd.wu.j6(-2176665228994266777L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new abcd.Ri.a("con", "com.android.ide.eclipse.adt.ANDROID_FRAMEWORK", false);     // Catch: java.lang.Throwable -> L8
            DW = new abcd.Ri.a("con", "com.android.ide.eclipse.adt.LIBRARIES", false);     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, -2176665228994266777L, null);
        L12:
            throw th;
        }

        public a(java.lang.String r9, java.lang.String r10, boolean r11) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, -6247223109929446039L, null, r9, r10, new java.lang.Boolean(r11));
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-6247223109929446039L, null, r9, r10, new java.lang.Boolean(r11));     // Catch: java.lang.Throwable -> L7
        L5:
            this(r9, r10, r11, false, false);     // Catch: java.lang.Throwable -> L7
        }

        public a(java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, 6648045613493501984L, null, r10, r11, new java.lang.Boolean(r12), new java.lang.Boolean(r13));
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(6648045613493501984L, null, r10, r11, new java.lang.Boolean(r12), new java.lang.Boolean(r13));     // Catch: java.lang.Throwable -> L7
        L5:
            this(r10, r11, r12, r13, false);     // Catch: java.lang.Throwable -> L7
        }

        public a(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14, boolean r15) {
        L10:
            th = move-exception;
            if (Hw == false) goto L14;
            abcd.wu.j6(th, -1034563970835769881L, null, r11, r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14), new java.lang.Boolean(r15));
        L14:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-1034563970835769881L, null, r11, r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14), new java.lang.Boolean(r15));     // Catch: java.lang.Throwable -> L10
        L5:
            this.v5 = r11;     // Catch: java.lang.Throwable -> L10
            this.Zo = r12;     // Catch: java.lang.Throwable -> L10
            this.VH = r13;     // Catch: java.lang.Throwable -> L10
            if (r15 == false) goto L8;
            this.gn = abcd.Vl.tp(r12) + "[" + r12 + "]";     // Catch: java.lang.Throwable -> L10
            return;
        L8:
            this.gn = abcd.Vl.tp(r12);     // Catch: java.lang.Throwable -> L10
        }

        public boolean DW() {
        L13:
            th = move-exception;
            if (Hw == false) goto L17;
            abcd.wu.j6(th, -1596350155689589989L, this);
        L17:
            throw th;
        L4:
            if (FH == false) goto L7;
            abcd.wu.j6(-1596350155689589989L, this);     // Catch: java.lang.Throwable -> L13
        L7:
            if ("con".equals(this.v5) == false) goto L11;
            if ("com.android.ide.eclipse.adt.ANDROID_FRAMEWORK".equals(this.Zo) == false) goto L11;
            return true;
        L11:
            return false;
        }

        public boolean FH() {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, 1639909837772239520L, this);
        L12:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(1639909837772239520L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5.equals("lib");
        }

        public boolean Hw() {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, -1491417707468027112L, this);
        L12:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(-1491417707468027112L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5.equals("output");
        }

        public boolean Zo() {
        L13:
            th = move-exception;
            if (Hw == false) goto L17;
            abcd.wu.j6(th, 1643440063969047445L, this);
        L17:
            throw th;
        L4:
            if (FH == false) goto L7;
            abcd.wu.j6(1643440063969047445L, this);     // Catch: java.lang.Throwable -> L13
        L7:
            if (this.v5.equals("src") == false) goto L11;
            if (v5() == true) goto L11;
            return true;
        L11:
            return false;
        }

        public java.lang.String j6() {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, -5199314337533258320L, this);
        L12:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(-5199314337533258320L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.gn;
        }

        public java.lang.String j6(java.lang.String r5) {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, -2493407835925867112L, this, r5);
        L12:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(-2493407835925867112L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return abcd.Vl.VH(r5, this.Zo);
        }

        public boolean v5() {
        L16:
            th = move-exception;
            if (Hw == false) goto L20;
            abcd.wu.j6(th, 3912261602629235139L, this);
        L20:
            throw th;
        L4:
            if (FH == false) goto L7;
            abcd.wu.j6(3912261602629235139L, this);     // Catch: java.lang.Throwable -> L16
        L7:
            if (this.v5.equals("src") == true) goto L9;
        L14:
            return false;
        L9:
            if (this.Zo.startsWith("/") == false) goto L14;
            if (this.Zo.indexOf(47, 1) != (-1)) goto L14;
            return true;
        }
    }

    static {
        abcd.wu.j6(abcd.Ri.class, 5980416271982035L, 5980416271982035L);
    }

    public Ri() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 5288841975675453711L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(5288841975675453711L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 397412807389742520L)
    private Ri(java.lang.String r13) {
    L24:
        th = move-exception;
        if (VH == false) goto L29;
        abcd.wu.j6(th, -248598786622177603L, null, r13);
    L29:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-248598786622177603L, null, r13);     // Catch: java.lang.Throwable -> L24
    L6:
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L24
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        javax.xml.parsers.DocumentBuilderFactory r3 = javax.xml.parsers.DocumentBuilderFactory.newInstance();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        r3.setNamespaceAware(true);     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        org.w3c.dom.Document r4 = r3.newDocumentBuilder().parse(new java.io.File(r13).toURI().toString());     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        org.w3c.dom.NodeList r5 = (org.w3c.dom.NodeList) javax.xml.xpath.XPathFactory.newInstance().newXPath().compile("//classpathentry").evaluate(r4, javax.xml.xpath.XPathConstants.NODESET);     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        int r6 = 0;
    L8:
        if (r6 >= r5.getLength()) goto L38;
        org.w3c.dom.Node r7 = r5.item(r6);     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        org.w3c.dom.Node r8 = r7.getAttributes().getNamedItem("kind");     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        org.w3c.dom.Node r9 = r7.getAttributes().getNamedItem("path");     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        org.w3c.dom.Node r10 = r7.getAttributes().getNamedItem("exported");     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        if (r8 == null) goto L20;
        if (r9 == null) goto L20;
        java.lang.String r11 = r8.getNodeValue();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        java.lang.String r12 = r9.getNodeValue();     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        if (r10 != null) goto L16;
    L18:
        boolean r14 = false;
    L19:
        this.gn.add(new abcd.Ri.a(r11, r12, r14));     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L24
        goto L20
    L16:
        if ("true".equals(r10.getNodeValue()) == false) goto L18;
        r14 = true;
    L20:
        r6 = r6 + 1;
        goto L8
    L38:
        return;
    L21:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L24
    }

    public static void j6(java.lang.String r7, java.util.List<abcd.Ri.a> r8) {
    L17:
        th = move-exception;
        if (VH == false) goto L22;
        abcd.wu.j6(th, -1004877786870276783L, null, r7, r8);
    L22:
        throw th;
    L3:
        if (Zo == false) goto L25;
        abcd.wu.j6(-1004877786870276783L, null, r7, r8);     // Catch: java.lang.Throwable -> L17
    L25:
        org.w3c.dom.Document r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        org.w3c.dom.Element r1 = r0.createElement("classpath");     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        r0.appendChild(r1);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        java.util.Iterator<abcd.Ri.a> r2 = r8.iterator();     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
    L7:
        if (r2.hasNext() == false) goto L12;
        abcd.Ri.a r3 = r2.next();     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        org.w3c.dom.Element r4 = r0.createElement("classpathentry");     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        if (r3.VH == false) goto L11;
        r4.setAttribute("exported", "true");     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
    L11:
        r4.setAttribute("kind", r3.v5);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        r4.setAttribute("path", r3.Zo);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        r1.appendChild(r4);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        goto L7
    L12:
        javax.xml.transform.Transformer r5 = javax.xml.transform.TransformerFactory.newInstance().newTransformer();     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        r5.setOutputProperty("indent", "yes");     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        r5.transform(new javax.xml.transform.dom.DOMSource(r0), new javax.xml.transform.stream.StreamResult(new java.io.FileOutputStream(r7)));     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
    L30:
        return;
    L14:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L17
    }

    @abcd.Interfacesu(method = 575037052324698987L)
    protected abcd.Ri DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -2077286795582915475L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-2077286795582915475L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new abcd.Ri(r5);
    }

    protected abcd.AbstractSi m13DW(java.lang.String r1) {
        return DW(r1);
    }
}
