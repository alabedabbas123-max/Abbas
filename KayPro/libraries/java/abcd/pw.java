package abcd;

public class pw {
    public static int DW = 1;
    public static int FH = 2;
    private static final java.lang.Object Hw = null;
    private static long Zo;
    public static int j6;
    private static org.json.JSONObject v5;

    static {
        Hw = new java.lang.Object();
        v5 = new org.json.JSONObject();
        Zo = -1;
    }

    public static int DW(abcd.lw r2, boolean r3) {
        return j6(j6(r2), DW(j6(r2)), FH(), r3);
    }

    private static java.io.File DW() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "appstate.json");
    }

    private static java.lang.String DW(java.lang.String r2) {
        return "has_occurred_for_app_version_" + r2;
    }

    public static int FH(abcd.lw r2, boolean r3) {
        return j6(j6(r2), FH(j6(r2)), Hw(), r3);
    }

    private static java.lang.String FH() {
        return com.appfour.backbone.api.Api.getAppVersionCode() + "";
    }

    private static java.lang.String FH(java.lang.String r2) {
        return "has_occurred_for_day_" + r2;
    }

    public static int Hw(abcd.lw r2, boolean r3) {
        return j6(j6(r2), Hw(j6(r2)), Zo(), r3);
    }

    private static java.lang.String Hw() {
        return "" + (com.appfour.backbone.api.Api.getTimeSinceInstall() / 86400000);
    }

    private static java.lang.String Hw(java.lang.String r2) {
        return "has_occurred_for_month_" + r2;
    }

    private static java.lang.String VH() {
        return "" + (com.appfour.backbone.api.Api.getTimeSinceInstall() / 604800000);
    }

    private static java.lang.String Zo() {
        return "" + (com.appfour.backbone.api.Api.getTimeSinceInstall() / (-1616567296));
    }

    private static void Zo(java.lang.String r2) {
        j6(j6(r2), j6());
        j6(DW(r2), FH());
        j6(Hw(r2), Zo());
        j6(v5(r2), VH());
        j6(FH(r2), Hw());
    }

    private static void gn() {
        long r0 = DW().lastModified();
        java.io.FileReader r2 = new java.io.FileReader(DW());
        java.lang.Throwable r3 = null;
        java.io.BufferedReader r4 = new java.io.BufferedReader(r2);     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
        java.lang.StringBuilder r5 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
        char[] r6 = new char[65536];     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
    L5:
        int r7 = r4.read(r6, 0, r6.length);     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
        if (r7 < 0) goto L8;
        r5.append(r6, 0, r7);     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
        goto L5
    L8:
        v5 = new org.json.JSONObject(r5.toString());     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
        if (r0 == 0) goto L11;
        Zo = r0;     // Catch: java.lang.Throwable -> L14 java.lang.Throwable -> L16
    L11:
        r4.close();     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
        r2.close();
        return;
    L14:
        java.lang.Throwable th = th;
        java.lang.Throwable r1 = null;
    L20:
        if (r1 != null) goto L42;
        r4.close();     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
        throw th;     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
    L42:
        r4.close();     // Catch: java.lang.Throwable -> L23 java.lang.Throwable -> L27
        throw th;     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
    L23:
        th = move-exception;
        r1.addSuppressed(th);     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
        throw th;     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
    L16:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L18
    L18:
        th = move-exception;
        r1 = th;
        th = th;
    L29:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L27
    L27:
        th = move-exception;
        if (0 != 0) goto L46;
        r2.close();
    L39:
        throw th;
    L46:
        r2.close();     // Catch: java.lang.Throwable -> L35
    L35:
        th = move-exception;
        r3.addSuppressed(th);
        goto L39
    }

    public static int j6(abcd.lw r2, boolean r3) {
        return j6(j6(r2), j6(j6(r2)), j6(), r3);
    }

    private static int j6(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        long r0 = java.lang.System.currentTimeMillis();
        java.lang.Object r2 = Hw;
        monitor-enter(r2);
        boolean r5 = true;
        abcd.tw r3 = new abcd.tw(v5(), true);     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        r3.j6();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
    L50:
        th = move-exception;
        r3.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        throw th;     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
    L6:
        if (DW().exists() == true) goto L8;
        if (r15 == true) goto L31;
        int r16 = j6;     // Catch: java.lang.Throwable -> L50
        r3.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L53
        return r16;
    L31:
        r3.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        abcd.tw r17 = new abcd.tw(v5(), false);     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        r17.j6();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
    L47:
        th = move-exception;
        r17.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        throw th;     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
    L33:
        if (DW().exists() == true) goto L35;
    L43:
        Zo(r12);     // Catch: java.lang.Throwable -> L47
        u7();     // Catch: java.lang.Throwable -> L47
        abcd.yw.j6("App state", "Saving appstate elapsed " + (java.lang.System.currentTimeMillis() - r0) + "ms.");     // Catch: java.lang.Throwable -> L47
        int r18 = FH;     // Catch: java.lang.Throwable -> L47
        r17.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L53
        return r18;
    L35:
        if (Zo == DW().lastModified()) goto L38;
        gn();     // Catch: java.lang.Throwable -> L47
    L38:
        if (r14.equals(v5.optString(r13, null)) == false) goto L43;
        int r19 = DW;     // Catch: java.lang.Throwable -> L47
        r17.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L53
        return r19;
    L8:
        if (Zo == DW().lastModified()) goto L10;
        gn();     // Catch: java.lang.Throwable -> L50
    L12:
        if (r14.equals(v5.optString(r13, null)) == false) goto L19;
        if (r5 == false) goto L15;
        abcd.yw.j6("App state", "Reading appstate value elapsed " + (java.lang.System.currentTimeMillis() - r0) + "ms.");     // Catch: java.lang.Throwable -> L50
    L15:
        int r110 = DW;     // Catch: java.lang.Throwable -> L50
        r3.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L53
        return r110;
    L19:
        if (r15 == true) goto L31;
        if (r5 == false) goto L22;
        abcd.yw.j6("App state", "Reading appstate value elapsed " + (java.lang.System.currentTimeMillis() - r0) + "ms.");     // Catch: java.lang.Throwable -> L50
    L22:
        int r111 = j6;     // Catch: java.lang.Throwable -> L50
        r3.DW();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55 java.io.IOException -> L57
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L53
        return r111;
    L10:
        r5 = false;
    L53:
        th = move-exception;
        throw th;
    L55:
        e = move-exception;
        abcd.yw.j6("I/O error accessing appstate", e);     // Catch: java.lang.Throwable -> L53
        int r112 = j6;     // Catch: java.lang.Throwable -> L53
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L53
        return r112;
    }

    private static java.lang.String j6() {
        return "true";
    }

    private static java.lang.String j6(abcd.lw r2) {
        return "event_" + r2.DW();
    }

    private static java.lang.String j6(java.lang.String r2) {
        return "has_occurred_" + r2;
    }

    private static void j6(java.lang.String r1, java.lang.String r2) {
        v5.put(r1, r2);
    }

    private static void u7() {
        long r0 = DW().lastModified();
        java.io.File r2 = java.io.File.createTempFile("tmp", "json", DW().getParentFile());
        java.io.FileOutputStream r3 = new java.io.FileOutputStream(r2);     // Catch: java.lang.Throwable -> L51
        java.lang.Throwable r4 = null;
        java.io.BufferedWriter r5 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(r3));     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        r5.write(v5.toString(4));     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        r5.flush();     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        r3.getFD().sync();     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        r5.close();     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        r3.close();     // Catch: java.lang.Throwable -> L51
        if (r2.renameTo(DW()) == false) goto L25;
        long r6 = DW().lastModified();     // Catch: java.lang.Throwable -> L51
        if (r6 == 0) goto L23;
        if (r6 != r0) goto L19;
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L51
        if (DW().setLastModified(r6) == true) goto L19;
        throw new java.io.IOException("Could not bump app state last modified.");     // Catch: java.lang.Throwable -> L51
    L19:
        Zo = r6;     // Catch: java.lang.Throwable -> L51
        r2.delete();
        return;
    L23:
        throw new java.io.IOException("App state file vanished after creation.");     // Catch: java.lang.Throwable -> L51
    L25:
        throw new java.io.IOException("Could not rename temp file to app state file.");     // Catch: java.lang.Throwable -> L51
    L28:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L30
    L30:
        th = move-exception;
        java.lang.Throwable r1 = th;
        th = th;
    L32:
        if (r1 != null) goto L58;
        r5.close();     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        throw th;     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
    L58:
        r5.close();     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
        throw th;     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
    L35:
        th = move-exception;
        r1.addSuppressed(th);     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        throw th;     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
    L26:
        th = th;
        r1 = null;
    L39:
        th = move-exception;
        if (0 != 0) goto L54;
        r3.close();     // Catch: java.lang.Throwable -> L51
    L50:
        throw th;     // Catch: java.lang.Throwable -> L51
    L54:
        r3.close();     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L51
    L47:
        th = move-exception;
        r4.addSuppressed(th);     // Catch: java.lang.Throwable -> L51
    L41:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L39
    L51:
        th = move-exception;
        r2.delete();
        throw th;
    }

    public static int v5(abcd.lw r2, boolean r3) {
        return j6(j6(r2), v5(j6(r2)), VH(), r3);
    }

    private static java.io.File v5() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "appstate.json.lock");
    }

    private static java.lang.String v5(java.lang.String r2) {
        return "has_occurred_for_week_" + r2;
    }
}
