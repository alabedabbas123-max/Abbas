package com.jcraft.jsch;

public class KnownHosts implements com.jcraft.jsch.HostKeyRepository {
    private static final byte[] DW = null;
    private static final byte[] j6 = null;
    private com.jcraft.jsch.JSch FH;
    private java.lang.String Hw;
    private com.jcraft.jsch.MAC Zo;
    private java.util.Vector v5;

    class HashedHostKey extends com.jcraft.jsch.HostKey {
        final com.jcraft.jsch.KnownHosts EQ;
        private boolean gn;
        byte[] tp;
        byte[] u7;

        HashedHostKey(com.jcraft.jsch.KnownHosts r8, java.lang.String r9, int r10, byte[] r11) {
            this(r8, "", r9, r10, r11, null);
        }

        HashedHostKey(com.jcraft.jsch.KnownHosts r7, java.lang.String r8, java.lang.String r9, int r10, byte[] r11, java.lang.String r12) {
            this.EQ = r7;
            super(r8, r9, r10, r11, r12);
            this.gn = false;
            this.u7 = null;
            this.tp = null;
            if (this.Hw.startsWith("|1|") == true) goto L5;
            return;
        L5:
            if (this.Hw.substring(3).indexOf("|") <= 0) goto L15;
            java.lang.String r13 = this.Hw.substring(3);
            java.lang.String r14 = r13.substring(0, r13.indexOf("|"));
            java.lang.String r15 = r13.substring(r13.indexOf("|") + 1);
            this.u7 = com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r14), 0, r14.length());
            this.tp = com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r15), 0, r15.length());
            if (this.u7.length == 20) goto L9;
        L12:
            this.u7 = null;
            this.tp = null;
            return;
        L9:
            if (this.tp.length != 20) goto L12;
            this.gn = true;
            return;
        }

        HashedHostKey(com.jcraft.jsch.KnownHosts r2, java.lang.String r3, byte[] r4) {
            this(r2, r3, 0, r4);
        }

        boolean VH() {
            return this.gn;
        }

        void Zo() {
            if (this.gn == false) goto L5;
            return;
        L5:
            com.jcraft.jsch.MAC r0 = com.jcraft.jsch.KnownHosts.j6(this.EQ);
            if (this.u7 != null) goto L27;
            com.jcraft.jsch.Random r1 = com.jcraft.jsch.Session.j6;
            monitor-enter(r1);
            this.u7 = new byte[r0.j6()];     // Catch: java.lang.Throwable -> L12
            r1.j6(this.u7, 0, this.u7.length);     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1);     // Catch: java.lang.Throwable -> L12
        L12:
            th = move-exception;
            throw th;
        L27:
            monitor-enter(r0);     // Catch: java.lang.Exception -> L24
            r0.j6(this.u7);     // Catch: java.lang.Throwable -> L19
            byte[] r2 = com.jcraft.jsch.Util.FH(this.Hw);     // Catch: java.lang.Throwable -> L19
            r0.update(r2, 0, r2.length);     // Catch: java.lang.Throwable -> L19
            this.tp = new byte[r0.j6()];     // Catch: java.lang.Throwable -> L19
            r0.j6(this.tp, 0);     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L19
        L19:
            th = move-exception;
            throw th;     // Catch: java.lang.Exception -> L24
        L22:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder("|1|");
            byte[] r4 = this.u7;
            r3.append(com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r4, 0, r4.length)));
            r3.append("|");
            byte[] r5 = this.tp;
            r3.append(com.jcraft.jsch.Util.j6(com.jcraft.jsch.Util.FH(r5, 0, r5.length)));
            this.Hw = r3.toString();
            this.gn = true;
        }

        @Override
        boolean j6(java.lang.String r4) {
            if (this.gn == false) goto L5;
            com.jcraft.jsch.MAC r0 = com.jcraft.jsch.KnownHosts.j6(this.EQ);
            monitor-enter(r0);     // Catch: java.lang.Exception -> L14
            r0.j6(this.u7);     // Catch: java.lang.Throwable -> L11
            byte[] r5 = com.jcraft.jsch.Util.FH(r4);     // Catch: java.lang.Throwable -> L11
            r0.update(r5, 0, r5.length);     // Catch: java.lang.Throwable -> L11
            byte[] r6 = new byte[r0.j6()];     // Catch: java.lang.Throwable -> L11
            r0.j6(r6, 0);     // Catch: java.lang.Throwable -> L11
            boolean r7 = com.jcraft.jsch.Util.j6(this.tp, r6);     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
            return r7;
        L11:
            th = move-exception;
            throw th;     // Catch: java.lang.Exception -> L14
        L14:
            e = move-exception;
            java.lang.System.out.println(e);
            return false;
        L5:
            return super.j6(r4);
        }
    }

    static {
        j6 = new byte[]{32};
        DW = com.jcraft.jsch.Util.FH("\n");
    }

    KnownHosts(com.jcraft.jsch.JSch r2) {
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
        this.Zo = null;
        this.FH = r2;
        this.v5 = new java.util.Vector();
    }

    private java.lang.String DW(java.lang.String r7, java.lang.String r8) {
        int r0 = r8.length();
        int r1 = r7.length();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        int r4 = r7.indexOf(44, r3);
        if (r4 == (-1)) goto L8;
        if (r8.equals(r7.substring(r3, r4)) == true) goto L20;
        r3 = r4 + 1;
        goto L3
    L20:
        return java.lang.String.valueOf(r7.substring(0, r3)) + r7.substring(r4 + 1);
    L8:
        if (r7.endsWith(r8) == true) goto L10;
        return r7;
    L10:
        if ((r1 - r3) != r0) goto L25;
        if (r0 != r1) goto L13;
        int r9 = 0;
    L15:
        return r7.substring(0, r9);
    L13:
        r9 = (r1 - r0) - 1;
        goto L15
    L25:
        return r7;
    }

    private synchronized com.jcraft.jsch.MAC FH() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.Zo == null) goto L17;
    L9:
        com.jcraft.jsch.MAC r0 = this.Zo;     // Catch: java.lang.Throwable -> L12
        monitor-exit(this);
        return r0;
    L17:
        this.Zo = (com.jcraft.jsch.MAC) java.lang.Class.forName(com.jcraft.jsch.JSch.DW("hmac-sha1")).newInstance();     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L12
    L7:
        e = move-exception;
        java.lang.System.err.println("hmacsha1: " + e);     // Catch: java.lang.Throwable -> L12
        goto L9
    }

    private void FH(java.lang.String r4) {
        com.jcraft.jsch.HostKey r0 = new com.jcraft.jsch.HostKey(r4, 3, null);
        this.v5.addElement(r0);
    }

    private int j6(byte[] r4) {
        if (r4[8] != 100) goto L7;
        return 1;
    L7:
        if (r4[8] != 114) goto L10;
        return 2;
    L10:
        return 3;
    }

    static com.jcraft.jsch.MAC j6(com.jcraft.jsch.KnownHosts r0) {
        return r0.FH();
    }

    com.jcraft.jsch.HostKey DW(java.lang.String r2, byte[] r3) {
        com.jcraft.jsch.KnownHosts.HashedHostKey r0 = new com.jcraft.jsch.KnownHosts.HashedHostKey(this, r2, r3);
        r0.Zo();
        return r0;
    }

    protected void DW() {
        java.lang.String r0 = this.Hw;
        if (r0 == null) goto L6;
        DW(r0);
        return;
    }

    protected synchronized void DW(java.lang.String r2) {
        monitor-enter(this);
        if (r2 != null) goto L12;
        monitor-exit(this);
        return;
    L12:
        java.io.FileOutputStream r0 = new java.io.FileOutputStream(com.jcraft.jsch.Util.j6(r2));     // Catch: java.lang.Throwable -> L9
        j6(r0);     // Catch: java.lang.Throwable -> L9
        r0.close();     // Catch: java.lang.Throwable -> L9
        monitor-exit(this);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    @Override
    public int j6(java.lang.String r9, byte[] r10) {
        if (r9 != null) goto L5;
        return 1;
    L5:
        int r1 = j6(r10);
        java.util.Vector r2 = this.v5;
        monitor-enter(r2);
        int r4 = 0;
        int r5 = 1;
    L34:
    L29:
        th = move-exception;
        throw th;
    L9:
        if (r4 >= this.v5.size()) goto L10;
        com.jcraft.jsch.HostKey r6 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r4);     // Catch: java.lang.Throwable -> L29
        if (r6.j6(r9) == false) goto L28;
        if (r6.v5 != r1) goto L28;
        if (com.jcraft.jsch.Util.j6(r6.Zo, r10) == true) goto L25;
        r5 = 2;
        goto L28
    L25:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L29
        return 0;
    L28:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L29
        goto L34
    L10:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L29
        if (r5 == 1) goto L13;
    L18:
        return r5;
    L13:
        if (r9.startsWith("[") == false) goto L18;
        if (r9.indexOf("]:") <= 1) goto L18;
        return j6(r9.substring(1, r9.indexOf("]:")), r10);
    }

    @Override
    public java.lang.String j6() {
        return this.Hw;
    }

    @Override
    public void j6(com.jcraft.jsch.HostKey r7, com.jcraft.jsch.UserInfo r8) {
        int r0 = r7.v5;
        java.lang.String r1 = r7.DW();
        byte[] r2 = r7.Zo;
        java.util.Vector r3 = this.v5;
        monitor-enter(r3);
        boolean r4 = false;
        int r5 = 0;
    L45:
    L38:
        th = move-exception;
        throw th;
    L6:
        if (r5 >= this.v5.size()) goto L7;
        com.jcraft.jsch.HostKey r6 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r5);     // Catch: java.lang.Throwable -> L38
        if (r6.j6(r1) == false) goto L37;
        int r9 = r6.v5;     // Catch: java.lang.Throwable -> L38
    L37:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L38
        goto L45
    L7:
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L38
        this.v5.addElement(r7);
        java.lang.String r10 = j6();
        if (r10 == null) goto L50;
        java.io.File r11 = new java.io.File(com.jcraft.jsch.Util.j6(r10));
        if (r11.exists() == true) goto L27;
        if (r8 == null) goto L28;
        boolean r12 = r8.Hw(java.lang.String.valueOf(r10) + " does not exist.\nAre you sure you want to create it?");
        java.io.File r13 = r11.getParentFile();
        if (r12 == false) goto L24;
        if (r13 == null) goto L24;
        if (r13.exists() == true) goto L24;
        r12 = r8.Hw("The parent directory " + r13 + " does not exist.\nAre you sure you want to create it?");
        if (r12 == false) goto L24;
        if (r13.mkdirs() == true) goto L23;
        r8.DW(r13 + " has not been created.");
        r12 = false;
        goto L24
    L23:
        r8.DW(r13 + " has been succesfully created.\nPlease check its access permission.");
    L24:
        if (r13 == null) goto L28;
        r4 = r12;
    L28:
        if (r4 == false) goto L51;
        DW(r10);     // Catch: java.lang.Exception -> L31
        return;
    L31:
        e = move-exception;
        java.lang.System.err.println("sync known_hosts: " + e);
        return;
    L51:
        return;
    L27:
        r4 = true;
        goto L28
    }

    void j6(java.io.InputStream r18) {
        this.v5.removeAllElements();
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        byte[] r1 = new byte[1024];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L4:
        byte[] r9 = r1;
        int r2 = 0;
    L5:
        int r3 = r18.read();     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        int r5 = -1;
        if (r3 == (-1)) goto L8;
        if (r3 == 13) goto L5;
        if (r3 == 10) goto L22;
        if (r9.length <= r2) goto L21;
    L147:
        int r4 = r2 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        r9[r2] = (byte) r3;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        r2 = r4;
        goto L5
    L21:
        if (r2 > 10240) goto L22;
        byte[] r6 = new byte[r9.length * 2];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        java.lang.System.arraycopy(r9, 0, r6, 0, r9.length);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        r9 = r6;
    L22:
        int r7 = 0;
    L24:
        if (r7 >= r2) goto L33;
        byte r12 = r9[r7];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r12 == 32) goto L145;
        if (r12 == 9) goto L145;
        if (r12 != 35) goto L33;
        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L144:
        r1 = r9;
    L145:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L33:
        if (r7 < r2) goto L35;
        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        goto L144
    L35:
        r0.setLength(0);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L36:
        if (r7 >= r2) goto L44;
        int r13 = r7 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        byte r8 = r9[r7];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r8 == 32) goto L43;
        if (r8 == 9) goto L43;
        r0.append((char) r8);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        r7 = r13;
    L43:
        r7 = r13;
    L44:
        java.lang.String r14 = r0.toString();     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r7 < r2) goto L47;
    L143:
        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        goto L144
    L47:
        if (r14.length() == 0) goto L143;
    L49:
        if (r7 >= r2) goto L55;
        byte r15 = r9[r7];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r15 == 32) goto L142;
        if (r15 != 9) goto L55;
    L142:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L55:
        java.lang.String r16 = "";
        if (r14.charAt(0) != '@') goto L80;
        r0.setLength(0);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L58:
        if (r7 >= r2) goto L66;
        int r17 = r7 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        byte r10 = r9[r7];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r10 == 32) goto L65;
        if (r10 == 9) goto L65;
        r0.append((char) r10);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        r7 = r17;
    L65:
        r7 = r17;
    L66:
        java.lang.String r19 = r0.toString();     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r7 < r2) goto L69;
    L79:
        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        goto L144
    L69:
        if (r19.length() == 0) goto L79;
    L71:
        if (r7 >= r2) goto L77;
        byte r110 = r9[r7];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r110 == 32) goto L78;
        if (r110 != 9) goto L77;
    L78:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L77:
        r16 = r14;
        r14 = r19;
    L80:
        r0.setLength(0);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L81:
        if (r7 >= r2) goto L82;
        int r111 = r7 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        byte r11 = r9[r7];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r11 == 32) goto L89;
        if (r11 == 9) goto L89;
        r0.append((char) r11);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        r7 = r111;
    L89:
        if (r0.toString().equals("ssh-dss") == false) goto L92;
        r5 = 1;
    L95:
        if (r111 < r2) goto L97;
        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L97:
        if (r111 >= r2) goto L103;
        byte r20 = r9[r111];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r20 == 32) goto L141;
        if (r20 != 9) goto L103;
    L141:
        r111 = r111 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L103:
        r0.setLength(0);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L104:
        if (r111 >= r2) goto L117;
        int r21 = r111 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        byte r22 = r9[r111];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r22 == 13) goto L115;
        if (r22 == 10) goto L116;
        if (r22 == 32) goto L116;
        if (r22 == 9) goto L116;
        r0.append((char) r22);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L116:
        r111 = r21;
    L115:
        r111 = r21;
    L117:
        java.lang.String r23 = r0.toString();     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r23.length() != 0) goto L120;
        FH(com.jcraft.jsch.Util.j6(r9, 0, r2));     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L120:
        if (r111 >= r2) goto L127;
        byte r24 = r9[r111];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r24 == 32) goto L140;
        if (r24 != 9) goto L127;
    L140:
        r111 = r111 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L127:
        if (r111 >= r2) goto L138;
        r0.setLength(0);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L129:
        if (r111 >= r2) goto L135;
        int r25 = r111 + 1;     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        byte r112 = r9[r111];     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        if (r112 == 13) goto L137;
        if (r112 == 10) goto L135;
        r0.append((char) r112);     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L137:
        r111 = r25;
    L135:
        java.lang.String r26 = r0.toString();     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
    L139:
        this.v5.addElement(new com.jcraft.jsch.KnownHosts.HashedHostKey(this, r16, r14, r5, com.jcraft.jsch.Util.DW(com.jcraft.jsch.Util.FH(r23), 0, r23.length()), r26));     // Catch: java.lang.Throwable -> L149 java.lang.Exception -> L151
        goto L144
    L138:
        r26 = null;
        goto L139
    L92:
        if (r0.toString().equals("ssh-rsa") == false) goto L94;
        r5 = 2;
        goto L95
    L94:
        r111 = r2;
        goto L95
    L82:
        r111 = r7;
        goto L89
    L8:
        if (r2 != 0) goto L22;
        r18.close();     // Catch: java.io.IOException -> L11
        return;
    L11:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    L151:
        e = move-exception;
        if ((e instanceof com.jcraft.jsch.JSchException) == true) goto L157;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);     // Catch: java.lang.Throwable -> L149
    L157:
        throw ((com.jcraft.jsch.JSchException) e);     // Catch: java.lang.Throwable -> L149
    L149:
        th = move-exception;
        r18.close();     // Catch: java.io.IOException -> L160
        throw th;
    L160:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    }

    void j6(java.io.OutputStream r9) {
        java.util.Vector r0 = this.v5;     // Catch: java.lang.Exception -> L23
        monitor-enter(r0);     // Catch: java.lang.Exception -> L23
        int r1 = 0;
    L27:
    L20:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L23
    L6:
        if (r1 >= this.v5.size()) goto L7;
        com.jcraft.jsch.HostKey r2 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r1);     // Catch: java.lang.Throwable -> L20
        java.lang.String r3 = r2.Hw();     // Catch: java.lang.Throwable -> L20
        java.lang.String r4 = r2.DW();     // Catch: java.lang.Throwable -> L20
        java.lang.String r5 = r2.v5();     // Catch: java.lang.Throwable -> L20
        java.lang.String r6 = r2.j6();     // Catch: java.lang.Throwable -> L20
        if (r5.equals("UNKNOWN") == false) goto L13;
        r9.write(com.jcraft.jsch.Util.FH(r4));     // Catch: java.lang.Throwable -> L20
        r9.write(DW);     // Catch: java.lang.Throwable -> L20
    L19:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L20
        goto L27
    L13:
        if (r3.length() == 0) goto L15;
        r9.write(com.jcraft.jsch.Util.FH(r3));     // Catch: java.lang.Throwable -> L20
        r9.write(j6);     // Catch: java.lang.Throwable -> L20
    L15:
        r9.write(com.jcraft.jsch.Util.FH(r4));     // Catch: java.lang.Throwable -> L20
        r9.write(j6);     // Catch: java.lang.Throwable -> L20
        r9.write(com.jcraft.jsch.Util.FH(r5));     // Catch: java.lang.Throwable -> L20
        r9.write(j6);     // Catch: java.lang.Throwable -> L20
        r9.write(com.jcraft.jsch.Util.FH(r2.FH()));     // Catch: java.lang.Throwable -> L20
        if (r6 == null) goto L18;
        r9.write(j6);     // Catch: java.lang.Throwable -> L20
        r9.write(com.jcraft.jsch.Util.FH(r6));     // Catch: java.lang.Throwable -> L20
    L18:
        r9.write(DW);     // Catch: java.lang.Throwable -> L20
        goto L19
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L20
    L32:
        return;
    L23:
        e = move-exception;
        java.lang.System.err.println(e);
    }

    void j6(java.lang.String r3) {
        this.Hw = r3;     // Catch: java.io.FileNotFoundException -> L4
        j6(new java.io.FileInputStream(com.jcraft.jsch.Util.j6(r3)));     // Catch: java.io.FileNotFoundException -> L4
        return;
    L4:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    }

    @Override
    public void j6(java.lang.String r6, java.lang.String r7, byte[] r8) {
        java.util.Vector r0 = this.v5;
        monitor-enter(r0);
        int r1 = 0;
        boolean r2 = false;
    L38:
    L32:
        th = move-exception;
        throw th;
    L6:
        if (r1 >= this.v5.size()) goto L7;
        com.jcraft.jsch.HostKey r3 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r1);     // Catch: java.lang.Throwable -> L32
        if (r6 != null) goto L14;
    L21:
        java.lang.String r4 = r3.DW();     // Catch: java.lang.Throwable -> L32
        if (r4.equals(r6) == false) goto L24;
    L29:
        this.v5.removeElement(r3);     // Catch: java.lang.Throwable -> L32
    L30:
        r2 = true;
    L31:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L32
        goto L38
    L24:
        if ((r3 instanceof com.jcraft.jsch.KnownHosts.HashedHostKey) == true) goto L26;
    L28:
        r3.Hw = DW(r4, r6);     // Catch: java.lang.Throwable -> L32
        goto L30
    L26:
        if (((com.jcraft.jsch.KnownHosts.HashedHostKey) r3).VH() == false) goto L28;
    L14:
        if (r3.j6(r6) == false) goto L31;
        if (r7 == null) goto L21;
        if (r3.v5().equals(r7) == false) goto L31;
        if (r8 == null) goto L21;
        if (com.jcraft.jsch.Util.j6(r8, r3.Zo) == false) goto L31;
    L7:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L32
        if (r2 == false) goto L47;
        DW();     // Catch: java.lang.Exception -> L37
        return;
    L48:
        return;
    }

    @Override
    public com.jcraft.jsch.HostKey[] j6(java.lang.String r8, java.lang.String r9) {
        java.util.Vector r0 = this.v5;
        monitor-enter(r0);
        java.util.ArrayList r1 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L33
        int r3 = 0;
    L6:
        if (r3 >= this.v5.size()) goto L7;
        com.jcraft.jsch.HostKey r4 = (com.jcraft.jsch.HostKey) this.v5.elementAt(r3);     // Catch: java.lang.Throwable -> L33
        if (r4.v5 == 3) goto L32;
        if (r8 != null) goto L27;
    L31:
        r1.add(r4);     // Catch: java.lang.Throwable -> L33
        goto L32
    L27:
        if (r4.j6(r8) == false) goto L32;
        if (r9 == null) goto L31;
        if (r4.v5().equals(r9) == true) goto L31;
    L32:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L33
        goto L6
    L7:
        com.jcraft.jsch.HostKey[] r5 = new com.jcraft.jsch.HostKey[r1.size()];     // Catch: java.lang.Throwable -> L33
        int r6 = 0;
    L9:
        if (r6 >= r1.size()) goto L10;
        r5[r6] = (com.jcraft.jsch.HostKey) r1.get(r6);     // Catch: java.lang.Throwable -> L33
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L33
        goto L9
    L10:
        if (r8 != null) goto L12;
    L18:
        com.jcraft.jsch.HostKey[] r10 = r5;
    L19:
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L33
        return r10;
    L12:
        if (r8.startsWith("[") == false) goto L18;
        if (r8.indexOf("]:") <= 1) goto L18;
        com.jcraft.jsch.HostKey[] r11 = j6(r8.substring(1, r8.indexOf("]:")), r9);     // Catch: java.lang.Throwable -> L33
        if (r11.length <= 0) goto L18;
        r10 = new com.jcraft.jsch.HostKey[r5.length + r11.length];     // Catch: java.lang.Throwable -> L33
        java.lang.System.arraycopy(r5, 0, r10, 0, r5.length);     // Catch: java.lang.Throwable -> L33
        java.lang.System.arraycopy(r11, 0, r10, r5.length, r11.length);     // Catch: java.lang.Throwable -> L33
    L33:
        th = move-exception;
        throw th;
    }
}
