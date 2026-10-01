package com.aide.licensing;

@abcd.Interfacexu
public class f {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacexu
    public static final enum a extends java.lang.Enum<com.aide.licensing.f.a> {
        public static final com.aide.licensing.f.a DW = null;
        public static final com.aide.licensing.f.a FH = null;
        public static final com.aide.licensing.f.a Hw = null;

        @abcd.Interfacetu
        private static boolean VH;
        private static final com.aide.licensing.f.a[] Zo = null;

        @abcd.Interfaceuu
        private static boolean gn;
        public static final com.aide.licensing.f.a j6 = null;
        public static final com.aide.licensing.f.a v5 = null;

        static {
            abcd.wu.j6(com.aide.licensing.f.a.class, 899977642632869724L, 899977642632869724L);     // Catch: java.lang.Throwable -> L8
            if (VH == false) goto L6;
            abcd.wu.j6(-2626801934887243480L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            j6 = new com.aide.licensing.f.a("LICENSED", 0);     // Catch: java.lang.Throwable -> L8
            DW = new com.aide.licensing.f.a("IN_GRACE_PERIOD", 1);     // Catch: java.lang.Throwable -> L8
            FH = new com.aide.licensing.f.a("OVER_GRACE_PERIOD", 2);     // Catch: java.lang.Throwable -> L8
            Hw = new com.aide.licensing.f.a("NOT_LICENSED", 3);     // Catch: java.lang.Throwable -> L8
            v5 = new com.aide.licensing.f.a("TEMPORARY_ERROR", 4);     // Catch: java.lang.Throwable -> L8
            Zo = new com.aide.licensing.f.a[]{j6, DW, FH, Hw, v5};     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (gn == false) goto L12;
            abcd.wu.j6(th, -2626801934887243480L, null);
        L12:
            throw th;
        }

        @abcd.Interfacesu(method = 6401055357900540927L)
        private a(java.lang.String r8, int r9) {
        L7:
            th = move-exception;
            if (gn == false) goto L11;
            abcd.wu.j6(th, -4317081476200636528L, null, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (VH == false) goto L5;
            abcd.wu.j6(-4317081476200636528L, null, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            super(r8, r9);     // Catch: java.lang.Throwable -> L7
        }

        public static com.aide.licensing.f.a valueOf(java.lang.String r5) {
        L8:
            th = move-exception;
            if (gn == false) goto L12;
            abcd.wu.j6(th, 125799777649072352L, null, r5);
        L12:
            throw th;
        L4:
            if (VH == false) goto L6;
            abcd.wu.j6(125799777649072352L, null, r5);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.licensing.f.a) java.lang.Enum.valueOf(com.aide.licensing.f.a.class, r5);
        }

        public static com.aide.licensing.f.a[] values() {
        L8:
            th = move-exception;
            if (gn == false) goto L12;
            abcd.wu.j6(th, -195909874157097036L, null);
        L12:
            throw th;
        L4:
            if (VH == false) goto L6;
            abcd.wu.j6(-195909874157097036L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            return (com.aide.licensing.f.a[]) Zo.clone();
        }
    }

    static {
        abcd.wu.j6(com.aide.licensing.f.class, -6066383843371559253L, -6066383843371559253L);
    }

    public f() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -533362221557740695L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-533362221557740695L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 464731290045622424L)
    private static boolean DW(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L23:
        th = move-exception;
        if (DW == false) goto L27;
        abcd.wu.j6(th, 3708688220276710041L, null, r8, r9, r10);
    L27:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3708688220276710041L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L23
    L5:
        java.security.PublicKey r0 = j6(r10);     // Catch: java.lang.Throwable -> L23
        java.security.Signature r2 = java.security.Signature.getInstance("SHA1withRSA");     // Catch: abcd.te -> L13 java.security.SignatureException -> L15 java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L20 java.lang.Throwable -> L23
        r2.initVerify(r0);     // Catch: abcd.te -> L13 java.security.SignatureException -> L15 java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L20 java.lang.Throwable -> L23
        r2.update(r8.getBytes());     // Catch: abcd.te -> L13 java.security.SignatureException -> L15 java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L20 java.lang.Throwable -> L23
        if (r2.verify(abcd.se.j6(r9)) == true) goto L11;
        abcd.ue.DW("Signature verification failed.");     // Catch: abcd.te -> L13 java.security.SignatureException -> L15 java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L20 java.lang.Throwable -> L23
        return false;
    L11:
        return true;
    L18:
        abcd.ue.DW("Invalid public key.");     // Catch: java.lang.Throwable -> L23
        return false;
    L20:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L23
    L13:
        abcd.ue.DW("Could not Base64-decode signature.");     // Catch: java.lang.Throwable -> L23
        return false;
    L15:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L23
    }

    public static com.aide.licensing.e j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 1396274453997934965L, null, r8, r9, r10);
    L20:
        throw th;
    L3:
        if (j6 == false) goto L21;
        abcd.wu.j6(1396274453997934965L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L16
    L21:
        com.aide.licensing.e r1 = com.aide.licensing.e.j6(r8);     // Catch: java.lang.IllegalArgumentException -> L13 java.lang.Throwable -> L16
    L8:
        if (j6(r1.FH) == true) goto L10;
    L12:
        return r1;
    L10:
        if (DW(r8, r9, r10) == true) goto L12;
        return null;
    L13:
        e = move-exception;
        abcd.ue.j6("Could not parse response.", e);     // Catch: java.lang.Throwable -> L16
        return null;
    }

    public static com.aide.licensing.f.a j6(android.content.Context r15, long r16, int r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        int r8 = r18;
        boolean r13 = false;
        if (j6 == false) goto L5;
        com.aide.licensing.e r5 = null;
        abcd.wu.j6(-264955096328844824L, null, new java.lang.Object[]{r15, new java.lang.Long(r16), new java.lang.Integer(r8), new java.lang.Integer(r19), r20, r21, r22, r23});
    L7:
        if (r8 != (-1)) goto L9;
        java.lang.String r2 = "Licensing data from file";
    L10:
        abcd.ue.j6(r2 + " - code: " + java.lang.Integer.toHexString(r18) + " data: " + r21 + " sig: " + r22);
        if (r21 == null) goto L13;
        com.aide.licensing.e r10 = j6(r21, r22, r23);
    L14:
        if (r8 != (-1)) goto L18;
        if (r10 != null) goto L18;
        return com.aide.licensing.f.a.Hw;
    L18:
        if (r10 != null) goto L20;
    L23:
        if (r8 != (-1)) goto L25;
        r8 = r10.FH;
    L25:
        if (r8 == 0) goto L45;
        if (r8 == 1) goto L42;
        if (r8 == 2) goto L45;
        if (r8 != 3) goto L30;
    L41:
        abcd.ue.FH("Licensing error: " + r8);
    L44:
        return com.aide.licensing.f.a.Hw;
    L30:
        if (r8 != 4) goto L32;
        abcd.ue.FH("An error has occurred on the licensing server.");
        return com.aide.licensing.f.a.v5;
    L32:
        if (r8 == 5) goto L37;
        switch(r8) {
            case 257: goto L35;
            case 258: goto L41;
            case 259: goto L41;
            default: goto L34;
        };
    L34:
        abcd.ue.DW("Unknown response code for license check: " + r8);
        goto L44
    L35:
        abcd.ue.FH("Error contacting licensing server.");
        return com.aide.licensing.f.a.v5;
    L37:
        abcd.ue.FH("Licensing server is refusing to talk to this device, over quota.");
        return com.aide.licensing.f.a.v5;
    L42:
        abcd.ue.j6("Not licensed.");
    L45:
        if (r10 != null) goto L49;
        abcd.ue.DW("Licensed but no data");
        return com.aide.licensing.f.a.Hw;
    L49:
        if (java.lang.System.currentTimeMillis() >= r10.tp) goto L51;
        boolean r0 = true;
    L53:
        if (java.lang.System.currentTimeMillis() >= r10.EQ) goto L55;
        r13 = true;
    L55:
        if (r13 == false) goto L57;
    L59:
        if (r0 == true) goto L61;
        if (r13 == false) goto L66;
        return com.aide.licensing.f.a.DW;
    L66:
        return com.aide.licensing.f.a.FH;
    L61:
        return com.aide.licensing.f.a.j6;
    L57:
        if ((r10.EQ - r10.gn) <= 432000000) goto L59;
        r13 = true;
        goto L59
    L51:
        r0 = false;
        goto L53
    L20:
        if (j6(r15, r16, r18, r19, r20, false, r10) == true) goto L23;
        return com.aide.licensing.f.a.Hw;
    L13:
        r10 = r5;
        goto L14
    L9:
        r2 = "Licensing service response";
        goto L10
    L5:
        r5 = null;
        goto L7
    }

    @abcd.Interfacesu(method = 1851630928507332608L)
    private static java.security.PublicKey j6(java.lang.String r6) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -6989586078351073305L, null, r6);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L23;
        abcd.wu.j6(-6989586078351073305L, null, r6);     // Catch: java.lang.Throwable -> L17
    L23:
        byte[] r3 = abcd.se.j6(r6);     // Catch: java.security.spec.InvalidKeySpecException -> L8 abcd.te -> L11 java.security.NoSuchAlgorithmException -> L14 java.lang.Throwable -> L17
        return java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(r3));
    L11:
        e = move-exception;
        abcd.ue.DW("Could not decode from Base64.");     // Catch: java.lang.Throwable -> L17
        throw new java.lang.IllegalArgumentException(e);     // Catch: java.lang.Throwable -> L17
    L14:
        e = move-exception;
        throw new java.lang.RuntimeException(e);     // Catch: java.lang.Throwable -> L17
    L8:
        e = move-exception;
        abcd.ue.DW("Invalid key specification.");     // Catch: java.lang.Throwable -> L17
        throw new java.lang.IllegalArgumentException(e);     // Catch: java.lang.Throwable -> L17
    }

    public static boolean j6(int r5) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 863957139261675360L, null, new java.lang.Integer(r5));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(863957139261675360L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r5 == 0) goto L21;
        if (r5 != 1) goto L10;
        return true;
    L10:
        if (r5 == 2) goto L23;
        return false;
    L23:
        return true;
    L21:
        return true;
    }

    public static boolean j6(android.content.Context r8, long r9, int r11, int r12, java.lang.String r13, boolean r14, com.aide.licensing.e r15) {
        if (j6 == false) goto L6;
        abcd.wu.j6(2181975808575105735L, null, new java.lang.Object[]{r8, new java.lang.Long(r9), new java.lang.Integer(r11), new java.lang.Integer(r12), r13, new java.lang.Boolean(r14), r15});
    L6:
        if (r11 == (-1)) goto L12;
        if (r15.FH == r11) goto L12;
        abcd.ue.DW("Response codes don't match.");
        return false;
    L12:
        if (r9 != (-1)) goto L14;
    L17:
        if (r14 == false) goto L23;
        if (com.aide.licensing.i.j6(r8, r15.Hw) == true) goto L23;
        abcd.ue.DW("Nonce does not match device.");
        return false;
    L23:
        if (r15.v5.equals(r13) == true) goto L34;
        abcd.ue.DW("Package name doesn't match.");
        return false;
    L34:
        int r10 = java.lang.Integer.parseInt(r15.Zo);     // Catch: java.lang.NumberFormatException -> L32
        if (r12 == (-1)) goto L31;
        if (r10 == r12) goto L31;
        abcd.ue.DW("Unexpected version code");     // Catch: java.lang.NumberFormatException -> L32
        return false;
    L31:
        return true;
    L32:
        abcd.ue.DW("Non-int version code");
        return false;
    L14:
        if (r15.Hw == r9) goto L17;
        abcd.ue.DW("Nonce doesn't match.");
        return false;
    }
}
