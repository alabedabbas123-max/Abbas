package abcd;

class SH implements java.lang.Runnable {
    private final abcd.HH DW;
    private final java.util.List FH;
    final abcd.TH j6;

    SH(abcd.TH r1, abcd.HH r2, java.util.List r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
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
                        this.DW.call();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 4; continue $sw0;
                    }
                    return;
                }
                case 4: {
                    th = $ex0;
                    this.FH.add(th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
