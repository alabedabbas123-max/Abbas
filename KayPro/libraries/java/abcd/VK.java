package abcd;

public final class VK {
    private final abcd.VK.b DW;
    final abcd.VK.c FH;
    private final abcd.VK.a j6;

    static final class a implements java.lang.Runnable {
        private long DW;
        private boolean FH;
        private java.lang.Thread j6;

        a() {
            this.j6 = java.lang.Thread.currentThread();
        }

        private static long FH() {
            return java.lang.System.currentTimeMillis();
        }

        synchronized void DW() {
            synchronized (this) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = -1;
                $sw0: while (true) {
                    switch ($pc0) {
                        case -1: {
                            $pc0 = 4; continue $sw0;
                        }
                        case 8: {
                            th = $ex0;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (this.FH == true) { $pc0 = 6; continue $sw0; }
                            try {
                                this.DW = 0;
                                this.FH = true;
                                notifyAll();
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 8; continue $sw0;
                            }
                            $pc0 = 6; continue $sw0;
                        }
                        case 6: {
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
        
            }
        }

        synchronized void j6() {
            synchronized (this) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = -1;
                $sw1: while (true) {
                    switch ($pc1) {
                        case -1: {
                            $pc1 = 4; continue $sw1;
                        }
                        case 10: {
                            th = $ex1;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (0 != this.DW) { $pc1 = 6; continue $sw1; }
                            try {
                                java.lang.Thread.interrupted();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 10; continue $sw1;
                            }
                            $pc1 = 7; continue $sw1;
                        }
                        case 7: {
                            try {
                                notifyAll();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 10; continue $sw1;
                            }
                            return;
                        }
                        case 6: {
                            try {
                                this.DW = 0;
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 10; continue $sw1;
                            }
                            { $pc1 = 7; continue $sw1; }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
        
            }
        }

        synchronized void j6(int r5) {
            synchronized (this) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = -1;
                $sw2: while (true) {
                    switch ($pc2) {
                        case -1: {
                            $pc2 = 4; continue $sw2;
                        }
                        case 10: {
                            th = $ex2;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (this.FH == true) { $pc2 = 9; continue $sw2; }
                            try {
                                this.j6 = java.lang.Thread.currentThread();
                                this.DW = FH() + ((long) r5);
                                notifyAll();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 10; continue $sw2;
                            }
                            return;
                        }
                        case 9: {
                            try {
                                throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().timerAlreadyTerminated);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 10; continue $sw2;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
        
            }
        }

        @Override
        public synchronized void run() {
            synchronized (this) {
                long r0 = 0L;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = -1;
                $sw3: while (true) {
                    switch ($pc3) {
                        case -1: {
                            $pc3 = 26; continue $sw3;
                        }
                        case 26: {
                            if (this.FH == true) { $pc3 = 16; continue $sw3; }
                            if (this.j6.isAlive() == false) { $pc3 = 16; continue $sw3; }
                            if (0 < this.DW) { $pc3 = 10; continue $sw3; }
                            try {
                                wait(1000);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 23; continue $sw3; }
                                $pc3 = 18; continue $sw3;
                            }
                            { $pc3 = 26; continue $sw3; }
                        }
                        case 10: {
                            try {
                                r0 = this.DW - FH();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 23; continue $sw3; }
                                $pc3 = 18; continue $sw3;
                            }
                            if (r0 <= 0) { $pc3 = 12; continue $sw3; }
                            try {
                                wait(r0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 23; continue $sw3; }
                                $pc3 = 18; continue $sw3;
                            }
                            { $pc3 = 26; continue $sw3; }
                        }
                        case 12: {
                            try {
                                this.DW = 0;
                                this.j6.interrupt();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                if ($t instanceof java.lang.InterruptedException) { $pc3 = 23; continue $sw3; }
                                $pc3 = 18; continue $sw3;
                            }
                            $pc3 = 16; continue $sw3;
                        }
                        case 16: {
                            return;
                        }
                        case 18: {
                            th = $ex3;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 23: {
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
        
            }
        }
    }

    static final class b extends java.lang.Thread {
        b(java.lang.String r1, abcd.VK.a r2) {
            super(r2);
            setName(r1);
            setDaemon(true);
        }
    }

    private static final class c {
        private final abcd.VK.a j6;

        c(abcd.VK.a r1) {
            this.j6 = r1;
        }

        protected void finalize() {
            this.j6.DW();
        }
    }

    public VK(java.lang.String r3) {
        this.j6 = new abcd.VK.a();
        this.FH = new abcd.VK.c(this.j6);
        this.DW = new abcd.VK.b(r3, this.j6);
        this.DW.start();
    }

    public void DW() {
        this.j6.DW();
        this.DW.join();     // Catch: java.lang.InterruptedException -> L5
        return;
    }

    public void j6() {
        this.j6.j6();
    }

    public void j6(int r5) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r5 <= 0) { $pc4 = 6; continue $sw4; }
                    java.lang.Thread.interrupted();
                    this.j6.j6(r5);
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidTimeout, new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
