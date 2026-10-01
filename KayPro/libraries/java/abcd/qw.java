package abcd;

public class qw {
    private static volatile long DW;
    private static volatile boolean FH;
    private static volatile java.lang.String Hw;
    private static volatile java.util.UUID VH;
    private static volatile long Zo;
    private static final java.lang.Object gn = null;
    private static volatile long j6;
    private static final abcd.tw tp = null;
    private static final abcd.tw u7 = null;
    private static volatile java.util.UUID v5;

    public static class a {
        public boolean DW;
        public java.lang.String j6;

        public a(java.lang.String r1, boolean r2) {
            this.j6 = r1;
            this.DW = r2;
        }
    }

    static {
        gn = new java.lang.Object();
        u7 = new abcd.tw(Hw(), true);
        tp = new abcd.tw(Hw(), false);
    }

    public static void DW() {
        java.lang.String r0 = android.provider.Settings.Secure.getString(abcd.wu.j6().getContentResolver(), "android_id");
        java.lang.Object r1 = gn;
        monitor-enter(r1);
        Hw = r0;     // Catch: java.lang.Throwable -> L7
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private static java.io.File FH() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "sessionid.txt");
    }

    private static java.io.File Hw() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6()), "sessionid.txt.lock");
    }

    private static void VH() {
        if (gn() == false) goto L27;
        abcd.yw.j6("SessionIds", "Session ID file may be outdated.");
        tp.j6();     // Catch: java.io.IOException -> L22
        java.io.File r1 = FH();     // Catch: java.lang.Throwable -> L19
        long r2 = r1.lastModified();     // Catch: java.lang.Throwable -> L19
        if (r2 == 0) goto L18;
        DW = r2;     // Catch: java.lang.Throwable -> L19
        if (gn() == false) goto L15;
        abcd.yw.j6("SessionIds", "Session ID file is outdated - touching");     // Catch: java.lang.Throwable -> L19
        long r3 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L19
        if (r1.setLastModified(r3) == false) goto L14;
        DW = r3;     // Catch: java.lang.Throwable -> L19
        goto L15
    L14:
        throw new java.io.IOException("Could not touch session file");     // Catch: java.lang.Throwable -> L19
    L15:
        tp.DW();     // Catch: java.io.IOException -> L22
        return;
    L18:
        throw new java.io.IOException("Session file vanished");     // Catch: java.lang.Throwable -> L19
    L19:
        th = move-exception;
        tp.DW();     // Catch: java.io.IOException -> L22
        throw th;     // Catch: java.io.IOException -> L22
    L22:
        e = move-exception;
        abcd.yw.j6("Error touching session ID file", e);
        FH = true;
        v5 = null;
        return;
    }

    private static boolean Zo() {
        abcd.yw.j6("SessionIds", "Loading/updating session ID from/on disk");
        java.io.File r1 = FH();
        boolean r4 = false;
        u7.j6();     // Catch: java.io.IOException -> L75
        long r5 = r1.lastModified();     // Catch: java.lang.Throwable -> L72
        if (r5 != 0) goto L7;
    L9:
        u7.DW();     // Catch: java.lang.Throwable -> L72
        tp.j6();     // Catch: java.lang.Throwable -> L72
        long r6 = r1.lastModified();     // Catch: java.lang.Throwable -> L69
        if (r6 != 0) goto L13;
    L15:
        abcd.yw.j6("SessionIds", "Session ID file on disk does not exist or is outdated - updating");     // Catch: java.lang.Throwable -> L69
        java.io.File r7 = java.io.File.createTempFile("tmp", "txt", r1.getParentFile());     // Catch: java.lang.Throwable -> L69
        java.io.FileOutputStream r8 = new java.io.FileOutputStream(r7);     // Catch: java.lang.Throwable -> L66
        java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter(r8, "UTF-8");     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53
        java.util.UUID r0 = java.util.UUID.randomUUID();     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L38
        r9.write(r0.toString());     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L38
        r9.flush();     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L38
        r8.getFD().sync();     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L38
        r9.close();     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53
        r8.close();     // Catch: java.lang.Throwable -> L66
        if (r7.renameTo(r1) == false) goto L35;
        v5 = r0;     // Catch: java.lang.Throwable -> L66
        long r2 = r1.lastModified();     // Catch: java.lang.Throwable -> L66
        if (r2 == 0) goto L33;
        DW = r2;     // Catch: java.lang.Throwable -> L66
        r7.delete();     // Catch: java.lang.Throwable -> L30
        r4 = true;
    L27:
        tp.DW();     // Catch: java.lang.Throwable -> L72
    L28:
        u7.DW();     // Catch: java.io.IOException -> L75
    L77:
        return r4;
    L30:
        th = th;
    L70:
        tp.DW();     // Catch: java.lang.Throwable -> L72
        throw th;     // Catch: java.lang.Throwable -> L72
    L33:
        throw new java.io.IOException("Session file vanished after creation");     // Catch: java.lang.Throwable -> L66
    L35:
        throw new java.io.IOException("Could not rename temp file over session ID file");     // Catch: java.lang.Throwable -> L66
    L36:
        th = move-exception;
        java.lang.Throwable r3 = th;
        java.lang.Throwable r10 = null;
    L43:
        if (r10 != null) goto L91;
        r9.close();     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53
        throw r3;     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53
    L91:
        r9.close();     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L51
        throw r3;     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53
    L46:
        th = move-exception;
        r10.addSuppressed(th);     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53
        throw r3;     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L53
    L38:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L41
    L41:
        th = move-exception;
        r10 = th;
        r3 = th;
    L51:
        th = move-exception;
        java.lang.Throwable r11 = th;
        java.lang.Throwable r12 = null;
    L58:
        if (r12 != null) goto L88;
        r8.close();     // Catch: java.lang.Throwable -> L66
        throw r11;     // Catch: java.lang.Throwable -> L66
    L88:
        r8.close();     // Catch: java.lang.Throwable -> L61 java.lang.Throwable -> L66
    L98:
        throw r11;     // Catch: java.lang.Throwable -> L66
    L61:
        th = move-exception;
        r12.addSuppressed(th);     // Catch: java.lang.Throwable -> L66
        throw r11;     // Catch: java.lang.Throwable -> L66
    L53:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L56
    L56:
        th = move-exception;
        r12 = th;
        r11 = th;
    L66:
        th = move-exception;
        r7.delete();     // Catch: java.lang.Throwable -> L69
        throw th;     // Catch: java.lang.Throwable -> L69
    L13:
        if (java.lang.System.currentTimeMillis() >= (900000 + r6)) goto L15;
        abcd.yw.j6("SessionIds", "Session ID file on disk seems to be valid, loading from disk (2)");     // Catch: java.lang.Throwable -> L69
        u7();     // Catch: java.lang.Throwable -> L69
        DW = r6;     // Catch: java.lang.Throwable -> L69
    L69:
        th = th;
        goto L70
    L7:
        if (java.lang.System.currentTimeMillis() >= (r5 + 900000)) goto L9;
        abcd.yw.j6("SessionIds", "Session ID file on disk seems to be valid, loading from disk");     // Catch: java.lang.Throwable -> L72
        u7();     // Catch: java.lang.Throwable -> L72
        DW = r5;     // Catch: java.lang.Throwable -> L72
    L72:
        th = move-exception;
        u7.DW();     // Catch: java.io.IOException -> L75
        throw th;     // Catch: java.io.IOException -> L75
    L75:
        e = move-exception;
        abcd.yw.j6("Error reading, creating or updating session ID file", e);
        FH = true;
        v5 = null;
        goto L77
    }

    private static boolean gn() {
        if (DW >= (java.lang.System.currentTimeMillis() - 60000)) goto L5;
        return true;
    L5:
        return false;
    }

    public static abcd.qw.a j6(long r6, boolean r8) {
        if (java.lang.Math.abs(r6 - java.lang.System.currentTimeMillis()) > 900000) goto L5;
        abcd.qw.a r7 = j6(r8);
        if (r7 == null) goto L17;
        return r7;
    L17:
        return new abcd.qw.a(abcd.Aw.j6(abcd.Aw.j6), false);
    L5:
        if (java.lang.Math.abs(Zo - r6) <= 900000) goto L7;
    L11:
        Zo = r6;
        VH = java.util.UUID.randomUUID();
        return new abcd.qw.a(abcd.Aw.j6(VH), true);
    L7:
        if (VH == null) goto L11;
        return new abcd.qw.a(abcd.Aw.j6(VH), false);
    }

    private static abcd.qw.a j6(boolean r3) {
        if (FH == false) goto L6;
        return null;
    L6:
        boolean r0 = false;
        if (v5() == true) goto L16;
        java.lang.Object r1 = gn;
        monitor-enter(r1);
        r0 = Zo();     // Catch: java.lang.Throwable -> L13
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L13
        j6 = java.lang.System.currentTimeMillis();
    L18:
        VH();
        return new abcd.qw.a(abcd.Aw.j6(v5), r0);
    L13:
        th = move-exception;
        throw th;
    L16:
        if (r3 == false) goto L18;
        j6 = java.lang.System.currentTimeMillis();
        goto L18
    }

    public static java.lang.String j6() {
        return Hw;
    }

    private static void u7() {
        java.io.FileInputStream r0 = new java.io.FileInputStream(FH());
        java.lang.Throwable r1 = null;
        java.io.BufferedReader r2 = new java.io.BufferedReader(new java.io.InputStreamReader(r0, "UTF-8"));     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L27
        v5 = java.util.UUID.fromString(r2.readLine());     // Catch: java.lang.Throwable -> L8 java.lang.Throwable -> L10 java.lang.IllegalArgumentException -> L12
        r2.close();     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L27
        r0.close();
        return;
    L12:
        e = move-exception;
        throw new java.io.IOException(e);     // Catch: java.lang.Throwable -> L8 java.lang.Throwable -> L10
    L10:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L16
    L16:
        th = move-exception;
        java.lang.Throwable r4 = th;
        th = th;
    L18:
        if (r4 != null) goto L38;
        r2.close();     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L27
        throw th;     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L27
    L38:
        r2.close();     // Catch: java.lang.Throwable -> L21 java.lang.Throwable -> L25
        throw th;     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L27
    L21:
        th = move-exception;
        r4.addSuppressed(th);     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L27
        throw th;     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L27
    L8:
        th = th;
        r4 = null;
    L25:
        th = move-exception;
        if (0 != 0) goto L40;
        r0.close();
    L35:
        throw th;
    L40:
        r0.close();     // Catch: java.lang.Throwable -> L32
    L32:
        th = move-exception;
        r1.addSuppressed(th);
    L27:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L25
    }

    private static boolean v5() {
        if (java.lang.System.currentTimeMillis() >= (j6 + 900000)) goto L5;
        return true;
    L5:
        return false;
    }
}
