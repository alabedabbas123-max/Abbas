package abcd;

class Runnablemw implements java.lang.Runnable {
    final java.lang.String DW;
    final long FH;
    final java.lang.String j6;

    Runnablemw(java.lang.String r1, java.lang.String r2, long r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void run() {
        synchronized (abcd.ow.j6()) {
            java.lang.Object r0 = null;
            java.lang.String r1 = null;
            java.io.File r2 = null;
            java.io.File r3 = null;
            long r4 = 0L;
            long r5 = 0L;
            java.lang.Object r6 = null;
            boolean r7 = false;
            java.lang.Object r8 = null;
            java.lang.Object r9 = null;
            java.lang.Object r10 = null;
            long r11 = 0L;
            java.lang.Object r12 = null;
            java.lang.Object r13 = null;
            long r14 = 0L;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = abcd.ow.j6();
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 69; continue $sw0;
                        }
                        $pc0 = 79; continue $sw0;
                    }
                    case 79: {
                        try {
                            abcd.sw.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        if (abcd.sw.j6() == false) { $pc0 = 8; continue $sw0; }
                        try {
                            r1 = this.j6;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        $pc0 = 9; continue $sw0;
                    }
                    case 9: {
                        try {
                            r2 = abcd.ow.DW();
                            r3 = abcd.ow.FH();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        if (r3.exists() == false) { $pc0 = 12; continue $sw0; }
                        try {
                            r4 = r3.lastModified();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        $pc0 = 13; continue $sw0;
                    }
                    case 13: {
                        try {
                            r5 = java.lang.Math.max(r4, this.FH);
                            abcd.yw.j6("Probes", "Checking " + r1);
                            r2.delete();
                            abcd.gw.j6(r1, r2, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        if (r2.exists() == false) { $pc0 = 31; continue $sw0; }
                        try {
                            r6 = abcd.ow.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        r7 = true;
                        if (abcd.ow.Hw() == false) { $pc0 = 20; continue $sw0; }
                        try {
                            abcd.ow.j6(true);
                            r3.delete();
                            r2.renameTo(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 26; continue $sw0;
                        }
                        r7 = false;
                        $pc0 = 20; continue $sw0;
                    }
                    case 20: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 26; continue $sw0;
                        }
                        if (r7 == false) { $pc0 = 31; continue $sw0; }
                        try {
                            abcd.yw.j6("Probes", "Opening new probes " + r2 + " " + r2.length());
                            abcd.ow.j6(abcd.ow.j6(r2), false);
                            r3.delete();
                            r2.renameTo(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        if (abcd.sw.j6() == false) { $pc0 = 31; continue $sw0; }
                        try {
                            abcd.xw.j6(1278935723, 17301634, "backbone test probes loaded");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        { $pc0 = 31; continue $sw0; }
                    }
                    case 26: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                    }
                    case 31: {
                        r8 = abcd.ow.j6();
                        try {
                            abcd.ow.j6().notify();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 66; continue $sw0;
                        }
                        r9 = abcd.ow.v5();
                        try {
                            r10 = abcd.ow.v5();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 45; continue $sw0; }
                            $pc0 = 43; continue $sw0;
                        }
                        if (abcd.sw.j6() == false) { $pc0 = 40; continue $sw0; }
                        r11 = 10000;
                        $pc0 = 41; continue $sw0;
                    }
                    case 41: {
                        try {
                            r10.wait(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 45; continue $sw0; }
                            $pc0 = 43; continue $sw0;
                        }
                        $pc0 = 47; continue $sw0;
                    }
                    case 47: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 43; continue $sw0;
                        }
                        r12 = abcd.ow.Zo();
                        try {
                            r13 = abcd.ow.Zo();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 58; continue $sw0; }
                            $pc0 = 56; continue $sw0;
                        }
                        if (abcd.sw.j6() == false) { $pc0 = 53; continue $sw0; }
                        r14 = 50000;
                        $pc0 = 54; continue $sw0;
                    }
                    case 54: {
                        try {
                            r13.wait(r14);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 58; continue $sw0; }
                            $pc0 = 56; continue $sw0;
                        }
                        $pc0 = 60; continue $sw0;
                    }
                    case 60: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 56; continue $sw0;
                        }
                        { $pc0 = 79; continue $sw0; }
                    }
                    case 53: {
                        r14 = 240000;
                        $pc0 = 40; continue $sw0;
                    }
                    case 56: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 58: {
                        e = $ex0;
                        try {
                            abcd.yw.j6("Probes", "Unexpected InterruptedException", e);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 56; continue $sw0;
                        }
                        { $pc0 = 60; continue $sw0; }
                    }
                    case 40: {
                        r11 = 60000;
                        $pc0 = 12; continue $sw0;
                    }
                    case 45: {
                        e = $ex0;
                        try {
                            abcd.yw.j6("Probes", "Unexpected InterruptedException", e);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 43; continue $sw0;
                        }
                        $pc0 = 12; continue $sw0;
                    }
                    case 43: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 66: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 12: {
                        r4 = 0;
                        { $pc0 = 13; continue $sw0; }
                    }
                    case 8: {
                        try {
                            r1 = this.DW;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 29; continue $sw0;
                        }
                        return;
                    }
                    case 29: {
                        th = $ex0;
                        abcd.yw.j6("Error loading probes", th);
                        return;
                    }
                    case 69: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
