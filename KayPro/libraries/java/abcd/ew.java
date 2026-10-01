package abcd;

class ew implements abcd.vw.b {
    final abcd.fw j6;

    ew(abcd.fw r1) {
        this.j6 = r1;
    }

    @Override
    public void j6(boolean r2) {
        if (r2 == false) goto L11;
        abcd.yw.j6("Networking", "Network became available - notifying networking thread...");
        java.lang.Object r3 = abcd.fw.Hw(this.j6);
        monitor-enter(r3);
        abcd.fw.Hw(this.j6).notify();     // Catch: java.lang.Throwable -> L8
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
