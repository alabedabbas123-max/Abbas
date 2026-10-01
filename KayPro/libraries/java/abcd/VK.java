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
            monitor-enter(this);
        L8:
            th = move-exception;
            throw th;
        L4:
            if (this.FH == true) goto L6;
            this.DW = 0;     // Catch: java.lang.Throwable -> L8
            this.FH = true;     // Catch: java.lang.Throwable -> L8
            notifyAll();     // Catch: java.lang.Throwable -> L8
        L6:
            monitor-exit(this);
        }

        synchronized void j6() {
            monitor-enter(this);
        L10:
            th = move-exception;
            throw th;
        L4:
            if (0 != this.DW) goto L6;
            java.lang.Thread.interrupted();     // Catch: java.lang.Throwable -> L10
        L7:
            notifyAll();     // Catch: java.lang.Throwable -> L10
            monitor-exit(this);
            return;
        L6:
            this.DW = 0;     // Catch: java.lang.Throwable -> L10
            goto L7
        }

        synchronized void j6(int r5) {
            monitor-enter(this);
        L10:
            th = move-exception;
            throw th;
        L4:
            if (this.FH == true) goto L9;
            this.j6 = java.lang.Thread.currentThread();     // Catch: java.lang.Throwable -> L10
            this.DW = FH() + ((long) r5);     // Catch: java.lang.Throwable -> L10
            notifyAll();     // Catch: java.lang.Throwable -> L10
            monitor-exit(this);
            return;
        L9:
            throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().timerAlreadyTerminated);     // Catch: java.lang.Throwable -> L10
        }

        @Override
        public synchronized void run() {
            monitor-enter(this);
        L26:
            if (this.FH == true) goto L16;
            if (this.j6.isAlive() == false) goto L16;
            if (0 < this.DW) goto L10;
            wait(1000);     // Catch: java.lang.InterruptedException -> L23 java.lang.Throwable -> L18
            goto L26
        L10:
            long r0 = this.DW - FH();     // Catch: java.lang.InterruptedException -> L23 java.lang.Throwable -> L18
            if (r0 <= 0) goto L12;
            wait(r0);     // Catch: java.lang.InterruptedException -> L23 java.lang.Throwable -> L18
            goto L26
        L12:
            this.DW = 0;     // Catch: java.lang.InterruptedException -> L23 java.lang.Throwable -> L18
            this.j6.interrupt();     // Catch: java.lang.InterruptedException -> L23 java.lang.Throwable -> L18
        L16:
            monitor-exit(this);
            return;
        L18:
            th = move-exception;
            throw th;
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
        if (r5 <= 0) goto L6;
        java.lang.Thread.interrupted();
        this.j6.j6(r5);
        return;
    L6:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidTimeout, new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
    }
}
