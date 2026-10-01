package abcd;

class Runnabledw implements java.lang.Runnable {
    private java.util.Random DW;
    final java.lang.String FH;
    final abcd.fw Hw;
    private int j6;

    Runnabledw(abcd.fw r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
        this.j6 = 4000;
        this.DW = new java.util.Random();
    }

    private void j6() {
        abcd.yw.j6("Networking", "Sleeping for " + (this.j6 / 1000) + " seconds.");
        java.lang.Object r0 = abcd.fw.Hw(this.Hw);     // Catch: java.lang.InterruptedException -> L11
        monitor-enter(r0);     // Catch: java.lang.InterruptedException -> L11
        abcd.fw.Hw(this.Hw).wait(this.j6 + this.DW.nextInt(1000));     // Catch: java.lang.Throwable -> L8
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L8
    L13:
        int r1 = this.j6;
        if (r1 >= 128000) goto L20;
        this.j6 = r1 * 2;
        return;
    L20:
        return;
    L8:
        th = move-exception;
        throw th;     // Catch: java.lang.InterruptedException -> L11
    L11:
        e = move-exception;
        abcd.yw.j6("Networking", "Unexpected InterruptedException", e);
        goto L13
    }

    @Override
    public void run() {
        abcd.yw.j6("Networking", "Thread started");
        java.lang.String r3 = null;
    L128:
        java.io.File[] r0 = abcd.fw.tp(this.Hw);     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        if (r0 != null) goto L6;
    L120:
        abcd.fw.DW(this.Hw).lock();     // Catch: java.lang.Throwable -> L103
        abcd.fw.EQ(this.Hw).signalAll();     // Catch: java.lang.Throwable -> L103
        abcd.fw.DW(this.Hw).unlock();     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        java.lang.Object r4 = abcd.fw.u7(this.Hw);     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        monitor-enter(r4);     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        abcd.yw.j6("Networking", "No files ready for transmission - sleeping...");     // Catch: java.lang.Throwable -> L100
        abcd.fw.u7(this.Hw).wait();     // Catch: java.lang.Throwable -> L100
        monitor-exit(r4);     // Catch: java.lang.Throwable -> L100
    L100:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
    L103:
        th = move-exception;
        abcd.fw.DW(this.Hw).unlock();     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        throw th;     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
    L6:
        if (r0.length == 0) goto L120;
        abcd.yw.j6("Networking", "Found " + r0.length + " files ready for transmission.");     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
    L10:
        if (abcd.vw.DW() == true) goto L12;
        abcd.yw.j6("Networking", "No internet");     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        j6();     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        goto L10
    L12:
        int r5 = 0;
        abcd.tw r6 = new abcd.tw(abcd.fw.FH(this.Hw), false);     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        r6.j6();     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        java.io.File[] r1 = abcd.fw.tp(this.Hw);     // Catch: java.lang.Throwable -> L91
        if (r1.length == 0) goto L15;
        abcd.yw.j6("Networking", "Starting transmission of " + r1.length + " network files.");     // Catch: java.lang.Throwable -> L91
        r3 = abcd.Aw.j6(java.util.UUID.randomUUID());     // Catch: java.lang.Throwable -> L91
        javax.net.ssl.HttpsURLConnection r7 = (javax.net.ssl.HttpsURLConnection) new java.net.URL(this.FH + "?clientTime=" + java.lang.System.currentTimeMillis() + "&formatVersion=2&deviceId=" + abcd.qw.j6() + "&reportId=" + r3 + "&currentSessionId=" + abcd.qw.j6(java.lang.System.currentTimeMillis(), false).j6).openConnection();     // Catch: java.lang.Throwable -> L91
        r7.setDoOutput(true);     // Catch: java.lang.Throwable -> L91
        r7.setConnectTimeout(10000);     // Catch: java.lang.Throwable -> L91
        r7.setReadTimeout(60000);     // Catch: java.lang.Throwable -> L91
        r7.setRequestMethod("POST");     // Catch: java.lang.Throwable -> L91
        r7.setRequestProperty("Content-Type", "application/stream+json");     // Catch: java.lang.Throwable -> L91
        byte[] r8 = new byte[65536];     // Catch: java.lang.Throwable -> L91
        java.io.OutputStream r9 = r7.getOutputStream();     // Catch: java.lang.Throwable -> L91
        int r10 = 0;
    L114:
        if (r10 >= r1.length) goto L46;
        if (r1[r10].length() != 0) goto L24;
        abcd.yw.j6("Empty file encountered sending log files", new java.io.IOException("Empty file encountered"));     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L77
    L24:
        java.io.FileInputStream r11 = new java.io.FileInputStream(r1[r10]);     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L77
    L129:
        int r12 = r11.read(r8, 0, r8.length);     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
        if (r12 < 0) goto L29;
        r9.write(r8, 0, r12);     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L33
    L29:
        r11.close();     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L77
        r10 = r10 + 1;
    L31:
        th = move-exception;
        java.lang.Throwable r13 = th;
        java.lang.Throwable r14 = null;
    L38:
        if (r14 != null) goto L112;
        r11.close();     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L77
    L45:
        throw r13;     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L77
    L112:
        r11.close();     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L75
    L41:
        th = move-exception;
        r14.addSuppressed(th);     // Catch: java.lang.Throwable -> L75 java.lang.Throwable -> L77
    L33:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L36
    L36:
        th = move-exception;
        r14 = th;
        r13 = th;
        goto L38
    L46:
        if (r9 == null) goto L48;
        r9.close();     // Catch: java.lang.Throwable -> L91
    L48:
        int r15 = r7.getResponseCode();     // Catch: java.lang.Throwable -> L91
        if (r15 == 200) goto L66;
        if (r15 == 202) goto L66;
        if (r15 != 410) goto L65;
        abcd.yw.j6("Networking", "HTTP GONE encountered: exiting thread.");     // Catch: java.lang.Throwable -> L91
        abcd.fw.j6(this.Hw).set(true);     // Catch: java.lang.Throwable -> L91
        java.io.File r2 = abcd.uw.DW(abcd.wu.j6(), this.FH);     // Catch: java.lang.Throwable -> L91
        if (r2 == null) goto L61;
        new java.io.FileOutputStream(r2).close();     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L91
    L62:
        r6.DW();     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        return;
    L59:
        e = move-exception;
        abcd.yw.j6("Could not write gone file", e);     // Catch: java.lang.Throwable -> L91
        goto L62
    L61:
        abcd.yw.j6("Could not calculate gone file path", new java.lang.Exception());     // Catch: java.lang.Throwable -> L91
        goto L62
    L65:
        throw new java.io.IOException("Reporting error: Received non-OK status code: " + r15);     // Catch: java.lang.Throwable -> L91
    L66:
        abcd.yw.j6("Networking", "Reported " + r1.length + " event files");     // Catch: java.lang.Throwable -> L91
        int r16 = r1.length;     // Catch: java.lang.Throwable -> L91
    L67:
        if (r5 >= r16) goto L73;
        java.io.File r17 = r1[r5];     // Catch: java.lang.Throwable -> L91
        if (r17.delete() == false) goto L72;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L91
        goto L67
    L72:
        throw new java.io.IOException("Could not delete network file: " + r17.getName());     // Catch: java.lang.Throwable -> L91
    L73:
        this.j6 = 4000;     // Catch: java.lang.Throwable -> L91
    L77:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L80
    L80:
        th = move-exception;
        java.lang.Throwable r18 = th;
        java.lang.Throwable r19 = th;
    L82:
        if (r9 == null) goto L159;
        if (r18 == null) goto L89;
        r9.close();     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L91
    L160:
        throw r19;     // Catch: java.lang.Throwable -> L91
    L86:
        th = move-exception;
        r18.addSuppressed(th);     // Catch: java.lang.Throwable -> L91
        throw r19;     // Catch: java.lang.Throwable -> L91
    L89:
        r9.close();     // Catch: java.lang.Throwable -> L91
        throw r19;     // Catch: java.lang.Throwable -> L91
    L159:
        throw r19;     // Catch: java.lang.Throwable -> L91
    L75:
        th = move-exception;
        r19 = th;
        r18 = null;
    L15:
        r6.DW();     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
    L91:
        th = move-exception;
        r6.DW();     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
        throw th;     // Catch: java.lang.Throwable -> L106 java.io.IOException -> L108
    L108:
        e = move-exception;
        abcd.yw.j6("I/O Error for report ID " + r3, e);
        abcd.yw.j6("Networking", "Reporting I/O error", e);
        j6();
    L106:
        th = move-exception;
        abcd.yw.j6("Reporting error", th);
        j6();
        goto L128
    }
}
