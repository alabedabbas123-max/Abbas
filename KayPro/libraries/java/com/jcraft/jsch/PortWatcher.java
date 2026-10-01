package com.jcraft.jsch;

class PortWatcher implements java.lang.Runnable {
    private static java.net.InetAddress DW;
    private static java.util.Vector j6;
    com.jcraft.jsch.Session FH;
    int Hw;
    java.net.InetAddress VH;
    java.lang.String Zo;
    java.lang.Runnable gn;
    int tp;
    java.net.ServerSocket u7;
    int v5;

    static {
        j6 = new java.util.Vector();
        DW = null;
        DW = java.net.InetAddress.getByName("0.0.0.0");     // Catch: java.net.UnknownHostException -> L5
        return;
    }

    PortWatcher(com.jcraft.jsch.Session r2, java.lang.String r3, int r4, java.lang.String r5, int r6, com.jcraft.jsch.ServerSocketFactory r7) {
        java.net.ServerSocket r8 = null;
        int r9 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.tp = 0;
                    this.FH = r2;
                    this.Hw = r4;
                    this.Zo = r5;
                    this.v5 = r6;
                    try {
                        this.VH = java.net.InetAddress.getByName(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 != null) { $pc0 = 6; continue $sw0; }
                    try {
                        r8 = new java.net.ServerSocket(r4, 0, this.VH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    try {
                        this.u7 = r8;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 != 0) { $pc0 = 18; continue $sw0; }
                    r9 = this.u7.getLocalPort();
                    if (r9 == (-1)) { $pc0 = 19; continue $sw0; }
                    this.Hw = r9;
                    return;
                }
                case 19: {
                    return;
                }
                case 18: {
                    return;
                }
                case 6: {
                    try {
                        r8 = r7.j6(r4, 0, this.VH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 13; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 13: {
                    e = $ex0;
                    throw new com.jcraft.jsch.JSchException("PortForwardingL: local port " + r3 + ":" + r4 + " cannot be bound.", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.jcraft.jsch.PortWatcher j6(com.jcraft.jsch.Session r5, java.lang.String r6, int r7) {
        synchronized (j6) {
            java.net.InetAddress r8 = null;
            java.util.Vector r0 = null;
            int r1 = 0;
            com.jcraft.jsch.PortWatcher r2 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            r8 = java.net.InetAddress.getByName(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.net.UnknownHostException) { $pc1 = 27; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        r0 = j6;
                        r1 = 0;
                        $pc1 = 33; continue $sw1;
                    }
                    case 33: {
                        $pc1 = 7; continue $sw1;
                    }
                    case 24: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 7: {
                        if (r1 >= j6.size()) { $pc1 = 8; continue $sw1; }
                        try {
                            r2 = (com.jcraft.jsch.PortWatcher) j6.elementAt(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 24; continue $sw1;
                        }
                        if (r2.FH != r5) { $pc1 = 23; continue $sw1; }
                        if (r2.Hw != r7) { $pc1 = 23; continue $sw1; }
                        if (DW == null) { $pc1 = 20; continue $sw1; }
                        if (r2.VH.equals(DW) == false) { $pc1 = 20; continue $sw1; }
                        $pc1 = 21; continue $sw1;
                    }
                    case 21: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 24; continue $sw1;
                        }
                        return r2;
                    }
                    case 20: {
                        if (r2.VH.equals(r8) == true) { $pc1 = 21; continue $sw1; }
                        $pc1 = 23; continue $sw1;
                    }
                    case 23: {
                        try {
                            r1 = r1 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 24; continue $sw1;
                        }
                        { $pc1 = 33; continue $sw1; }
                    }
                    case 8: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 24; continue $sw1;
                        }
                        return null;
                    }
                    case 27: {
                        e = $ex1;
                        throw new com.jcraft.jsch.JSchException("PortForwardingL: invalid address " + r6 + " specified.", e);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    static com.jcraft.jsch.PortWatcher j6(com.jcraft.jsch.Session r7, java.lang.String r8, int r9, java.lang.String r10, int r11, com.jcraft.jsch.ServerSocketFactory r12) {
        java.lang.String r2 = null;
        com.jcraft.jsch.PortWatcher r13 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r2 = j6(r8);
                    if (j6(r7, r2, r9) != null) { $pc2 = 7; continue $sw2; }
                    r13 = new com.jcraft.jsch.PortWatcher(r7, r2, r9, r10, r11, r12);
                    j6.addElement(r13);
                    return r13;
                }
                case 7: {
                    throw new com.jcraft.jsch.JSchException("PortForwardingL: local port " + r2 + ":" + r9 + " is already registered.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.lang.String r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 != null) { $pc3 = 4; continue $sw3; }
                    return r1;
                }
                case 4: {
                    if (r1.length() != 0) { $pc3 = 6; continue $sw3; }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    return "0.0.0.0";
                }
                case 6: {
                    if (r1.equals("*") == true) { $pc3 = 11; continue $sw3; }
                    if (r1.equals("localhost") == false) { $pc3 = 14; continue $sw3; }
                    return "127.0.0.1";
                }
                case 14: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.jcraft.jsch.Session r7) {
        synchronized (j6) {
            java.util.Vector r0 = null;
            com.jcraft.jsch.PortWatcher[] r1 = null;
            int r2 = 0;
            int r3 = 0;
            int r4 = 0;
            com.jcraft.jsch.PortWatcher r5 = null;
            com.jcraft.jsch.PortWatcher r8 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = j6;
                        try {
                            r1 = new com.jcraft.jsch.PortWatcher[j6.size()];
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        r2 = 0;
                        r3 = 0;
                        r4 = 0;
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        if (r3 >= j6.size()) { $pc4 = 7; continue $sw4; }
                        try {
                            r5 = (com.jcraft.jsch.PortWatcher) j6.elementAt(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        if (r5.FH != r7) { $pc4 = 14; continue $sw4; }
                        try {
                            r5.j6();
                            r1[r4] = r5;
                            r4 = r4 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        $pc4 = 14; continue $sw4;
                    }
                    case 14: {
                        try {
                            r3 = r3 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        $pc4 = 7; continue $sw4;
                    }
                    case 7: {
                        if (r2 >= r4) { $pc4 = 8; continue $sw4; }
                        try {
                            r8 = r1[r2];
                            j6.removeElement(r8);
                            r2 = r2 + 1;
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        { $pc4 = 7; continue $sw4; }
                    }
                    case 8: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 15; continue $sw4;
                        }
                        return;
                    }
                    case 15: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    void j6() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    this.gn = null;
                    if (this.u7 == null) { $pc5 = 6; continue $sw5; }
                    try {
                        this.u7.close();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 8; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        this.u7 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 8; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(int r1) {
        this.tp = r1;
    }

    @Override
    public void run() {
        java.net.Socket r0 = null;
        java.io.InputStream r1 = null;
        java.io.OutputStream r2 = null;
        com.jcraft.jsch.ChannelDirectTCPIP r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    this.gn = this;
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    if (this.gn == null) { $pc6 = 8; continue $sw6; }
                    try {
                        r0 = this.u7.accept();
                        r0.setTcpNoDelay(true);
                        r1 = r0.getInputStream();
                        r2 = r0.getOutputStream();
                        r3 = new com.jcraft.jsch.ChannelDirectTCPIP();
                        r3.we();
                        r3.j6(r1);
                        r3.j6(r2);
                        this.FH.j6(r3);
                        r3.DW(this.Zo);
                        r3.tp(this.v5);
                        r3.FH(r0.getInetAddress().getHostAddress());
                        r3.u7(r0.getPort());
                        r3.j6(this.tp);
                        r4 = r3.aM;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 10; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    j6();
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
