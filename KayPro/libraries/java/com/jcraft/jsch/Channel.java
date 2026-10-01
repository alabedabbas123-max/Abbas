package com.jcraft.jsch;

public abstract class Channel implements java.lang.Runnable {
    private static java.util.Vector DW;
    static int j6;
    com.jcraft.jsch.IO EQ;
    int FH;
    volatile int Hw;
    volatile boolean J0;
    volatile boolean J8;
    volatile int Mr;
    volatile boolean QX;
    private com.jcraft.jsch.Session U2;
    volatile int VH;
    volatile boolean Ws;
    volatile boolean XL;
    volatile int Zo;
    int a8;
    volatile int aM;
    volatile int gn;
    volatile int j3;
    volatile int tp;
    volatile long u7;
    protected byte[] v5;
    java.lang.Thread we;

    class MyPipedInputStream extends java.io.PipedInputStream {
        private int DW;
        final com.jcraft.jsch.Channel FH;
        private int j6;

        MyPipedInputStream(com.jcraft.jsch.Channel r1, int r2) {
            this.FH = r1;
            this.j6 = 1024;
            this.DW = this.j6;
            ((java.io.PipedInputStream) this).buffer = new byte[r2];
            this.j6 = r2;
            this.DW = r2;
        }

        MyPipedInputStream(com.jcraft.jsch.Channel r1, int r2, int r3) {
            this(r1, r2);
            this.DW = r3;
        }

        MyPipedInputStream(com.jcraft.jsch.Channel r1, java.io.PipedOutputStream r2, int r3) {
            this.FH = r1;
            super(r2);
            this.j6 = 1024;
            this.DW = this.j6;
            ((java.io.PipedInputStream) this).buffer = new byte[r3];
            this.j6 = r3;
        }

        private int DW() {
            int r0 = ((java.io.PipedInputStream) this).out;
            int r1 = ((java.io.PipedInputStream) this).in;
            if (r0 >= r1) goto L6;
            r0 = ((java.io.PipedInputStream) this).buffer.length;
        L12:
            return r0 - r1;
        L6:
            if (r1 < r0) goto L8;
            return 0;
        L8:
            if (r1 != (-1)) goto L12;
            return ((java.io.PipedInputStream) this).buffer.length;
        }

        public synchronized void j6() {
            monitor-enter(this);
        L11:
            th = move-exception;
            throw th;
        L4:
            if (available() == 0) goto L8;
            monitor-exit(this);
            return;
        L8:
            ((java.io.PipedInputStream) this).in = 0;     // Catch: java.lang.Throwable -> L11
            ((java.io.PipedInputStream) this).out = 0;     // Catch: java.lang.Throwable -> L11
            byte[] r1 = ((java.io.PipedInputStream) this).buffer;     // Catch: java.lang.Throwable -> L11
            int r2 = ((java.io.PipedInputStream) this).in;     // Catch: java.lang.Throwable -> L11
            ((java.io.PipedInputStream) this).in = r2 + 1;     // Catch: java.lang.Throwable -> L11
            r1[r2] = 0;     // Catch: java.lang.Throwable -> L11
            read();     // Catch: java.lang.Throwable -> L11
            monitor-exit(this);
        }

        synchronized void j6(int r6) {
            monitor-enter(this);
            int r0 = DW();     // Catch: java.lang.Throwable -> L38
            if (r0 >= r6) goto L29;
            int r1 = ((java.io.PipedInputStream) this).buffer.length - r0;     // Catch: java.lang.Throwable -> L38
            int r2 = ((java.io.PipedInputStream) this).buffer.length;     // Catch: java.lang.Throwable -> L38
        L7:
            if ((r2 - r1) >= r6) goto L9;
            r2 = r2 * 2;     // Catch: java.lang.Throwable -> L38
            goto L7
        L9:
            if (r2 <= this.DW) goto L12;
            r2 = this.DW;     // Catch: java.lang.Throwable -> L38
        L12:
            if ((r2 - r1) >= r6) goto L15;
            monitor-exit(this);
            return;
        L15:
            byte[] r7 = new byte[r2];     // Catch: java.lang.Throwable -> L38
            if (((java.io.PipedInputStream) this).out >= ((java.io.PipedInputStream) this).in) goto L19;
            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, 0, r7, 0, ((java.io.PipedInputStream) this).buffer.length);     // Catch: java.lang.Throwable -> L38
        L26:
            ((java.io.PipedInputStream) this).buffer = r7;     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(this);
            return;
        L19:
            if (((java.io.PipedInputStream) this).in >= ((java.io.PipedInputStream) this).out) goto L24;
            if (((java.io.PipedInputStream) this).in == (-1)) goto L26;
            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, 0, r7, 0, ((java.io.PipedInputStream) this).in);     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, ((java.io.PipedInputStream) this).out, r7, r7.length - (((java.io.PipedInputStream) this).buffer.length - ((java.io.PipedInputStream) this).out), ((java.io.PipedInputStream) this).buffer.length - ((java.io.PipedInputStream) this).out);     // Catch: java.lang.Throwable -> L38
            ((java.io.PipedInputStream) this).out = r7.length - (((java.io.PipedInputStream) this).buffer.length - ((java.io.PipedInputStream) this).out);     // Catch: java.lang.Throwable -> L38
            goto L26
        L24:
            if (((java.io.PipedInputStream) this).in != ((java.io.PipedInputStream) this).out) goto L26;
            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, 0, r7, 0, ((java.io.PipedInputStream) this).buffer.length);     // Catch: java.lang.Throwable -> L38
            ((java.io.PipedInputStream) this).in = ((java.io.PipedInputStream) this).buffer.length;     // Catch: java.lang.Throwable -> L38
            goto L26
        L29:
            if (((java.io.PipedInputStream) this).buffer.length != r0) goto L36;
            if (r0 <= this.j6) goto L36;
            int r3 = r0 / 2;     // Catch: java.lang.Throwable -> L38
            if (r3 >= this.j6) goto L35;
            r3 = this.j6;     // Catch: java.lang.Throwable -> L38
        L35:
            ((java.io.PipedInputStream) this).buffer = new byte[r3];     // Catch: java.lang.Throwable -> L38
        L38:
            th = move-exception;
            throw th;
        }
    }

    class PassiveInputStream extends com.jcraft.jsch.Channel.MyPipedInputStream {
        final com.jcraft.jsch.Channel Hw;
        java.io.PipedOutputStream out;

        PassiveInputStream(com.jcraft.jsch.Channel r1, java.io.PipedOutputStream r2, int r3) {
            this.Hw = r1;
            super(r1, r2, r3);
            this.out = r2;
        }

        @Override
        public void close() {
            java.io.PipedOutputStream r0 = this.out;
            if (r0 == null) goto L5;
            r0.close();
        L5:
            this.out = null;
        }
    }

    class PassiveOutputStream extends java.io.PipedOutputStream {
        final com.jcraft.jsch.Channel DW;
        private com.jcraft.jsch.Channel.MyPipedInputStream j6;

        PassiveOutputStream(com.jcraft.jsch.Channel r1, java.io.PipedInputStream r2, boolean r3) {
            this.DW = r1;
            super(r2);
            this.j6 = null;
            if (r3 == true) goto L5;
            return;
        L5:
            if ((r2 instanceof com.jcraft.jsch.Channel.MyPipedInputStream) == false) goto L9;
            this.j6 = (com.jcraft.jsch.Channel.MyPipedInputStream) r2;
            return;
        }

        @Override
        public void write(int r3) {
            com.jcraft.jsch.Channel.MyPipedInputStream r0 = this.j6;
            if (r0 == null) goto L5;
            r0.j6(1);
        L5:
            super.write(r3);
        }

        @Override
        public void write(byte[] r2, int r3, int r4) {
            com.jcraft.jsch.Channel.MyPipedInputStream r0 = this.j6;
            if (r0 == null) goto L5;
            r0.j6(r4);
        L5:
            super.write(r2, r3, r4);
        }
    }

    static {
        DW = new java.util.Vector();
    }

    Channel() {
        this.Hw = -1;
        this.v5 = com.jcraft.jsch.Util.FH("foo");
        this.Zo = 1048576;
        this.VH = this.Zo;
        this.gn = 16384;
        this.u7 = 0;
        this.tp = 0;
        this.EQ = null;
        this.we = null;
        this.J0 = false;
        this.J8 = false;
        this.Ws = false;
        this.QX = false;
        this.XL = false;
        this.aM = -1;
        this.j3 = 0;
        this.Mr = 0;
        this.a8 = 0;
        java.util.Vector r0 = DW;
        monitor-enter(r0);
        int r1 = j6;     // Catch: java.lang.Throwable -> L7
        j6 = r1 + 1;     // Catch: java.lang.Throwable -> L7
        this.FH = r1;     // Catch: java.lang.Throwable -> L7
        DW.addElement(this);     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    static com.jcraft.jsch.Channel j6(int r4, com.jcraft.jsch.Session r5) {
        java.util.Vector r0 = DW;
        monitor-enter(r0);
        int r1 = 0;
    L22:
    L17:
        th = move-exception;
        throw th;
    L6:
        if (r1 >= DW.size()) goto L7;
        com.jcraft.jsch.Channel r2 = (com.jcraft.jsch.Channel) DW.elementAt(r1);     // Catch: java.lang.Throwable -> L17
        if (r2.FH != r4) goto L16;
        if (r2.U2 != r5) goto L16;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L17
        return r2;
    L16:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L17
        goto L22
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L17
        return null;
    }

    static com.jcraft.jsch.Channel j6(java.lang.String r1) {
        if (r1.equals("session") == false) goto L7;
        return new com.jcraft.jsch.ChannelSession();
    L7:
        if (r1.equals("shell") == false) goto L11;
        return new com.jcraft.jsch.ChannelShell();
    L11:
        if (r1.equals("exec") == false) goto L15;
        return new com.jcraft.jsch.ChannelExec();
    L15:
        if (r1.equals("x11") == false) goto L19;
        return new com.jcraft.jsch.ChannelX11();
    L19:
        if (r1.equals("auth-agent@openssh.com") == false) goto L23;
        return new com.jcraft.jsch.ChannelAgentForwarding();
    L23:
        if (r1.equals("direct-tcpip") == false) goto L27;
        return new com.jcraft.jsch.ChannelDirectTCPIP();
    L27:
        if (r1.equals("forwarded-tcpip") == false) goto L31;
        return new com.jcraft.jsch.ChannelForwardedTCPIP();
    L31:
        if (r1.equals("sftp") == false) goto L35;
        return new com.jcraft.jsch.ChannelSftp();
    L35:
        if (r1.equals("subsystem") == true) goto L37;
        return null;
    L37:
        return new com.jcraft.jsch.ChannelSubsystem();
    }

    static void j6(com.jcraft.jsch.Channel r2) {
        java.util.Vector r0 = DW;
        monitor-enter(r0);
        DW.removeElement(r2);     // Catch: java.lang.Throwable -> L7
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    static void j6(com.jcraft.jsch.Session r7) {
        java.util.Vector r0 = DW;
        monitor-enter(r0);
        com.jcraft.jsch.Channel[] r1 = new com.jcraft.jsch.Channel[DW.size()];     // Catch: java.lang.Throwable -> L17
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r3 >= DW.size()) goto L7;
        com.jcraft.jsch.Channel r5 = (com.jcraft.jsch.Channel) DW.elementAt(r3);     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L17
        if (r5.U2 != r7) goto L16;
        int r6 = r4 + 1;
        r1[r4] = r5;     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L17
    L15:
        r4 = r6;
    L16:
        r3 = r3 + 1;
        goto L6
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L17
    L8:
        if (r2 >= r4) goto L9;
        r1[r2].DW();
        r2 = r2 + 1;
        goto L8
    L9:
        return;
    L17:
        th = move-exception;
        throw th;
    }

    public void DW() {
        monitor-enter(this);     // Catch: java.lang.Throwable -> L20
    L17:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L20
    L4:
        if (this.QX == true) goto L9;
        monitor-exit(this);     // Catch: java.lang.Throwable -> L17
        j6(this);
        return;
    L9:
        this.QX = false;     // Catch: java.lang.Throwable -> L17
        monitor-exit(this);     // Catch: java.lang.Throwable -> L17
        j6();     // Catch: java.lang.Throwable -> L20
        this.J0 = true;     // Catch: java.lang.Throwable -> L20
        this.J8 = true;     // Catch: java.lang.Throwable -> L20
        this.we = null;     // Catch: java.lang.Throwable -> L20
        if (this.EQ == null) goto L15;
        this.EQ.j6();     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L20
    L15:
        j6(this);
        return;
    L20:
        th = move-exception;
        j6(this);
        throw th;
    }

    protected void DW(int r4) {
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(100);     // Catch: java.lang.Exception -> L4
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);     // Catch: java.lang.Exception -> L4
        r1.DW();     // Catch: java.lang.Exception -> L4
        r0.j6((byte) 92);     // Catch: java.lang.Exception -> L4
        r0.FH(tp());     // Catch: java.lang.Exception -> L4
        r0.FH(r4);     // Catch: java.lang.Exception -> L4
        r0.Hw(com.jcraft.jsch.Util.FH("open failed"));     // Catch: java.lang.Exception -> L4
        r0.Hw(com.jcraft.jsch.Util.FH);     // Catch: java.lang.Exception -> L4
        EQ().DW(r1);     // Catch: java.lang.Exception -> L4
        return;
    }

    synchronized void DW(long r1) {
        monitor-enter(this);
        this.u7 = r1;     // Catch: java.lang.Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    void DW(com.jcraft.jsch.Session r1) {
        this.U2 = r1;
    }

    void DW(byte[] r2, int r3, int r4) {
        this.EQ.FH(r2, r3, r4);     // Catch: java.lang.NullPointerException -> L4
        return;
    }

    public com.jcraft.jsch.Session EQ() {
        com.jcraft.jsch.Session r0 = this.U2;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new com.jcraft.jsch.JSchException("session is not available");
    }

    void FH() {
        if (this.J0 == false) goto L5;
        return;
    L5:
        this.J0 = true;
        int r0 = tp();
        if (r0 != (-1)) goto L22;
        return;
    L22:
        com.jcraft.jsch.Buffer r1 = new com.jcraft.jsch.Buffer(100);     // Catch: java.lang.Exception -> L19
        com.jcraft.jsch.Packet r2 = new com.jcraft.jsch.Packet(r1);     // Catch: java.lang.Exception -> L19
        r2.DW();     // Catch: java.lang.Exception -> L19
        r1.j6((byte) 96);     // Catch: java.lang.Exception -> L19
        r1.FH(r0);     // Catch: java.lang.Exception -> L19
        monitor-enter(this);     // Catch: java.lang.Exception -> L19
    L15:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L19
        goto L24
    L11:
        if (this.Ws == true) goto L13;
        EQ().DW(r2);     // Catch: java.lang.Throwable -> L15
    L13:
        monitor-exit(this);     // Catch: java.lang.Throwable -> L15
        goto L24
    L18:
        return;
    }

    void FH(int r1) {
        this.aM = r1;
    }

    void Hw() {
        this.J8 = true;
        this.EQ.FH();     // Catch: java.lang.NullPointerException -> L5
        return;
    }

    void Hw(int r1) {
        this.gn = r1;
    }

    public boolean J0() {
        com.jcraft.jsch.Session r0 = this.U2;
        if (r0 != null) goto L5;
    L10:
        return false;
    L5:
        if (r0.tp() == false) goto L10;
        if (this.QX == false) goto L10;
        return true;
    }

    protected void J8() {
        com.jcraft.jsch.Session r0 = EQ();
        if (r0.tp() == false) goto L50;
        r0.DW(v5());
        int r1 = 2000;
        long r2 = java.lang.System.currentTimeMillis();
        long r4 = this.Mr;
        if (r4 == 0) goto L7;
        r1 = 1;
    L7:
        monitor-enter(this);
    L53:
    L46:
        th = move-exception;
        throw th;
    L10:
        if (tp() != (-1)) goto L31;
        if (r0.tp() == false) goto L31;
        if (r1 <= 0) goto L31;
        if (r4 <= 0) goto L22;
        if ((java.lang.System.currentTimeMillis() - r2) <= r4) goto L22;
        r1 = 0;
    L22:
        if (r4 != 0) goto L24;
        long r10 = 10;
    L54:
        this.a8 = 1;     // Catch: java.lang.InterruptedException -> L52 java.lang.Throwable -> L27
        wait(r10);     // Catch: java.lang.InterruptedException -> L52 java.lang.Throwable -> L27
    L27:
        th = move-exception;
        this.a8 = 0;     // Catch: java.lang.Throwable -> L46
        throw th;     // Catch: java.lang.Throwable -> L46
    L26:
        this.a8 = 0;     // Catch: java.lang.Throwable -> L46
        r1 = r1 - 1;     // Catch: java.lang.Throwable -> L46
        goto L53
    L24:
        r10 = r4;
    L31:
        monitor-exit(this);     // Catch: java.lang.Throwable -> L46
        if (r0.tp() == false) goto L45;
        if (tp() == (-1)) goto L43;
        if (this.XL == false) goto L41;
        this.QX = true;
        return;
    L41:
        throw new com.jcraft.jsch.JSchException("channel is not opened.");
    L43:
        throw new com.jcraft.jsch.JSchException("channel is not opened.");
    L45:
        throw new com.jcraft.jsch.JSchException("session is down");
    L50:
        throw new com.jcraft.jsch.JSchException("session is down");
    }

    public void QX() {
    }

    public java.io.InputStream VH() {
        int r1 = java.lang.Integer.parseInt(EQ().DW("max_input_buffer_size"));     // Catch: java.lang.Exception -> L5
    L6:
        com.jcraft.jsch.Channel.MyPipedInputStream r2 = new com.jcraft.jsch.Channel.MyPipedInputStream(this, 32768, r1);
        if (32768 >= r1) goto L9;
        boolean r0 = true;
    L10:
        this.EQ.j6(new com.jcraft.jsch.Channel.PassiveOutputStream(this, r2, r0), false);
        return r2;
    L9:
        r0 = false;
    L5:
        r1 = 32768;
        goto L6
    }

    synchronized void VH(int r1) {
        monitor-enter(this);
        this.Hw = r1;     // Catch: java.lang.Throwable -> L8
        if (this.a8 <= 0) goto L6;
        notifyAll();     // Catch: java.lang.Throwable -> L8
    L6:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    protected void Ws() {
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(100);
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
        r1.DW();
        r0.j6((byte) 91);
        r0.FH(tp());
        r0.FH(this.FH);
        r0.FH(this.VH);
        r0.FH(this.gn);
        EQ().DW(r1);
    }

    public int Zo() {
        return this.aM;
    }

    void Zo(int r1) {
        this.Zo = r1;
    }

    public java.io.InputStream gn() {
        int r1 = java.lang.Integer.parseInt(EQ().DW("max_input_buffer_size"));     // Catch: java.lang.Exception -> L5
    L6:
        com.jcraft.jsch.Channel.MyPipedInputStream r2 = new com.jcraft.jsch.Channel.MyPipedInputStream(this, 32768, r1);
        if (32768 >= r1) goto L9;
        boolean r0 = true;
    L10:
        this.EQ.DW(new com.jcraft.jsch.Channel.PassiveOutputStream(this, r2, r0), false);
        return r2;
    L9:
        r0 = false;
    L5:
        r1 = 32768;
        goto L6
    }

    void gn(int r1) {
        this.tp = r1;
    }

    void j6() {
        if (this.Ws == false) goto L5;
        return;
    L5:
        this.Ws = true;
        this.J8 = true;
        this.J0 = true;
        int r0 = tp();
        if (r0 != (-1)) goto L20;
        return;
    L20:
        com.jcraft.jsch.Buffer r1 = new com.jcraft.jsch.Buffer(100);     // Catch: java.lang.Exception -> L17
        com.jcraft.jsch.Packet r2 = new com.jcraft.jsch.Packet(r1);     // Catch: java.lang.Exception -> L17
        r2.DW();     // Catch: java.lang.Exception -> L17
        r1.j6((byte) 97);     // Catch: java.lang.Exception -> L17
        r1.FH(r0);     // Catch: java.lang.Exception -> L17
        monitor-enter(this);     // Catch: java.lang.Exception -> L17
        EQ().DW(r2);     // Catch: java.lang.Throwable -> L13
        monitor-exit(this);     // Catch: java.lang.Throwable -> L13
        goto L22
    L16:
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L17
    }

    public void j6(int r3) {
        this.Mr = r3;
        J8();     // Catch: java.lang.Exception -> L5
        QX();     // Catch: java.lang.Exception -> L5
        return;
    L5:
        e = move-exception;
        this.QX = false;
        DW();
        if ((e instanceof com.jcraft.jsch.JSchException) == false) goto L11;
        throw ((com.jcraft.jsch.JSchException) e);
    L11:
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    }

    synchronized void j6(long r3) {
        monitor-enter(this);
        this.u7 += r3;     // Catch: java.lang.Throwable -> L8
        if (this.a8 <= 0) goto L6;
        notifyAll();     // Catch: java.lang.Throwable -> L8
    L6:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    void j6(com.jcraft.jsch.Buffer r3) {
        VH(r3.FH());
        DW(r3.EQ());
        gn(r3.FH());
    }

    void j6(byte[] r2, int r3, int r4) {
        this.EQ.DW(r2, r3, r4);     // Catch: java.lang.NullPointerException -> L4
        return;
    }

    @Override
    public void run() {
    }

    int tp() {
        return this.Hw;
    }

    public java.io.OutputStream u7() {
        return new com.jcraft.jsch.Channel.AnonymousClass1(this, this);
    }

    protected com.jcraft.jsch.Packet v5() {
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer(100);
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
        r1.DW();
        r0.j6((byte) 90);
        r0.Hw(this.v5);
        r0.FH(this.FH);
        r0.FH(this.VH);
        r0.FH(this.gn);
        return r1;
    }

    void v5(int r1) {
        this.VH = r1;
    }

    void we() {
    }
}
