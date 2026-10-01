package com.crashlytics.android.answers;

public class w {
    private static final java.util.Set<java.lang.String> j6 = null;

    static {
        j6 = new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));
    }

    public w() {
    }

    private android.os.Bundle DW(com.crashlytics.android.answers.I r13) {
        android.os.Bundle r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new android.os.Bundle();
                    if ("purchase".equals(r13.VH) == false) { $pc0 = 6; continue $sw0; }
                    j6(r0, "item_id", (java.lang.String) r13.gn.get("itemId"));
                    j6(r0, "item_name", (java.lang.String) r13.gn.get("itemName"));
                    j6(r0, "item_category", (java.lang.String) r13.gn.get("itemType"));
                    j6(r0, "value", DW(r13.gn.get("itemPrice")));
                    j6(r0, "currency", (java.lang.String) r13.gn.get("currency"));
                    $pc0 = 38; continue $sw0;
                }
                case 38: {
                    j6(r0, r13.Zo);
                    return r0;
                }
                case 6: {
                    if ("addToCart".equals(r13.VH) == false) { $pc0 = 9; continue $sw0; }
                    j6(r0, "item_id", (java.lang.String) r13.gn.get("itemId"));
                    j6(r0, "item_name", (java.lang.String) r13.gn.get("itemName"));
                    j6(r0, "item_category", (java.lang.String) r13.gn.get("itemType"));
                    j6(r0, "price", DW(r13.gn.get("itemPrice")));
                    j6(r0, "value", DW(r13.gn.get("itemPrice")));
                    j6(r0, "currency", (java.lang.String) r13.gn.get("currency"));
                    r0.putLong("quantity", 1);
                    { $pc0 = 38; continue $sw0; }
                }
                case 9: {
                    if ("startCheckout".equals(r13.VH) == false) { $pc0 = 12; continue $sw0; }
                    j6(r0, "quantity", java.lang.Long.valueOf(((java.lang.Integer) r13.gn.get("itemCount")).intValue()));
                    j6(r0, "value", DW(r13.gn.get("totalPrice")));
                    j6(r0, "currency", (java.lang.String) r13.gn.get("currency"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 12: {
                    if ("contentView".equals(r13.VH) == false) { $pc0 = 15; continue $sw0; }
                    j6(r0, "content_type", (java.lang.String) r13.gn.get("contentType"));
                    j6(r0, "item_id", (java.lang.String) r13.gn.get("contentId"));
                    j6(r0, "item_name", (java.lang.String) r13.gn.get("contentName"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 15: {
                    if ("search".equals(r13.VH) == false) { $pc0 = 18; continue $sw0; }
                    j6(r0, "search_term", (java.lang.String) r13.gn.get("query"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 18: {
                    if ("share".equals(r13.VH) == false) { $pc0 = 21; continue $sw0; }
                    j6(r0, "method", (java.lang.String) r13.gn.get("method"));
                    j6(r0, "content_type", (java.lang.String) r13.gn.get("contentType"));
                    j6(r0, "item_id", (java.lang.String) r13.gn.get("contentId"));
                    j6(r0, "item_name", (java.lang.String) r13.gn.get("contentName"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 21: {
                    if ("rating".equals(r13.VH) == false) { $pc0 = 24; continue $sw0; }
                    j6(r0, "rating", java.lang.String.valueOf(r13.gn.get("rating")));
                    j6(r0, "content_type", (java.lang.String) r13.gn.get("contentType"));
                    j6(r0, "item_id", (java.lang.String) r13.gn.get("contentId"));
                    j6(r0, "item_name", (java.lang.String) r13.gn.get("contentName"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 24: {
                    if ("signUp".equals(r13.VH) == false) { $pc0 = 27; continue $sw0; }
                    j6(r0, "method", (java.lang.String) r13.gn.get("method"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 27: {
                    if ("login".equals(r13.VH) == false) { $pc0 = 30; continue $sw0; }
                    j6(r0, "method", (java.lang.String) r13.gn.get("method"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 30: {
                    if ("invite".equals(r13.VH) == false) { $pc0 = 33; continue $sw0; }
                    j6(r0, "method", (java.lang.String) r13.gn.get("method"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 33: {
                    if ("levelStart".equals(r13.VH) == false) { $pc0 = 36; continue $sw0; }
                    j6(r0, "level_name", (java.lang.String) r13.gn.get("levelName"));
                    { $pc0 = 38; continue $sw0; }
                }
                case 36: {
                    if ("levelEnd".equals(r13.VH) == false) { $pc0 = 38; continue $sw0; }
                    j6(r0, "score", j6(r13.gn.get("score")));
                    j6(r0, "level_name", (java.lang.String) r13.gn.get("levelName"));
                    j6(r0, "success", DW((java.lang.String) r13.gn.get("success")));
                    { $pc0 = 38; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.Double DW(java.lang.Object r4) {
        java.lang.Long r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r5 = (java.lang.Long) r4;
                    if (r5 != null) { $pc1 = 7; continue $sw1; }
                    return null;
                }
                case 7: {
                    return java.lang.Double.valueOf(new java.math.BigDecimal(r5.longValue()).divide(com.crashlytics.android.answers.ClassA.j6).doubleValue());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.Integer DW(java.lang.String r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != null) { $pc2 = 6; continue $sw2; }
                    return null;
                }
                case 6: {
                    return java.lang.Integer.valueOf(r2.equals("true") ? 1 : 0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String FH(java.lang.String r4) {
        java.lang.String r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 != null) { $pc3 = 4; continue $sw3; }
                    return "fabric_unnamed_event";
                }
                case 4: {
                    if (r4.length() != 0) { $pc3 = 7; continue $sw3; }
                    return "fabric_unnamed_event";
                }
                case 7: {
                    if (j6.contains(r4) == true) { $pc3 = 9; continue $sw3; }
                    r5 = r4.replaceAll("[^\\p{Alnum}_]+", "_");
                    if (r5.startsWith("ga_") == false) { $pc3 = 13; continue $sw3; }
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    r5 = "fabric_" + r5;
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    if (r5.length() > 40) { $pc3 = 22; continue $sw3; }
                    return r5;
                }
                case 22: {
                    return r5.substring(0, 40);
                }
                case 13: {
                    if (r5.startsWith("google_") == true) { $pc3 = 18; continue $sw3; }
                    if (r5.startsWith("firebase_") == true) { $pc3 = 18; continue $sw3; }
                    if (java.lang.Character.isLetter(r5.charAt(0)) == true) { $pc3 = 20; continue $sw3; }
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    return "fabric_" + r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.Double j6(java.lang.Object r1) {
        java.lang.String r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r2 = java.lang.String.valueOf(r1);
                    if (r2 != null) { $pc4 = 7; continue $sw4; }
                    return null;
                }
                case 7: {
                    return java.lang.Double.valueOf(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.String r4) {
        java.lang.String r5 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r4 != null) { $pc5 = 4; continue $sw5; }
                    return "fabric_unnamed_parameter";
                }
                case 4: {
                    if (r4.length() == 0) { $pc5 = 22; continue $sw5; }
                    r5 = r4.replaceAll("[^\\p{Alnum}_]+", "_");
                    if (r5.startsWith("ga_") == false) { $pc5 = 9; continue $sw5; }
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    r5 = "fabric_" + r5;
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    if (r5.length() > 40) { $pc5 = 18; continue $sw5; }
                    return r5;
                }
                case 18: {
                    return r5.substring(0, 40);
                }
                case 9: {
                    if (r5.startsWith("google_") == true) { $pc5 = 14; continue $sw5; }
                    if (r5.startsWith("firebase_") == true) { $pc5 = 14; continue $sw5; }
                    if (java.lang.Character.isLetter(r5.charAt(0)) == true) { $pc5 = 16; continue $sw5; }
                    $pc5 = 22; continue $sw5;
                }
                case 22: {
                    return "fabric_unnamed_parameter";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.String r11, boolean r12) {
        byte r0 = 0;
        int r13 = 0;
        byte r14 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = 0;
                    if (r12 == false) { $pc6 = 32; continue $sw6; }
                    r13 = r11.hashCode();
                    if (r13 == (-902468296)) { $pc6 = 18; continue $sw6; }
                    if (r13 == 103149417) { $pc6 = 15; continue $sw6; }
                    if (r13 == 1743324417) { $pc6 = 12; continue $sw6; }
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    r14 = -1;
                    $pc6 = 21; continue $sw6;
                }
                case 21: {
                    if (r14 == 0) { $pc6 = 29; continue $sw6; }
                    if (r14 == 1) { $pc6 = 27; continue $sw6; }
                    if (r14 != 2) { $pc6 = 32; continue $sw6; }
                    return "failed_login";
                }
                case 27: {
                    return "failed_sign_up";
                }
                case 29: {
                    return "failed_ecommerce_purchase";
                }
                case 12: {
                    if (r11.equals("purchase") == false) { $pc6 = 20; continue $sw6; }
                    r14 = 0;
                    { $pc6 = 21; continue $sw6; }
                }
                case 15: {
                    if (r11.equals("login") == false) { $pc6 = 20; continue $sw6; }
                    r14 = 2;
                    { $pc6 = 21; continue $sw6; }
                }
                case 18: {
                    if (r11.equals("signUp") == false) { $pc6 = 20; continue $sw6; }
                    r14 = 1;
                    $pc6 = 32; continue $sw6;
                }
                case 32: {
                    switch(r11.hashCode()) {
                        case -2131650889: { $pc6 = 68; continue $sw6; }
                        case -1183699191: { $pc6 = 65; continue $sw6; }
                        case -938102371: { $pc6 = 62; continue $sw6; }
                        case -906336856: { $pc6 = 59; continue $sw6; }
                        case -902468296: { $pc6 = 56; continue $sw6; }
                        case -389087554: { $pc6 = 53; continue $sw6; }
                        case 23457852: { $pc6 = 50; continue $sw6; }
                        case 103149417: { $pc6 = 47; continue $sw6; }
                        case 109400031: { $pc6 = 44; continue $sw6; }
                        case 196004670: { $pc6 = 41; continue $sw6; }
                        case 1664021448: { $pc6 = 38; continue $sw6; }
                        case 1743324417: { $pc6 = 35; continue $sw6; }
                        default: { $pc6 = 70; continue $sw6; }
                    };
                }
                case 70: {
                    r0 = -1;
                    $pc6 = 71; continue $sw6;
                }
                case 71: {
                    switch(r0) {
                        case 0: { $pc6 = 92; continue $sw6; }
                        case 1: { $pc6 = 90; continue $sw6; }
                        case 2: { $pc6 = 88; continue $sw6; }
                        case 3: { $pc6 = 86; continue $sw6; }
                        case 4: { $pc6 = 85; continue $sw6; }
                        case 5: { $pc6 = 84; continue $sw6; }
                        case 6: { $pc6 = 82; continue $sw6; }
                        case 7: { $pc6 = 80; continue $sw6; }
                        case 8: { $pc6 = 79; continue $sw6; }
                        case 9: { $pc6 = 78; continue $sw6; }
                        case 10: { $pc6 = 76; continue $sw6; }
                        case 11: { $pc6 = 74; continue $sw6; }
                        default: { $pc6 = 73; continue $sw6; }
                    };
                }
                case 74: {
                    return "level_end";
                }
                case 76: {
                    return "level_start";
                }
                case 78: {
                    return "invite";
                }
                case 79: {
                    return "login";
                }
                case 80: {
                    return "sign_up";
                }
                case 82: {
                    return "rate_content";
                }
                case 84: {
                    return "share";
                }
                case 85: {
                    return "search";
                }
                case 86: {
                    return "select_content";
                }
                case 88: {
                    return "begin_checkout";
                }
                case 90: {
                    return "add_to_cart";
                }
                case 92: {
                    return "ecommerce_purchase";
                }
                case 73: {
                    return FH(r11);
                }
                case 35: {
                    if (r11.equals("purchase") == false) { $pc6 = 70; continue $sw6; }
                    $pc6 = 38; continue $sw6;
                }
                case 38: {
                    if (r11.equals("startCheckout") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 2;
                    { $pc6 = 71; continue $sw6; }
                }
                case 41: {
                    if (r11.equals("levelStart") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 10;
                    { $pc6 = 71; continue $sw6; }
                }
                case 44: {
                    if (r11.equals("share") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 5;
                    { $pc6 = 71; continue $sw6; }
                }
                case 47: {
                    if (r11.equals("login") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 8;
                    { $pc6 = 71; continue $sw6; }
                }
                case 50: {
                    if (r11.equals("addToCart") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 1;
                    { $pc6 = 71; continue $sw6; }
                }
                case 53: {
                    if (r11.equals("contentView") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 3;
                    { $pc6 = 71; continue $sw6; }
                }
                case 56: {
                    if (r11.equals("signUp") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 7;
                    { $pc6 = 71; continue $sw6; }
                }
                case 59: {
                    if (r11.equals("search") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 4;
                    { $pc6 = 71; continue $sw6; }
                }
                case 62: {
                    if (r11.equals("rating") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 6;
                    { $pc6 = 71; continue $sw6; }
                }
                case 65: {
                    if (r11.equals("invite") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 9;
                    { $pc6 = 71; continue $sw6; }
                }
                case 68: {
                    if (r11.equals("levelEnd") == false) { $pc6 = 70; continue $sw6; }
                    r0 = 11;
                    { $pc6 = 71; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.os.Bundle r3, java.lang.String r4, java.lang.Double r5) {
        java.lang.Double r6 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r6 = j6(r5);
                    if (r6 != null) { $pc7 = 5; continue $sw7; }
                    return;
                }
                case 5: {
                    r3.putDouble(r4, r6.doubleValue());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.os.Bundle r1, java.lang.String r2, java.lang.Integer r3) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r3 != null) { $pc8 = 4; continue $sw8; }
                    return;
                }
                case 4: {
                    r1.putInt(r2, r3.intValue());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.os.Bundle r3, java.lang.String r4, java.lang.Long r5) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r5 != null) { $pc9 = 4; continue $sw9; }
                    return;
                }
                case 4: {
                    r3.putLong(r4, r5.longValue());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.os.Bundle r1, java.lang.String r2, java.lang.String r3) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r3 != null) { $pc10 = 4; continue $sw10; }
                    return;
                }
                case 4: {
                    r1.putString(r2, r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.os.Bundle r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> r7 = null;
        java.util.Map.Entry<java.lang.String, java.lang.Object> r0 = null;
        java.lang.Object r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r7 = r6.entrySet().iterator();
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc11 = 17; continue $sw11; }
                    r0 = r7.next();
                    r1 = r0.getValue();
                    r2 = j6(r0.getKey());
                    if ((r1 instanceof java.lang.String) == true) { $pc11 = 7; continue $sw11; }
                    if ((r1 instanceof java.lang.Double) == true) { $pc11 = 10; continue $sw11; }
                    if ((r1 instanceof java.lang.Long) == true) { $pc11 = 13; continue $sw11; }
                    if ((r1 instanceof java.lang.Integer) == false) { $pc11 = 4; continue $sw11; }
                    r5.putInt(r2, ((java.lang.Integer) r0.getValue()).intValue());
                    { $pc11 = 4; continue $sw11; }
                }
                case 13: {
                    r5.putLong(r2, ((java.lang.Long) r0.getValue()).longValue());
                    { $pc11 = 4; continue $sw11; }
                }
                case 10: {
                    r5.putDouble(r2, ((java.lang.Double) r0.getValue()).doubleValue());
                    { $pc11 = 4; continue $sw11; }
                }
                case 7: {
                    r5.putString(r2, r0.getValue().toString());
                    { $pc11 = 4; continue $sw11; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.crashlytics.android.answers.v j6(com.crashlytics.android.answers.I r6) {
        boolean r1 = false;
        boolean r0 = false;
        boolean r3 = false;
        android.os.Bundle r2 = null;
        java.lang.String r4 = null;
        java.lang.String r7 = null;
        java.util.Map<java.lang.String, java.lang.Object> r5 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r1 = true;
                    if (com.crashlytics.android.answers.I.b.VH.equals(r6.FH) == true) { $pc12 = 5; continue $sw12; }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    r0 = false;
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    if (com.crashlytics.android.answers.I.b.gn.equals(r6.FH) == true) { $pc12 = 11; continue $sw12; }
                    $pc12 = 13; continue $sw12;
                }
                case 13: {
                    r3 = false;
                    $pc12 = 14; continue $sw12;
                }
                case 14: {
                    if (r0 == true) { $pc12 = 18; continue $sw12; }
                    if (r3 == true) { $pc12 = 18; continue $sw12; }
                    return null;
                }
                case 18: {
                    if (r3 == false) { $pc12 = 20; continue $sw12; }
                    r2 = DW(r6);
                    $pc12 = 23; continue $sw12;
                }
                case 23: {
                    if (r3 == false) { $pc12 = 31; continue $sw12; }
                    r4 = (java.lang.String) r6.gn.get("success");
                    if (r4 != null) { $pc12 = 27; continue $sw12; }
                    $pc12 = 29; continue $sw12;
                }
                case 29: {
                    r1 = false;
                    $pc12 = 30; continue $sw12;
                }
                case 30: {
                    r7 = j6(r6.VH, r1);
                    $pc12 = 32; continue $sw12;
                }
                case 32: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Answers", "Logging event into firebase...");
                    return new com.crashlytics.android.answers.v(r7, r2);
                }
                case 27: {
                    if (java.lang.Boolean.parseBoolean(r4) == true) { $pc12 = 29; continue $sw12; }
                    $pc12 = 31; continue $sw12;
                }
                case 31: {
                    r7 = FH(r6.v5);
                    { $pc12 = 32; continue $sw12; }
                }
                case 20: {
                    r2 = new android.os.Bundle();
                    r5 = r6.Zo;
                    if (r5 == null) { $pc12 = 23; continue $sw12; }
                    j6(r2, r5);
                    { $pc12 = 23; continue $sw12; }
                }
                case 11: {
                    if (r6.VH == null) { $pc12 = 13; continue $sw12; }
                    r3 = true;
                    { $pc12 = 14; continue $sw12; }
                }
                case 5: {
                    if (r6.v5 == null) { $pc12 = 7; continue $sw12; }
                    r0 = true;
                    { $pc12 = 9; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
