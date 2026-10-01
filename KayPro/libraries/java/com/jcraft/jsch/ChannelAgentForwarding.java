package com.jcraft.jsch;

class ChannelAgentForwarding extends com.jcraft.jsch.Channel {
    private final byte BT;
    private final byte KD;
    private final byte P8;
    private final byte SI;
    private com.jcraft.jsch.Buffer Sf;
    private final byte cb;
    private final byte cn;
    private final byte dx;
    private com.jcraft.jsch.Buffer ef;
    private final byte ei;
    private final byte er;
    private com.jcraft.jsch.Buffer g3;
    private final byte gW;
    private final byte lg;
    private final byte nw;
    private final byte rN;
    private final byte ro;
    boolean sG;
    private final byte sh;
    private com.jcraft.jsch.Packet vJ;
    private final byte vy;
    private final byte yS;

    ChannelAgentForwarding() {
        this.lg = 1;
        this.rN = 2;
        this.er = 3;
        this.yS = 4;
        this.gW = 5;
        this.BT = 6;
        this.vy = 7;
        this.P8 = 8;
        this.ei = 9;
        this.nw = 11;
        this.SI = 12;
        this.KD = 13;
        this.ro = 14;
        this.cn = 17;
        this.sh = 18;
        this.cb = 19;
        this.dx = 30;
        this.sG = true;
        this.ef = null;
        this.Sf = null;
        this.vJ = null;
        this.g3 = null;
        Zo(131072);
        v5(131072);
        Hw(16384);
        this.v5 = com.jcraft.jsch.Util.FH("auth-agent@openssh.com");
        this.ef = new com.jcraft.jsch.Buffer();
        this.ef.we();
        this.g3 = new com.jcraft.jsch.Buffer();
        this.QX = true;
    }

    private void j6(byte[] r3) {
        this.vJ.DW();
        this.Sf.j6((byte) 94);
        this.Sf.FH(this.Hw);
        this.Sf.FH(r3.length + 4);
        this.Sf.Hw(r3);
        EQ().j6(this.vJ, this, r3.length + 4);     // Catch: java.lang.Exception -> L5
        return;
    }

    @Override
    void Hw() {
        super.Hw();
        FH();
    }

    @Override
    void j6(byte[] r7, int r8, int r9) {
        if (this.vJ != null) goto L5;
        this.Sf = new com.jcraft.jsch.Buffer(this.tp);
        this.vJ = new com.jcraft.jsch.Packet(this.Sf);
    L5:
        this.ef.J8();
        com.jcraft.jsch.Buffer r0 = this.ef;
        byte[] r1 = r0.DW;
        int r4 = 0;
        if (r1.length >= (r0.FH + r9)) goto L8;
        byte[] r2 = new byte[r0.Hw + r9];
        java.lang.System.arraycopy(r1, 0, r2, 0, r1.length);
        this.ef.DW = r2;
    L8:
        this.ef.DW(r7, r8, r9);
        if (this.ef.FH() <= this.ef.Hw()) goto L12;
        this.ef.Hw -= 4;
        return;
    L12:
        int r10 = this.ef.j6();
        com.jcraft.jsch.Session r11 = EQ();     // Catch: com.jcraft.jsch.JSchException -> L101
        com.jcraft.jsch.IdentityRepository r12 = r11.Hw();
        com.jcraft.jsch.UserInfo r13 = r11.gn();
        this.g3.we();
        if (r10 != 11) goto L39;
        this.g3.j6((byte) 12);
        java.util.Vector r3 = r12.j6();
        monitor-enter(r3);
        int r14 = 0;
        int r15 = 0;
    L106:
    L35:
        th = move-exception;
        throw th;
    L20:
        if (r14 >= r3.size()) goto L21;
        if (((com.jcraft.jsch.Identity) r3.elementAt(r14)).FH() == null) goto L34;
        r15 = r15 + 1;     // Catch: java.lang.Throwable -> L35
    L34:
        r14 = r14 + 1;     // Catch: java.lang.Throwable -> L35
        goto L106
    L21:
        this.g3.FH(r15);     // Catch: java.lang.Throwable -> L35
    L23:
        if (r4 >= r3.size()) goto L24;
        byte[] r16 = ((com.jcraft.jsch.Identity) r3.elementAt(r4)).FH();     // Catch: java.lang.Throwable -> L35
        if (r16 == null) goto L30;
        this.g3.Hw(r16);     // Catch: java.lang.Throwable -> L35
        this.g3.Hw(com.jcraft.jsch.Util.FH);     // Catch: java.lang.Throwable -> L35
    L30:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L35
        goto L23
    L24:
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L35
    L99:
        byte[] r17 = new byte[this.g3.Hw()];
        this.g3.j6(r17);
        j6(r17);
        return;
    L39:
        if (r10 != 1) goto L42;
        this.g3.j6((byte) 2);
        this.g3.FH(0);
        goto L99
    L42:
        if (r10 != 13) goto L82;
        byte[] r18 = this.ef.tp();
        byte[] r5 = this.ef.tp();
        this.ef.FH();
        java.util.Vector r6 = r12.j6();
        monitor-enter(r6);
    L110:
        byte[] r19 = null;
        if (r4 >= r6.size()) goto L47;
        com.jcraft.jsch.Identity r20 = (com.jcraft.jsch.Identity) r6.elementAt(r4);     // Catch: java.lang.Throwable -> L79
        if (r20.FH() != null) goto L52;
    L78:
        r4 = r4 + 1;
        goto L110
    L52:
        if (com.jcraft.jsch.Util.j6(r18, r20.FH()) == false) goto L78;
        if (r20.DW() == false) goto L71;
        if (r13 == null) goto L78;
    L59:
        if (r20.DW() == false) goto L71;
        if (r13.FH("Passphrase for " + r20.getName()) == false) goto L71;
        java.lang.String r21 = r13.j6();     // Catch: java.lang.Throwable -> L79
        if (r21 == null) goto L71;
        if (r20.j6(com.jcraft.jsch.Util.FH(r21)) == false) goto L59;
    L71:
        if (r20.DW() == true) goto L78;
    L72:
        monitor-exit(r6);     // Catch: java.lang.Throwable -> L79
        if (r20 == null) goto L75;
        r19 = r20.DW(r5);
    L75:
        if (r19 != null) goto L77;
        this.g3.j6((byte) 30);
        goto L99
    L77:
        this.g3.j6((byte) 14);
        this.g3.Hw(r19);
        goto L99
    L47:
        r20 = null;
    L79:
        th = move-exception;
        throw th;
    L82:
        byte r22 = 6;
        if (r10 != 18) goto L86;
        r12.DW(this.ef.tp());
        this.g3.j6((byte) 6);
        goto L99
    L86:
        if (r10 != 9) goto L89;
        this.g3.j6((byte) 6);
        goto L99
    L89:
        if (r10 != 19) goto L92;
        r12.removeAll();
        this.g3.j6((byte) 6);
        goto L99
    L92:
        if (r10 != 17) goto L98;
        byte[] r23 = new byte[this.ef.Hw()];
        this.ef.j6(r23);
        boolean r24 = r12.j6(r23);
        com.jcraft.jsch.Buffer r25 = this.g3;
        if (r24 == true) goto L97;
        r22 = 5;
    L97:
        r25.j6(r22);
        goto L99
    L98:
        com.jcraft.jsch.Buffer r26 = this.ef;
        r26.v5(r26.Hw() - 1);
        this.g3.j6((byte) 5);
    L101:
        e = move-exception;
        throw new java.io.IOException(e.toString());
    }

    @Override
    public void run() {
        Ws();     // Catch: java.lang.Exception -> L4
        return;
    L4:
        this.Ws = true;
        DW();
    }
}
