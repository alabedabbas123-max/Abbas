package abcd;

class Runnablecw implements java.lang.Runnable {
    final abcd.fw j6;

    Runnablecw(abcd.fw r1) {
        this.j6 = r1;
    }

    @Override
    public void run() {
        synchronized (abcd.fw.u7(this.j6)) {
            java.util.ArrayList r2 = null;
            abcd._v r0 = null;
            java.io.File r1 = null;
            java.io.FileOutputStream r5 = null;
            java.lang.Throwable r6 = null;
            java.io.BufferedWriter r7 = null;
            long r8 = 0L;
            int r11 = 0;
            boolean r12 = false;
            abcd._v r13 = null;
            java.lang.Object r9 = null;
            abcd._v r14 = null;
            java.lang.Throwable r10 = null;
            java.lang.Throwable r15 = null;
            java.lang.Throwable r16 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        abcd.yw.j6("Cache", "Writing thread started");
                        r2 = new java.util.ArrayList();
                        $pc0 = 4; continue $sw0;
                    }
                    case 4: {
                        if (abcd.fw.j6(this.j6).get() == true) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.fw.DW(this.j6).lock();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 81; continue $sw0;
                        }
                        if (r2.isEmpty() == false) { $pc0 = 105; continue $sw0; }
                        try {
                            abcd.fw.v5(this.j6).signalAll();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 81; continue $sw0;
                        }
                        $pc0 = 105; continue $sw0;
                    }
                    case 105: {
                        try {
                            abcd.fw.DW(this.j6).unlock();
                            abcd.yw.j6("Cache", "Waiting for next event.");
                            r0 = (abcd._v) abcd.fw.Zo(this.j6).take();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                        if (r0 == abcd.fw.j6()) { $pc0 = 4; continue $sw0; }
                        try {
                            r2.add(r0);
                            r1 = abcd.fw.VH(this.j6);
                            r5 = new java.io.FileOutputStream(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                        r6 = null;
                        try {
                            r7 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(r5));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 70; continue $sw0; }
                            $pc0 = 68; continue $sw0;
                        }
                        try {
                            r8 = java.lang.System.currentTimeMillis();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        r11 = 0;
                        $pc0 = 19; continue $sw0;
                    }
                    case 19: {
                        if (r2.size() == r11) { $pc0 = 21; continue $sw0; }
                        $pc0 = 27; continue $sw0;
                    }
                    case 27: {
                        try {
                            abcd.fw.Zo(this.j6).drainTo(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        r12 = false;
                        $pc0 = 29; continue $sw0;
                    }
                    case 29: {
                        if (r11 >= r2.size()) { $pc0 = 35; continue $sw0; }
                        try {
                            r13 = (abcd._v) r2.get(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        if (r13 == abcd.fw.j6()) { $pc0 = 33; continue $sw0; }
                        try {
                            r7.write(r13.j6().toString());
                            r7.write(10);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        $pc0 = 34; continue $sw0;
                    }
                    case 34: {
                        try {
                            r11 = r11 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        { $pc0 = 29; continue $sw0; }
                    }
                    case 33: {
                        r12 = true;
                        { $pc0 = 34; continue $sw0; }
                    }
                    case 35: {
                        try {
                            r11 = r2.size();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        if (r12 == false) { $pc0 = 19; continue $sw0; }
                        try {
                            abcd.yw.j6("Cache", "Received flush. Finishing up file.");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        $pc0 = 38; continue $sw0;
                    }
                    case 38: {
                        try {
                            r7.flush();
                            r5.getFD().sync();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        try {
                            r7.close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 70; continue $sw0; }
                            $pc0 = 68; continue $sw0;
                        }
                        try {
                            r5.close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                        if (r1.renameTo(new java.io.File(abcd.fw.gn(this.j6), r1.getName())) == false) { $pc0 = 52; continue $sw0; }
                        try {
                            r9 = abcd.fw.u7(this.j6);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                        try {
                            abcd.fw.u7(this.j6).notify();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 48; continue $sw0;
                        }
                        $pc0 = 46; continue $sw0;
                    }
                    case 46: {
                        try {
                            abcd.yw.j6("Cache", "Staged file with " + r2.size() + " events for network I/O: " + r1.getName());
                            r2.clear();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                        $pc0 = 52; continue $sw0;
                    }
                    case 48: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                    }
                    case 52: {
                        try {
                            throw new java.io.IOException("Could not move file to outgoing directory");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                    }
                    case 21: {
                        if ((java.lang.System.currentTimeMillis() - r8) >= 10000) { $pc0 = 22; continue $sw0; }
                        try {
                            r14 = (abcd._v) abcd.fw.Zo(this.j6).poll(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        if (r14 == null) { $pc0 = 25; continue $sw0; }
                        try {
                            r2.add(r14);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        { $pc0 = 27; continue $sw0; }
                    }
                    case 25: {
                        try {
                            abcd.yw.j6("Cache", "No events for 1000ms. Finishing up file.");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        { $pc0 = 38; continue $sw0; }
                    }
                    case 22: {
                        try {
                            abcd.yw.j6("Cache", "Collected events for 10000ms. Finishing up file.");
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 55; continue $sw0; }
                            $pc0 = 53; continue $sw0;
                        }
                        $pc0 = 60; continue $sw0;
                    }
                    case 55: {
                        th = $ex0;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 58; continue $sw0;
                        }
                    }
                    case 58: {
                        th = $ex0;
                        r10 = th;
                        r15 = th;
                        $pc0 = 60; continue $sw0;
                    }
                    case 60: {
                        if (r10 != null) { $pc0 = 98; continue $sw0; }
                        try {
                            r7.close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 70; continue $sw0; }
                            $pc0 = 68; continue $sw0;
                        }
                        $pc0 = 67; continue $sw0;
                    }
                    case 67: {
                        try {
                            throw r15;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 70; continue $sw0; }
                            $pc0 = 68; continue $sw0;
                        }
                    }
                    case 98: {
                        try {
                            r7.close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 68; continue $sw0; }
                            $pc0 = 63; continue $sw0;
                        }
                        $pc0 = 131; continue $sw0;
                    }
                    case 63: {
                        th = $ex0;
                        try {
                            r10.addSuppressed(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Throwable) { $pc0 = 70; continue $sw0; }
                            $pc0 = 68; continue $sw0;
                        }
                        $pc0 = 131; continue $sw0;
                    }
                    case 53: {
                        th = $ex0;
                        r15 = th;
                        r10 = null;
                        $pc0 = 131; continue $sw0;
                    }
                    case 70: {
                        th = $ex0;
                        r6 = th;
                        try {
                            throw r6;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 68; continue $sw0;
                        }
                    }
                    case 68: {
                        th = $ex0;
                        r16 = r6;
                        if (r16 == null) { $pc0 = 79; continue $sw0; }
                        try {
                            r5.close();
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 76; continue $sw0;
                        }
                        $pc0 = 131; continue $sw0;
                    }
                    case 131: {
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                    }
                    case 76: {
                        th = $ex0;
                        try {
                            r16.addSuppressed(th);
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                    }
                    case 79: {
                        try {
                            r5.close();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                    }
                    case 81: {
                        th = $ex0;
                        try {
                            abcd.fw.DW(this.j6).unlock();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 84; continue $sw0;
                        }
                    }
                    case 84: {
                        th = $ex0;
                        abcd.yw.j6("Error writing events to disk", th);
                        try {
                            java.lang.Thread.sleep(10000);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 88; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 88: {
                        e = $ex0;
                        abcd.yw.j6("Cache", "Unexpected InterruptedException", e);
                        { $pc0 = 4; continue $sw0; }
                    }
                    case 5: {
                        abcd.yw.j6("Cache", "HTTP GONE encountered - exiting thread");
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
