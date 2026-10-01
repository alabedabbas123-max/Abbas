package tv.ouya.console.api;

public class g {
    public g() {
    }

    private tv.ouya.console.api.Receipt j6(abcd.jQ r11, org.json.JSONObject r12) {
        if (r12.has("purchaseDate") == false) goto L5;
        java.util.Date r13 = new java.util.Date(r12.getLong("purchaseDate"));
    L6:
        java.util.Date r3 = r13;
        if (r12.has("generateDate") == false) goto L9;
        java.util.Date r4 = new java.util.Date(r12.getLong("generateDate"));
    L10:
        java.lang.String r14 = r12.optString("identifier");
        if (r14.isEmpty() == false) goto L13;
        r14 = r12.getString("sku");
    L13:
        java.lang.String r5 = r12.getString("gamer");
        java.lang.String r6 = r12.getString("uuid");
        return new tv.ouya.console.api.Receipt(r14, r12.optInt("priceInCents", 0), r3, r4, r5, r6, r12.optDouble("localPrice", 0.0d), r12.optString("currency", "USD"));
    L9:
        java.util.Date r15 = new java.util.Date();
        r15.setTime(0);
        r4 = r15;
        goto L10
    L5:
        r13 = r11.parse(r12.getString("date"));
        goto L6
    }

    public java.util.List<tv.ouya.console.api.Receipt> j6(org.json.JSONArray r5) {
        java.util.ArrayList r0 = new java.util.ArrayList(r5.length());
        abcd.jQ r1 = new abcd.jQ();
        int r2 = 0;
    L4:
        if (r2 >= r5.length()) goto L6;
        r0.add(j6(r1, r5.getJSONObject(r2)));
        r2 = r2 + 1;
        goto L4
    L6:
        return r0;
    }

    public java.util.List<tv.ouya.console.api.Receipt> j6(org.json.JSONObject r7, java.security.PublicKey r8) {
        if (r7.has("key") == false) goto L11;
        if (r7.has("iv") == false) goto L11;
        if (r7.has("blob") == false) goto L11;
        byte[] r0 = android.util.Base64.decode(r7.getString("key").trim(), 0);
        javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding", "BC");
        r4.init(2, r8);
        javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec(r4.doFinal(r0), "AES");
        javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec(android.util.Base64.decode(r7.getString("iv").trim(), 0));
        byte[] r9 = android.util.Base64.decode(r7.getString("blob").trim(), 0);
        javax.crypto.Cipher r10 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        r10.init(2, r1, r2);
        return j6(new org.json.JSONObject(new java.lang.String(r10.doFinal(r9), "UTF-8")).getJSONArray("purchases"));
    L11:
        throw new java.lang.RuntimeException("Invalid response from server");
    }
}
