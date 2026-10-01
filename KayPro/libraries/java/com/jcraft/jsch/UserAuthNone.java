package com.jcraft.jsch;

class UserAuthNone extends com.jcraft.jsch.UserAuth {
    private java.lang.String v5;

    UserAuthNone() {
        this.v5 = null;
    }

    java.lang.String j6() {
        return this.v5;
    }

    @Override
    public boolean j6(com.jcraft.jsch.Session r6) {
        super.j6(r6);
        this.DW.DW();
        this.FH.j6((byte) 5);
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-userauth"));
        r6.DW(this.DW);
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L5;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_SERVICE_REQUEST sent");
    L5:
        this.FH = r6.j6(this.FH);
        if (this.FH.DW() != 6) goto L8;
        boolean r0 = true;
    L10:
        if (com.jcraft.jsch.JSch.v5().isEnabled(1) == false) goto L12;
        com.jcraft.jsch.JSch.v5().j6(1, "SSH_MSG_SERVICE_ACCEPT received");
    L12:
        if (r0 == true) goto L14;
        return false;
    L14:
        byte[] r1 = com.jcraft.jsch.Util.FH(this.Hw);
        this.DW.DW();
        this.FH.j6((byte) 50);
        this.FH.Hw(r1);
        this.FH.Hw(com.jcraft.jsch.Util.FH("ssh-connection"));
        this.FH.Hw(com.jcraft.jsch.Util.FH("none"));
        r6.DW(this.DW);
    L15:
        this.FH = r6.j6(this.FH);
        int r2 = this.FH.DW() & 255;
        if (r2 == 52) goto L17;
        if (r2 != 53) goto L26;
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        byte[] r3 = this.FH.tp();
        this.FH.tp();
        java.lang.String r4 = com.jcraft.jsch.Util.j6(r3);
        com.jcraft.jsch.UserInfo r5 = this.j6;
        if (r5 == null) goto L15;
        r5.DW(r4);     // Catch: java.lang.RuntimeException -> L24
        goto L15
    L26:
        if (r2 != 51) goto L30;
        this.FH.FH();
        this.FH.j6();
        this.FH.j6();
        byte[] r7 = this.FH.tp();
        this.FH.j6();
        this.v5 = com.jcraft.jsch.Util.j6(r7);
        return false;
    L30:
        throw new com.jcraft.jsch.JSchException("USERAUTH fail (" + r2 + ")");
    L17:
        return true;
    L8:
        r0 = false;
        goto L10
    }
}
