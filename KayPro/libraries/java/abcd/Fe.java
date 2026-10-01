package abcd;

@abcd.Interfacexu
public class Fe {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3831098547246871043L)
    private java.lang.Integer FH;

    @abcd.Interfaceru(field = 49573788078753747L)
    private java.lang.Integer Hw;

    @abcd.Interfaceru(field = 3073516918283723136L)
    private java.lang.String VH;

    @abcd.Interfaceru(field = 3186791793932260139L)
    private java.lang.Integer Zo;

    @abcd.Interfaceru(field = -685498020374294320L)
    private abcd.De gn;

    @abcd.Interfaceru(field = -3340825340044529600L)
    private java.lang.Integer v5;

    static {
        abcd.wu.j6(abcd.Fe.class, -105196403812237749L, -105196403812237749L);
    }

    public Fe(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -3671560543215849263L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3671560543215849263L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6(r6);
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

    public static int j6(java.lang.String r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, -897592819188923648L, null, r7, r8);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-897592819188923648L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    return new abcd.Fe(r7).j6(new abcd.Fe(r8));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3451992004659523085L)
    private static java.lang.Integer j6(java.util.StringTokenizer r7) {
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 17: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 21; continue $sw2; }
                    abcd.wu.j6(th, 658817826007753575L, null, r7);
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 23; continue $sw2; }
                    try {
                        abcd.wu.j6(658817826007753575L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 17; continue $sw2;
                    }
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    try {
                        r3 = r7.nextToken();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.util.NoSuchElementException) { $pc2 = 15; continue $sw2; }
                        $pc2 = 17; continue $sw2;
                    }
                    if (r3.length() <= 1) { $pc2 = 14; continue $sw2; }
                    if (r3.startsWith("0") == false) { $pc2 = 14; continue $sw2; }
                    try {
                        throw new java.lang.NumberFormatException("Number part has a leading 0: '" + r3 + "'");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.util.NoSuchElementException) { $pc2 = 15; continue $sw2; }
                        $pc2 = 17; continue $sw2;
                    }
                }
                case 14: {
                    return java.lang.Integer.valueOf(r3);
                }
                case 16: {
                    try {
                        throw new java.lang.NumberFormatException("Number is invalid");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 17; continue $sw2;
                    }
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 17: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 21; continue $sw3; }
                    abcd.wu.j6(th, -52999457031490305L, this, r6);
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(-52999457031490305L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 17; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (this != r6) { $pc3 = 10; continue $sw3; }
                    return true;
                }
                case 10: {
                    if ((r6 instanceof abcd.Fe) == true) { $pc3 = 12; continue $sw3; }
                    return false;
                }
                case 12: {
                    if (j6((abcd.Fe) r6) == 0) { $pc3 = 24; continue $sw3; }
                    return false;
                }
                case 24: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 9: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 13; continue $sw4; }
                    abcd.wu.j6(th, 2312263160157605516L, this);
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2312263160157605516L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 9; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return this.gn.hashCode() + 11;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Fe r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 12: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 16; continue $sw5; }
                    abcd.wu.j6(th, -275886467630696664L, this, r5);
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(-275886467630696664L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 12; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if ((r5 instanceof abcd.Fe) == false) { $pc5 = 11; continue $sw5; }
                    return this.gn.j6(r5.gn);
                }
                case 11: {
                    return j6(new abcd.Fe(r5.toString()));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(java.lang.String r11) {
        int r3 = 0;
        boolean r4 = false;
        boolean r5 = false;
        java.lang.String r7 = null;
        java.lang.String r6 = null;
        java.util.StringTokenizer r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 49: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 53; continue $sw6; }
                    abcd.wu.j6(th, -17947187289656408L, this, r11);
                    $pc6 = 53; continue $sw6;
                }
                case 53: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-17947187289656408L, this, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 49; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        this.gn = new abcd.De(r11);
                        r3 = r11.indexOf("-");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 49; continue $sw6;
                    }
                    r4 = false;
                    r5 = true;
                    if (r3 >= 0) { $pc6 = 9; continue $sw6; }
                    r7 = r11;
                    r6 = null;
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    if (r6 == null) { $pc6 = 22; continue $sw6; }
                    $pc6 = 13; continue $sw6;
                }
                case 20: {
                    try {
                        this.VH = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 49; continue $sw6;
                    }
                    { $pc6 = 22; continue $sw6; }
                }
                case 13: {
                    if (r6.length() != 1) { $pc6 = 15; continue $sw6; }
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    try {
                        this.Zo = java.lang.Integer.valueOf(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc6 = 20; continue $sw6; }
                        $pc6 = 49; continue $sw6;
                    }
                    $pc6 = 57; continue $sw6;
                }
                case 57: {
                    $pc6 = 15; continue $sw6;
                }
                case 15: {
                    if (r6.startsWith("0") == false) { $pc6 = 18; continue $sw6; }
                    try {
                        this.VH = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc6 = 20; continue $sw6; }
                        $pc6 = 49; continue $sw6;
                    }
                    $pc6 = 22; continue $sw6;
                }
                case 22: {
                    if (r7.contains(".") == false) { $pc6 = 24; continue $sw6; }
                    $pc6 = 28; continue $sw6;
                }
                case 28: {
                    try {
                        r8 = new java.util.StringTokenizer(r7, ".");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 49; continue $sw6;
                    }
                    try {
                        this.FH = j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc6 = 54; continue $sw6; }
                        $pc6 = 49; continue $sw6;
                    }
                    if (r8.hasMoreTokens() == false) { $pc6 = 33; continue $sw6; }
                    try {
                        this.Hw = j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc6 = 54; continue $sw6; }
                        $pc6 = 49; continue $sw6;
                    }
                    $pc6 = 33; continue $sw6;
                }
                case 33: {
                    if (r8.hasMoreTokens() == false) { $pc6 = 36; continue $sw6; }
                    try {
                        this.v5 = j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc6 = 54; continue $sw6; }
                        $pc6 = 49; continue $sw6;
                    }
                    $pc6 = 36; continue $sw6;
                }
                case 36: {
                    if (r8.hasMoreTokens() == false) { $pc6 = 39; continue $sw6; }
                    try {
                        this.VH = r8.nextToken();
                        r4 = java.util.regex.Pattern.compile("\\d+").matcher(this.VH).matches();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc6 = 54; continue $sw6; }
                        $pc6 = 49; continue $sw6;
                    }
                    $pc6 = 39; continue $sw6;
                }
                case 39: {
                    if (r7.contains("..") == true) { $pc6 = 46; continue $sw6; }
                    if (r7.startsWith(".") == true) { $pc6 = 46; continue $sw6; }
                    if (r7.endsWith(".") == true) { $pc6 = 46; continue $sw6; }
                    r5 = r4;
                    $pc6 = 46; continue $sw6;
                }
                case 46: {
                    if (r5 == false) { $pc6 = 64; continue $sw6; }
                    try {
                        this.VH = r11;
                        this.FH = null;
                        this.Hw = null;
                        this.v5 = null;
                        this.Zo = null;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 49; continue $sw6;
                    }
                    return;
                }
                case 64: {
                    return;
                }
                case 24: {
                    if (r7.startsWith("0") == true) { $pc6 = 28; continue $sw6; }
                    try {
                        this.FH = java.lang.Integer.valueOf(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc6 = 27; continue $sw6; }
                        $pc6 = 49; continue $sw6;
                    }
                    $pc6 = 65; continue $sw6;
                }
                case 65: {
                    return;
                }
                case 27: {
                    try {
                        this.VH = r11;
                        this.Zo = null;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 49; continue $sw6;
                    }
                    return;
                }
                case 9: {
                    try {
                        r7 = r11.substring(0, r3);
                        r6 = r11.substring(r3 + 1);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 49; continue $sw6;
                    }
                    { $pc6 = 11; continue $sw6; }
                }
                case 54: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 3083817074424880961L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(3083817074424880961L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return this.gn.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
