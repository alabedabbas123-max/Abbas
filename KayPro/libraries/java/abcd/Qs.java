package abcd;

public final class Qs implements abcd.Rs, java.lang.Comparable<abcd.Qs> {
    public static final abcd.Qs BT = null;
    public static final abcd.Qs DW = null;
    public static final abcd.Qs EQ = null;
    public static final abcd.Qs FH = null;
    public static final abcd.Qs Hw = null;
    public static final abcd.Qs J0 = null;
    public static final abcd.Qs J8 = null;
    public static final abcd.Qs KD = null;
    public static final abcd.Qs Mr = null;
    public static final abcd.Qs P8 = null;
    public static final abcd.Qs QX = null;
    public static final abcd.Qs SI = null;
    public static final abcd.Qs U2 = null;
    public static final abcd.Qs VH = null;
    public static final abcd.Qs Ws = null;
    public static final abcd.Qs XL = null;
    public static final abcd.Qs Zo = null;
    public static final abcd.Qs a8 = null;
    public static final abcd.Qs aM = null;
    public static final abcd.Qs cn = null;
    public static final abcd.Qs ei = null;
    public static final abcd.Qs er = null;
    public static final abcd.Qs gW = null;
    public static final abcd.Qs gn = null;
    public static final abcd.Qs j3 = null;
    private static final java.util.HashMap<java.lang.String, abcd.Qs> j6 = null;
    public static final abcd.Qs lg = null;
    public static final abcd.Qs nw = null;
    public static final abcd.Qs rN = null;
    public static final abcd.Qs ro = null;
    public static final abcd.Qs sh = null;
    public static final abcd.Qs tp = null;
    public static final abcd.Qs u7 = null;
    public static final abcd.Qs v5 = null;
    public static final abcd.Qs vy = null;
    public static final abcd.Qs we = null;
    public static final abcd.Qs yS = null;
    private abcd.Qs Sf;
    private final java.lang.String cb;
    private final int dx;
    private java.lang.String ef;
    private abcd.Qs g3;
    private final int sG;
    private abcd.Qs vJ;

    static {
        j6 = new java.util.HashMap(500);
        DW = new abcd.Qs("Z", 1);
        FH = new abcd.Qs("B", 2);
        Hw = new abcd.Qs("C", 3);
        v5 = new abcd.Qs("D", 4);
        Zo = new abcd.Qs("F", 5);
        VH = new abcd.Qs("I", 6);
        gn = new abcd.Qs("J", 7);
        u7 = new abcd.Qs("S", 8);
        tp = new abcd.Qs("V", 0);
        EQ = new abcd.Qs("<null>", 9);
        we = new abcd.Qs("<addr>", 10);
        DW(DW);
        DW(FH);
        DW(Hw);
        DW(v5);
        DW(Zo);
        DW(VH);
        DW(gn);
        DW(u7);
        J0 = j6("Ljava/lang/annotation/Annotation;");
        J8 = j6("Ljava/lang/Class;");
        Ws = j6("Ljava/lang/Cloneable;");
        QX = j6("Ljava/lang/Object;");
        XL = j6("Ljava/io/Serializable;");
        aM = j6("Ljava/lang/String;");
        j3 = j6("Ljava/lang/Throwable;");
        Mr = j6("Ljava/lang/Boolean;");
        U2 = j6("Ljava/lang/Byte;");
        a8 = j6("Ljava/lang/Character;");
        lg = j6("Ljava/lang/Double;");
        rN = j6("Ljava/lang/Float;");
        er = j6("Ljava/lang/Integer;");
        yS = j6("Ljava/lang/Long;");
        gW = j6("Ljava/lang/Short;");
        BT = j6("Ljava/lang/Void;");
        vy = DW.Hw();
        P8 = FH.Hw();
        ei = Hw.Hw();
        nw = v5.Hw();
        SI = Zo.Hw();
        KD = VH.Hw();
        ro = gn.Hw();
        cn = QX.Hw();
        sh = u7.Hw();
    }

    private Qs(java.lang.String r2, int r3) {
        this(r2, r3, -1);
    }

    private Qs(java.lang.String r2, int r3, int r4) {
        if (r2 == null) goto L16;
        if (r3 < 0) goto L14;
        if (r3 >= 11) goto L14;
        if (r4 < (-1)) goto L12;
        this.cb = r2;
        this.dx = r3;
        this.sG = r4;
        this.Sf = null;
        this.vJ = null;
        this.g3 = null;
        return;
    L12:
        throw new java.lang.IllegalArgumentException("newAt < -1");
    L14:
        throw new java.lang.IllegalArgumentException("bad basicType");
    L16:
        throw new java.lang.NullPointerException("descriptor == null");
    }

    private static abcd.Qs DW(abcd.Qs r3) {
        java.util.HashMap<java.lang.String, abcd.Qs> r0 = j6;
        monitor-enter(r0);
        java.lang.String r1 = r3.J8();     // Catch: java.lang.Throwable -> L11
        abcd.Qs r2 = j6.get(r1);     // Catch: java.lang.Throwable -> L11
        if (r2 == null) goto L8;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return r2;
    L8:
        j6.put(r1, r3);     // Catch: java.lang.Throwable -> L11
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return r3;
    L11:
        th = move-exception;
        throw th;
    }

    public static abcd.Qs DW(java.lang.String r2) {
        if (r2 == null) goto L10;
        if (r2.startsWith("[") == false) goto L8;
        return j6(r2);
    L8:
        return j6('L' + r2 + ';');
    L10:
        throw new java.lang.NullPointerException("name == null");
    }

    public static abcd.Qs FH(java.lang.String r1) {
        if (r1.equals("V") == false) goto L7;
        return tp;
    L7:
        return j6(r1);
    L9:
        throw new java.lang.NullPointerException("descriptor == null");
    }

    public static abcd.Qs j6(java.lang.String r7) {
        java.util.HashMap<java.lang.String, abcd.Qs> r0 = j6;
        monitor-enter(r0);
        abcd.Qs r1 = j6.get(r7);     // Catch: java.lang.Throwable -> L48
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L48
        if (r1 == null) goto L55;
        return r1;
    L55:
        char r2 = r7.charAt(0);     // Catch: java.lang.NullPointerException -> L44 java.lang.IndexOutOfBoundsException -> L46
    L11:
        if (r2 == '[') goto L13;
        int r3 = r7.length();
        if (r2 != 'L') goto L43;
        int r4 = r3 - 1;
        if (r7.charAt(r4) != ';') goto L43;
        int r5 = 1;
    L19:
        if (r5 >= r4) goto L41;
        char r6 = r7.charAt(r5);
        if (r6 == '(') goto L39;
        if (r6 == ')') goto L39;
        if (r6 == '.') goto L39;
        if (r6 == '/') goto L31;
        if (r6 == ';') goto L39;
        if (r6 == '[') goto L39;
    L35:
        r5 = r5 + 1;
        goto L19
    L31:
        if (r5 == 1) goto L37;
        if (r5 == r4) goto L37;
        if (r7.charAt(r5 - 1) != '/') goto L35;
    L37:
        throw new java.lang.IllegalArgumentException("bad descriptor: " + r7);
    L39:
        throw new java.lang.IllegalArgumentException("bad descriptor: " + r7);
    L41:
        return DW(new abcd.Qs(r7, 9));
    L43:
        throw new java.lang.IllegalArgumentException("bad descriptor: " + r7);
    L13:
        return j6(r7.substring(1)).Hw();
    L47:
        throw new java.lang.IllegalArgumentException("descriptor is empty");
    L45:
        throw new java.lang.NullPointerException("descriptor == null");
    L48:
        th = move-exception;
        throw th;
    }

    public boolean BT() {
        switch(this.dx) {
            case 0: goto L6;
            case 1: goto L6;
            case 2: goto L6;
            case 3: goto L6;
            case 4: goto L6;
            case 5: goto L6;
            case 6: goto L6;
            case 7: goto L6;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        return true;
    }

    public abcd.Qs Hw() {
        if (this.Sf != null) goto L6;
        this.Sf = DW(new abcd.Qs('[' + this.cb, 9));
    L6:
        return this.Sf;
    }

    public java.lang.String J8() {
        return this.cb;
    }

    @Override
    public int Mr() {
        int r0 = this.dx;
        if (r0 != 1) goto L5;
    L12:
        return 6;
    L5:
        if (r0 == 2) goto L12;
        if (r0 == 3) goto L12;
        if (r0 == 6) goto L12;
        if (r0 == 8) goto L12;
        return r0;
    }

    public boolean P8() {
        if (this.sG < 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public abcd.Qs U2() {
        int r0 = this.dx;
        if (r0 == 1) goto L14;
        if (r0 == 2) goto L14;
        if (r0 == 3) goto L14;
        if (r0 == 6) goto L14;
        if (r0 == 8) goto L14;
        return this;
    L14:
        return VH;
    }

    @Override
    public abcd.Rs U2() {
        return U2();
    }

    public java.lang.String VH() {
        if (this.ef != null) goto L13;
        if (vy() == false) goto L11;
        if (this.cb.charAt(0) != '[') goto L9;
        this.ef = this.cb;
        goto L13
    L9:
        java.lang.String r0 = this.cb;
        this.ef = r0.substring(1, r0.length() - 1);
        goto L13
    L11:
        throw new java.lang.IllegalArgumentException("not an object type: " + this.cb);
    L13:
        return this.ef;
    }

    public abcd.Qs Ws() {
        abcd.Qs r0 = this.g3;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new java.lang.IllegalArgumentException("initialized type: " + this.cb);
    }

    public int Zo() {
        int r0 = this.dx;
        if (r0 != 4) goto L5;
        return 2;
    L5:
        if (r0 == 7) goto L10;
        return 1;
    L10:
        return 2;
    }

    @Override
    public boolean a8() {
        return false;
    }

    @Override
    public java.lang.String aM() {
        switch(this.dx) {
            case 0: goto L28;
            case 1: goto L26;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L20;
            case 5: goto L18;
            case 6: goto L16;
            case 7: goto L14;
            case 8: goto L12;
            case 9: goto L7;
            default: goto L5;
        };
    L12:
        return "short";
    L14:
        return "long";
    L16:
        return "int";
    L18:
        return "float";
    L20:
        return "double";
    L22:
        return "char";
    L24:
        return "byte";
    L26:
        return "boolean";
    L28:
        return "void";
    L5:
        return this.cb;
    L7:
        if (lg() == false) goto L11;
        return we().aM() + "[]";
    L11:
        return VH().replace("/", ".");
    }

    @Override
    public int compareTo(abcd.Qs r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof abcd.Qs) == true) goto L10;
        return false;
    L10:
        return this.cb.equals(((abcd.Qs) r2).cb);
    }

    public boolean er() {
        int r0 = this.dx;
        if (r0 != 4) goto L5;
        return false;
    L5:
        if (r0 == 7) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean gW() {
        int r0 = this.dx;
        if (r0 != 1) goto L5;
    L14:
        return true;
    L5:
        if (r0 == 2) goto L14;
        if (r0 == 3) goto L14;
        if (r0 == 6) goto L14;
        if (r0 == 8) goto L14;
        return false;
    }

    @Override
    public abcd.Qs getType() {
        return this;
    }

    public int hashCode() {
        return this.cb.hashCode();
    }

    @Override
    public int j3() {
        return this.dx;
    }

    public int j6(abcd.Qs r2) {
        return this.cb.compareTo(r2.cb);
    }

    public abcd.Qs j6(int r4) {
        if (r4 < 0) goto L14;
        if (vy() == false) goto L12;
        if (P8() == true) goto L10;
        abcd.Qs r1 = new abcd.Qs('N' + abcd.Yt.v5(r4) + this.cb, 9, r4);
        r1.g3 = this;
        return DW(r1);
    L10:
        throw new java.lang.IllegalArgumentException("already uninitialized: " + this.cb);
    L12:
        throw new java.lang.IllegalArgumentException("not a reference type: " + this.cb);
    L14:
        throw new java.lang.IllegalArgumentException("newAt < 0");
    }

    public boolean lg() {
        if (this.cb.charAt(0) != '[') goto L6;
        return true;
    L6:
        return false;
    }

    public boolean rN() {
        if (lg() == false) goto L5;
    L8:
        return true;
    L5:
        if (equals(EQ) == true) goto L8;
        return false;
    }

    public java.lang.String toString() {
        return this.cb;
    }

    public boolean vy() {
        if (this.dx != 9) goto L5;
        return true;
    L5:
        return false;
    }

    public abcd.Qs we() {
        if (this.vJ != null) goto L10;
        if (this.cb.charAt(0) != '[') goto L8;
        this.vJ = j6(this.cb.substring(1));
        goto L10
    L8:
        throw new java.lang.IllegalArgumentException("not an array type: " + this.cb);
    L10:
        return this.vJ;
    }

    public boolean yS() {
        int r0 = this.dx;
        if (r0 != 4) goto L5;
        return true;
    L5:
        if (r0 == 7) goto L10;
        return false;
    L10:
        return true;
    }
}
