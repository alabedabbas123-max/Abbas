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
        java.lang.String r2 = com.appfour.backbone.api.Api.getAppName();     // Catch: java.lang.Throwable -> L14
        if (com.appfour.backbone.api.Api.isMainProcess() == true) goto L5;
        r2 = r2 + ":" + com.appfour.backbone.api.Api.getProcessName();     // Catch: java.lang.Throwable -> L14
    L5:
        int r3 = this.j6 + r2.hashCode();     // Catch: java.lang.Throwable -> L14
        if (android.os.Build.VERSION.SDK_INT < 26) goto L17;
        android.app.NotificationManager r4 = (android.app.NotificationManager) abcd.wu.j6().getSystemService("notification");     // Catch: java.lang.Throwable -> L14
        r4.createNotificationChannel(new android.app.NotificationChannel("backbone", "backbone developer notifications", 3));     // Catch: java.lang.Throwable -> L14
        r4.notify(r3, new android.app.Notification.Builder(abcd.wu.j6(), "backbone").setWhen(java.lang.System.currentTimeMillis()).setSmallIcon(this.DW).setContentTitle(r2).setContentText(this.FH).setStyle(new android.app.Notification.BigTextStyle().bigText(this.FH)).build());     // Catch: java.lang.Throwable -> L14
        return;
    L17:
        ((android.app.NotificationManager) abcd.wu.j6().getSystemService("notification")).notify(r3, new android.support.v4.app.NotificationCompat.Builder(abcd.wu.j6(), "backbone").j6(java.lang.System.currentTimeMillis()).Hw(this.DW).FH(r2).DW(this.FH).j6());     // Catch: java.lang.NoClassDefFoundError -> L12 java.lang.Throwable -> L14
    L21:
        return;
    L12:
        com.almlkaide.kaypro.util.Toasty.toast(abcd.wu.j6(), r2 + ": " + this.FH, 1).show();     // Catch: java.lang.Throwable -> L14
        return;
    L14:
        th = move-exception;
        abcd.yw.j6("Probe notification", th);
    }
}
