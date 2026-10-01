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
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3671560543215849263L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3671560543215849263L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r6);     // Catch: java.lang.Throwable -> L8
    }

    public static int j6(java.lang.String r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -897592819188923648L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-897592819188923648L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        return new abcd.Fe(r7).j6(new abcd.Fe(r8));
    }

    @abcd.Interfacesu(method = -3451992004659523085L)
    private static java.lang.Integer j6(java.util.StringTokenizer r7) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 658817826007753575L, null, r7);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L23;
        abcd.wu.j6(658817826007753575L, null, r7);     // Catch: java.lang.Throwable -> L17
    L23:
        java.lang.String r3 = r7.nextToken();     // Catch: java.util.NoSuchElementException -> L15 java.lang.Throwable -> L17
        if (r3.length() <= 1) goto L14;
        if (r3.startsWith("0") == false) goto L14;
        throw new java.lang.NumberFormatException("Number part has a leading 0: '" + r3 + "'");     // Catch: java.util.NoSuchElementException -> L15 java.lang.Throwable -> L17
    L14:
        return java.lang.Integer.valueOf(r3);
    L16:
        throw new java.lang.NumberFormatException("Number is invalid");     // Catch: java.lang.Throwable -> L17
    }

    public boolean equals(java.lang.Object r6) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -52999457031490305L, this, r6);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-52999457031490305L, this, r6);     // Catch: java.lang.Throwable -> L17
    L7:
        if (this != r6) goto L10;
        return true;
    L10:
        if ((r6 instanceof abcd.Fe) == true) goto L12;
        return false;
    L12:
        if (j6((abcd.Fe) r6) == 0) goto L24;
        return false;
    L24:
        return true;
    }

    public int hashCode() {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 2312263160157605516L, this);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2312263160157605516L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return this.gn.hashCode() + 11;
    }

    public int j6(abcd.Fe r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -275886467630696664L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-275886467630696664L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if ((r5 instanceof abcd.Fe) == false) goto L11;
        return this.gn.j6(r5.gn);
    L11:
        return j6(new abcd.Fe(r5.toString()));
    }

    public final void j6(java.lang.String r11) {
    L49:
        th = move-exception;
        if (DW == false) goto L53;
        abcd.wu.j6(th, -17947187289656408L, this, r11);
    L53:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-17947187289656408L, this, r11);     // Catch: java.lang.Throwable -> L49
    L6:
        this.gn = new abcd.De(r11);     // Catch: java.lang.Throwable -> L49
        int r3 = r11.indexOf("-");     // Catch: java.lang.Throwable -> L49
        boolean r4 = false;
        boolean r5 = true;
        if (r3 >= 0) goto L9;
        java.lang.String r7 = r11;
        java.lang.String r6 = null;
    L11:
        if (r6 == null) goto L22;
    L20:
        this.VH = r6;     // Catch: java.lang.Throwable -> L49
        goto L22
    L13:
        if (r6.length() != 1) goto L15;
    L18:
        this.Zo = java.lang.Integer.valueOf(r6);     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L49
    L57:
    L15:
        if (r6.startsWith("0") == false) goto L18;
        this.VH = r6;     // Catch: java.lang.NumberFormatException -> L20 java.lang.Throwable -> L49
    L22:
        if (r7.contains(".") == false) goto L24;
    L28:
        java.util.StringTokenizer r8 = new java.util.StringTokenizer(r7, ".");     // Catch: java.lang.Throwable -> L49
        this.FH = j6(r8);     // Catch: java.lang.NumberFormatException -> L54 java.lang.Throwable -> L49
        if (r8.hasMoreTokens() == false) goto L33;
        this.Hw = j6(r8);     // Catch: java.lang.NumberFormatException -> L54 java.lang.Throwable -> L49
    L33:
        if (r8.hasMoreTokens() == false) goto L36;
        this.v5 = j6(r8);     // Catch: java.lang.NumberFormatException -> L54 java.lang.Throwable -> L49
    L36:
        if (r8.hasMoreTokens() == false) goto L39;
        this.VH = r8.nextToken();     // Catch: java.lang.NumberFormatException -> L54 java.lang.Throwable -> L49
        r4 = java.util.regex.Pattern.compile("\\d+").matcher(this.VH).matches();     // Catch: java.lang.NumberFormatException -> L54 java.lang.Throwable -> L49
    L39:
        if (r7.contains("..") == true) goto L46;
        if (r7.startsWith(".") == true) goto L46;
        if (r7.endsWith(".") == true) goto L46;
        r5 = r4;
    L46:
        if (r5 == false) goto L64;
        this.VH = r11;     // Catch: java.lang.Throwable -> L49
        this.FH = null;     // Catch: java.lang.Throwable -> L49
        this.Hw = null;     // Catch: java.lang.Throwable -> L49
        this.v5 = null;     // Catch: java.lang.Throwable -> L49
        this.Zo = null;     // Catch: java.lang.Throwable -> L49
        return;
    L64:
        return;
    L24:
        if (r7.startsWith("0") == true) goto L28;
        this.FH = java.lang.Integer.valueOf(r7);     // Catch: java.lang.NumberFormatException -> L27 java.lang.Throwable -> L49
    L65:
        return;
    L27:
        this.VH = r11;     // Catch: java.lang.Throwable -> L49
        this.Zo = null;     // Catch: java.lang.Throwable -> L49
        return;
    L9:
        r7 = r11.substring(0, r3);     // Catch: java.lang.Throwable -> L49
        r6 = r11.substring(r3 + 1);     // Catch: java.lang.Throwable -> L49
        goto L11
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3083817074424880961L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3083817074424880961L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.gn.toString();
    }
}
