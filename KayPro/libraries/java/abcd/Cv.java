package abcd;

class Cv implements java.lang.Runnable {
    final abcd.Dv j6;

    Cv(abcd.Dv r1) {
        this.j6 = r1;
    }

    @Override
    public void run() {
        synchronized (abcd.Dv.j6(this.j6)) {
            java.lang.Object r0 = null;
            long r1 = 0L;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = abcd.Dv.j6(this.j6);
                        try {
                            r1 = java.lang.System.currentTimeMillis();
                            abcd.Dv.DW(this.j6);
                            abcd.yw.j6("String resources", "Loading strings took " + (java.lang.System.currentTimeMillis() - r1));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return;
                    }
                    case 7: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
