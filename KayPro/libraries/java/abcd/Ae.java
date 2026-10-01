package abcd;

@abcd.Interfacexu
public class Ae extends Si<abcd.Ae> {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -2126800007415439875L)
    private org.w3c.dom.Document gn;

    static {
        abcd.wu.j6(abcd.Ae.class, -2815793386376988455L, -2815793386376988455L);
    }

    @abcd.Interfacesu(method = -385020068839983183L)
    private Ae(java.lang.String r6) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 5521701210344206440L, null, r6);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(5521701210344206440L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        java.io.FileInputStream r3 = new java.io.FileInputStream(r6);     // Catch: java.lang.Throwable -> L8
        this.gn = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r3);     // Catch: java.lang.Throwable -> L8
        r3.close();     // Catch: java.lang.Throwable -> L8
    }

    public static java.lang.String DW(java.lang.String r8, abcd.Be r9, java.lang.String r10) {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, 194082609827507961L, null, r8, r9, r10);
    L14:
        throw th;
    L3:
        if (Zo == false) goto L15;
        abcd.wu.j6(194082609827507961L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L10
    L15:
        org.w3c.dom.Document r0 = new abcd.Ae(r8).gn;     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L10
        j6(r0, r9, r10);     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L10
        return DW(r0);
    L7:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L10
        return "";
    }

    @abcd.Interfacesu(method = -1702368748016177800L)
    private static java.lang.String DW(org.w3c.dom.Document r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 931555295004661227L, null, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(931555295004661227L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(r5, "//manifest", "package");
    }

    @abcd.Interfacesu(method = -4663087545807526779L)
    private static java.lang.String FH(org.w3c.dom.Document r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 503750616989038236L, null, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(503750616989038236L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(r5, "//manifest", "android:versionCode");
    }

    @abcd.Interfacesu(method = 410725858287807357L)
    private static java.lang.String Hw(org.w3c.dom.Document r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -4403766830729620544L, null, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4403766830729620544L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(r5, "//manifest", "android:versionName");
    }

    public static int j6(java.lang.String r8, abcd.Be r9, java.lang.String r10) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 564819199620203955L, null, r8, r9, r10);
    L15:
        throw th;
    L3:
        if (Zo == false) goto L16;
        abcd.wu.j6(564819199620203955L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L11
    L16:
        org.w3c.dom.Document r0 = new abcd.Ae(r8).gn;     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L11
        j6(r0, r9, r10);     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L11
        return j6(r0);
    L7:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L11
        return 1;
    }

    @abcd.Interfacesu(method = -807878901677309700L)
    private static int j6(org.w3c.dom.Document r5) {
    L12:
        th = move-exception;
        if (VH == false) goto L16;
        abcd.wu.j6(th, 4154319099555820453L, null, r5);
    L16:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(4154319099555820453L, null, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String r3 = j6(r5, "//manifest//uses-sdk", "android:minSdkVersion");     // Catch: java.lang.Throwable -> L12
        if (r3 == null) goto L10;
        return java.lang.Integer.parseInt(r3);
    L10:
        return 1;
    }

    @abcd.Interfacesu(method = 2944261911400176249L)
    private static java.lang.String j6(org.w3c.dom.Document r8, java.lang.String r9, java.lang.String r10) {
    L15:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, 1009877255924415764L, null, r8, r9, r10);
    L20:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(1009877255924415764L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L15
    L5:
        org.w3c.dom.NodeList r0 = (org.w3c.dom.NodeList) javax.xml.xpath.XPathFactory.newInstance().newXPath().compile(r9).evaluate(r8, javax.xml.xpath.XPathConstants.NODESET);     // Catch: java.lang.Throwable -> L15
        int r1 = 0;
    L7:
        if (r1 >= r0.getLength()) goto L13;
        org.w3c.dom.Node r2 = r0.item(r1).getAttributes().getNamedItem(r10);     // Catch: java.lang.Throwable -> L15
        if (r2 != null) goto L10;
        r1 = r1 + 1;
        goto L7
    L10:
        return r2.getNodeValue();
    L13:
        return null;
    }

    @abcd.Interfacesu(method = -1871071930795361304L)
    private static org.w3c.dom.Element j6(org.w3c.dom.Document r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (VH == false) goto L11;
        abcd.wu.j6(th, 6284882517312905037L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(6284882517312905037L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        return j6(r7, r8, false);
    }

    @abcd.Interfacesu(method = 61102968115873593L)
    private static org.w3c.dom.Element j6(org.w3c.dom.Document r10, java.lang.String r11, boolean r12) {
    L28:
        th = move-exception;
        if (VH == false) goto L33;
        abcd.wu.j6(th, 879104431048732992L, null, r10, r11, new java.lang.Boolean(r12));
    L33:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(879104431048732992L, null, r10, r11, new java.lang.Boolean(r12));     // Catch: java.lang.Throwable -> L28
    L5:
        java.lang.String[] r0 = r11.split("/");     // Catch: java.lang.Throwable -> L28
        org.w3c.dom.Node r3 = r10;
        int r2 = 0;
    L7:
        if (r2 >= r0.length) goto L26;
        org.w3c.dom.NodeList r4 = r3.getChildNodes();     // Catch: java.lang.Throwable -> L28
        org.w3c.dom.Element r6 = null;
        int r5 = 0;
    L10:
        if (r5 >= r4.getLength()) goto L22;
        org.w3c.dom.Node r7 = r4.item(r5);     // Catch: java.lang.Throwable -> L28
        if ((r7 instanceof org.w3c.dom.Element) == false) goto L21;
        if (r6 != null) goto L15;
        r6 = (org.w3c.dom.Element) r7;     // Catch: java.lang.Throwable -> L28
    L15:
        if (r12 == false) goto L19;
        if (r2 >= (r0.length - 1)) goto L21;
    L19:
        if (r0[r2].equals(((org.w3c.dom.Element) r7).getNodeName()) == false) goto L21;
        r3 = r7;
    L25:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L28
    L21:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L28
        goto L10
    L22:
        if (r6 == null) goto L24;
        r3 = r3.insertBefore(r10.createElement(r0[r2]), r6);     // Catch: java.lang.Throwable -> L28
        goto L25
    L24:
        r3 = r3.appendChild(r10.createElement(r0[r2]));     // Catch: java.lang.Throwable -> L28
        goto L25
    L26:
        return (org.w3c.dom.Element) r3;
    }

    @abcd.Interfacesu(method = -524565690821432919L)
    private static void j6(org.w3c.dom.Document r8, abcd.Be r9, java.lang.String r10) {
    L25:
        th = move-exception;
        if (VH == false) goto L29;
        abcd.wu.j6(th, -2608839633582255424L, null, r8, r9, r10);
    L29:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-2608839633582255424L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L25
    L5:
        if (r9 != null) goto L7;
        return;
    L7:
        org.w3c.dom.Element r0 = j6(r8, "manifest");     // Catch: java.lang.Throwable -> L25
        j6(r0, "package", r9.Zo(r10));     // Catch: java.lang.Throwable -> L25
        j6(r0, "android:versionCode", r9.tp(r10));     // Catch: java.lang.Throwable -> L25
        j6(r0, "android:versionName", r9.EQ(r10));     // Catch: java.lang.Throwable -> L25
        if (r9.Mr == null) goto L10;
        org.w3c.dom.Element r1 = j6(r8, "manifest/application/meta-data", true);     // Catch: java.lang.Throwable -> L25
        r1.setAttribute("android:name", "com.google.android.wearable.beta.app");     // Catch: java.lang.Throwable -> L25
        r1.setAttribute("android:resource", "@xml/wearable_app_desc");     // Catch: java.lang.Throwable -> L25
    L10:
        org.w3c.dom.Element r2 = j6(r8, "manifest/uses-sdk");     // Catch: java.lang.Throwable -> L25
        if (r9.VH(r10) == null) goto L15;
        j6(r2, "android:minSdkVersion", r9.VH(r10));     // Catch: java.lang.Throwable -> L25
    L19:
        if (r9.u7(r10) == null) goto L22;
        j6(r2, "android:targetSdkVersion", r9.u7(r10));     // Catch: java.lang.Throwable -> L25
        return;
    L22:
        if (r2.hasAttribute("android:targetSdkVersion") == true) goto L32;
        j6(r2, "android:targetSdkVersion", "1");     // Catch: java.lang.Throwable -> L25
        return;
    L32:
        return;
    L15:
        if (r2.hasAttribute("android:minSdkVersion") == true) goto L19;
        j6(r2, "android:minSdkVersion", "1");     // Catch: java.lang.Throwable -> L25
        goto L19
    }

    @abcd.Interfacesu(method = -202273822028747700L)
    private static void j6(org.w3c.dom.Element r8, java.lang.String r9, java.lang.String r10) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 538063144561914125L, null, r8, r9, r10);
    L12:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(538063144561914125L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L8
    L5:
        if (r10 == null) goto L15;
        r8.setAttribute(r9, r10);     // Catch: java.lang.Throwable -> L8
        return;
    }

    public static boolean j6(java.lang.String r9, java.lang.String r10, abcd.Be r11, java.lang.String r12) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, 730816239211625952L, null, r9, r10, r11, r12);
    L15:
        throw th;
    L3:
        if (Zo == false) goto L16;
        abcd.wu.j6(730816239211625952L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L11
    L16:
        org.w3c.dom.Document r0 = new abcd.Ae(r9).gn;     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L11
        j6(r0, r11, r12);     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L11
        return abcd.Ke.j6(r10, DW(r0), FH(r0), Hw(r0));
    L7:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L11
        return false;
    }

    public static boolean j6(java.lang.String r10, java.lang.String r11, abcd.Be r12, java.lang.String r13, java.lang.String r14) {
    L15:
        th = move-exception;
        if (VH == false) goto L19;
        abcd.wu.j6(th, -2561426981364255180L, null, r10, r11, r12, r13, r14);
    L19:
        throw th;
    L3:
        if (Zo == false) goto L20;
        abcd.wu.j6(-2561426981364255180L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L15
    L20:
        org.w3c.dom.Document r0 = new abcd.Ae(r10).gn;     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
        if (r12 == null) goto L8;
        j6(r0, r12, r14);     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
    L8:
        java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream();     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
        new abcd.Ee().j6(r0, r1);     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
        java.lang.String r2 = r1.toString().replace("${applicationId}", r13).replace("${packageName}", r13);     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
        java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter(new com.aide.common.na(r11));     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
        r3.write(r2);     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
        r3.close();     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L15
        return true;
    L11:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L15
        return false;
    }

    @abcd.Interfacesu(method = -174505432177597608L)
    protected abcd.Ae DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -27495034731372117L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-27495034731372117L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new abcd.Ae(r5);
    }

    protected abcd.AbstractSi m0DW(java.lang.String r1) {
        return DW(r1);
    }
}
