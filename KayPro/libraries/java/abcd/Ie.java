package abcd;

@abcd.Interfacexu
public class Ie extends Si<abcd.Ie> {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    public java.util.List<abcd.Be.g> gn;

    static {
        abcd.wu.j6(abcd.Ie.class, -6630460382604010147L, -6630460382604010147L);
    }

    public Ie() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 2953518849715377032L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(2953518849715377032L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 314159931413403505L)
    private Ie(java.lang.String r12) {
    L37:
        th = move-exception;
        if (VH == false) goto L42;
        abcd.wu.j6(th, -107719386562926000L, null, r12);
    L42:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-107719386562926000L, null, r12);     // Catch: java.lang.Throwable -> L37
    L6:
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L37
        java.io.FileInputStream r4 = new java.io.FileInputStream(r12);     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L37
        org.w3c.dom.Document r5 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r4);     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L37
        r4.close();     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L37
        org.w3c.dom.NodeList r6 = r5.getElementsByTagName("dependency");     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L37
        int r7 = 0;
    L9:
        if (r7 >= r6.getLength()) goto L60;
        org.w3c.dom.Element r8 = (org.w3c.dom.Element) r6.item(r7);     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        java.lang.String r9 = j6(r8, "groupId");     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        java.lang.String r10 = j6(r8, "artifactId");     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        java.lang.String r11 = j6(r8, "version");     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        java.lang.String r13 = j6(r8, "scope");     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        if (r9.length() <= 0) goto L33;
        if (r10.length() <= 0) goto L33;
        if (r9.contains("$") == true) goto L33;
        if (r10.contains("$") == true) goto L33;
        if ("test".equals(r13) == true) goto L33;
        if ("provided".equals(r13) == true) goto L33;
        if ("system".equals(r13) == true) goto L33;
        if (r11.length() != 0) goto L27;
    L28:
        r11 = "+";
    L29:
        abcd.Be.g r14 = new abcd.Be.g(1);     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        this.gn.add(r14);     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        r14.gn = r9;     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        r14.u7 = r10;     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        r14.tp = r11;     // Catch: java.lang.Exception -> L31 java.lang.Throwable -> L37
        goto L33
    L27:
        if (r11.contains("$") == false) goto L29;
    L33:
        r7 = r7 + 1;
    L31:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L37
    L60:
        return;
    L34:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L37
    }

    @abcd.Interfacesu(method = 2223456332975435205L)
    private java.lang.String j6(org.w3c.dom.Element r8, java.lang.String r9) {
    L11:
        th = move-exception;
        if (VH == false) goto L15;
        abcd.wu.j6(th, -3124335826768441140L, this, r8, r9);
    L15:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(-3124335826768441140L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        org.w3c.dom.Node r0 = r8.getElementsByTagName(r9).item(0);     // Catch: java.lang.Throwable -> L11
        if (r0 != null) goto L9;
        return "";
    L9:
        return r0.getTextContent();
    }

    @abcd.Interfacesu(method = 20272089001895376L)
    protected abcd.Ie DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -6406485391767865503L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-6406485391767865503L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new abcd.Ie(r5);
    }

    protected abcd.AbstractSi m8DW(java.lang.String r1) {
        return DW(r1);
    }
}
