package abcd;

class Nv implements java.lang.Thread.UncaughtExceptionHandler {
    final java.lang.Thread.UncaughtExceptionHandler j6;

    Nv(java.lang.Thread.UncaughtExceptionHandler r1) {
        this.j6 = r1;
    }

    @Override
    public void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        abcd.kv.j6(r7, r8);     // Catch: java.lang.Throwable -> L8
        long r1 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L8
        abcd.yw.j6("Flush", "Initiating uncaught exception flush.");     // Catch: java.lang.Throwable -> L8
        if (abcd.iw.j6(1500) == false) goto L6;
        abcd.yw.j6("Flush", "Flush successful: elapsed " + (java.lang.System.currentTimeMillis() - r1) + "ms.");     // Catch: java.lang.Throwable -> L8
    L12:
    L10:
        this.j6.uncaughtException(r7, r8);
        return;
    L6:
        abcd.yw.j6("Flush", "Could not flush within allotted time of 1500ms.");     // Catch: java.lang.Throwable -> L8
    L8:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        goto L10
    }
}
