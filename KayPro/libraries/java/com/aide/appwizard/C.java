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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 684569386058815335L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(684569386058815335L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH = "\t";
                        this.Hw = "\n";
                        this.v5 = "UTF8";
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5103385399890867351L)
    private void j6(java.io.Writer r8, java.lang.String r9) {
        int r0 = 0;
        int r1 = 0;
        char r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 24: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 29; continue $sw1; }
                    abcd.wu.j6(th, 4329959026196767271L, this, r8, r9);
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(4329959026196767271L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r9 != null) { $pc1 = 7; continue $sw1; }
                    return;
                }
                case 7: {
                    r0 = 0;
                    try {
                        r1 = r9.length();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r0 >= r1) { $pc1 = 23; continue $sw1; }
                    try {
                        r2 = r9.charAt(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    if (r2 != '\r') { $pc1 = 12; continue $sw1; }
                    try {
                        r8.write("&#xD;");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    r0 = r0 + 1;
                    { $pc1 = 8; continue $sw1; }
                }
                case 12: {
                    if (r2 != '&') { $pc1 = 14; continue $sw1; }
                    try {
                        r8.write("&amp;");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 22; continue $sw1; }
                }
                case 14: {
                    if (r2 != '<') { $pc1 = 16; continue $sw1; }
                    try {
                        r8.write("&lt;");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 22; continue $sw1; }
                }
                case 16: {
                    if (r2 == '>') { $pc1 = 18; continue $sw1; }
                    try {
                        r8.write(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 22; continue $sw1; }
                }
                case 18: {
                    try {
                        r8.write("&gt;");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 24; continue $sw1;
                    }
                    { $pc1 = 22; continue $sw1; }
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1800640810440494555L)
    private void j6(org.w3c.dom.Node r11, java.io.Writer r12, int r13, java.lang.String r14) {
        short r1 = 0;
        int r2 = 0;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        org.w3c.dom.NamedNodeMap r5 = null;
        int r6 = 0;
        org.w3c.dom.Attr r7 = null;
        org.w3c.dom.NodeList r8 = null;
        org.w3c.dom.NodeList r0 = null;
        int r9 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 39: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 44; continue $sw2; }
                    abcd.wu.j6(th, 1881309931079372915L, this, r11, r12, new java.lang.Integer(r13), r14);
                    $pc2 = 44; continue $sw2;
                }
                case 44: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1881309931079372915L, this, r11, r12, new java.lang.Integer(r13), r14);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r1 = r11.getNodeType();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    r2 = 0;
                    if (r1 != 1) { $pc2 = 9; continue $sw2; }
                    try {
                        r3 = r11.getNodeName();
                        r12.write(r14 + "<" + r3);
                        r4 = this.Hw + r14 + this.FH;
                        r5 = r11.getAttributes();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    r6 = 0;
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    if (r6 >= r5.getLength()) { $pc2 = 24; continue $sw2; }
                    try {
                        r7 = (org.w3c.dom.Attr) r5.item(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    if ("xmlns:android".equals(r7.getName()) == true) { $pc2 = 23; continue $sw2; }
                    try {
                        r12.write(r4);
                        r12.write(r7.getNodeName());
                        r12.write("=\"");
                        j6(r12, r7.getNodeValue());
                        r12.write("\"");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    try {
                        r6 = r6 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    { $pc2 = 19; continue $sw2; }
                }
                case 24: {
                    try {
                        r8 = r11.getChildNodes();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    if (r8 != null) { $pc2 = 27; continue $sw2; }
                    $pc2 = 36; continue $sw2;
                }
                case 36: {
                    try {
                        r12.write("/>");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    $pc2 = 37; continue $sw2;
                }
                case 37: {
                    try {
                        r12.write(this.Hw);
                        r12.write(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    return;
                }
                case 27: {
                    if (r8.getLength() <= 0) { $pc2 = 36; continue $sw2; }
                    try {
                        r12.write(">");
                        r12.write(this.Hw);
                        r12.write(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    $pc2 = 30; continue $sw2;
                }
                case 30: {
                    if (r2 >= r8.getLength()) { $pc2 = 35; continue $sw2; }
                    if (r8.item(r2).getNodeType() != 1) { $pc2 = 34; continue $sw2; }
                    try {
                        j6(r8.item(r2), r12, r13 + 1, r14 + this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    $pc2 = 34; continue $sw2;
                }
                case 34: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    { $pc2 = 30; continue $sw2; }
                }
                case 35: {
                    try {
                        r12.write(r14);
                        r12.write("</" + r3 + ">");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    { $pc2 = 37; continue $sw2; }
                }
                case 9: {
                    if (r1 != 9) { $pc2 = 54; continue $sw2; }
                    try {
                        r12.write("<?xml version=\"");
                        r12.write(((org.w3c.dom.Document) r11).getXmlVersion());
                        r12.write("\" encoding=\"utf-8\"");
                        r12.write("?>");
                        r12.write(this.Hw);
                        r0 = r11.getChildNodes();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    if (r0 == null) { $pc2 = 55; continue $sw2; }
                    r9 = 0;
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    if (r9 >= r0.getLength()) { $pc2 = 56; continue $sw2; }
                    try {
                        j6(r0.item(r9), r12, 0, "");
                        r9 = r9 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 39; continue $sw2;
                    }
                    { $pc2 = 15; continue $sw2; }
                }
                case 56: {
                    return;
                }
                case 55: {
                    return;
                }
                case 54: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    public java.lang.String j6(java.lang.Object r5) {
        java.io.StringWriter r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 12: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 16; continue $sw3; }
                    abcd.wu.j6(th, -704590524003572941L, this, r5);
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-704590524003572941L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = new java.io.StringWriter();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    try {
                        j6(r5, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 10; continue $sw3; }
                        $pc3 = 12; continue $sw3;
                    }
                    try {
                        r5 = r2.toString();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    return r5;
                }
                case 10: {
                    return "";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(org.w3c.dom.Document r8, java.io.Writer r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 7: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 11; continue $sw4; }
                    abcd.wu.j6(th, 488329981621894629L, this, r8, r9);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(488329981621894629L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        r8.normalize();
                        j6(r8, r9, 0, "");
                        r9.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
