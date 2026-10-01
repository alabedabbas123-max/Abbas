package com.jcraft.jsch;

public class Session implements java.lang.Runnable {
    private static final byte[] DW = null;
    private static final byte[] FH = null;
    static com.jcraft.jsch.Random j6;
    private int BT;
    private int CU;
    private byte[] EQ;
    private com.jcraft.jsch.Session.GlobalRequestReply Eq;
    private byte[] Hw;
    private com.jcraft.jsch.IdentityRepository I;
    private byte[] J0;
    private byte[] J8;
    boolean KD;
    private com.jcraft.jsch.MAC Mr;
    private int Mz;
    java.lang.String OW;
    private boolean P8;
    private int QX;
    private long Qq;
    boolean SI;
    private com.jcraft.jsch.UserInfo Sf;
    private com.jcraft.jsch.MAC U2;
    private byte[] VH;
    private int Ws;
    private boolean XG;
    java.lang.String[] XL;
    java.lang.String XX;
    java.lang.Runnable Xa;
    private byte[] Zo;
    private byte[] a8;
    private com.jcraft.jsch.Cipher aM;
    int aj;
    int br;
    private com.jcraft.jsch.HostKeyRepository ca;
    com.jcraft.jsch.Packet cb;
    java.io.OutputStream cn;
    com.jcraft.jsch.SocketFactory dx;
    private com.jcraft.jsch.Proxy ef;
    private java.lang.Thread ei;
    private com.jcraft.jsch.Compression er;
    private int et;
    private int g3;
    private java.net.Socket gW;
    private byte[] gn;
    private com.jcraft.jsch.HostKey hz;
    private com.jcraft.jsch.Cipher j3;
    int[] jJ;
    byte[] kQ;
    private byte[] lg;
    java.lang.String lp;
    private java.lang.Object nw;
    private com.jcraft.jsch.Compression rN;
    java.io.InputStream ro;
    private java.util.Hashtable sG;
    com.jcraft.jsch.Buffer sh;
    int sy;
    private byte[] tp;
    private byte[] u7;
    private byte[] v5;
    private java.lang.String vJ;
    private volatile boolean vy;
    int[] wc;
    private byte[] we;
    protected boolean x9;
    com.jcraft.jsch.JSch yO;
    private com.jcraft.jsch.IO yS;

    private class Forwarding {
        int DW;
        java.lang.String FH;
        int Hw;
        java.lang.String j6;
        final com.jcraft.jsch.Session v5;

        private Forwarding(com.jcraft.jsch.Session r2) {
            this.v5 = r2;
            this.j6 = null;
            this.DW = -1;
            this.FH = null;
            this.Hw = -1;
        }

        Forwarding(com.jcraft.jsch.Session r1, com.jcraft.jsch.Session.Forwarding r2) {
            this(r1);
        }
    }

    private class GlobalRequestReply {
        private int DW;
        private int FH;
        final com.jcraft.jsch.Session Hw;
        private java.lang.Thread j6;

        private GlobalRequestReply(com.jcraft.jsch.Session r1) {
            this.Hw = r1;
            this.j6 = null;
            this.DW = -1;
            this.FH = 0;
        }

        GlobalRequestReply(com.jcraft.jsch.Session r1, com.jcraft.jsch.Session.GlobalRequestReply r2) {
            this(r1);
        }

        int DW() {
            return this.DW;
        }

        void DW(int r1) {
            this.DW = r1;
        }

        java.lang.Thread FH() {
            return this.j6;
        }

        int j6() {
            return this.FH;
        }

        void j6(int r1) {
            this.FH = r1;
        }

        void j6(java.lang.Thread r1) {
            this.j6 = r1;
            this.DW = -1;
        }
    }

    static {
        DW = com.jcraft.jsch.Util.FH("keepalive@jcraft.com");
        FH = com.jcraft.jsch.Util.FH("no-more-sessions@openssh.com");
    }

    Session(com.jcraft.jsch.JSch r6, java.lang.String r7, java.lang.String r8, int r9) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.v5 = com.jcraft.jsch.Util.FH("SSH-2.0-JSCH-0.1.51");
                    this.Ws = 0;
                    this.QX = 0;
                    this.XL = null;
                    this.BT = 0;
                    this.vy = false;
                    this.P8 = false;
                    this.ei = null;
                    this.nw = new java.lang.Object();
                    this.SI = false;
                    this.KD = false;
                    this.ro = null;
                    this.cn = null;
                    this.dx = null;
                    this.sG = null;
                    this.ef = null;
                    this.vJ = null;
                    this.g3 = 0;
                    this.Mz = 1;
                    this.I = null;
                    this.ca = null;
                    this.x9 = false;
                    this.Qq = 0;
                    this.sy = 6;
                    this.aj = 0;
                    this.lp = "127.0.0.1";
                    this.OW = "127.0.0.1";
                    this.br = 22;
                    this.XX = null;
                    this.kQ = null;
                    this.XG = false;
                    this.jJ = new int[1];
                    this.wc = new int[1];
                    this.et = 8;
                    this.CU = 8;
                    this.Eq = new com.jcraft.jsch.Session.GlobalRequestReply(this, null);
                    this.hz = null;
                    this.yO = r6;
                    this.sh = new com.jcraft.jsch.Buffer();
                    this.cb = new com.jcraft.jsch.Packet(this.sh);
                    this.XX = r7;
                    this.lp = r8;
                    this.OW = r8;
                    this.br = r9;
                    we();
                    if (this.XX != null) { $pc0 = 8; continue $sw0; }
                    try {
                        this.XX = (java.lang.String) java.lang.System.getProperties().get("user.name");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.SecurityException) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (this.XX == null) { $pc0 = 11; continue $sw0; }
                    return;
                }
                case 11: {
                    throw new com.jcraft.jsch.JSchException("username is not given.");
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private com.jcraft.jsch.KeyExchange DW(com.jcraft.jsch.Buffer r7) {
        int r0 = 0;
        byte[] r1 = null;
        int r8 = 0;
        byte[] r2 = null;
        java.lang.String[] r9 = null;
        com.jcraft.jsch.KeyExchange r10 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r7.FH();
                    if (r0 == r7.Hw()) { $pc1 = 5; continue $sw1; }
                    r7.j6();
                    this.VH = new byte[r7.FH - 5];
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r1 = r7.DW;
                    r8 = r7.Hw;
                    r2 = this.VH;
                    java.lang.System.arraycopy(r1, r8, r2, 0, r2.length);
                    if (this.XG == true) { $pc1 = 9; continue $sw1; }
                    J8();
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    this.XL = com.jcraft.jsch.KeyExchange.j6(this.VH, this.Zo);
                    r9 = this.XL;
                    if (r9 == null) { $pc1 = 27; continue $sw1; }
                    if (this.P8 == false) { $pc1 = 14; continue $sw1; }
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    try {
                        r10 = (com.jcraft.jsch.KeyExchange) java.lang.Class.forName(DW(this.XL[0])).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 23; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r10.j6(this, this.Hw, this.v5, this.VH, this.Zo);
                    return r10;
                }
                case 23: {
                    e = $ex1;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 14: {
                    if (r9[2].equals("none") == true) { $pc1 = 19; continue $sw1; }
                    if (this.XL[3].equals("none") == false) { $pc1 = 28; continue $sw1; }
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    throw new com.jcraft.jsch.JSchException("NONE Cipher should not be chosen before authentification is successed.");
                }
                case 27: {
                    throw new com.jcraft.jsch.JSchException("Algorithm negotiation fail");
                }
                case 5: {
                    this.VH = new byte[(r0 - 1) - r7.j6()];
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void EQ(java.lang.String r3) {
        java.lang.String r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3.equals("none") == false) { $pc2 = 6; continue $sw2; }
                    this.er = null;
                    return;
                }
                case 6: {
                    r0 = DW(r3);
                    if (r0 != null) { $pc2 = 9; continue $sw2; }
                    return;
                }
                case 9: {
                    if (r3.equals("zlib") == false) { $pc2 = 11; continue $sw2; }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    try {
                        this.er = (com.jcraft.jsch.Compression) java.lang.Class.forName(r0).newInstance();
                        this.er.j6(0, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 16; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 16: {
                    e = $ex2;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 11: {
                    if (this.P8 == true) { $pc2 = 13; continue $sw2; }
                    return;
                }
                case 13: {
                    if (r3.equals("zlib@openssh.com") == true) { $pc2 = 20; continue $sw2; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(com.jcraft.jsch.Packet r3) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.nw;
                    monitor-enter(r0);
                    try {
                        j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    if (this.yS == null) { $pc3 = 7; continue $sw3; }
                    try {
                        this.yS.j6(r3);
                        this.QX++;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    return;
                }
                case 9: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void J0() {
        com.jcraft.jsch.ConfigRepository r0 = null;
        com.jcraft.jsch.ConfigRepository.Config r1 = null;
        java.lang.String[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.String[] r5 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (DW("ClearAllForwardings").equals("yes") == false) { $pc4 = 5; continue $sw4; }
                    return;
                }
                case 5: {
                    r0 = this.yO.j6();
                    if (r0 != null) { $pc4 = 8; continue $sw4; }
                    return;
                }
                case 8: {
                    r1 = r0.j6(this.OW);
                    r2 = r1.j6("LocalForward");
                    r3 = 0;
                    if (r2 == null) { $pc4 = 15; continue $sw4; }
                    r4 = 0;
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    if (r4 >= r2.length) { $pc4 = 15; continue $sw4; }
                    Zo(r2[r4]);
                    r4 = r4 + 1;
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    r5 = r1.j6("RemoteForward");
                    if (r5 != null) { $pc4 = 18; continue $sw4; }
                    return;
                }
                case 18: {
                    if (r3 >= r5.length) { $pc4 = 24; continue $sw4; }
                    VH(r5[r3]);
                    r3 = r3 + 1;
                    { $pc4 = 18; continue $sw4; }
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void J8() {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.String[] r2 = null;
        java.lang.String r3 = null;
        java.lang.String[] r4 = null;
        com.jcraft.jsch.Buffer r5 = null;
        com.jcraft.jsch.Packet r6 = null;
        com.jcraft.jsch.Random r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.XG == false) { $pc5 = 5; continue $sw5; }
                    return;
                }
                case 5: {
                    r0 = DW("cipher.c2s");
                    r1 = DW("cipher.s2c");
                    r2 = gn(DW("CheckCiphers"));
                    if (r2 != null) { $pc5 = 8; continue $sw5; }
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r3 = DW("kex");
                    r4 = u7(DW("CheckKexes"));
                    if (r4 != null) { $pc5 = 18; continue $sw5; }
                    $pc5 = 24; continue $sw5;
                }
                case 24: {
                    this.XG = true;
                    this.Qq = java.lang.System.currentTimeMillis();
                    r5 = new com.jcraft.jsch.Buffer();
                    r6 = new com.jcraft.jsch.Packet(r5);
                    r6.DW();
                    r5.j6((byte) 20);
                    r7 = j6;
                    monitor-enter(r7);
                    try {
                        j6.j6(r5.DW, r5.FH, 16);
                        r5.v5(16);
                        monitor-exit(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 32; continue $sw5;
                    }
                    r5.Hw(com.jcraft.jsch.Util.FH(r3));
                    r5.Hw(com.jcraft.jsch.Util.FH(DW("server_host_key")));
                    r5.Hw(com.jcraft.jsch.Util.FH(r0));
                    r5.Hw(com.jcraft.jsch.Util.FH(r1));
                    r5.Hw(com.jcraft.jsch.Util.FH(DW("mac.c2s")));
                    r5.Hw(com.jcraft.jsch.Util.FH(DW("mac.s2c")));
                    r5.Hw(com.jcraft.jsch.Util.FH(DW("compression.c2s")));
                    r5.Hw(com.jcraft.jsch.Util.FH(DW("compression.s2c")));
                    r5.Hw(com.jcraft.jsch.Util.FH(DW("lang.c2s")));
                    r5.Hw(com.jcraft.jsch.Util.FH(DW("lang.s2c")));
                    r5.j6((byte) 0);
                    r5.FH(0);
                    r5.Hw(5);
                    this.Zo = new byte[r5.Hw()];
                    r5.j6(this.Zo);
                    DW(r6);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc5 = 37; continue $sw5; }
                    com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEXINIT sent");
                    return;
                }
                case 37: {
                    return;
                }
                case 32: {
                    th = $ex5;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 18: {
                    if (r4.length <= 0) { $pc5 = 24; continue $sw5; }
                    r3 = com.jcraft.jsch.Util.j6(r3, r4);
                    if (r3 != null) { $pc5 = 24; continue $sw5; }
                    throw new com.jcraft.jsch.JSchException("There are not any available kexes.");
                }
                case 8: {
                    if (r2.length <= 0) { $pc5 = 15; continue $sw5; }
                    r0 = com.jcraft.jsch.Util.j6(r0, r2);
                    r1 = com.jcraft.jsch.Util.j6(r1, r2);
                    if (r0 == null) { $pc5 = 14; continue $sw5; }
                    if (r1 != null) { $pc5 = 15; continue $sw5; }
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    throw new com.jcraft.jsch.JSchException("There are not any available ciphers.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Ws() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    this.cb.DW();
                    this.sh.j6((byte) 21);
                    DW(this.cb);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc6 = 6; continue $sw6; }
                    com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_NEWKEYS sent");
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String[] gn(java.lang.String r11) {
        java.lang.String r1 = null;
        java.lang.String r3 = null;
        java.util.Vector r4 = null;
        java.lang.String[] r12 = null;
        int r5 = 0;
        int r6 = 0;
        java.lang.String r7 = null;
        java.lang.String[] r13 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r11 != null) { $pc7 = 5; continue $sw7; }
                    $pc7 = 32; continue $sw7;
                }
                case 32: {
                    return null;
                }
                case 5: {
                    if (r11.length() == 0) { $pc7 = 32; continue $sw7; }
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc7 = 10; continue $sw7; }
                    com.jcraft.jsch.JSch.v5().j6(1, "CheckCiphers: " + r11);
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    r1 = DW("cipher.c2s");
                    r3 = DW("cipher.s2c");
                    r4 = new java.util.Vector();
                    r12 = com.jcraft.jsch.Util.j6(r11, ",");
                    r5 = 0;
                    r6 = 0;
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    if (r6 >= r12.length) { $pc7 = 14; continue $sw7; }
                    r7 = r12[r6];
                    if (r3.indexOf(r7) != (-1)) { $pc7 = 29; continue $sw7; }
                    if (r1.indexOf(r7) != (-1)) { $pc7 = 29; continue $sw7; }
                    $pc7 = 31; continue $sw7;
                }
                case 31: {
                    r6 = r6 + 1;
                    $pc7 = 29; continue $sw7;
                }
                case 29: {
                    if (j6(DW(r7)) == true) { $pc7 = 31; continue $sw7; }
                    r4.addElement(r7);
                    { $pc7 = 31; continue $sw7; }
                }
                case 14: {
                    if (r4.size() != 0) { $pc7 = 16; continue $sw7; }
                    return null;
                }
                case 16: {
                    r13 = new java.lang.String[r4.size()];
                    java.lang.System.arraycopy(r4.toArray(), 0, r13, 0, r4.size());
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == true) { $pc7 = 19; continue $sw7; }
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    return r13;
                }
                case 19: {
                    if (r5 >= r13.length) { $pc7 = 22; continue $sw7; }
                    com.jcraft.jsch.JSch.v5().j6(1, java.lang.String.valueOf(r13[r5]) + " is not available.");
                    r5 = r5 + 1;
                    { $pc7 = 19; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(java.lang.String r6, int r7) {
        com.jcraft.jsch.Session.GlobalRequestReply r0 = null;
        com.jcraft.jsch.Buffer r1 = null;
        com.jcraft.jsch.Packet r2 = null;
        java.lang.String r8 = null;
        int r9 = 0;
        int r3 = 0;
        int r10 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.Eq;
                    monitor-enter(r0);
                    try {
                        r1 = new com.jcraft.jsch.Buffer(100);
                        r2 = new com.jcraft.jsch.Packet(r1);
                        r8 = com.jcraft.jsch.ChannelForwardedTCPIP.DW(r6);
                        this.Eq.j6(java.lang.Thread.currentThread());
                        this.Eq.j6(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 28; continue $sw8;
                    }
                    try {
                        r2.DW();
                        r1.j6((byte) 80);
                        r1.Hw(com.jcraft.jsch.Util.FH("tcpip-forward"));
                        r1.j6((byte) 1);
                        r1.Hw(com.jcraft.jsch.Util.FH(r8));
                        r1.FH(r7);
                        DW(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 25; continue $sw8; }
                        $pc8 = 28; continue $sw8;
                    }
                    r9 = 0;
                    try {
                        r3 = this.Eq.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 28; continue $sw8;
                    }
                    $pc8 = 10; continue $sw8;
                }
                case 10: {
                    if (r9 >= 10) { $pc8 = 18; continue $sw8; }
                    if (r3 != (-1)) { $pc8 = 18; continue $sw8; }
                    try {
                        java.lang.Thread.sleep(1000);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 33; continue $sw8; }
                        $pc8 = 28; continue $sw8;
                    }
                    $pc8 = 16; continue $sw8;
                }
                case 16: {
                    r9 = r9 + 1;
                    try {
                        r3 = this.Eq.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 28; continue $sw8;
                    }
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    try {
                        this.Eq.j6(null);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 28; continue $sw8;
                    }
                    if (r3 != 1) { $pc8 = 24; continue $sw8; }
                    try {
                        r10 = this.Eq.j6();
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 28; continue $sw8;
                    }
                    return r10;
                }
                case 24: {
                    try {
                        throw new com.jcraft.jsch.JSchException("remote port forwarding failed for listen port " + r7);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 28; continue $sw8;
                    }
                }
                case 25: {
                    e = $ex8;
                    try {
                        this.Eq.j6(null);
                        throw new com.jcraft.jsch.JSchException(e.toString(), e);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 28; continue $sw8;
                    }
                }
                case 28: {
                    th = $ex8;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 33: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(com.jcraft.jsch.Buffer r4, com.jcraft.jsch.Cipher r5, com.jcraft.jsch.MAC r6, int r7, int r8) {
        int r9 = 0;
        byte[] r10 = null;
        int r11 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r5.DW() == false) { $pc9 = 25; continue $sw9; }
                    if (r7 == 262144) { $pc9 = 8; continue $sw9; }
                    if (r6 == null) { $pc9 = 8; continue $sw9; }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    r9 = r8 - r4.FH;
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    if (r9 <= 0) { $pc9 = 12; continue $sw9; }
                    r4.we();
                    r10 = r4.DW;
                    if (r9 <= r10.length) { $pc9 = 19; continue $sw9; }
                    r11 = r10.length;
                    $pc9 = 20; continue $sw9;
                }
                case 20: {
                    this.yS.j6(r4.DW, 0, r11);
                    if (r6 == null) { $pc9 = 23; continue $sw9; }
                    r6.update(r4.DW, 0, r11);
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    r9 = r9 - r11;
                    { $pc9 = 11; continue $sw9; }
                }
                case 19: {
                    r11 = r9;
                    { $pc9 = 20; continue $sw9; }
                }
                case 12: {
                    if (r6 == null) { $pc9 = 15; continue $sw9; }
                    r6.j6(r4.DW, 0);
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    throw new com.jcraft.jsch.JSchException("Packet corrupt");
                }
                case 8: {
                    r6 = null;
                    { $pc9 = 9; continue $sw9; }
                }
                case 25: {
                    throw new com.jcraft.jsch.JSchException("Packet corrupt");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(com.jcraft.jsch.Buffer r1, com.jcraft.jsch.KeyExchange r2) {
        j6(r2);
        this.XG = false;
    }

    private void j6(com.jcraft.jsch.ChannelSession r4) {
        com.jcraft.jsch.ConfigRepository r0 = null;
        com.jcraft.jsch.ConfigRepository.Config r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.yO.j6();
                    if (r0 != null) { $pc10 = 5; continue $sw10; }
                    return;
                }
                case 5: {
                    r1 = r0.j6(this.OW);
                    r2 = r1.getValue("ForwardAgent");
                    if (r2 == null) { $pc10 = 8; continue $sw10; }
                    r4.j6(r2.equals("yes"));
                    $pc10 = 8; continue $sw10;
                }
                case 8: {
                    r3 = r1.getValue("RequestTTY");
                    if (r3 == null) { $pc10 = 12; continue $sw10; }
                    r4.DW(r3.equals("yes"));
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(com.jcraft.jsch.ConfigRepository.Config r1, java.lang.String r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r3 = r1.getValue(r2);
                    if (r3 == null) { $pc11 = 6; continue $sw11; }
                    j6(r2, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(com.jcraft.jsch.KeyExchange r11) {
        byte[] r7 = null;
        byte[] r8 = null;
        com.jcraft.jsch.HASH r12 = null;
        com.jcraft.jsch.Buffer r0 = null;
        com.jcraft.jsch.Buffer r1 = null;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        com.jcraft.jsch.Buffer r5 = null;
        byte[] r6 = null;
        com.jcraft.jsch.Buffer r9 = null;
        byte[] r10 = null;
        com.jcraft.jsch.Buffer r13 = null;
        byte[] r14 = null;
        com.jcraft.jsch.Buffer r15 = null;
        byte[] r16 = null;
        byte[] r17 = null;
        byte[] r18 = null;
        byte[] r19 = null;
        byte[] r20 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r7 = r11.v5();
                    r8 = r11.DW();
                    r12 = r11.FH();
                    if (this.gn != null) { $pc12 = 5; continue $sw12; }
                    this.gn = new byte[r8.length];
                    java.lang.System.arraycopy(r8, 0, this.gn, 0, r8.length);
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    this.sh.we();
                    this.sh.FH(r7);
                    this.sh.DW(r8);
                    this.sh.j6((byte) 65);
                    this.sh.DW(this.gn);
                    r0 = this.sh;
                    r12.update(r0.DW, 0, r0.FH);
                    this.u7 = r12.FH();
                    r1 = this.sh;
                    r2 = r1.FH;
                    r3 = (r2 - this.gn.length) - 1;
                    r4 = r1.DW;
                    r4[r3] = (byte) (r4[r3] + 1);
                    r12.update(r4, 0, r2);
                    this.tp = r12.FH();
                    r5 = this.sh;
                    r6 = r5.DW;
                    r6[r3] = (byte) (r6[r3] + 1);
                    r12.update(r6, 0, r5.FH);
                    this.EQ = r12.FH();
                    r9 = this.sh;
                    r10 = r9.DW;
                    r10[r3] = (byte) (r10[r3] + 1);
                    r12.update(r10, 0, r9.FH);
                    this.we = r12.FH();
                    r13 = this.sh;
                    r14 = r13.DW;
                    r14[r3] = (byte) (r14[r3] + 1);
                    r12.update(r14, 0, r13.FH);
                    this.J0 = r12.FH();
                    r15 = this.sh;
                    r16 = r15.DW;
                    r16[r3] = (byte) (r16[r3] + 1);
                    r12.update(r16, 0, r15.FH);
                    this.J8 = r12.FH();
                    try {
                        this.aM = (com.jcraft.jsch.Cipher) java.lang.Class.forName(DW(this.XL[3])).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.Exception) { $pc12 = 17; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    if (this.aM.j6() <= this.we.length) { $pc12 = 9; continue $sw12; }
                    try {
                        this.sh.we();
                        this.sh.FH(r7);
                        this.sh.DW(r8);
                        this.sh.DW(this.we);
                        r12.update(this.sh.DW, 0, this.sh.FH);
                        r17 = r12.FH();
                        r18 = new byte[this.we.length + r17.length];
                        java.lang.System.arraycopy(this.we, 0, r18, 0, this.we.length);
                        java.lang.System.arraycopy(r17, 0, r18, this.we.length, r17.length);
                        this.we = r18;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.Exception) { $pc12 = 17; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc12 = 8; continue $sw12; }
                }
                case 9: {
                    try {
                        this.aM.j6(1, this.we, this.tp);
                        this.et = this.aM.FH();
                        this.Mr = (com.jcraft.jsch.MAC) java.lang.Class.forName(DW(this.XL[5])).newInstance();
                        this.J8 = j6(this.sh, r7, r8, this.J8, r12, this.Mr.j6());
                        this.Mr.j6(this.J8);
                        this.a8 = new byte[this.Mr.j6()];
                        this.lg = new byte[this.Mr.j6()];
                        this.j3 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(DW(this.XL[2])).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.Exception) { $pc12 = 17; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    if (this.j3.j6() <= this.EQ.length) { $pc12 = 12; continue $sw12; }
                    try {
                        this.sh.we();
                        this.sh.FH(r7);
                        this.sh.DW(r8);
                        this.sh.DW(this.EQ);
                        r12.update(this.sh.DW, 0, this.sh.FH);
                        r19 = r12.FH();
                        r20 = new byte[this.EQ.length + r19.length];
                        java.lang.System.arraycopy(this.EQ, 0, r20, 0, this.EQ.length);
                        java.lang.System.arraycopy(r19, 0, r20, this.EQ.length, r19.length);
                        this.EQ = r20;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.Exception) { $pc12 = 17; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc12 = 11; continue $sw12; }
                }
                case 12: {
                    try {
                        this.j3.j6(0, this.EQ, this.u7);
                        this.CU = this.j3.FH();
                        this.U2 = (com.jcraft.jsch.MAC) java.lang.Class.forName(DW(this.XL[4])).newInstance();
                        this.J0 = j6(this.sh, r7, r8, this.J0, r12, this.U2.j6());
                        this.U2.j6(this.J0);
                        tp(this.XL[6]);
                        EQ(this.XL[7]);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.Exception) { $pc12 = 17; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 17: {
                    e = $ex12;
                    if ((e instanceof com.jcraft.jsch.JSchException) == false) { $pc12 = 22; continue $sw12; }
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 22: {
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r11, int r12, com.jcraft.jsch.KeyExchange r13) {
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        byte[] r2 = null;
        java.lang.String r3 = null;
        java.lang.String r14 = null;
        com.jcraft.jsch.HostKeyRepository r15 = null;
        int r4 = 0;
        int r6 = 0;
        java.lang.String r5 = null;
        java.lang.String r7 = null;
        boolean r8 = false;
        java.lang.String r9 = null;
        boolean r10 = false;
        com.jcraft.jsch.UserInfo r16 = null;
        java.lang.String r17 = null;
        com.jcraft.jsch.HostKey[] r18 = null;
        java.lang.String r19 = null;
        com.jcraft.jsch.UserInfo r110 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = DW("StrictHostKeyChecking");
                    r1 = this.vJ;
                    if (r1 == null) { $pc13 = 5; continue $sw13; }
                    r11 = r1;
                    $pc13 = 5; continue $sw13;
                }
                case 5: {
                    r2 = r13.Hw();
                    r3 = r13.Zo();
                    r14 = r13.j6();
                    if (this.vJ == null) { $pc13 = 8; continue $sw13; }
                    $pc13 = 10; continue $sw13;
                }
                case 10: {
                    r15 = FH();
                    if (DW("HashKnownHosts").equals("yes") == true) { $pc13 = 13; continue $sw13; }
                    $pc13 = 15; continue $sw13;
                }
                case 15: {
                    this.hz = new com.jcraft.jsch.HostKey(r11, r2);
                    $pc13 = 16; continue $sw13;
                }
                case 16: {
                    monitor-enter(r15);
                    try {
                        r4 = r15.j6(r11, r2);
                        monitor-exit(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 119; continue $sw13;
                    }
                    r6 = 0;
                    if (r0.equals("ask") == false) { $pc13 = 22; continue $sw13; }
                    $pc13 = 23; continue $sw13;
                }
                case 23: {
                    if (r4 != 2) { $pc13 = 53; continue $sw13; }
                    monitor-enter(r15);
                    try {
                        r5 = r15.j6();
                        monitor-exit(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 50; continue $sw13;
                    }
                    if (r5 != null) { $pc13 = 30; continue $sw13; }
                    r5 = "known_hosts";
                    $pc13 = 30; continue $sw13;
                }
                case 30: {
                    if (this.Sf == null) { $pc13 = 35; continue $sw13; }
                    r7 = "WARNING: REMOTE HOST IDENTIFICATION HAS CHANGED!\nIT IS POSSIBLE THAT SOMEONE IS DOING SOMETHING NASTY!\nSomeone could be eavesdropping on you right now (man-in-the-middle attack)!\nIt is also possible that the " + r3 + " host key has just been changed.\nThe fingerprint for the " + r3 + " key sent by the remote host is\n" + r14 + ".\nPlease contact your system administrator.\nAdd correct host key in " + r5 + " to get rid of this message.";
                    if (r0.equals("ask") == false) { $pc13 = 34; continue $sw13; }
                    r8 = this.Sf.Hw(java.lang.String.valueOf(r7) + "\nDo you want to delete the old key and insert the new key?");
                    $pc13 = 36; continue $sw13;
                }
                case 36: {
                    if (r8 == false) { $pc13 = 49; continue $sw13; }
                    monitor-enter(r15);
                    $pc13 = 45; continue $sw13;
                }
                case 45: {
                    th = $ex13;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 39: {
                    if (r3.equals("DSA") == false) { $pc13 = 41; continue $sw13; }
                    r9 = "ssh-dss";
                    $pc13 = 42; continue $sw13;
                }
                case 42: {
                    try {
                        r15.j6(r11, r9, null);
                        monitor-exit(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 45; continue $sw13;
                    }
                    r10 = true;
                    $pc13 = 55; continue $sw13;
                }
                case 55: {
                    if (r0.equals("ask") == false) { $pc13 = 57; continue $sw13; }
                    $pc13 = 58; continue $sw13;
                }
                case 58: {
                    if (r4 == 0) { $pc13 = 77; continue $sw13; }
                    if (r10 == true) { $pc13 = 77; continue $sw13; }
                    if (r0.equals("yes") == true) { $pc13 = 75; continue $sw13; }
                    r16 = this.Sf;
                    if (r16 != null) { $pc13 = 65; continue $sw13; }
                    if (r4 != 1) { $pc13 = 73; continue $sw13; }
                    throw new com.jcraft.jsch.JSchException("UnknownHostKey: " + this.lp + ". " + r3 + " key fingerprint is " + r14);
                }
                case 73: {
                    throw new com.jcraft.jsch.JSchException("HostKey has been changed: " + this.lp);
                }
                case 65: {
                    if (r16.Hw("The authenticity of host '" + this.lp + "' can't be established.\n" + r3 + " key fingerprint is " + r14 + ".\nAre you sure you want to continue connecting?") == false) { $pc13 = 68; continue $sw13; }
                    r10 = true;
                    { $pc13 = 77; continue $sw13; }
                }
                case 68: {
                    throw new com.jcraft.jsch.JSchException("reject HostKey: " + this.lp);
                }
                case 75: {
                    throw new com.jcraft.jsch.JSchException("reject HostKey: " + this.lp);
                }
                case 77: {
                    if (r0.equals("no") == false) { $pc13 = 80; continue $sw13; }
                    if (1 != r4) { $pc13 = 80; continue $sw13; }
                    r10 = true;
                    $pc13 = 80; continue $sw13;
                }
                case 80: {
                    if (r4 == 0) { $pc13 = 82; continue $sw13; }
                    $pc13 = 102; continue $sw13;
                }
                case 102: {
                    if (r4 == 0) { $pc13 = 104; continue $sw13; }
                    $pc13 = 106; continue $sw13;
                }
                case 106: {
                    if (r10 == true) { $pc13 = 108; continue $sw13; }
                    $pc13 = 110; continue $sw13;
                }
                case 110: {
                    if (r10 == false) { $pc13 = 118; continue $sw13; }
                    monitor-enter(r15);
                    try {
                        r15.j6(this.hz, this.Sf);
                        monitor-exit(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 115; continue $sw13;
                    }
                    return;
                }
                case 115: {
                    th = $ex13;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 118: {
                    return;
                }
                case 108: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(2) == false) { $pc13 = 110; continue $sw13; }
                    com.jcraft.jsch.JSch.v5().j6(2, "Permanently added '" + this.lp + "' (" + r3 + ") to the list of known hosts.");
                    { $pc13 = 110; continue $sw13; }
                }
                case 104: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc13 = 106; continue $sw13; }
                    com.jcraft.jsch.JSch.v5().j6(1, "Host '" + this.lp + "' is known and mathces the " + r3 + " host key");
                    { $pc13 = 106; continue $sw13; }
                }
                case 82: {
                    if (r3.equals("DSA") == false) { $pc13 = 84; continue $sw13; }
                    r17 = "ssh-dss";
                    $pc13 = 85; continue $sw13;
                }
                case 85: {
                    r18 = r15.j6(r11, r17);
                    r19 = com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r2, 0, r2.length));
                    $pc13 = 87; continue $sw13;
                }
                case 87: {
                    if (r6 >= r18.length) { $pc13 = 102; continue $sw13; }
                    if (r18[r4].FH().equals(r19) == false) { $pc13 = 101; continue $sw13; }
                    if (r18[r6].Hw().equals("@revoked") == false) { $pc13 = 101; continue $sw13; }
                    r110 = this.Sf;
                    if (r110 == null) { $pc13 = 97; continue $sw13; }
                    r110.DW("The " + r3 + " host key for " + this.lp + " is marked as revoked.\nThis could mean that a stolen key is being used to impersonate this host.");
                    $pc13 = 97; continue $sw13;
                }
                case 97: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc13 = 100; continue $sw13; }
                    com.jcraft.jsch.JSch.v5().j6(1, "Host '" + this.lp + "' has provided revoked key.");
                    $pc13 = 100; continue $sw13;
                }
                case 100: {
                    throw new com.jcraft.jsch.JSchException("revoked HostKey: " + this.lp);
                }
                case 101: {
                    r6 = r6 + 1;
                    { $pc13 = 87; continue $sw13; }
                }
                case 84: {
                    r17 = "ssh-rsa";
                    { $pc13 = 85; continue $sw13; }
                }
                case 57: {
                    if (r0.equals("yes") == false) { $pc13 = 77; continue $sw13; }
                    $pc13 = 41; continue $sw13;
                }
                case 41: {
                    r9 = "ssh-rsa";
                    { $pc13 = 42; continue $sw13; }
                }
                case 49: {
                    throw new com.jcraft.jsch.JSchException("HostKey has been changed: " + r11);
                }
                case 34: {
                    this.Sf.DW(r7);
                    $pc13 = 35; continue $sw13;
                }
                case 35: {
                    r8 = false;
                    $pc13 = 50; continue $sw13;
                }
                case 50: {
                    th = $ex13;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 53: {
                    r10 = false;
                    { $pc13 = 55; continue $sw13; }
                }
                case 22: {
                    if (r0.equals("yes") == false) { $pc13 = 53; continue $sw13; }
                    $pc13 = 119; continue $sw13;
                }
                case 119: {
                    th = $ex13;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 13: {
                    if ((r15 instanceof com.jcraft.jsch.KnownHosts) == false) { $pc13 = 15; continue $sw13; }
                    this.hz = ((com.jcraft.jsch.KnownHosts) r15).DW(r11, r2);
                    { $pc13 = 16; continue $sw13; }
                }
                case 8: {
                    if (r12 == 22) { $pc13 = 10; continue $sw13; }
                    r11 = "[" + r11 + "]:" + r12;
                    { $pc13 = 10; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.jcraft.jsch.Session r6, java.lang.String r7) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    try {
                        ((com.jcraft.jsch.KeyExchange) java.lang.Class.forName(r7).newInstance()).j6(r6, null, null, null, null);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.Exception) { $pc14 = 5; continue $sw14; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(java.lang.String r3) {
        com.jcraft.jsch.Cipher r4 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    try {
                        r4 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(r3).newInstance();
                        r4.j6(0, new byte[r4.j6()], new byte[r4.FH()]);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.Exception) { $pc15 = 6; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(com.jcraft.jsch.Buffer r6, byte[] r7, byte[] r8, byte[] r9, com.jcraft.jsch.HASH r10, int r11) {
        int r0 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = r10.j6();
                    $pc16 = 4; continue $sw16;
                }
                case 4: {
                    if (r9.length >= r11) { $pc16 = 5; continue $sw16; }
                    r6.we();
                    r6.FH(r7);
                    r6.DW(r8);
                    r6.DW(r9);
                    r10.update(r6.DW, 0, r6.FH);
                    r1 = new byte[r9.length + r0];
                    java.lang.System.arraycopy(r9, 0, r1, 0, r9.length);
                    java.lang.System.arraycopy(r10.FH(), 0, r1, r9.length, r0);
                    com.jcraft.jsch.Util.DW(r9);
                    r9 = r1;
                    { $pc16 = 4; continue $sw16; }
                }
                case 5: {
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void tp(java.lang.String r3) {
        java.lang.String r0 = null;
        int r4 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (r3.equals("none") == false) { $pc17 = 6; continue $sw17; }
                    this.rN = null;
                    return;
                }
                case 6: {
                    r0 = DW(r3);
                    if (r0 != null) { $pc17 = 9; continue $sw17; }
                    return;
                }
                case 9: {
                    if (r3.equals("zlib") == false) { $pc17 = 11; continue $sw17; }
                    $pc17 = 29; continue $sw17;
                }
                case 29: {
                    try {
                        this.rN = (com.jcraft.jsch.Compression) java.lang.Class.forName(r0).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.lang.Exception) { $pc17 = 19; continue $sw17; }
                        if ($t instanceof java.lang.NoClassDefFoundError) { $pc17 = 22; continue $sw17; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = 6;
                    try {
                        r4 = java.lang.Integer.parseInt(DW("compression_level"));
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.lang.Exception) { $pc17 = 26; continue $sw17; }
                        if ($t instanceof java.lang.NoClassDefFoundError) { $pc17 = 22; continue $sw17; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc17 = 17; continue $sw17;
                }
                case 17: {
                    try {
                        this.rN.j6(1, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.lang.Exception) { $pc17 = 19; continue $sw17; }
                        if ($t instanceof java.lang.NoClassDefFoundError) { $pc17 = 22; continue $sw17; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc17 = 33; continue $sw17;
                }
                case 33: {
                    return;
                }
                case 22: {
                    e = $ex17;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 19: {
                    e = $ex17;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 11: {
                    if (this.P8 == true) { $pc17 = 13; continue $sw17; }
                    return;
                }
                case 13: {
                    if (r3.equals("zlib@openssh.com") == true) { $pc17 = 29; continue $sw17; }
                    $pc17 = 26; continue $sw17;
                }
                case 26: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String[] u7(java.lang.String r7) {
        java.util.Vector r1 = null;
        java.lang.String[] r8 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.String[] r9 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (r7 != null) { $pc18 = 5; continue $sw18; }
                    $pc18 = 27; continue $sw18;
                }
                case 27: {
                    return null;
                }
                case 5: {
                    if (r7.length() == 0) { $pc18 = 27; continue $sw18; }
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc18 = 10; continue $sw18; }
                    com.jcraft.jsch.JSch.v5().j6(1, "CheckKexes: " + r7);
                    $pc18 = 10; continue $sw18;
                }
                case 10: {
                    r1 = new java.util.Vector();
                    r8 = com.jcraft.jsch.Util.j6(r7, ",");
                    r3 = 0;
                    r4 = 0;
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    if (r4 >= r8.length) { $pc18 = 14; continue $sw18; }
                    if (j6(this, DW(r8[r4])) == true) { $pc18 = 26; continue $sw18; }
                    r1.addElement(r8[r4]);
                    $pc18 = 26; continue $sw18;
                }
                case 26: {
                    r4 = r4 + 1;
                    { $pc18 = 12; continue $sw18; }
                }
                case 14: {
                    if (r1.size() != 0) { $pc18 = 16; continue $sw18; }
                    return null;
                }
                case 16: {
                    r9 = new java.lang.String[r1.size()];
                    java.lang.System.arraycopy(r1.toArray(), 0, r9, 0, r1.size());
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == true) { $pc18 = 19; continue $sw18; }
                    $pc18 = 22; continue $sw18;
                }
                case 22: {
                    return r9;
                }
                case 19: {
                    if (r3 >= r9.length) { $pc18 = 22; continue $sw18; }
                    com.jcraft.jsch.JSch.v5().j6(1, java.lang.String.valueOf(r9[r3]) + " is not available.");
                    r3 = r3 + 1;
                    { $pc18 = 19; continue $sw18; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private com.jcraft.jsch.Session.Forwarding we(java.lang.String r9) {
        java.lang.String[] r1 = null;
        java.util.Vector r2 = null;
        int r10 = 0;
        java.lang.StringBuffer r6 = null;
        int r11 = 0;
        com.jcraft.jsch.Session.Forwarding r3 = null;
        java.lang.String r4 = null;
        java.lang.String r12 = null;
        java.lang.String r13 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r1 = r9.split(" ");
                    if (r1.length <= 1) { $pc19 = 19; continue $sw19; }
                    r2 = new java.util.Vector();
                    r10 = 0;
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    if (r10 >= r1.length) { $pc19 = 7; continue $sw19; }
                    if (r1[r10].length() == 0) { $pc19 = 18; continue $sw19; }
                    r2.addElement(r1[r10].trim());
                    $pc19 = 18; continue $sw19;
                }
                case 18: {
                    r10 = r10 + 1;
                    { $pc19 = 6; continue $sw19; }
                }
                case 7: {
                    r6 = new java.lang.StringBuffer();
                    r11 = 0;
                    $pc19 = 9; continue $sw19;
                }
                case 9: {
                    if (r11 >= r2.size()) { $pc19 = 10; continue $sw19; }
                    r6.append((java.lang.String) r2.elementAt(r11));
                    r11 = r11 + 1;
                    if (r11 >= r2.size()) { $pc19 = 9; continue $sw19; }
                    r6.append(":");
                    { $pc19 = 9; continue $sw19; }
                }
                case 10: {
                    r9 = r6.toString();
                    $pc19 = 19; continue $sw19;
                }
                case 19: {
                    r3 = new com.jcraft.jsch.Session.Forwarding(this, null);
                    $pc19 = 42; continue $sw19;
                }
                case 42: {
                    e = $ex19;
                    throw new com.jcraft.jsch.JSchException("parseForwarding: " + e.toString());
                }
                case 21: {
                    if (r9.lastIndexOf(":") == (-1)) { $pc19 = 41; continue $sw19; }
                    try {
                        r3.Hw = java.lang.Integer.parseInt(r9.substring(r9.lastIndexOf(":") + 1));
                        r4 = r9.substring(0, r9.lastIndexOf(":"));
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc19 = 42; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4.lastIndexOf(":") == (-1)) { $pc19 = 39; continue $sw19; }
                    try {
                        r3.FH = r4.substring(r4.lastIndexOf(":") + 1);
                        r12 = r4.substring(0, r4.lastIndexOf(":"));
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc19 = 42; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r12.lastIndexOf(":") == (-1)) { $pc19 = 36; continue $sw19; }
                    try {
                        r3.DW = java.lang.Integer.parseInt(r12.substring(r12.lastIndexOf(":") + 1));
                        r13 = r12.substring(0, r12.lastIndexOf(":"));
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc19 = 42; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r13.length() != 0) { $pc19 = 30; continue $sw19; }
                    $pc19 = 31; continue $sw19;
                }
                case 31: {
                    r13 = "0.0.0.0";
                    $pc19 = 33; continue $sw19;
                }
                case 33: {
                    if (r13.equals("localhost") == false) { $pc19 = 35; continue $sw19; }
                    r13 = "127.0.0.1";
                    $pc19 = 35; continue $sw19;
                }
                case 35: {
                    try {
                        r3.j6 = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc19 = 42; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc19 = 37; continue $sw19;
                }
                case 37: {
                    return r3;
                }
                case 30: {
                    if (r13.equals("*") == false) { $pc19 = 33; continue $sw19; }
                    $pc19 = 36; continue $sw19;
                }
                case 36: {
                    try {
                        r3.DW = java.lang.Integer.parseInt(r12);
                        r3.j6 = "127.0.0.1";
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc19 = 42; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc19 = 37; continue $sw19; }
                }
                case 39: {
                    try {
                        throw new com.jcraft.jsch.JSchException("parseForwarding: " + r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc19 = 42; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 41: {
                    try {
                        throw new com.jcraft.jsch.JSchException("parseForwarding: " + r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc19 = 42; continue $sw19; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void we() {
        com.jcraft.jsch.ConfigRepository r0 = null;
        com.jcraft.jsch.ConfigRepository.Config r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        int r4 = 0;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        com.jcraft.jsch.KnownHosts r7 = null;
        java.lang.String[] r8 = null;
        java.lang.String[] r9 = null;
        int r10 = 0;
        com.jcraft.jsch.IdentityRepository.Wrapper r11 = null;
        int r12 = 0;
        java.lang.String r13 = null;
        int r14 = 0;
        java.lang.String r15 = null;
        java.lang.String r16 = null;
        java.lang.String r17 = null;
        java.lang.String r18 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = this.yO.j6();
                    if (r0 != null) { $pc20 = 5; continue $sw20; }
                    return;
                }
                case 5: {
                    r1 = r0.j6(this.OW);
                    r2 = r1.DW();
                    if (r2 == null) { $pc20 = 8; continue $sw20; }
                    this.XX = r2;
                    $pc20 = 8; continue $sw20;
                }
                case 8: {
                    r3 = r1.FH();
                    if (r3 == null) { $pc20 = 11; continue $sw20; }
                    this.lp = r3;
                    $pc20 = 11; continue $sw20;
                }
                case 11: {
                    r4 = r1.j6();
                    if (r4 == (-1)) { $pc20 = 14; continue $sw20; }
                    this.br = r4;
                    $pc20 = 14; continue $sw20;
                }
                case 14: {
                    j6(r1, "kex");
                    j6(r1, "server_host_key");
                    j6(r1, "cipher.c2s");
                    j6(r1, "cipher.s2c");
                    j6(r1, "mac.c2s");
                    j6(r1, "mac.s2c");
                    j6(r1, "compression.c2s");
                    j6(r1, "compression.s2c");
                    j6(r1, "compression_level");
                    j6(r1, "StrictHostKeyChecking");
                    j6(r1, "HashKnownHosts");
                    j6(r1, "PreferredAuthentications");
                    j6(r1, "MaxAuthTries");
                    j6(r1, "ClearAllForwardings");
                    r5 = r1.getValue("HostKeyAlias");
                    if (r5 == null) { $pc20 = 17; continue $sw20; }
                    Hw(r5);
                    $pc20 = 17; continue $sw20;
                }
                case 17: {
                    r6 = r1.getValue("UserKnownHostsFile");
                    if (r6 == null) { $pc20 = 20; continue $sw20; }
                    r7 = new com.jcraft.jsch.KnownHosts(this.yO);
                    r7.j6(r6);
                    j6(r7);
                    $pc20 = 20; continue $sw20;
                }
                case 20: {
                    r8 = r1.j6("IdentityFile");
                    if (r8 == null) { $pc20 = 48; continue $sw20; }
                    r9 = r0.j6("").j6("IdentityFile");
                    if (r9 == null) { $pc20 = 29; continue $sw20; }
                    r10 = 0;
                    $pc20 = 26; continue $sw20;
                }
                case 26: {
                    if (r10 >= r9.length) { $pc20 = 31; continue $sw20; }
                    this.yO.j6(r9[r10]);
                    r10 = r10 + 1;
                    $pc20 = 31; continue $sw20;
                }
                case 31: {
                    if ((r8.length - r9.length) <= 0) { $pc20 = 48; continue $sw20; }
                    r11 = new com.jcraft.jsch.IdentityRepository.Wrapper(this.yO.Hw(), true);
                    r12 = 0;
                    $pc20 = 34; continue $sw20;
                }
                case 34: {
                    if (r12 >= r8.length) { $pc20 = 35; continue $sw20; }
                    r13 = r8[r12];
                    r14 = 0;
                    $pc20 = 38; continue $sw20;
                }
                case 38: {
                    if (r14 >= r9.length) { $pc20 = 44; continue $sw20; }
                    if (r13.equals(r9[r14]) == true) { $pc20 = 43; continue $sw20; }
                    r14 = r14 + 1;
                    { $pc20 = 38; continue $sw20; }
                }
                case 43: {
                    r13 = null;
                    $pc20 = 44; continue $sw20;
                }
                case 44: {
                    if (r13 == null) { $pc20 = 47; continue $sw20; }
                    r11.j6(com.jcraft.jsch.IdentityFile.j6(r13, null, this.yO));
                    $pc20 = 47; continue $sw20;
                }
                case 47: {
                    r12 = r12 + 1;
                    { $pc20 = 34; continue $sw20; }
                }
                case 35: {
                    j6(r11);
                    { $pc20 = 48; continue $sw20; }
                }
                case 29: {
                    r9 = new java.lang.String[0];
                    $pc20 = 48; continue $sw20;
                }
                case 48: {
                    r15 = r1.getValue("ServerAliveInterval");
                    if (r15 != null) { $pc20 = 67; continue $sw20; }
                    $pc20 = 53; continue $sw20;
                }
                case 53: {
                    r16 = r1.getValue("ConnectTimeout");
                    if (r16 != null) { $pc20 = 65; continue $sw20; }
                    $pc20 = 58; continue $sw20;
                }
                case 58: {
                    r17 = r1.getValue("MaxAuthTries");
                    if (r17 == null) { $pc20 = 61; continue $sw20; }
                    j6("MaxAuthTries", r17);
                    $pc20 = 61; continue $sw20;
                }
                case 61: {
                    r18 = r1.getValue("ClearAllForwardings");
                    if (r18 == null) { $pc20 = 75; continue $sw20; }
                    j6("ClearAllForwardings", r18);
                    return;
                }
                case 75: {
                    return;
                }
                case 65: {
                    try {
                        FH(java.lang.Integer.parseInt(r16));
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc20 = 57; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc20 = 58; continue $sw20; }
                }
                case 67: {
                    try {
                        DW(java.lang.Integer.parseInt(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc20 = 52; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc20 = 53; continue $sw20; }
                }
                case 52: {
                    $pc20 = 57; continue $sw20;
                }
                case 57: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        return this.lp;
    }

    public java.lang.String DW(java.lang.String r3) {
        java.util.Hashtable r0 = null;
        java.lang.Object r1 = null;
        java.lang.String r4 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = this.sG;
                    if (r0 == null) { $pc21 = 8; continue $sw21; }
                    r1 = r0.get(r3);
                    if ((r1 instanceof java.lang.String) == false) { $pc21 = 8; continue $sw21; }
                    return (java.lang.String) r1;
                }
                case 8: {
                    r4 = com.jcraft.jsch.JSch.DW(r3);
                    if ((r4 instanceof java.lang.String) == false) { $pc21 = 11; continue $sw21; }
                    return r4;
                }
                case 11: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r1) {
        FH(r1);
        this.g3 = r1;
    }

    public void DW(com.jcraft.jsch.Packet r7) {
        long r0 = 0L;
        byte r2 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = VH();
                    $pc22 = 4; continue $sw22;
                }
                case 4: {
                    if (this.XG == false) { $pc22 = 35; continue $sw22; }
                    if (r0 > 0) { $pc22 = 9; continue $sw22; }
                    $pc22 = 13; continue $sw22;
                }
                case 13: {
                    r2 = r7.DW.DW();
                    if (r2 == 20) { $pc22 = 35; continue $sw22; }
                    if (r2 == 21) { $pc22 = 35; continue $sw22; }
                    if (r2 == 30) { $pc22 = 35; continue $sw22; }
                    if (r2 == 31) { $pc22 = 35; continue $sw22; }
                    if (r2 == 31) { $pc22 = 35; continue $sw22; }
                    if (r2 == 32) { $pc22 = 35; continue $sw22; }
                    if (r2 == 33) { $pc22 = 35; continue $sw22; }
                    if (r2 == 34) { $pc22 = 35; continue $sw22; }
                    if (r2 == 1) { $pc22 = 35; continue $sw22; }
                    try {
                        java.lang.Thread.sleep(10);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc22 = 34; continue $sw22; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc22 = 4; continue $sw22; }
                }
                case 9: {
                    if ((java.lang.System.currentTimeMillis() - this.Qq) <= r0) { $pc22 = 13; continue $sw22; }
                    throw new com.jcraft.jsch.JSchException("timeout in wating for rekeying process.");
                }
                case 35: {
                    FH(r7);
                    $pc22 = 34; continue $sw22;
                }
                case 34: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void EQ() {
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer();
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
        r1.DW();
        r0.j6((byte) 80);
        r0.Hw(DW);
        r0.j6((byte) 1);
        DW(r1);
    }

    public com.jcraft.jsch.Channel FH(java.lang.String r2) {
        com.jcraft.jsch.Channel r3 = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    if (this.vy == false) { $pc23 = 11; continue $sw23; }
                    try {
                        r3 = com.jcraft.jsch.Channel.j6(r2);
                        j6(r3);
                        r3.we();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        if ($t instanceof java.lang.Exception) { $pc23 = 8; continue $sw23; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r3 instanceof com.jcraft.jsch.ChannelSession) == false) { $pc23 = 7; continue $sw23; }
                    try {
                        j6((com.jcraft.jsch.ChannelSession) r3);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        if ($t instanceof java.lang.Exception) { $pc23 = 8; continue $sw23; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc23 = 7; continue $sw23;
                }
                case 7: {
                    return r3;
                }
                case 8: {
                    return null;
                }
                case 11: {
                    throw new com.jcraft.jsch.JSchException("session is down");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.jcraft.jsch.HostKeyRepository FH() {
        com.jcraft.jsch.HostKeyRepository r0 = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    r0 = this.ca;
                    if (r0 == null) { $pc24 = 5; continue $sw24; }
                    return r0;
                }
                case 5: {
                    return this.yO.DW();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(int r3) {
        java.net.Socket r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r0 = this.gW;
                    if (r0 != null) { $pc25 = 14; continue $sw25; }
                    if (r3 < 0) { $pc25 = 8; continue $sw25; }
                    this.BT = r3;
                    return;
                }
                case 8: {
                    throw new com.jcraft.jsch.JSchException("invalid timeout value");
                }
                case 14: {
                    try {
                        r0.setSoTimeout(r3);
                        this.BT = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        if ($t instanceof java.lang.Exception) { $pc25 = 11; continue $sw25; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 11: {
                    e = $ex25;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    com.jcraft.jsch.IdentityRepository Hw() {
        com.jcraft.jsch.IdentityRepository r0 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r0 = this.I;
                    if (r0 == null) { $pc26 = 5; continue $sw26; }
                    return r0;
                }
                case 5: {
                    return this.yO.Hw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(java.lang.String r1) {
        this.vJ = r1;
    }

    public int VH() {
        return this.BT;
    }

    public int VH(java.lang.String r10) {
        com.jcraft.jsch.Session.Forwarding r11 = we(r10);
        int r0 = j6(r11.j6, r11.DW);
        com.jcraft.jsch.ChannelForwardedTCPIP.j6(this, r11.j6, r11.DW, r0, r11.FH, r11.Hw, null);
        return r0;
    }

    public int Zo(java.lang.String r4) {
        com.jcraft.jsch.Session.Forwarding r5 = we(r4);
        return j6(r5.j6, r5.DW, r5.FH, r5.Hw);
    }

    byte[] Zo() {
        return this.gn;
    }

    public com.jcraft.jsch.UserInfo gn() {
        return this.Sf;
    }

    public int j6(java.lang.String r7, int r8, java.lang.String r9, int r10) {
        return j6(r7, r8, r9, r10, null);
    }

    public int j6(java.lang.String r8, int r9, java.lang.String r10, int r11, com.jcraft.jsch.ServerSocketFactory r12) {
        return j6(r8, r9, r10, r11, r12, 0);
    }

    public int j6(java.lang.String r1, int r2, java.lang.String r3, int r4, com.jcraft.jsch.ServerSocketFactory r5, int r6) {
        com.jcraft.jsch.PortWatcher r7 = null;
        java.lang.Thread r8 = null;
        boolean r9 = false;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    r7 = com.jcraft.jsch.PortWatcher.j6(this, r1, r2, r3, r4, r5);
                    r7.j6(r6);
                    r8 = new java.lang.Thread(r7);
                    r8.setName("PortWatcher Thread for " + r3);
                    r9 = this.x9;
                    if (r9 == false) { $pc27 = 5; continue $sw27; }
                    r8.setDaemon(r9);
                    $pc27 = 5; continue $sw27;
                }
                case 5: {
                    r8.start();
                    return r7.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.jcraft.jsch.Buffer j6(com.jcraft.jsch.Buffer r20) {
        int r0 = 0;
        int r10 = 0;
        com.jcraft.jsch.Cipher r7 = null;
        byte[] r11 = null;
        byte[] r1 = null;
        int r8 = 0;
        int r12 = 0;
        int r13 = 0;
        byte[] r14 = null;
        com.jcraft.jsch.Cipher r15 = null;
        byte[] r2 = null;
        int r16 = 0;
        com.jcraft.jsch.MAC r3 = null;
        com.jcraft.jsch.IO r4 = null;
        byte[] r17 = null;
        com.jcraft.jsch.Compression r5 = null;
        byte[] r9 = null;
        byte r18 = 0;
        int[] r19 = null;
        byte[] r6 = null;
        int r21 = 0;
        com.jcraft.jsch.Channel r22 = null;
        int r23 = 0;
        java.lang.String r24 = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 3;
        $sw28: while (true) {
            switch ($pc28) {
                case 3: {
                    r20.we();
                    this.yS.j6(r20.DW, r20.FH, this.et);
                    r0 = r20.FH;
                    r10 = this.et;
                    r20.FH = r0 + r10;
                    r7 = this.aM;
                    if (r7 == null) { $pc28 = 6; continue $sw28; }
                    r11 = r20.DW;
                    r7.j6(r11, 0, r10, r11, 0);
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    r1 = r20.DW;
                    r8 = (r1[3] & 255) | ((((r1[0] << 24) & (-16777216)) | ((r1[1] << 16) & 16711680)) | ((r1[2] << 8) & 65280));
                    if (r8 < 5) { $pc28 = 64; continue $sw28; }
                    if (r8 > 262144) { $pc28 = 64; continue $sw28; }
                    r12 = (r8 + 4) - this.et;
                    r13 = r20.FH;
                    if ((r13 + r12) <= r1.length) { $pc28 = 14; continue $sw28; }
                    r14 = new byte[r13 + r12];
                    java.lang.System.arraycopy(r1, 0, r14, 0, r13);
                    r20.DW = r14;
                    $pc28 = 14; continue $sw28;
                }
                case 14: {
                    if ((r12 % this.et) != 0) { $pc28 = 15; continue $sw28; }
                    if (r12 <= 0) { $pc28 = 24; continue $sw28; }
                    this.yS.j6(r20.DW, r20.FH, r12);
                    r20.FH += r12;
                    r15 = this.aM;
                    if (r15 == null) { $pc28 = 24; continue $sw28; }
                    r2 = r20.DW;
                    r16 = this.et;
                    r15.j6(r2, r16, r12, r2, r16);
                    $pc28 = 24; continue $sw28;
                }
                case 24: {
                    r3 = this.Mr;
                    if (r3 == null) { $pc28 = 33; continue $sw28; }
                    r3.update(this.Ws);
                    this.Mr.update(r20.DW, 0, r20.FH);
                    this.Mr.j6(this.a8, 0);
                    r4 = this.yS;
                    r17 = this.lg;
                    r4.j6(r17, 0, r17.length);
                    if (java.util.Arrays.equals(this.a8, this.lg) == true) { $pc28 = 33; continue $sw28; }
                    if (r12 > 262144) { $pc28 = 30; continue $sw28; }
                    j6(r20, this.aM, this.Mr, r8, 262144 - r12);
                    throw null;
                }
                case 30: {
                    throw new java.io.IOException("MAC Error");
                }
                case 33: {
                    this.Ws++;
                    r5 = this.er;
                    if (r5 == null) { $pc28 = 39; continue $sw28; }
                    r9 = r20.DW;
                    r18 = r9[4];
                    r19 = this.jJ;
                    r19[0] = (r20.FH - 5) - r18;
                    r6 = r5.DW(r9, 5, r19);
                    if (r6 == null) { $pc28 = 38; continue $sw28; }
                    r20.DW = r6;
                    r20.FH = this.jJ[0] + 5;
                    { $pc28 = 39; continue $sw28; }
                }
                case 38: {
                    java.lang.System.err.println("fail in inflater");
                    $pc28 = 60; continue $sw28;
                }
                case 60: {
                    r20.J0();
                    return r20;
                }
                case 39: {
                    r21 = r20.DW() & 255;
                    if (r21 == 1) { $pc28 = 62; continue $sw28; }
                    if (r21 == 2) { $pc28 = 3; continue $sw28; }
                    if (r21 == 3) { $pc28 = 43; continue $sw28; }
                    if (r21 == 4) { $pc28 = 47; continue $sw28; }
                    if (r21 != 93) { $pc28 = 54; continue $sw28; }
                    r20.J0();
                    r20.FH();
                    r20.u7();
                    r22 = com.jcraft.jsch.Channel.j6(r20.FH(), this);
                    if (r22 == null) { $pc28 = 3; continue $sw28; }
                    r22.j6(r20.EQ());
                    { $pc28 = 3; continue $sw28; }
                }
                case 54: {
                    if (r21 != 52) { $pc28 = 60; continue $sw28; }
                    this.P8 = true;
                    if (this.er != null) { $pc28 = 60; continue $sw28; }
                    if (this.rN != null) { $pc28 = 60; continue $sw28; }
                    tp(this.XL[6]);
                    EQ(this.XL[7]);
                    { $pc28 = 60; continue $sw28; }
                }
                case 47: {
                    r20.J0();
                    r20.FH();
                    r20.u7();
                    { $pc28 = 3; continue $sw28; }
                }
                case 43: {
                    r20.J0();
                    r20.FH();
                    r20.u7();
                    r23 = r20.FH();
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc28 = 3; continue $sw28; }
                    com.jcraft.jsch.JSch.v5().j6(1, "Received SSH_MSG_UNIMPLEMENTED for " + r23);
                    { $pc28 = 3; continue $sw28; }
                }
                case 62: {
                    r20.J0();
                    r20.FH();
                    r20.u7();
                    throw new com.jcraft.jsch.JSchException("SSH_MSG_DISCONNECT: " + r20.FH() + " " + com.jcraft.jsch.Util.j6(r20.tp()) + " " + com.jcraft.jsch.Util.j6(r20.tp()));
                }
                case 15: {
                    r24 = "Bad packet length " + r12;
                    if (com.jcraft.jsch.JSch.v5().isEnabled(4) == false) { $pc28 = 18; continue $sw28; }
                    com.jcraft.jsch.JSch.v5().j6(4, r24);
                    $pc28 = 18; continue $sw28;
                }
                case 18: {
                    j6(r20, this.aM, this.Mr, r8, 262144 - this.et);
                    throw null;
                }
                case 64: {
                    j6(r20, this.aM, this.Mr, r8, 262144);
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Object r0 = null;
        com.jcraft.jsch.Proxy r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    if (this.vy == true) { $pc29 = 6; continue $sw29; }
                    return;
                }
                case 6: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc29 = 8; continue $sw29; }
                    com.jcraft.jsch.JSch.v5().j6(1, "Disconnecting from " + this.lp + " port " + this.br);
                    $pc29 = 8; continue $sw29;
                }
                case 8: {
                    com.jcraft.jsch.Channel.j6(this);
                    this.vy = false;
                    com.jcraft.jsch.PortWatcher.j6(this);
                    com.jcraft.jsch.ChannelForwardedTCPIP.FH(this);
                    com.jcraft.jsch.ChannelX11.Hw(this);
                    r0 = this.nw;
                    monitor-enter(r0);
                    $pc29 = 42; continue $sw29;
                }
                case 42: {
                    th = $ex29;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 11: {
                    if (this.ei == null) { $pc29 = 13; continue $sw29; }
                    try {
                        java.lang.Thread.yield();
                        this.ei.interrupt();
                        this.ei = null;
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 42; continue $sw29;
                    }
                    $pc29 = 13; continue $sw29;
                }
                case 13: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 42; continue $sw29;
                    }
                    this.Xa = null;
                    if (this.yS == null) { $pc29 = 27; continue $sw29; }
                    if (this.yS.j6 == null) { $pc29 = 21; continue $sw29; }
                    try {
                        this.yS.j6.close();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.lang.Exception) { $pc29 = 45; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc29 = 21; continue $sw29;
                }
                case 21: {
                    if (this.yS.DW == null) { $pc29 = 24; continue $sw29; }
                    try {
                        this.yS.DW.close();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.lang.Exception) { $pc29 = 45; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc29 = 24; continue $sw29;
                }
                case 24: {
                    if (this.yS.FH == null) { $pc29 = 27; continue $sw29; }
                    try {
                        this.yS.FH.close();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.lang.Exception) { $pc29 = 45; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc29 = 27; continue $sw29;
                }
                case 27: {
                    if (this.ef == null) { $pc29 = 29; continue $sw29; }
                    try {
                        r1 = this.ef;
                        monitor-enter(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.lang.Exception) { $pc29 = 45; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        this.ef.close();
                        monitor-exit(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 37; continue $sw29;
                    }
                    try {
                        this.ef = null;
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.lang.Exception) { $pc29 = 45; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc29 = 40; continue $sw29; }
                }
                case 37: {
                    th = $ex29;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.lang.Exception) { $pc29 = 45; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 29: {
                    if (this.gW == null) { $pc29 = 40; continue $sw29; }
                    try {
                        this.gW.close();
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        if ($t instanceof java.lang.Exception) { $pc29 = 45; continue $sw29; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc29 = 40; continue $sw29;
                }
                case 40: {
                    this.yS = null;
                    this.gW = null;
                    this.yO.DW(this);
                    $pc29 = 45; continue $sw29;
                }
                case 45: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r17) {
        java.lang.Exception r2 = null;
        boolean r3 = false;
        java.lang.String r4 = null;
        com.jcraft.jsch.Proxy r9 = null;
        byte[] r10 = null;
        int r11 = 0;
        int r12 = 0;
        com.jcraft.jsch.KeyExchange r13 = null;
        boolean r14 = false;
        java.lang.String r15 = null;
        com.jcraft.jsch.UserAuth r16 = null;
        boolean r18 = false;
        java.lang.String r19 = null;
        java.lang.String[] r110 = null;
        java.lang.String r20 = null;
        java.lang.String r21 = null;
        java.lang.String[] r111 = null;
        java.lang.String r112 = null;
        int r22 = 0;
        boolean r113 = false;
        java.lang.String r23 = null;
        int r5 = 0;
        boolean r6 = false;
        java.lang.String r7 = null;
        int r8 = 0;
        com.jcraft.jsch.UserAuth r24 = null;
        java.lang.String r25 = null;
        java.lang.Object r26 = null;
        java.io.InputStream r27 = null;
        java.io.OutputStream r114 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    if (this.vy == true) { $pc30 = 250; continue $sw30; }
                    this.yS = new com.jcraft.jsch.IO();
                    if (j6 == null) { $pc30 = 272; continue $sw30; }
                    $pc30 = 11; continue $sw30;
                }
                case 11: {
                    com.jcraft.jsch.Packet.j6(j6);
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 265; continue $sw30; }
                    com.jcraft.jsch.JSch.v5().j6(1, "Connecting to " + this.lp + " port " + this.br);
                    $pc30 = 265; continue $sw30;
                }
                case 265: {
                    $pc30 = 229; continue $sw30;
                }
                case 229: {
                    e = $ex30;
                    r2 = e;
                    r3 = false;
                    $pc30 = 231; continue $sw30;
                }
                case 231: {
                    try {
                        this.XG = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 227; continue $sw30;
                    }
                    if (this.vy == false) { $pc30 = 261; continue $sw30; }
                    try {
                        r4 = r2.toString();
                        this.cb.DW();
                        this.sh.j6(((r4.length() + 13) + 2) + 84);
                        this.sh.j6((byte) 1);
                        this.sh.FH(3);
                        this.sh.Hw(com.jcraft.jsch.Util.FH(r4));
                        this.sh.Hw(com.jcraft.jsch.Util.FH("en"));
                        DW(this.cb);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 252; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 261; continue $sw30;
                }
                case 261: {
                    try {
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 253; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 237; continue $sw30;
                }
                case 237: {
                    try {
                        this.vy = false;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 227; continue $sw30;
                    }
                    if ((r2 instanceof java.lang.RuntimeException) == true) { $pc30 = 246; continue $sw30; }
                    if ((r2 instanceof com.jcraft.jsch.JSchException) == false) { $pc30 = 244; continue $sw30; }
                    try {
                        throw ((com.jcraft.jsch.JSchException) r2);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 244: {
                    try {
                        throw new com.jcraft.jsch.JSchException("Session.connect", r2);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 246: {
                    try {
                        throw ((java.lang.RuntimeException) r2);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 16: {
                    if (this.ef == null) { $pc30 = 18; continue $sw30; }
                    try {
                        r9 = this.ef;
                        monitor-enter(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    try {
                        this.ef.j6(this.dx, this.lp, this.br, r17);
                        this.yS.j6(this.ef.DW());
                        this.yS.DW(this.ef.j6());
                        this.gW = this.ef.getSocket();
                        monitor-exit(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 223; continue $sw30;
                    }
                    $pc30 = 26; continue $sw30;
                }
                case 26: {
                    if (r17 > 0) { $pc30 = 28; continue $sw30; }
                    $pc30 = 30; continue $sw30;
                }
                case 30: {
                    try {
                        this.vy = true;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 33; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(1, "Connection established");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 33; continue $sw30;
                }
                case 33: {
                    try {
                        this.yO.j6(this);
                        r10 = new byte[this.v5.length + 1];
                        java.lang.System.arraycopy(this.v5, 0, r10, 0, this.v5.length);
                        r10[r10.length - 1] = 10;
                        this.yS.DW(r10, 0, r10.length);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 34; continue $sw30;
                }
                case 34: {
                    r11 = 0;
                    r12 = 0;
                    $pc30 = 36; continue $sw30;
                }
                case 36: {
                    if (r11 >= this.sh.DW.length) { $pc30 = 43; continue $sw30; }
                    try {
                        r12 = this.yS.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r12 < 0) { $pc30 = 43; continue $sw30; }
                    try {
                        this.sh.DW[r11] = (byte) r12;
                        r11 = r11 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r12 != 10) { $pc30 = 36; continue $sw30; }
                    $pc30 = 43; continue $sw30;
                }
                case 43: {
                    if (r12 < 0) { $pc30 = 222; continue $sw30; }
                    if (this.sh.DW[r11 - 1] != 10) { $pc30 = 51; continue $sw30; }
                    try {
                        r11 = r11 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r11 <= 0) { $pc30 = 51; continue $sw30; }
                    if (this.sh.DW[r11 - 1] != 13) { $pc30 = 51; continue $sw30; }
                    try {
                        r11 = r11 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 51; continue $sw30;
                }
                case 51: {
                    if (r11 <= 3) { $pc30 = 34; continue $sw30; }
                    if (r11 == this.sh.DW.length) { $pc30 = 64; continue $sw30; }
                    if (this.sh.DW[0] != 83) { $pc30 = 34; continue $sw30; }
                    if (this.sh.DW[1] != 83) { $pc30 = 34; continue $sw30; }
                    if (this.sh.DW[2] != 72) { $pc30 = 34; continue $sw30; }
                    if (this.sh.DW[3] != 45) { $pc30 = 34; continue $sw30; }
                    $pc30 = 64; continue $sw30;
                }
                case 64: {
                    if (r11 == this.sh.DW.length) { $pc30 = 220; continue $sw30; }
                    if (r11 < 7) { $pc30 = 220; continue $sw30; }
                    if (this.sh.DW[4] == 49) { $pc30 = 70; continue $sw30; }
                    $pc30 = 71; continue $sw30;
                }
                case 71: {
                    try {
                        this.Hw = new byte[r11];
                        java.lang.System.arraycopy(this.sh.DW, 0, this.Hw, 0, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 74; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(1, "Remote version string: " + com.jcraft.jsch.Util.j6(this.Hw));
                        com.jcraft.jsch.JSch.v5().j6(1, "Local version string: " + com.jcraft.jsch.Util.j6(this.v5));
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 74; continue $sw30;
                }
                case 74: {
                    try {
                        J8();
                        this.sh = j6(this.sh);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (this.sh.DW() == 20) { $pc30 = 77; continue $sw30; }
                    try {
                        this.XG = false;
                        throw new com.jcraft.jsch.JSchException("invalid protocol: " + this.sh.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 77: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 79; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEXINIT received");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 79; continue $sw30;
                }
                case 79: {
                    try {
                        r13 = DW(this.sh);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 80; continue $sw30;
                }
                case 80: {
                    try {
                        this.sh = j6(this.sh);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r13.VH() != this.sh.DW()) { $pc30 = 215; continue $sw30; }
                    try {
                        this.Qq = java.lang.System.currentTimeMillis();
                        r14 = r13.j6(this.sh);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r14 == false) { $pc30 = 213; continue $sw30; }
                    if (r13.VH() != 0) { $pc30 = 80; continue $sw30; }
                    try {
                        j6(this.lp, this.br, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc30 = 207; continue $sw30; }
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    try {
                        Ws();
                        this.sh = j6(this.sh);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (this.sh.DW() == 21) { $pc30 = 90; continue $sw30; }
                    try {
                        this.XG = false;
                        throw new com.jcraft.jsch.JSchException("invalid protocol(newkyes): " + this.sh.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 90: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 92; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_NEWKEYS received");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 92; continue $sw30;
                }
                case 92: {
                    try {
                        j6(this.sh, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    try {
                        r15 = DW("MaxAuthTries");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc30 = 202; continue $sw30; }
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r15 == null) { $pc30 = 270; continue $sw30; }
                    try {
                        this.sy = java.lang.Integer.parseInt(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.NumberFormatException) { $pc30 = 202; continue $sw30; }
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 270; continue $sw30;
                }
                case 270: {
                    try {
                        r16 = (com.jcraft.jsch.UserAuth) java.lang.Class.forName(DW("userauth.none")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 199; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    try {
                        r18 = r16.j6(this);
                        r19 = DW("PreferredAuthentications");
                        r110 = com.jcraft.jsch.Util.j6(r19, ",");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r18 == true) { $pc30 = 103; continue $sw30; }
                    try {
                        r20 = ((com.jcraft.jsch.UserAuthNone) r16).j6();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r20 == null) { $pc30 = 102; continue $sw30; }
                    try {
                        r21 = r20.toLowerCase();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 104; continue $sw30;
                }
                case 104: {
                    try {
                        r111 = com.jcraft.jsch.Util.j6(r21, ",");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    r112 = r21;
                    r22 = 0;
                    $pc30 = 105; continue $sw30;
                }
                case 105: {
                    r113 = false;
                    $pc30 = 106; continue $sw30;
                }
                case 106: {
                    if (r18 == true) { $pc30 = 167; continue $sw30; }
                    if (r110 == null) { $pc30 = 167; continue $sw30; }
                    if (r22 >= r110.length) { $pc30 = 167; continue $sw30; }
                    try {
                        r22 = r22 + 1;
                        r23 = r110[r22];
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    r5 = 0;
                    $pc30 = 113; continue $sw30;
                }
                case 113: {
                    if (r5 >= r111.length) { $pc30 = 114; continue $sw30; }
                    if (r111[r5].equals(r23) == true) { $pc30 = 117; continue $sw30; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    { $pc30 = 113; continue $sw30; }
                }
                case 117: {
                    r6 = true;
                    $pc30 = 118; continue $sw30;
                }
                case 118: {
                    if (r6 == false) { $pc30 = 106; continue $sw30; }
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 266; continue $sw30; }
                    r7 = "Authentications that can continue: ";
                    try {
                        r8 = r22 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 124; continue $sw30;
                }
                case 124: {
                    if (r8 >= r110.length) { $pc30 = 125; continue $sw30; }
                    try {
                        r7 = java.lang.String.valueOf(r7) + r110[r8];
                        r8 = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r8 >= r110.length) { $pc30 = 124; continue $sw30; }
                    try {
                        r7 = java.lang.String.valueOf(r7) + ",";
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    { $pc30 = 124; continue $sw30; }
                }
                case 125: {
                    try {
                        com.jcraft.jsch.JSch.v5().j6(1, r7);
                        com.jcraft.jsch.JSch.v5().j6(1, "Next authentication method: " + r23);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 266; continue $sw30;
                }
                case 266: {
                    if (DW("userauth." + r23) == null) { $pc30 = 137; continue $sw30; }
                    try {
                        r24 = (com.jcraft.jsch.UserAuth) java.lang.Class.forName(DW("userauth." + r23)).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 134; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 138; continue $sw30;
                }
                case 138: {
                    if (r24 == null) { $pc30 = 106; continue $sw30; }
                    try {
                        r18 = r24.j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 146; continue $sw30; }
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc30 = 152; continue $sw30; }
                        if ($t instanceof java.lang.RuntimeException) { $pc30 = 155; continue $sw30; }
                        if ($t instanceof com.jcraft.jsch.JSchPartialAuthException) { $pc30 = 158; continue $sw30; }
                        if ($t instanceof com.jcraft.jsch.JSchAuthCancelException) { $pc30 = 164; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r18 == false) { $pc30 = 144; continue $sw30; }
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 144; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(1, "Authentication succeeded (" + r23 + ").");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 146; continue $sw30; }
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc30 = 152; continue $sw30; }
                        if ($t instanceof java.lang.RuntimeException) { $pc30 = 155; continue $sw30; }
                        if ($t instanceof com.jcraft.jsch.JSchPartialAuthException) { $pc30 = 158; continue $sw30; }
                        if ($t instanceof com.jcraft.jsch.JSchAuthCancelException) { $pc30 = 164; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 144; continue $sw30;
                }
                case 144: {
                    r22 = r22;
                    $pc30 = 164; continue $sw30;
                }
                case 164: {
                    r113 = true;
                    $pc30 = 158; continue $sw30;
                }
                case 158: {
                    e = $ex30;
                    try {
                        r25 = e.j6();
                        r111 = com.jcraft.jsch.Util.j6(r25, ",");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    if (r112.equals(r25) == true) { $pc30 = 162; continue $sw30; }
                    r22 = 0;
                    $pc30 = 163; continue $sw30;
                }
                case 163: {
                    r112 = r25;
                    { $pc30 = 105; continue $sw30; }
                }
                case 162: {
                    r22 = r22;
                    $pc30 = 152; continue $sw30;
                }
                case 152: {
                    e = $ex30;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 155: {
                    e = $ex30;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 146: {
                    e = $ex30;
                    if (com.jcraft.jsch.JSch.v5().isEnabled(2) == false) { $pc30 = 151; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(2, "an exception during authentication\n" + e.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 151; continue $sw30;
                }
                case 151: {
                    r113 = false;
                    $pc30 = 137; continue $sw30;
                }
                case 137: {
                    r24 = null;
                    $pc30 = 135; continue $sw30;
                }
                case 135: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(2) == false) { $pc30 = 137; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(2, "failed to load " + r23 + " method");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    { $pc30 = 137; continue $sw30; }
                }
                case 114: {
                    r6 = false;
                    $pc30 = 167; continue $sw30;
                }
                case 167: {
                    if (r18 == true) { $pc30 = 179; continue $sw30; }
                    if (this.aj >= this.sy) { $pc30 = 171; continue $sw30; }
                    $pc30 = 173; continue $sw30;
                }
                case 173: {
                    if (r113 == false) { $pc30 = 177; continue $sw30; }
                    try {
                        throw new com.jcraft.jsch.JSchException("Auth cancel");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 177: {
                    try {
                        throw new com.jcraft.jsch.JSchException("Auth fail");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 171: {
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc30 = 173; continue $sw30; }
                    try {
                        com.jcraft.jsch.JSch.v5().j6(1, "Login trials exceeds " + this.sy);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    { $pc30 = 173; continue $sw30; }
                }
                case 179: {
                    if (this.gW == null) { $pc30 = 184; continue $sw30; }
                    if (r17 <= 0) { $pc30 = 182; continue $sw30; }
                    $pc30 = 183; continue $sw30;
                }
                case 183: {
                    try {
                        this.gW.setSoTimeout(this.BT);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    { $pc30 = 184; continue $sw30; }
                }
                case 182: {
                    if (this.BT > 0) { $pc30 = 183; continue $sw30; }
                    $pc30 = 184; continue $sw30;
                }
                case 184: {
                    try {
                        this.P8 = true;
                        r26 = this.nw;
                        monitor-enter(r26);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 195; continue $sw30;
                }
                case 195: {
                    th = $ex30;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 187: {
                    if (this.vy == false) { $pc30 = 192; continue $sw30; }
                    try {
                        this.ei = new java.lang.Thread(this);
                        this.ei.setName("Connect thread " + this.lp + " session");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 195; continue $sw30;
                    }
                    if (this.x9 == false) { $pc30 = 191; continue $sw30; }
                    try {
                        this.ei.setDaemon(this.x9);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 195; continue $sw30;
                    }
                    $pc30 = 191; continue $sw30;
                }
                case 191: {
                    try {
                        this.ei.start();
                        J0();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 195; continue $sw30;
                    }
                    $pc30 = 192; continue $sw30;
                }
                case 192: {
                    try {
                        monitor-exit(r26);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 195; continue $sw30;
                    }
                    com.jcraft.jsch.Util.DW(this.kQ);
                    this.kQ = null;
                    return;
                }
                case 102: {
                    r21 = r19;
                    { $pc30 = 104; continue $sw30; }
                }
                case 103: {
                    r21 = null;
                    $pc30 = 199; continue $sw30;
                }
                case 199: {
                    e = $ex30;
                    try {
                        throw new com.jcraft.jsch.JSchException(e.toString(), e);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 202: {
                    e = $ex30;
                    try {
                        throw new com.jcraft.jsch.JSchException("MaxAuthTries: " + DW("MaxAuthTries"), e);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 207: {
                    e = $ex30;
                    r3 = false;
                    try {
                        this.XG = false;
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 211; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 211: {
                    e = $ex30;
                    r2 = e;
                    { $pc30 = 231; continue $sw30; }
                }
                case 213: {
                    try {
                        this.XG = false;
                        throw new com.jcraft.jsch.JSchException("verify: " + r14);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 215: {
                    try {
                        this.XG = false;
                        throw new com.jcraft.jsch.JSchException("invalid protocol(kex): " + this.sh.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 70: {
                    if (this.sh.DW[6] == 57) { $pc30 = 71; continue $sw30; }
                    $pc30 = 220; continue $sw30;
                }
                case 220: {
                    try {
                        throw new com.jcraft.jsch.JSchException("invalid server's version string");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 222: {
                    try {
                        throw new com.jcraft.jsch.JSchException("connection is closed by foreign host");
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 28: {
                    if (this.gW == null) { $pc30 = 30; continue $sw30; }
                    try {
                        this.gW.setSoTimeout(r17);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 223; continue $sw30;
                }
                case 223: {
                    th = $ex30;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                }
                case 18: {
                    if (this.dx != null) { $pc30 = 20; continue $sw30; }
                    try {
                        this.gW = com.jcraft.jsch.Util.j6(this.lp, this.br, r17);
                        r27 = this.gW.getInputStream();
                        r114 = this.gW.getOutputStream();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 21; continue $sw30;
                }
                case 21: {
                    try {
                        this.gW.setTcpNoDelay(true);
                        this.yS.j6(r27);
                        this.yS.DW(r114);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    { $pc30 = 26; continue $sw30; }
                }
                case 20: {
                    try {
                        this.gW = this.dx.j6(this.lp, this.br);
                        r27 = this.dx.j6(this.gW);
                        r114 = this.dx.DW(this.gW);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 229; continue $sw30; }
                        $pc30 = 227; continue $sw30;
                    }
                    $pc30 = 227; continue $sw30;
                }
                case 227: {
                    th = $ex30;
                    com.jcraft.jsch.Util.DW(this.kQ);
                    this.kQ = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 272: {
                    try {
                        j6 = (com.jcraft.jsch.Random) java.lang.Class.forName(DW("random")).newInstance();
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 8; continue $sw30; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc30 = 8; continue $sw30;
                }
                case 8: {
                    e = $ex30;
                    throw new com.jcraft.jsch.JSchException(e.toString(), e);
                }
                case 250: {
                    throw new com.jcraft.jsch.JSchException("session is already connected");
                }
                case 134: {
                    $pc30 = 252; continue $sw30;
                }
                case 252: {
                    $pc30 = 253; continue $sw30;
                }
                case 253: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(com.jcraft.jsch.Channel r1) {
        r1.DW(this);
    }

    public void j6(com.jcraft.jsch.HostKeyRepository r1) {
        this.ca = r1;
    }

    public void j6(com.jcraft.jsch.IdentityRepository r1) {
        this.I = r1;
    }

    public void j6(com.jcraft.jsch.Packet r10) {
        com.jcraft.jsch.Compression r0 = null;
        int[] r2 = null;
        com.jcraft.jsch.Buffer r3 = null;
        com.jcraft.jsch.Buffer r1 = null;
        byte r4 = 0;
        com.jcraft.jsch.Random r5 = null;
        com.jcraft.jsch.MAC r6 = null;
        com.jcraft.jsch.MAC r7 = null;
        com.jcraft.jsch.Buffer r8 = null;
        com.jcraft.jsch.MAC r9 = null;
        com.jcraft.jsch.Buffer r11 = null;
        com.jcraft.jsch.Cipher r12 = null;
        com.jcraft.jsch.Buffer r13 = null;
        byte[] r14 = null;
        com.jcraft.jsch.MAC r15 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    r0 = this.rN;
                    if (r0 == null) { $pc31 = 6; continue $sw31; }
                    r2 = this.wc;
                    r3 = r10.DW;
                    r2[0] = r3.FH;
                    r3.DW = r0.j6(r3.DW, 5, r2);
                    r1 = r10.DW;
                    r1.FH = this.wc[0];
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    if (this.j3 == null) { $pc31 = 15; continue $sw31; }
                    r10.j6(this.CU);
                    r4 = r10.DW.DW[4];
                    r5 = j6;
                    monitor-enter(r5);
                    try {
                        j6.j6(r10.DW.DW, r10.DW.FH - r4, r4);
                        monitor-exit(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 12; continue $sw31;
                    }
                    $pc31 = 16; continue $sw31;
                }
                case 16: {
                    r6 = this.U2;
                    if (r6 == null) { $pc31 = 19; continue $sw31; }
                    r6.update(this.QX);
                    r7 = this.U2;
                    r8 = r10.DW;
                    r7.update(r8.DW, 0, r8.FH);
                    r9 = this.U2;
                    r11 = r10.DW;
                    r9.j6(r11.DW, r11.FH);
                    $pc31 = 19; continue $sw31;
                }
                case 19: {
                    r12 = this.j3;
                    if (r12 == null) { $pc31 = 22; continue $sw31; }
                    r13 = r10.DW;
                    r14 = r13.DW;
                    r12.j6(r14, 0, r13.FH, r14, 0);
                    $pc31 = 22; continue $sw31;
                }
                case 22: {
                    r15 = this.U2;
                    if (r15 == null) { $pc31 = 28; continue $sw31; }
                    r10.DW.v5(r15.j6());
                    return;
                }
                case 28: {
                    return;
                }
                case 12: {
                    th = $ex31;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 15: {
                    r10.j6(8);
                    { $pc31 = 16; continue $sw31; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(com.jcraft.jsch.Packet r13, com.jcraft.jsch.Channel r14, int r15) {
        long r0 = 0L;
        long r7 = 0L;
        boolean r2 = false;
        int r5 = 0;
        int r6 = 0;
        byte r8 = 0;
        int r9 = 0;
        int r10 = 0;
        long r3 = 0L;
        int r16 = 0;
        int r11 = 0;
        byte r17 = 0;
        int r12 = 0;
        int r4 = 0;
        long r18 = 0L;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    r0 = VH();
                    $pc32 = 4; continue $sw32;
                }
                case 4: {
                    if (this.XG == true) { $pc32 = 6; continue $sw32; }
                    monitor-enter(r14);
                    $pc32 = 83; continue $sw32;
                }
                case 83: {
                    th = $ex32;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 18: {
                    r7 = r15;
                    r2 = true;
                    if (r14.u7 >= r7) { $pc32 = 28; continue $sw32; }
                    try {
                        r14.a8++;
                        r14.wait(100);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc32 = 26; continue $sw32; }
                        $pc32 = 23; continue $sw32;
                    }
                    try {
                        r5 = r14.a8;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 83; continue $sw32;
                    }
                    $pc32 = 22; continue $sw32;
                }
                case 22: {
                    try {
                        r14.a8 = r5 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 83; continue $sw32;
                    }
                    { $pc32 = 28; continue $sw32; }
                }
                case 23: {
                    th = $ex32;
                    try {
                        r14.a8--;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 83; continue $sw32;
                    }
                }
                case 26: {
                    try {
                        r5 = r14.a8;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 83; continue $sw32;
                    }
                    $pc32 = 28; continue $sw32;
                }
                case 28: {
                    if (r14.u7 >= r7) { $pc32 = 29; continue $sw32; }
                    try {
                        monitor-exit(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 83; continue $sw32;
                    }
                    if (r14.Ws == true) { $pc32 = 82; continue $sw32; }
                    if (r14.J0() == false) { $pc32 = 82; continue $sw32; }
                    r6 = -1;
                    monitor-enter(r14);
                    r8 = 0;
                    r9 = 0;
                    r10 = 0;
                    if (r14.u7 <= 0) { $pc32 = 55; continue $sw32; }
                    try {
                        r3 = r14.u7;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 78; continue $sw32;
                    }
                    if (r3 <= r7) { $pc32 = 45; continue $sw32; }
                    r3 = r7;
                    $pc32 = 45; continue $sw32;
                }
                case 45: {
                    if (r3 == r7) { $pc32 = 54; continue $sw32; }
                    try {
                        r16 = (int) r3;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 78; continue $sw32;
                    }
                    if (this.j3 == null) { $pc32 = 49; continue $sw32; }
                    try {
                        r11 = this.CU;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 78; continue $sw32;
                    }
                    $pc32 = 51; continue $sw32;
                }
                case 51: {
                    if (this.U2 == null) { $pc32 = 53; continue $sw32; }
                    try {
                        r9 = this.U2.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 78; continue $sw32;
                    }
                    $pc32 = 53; continue $sw32;
                }
                case 53: {
                    try {
                        r10 = r13.j6(r16, r11, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 78; continue $sw32;
                    }
                    { $pc32 = 54; continue $sw32; }
                }
                case 49: {
                    r11 = 8;
                    $pc32 = 54; continue $sw32;
                }
                case 54: {
                    try {
                        r17 = r13.DW.DW();
                        r6 = r14.tp();
                        r12 = (int) (r7 - r3);
                        r14.u7 -= r3;
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 78; continue $sw32;
                    }
                    r4 = r10;
                    r8 = r17;
                    r15 = r12;
                    $pc32 = 56; continue $sw32;
                }
                case 56: {
                    try {
                        monitor-exit(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 78; continue $sw32;
                    }
                    if (r2 == false) { $pc32 = 62; continue $sw32; }
                    FH(r13);
                    if (r15 == 0) { $pc32 = 60; continue $sw32; }
                    r13.j6(r8, r6, r4, r15);
                    { $pc32 = 62; continue $sw32; }
                }
                case 60: {
                    return;
                }
                case 62: {
                    monitor-enter(r14);
                    $pc32 = 75; continue $sw32;
                }
                case 75: {
                    th = $ex32;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 64: {
                    if (this.XG == true) { $pc32 = 65; continue $sw32; }
                    r18 = r15;
                    if (r14.u7 >= r18) { $pc32 = 69; continue $sw32; }
                    try {
                        monitor-exit(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 75; continue $sw32;
                    }
                    { $pc32 = 4; continue $sw32; }
                }
                case 69: {
                    try {
                        r14.u7 -= r18;
                        monitor-exit(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 75; continue $sw32;
                    }
                    $pc32 = 71; continue $sw32;
                }
                case 71: {
                    FH(r13);
                    return;
                }
                case 65: {
                    try {
                        monitor-exit(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 75; continue $sw32;
                    }
                    { $pc32 = 4; continue $sw32; }
                }
                case 55: {
                    r2 = false;
                    r4 = 0;
                    $pc32 = 78; continue $sw32;
                }
                case 78: {
                    th = $ex32;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 82: {
                    throw new java.io.IOException("channel is broken");
                }
                case 29: {
                    try {
                        r14.u7 -= r7;
                        monitor-exit(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 83; continue $sw32;
                    }
                    { $pc32 = 71; continue $sw32; }
                }
                case 6: {
                    if (r0 <= 0) { $pc32 = 95; continue $sw32; }
                    if ((java.lang.System.currentTimeMillis() - this.Qq) <= r0) { $pc32 = 95; continue $sw32; }
                    throw new com.jcraft.jsch.JSchException("timeout in wating for rekeying process.");
                }
                case 95: {
                    try {
                        java.lang.Thread.sleep(10);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc32 = 15; continue $sw32; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc32 = 4; continue $sw32; }
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.jcraft.jsch.UserInfo r1) {
        this.Sf = r1;
    }

    public void j6(java.lang.String r3, java.lang.String r4) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = -1;
        $sw33: while (true) {
            switch ($pc33) {
                case -1: {
                    r0 = this.nw;
                    monitor-enter(r0);
                    $pc33 = 10; continue $sw33;
                }
                case 10: {
                    th = $ex33;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (this.sG != null) { $pc33 = 7; continue $sw33; }
                    try {
                        this.sG = new java.util.Hashtable();
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 10; continue $sw33;
                    }
                    $pc33 = 7; continue $sw33;
                }
                case 7: {
                    try {
                        this.sG.put(r3, r4);
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 10; continue $sw33;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void run() {
        com.jcraft.jsch.Buffer r0 = null;
        com.jcraft.jsch.Packet r1 = null;
        int[] r3 = null;
        int[] r4 = null;
        com.jcraft.jsch.KeyExchange r7 = null;
        int r8 = 0;
        int r9 = 0;
        boolean r10 = false;
        java.lang.Thread r11 = null;
        com.jcraft.jsch.Session.GlobalRequestReply r12 = null;
        int r13 = 0;
        boolean r14 = false;
        com.jcraft.jsch.Channel r15 = null;
        int r16 = 0;
        byte[] r17 = null;
        boolean r18 = false;
        com.jcraft.jsch.Channel r19 = null;
        byte r110 = 0;
        com.jcraft.jsch.Channel r20 = null;
        com.jcraft.jsch.Channel r21 = null;
        com.jcraft.jsch.Channel r22 = null;
        byte[] r111 = null;
        com.jcraft.jsch.Channel r23 = null;
        byte[] r112 = null;
        com.jcraft.jsch.Channel r24 = null;
        com.jcraft.jsch.Channel r25 = null;
        com.jcraft.jsch.Channel r26 = null;
        int r27 = 0;
        long r113 = 0L;
        int r114 = 0;
        java.lang.String r28 = null;
        com.jcraft.jsch.Channel r29 = null;
        java.lang.Thread r115 = null;
        com.jcraft.jsch.Channel r30 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = -1;
        $sw34: while (true) {
            switch ($pc34) {
                case -1: {
                    this.Xa = this;
                    r0 = new com.jcraft.jsch.Buffer();
                    r1 = new com.jcraft.jsch.Packet(r0);
                    r3 = new int[1];
                    r4 = new int[1];
                    $pc34 = 3; continue $sw34;
                }
                case 3: {
                    r7 = null;
                    $pc34 = 4; continue $sw34;
                }
                case 4: {
                    r8 = 0;
                    $pc34 = 166; continue $sw34;
                }
                case 166: {
                    $pc34 = 153; continue $sw34;
                }
                case 153: {
                    e = $ex34;
                    this.XG = false;
                    if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) { $pc34 = 164; continue $sw34; }
                    com.jcraft.jsch.JSch.v5().j6(1, "Caught an exception, leaving main loop due to " + e.getMessage());
                    $pc34 = 164; continue $sw34;
                }
                case 164: {
                    try {
                        j6();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 161; continue $sw34;
                    }
                    $pc34 = 158; continue $sw34;
                }
                case 158: {
                    this.vy = false;
                    return;
                }
                case 6: {
                    if (this.vy == false) { $pc34 = 164; continue $sw34; }
                    if (this.Xa == null) { $pc34 = 164; continue $sw34; }
                    try {
                        r0 = j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc34 = 140; continue $sw34; }
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc34 = 11; continue $sw34;
                }
                case 11: {
                    try {
                        r9 = r0.DW() & 255;
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7 == null) { $pc34 = 21; continue $sw34; }
                    if (r7.VH() != r9) { $pc34 = 21; continue $sw34; }
                    try {
                        this.Qq = java.lang.System.currentTimeMillis();
                        r10 = r7.j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r10 == true) { $pc34 = 4; continue $sw34; }
                    try {
                        throw new com.jcraft.jsch.JSchException("verify: " + r10);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 21: {
                    if (r9 != 20) { $pc34 = 23; continue $sw34; }
                    try {
                        r7 = DW(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 23: {
                    if (r9 == 21) { $pc34 = 138; continue $sw34; }
                    try {
                        switch(r9) {
                            case 80: { $pc34 = 132; continue $sw34; }
                            case 81: { $pc34 = 120; continue $sw34; }
                            case 82: { $pc34 = 120; continue $sw34; }
                            default: { $pc34 = 26; continue $sw34; }
                        };
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 120: {
                    try {
                        r11 = this.Eq.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r11 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r12 = this.Eq;
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9 != 81) { $pc34 = 125; continue $sw34; }
                    r13 = 1;
                    $pc34 = 126; continue $sw34;
                }
                case 126: {
                    try {
                        r12.DW(r13);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9 == 81) { $pc34 = 129; continue $sw34; }
                    $pc34 = 131; continue $sw34;
                }
                case 131: {
                    try {
                        r11.interrupt();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 129: {
                    if (this.Eq.j6() != 0) { $pc34 = 131; continue $sw34; }
                    try {
                        r0.FH();
                        r0.u7();
                        this.Eq.j6(r0.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 131; continue $sw34; }
                }
                case 125: {
                    r13 = 0;
                    { $pc34 = 126; continue $sw34; }
                }
                case 132: {
                    try {
                        r0.FH();
                        r0.u7();
                        r0.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0.j6() == 0) { $pc34 = 135; continue $sw34; }
                    r14 = true;
                    $pc34 = 136; continue $sw34;
                }
                case 136: {
                    if (r14 == false) { $pc34 = 4; continue $sw34; }
                    try {
                        r1.DW();
                        r0.j6((byte) 82);
                        DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 135: {
                    r14 = false;
                    { $pc34 = 136; continue $sw34; }
                }
                case 26: {
                    try {
                        switch(r9) {
                            case 90: { $pc34 = 105; continue $sw34; }
                            case 91: { $pc34 = 102; continue $sw34; }
                            case 92: { $pc34 = 99; continue $sw34; }
                            case 93: { $pc34 = 95; continue $sw34; }
                            case 94: { $pc34 = 73; continue $sw34; }
                            case 95: { $pc34 = 54; continue $sw34; }
                            case 96: { $pc34 = 51; continue $sw34; }
                            case 97: { $pc34 = 48; continue $sw34; }
                            case 98: { $pc34 = 37; continue $sw34; }
                            case 99: { $pc34 = 33; continue $sw34; }
                            case 100: { $pc34 = 29; continue $sw34; }
                            default: { $pc34 = 28; continue $sw34; }
                        };
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 28: {
                    try {
                        throw new java.io.IOException("Unknown SSH message type " + r9);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 33: {
                    try {
                        r0.FH();
                        r0.u7();
                        r15 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r15 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r15.j3 = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 37: {
                    try {
                        r0.FH();
                        r0.u7();
                        r16 = r0.FH();
                        r17 = r0.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0.j6() == 0) { $pc34 = 40; continue $sw34; }
                    r18 = true;
                    $pc34 = 41; continue $sw34;
                }
                case 41: {
                    try {
                        r19 = com.jcraft.jsch.Channel.j6(r16, this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r19 == null) { $pc34 = 4; continue $sw34; }
                    r110 = 100;
                    if (com.jcraft.jsch.Util.j6(r17).equals("exit-status") == false) { $pc34 = 46; continue $sw34; }
                    try {
                        r19.FH(r0.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r110 = 99;
                    $pc34 = 46; continue $sw34;
                }
                case 46: {
                    if (r18 == false) { $pc34 = 4; continue $sw34; }
                    try {
                        r1.DW();
                        r0.j6(r110);
                        r0.FH(r19.tp());
                        DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 40: {
                    r18 = false;
                    { $pc34 = 41; continue $sw34; }
                }
                case 48: {
                    try {
                        r0.FH();
                        r0.u7();
                        r20 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r20 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r20.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 51: {
                    try {
                        r0.FH();
                        r0.u7();
                        r21 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r21 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r21.Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 54: {
                    try {
                        r0.FH();
                        r0.u7();
                        r22 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                        r0.FH();
                        r111 = r0.j6(r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r22 == null) { $pc34 = 4; continue $sw34; }
                    if (r4[0] == 0) { $pc34 = 4; continue $sw34; }
                    try {
                        r22.DW(r111, r3[0], r4[0]);
                        r22.v5(r22.VH - r4[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r22.VH >= (r22.Zo / 2)) { $pc34 = 4; continue $sw34; }
                    try {
                        r1.DW();
                        r0.j6((byte) 93);
                        r0.FH(r22.tp());
                        r0.FH(r22.Zo - r22.VH);
                        monitor-enter(r22);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r22.Ws == true) { $pc34 = 67; continue $sw34; }
                    try {
                        DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 70; continue $sw34;
                    }
                    $pc34 = 67; continue $sw34;
                }
                case 67: {
                    try {
                        monitor-exit(r22);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 70; continue $sw34;
                    }
                    try {
                        r22.v5(r22.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 70: {
                    th = $ex34;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 73: {
                    try {
                        r0.FH();
                        r0.j6();
                        r0.j6();
                        r23 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                        r112 = r0.j6(r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r23 == null) { $pc34 = 4; continue $sw34; }
                    if (r4[0] == 0) { $pc34 = 4; continue $sw34; }
                    try {
                        r23.j6(r112, r3[0], r4[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 93; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r23.v5(r23.VH - r4[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r23.VH >= (r23.Zo / 2)) { $pc34 = 4; continue $sw34; }
                    try {
                        r1.DW();
                        r0.j6((byte) 93);
                        r0.FH(r23.tp());
                        r0.FH(r23.Zo - r23.VH);
                        monitor-enter(r23);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r23.Ws == true) { $pc34 = 87; continue $sw34; }
                    try {
                        DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 90; continue $sw34;
                    }
                    $pc34 = 87; continue $sw34;
                }
                case 87: {
                    try {
                        monitor-exit(r23);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 90; continue $sw34;
                    }
                    try {
                        r23.v5(r23.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 90: {
                    th = $ex34;
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 93: {
                    try {
                        r23.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 160; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 95: {
                    try {
                        r0.FH();
                        r0.u7();
                        r24 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r24 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r24.j6(r0.EQ());
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 99: {
                    try {
                        r0.FH();
                        r0.u7();
                        r25 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r25 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r25.FH(r0.FH());
                        r25.Ws = true;
                        r25.J8 = true;
                        r25.VH(0);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 102: {
                    try {
                        r0.FH();
                        r0.u7();
                        r26 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                        r27 = r0.FH();
                        r113 = r0.EQ();
                        r114 = r0.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r26 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r26.DW(r113);
                        r26.gn(r114);
                        r26.XL = true;
                        r26.VH(r27);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 105: {
                    try {
                        r0.FH();
                        r0.u7();
                        r28 = com.jcraft.jsch.Util.j6(r0.tp());
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ("forwarded-tcpip".equals(r28) == true) { $pc34 = 116; continue $sw34; }
                    if ("x11".equals(r28) == false) { $pc34 = 112; continue $sw34; }
                    if (this.SI == true) { $pc34 = 116; continue $sw34; }
                    $pc34 = 112; continue $sw34;
                }
                case 112: {
                    if ("auth-agent@openssh.com".equals(r28) == false) { $pc34 = 115; continue $sw34; }
                    if (this.KD == true) { $pc34 = 116; continue $sw34; }
                    $pc34 = 115; continue $sw34;
                }
                case 115: {
                    try {
                        r1.DW();
                        r0.j6((byte) 92);
                        r0.FH(r0.FH());
                        r0.FH(1);
                        r0.Hw(com.jcraft.jsch.Util.FH);
                        r0.Hw(com.jcraft.jsch.Util.FH);
                        DW(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc34 = 116; continue $sw34;
                }
                case 116: {
                    try {
                        r29 = com.jcraft.jsch.Channel.j6(r28);
                        j6(r29);
                        r29.j6(r0);
                        r29.we();
                        r115 = new java.lang.Thread(r29);
                        r115.setName("Channel " + r28 + " " + this.lp);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.x9 == false) { $pc34 = 119; continue $sw34; }
                    try {
                        r115.setDaemon(this.x9);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc34 = 119; continue $sw34;
                }
                case 119: {
                    try {
                        r115.start();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 29: {
                    try {
                        r0.FH();
                        r0.u7();
                        r30 = com.jcraft.jsch.Channel.j6(r0.FH(), this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r30 == null) { $pc34 = 4; continue $sw34; }
                    try {
                        r30.j3 = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc34 = 4; continue $sw34; }
                }
                case 138: {
                    try {
                        Ws();
                        j6(r0, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc34 = 140; continue $sw34;
                }
                case 140: {
                    e = $ex34;
                    if (this.XG == true) { $pc34 = 148; continue $sw34; }
                    if (r8 >= this.Mz) { $pc34 = 148; continue $sw34; }
                    try {
                        EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc34 = 146; continue $sw34;
                }
                case 146: {
                    try {
                        r8 = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc34 = 148; continue $sw34;
                }
                case 148: {
                    if (this.XG == false) { $pc34 = 152; continue $sw34; }
                    if (r8 < this.Mz) { $pc34 = 146; continue $sw34; }
                    $pc34 = 152; continue $sw34;
                }
                case 152: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        if ($t instanceof java.lang.Exception) { $pc34 = 153; continue $sw34; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 160: {
                    $pc34 = 161; continue $sw34;
                }
                case 161: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean tp() {
        return this.vy;
    }

    public java.lang.String u7() {
        return this.XX;
    }

    public int v5() {
        return this.br;
    }

    public void v5(java.lang.String r1) {
        java.lang.Throwable $ex35 = null;
        int $pc35 = -1;
        $sw35: while (true) {
            switch ($pc35) {
                case -1: {
                    if (r1 == null) { $pc35 = 5; continue $sw35; }
                    this.kQ = com.jcraft.jsch.Util.FH(r1);
                    return;
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
