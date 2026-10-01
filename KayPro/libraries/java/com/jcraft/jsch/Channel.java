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
            int r0 = 0;
            int r1 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = ((java.io.PipedInputStream) this).out;
                        r1 = ((java.io.PipedInputStream) this).in;
                        if (r0 >= r1) { $pc0 = 6; continue $sw0; }
                        r0 = ((java.io.PipedInputStream) this).buffer.length;
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        return r0 - r1;
                    }
                    case 6: {
                        if (r1 < r0) { $pc0 = 8; continue $sw0; }
                        return 0;
                    }
                    case 8: {
                        if (r1 != (-1)) { $pc0 = 12; continue $sw0; }
                        return ((java.io.PipedInputStream) this).buffer.length;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public synchronized void j6() {
            byte[] r1 = null;
            int r2 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        monitor-enter(this);
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (available() == 0) { $pc1 = 8; continue $sw1; }
                        monitor-exit(this);
                        return;
                    }
                    case 8: {
                        try {
                            ((java.io.PipedInputStream) this).in = 0;
                            ((java.io.PipedInputStream) this).out = 0;
                            r1 = ((java.io.PipedInputStream) this).buffer;
                            r2 = ((java.io.PipedInputStream) this).in;
                            ((java.io.PipedInputStream) this).in = r2 + 1;
                            r1[r2] = 0;
                            read();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 11; continue $sw1;
                        }
                        monitor-exit(this);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        synchronized void j6(int r6) {
            int r0 = 0;
            int r1 = 0;
            int r2 = 0;
            byte[] r7 = null;
            int r3 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        monitor-enter(this);
                        try {
                            r0 = DW();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        if (r0 >= r6) { $pc2 = 29; continue $sw2; }
                        try {
                            r1 = ((java.io.PipedInputStream) this).buffer.length - r0;
                            r2 = ((java.io.PipedInputStream) this).buffer.length;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        $pc2 = 7; continue $sw2;
                    }
                    case 7: {
                        if ((r2 - r1) >= r6) { $pc2 = 9; continue $sw2; }
                        try {
                            r2 = r2 * 2;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        { $pc2 = 7; continue $sw2; }
                    }
                    case 9: {
                        if (r2 <= this.DW) { $pc2 = 12; continue $sw2; }
                        try {
                            r2 = this.DW;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        if ((r2 - r1) >= r6) { $pc2 = 15; continue $sw2; }
                        monitor-exit(this);
                        return;
                    }
                    case 15: {
                        try {
                            r7 = new byte[r2];
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        if (((java.io.PipedInputStream) this).out >= ((java.io.PipedInputStream) this).in) { $pc2 = 19; continue $sw2; }
                        try {
                            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, 0, r7, 0, ((java.io.PipedInputStream) this).buffer.length);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        $pc2 = 26; continue $sw2;
                    }
                    case 26: {
                        try {
                            ((java.io.PipedInputStream) this).buffer = r7;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        $pc2 = 36; continue $sw2;
                    }
                    case 36: {
                        monitor-exit(this);
                        return;
                    }
                    case 19: {
                        if (((java.io.PipedInputStream) this).in >= ((java.io.PipedInputStream) this).out) { $pc2 = 24; continue $sw2; }
                        if (((java.io.PipedInputStream) this).in == (-1)) { $pc2 = 26; continue $sw2; }
                        try {
                            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, 0, r7, 0, ((java.io.PipedInputStream) this).in);
                            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, ((java.io.PipedInputStream) this).out, r7, r7.length - (((java.io.PipedInputStream) this).buffer.length - ((java.io.PipedInputStream) this).out), ((java.io.PipedInputStream) this).buffer.length - ((java.io.PipedInputStream) this).out);
                            ((java.io.PipedInputStream) this).out = r7.length - (((java.io.PipedInputStream) this).buffer.length - ((java.io.PipedInputStream) this).out);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        { $pc2 = 26; continue $sw2; }
                    }
                    case 24: {
                        if (((java.io.PipedInputStream) this).in != ((java.io.PipedInputStream) this).out) { $pc2 = 26; continue $sw2; }
                        try {
                            java.lang.System.arraycopy(((java.io.PipedInputStream) this).buffer, 0, r7, 0, ((java.io.PipedInputStream) this).buffer.length);
                            ((java.io.PipedInputStream) this).in = ((java.io.PipedInputStream) this).buffer.length;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        { $pc2 = 26; continue $sw2; }
                    }
                    case 29: {
                        if (((java.io.PipedInputStream) this).buffer.length != r0) { $pc2 = 36; continue $sw2; }
                        if (r0 <= this.j6) { $pc2 = 36; continue $sw2; }
                        try {
                            r3 = r0 / 2;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        if (r3 >= this.j6) { $pc2 = 35; continue $sw2; }
                        try {
                            r3 = this.j6;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        $pc2 = 35; continue $sw2;
                    }
                    case 35: {
                        try {
                            ((java.io.PipedInputStream) this).buffer = new byte[r3];
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 38; continue $sw2;
                        }
                        $pc2 = 38; continue $sw2;
                    }
                    case 38: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.io.PipedOutputStream r0 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.out;
                        if (r0 == null) { $pc3 = 5; continue $sw3; }
                        r0.close();
                        $pc3 = 5; continue $sw3;
                    }
                    case 5: {
                        this.out = null;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    class PassiveOutputStream extends java.io.PipedOutputStream {
        final com.jcraft.jsch.Channel DW;
        private com.jcraft.jsch.Channel.MyPipedInputStream j6;

        PassiveOutputStream(com.jcraft.jsch.Channel r1, java.io.PipedInputStream r2, boolean r3) {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        this.DW = r1;
                        super(r2);
                        this.j6 = null;
                        if (r3 == true) { $pc4 = 5; continue $sw4; }
                        return;
                    }
                    case 5: {
                        if ((r2 instanceof com.jcraft.jsch.Channel.MyPipedInputStream) == false) { $pc4 = 9; continue $sw4; }
                        this.j6 = (com.jcraft.jsch.Channel.MyPipedInputStream) r2;
                        return;
                    }
                    case 9: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void write(int r3) {
            com.jcraft.jsch.Channel.MyPipedInputStream r0 = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = this.j6;
                        if (r0 == null) { $pc5 = 5; continue $sw5; }
                        r0.j6(1);
                        $pc5 = 5; continue $sw5;
                    }
                    case 5: {
                        super.write(r3);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void write(byte[] r2, int r3, int r4) {
            com.jcraft.jsch.Channel.MyPipedInputStream r0 = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        r0 = this.j6;
                        if (r0 == null) { $pc6 = 5; continue $sw6; }
                        r0.j6(r4);
                        $pc6 = 5; continue $sw6;
                    }
                    case 5: {
                        super.write(r2, r3, r4);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        DW = new java.util.Vector();
    }

    Channel() {
        java.util.Vector r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
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
                    r0 = DW;
                    monitor-enter(r0);
                    try {
                        r1 = j6;
                        j6 = r1 + 1;
                        this.FH = r1;
                        DW.addElement(this);
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 7; continue $sw7;
                    }
                    return;
                }
                case 7: {
                    th = $ex7;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.jcraft.jsch.Channel j6(int r4, com.jcraft.jsch.Session r5) {
        java.util.Vector r0 = null;
        int r1 = 0;
        com.jcraft.jsch.Channel r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = DW;
                    monitor-enter(r0);
                    r1 = 0;
                    $pc8 = 22; continue $sw8;
                }
                case 22: {
                    $pc8 = 17; continue $sw8;
                }
                case 17: {
                    th = $ex8;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 6: {
                    if (r1 >= DW.size()) { $pc8 = 7; continue $sw8; }
                    try {
                        r2 = (com.jcraft.jsch.Channel) DW.elementAt(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    if (r2.FH != r4) { $pc8 = 16; continue $sw8; }
                    if (r2.U2 != r5) { $pc8 = 16; continue $sw8; }
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    return r2;
                }
                case 16: {
                    try {
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    { $pc8 = 22; continue $sw8; }
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.jcraft.jsch.Channel j6(java.lang.String r1) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r1.equals("session") == false) { $pc9 = 7; continue $sw9; }
                    return new com.jcraft.jsch.ChannelSession();
                }
                case 7: {
                    if (r1.equals("shell") == false) { $pc9 = 11; continue $sw9; }
                    return new com.jcraft.jsch.ChannelShell();
                }
                case 11: {
                    if (r1.equals("exec") == false) { $pc9 = 15; continue $sw9; }
                    return new com.jcraft.jsch.ChannelExec();
                }
                case 15: {
                    if (r1.equals("x11") == false) { $pc9 = 19; continue $sw9; }
                    return new com.jcraft.jsch.ChannelX11();
                }
                case 19: {
                    if (r1.equals("auth-agent@openssh.com") == false) { $pc9 = 23; continue $sw9; }
                    return new com.jcraft.jsch.ChannelAgentForwarding();
                }
                case 23: {
                    if (r1.equals("direct-tcpip") == false) { $pc9 = 27; continue $sw9; }
                    return new com.jcraft.jsch.ChannelDirectTCPIP();
                }
                case 27: {
                    if (r1.equals("forwarded-tcpip") == false) { $pc9 = 31; continue $sw9; }
                    return new com.jcraft.jsch.ChannelForwardedTCPIP();
                }
                case 31: {
                    if (r1.equals("sftp") == false) { $pc9 = 35; continue $sw9; }
                    return new com.jcraft.jsch.ChannelSftp();
                }
                case 35: {
                    if (r1.equals("subsystem") == true) { $pc9 = 37; continue $sw9; }
                    return null;
                }
                case 37: {
                    return new com.jcraft.jsch.ChannelSubsystem();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.jcraft.jsch.Channel r2) {
        java.util.Vector r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = DW;
                    monitor-enter(r0);
                    try {
                        DW.removeElement(r2);
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 7; continue $sw10;
                    }
                    return;
                }
                case 7: {
                    th = $ex10;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.jcraft.jsch.Session r7) {
        java.util.Vector r0 = null;
        com.jcraft.jsch.Channel[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        com.jcraft.jsch.Channel r5 = null;
        int r6 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = DW;
                    monitor-enter(r0);
                    try {
                        r1 = new com.jcraft.jsch.Channel[DW.size()];
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 17; continue $sw11;
                    }
                    r2 = 0;
                    r3 = 0;
                    r4 = 0;
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (r3 >= DW.size()) { $pc11 = 7; continue $sw11; }
                    try {
                        r5 = (com.jcraft.jsch.Channel) DW.elementAt(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 23; continue $sw11; }
                        $pc11 = 17; continue $sw11;
                    }
                    if (r5.U2 != r7) { $pc11 = 16; continue $sw11; }
                    r6 = r4 + 1;
                    try {
                        r1[r4] = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 22; continue $sw11; }
                        $pc11 = 17; continue $sw11;
                    }
                    $pc11 = 15; continue $sw11;
                }
                case 15: {
                    r4 = r6;
                    $pc11 = 16; continue $sw11;
                }
                case 16: {
                    r3 = r3 + 1;
                    { $pc11 = 6; continue $sw11; }
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 17; continue $sw11;
                    }
                    $pc11 = 8; continue $sw11;
                }
                case 8: {
                    if (r2 >= r4) { $pc11 = 9; continue $sw11; }
                    r1[r2].DW();
                    r2 = r2 + 1;
                    { $pc11 = 8; continue $sw11; }
                }
                case 9: {
                    return;
                }
                case 17: {
                    th = $ex11;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 22: {
                    $pc11 = 23; continue $sw11;
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    try {
                        monitor-enter(this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 20; continue $sw12;
                    }
                    $pc12 = 17; continue $sw12;
                }
                case 17: {
                    th = $ex12;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 20; continue $sw12;
                    }
                }
                case 4: {
                    if (this.QX == true) { $pc12 = 9; continue $sw12; }
                    try {
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 17; continue $sw12;
                    }
                    j6(this);
                    return;
                }
                case 9: {
                    try {
                        this.QX = false;
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 17; continue $sw12;
                    }
                    try {
                        j6();
                        this.J0 = true;
                        this.J8 = true;
                        this.we = null;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 20; continue $sw12;
                    }
                    if (this.EQ == null) { $pc12 = 15; continue $sw12; }
                    try {
                        this.EQ.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.Exception) { $pc12 = 23; continue $sw12; }
                        $pc12 = 20; continue $sw12;
                    }
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    j6(this);
                    return;
                }
                case 20: {
                    th = $ex12;
                    j6(this);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 23: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.u7 = r1;
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 6; continue $sw13;
                    }
                    monitor-exit(this);
                    return;
                }
                case 6: {
                    th = $ex13;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void DW(com.jcraft.jsch.Session r1) {
        this.U2 = r1;
    }

    void DW(byte[] r2, int r3, int r4) {
        this.EQ.FH(r2, r3, r4);     // Catch: java.lang.NullPointerException -> L4
        return;
    }

    public com.jcraft.jsch.Session EQ() {
        com.jcraft.jsch.Session r0 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = this.U2;
                    if (r0 == null) { $pc14 = 6; continue $sw14; }
                    return r0;
                }
                case 6: {
                    throw new com.jcraft.jsch.JSchException("session is not available");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void FH() {
        int r0 = 0;
        com.jcraft.jsch.Buffer r1 = null;
        com.jcraft.jsch.Packet r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (this.J0 == false) { $pc15 = 5; continue $sw15; }
                    return;
                }
                case 5: {
                    this.J0 = true;
                    r0 = tp();
                    if (r0 != (-1)) { $pc15 = 22; continue $sw15; }
                    return;
                }
                case 22: {
                    try {
                        r1 = new com.jcraft.jsch.Buffer(100);
                        r2 = new com.jcraft.jsch.Packet(r1);
                        r2.DW();
                        r1.j6((byte) 96);
                        r1.FH(r0);
                        monitor-enter(this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 19; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 15; continue $sw15;
                }
                case 15: {
                    th = $ex15;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 19; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc15 = 24; continue $sw15; }
                }
                case 11: {
                    if (this.Ws == true) { $pc15 = 13; continue $sw15; }
                    try {
                        EQ().DW(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 15; continue $sw15;
                    }
                    $pc15 = 13; continue $sw15;
                }
                case 13: {
                    try {
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 15; continue $sw15;
                    }
                    { $pc15 = 24; continue $sw15; }
                }
                case 18: {
                    return;
                }
                case 19: {
                    $pc15 = 24; continue $sw15;
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        com.jcraft.jsch.Session r0 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.U2;
                    if (r0 != null) { $pc16 = 5; continue $sw16; }
                    $pc16 = 10; continue $sw16;
                }
                case 10: {
                    return false;
                }
                case 5: {
                    if (r0.tp() == false) { $pc16 = 10; continue $sw16; }
                    if (this.QX == false) { $pc16 = 10; continue $sw16; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void J8() {
        com.jcraft.jsch.Session r0 = null;
        int r1 = 0;
        long r2 = 0L;
        long r4 = 0L;
        long r10 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = EQ();
                    if (r0.tp() == false) { $pc17 = 50; continue $sw17; }
                    r0.DW(v5());
                    r1 = 2000;
                    r2 = java.lang.System.currentTimeMillis();
                    r4 = this.Mr;
                    if (r4 == 0) { $pc17 = 7; continue $sw17; }
                    r1 = 1;
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    monitor-enter(this);
                    $pc17 = 53; continue $sw17;
                }
                case 53: {
                    $pc17 = 46; continue $sw17;
                }
                case 46: {
                    th = $ex17;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 10: {
                    if (tp() != (-1)) { $pc17 = 31; continue $sw17; }
                    if (r0.tp() == false) { $pc17 = 31; continue $sw17; }
                    if (r1 <= 0) { $pc17 = 31; continue $sw17; }
                    if (r4 <= 0) { $pc17 = 22; continue $sw17; }
                    if ((java.lang.System.currentTimeMillis() - r2) <= r4) { $pc17 = 22; continue $sw17; }
                    r1 = 0;
                    $pc17 = 22; continue $sw17;
                }
                case 22: {
                    if (r4 != 0) { $pc17 = 24; continue $sw17; }
                    r10 = 10;
                    $pc17 = 54; continue $sw17;
                }
                case 54: {
                    try {
                        this.a8 = 1;
                        wait(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc17 = 52; continue $sw17; }
                        $pc17 = 27; continue $sw17;
                    }
                    $pc17 = 27; continue $sw17;
                }
                case 27: {
                    th = $ex17;
                    try {
                        this.a8 = 0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 46; continue $sw17;
                    }
                }
                case 26: {
                    try {
                        this.a8 = 0;
                        r1 = r1 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 46; continue $sw17;
                    }
                    { $pc17 = 53; continue $sw17; }
                }
                case 24: {
                    r10 = r4;
                    $pc17 = 31; continue $sw17;
                }
                case 31: {
                    try {
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 46; continue $sw17;
                    }
                    if (r0.tp() == false) { $pc17 = 45; continue $sw17; }
                    if (tp() == (-1)) { $pc17 = 43; continue $sw17; }
                    if (this.XL == false) { $pc17 = 41; continue $sw17; }
                    this.QX = true;
                    return;
                }
                case 41: {
                    throw new com.jcraft.jsch.JSchException("channel is not opened.");
                }
                case 43: {
                    throw new com.jcraft.jsch.JSchException("channel is not opened.");
                }
                case 45: {
                    throw new com.jcraft.jsch.JSchException("session is down");
                }
                case 50: {
                    throw new com.jcraft.jsch.JSchException("session is down");
                }
                case 52: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void QX() {
    }

    public java.io.InputStream VH() {
        int r1 = 0;
        com.jcraft.jsch.Channel.MyPipedInputStream r2 = null;
        boolean r0 = false;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    try {
                        r1 = java.lang.Integer.parseInt(EQ().DW("max_input_buffer_size"));
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        if ($t instanceof java.lang.Exception) { $pc18 = 5; continue $sw18; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    r2 = new com.jcraft.jsch.Channel.MyPipedInputStream(this, 32768, r1);
                    if (32768 >= r1) { $pc18 = 9; continue $sw18; }
                    r0 = true;
                    $pc18 = 10; continue $sw18;
                }
                case 10: {
                    this.EQ.j6(new com.jcraft.jsch.Channel.PassiveOutputStream(this, r2, r0), false);
                    return r2;
                }
                case 9: {
                    r0 = false;
                    $pc18 = 5; continue $sw18;
                }
                case 5: {
                    r1 = 32768;
                    { $pc18 = 6; continue $sw18; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized void VH(int r1) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.Hw = r1;
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    if (this.a8 <= 0) { $pc19 = 6; continue $sw19; }
                    try {
                        notifyAll();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    monitor-exit(this);
                    return;
                }
                case 8: {
                    th = $ex19;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        int r1 = 0;
        com.jcraft.jsch.Channel.MyPipedInputStream r2 = null;
        boolean r0 = false;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    try {
                        r1 = java.lang.Integer.parseInt(EQ().DW("max_input_buffer_size"));
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.Exception) { $pc20 = 5; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    r2 = new com.jcraft.jsch.Channel.MyPipedInputStream(this, 32768, r1);
                    if (32768 >= r1) { $pc20 = 9; continue $sw20; }
                    r0 = true;
                    $pc20 = 10; continue $sw20;
                }
                case 10: {
                    this.EQ.DW(new com.jcraft.jsch.Channel.PassiveOutputStream(this, r2, r0), false);
                    return r2;
                }
                case 9: {
                    r0 = false;
                    $pc20 = 5; continue $sw20;
                }
                case 5: {
                    r1 = 32768;
                    { $pc20 = 6; continue $sw20; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void gn(int r1) {
        this.tp = r1;
    }

    void j6() {
        int r0 = 0;
        com.jcraft.jsch.Buffer r1 = null;
        com.jcraft.jsch.Packet r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (this.Ws == false) { $pc21 = 5; continue $sw21; }
                    return;
                }
                case 5: {
                    this.Ws = true;
                    this.J8 = true;
                    this.J0 = true;
                    r0 = tp();
                    if (r0 != (-1)) { $pc21 = 20; continue $sw21; }
                    return;
                }
                case 20: {
                    try {
                        r1 = new com.jcraft.jsch.Buffer(100);
                        r2 = new com.jcraft.jsch.Packet(r1);
                        r2.DW();
                        r1.j6((byte) 97);
                        r1.FH(r0);
                        monitor-enter(this);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.lang.Exception) { $pc21 = 17; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        EQ().DW(r2);
                        monitor-exit(this);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 13; continue $sw21;
                    }
                    { $pc21 = 22; continue $sw21; }
                }
                case 16: {
                    return;
                }
                case 13: {
                    th = $ex21;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        if ($t instanceof java.lang.Exception) { $pc21 = 17; continue $sw21; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 17: {
                    $pc21 = 22; continue $sw21;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    this.Mr = r3;
                    try {
                        J8();
                        QX();
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.lang.Exception) { $pc22 = 5; continue $sw22; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    e = $ex22;
                    this.QX = false;
                    DW();
                    if ((e instanceof com.jcraft.jsch.JSchException) == false) { $pc22 = 11; continue $sw22; }
                    throw ((com.jcraft.jsch.JSchException) e);
                }
                case 11: {
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized void j6(long r3) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.u7 += r3;
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    if (this.a8 <= 0) { $pc23 = 6; continue $sw23; }
                    try {
                        notifyAll();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    monitor-exit(this);
                    return;
                }
                case 8: {
                    th = $ex23;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
