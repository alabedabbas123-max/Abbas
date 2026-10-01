package abcd;

public class uw {
    private static final java.lang.Object j6 = null;

    static {
        j6 = new java.lang.Object();
    }

    private static java.io.File DW(android.content.Context r2) {
        if (android.os.Build.VERSION.SDK_INT < 21) goto L7;
        return new java.io.File(r2.getNoBackupFilesDir(), "backbone");
    L7:
        return new java.io.File(r2.getApplicationInfo().dataDir, "no_backup/backbone");
    }

    public static java.io.File DW(android.content.Context r4, java.lang.String r5) {
        java.lang.String[] r6 = new java.net.URL(r5).getPath().split("/");     // Catch: java.net.MalformedURLException -> L10
        if (r6.length <= 3) goto L9;
        if (r6[3].length() <= 0) goto L9;
        return new java.io.File(j6(r4, "gone"), r6[3]);
    L9:
        return null;
    }

    public static java.io.File j6(android.content.Context r0) {
        return j6(DW(r0));
    }

    public static java.io.File j6(android.content.Context r1, java.lang.String r2) {
        return j6(new java.io.File(DW(r1), r2));
    }

    private static java.io.File j6(java.io.File r2) {
        if (r2.exists() == true) goto L22;
        java.lang.Object r0 = j6;
        monitor-enter(r0);
    L19:
        th = move-exception;
        throw th;
    L7:
        if (r2.exists() == false) goto L9;
    L17:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        goto L22
    L9:
        if (r2.mkdirs() == true) goto L17;
        if (r2.exists() == false) goto L15;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        return r2;
    L15:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        return null;
    L22:
        return r2;
    }
}
