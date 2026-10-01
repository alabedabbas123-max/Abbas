package com.aide.common;

@abcd.Interfacexu
public class Ha {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.Ha.class, 2278315543554812120L, 2278315543554812120L);
    }

    public Ha() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1657984845315659039L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1657984845315659039L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void DW(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3888963232645036665L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3888963232645036665L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L7
        r0.setData(android.net.Uri.parse("https://groups.google.com/group/" + r8));     // Catch: java.lang.Throwable -> L7
        r0.setFlags(1074266112);     // Catch: java.lang.Throwable -> L7
        j6(r7, r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void DW(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -4609465207998660384L, null, r8, r9, r10);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4609465207998660384L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L11
    L5:
        abcd.F.j6("Shared via facebook");     // Catch: java.lang.Throwable -> L11
        android.content.Intent r0 = new android.content.Intent("android.intent.action.SEND");     // Catch: java.lang.Throwable -> L11
        r0.setType("text/plain");     // Catch: java.lang.Throwable -> L11
        r0.putExtra("android.intent.extra.SUBJECT", r9);     // Catch: java.lang.Throwable -> L11
        r0.putExtra("android.intent.extra.TEXT", r10);     // Catch: java.lang.Throwable -> L11
        if (j6(r8, "com.facebook.katana", r0) == true) goto L8;
        r0 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.facebook.com/sharer/sharer.php?u=" + r10));     // Catch: java.lang.Throwable -> L11
    L9:
        j6(r8, r0);     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        ((android.text.ClipboardManager) r8.getSystemService("clipboard")).setText(r9);     // Catch: java.lang.Throwable -> L11
        new android.os.Handler().postDelayed(new com.aide.common.Ga(r8, r9), 1000);     // Catch: java.lang.Throwable -> L11
        goto L9
    }

    public static void FH(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 294122341125300493L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(294122341125300493L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L7
        r0.setData(android.net.Uri.parse("https://plus.google.com/communities/" + r8));     // Catch: java.lang.Throwable -> L7
        r0.setFlags(1074266112);     // Catch: java.lang.Throwable -> L7
        j6(r7, "com.google.android.apps.plus", r0);     // Catch: java.lang.Throwable -> L7
        j6(r7, r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void FH(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2462733058118031657L, null, r8, r9, r10);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2462733058118031657L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L10
    L5:
        abcd.F.j6("Shared via gplus");     // Catch: java.lang.Throwable -> L10
        android.content.Intent r0 = new android.content.Intent("android.intent.action.SEND");     // Catch: java.lang.Throwable -> L10
        r0.setType("text/plain");     // Catch: java.lang.Throwable -> L10
        r0.putExtra("android.intent.extra.TEXT", r9 + "\n\n" + r10);     // Catch: java.lang.Throwable -> L10
        if (j6(r8, "com.google.android.apps.plus", r0) == true) goto L8;
        r0 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://plus.google.com/share?url=" + r10 + "&text=" + r9));     // Catch: java.lang.Throwable -> L10
    L8:
        j6(r8, r0);     // Catch: java.lang.Throwable -> L10
    }

    public static void Hw(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 783492425720636463L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(783492425720636463L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L7
        r0.setData(android.net.Uri.parse("https://plus.google.com/" + r8 + "/posts"));     // Catch: java.lang.Throwable -> L7
        r0.setFlags(1074266112);     // Catch: java.lang.Throwable -> L7
        j6(r7, "com.google.android.apps.plus", r0);     // Catch: java.lang.Throwable -> L7
        j6(r7, r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void Hw(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4181107681177613451L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4181107681177613451L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.F.j6("Shared via twitter");     // Catch: java.lang.Throwable -> L7
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L7
        r0.setData(android.net.Uri.parse("http://www.twitter.com/intent/tweet?url=" + r10 + "&text=" + r9));     // Catch: java.lang.Throwable -> L7
        j6(r8, "com.twitter.android", r0);     // Catch: java.lang.Throwable -> L7
        j6(r8, r0);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -4689788718082417315L)
    private static void j6(android.content.Context r7, android.content.Intent r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4100065459496554356L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L15;
        abcd.wu.j6(-4100065459496554356L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L15:
        r7.startActivity(r8);     // Catch: java.lang.Throwable -> L12
        return;
    }

    public static void j6(android.content.Context r7, java.lang.String r8) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -5737581203096132064L, null, r7, r8);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5737581203096132064L, null, r7, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        android.content.Intent r1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("fb://profile/" + r8));     // Catch: java.lang.Throwable -> L11
        if (j6(r7, "com.facebook.katana", r1) == true) goto L9;
        r1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.facebook.com/" + r8));     // Catch: java.lang.Throwable -> L11
    L9:
        r1.setFlags(1074266112);     // Catch: java.lang.Throwable -> L11
        j6(r7, r1);     // Catch: java.lang.Throwable -> L11
    }

    public static void j6(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -8197465575402489600L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-8197465575402489600L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L7
        r0.setData(android.net.Uri.parse(abcd.F.j6(r9, r9, r10)));     // Catch: java.lang.Throwable -> L7
        r0.setFlags(1074266112);     // Catch: java.lang.Throwable -> L7
        j6(r8, r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1248134482885076335L, null, r9, r10, r11, r12);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1248134482885076335L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent("android.intent.action.SEND");     // Catch: java.lang.Throwable -> L7
        r0.setType("message/rfc822");     // Catch: java.lang.Throwable -> L7
        r0.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{r10});     // Catch: java.lang.Throwable -> L7
        r0.putExtra("android.intent.extra.SUBJECT", "AIDE Feedback");     // Catch: java.lang.Throwable -> L7
        r0.putExtra("android.intent.extra.TEXT", r12);     // Catch: java.lang.Throwable -> L7
        j6(r9, r0);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -1100004955179470971L)
    private static boolean j6(android.content.Context r8, java.lang.String r9, android.content.Intent r10) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 1665769314048397688L, null, r8, r9, r10);
    L23:
        throw th;
    L3:
        if (j6 == false) goto L28;
        abcd.wu.j6(1665769314048397688L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L18
    L28:
        java.util.List<android.content.pm.ResolveInfo> r11 = r8.getPackageManager().queryIntentActivities(r10, 0);     // Catch: java.lang.Throwable -> L25
        if (r11 == null) goto L17;
        if (r11.size() <= 1) goto L17;
        java.util.Iterator<android.content.pm.ResolveInfo> r12 = r11.iterator();     // Catch: java.lang.Throwable -> L25
    L12:
        if (r12.hasNext() == false) goto L17;
        if (r9.equals(r12.next().activityInfo.applicationInfo.packageName) == false) goto L12;
        r10.setPackage(r9);     // Catch: java.lang.Throwable -> L25
        return true;
    L17:
        return false;
    }

    public static void v5(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -631223495692537329L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-631223495692537329L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent("android.intent.action.VIEW");     // Catch: java.lang.Throwable -> L7
        r0.setData(android.net.Uri.parse("https://twitter.com/#!/" + r8));     // Catch: java.lang.Throwable -> L7
        r0.setFlags(1074266112);     // Catch: java.lang.Throwable -> L7
        j6(r7, "com.twitter.android", r0);     // Catch: java.lang.Throwable -> L7
        j6(r7, r0);     // Catch: java.lang.Throwable -> L7
    }
}
