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
        com.jcraft.jsch.Buffer r0 = null;
        byte[] r1 = null;
        int r4 = 0;
        byte[] r2 = null;
        int r10 = 0;
        com.jcraft.jsch.Session r11 = null;
        com.jcraft.jsch.IdentityRepository r12 = null;
        com.jcraft.jsch.UserInfo r13 = null;
        java.util.Vector r3 = null;
        int r14 = 0;
        int r15 = 0;
        byte[] r16 = null;
        byte[] r17 = null;
        byte[] r18 = null;
        byte[] r5 = null;
        java.util.Vector r6 = null;
        byte[] r19 = null;
        com.jcraft.jsch.Identity r20 = null;
        java.lang.String r21 = null;
        byte r22 = 0;
        byte[] r23 = null;
        boolean r24 = false;
        com.jcraft.jsch.Buffer r25 = null;
        com.jcraft.jsch.Buffer r26 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.vJ != null) { $pc0 = 5; continue $sw0; }
                    this.Sf = new com.jcraft.jsch.Buffer(this.tp);
                    this.vJ = new com.jcraft.jsch.Packet(this.Sf);
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.ef.J8();
                    r0 = this.ef;
                    r1 = r0.DW;
                    r4 = 0;
                    if (r1.length >= (r0.FH + r9)) { $pc0 = 8; continue $sw0; }
                    r2 = new byte[r0.Hw + r9];
                    java.lang.System.arraycopy(r1, 0, r2, 0, r1.length);
                    this.ef.DW = r2;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.ef.DW(r7, r8, r9);
                    if (this.ef.FH() <= this.ef.Hw()) { $pc0 = 12; continue $sw0; }
                    this.ef.Hw -= 4;
                    return;
                }
                case 12: {
                    r10 = this.ef.j6();
                    try {
                        r11 = EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof com.jcraft.jsch.JSchException) { $pc0 = 101; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r12 = r11.Hw();
                    r13 = r11.gn();
                    this.g3.we();
                    if (r10 != 11) { $pc0 = 39; continue $sw0; }
                    this.g3.j6((byte) 12);
                    r3 = r12.j6();
                    monitor-enter(r3);
                    r14 = 0;
                    r15 = 0;
                    $pc0 = 106; continue $sw0;
                }
                case 106: {
                    $pc0 = 35; continue $sw0;
                }
                case 35: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 20: {
                    if (r14 >= r3.size()) { $pc0 = 21; continue $sw0; }
                    if (((com.jcraft.jsch.Identity) r3.elementAt(r14)).FH() == null) { $pc0 = 34; continue $sw0; }
                    try {
                        r15 = r15 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    try {
                        r14 = r14 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    { $pc0 = 106; continue $sw0; }
                }
                case 21: {
                    try {
                        this.g3.FH(r15);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    if (r4 >= r3.size()) { $pc0 = 24; continue $sw0; }
                    try {
                        r16 = ((com.jcraft.jsch.Identity) r3.elementAt(r4)).FH();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    if (r16 == null) { $pc0 = 30; continue $sw0; }
                    try {
                        this.g3.Hw(r16);
                        this.g3.Hw(com.jcraft.jsch.Util.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    $pc0 = 30; continue $sw0;
                }
                case 30: {
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    { $pc0 = 23; continue $sw0; }
                }
                case 24: {
                    try {
                        monitor-exit(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 35; continue $sw0;
                    }
                    $pc0 = 99; continue $sw0;
                }
                case 99: {
                    r17 = new byte[this.g3.Hw()];
                    this.g3.j6(r17);
                    j6(r17);
                    return;
                }
                case 39: {
                    if (r10 != 1) { $pc0 = 42; continue $sw0; }
                    this.g3.j6((byte) 2);
                    this.g3.FH(0);
                    { $pc0 = 99; continue $sw0; }
                }
                case 42: {
                    if (r10 != 13) { $pc0 = 82; continue $sw0; }
                    r18 = this.ef.tp();
                    r5 = this.ef.tp();
                    this.ef.FH();
                    r6 = r12.j6();
                    monitor-enter(r6);
                    $pc0 = 110; continue $sw0;
                }
                case 110: {
                    r19 = null;
                    if (r4 >= r6.size()) { $pc0 = 47; continue $sw0; }
                    try {
                        r20 = (com.jcraft.jsch.Identity) r6.elementAt(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 79; continue $sw0;
                    }
                    if (r20.FH() != null) { $pc0 = 52; continue $sw0; }
                    $pc0 = 78; continue $sw0;
                }
                case 78: {
                    r4 = r4 + 1;
                    { $pc0 = 110; continue $sw0; }
                }
                case 52: {
                    if (com.jcraft.jsch.Util.j6(r18, r20.FH()) == false) { $pc0 = 78; continue $sw0; }
                    if (r20.DW() == false) { $pc0 = 71; continue $sw0; }
                    if (r13 == null) { $pc0 = 78; continue $sw0; }
                    $pc0 = 59; continue $sw0;
                }
                case 59: {
                    if (r20.DW() == false) { $pc0 = 71; continue $sw0; }
                    if (r13.FH("Passphrase for " + r20.getName()) == false) { $pc0 = 71; continue $sw0; }
                    try {
                        r21 = r13.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 79; continue $sw0;
                    }
                    if (r21 == null) { $pc0 = 71; continue $sw0; }
                    if (r20.j6(com.jcraft.jsch.Util.FH(r21)) == false) { $pc0 = 59; continue $sw0; }
                    $pc0 = 71; continue $sw0;
                }
                case 71: {
                    if (r20.DW() == true) { $pc0 = 78; continue $sw0; }
                    $pc0 = 72; continue $sw0;
                }
                case 72: {
                    try {
                        monitor-exit(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 79; continue $sw0;
                    }
                    if (r20 == null) { $pc0 = 75; continue $sw0; }
                    r19 = r20.DW(r5);
                    $pc0 = 75; continue $sw0;
                }
                case 75: {
                    if (r19 != null) { $pc0 = 77; continue $sw0; }
                    this.g3.j6((byte) 30);
                    { $pc0 = 99; continue $sw0; }
                }
                case 77: {
                    this.g3.j6((byte) 14);
                    this.g3.Hw(r19);
                    { $pc0 = 99; continue $sw0; }
                }
                case 47: {
                    r20 = null;
                    $pc0 = 79; continue $sw0;
                }
                case 79: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 82: {
                    r22 = 6;
                    if (r10 != 18) { $pc0 = 86; continue $sw0; }
                    r12.DW(this.ef.tp());
                    this.g3.j6((byte) 6);
                    { $pc0 = 99; continue $sw0; }
                }
                case 86: {
                    if (r10 != 9) { $pc0 = 89; continue $sw0; }
                    this.g3.j6((byte) 6);
                    { $pc0 = 99; continue $sw0; }
                }
                case 89: {
                    if (r10 != 19) { $pc0 = 92; continue $sw0; }
                    r12.removeAll();
                    this.g3.j6((byte) 6);
                    { $pc0 = 99; continue $sw0; }
                }
                case 92: {
                    if (r10 != 17) { $pc0 = 98; continue $sw0; }
                    r23 = new byte[this.ef.Hw()];
                    this.ef.j6(r23);
                    r24 = r12.j6(r23);
                    r25 = this.g3;
                    if (r24 == true) { $pc0 = 97; continue $sw0; }
                    r22 = 5;
                    $pc0 = 97; continue $sw0;
                }
                case 97: {
                    r25.j6(r22);
                    { $pc0 = 99; continue $sw0; }
                }
                case 98: {
                    r26 = this.ef;
                    r26.v5(r26.Hw() - 1);
                    this.g3.j6((byte) 5);
                    $pc0 = 101; continue $sw0;
                }
                case 101: {
                    e = $ex0;
                    throw new java.io.IOException(e.toString());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void run() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 4; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    this.Ws = true;
                    DW();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
