package abcd;

@abcd.Interfacexu
public class ca {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1420197080429944196L)
    private final abcd.C0693ea FH;

    @abcd.Interfaceru(field = 1535582088253125792L)
    private java.util.List<java.lang.String> Hw;

    @abcd.Interfacexu
    private static final enum a extends java.lang.Enum<abcd.ca.a> {

        @abcd.Interfaceru(field = 1318322202870435900L)
        public static final abcd.ca.a DW = null;

        @abcd.Interfaceru(field = 5771517785451500820L)
        public static final abcd.ca.a FH = null;

        @abcd.Interfaceru(field = 253668929672137807L)
        public static final abcd.ca.a Hw = null;

        @abcd.Interfaceuu
        private static boolean VH;

        @abcd.Interfacetu
        private static boolean Zo;

        @abcd.Interfaceru(field = -1278772349581971965L)
        public static final abcd.ca.a j6 = null;
        private static final abcd.ca.a[] v5 = null;

        static {
            abcd.wu.j6(abcd.ca.a.class, 4820548802342387328L, 4820548802342387328L);     // Catch: java.lang.Throwable -> L8
            if (Zo == false) goto L6;
            abcd.wu.j6(-440410237080866745L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new abcd.ca.a("START", 0);     // Catch: java.lang.Throwable -> L8
            DW = new abcd.ca.a("DOLLAR_READ", 1);     // Catch: java.lang.Throwable -> L8
            FH = new abcd.ca.a("DOLLAR_NUMBER_READ", 2);     // Catch: java.lang.Throwable -> L8
            Hw = new abcd.ca.a("DOLLAR_PAREN_READ", 3);     // Catch: java.lang.Throwable -> L8
            v5 = new abcd.ca.a[]{j6, DW, FH, Hw};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, -440410237080866745L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = -118229739546468643L)
        private a(java.lang.String r8, int r9) {
        L7:
            th = move-exception;
            if (VH == false) goto L11;
            abcd.wu.j6(th, 1298458570599949248L, null, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (Zo == false) goto L5;
            abcd.wu.j6(1298458570599949248L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = -764531088161789052L)
        public static abcd.ca.a valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, 245931603353716811L, null, r5);
        L12:
            throw th;
        L4:
            if (Zo == false) goto L6;
            abcd.wu.j6(245931603353716811L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (abcd.ca.a) java.lang.Enum.valueOf(abcd.ca.a.class, r5);
        }

        @abcd.Interfacesu(method = 1853150766664029184L)
        public static abcd.ca.a[] values() {
        L8:
            th = move-exception;
            if (VH == false) goto L12;
            abcd.wu.j6(th, 2377543822108765865L, null);
        L12:
            throw th;
        L4:
            if (Zo == false) goto L6;
            abcd.wu.j6(2377543822108765865L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (abcd.ca.a[]) v5.clone();
        }
    }

    static {
        abcd.wu.j6(abcd.ca.class, 340607572698323840L, 340607572698323840L);
    }

    public ca(abcd.C0693ea r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1779991663647602448L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1779991663647602448L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    static abcd.C0693ea DW(abcd.ca r0) {
        return r0.FH;
    }

    @abcd.Interfacesu(method = -1472725045402226016L)
    private java.util.List<java.lang.Integer> DW(java.lang.String r13) {
    L46:
        th = move-exception;
        if (DW == false) goto L51;
        abcd.wu.j6(th, -35370548446501285L, this, r13);
    L51:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-35370548446501285L, this, r13);     // Catch: java.lang.Throwable -> L46
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L46
        abcd.ca.a r3 = abcd.ca.a.j6;     // Catch: java.lang.Throwable -> L46
        java.lang.StringBuffer r4 = new java.lang.StringBuffer();     // Catch: java.lang.Throwable -> L46
        abcd.ca.a r6 = r3;
        int r5 = 0;
    L8:
        if (r5 >= r13.length()) goto L44;
        char r7 = r13.charAt(r5);     // Catch: java.lang.Throwable -> L46
        int r8 = abcd.ba.j6[r6.ordinal()];     // Catch: java.lang.Throwable -> L46
        if (r8 != 1) goto L12;
        if (r7 != '$') goto L43;
        r4.setLength(0);     // Catch: java.lang.Throwable -> L46
        r6 = abcd.ca.a.DW;     // Catch: java.lang.Throwable -> L46
    L43:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L46
        goto L8
    L12:
        if (r8 != 2) goto L14;
        if (r7 == '$') goto L30;
        if (r7 != '(') goto L36;
        r6 = abcd.ca.a.Hw;     // Catch: java.lang.Throwable -> L46
        goto L43
    L36:
        if (r7 >= '0') goto L38;
    L40:
        r6 = abcd.ca.a.FH;     // Catch: java.lang.Throwable -> L46
        goto L43
    L38:
        if (r7 > '9') goto L40;
        r4.append(r7);     // Catch: java.lang.Throwable -> L46
        goto L43
    L30:
        if (r4.length() > 0) goto L57;
    L32:
        r6 = abcd.ca.a.j6;     // Catch: java.lang.Throwable -> L46
        goto L43
    L57:
        r2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(r4.toString())));     // Catch: java.lang.NumberFormatException -> L54 java.lang.Throwable -> L46
        goto L32
    L14:
        if (r8 != 3) goto L16;
        if (r7 == '$') goto L23;
        if (r7 != '(') goto L43;
        r6 = abcd.ca.a.Hw;     // Catch: java.lang.Throwable -> L46
        goto L43
    L23:
        if (r4.length() > 0) goto L59;
    L25:
        r6 = abcd.ca.a.j6;     // Catch: java.lang.Throwable -> L46
        goto L43
    L59:
        r2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(r4.toString())));     // Catch: java.lang.NumberFormatException -> L53 java.lang.Throwable -> L46
        goto L25
    L16:
        if (r8 != 4) goto L43;
        if (r7 != ')') goto L43;
        r6 = abcd.ca.a.FH;     // Catch: java.lang.Throwable -> L46
        goto L43
    L44:
        java.util.Collections.sort(r2);     // Catch: java.lang.Throwable -> L46
        return r2;
    }

    @abcd.Interfacesu(method = 5138338570135835075L)
    private int FH(java.lang.String r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 60144035012393200L, this, r7);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L19;
        abcd.wu.j6(60144035012393200L, this, r7);     // Catch: java.lang.Throwable -> L14
    L19:
    L13:
        return 0;
    L8:
        if (r7.indexOf(61) != (-1)) goto L12;
        return java.lang.Integer.parseInt(r7);
    L12:
        return java.lang.Integer.parseInt(r7.substring(0, r7.indexOf(61)));
    }

    @abcd.Interfacesu(method = 1577985851696311795L)
    private java.lang.String j6(java.lang.String r6) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 2117559930838360020L, this, r6);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L8;
        abcd.wu.j6(2117559930838360020L, this, r6);     // Catch: java.lang.Throwable -> L15
    L8:
        if (r6.startsWith("$") == true) goto L11;
        return "";
    L11:
        if (r6.endsWith("$") == true) goto L13;
        return "";
    L13:
        return r6.substring(1, r6.length() - 1);
    }

    static java.util.List j6(abcd.ca r0) {
        return r0.Hw;
    }

    @abcd.Interfacesu(method = 4825787225887631723L)
    private java.util.List<java.lang.String> j6(java.lang.String r15, int r16, java.util.Map<java.lang.String, java.lang.String> r17, abcd.Da r18, int r19, int r20, abcd.Interfacena r21) {
        if (j6 == false) goto L6;
        abcd.wu.j6(-3328253741340620528L, this, new java.lang.Object[]{r15, new java.lang.Integer(r16), r17, r18, new java.lang.Integer(r19), new java.lang.Integer(r20), r21});
    L6:
        java.lang.String r12 = r15;
    L7:
        int r1 = r12.lastIndexOf(36);
        if (r1 == (-1)) goto L13;
        int r3 = r1 - 1;
        int r4 = r12.lastIndexOf(36, r3);
        if (r4 == (-1)) goto L13;
        int r13 = r4;
    L15:
        if (r13 == (-1)) goto L21;
        if (r12.lastIndexOf(41, r3) < r13) goto L21;
        if (r12.lastIndexOf(40, r3) >= r13) goto L21;
        r13 = r12.lastIndexOf(36, r13 - 1);
    L21:
        java.lang.String r2 = r12.substring(r13 + 1, r1);
        if (FH(r2) != r16) goto L26;
        java.util.List<java.lang.String> r0 = j6(r2, r17, r18, r19, r20, r21);
        if (r0 == null) goto L26;
        return r0;
    L26:
        r12 = r12.substring(0, r13);
    L13:
        return java.util.Collections.EMPTY_LIST;
    }

    @abcd.Interfacesu(method = 335884553739459185L)
    private java.util.List<java.lang.String> j6(java.lang.String r9, java.util.List<java.lang.String> r10, abcd.Da r11, int r12, int r13, abcd.Interfacena r14) {
        if (j6 == false) goto L5;
        abcd.wu.j6(6723055715128127960L, this, new java.lang.Object[]{r9, r10, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), r14});
    L5:
        this.Hw = new java.util.ArrayList();
        r14.u7().j6(new abcd.C0518aa(this), r11, r12, r13, r9, r10);
        return this.Hw;
    }

    @abcd.Interfacesu(method = 2914420775136453632L)
    private java.util.List<java.lang.String> j6(java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, abcd.Da r16, int r17, int r18, abcd.Interfacena r19) {
        if (j6 == false) goto L7;
        abcd.wu.j6(-4492688182664606281L, this, new java.lang.Object[]{r14, r15, r16, new java.lang.Integer(r17), new java.lang.Integer(r18), r19});
    L7:
        if (r14.indexOf(61) != (-1)) goto L9;
        return null;
    L9:
        java.lang.String r0 = r14.substring(r14.indexOf(61) + 1, r14.length());
        if (r0.indexOf(40) != (-1)) goto L12;
        return null;
    L12:
        java.lang.String r5 = r0.substring(0, r0.indexOf(40));
        java.lang.String r1 = r0.substring(r0.indexOf(40) + 1, r0.length() - 1);
        java.util.ArrayList r2 = new java.util.ArrayList();
        if (r1.length() <= 0) goto L25;
    L15:
        if (r1.indexOf(44) == (-1)) goto L21;
        java.lang.String r9 = r1.substring(0, r1.indexOf(44));
        if (r15.containsKey(j6(r9)) == false) goto L19;
        r9 = r15.get(j6(r9));
    L19:
        r2.add(r9);
        r1 = r1.substring(r1.indexOf(44) + 1, r1.length());
        goto L15
    L21:
        if (r15.containsKey(j6(r1)) == false) goto L23;
        r1 = r15.get(j6(r1));
    L23:
        r2.add(r1);
    L25:
        return j6(r5, r2, r16, r17, r18, r19);
    }

    public int j6(java.util.Map<java.lang.String, java.lang.String> r19, java.lang.String r20, int r21, int r22, abcd.Da r23, int r24, int r25) {
        if (j6 == false) goto L5;
        int r5 = r21;
        int r6 = r22;
        abcd.wu.j6(63504214519713200L, this, new java.lang.Object[]{r19, r20, new java.lang.Integer(r5), new java.lang.Integer(r6), r23, new java.lang.Integer(r24), new java.lang.Integer(r25)});
    L6:
        abcd.Sa r15 = this.FH.U2.FH(r23, r24, r25);
        if (r15.J8().u7() == null) goto L33;
        java.util.Iterator<java.lang.Integer> r16 = DW(r20).iterator();
        int r7 = r6;
    L10:
        if (r16.hasNext() == false) goto L37;
        java.lang.Integer r8 = r16.next();
        if (r5 != (-1)) goto L15;
        r5 = r8.intValue();
    L15:
        if (r8.intValue() < r5) goto L27;
        int r14 = r5;
        int r10 = r7;
        java.util.List<java.lang.String> r0 = j6(r20, r8.intValue(), r19, r23, r24, r25, r15.J8());
        if (r0.isEmpty() == false) goto L20;
        r19.put(r8 + "", "V" + r8);
    L29:
        r7 = r10;
    L30:
        r5 = r14;
        goto L10
    L20:
        if (r8.intValue() == r14) goto L22;
        r19.put(r8 + "", r0.get(0));
        goto L29
    L22:
        if (r10 < r0.size()) goto L24;
        r7 = 0;
    L25:
        r19.put(r8 + "", r0.get(r7));
        goto L30
    L24:
        r7 = r10;
        goto L25
    L27:
        r14 = r5;
        r10 = r7;
        goto L29
    L37:
        return r7;
    L33:
        return r6;
    L5:
        r5 = r21;
        r6 = r22;
        goto L6
    }
}
