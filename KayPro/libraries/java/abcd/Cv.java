package abcd;

class Cv implements java.lang.Runnable {
    final abcd.Dv j6;

    Cv(abcd.Dv r1) {
        this.j6 = r1;
    }

    @Override
    public void run() {
        java.lang.Object r0 = abcd.Dv.j6(this.j6);
        monitor-enter(r0);
        long r1 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L7
        abcd.Dv.DW(this.j6);     // Catch: java.lang.Throwable -> L7
        abcd.yw.j6("String resources", "Loading strings took " + (java.lang.System.currentTimeMillis() - r1));     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
