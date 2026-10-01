package com.crashlytics.android.answers;

public class w {
    private static final java.util.Set<java.lang.String> j6 = null;

    static {
        j6 = new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));
    }

    public w() {
    }

    private android.os.Bundle DW(com.crashlytics.android.answers.I r13) {
        android.os.Bundle r0 = new android.os.Bundle();
        if ("purchase".equals(r13.VH) == false) goto L6;
        j6(r0, "item_id", (java.lang.String) r13.gn.get("itemId"));
        j6(r0, "item_name", (java.lang.String) r13.gn.get("itemName"));
        j6(r0, "item_category", (java.lang.String) r13.gn.get("itemType"));
        j6(r0, "value", DW(r13.gn.get("itemPrice")));
        j6(r0, "currency", (java.lang.String) r13.gn.get("currency"));
    L38:
        j6(r0, r13.Zo);
        return r0;
    L6:
        if ("addToCart".equals(r13.VH) == false) goto L9;
        j6(r0, "item_id", (java.lang.String) r13.gn.get("itemId"));
        j6(r0, "item_name", (java.lang.String) r13.gn.get("itemName"));
        j6(r0, "item_category", (java.lang.String) r13.gn.get("itemType"));
        j6(r0, "price", DW(r13.gn.get("itemPrice")));
        j6(r0, "value", DW(r13.gn.get("itemPrice")));
        j6(r0, "currency", (java.lang.String) r13.gn.get("currency"));
        r0.putLong("quantity", 1);
        goto L38
    L9:
        if ("startCheckout".equals(r13.VH) == false) goto L12;
        j6(r0, "quantity", java.lang.Long.valueOf(((java.lang.Integer) r13.gn.get("itemCount")).intValue()));
        j6(r0, "value", DW(r13.gn.get("totalPrice")));
        j6(r0, "currency", (java.lang.String) r13.gn.get("currency"));
        goto L38
    L12:
        if ("contentView".equals(r13.VH) == false) goto L15;
        j6(r0, "content_type", (java.lang.String) r13.gn.get("contentType"));
        j6(r0, "item_id", (java.lang.String) r13.gn.get("contentId"));
        j6(r0, "item_name", (java.lang.String) r13.gn.get("contentName"));
        goto L38
    L15:
        if ("search".equals(r13.VH) == false) goto L18;
        j6(r0, "search_term", (java.lang.String) r13.gn.get("query"));
        goto L38
    L18:
        if ("share".equals(r13.VH) == false) goto L21;
        j6(r0, "method", (java.lang.String) r13.gn.get("method"));
        j6(r0, "content_type", (java.lang.String) r13.gn.get("contentType"));
        j6(r0, "item_id", (java.lang.String) r13.gn.get("contentId"));
        j6(r0, "item_name", (java.lang.String) r13.gn.get("contentName"));
        goto L38
    L21:
        if ("rating".equals(r13.VH) == false) goto L24;
        j6(r0, "rating", java.lang.String.valueOf(r13.gn.get("rating")));
        j6(r0, "content_type", (java.lang.String) r13.gn.get("contentType"));
        j6(r0, "item_id", (java.lang.String) r13.gn.get("contentId"));
        j6(r0, "item_name", (java.lang.String) r13.gn.get("contentName"));
        goto L38
    L24:
        if ("signUp".equals(r13.VH) == false) goto L27;
        j6(r0, "method", (java.lang.String) r13.gn.get("method"));
        goto L38
    L27:
        if ("login".equals(r13.VH) == false) goto L30;
        j6(r0, "method", (java.lang.String) r13.gn.get("method"));
        goto L38
    L30:
        if ("invite".equals(r13.VH) == false) goto L33;
        j6(r0, "method", (java.lang.String) r13.gn.get("method"));
        goto L38
    L33:
        if ("levelStart".equals(r13.VH) == false) goto L36;
        j6(r0, "level_name", (java.lang.String) r13.gn.get("levelName"));
        goto L38
    L36:
        if ("levelEnd".equals(r13.VH) == false) goto L38;
        j6(r0, "score", j6(r13.gn.get("score")));
        j6(r0, "level_name", (java.lang.String) r13.gn.get("levelName"));
        j6(r0, "success", DW((java.lang.String) r13.gn.get("success")));
        goto L38
    }

    private java.lang.Double DW(java.lang.Object r4) {
        java.lang.Long r5 = (java.lang.Long) r4;
        if (r5 != null) goto L7;
        return null;
    L7:
        return java.lang.Double.valueOf(new java.math.BigDecimal(r5.longValue()).divide(com.crashlytics.android.answers.ClassA.j6).doubleValue());
    }

    private java.lang.Integer DW(java.lang.String r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return java.lang.Integer.valueOf(r2.equals("true") ? 1 : 0);
    }

    private java.lang.String FH(java.lang.String r4) {
        if (r4 != null) goto L4;
        return "fabric_unnamed_event";
    L4:
        if (r4.length() != 0) goto L7;
        return "fabric_unnamed_event";
    L7:
        if (j6.contains(r4) == true) goto L9;
        java.lang.String r5 = r4.replaceAll("[^\\p{Alnum}_]+", "_");
        if (r5.startsWith("ga_") == false) goto L13;
    L18:
        r5 = "fabric_" + r5;
    L20:
        if (r5.length() > 40) goto L22;
        return r5;
    L22:
        return r5.substring(0, 40);
    L13:
        if (r5.startsWith("google_") == true) goto L18;
        if (r5.startsWith("firebase_") == true) goto L18;
        if (java.lang.Character.isLetter(r5.charAt(0)) == true) goto L20;
    L9:
        return "fabric_" + r4;
    }

    private java.lang.Double j6(java.lang.Object r1) {
        java.lang.String r2 = java.lang.String.valueOf(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return java.lang.Double.valueOf(r2);
    }

    private java.lang.String j6(java.lang.String r4) {
        if (r4 != null) goto L4;
        return "fabric_unnamed_parameter";
    L4:
        if (r4.length() == 0) goto L22;
        java.lang.String r5 = r4.replaceAll("[^\\p{Alnum}_]+", "_");
        if (r5.startsWith("ga_") == false) goto L9;
    L14:
        r5 = "fabric_" + r5;
    L16:
        if (r5.length() > 40) goto L18;
        return r5;
    L18:
        return r5.substring(0, 40);
    L9:
        if (r5.startsWith("google_") == true) goto L14;
        if (r5.startsWith("firebase_") == true) goto L14;
        if (java.lang.Character.isLetter(r5.charAt(0)) == true) goto L16;
    L22:
        return "fabric_unnamed_parameter";
    }

    private java.lang.String j6(java.lang.String r11, boolean r12) {
        byte r0 = 0;
        if (r12 == false) goto L32;
        int r13 = r11.hashCode();
        if (r13 == (-902468296)) goto L18;
        if (r13 == 103149417) goto L15;
        if (r13 == 1743324417) goto L12;
    L20:
        byte r14 = -1;
    L21:
        if (r14 == 0) goto L29;
        if (r14 == 1) goto L27;
        if (r14 != 2) goto L32;
        return "failed_login";
    L27:
        return "failed_sign_up";
    L29:
        return "failed_ecommerce_purchase";
    L12:
        if (r11.equals("purchase") == false) goto L20;
        r14 = 0;
        goto L21
    L15:
        if (r11.equals("login") == false) goto L20;
        r14 = 2;
        goto L21
    L18:
        if (r11.equals("signUp") == false) goto L20;
        r14 = 1;
    L32:
        switch(r11.hashCode()) {
            case -2131650889: goto L68;
            case -1183699191: goto L65;
            case -938102371: goto L62;
            case -906336856: goto L59;
            case -902468296: goto L56;
            case -389087554: goto L53;
            case 23457852: goto L50;
            case 103149417: goto L47;
            case 109400031: goto L44;
            case 196004670: goto L41;
            case 1664021448: goto L38;
            case 1743324417: goto L35;
            default: goto L70;
        };
    L70:
        r0 = -1;
    L71:
        switch(r0) {
            case 0: goto L92;
            case 1: goto L90;
            case 2: goto L88;
            case 3: goto L86;
            case 4: goto L85;
            case 5: goto L84;
            case 6: goto L82;
            case 7: goto L80;
            case 8: goto L79;
            case 9: goto L78;
            case 10: goto L76;
            case 11: goto L74;
            default: goto L73;
        };
    L74:
        return "level_end";
    L76:
        return "level_start";
    L78:
        return "invite";
    L79:
        return "login";
    L80:
        return "sign_up";
    L82:
        return "rate_content";
    L84:
        return "share";
    L85:
        return "search";
    L86:
        return "select_content";
    L88:
        return "begin_checkout";
    L90:
        return "add_to_cart";
    L92:
        return "ecommerce_purchase";
    L73:
        return FH(r11);
    L35:
        if (r11.equals("purchase") == false) goto L70;
    L38:
        if (r11.equals("startCheckout") == false) goto L70;
        r0 = 2;
        goto L71
    L41:
        if (r11.equals("levelStart") == false) goto L70;
        r0 = 10;
        goto L71
    L44:
        if (r11.equals("share") == false) goto L70;
        r0 = 5;
        goto L71
    L47:
        if (r11.equals("login") == false) goto L70;
        r0 = 8;
        goto L71
    L50:
        if (r11.equals("addToCart") == false) goto L70;
        r0 = 1;
        goto L71
    L53:
        if (r11.equals("contentView") == false) goto L70;
        r0 = 3;
        goto L71
    L56:
        if (r11.equals("signUp") == false) goto L70;
        r0 = 7;
        goto L71
    L59:
        if (r11.equals("search") == false) goto L70;
        r0 = 4;
        goto L71
    L62:
        if (r11.equals("rating") == false) goto L70;
        r0 = 6;
        goto L71
    L65:
        if (r11.equals("invite") == false) goto L70;
        r0 = 9;
        goto L71
    L68:
        if (r11.equals("levelEnd") == false) goto L70;
        r0 = 11;
        goto L71
    }

    private void j6(android.os.Bundle r3, java.lang.String r4, java.lang.Double r5) {
        java.lang.Double r6 = j6(r5);
        if (r6 != null) goto L5;
        return;
    L5:
        r3.putDouble(r4, r6.doubleValue());
    }

    private void j6(android.os.Bundle r1, java.lang.String r2, java.lang.Integer r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        r1.putInt(r2, r3.intValue());
    }

    private void j6(android.os.Bundle r3, java.lang.String r4, java.lang.Long r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        r3.putLong(r4, r5.longValue());
    }

    private void j6(android.os.Bundle r1, java.lang.String r2, java.lang.String r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        r1.putString(r2, r3);
    }

    private void j6(android.os.Bundle r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> r7 = r6.entrySet().iterator();
    L4:
        if (r7.hasNext() == false) goto L17;
        java.util.Map.Entry<java.lang.String, java.lang.Object> r0 = r7.next();
        java.lang.Object r1 = r0.getValue();
        java.lang.String r2 = j6(r0.getKey());
        if ((r1 instanceof java.lang.String) == true) goto L7;
        if ((r1 instanceof java.lang.Double) == true) goto L10;
        if ((r1 instanceof java.lang.Long) == true) goto L13;
        if ((r1 instanceof java.lang.Integer) == false) goto L4;
        r5.putInt(r2, ((java.lang.Integer) r0.getValue()).intValue());
        goto L4
    L13:
        r5.putLong(r2, ((java.lang.Long) r0.getValue()).longValue());
        goto L4
    L10:
        r5.putDouble(r2, ((java.lang.Double) r0.getValue()).doubleValue());
        goto L4
    L7:
        r5.putString(r2, r0.getValue().toString());
        goto L4
    }

    public com.crashlytics.android.answers.v j6(com.crashlytics.android.answers.I r6) {
        boolean r1 = true;
        if (com.crashlytics.android.answers.I.b.VH.equals(r6.FH) == true) goto L5;
    L7:
        boolean r0 = false;
    L9:
        if (com.crashlytics.android.answers.I.b.gn.equals(r6.FH) == true) goto L11;
    L13:
        boolean r3 = false;
    L14:
        if (r0 == true) goto L18;
        if (r3 == true) goto L18;
        return null;
    L18:
        if (r3 == false) goto L20;
        android.os.Bundle r2 = DW(r6);
    L23:
        if (r3 == false) goto L31;
        java.lang.String r4 = (java.lang.String) r6.gn.get("success");
        if (r4 != null) goto L27;
    L29:
        r1 = false;
    L30:
        java.lang.String r7 = j6(r6.VH, r1);
    L32:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Logging event into firebase...");
        return new com.crashlytics.android.answers.v(r7, r2);
    L27:
        if (java.lang.Boolean.parseBoolean(r4) == true) goto L29;
    L31:
        r7 = FH(r6.v5);
        goto L32
    L20:
        r2 = new android.os.Bundle();
        java.util.Map<java.lang.String, java.lang.Object> r5 = r6.Zo;
        if (r5 == null) goto L23;
        j6(r2, r5);
        goto L23
    L11:
        if (r6.VH == null) goto L13;
        r3 = true;
        goto L14
    L5:
        if (r6.v5 == null) goto L7;
        r0 = true;
        goto L9
    }
}
