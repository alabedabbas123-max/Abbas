package abcd;

class ew implements abcd.vw.b {
    final abcd.fw j6;

    ew(abcd.fw r1) {
        this.j6 = r1;
    }

    @Override
    public void j6(boolean r2) {
        java.lang.Object r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == false) { $pc0 = 11; continue $sw0; }
                    abcd.yw.j6("Networking", "Network became available - notifying networking thread...");
                    r3 = abcd.fw.Hw(this.j6);
                    monitor-enter(r3);
                    try {
                        abcd.fw.Hw(this.j6).notify();
                        monitor-exit(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
