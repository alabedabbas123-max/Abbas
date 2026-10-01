package abcd;

class Runnableww implements java.lang.Runnable {
    final int DW;
    final java.lang.String FH;
    final int j6;

    Runnableww(int r1, int r2, java.lang.String r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void run() {
        java.lang.String r2 = null;
        int r3 = 0;
        android.app.NotificationManager r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r2 = com.appfour.backbone.api.Api.getAppName();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (com.appfour.backbone.api.Api.isMainProcess() == true) { $pc0 = 5; continue $sw0; }
                    try {
                        r2 = r2 + ":" + com.appfour.backbone.api.Api.getProcessName();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r3 = this.j6 + r2.hashCode();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (android.os.Build.VERSION.SDK_INT < 26) { $pc0 = 17; continue $sw0; }
                    try {
                        r4 = (android.app.NotificationManager) abcd.wu.j6().getSystemService("notification");
                        r4.createNotificationChannel(new android.app.NotificationChannel("backbone", "backbone developer notifications", 3));
                        r4.notify(r3, new android.app.Notification.Builder(abcd.wu.j6(), "backbone").setWhen(java.lang.System.currentTimeMillis()).setSmallIcon(this.DW).setContentTitle(r2).setContentText(this.FH).setStyle(new android.app.Notification.BigTextStyle().bigText(this.FH)).build());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 17: {
                    try {
                        ((android.app.NotificationManager) abcd.wu.j6().getSystemService("notification")).notify(r3, new android.support.v4.app.NotificationCompat.Builder(abcd.wu.j6(), "backbone").j6(java.lang.System.currentTimeMillis()).Hw(this.DW).FH(r2).DW(this.FH).j6());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoClassDefFoundError) { $pc0 = 12; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    return;
                }
                case 12: {
                    try {
                        com.almlkaide.kaypro.util.Toasty.toast(abcd.wu.j6(), r2 + ": " + this.FH, 1).show();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 14: {
                    th = $ex0;
                    abcd.yw.j6("Probe notification", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
