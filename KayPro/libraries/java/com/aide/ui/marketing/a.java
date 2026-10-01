package com.aide.ui.marketing;

@abcd.Interfacexu
public class a {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = -600600414488716911L)
    static com.aide.ui.marketing.a.C0047a[] j6;

    @abcd.Interfacexu
    public static class C0047a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;
        public int FH;
        public java.lang.String Hw;
        public java.lang.String VH;
        public java.lang.String Zo;
        public java.lang.String v5;

        static {
            abcd.wu.j6(com.aide.ui.marketing.a.C0047a.class, -571235218108168992L, -571235218108168992L);
        }

        public C0047a(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1710473834646418725L, null, new java.lang.Integer(r11), r12, r13, r14, r15);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1710473834646418725L, null, new java.lang.Integer(r11), r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L7
        L5:
            this.FH = r11;     // Catch: java.lang.Throwable -> L7
            this.Hw = r12;     // Catch: java.lang.Throwable -> L7
            this.v5 = r13;     // Catch: java.lang.Throwable -> L7
            this.Zo = r14;     // Catch: java.lang.Throwable -> L7
            this.VH = r15;     // Catch: java.lang.Throwable -> L7
        }

        @abcd.Interfacesu(method = 519395161803543376L)
        private java.util.List<java.lang.String> j6(android.content.Context r8, java.lang.String r9) {
        L12:
            th = move-exception;
            if (DW == false) goto L17;
            abcd.wu.j6(th, 283828885939543860L, this, r8, r9);
        L17:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(283828885939543860L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L12
            java.io.BufferedReader r1 = new java.io.BufferedReader(new java.io.InputStreamReader(r8.getAssets().open(r9)));     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L12
        L7:
            java.lang.String r2 = r1.readLine();     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L12
            if (r2 == null) goto L10;
            r0.add(r2);     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L12
            goto L7
        L10:
            r1.close();     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L12
        L11:
            return r0;
        }

        public java.lang.String DW(android.content.Context r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -4614159413425814080L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-4614159413425814080L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return android.text.TextUtils.join("\n", j6(r5));
        }

        public java.util.List<java.lang.String> j6(android.content.Context r5) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2020798977753780744L, this, r5);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2020798977753780744L, this, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return j6(r5, this.VH);
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.marketing.a.class, 3311268933990658443L, 3311268933990658443L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(-1688411636032686611L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new com.aide.ui.marketing.a.C0047a[]{new com.aide.ui.marketing.a.C0047a(com.almlkaide.kaypro.R.drawable.ic_launcher, "com.aide.ui", "AIDE - Android IDE for Java/C++", "Develop programs and apps directly on your Android devices", "whatsnew/aide-whatsnew.txt"), new com.aide.ui.marketing.a.C0047a(com.almlkaide.kaypro.R.drawable.ic_launcher_web, "com.aide.web", "AIDE Web - Html, Css, JavaScript", "Develop websites directly on your Android devices", "whatsnew/aide-web-whatsnew.txt"), new com.aide.ui.marketing.a.C0047a(com.almlkaide.kaypro.R.drawable.ic_launcher_phonegap, "com.aide.phonegap", "AIDE for Phonegap", "Develop Phonegap apps with Html & JavaScript directly on your Android devices", "whatsnew/aide-phonegap-whatsnew.txt")};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1688411636032686611L, null);
    L12:
        throw th;
    }

    public a() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3368114069205758400L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3368114069205758400L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    public static java.lang.String j6(java.lang.Object r9) {
    L15:
        th = move-exception;
        if (FH == false) goto L20;
        abcd.wu.j6(th, -2240285139720945328L, null, r9);
    L20:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2240285139720945328L, null, r9);     // Catch: java.lang.Throwable -> L15
    L6:
        com.aide.ui.marketing.a.C0047a[] r3 = j6;     // Catch: java.lang.Throwable -> L15
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L15
        int r5 = 0;
    L7:
        if (r5 >= r4) goto L13;
        com.aide.ui.marketing.a.C0047a r6 = r3[r5];     // Catch: java.lang.Throwable -> L15
        if (r6.Hw.equals(r9.getPackageName()) == true) goto L10;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L15
        goto L7
    L10:
        r9 = r6.DW(r9);     // Catch: java.lang.Throwable -> L15
        return r9;
    L13:
        return "";
    }
}
