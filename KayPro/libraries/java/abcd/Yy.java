package abcd;

class Yy implements java.lang.Runnable {
    final abcd.Xy.c DW;
    final java.lang.Runnable j6;

    Yy(abcd.Xy.c r1, java.lang.Runnable r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        this.j6.run();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 5; continue $sw0;
                    }
                    this.DW.j6();
                    return;
                }
                case 5: {
                    th = $ex0;
                    this.DW.j6();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
