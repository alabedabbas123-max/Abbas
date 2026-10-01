package abcd;

public class Iv {
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> j6 = null;

    static {
        j6 = new java.util.HashMap();
    }

    public static android.app.PendingIntent j6(android.content.Context r3, int r4, android.content.Intent r5, int r6, android.os.Bundle r7) {
        int r0 = 0;
        android.app.PendingIntent r8 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.Random().nextInt();
                    r5.putExtra("BACKBONE_INTENT", r0);
                    if (r7 != null) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r8 = android.app.PendingIntent.getActivity(r3, r4, r5, r6);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    j6.put(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r8)), java.lang.Integer.valueOf(r0));
                    return r8;
                }
                case 5: {
                    if (android.os.Build.VERSION.SDK_INT < 16) { $pc0 = 7; continue $sw0; }
                    r8 = android.app.PendingIntent.getActivity(r3, r4, r5, r6, r7);
                    { $pc0 = 8; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static com.appfour.backbone.api.objects.UserNotification j6(int r5, android.app.Notification r6) {
        java.util.HashMap r0 = null;
        android.os.Bundle r1 = null;
        java.util.Iterator<java.lang.String> r2 = null;
        java.lang.String r3 = null;
        java.lang.Object r4 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.HashMap();
                    if (android.os.Build.VERSION.SDK_INT < 19) { $pc1 = 18; continue $sw1; }
                    r1 = r6.extras;
                    if (r1 == null) { $pc1 = 18; continue $sw1; }
                    r2 = r1.keySet().iterator();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r2.hasNext() == false) { $pc1 = 18; continue $sw1; }
                    r3 = r2.next();
                    r4 = r6.extras.get(r3);
                    if ((r4 instanceof java.lang.CharSequence) == true) { $pc1 = 11; continue $sw1; }
                    if ((r4 instanceof java.lang.Integer) == true) { $pc1 = 14; continue $sw1; }
                    if ((r4 instanceof java.lang.Boolean) == false) { $pc1 = 8; continue $sw1; }
                    r0.put(r3, r4.toString());
                    { $pc1 = 8; continue $sw1; }
                }
                case 14: {
                    r0.put(r3, r4.toString());
                    { $pc1 = 8; continue $sw1; }
                }
                case 11: {
                    r0.put(r3, r4.toString());
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    r7 = null;
                    if (android.os.Build.VERSION.SDK_INT < 21) { $pc1 = 22; continue $sw1; }
                    r7 = r6.getGroup();
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    return new com.appfour.backbone.api.objects.UserNotification(abcd.wu.j6(), r5, r7, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static com.appfour.backbone.api.objects.UserNotificationAction j6(android.app.Activity r7, int r8) {
        java.io.File r9 = null;
        int r1 = 0;
        java.util.HashMap r2 = null;
        android.util.JsonReader r3 = null;
        java.lang.String r10 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r9 = j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = 0;
                    try {
                        r2 = new java.util.HashMap();
                        r3 = new android.util.JsonReader(new java.io.FileReader(r9));
                        r3.beginObject();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r10 = null;
                    r4 = null;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r3.hasNext() == false) { $pc2 = 29; continue $sw2; }
                    try {
                        r5 = r3.nextName();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5.equals("name") == true) { $pc2 = 9; continue $sw2; }
                    if (r5.equals("id") == true) { $pc2 = 14; continue $sw2; }
                    if (r5.equals("group") == true) { $pc2 = 18; continue $sw2; }
                    if (r5.equals("extras") == true) { $pc2 = 23; continue $sw2; }
                    try {
                        r3.skipValue();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 23: {
                    try {
                        r3.beginObject();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    if (r3.hasNext() == false) { $pc2 = 27; continue $sw2; }
                    try {
                        r2.put(r3.nextName(), r3.nextString());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 25; continue $sw2; }
                }
                case 27: {
                    try {
                        r3.endObject();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 18: {
                    if (r3.peek() == android.util.JsonToken.NULL) { $pc2 = 19; continue $sw2; }
                    try {
                        r10 = r3.nextString();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 19: {
                    try {
                        r3.nextNull();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 14: {
                    try {
                        r1 = (int) r3.nextLong();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 9: {
                    if (r3.peek() == android.util.JsonToken.NULL) { $pc2 = 10; continue $sw2; }
                    try {
                        r4 = r3.nextString();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 10: {
                    try {
                        r3.nextNull();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 5; continue $sw2; }
                }
                case 29: {
                    try {
                        r3.endObject();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 31; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new com.appfour.backbone.api.objects.UserNotificationAction(new com.appfour.backbone.api.objects.UserNotification(abcd.wu.j6(), r1, r10, r2), r7, r4);
                }
                case 31: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.io.File j6() {
        return abcd.uw.j6(abcd.wu.j6(), "notifications");
    }

    private static java.io.File j6(int r4) {
        return new java.io.File(j6(), "" + r4);
    }

    private static void j6(java.lang.Integer r0) {
        j6(r0.intValue()).delete();
    }

    private static void j6(java.lang.Integer r2, com.appfour.backbone.api.objects.UserNotification r3, java.lang.String r4) {
        java.io.File r5 = null;
        android.util.JsonWriter r6 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r7 = null;
        java.util.Map.Entry<java.lang.String, java.lang.String> r8 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        r5 = j6(r2.intValue());
                        r5.getParentFile().mkdirs();
                        r6 = new android.util.JsonWriter(new java.io.FileWriter(r5));
                        r6.beginObject();
                        r6.name("name").value(r4);
                        r6.name("id").value(r3.getId());
                        r6.name("group").value(r3.getGroup());
                        r6.name("extras");
                        r6.beginObject();
                        r7 = r3.getExtras().entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc3 = 6; continue $sw3; }
                    try {
                        r8 = r7.next();
                        r6.name(r8.getKey()).value(r8.getValue());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    try {
                        r6.endObject();
                        r6.endObject();
                        r6.close();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r4, int r5, android.app.Notification r6) {
        com.appfour.backbone.api.objects.UserNotification r7 = null;
        android.app.PendingIntent r8 = null;
        java.lang.Integer r9 = null;
        android.app.PendingIntent r10 = null;
        java.lang.Integer r11 = null;
        android.app.Notification.Action[] r12 = null;
        int r13 = 0;
        int r0 = 0;
        android.app.Notification.Action r1 = null;
        java.lang.Integer r2 = null;
        java.lang.CharSequence r3 = null;
        java.lang.String r14 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r7 = j6(r5, r6);
                    r8 = r6.contentIntent;
                    if (r8 == null) { $pc4 = 7; continue $sw4; }
                    r9 = j6.get(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r8)));
                    if (j6 == null) { $pc4 = 7; continue $sw4; }
                    j6(r9, r7, "__CONTENT");
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    r10 = r6.deleteIntent;
                    if (r10 == null) { $pc4 = 13; continue $sw4; }
                    r11 = j6.get(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r10)));
                    if (j6 == null) { $pc4 = 13; continue $sw4; }
                    j6(r11, r7, "__DELETE");
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    if (android.os.Build.VERSION.SDK_INT < 19) { $pc4 = 26; continue $sw4; }
                    r12 = r6.actions;
                    if (r12 == null) { $pc4 = 26; continue $sw4; }
                    r13 = r12.length;
                    r0 = 0;
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    if (r0 >= r13) { $pc4 = 26; continue $sw4; }
                    r1 = r12[r0];
                    r2 = j6.get(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r1.actionIntent)));
                    if (j6 == null) { $pc4 = 25; continue $sw4; }
                    r3 = r1.title;
                    if (r3 != null) { $pc4 = 23; continue $sw4; }
                    r14 = null;
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    j6(r2, r7, r14);
                    { $pc4 = 25; continue $sw4; }
                }
                case 23: {
                    r14 = r3.toString();
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    r0 = r0 + 1;
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    abcd.kv.j6(r7);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.app.Activity r2, android.content.Intent r3) {
        int r4 = 0;
        com.appfour.backbone.api.objects.UserNotificationAction r5 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r3 != null) { $pc5 = 4; continue $sw5; }
                    return false;
                }
                case 4: {
                    if (r3.getExtras() == null) { $pc5 = 11; continue $sw5; }
                    r4 = r3.getExtras().getInt("BACKBONE_INTENT", -1);
                    r5 = j6(r2, r4);
                    j6(java.lang.Integer.valueOf(r4));
                    if (r5 == null) { $pc5 = 12; continue $sw5; }
                    abcd.kv.j6(r5);
                    return true;
                }
                case 12: {
                    return false;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
