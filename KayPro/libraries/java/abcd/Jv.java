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

    private static final class b extends com.almlkaide.kaypro.internal.EnumBase {
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
            abcd.Jv.b[] r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = values();
                        if (r2 < 0) { $pc0 = 10; continue $sw0; }
                        if (r2 >= r0.length) { $pc0 = 10; continue $sw0; }
                        return r0[r2];
                    }
                    case 10: {
                        return VH;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static abcd.Jv.b j6(int r0) {
            return DW(r0);
        }

        public static abcd.Jv.b valueOf(java.lang.String r1) {
            return (abcd.Jv.b) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Jv.b.values(), r1);
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
        org.json.JSONObject r1 = null;
        java.lang.String r5 = null;
        java.lang.String r4 = null;
        long r6 = 0L;
        java.lang.String r3 = null;
        java.lang.String r9 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r10 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    try {
                        r1 = new org.json.JSONObject(r10);
                        r1.getInt("purchaseState");
                        r5 = r1.getString("productId");
                        r4 = r1.getString("packageName");
                        r6 = r1.getLong("purchaseTime");
                        r3 = r1.optString("orderId");
                        r9 = r1.getString("purchaseToken");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 7; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new abcd.Jv.a(r3, r4, r5, r6, r1.optString("developerPayload", null), r9);
                }
                case 7: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static com.appfour.backbone.api.objects.InAppProduct j6(java.lang.String r10) {
        abcd.Jv.c r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6.get(r10);
                    if (r0 == null) { $pc2 = 7; continue $sw2; }
                    return new com.appfour.backbone.api.objects.InAppProduct(new com.appfour.backbone.api.objects.Market("com.android.vending"), r10, "subs".equals(r0.j6), r0.Zo, r0.VH);
                }
                case 7: {
                    return new com.appfour.backbone.api.objects.InAppProduct(new com.appfour.backbone.api.objects.Market("com.android.vending"), r10);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(android.app.Activity r0, android.content.IntentSender r1, int r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 != null) { $pc3 = 4; continue $sw3; }
                    return;
                }
                case 4: {
                    if (r1.equals(DW) == false) { $pc3 = 8; continue $sw3; }
                    abcd.kv.j6(r0, j6(FH));
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(android.os.Bundle r12) {
        java.util.ArrayList<java.lang.String> r13 = null;
        java.util.Iterator<java.lang.String> r14 = null;
        org.json.JSONObject r1 = null;
        java.lang.String r3 = null;
        java.lang.String r0 = null;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        long r8 = 0L;
        java.lang.String r10 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (abcd.Jv.b.j6(r12.getInt("RESPONSE_CODE")) != abcd.Jv.b.j6) { $pc4 = 11; continue $sw4; }
                    try {
                        r13 = r12.getStringArrayList("DETAILS_LIST");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof org.json.JSONException) { $pc4 = 12; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13 == null) { $pc4 = 17; continue $sw4; }
                    try {
                        r14 = r13.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof org.json.JSONException) { $pc4 = 12; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r14.hasNext() == false) { $pc4 = 19; continue $sw4; }
                    try {
                        r1 = new org.json.JSONObject(r14.next());
                        r3 = r1.getString("type");
                        r0 = r1.getString("productId");
                        r5 = r1.getString("title");
                        r6 = r1.getString("description");
                        r7 = r1.getString("price");
                        r8 = r1.getLong("price_amount_micros");
                        r10 = r1.getString("price_currency_code");
                        j6.put(r0, new abcd.Jv.c(r3, r0, r5, r6, r7, r8, r10));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof org.json.JSONException) { $pc4 = 12; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    return;
                }
                case 17: {
                    return;
                }
                case 11: {
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.os.Bundle r0, java.lang.Object r1, int r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        j6(r0);
    }

    public static void j6(android.os.Bundle r0, java.lang.Object r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (abcd.Jv.b.j6(r0.getInt("RESPONSE_CODE")) != abcd.Jv.b.j6) { $pc5 = 6; continue $sw5; }
                    DW = ((android.app.PendingIntent) r0.getParcelable("BUY_INTENT")).getIntentSender();
                    FH = r4;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.Object r3, int r4, int r5, android.content.Intent r6) {
        abcd.Jv.b r7 = null;
        java.lang.String r8 = null;
        abcd.Jv.a r9 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if ((r3 instanceof android.app.Activity) == false) { $pc6 = 19; continue $sw6; }
                    if (r6 != null) { $pc6 = 6; continue $sw6; }
                    return;
                }
                case 6: {
                    if (r6.hasExtra("RESPONSE_CODE") == true) { $pc6 = 8; continue $sw6; }
                    return;
                }
                case 8: {
                    if (r6.hasExtra("INAPP_PURCHASE_DATA") == true) { $pc6 = 10; continue $sw6; }
                    return;
                }
                case 10: {
                    if (r6.hasExtra("INAPP_DATA_SIGNATURE") == false) { $pc6 = 23; continue $sw6; }
                    r7 = abcd.Jv.b.j6(r6.getIntExtra("RESPONSE_CODE", 0));
                    abcd.yw.j6("PlayInAppBilling", "onActivityResult " + r7);
                    if (r7 != abcd.Jv.b.j6) { $pc6 = 24; continue $sw6; }
                    r8 = r6.getStringExtra("INAPP_PURCHASE_DATA");
                    r6.getStringExtra("INAPP_DATA_SIGNATURE");
                    if (j6() == true) { $pc6 = 25; continue $sw6; }
                    r9 = DW(r8);
                    if (r9 == null) { $pc6 = 26; continue $sw6; }
                    abcd.kv.DW((android.app.Activity) r3, j6(r9.FH));
                    return;
                }
                case 26: {
                    return;
                }
                case 25: {
                    return;
                }
                case 24: {
                    return;
                }
                case 23: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.Object r0, android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if ((r0 instanceof android.app.Activity) == false) { $pc7 = 6; continue $sw7; }
                    j6((android.app.Activity) r0, r1, r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6() {
        java.io.ByteArrayInputStream r3 = null;
        java.security.PublicKey r2 = null;
        java.security.Signature r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    try {
                        r3 = new java.io.ByteArrayInputStream(abcd.wu.j6().getPackageManager().getPackageInfo(abcd.wu.j6().getPackageName(), 64).signatures[0].toByteArray());
                        r2 = ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X509").generateCertificate(r3)).getPublicKey();
                        r4 = java.security.Signature.getInstance("SHA1withRSA");
                        r4.initVerify(r2);
                        r4.update("xxx".getBytes());
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 5; continue $sw8;
                    }
                    return r4.verify(android.util.Base64.decode("xxx", 0));
                }
                case 5: {
                    th = $ex8;
                    abcd.yw.j6("Verify check error", th);
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
