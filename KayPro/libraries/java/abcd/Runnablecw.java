package abcd;

class Runnablecw implements java.lang.Runnable {
    final abcd.fw j6;

    Runnablecw(abcd.fw r1) {
        this.j6 = r1;
    }

    @Override
    public void run() {
        abcd.yw.j6("Cache", "Writing thread started");
        java.util.ArrayList r2 = new java.util.ArrayList();
    L4:
        if (abcd.fw.j6(this.j6).get() == true) goto L5;
        abcd.fw.DW(this.j6).lock();     // Catch: java.lang.Throwable -> L81
        if (r2.isEmpty() == false) goto L105;
        abcd.fw.v5(this.j6).signalAll();     // Catch: java.lang.Throwable -> L81
    L105:
        abcd.fw.DW(this.j6).unlock();     // Catch: java.lang.Throwable -> L84
        abcd.yw.j6("Cache", "Waiting for next event.");     // Catch: java.lang.Throwable -> L84
        abcd._v r0 = (abcd._v) abcd.fw.Zo(this.j6).take();     // Catch: java.lang.Throwable -> L84
        if (r0 == abcd.fw.j6()) goto L4;
        r2.add(r0);     // Catch: java.lang.Throwable -> L84
        java.io.File r1 = abcd.fw.VH(this.j6);     // Catch: java.lang.Throwable -> L84
        java.io.FileOutputStream r5 = new java.io.FileOutputStream(r1);     // Catch: java.lang.Throwable -> L84
        java.lang.Throwable r6 = null;
        java.io.BufferedWriter r7 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(r5));     // Catch: java.lang.Throwable -> L68 java.lang.Throwable -> L70
        long r8 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        int r11 = 0;
    L19:
        if (r2.size() == r11) goto L21;
    L27:
        abcd.fw.Zo(this.j6).drainTo(r2);     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        boolean r12 = false;
    L29:
        if (r11 >= r2.size()) goto L35;
        abcd._v r13 = (abcd._v) r2.get(r11);     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        if (r13 == abcd.fw.j6()) goto L33;
        r7.write(r13.j6().toString());     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        r7.write(10);     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
    L34:
        r11 = r11 + 1;     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        goto L29
    L33:
        r12 = true;
        goto L34
    L35:
        r11 = r2.size();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        if (r12 == false) goto L19;
        abcd.yw.j6("Cache", "Received flush. Finishing up file.");     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
    L38:
        r7.flush();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        r5.getFD().sync();     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        r7.close();     // Catch: java.lang.Throwable -> L68 java.lang.Throwable -> L70
        r5.close();     // Catch: java.lang.Throwable -> L84
        if (r1.renameTo(new java.io.File(abcd.fw.gn(this.j6), r1.getName())) == false) goto L52;
        java.lang.Object r9 = abcd.fw.u7(this.j6);     // Catch: java.lang.Throwable -> L84
        monitor-enter(r9);     // Catch: java.lang.Throwable -> L84
        abcd.fw.u7(this.j6).notify();     // Catch: java.lang.Throwable -> L48
        monitor-exit(r9);     // Catch: java.lang.Throwable -> L48
    L46:
        abcd.yw.j6("Cache", "Staged file with " + r2.size() + " events for network I/O: " + r1.getName());     // Catch: java.lang.Throwable -> L84
        r2.clear();     // Catch: java.lang.Throwable -> L84
    L48:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L84
    L52:
        throw new java.io.IOException("Could not move file to outgoing directory");     // Catch: java.lang.Throwable -> L84
    L21:
        if ((java.lang.System.currentTimeMillis() - r8) >= 10000) goto L22;
        abcd._v r14 = (abcd._v) abcd.fw.Zo(this.j6).poll(1000, java.util.concurrent.TimeUnit.MILLISECONDS);     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        if (r14 == null) goto L25;
        r2.add(r14);     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        goto L27
    L25:
        abcd.yw.j6("Cache", "No events for 1000ms. Finishing up file.");     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
        goto L38
    L22:
        abcd.yw.j6("Cache", "Collected events for 10000ms. Finishing up file.");     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L55
    L55:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L58
    L58:
        th = move-exception;
        java.lang.Throwable r10 = th;
        java.lang.Throwable r15 = th;
    L60:
        if (r10 != null) goto L98;
        r7.close();     // Catch: java.lang.Throwable -> L68 java.lang.Throwable -> L70
    L67:
        throw r15;     // Catch: java.lang.Throwable -> L68 java.lang.Throwable -> L70
    L98:
        r7.close();     // Catch: java.lang.Throwable -> L63 java.lang.Throwable -> L68
    L63:
        th = move-exception;
        r10.addSuppressed(th);     // Catch: java.lang.Throwable -> L68 java.lang.Throwable -> L70
    L53:
        th = move-exception;
        r15 = th;
        r10 = null;
    L70:
        th = move-exception;
        r6 = th;
        throw r6;     // Catch: java.lang.Throwable -> L68
    L68:
        th = move-exception;
        java.lang.Throwable r16 = r6;
        if (r16 == null) goto L79;
        r5.close();     // Catch: java.lang.Throwable -> L76
    L131:
        throw th;     // Catch: java.lang.Throwable -> L84
    L76:
        th = move-exception;
        r16.addSuppressed(th);     // Catch: java.lang.Throwable -> L84
        throw th;     // Catch: java.lang.Throwable -> L84
    L79:
        r5.close();     // Catch: java.lang.Throwable -> L84
        throw th;     // Catch: java.lang.Throwable -> L84
    L81:
        th = move-exception;
        abcd.fw.DW(this.j6).unlock();     // Catch: java.lang.Throwable -> L84
        throw th;     // Catch: java.lang.Throwable -> L84
    L84:
        th = move-exception;
        abcd.yw.j6("Error writing events to disk", th);
        java.lang.Thread.sleep(10000);     // Catch: java.lang.InterruptedException -> L88
    L88:
        e = move-exception;
        abcd.yw.j6("Cache", "Unexpected InterruptedException", e);
        goto L4
    L5:
        abcd.yw.j6("Cache", "HTTP GONE encountered - exiting thread");
    }
}
