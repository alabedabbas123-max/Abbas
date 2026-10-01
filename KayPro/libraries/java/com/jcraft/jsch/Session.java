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
        if (this.XX != null) goto L8;
        this.XX = (java.lang.String) java.lang.System.getProperties().get("user.name");     // Catch: java.lang.SecurityException -> L6
    L8:
        if (this.XX == null) goto L11;
        return;
    L11:
        throw new com.jcraft.jsch.JSchException("username is not given.");
    }

    private com.jcraft.jsch.KeyExchange DW(com.jcraft.jsch.Buffer r7) {
        int r0 = r7.FH();
        if (r0 == r7.Hw()) goto L5;
        r7.j6();
        this.VH = new byte[r7.FH - 5];
    L6:
        byte[] r1 = r7.DW;
        int r8 = r7.Hw;
        byte[] r2 = this.VH;
        java.lang.System.arraycopy(r1, r8, r2, 0, r2.length);
        if (this.XG == true) goto L9;
        J8();
    L9:
        this.XL = com.jcraft.jsch.KeyExchange.j6(this.VH, this.Zo);
        java.lang.String[] r9 = this.XL;
        if (r9 == null) goto L27;
        if (this.P8 == false) goto L14;
    L28:
        com.jcraft.jsch.KeyExchange r10 = (com.jcraft.jsch.KeyExchange) java.lang.Class.forName(DW(this.XL[0])).newInstance();     // Catch: java.lang.Exception -> L23
        r10.j6(this, this.Hw, this.v5, this.VH, this.Zo);
        return r10;
    L23:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L14:
        if (r9[2].equals("none") == true) goto L19;
        if (this.XL[3].equals("none") == false) goto L28;
    L19:
        throw new com.jcraft.jsch.JSchException("NONE Cipher should not be chosen before authentification is successed.");
    L27:
        throw new com.jcraft.jsch.JSchException("Algorithm negotiation fail");
    L5:
        this.VH = new byte[(r0 - 1) - r7.j6()];
        goto L6
    }

    private void EQ(java.lang.String r3) {
        if (r3.equals("none") == false) goto L6;
        this.er = null;
        return;
    L6:
        java.lang.String r0 = DW(r3);
        if (r0 != null) goto L9;
        return;
    L9:
        if (r3.equals("zlib") == false) goto L11;
    L20:
        this.er = (com.jcraft.jsch.Compression) java.lang.Class.forName(r0).newInstance();     // Catch: java.lang.Exception -> L16
        this.er.j6(0, 0);     // Catch: java.lang.Exception -> L16
        return;
    L16:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L11:
        if (this.P8 == true) goto L13;
        return;
    L13:
        if (r3.equals("zlib@openssh.com") == true) goto L20;
    }

    private void FH(com.jcraft.jsch.Packet r3) {
        java.lang.Object r0 = this.nw;
        monitor-enter(r0);
        j6(r3);     // Catch: java.lang.Throwable -> L9
        if (this.yS == null) goto L7;
        this.yS.j6(r3);     // Catch: java.lang.Throwable -> L9
        this.QX++;     // Catch: java.lang.Throwable -> L9
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    private void J0() {
        if (DW("ClearAllForwardings").equals("yes") == false) goto L5;
        return;
    L5:
        com.jcraft.jsch.ConfigRepository r0 = this.yO.j6();
        if (r0 != null) goto L8;
        return;
    L8:
        com.jcraft.jsch.ConfigRepository.Config r1 = r0.j6(this.OW);
        java.lang.String[] r2 = r1.j6("LocalForward");
        int r3 = 0;
        if (r2 == null) goto L15;
        int r4 = 0;
    L12:
        if (r4 >= r2.length) goto L15;
        Zo(r2[r4]);
        r4 = r4 + 1;
    L15:
        java.lang.String[] r5 = r1.j6("RemoteForward");
        if (r5 != null) goto L18;
        return;
    L18:
        if (r3 >= r5.length) goto L24;
        VH(r5[r3]);
        r3 = r3 + 1;
        goto L18
    }

    private void J8() {
        if (this.XG == false) goto L5;
        return;
    L5:
        java.lang.String r0 = DW("cipher.c2s");
        java.lang.String r1 = DW("cipher.s2c");
        java.lang.String[] r2 = gn(DW("CheckCiphers"));
        if (r2 != null) goto L8;
    L15:
        java.lang.String r3 = DW("kex");
        java.lang.String[] r4 = u7(DW("CheckKexes"));
        if (r4 != null) goto L18;
    L24:
        this.XG = true;
        this.Qq = java.lang.System.currentTimeMillis();
        com.jcraft.jsch.Buffer r5 = new com.jcraft.jsch.Buffer();
        com.jcraft.jsch.Packet r6 = new com.jcraft.jsch.Packet(r5);
        r6.DW();
        r5.j6((byte) 20);
        com.jcraft.jsch.Random r7 = j6;
        monitor-enter(r7);
        j6.j6(r5.DW, r5.FH, 16);     // Catch: java.lang.Throwable -> L32
        r5.v5(16);     // Catch: java.lang.Throwable -> L32
        monitor-exit(r7);     // Catch: java.lang.Throwable -> L32
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
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L37;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEXINIT sent");
        return;
    L37:
        return;
    L32:
        th = move-exception;
        throw th;
    L18:
        if (r4.length <= 0) goto L24;
        r3 = com.jcraft.jsch.Util.j6(r3, r4);
        if (r3 != null) goto L24;
        throw new com.jcraft.jsch.JSchException("There are not any available kexes.");
    L8:
        if (r2.length <= 0) goto L15;
        r0 = com.jcraft.jsch.Util.j6(r0, r2);
        r1 = com.jcraft.jsch.Util.j6(r1, r2);
        if (r0 == null) goto L14;
        if (r1 != null) goto L15;
    L14:
        throw new com.jcraft.jsch.JSchException("There are not any available ciphers.");
    }

    private void Ws() {
        this.cb.DW();
        this.sh.j6((byte) 21);
        DW(this.cb);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L6;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_NEWKEYS sent");
        return;
    }

    private java.lang.String[] gn(java.lang.String r11) {
        if (r11 != null) goto L5;
    L32:
        return null;
    L5:
        if (r11.length() == 0) goto L32;
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L10;
        com.jcraft.jsch.JSch.v5().j6(1, "CheckCiphers: " + r11);
    L10:
        java.lang.String r1 = DW("cipher.c2s");
        java.lang.String r3 = DW("cipher.s2c");
        java.util.Vector r4 = new java.util.Vector();
        java.lang.String[] r12 = com.jcraft.jsch.Util.j6(r11, ",");
        int r5 = 0;
        int r6 = 0;
    L12:
        if (r6 >= r12.length) goto L14;
        java.lang.String r7 = r12[r6];
        if (r3.indexOf(r7) != (-1)) goto L29;
        if (r1.indexOf(r7) != (-1)) goto L29;
    L31:
        r6 = r6 + 1;
    L29:
        if (j6(DW(r7)) == true) goto L31;
        r4.addElement(r7);
        goto L31
    L14:
        if (r4.size() != 0) goto L16;
        return null;
    L16:
        java.lang.String[] r13 = new java.lang.String[r4.size()];
        java.lang.System.arraycopy(r4.toArray(), 0, r13, 0, r4.size());
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == true) goto L19;
    L22:
        return r13;
    L19:
        if (r5 >= r13.length) goto L22;
        com.jcraft.jsch.JSch.v5().j6(1, java.lang.String.valueOf(r13[r5]) + " is not available.");
        r5 = r5 + 1;
        goto L19
    }

    private int j6(java.lang.String r6, int r7) {
        com.jcraft.jsch.Session.GlobalRequestReply r0 = this.Eq;
        monitor-enter(r0);
        com.jcraft.jsch.Buffer r1 = new com.jcraft.jsch.Buffer(100);     // Catch: java.lang.Throwable -> L28
        com.jcraft.jsch.Packet r2 = new com.jcraft.jsch.Packet(r1);     // Catch: java.lang.Throwable -> L28
        java.lang.String r8 = com.jcraft.jsch.ChannelForwardedTCPIP.DW(r6);     // Catch: java.lang.Throwable -> L28
        this.Eq.j6(java.lang.Thread.currentThread());     // Catch: java.lang.Throwable -> L28
        this.Eq.j6(r7);     // Catch: java.lang.Throwable -> L28
        r2.DW();     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L28
        r1.j6((byte) 80);     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L28
        r1.Hw(com.jcraft.jsch.Util.FH("tcpip-forward"));     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L28
        r1.j6((byte) 1);     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L28
        r1.Hw(com.jcraft.jsch.Util.FH(r8));     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L28
        r1.FH(r7);     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L28
        DW(r2);     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L28
        int r9 = 0;
        int r3 = this.Eq.DW();     // Catch: java.lang.Throwable -> L28
    L10:
        if (r9 >= 10) goto L18;
        if (r3 != (-1)) goto L18;
        java.lang.Thread.sleep(1000);     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L28
    L16:
        r9 = r9 + 1;
        r3 = this.Eq.DW();     // Catch: java.lang.Throwable -> L28
    L18:
        this.Eq.j6(null);     // Catch: java.lang.Throwable -> L28
        if (r3 != 1) goto L24;
        int r10 = this.Eq.j6();     // Catch: java.lang.Throwable -> L28
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L28
        return r10;
    L24:
        throw new com.jcraft.jsch.JSchException("remote port forwarding failed for listen port " + r7);     // Catch: java.lang.Throwable -> L28
    L25:
        e = move-exception;
        this.Eq.j6(null);     // Catch: java.lang.Throwable -> L28
        throw new com.jcraft.jsch.JSchException(e.toString(), e);     // Catch: java.lang.Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    }

    private void j6(com.jcraft.jsch.Buffer r4, com.jcraft.jsch.Cipher r5, com.jcraft.jsch.MAC r6, int r7, int r8) {
        if (r5.DW() == false) goto L25;
        if (r7 == 262144) goto L8;
        if (r6 == null) goto L8;
    L9:
        int r9 = r8 - r4.FH;
    L11:
        if (r9 <= 0) goto L12;
        r4.we();
        byte[] r10 = r4.DW;
        if (r9 <= r10.length) goto L19;
        int r11 = r10.length;
    L20:
        this.yS.j6(r4.DW, 0, r11);
        if (r6 == null) goto L23;
        r6.update(r4.DW, 0, r11);
    L23:
        r9 = r9 - r11;
        goto L11
    L19:
        r11 = r9;
        goto L20
    L12:
        if (r6 == null) goto L15;
        r6.j6(r4.DW, 0);
    L15:
        throw new com.jcraft.jsch.JSchException("Packet corrupt");
    L8:
        r6 = null;
        goto L9
    L25:
        throw new com.jcraft.jsch.JSchException("Packet corrupt");
    }

    private void j6(com.jcraft.jsch.Buffer r1, com.jcraft.jsch.KeyExchange r2) {
        j6(r2);
        this.XG = false;
    }

    private void j6(com.jcraft.jsch.ChannelSession r4) {
        com.jcraft.jsch.ConfigRepository r0 = this.yO.j6();
        if (r0 != null) goto L5;
        return;
    L5:
        com.jcraft.jsch.ConfigRepository.Config r1 = r0.j6(this.OW);
        java.lang.String r2 = r1.getValue("ForwardAgent");
        if (r2 == null) goto L8;
        r4.j6(r2.equals("yes"));
    L8:
        java.lang.String r3 = r1.getValue("RequestTTY");
        if (r3 == null) goto L12;
        r4.DW(r3.equals("yes"));
        return;
    }

    private void j6(com.jcraft.jsch.ConfigRepository.Config r1, java.lang.String r2) {
        java.lang.String r3 = r1.getValue(r2);
        if (r3 == null) goto L6;
        j6(r2, r3);
        return;
    }

    private void j6(com.jcraft.jsch.KeyExchange r11) {
        byte[] r7 = r11.v5();
        byte[] r8 = r11.DW();
        com.jcraft.jsch.HASH r12 = r11.FH();
        if (this.gn != null) goto L5;
        this.gn = new byte[r8.length];
        java.lang.System.arraycopy(r8, 0, this.gn, 0, r8.length);
    L5:
        this.sh.we();
        this.sh.FH(r7);
        this.sh.DW(r8);
        this.sh.j6((byte) 65);
        this.sh.DW(this.gn);
        com.jcraft.jsch.Buffer r0 = this.sh;
        r12.update(r0.DW, 0, r0.FH);
        this.u7 = r12.FH();
        com.jcraft.jsch.Buffer r1 = this.sh;
        int r2 = r1.FH;
        int r3 = (r2 - this.gn.length) - 1;
        byte[] r4 = r1.DW;
        r4[r3] = (byte) (r4[r3] + 1);
        r12.update(r4, 0, r2);
        this.tp = r12.FH();
        com.jcraft.jsch.Buffer r5 = this.sh;
        byte[] r6 = r5.DW;
        r6[r3] = (byte) (r6[r3] + 1);
        r12.update(r6, 0, r5.FH);
        this.EQ = r12.FH();
        com.jcraft.jsch.Buffer r9 = this.sh;
        byte[] r10 = r9.DW;
        r10[r3] = (byte) (r10[r3] + 1);
        r12.update(r10, 0, r9.FH);
        this.we = r12.FH();
        com.jcraft.jsch.Buffer r13 = this.sh;
        byte[] r14 = r13.DW;
        r14[r3] = (byte) (r14[r3] + 1);
        r12.update(r14, 0, r13.FH);
        this.J0 = r12.FH();
        com.jcraft.jsch.Buffer r15 = this.sh;
        byte[] r16 = r15.DW;
        r16[r3] = (byte) (r16[r3] + 1);
        r12.update(r16, 0, r15.FH);
        this.J8 = r12.FH();
        this.aM = (com.jcraft.jsch.Cipher) java.lang.Class.forName(DW(this.XL[3])).newInstance();     // Catch: java.lang.Exception -> L17
    L8:
        if (this.aM.j6() <= this.we.length) goto L9;
        this.sh.we();     // Catch: java.lang.Exception -> L17
        this.sh.FH(r7);     // Catch: java.lang.Exception -> L17
        this.sh.DW(r8);     // Catch: java.lang.Exception -> L17
        this.sh.DW(this.we);     // Catch: java.lang.Exception -> L17
        r12.update(this.sh.DW, 0, this.sh.FH);     // Catch: java.lang.Exception -> L17
        byte[] r17 = r12.FH();     // Catch: java.lang.Exception -> L17
        byte[] r18 = new byte[this.we.length + r17.length];     // Catch: java.lang.Exception -> L17
        java.lang.System.arraycopy(this.we, 0, r18, 0, this.we.length);     // Catch: java.lang.Exception -> L17
        java.lang.System.arraycopy(r17, 0, r18, this.we.length, r17.length);     // Catch: java.lang.Exception -> L17
        this.we = r18;     // Catch: java.lang.Exception -> L17
        goto L8
    L9:
        this.aM.j6(1, this.we, this.tp);     // Catch: java.lang.Exception -> L17
        this.et = this.aM.FH();     // Catch: java.lang.Exception -> L17
        this.Mr = (com.jcraft.jsch.MAC) java.lang.Class.forName(DW(this.XL[5])).newInstance();     // Catch: java.lang.Exception -> L17
        this.J8 = j6(this.sh, r7, r8, this.J8, r12, this.Mr.j6());     // Catch: java.lang.Exception -> L17
        this.Mr.j6(this.J8);     // Catch: java.lang.Exception -> L17
        this.a8 = new byte[this.Mr.j6()];     // Catch: java.lang.Exception -> L17
        this.lg = new byte[this.Mr.j6()];     // Catch: java.lang.Exception -> L17
        this.j3 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(DW(this.XL[2])).newInstance();     // Catch: java.lang.Exception -> L17
    L11:
        if (this.j3.j6() <= this.EQ.length) goto L12;
        this.sh.we();     // Catch: java.lang.Exception -> L17
        this.sh.FH(r7);     // Catch: java.lang.Exception -> L17
        this.sh.DW(r8);     // Catch: java.lang.Exception -> L17
        this.sh.DW(this.EQ);     // Catch: java.lang.Exception -> L17
        r12.update(this.sh.DW, 0, this.sh.FH);     // Catch: java.lang.Exception -> L17
        byte[] r19 = r12.FH();     // Catch: java.lang.Exception -> L17
        byte[] r20 = new byte[this.EQ.length + r19.length];     // Catch: java.lang.Exception -> L17
        java.lang.System.arraycopy(this.EQ, 0, r20, 0, this.EQ.length);     // Catch: java.lang.Exception -> L17
        java.lang.System.arraycopy(r19, 0, r20, this.EQ.length, r19.length);     // Catch: java.lang.Exception -> L17
        this.EQ = r20;     // Catch: java.lang.Exception -> L17
        goto L11
    L12:
        this.j3.j6(0, this.EQ, this.u7);     // Catch: java.lang.Exception -> L17
        this.CU = this.j3.FH();     // Catch: java.lang.Exception -> L17
        this.U2 = (com.jcraft.jsch.MAC) java.lang.Class.forName(DW(this.XL[4])).newInstance();     // Catch: java.lang.Exception -> L17
        this.J0 = j6(this.sh, r7, r8, this.J0, r12, this.U2.j6());     // Catch: java.lang.Exception -> L17
        this.U2.j6(this.J0);     // Catch: java.lang.Exception -> L17
        tp(this.XL[6]);     // Catch: java.lang.Exception -> L17
        EQ(this.XL[7]);     // Catch: java.lang.Exception -> L17
        return;
    L17:
        e = move-exception;
        if ((e instanceof com.jcraft.jsch.JSchException) == false) goto L22;
        throw e;
    L22:
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    }

    private void j6(java.lang.String r11, int r12, com.jcraft.jsch.KeyExchange r13) {
        java.lang.String r0 = DW("StrictHostKeyChecking");
        java.lang.String r1 = this.vJ;
        if (r1 == null) goto L5;
        r11 = r1;
    L5:
        byte[] r2 = r13.Hw();
        java.lang.String r3 = r13.Zo();
        java.lang.String r14 = r13.j6();
        if (this.vJ == null) goto L8;
    L10:
        com.jcraft.jsch.HostKeyRepository r15 = FH();
        if (DW("HashKnownHosts").equals("yes") == true) goto L13;
    L15:
        this.hz = new com.jcraft.jsch.HostKey(r11, r2);
    L16:
        monitor-enter(r15);
        int r4 = r15.j6(r11, r2);     // Catch: java.lang.Throwable -> L119
        monitor-exit(r15);     // Catch: java.lang.Throwable -> L119
        int r6 = 0;
        if (r0.equals("ask") == false) goto L22;
    L23:
        if (r4 != 2) goto L53;
        monitor-enter(r15);
        java.lang.String r5 = r15.j6();     // Catch: java.lang.Throwable -> L50
        monitor-exit(r15);     // Catch: java.lang.Throwable -> L50
        if (r5 != null) goto L30;
        r5 = "known_hosts";
    L30:
        if (this.Sf == null) goto L35;
        java.lang.String r7 = "WARNING: REMOTE HOST IDENTIFICATION HAS CHANGED!\nIT IS POSSIBLE THAT SOMEONE IS DOING SOMETHING NASTY!\nSomeone could be eavesdropping on you right now (man-in-the-middle attack)!\nIt is also possible that the " + r3 + " host key has just been changed.\nThe fingerprint for the " + r3 + " key sent by the remote host is\n" + r14 + ".\nPlease contact your system administrator.\nAdd correct host key in " + r5 + " to get rid of this message.";
        if (r0.equals("ask") == false) goto L34;
        boolean r8 = this.Sf.Hw(java.lang.String.valueOf(r7) + "\nDo you want to delete the old key and insert the new key?");
    L36:
        if (r8 == false) goto L49;
        monitor-enter(r15);
    L45:
        th = move-exception;
        throw th;
    L39:
        if (r3.equals("DSA") == false) goto L41;
        java.lang.String r9 = "ssh-dss";
    L42:
        r15.j6(r11, r9, null);     // Catch: java.lang.Throwable -> L45
        monitor-exit(r15);     // Catch: java.lang.Throwable -> L45
        boolean r10 = true;
    L55:
        if (r0.equals("ask") == false) goto L57;
    L58:
        if (r4 == 0) goto L77;
        if (r10 == true) goto L77;
        if (r0.equals("yes") == true) goto L75;
        com.jcraft.jsch.UserInfo r16 = this.Sf;
        if (r16 != null) goto L65;
        if (r4 != 1) goto L73;
        throw new com.jcraft.jsch.JSchException("UnknownHostKey: " + this.lp + ". " + r3 + " key fingerprint is " + r14);
    L73:
        throw new com.jcraft.jsch.JSchException("HostKey has been changed: " + this.lp);
    L65:
        if (r16.Hw("The authenticity of host '" + this.lp + "' can't be established.\n" + r3 + " key fingerprint is " + r14 + ".\nAre you sure you want to continue connecting?") == false) goto L68;
        r10 = true;
        goto L77
    L68:
        throw new com.jcraft.jsch.JSchException("reject HostKey: " + this.lp);
    L75:
        throw new com.jcraft.jsch.JSchException("reject HostKey: " + this.lp);
    L77:
        if (r0.equals("no") == false) goto L80;
        if (1 != r4) goto L80;
        r10 = true;
    L80:
        if (r4 == 0) goto L82;
    L102:
        if (r4 == 0) goto L104;
    L106:
        if (r10 == true) goto L108;
    L110:
        if (r10 == false) goto L118;
        monitor-enter(r15);
        r15.j6(this.hz, this.Sf);     // Catch: java.lang.Throwable -> L115
        monitor-exit(r15);     // Catch: java.lang.Throwable -> L115
        return;
    L115:
        th = move-exception;
        throw th;
    L118:
        return;
    L108:
        if (com.jcraft.jsch.JSch.v5().isEnabled(2) == false) goto L110;
        com.jcraft.jsch.JSch.v5().j6(2, "Permanently added '" + this.lp + "' (" + r3 + ") to the list of known hosts.");
        goto L110
    L104:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L106;
        com.jcraft.jsch.JSch.v5().j6(1, "Host '" + this.lp + "' is known and mathces the " + r3 + " host key");
        goto L106
    L82:
        if (r3.equals("DSA") == false) goto L84;
        java.lang.String r17 = "ssh-dss";
    L85:
        com.jcraft.jsch.HostKey[] r18 = r15.j6(r11, r17);
        java.lang.String r19 = com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r2, 0, r2.length));
    L87:
        if (r6 >= r18.length) goto L102;
        if (r18[r4].FH().equals(r19) == false) goto L101;
        if (r18[r6].Hw().equals("@revoked") == false) goto L101;
        com.jcraft.jsch.UserInfo r110 = this.Sf;
        if (r110 == null) goto L97;
        r110.DW("The " + r3 + " host key for " + this.lp + " is marked as revoked.\nThis could mean that a stolen key is being used to impersonate this host.");
    L97:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L100;
        com.jcraft.jsch.JSch.v5().j6(1, "Host '" + this.lp + "' has provided revoked key.");
    L100:
        throw new com.jcraft.jsch.JSchException("revoked HostKey: " + this.lp);
    L101:
        r6 = r6 + 1;
        goto L87
    L84:
        r17 = "ssh-rsa";
        goto L85
    L57:
        if (r0.equals("yes") == false) goto L77;
    L41:
        r9 = "ssh-rsa";
        goto L42
    L49:
        throw new com.jcraft.jsch.JSchException("HostKey has been changed: " + r11);
    L34:
        this.Sf.DW(r7);
    L35:
        r8 = false;
    L50:
        th = move-exception;
        throw th;
    L53:
        r10 = false;
        goto L55
    L22:
        if (r0.equals("yes") == false) goto L53;
    L119:
        th = move-exception;
        throw th;
    L13:
        if ((r15 instanceof com.jcraft.jsch.KnownHosts) == false) goto L15;
        this.hz = ((com.jcraft.jsch.KnownHosts) r15).DW(r11, r2);
        goto L16
    L8:
        if (r12 == 22) goto L10;
        r11 = "[" + r11 + "]:" + r12;
        goto L10
    }

    static boolean j6(com.jcraft.jsch.Session r6, java.lang.String r7) {
        ((com.jcraft.jsch.KeyExchange) java.lang.Class.forName(r7).newInstance()).j6(r6, null, null, null, null);     // Catch: java.lang.Exception -> L5
        return true;
    L5:
        return false;
    }

    static boolean j6(java.lang.String r3) {
        com.jcraft.jsch.Cipher r4 = (com.jcraft.jsch.Cipher) java.lang.Class.forName(r3).newInstance();     // Catch: java.lang.Exception -> L6
        r4.j6(0, new byte[r4.j6()], new byte[r4.FH()]);     // Catch: java.lang.Exception -> L6
        return true;
    L6:
        return false;
    }

    private byte[] j6(com.jcraft.jsch.Buffer r6, byte[] r7, byte[] r8, byte[] r9, com.jcraft.jsch.HASH r10, int r11) {
        int r0 = r10.j6();
    L4:
        if (r9.length >= r11) goto L5;
        r6.we();
        r6.FH(r7);
        r6.DW(r8);
        r6.DW(r9);
        r10.update(r6.DW, 0, r6.FH);
        byte[] r1 = new byte[r9.length + r0];
        java.lang.System.arraycopy(r9, 0, r1, 0, r9.length);
        java.lang.System.arraycopy(r10.FH(), 0, r1, r9.length, r0);
        com.jcraft.jsch.Util.DW(r9);
        r9 = r1;
        goto L4
    L5:
        return r9;
    }

    private void tp(java.lang.String r3) {
        if (r3.equals("none") == false) goto L6;
        this.rN = null;
        return;
    L6:
        java.lang.String r0 = DW(r3);
        if (r0 != null) goto L9;
        return;
    L9:
        if (r3.equals("zlib") == false) goto L11;
    L29:
        this.rN = (com.jcraft.jsch.Compression) java.lang.Class.forName(r0).newInstance();     // Catch: java.lang.Exception -> L19 java.lang.NoClassDefFoundError -> L22
        int r4 = 6;
        r4 = java.lang.Integer.parseInt(DW("compression_level"));     // Catch: java.lang.Exception -> L26 java.lang.NoClassDefFoundError -> L22
    L17:
        this.rN.j6(1, r4);     // Catch: java.lang.Exception -> L19 java.lang.NoClassDefFoundError -> L22
    L33:
        return;
    L22:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L19:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L11:
        if (this.P8 == true) goto L13;
        return;
    L13:
        if (r3.equals("zlib@openssh.com") == true) goto L29;
    }

    private java.lang.String[] u7(java.lang.String r7) {
        if (r7 != null) goto L5;
    L27:
        return null;
    L5:
        if (r7.length() == 0) goto L27;
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L10;
        com.jcraft.jsch.JSch.v5().j6(1, "CheckKexes: " + r7);
    L10:
        java.util.Vector r1 = new java.util.Vector();
        java.lang.String[] r8 = com.jcraft.jsch.Util.j6(r7, ",");
        int r3 = 0;
        int r4 = 0;
    L12:
        if (r4 >= r8.length) goto L14;
        if (j6(this, DW(r8[r4])) == true) goto L26;
        r1.addElement(r8[r4]);
    L26:
        r4 = r4 + 1;
        goto L12
    L14:
        if (r1.size() != 0) goto L16;
        return null;
    L16:
        java.lang.String[] r9 = new java.lang.String[r1.size()];
        java.lang.System.arraycopy(r1.toArray(), 0, r9, 0, r1.size());
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == true) goto L19;
    L22:
        return r9;
    L19:
        if (r3 >= r9.length) goto L22;
        com.jcraft.jsch.JSch.v5().j6(1, java.lang.String.valueOf(r9[r3]) + " is not available.");
        r3 = r3 + 1;
        goto L19
    }

    private com.jcraft.jsch.Session.Forwarding we(java.lang.String r9) {
        java.lang.String[] r1 = r9.split(" ");
        if (r1.length <= 1) goto L19;
        java.util.Vector r2 = new java.util.Vector();
        int r10 = 0;
    L6:
        if (r10 >= r1.length) goto L7;
        if (r1[r10].length() == 0) goto L18;
        r2.addElement(r1[r10].trim());
    L18:
        r10 = r10 + 1;
        goto L6
    L7:
        java.lang.StringBuffer r6 = new java.lang.StringBuffer();
        int r11 = 0;
    L9:
        if (r11 >= r2.size()) goto L10;
        r6.append((java.lang.String) r2.elementAt(r11));
        r11 = r11 + 1;
        if (r11 >= r2.size()) goto L9;
        r6.append(":");
        goto L9
    L10:
        r9 = r6.toString();
    L19:
        com.jcraft.jsch.Session.Forwarding r3 = new com.jcraft.jsch.Session.Forwarding(this, null);
    L42:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException("parseForwarding: " + e.toString());
    L21:
        if (r9.lastIndexOf(":") == (-1)) goto L41;
        r3.Hw = java.lang.Integer.parseInt(r9.substring(r9.lastIndexOf(":") + 1));     // Catch: java.lang.NumberFormatException -> L42
        java.lang.String r4 = r9.substring(0, r9.lastIndexOf(":"));     // Catch: java.lang.NumberFormatException -> L42
        if (r4.lastIndexOf(":") == (-1)) goto L39;
        r3.FH = r4.substring(r4.lastIndexOf(":") + 1);     // Catch: java.lang.NumberFormatException -> L42
        java.lang.String r12 = r4.substring(0, r4.lastIndexOf(":"));     // Catch: java.lang.NumberFormatException -> L42
        if (r12.lastIndexOf(":") == (-1)) goto L36;
        r3.DW = java.lang.Integer.parseInt(r12.substring(r12.lastIndexOf(":") + 1));     // Catch: java.lang.NumberFormatException -> L42
        java.lang.String r13 = r12.substring(0, r12.lastIndexOf(":"));     // Catch: java.lang.NumberFormatException -> L42
        if (r13.length() != 0) goto L30;
    L31:
        r13 = "0.0.0.0";
    L33:
        if (r13.equals("localhost") == false) goto L35;
        r13 = "127.0.0.1";
    L35:
        r3.j6 = r13;     // Catch: java.lang.NumberFormatException -> L42
    L37:
        return r3;
    L30:
        if (r13.equals("*") == false) goto L33;
    L36:
        r3.DW = java.lang.Integer.parseInt(r12);     // Catch: java.lang.NumberFormatException -> L42
        r3.j6 = "127.0.0.1";     // Catch: java.lang.NumberFormatException -> L42
        goto L37
    L39:
        throw new com.jcraft.jsch.JSchException("parseForwarding: " + r9);     // Catch: java.lang.NumberFormatException -> L42
    L41:
        throw new com.jcraft.jsch.JSchException("parseForwarding: " + r9);     // Catch: java.lang.NumberFormatException -> L42
    }

    private void we() {
        com.jcraft.jsch.ConfigRepository r0 = this.yO.j6();
        if (r0 != null) goto L5;
        return;
    L5:
        com.jcraft.jsch.ConfigRepository.Config r1 = r0.j6(this.OW);
        java.lang.String r2 = r1.DW();
        if (r2 == null) goto L8;
        this.XX = r2;
    L8:
        java.lang.String r3 = r1.FH();
        if (r3 == null) goto L11;
        this.lp = r3;
    L11:
        int r4 = r1.j6();
        if (r4 == (-1)) goto L14;
        this.br = r4;
    L14:
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
        java.lang.String r5 = r1.getValue("HostKeyAlias");
        if (r5 == null) goto L17;
        Hw(r5);
    L17:
        java.lang.String r6 = r1.getValue("UserKnownHostsFile");
        if (r6 == null) goto L20;
        com.jcraft.jsch.KnownHosts r7 = new com.jcraft.jsch.KnownHosts(this.yO);
        r7.j6(r6);
        j6(r7);
    L20:
        java.lang.String[] r8 = r1.j6("IdentityFile");
        if (r8 == null) goto L48;
        java.lang.String[] r9 = r0.j6("").j6("IdentityFile");
        if (r9 == null) goto L29;
        int r10 = 0;
    L26:
        if (r10 >= r9.length) goto L31;
        this.yO.j6(r9[r10]);
        r10 = r10 + 1;
    L31:
        if ((r8.length - r9.length) <= 0) goto L48;
        com.jcraft.jsch.IdentityRepository.Wrapper r11 = new com.jcraft.jsch.IdentityRepository.Wrapper(this.yO.Hw(), true);
        int r12 = 0;
    L34:
        if (r12 >= r8.length) goto L35;
        java.lang.String r13 = r8[r12];
        int r14 = 0;
    L38:
        if (r14 >= r9.length) goto L44;
        if (r13.equals(r9[r14]) == true) goto L43;
        r14 = r14 + 1;
        goto L38
    L43:
        r13 = null;
    L44:
        if (r13 == null) goto L47;
        r11.j6(com.jcraft.jsch.IdentityFile.j6(r13, null, this.yO));
    L47:
        r12 = r12 + 1;
        goto L34
    L35:
        j6(r11);
        goto L48
    L29:
        r9 = new java.lang.String[0];
    L48:
        java.lang.String r15 = r1.getValue("ServerAliveInterval");
        if (r15 != null) goto L67;
    L53:
        java.lang.String r16 = r1.getValue("ConnectTimeout");
        if (r16 != null) goto L65;
    L58:
        java.lang.String r17 = r1.getValue("MaxAuthTries");
        if (r17 == null) goto L61;
        j6("MaxAuthTries", r17);
    L61:
        java.lang.String r18 = r1.getValue("ClearAllForwardings");
        if (r18 == null) goto L75;
        j6("ClearAllForwardings", r18);
        return;
    L75:
        return;
    L65:
        FH(java.lang.Integer.parseInt(r16));     // Catch: java.lang.NumberFormatException -> L57
        goto L58
    L67:
        DW(java.lang.Integer.parseInt(r15));     // Catch: java.lang.NumberFormatException -> L52
        goto L53
    }

    public java.lang.String DW() {
        return this.lp;
    }

    public java.lang.String DW(java.lang.String r3) {
        java.util.Hashtable r0 = this.sG;
        if (r0 == null) goto L8;
        java.lang.Object r1 = r0.get(r3);
        if ((r1 instanceof java.lang.String) == false) goto L8;
        return (java.lang.String) r1;
    L8:
        java.lang.String r4 = com.jcraft.jsch.JSch.DW(r3);
        if ((r4 instanceof java.lang.String) == false) goto L11;
        return r4;
    L11:
        return null;
    }

    public void DW(int r1) {
        FH(r1);
        this.g3 = r1;
    }

    public void DW(com.jcraft.jsch.Packet r7) {
        long r0 = VH();
    L4:
        if (this.XG == false) goto L35;
        if (r0 > 0) goto L9;
    L13:
        byte r2 = r7.DW.DW();
        if (r2 == 20) goto L35;
        if (r2 == 21) goto L35;
        if (r2 == 30) goto L35;
        if (r2 == 31) goto L35;
        if (r2 == 31) goto L35;
        if (r2 == 32) goto L35;
        if (r2 == 33) goto L35;
        if (r2 == 34) goto L35;
        if (r2 == 1) goto L35;
        java.lang.Thread.sleep(10);     // Catch: java.lang.InterruptedException -> L34
        goto L4
    L9:
        if ((java.lang.System.currentTimeMillis() - this.Qq) <= r0) goto L13;
        throw new com.jcraft.jsch.JSchException("timeout in wating for rekeying process.");
    L35:
        FH(r7);
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
        if (this.vy == false) goto L11;
        com.jcraft.jsch.Channel r3 = com.jcraft.jsch.Channel.j6(r2);     // Catch: java.lang.Exception -> L8
        j6(r3);     // Catch: java.lang.Exception -> L8
        r3.we();     // Catch: java.lang.Exception -> L8
        if ((r3 instanceof com.jcraft.jsch.ChannelSession) == false) goto L7;
        j6((com.jcraft.jsch.ChannelSession) r3);     // Catch: java.lang.Exception -> L8
    L7:
        return r3;
    L8:
        return null;
    L11:
        throw new com.jcraft.jsch.JSchException("session is down");
    }

    public com.jcraft.jsch.HostKeyRepository FH() {
        com.jcraft.jsch.HostKeyRepository r0 = this.ca;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return this.yO.DW();
    }

    public void FH(int r3) {
        java.net.Socket r0 = this.gW;
        if (r0 != null) goto L14;
        if (r3 < 0) goto L8;
        this.BT = r3;
        return;
    L8:
        throw new com.jcraft.jsch.JSchException("invalid timeout value");
    L14:
        r0.setSoTimeout(r3);     // Catch: java.lang.Exception -> L11
        this.BT = r3;     // Catch: java.lang.Exception -> L11
        return;
    L11:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    }

    com.jcraft.jsch.IdentityRepository Hw() {
        com.jcraft.jsch.IdentityRepository r0 = this.I;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return this.yO.Hw();
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
        com.jcraft.jsch.PortWatcher r7 = com.jcraft.jsch.PortWatcher.j6(this, r1, r2, r3, r4, r5);
        r7.j6(r6);
        java.lang.Thread r8 = new java.lang.Thread(r7);
        r8.setName("PortWatcher Thread for " + r3);
        boolean r9 = this.x9;
        if (r9 == false) goto L5;
        r8.setDaemon(r9);
    L5:
        r8.start();
        return r7.Hw;
    }

    public com.jcraft.jsch.Buffer j6(com.jcraft.jsch.Buffer r20) {
    L3:
        r20.we();
        this.yS.j6(r20.DW, r20.FH, this.et);
        int r0 = r20.FH;
        int r10 = this.et;
        r20.FH = r0 + r10;
        com.jcraft.jsch.Cipher r7 = this.aM;
        if (r7 == null) goto L6;
        byte[] r11 = r20.DW;
        r7.j6(r11, 0, r10, r11, 0);
    L6:
        byte[] r1 = r20.DW;
        int r8 = (r1[3] & 255) | ((((r1[0] << 24) & (-16777216)) | ((r1[1] << 16) & 16711680)) | ((r1[2] << 8) & 65280));
        if (r8 < 5) goto L64;
        if (r8 > 262144) goto L64;
        int r12 = (r8 + 4) - this.et;
        int r13 = r20.FH;
        if ((r13 + r12) <= r1.length) goto L14;
        byte[] r14 = new byte[r13 + r12];
        java.lang.System.arraycopy(r1, 0, r14, 0, r13);
        r20.DW = r14;
    L14:
        if ((r12 % this.et) != 0) goto L15;
        if (r12 <= 0) goto L24;
        this.yS.j6(r20.DW, r20.FH, r12);
        r20.FH += r12;
        com.jcraft.jsch.Cipher r15 = this.aM;
        if (r15 == null) goto L24;
        byte[] r2 = r20.DW;
        int r16 = this.et;
        r15.j6(r2, r16, r12, r2, r16);
    L24:
        com.jcraft.jsch.MAC r3 = this.Mr;
        if (r3 == null) goto L33;
        r3.update(this.Ws);
        this.Mr.update(r20.DW, 0, r20.FH);
        this.Mr.j6(this.a8, 0);
        com.jcraft.jsch.IO r4 = this.yS;
        byte[] r17 = this.lg;
        r4.j6(r17, 0, r17.length);
        if (java.util.Arrays.equals(this.a8, this.lg) == true) goto L33;
        if (r12 > 262144) goto L30;
        j6(r20, this.aM, this.Mr, r8, 262144 - r12);
        throw null;
    L30:
        throw new java.io.IOException("MAC Error");
    L33:
        this.Ws++;
        com.jcraft.jsch.Compression r5 = this.er;
        if (r5 == null) goto L39;
        byte[] r9 = r20.DW;
        byte r18 = r9[4];
        int[] r19 = this.jJ;
        r19[0] = (r20.FH - 5) - r18;
        byte[] r6 = r5.DW(r9, 5, r19);
        if (r6 == null) goto L38;
        r20.DW = r6;
        r20.FH = this.jJ[0] + 5;
        goto L39
    L38:
        java.lang.System.err.println("fail in inflater");
    L60:
        r20.J0();
        return r20;
    L39:
        int r21 = r20.DW() & 255;
        if (r21 == 1) goto L62;
        if (r21 == 2) goto L3;
        if (r21 == 3) goto L43;
        if (r21 == 4) goto L47;
        if (r21 != 93) goto L54;
        r20.J0();
        r20.FH();
        r20.u7();
        com.jcraft.jsch.Channel r22 = com.jcraft.jsch.Channel.j6(r20.FH(), this);
        if (r22 == null) goto L3;
        r22.j6(r20.EQ());
        goto L3
    L54:
        if (r21 != 52) goto L60;
        this.P8 = true;
        if (this.er != null) goto L60;
        if (this.rN != null) goto L60;
        tp(this.XL[6]);
        EQ(this.XL[7]);
        goto L60
    L47:
        r20.J0();
        r20.FH();
        r20.u7();
        goto L3
    L43:
        r20.J0();
        r20.FH();
        r20.u7();
        int r23 = r20.FH();
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L3;
        com.jcraft.jsch.JSch.v5().j6(1, "Received SSH_MSG_UNIMPLEMENTED for " + r23);
        goto L3
    L62:
        r20.J0();
        r20.FH();
        r20.u7();
        throw new com.jcraft.jsch.JSchException("SSH_MSG_DISCONNECT: " + r20.FH() + " " + com.jcraft.jsch.Util.j6(r20.tp()) + " " + com.jcraft.jsch.Util.j6(r20.tp()));
    L15:
        java.lang.String r24 = "Bad packet length " + r12;
        if (com.jcraft.jsch.JSch.v5().isEnabled(4) == false) goto L18;
        com.jcraft.jsch.JSch.v5().j6(4, r24);
    L18:
        j6(r20, this.aM, this.Mr, r8, 262144 - this.et);
        throw null;
    L64:
        j6(r20, this.aM, this.Mr, r8, 262144);
        throw null;
    }

    public void j6() {
        if (this.vy == true) goto L6;
        return;
    L6:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L8;
        com.jcraft.jsch.JSch.v5().j6(1, "Disconnecting from " + this.lp + " port " + this.br);
    L8:
        com.jcraft.jsch.Channel.j6(this);
        this.vy = false;
        com.jcraft.jsch.PortWatcher.j6(this);
        com.jcraft.jsch.ChannelForwardedTCPIP.FH(this);
        com.jcraft.jsch.ChannelX11.Hw(this);
        java.lang.Object r0 = this.nw;
        monitor-enter(r0);
    L42:
        th = move-exception;
        throw th;
    L11:
        if (this.ei == null) goto L13;
        java.lang.Thread.yield();     // Catch: java.lang.Throwable -> L42
        this.ei.interrupt();     // Catch: java.lang.Throwable -> L42
        this.ei = null;     // Catch: java.lang.Throwable -> L42
    L13:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L42
        this.Xa = null;
        if (this.yS == null) goto L27;
        if (this.yS.j6 == null) goto L21;
        this.yS.j6.close();     // Catch: java.lang.Exception -> L45
    L21:
        if (this.yS.DW == null) goto L24;
        this.yS.DW.close();     // Catch: java.lang.Exception -> L45
    L24:
        if (this.yS.FH == null) goto L27;
        this.yS.FH.close();     // Catch: java.lang.Exception -> L45
    L27:
        if (this.ef == null) goto L29;
        com.jcraft.jsch.Proxy r1 = this.ef;     // Catch: java.lang.Exception -> L45
        monitor-enter(r1);     // Catch: java.lang.Exception -> L45
        this.ef.close();     // Catch: java.lang.Throwable -> L37
        monitor-exit(r1);     // Catch: java.lang.Throwable -> L37
        this.ef = null;     // Catch: java.lang.Exception -> L45
        goto L40
    L37:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L45
    L29:
        if (this.gW == null) goto L40;
        this.gW.close();     // Catch: java.lang.Exception -> L45
    L40:
        this.yS = null;
        this.gW = null;
        this.yO.DW(this);
    }

    public void j6(int r17) {
        if (this.vy == true) goto L250;
        this.yS = new com.jcraft.jsch.IO();
        if (j6 == null) goto L272;
    L11:
        com.jcraft.jsch.Packet.j6(j6);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L265;
        com.jcraft.jsch.JSch.v5().j6(1, "Connecting to " + this.lp + " port " + this.br);
    L265:
    L229:
        e = move-exception;
        java.lang.Exception r2 = e;
        boolean r3 = false;
    L231:
        this.XG = r3;     // Catch: java.lang.Throwable -> L227
        if (this.vy == false) goto L261;
        java.lang.String r4 = r2.toString();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
        this.cb.DW();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
        this.sh.j6(((r4.length() + 13) + 2) + 84);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
        this.sh.j6((byte) 1);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
        this.sh.FH(3);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
        this.sh.Hw(com.jcraft.jsch.Util.FH(r4));     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
        this.sh.Hw(com.jcraft.jsch.Util.FH("en"));     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
        DW(this.cb);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L252
    L261:
        j6();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L253
    L237:
        this.vy = false;     // Catch: java.lang.Throwable -> L227
        if ((r2 instanceof java.lang.RuntimeException) == true) goto L246;
        if ((r2 instanceof com.jcraft.jsch.JSchException) == false) goto L244;
        throw ((com.jcraft.jsch.JSchException) r2);     // Catch: java.lang.Throwable -> L227
    L244:
        throw new com.jcraft.jsch.JSchException("Session.connect", r2);     // Catch: java.lang.Throwable -> L227
    L246:
        throw ((java.lang.RuntimeException) r2);     // Catch: java.lang.Throwable -> L227
    L16:
        if (this.ef == null) goto L18;
        com.jcraft.jsch.Proxy r9 = this.ef;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        monitor-enter(r9);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        this.ef.j6(this.dx, this.lp, this.br, r17);     // Catch: java.lang.Throwable -> L223
        this.yS.j6(this.ef.DW());     // Catch: java.lang.Throwable -> L223
        this.yS.DW(this.ef.j6());     // Catch: java.lang.Throwable -> L223
        this.gW = this.ef.getSocket();     // Catch: java.lang.Throwable -> L223
        monitor-exit(r9);     // Catch: java.lang.Throwable -> L223
    L26:
        if (r17 > 0) goto L28;
    L30:
        this.vy = true;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L33;
        com.jcraft.jsch.JSch.v5().j6(1, "Connection established");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L33:
        this.yO.j6(this);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        byte[] r10 = new byte[this.v5.length + 1];     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.System.arraycopy(this.v5, 0, r10, 0, this.v5.length);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        r10[r10.length - 1] = 10;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        this.yS.DW(r10, 0, r10.length);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L34:
        int r11 = 0;
        int r12 = 0;
    L36:
        if (r11 >= this.sh.DW.length) goto L43;
        r12 = this.yS.DW();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r12 < 0) goto L43;
        this.sh.DW[r11] = (byte) r12;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        r11 = r11 + 1;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r12 != 10) goto L36;
    L43:
        if (r12 < 0) goto L222;
        if (this.sh.DW[r11 - 1] != 10) goto L51;
        r11 = r11 - 1;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r11 <= 0) goto L51;
        if (this.sh.DW[r11 - 1] != 13) goto L51;
        r11 = r11 - 1;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L51:
        if (r11 <= 3) goto L34;
        if (r11 == this.sh.DW.length) goto L64;
        if (this.sh.DW[0] != 83) goto L34;
        if (this.sh.DW[1] != 83) goto L34;
        if (this.sh.DW[2] != 72) goto L34;
        if (this.sh.DW[3] != 45) goto L34;
    L64:
        if (r11 == this.sh.DW.length) goto L220;
        if (r11 < 7) goto L220;
        if (this.sh.DW[4] == 49) goto L70;
    L71:
        this.Hw = new byte[r11];     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.System.arraycopy(this.sh.DW, 0, this.Hw, 0, r11);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L74;
        com.jcraft.jsch.JSch.v5().j6(1, "Remote version string: " + com.jcraft.jsch.Util.j6(this.Hw));     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        com.jcraft.jsch.JSch.v5().j6(1, "Local version string: " + com.jcraft.jsch.Util.j6(this.v5));     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L74:
        J8();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        this.sh = j6(this.sh);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (this.sh.DW() == 20) goto L77;
        this.XG = false;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        throw new com.jcraft.jsch.JSchException("invalid protocol: " + this.sh.DW());     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L77:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L79;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_KEXINIT received");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L79:
        com.jcraft.jsch.KeyExchange r13 = DW(this.sh);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L80:
        this.sh = j6(this.sh);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r13.VH() != this.sh.DW()) goto L215;
        this.Qq = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        boolean r14 = r13.j6(this.sh);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r14 == false) goto L213;
        if (r13.VH() != 0) goto L80;
        j6(this.lp, this.br, r13);     // Catch: com.jcraft.jsch.JSchException -> L207 java.lang.Throwable -> L227 java.lang.Exception -> L229
        Ws();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        this.sh = j6(this.sh);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (this.sh.DW() == 21) goto L90;
        this.XG = false;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        throw new com.jcraft.jsch.JSchException("invalid protocol(newkyes): " + this.sh.DW());     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L90:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L92;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_NEWKEYS received");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L92:
        j6(this.sh, r13);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.String r15 = DW("MaxAuthTries");     // Catch: java.lang.NumberFormatException -> L202 java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r15 == null) goto L270;
        this.sy = java.lang.Integer.parseInt(r15);     // Catch: java.lang.NumberFormatException -> L202 java.lang.Throwable -> L227 java.lang.Exception -> L229
    L270:
        com.jcraft.jsch.UserAuth r16 = (com.jcraft.jsch.UserAuth) java.lang.Class.forName(DW("userauth.none")).newInstance();     // Catch: java.lang.Exception -> L199 java.lang.Throwable -> L227
        boolean r18 = r16.j6(this);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.String r19 = DW("PreferredAuthentications");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.String[] r110 = com.jcraft.jsch.Util.j6(r19, ",");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r18 == true) goto L103;
        java.lang.String r20 = ((com.jcraft.jsch.UserAuthNone) r16).j6();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r20 == null) goto L102;
        java.lang.String r21 = r20.toLowerCase();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L104:
        java.lang.String[] r111 = com.jcraft.jsch.Util.j6(r21, ",");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.String r112 = r21;
        int r22 = 0;
    L105:
        boolean r113 = false;
    L106:
        if (r18 == true) goto L167;
        if (r110 == null) goto L167;
        if (r22 >= r110.length) goto L167;
        r22 = r22 + 1;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.String r23 = r110[r22];     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        int r5 = 0;
    L113:
        if (r5 >= r111.length) goto L114;
        if (r111[r5].equals(r23) == true) goto L117;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        goto L113
    L117:
        boolean r6 = true;
    L118:
        if (r6 == false) goto L106;
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L266;
        java.lang.String r7 = "Authentications that can continue: ";
        int r8 = r22 - 1;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L124:
        if (r8 >= r110.length) goto L125;
        r7 = java.lang.String.valueOf(r7) + r110[r8];     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        r8 = r8 + 1;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r8 >= r110.length) goto L124;
        r7 = java.lang.String.valueOf(r7) + ",";     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        goto L124
    L125:
        com.jcraft.jsch.JSch.v5().j6(1, r7);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        com.jcraft.jsch.JSch.v5().j6(1, "Next authentication method: " + r23);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L266:
        if (DW("userauth." + r23) == null) goto L137;
        com.jcraft.jsch.UserAuth r24 = (com.jcraft.jsch.UserAuth) java.lang.Class.forName(DW("userauth." + r23)).newInstance();     // Catch: java.lang.Exception -> L134 java.lang.Throwable -> L227
    L138:
        if (r24 == null) goto L106;
        r18 = r24.j6(this);     // Catch: java.lang.Exception -> L146 com.jcraft.jsch.JSchException -> L152 java.lang.RuntimeException -> L155 com.jcraft.jsch.JSchPartialAuthException -> L158 com.jcraft.jsch.JSchAuthCancelException -> L164 java.lang.Throwable -> L227
        if (r18 == false) goto L144;
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L144;
        com.jcraft.jsch.JSch.v5().j6(1, "Authentication succeeded (" + r23 + ").");     // Catch: java.lang.Exception -> L146 com.jcraft.jsch.JSchException -> L152 java.lang.RuntimeException -> L155 com.jcraft.jsch.JSchPartialAuthException -> L158 com.jcraft.jsch.JSchAuthCancelException -> L164 java.lang.Throwable -> L227
    L144:
        r22 = r22;
    L164:
        r113 = true;
    L158:
        e = move-exception;
        java.lang.String r25 = e.j6();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        r111 = com.jcraft.jsch.Util.j6(r25, ",");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        if (r112.equals(r25) == true) goto L162;
        r22 = 0;
    L163:
        r112 = r25;
        goto L105
    L162:
        r22 = r22;
    L152:
        e = move-exception;
        throw e;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L155:
        e = move-exception;
        throw e;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L146:
        e = move-exception;
        if (com.jcraft.jsch.JSch.v5().isEnabled(2) == false) goto L151;
        com.jcraft.jsch.JSch.v5().j6(2, "an exception during authentication\n" + e.toString());     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L151:
        r113 = false;
    L137:
        r24 = null;
    L135:
        if (com.jcraft.jsch.JSch.v5().isEnabled(2) == false) goto L137;
        com.jcraft.jsch.JSch.v5().j6(2, "failed to load " + r23 + " method");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        goto L137
    L114:
        r6 = false;
    L167:
        if (r18 == true) goto L179;
        if (this.aj >= this.sy) goto L171;
    L173:
        if (r113 == false) goto L177;
        throw new com.jcraft.jsch.JSchException("Auth cancel");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L177:
        throw new com.jcraft.jsch.JSchException("Auth fail");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L171:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L173;
        com.jcraft.jsch.JSch.v5().j6(1, "Login trials exceeds " + this.sy);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        goto L173
    L179:
        if (this.gW == null) goto L184;
        if (r17 <= 0) goto L182;
    L183:
        this.gW.setSoTimeout(this.BT);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        goto L184
    L182:
        if (this.BT > 0) goto L183;
    L184:
        this.P8 = true;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.lang.Object r26 = this.nw;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        monitor-enter(r26);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L195:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L187:
        if (this.vy == false) goto L192;
        this.ei = new java.lang.Thread(this);     // Catch: java.lang.Throwable -> L195
        this.ei.setName("Connect thread " + this.lp + " session");     // Catch: java.lang.Throwable -> L195
        if (this.x9 == false) goto L191;
        this.ei.setDaemon(this.x9);     // Catch: java.lang.Throwable -> L195
    L191:
        this.ei.start();     // Catch: java.lang.Throwable -> L195
        J0();     // Catch: java.lang.Throwable -> L195
    L192:
        monitor-exit(r26);     // Catch: java.lang.Throwable -> L195
        com.jcraft.jsch.Util.DW(this.kQ);
        this.kQ = null;
        return;
    L102:
        r21 = r19;
        goto L104
    L103:
        r21 = null;
    L199:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L202:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException("MaxAuthTries: " + DW("MaxAuthTries"), e);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L207:
        e = move-exception;
        r3 = false;
        this.XG = false;     // Catch: java.lang.Exception -> L211 java.lang.Throwable -> L227
        throw e;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L211:
        e = move-exception;
        r2 = e;
        goto L231
    L213:
        this.XG = false;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        throw new com.jcraft.jsch.JSchException("verify: " + r14);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L215:
        this.XG = false;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        throw new com.jcraft.jsch.JSchException("invalid protocol(kex): " + this.sh.DW());     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L70:
        if (this.sh.DW[6] == 57) goto L71;
    L220:
        throw new com.jcraft.jsch.JSchException("invalid server's version string");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L222:
        throw new com.jcraft.jsch.JSchException("connection is closed by foreign host");     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L28:
        if (this.gW == null) goto L30;
        this.gW.setSoTimeout(r17);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L223:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L18:
        if (this.dx != null) goto L20;
        this.gW = com.jcraft.jsch.Util.j6(this.lp, this.br, r17);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.io.InputStream r27 = this.gW.getInputStream();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        java.io.OutputStream r114 = this.gW.getOutputStream();     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L21:
        this.gW.setTcpNoDelay(true);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        this.yS.j6(r27);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        this.yS.DW(r114);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        goto L26
    L20:
        this.gW = this.dx.j6(this.lp, this.br);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        r27 = this.dx.j6(this.gW);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
        r114 = this.dx.DW(this.gW);     // Catch: java.lang.Throwable -> L227 java.lang.Exception -> L229
    L227:
        th = move-exception;
        com.jcraft.jsch.Util.DW(this.kQ);
        this.kQ = null;
        throw th;
    L272:
        j6 = (com.jcraft.jsch.Random) java.lang.Class.forName(DW("random")).newInstance();     // Catch: java.lang.Exception -> L8
    L8:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L250:
        throw new com.jcraft.jsch.JSchException("session is already connected");
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
        com.jcraft.jsch.Compression r0 = this.rN;
        if (r0 == null) goto L6;
        int[] r2 = this.wc;
        com.jcraft.jsch.Buffer r3 = r10.DW;
        r2[0] = r3.FH;
        r3.DW = r0.j6(r3.DW, 5, r2);
        com.jcraft.jsch.Buffer r1 = r10.DW;
        r1.FH = this.wc[0];
    L6:
        if (this.j3 == null) goto L15;
        r10.j6(this.CU);
        byte r4 = r10.DW.DW[4];
        com.jcraft.jsch.Random r5 = j6;
        monitor-enter(r5);
        j6.j6(r10.DW.DW, r10.DW.FH - r4, r4);     // Catch: java.lang.Throwable -> L12
        monitor-exit(r5);     // Catch: java.lang.Throwable -> L12
    L16:
        com.jcraft.jsch.MAC r6 = this.U2;
        if (r6 == null) goto L19;
        r6.update(this.QX);
        com.jcraft.jsch.MAC r7 = this.U2;
        com.jcraft.jsch.Buffer r8 = r10.DW;
        r7.update(r8.DW, 0, r8.FH);
        com.jcraft.jsch.MAC r9 = this.U2;
        com.jcraft.jsch.Buffer r11 = r10.DW;
        r9.j6(r11.DW, r11.FH);
    L19:
        com.jcraft.jsch.Cipher r12 = this.j3;
        if (r12 == null) goto L22;
        com.jcraft.jsch.Buffer r13 = r10.DW;
        byte[] r14 = r13.DW;
        r12.j6(r14, 0, r13.FH, r14, 0);
    L22:
        com.jcraft.jsch.MAC r15 = this.U2;
        if (r15 == null) goto L28;
        r10.DW.v5(r15.j6());
        return;
    L28:
        return;
    L12:
        th = move-exception;
        throw th;
    L15:
        r10.j6(8);
        goto L16
    }

    void j6(com.jcraft.jsch.Packet r13, com.jcraft.jsch.Channel r14, int r15) {
        long r0 = VH();
    L4:
        if (this.XG == true) goto L6;
        monitor-enter(r14);
    L83:
        th = move-exception;
        throw th;
    L18:
        long r7 = r15;
        boolean r2 = true;
        if (r14.u7 >= r7) goto L28;
        r14.a8++;     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L26
        r14.wait(100);     // Catch: java.lang.Throwable -> L23 java.lang.InterruptedException -> L26
        int r5 = r14.a8;     // Catch: java.lang.Throwable -> L83
    L22:
        r14.a8 = r5 - 1;     // Catch: java.lang.Throwable -> L83
        goto L28
    L23:
        th = move-exception;
        r14.a8--;     // Catch: java.lang.Throwable -> L83
        throw th;     // Catch: java.lang.Throwable -> L83
    L26:
        r5 = r14.a8;     // Catch: java.lang.Throwable -> L83
    L28:
        if (r14.u7 >= r7) goto L29;
        monitor-exit(r14);     // Catch: java.lang.Throwable -> L83
        if (r14.Ws == true) goto L82;
        if (r14.J0() == false) goto L82;
        int r6 = -1;
        monitor-enter(r14);
        byte r8 = 0;
        int r9 = 0;
        int r10 = 0;
        if (r14.u7 <= 0) goto L55;
        long r3 = r14.u7;     // Catch: java.lang.Throwable -> L78
        if (r3 <= r7) goto L45;
        r3 = r7;
    L45:
        if (r3 == r7) goto L54;
        int r16 = (int) r3;     // Catch: java.lang.Throwable -> L78
        if (this.j3 == null) goto L49;
        int r11 = this.CU;     // Catch: java.lang.Throwable -> L78
    L51:
        if (this.U2 == null) goto L53;
        r9 = this.U2.j6();     // Catch: java.lang.Throwable -> L78
    L53:
        r10 = r13.j6(r16, r11, r9);     // Catch: java.lang.Throwable -> L78
        goto L54
    L49:
        r11 = 8;
    L54:
        byte r17 = r13.DW.DW();     // Catch: java.lang.Throwable -> L78
        r6 = r14.tp();     // Catch: java.lang.Throwable -> L78
        int r12 = (int) (r7 - r3);     // Catch: java.lang.Throwable -> L78
        r14.u7 -= r3;     // Catch: java.lang.Throwable -> L78
        int r4 = r10;
        r8 = r17;
        r15 = r12;
    L56:
        monitor-exit(r14);     // Catch: java.lang.Throwable -> L78
        if (r2 == false) goto L62;
        FH(r13);
        if (r15 == 0) goto L60;
        r13.j6(r8, r6, r4, r15);
        goto L62
    L60:
        return;
    L62:
        monitor-enter(r14);
    L75:
        th = move-exception;
        throw th;
    L64:
        if (this.XG == true) goto L65;
        long r18 = r15;
        if (r14.u7 >= r18) goto L69;
        monitor-exit(r14);     // Catch: java.lang.Throwable -> L75
        goto L4
    L69:
        r14.u7 -= r18;     // Catch: java.lang.Throwable -> L75
        monitor-exit(r14);     // Catch: java.lang.Throwable -> L75
    L71:
        FH(r13);
        return;
    L65:
        monitor-exit(r14);     // Catch: java.lang.Throwable -> L75
        goto L4
    L55:
        r2 = false;
        r4 = 0;
    L78:
        th = move-exception;
        throw th;
    L82:
        throw new java.io.IOException("channel is broken");
    L29:
        r14.u7 -= r7;     // Catch: java.lang.Throwable -> L83
        monitor-exit(r14);     // Catch: java.lang.Throwable -> L83
        goto L71
    L6:
        if (r0 <= 0) goto L95;
        if ((java.lang.System.currentTimeMillis() - this.Qq) <= r0) goto L95;
        throw new com.jcraft.jsch.JSchException("timeout in wating for rekeying process.");
    L95:
        java.lang.Thread.sleep(10);     // Catch: java.lang.InterruptedException -> L15
        goto L4
    }

    public void j6(com.jcraft.jsch.UserInfo r1) {
        this.Sf = r1;
    }

    public void j6(java.lang.String r3, java.lang.String r4) {
        java.lang.Object r0 = this.nw;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.sG != null) goto L7;
        this.sG = new java.util.Hashtable();     // Catch: java.lang.Throwable -> L10
    L7:
        this.sG.put(r3, r4);     // Catch: java.lang.Throwable -> L10
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L10
    }

    @Override
    public void run() {
        this.Xa = this;
        com.jcraft.jsch.Buffer r0 = new com.jcraft.jsch.Buffer();
        com.jcraft.jsch.Packet r1 = new com.jcraft.jsch.Packet(r0);
        int[] r3 = new int[1];
        int[] r4 = new int[1];
    L3:
        com.jcraft.jsch.KeyExchange r7 = null;
    L4:
        int r8 = 0;
    L166:
    L153:
        e = move-exception;
        this.XG = false;
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L164;
        com.jcraft.jsch.JSch.v5().j6(1, "Caught an exception, leaving main loop due to " + e.getMessage());
    L164:
        j6();     // Catch: java.lang.Throwable -> L161
    L158:
        this.vy = false;
        return;
    L6:
        if (this.vy == false) goto L164;
        if (this.Xa == null) goto L164;
        r0 = j6(r0);     // Catch: java.io.InterruptedIOException -> L140 java.lang.Exception -> L153
    L11:
        int r9 = r0.DW() & 255;     // Catch: java.lang.Exception -> L153
        if (r7 == null) goto L21;
        if (r7.VH() != r9) goto L21;
        this.Qq = java.lang.System.currentTimeMillis();     // Catch: java.lang.Exception -> L153
        boolean r10 = r7.j6(r0);     // Catch: java.lang.Exception -> L153
        if (r10 == true) goto L4;
        throw new com.jcraft.jsch.JSchException("verify: " + r10);     // Catch: java.lang.Exception -> L153
    L21:
        if (r9 != 20) goto L23;
        r7 = DW(r0);     // Catch: java.lang.Exception -> L153
        goto L4
    L23:
        if (r9 == 21) goto L138;
        switch(r9) {
            case 80: goto L132;
            case 81: goto L120;
            case 82: goto L120;
            default: goto L26;
        };     // Catch: java.lang.Exception -> L153
    L120:
        java.lang.Thread r11 = this.Eq.FH();     // Catch: java.lang.Exception -> L153
        if (r11 == null) goto L4;
        com.jcraft.jsch.Session.GlobalRequestReply r12 = this.Eq;     // Catch: java.lang.Exception -> L153
        if (r9 != 81) goto L125;
        int r13 = 1;
    L126:
        r12.DW(r13);     // Catch: java.lang.Exception -> L153
        if (r9 == 81) goto L129;
    L131:
        r11.interrupt();     // Catch: java.lang.Exception -> L153
        goto L4
    L129:
        if (this.Eq.j6() != 0) goto L131;
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        this.Eq.j6(r0.FH());     // Catch: java.lang.Exception -> L153
        goto L131
    L125:
        r13 = 0;
        goto L126
    L132:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        r0.tp();     // Catch: java.lang.Exception -> L153
        if (r0.j6() == 0) goto L135;
        boolean r14 = true;
    L136:
        if (r14 == false) goto L4;
        r1.DW();     // Catch: java.lang.Exception -> L153
        r0.j6((byte) 82);     // Catch: java.lang.Exception -> L153
        DW(r1);     // Catch: java.lang.Exception -> L153
        goto L4
    L135:
        r14 = false;
        goto L136
    L26:
        switch(r9) {
            case 90: goto L105;
            case 91: goto L102;
            case 92: goto L99;
            case 93: goto L95;
            case 94: goto L73;
            case 95: goto L54;
            case 96: goto L51;
            case 97: goto L48;
            case 98: goto L37;
            case 99: goto L33;
            case 100: goto L29;
            default: goto L28;
        };     // Catch: java.lang.Exception -> L153
    L28:
        throw new java.io.IOException("Unknown SSH message type " + r9);     // Catch: java.lang.Exception -> L153
    L33:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r15 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        if (r15 == null) goto L4;
        r15.j3 = 1;     // Catch: java.lang.Exception -> L153
        goto L4
    L37:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        int r16 = r0.FH();     // Catch: java.lang.Exception -> L153
        byte[] r17 = r0.tp();     // Catch: java.lang.Exception -> L153
        if (r0.j6() == 0) goto L40;
        boolean r18 = true;
    L41:
        com.jcraft.jsch.Channel r19 = com.jcraft.jsch.Channel.j6(r16, this);     // Catch: java.lang.Exception -> L153
        if (r19 == null) goto L4;
        byte r110 = 100;
        if (com.jcraft.jsch.Util.j6(r17).equals("exit-status") == false) goto L46;
        r19.FH(r0.FH());     // Catch: java.lang.Exception -> L153
        r110 = 99;
    L46:
        if (r18 == false) goto L4;
        r1.DW();     // Catch: java.lang.Exception -> L153
        r0.j6(r110);     // Catch: java.lang.Exception -> L153
        r0.FH(r19.tp());     // Catch: java.lang.Exception -> L153
        DW(r1);     // Catch: java.lang.Exception -> L153
        goto L4
    L40:
        r18 = false;
        goto L41
    L48:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r20 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        if (r20 == null) goto L4;
        r20.DW();     // Catch: java.lang.Exception -> L153
        goto L4
    L51:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r21 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        if (r21 == null) goto L4;
        r21.Hw();     // Catch: java.lang.Exception -> L153
        goto L4
    L54:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r22 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        r0.FH();     // Catch: java.lang.Exception -> L153
        byte[] r111 = r0.j6(r3, r4);     // Catch: java.lang.Exception -> L153
        if (r22 == null) goto L4;
        if (r4[0] == 0) goto L4;
        r22.DW(r111, r3[0], r4[0]);     // Catch: java.lang.Exception -> L153
        r22.v5(r22.VH - r4[0]);     // Catch: java.lang.Exception -> L153
        if (r22.VH >= (r22.Zo / 2)) goto L4;
        r1.DW();     // Catch: java.lang.Exception -> L153
        r0.j6((byte) 93);     // Catch: java.lang.Exception -> L153
        r0.FH(r22.tp());     // Catch: java.lang.Exception -> L153
        r0.FH(r22.Zo - r22.VH);     // Catch: java.lang.Exception -> L153
        monitor-enter(r22);     // Catch: java.lang.Exception -> L153
        if (r22.Ws == true) goto L67;
        DW(r1);     // Catch: java.lang.Throwable -> L70
    L67:
        monitor-exit(r22);     // Catch: java.lang.Throwable -> L70
        r22.v5(r22.Zo);     // Catch: java.lang.Exception -> L153
        goto L4
    L70:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L153
    L73:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.j6();     // Catch: java.lang.Exception -> L153
        r0.j6();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r23 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        byte[] r112 = r0.j6(r3, r4);     // Catch: java.lang.Exception -> L153
        if (r23 == null) goto L4;
        if (r4[0] == 0) goto L4;
        r23.j6(r112, r3[0], r4[0]);     // Catch: java.lang.Exception -> L93
        r23.v5(r23.VH - r4[0]);     // Catch: java.lang.Exception -> L153
        if (r23.VH >= (r23.Zo / 2)) goto L4;
        r1.DW();     // Catch: java.lang.Exception -> L153
        r0.j6((byte) 93);     // Catch: java.lang.Exception -> L153
        r0.FH(r23.tp());     // Catch: java.lang.Exception -> L153
        r0.FH(r23.Zo - r23.VH);     // Catch: java.lang.Exception -> L153
        monitor-enter(r23);     // Catch: java.lang.Exception -> L153
        if (r23.Ws == true) goto L87;
        DW(r1);     // Catch: java.lang.Throwable -> L90
    L87:
        monitor-exit(r23);     // Catch: java.lang.Throwable -> L90
        r23.v5(r23.Zo);     // Catch: java.lang.Exception -> L153
        goto L4
    L90:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L153
    L93:
        r23.DW();     // Catch: java.lang.Exception -> L160
        goto L4
    L95:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r24 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        if (r24 == null) goto L4;
        r24.j6(r0.EQ());     // Catch: java.lang.Exception -> L153
        goto L4
    L99:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r25 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        if (r25 == null) goto L4;
        r25.FH(r0.FH());     // Catch: java.lang.Exception -> L153
        r25.Ws = true;     // Catch: java.lang.Exception -> L153
        r25.J8 = true;     // Catch: java.lang.Exception -> L153
        r25.VH(0);     // Catch: java.lang.Exception -> L153
        goto L4
    L102:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r26 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        int r27 = r0.FH();     // Catch: java.lang.Exception -> L153
        long r113 = r0.EQ();     // Catch: java.lang.Exception -> L153
        int r114 = r0.FH();     // Catch: java.lang.Exception -> L153
        if (r26 == null) goto L4;
        r26.DW(r113);     // Catch: java.lang.Exception -> L153
        r26.gn(r114);     // Catch: java.lang.Exception -> L153
        r26.XL = true;     // Catch: java.lang.Exception -> L153
        r26.VH(r27);     // Catch: java.lang.Exception -> L153
        goto L4
    L105:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        java.lang.String r28 = com.jcraft.jsch.Util.j6(r0.tp());     // Catch: java.lang.Exception -> L153
        if ("forwarded-tcpip".equals(r28) == true) goto L116;
        if ("x11".equals(r28) == false) goto L112;
        if (this.SI == true) goto L116;
    L112:
        if ("auth-agent@openssh.com".equals(r28) == false) goto L115;
        if (this.KD == true) goto L116;
    L115:
        r1.DW();     // Catch: java.lang.Exception -> L153
        r0.j6((byte) 92);     // Catch: java.lang.Exception -> L153
        r0.FH(r0.FH());     // Catch: java.lang.Exception -> L153
        r0.FH(1);     // Catch: java.lang.Exception -> L153
        r0.Hw(com.jcraft.jsch.Util.FH);     // Catch: java.lang.Exception -> L153
        r0.Hw(com.jcraft.jsch.Util.FH);     // Catch: java.lang.Exception -> L153
        DW(r1);     // Catch: java.lang.Exception -> L153
    L116:
        com.jcraft.jsch.Channel r29 = com.jcraft.jsch.Channel.j6(r28);     // Catch: java.lang.Exception -> L153
        j6(r29);     // Catch: java.lang.Exception -> L153
        r29.j6(r0);     // Catch: java.lang.Exception -> L153
        r29.we();     // Catch: java.lang.Exception -> L153
        java.lang.Thread r115 = new java.lang.Thread(r29);     // Catch: java.lang.Exception -> L153
        r115.setName("Channel " + r28 + " " + this.lp);     // Catch: java.lang.Exception -> L153
        if (this.x9 == false) goto L119;
        r115.setDaemon(this.x9);     // Catch: java.lang.Exception -> L153
    L119:
        r115.start();     // Catch: java.lang.Exception -> L153
        goto L4
    L29:
        r0.FH();     // Catch: java.lang.Exception -> L153
        r0.u7();     // Catch: java.lang.Exception -> L153
        com.jcraft.jsch.Channel r30 = com.jcraft.jsch.Channel.j6(r0.FH(), this);     // Catch: java.lang.Exception -> L153
        if (r30 == null) goto L4;
        r30.j3 = 0;     // Catch: java.lang.Exception -> L153
        goto L4
    L138:
        Ws();     // Catch: java.lang.Exception -> L153
        j6(r0, r7);     // Catch: java.lang.Exception -> L153
    L140:
        e = move-exception;
        if (this.XG == true) goto L148;
        if (r8 >= this.Mz) goto L148;
        EQ();     // Catch: java.lang.Exception -> L153
    L146:
        r8 = r8 + 1;     // Catch: java.lang.Exception -> L153
    L148:
        if (this.XG == false) goto L152;
        if (r8 < this.Mz) goto L146;
    L152:
        throw e;     // Catch: java.lang.Exception -> L153
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
        if (r1 == null) goto L5;
        this.kQ = com.jcraft.jsch.Util.FH(r1);
        return;
    }
}
