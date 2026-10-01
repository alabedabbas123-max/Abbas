package abcd;

class Runnablemw implements java.lang.Runnable {
    final java.lang.String DW;
    final long FH;
    final java.lang.String j6;

    Runnablemw(java.lang.String r1, java.lang.String r2, long r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void run() {
        java.lang.Object r0 = abcd.ow.j6();
        monitor-enter(r0);
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L69
    L79:
        abcd.sw.DW();     // Catch: java.lang.Throwable -> L29
        if (abcd.sw.j6() == false) goto L8;
        java.lang.String r1 = this.j6;     // Catch: java.lang.Throwable -> L29
    L9:
        java.io.File r2 = abcd.ow.DW();     // Catch: java.lang.Throwable -> L29
        java.io.File r3 = abcd.ow.FH();     // Catch: java.lang.Throwable -> L29
        if (r3.exists() == false) goto L12;
        long r4 = r3.lastModified();     // Catch: java.lang.Throwable -> L29
    L13:
        long r5 = java.lang.Math.max(r4, this.FH);     // Catch: java.lang.Throwable -> L29
        abcd.yw.j6("Probes", "Checking " + r1);     // Catch: java.lang.Throwable -> L29
        r2.delete();     // Catch: java.lang.Throwable -> L29
        abcd.gw.j6(r1, r2, r5);     // Catch: java.lang.Throwable -> L29
        if (r2.exists() == false) goto L31;
        java.lang.Object r6 = abcd.ow.j6();     // Catch: java.lang.Throwable -> L29
        monitor-enter(r6);     // Catch: java.lang.Throwable -> L29
        boolean r7 = true;
        if (abcd.ow.Hw() == false) goto L20;
        abcd.ow.j6(true);     // Catch: java.lang.Throwable -> L26
        r3.delete();     // Catch: java.lang.Throwable -> L26
        r2.renameTo(r3);     // Catch: java.lang.Throwable -> L26
        r7 = false;
    L20:
        monitor-exit(r6);     // Catch: java.lang.Throwable -> L26
        if (r7 == false) goto L31;
        abcd.yw.j6("Probes", "Opening new probes " + r2 + " " + r2.length());     // Catch: java.lang.Throwable -> L29
        abcd.ow.j6(abcd.ow.j6(r2), false);     // Catch: java.lang.Throwable -> L29
        r3.delete();     // Catch: java.lang.Throwable -> L29
        r2.renameTo(r3);     // Catch: java.lang.Throwable -> L29
        if (abcd.sw.j6() == false) goto L31;
        abcd.xw.j6(1278935723, 17301634, "backbone test probes loaded");     // Catch: java.lang.Throwable -> L29
        goto L31
    L26:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L29
    L31:
        java.lang.Object r8 = abcd.ow.j6();
        monitor-enter(r8);
        abcd.ow.j6().notify();     // Catch: java.lang.Throwable -> L66
        monitor-exit(r8);     // Catch: java.lang.Throwable -> L66
        java.lang.Object r9 = abcd.ow.v5();
        monitor-enter(r9);
        java.lang.Object r10 = abcd.ow.v5();     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L45
        if (abcd.sw.j6() == false) goto L40;
        long r11 = 10000;
    L41:
        r10.wait(r11);     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> L45
    L47:
        monitor-exit(r9);     // Catch: java.lang.Throwable -> L43
        java.lang.Object r12 = abcd.ow.Zo();
        monitor-enter(r12);
        java.lang.Object r13 = abcd.ow.Zo();     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        if (abcd.sw.j6() == false) goto L53;
        long r14 = 50000;
    L54:
        r13.wait(r14);     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
    L60:
        monitor-exit(r12);     // Catch: java.lang.Throwable -> L56
        goto L79
    L53:
        r14 = 240000;
    L56:
        th = move-exception;
        throw th;
    L58:
        e = move-exception;
        abcd.yw.j6("Probes", "Unexpected InterruptedException", e);     // Catch: java.lang.Throwable -> L56
        goto L60
    L40:
        r11 = 60000;
    L45:
        e = move-exception;
        abcd.yw.j6("Probes", "Unexpected InterruptedException", e);     // Catch: java.lang.Throwable -> L43
    L43:
        th = move-exception;
        throw th;
    L66:
        th = move-exception;
        throw th;
    L12:
        r4 = 0;
        goto L13
    L8:
        r1 = this.DW;     // Catch: java.lang.Throwable -> L29
    L29:
        th = move-exception;
        abcd.yw.j6("Error loading probes", th);
    L69:
        th = move-exception;
        throw th;
    }
}
