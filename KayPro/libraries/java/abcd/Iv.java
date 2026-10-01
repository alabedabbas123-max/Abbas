package abcd;

public class Iv {
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> j6 = null;

    static {
        j6 = new java.util.HashMap();
    }

    public static android.app.PendingIntent j6(android.content.Context r3, int r4, android.content.Intent r5, int r6, android.os.Bundle r7) {
        int r0 = new java.util.Random().nextInt();
        r5.putExtra("BACKBONE_INTENT", r0);
        if (r7 != null) goto L5;
    L7:
        android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r3, r4, r5, r6);
    L8:
        j6.put(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r8)), java.lang.Integer.valueOf(r0));
        return r8;
    L5:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L7;
        r8 = android.app.PendingIntent.getActivity(r3, r4, r5, r6, r7);
        goto L8
    }

    private static com.appfour.backbone.api.objects.UserNotification j6(int r5, android.app.Notification r6) {
        java.util.HashMap r0 = new java.util.HashMap();
        if (android.os.Build.VERSION.SDK_INT < 19) goto L18;
        android.os.Bundle r1 = r6.extras;
        if (r1 == null) goto L18;
        java.util.Iterator<java.lang.String> r2 = r1.keySet().iterator();
    L8:
        if (r2.hasNext() == false) goto L18;
        java.lang.String r3 = r2.next();
        java.lang.Object r4 = r6.extras.get(r3);
        if ((r4 instanceof java.lang.CharSequence) == true) goto L11;
        if ((r4 instanceof java.lang.Integer) == true) goto L14;
        if ((r4 instanceof java.lang.Boolean) == false) goto L8;
        r0.put(r3, r4.toString());
        goto L8
    L14:
        r0.put(r3, r4.toString());
        goto L8
    L11:
        r0.put(r3, r4.toString());
    L18:
        java.lang.String r7 = null;
        if (android.os.Build.VERSION.SDK_INT < 21) goto L22;
        r7 = r6.getGroup();
    L22:
        return new com.appfour.backbone.api.objects.UserNotification(abcd.wu.j6(), r5, r7, r0);
    }

    private static com.appfour.backbone.api.objects.UserNotificationAction j6(android.app.Activity r7, int r8) {
        java.io.File r9 = j6(r8);     // Catch: java.io.IOException -> L31
        int r1 = 0;
        java.util.HashMap r2 = new java.util.HashMap();     // Catch: java.io.IOException -> L31
        android.util.JsonReader r3 = new android.util.JsonReader(new java.io.FileReader(r9));     // Catch: java.io.IOException -> L31
        r3.beginObject();     // Catch: java.io.IOException -> L31
        java.lang.String r10 = null;
        java.lang.String r4 = null;
    L5:
        if (r3.hasNext() == false) goto L29;
        java.lang.String r5 = r3.nextName();     // Catch: java.io.IOException -> L31
        if (r5.equals("name") == true) goto L9;
        if (r5.equals("id") == true) goto L14;
        if (r5.equals("group") == true) goto L18;
        if (r5.equals("extras") == true) goto L23;
        r3.skipValue();     // Catch: java.io.IOException -> L31
        goto L5
    L23:
        r3.beginObject();     // Catch: java.io.IOException -> L31
    L25:
        if (r3.hasNext() == false) goto L27;
        r2.put(r3.nextName(), r3.nextString());     // Catch: java.io.IOException -> L31
        goto L25
    L27:
        r3.endObject();     // Catch: java.io.IOException -> L31
        goto L5
    L18:
        if (r3.peek() == android.util.JsonToken.NULL) goto L19;
        r10 = r3.nextString();     // Catch: java.io.IOException -> L31
        goto L5
    L19:
        r3.nextNull();     // Catch: java.io.IOException -> L31
        goto L5
    L14:
        r1 = (int) r3.nextLong();     // Catch: java.io.IOException -> L31
        goto L5
    L9:
        if (r3.peek() == android.util.JsonToken.NULL) goto L10;
        r4 = r3.nextString();     // Catch: java.io.IOException -> L31
        goto L5
    L10:
        r3.nextNull();     // Catch: java.io.IOException -> L31
        goto L5
    L29:
        r3.endObject();     // Catch: java.io.IOException -> L31
        return new com.appfour.backbone.api.objects.UserNotificationAction(new com.appfour.backbone.api.objects.UserNotification(abcd.wu.j6(), r1, r10, r2), r7, r4);
    L31:
        return null;
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
        java.io.File r5 = j6(r2.intValue());     // Catch: java.io.IOException -> L8
        r5.getParentFile().mkdirs();     // Catch: java.io.IOException -> L8
        android.util.JsonWriter r6 = new android.util.JsonWriter(new java.io.FileWriter(r5));     // Catch: java.io.IOException -> L8
        r6.beginObject();     // Catch: java.io.IOException -> L8
        r6.name("name").value(r4);     // Catch: java.io.IOException -> L8
        r6.name("id").value(r3.getId());     // Catch: java.io.IOException -> L8
        r6.name("group").value(r3.getGroup());     // Catch: java.io.IOException -> L8
        r6.name("extras");     // Catch: java.io.IOException -> L8
        r6.beginObject();     // Catch: java.io.IOException -> L8
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> r7 = r3.getExtras().entrySet().iterator();     // Catch: java.io.IOException -> L8
    L4:
        if (r7.hasNext() == false) goto L6;
        java.util.Map.Entry<java.lang.String, java.lang.String> r8 = r7.next();     // Catch: java.io.IOException -> L8
        r6.name(r8.getKey()).value(r8.getValue());     // Catch: java.io.IOException -> L8
        goto L4
    L6:
        r6.endObject();     // Catch: java.io.IOException -> L8
        r6.endObject();     // Catch: java.io.IOException -> L8
        r6.close();     // Catch: java.io.IOException -> L8
        return;
    }

    public static void j6(java.lang.String r4, int r5, android.app.Notification r6) {
        com.appfour.backbone.api.objects.UserNotification r7 = j6(r5, r6);
        android.app.PendingIntent r8 = r6.contentIntent;
        if (r8 == null) goto L7;
        java.lang.Integer r9 = j6.get(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r8)));
        if (j6 == null) goto L7;
        j6(r9, r7, "__CONTENT");
    L7:
        android.app.PendingIntent r10 = r6.deleteIntent;
        if (r10 == null) goto L13;
        java.lang.Integer r11 = j6.get(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r10)));
        if (j6 == null) goto L13;
        j6(r11, r7, "__DELETE");
    L13:
        if (android.os.Build.VERSION.SDK_INT < 19) goto L26;
        android.app.Notification.Action[] r12 = r6.actions;
        if (r12 == null) goto L26;
        int r13 = r12.length;
        int r0 = 0;
    L17:
        if (r0 >= r13) goto L26;
        android.app.Notification.Action r1 = r12[r0];
        java.lang.Integer r2 = j6.get(java.lang.Integer.valueOf(java.lang.System.identityHashCode(r1.actionIntent)));
        if (j6 == null) goto L25;
        java.lang.CharSequence r3 = r1.title;
        if (r3 != null) goto L23;
        java.lang.String r14 = null;
    L24:
        j6(r2, r7, r14);
        goto L25
    L23:
        r14 = r3.toString();
    L25:
        r0 = r0 + 1;
    L26:
        abcd.kv.j6(r7);
    }

    public static boolean j6(android.app.Activity r2, android.content.Intent r3) {
        if (r3 != null) goto L4;
        return false;
    L4:
        if (r3.getExtras() == null) goto L11;
        int r4 = r3.getExtras().getInt("BACKBONE_INTENT", -1);
        com.appfour.backbone.api.objects.UserNotificationAction r5 = j6(r2, r4);
        j6(java.lang.Integer.valueOf(r4));
        if (r5 == null) goto L12;
        abcd.kv.j6(r5);
        return true;
    L12:
        return false;
    L11:
        return false;
    }
}
