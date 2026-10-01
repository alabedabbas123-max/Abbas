package abcd;

public class gw {
    public static void j6(java.lang.String r8, java.io.File r9, long r10) {
        if (abcd.vw.DW() == false) goto L73;
        long r1 = java.lang.System.currentTimeMillis();
        java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) new java.net.URL(r8).openConnection();     // Catch: java.io.IOException -> L52
        r11.setIfModifiedSince(r10);     // Catch: java.io.IOException -> L52
        java.io.InputStream r12 = r11.getInputStream();     // Catch: java.io.IOException -> L52
        java.lang.Throwable r13 = null;
        java.io.FileOutputStream r3 = new java.io.FileOutputStream(r9);     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        byte[] r4 = new byte[655360];     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
    L11:
        int r5 = r12.read(r4);     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
        if (r5 == (-1)) goto L15;
        r3.write(r4, 0, r5);     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L28
    L15:
        r3.close();     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        if (r12 == null) goto L18;
        r12.close();     // Catch: java.io.IOException -> L52
    L18:
        int r14 = r11.getResponseCode();     // Catch: java.io.IOException -> L52
        if (r14 != 200) goto L22;
        r9.setLastModified(r11.getLastModified());     // Catch: java.io.IOException -> L52
        abcd.yw.j6("Probes", "Probes download took " + (java.lang.System.currentTimeMillis() - r1) + "ms");     // Catch: java.io.IOException -> L52
        return;
    L22:
        if (r14 != 304) goto L24;
        r9.delete();     // Catch: java.io.IOException -> L52
        return;
    L24:
        r9.delete();     // Catch: java.io.IOException -> L52
        return;
    L26:
        java.lang.Throwable th = th;
        java.lang.Throwable r15 = null;
    L32:
        if (r15 != null) goto L62;
        r3.close();     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        throw th;     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
    L62:
        r3.close();     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
        throw th;     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
    L35:
        th = move-exception;
        r15.addSuppressed(th);     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
        throw th;     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L41
    L28:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L30
    L30:
        th = move-exception;
        r15 = th;
        th = th;
    L41:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L39
    L39:
        th = move-exception;
        if (r12 == null) goto L51;
        if (0 != 0) goto L56;
        r12.close();     // Catch: java.io.IOException -> L52
        goto L51
    L56:
        r12.close();     // Catch: java.lang.Throwable -> L48
    L48:
        th = move-exception;
        r13.addSuppressed(th);     // Catch: java.io.IOException -> L52
    L51:
        throw th;     // Catch: java.io.IOException -> L52
    L52:
        e = move-exception;
        abcd.yw.j6("Probes", "Probes download error", e);
        return;
    L77:
        return;
    }
}
