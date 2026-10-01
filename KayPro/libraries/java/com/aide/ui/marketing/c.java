package com.aide.ui.marketing;

@abcd.Interfacexu
class c implements com.aide.ui.Interfaceba {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final java.lang.String Hw;
    final int VH;
    final android.app.PendingIntent Zo;
    final int v5;

    static {
        abcd.wu.j6(com.aide.ui.marketing.c.class, 2573400133095991248L, -2757814003230063351L);
    }

    c(java.lang.String r1, java.lang.String r2, int r3, android.app.PendingIntent r4, int r5) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
        this.VH = r5;
    }

    private static void j6(android.app.NotificationManager r0, int r1, android.app.Notification r2) {
        r0.notify(r1, r2);
        abcd.wu.j6(r0, r1, r2);
    }

    @Override
    @abcd.Interfacesu(method = 3186090975791496123L)
    public void j6(android.content.Context r9) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -3147066609708981785L, this, r9);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3147066609708981785L, this, r9);     // Catch: java.lang.Throwable -> L14
    L6:
        long r3 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L14
        android.content.SharedPreferences r5 = r9.getSharedPreferences("WhatsNewNotification", 0);     // Catch: java.lang.Throwable -> L14
        java.lang.String r6 = r5.getString("lastText", "");     // Catch: java.lang.Throwable -> L14
        java.lang.String r7 = com.aide.ui.marketing.a.j6(r9);     // Catch: java.lang.Throwable -> L14
        if (r6.equals(r7) == true) goto L21;
        r5.edit().putLong("lastShown", r3).putString("lastText", r7).commit();     // Catch: java.lang.Throwable -> L14
        android.support.v4.app.NotificationCompat.Builder r0 = new android.support.v4.app.NotificationCompat.Builder(r9, "other");     // Catch: java.lang.Throwable -> L14
        r0.FH(this.FH);     // Catch: java.lang.Throwable -> L14
        r0.DW(this.Hw);     // Catch: java.lang.Throwable -> L14
        r0.Hw(this.v5);     // Catch: java.lang.Throwable -> L14
        r0.j6(this.Zo);     // Catch: java.lang.Throwable -> L14
        r0.j6(true);     // Catch: java.lang.Throwable -> L14
        if (android.os.Build.VERSION.SDK_INT >= 19) goto L11;
        r0.j6(5);     // Catch: java.lang.Throwable -> L14
    L12:
        j6((android.app.NotificationManager) r9.getSystemService("notification"), this.VH, r0.j6());     // Catch: java.lang.Throwable -> L14
        return;
    L11:
        r0.j6(-1);     // Catch: java.lang.Throwable -> L14
        goto L12
    }
}
