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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2953518849715377032L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2953518849715377032L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.gn = new java.util.ArrayList();
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

    @abcd.Interfacesu(method = 314159931413403505L)
    private Ie(java.lang.String r12) {
        java.io.FileInputStream r4 = null;
        org.w3c.dom.Document r5 = null;
        org.w3c.dom.NodeList r6 = null;
        int r7 = 0;
        org.w3c.dom.Element r8 = null;
        java.lang.String r9 = null;
        java.lang.String r10 = null;
        java.lang.String r11 = null;
        java.lang.String r13 = null;
        abcd.Be.g r14 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 37: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 42; continue $sw1; }
                    abcd.wu.j6(th, -107719386562926000L, null, r12);
                    $pc1 = 42; continue $sw1;
                }
                case 42: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-107719386562926000L, null, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 37; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.gn = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 37; continue $sw1;
                    }
                    try {
                        r4 = new java.io.FileInputStream(r12);
                        r5 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r4);
                        r4.close();
                        r6 = r5.getElementsByTagName("dependency");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 34; continue $sw1; }
                        $pc1 = 37; continue $sw1;
                    }
                    r7 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r7 >= r6.getLength()) { $pc1 = 60; continue $sw1; }
                    try {
                        r8 = (org.w3c.dom.Element) r6.item(r7);
                        r9 = j6(r8, "groupId");
                        r10 = j6(r8, "artifactId");
                        r11 = j6(r8, "version");
                        r13 = j6(r8, "scope");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 31; continue $sw1; }
                        $pc1 = 37; continue $sw1;
                    }
                    if (r9.length() <= 0) { $pc1 = 33; continue $sw1; }
                    if (r10.length() <= 0) { $pc1 = 33; continue $sw1; }
                    if (r9.contains("$") == true) { $pc1 = 33; continue $sw1; }
                    if (r10.contains("$") == true) { $pc1 = 33; continue $sw1; }
                    if ("test".equals(r13) == true) { $pc1 = 33; continue $sw1; }
                    if ("provided".equals(r13) == true) { $pc1 = 33; continue $sw1; }
                    if ("system".equals(r13) == true) { $pc1 = 33; continue $sw1; }
                    if (r11.length() != 0) { $pc1 = 27; continue $sw1; }
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    r11 = "+";
                    $pc1 = 29; continue $sw1;
                }
                case 29: {
                    try {
                        r14 = new abcd.Be.g(1);
                        this.gn.add(r14);
                        r14.gn = r9;
                        r14.u7 = r10;
                        r14.tp = r11;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 31; continue $sw1; }
                        $pc1 = 37; continue $sw1;
                    }
                    { $pc1 = 33; continue $sw1; }
                }
                case 27: {
                    if (r11.contains("$") == false) { $pc1 = 29; continue $sw1; }
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    r7 = r7 + 1;
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    e = $ex1;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 34; continue $sw1; }
                        $pc1 = 37; continue $sw1;
                    }
                    $pc1 = 60; continue $sw1;
                }
                case 60: {
                    return;
                }
                case 34: {
                    e = $ex1;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 37; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2223456332975435205L)
    private java.lang.String j6(org.w3c.dom.Element r8, java.lang.String r9) {
        org.w3c.dom.Node r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 11: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 15; continue $sw2; }
                    abcd.wu.j6(th, -3124335826768441140L, this, r8, r9);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-3124335826768441140L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = r8.getElementsByTagName(r9).item(0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    if (r0 != null) { $pc2 = 9; continue $sw2; }
                    return "";
                }
                case 9: {
                    return r0.getTextContent();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 20272089001895376L)
    protected abcd.Ie DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -6406485391767865503L, this, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-6406485391767865503L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return new abcd.Ie(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.AbstractSi m8DW(java.lang.String r1) {
        return DW(r1);
    }
}
