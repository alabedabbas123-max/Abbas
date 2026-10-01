package tv.ouya.console.api;

public class g {
    public g() {
    }

    private tv.ouya.console.api.Receipt j6(abcd.jQ r11, org.json.JSONObject r12) {
        java.util.Date r13 = null;
        java.util.Date r3 = null;
        java.util.Date r4 = null;
        java.lang.String r14 = null;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        java.util.Date r15 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r12.has("purchaseDate") == false) { $pc0 = 5; continue $sw0; }
                    r13 = new java.util.Date(r12.getLong("purchaseDate"));
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r3 = r13;
                    if (r12.has("generateDate") == false) { $pc0 = 9; continue $sw0; }
                    r4 = new java.util.Date(r12.getLong("generateDate"));
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r14 = r12.optString("identifier");
                    if (r14.isEmpty() == false) { $pc0 = 13; continue $sw0; }
                    r14 = r12.getString("sku");
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r5 = r12.getString("gamer");
                    r6 = r12.getString("uuid");
                    return new tv.ouya.console.api.Receipt(r14, r12.optInt("priceInCents", 0), r3, r4, r5, r6, r12.optDouble("localPrice", 0.0d), r12.optString("currency", "USD"));
                }
                case 9: {
                    r15 = new java.util.Date();
                    r15.setTime(0);
                    r4 = r15;
                    { $pc0 = 10; continue $sw0; }
                }
                case 5: {
                    r13 = r11.parse(r12.getString("date"));
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<tv.ouya.console.api.Receipt> j6(org.json.JSONArray r5) {
        java.util.ArrayList r0 = null;
        abcd.jQ r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.ArrayList(r5.length());
                    r1 = new abcd.jQ();
                    r2 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2 >= r5.length()) { $pc1 = 6; continue $sw1; }
                    r0.add(j6(r1, r5.getJSONObject(r2)));
                    r2 = r2 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<tv.ouya.console.api.Receipt> j6(org.json.JSONObject r7, java.security.PublicKey r8) {
        byte[] r0 = null;
        javax.crypto.Cipher r4 = null;
        javax.crypto.spec.SecretKeySpec r1 = null;
        javax.crypto.spec.IvParameterSpec r2 = null;
        byte[] r9 = null;
        javax.crypto.Cipher r10 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r7.has("key") == false) { $pc2 = 11; continue $sw2; }
                    if (r7.has("iv") == false) { $pc2 = 11; continue $sw2; }
                    if (r7.has("blob") == false) { $pc2 = 11; continue $sw2; }
                    r0 = android.util.Base64.decode(r7.getString("key").trim(), 0);
                    r4 = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding", "BC");
                    r4.init(2, r8);
                    r1 = new javax.crypto.spec.SecretKeySpec(r4.doFinal(r0), "AES");
                    r2 = new javax.crypto.spec.IvParameterSpec(android.util.Base64.decode(r7.getString("iv").trim(), 0));
                    r9 = android.util.Base64.decode(r7.getString("blob").trim(), 0);
                    r10 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
                    r10.init(2, r1, r2);
                    return j6(new org.json.JSONObject(new java.lang.String(r10.doFinal(r9), "UTF-8")).getJSONArray("purchases"));
                }
                case 11: {
                    throw new java.lang.RuntimeException("Invalid response from server");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
