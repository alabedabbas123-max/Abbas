package abcd;

@abcd.Interfacexu
class xc extends java.lang.Thread {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.xc.class, -431451251040535232L, -570162030021418635L);
    }

    xc(java.lang.String r1) {
        super(r1);
    }

    @Override
    @abcd.Interfacesu(method = -505839303755303875L)
    public void run() {
        synchronized (abcd.yc.j6()) {
            java.lang.Object r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 4;
            $sw0: while (true) {
                switch ($pc0) {
                    case 19: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 24; continue $sw0; }
                        abcd.wu.j6(th, -618672674677122000L, this);
                        $pc0 = 24; continue $sw0;
                    }
                    case 24: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc0 = 29; continue $sw0; }
                        try {
                            abcd.wu.j6(-618672674677122000L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 19; continue $sw0;
                        }
                        $pc0 = 29; continue $sw0;
                    }
                    case 29: {
                        if (isInterrupted() == true) { $pc0 = 34; continue $sw0; }
                        try {
                            r2 = abcd.yc.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 26; continue $sw0; }
                            $pc0 = 19; continue $sw0;
                        }
                        try {
                            abcd.yc.j6(java.lang.System.currentTimeMillis());
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 15; continue $sw0;
                        }
                        try {
                            java.lang.Thread.sleep(100);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 26; continue $sw0; }
                            $pc0 = 19; continue $sw0;
                        }
                        $pc0 = 34; continue $sw0;
                    }
                    case 15: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 26; continue $sw0; }
                            $pc0 = 19; continue $sw0;
                        }
                        { $pc0 = 18; continue $sw0; }
                    }
                    case 34: {
                        return;
                    }
                    case 18: {
                        return;
                    }
                    case 26: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
