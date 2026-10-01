package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassF {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -131709279727562584L)
    private java.lang.String FH;

    @abcd.Interfaceru(field = -3121330221638074919L)
    private java.lang.String Hw;

    @abcd.Interfaceru(field = 3085287657942170795L)
    private java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassF.class, -103502061530551584L, -103502061530551584L);
    }

    public ClassF() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2807138158019341080L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2807138158019341080L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = "\t";     // Catch: java.lang.Throwable -> L8
        this.Hw = "\n";     // Catch: java.lang.Throwable -> L8
        this.v5 = "UTF8";     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 5590811234900238256L)
    private void j6(java.io.Writer r8, java.lang.String r9) {
    L24:
        th = move-exception;
        if (DW == false) goto L29;
        abcd.wu.j6(th, -2377119988337534208L, this, r8, r9);
    L29:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2377119988337534208L, this, r8, r9);     // Catch: java.lang.Throwable -> L24
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

    @abcd.Interfacesu(method = 6236262340326424680L)
    private void j6(org.w3c.dom.Node r11, java.io.Writer r12, int r13, java.lang.String r14) {
    L42:
        th = move-exception;
        if (DW == false) goto L47;
        abcd.wu.j6(th, -5670610947520645440L, this, r11, r12, new java.lang.Integer(r13), r14);
    L47:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5670610947520645440L, this, r11, r12, new java.lang.Integer(r13), r14);     // Catch: java.lang.Throwable -> L42
    L6:
        short r1 = r11.getNodeType();     // Catch: java.lang.Throwable -> L42
        int r2 = 0;
        if (r1 != 1) goto L9;
        java.lang.String r3 = r11.getNodeName();     // Catch: java.lang.Throwable -> L42
        r12.write(r14 + "<" + r3);     // Catch: java.lang.Throwable -> L42
        java.lang.String r4 = this.Hw + r14 + this.FH;     // Catch: java.lang.Throwable -> L42
        if (r13 != 0) goto L20;
        r12.write(r4);     // Catch: java.lang.Throwable -> L42
        r12.write("xmlns:android=\"http://schemas.android.com/apk/res/android\"");     // Catch: java.lang.Throwable -> L42
    L20:
        org.w3c.dom.NamedNodeMap r5 = r11.getAttributes();     // Catch: java.lang.Throwable -> L42
        int r6 = 0;
    L22:
        if (r6 >= r5.getLength()) goto L27;
        org.w3c.dom.Attr r7 = (org.w3c.dom.Attr) r5.item(r6);     // Catch: java.lang.Throwable -> L42
        if ("xmlns:android".equals(r7.getName()) == true) goto L26;
        r12.write(r4);     // Catch: java.lang.Throwable -> L42
        r12.write(r7.getNodeName());     // Catch: java.lang.Throwable -> L42
        r12.write("=\"");     // Catch: java.lang.Throwable -> L42
        j6(r12, r7.getNodeValue());     // Catch: java.lang.Throwable -> L42
        r12.write("\"");     // Catch: java.lang.Throwable -> L42
    L26:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L42
        goto L22
    L27:
        org.w3c.dom.NodeList r8 = r11.getChildNodes();     // Catch: java.lang.Throwable -> L42
        if (r8 != null) goto L30;
    L39:
        r12.write("/>");     // Catch: java.lang.Throwable -> L42
    L40:
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L42
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L42
        return;
    L30:
        if (r8.getLength() <= 0) goto L39;
        r12.write(">");     // Catch: java.lang.Throwable -> L42
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L42
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L42
    L33:
        if (r2 >= r8.getLength()) goto L38;
        if (r8.item(r2).getNodeType() != 1) goto L37;
        j6(r8.item(r2), r12, r13 + 1, r14 + this.FH);     // Catch: java.lang.Throwable -> L42
    L37:
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L42
        goto L33
    L38:
        r12.write(r14);     // Catch: java.lang.Throwable -> L42
        r12.write("</" + r3 + ">");     // Catch: java.lang.Throwable -> L42
        goto L40
    L9:
        if (r1 != 9) goto L57;
        r12.write("<?xml version=\"");     // Catch: java.lang.Throwable -> L42
        r12.write(((org.w3c.dom.Document) r11).getXmlVersion());     // Catch: java.lang.Throwable -> L42
        r12.write("\" encoding=\"utf-8\"");     // Catch: java.lang.Throwable -> L42
        r12.write("?>");     // Catch: java.lang.Throwable -> L42
        r12.write(this.Hw);     // Catch: java.lang.Throwable -> L42
        org.w3c.dom.NodeList r0 = r11.getChildNodes();     // Catch: java.lang.Throwable -> L42
        if (r0 == null) goto L58;
        int r9 = 0;
    L15:
        if (r9 >= r0.getLength()) goto L59;
        j6(r0.item(r9), r12, 0, "");     // Catch: java.lang.Throwable -> L42
        r9 = r9 + 1;     // Catch: java.lang.Throwable -> L42
        goto L15
    L59:
        return;
    L58:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    public java.lang.String j6(java.lang.Object r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 840818330498157888L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(840818330498157888L, this, r5);     // Catch: java.lang.Throwable -> L12
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
        abcd.wu.j6(th, -978879165632510772L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-978879165632510772L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        r8.normalize();     // Catch: java.lang.Throwable -> L7
        j6(r8, r9, 0, "");     // Catch: java.lang.Throwable -> L7
        r9.flush();     // Catch: java.lang.Throwable -> L7
    }
}
