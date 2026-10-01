package com.jcraft.jsch;

class UserAuthPublicKey extends com.jcraft.jsch.UserAuth {
    UserAuthPublicKey() {
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r17) {
        super.j6(r17);
        java.util.Vector r2 = r17.Hw().j6();
        monitor-enter(r2);
    L88:
        th = move-exception;
        throw th;
    L5:
        if (r2.size() > 0) goto L8;
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L88
        return false;
    L8:
        byte[] r3 = com.jcraft.jsch.Util.FH(this.Hw);     // Catch: java.lang.Throwable -> L88
        int r5 = 0;
    L10:
        if (r5 >= r2.size()) goto L69;
        if (r17.aj >= r17.sy) goto L14;
        com.jcraft.jsch.Identity r6 = (com.jcraft.jsch.Identity) r2.elementAt(r5);     // Catch: java.lang.Throwable -> L88
        byte[] r7 = r6.FH();     // Catch: java.lang.Throwable -> L88
        if (r7 == null) goto L30;
        this.DW.DW();     // Catch: java.lang.Throwable -> L88
        this.FH.j6((byte) 50);     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(r3);     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(com.jcraft.jsch.Util.FH("publickey"));     // Catch: java.lang.Throwable -> L88
        this.FH.j6((byte) 0);     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(com.jcraft.jsch.Util.FH(r6.j6()));     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(r7);     // Catch: java.lang.Throwable -> L88
        r17.DW(this.DW);     // Catch: java.lang.Throwable -> L88
    L19:
        this.FH = r17.j6(this.FH);     // Catch: java.lang.Throwable -> L88
        int r11 = this.FH.DW() & 255;     // Catch: java.lang.Throwable -> L88
        if (r11 == 60) goto L28;
        if (r11 == 51) goto L28;
        if (r11 != 53) goto L28;
        this.FH.FH();     // Catch: java.lang.Throwable -> L88
        this.FH.j6();     // Catch: java.lang.Throwable -> L88
        this.FH.j6();     // Catch: java.lang.Throwable -> L88
        byte[] r12 = this.FH.tp();     // Catch: java.lang.Throwable -> L88
        this.FH.tp();     // Catch: java.lang.Throwable -> L88
        java.lang.String r13 = com.jcraft.jsch.Util.j6(r12);     // Catch: java.lang.Throwable -> L88
        if (this.j6 == null) goto L19;
        this.j6.DW(r13);     // Catch: java.lang.Throwable -> L88
    L28:
        if (r11 == 60) goto L30;
    L87:
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L88
    L30:
        int r14 = 5;
    L32:
        if (r6.DW() == true) goto L34;
    L47:
        byte[] r15 = null;
    L49:
        if (r6.DW() == false) goto L52;
        if (r15 != null) goto L52;
    L57:
        com.jcraft.jsch.Util.DW(r15);     // Catch: java.lang.Throwable -> L88
        r14 = r14 - 1;     // Catch: java.lang.Throwable -> L88
        if (r14 != 0) goto L32;
        r15 = null;
    L60:
        com.jcraft.jsch.Util.DW(r15);     // Catch: java.lang.Throwable -> L88
        if (r6.DW() == true) goto L87;
        if (r7 != null) goto L65;
        r7 = r6.FH();     // Catch: java.lang.Throwable -> L88
    L65:
        if (r7 == null) goto L87;
        this.DW.DW();     // Catch: java.lang.Throwable -> L88
        this.FH.j6((byte) 50);     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(r3);     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(com.jcraft.jsch.Util.FH("publickey"));     // Catch: java.lang.Throwable -> L88
        this.FH.j6((byte) 1);     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(com.jcraft.jsch.Util.FH(r6.j6()));     // Catch: java.lang.Throwable -> L88
        this.FH.Hw(r7);     // Catch: java.lang.Throwable -> L88
        byte[] r8 = r17.Zo();     // Catch: java.lang.Throwable -> L88
        int r10 = r8.length;     // Catch: java.lang.Throwable -> L88
        int r16 = r10 + 4;     // Catch: java.lang.Throwable -> L88
        byte[] r18 = new byte[(this.FH.FH + r16) - 5];     // Catch: java.lang.Throwable -> L88
        r18[0] = (byte) (r10 >>> 24);     // Catch: java.lang.Throwable -> L88
        r18[1] = (byte) (r10 >>> 16);     // Catch: java.lang.Throwable -> L88
        r18[2] = (byte) (r10 >>> 8);     // Catch: java.lang.Throwable -> L88
        r18[3] = (byte) r10;     // Catch: java.lang.Throwable -> L88
        java.lang.System.arraycopy(r8, 0, r18, 4, r10);     // Catch: java.lang.Throwable -> L88
        java.lang.System.arraycopy(this.FH.DW, 5, r18, r16, this.FH.FH - 5);     // Catch: java.lang.Throwable -> L88
        byte[] r9 = r6.DW(r18);     // Catch: java.lang.Throwable -> L88
        if (r9 == null) goto L69;
        this.FH.Hw(r9);     // Catch: java.lang.Throwable -> L88
        r17.DW(this.DW);     // Catch: java.lang.Throwable -> L88
    L72:
        this.FH = r17.j6(this.FH);     // Catch: java.lang.Throwable -> L88
        int r19 = this.FH.DW() & 255;     // Catch: java.lang.Throwable -> L88
        if (r19 == 52) goto L74;
        if (r19 != 53) goto L81;
        this.FH.FH();     // Catch: java.lang.Throwable -> L88
        this.FH.j6();     // Catch: java.lang.Throwable -> L88
        this.FH.j6();     // Catch: java.lang.Throwable -> L88
        byte[] r20 = this.FH.tp();     // Catch: java.lang.Throwable -> L88
        this.FH.tp();     // Catch: java.lang.Throwable -> L88
        java.lang.String r21 = com.jcraft.jsch.Util.j6(r20);     // Catch: java.lang.Throwable -> L88
        if (this.j6 == null) goto L72;
        this.j6.DW(r21);     // Catch: java.lang.Throwable -> L88
        goto L72
    L81:
        if (r19 != 51) goto L87;
        this.FH.FH();     // Catch: java.lang.Throwable -> L88
        this.FH.j6();     // Catch: java.lang.Throwable -> L88
        this.FH.j6();     // Catch: java.lang.Throwable -> L88
        byte[] r22 = this.FH.tp();     // Catch: java.lang.Throwable -> L88
        if (this.FH.j6() != 0) goto L86;
        r17.aj++;     // Catch: java.lang.Throwable -> L88
        goto L87
    L86:
        throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r22));     // Catch: java.lang.Throwable -> L88
    L74:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L88
        return true;
    L52:
        if (r6.j6(r15) == false) goto L57;
        if (r15 == null) goto L60;
        if ((r17.Hw() instanceof com.jcraft.jsch.IdentityRepository.Wrapper) == false) goto L60;
        ((com.jcraft.jsch.IdentityRepository.Wrapper) r17.Hw()).DW();     // Catch: java.lang.Throwable -> L88
        goto L60
    L34:
        if (this.j6 == null) goto L46;
        if (r6.DW() == true) goto L38;
    L42:
        java.lang.String r110 = this.j6.j6();     // Catch: java.lang.Throwable -> L88
        if (r110 == null) goto L47;
        r15 = com.jcraft.jsch.Util.FH(r110);     // Catch: java.lang.Throwable -> L88
        goto L49
    L38:
        if (this.j6.FH("Passphrase for " + r6.getName()) == true) goto L42;
        throw new com.jcraft.jsch.JSchAuthCancelException("publickey");     // Catch: java.lang.Throwable -> L88
    L46:
        throw new com.jcraft.jsch.JSchException("USERAUTH fail");     // Catch: java.lang.Throwable -> L88
    L14:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L88
        return false;
    L69:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L88
        return false;
    }
}
