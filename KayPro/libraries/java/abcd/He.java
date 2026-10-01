package abcd;

@abcd.Interfacexu
public class He extends Si<abcd.He> {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    public java.util.List<java.lang.String> gn;

    static {
        abcd.wu.j6(abcd.He.class, 489031357727148317L, 489031357727148317L);
    }

    public He() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -464797732478146200L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-464797732478146200L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -151583346288489735L)
    private He(java.lang.String r8) {
    L17:
        th = move-exception;
        if (VH == false) goto L22;
        abcd.wu.j6(th, -3409270691436529372L, null, r8);
    L22:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-3409270691436529372L, null, r8);     // Catch: java.lang.Throwable -> L17
    L6:
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L17
        java.io.FileInputStream r3 = new java.io.FileInputStream(r8);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        org.w3c.dom.Document r4 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r3);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        r3.close();     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        org.w3c.dom.NodeList r5 = r4.getElementsByTagName("versions");     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        int r6 = 0;
        org.w3c.dom.Element r7 = (org.w3c.dom.Element) r5.item(0);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        if (r7 == null) goto L28;
        org.w3c.dom.NodeList r9 = r7.getElementsByTagName("version");     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
    L11:
        if (r6 >= r9.getLength()) goto L29;
        org.w3c.dom.Element r10 = (org.w3c.dom.Element) r9.item(r6);     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        this.gn.add(r10.getTextContent());     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L17
        r6 = r6 + 1;
        goto L11
    L29:
        return;
    L28:
        return;
    L14:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L17
    }

    public static java.lang.String j6(java.util.ArrayList<java.lang.String> r7, java.lang.String r8) {
    L13:
        th = move-exception;
        if (VH == false) goto L18;
        abcd.wu.j6(th, 759678053507465216L, null, r7, r8);
    L18:
        throw th;
    L3:
        if (Zo == false) goto L5;
        abcd.wu.j6(759678053507465216L, null, r7, r8);     // Catch: java.lang.Throwable -> L13
    L5:
        java.util.Collections.sort(r7, new abcd.Ge());     // Catch: java.lang.Throwable -> L13
        int r0 = r7.size() - 1;     // Catch: java.lang.Throwable -> L13
    L6:
        if (r0 < 0) goto L12;
        if (j6(r7.get(r0), r8) == true) goto L9;
        r0 = r0 - 1;
        goto L6
    L9:
        return r7.get(r0);
    L12:
        return null;
    }

    public static boolean j6(java.lang.String r7, java.lang.String r8) {
    L16:
        th = move-exception;
        if (VH == false) goto L20;
        abcd.wu.j6(th, -277436131022243353L, null, r7, r8);
    L20:
        throw th;
    L3:
        if (Zo == false) goto L6;
        abcd.wu.j6(-277436131022243353L, null, r7, r8);     // Catch: java.lang.Throwable -> L16
    L6:
        if (r8 != null) goto L9;
        return true;
    L9:
        if (r8.equals(r7) == false) goto L12;
        return true;
    L12:
        if (r8.contains("+") == false) goto L15;
        return r7.startsWith(r8.substring(0, r8.indexOf(43)));
    L15:
        return false;
    }

    @abcd.Interfacesu(method = -478014834558299088L)
    protected abcd.He DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -4761912503646473679L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-4761912503646473679L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new abcd.He(r5);
    }

    protected abcd.AbstractSi m7DW(java.lang.String r1) {
        return DW(r1);
    }

    public java.lang.String FH(java.lang.String r10) {
    L56:
        th = move-exception;
        if (VH == false) goto L61;
        abcd.wu.j6(th, -7741182119685418320L, this, r10);
    L61:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-7741182119685418320L, this, r10);     // Catch: java.lang.Throwable -> L56
    L7:
        if (r10.contains(",") == false) goto L43;
        java.lang.String r4 = r10.substring(1, r10.indexOf(44));     // Catch: java.lang.Throwable -> L56
        java.lang.String r2 = r10.substring(r10.indexOf(44) + 1, r10.length() - 1);     // Catch: java.lang.Throwable -> L56
        int r5 = 0;
        if (r10.charAt(0) != '[') goto L11;
        boolean r6 = true;
    L13:
        if (r10.charAt(r10.length() - 1) != ']') goto L15;
        boolean r7 = true;
    L16:
        int r8 = this.gn.size() - 1;     // Catch: java.lang.Throwable -> L56
        if (r2.length() <= 0) goto L25;
    L18:
        if (r8 < 0) goto L25;
        if (j6(this.gn.get(r8), r2) == true) goto L21;
        r8 = r8 - 1;     // Catch: java.lang.Throwable -> L56
        goto L18
    L21:
        if (r7 == true) goto L25;
        r8 = r8 - 1;     // Catch: java.lang.Throwable -> L56
    L25:
        if (r4.length() > 0) goto L27;
    L33:
        if (r8 < r5) goto L39;
        if (r5 >= this.gn.size()) goto L39;
        return this.gn.get(r8);
    L39:
        if (r5 < this.gn.size()) goto L41;
        return null;
    L41:
        return this.gn.get(r5);
    L27:
        if (r5 >= this.gn.size()) goto L33;
        if (j6(this.gn.get(r5), r4) == true) goto L30;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L56
        goto L27
    L30:
        if (r6 == true) goto L33;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L56
        goto L33
    L15:
        r7 = false;
        goto L16
    L11:
        r6 = false;
        goto L13
    L43:
        if (r10.startsWith("[") == true) goto L45;
    L47:
        int r3 = this.gn.size() - 1;     // Catch: java.lang.Throwable -> L56
    L48:
        if (r3 < 0) goto L70;
        if (j6(this.gn.get(r3), r10) == true) goto L52;
        r3 = r3 - 1;
        goto L48
    L52:
        return this.gn.get(r3);
    L70:
        return null;
    L45:
        if (r10.endsWith("]") == false) goto L47;
        r10 = r10.substring(1, r10.length() - 1);     // Catch: java.lang.Throwable -> L56
        goto L47
    }
}
