package abcd;

class Runnabledw implements java.lang.Runnable {
    private java.util.Random DW;
    final java.lang.String FH;
    final abcd.fw Hw;
    private int j6;

    Runnabledw(abcd.fw r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
        this.j6 = 4000;
        this.DW = new java.util.Random();
    }

    private void j6() {
        synchronized (abcd.fw.Hw(this.Hw)) {
            java.lang.Object r0 = null;
            int r1 = 0;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        abcd.yw.j6("Networking", "Sleeping for " + (this.j6 / 1000) + " seconds.");
                        try {
                            r0 = abcd.fw.Hw(this.Hw);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 11; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        try {
                            abcd.fw.Hw(this.Hw).wait(this.j6 + this.DW.nextInt(1000));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        $pc0 = 13; continue $sw0;
                    }
                    case 13: {
                        r1 = this.j6;
                        if (r1 >= 128000) { $pc0 = 20; continue $sw0; }
                        this.j6 = r1 * 2;
                        return;
                    }
                    case 20: {
                        return;
                    }
                    case 8: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 11; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                    }
                    case 11: {
                        e = $ex0;
                        abcd.yw.j6("Networking", "Unexpected InterruptedException", e);
                        { $pc0 = 13; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    @Override
    public void run() {
        synchronized (abcd.fw.u7(this.Hw)) {
            java.lang.String r3 = null;
            java.io.File[] r0 = null;
            java.lang.Object r4 = null;
            int r5 = 0;
            abcd.tw r6 = null;
            java.io.File[] r1 = null;
            javax.net.ssl.HttpsURLConnection r7 = null;
            byte[] r8 = null;
            java.io.OutputStream r9 = null;
            int r10 = 0;
            java.io.FileInputStream r11 = null;
            int r12 = 0;
            java.lang.Throwable r13 = null;
            java.lang.Throwable r14 = null;
            int r15 = 0;
            java.io.File r2 = null;
            int r16 = 0;
            java.io.File r17 = null;
            java.lang.Throwable r18 = null;
            java.lang.Throwable r19 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        abcd.yw.j6("Networking", "Thread started");
                        r3 = null;
                        $pc1 = 128; continue $sw1;
                    }
                    case 128: {
                        try {
                            r0 = abcd.fw.tp(this.Hw);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                        if (r0 != null) { $pc1 = 6; continue $sw1; }
                        $pc1 = 120; continue $sw1;
                    }
                    case 120: {
                        try {
                            abcd.fw.DW(this.Hw).lock();
                            abcd.fw.EQ(this.Hw).signalAll();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 103; continue $sw1;
                        }
                        try {
                            abcd.fw.DW(this.Hw).unlock();
                            r4 = abcd.fw.u7(this.Hw);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                        try {
                            abcd.yw.j6("Networking", "No files ready for transmission - sleeping...");
                            abcd.fw.u7(this.Hw).wait();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 100; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 100: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                    }
                    case 103: {
                        th = $ex1;
                        try {
                            abcd.fw.DW(this.Hw).unlock();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                    }
                    case 6: {
                        if (r0.length == 0) { $pc1 = 120; continue $sw1; }
                        try {
                            abcd.yw.j6("Networking", "Found " + r0.length + " files ready for transmission.");
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        if (abcd.vw.DW() == true) { $pc1 = 12; continue $sw1; }
                        try {
                            abcd.yw.j6("Networking", "No internet");
                            j6();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                        { $pc1 = 10; continue $sw1; }
                    }
                    case 12: {
                        r5 = 0;
                        try {
                            r6 = new abcd.tw(abcd.fw.FH(this.Hw), false);
                            r6.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                        try {
                            r1 = abcd.fw.tp(this.Hw);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        if (r1.length == 0) { $pc1 = 15; continue $sw1; }
                        try {
                            abcd.yw.j6("Networking", "Starting transmission of " + r1.length + " network files.");
                            r3 = abcd.Aw.j6(java.util.UUID.randomUUID());
                            r7 = (javax.net.ssl.HttpsURLConnection) new java.net.URL(this.FH + "?clientTime=" + java.lang.System.currentTimeMillis() + "&formatVersion=2&deviceId=" + abcd.qw.j6() + "&reportId=" + r3 + "&currentSessionId=" + abcd.qw.j6(java.lang.System.currentTimeMillis(), false).j6).openConnection();
                            r7.setDoOutput(true);
                            r7.setConnectTimeout(10000);
                            r7.setReadTimeout(60000);
                            r7.setRequestMethod("POST");
                            r7.setRequestProperty("Content-Type", "application/stream+json");
                            r8 = new byte[65536];
                            r9 = r7.getOutputStream();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        r10 = 0;
                        $pc1 = 114; continue $sw1;
                    }
                    case 114: {
                        if (r10 >= r1.length) { $pc1 = 46; continue $sw1; }
                        if (r1[r10].length() != 0) { $pc1 = 24; continue $sw1; }
                        try {
                            abcd.yw.j6("Empty file encountered sending log files", new java.io.IOException("Empty file encountered"));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 77; continue $sw1; }
                            $pc1 = 75; continue $sw1;
                        }
                        $pc1 = 24; continue $sw1;
                    }
                    case 24: {
                        try {
                            r11 = new java.io.FileInputStream(r1[r10]);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 77; continue $sw1; }
                            $pc1 = 75; continue $sw1;
                        }
                        $pc1 = 129; continue $sw1;
                    }
                    case 129: {
                        try {
                            r12 = r11.read(r8, 0, r8.length);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 33; continue $sw1; }
                            $pc1 = 31; continue $sw1;
                        }
                        if (r12 < 0) { $pc1 = 29; continue $sw1; }
                        try {
                            r9.write(r8, 0, r12);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 33; continue $sw1; }
                            $pc1 = 31; continue $sw1;
                        }
                        $pc1 = 29; continue $sw1;
                    }
                    case 29: {
                        try {
                            r11.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 77; continue $sw1; }
                            $pc1 = 75; continue $sw1;
                        }
                        r10 = r10 + 1;
                        $pc1 = 38; continue $sw1;
                    }
                    case 31: {
                        th = $ex1;
                        r13 = th;
                        r14 = null;
                        $pc1 = 38; continue $sw1;
                    }
                    case 38: {
                        if (r14 != null) { $pc1 = 112; continue $sw1; }
                        try {
                            r11.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 77; continue $sw1; }
                            $pc1 = 75; continue $sw1;
                        }
                        $pc1 = 45; continue $sw1;
                    }
                    case 45: {
                        try {
                            throw r13;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 77; continue $sw1; }
                            $pc1 = 75; continue $sw1;
                        }
                    }
                    case 112: {
                        try {
                            r11.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 75; continue $sw1; }
                            $pc1 = 41; continue $sw1;
                        }
                        $pc1 = 46; continue $sw1;
                    }
                    case 41: {
                        th = $ex1;
                        try {
                            r14.addSuppressed(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 77; continue $sw1; }
                            $pc1 = 75; continue $sw1;
                        }
                        $pc1 = 46; continue $sw1;
                    }
                    case 33: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 36; continue $sw1;
                        }
                    }
                    case 36: {
                        th = $ex1;
                        r14 = th;
                        r13 = th;
                        { $pc1 = 38; continue $sw1; }
                    }
                    case 46: {
                        if (r9 == null) { $pc1 = 48; continue $sw1; }
                        try {
                            r9.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        $pc1 = 48; continue $sw1;
                    }
                    case 48: {
                        try {
                            r15 = r7.getResponseCode();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        if (r15 == 200) { $pc1 = 66; continue $sw1; }
                        if (r15 == 202) { $pc1 = 66; continue $sw1; }
                        if (r15 != 410) { $pc1 = 65; continue $sw1; }
                        try {
                            abcd.yw.j6("Networking", "HTTP GONE encountered: exiting thread.");
                            abcd.fw.j6(this.Hw).set(true);
                            r2 = abcd.uw.DW(abcd.wu.j6(), this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        if (r2 == null) { $pc1 = 61; continue $sw1; }
                        try {
                            new java.io.FileOutputStream(r2).close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 59; continue $sw1; }
                            $pc1 = 91; continue $sw1;
                        }
                        $pc1 = 62; continue $sw1;
                    }
                    case 62: {
                        try {
                            r6.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                        return;
                    }
                    case 59: {
                        e = $ex1;
                        try {
                            abcd.yw.j6("Could not write gone file", e);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        { $pc1 = 62; continue $sw1; }
                    }
                    case 61: {
                        try {
                            abcd.yw.j6("Could not calculate gone file path", new java.lang.Exception());
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        { $pc1 = 62; continue $sw1; }
                    }
                    case 65: {
                        try {
                            throw new java.io.IOException("Reporting error: Received non-OK status code: " + r15);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                    }
                    case 66: {
                        try {
                            abcd.yw.j6("Networking", "Reported " + r1.length + " event files");
                            r16 = r1.length;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        $pc1 = 67; continue $sw1;
                    }
                    case 67: {
                        if (r5 >= r16) { $pc1 = 73; continue $sw1; }
                        try {
                            r17 = r1[r5];
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        if (r17.delete() == false) { $pc1 = 72; continue $sw1; }
                        try {
                            r5 = r5 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        { $pc1 = 67; continue $sw1; }
                    }
                    case 72: {
                        try {
                            throw new java.io.IOException("Could not delete network file: " + r17.getName());
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                    }
                    case 73: {
                        try {
                            this.j6 = 4000;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                        $pc1 = 82; continue $sw1;
                    }
                    case 77: {
                        th = $ex1;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 80; continue $sw1;
                        }
                    }
                    case 80: {
                        th = $ex1;
                        r18 = th;
                        r19 = th;
                        $pc1 = 82; continue $sw1;
                    }
                    case 82: {
                        if (r9 == null) { $pc1 = 159; continue $sw1; }
                        if (r18 == null) { $pc1 = 89; continue $sw1; }
                        try {
                            r9.close();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc1 = 91; continue $sw1; }
                            $pc1 = 86; continue $sw1;
                        }
                        $pc1 = 160; continue $sw1;
                    }
                    case 160: {
                        try {
                            throw r19;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                    }
                    case 86: {
                        th = $ex1;
                        try {
                            r18.addSuppressed(th);
                            throw r19;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                    }
                    case 89: {
                        try {
                            r9.close();
                            throw r19;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                    }
                    case 159: {
                        try {
                            throw r19;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 91; continue $sw1;
                        }
                    }
                    case 75: {
                        th = $ex1;
                        r19 = th;
                        r18 = null;
                        $pc1 = 15; continue $sw1;
                    }
                    case 15: {
                        try {
                            r6.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                        return;
                    }
                    case 91: {
                        th = $ex1;
                        try {
                            r6.DW();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.io.IOException) { $pc1 = 108; continue $sw1; }
                            $pc1 = 106; continue $sw1;
                        }
                    }
                    case 108: {
                        e = $ex1;
                        abcd.yw.j6("I/O Error for report ID " + r3, e);
                        abcd.yw.j6("Networking", "Reporting I/O error", e);
                        j6();
                        return;
                    }
                    case 106: {
                        th = $ex1;
                        abcd.yw.j6("Reporting error", th);
                        j6();
                        { $pc1 = 128; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
