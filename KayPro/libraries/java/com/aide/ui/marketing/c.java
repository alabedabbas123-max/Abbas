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
        long r3 = 0L;
        android.content.SharedPreferences r5 = null;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        android.support.v4.app.NotificationCompat.Builder r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 18; continue $sw0; }
                    abcd.wu.j6(th, -3147066609708981785L, this, r9);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3147066609708981785L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r3 = java.lang.System.currentTimeMillis();
                        r5 = r9.getSharedPreferences("WhatsNewNotification", 0);
                        r6 = r5.getString("lastText", "");
                        r7 = com.aide.ui.marketing.a.j6(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (r6.equals(r7) == true) { $pc0 = 21; continue $sw0; }
                    try {
                        r5.edit().putLong("lastShown", r3).putString("lastText", r7).commit();
                        r0 = new android.support.v4.app.NotificationCompat.Builder(r9, "other");
                        r0.FH(this.FH);
                        r0.DW(this.Hw);
                        r0.Hw(this.v5);
                        r0.j6(this.Zo);
                        r0.j6(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 19) { $pc0 = 11; continue $sw0; }
                    try {
                        r0.j6(5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    try {
                        j6((android.app.NotificationManager) r9.getSystemService("notification"), this.VH, r0.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 11: {
                    try {
                        r0.j6(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    { $pc0 = 12; continue $sw0; }
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
