package abcd;

class Nv implements java.lang.Thread.UncaughtExceptionHandler {
    final java.lang.Thread.UncaughtExceptionHandler j6;

    Nv(java.lang.Thread.UncaughtExceptionHandler r1) {
        this.j6 = r1;
    }

    @Override
    public void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        long r1 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.kv.j6(r7, r8);
                        r1 = java.lang.System.currentTimeMillis();
                        abcd.yw.j6("Flush", "Initiating uncaught exception flush.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (abcd.iw.j6(1500) == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.yw.j6("Flush", "Flush successful: elapsed " + (java.lang.System.currentTimeMillis() - r1) + "ms.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    this.j6.uncaughtException(r7, r8);
                    return;
                }
                case 6: {
                    try {
                        abcd.yw.j6("Flush", "Could not flush within allotted time of 1500ms.");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    th = $ex0;
                    abcd.yw.j6("Runtime Error", th);
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
