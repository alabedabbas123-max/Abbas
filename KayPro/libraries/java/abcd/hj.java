package abcd;

@abcd.Interfacexu
class hj extends Si<abcd.hj> {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 6420730536516007040L)
    public boolean EQ;

    @abcd.Interfaceru(field = -5712552001033153776L)
    public java.util.List<abcd.hj.a> gn;

    @abcd.Interfaceru(field = -2462112048428360944L)
    public java.lang.Integer tp;

    @abcd.Interfaceru(field = -2699431963383238656L)
    public java.util.List<abcd.hj.a> u7;

    @abcd.Interfacexu
    public static class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;
        public java.lang.String FH;
        public boolean Hw;

        static {
            abcd.wu.j6(abcd.hj.a.class, -227906591033410528L, -227906591033410528L);
        }

        public a(java.lang.String r8, boolean r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 943014598225816909L, null, r8, new java.lang.Boolean(r9));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(943014598225816909L, null, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r8;     // Catch: java.lang.Throwable -> L7
            this.Hw = r9;     // Catch: java.lang.Throwable -> L7
        }

        public java.lang.String j6(java.lang.String r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1372488752088498287L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1372488752088498287L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return abcd.Vl.VH(r5, this.FH);
        }
    }

    static {
        abcd.wu.j6(abcd.hj.class, -1429123027277193984L, -1429123027277193984L);
    }

    @abcd.Interfacesu(method = -3242933019518288184L)
    public hj() {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 1488114728130320885L, null);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(1488114728130320885L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = -384483565642003344L)
    private hj(java.lang.String r12) {
    L36:
        th = move-exception;
        if (VH == false) goto L41;
        abcd.wu.j6(th, 3246948332928941223L, null, r12);
    L41:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(3246948332928941223L, null, r12);     // Catch: java.lang.Throwable -> L36
    L6:
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L36
        this.u7 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L36
        this.EQ = false;     // Catch: java.lang.Throwable -> L36
        this.tp = null;     // Catch: java.lang.Throwable -> L36
        java.io.BufferedReader r4 = new java.io.BufferedReader(new java.io.FileReader(r12));     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
    L8:
        java.lang.String r5 = r4.readLine();     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        if (r5 == null) goto L31;
        abcd.hj.a r6 = FH(r5);     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        if (r6 != null) goto L12;
        if (r5.startsWith("source.dir=") == true) goto L15;
        if (r5.startsWith("target=") == false) goto L8;
        java.lang.String r7 = r5.substring(7).trim();     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        if (r7.startsWith("Google Inc.:Google APIs:") == false) goto L24;
        this.EQ = true;     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        java.lang.String r8 = r7.substring(24);     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
    L28:
        if (r8 == null) goto L8;
        this.tp = java.lang.Integer.valueOf(java.lang.Integer.parseInt(r8));     // Catch: java.lang.NumberFormatException -> L43 java.io.IOException -> L33 java.lang.Throwable -> L36
        goto L8
    L24:
        if (r7.startsWith("android-") == false) goto L27;
        this.EQ = false;     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        r8 = r7.substring(8);     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        goto L28
    L27:
        r8 = null;
        goto L28
    L15:
        java.lang.String[] r9 = r5.substring(11).trim().split(";");     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        int r10 = r9.length;     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        int r11 = 0;
    L16:
        if (r11 >= r10) goto L8;
        this.u7.add(new abcd.hj.a(r9[r11], false));     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        r11 = r11 + 1;     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        goto L16
    L12:
        this.gn.add(r6);     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
        goto L8
    L31:
        r4.close();     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L36
    L61:
        return;
    L33:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L36
    }

    @abcd.Interfacesu(method = -2215449508312162979L)
    public static void DW(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L22:
        th = move-exception;
        if (VH == false) goto L27;
        abcd.wu.j6(th, -624777007127457831L, null, r8, r9, r10);
    L27:
        throw th;
    L3:
        if (Zo == false) goto L30;
        abcd.wu.j6(-624777007127457831L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L22
    L30:
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        java.io.BufferedReader r1 = new java.io.BufferedReader(new java.io.FileReader(r8));     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
    L6:
        java.lang.String r2 = r1.readLine();     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        if (r2 == null) goto L13;
        abcd.hj.a r3 = FH(r2);     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        if (r3 == null) goto L12;
        if (r10.equals(r3.j6(r9)) == true) goto L6;
    L12:
        r0.add(r2);     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        goto L6
    L13:
        r1.close();     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        java.io.FileWriter r4 = new java.io.FileWriter(r8);     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        java.util.Iterator r5 = r0.iterator();     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
    L15:
        if (r5.hasNext() == false) goto L17;
        r4.write((java.lang.String) r5.next());     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        r4.write("\n");     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
        goto L15
    L17:
        r4.close();     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
    L39:
        return;
    L19:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L22
    }

    @abcd.Interfacesu(method = 3192325596386047563L)
    private static abcd.hj.a FH(java.lang.String r6) {
    L13:
        th = move-exception;
        if (VH == false) goto L17;
        abcd.wu.j6(th, 2518063615306500499L, null, r6);
    L17:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(2518063615306500499L, null, r6);     // Catch: java.lang.Throwable -> L13
    L7:
        if (r6.startsWith("android.library.reference.") == false) goto L12;
        int r3 = r6.lastIndexOf(61);     // Catch: java.lang.Throwable -> L13
        if (r3 <= 0) goto L12;
        return new abcd.hj.a(r6.substring(r3 + 1, r6.length()).trim(), true);
    L12:
        return null;
    }

    @abcd.Interfacesu(method = 4076382967346108352L)
    public static void j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, -5033234782933349508L, null, r8, r9, r10);
    L14:
        throw th;
    L3:
        if (Zo == false) goto L15;
        abcd.wu.j6(-5033234782933349508L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L10
    L15:
        java.io.FileWriter r0 = new java.io.FileWriter(r8, true);     // Catch: java.io.IOException -> L7 java.lang.Throwable -> L10
        r0.write("\n");     // Catch: java.io.IOException -> L7 java.lang.Throwable -> L10
        r0.write("android.library.reference.1=" + abcd.Vl.gn(r9, r10));     // Catch: java.io.IOException -> L7 java.lang.Throwable -> L10
        r0.close();     // Catch: java.io.IOException -> L7 java.lang.Throwable -> L10
    L19:
        return;
    L7:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L10
    }

    protected abcd.AbstractSi DW(java.lang.String r1) {
        return m26DW(r1);
    }

    @abcd.Interfacesu(method = -10956983871786075L)
    protected abcd.hj m26DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, -7340751420185307663L, this, r5);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(-7340751420185307663L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new abcd.hj(r5);
    }
}
