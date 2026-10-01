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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -464797732478146200L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-464797732478146200L, null);
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

    @abcd.Interfacesu(method = -151583346288489735L)
    private He(java.lang.String r8) {
        java.io.FileInputStream r3 = null;
        org.w3c.dom.Document r4 = null;
        org.w3c.dom.NodeList r5 = null;
        int r6 = 0;
        org.w3c.dom.Element r7 = null;
        org.w3c.dom.NodeList r9 = null;
        org.w3c.dom.Element r10 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 17: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 22; continue $sw1; }
                    abcd.wu.j6(th, -3409270691436529372L, null, r8);
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-3409270691436529372L, null, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 17; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.gn = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 17; continue $sw1;
                    }
                    try {
                        r3 = new java.io.FileInputStream(r8);
                        r4 = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(r3);
                        r3.close();
                        r5 = r4.getElementsByTagName("versions");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 14; continue $sw1; }
                        $pc1 = 17; continue $sw1;
                    }
                    r6 = 0;
                    try {
                        r7 = (org.w3c.dom.Element) r5.item(0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 14; continue $sw1; }
                        $pc1 = 17; continue $sw1;
                    }
                    if (r7 == null) { $pc1 = 28; continue $sw1; }
                    try {
                        r9 = r7.getElementsByTagName("version");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 14; continue $sw1; }
                        $pc1 = 17; continue $sw1;
                    }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r6 >= r9.getLength()) { $pc1 = 29; continue $sw1; }
                    try {
                        r10 = (org.w3c.dom.Element) r9.item(r6);
                        this.gn.add(r10.getTextContent());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 14; continue $sw1; }
                        $pc1 = 17; continue $sw1;
                    }
                    r6 = r6 + 1;
                    { $pc1 = 11; continue $sw1; }
                }
                case 29: {
                    return;
                }
                case 28: {
                    return;
                }
                case 14: {
                    e = $ex1;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 17; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.util.ArrayList<java.lang.String> r7, java.lang.String r8) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 13: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 18; continue $sw2; }
                    abcd.wu.j6(th, 759678053507465216L, null, r7, r8);
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(759678053507465216L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        java.util.Collections.sort(r7, new abcd.Ge());
                        r0 = r7.size() - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r0 < 0) { $pc2 = 12; continue $sw2; }
                    if (j6(r7.get(r0), r8) == true) { $pc2 = 9; continue $sw2; }
                    r0 = r0 - 1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 9: {
                    return r7.get(r0);
                }
                case 12: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.lang.String r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 16: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 20; continue $sw3; }
                    abcd.wu.j6(th, -277436131022243353L, null, r7, r8);
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-277436131022243353L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r8 != null) { $pc3 = 9; continue $sw3; }
                    return true;
                }
                case 9: {
                    if (r8.equals(r7) == false) { $pc3 = 12; continue $sw3; }
                    return true;
                }
                case 12: {
                    if (r8.contains("+") == false) { $pc3 = 15; continue $sw3; }
                    return r7.startsWith(r8.substring(0, r8.indexOf(43)));
                }
                case 15: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -478014834558299088L)
    protected abcd.He DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -4761912503646473679L, this, r5);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-4761912503646473679L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return new abcd.He(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.AbstractSi m7DW(java.lang.String r1) {
        return DW(r1);
    }

    public java.lang.String FH(java.lang.String r10) {
        java.lang.String r4 = null;
        java.lang.String r2 = null;
        int r5 = 0;
        boolean r6 = false;
        boolean r7 = false;
        int r8 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 56: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 61; continue $sw5; }
                    abcd.wu.j6(th, -7741182119685418320L, this, r10);
                    $pc5 = 61; continue $sw5;
                }
                case 61: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(-7741182119685418320L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (r10.contains(",") == false) { $pc5 = 43; continue $sw5; }
                    try {
                        r4 = r10.substring(1, r10.indexOf(44));
                        r2 = r10.substring(r10.indexOf(44) + 1, r10.length() - 1);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    r5 = 0;
                    if (r10.charAt(0) != '[') { $pc5 = 11; continue $sw5; }
                    r6 = true;
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    if (r10.charAt(r10.length() - 1) != ']') { $pc5 = 15; continue $sw5; }
                    r7 = true;
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    try {
                        r8 = this.gn.size() - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    if (r2.length() <= 0) { $pc5 = 25; continue $sw5; }
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    if (r8 < 0) { $pc5 = 25; continue $sw5; }
                    if (j6(this.gn.get(r8), r2) == true) { $pc5 = 21; continue $sw5; }
                    try {
                        r8 = r8 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    { $pc5 = 18; continue $sw5; }
                }
                case 21: {
                    if (r7 == true) { $pc5 = 25; continue $sw5; }
                    try {
                        r8 = r8 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    $pc5 = 25; continue $sw5;
                }
                case 25: {
                    if (r4.length() > 0) { $pc5 = 27; continue $sw5; }
                    $pc5 = 33; continue $sw5;
                }
                case 33: {
                    if (r8 < r5) { $pc5 = 39; continue $sw5; }
                    if (r5 >= this.gn.size()) { $pc5 = 39; continue $sw5; }
                    return this.gn.get(r8);
                }
                case 39: {
                    if (r5 < this.gn.size()) { $pc5 = 41; continue $sw5; }
                    return null;
                }
                case 41: {
                    return this.gn.get(r5);
                }
                case 27: {
                    if (r5 >= this.gn.size()) { $pc5 = 33; continue $sw5; }
                    if (j6(this.gn.get(r5), r4) == true) { $pc5 = 30; continue $sw5; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    { $pc5 = 27; continue $sw5; }
                }
                case 30: {
                    if (r6 == true) { $pc5 = 33; continue $sw5; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    { $pc5 = 33; continue $sw5; }
                }
                case 15: {
                    r7 = false;
                    { $pc5 = 16; continue $sw5; }
                }
                case 11: {
                    r6 = false;
                    { $pc5 = 13; continue $sw5; }
                }
                case 43: {
                    if (r10.startsWith("[") == true) { $pc5 = 45; continue $sw5; }
                    $pc5 = 47; continue $sw5;
                }
                case 47: {
                    try {
                        r3 = this.gn.size() - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    $pc5 = 48; continue $sw5;
                }
                case 48: {
                    if (r3 < 0) { $pc5 = 70; continue $sw5; }
                    if (j6(this.gn.get(r3), r10) == true) { $pc5 = 52; continue $sw5; }
                    r3 = r3 - 1;
                    { $pc5 = 48; continue $sw5; }
                }
                case 52: {
                    return this.gn.get(r3);
                }
                case 70: {
                    return null;
                }
                case 45: {
                    if (r10.endsWith("]") == false) { $pc5 = 47; continue $sw5; }
                    try {
                        r10 = r10.substring(1, r10.length() - 1);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 56; continue $sw5;
                    }
                    { $pc5 = 47; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
