package com.aide.appwizard;

@abcd.Interfacexu
public class C {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -517662823479348361L)
    private java.lang.String FH;

    @abcd.Interfaceru(field = -3223402235617873536L)
    private java.lang.String Hw;

    @abcd.Interfaceru(field = -1497295743178916320L)
    private java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.appwizard.C.class, 3132958223131404353L, 3132958223131404353L);
    }

    public C() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 684569386058815335L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(684569386058815335L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = "\t";     // Catch: java.lang.Throwable -> L8
        this.Hw = "\n";     // Catch: java.lang.Throwable -> L8
        this.v5 = "UTF8";     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -5103385399890867351L)
    private void j6(java.io.Writer r8, java.lang.String r9) {
    L24:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, 4329959026196767271L, this, r8, r9);
    L29:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4329959026196767271L, this, r8, r9);     // Catch: java.lang.Throwable -> L24
    L5:
        if (r9 != null) goto L7;
        return;
    L7:
        int r0 = 0;
        int r1 = r9.length();     // Catch: java.lang.Throwable -> L24
    L8:
        if (r0 >= r1) goto L23;
        char r2 = r9.charAt(r0);     // Catch: java.lang.Throwable -> L24
        if (r2 != '\r') goto L12;
        r8.write("&#xD;");     // Catch: java.lang.Throwable -> L24
    L22:
        r0 = r0 + 1;
        goto L8
    L12:
        if (r2 != '&') goto L14;
        r8.write("&amp;");     // Catch: java.lang.Throwable -> L24
        goto L22
    L14:
        if (r2 != '<') goto L16;
        r8.write("&lt;");     // Catch: java.lang.Throwable -> L24
        goto L22
    L16:
        if (r2 == '>') goto L18;
        r8.write(r2);     // Catch: java.lang.Throwable -> L24
        goto L22
    L18:
        r8.write("&gt;");     // Catch: java.lang.Throwable -> L24
        goto L22
    }

    @abcd.Interfacesu(method = -1800640810440494555L)
    private void j6(org.w3c.dom.Node r11, java.io.Writer r12, int r13, java.lang.String r14) {
    L39:
        th = move-exception;
        if (DW == false) goto L44;
        abcd.wu.j6(th, 1881309931079372915L, this, r11, r12, new java.lang.Integer(r13), r14);
    L44:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1881309931079372915L, this, r11, r12, new java.lang.Integer(r13), r14);     // Catch: java.lang.Throwable -> L39
    L6:
        short r1 = r11.getNodeType();     // Catch: java.lang.Throwable -> L39
        int r2 = 0;
        if (r1 != 1) goto L9;
        java.lang.String r3 = r11.getNodeName();     // Catch: java.lang.Throwable -> L39
        r12.write(r14 + "<" + r3);     // Catch: java.lang.Throwable -> L39
        java.lang.String r4 = this.Hw + r14 + this.FH;     // Catch: java.lang.Throwable -> L39
        org.w3c.dom.NamedNodeMap r5 = r11.getAttributes();     // Catch: java.lang.Throwable -> L39
        int r6 = 0;
    L19:
        if (r6 >= r5.getLength()) goto L24;
        org.w3c.dom.Attr r7 = (org.w3c.dom.Attr) r5.item(r6);     // Catch: java.lang.Throwable -> L39
        if ("xmlns:android".equals(r7.getName()) == true) goto L23;
        r12.write(r4);     // Catch: java.lang.Throwable -> L39
        r12.write(r7.getNodeName());     // Catch: java.lang.Throwable -> L39
        r12.write("=\"");     // Catch: java.lang.Throwable -> L39
        j6(r12, r7.getNodeValue());     // Catch: java.lang.Throwable -> L39
        r12.write("\"");     // Catch: java.lang.Throwable -> L39
    L23:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L39
        goto L19
    L24:
        org.w3c.dom.NodeList r8 = r11.getChildNodes();     // Catch: java.lang.Throwable -> L39
        if (r8 != null) goto L27;
    L36:
        r12.write("/>");     // Catch: java.lang.Throwable -> L39
    L37:
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L39
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L39
        return;
    L27:
        if (r8.getLength() <= 0) goto L36;
        r12.write(">");     // Catch: java.lang.Throwable -> L39
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L39
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L39
    L30:
        if (r2 >= r8.getLength()) goto L35;
        if (r8.item(r2).getNodeType() != 1) goto L34;
        j6(r8.item(r2), r12, r13 + 1, r14 + this.FH);     // Catch: java.lang.Throwable -> L39
    L34:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L39
        goto L30
    L35:
        r12.write(r14);     // Catch: java.lang.Throwable -> L39
        r12.write("</" + r3 + ">");     // Catch: java.lang.Throwable -> L39
        goto L37
    L9:
        if (r1 != 9) goto L54;
        r12.write("<?xml version=\"");     // Catch: java.lang.Throwable -> L39
        r12.write(((org.w3c.dom.Document) r11).getXmlVersion());     // Catch: java.lang.Throwable -> L39
        r12.write("\" encoding=\"utf-8\"");     // Catch: java.lang.Throwable -> L39
        r12.write("?>");     // Catch: java.lang.Throwable -> L39
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L39
        org.w3c.dom.NodeList r0 = r11.getChildNodes();     // Catch: java.lang.Throwable -> L39
        if (r0 == null) goto L55;
        int r9 = 0;
    L15:
        if (r9 >= r0.getLength()) goto L56;
        j6(r0.item(r9), r12, 0, "");     // Catch: java.lang.Throwable -> L39
        r9 = r9 + 1;     // Catch: java.lang.Throwable -> L39
        goto L15
    L56:
        return;
    L55:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    public java.lang.String j6(java.lang.Object r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -704590524003572941L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-704590524003572941L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        java.io.StringWriter r2 = new java.io.StringWriter();     // Catch: java.lang.Throwable -> L12
        j6(r5, r2);     // Catch: java.io.IOException -> L10 java.lang.Throwable -> L12
        r5 = r2.toString();     // Catch: java.lang.Throwable -> L12
        return r5;
    L10:
        return "";
    }

    public void j6(org.w3c.dom.Document r8, java.io.Writer r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 488329981621894629L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(488329981621894629L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        r8.normalize();     // Catch: java.lang.Throwable -> L7
        j6(r8, r9, 0, "");     // Catch: java.lang.Throwable -> L7
        r9.flush();     // Catch: java.lang.Throwable -> L7
    }
}
