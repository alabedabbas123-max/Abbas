package com.jcraft.jsch;

class UserAuthPassword extends com.jcraft.jsch.UserAuth {
    private final int v5;

    UserAuthPassword() {
        this.v5 = 60;
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r15) {
        super.j6(r15);
        byte[] r1 = r15.kQ;
        java.lang.String r2 = java.lang.String.valueOf(this.Hw) + "@" + r15.lp;
        if (r15.br == 22) goto L5;
        r2 = java.lang.String.valueOf(r2) + ":" + r15.br;
    L5:
        java.lang.String r8 = r2;
    L74:
    L68:
        th = move-exception;
        if (r1 == null) goto L72;
        com.jcraft.jsch.Util.DW(r1);
    L72:
        throw th;
    L8:
        if (r15.aj >= r15.sy) goto L14;
        if (r1 == null) goto L13;
    L26:
        byte[] r11 = com.jcraft.jsch.Util.FH(this.Hw);     // Catch: java.lang.Throwable -> L68
        this.DW.DW();     // Catch: java.lang.Throwable -> L68
        this.FH.j6((byte) 50);     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(r11);     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(com.jcraft.jsch.Util.FH("password"));     // Catch: java.lang.Throwable -> L68
        this.FH.j6((byte) 0);     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(r1);     // Catch: java.lang.Throwable -> L68
        r15.DW(this.DW);     // Catch: java.lang.Throwable -> L68
    L27:
        this.FH = r15.j6(this.FH);     // Catch: java.lang.Throwable -> L68
        int r3 = this.FH.DW() & 255;
        if (r3 == 52) goto L30;
        if (r3 == 53) goto L35;
        if (r3 != 60) goto L57;
        this.FH.FH();     // Catch: java.lang.Throwable -> L68
        this.FH.j6();     // Catch: java.lang.Throwable -> L68
        this.FH.j6();     // Catch: java.lang.Throwable -> L68
        byte[] r4 = this.FH.tp();     // Catch: java.lang.Throwable -> L68
        this.FH.tp();     // Catch: java.lang.Throwable -> L68
        if (this.j6 == null) goto L51;
        if ((this.j6 instanceof com.jcraft.jsch.UIKeyboardInteractive) == false) goto L51;
        java.lang.String[] r5 = ((com.jcraft.jsch.UIKeyboardInteractive) this.j6).j6(r8, "Password Change Required", com.jcraft.jsch.Util.j6(r4), new java.lang.String[]{"New Password: "}, new boolean[1]);     // Catch: java.lang.Throwable -> L68
        if (r5 == null) goto L49;
        byte[] r6 = com.jcraft.jsch.Util.FH(r5[0]);     // Catch: java.lang.Throwable -> L68
        this.DW.DW();     // Catch: java.lang.Throwable -> L68
        this.FH.j6((byte) 50);     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(r11);     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(com.jcraft.jsch.Util.FH("password"));     // Catch: java.lang.Throwable -> L68
        this.FH.j6((byte) 1);     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(r1);     // Catch: java.lang.Throwable -> L68
        this.FH.Hw(r6);     // Catch: java.lang.Throwable -> L68
        com.jcraft.jsch.Util.DW(r6);     // Catch: java.lang.Throwable -> L68
        r15.DW(this.DW);     // Catch: java.lang.Throwable -> L68
        goto L27
    L49:
        throw new com.jcraft.jsch.JSchAuthCancelException("password");     // Catch: java.lang.Throwable -> L68
    L51:
        if (this.j6 == null) goto L53;
        this.j6.DW("Password must be changed.");     // Catch: java.lang.Throwable -> L68
    L53:
        if (r1 == null) goto L55;
        com.jcraft.jsch.Util.DW(r1);
    L55:
        return false;
    L57:
        if (r3 != 51) goto L65;
        this.FH.FH();     // Catch: java.lang.Throwable -> L68
        this.FH.j6();     // Catch: java.lang.Throwable -> L68
        this.FH.j6();     // Catch: java.lang.Throwable -> L68
        byte[] r7 = this.FH.tp();     // Catch: java.lang.Throwable -> L68
        if (this.FH.j6() != 0) goto L64;
        r15.aj++;     // Catch: java.lang.Throwable -> L68
        if (r1 == null) goto L74;
        com.jcraft.jsch.Util.DW(r1);     // Catch: java.lang.Throwable -> L68
        r1 = null;
        goto L74
    L64:
        throw new com.jcraft.jsch.JSchPartialAuthException(com.jcraft.jsch.Util.j6(r7));     // Catch: java.lang.Throwable -> L68
    L65:
        if (r1 == null) goto L67;
        com.jcraft.jsch.Util.DW(r1);
    L67:
        return false;
    L35:
        this.FH.FH();     // Catch: java.lang.Throwable -> L68
        this.FH.j6();     // Catch: java.lang.Throwable -> L68
        this.FH.j6();     // Catch: java.lang.Throwable -> L68
        byte[] r9 = this.FH.tp();     // Catch: java.lang.Throwable -> L68
        this.FH.tp();     // Catch: java.lang.Throwable -> L68
        java.lang.String r10 = com.jcraft.jsch.Util.j6(r9);     // Catch: java.lang.Throwable -> L68
        if (this.j6 == null) goto L27;
        this.j6.DW(r10);     // Catch: java.lang.Throwable -> L68
        goto L27
    L30:
        if (r1 == null) goto L32;
        com.jcraft.jsch.Util.DW(r1);
    L32:
        return true;
    L13:
        if (this.j6 == null) goto L14;
        if (this.j6.j6("Password for " + r8) == false) goto L25;
        java.lang.String r12 = this.j6.getPassword();     // Catch: java.lang.Throwable -> L68
        if (r12 == null) goto L23;
        r1 = com.jcraft.jsch.Util.FH(r12);     // Catch: java.lang.Throwable -> L68
        goto L26
    L23:
        throw new com.jcraft.jsch.JSchAuthCancelException("password");     // Catch: java.lang.Throwable -> L68
    L25:
        throw new com.jcraft.jsch.JSchAuthCancelException("password");     // Catch: java.lang.Throwable -> L68
    L14:
        if (r1 == null) goto L16;
        com.jcraft.jsch.Util.DW(r1);
    L16:
        return false;
    }
}
