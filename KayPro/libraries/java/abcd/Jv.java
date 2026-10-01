package abcd;

public class Jv {
    private static android.content.IntentSender DW;
    private static java.lang.String FH;
    private static java.util.Map<java.lang.String, abcd.Jv.c> j6;

    private static class a {
        public java.lang.String DW;
        public java.lang.String FH;
        public long Hw;
        public java.lang.String Zo;
        public java.lang.String j6;
        public java.lang.String v5;

        public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, java.lang.String r7) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
            this.v5 = r6;
            this.Zo = r7;
        }
    }

    private static final enum b extends java.lang.Enum<abcd.Jv.b> {
        public static final abcd.Jv.b DW = null;
        public static final abcd.Jv.b FH = null;
        public static final abcd.Jv.b Hw = null;
        public static final abcd.Jv.b VH = null;
        public static final abcd.Jv.b Zo = null;
        public static final abcd.Jv.b gn = null;
        public static final abcd.Jv.b j6 = null;
        private static final abcd.Jv.b[] tp = null;
        public static final abcd.Jv.b u7 = null;
        public static final abcd.Jv.b v5 = null;

        static {
            j6 = new abcd.Jv.b("RESULT_OK", 0);
            DW = new abcd.Jv.b("RESULT_USER_CANCELED", 1);
            FH = new abcd.Jv.b("RESULT_SERVICE_UNAVAILABLE", 2);
            Hw = new abcd.Jv.b("RESULT_BILLING_UNAVAILABLE", 3);
            v5 = new abcd.Jv.b("RESULT_ITEM_UNAVAILABLE", 4);
            Zo = new abcd.Jv.b("RESULT_DEVELOPER_ERROR", 5);
            VH = new abcd.Jv.b("RESULT_ERROR", 6);
            gn = new abcd.Jv.b("RESULT_ITEM_ALREADY_OWNED", 7);
            u7 = new abcd.Jv.b("RESULT_ITEM_NOT_OWNED", 8);
            tp = new abcd.Jv.b[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7};
        }

        private b(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        private static abcd.Jv.b DW(int r2) {
            abcd.Jv.b[] r0 = values();
            if (r2 < 0) goto L10;
            if (r2 >= r0.length) goto L10;
            return r0[r2];
        L10:
            return VH;
        }

        static abcd.Jv.b j6(int r0) {
            return DW(r0);
        }

        public static abcd.Jv.b valueOf(java.lang.String r1) {
            return (abcd.Jv.b) java.lang.Enum.valueOf(abcd.Jv.b.class, r1);
        }

        public static abcd.Jv.b[] values() {
            return (abcd.Jv.b[]) tp.clone();
        }
    }

    private static class c {
        public final java.lang.String DW;
        public final java.lang.String FH;
        public final java.lang.String Hw;
        public final java.lang.String VH;
        public final long Zo;
        public final java.lang.String j6;
        public final java.lang.String v5;

        public c(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6, java.lang.String r8) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
            this.Hw = r4;
            this.v5 = r5;
            this.Zo = r6;
            this.VH = r8;
        }
    }

    static {
        j6 = new java.util.HashMap();
    }

    private static abcd.Jv.a DW(java.lang.String r10) {
        if (r10 != null) goto L8;
        return null;
    L8:
        org.json.JSONObject r1 = new org.json.JSONObject(r10);     // Catch: org.json.JSONException -> L7
        r1.getInt("purchaseState");     // Catch: org.json.JSONException -> L7
        java.lang.String r5 = r1.getString("productId");     // Catch: org.json.JSONException -> L7
        java.lang.String r4 = r1.getString("packageName");     // Catch: org.json.JSONException -> L7
        long r6 = r1.getLong("purchaseTime");     // Catch: org.json.JSONException -> L7
        java.lang.String r3 = r1.optString("orderId");     // Catch: org.json.JSONException -> L7
        java.lang.String r9 = r1.getString("purchaseToken");     // Catch: org.json.JSONException -> L7
        return new abcd.Jv.a(r3, r4, r5, r6, r1.optString("developerPayload", null), r9);
    L7:
        return null;
    }

    private static com.appfour.backbone.api.objects.InAppProduct j6(java.lang.String r10) {
        abcd.Jv.c r0 = j6.get(r10);
        if (r0 == null) goto L7;
        return new com.appfour.backbone.api.objects.InAppProduct(new com.appfour.backbone.api.objects.Market("com.android.vending"), r10, "subs".equals(r0.j6), r0.Zo, r0.VH);
    L7:
        return new com.appfour.backbone.api.objects.InAppProduct(new com.appfour.backbone.api.objects.Market("com.android.vending"), r10);
    }

    private static void j6(android.app.Activity r0, android.content.IntentSender r1, int r2) {
        if (r1 != null) goto L4;
        return;
    L4:
        if (r1.equals(DW) == false) goto L8;
        abcd.kv.j6(r0, j6(FH));
        return;
    }

    private static void j6(android.os.Bundle r12) {
        if (abcd.Jv.b.j6(r12.getInt("RESPONSE_CODE")) != abcd.Jv.b.j6) goto L11;
        java.util.ArrayList<java.lang.String> r13 = r12.getStringArrayList("DETAILS_LIST");     // Catch: org.json.JSONException -> L12
        if (r13 == null) goto L17;
        java.util.Iterator<java.lang.String> r14 = r13.iterator();     // Catch: org.json.JSONException -> L12
    L8:
        if (r14.hasNext() == false) goto L19;
        org.json.JSONObject r1 = new org.json.JSONObject(r14.next());     // Catch: org.json.JSONException -> L12
        java.lang.String r3 = r1.getString("type");     // Catch: org.json.JSONException -> L12
        java.lang.String r0 = r1.getString("productId");     // Catch: org.json.JSONException -> L12
        java.lang.String r5 = r1.getString("title");     // Catch: org.json.JSONException -> L12
        java.lang.String r6 = r1.getString("description");     // Catch: org.json.JSONException -> L12
        java.lang.String r7 = r1.getString("price");     // Catch: org.json.JSONException -> L12
        long r8 = r1.getLong("price_amount_micros");     // Catch: org.json.JSONException -> L12
        java.lang.String r10 = r1.getString("price_currency_code");     // Catch: org.json.JSONException -> L12
        j6.put(r0, new abcd.Jv.c(r3, r0, r5, r6, r7, r8, r10));     // Catch: org.json.JSONException -> L12
    L19:
        return;
    L17:
        return;
    L11:
        return;
    }

    public static void j6(android.os.Bundle r0, java.lang.Object r1, int r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        j6(r0);
    }

    public static void j6(android.os.Bundle r0, java.lang.Object r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        if (abcd.Jv.b.j6(r0.getInt("RESPONSE_CODE")) != abcd.Jv.b.j6) goto L6;
        DW = ((android.app.PendingIntent) r0.getParcelable("BUY_INTENT")).getIntentSender();
        FH = r4;
        return;
    }

    public static void j6(java.lang.Object r3, int r4, int r5, android.content.Intent r6) {
        if ((r3 instanceof android.app.Activity) == false) goto L19;
        if (r6 != null) goto L6;
        return;
    L6:
        if (r6.hasExtra("RESPONSE_CODE") == true) goto L8;
        return;
    L8:
        if (r6.hasExtra("INAPP_PURCHASE_DATA") == true) goto L10;
        return;
    L10:
        if (r6.hasExtra("INAPP_DATA_SIGNATURE") == false) goto L23;
        abcd.Jv.b r7 = abcd.Jv.b.j6(r6.getIntExtra("RESPONSE_CODE", 0));
        abcd.yw.j6("PlayInAppBilling", "onActivityResult " + r7);
        if (r7 != abcd.Jv.b.j6) goto L24;
        java.lang.String r8 = r6.getStringExtra("INAPP_PURCHASE_DATA");
        r6.getStringExtra("INAPP_DATA_SIGNATURE");
        if (j6() == true) goto L25;
        abcd.Jv.a r9 = DW(r8);
        if (r9 == null) goto L26;
        abcd.kv.DW((android.app.Activity) r3, j6(r9.FH));
        return;
    L26:
        return;
    L25:
        return;
    L24:
        return;
    L23:
        return;
    }

    public static void j6(java.lang.Object r0, android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) {
        if ((r0 instanceof android.app.Activity) == false) goto L6;
        j6((android.app.Activity) r0, r1, r2);
        return;
    }

    private static boolean j6() {
        java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream(abcd.wu.j6().getPackageManager().getPackageInfo(abcd.wu.j6().getPackageName(), 64).signatures[0].toByteArray());     // Catch: java.lang.Throwable -> L5
        java.security.PublicKey r2 = ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X509").generateCertificate(r3)).getPublicKey();     // Catch: java.lang.Throwable -> L5
        java.security.Signature r4 = java.security.Signature.getInstance("SHA1withRSA");     // Catch: java.lang.Throwable -> L5
        r4.initVerify(r2);     // Catch: java.lang.Throwable -> L5
        r4.update("xxx".getBytes());     // Catch: java.lang.Throwable -> L5
        return r4.verify(android.util.Base64.decode("xxx", 0));
    L5:
        th = move-exception;
        abcd.yw.j6("Verify check error", th);
        return false;
    }
}
