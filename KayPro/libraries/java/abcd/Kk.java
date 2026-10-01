package abcd;

@abcd.Interfacexu
public class Kk {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Kk.class, -495786187121037287L, -495786187121037287L);
    }

    public Kk() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1322339339664368060L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1322339339664368060L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = -2207084599969325960L)
    private void j6(android.content.Context r10) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1911362321980657488L, this, r10);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1911362321980657488L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r10, "engine", "Code Analysis Notifications", "Notifications showing error checking progress and statistics.", 2);     // Catch: java.lang.Throwable -> L8
        j6(r10, "other", "Other Notifications", "All other notifications.", 3);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 1445762437662561304L)
    private void j6(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1405744868706864096L, this, r11, r12, r13, r14, new java.lang.Integer(r15));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1405744868706864096L, this, r11, r12, r13, r14, new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L10
    L6:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L8;
        return;
    L8:
        android.app.NotificationManager r0 = (android.app.NotificationManager) r11.getSystemService("notification");     // Catch: java.lang.Throwable -> L10
        android.app.NotificationChannel r1 = new android.app.NotificationChannel(r12, r13, r15);     // Catch: java.lang.Throwable -> L10
        r1.setDescription(r14);     // Catch: java.lang.Throwable -> L10
        r0.createNotificationChannel(r1);     // Catch: java.lang.Throwable -> L10
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2465520606808208779L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2465520606808208779L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(com.aide.ui.U.Zo());     // Catch: java.lang.Throwable -> L8
    }
}
