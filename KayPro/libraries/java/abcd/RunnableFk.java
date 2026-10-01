package abcd;

@abcd.Interfacexu
class RunnableFk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Gk FH;

    static {
        abcd.wu.j6(abcd.RunnableFk.class, 5827383158220726803L, -33568508796781632L);
    }

    RunnableFk(abcd.Gk r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2268433727670628820L)
    public void run() {
        synchronized (abcd.Gk.j6(this.FH)) {
            int r2 = 0;
            abcd.Gk r3 = null;
            java.io.BufferedReader r4 = null;
            java.lang.String r5 = null;
            java.lang.Object r6 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 4;
            $sw0: while (true) {
                switch ($pc0) {
                    case 27: {
                        th = $ex0;
                        if (DW == false) { $pc0 = 32; continue $sw0; }
                        abcd.wu.j6(th, -6601447001292854932L, this);
                        $pc0 = 32; continue $sw0;
                    }
                    case 32: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(-6601447001292854932L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 27; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        r2 = 0;
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        if (r2 >= abcd.Gk.j6().Hw()) { $pc0 = 10; continue $sw0; }
                        try {
                            abcd.Gk.j6((java.lang.String) abcd.Gk.j6().j6(r2));
                            r2 = r2 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 27; continue $sw0;
                        }
                        { $pc0 = 8; continue $sw0; }
                    }
                    case 10: {
                        try {
                            abcd.Gk.j6().j6();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 27; continue $sw0;
                        }
                        try {
                            r3 = this.FH;
                            r3.u7 = abcd.Gk.j6(this.FH, "logcat -v threadtime");
                            r4 = new java.io.BufferedReader(new java.io.InputStreamReader(this.FH.u7.getInputStream()), 20);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 35; continue $sw0; }
                            $pc0 = 27; continue $sw0;
                        }
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        try {
                            r5 = r4.readLine();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 35; continue $sw0; }
                            $pc0 = 27; continue $sw0;
                        }
                        if (r5 == null) { $pc0 = 48; continue $sw0; }
                        try {
                            r6 = abcd.Gk.j6(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 35; continue $sw0; }
                            $pc0 = 27; continue $sw0;
                        }
                        $pc0 = 39; continue $sw0;
                    }
                    case 39: {
                        if (abcd.Gk.DW(this.FH) == false) { $pc0 = 20; continue $sw0; }
                        try {
                            abcd.Gk.j6(this.FH).wait(1000);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 34; continue $sw0; }
                            $pc0 = 23; continue $sw0;
                        }
                        { $pc0 = 39; continue $sw0; }
                    }
                    case 20: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 23; continue $sw0;
                        }
                        try {
                            abcd.Gk.DW(this.FH, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 35; continue $sw0; }
                            $pc0 = 27; continue $sw0;
                        }
                        $pc0 = 48; continue $sw0;
                    }
                    case 23: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.io.IOException) { $pc0 = 35; continue $sw0; }
                            $pc0 = 27; continue $sw0;
                        }
                        { $pc0 = 26; continue $sw0; }
                    }
                    case 48: {
                        return;
                    }
                    case 26: {
                        return;
                    }
                    case 34: {
                        return;
                    }
                    case 35: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
